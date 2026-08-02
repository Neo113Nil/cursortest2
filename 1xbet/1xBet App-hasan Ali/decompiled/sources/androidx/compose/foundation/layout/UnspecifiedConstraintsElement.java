package androidx.compose.foundation.layout;

import W0.f;
import b0.o;
import z.C2690N;
import z0.Z;

/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final float f6860k;

    /* renamed from: l, reason: collision with root package name */
    public final float f6861l;

    public UnspecifiedConstraintsElement(float f, float f5) {
        this.f6860k = f;
        this.f6861l = f5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return f.a(this.f6860k, unspecifiedConstraintsElement.f6860k) && f.a(this.f6861l, unspecifiedConstraintsElement.f6861l);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6861l) + (Float.floatToIntBits(this.f6860k) * 31);
    }

    @Override // z0.Z
    public final o i() {
        C2690N c2690n = new C2690N();
        c2690n.f21492y = this.f6860k;
        c2690n.f21493z = this.f6861l;
        return c2690n;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        C2690N c2690n = (C2690N) oVar;
        c2690n.f21492y = this.f6860k;
        c2690n.f21493z = this.f6861l;
    }
}
