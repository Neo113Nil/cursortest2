package I;

import i4.InterfaceC2015a;

/* renamed from: I.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164q extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0160m f2514l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2515m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2516n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ D3.l f2517o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f2518p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0164q(C0160m c0160m, int i, int i5, D3.l lVar, W3.e eVar) {
        super(0);
        this.f2514l = c0160m;
        this.f2515m = i;
        this.f2516n = i5;
        this.f2517o = lVar;
        this.f2518p = eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [W3.e, java.lang.Object] */
    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        int intValue = ((Number) this.f2518p.getValue()).intValue();
        D3.l lVar = this.f2517o;
        boolean z3 = lVar.b() == 1;
        C0160m c0160m = this.f2514l;
        K0.L l5 = (K0.L) c0160m.f2501e;
        int i = this.f2515m;
        long k5 = l5.k(i);
        int i5 = K0.N.f2802c;
        int i6 = (int) (k5 >> 32);
        int e3 = l5.e(i6);
        int i7 = l5.f2793b.f;
        if (e3 != intValue) {
            i6 = intValue >= i7 ? l5.h(i7 - 1) : l5.h(intValue);
        }
        int i8 = (int) (k5 & 4294967295L);
        if (l5.e(i8) != intValue) {
            i8 = intValue >= i7 ? l5.d(i7 - 1, false) : l5.d(intValue, false);
        }
        int i9 = this.f2516n;
        if (i6 == i9) {
            return c0160m.b(i8);
        }
        if (i8 == i9) {
            return c0160m.b(i6);
        }
        if (!(lVar.f961l ^ z3) ? i >= i6 : i > i8) {
            i6 = i8;
        }
        return c0160m.b(i6);
    }
}
