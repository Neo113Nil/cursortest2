package androidx.compose.foundation;

import b0.o;
import f0.C1938b;
import i0.J;
import i0.M;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;
import v.C2525u;
import z0.Z;

/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final float f6807k;

    /* renamed from: l, reason: collision with root package name */
    public final M f6808l;

    /* renamed from: m, reason: collision with root package name */
    public final J f6809m;

    public BorderModifierNodeElement(float f, M m5, J j5) {
        this.f6807k = f;
        this.f6808l = m5;
        this.f6809m = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return W0.f.a(this.f6807k, borderModifierNodeElement.f6807k) && this.f6808l.equals(borderModifierNodeElement.f6808l) && l.a(this.f6809m, borderModifierNodeElement.f6809m);
    }

    public final int hashCode() {
        return this.f6809m.hashCode() + AbstractC2107A.o(Float.floatToIntBits(this.f6807k) * 31, 31, this.f6808l.f17262e);
    }

    @Override // z0.Z
    public final o i() {
        return new C2525u(this.f6807k, this.f6808l, this.f6809m);
    }

    @Override // z0.Z
    public final void k(o oVar) {
        C2525u c2525u = (C2525u) oVar;
        float f = c2525u.f20314B;
        float f5 = this.f6807k;
        boolean a5 = W0.f.a(f, f5);
        C1938b c1938b = c2525u.f20317E;
        if (!a5) {
            c2525u.f20314B = f5;
            c1938b.y0();
        }
        M m5 = c2525u.f20315C;
        M m6 = this.f6808l;
        if (!l.a(m5, m6)) {
            c2525u.f20315C = m6;
            c1938b.y0();
        }
        J j5 = c2525u.f20316D;
        J j6 = this.f6809m;
        if (l.a(j5, j6)) {
            return;
        }
        c2525u.f20316D = j6;
        c1938b.y0();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) W0.f.b(this.f6807k)) + ", brush=" + this.f6808l + ", shape=" + this.f6809m + ')';
    }
}
