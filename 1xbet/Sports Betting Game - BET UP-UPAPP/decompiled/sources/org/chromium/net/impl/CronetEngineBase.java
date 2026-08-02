package org.chromium.net.impl;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* loaded from: classes4.dex */
public abstract class CronetEngineBase extends ExperimentalCronetEngine {
    protected static final long DEFAULT_NETWORK_HANDLE = -1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Idempotency {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RequestPriority {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamPriority {
    }

    protected abstract ExperimentalBidirectionalStream createBidirectionalStream(String url, BidirectionalStream.Callback callback, Executor executor, String httpMethod, List<Map.Entry<String, String>> requestHeaders, int priority, boolean delayRequestHeadersUntilFirstFlush, Collection<Object> requestAnnotations, boolean trafficStatsTagSet, int trafficStatsTag, boolean trafficStatsUidSet, int trafficStatsUid, long networkHandle);

    protected abstract ExperimentalUrlRequest createRequest(String url, UrlRequest.Callback callback, Executor executor, int priority, Collection<Object> requestAnnotations, boolean disableCache, boolean disableConnectionMigration, boolean allowDirectExecutor, boolean trafficStatsTagSet, int trafficStatsTag, boolean trafficStatsUidSet, int trafficStatsUid, RequestFinishedInfo.Listener requestFinishedListener, int idempotency, long networkHandle, String method, ArrayList<Map.Entry<String, String>> requestHeaders, UploadDataProvider uploadDataProvider, Executor uploadDataProviderExecutor, byte[] dictionarySha256Hash, ByteBuffer dictionary, String dictionaryId);

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public /* bridge */ /* synthetic */ BidirectionalStream.Builder newBidirectionalStreamBuilder(String url, BidirectionalStream.Callback callback, Executor executor) {
        return super.newBidirectionalStreamBuilder(url, callback, executor);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public ExperimentalUrlRequest.Builder newUrlRequestBuilder(String url, UrlRequest.Callback callback, Executor executor) {
        return new UrlRequestBuilderImpl(url, callback, executor, this);
    }
}
