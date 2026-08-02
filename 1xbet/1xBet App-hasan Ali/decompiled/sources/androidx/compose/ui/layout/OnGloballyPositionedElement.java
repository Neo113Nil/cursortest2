package androidx.compose.ui.layout;

import b0.o;
import i4.c;
import x0.V;
import z0.Z;

/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final c f6935k;

    public OnGloballyPositionedElement(c cVar) {
        this.f6935k = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f6935k == ((OnGloballyPositionedElement) obj).f6935k;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6935k.hashCode();
    }

    @Override // z0.Z
    public final o i() {
        V v4 = new V();
        v4.f20968y = this.f6935k;
        return v4;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        ((V) oVar).f20968y = this.f6935k;
    }
}
