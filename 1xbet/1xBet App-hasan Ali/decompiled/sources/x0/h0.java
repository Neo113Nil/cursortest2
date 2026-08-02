package x0;

import P.AbstractC0321v;
import z0.C2731G;

/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f20998l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0 f20999m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(i0 i0Var, int i) {
        super(2);
        this.f20998l = i;
        this.f20999m = i0Var;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20998l) {
            case 0:
                this.f20999m.a().f20942l = (AbstractC0321v) obj2;
                break;
            case 1:
                K a5 = this.f20999m.a();
                ((C2731G) obj).d0(new G(a5, (i4.e) obj2, a5.f20956z));
                break;
            default:
                C2731G c2731g = (C2731G) obj;
                K k5 = c2731g.f21614Q;
                i0 i0Var = this.f20999m;
                if (k5 == null) {
                    k5 = new K(c2731g, i0Var.f21004a);
                    c2731g.f21614Q = k5;
                }
                i0Var.f21005b = k5;
                i0Var.a().b();
                K a6 = i0Var.a();
                k0 k0Var = a6.f20943m;
                k0 k0Var2 = i0Var.f21004a;
                if (k0Var != k0Var2) {
                    a6.f20943m = k0Var2;
                    a6.c(false);
                    C2731G.W(a6.f20941k, false, 7);
                }
                break;
        }
        return W3.o.f6046a;
    }
}
