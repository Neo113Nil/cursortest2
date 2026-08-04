package p010b0;

import kotlin.jvm.functions.Function2;
import p003a.a;
import p065i6.g;
import p065i6.i;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f10072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f10073b;

    public l0(l0 l0Var, O o7) {
        h.e(o7, "instance");
        this.f10072a = l0Var;
        this.f10073b = o7;
    }

    public final void a(O o7) {
        if (this.f10073b == o7) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        l0 l0Var = this.f10072a;
        if (l0Var != null) {
            l0Var.a(o7);
        }
    }

    @Override // p065i6.i
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // p065i6.i
    public final g get(p065i6.h hVar) {
        return a.W(this, hVar);
    }

    @Override // p065i6.g
    public final p065i6.h getKey() {
        return k0.f10067a;
    }

    @Override // p065i6.i
    public final i minusKey(p065i6.h hVar) {
        return a.e0(this, hVar);
    }

    @Override // p065i6.i
    public final i plus(i iVar) {
        return a.m0(this, iVar);
    }
}
