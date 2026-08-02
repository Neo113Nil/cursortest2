package androidx.compose.ui.layout;

import b0.o;
import x0.C2638y;
import z0.Z;

/* loaded from: classes.dex */
final class LayoutIdElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final String f6934k;

    public LayoutIdElement(String str) {
        this.f6934k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && this.f6934k.equals(((LayoutIdElement) obj).f6934k);
    }

    public final int hashCode() {
        return this.f6934k.hashCode();
    }

    @Override // z0.Z
    public final o i() {
        C2638y c2638y = new C2638y();
        c2638y.f21066y = this.f6934k;
        return c2638y;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        ((C2638y) oVar).f21066y = this.f6934k;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.f6934k) + ')';
    }
}
