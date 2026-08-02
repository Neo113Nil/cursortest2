package org.chromium.net.impl;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;

/* loaded from: classes4.dex */
public class BidirectionalStreamBuilderImpl extends ExperimentalBidirectionalStream.Builder {
    private final BidirectionalStream.Callback mCallback;
    private final CronetEngineBase mCronetEngine;
    private boolean mDelayRequestHeadersUntilFirstFlush;
    private final Executor mExecutor;
    private Collection<Object> mRequestAnnotations;
    private int mTrafficStatsTag;
    private boolean mTrafficStatsTagSet;
    private int mTrafficStatsUid;
    private boolean mTrafficStatsUidSet;
    private final String mUrl;
    private final ArrayList<Map.Entry<String, String>> mRequestHeaders = new ArrayList<>();
    private String mHttpMethod = "POST";
    private int mPriority = 3;
    private long mNetworkHandle = -1;

    BidirectionalStreamBuilderImpl(String url, BidirectionalStream.Callback callback, Executor executor, CronetEngineBase cronetEngine) {
        this.mUrl = (String) Objects.requireNonNull(url, "URL is required.");
        this.mCallback = (BidirectionalStream.Callback) Objects.requireNonNull(callback, "Callback is required.");
        this.mExecutor = (Executor) Objects.requireNonNull(executor, "Executor is required.");
        this.mCronetEngine = (CronetEngineBase) Objects.requireNonNull(cronetEngine, "CronetEngine is required.");
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public BidirectionalStreamBuilderImpl setHttpMethod(String method) {
        this.mHttpMethod = (String) Objects.requireNonNull(method, "Method is required.");
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public BidirectionalStreamBuilderImpl addHeader(String header, String value) {
        Objects.requireNonNull(header, "Invalid header name.");
        Objects.requireNonNull(value, "Invalid header value.");
        this.mRequestHeaders.add(new AbstractMap.SimpleImmutableEntry(header, value));
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public BidirectionalStreamBuilderImpl setPriority(int priority) {
        this.mPriority = priority;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public BidirectionalStreamBuilderImpl delayRequestHeadersUntilFirstFlush(boolean delayRequestHeadersUntilFirstFlush) {
        this.mDelayRequestHeadersUntilFirstFlush = delayRequestHeadersUntilFirstFlush;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public ExperimentalBidirectionalStream.Builder addRequestAnnotation(Object annotation) {
        Objects.requireNonNull(annotation, "Invalid metrics annotation.");
        if (this.mRequestAnnotations == null) {
            this.mRequestAnnotations = new ArrayList();
        }
        this.mRequestAnnotations.add(annotation);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public ExperimentalBidirectionalStream.Builder setTrafficStatsTag(int tag) {
        this.mTrafficStatsTagSet = true;
        this.mTrafficStatsTag = tag;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public ExperimentalBidirectionalStream.Builder setTrafficStatsUid(int uid) {
        this.mTrafficStatsUidSet = true;
        this.mTrafficStatsUid = uid;
        return this;
    }

    @Override // org.chromium.net.BidirectionalStream.Builder
    public ExperimentalBidirectionalStream.Builder bindToNetwork(long networkHandle) {
        this.mNetworkHandle = networkHandle;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public ExperimentalBidirectionalStream build() {
        return this.mCronetEngine.createBidirectionalStream(this.mUrl, this.mCallback, this.mExecutor, this.mHttpMethod, this.mRequestHeaders, this.mPriority, this.mDelayRequestHeadersUntilFirstFlush, this.mRequestAnnotations, this.mTrafficStatsTagSet, this.mTrafficStatsTag, this.mTrafficStatsUidSet, this.mTrafficStatsUid, this.mNetworkHandle);
    }
}
