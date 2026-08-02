package androidx.media3.ui;

/* loaded from: classes8.dex */
public interface y {

    public interface a {
        void onScrubMove(y yVar, long j11);

        void onScrubStart(y yVar, long j11);

        void onScrubStop(y yVar, long j11, boolean z11);
    }

    void addListener(a aVar);

    long getPreferredUpdateDelay();

    void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i11);

    void setBufferedPosition(long j11);

    void setDuration(long j11);

    void setEnabled(boolean z11);

    void setPosition(long j11);
}
