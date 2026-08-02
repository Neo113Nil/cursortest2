package androidx.compose.ui.layout;

import b0.o;
import x0.d0;
import x0.r;
import z0.AbstractC2749f;
import z0.C2731G;
import z0.Z;

/* loaded from: classes.dex */
final class RulerProviderModifierElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final r f6937k;

    public RulerProviderModifierElement(r rVar) {
        this.f6937k = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        RulerProviderModifierElement rulerProviderModifierElement = obj instanceof RulerProviderModifierElement ? (RulerProviderModifierElement) obj : null;
        return (rulerProviderModifierElement != null ? rulerProviderModifierElement.f6937k : null) == this.f6937k;
    }

    public final int hashCode() {
        return this.f6937k.hashCode();
    }

    @Override // z0.Z
    public final o i() {
        return new d0(this.f6937k);
    }

    @Override // z0.Z
    public final void k(o oVar) {
        d0 d0Var = (d0) oVar;
        r rVar = d0Var.f20988y;
        r rVar2 = this.f6937k;
        if (rVar != rVar2) {
            d0Var.f20988y = rVar2;
            C2731G.W(AbstractC2749f.v(d0Var), false, 7);
        }
    }
}
