package androidx.media3.datasource.cronet;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.BaseDataSource;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.HttpUtil;
import androidx.media3.datasource.TransferListener;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.common.base.c;
import com.google.common.base.l;
import com.google.common.primitives.e;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes3.dex */
public class CronetDataSource extends BaseDataSource implements HttpDataSource {

    @UnstableApi
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    private static final int DEFAULT_READ_BUFFER_SIZE_BYTES = 32768;

    @UnstableApi
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final String TAG = "CronetDataSource";
    private long bytesRemaining;
    private final Clock clock;
    private final int connectTimeoutMs;

    @Nullable
    private final l<String> contentTypePredicate;
    private final CronetEngine cronetEngine;
    private volatile long currentConnectTimeoutMs;

    @Nullable
    private DataSpec currentDataSpec;

    @Nullable
    private UrlRequest currentUrlRequest;

    @Nullable
    @VisibleForTesting
    UrlRequestCallback currentUrlRequestCallback;

    @Nullable
    private final HttpDataSource.RequestProperties defaultRequestProperties;

    @Nullable
    private IOException exception;
    private final Executor executor;
    private boolean finished;
    private final boolean handleSetCookieRequests;
    private final boolean keepPostFor302Redirects;
    private final ConditionVariable operation;

    @Nullable
    private ByteBuffer readBuffer;
    private final int readBufferSize;
    private final int readTimeoutMs;
    private final int requestPriority;
    private final HttpDataSource.RequestProperties requestProperties;
    private final boolean resetTimeoutOnRedirects;

    @Nullable
    private UrlResponseInfo responseInfo;
    private boolean transferStarted;

    @Nullable
    private final String userAgent;

    public static final class Factory implements HttpDataSource.Factory {
        private int connectTimeoutMs;

        @Nullable
        private l<String> contentTypePredicate;

        @Nullable
        private final CronetEngine cronetEngine;
        private final HttpDataSource.RequestProperties defaultRequestProperties;
        private final Executor executor;

        @Nullable
        private HttpDataSource.Factory fallbackFactory;
        private boolean handleSetCookieRequests;

        @Nullable
        private final DefaultHttpDataSource.Factory internalFallbackFactory;
        private boolean keepPostFor302Redirects;
        private int readBufferSize;
        private int readTimeoutMs;
        private int requestPriority;
        private boolean resetTimeoutOnRedirects;

        @Nullable
        private TransferListener transferListener;

        @Nullable
        private String userAgent;

        public Factory(CronetEngine cronetEngine, Executor executor) {
            this.cronetEngine = (CronetEngine) Assertions.checkNotNull(cronetEngine);
            this.executor = executor;
            this.defaultRequestProperties = new HttpDataSource.RequestProperties();
            this.internalFallbackFactory = null;
            this.requestPriority = 3;
            this.connectTimeoutMs = 8000;
            this.readTimeoutMs = 8000;
            this.readBufferSize = 32768;
        }

        @UnstableApi
        public Factory setConnectionTimeoutMs(int i) {
            this.connectTimeoutMs = i;
            DefaultHttpDataSource.Factory factory = this.internalFallbackFactory;
            if (factory != null) {
                factory.setConnectTimeoutMs(i);
            }
            return this;
        }

        @UnstableApi
        public Factory setContentTypePredicate(@Nullable l<String> lVar) {
            this.contentTypePredicate = lVar;
            DefaultHttpDataSource.Factory factory = this.internalFallbackFactory;
            if (factory != null) {
                factory.setContentTypePredicate(lVar);
            }
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        @UnstableApi
        public /* bridge */ /* synthetic */ HttpDataSource.Factory setDefaultRequestProperties(Map map) {
            return setDefaultRequestProperties((Map<String, String>) map);
        }

        @UnstableApi
        @Deprecated
        public Factory setFallbackFactory(@Nullable HttpDataSource.Factory factory) {
            this.fallbackFactory = factory;
            return this;
        }

        @UnstableApi
        public Factory setHandleSetCookieRequests(boolean z) {
            this.handleSetCookieRequests = z;
            return this;
        }

        @UnstableApi
        public Factory setKeepPostFor302Redirects(boolean z) {
            this.keepPostFor302Redirects = z;
            DefaultHttpDataSource.Factory factory = this.internalFallbackFactory;
            if (factory != null) {
                factory.setKeepPostFor302Redirects(z);
            }
            return this;
        }

        @UnstableApi
        public Factory setReadBufferSize(int i) {
            this.readBufferSize = i;
            return this;
        }

        @UnstableApi
        public Factory setReadTimeoutMs(int i) {
            this.readTimeoutMs = i;
            DefaultHttpDataSource.Factory factory = this.internalFallbackFactory;
            if (factory != null) {
                factory.setReadTimeoutMs(i);
            }
            return this;
        }

        @UnstableApi
        public Factory setRequestPriority(int i) {
            this.requestPriority = i;
            return this;
        }

        @UnstableApi
        public Factory setResetTimeoutOnRedirects(boolean z) {
            this.resetTimeoutOnRedirects = z;
            return this;
        }

        @UnstableApi
        public Factory setTransferListener(@Nullable TransferListener transferListener) {
            this.transferListener = transferListener;
            DefaultHttpDataSource.Factory factory = this.internalFallbackFactory;
            if (factory != null) {
                factory.setTransferListener(transferListener);
            }
            return this;
        }

        public Factory setUserAgent(@Nullable String str) {
            this.userAgent = str;
            DefaultHttpDataSource.Factory factory = this.internalFallbackFactory;
            if (factory != null) {
                factory.setUserAgent(str);
            }
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        @UnstableApi
        public HttpDataSource createDataSource() {
            if (this.cronetEngine == null) {
                HttpDataSource.Factory factory = this.fallbackFactory;
                return factory != null ? factory.createDataSource() : ((DefaultHttpDataSource.Factory) Assertions.checkNotNull(this.internalFallbackFactory)).createDataSource();
            }
            CronetDataSource cronetDataSource = new CronetDataSource(this.cronetEngine, this.executor, this.requestPriority, this.connectTimeoutMs, this.readTimeoutMs, this.resetTimeoutOnRedirects, this.handleSetCookieRequests, this.userAgent, this.defaultRequestProperties, this.contentTypePredicate, this.keepPostFor302Redirects, this.readBufferSize);
            TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                cronetDataSource.addTransferListener(transferListener);
            }
            return cronetDataSource;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        @UnstableApi
        public final Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            DefaultHttpDataSource.Factory factory = this.internalFallbackFactory;
            if (factory != null) {
                factory.setDefaultRequestProperties(map);
            }
            return this;
        }

        @UnstableApi
        @Deprecated
        public Factory(CronetEngineWrapper cronetEngineWrapper, Executor executor) {
            this.cronetEngine = cronetEngineWrapper.getCronetEngine();
            this.executor = executor;
            this.defaultRequestProperties = new HttpDataSource.RequestProperties();
            this.internalFallbackFactory = new DefaultHttpDataSource.Factory();
            this.connectTimeoutMs = 8000;
            this.readTimeoutMs = 8000;
            this.readBufferSize = 32768;
        }
    }

    @VisibleForTesting
    public final class UrlRequestCallback extends UrlRequest.Callback {
        private volatile boolean isClosed = false;

        public UrlRequestCallback() {
        }

        public void close() {
            this.isClosed = true;
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            try {
                if (this.isClosed) {
                    return;
                }
                if ((cronetException instanceof NetworkException) && ((NetworkException) cronetException).getErrorCode() == 1) {
                    CronetDataSource.this.exception = new UnknownHostException();
                } else {
                    CronetDataSource.this.exception = cronetException;
                }
                CronetDataSource.this.operation.open();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            if (this.isClosed) {
                return;
            }
            CronetDataSource.this.operation.open();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            if (this.isClosed) {
                return;
            }
            Assertions.checkNotNull(CronetDataSource.this.currentUrlRequest);
            Assertions.checkNotNull(CronetDataSource.this.currentUrlRequestCallback);
            DataSpec dataSpec = (DataSpec) Assertions.checkNotNull(CronetDataSource.this.currentDataSpec);
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (dataSpec.httpMethod == 2 && (httpStatusCode == 307 || httpStatusCode == 308)) {
                CronetDataSource.this.exception = new HttpDataSource.InvalidResponseCodeException(httpStatusCode, urlResponseInfo.getHttpStatusText(), null, urlResponseInfo.getAllHeaders(), dataSpec, Util.EMPTY_BYTE_ARRAY);
                CronetDataSource.this.operation.open();
                return;
            }
            if (CronetDataSource.this.resetTimeoutOnRedirects) {
                CronetDataSource.this.resetConnectTimeout();
            }
            CookieHandler cookieHandler = CookieHandler.getDefault();
            if (cookieHandler == null && CronetDataSource.this.handleSetCookieRequests) {
                cookieHandler = new CookieManager();
            }
            String url = urlResponseInfo.getUrl();
            Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
            HttpUtil.storeCookiesFromHeaders(url, allHeaders, cookieHandler);
            String cookieHeader = HttpUtil.getCookieHeader(url, allHeaders, cookieHandler);
            boolean z = CronetDataSource.this.keepPostFor302Redirects && dataSpec.httpMethod == 2 && httpStatusCode == 302;
            if (!z && (!CronetDataSource.this.handleSetCookieRequests || TextUtils.isEmpty(cookieHeader))) {
                urlRequest.followRedirect();
                return;
            }
            DataSpec withUri = (z || dataSpec.httpMethod != 2) ? dataSpec.withUri(Uri.parse(str)) : dataSpec.buildUpon().setUri(str).setHttpMethod(1).setHttpBody(null).build();
            if (!TextUtils.isEmpty(cookieHeader)) {
                HashMap hashMap = new HashMap();
                hashMap.putAll(dataSpec.httpRequestHeaders);
                hashMap.put("Cookie", cookieHeader);
                withUri = withUri.buildUpon().setHttpRequestHeaders(hashMap).build();
            }
            CronetDataSource.this.closeCurrentUrlRequestAndCallback();
            try {
                CronetDataSource.this.createCurrentUrlRequestAndCallback(withUri);
                CronetDataSource.this.currentUrlRequest.start();
            } catch (IOException e) {
                CronetDataSource.this.exception = e;
            }
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (this.isClosed) {
                return;
            }
            HttpUtil.storeCookiesFromHeaders(urlResponseInfo.getUrl(), urlResponseInfo.getAllHeaders(), CookieHandler.getDefault());
            CronetDataSource.this.responseInfo = urlResponseInfo;
            CronetDataSource.this.operation.open();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (this.isClosed) {
                return;
            }
            CronetDataSource.this.finished = true;
            CronetDataSource.this.operation.open();
        }
    }

    static {
        MediaLibraryInfo.registerModule("media3.datasource.cronet");
    }

    @UnstableApi
    public CronetDataSource(CronetEngine cronetEngine, Executor executor, int i, int i2, int i3, boolean z, boolean z2, @Nullable String str, @Nullable HttpDataSource.RequestProperties requestProperties, @Nullable l<String> lVar, boolean z3, int i4) {
        super(true);
        this.cronetEngine = (CronetEngine) Assertions.checkNotNull(cronetEngine);
        this.executor = (Executor) Assertions.checkNotNull(executor);
        this.requestPriority = i;
        this.connectTimeoutMs = i2;
        this.readTimeoutMs = i3;
        this.resetTimeoutOnRedirects = z;
        this.handleSetCookieRequests = z2;
        this.userAgent = str;
        this.defaultRequestProperties = requestProperties;
        this.contentTypePredicate = lVar;
        this.keepPostFor302Redirects = z3;
        this.clock = Clock.DEFAULT;
        this.readBufferSize = i4;
        this.requestProperties = new HttpDataSource.RequestProperties();
        this.operation = new ConditionVariable();
    }

    private boolean blockUntilConnectTimeout() throws InterruptedException {
        long elapsedRealtime = this.clock.elapsedRealtime();
        boolean z = false;
        while (!z && elapsedRealtime < this.currentConnectTimeoutMs) {
            z = this.operation.block((this.currentConnectTimeoutMs - elapsedRealtime) + 5);
            elapsedRealtime = this.clock.elapsedRealtime();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeCurrentUrlRequestAndCallback() {
        UrlRequest urlRequest = this.currentUrlRequest;
        if (urlRequest != null) {
            urlRequest.cancel();
            this.currentUrlRequest = null;
        }
        UrlRequestCallback urlRequestCallback = this.currentUrlRequestCallback;
        if (urlRequestCallback != null) {
            urlRequestCallback.close();
            this.currentUrlRequestCallback = null;
        }
    }

    private static int copyByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int min = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        int limit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer2.put(byteBuffer);
        byteBuffer.limit(limit);
        return min;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createCurrentUrlRequestAndCallback(DataSpec dataSpec) throws IOException {
        this.currentUrlRequestCallback = new UrlRequestCallback();
        this.currentUrlRequest = buildRequestBuilder(dataSpec).build();
    }

    @Nullable
    private static String getFirstHeader(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private ByteBuffer getOrCreateReadBuffer() {
        if (this.readBuffer == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.readBufferSize);
            this.readBuffer = allocateDirect;
            allocateDirect.limit(0);
        }
        return this.readBuffer;
    }

    private static int getStatus(UrlRequest urlRequest) throws InterruptedException {
        final ConditionVariable conditionVariable = new ConditionVariable();
        final int[] iArr = new int[1];
        urlRequest.getStatus(new UrlRequest.StatusListener() { // from class: androidx.media3.datasource.cronet.CronetDataSource.1
            @Override // org.chromium.net.UrlRequest.StatusListener
            public void onStatus(int i) {
                iArr[0] = i;
                conditionVariable.open();
            }
        });
        conditionVariable.block();
        return iArr[0];
    }

    private static boolean isCompressed(UrlResponseInfo urlResponseInfo) {
        Iterator<Map.Entry<String, String>> it = urlResponseInfo.getAllHeadersAsList().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().equalsIgnoreCase(RtspHeaders.CONTENT_ENCODING)) {
                return !r0.getValue().equalsIgnoreCase("identity");
            }
        }
        return false;
    }

    private void readInternal(ByteBuffer byteBuffer, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        ((UrlRequest) Util.castNonNull(this.currentUrlRequest)).read(byteBuffer);
        try {
        } catch (InterruptedException unused) {
            if (byteBuffer == this.readBuffer) {
                this.readBuffer = null;
            }
            Thread.currentThread().interrupt();
            this.exception = new InterruptedIOException();
        } catch (SocketTimeoutException e) {
            if (byteBuffer == this.readBuffer) {
                this.readBuffer = null;
            }
            this.exception = new HttpDataSource.HttpDataSourceException(e, dataSpec, 2002, 2);
        }
        if (!this.operation.block(this.readTimeoutMs)) {
            throw new SocketTimeoutException();
        }
        IOException iOException = this.exception;
        if (iOException != null) {
            if (!(iOException instanceof HttpDataSource.HttpDataSourceException)) {
                throw HttpDataSource.HttpDataSourceException.createForIOException(iOException, dataSpec, 2);
            }
            throw ((HttpDataSource.HttpDataSourceException) iOException);
        }
    }

    private byte[] readResponseBody() throws IOException {
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        while (!this.finished) {
            this.operation.close();
            orCreateReadBuffer.clear();
            readInternal(orCreateReadBuffer, (DataSpec) Util.castNonNull(this.currentDataSpec));
            orCreateReadBuffer.flip();
            if (orCreateReadBuffer.remaining() > 0) {
                int length = bArr.length;
                bArr = Arrays.copyOf(bArr, orCreateReadBuffer.remaining() + bArr.length);
                orCreateReadBuffer.get(bArr, length, orCreateReadBuffer.remaining());
            }
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetConnectTimeout() {
        this.currentConnectTimeoutMs = this.clock.elapsedRealtime() + this.connectTimeoutMs;
    }

    private void skipFully(long j, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        if (j == 0) {
            return;
        }
        ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        while (j > 0) {
            try {
                this.operation.close();
                orCreateReadBuffer.clear();
                readInternal(orCreateReadBuffer, dataSpec);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (this.finished) {
                    throw new OpenException(dataSpec, 2008, 14);
                }
                orCreateReadBuffer.flip();
                Assertions.checkState(orCreateReadBuffer.hasRemaining());
                int min = (int) Math.min(orCreateReadBuffer.remaining(), j);
                orCreateReadBuffer.position(orCreateReadBuffer.position() + min);
                j -= min;
            } catch (IOException e) {
                if (e instanceof HttpDataSource.HttpDataSourceException) {
                    throw ((HttpDataSource.HttpDataSourceException) e);
                }
                throw new OpenException(e, dataSpec, e instanceof SocketTimeoutException ? 2002 : 2001, 14);
            }
        }
    }

    @UnstableApi
    public UrlRequest.Builder buildRequestBuilder(DataSpec dataSpec) throws IOException {
        UrlRequest.Builder allowDirectExecutor = this.cronetEngine.newUrlRequestBuilder(dataSpec.uri.toString(), this.currentUrlRequestCallback, this.executor).setPriority(this.requestPriority).allowDirectExecutor();
        HashMap hashMap = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            hashMap.putAll(requestProperties.getSnapshot());
        }
        hashMap.putAll(this.requestProperties.getSnapshot());
        hashMap.putAll(dataSpec.httpRequestHeaders);
        for (Map.Entry entry : hashMap.entrySet()) {
            allowDirectExecutor.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (dataSpec.httpBody != null && !hashMap.containsKey(RtspHeaders.CONTENT_TYPE)) {
            throw new OpenException("HTTP request with non-empty body must set Content-Type", dataSpec, 1004, 0);
        }
        String buildRangeRequestHeader = HttpUtil.buildRangeRequestHeader(dataSpec.position, dataSpec.length);
        if (buildRangeRequestHeader != null) {
            allowDirectExecutor.addHeader(RtspHeaders.RANGE, buildRangeRequestHeader);
        }
        String str = this.userAgent;
        if (str != null) {
            allowDirectExecutor.addHeader(RtspHeaders.USER_AGENT, str);
        }
        allowDirectExecutor.setHttpMethod(dataSpec.getHttpMethodString());
        byte[] bArr = dataSpec.httpBody;
        if (bArr != null) {
            allowDirectExecutor.setUploadDataProvider(new ByteArrayUploadDataProvider(bArr), this.executor);
        }
        return allowDirectExecutor;
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void clearRequestProperty(String str) {
        this.requestProperties.remove(str);
    }

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    public synchronized void close() {
        try {
            closeCurrentUrlRequestAndCallback();
            ByteBuffer byteBuffer = this.readBuffer;
            if (byteBuffer != null) {
                byteBuffer.limit(0);
            }
            this.currentDataSpec = null;
            this.responseInfo = null;
            this.exception = null;
            this.finished = false;
            if (this.transferStarted) {
                this.transferStarted = false;
                transferEnded();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Nullable
    @UnstableApi
    public UrlRequest getCurrentUrlRequest() {
        return this.currentUrlRequest;
    }

    @Nullable
    @UnstableApi
    public UrlResponseInfo getCurrentUrlResponseInfo() {
        return this.responseInfo;
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public int getResponseCode() {
        UrlResponseInfo urlResponseInfo = this.responseInfo;
        if (urlResponseInfo == null || urlResponseInfo.getHttpStatusCode() <= 0) {
            return -1;
        }
        return this.responseInfo.getHttpStatusCode();
    }

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    public Map<String, List<String>> getResponseHeaders() {
        UrlResponseInfo urlResponseInfo = this.responseInfo;
        return urlResponseInfo == null ? Collections.EMPTY_MAP : urlResponseInfo.getAllHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    @UnstableApi
    public Uri getUri() {
        UrlResponseInfo urlResponseInfo = this.responseInfo;
        if (urlResponseInfo != null) {
            return Uri.parse(urlResponseInfo.getUrl());
        }
        DataSpec dataSpec = this.currentDataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    public long open(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        byte[] bArr;
        String firstHeader;
        Assertions.checkNotNull(dataSpec);
        Assertions.checkState(!this.transferStarted);
        this.operation.close();
        resetConnectTimeout();
        this.currentDataSpec = dataSpec;
        try {
            createCurrentUrlRequestAndCallback(dataSpec);
            UrlRequest urlRequest = this.currentUrlRequest;
            urlRequest.start();
            transferInitializing(dataSpec);
            try {
                boolean blockUntilConnectTimeout = blockUntilConnectTimeout();
                IOException iOException = this.exception;
                if (iOException != null) {
                    String message = iOException.getMessage();
                    if (message == null || !c.b(message).contains("err_cleartext_not_permitted")) {
                        throw new OpenException(iOException, dataSpec, 2001, getStatus(urlRequest));
                    }
                    throw new HttpDataSource.CleartextNotPermittedException(iOException, dataSpec);
                }
                if (!blockUntilConnectTimeout) {
                    throw new OpenException(new SocketTimeoutException(), dataSpec, 2002, getStatus(urlRequest));
                }
                UrlResponseInfo urlResponseInfo = (UrlResponseInfo) Assertions.checkNotNull(this.responseInfo);
                int httpStatusCode = urlResponseInfo.getHttpStatusCode();
                Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
                long j = 0;
                if (httpStatusCode < 200 || httpStatusCode > 299) {
                    if (httpStatusCode == 416) {
                        if (dataSpec.position == HttpUtil.getDocumentSize(getFirstHeader(allHeaders, "Content-Range"))) {
                            this.transferStarted = true;
                            transferStarted(dataSpec);
                            long j2 = dataSpec.length;
                            if (j2 != -1) {
                                return j2;
                            }
                            return 0L;
                        }
                    }
                    try {
                        bArr = readResponseBody();
                    } catch (IOException unused) {
                        bArr = Util.EMPTY_BYTE_ARRAY;
                    }
                    throw new HttpDataSource.InvalidResponseCodeException(httpStatusCode, urlResponseInfo.getHttpStatusText(), httpStatusCode == 416 ? new DataSourceException(2008) : null, allHeaders, dataSpec, bArr);
                }
                l<String> lVar = this.contentTypePredicate;
                if (lVar != null && (firstHeader = getFirstHeader(allHeaders, RtspHeaders.CONTENT_TYPE)) != null && !lVar.apply(firstHeader)) {
                    throw new HttpDataSource.InvalidContentTypeException(firstHeader, dataSpec);
                }
                if (httpStatusCode == 200) {
                    long j3 = dataSpec.position;
                    if (j3 != 0) {
                        j = j3;
                    }
                }
                if (isCompressed(urlResponseInfo)) {
                    this.bytesRemaining = dataSpec.length;
                } else {
                    long j4 = dataSpec.length;
                    if (j4 != -1) {
                        this.bytesRemaining = j4;
                    } else {
                        long contentLength = HttpUtil.getContentLength(getFirstHeader(allHeaders, RtspHeaders.CONTENT_LENGTH), getFirstHeader(allHeaders, "Content-Range"));
                        this.bytesRemaining = contentLength != -1 ? contentLength - j : -1L;
                    }
                }
                this.transferStarted = true;
                transferStarted(dataSpec);
                skipFully(j, dataSpec);
                return this.bytesRemaining;
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                throw new OpenException(new InterruptedIOException(), dataSpec, 1004, -1);
            }
        } catch (IOException e) {
            if (e instanceof HttpDataSource.HttpDataSourceException) {
                throw ((HttpDataSource.HttpDataSourceException) e);
            }
            throw new OpenException(e, dataSpec, 2000, 0);
        }
    }

    @Override // androidx.media3.common.DataReader
    @UnstableApi
    public int read(byte[] bArr, int i, int i2) throws HttpDataSource.HttpDataSourceException {
        Assertions.checkState(this.transferStarted);
        if (i2 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        if (!orCreateReadBuffer.hasRemaining()) {
            this.operation.close();
            orCreateReadBuffer.clear();
            readInternal(orCreateReadBuffer, (DataSpec) Util.castNonNull(this.currentDataSpec));
            if (this.finished) {
                this.bytesRemaining = 0L;
                return -1;
            }
            orCreateReadBuffer.flip();
            Assertions.checkState(orCreateReadBuffer.hasRemaining());
        }
        long j = this.bytesRemaining;
        if (j == -1) {
            j = Long.MAX_VALUE;
        }
        int d = (int) e.d(j, orCreateReadBuffer.remaining(), i2);
        orCreateReadBuffer.get(bArr, i, d);
        long j2 = this.bytesRemaining;
        if (j2 != -1) {
            this.bytesRemaining = j2 - d;
        }
        bytesTransferred(d);
        return d;
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void setRequestProperty(String str, String str2) {
        this.requestProperties.set(str, str2);
    }

    @UnstableApi
    public static final class OpenException extends HttpDataSource.HttpDataSourceException {
        public final int cronetConnectionStatus;

        @Deprecated
        public OpenException(IOException iOException, DataSpec dataSpec, int i) {
            super(iOException, dataSpec, 2000, 1);
            this.cronetConnectionStatus = i;
        }

        public OpenException(IOException iOException, DataSpec dataSpec, int i, int i2) {
            super(iOException, dataSpec, i, 1);
            this.cronetConnectionStatus = i2;
        }

        @Deprecated
        public OpenException(String str, DataSpec dataSpec, int i) {
            super(str, dataSpec, 2000, 1);
            this.cronetConnectionStatus = i;
        }

        public OpenException(String str, DataSpec dataSpec, int i, int i2) {
            super(str, dataSpec, i, 1);
            this.cronetConnectionStatus = i2;
        }

        public OpenException(DataSpec dataSpec, int i, int i2) {
            super(dataSpec, i, 1);
            this.cronetConnectionStatus = i2;
        }
    }

    @UnstableApi
    public int read(ByteBuffer byteBuffer) throws HttpDataSource.HttpDataSourceException {
        int copyByteBuffer;
        Assertions.checkState(this.transferStarted);
        if (byteBuffer.isDirect()) {
            if (!byteBuffer.hasRemaining()) {
                return 0;
            }
            if (this.bytesRemaining == 0) {
                return -1;
            }
            int remaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = this.readBuffer;
            if (byteBuffer2 != null && (copyByteBuffer = copyByteBuffer(byteBuffer2, byteBuffer)) != 0) {
                long j = this.bytesRemaining;
                if (j != -1) {
                    this.bytesRemaining = j - copyByteBuffer;
                }
                bytesTransferred(copyByteBuffer);
                return copyByteBuffer;
            }
            this.operation.close();
            readInternal(byteBuffer, (DataSpec) Util.castNonNull(this.currentDataSpec));
            if (this.finished) {
                this.bytesRemaining = 0L;
                return -1;
            }
            Assertions.checkState(remaining > byteBuffer.remaining());
            int remaining2 = remaining - byteBuffer.remaining();
            long j2 = this.bytesRemaining;
            if (j2 != -1) {
                this.bytesRemaining = j2 - remaining2;
            }
            bytesTransferred(remaining2);
            return remaining2;
        }
        throw new IllegalArgumentException("Passed buffer is not a direct ByteBuffer");
    }
}
