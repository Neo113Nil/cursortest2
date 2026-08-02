package androidx.lifecycle;

import A0.N0;

/* loaded from: classes.dex */
public final class K implements InterfaceC0489s, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final String f7016k;

    /* renamed from: l, reason: collision with root package name */
    public final J f7017l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7018m;

    public K(String str, J j5) {
        this.f7016k = str;
        this.f7017l = j5;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.lifecycle.InterfaceC0489s
    public final void h(InterfaceC0491u interfaceC0491u, EnumC0486o enumC0486o) {
        if (enumC0486o == EnumC0486o.ON_DESTROY) {
            this.f7018m = false;
            interfaceC0491u.g().k(this);
        }
    }

    public final void m(L l5, v3.g gVar) {
        kotlin.jvm.internal.l.f("registry", gVar);
        kotlin.jvm.internal.l.f("lifecycle", l5);
        if (this.f7018m) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f7018m = true;
        l5.a(this);
        gVar.C(this.f7016k, (N0) this.f7017l.f7015b.f5046p);
    }
}
