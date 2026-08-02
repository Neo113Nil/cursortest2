package N3;

import N3.H;

/* loaded from: classes8.dex */
public class A implements H {
    private final H seekMap;

    public A(H h11) {
        this.seekMap = h11;
    }

    @Override // N3.H
    public long getDurationUs() {
        return this.seekMap.getDurationUs();
    }

    @Override // N3.H
    public H.a getSeekPoints(long j11) {
        return this.seekMap.getSeekPoints(j11);
    }

    @Override // N3.H
    public boolean isSeekable() {
        return this.seekMap.isSeekable();
    }
}
