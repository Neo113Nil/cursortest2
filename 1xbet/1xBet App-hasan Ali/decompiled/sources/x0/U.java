package x0;

/* loaded from: classes.dex */
public final class U implements k0, InterfaceC2624j {

    /* renamed from: l, reason: collision with root package name */
    public static final U f20966l = new U(0);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f20967k;

    public /* synthetic */ U(int i) {
        this.f20967k = i;
    }

    @Override // x0.InterfaceC2624j
    public long a(long j5, long j6) {
        switch (this.f20967k) {
            case 1:
                float max = Math.max(Float.intBitsToFloat((int) (j6 >> 32)) / Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)) / Float.intBitsToFloat((int) (j5 & 4294967295L)));
                long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
                int i = e0.f20993a;
                return floatToRawIntBits;
            case 2:
                float c5 = f0.c(j5, j6);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(c5) << 32) | (Float.floatToRawIntBits(c5) & 4294967295L);
                int i5 = e0.f20993a;
                return floatToRawIntBits2;
            default:
                if (Float.intBitsToFloat((int) (j5 >> 32)) <= Float.intBitsToFloat((int) (j6 >> 32)) && Float.intBitsToFloat((int) (j5 & 4294967295L)) <= Float.intBitsToFloat((int) (j6 & 4294967295L))) {
                    long floatToRawIntBits3 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i6 = e0.f20993a;
                    return floatToRawIntBits3;
                }
                float c6 = f0.c(j5, j6);
                long floatToRawIntBits4 = (Float.floatToRawIntBits(c6) << 32) | (Float.floatToRawIntBits(c6) & 4294967295L);
                int i7 = e0.f20993a;
                return floatToRawIntBits4;
        }
    }

    @Override // x0.k0
    public void c(r.V v4) {
        v4.clear();
    }

    @Override // x0.k0
    public boolean e(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        switch (this.f20967k) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
