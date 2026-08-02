package androidx.compose.ui.focus;

import b0.o;
import g0.C1958c;
import i4.c;
import z0.Z;

/* loaded from: classes.dex */
final class FocusChangedElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final c f6914k;

    public FocusChangedElement(c cVar) {
        this.f6914k = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusChangedElement) {
            return this.f6914k == ((FocusChangedElement) obj).f6914k;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6914k.hashCode();
    }

    @Override // z0.Z
    public final o i() {
        C1958c c1958c = new C1958c();
        c1958c.f17019y = this.f6914k;
        return c1958c;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        ((C1958c) oVar).f17019y = this.f6914k;
    }
}
