package androidx.compose.ui.input.rotary;

import A0.C0056s;
import b0.o;
import v0.C2531a;
import z0.Z;

/* loaded from: classes.dex */
final class RotaryInputElement extends Z {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        ((RotaryInputElement) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return C0056s.f569o.hashCode() * 31;
    }

    @Override // z0.Z
    public final o i() {
        C2531a c2531a = new C2531a();
        c2531a.f20335y = C0056s.f569o;
        return c2531a;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        ((C2531a) oVar).f20335y = C0056s.f569o;
    }
}
