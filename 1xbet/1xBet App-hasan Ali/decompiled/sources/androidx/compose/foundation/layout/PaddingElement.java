package androidx.compose.foundation.layout;

import W0.f;
import b0.o;
import n.AbstractC2107A;
import z.C2680D;
import z0.Z;

/* loaded from: classes.dex */
final class PaddingElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final float f6850k;

    /* renamed from: l, reason: collision with root package name */
    public final float f6851l;

    /* renamed from: m, reason: collision with root package name */
    public final float f6852m;

    /* renamed from: n, reason: collision with root package name */
    public final float f6853n;

    public PaddingElement(float f, float f5, float f6, float f7) {
        this.f6850k = f;
        this.f6851l = f5;
        this.f6852m = f6;
        this.f6853n = f7;
        if ((f < 0.0f && !f.a(f, Float.NaN)) || ((f5 < 0.0f && !f.a(f5, Float.NaN)) || ((f6 < 0.0f && !f.a(f6, Float.NaN)) || (f7 < 0.0f && !f.a(f7, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && f.a(this.f6850k, paddingElement.f6850k) && f.a(this.f6851l, paddingElement.f6851l) && f.a(this.f6852m, paddingElement.f6852m) && f.a(this.f6853n, paddingElement.f6853n);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f6853n) + AbstractC2107A.n(this.f6852m, AbstractC2107A.n(this.f6851l, Float.floatToIntBits(this.f6850k) * 31, 31), 31)) * 31) + 1231;
    }

    @Override // z0.Z
    public final o i() {
        C2680D c2680d = new C2680D();
        c2680d.f21472y = this.f6850k;
        c2680d.f21473z = this.f6851l;
        c2680d.f21469A = this.f6852m;
        c2680d.f21470B = this.f6853n;
        c2680d.f21471C = true;
        return c2680d;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        C2680D c2680d = (C2680D) oVar;
        c2680d.f21472y = this.f6850k;
        c2680d.f21473z = this.f6851l;
        c2680d.f21469A = this.f6852m;
        c2680d.f21470B = this.f6853n;
        c2680d.f21471C = true;
    }
}
