package z0;

import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class X extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f21730l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y f21731m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(Y y5, int i) {
        super(0);
        this.f21730l = i;
        this.f21731m = y5;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        x0.Y placementScope;
        switch (this.f21730l) {
            case 0:
                Y y5 = this.f21731m;
                C2735K c2735k = y5.f21750p;
                c2735k.i = 0;
                R.e y6 = c2735k.f21650a.y();
                Object[] objArr = y6.f5106k;
                int i = y6.f5108m;
                for (int i5 = 0; i5 < i; i5++) {
                    Y y7 = ((C2731G) objArr[i5]).f21613P.f21663p;
                    y7.f21752r = y7.f21753s;
                    y7.f21753s = Integer.MAX_VALUE;
                    y7.f21734C = false;
                    if (y7.f21756v == EnumC2729E.f21593l) {
                        y7.f21756v = EnumC2729E.f21594m;
                    }
                }
                C2735K c2735k2 = y5.f21750p;
                R.e y8 = c2735k2.f21650a.y();
                Object[] objArr2 = y8.f5106k;
                int i6 = y8.f5108m;
                for (int i7 = 0; i7 < i6; i7++) {
                    ((C2731G) objArr2[i7]).f21613P.f21663p.f21738G.getClass();
                }
                y5.r().q0().b();
                C2731G c2731g = c2735k2.f21650a;
                R.e y9 = c2731g.y();
                Object[] objArr3 = y9.f5106k;
                int i8 = y9.f5108m;
                for (int i9 = 0; i9 < i8; i9++) {
                    C2731G c2731g2 = (C2731G) objArr3[i9];
                    if (c2731g2.f21613P.f21663p.f21752r != c2731g2.v()) {
                        c2731g.P();
                        c2731g.C();
                        if (c2731g2.v() == Integer.MAX_VALUE) {
                            C2735K c2735k3 = c2731g2.f21613P;
                            if (c2735k3.f21652c) {
                                U u5 = c2735k3.f21664q;
                                kotlin.jvm.internal.l.c(u5);
                                u5.f0(false);
                            }
                            c2735k3.f21663p.j0();
                        }
                    }
                }
                R.e y10 = c2731g.y();
                Object[] objArr4 = y10.f5106k;
                int i10 = y10.f5108m;
                for (int i11 = 0; i11 < i10; i11++) {
                    C2732H c2732h = ((C2731G) objArr4[i11]).f21613P.f21663p.f21738G;
                    c2732h.getClass();
                    c2732h.f21642c = false;
                }
                break;
            case 1:
                Y y11 = this.f21731m;
                y11.f21750p.a().e(y11.K);
                break;
            default:
                Y y12 = this.f21731m;
                e0 e0Var = y12.f21750p.a().f21795A;
                C2735K c2735k4 = y12.f21750p;
                if (e0Var == null || (placementScope = e0Var.f21684v) == null) {
                    placementScope = ((A0.F) AbstractC2734J.a(c2735k4.f21650a)).getPlacementScope();
                }
                i4.c cVar = y12.f21745P;
                if (cVar == null) {
                    e0 a5 = c2735k4.a();
                    long j5 = y12.f21746Q;
                    float f = y12.f21747R;
                    placementScope.getClass();
                    x0.Y.a(placementScope, a5);
                    a5.Z(W0.j.c(j5, a5.f20977o), f, null);
                } else {
                    e0 a6 = c2735k4.a();
                    long j6 = y12.f21746Q;
                    float f5 = y12.f21747R;
                    placementScope.getClass();
                    x0.Y.a(placementScope, a6);
                    a6.Z(W0.j.c(j6, a6.f20977o), f5, cVar);
                }
                break;
        }
        return W3.o.f6046a;
    }
}
