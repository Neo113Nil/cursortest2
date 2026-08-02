package androidx.compose.foundation.layout;

import b0.o;
import z.C2678B;
import z0.Z;

/* loaded from: classes.dex */
public final class LayoutWeightElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final float f6847k;

    public LayoutWeightElement(float f) {
        this.f6847k = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f6847k == layoutWeightElement.f6847k;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f6847k) * 31) + 1231;
    }

    @Override // z0.Z
    public final o i() {
        C2678B c2678b = new C2678B();
        c2678b.f21464y = this.f6847k;
        c2678b.f21465z = true;
        return c2678b;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        C2678B c2678b = (C2678B) oVar;
        c2678b.f21464y = this.f6847k;
        c2678b.f21465z = true;
    }
}
