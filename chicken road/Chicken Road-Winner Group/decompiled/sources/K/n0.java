package K;

import a.AbstractC0086a;
import g2.InterfaceC0322f;

/* loaded from: classes.dex */
public final class n0 implements InterfaceC0322f {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f886a;

    /* renamed from: b, reason: collision with root package name */
    public final O f887b;

    public n0(n0 n0Var, O instance) {
        kotlin.jvm.internal.j.e(instance, "instance");
        this.f886a = n0Var;
        this.f887b = instance;
    }

    public final void c(O o3) {
        if (this.f887b == o3) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        n0 n0Var = this.f886a;
        if (n0Var != null) {
            n0Var.c(o3);
        }
    }

    @Override // g2.h
    public final g2.h g(g2.g gVar) {
        return AbstractC0086a.H(this, gVar);
    }

    @Override // g2.InterfaceC0322f
    public final g2.g getKey() {
        return m0.f884a;
    }

    @Override // g2.h
    public final g2.h h(g2.h context) {
        kotlin.jvm.internal.j.e(context, "context");
        return context == g2.i.f4981a ? this : (g2.h) context.i(this, new com.startapp.sdk.components.c(2));
    }

    @Override // g2.h
    public final Object i(Object obj, o2.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // g2.h
    public final InterfaceC0322f k(g2.g gVar) {
        return AbstractC0086a.w(this, gVar);
    }
}
