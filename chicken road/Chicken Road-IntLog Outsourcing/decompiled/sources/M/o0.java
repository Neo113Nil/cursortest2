package M;

import k4.InterfaceC1221g;
import k4.InterfaceC1222h;
import k4.InterfaceC1223i;
import n2.AbstractC1341c;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class o0 implements InterfaceC1221g {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f1739a;

    /* renamed from: b, reason: collision with root package name */
    public final P f1740b;

    public o0(o0 o0Var, P instance) {
        kotlin.jvm.internal.i.e(instance, "instance");
        this.f1739a = o0Var;
        this.f1740b = instance;
    }

    @Override // k4.InterfaceC1223i
    public final InterfaceC1223i A(InterfaceC1223i interfaceC1223i) {
        return AbstractC1341c.A(this, interfaceC1223i);
    }

    @Override // k4.InterfaceC1223i
    public final InterfaceC1223i c(InterfaceC1222h interfaceC1222h) {
        return AbstractC1341c.x(this, interfaceC1222h);
    }

    public final void d(P p5) {
        if (this.f1740b == p5) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        o0 o0Var = this.f1739a;
        if (o0Var != null) {
            o0Var.d(p5);
        }
    }

    @Override // k4.InterfaceC1221g
    public final InterfaceC1222h getKey() {
        return n0.f1736a;
    }

    @Override // k4.InterfaceC1223i
    public final InterfaceC1221g o(InterfaceC1222h interfaceC1222h) {
        return AbstractC1341c.n(this, interfaceC1222h);
    }

    @Override // k4.InterfaceC1223i
    public final Object q(Object obj, InterfaceC1445p interfaceC1445p) {
        return interfaceC1445p.invoke(obj, this);
    }
}
