package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public interface TimeToFirstByteEstimator {
    long getTimeToFirstByteEstimateUs();

    void onTransferInitializing(com.google.android.exoplayer2.upstream.DataSpec dataSpec);

    void onTransferStart(com.google.android.exoplayer2.upstream.DataSpec dataSpec);

    void reset();
}
