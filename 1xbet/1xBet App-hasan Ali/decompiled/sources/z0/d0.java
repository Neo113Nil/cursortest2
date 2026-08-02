package z0;

import i0.InterfaceC2009n;
import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f21775l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e0 f21776m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, int i) {
        super(0);
        this.f21775l = i;
        this.f21776m = e0Var;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        switch (this.f21775l) {
            case 0:
                e0 e0Var = this.f21776m;
                InterfaceC2009n interfaceC2009n = e0Var.f21807O;
                kotlin.jvm.internal.l.c(interfaceC2009n);
                e0Var.C0(interfaceC2009n, e0Var.f21806N);
                break;
            default:
                e0 e0Var2 = this.f21776m.f21795A;
                if (e0Var2 != null) {
                    e0Var2.P0();
                }
                break;
        }
        return W3.o.f6046a;
    }
}
