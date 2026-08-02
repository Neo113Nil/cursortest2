package org.chromium.net.impl;

import android.net.Network;
import android.net.http.BidirectionalStream;
import android.net.http.HttpEngine;
import android.net.http.UrlRequest;
import android.util.Log;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetExceptionTranslationUtils;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes4.dex */
class AndroidHttpEngineWrapper extends CronetEngineBase {
    private static final String TAG = "HttpEngineWrapper";
    private static boolean sGlobalMetricsUnsupportedLogged;
    private static boolean sNetlogUnsupportedLogged;
    private final HttpEngine mBackend;
    private final Map<RequestFinishedInfo.Listener, VersionSafeCallbacks.RequestFinishedInfoListener> mFinishedListenerMap = Collections.synchronizedMap(new HashMap());

    @Override // org.chromium.net.CronetEngine
    public void stopNetLog() {
    }

    @Override // org.chromium.net.impl.CronetEngineBase, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public /* bridge */ /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String url, UrlRequest.Callback callback, Executor executor) {
        return super.newUrlRequestBuilder(url, callback, executor);
    }

    public AndroidHttpEngineWrapper(HttpEngine backend) {
        this.mBackend = backend;
    }

    @Override // org.chromium.net.CronetEngine
    public String getVersionString() {
        return HttpEngine.getVersionString();
    }

    @Override // org.chromium.net.CronetEngine
    public void shutdown() {
        this.mBackend.shutdown();
    }

    @Override // org.chromium.net.CronetEngine
    public void startNetLogToFile(String fileName, boolean logAll) {
        if (sNetlogUnsupportedLogged) {
            return;
        }
        Log.i(TAG, "Netlog is unsupported when HttpEngineNativeProvider is used.");
        sNetlogUnsupportedLogged = true;
    }

    @Override // org.chromium.net.CronetEngine
    public byte[] getGlobalMetricsDeltas() {
        if (!sGlobalMetricsUnsupportedLogged) {
            Log.i(TAG, "GlobalMetricsDelta is unsupported when HttpEngineNativeProvider is used. An empty protobuf is returned.");
            sGlobalMetricsUnsupportedLogged = true;
        }
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public void bindToNetwork(long networkHandle) {
        this.mBackend.bindToNetwork(getNetwork(networkHandle));
    }

    @Override // org.chromium.net.CronetEngine
    public URLConnection openConnection(final URL url) throws IOException {
        return (URLConnection) CronetExceptionTranslationUtils.executeTranslatingCronetExceptions(new CronetExceptionTranslationUtils.CronetWork() { // from class: org.chromium.net.impl.AndroidHttpEngineWrapper$$ExternalSyntheticLambda1
            @Override // org.chromium.net.impl.CronetExceptionTranslationUtils.CronetWork
            public final Object run() {
                URLConnection lambda$openConnection$0;
                lambda$openConnection$0 = AndroidHttpEngineWrapper.this.lambda$openConnection$0(url);
                return lambda$openConnection$0;
            }
        }, IOException.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ URLConnection lambda$openConnection$0(URL url) throws IOException {
        return this.mBackend.openConnection(url);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public URLConnection openConnection(URL url, Proxy proxy) throws IOException {
        if (proxy.type() != Proxy.Type.DIRECT) {
            throw new UnsupportedOperationException();
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return openConnection(url);
        }
        throw new UnsupportedOperationException("Unexpected protocol:" + protocol);
    }

    @Override // org.chromium.net.CronetEngine
    public URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return this.mBackend.createUrlStreamHandlerFactory();
    }

    @Override // org.chromium.net.impl.CronetEngineBase, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String url, BidirectionalStream.Callback callback, Executor executor) {
        return new BidirectionalStreamBuilderImpl(url, callback, executor, this);
    }

    @Override // org.chromium.net.CronetEngine
    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.mFinishedListenerMap.put(listener, new VersionSafeCallbacks.RequestFinishedInfoListener(listener));
    }

    @Override // org.chromium.net.CronetEngine
    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.mFinishedListenerMap.remove(listener);
    }

    void reportRequestFinished(final RequestFinishedInfo requestInfo, VersionSafeCallbacks.RequestFinishedInfoListener extraRequestListener) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mFinishedListenerMap) {
            arrayList.addAll(this.mFinishedListenerMap.values());
        }
        if (extraRequestListener != null) {
            arrayList.add(extraRequestListener);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final VersionSafeCallbacks.RequestFinishedInfoListener requestFinishedInfoListener = (VersionSafeCallbacks.RequestFinishedInfoListener) it.next();
            try {
                requestFinishedInfoListener.getExecutor().execute(new Runnable() { // from class: org.chromium.net.impl.AndroidHttpEngineWrapper$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidHttpEngineWrapper.lambda$reportRequestFinished$1(VersionSafeCallbacks.RequestFinishedInfoListener.this, requestInfo);
                    }
                });
            } catch (RejectedExecutionException e) {
                Log.e(TAG, "Exception posting task to executor", e);
            }
        }
    }

    static /* synthetic */ void lambda$reportRequestFinished$1(VersionSafeCallbacks.RequestFinishedInfoListener requestFinishedInfoListener, RequestFinishedInfo requestFinishedInfo) {
        try {
            requestFinishedInfoListener.onRequestFinished(requestFinishedInfo);
        } catch (Exception e) {
            Log.e(TAG, "Exception thrown from observation task", e);
        }
    }

    @Override // org.chromium.net.impl.CronetEngineBase
    public ExperimentalBidirectionalStream createBidirectionalStream(String url, BidirectionalStream.Callback callback, Executor executor, String httpMethod, List<Map.Entry<String, String>> requestHeaders, int priority, boolean delayRequestHeadersUntilFirstFlush, Collection<Object> requestAnnotations, boolean trafficStatsTagSet, int trafficStatsTag, boolean trafficStatsUidSet, int trafficStatsUid, long networkHandle) {
        AndroidBidirectionalStreamCallbackWrapper androidBidirectionalStreamCallbackWrapper = new AndroidBidirectionalStreamCallbackWrapper(callback);
        BidirectionalStream.Builder newBidirectionalStreamBuilder = this.mBackend.newBidirectionalStreamBuilder(url, executor, androidBidirectionalStreamCallbackWrapper);
        newBidirectionalStreamBuilder.setHttpMethod(httpMethod);
        for (Map.Entry<String, String> entry : requestHeaders) {
            newBidirectionalStreamBuilder.addHeader(entry.getKey(), entry.getValue());
        }
        newBidirectionalStreamBuilder.setPriority(priority);
        newBidirectionalStreamBuilder.setDelayRequestHeadersUntilFirstFlushEnabled(delayRequestHeadersUntilFirstFlush);
        if (trafficStatsTagSet) {
            newBidirectionalStreamBuilder.setTrafficStatsTag(trafficStatsTag);
        }
        if (trafficStatsUidSet) {
            newBidirectionalStreamBuilder.setTrafficStatsUid(trafficStatsUid);
        }
        return AndroidBidirectionalStreamWrapper.createAndAddToCallback(newBidirectionalStreamBuilder.build(), androidBidirectionalStreamCallbackWrapper, this, url, requestAnnotations);
    }

    @Override // org.chromium.net.impl.CronetEngineBase
    public ExperimentalUrlRequest createRequest(String url, UrlRequest.Callback callback, Executor executor, int priority, Collection<Object> requestAnnotations, boolean disableCache, boolean disableConnectionMigration, boolean allowDirectExecutor, boolean trafficStatsTagSet, int trafficStatsTag, boolean trafficStatsUidSet, int trafficStatsUid, RequestFinishedInfo.Listener requestFinishedListener, int idempotency, long networkHandle, String method, ArrayList<Map.Entry<String, String>> requestHeaders, UploadDataProvider uploadDataProvider, Executor uploadDataProviderExecutor, byte[] dictionarySha256Hash, ByteBuffer sharedDictionary, String sharedDictionaryId) {
        AndroidUrlRequestCallbackWrapper androidUrlRequestCallbackWrapper = new AndroidUrlRequestCallbackWrapper(callback);
        UrlRequest.Builder newUrlRequestBuilder = this.mBackend.newUrlRequestBuilder(url, executor, androidUrlRequestCallbackWrapper);
        newUrlRequestBuilder.setPriority(priority);
        if (disableCache) {
            newUrlRequestBuilder.setCacheDisabled(disableCache);
        }
        if (allowDirectExecutor) {
            newUrlRequestBuilder.setDirectExecutorAllowed(allowDirectExecutor);
        }
        if (trafficStatsTagSet) {
            newUrlRequestBuilder.setTrafficStatsTag(trafficStatsTag);
        }
        if (trafficStatsUidSet) {
            newUrlRequestBuilder.setTrafficStatsTag(trafficStatsUid);
        }
        newUrlRequestBuilder.bindToNetwork(getNetwork(networkHandle));
        newUrlRequestBuilder.setHttpMethod(method);
        Iterator<Map.Entry<String, String>> it = requestHeaders.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            newUrlRequestBuilder.addHeader(next.getKey(), next.getValue());
        }
        if (uploadDataProvider != null) {
            newUrlRequestBuilder.setUploadDataProvider(new AndroidUploadDataProviderWrapper(uploadDataProvider), uploadDataProviderExecutor);
        }
        return AndroidUrlRequestWrapper.createAndAddToCallback(newUrlRequestBuilder.build(), androidUrlRequestCallbackWrapper, this, url, requestAnnotations, requestFinishedListener);
    }

    private Network getNetwork(long networkHandle) {
        if (networkHandle == -1) {
            return null;
        }
        return Network.fromNetworkHandle(networkHandle);
    }
}
