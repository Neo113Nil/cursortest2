package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class K implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f9579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9580c;

    public K(String str, J j) {
        this.f9578a = str;
        this.f9579b = j;
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0724t interfaceC0724t, EnumC0718m enumC0718m) {
        if (enumC0718m == EnumC0718m.ON_DESTROY) {
            this.f9580c = false;
            interfaceC0724t.getLifecycle().b(this);
        }
    }

    public final void b(G0.f fVar, AbstractC0720o abstractC0720o) {
        t6.h.e(fVar, "registry");
        t6.h.e(abstractC0720o, "lifecycle");
        if (this.f9580c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f9580c = true;
        abstractC0720o.a(this);
        fVar.c(this.f9578a, this.f9579b.f9577e);
    }
}
