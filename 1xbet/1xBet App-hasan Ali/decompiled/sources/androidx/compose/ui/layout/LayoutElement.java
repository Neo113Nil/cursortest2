package androidx.compose.ui.layout;

import b0.o;
import i4.f;
import x0.C2612A;
import z0.Z;

/* loaded from: classes.dex */
final class LayoutElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final f f6933k;

    public LayoutElement(f fVar) {
        this.f6933k = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutElement) {
            return this.f6933k == ((LayoutElement) obj).f6933k;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6933k.hashCode();
    }

    @Override // z0.Z
    public final o i() {
        C2612A c2612a = new C2612A();
        c2612a.f20910y = this.f6933k;
        return c2612a;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        ((C2612A) oVar).f20910y = this.f6933k;
    }
}
