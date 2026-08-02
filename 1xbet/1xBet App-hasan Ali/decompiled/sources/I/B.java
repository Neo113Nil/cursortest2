package I;

import h0.C1988b;
import u.C2467n;

/* loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: m, reason: collision with root package name */
    public static final B f2385m = new B(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final B f2386n = new B(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final B f2387o = new B(1, 2);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2388l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(int i, int i5) {
        super(i);
        this.f2388l = i5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f2388l) {
            case 0:
                long j5 = ((C1988b) obj).f17191a;
                return G4.d.C(j5) ? new C2467n(C1988b.d(j5), C1988b.e(j5)) : G.f2401a;
            case 1:
                C2467n c2467n = (C2467n) obj;
                return new C1988b(G4.d.d(c2467n.f19881a, c2467n.f19882b));
            default:
                return W3.o.f6046a;
        }
    }
}
