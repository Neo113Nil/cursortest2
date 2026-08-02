package androidx.compose.ui.draw;

import b0.o;
import f0.d;
import i4.c;
import z0.Z;

/* loaded from: classes.dex */
final class DrawBehindElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final c f6905k;

    public DrawBehindElement(c cVar) {
        this.f6905k = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawBehindElement) {
            return this.f6905k == ((DrawBehindElement) obj).f6905k;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6905k.hashCode();
    }

    @Override // z0.Z
    public final o i() {
        d dVar = new d();
        dVar.f16925y = this.f6905k;
        return dVar;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        ((d) oVar).f16925y = this.f6905k;
    }
}
