package androidx.compose.ui.draw;

import b0.o;
import f0.f;
import i4.c;
import z0.Z;

/* loaded from: classes.dex */
final class DrawWithContentElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final c f6907k;

    public DrawWithContentElement(c cVar) {
        this.f6907k = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawWithContentElement) {
            return this.f6907k == ((DrawWithContentElement) obj).f6907k;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6907k.hashCode();
    }

    @Override // z0.Z
    public final o i() {
        f fVar = new f();
        fVar.f16926y = this.f6907k;
        return fVar;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        ((f) oVar).f16926y = this.f6907k;
    }
}
