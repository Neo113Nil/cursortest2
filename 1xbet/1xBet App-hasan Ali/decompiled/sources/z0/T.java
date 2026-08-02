package z0;

import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U f21699l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0 f21700m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f21701n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u5, n0 n0Var, long j5) {
        super(0);
        this.f21699l = u5;
        this.f21700m = n0Var;
        this.f21701n = j5;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        AbstractC2740P G02;
        U u5 = this.f21699l;
        boolean r5 = AbstractC2749f.r(u5.f21709p.f21650a);
        C2735K c2735k = u5.f21709p;
        x0.Y y5 = null;
        if (r5 || c2735k.f21652c) {
            e0 e0Var = c2735k.a().f21795A;
            if (e0Var != null) {
                y5 = e0Var.f21684v;
            }
        } else {
            e0 e0Var2 = c2735k.a().f21795A;
            if (e0Var2 != null && (G02 = e0Var2.G0()) != null) {
                y5 = G02.f21684v;
            }
        }
        if (y5 == null) {
            y5 = ((A0.F) this.f21700m).getPlacementScope();
        }
        AbstractC2740P G03 = c2735k.a().G0();
        kotlin.jvm.internal.l.c(G03);
        x0.Y.h(y5, G03, this.f21701n);
        return W3.o.f6046a;
    }
}
