package androidx.compose.foundation.layout;

import W0.f;
import b0.o;
import z.C2679C;
import z0.Z;

/* loaded from: classes.dex */
final class OffsetElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final float f6848k;

    /* renamed from: l, reason: collision with root package name */
    public final float f6849l;

    public OffsetElement(float f, float f5) {
        this.f6848k = f;
        this.f6849l = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && f.a(this.f6848k, offsetElement.f6848k) && f.a(this.f6849l, offsetElement.f6849l);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f6849l) + (Float.floatToIntBits(this.f6848k) * 31)) * 31) + 1231;
    }

    @Override // z0.Z
    public final o i() {
        C2679C c2679c = new C2679C();
        c2679c.f21467y = this.f6848k;
        c2679c.f21468z = this.f6849l;
        c2679c.f21466A = true;
        return c2679c;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        C2679C c2679c = (C2679C) oVar;
        c2679c.f21467y = this.f6848k;
        c2679c.f21468z = this.f6849l;
        c2679c.f21466A = true;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) f.b(this.f6848k)) + ", y=" + ((Object) f.b(this.f6849l)) + ", rtlAware=true)";
    }
}
