package org.chromium.net.impl;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.TrafficStats;
import android.os.Process;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.time.Duration;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.ThreadStatsUid;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.CronetLogger;
import org.chromium.net.impl.JavaUrlRequest;
import org.chromium.net.impl.JavaUrlRequestUtils;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes4.dex */
final class JavaUrlRequest extends ExperimentalUrlRequest {
    private static final int DEFAULT_CHUNK_LENGTH = 8192;
    private static final String TAG = "JavaUrlRequest";
    private static final String USER_AGENT = "User-Agent";
    private static final String X_ANDROID = "X-Android";
    private static final String X_ANDROID_SELECTED_TRANSPORT = "X-Android-Selected-Transport";
    private final boolean mAllowDirectExecutor;
    private final AsyncUrlRequestCallback mCallbackAsync;
    private final int mCronetEngineId;
    private String mCurrentUrl;
    private HttpURLConnection mCurrentUrlConnection;
    private final JavaCronetEngine mEngine;
    private final Executor mExecutor;
    private boolean mFinalUserCallbackThrew;
    private final String mInitialMethod;
    private final CronetLogger mLogger;
    private final long mNetworkHandle;
    private int mNonfinalUserCallbackExceptionCount;
    private OutputStreamDataSink mOutputStreamDataSink;
    private String mPendingRedirectUrl;
    private int mReadCount;
    private ReadableByteChannel mResponseChannel;
    private final VersionSafeCallbacks.UploadDataProviderWrapper mUploadDataProvider;
    private final Executor mUploadExecutor;
    private UrlResponseInfoImpl mUrlResponseInfo;
    private final String mUserAgent;
    private final Map<String, String> mRequestHeaders = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    private final List<String> mUrlChain = new ArrayList();
    private final AtomicInteger mState = new AtomicInteger(0);
    private final AtomicBoolean mUploadProviderClosed = new AtomicBoolean(false);
    private volatile int mAdditionalStatusDetails = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static final class SerializingExecutor implements Executor {
        private boolean mRunning;
        private final Executor mUnderlyingExecutor;
        private final Runnable mRunTasks = new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$SerializingExecutor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                JavaUrlRequest.SerializingExecutor.this.runTasks();
            }
        };
        private final ArrayDeque<Runnable> mTaskQueue = new ArrayDeque<>();

        SerializingExecutor(Executor underlyingExecutor) {
            this.mUnderlyingExecutor = underlyingExecutor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            synchronized (this.mTaskQueue) {
                this.mTaskQueue.addLast(command);
                try {
                    this.mUnderlyingExecutor.execute(this.mRunTasks);
                } catch (RejectedExecutionException unused) {
                    this.mTaskQueue.removeLast();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void runTasks() {
            synchronized (this.mTaskQueue) {
                if (this.mRunning) {
                    return;
                }
                Runnable pollFirst = this.mTaskQueue.pollFirst();
                this.mRunning = pollFirst != null;
                while (pollFirst != null) {
                    try {
                        pollFirst.run();
                        synchronized (this.mTaskQueue) {
                            pollFirst = this.mTaskQueue.pollFirst();
                            this.mRunning = pollFirst != null;
                        }
                    } catch (Throwable th) {
                        synchronized (this.mTaskQueue) {
                            this.mRunning = false;
                            try {
                                this.mUnderlyingExecutor.execute(this.mRunTasks);
                            } catch (RejectedExecutionException unused) {
                            }
                            throw th;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    JavaUrlRequest(JavaCronetEngine engine, UrlRequest.Callback callback, final Executor executor, Executor userExecutor, String url, String userAgent, boolean allowDirectExecutor, boolean trafficStatsTagSet, int trafficStatsTag, final boolean trafficStatsUidSet, final int trafficStatsUid, long networkHandle, String method, ArrayList<Map.Entry<String, String>> requestHeaders, UploadDataProvider uploadDataProvider, Executor uploadDataProviderExecutor) {
        Executor executor2;
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("Cronet JavaUrlRequest#JavaUrlRequest");
        try {
            Objects.requireNonNull(url, "URL is required");
            Objects.requireNonNull(callback, "Listener is required");
            Objects.requireNonNull(executor, "Executor is required");
            Objects.requireNonNull(userExecutor, "userExecutor is required");
            this.mAllowDirectExecutor = allowDirectExecutor;
            this.mCallbackAsync = new AsyncUrlRequestCallback(callback, userExecutor);
            final int threadStatsTag = trafficStatsTagSet ? trafficStatsTag : TrafficStats.getThreadStatsTag();
            this.mExecutor = new SerializingExecutor(new Executor() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda4
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    executor.execute(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda6
                        @Override // java.lang.Runnable
                        public final void run() {
                            JavaUrlRequest.lambda$new$0(r1, r2, r3, runnable);
                        }
                    });
                }
            });
            this.mEngine = engine;
            this.mCronetEngineId = engine.getCronetEngineId();
            this.mLogger = engine.getCronetLogger();
            this.mCurrentUrl = url;
            this.mUserAgent = userAgent;
            this.mNetworkHandle = networkHandle;
            this.mInitialMethod = checkedHttpMethod(method);
            setHeaders(requestHeaders);
            this.mUploadDataProvider = checkedUploadDataProvider(uploadDataProvider);
            if (uploadDataProviderExecutor != null && !allowDirectExecutor) {
                executor2 = new JavaUrlRequestUtils.DirectPreventingExecutor(uploadDataProviderExecutor);
                this.mUploadExecutor = executor2;
                if (scoped == null) {
                    scoped.close();
                    return;
                }
                return;
            }
            executor2 = uploadDataProviderExecutor;
            this.mUploadExecutor = executor2;
            if (scoped == null) {
            }
        } catch (Throwable th) {
            if (scoped == null) {
                throw th;
            }
            try {
                scoped.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    static /* synthetic */ void lambda$new$0(int i, boolean z, int i2, Runnable runnable) {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        TrafficStats.setThreadStatsTag(i);
        if (z) {
            ThreadStatsUid.set(i2);
        }
        try {
            runnable.run();
        } finally {
            if (z) {
                ThreadStatsUid.clear();
            }
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
    }

    private static String checkedHttpMethod(String method) {
        Objects.requireNonNull(method, "Method is required.");
        if ("OPTIONS".equalsIgnoreCase(method) || "GET".equalsIgnoreCase(method) || "HEAD".equalsIgnoreCase(method) || "POST".equalsIgnoreCase(method) || "PUT".equalsIgnoreCase(method) || "DELETE".equalsIgnoreCase(method) || "TRACE".equalsIgnoreCase(method) || "PATCH".equalsIgnoreCase(method)) {
            return method;
        }
        throw new IllegalArgumentException("Invalid http method " + method);
    }

    private void setHeaders(ArrayList<Map.Entry<String, String>> requestHeaders) {
        Iterator<Map.Entry<String, String>> it = requestHeaders.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            if (!isValidHeaderName(next.getKey()) || next.getValue().contains("\r\n")) {
                throw new IllegalArgumentException("Invalid header with headername: " + next.getKey());
            }
            this.mRequestHeaders.put(next.getKey(), next.getValue());
        }
    }

    private static boolean isValidHeaderName(String header) {
        int i;
        for (0; i < header.length(); i + 1) {
            char charAt = header.charAt(i);
            if (charAt != ',' && charAt != '/' && charAt != '{' && charAt != '}') {
                switch (charAt) {
                    case '\'':
                    case '(':
                    case ')':
                        break;
                    default:
                        switch (charAt) {
                            case ':':
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                            case '?':
                            case '@':
                                break;
                            default:
                                switch (charAt) {
                                    case '[':
                                    case '\\':
                                    case ']':
                                        break;
                                    default:
                                        i = (Character.isISOControl(charAt) || Character.isWhitespace(charAt)) ? 0 : i + 1;
                                        break;
                                }
                        }
                }
            }
            return false;
        }
        return true;
    }

    private VersionSafeCallbacks.UploadDataProviderWrapper checkedUploadDataProvider(UploadDataProvider uploadDataProvider) {
        if (uploadDataProvider == null) {
            return null;
        }
        if (!this.mRequestHeaders.containsKey("Content-Type")) {
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        }
        return new VersionSafeCallbacks.UploadDataProviderWrapper(uploadDataProvider);
    }

    private final class OutputStreamDataSink extends JavaUploadDataSinkBase {
        private WritableByteChannel mOutputChannel;
        private final AtomicBoolean mOutputChannelClosed;
        private final HttpURLConnection mUrlConnection;
        private OutputStream mUrlConnectionOutputStream;

        OutputStreamDataSink(final Executor userExecutor, Executor executor, HttpURLConnection urlConnection, VersionSafeCallbacks.UploadDataProviderWrapper provider) {
            super(userExecutor, executor, provider);
            this.mOutputChannelClosed = new AtomicBoolean(false);
            this.mUrlConnection = urlConnection;
        }

        @Override // org.chromium.net.impl.JavaUploadDataSinkBase
        protected void initializeRead() throws IOException {
            if (this.mOutputChannel == null) {
                JavaUrlRequest.this.mAdditionalStatusDetails = 10;
                this.mUrlConnection.setDoOutput(true);
                this.mUrlConnection.connect();
                JavaUrlRequest.this.mAdditionalStatusDetails = 12;
                OutputStream outputStream = this.mUrlConnection.getOutputStream();
                this.mUrlConnectionOutputStream = outputStream;
                this.mOutputChannel = Channels.newChannel(outputStream);
            }
        }

        void closeOutputChannel() throws IOException {
            if (this.mOutputChannel == null || !this.mOutputChannelClosed.compareAndSet(false, true)) {
                return;
            }
            this.mOutputChannel.close();
        }

        @Override // org.chromium.net.impl.JavaUploadDataSinkBase
        protected void finish() throws IOException {
            closeOutputChannel();
            JavaUrlRequest.this.fireGetHeaders();
        }

        @Override // org.chromium.net.impl.JavaUploadDataSinkBase
        protected void initializeStart(long totalBytes) {
            if (totalBytes > 0) {
                this.mUrlConnection.setFixedLengthStreamingMode(totalBytes);
            } else {
                this.mUrlConnection.setChunkedStreamingMode(8192);
            }
        }

        @Override // org.chromium.net.impl.JavaUploadDataSinkBase
        protected int processSuccessfulRead(ByteBuffer buffer) throws IOException {
            int i = 0;
            while (buffer.hasRemaining()) {
                i += this.mOutputChannel.write(buffer);
            }
            this.mUrlConnectionOutputStream.flush();
            return i;
        }

        @Override // org.chromium.net.impl.JavaUploadDataSinkBase
        protected Runnable getErrorSettingRunnable(JavaUrlRequestUtils.CheckedRunnable runnable) {
            return JavaUrlRequest.this.errorSetting(runnable);
        }

        @Override // org.chromium.net.impl.JavaUploadDataSinkBase
        protected Runnable getUploadErrorSettingRunnable(JavaUrlRequestUtils.CheckedRunnable runnable) {
            return JavaUrlRequest.this.uploadErrorSetting(runnable);
        }

        @Override // org.chromium.net.impl.JavaUploadDataSinkBase
        protected void processUploadError(Throwable exception) {
            JavaUrlRequest.this.enterUploadErrorState(exception);
        }
    }

    @Override // org.chromium.net.UrlRequest
    public void start() {
        this.mAdditionalStatusDetails = 10;
        this.mEngine.incrementActiveRequestCount();
        transitionStates(0, 1, new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                JavaUrlRequest.this.lambda$start$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$2() {
        this.mUrlChain.add(this.mCurrentUrl);
        fireOpenConnection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enterErrorState(final CronetException error) {
        if (setTerminalState(6)) {
            fireDisconnect();
            fireCloseUploadDataProvider();
            this.mCallbackAsync.onFailed(this.mUrlResponseInfo, error);
        }
    }

    private boolean setTerminalState(int error) {
        int i;
        do {
            i = this.mState.get();
            if (i == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            }
            if (i == 6 || i == 7 || i == 8) {
                return false;
            }
        } while (!this.mState.compareAndSet(i, error));
        return true;
    }

    private void enterUserErrorState(final Throwable error) {
        executeOnExecutor(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                JavaUrlRequest.this.lambda$enterUserErrorState$3();
            }
        }, "enterUserErrorState");
        enterErrorState(new CallbackExceptionImpl("Exception received from UrlRequest.Callback", error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enterUserErrorState$3() {
        this.mNonfinalUserCallbackExceptionCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enterUploadErrorState(final Throwable error) {
        enterErrorState(new CallbackExceptionImpl("Exception received from UploadDataProvider", error));
    }

    private void enterCronetErrorState(final Throwable error) {
        enterErrorState(new CronetExceptionImpl("System error", error));
    }

    private void transitionStates(int expected, int newState, Runnable afterTransition) {
        if (!this.mState.compareAndSet(expected, newState)) {
            int i = this.mState.get();
            if (i == 8 || i == 6) {
                return;
            }
            throw new IllegalStateException("Invalid state transition - expected " + JavaUrlRequestUtils.stateToString(expected) + " but was " + JavaUrlRequestUtils.stateToString(i));
        }
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("Cronet JavaUrlRequest#transitionStates " + JavaUrlRequestUtils.stateToString(expected) + " -> " + JavaUrlRequestUtils.stateToString(newState));
        try {
            afterTransition.run();
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest
    public void followRedirect() {
        transitionStates(3, 1, new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest.1
            @Override // java.lang.Runnable
            public void run() {
                JavaUrlRequest javaUrlRequest = JavaUrlRequest.this;
                javaUrlRequest.mCurrentUrl = javaUrlRequest.mPendingRedirectUrl;
                JavaUrlRequest.this.mPendingRedirectUrl = null;
                JavaUrlRequest.this.fireOpenConnection();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fireGetHeaders() {
        this.mAdditionalStatusDetails = 13;
        executeOnExecutor(errorSetting(new JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda9
            @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
            public final void run() {
                JavaUrlRequest.this.lambda$fireGetHeaders$4();
            }
        }), "fireGetHeaders");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fireGetHeaders$4() throws Exception {
        List<String> list;
        if (this.mCurrentUrlConnection == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = "http/1.1";
        int i = 0;
        while (true) {
            String headerFieldKey = this.mCurrentUrlConnection.getHeaderFieldKey(i);
            if (headerFieldKey == null) {
                break;
            }
            if (X_ANDROID_SELECTED_TRANSPORT.equalsIgnoreCase(headerFieldKey)) {
                str = this.mCurrentUrlConnection.getHeaderField(i);
            }
            if (!headerFieldKey.startsWith(X_ANDROID)) {
                arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, this.mCurrentUrlConnection.getHeaderField(i)));
            }
            i++;
        }
        int responseCode = this.mCurrentUrlConnection.getResponseCode();
        UrlResponseInfoImpl urlResponseInfoImpl = new UrlResponseInfoImpl(new ArrayList(this.mUrlChain), responseCode, this.mCurrentUrlConnection.getResponseMessage(), Collections.unmodifiableList(arrayList), false, str, "", 0L);
        if (responseCode >= 300 && responseCode < 400 && (list = urlResponseInfoImpl.getAllHeaders().get(FirebaseAnalytics.Param.LOCATION)) != null) {
            fireRedirectReceived(list.get(0), urlResponseInfoImpl);
            return;
        }
        this.mUrlResponseInfo = urlResponseInfoImpl;
        fireCloseUploadDataProvider();
        if (responseCode >= 400) {
            InputStream errorStream = this.mCurrentUrlConnection.getErrorStream();
            this.mResponseChannel = errorStream == null ? null : InputStreamChannel.wrap(errorStream);
            this.mCallbackAsync.onResponseStarted();
        } else {
            this.mResponseChannel = InputStreamChannel.wrap(this.mCurrentUrlConnection.getInputStream());
            this.mCallbackAsync.onResponseStarted();
        }
    }

    private void fireCloseUploadDataProvider() {
        if (this.mUploadDataProvider == null || !this.mUploadProviderClosed.compareAndSet(false, true)) {
            return;
        }
        try {
            Executor executor = this.mUploadExecutor;
            final VersionSafeCallbacks.UploadDataProviderWrapper uploadDataProviderWrapper = this.mUploadDataProvider;
            Objects.requireNonNull(uploadDataProviderWrapper);
            executor.execute(uploadErrorSetting(new JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda1
                @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
                public final void run() {
                    VersionSafeCallbacks.UploadDataProviderWrapper.this.close();
                }
            }));
        } catch (RejectedExecutionException e) {
            Log.e(TAG, "Exception when closing uploadDataProvider", e);
        }
    }

    private void fireRedirectReceived(final String locationField, final UrlResponseInfo urlResponseInfo) {
        transitionStates(1, 2, new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                JavaUrlRequest.this.lambda$fireRedirectReceived$6(locationField, urlResponseInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fireRedirectReceived$6(String str, final UrlResponseInfo urlResponseInfo) {
        String uri = URI.create(this.mCurrentUrl).resolve(str).toString();
        this.mPendingRedirectUrl = uri;
        this.mUrlChain.add(uri);
        transitionStates(2, 3, new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                JavaUrlRequest.this.lambda$fireRedirectReceived$5(urlResponseInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fireRedirectReceived$5(UrlResponseInfo urlResponseInfo) {
        this.mCallbackAsync.onRedirectReceived(urlResponseInfo, this.mPendingRedirectUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fireOpenConnection() {
        executeOnExecutor(errorSetting(new JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda8
            @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
            public final void run() {
                JavaUrlRequest.this.lambda$fireOpenConnection$7();
            }
        }), "fireOpenConnection");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fireOpenConnection$7() throws Exception {
        if (this.mState.get() == 8) {
            return;
        }
        URL url = new URL(this.mCurrentUrl);
        HttpURLConnection httpURLConnection = this.mCurrentUrlConnection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.mCurrentUrlConnection = null;
        }
        long j = this.mNetworkHandle;
        if (j == -1) {
            this.mCurrentUrlConnection = (HttpURLConnection) url.openConnection();
        } else {
            Network networkFromHandle = getNetworkFromHandle(j);
            if (networkFromHandle == null) {
                throw new NetworkExceptionImpl("Network bound to request not found", 9, -4);
            }
            this.mCurrentUrlConnection = (HttpURLConnection) networkFromHandle.openConnection(url);
        }
        this.mCurrentUrlConnection.setInstanceFollowRedirects(false);
        if (!this.mRequestHeaders.containsKey("User-Agent")) {
            this.mRequestHeaders.put("User-Agent", this.mUserAgent);
        }
        for (Map.Entry<String, String> entry : this.mRequestHeaders.entrySet()) {
            this.mCurrentUrlConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        this.mCurrentUrlConnection.setRequestMethod(this.mInitialMethod);
        if (this.mUploadDataProvider != null) {
            OutputStreamDataSink outputStreamDataSink = new OutputStreamDataSink(this.mUploadExecutor, this.mExecutor, this.mCurrentUrlConnection, this.mUploadDataProvider);
            this.mOutputStreamDataSink = outputStreamDataSink;
            outputStreamDataSink.start(this.mUrlChain.size() == 1);
        } else {
            this.mAdditionalStatusDetails = 10;
            this.mCurrentUrlConnection.connect();
            fireGetHeaders();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable errorSetting(final JavaUrlRequestUtils.CheckedRunnable delegate) {
        return new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                JavaUrlRequest.this.lambda$errorSetting$8(delegate);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$errorSetting$8(JavaUrlRequestUtils.CheckedRunnable checkedRunnable) {
        try {
            checkedRunnable.run();
        } catch (Throwable th) {
            enterCronetErrorState(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable userErrorSetting(final JavaUrlRequestUtils.CheckedRunnable delegate) {
        return new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                JavaUrlRequest.this.lambda$userErrorSetting$9(delegate);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$userErrorSetting$9(JavaUrlRequestUtils.CheckedRunnable checkedRunnable) {
        try {
            checkedRunnable.run();
        } catch (Throwable th) {
            enterUserErrorState(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable uploadErrorSetting(final JavaUrlRequestUtils.CheckedRunnable delegate) {
        return new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                JavaUrlRequest.this.lambda$uploadErrorSetting$10(delegate);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$uploadErrorSetting$10(JavaUrlRequestUtils.CheckedRunnable checkedRunnable) {
        try {
            checkedRunnable.run();
        } catch (Throwable th) {
            enterUploadErrorState(th);
        }
    }

    @Override // org.chromium.net.UrlRequest
    public void read(final ByteBuffer buffer) {
        Preconditions.checkDirect(buffer);
        Preconditions.checkHasRemaining(buffer);
        final JavaUrlRequestUtils.CheckedRunnable checkedRunnable = new JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda15
            @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
            public final void run() {
                JavaUrlRequest.this.lambda$read$11(buffer);
            }
        };
        transitionStates(4, 5, new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                JavaUrlRequest.this.lambda$read$12(checkedRunnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$read$11(ByteBuffer byteBuffer) throws Exception {
        int i;
        ReadableByteChannel readableByteChannel = this.mResponseChannel;
        if (readableByteChannel != null) {
            this.mReadCount++;
            i = readableByteChannel.read(byteBuffer);
        } else {
            i = -1;
        }
        processReadResult(i, byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$read$12(JavaUrlRequestUtils.CheckedRunnable checkedRunnable) {
        executeOnExecutor(errorSetting(checkedRunnable), "read");
    }

    private void processReadResult(int read, final ByteBuffer buffer) throws IOException {
        if (read != -1) {
            this.mCallbackAsync.onReadCompleted(this.mUrlResponseInfo, buffer);
            return;
        }
        ReadableByteChannel readableByteChannel = this.mResponseChannel;
        if (readableByteChannel != null) {
            readableByteChannel.close();
        }
        if (this.mState.compareAndSet(5, 7)) {
            fireDisconnect();
            this.mCallbackAsync.onSucceeded(this.mUrlResponseInfo);
        }
    }

    private void fireDisconnect() {
        executeOnExecutor(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                JavaUrlRequest.this.lambda$fireDisconnect$13();
            }
        }, "fireDisconnect");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fireDisconnect$13() {
        OutputStreamDataSink outputStreamDataSink = this.mOutputStreamDataSink;
        if (outputStreamDataSink != null) {
            try {
                outputStreamDataSink.closeOutputChannel();
            } catch (IOException e) {
                Log.e(TAG, "Exception when closing OutputChannel", e);
            }
        }
        HttpURLConnection httpURLConnection = this.mCurrentUrlConnection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.mCurrentUrlConnection = null;
        }
    }

    @Override // org.chromium.net.UrlRequest
    public void cancel() {
        int andSet = this.mState.getAndSet(8);
        if (andSet == 1 || andSet == 2 || andSet == 3 || andSet == 4 || andSet == 5) {
            fireDisconnect();
            fireCloseUploadDataProvider();
            this.mCallbackAsync.onCanceled(this.mUrlResponseInfo);
        }
    }

    @Override // org.chromium.net.UrlRequest
    public boolean isDone() {
        int i = this.mState.get();
        return i == 7 || i == 6 || i == 8;
    }

    static long estimateHeadersSizeInBytesList(Map<String, List<String>> headers) {
        long j = 0;
        if (headers == null) {
            return 0L;
        }
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            if (entry.getKey() != null) {
                j += r3.length();
            }
            if (entry.getValue() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        j += r3.length();
                    }
                }
            }
        }
        return j;
    }

    static long estimateHeadersSizeInBytes(Map<String, String> headers) {
        long j = 0;
        if (headers == null) {
            return 0L;
        }
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            if (entry.getKey() != null) {
                j += r3.length();
            }
            if (entry.getValue() != null) {
                j += r2.length();
            }
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long parseContentLengthString(String contentLength) {
        try {
            return Long.parseLong(contentLength);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // org.chromium.net.UrlRequest
    public void getStatus(UrlRequest.StatusListener listener) {
        int i = this.mState.get();
        int i2 = this.mAdditionalStatusDetails;
        switch (i) {
            case 0:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 14;
                break;
            default:
                throw new IllegalStateException("Switch is exhaustive: " + i);
        }
        this.mCallbackAsync.sendStatus(new VersionSafeCallbacks.UrlRequestStatusListener(listener), i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class AsyncUrlRequestCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final VersionSafeCallbacks.UrlRequestCallback mCallback;
        final Executor mFallbackExecutor;
        final Executor mUserExecutor;

        AsyncUrlRequestCallback(UrlRequest.Callback callback, final Executor userExecutor) {
            this.mCallback = new VersionSafeCallbacks.UrlRequestCallback(callback);
            if (JavaUrlRequest.this.mAllowDirectExecutor) {
                this.mUserExecutor = userExecutor;
                this.mFallbackExecutor = null;
            } else {
                this.mUserExecutor = new JavaUrlRequestUtils.DirectPreventingExecutor(userExecutor);
                this.mFallbackExecutor = userExecutor;
            }
        }

        void sendStatus(final VersionSafeCallbacks.UrlRequestStatusListener listener, final int status) {
            executeOnUserExecutor(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    VersionSafeCallbacks.UrlRequestStatusListener.this.onStatus(status);
                }
            }, "sendStatus");
        }

        void execute(JavaUrlRequestUtils.CheckedRunnable runnable, String name) {
            try {
                executeOnUserExecutor(JavaUrlRequest.this.userErrorSetting(runnable), name);
            } catch (RejectedExecutionException e) {
                JavaUrlRequest.this.enterErrorState(new CronetExceptionImpl("Exception posting task to executor", e));
            }
        }

        void onRedirectReceived(final UrlResponseInfo info, final String newLocationUrl) {
            execute(new JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda9
                @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
                public final void run() {
                    JavaUrlRequest.AsyncUrlRequestCallback.this.lambda$onRedirectReceived$1(info, newLocationUrl);
                }
            }, "onRedirectReceived");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onRedirectReceived$1(UrlResponseInfo urlResponseInfo, String str) throws Exception {
            this.mCallback.onRedirectReceived(JavaUrlRequest.this, urlResponseInfo, str);
        }

        void onResponseStarted() {
            execute(new JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda4
                @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
                public final void run() {
                    JavaUrlRequest.AsyncUrlRequestCallback.this.lambda$onResponseStarted$2();
                }
            }, "onResponseStarted");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onResponseStarted$2() throws Exception {
            if (JavaUrlRequest.this.mState.compareAndSet(1, 4)) {
                VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = this.mCallback;
                JavaUrlRequest javaUrlRequest = JavaUrlRequest.this;
                urlRequestCallback.onResponseStarted(javaUrlRequest, javaUrlRequest.mUrlResponseInfo);
            }
        }

        void onReadCompleted(final UrlResponseInfo info, final ByteBuffer byteBuffer) {
            execute(new JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda3
                @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
                public final void run() {
                    JavaUrlRequest.AsyncUrlRequestCallback.this.lambda$onReadCompleted$3(info, byteBuffer);
                }
            }, "onReadCompleted");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReadCompleted$3(UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws Exception {
            if (JavaUrlRequest.this.mState.compareAndSet(5, 4)) {
                this.mCallback.onReadCompleted(JavaUrlRequest.this, urlResponseInfo, byteBuffer);
            }
        }

        private CronetLogger.CronetTrafficInfo buildCronetTrafficInfo() {
            Map<String, List<String>> emptyMap;
            boolean z;
            int i;
            String str;
            long estimateHeadersSizeInBytes;
            long j;
            long estimateHeadersSizeInBytesList;
            long parseContentLengthString;
            CronetLogger.CronetTrafficInfo.RequestTerminalState requestTerminalState;
            if (JavaUrlRequest.this.mUrlResponseInfo != null) {
                emptyMap = JavaUrlRequest.this.mUrlResponseInfo.getAllHeaders();
                String negotiatedProtocol = JavaUrlRequest.this.mUrlResponseInfo.getNegotiatedProtocol();
                int httpStatusCode = JavaUrlRequest.this.mUrlResponseInfo.getHttpStatusCode();
                z = JavaUrlRequest.this.mUrlResponseInfo.wasCached();
                str = negotiatedProtocol;
                i = httpStatusCode;
            } else {
                emptyMap = Collections.emptyMap();
                z = false;
                i = 0;
                str = "";
            }
            if (z) {
                estimateHeadersSizeInBytes = 0;
                j = 0;
            } else {
                estimateHeadersSizeInBytes = JavaUrlRequest.estimateHeadersSizeInBytes(JavaUrlRequest.this.mRequestHeaders);
                j = -1;
            }
            if (z) {
                estimateHeadersSizeInBytesList = 0;
                parseContentLengthString = 0;
            } else {
                estimateHeadersSizeInBytesList = JavaUrlRequest.estimateHeadersSizeInBytesList(emptyMap);
                parseContentLengthString = emptyMap.containsKey("Content-Length") ? JavaUrlRequest.parseContentLengthString(emptyMap.get("Content-Length").get(0)) : -1L;
            }
            Duration ofSeconds = Duration.ofSeconds(0L);
            Duration ofSeconds2 = Duration.ofSeconds(0L);
            int i2 = JavaUrlRequest.this.mState.get();
            if (i2 == 6) {
                requestTerminalState = CronetLogger.CronetTrafficInfo.RequestTerminalState.ERROR;
            } else if (i2 == 7) {
                requestTerminalState = CronetLogger.CronetTrafficInfo.RequestTerminalState.SUCCEEDED;
            } else if (i2 == 8) {
                requestTerminalState = CronetLogger.CronetTrafficInfo.RequestTerminalState.CANCELLED;
            } else {
                throw new IllegalStateException("Internal Cronet error: attempted to report metrics but current state (" + i2 + ") is not a done state!");
            }
            return new CronetLogger.CronetTrafficInfo(estimateHeadersSizeInBytes, j, estimateHeadersSizeInBytesList, parseContentLengthString, i, ofSeconds, ofSeconds2, str, false, false, requestTerminalState, JavaUrlRequest.this.mNonfinalUserCallbackExceptionCount, JavaUrlRequest.this.mReadCount, JavaUrlRequest.this.mOutputStreamDataSink != null ? JavaUrlRequest.this.mOutputStreamDataSink.getReadCount() : 0, false, JavaUrlRequest.this.mFinalUserCallbackThrew, Process.myUid(), 0, 0, 0, CronetLogger.CronetTrafficInfo.RequestFailureReason.UNKNOWN, false, ImplVersion.getCronetVersion(), CronetLogger.CronetSource.CRONET_SOURCE_FALLBACK, -1L, -1L, -1L, -1L);
        }

        private void maybeReportMetrics() {
            JavaUrlRequest.this.executeOnExecutor(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    JavaUrlRequest.AsyncUrlRequestCallback.this.lambda$maybeReportMetrics$4();
                }
            }, "maybeReportMetrics");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$maybeReportMetrics$4() {
            try {
                JavaUrlRequest.this.mLogger.logCronetTrafficInfo(JavaUrlRequest.this.mCronetEngineId, buildCronetTrafficInfo());
            } catch (RuntimeException e) {
                Log.i(JavaUrlRequest.TAG, "Error while trying to log CronetTrafficInfo: ", e);
            }
        }

        void onCanceled(final UrlResponseInfo info) {
            JavaUrlRequest.this.closeResponseChannel();
            executeOnUserExecutor(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    JavaUrlRequest.AsyncUrlRequestCallback.this.lambda$onCanceled$5(info);
                }
            }, "onCanceled");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCanceled$5(UrlResponseInfo urlResponseInfo) {
            try {
                this.mCallback.onCanceled(JavaUrlRequest.this, urlResponseInfo);
            } catch (Exception e) {
                JavaUrlRequest.this.onFinalCallbackException("onCanceled", e);
            }
            maybeReportMetrics();
            JavaUrlRequest.this.mEngine.decrementActiveRequestCount();
        }

        void onSucceeded(final UrlResponseInfo info) {
            executeOnUserExecutor(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    JavaUrlRequest.AsyncUrlRequestCallback.this.lambda$onSucceeded$6(info);
                }
            }, "onSucceeded");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSucceeded$6(UrlResponseInfo urlResponseInfo) {
            try {
                this.mCallback.onSucceeded(JavaUrlRequest.this, urlResponseInfo);
            } catch (Exception e) {
                JavaUrlRequest.this.onFinalCallbackException("onSucceded", e);
            }
            maybeReportMetrics();
            JavaUrlRequest.this.mEngine.decrementActiveRequestCount();
        }

        void onFailed(final UrlResponseInfo urlResponseInfo, final CronetException e) {
            JavaUrlRequest.this.closeResponseChannel();
            Runnable runnable = new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    JavaUrlRequest.AsyncUrlRequestCallback.this.lambda$onFailed$7(urlResponseInfo, e);
                }
            };
            try {
                executeOnUserExecutor(runnable, "onFailed");
            } catch (InlineExecutionProhibitedException unused) {
                if (this.mFallbackExecutor != null) {
                    executeOnFallbackExecutor(runnable, "onFailed");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFailed$7(UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            try {
                this.mCallback.onFailed(JavaUrlRequest.this, urlResponseInfo, cronetException);
            } catch (Exception e) {
                JavaUrlRequest.this.onFinalCallbackException("onFailed", e);
            }
            maybeReportMetrics();
            JavaUrlRequest.this.mEngine.decrementActiveRequestCount();
        }

        void executeOnUserExecutor(final Runnable runnable, final String name) {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor " + name);
            try {
                this.mUserExecutor.execute(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        JavaUrlRequest.AsyncUrlRequestCallback.lambda$executeOnUserExecutor$8(name, runnable);
                    }
                });
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        static /* synthetic */ void lambda$executeOnUserExecutor$8(String str, Runnable runnable) {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor " + str + " running callback");
            try {
                runnable.run();
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        void executeOnFallbackExecutor(final Runnable runnable, final String name) {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor " + name);
            try {
                this.mFallbackExecutor.execute(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        JavaUrlRequest.AsyncUrlRequestCallback.lambda$executeOnFallbackExecutor$9(name, runnable);
                    }
                });
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        static /* synthetic */ void lambda$executeOnFallbackExecutor$9(String str, Runnable runnable) {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor  " + str + " running callback");
            try {
                runnable.run();
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeResponseChannel() {
        executeOnExecutor(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                JavaUrlRequest.this.lambda$closeResponseChannel$14();
            }
        }, "closeResponseChannel");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$closeResponseChannel$14() {
        ReadableByteChannel readableByteChannel = this.mResponseChannel;
        if (readableByteChannel != null) {
            try {
                readableByteChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.mResponseChannel = null;
        }
    }

    private Network getNetworkFromHandle(long networkHandle) {
        for (Network network : ((ConnectivityManager) this.mEngine.getContext().getSystemService("connectivity")).getAllNetworks()) {
            if (network.getNetworkHandle() == networkHandle) {
                return network;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFinalCallbackException(String method, Exception e) {
        Log.e(TAG, "Exception in " + method + " method", e);
        this.mFinalUserCallbackThrew = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeOnExecutor(final Runnable runnable, final String name) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("Cronet JavaUrlRequest#executeOnExecutor " + name);
        try {
            this.mExecutor.execute(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    JavaUrlRequest.lambda$executeOnExecutor$15(name, runnable);
                }
            });
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static /* synthetic */ void lambda$executeOnExecutor$15(String str, Runnable runnable) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("Cronet JavaUrlRequest#executeOnExecutor " + str + " running callback");
        try {
            runnable.run();
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
