package androidx.media3.exoplayer.upstream;

/* loaded from: classes2.dex */
public interface TimeToFirstByteEstimator {
    long getTimeToFirstByteEstimateUs();

    void onTransferInitializing(androidx.media3.datasource.DataSpec dataSpec);

    void onTransferStart(androidx.media3.datasource.DataSpec dataSpec);

    void reset();
}
