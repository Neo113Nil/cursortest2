package androidx.lifecycle;

/* loaded from: classes.dex */
public final class K implements r {

    /* renamed from: a, reason: collision with root package name */
    public final String f9578a;

    /* renamed from: b, reason: collision with root package name */
    public final J f9579b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9580c;

    public K(String str, J j) {
        this.f9578a = str;
        this.f9579b = j;
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0745t interfaceC0745t, EnumC0739m enumC0739m) {
        if (enumC0739m == EnumC0739m.ON_DESTROY) {
            this.f9580c = false;
            interfaceC0745t.getLifecycle().b(this);
        }
    }

    public final void b(G0.f fVar, AbstractC0741o abstractC0741o) {
        t6.h.e(fVar, "registry");
        t6.h.e(abstractC0741o, "lifecycle");
        if (this.f9580c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f9580c = true;
        abstractC0741o.a(this);
        fVar.c(this.f9578a, this.f9579b.f9577e);
    }
}
