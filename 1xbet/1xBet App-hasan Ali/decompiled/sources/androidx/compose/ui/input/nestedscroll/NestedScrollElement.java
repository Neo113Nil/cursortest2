package androidx.compose.ui.input.nestedscroll;

import A0.C0040k0;
import Z0.k;
import b0.o;
import s0.C2355d;
import s0.C2358g;
import z0.Z;

/* loaded from: classes.dex */
final class NestedScrollElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final C2355d f6929k;

    public NestedScrollElement(C2355d c2355d) {
        this.f6929k = c2355d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        nestedScrollElement.getClass();
        Object obj2 = k.f6310a;
        return obj2.equals(obj2) && nestedScrollElement.f6929k.equals(this.f6929k);
    }

    public final int hashCode() {
        return this.f6929k.hashCode() + (k.f6310a.hashCode() * 31);
    }

    @Override // z0.Z
    public final o i() {
        return new C2358g(k.f6310a, this.f6929k);
    }

    @Override // z0.Z
    public final void k(o oVar) {
        C2358g c2358g = (C2358g) oVar;
        c2358g.f19173y = k.f6310a;
        C2355d c2355d = c2358g.f19174z;
        if (c2355d.f19158a == c2358g) {
            c2355d.f19158a = null;
        }
        C2355d c2355d2 = this.f6929k;
        if (!c2355d2.equals(c2355d)) {
            c2358g.f19174z = c2355d2;
        }
        if (c2358g.f7175x) {
            C2355d c2355d3 = c2358g.f19174z;
            c2355d3.f19158a = c2358g;
            c2355d3.f19159b = null;
            c2358g.f19171A = null;
            c2355d3.f19160c = new C0040k0(24, c2358g);
            c2355d3.f19161d = c2358g.k0();
        }
    }
}
