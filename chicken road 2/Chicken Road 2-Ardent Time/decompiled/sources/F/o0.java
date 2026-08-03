package F;

/* loaded from: classes.dex */
public final class o0 implements k1.g {

    /* renamed from: a, reason: collision with root package name */
    public final F.o0 f505a;

    /* renamed from: b, reason: collision with root package name */
    public final F.P f506b;

    public o0(F.o0 o0Var, F.P instance) {
        kotlin.jvm.internal.i.e(instance, "instance");
        this.f505a = o0Var;
        this.f506b = instance;
    }

    public final void c(F.P p2) {
        if (this.f506b == p2) {
            throw new java.lang.IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        F.o0 o0Var = this.f505a;
        if (o0Var != null) {
            o0Var.c(p2);
        }
    }

    @Override // k1.i
    public final k1.i g(k1.i context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == k1.j.f7951a ? this : (k1.i) context.k(this, new k1.C0922b(1));
    }

    @Override // k1.g
    public final k1.h getKey() {
        return F.n0.f502a;
    }

    @Override // k1.i
    public final k1.i j(k1.h hVar) {
        return a.AbstractC0059a.t(this, hVar);
    }

    @Override // k1.i
    public final java.lang.Object k(java.lang.Object obj, s1.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // k1.i
    public final k1.g m(k1.h hVar) {
        return a.AbstractC0059a.p(this, hVar);
    }
}
