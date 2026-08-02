package z0;

import i4.InterfaceC2015a;

/* renamed from: z0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2737M extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC2739O f21669l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f21670m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f21671n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r0 f21672o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2737M(AbstractC2739O abstractC2739O, long j5, long j6, r0 r0Var) {
        super(0);
        this.f21669l = abstractC2739O;
        this.f21670m = j5;
        this.f21671n = j6;
        this.f21672o = r0Var;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        AbstractC2739O abstractC2739O = this.f21669l;
        abstractC2739O.t0().f21665k = false;
        abstractC2739O.t0().f21666l = this.f21670m;
        abstractC2739O.t0().f21667m = this.f21671n;
        i4.c d5 = this.f21672o.f21853k.d();
        if (d5 != null) {
            d5.c(abstractC2739O.t0());
        }
        return W3.o.f6046a;
    }
}
