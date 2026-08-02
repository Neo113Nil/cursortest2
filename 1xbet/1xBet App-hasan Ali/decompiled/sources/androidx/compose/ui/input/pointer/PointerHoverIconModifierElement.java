package androidx.compose.ui.input.pointer;

import E.W;
import b0.o;
import kotlin.jvm.internal.l;
import t0.C2404a;
import t0.m;
import z0.Z;

/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends Z {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        ((PointerHoverIconModifierElement) obj).getClass();
        C2404a c2404a = W.f1084b;
        return c2404a.equals(c2404a);
    }

    public final int hashCode() {
        return (1008 * 31) + 1237;
    }

    @Override // z0.Z
    public final o i() {
        C2404a c2404a = W.f1084b;
        m mVar = new m();
        mVar.f19493y = c2404a;
        return mVar;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        m mVar = (m) oVar;
        C2404a c2404a = mVar.f19493y;
        C2404a c2404a2 = W.f1084b;
        if (l.a(c2404a, c2404a2)) {
            return;
        }
        mVar.f19493y = c2404a2;
        if (mVar.f19494z) {
            mVar.A0();
        }
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + W.f1084b + ", overrideDescendants=false)";
    }
}
