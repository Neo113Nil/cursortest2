package x0;

/* renamed from: x0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2626l implements InterfaceC2624j {
    @Override // x0.InterfaceC2624j
    public final long a(long j5, long j6) {
        long floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (4294967295L & Float.floatToRawIntBits(1.0f));
        int i = e0.f20993a;
        return floatToRawIntBits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2626l)) {
            return false;
        }
        ((C2626l) obj).getClass();
        return Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
