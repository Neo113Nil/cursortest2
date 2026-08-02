package n0;

import B3.g;
import a.AbstractC0603a;
import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.lifecycle.InterfaceC0745t;
import e3.C1018c;
import o0.RunnableC1487a;

/* loaded from: classes.dex */
public final class b extends B {

    /* renamed from: l, reason: collision with root package name */
    public final C1018c f15287l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0745t f15288m;

    /* renamed from: n, reason: collision with root package name */
    public g f15289n;

    public b(C1018c c1018c) {
        this.f15287l = c1018c;
        if (c1018c.f12652a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        c1018c.f12652a = this;
    }

    @Override // androidx.lifecycle.B
    public final void e() {
        C1018c c1018c = this.f15287l;
        c1018c.f12653b = true;
        c1018c.f12655d = false;
        c1018c.f12654c = false;
        c1018c.f12660i.drainPermits();
        c1018c.a();
        c1018c.f12658g = new RunnableC1487a(c1018c);
        c1018c.b();
    }

    @Override // androidx.lifecycle.B
    public final void f() {
        this.f15287l.f12653b = false;
    }

    @Override // androidx.lifecycle.B
    public final void h(C c3) {
        super.h(c3);
        this.f15288m = null;
        this.f15289n = null;
    }

    public final void j() {
        InterfaceC0745t interfaceC0745t = this.f15288m;
        g gVar = this.f15289n;
        if (interfaceC0745t == null || gVar == null) {
            return;
        }
        super.h(gVar);
        d(interfaceC0745t, gVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        AbstractC0603a.d(sb, this.f15287l);
        sb.append("}}");
        return sb.toString();
    }
}
