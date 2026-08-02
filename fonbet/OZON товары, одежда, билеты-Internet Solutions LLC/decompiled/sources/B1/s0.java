package B1;

import ed.InterfaceC6346b;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f2151a = t0.a(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2152b = 0;

    public static final float a(long j11) {
        if (j11 != f2151a) {
            return Float.intBitsToFloat((int) (j11 >> 32));
        }
        A1.a.b("ScaleFactor is unspecified");
        throw null;
    }

    public static final float b(long j11) {
        if (j11 != f2151a) {
            return Float.intBitsToFloat((int) (j11 & 4294967295L));
        }
        A1.a.b("ScaleFactor is unspecified");
        throw null;
    }
}
