package org.chromium.net.impl;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetLogger;

/* loaded from: classes4.dex */
public final class JavaCronetEngine extends CronetEngineBase {
    private static final String TAG = "JavaCronetEngine";
    private final Context mContext;
    private final int mCronetEngineId;
    private final ExecutorService mExecutorService;
    private final CronetLogger mLogger;
    private final String mUserAgent;
    private final AtomicInteger mActiveRequestCount = new AtomicInteger();
    private long mNetworkHandle = -1;

    @Override // org.chromium.net.CronetEngine
    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    @Override // org.chromium.net.CronetEngine
    public void addRttListener(NetworkQualityRttListener listener) {
    }

    @Override // org.chromium.net.CronetEngine
    public void addThroughputListener(NetworkQualityThroughputListener listener) {
    }

    @Override // org.chromium.net.CronetEngine
    public void configureNetworkQualityEstimatorForTesting(boolean useLocalHostRequests, boolean useSmallerResponses, boolean disableOfflineCheck) {
    }

    @Override // org.chromium.net.CronetEngine
    public int getDownstreamThroughputKbps() {
        return -1;
    }

    @Override // org.chromium.net.CronetEngine
    public int getEffectiveConnectionType() {
        return 0;
    }

    @Override // org.chromium.net.CronetEngine
    public int getHttpRttMs() {
        return -1;
    }

    @Override // org.chromium.net.CronetEngine
    public int getTransportRttMs() {
        return -1;
    }

    @Override // org.chromium.net.CronetEngine
    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    @Override // org.chromium.net.CronetEngine
    public void removeRttListener(NetworkQualityRttListener listener) {
    }

    @Override // org.chromium.net.CronetEngine
    public void removeThroughputListener(NetworkQualityThroughputListener listener) {
    }

    @Override // org.chromium.net.CronetEngine
    public void startNetLogToDisk(String dirPath, boolean logAll, int maxSize) {
    }

    @Override // org.chromium.net.CronetEngine
    public void startNetLogToFile(String fileName, boolean logAll) {
    }

    @Override // org.chromium.net.CronetEngine
    public void stopNetLog() {
    }

    @Override // org.chromium.net.impl.CronetEngineBase, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public /* bridge */ /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String url, UrlRequest.Callback callback, Executor executor) {
        return super.newUrlRequestBuilder(url, callback, executor);
    }

    public JavaCronetEngine(CronetEngineBuilderImpl builder) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("JavaCronetEngine#JavaCronetEngine");
        try {
            Context context = builder.getContext();
            this.mContext = context;
            int hashCode = hashCode();
            this.mCronetEngineId = hashCode;
            this.mUserAgent = builder.getUserAgent();
            this.mExecutorService = new ThreadPoolExecutor(10, 10, 50L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: org.chromium.net.impl.JavaCronetEngine.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(final Runnable r) {
                    return Executors.defaultThreadFactory().newThread(new Runnable(this) { // from class: org.chromium.net.impl.JavaCronetEngine.1.1
                        final /* synthetic */ AnonymousClass1 this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            Thread.currentThread().setName(JavaCronetEngine.TAG);
                            Process.setThreadPriority(0);
                            r.run();
                        }
                    });
                }
            });
            CronetLogger createLogger = CronetLoggerFactory.createLogger(context, CronetLogger.CronetSource.CRONET_SOURCE_FALLBACK);
            this.mLogger = createLogger;
            try {
                createLogger.logCronetEngineCreation(hashCode, builder.toLoggerInfo(), buildCronetVersion(), CronetLogger.CronetSource.CRONET_SOURCE_FALLBACK);
            } catch (RuntimeException e) {
                Log.e(TAG, "Error while trying to log JavaCronetEngine creation: ", e);
            }
            Log.w(TAG, "using the fallback Cronet Engine implementation. Performance will suffer and many HTTP client features, including caching, will not work.");
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

    void incrementActiveRequestCount() {
        this.mActiveRequestCount.incrementAndGet();
    }

    void decrementActiveRequestCount() {
        this.mActiveRequestCount.decrementAndGet();
    }

    int getCronetEngineId() {
        return this.mCronetEngineId;
    }

    CronetLogger getCronetLogger() {
        return this.mLogger;
    }

    Context getContext() {
        return this.mContext;
    }

    @Override // org.chromium.net.impl.CronetEngineBase
    public ExperimentalUrlRequest createRequest(String url, UrlRequest.Callback callback, Executor executor, int priority, Collection<Object> connectionAnnotations, boolean disableCache, boolean disableConnectionMigration, boolean allowDirectExecutor, boolean trafficStatsTagSet, int trafficStatsTag, boolean trafficStatsUidSet, int trafficStatsUid, RequestFinishedInfo.Listener requestFinishedListener, int idempotency, long networkHandle, String method, ArrayList<Map.Entry<String, String>> requestHeaders, UploadDataProvider uploadDataProvider, Executor uploadDataProviderExecutor, byte[] sharedDictionaryHash, ByteBuffer sharedDictionary, String sharedDictionaryId) {
        if (networkHandle != -1) {
            this.mNetworkHandle = networkHandle;
        }
        return new JavaUrlRequest(this, callback, this.mExecutorService, executor, url, this.mUserAgent, allowDirectExecutor, trafficStatsTagSet, trafficStatsTag, trafficStatsUidSet, trafficStatsUid, this.mNetworkHandle, method, requestHeaders, uploadDataProvider, uploadDataProviderExecutor);
    }

    @Override // org.chromium.net.impl.CronetEngineBase
    protected ExperimentalBidirectionalStream createBidirectionalStream(String url, BidirectionalStream.Callback callback, Executor executor, String httpMethod, List<Map.Entry<String, String>> requestHeaders, int priority, boolean delayRequestHeadersUntilFirstFlush, Collection<Object> connectionAnnotations, boolean trafficStatsTagSet, int trafficStatsTag, boolean trafficStatsUidSet, int trafficStatsUid, long networkHandle) {
        throw new UnsupportedOperationException("Can't create a bidi stream - httpurlconnection doesn't have those APIs");
    }

    @Override // org.chromium.net.impl.CronetEngineBase, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String url, BidirectionalStream.Callback callback, Executor executor) {
        throw new UnsupportedOperationException("The bidirectional stream API is not supported by the Java implementation of Cronet Engine");
    }

    @Override // org.chromium.net.CronetEngine
    public String getVersionString() {
        return "CronetHttpURLConnection/" + ImplVersion.getCronetVersionWithLastChange();
    }

    private CronetLogger.CronetVersion buildCronetVersion() {
        return new CronetLogger.CronetVersion(getVersionString().split("/")[1].split("@")[0]);
    }

    @Override // org.chromium.net.CronetEngine
    public void shutdown() {
        this.mExecutorService.shutdown();
    }

    @Override // org.chromium.net.CronetEngine
    public byte[] getGlobalMetricsDeltas() {
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public int getActiveRequestCount() {
        return this.mActiveRequestCount.get();
    }

    @Override // org.chromium.net.CronetEngine
    public void bindToNetwork(long networkHandle) {
        this.mNetworkHandle = networkHandle;
    }

    @Override // org.chromium.net.CronetEngine
    public URLConnection openConnection(URL url) throws IOException {
        return url.openConnection();
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public URLConnection openConnection(URL url, Proxy proxy) throws IOException {
        return url.openConnection(proxy);
    }

    @Override // org.chromium.net.CronetEngine
    public URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new URLStreamHandlerFactory() { // from class: org.chromium.net.impl.JavaCronetEngine.2
            @Override // java.net.URLStreamHandlerFactory
            public URLStreamHandler createURLStreamHandler(String protocol) {
                return null;
            }
        };
    }
}
