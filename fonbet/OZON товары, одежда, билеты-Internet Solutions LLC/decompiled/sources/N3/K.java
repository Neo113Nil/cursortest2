package N3;

import N3.H;

/* loaded from: classes8.dex */
public final class K implements H {
    @Override // N3.H
    public final long getDurationUs() {
        return -9223372036854775807L;
    }

    @Override // N3.H
    public final H.a getSeekPoints(long j11) {
        I i11 = new I(j11, 0L);
        return new H.a(i11, i11);
    }

    @Override // N3.H
    public final boolean isSeekable() {
        return true;
    }
}
