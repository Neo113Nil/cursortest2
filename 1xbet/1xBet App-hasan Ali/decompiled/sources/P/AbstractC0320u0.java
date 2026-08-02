package P;

import i4.InterfaceC2015a;

/* renamed from: P.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0320u0 {

    /* renamed from: a, reason: collision with root package name */
    public final Y f4564a;

    public AbstractC0320u0(InterfaceC2015a interfaceC2015a) {
        this.f4564a = new Y(interfaceC2015a);
    }

    public abstract C0322v0 a(Object obj);

    public g1 b() {
        return this.f4564a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g1 c(C0322v0 c0322v0, g1 g1Var) {
        L l5 = null;
        if (g1Var instanceof L) {
            if (c0322v0.f4566b) {
                l5 = (L) g1Var;
                l5.f4330a.setValue(c0322v0.a());
            }
        } else if (g1Var instanceof f1) {
            if ((c0322v0.f4565a || c0322v0.f != null) && !c0322v0.f4566b) {
                f1 f1Var = (f1) g1Var;
                if (kotlin.jvm.internal.l.a(c0322v0.a(), f1Var.f4468a)) {
                    l5 = f1Var;
                }
            }
        } else if (g1Var instanceof E) {
            c0322v0.getClass();
            kotlin.jvm.internal.m mVar = ((E) g1Var).f4272a;
        }
        if (l5 != null) {
            return l5;
        }
        if (!c0322v0.f4566b) {
            return new f1(c0322v0.a());
        }
        U0 u02 = (U0) c0322v0.f4569e;
        if (u02 == null) {
            u02 = Z.f4434p;
        }
        return new L(new C0305m0(c0322v0.f, u02));
    }
}
