package M;

/* loaded from: classes.dex */
public final class c0 extends kotlin.jvm.internal.m implements i4.f {

    /* renamed from: l, reason: collision with root package name */
    public static final c0 f3304l = new c0(3);

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        x0.Q q5 = (x0.Q) obj;
        long j5 = ((W0.a) obj3).f6000a;
        int K = q5.K(e0.f3318a);
        int i = K * 2;
        x0.Z e3 = ((x0.N) obj2).e(W0.b.i(0, i, j5));
        int i5 = e3.f20974l - i;
        return q5.i(e3.f20973k, i5, X3.w.f6091k, new A.x(K, 1, e3));
    }
}
