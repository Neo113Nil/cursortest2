package androidx.compose.foundation.layout;

import b0.o;
import u.AbstractC2462i;
import z.C2720v;
import z0.Z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FillElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final int f6845k;

    /* renamed from: l, reason: collision with root package name */
    public final float f6846l;

    public FillElement(int i, float f) {
        this.f6845k = i;
        this.f6846l = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f6845k == fillElement.f6845k && this.f6846l == fillElement.f6846l;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6846l) + (AbstractC2462i.b(this.f6845k) * 31);
    }

    @Override // z0.Z
    public final o i() {
        C2720v c2720v = new C2720v();
        c2720v.f21572y = this.f6845k;
        c2720v.f21573z = this.f6846l;
        return c2720v;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        C2720v c2720v = (C2720v) oVar;
        c2720v.f21572y = this.f6845k;
        c2720v.f21573z = this.f6846l;
    }
}
