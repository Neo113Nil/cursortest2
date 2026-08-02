package androidx.compose.foundation.layout;

import W0.f;
import b0.o;
import n.AbstractC2107A;
import z.C2688L;
import z0.Z;

/* loaded from: classes.dex */
final class SizeElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final float f6855k;

    /* renamed from: l, reason: collision with root package name */
    public final float f6856l;

    /* renamed from: m, reason: collision with root package name */
    public final float f6857m;

    /* renamed from: n, reason: collision with root package name */
    public final float f6858n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f6859o;

    public SizeElement(float f, float f5, float f6, float f7, boolean z3) {
        this.f6855k = f;
        this.f6856l = f5;
        this.f6857m = f6;
        this.f6858n = f7;
        this.f6859o = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return f.a(this.f6855k, sizeElement.f6855k) && f.a(this.f6856l, sizeElement.f6856l) && f.a(this.f6857m, sizeElement.f6857m) && f.a(this.f6858n, sizeElement.f6858n) && this.f6859o == sizeElement.f6859o;
    }

    public final int hashCode() {
        return AbstractC2107A.n(this.f6858n, AbstractC2107A.n(this.f6857m, AbstractC2107A.n(this.f6856l, Float.floatToIntBits(this.f6855k) * 31, 31), 31), 31) + (this.f6859o ? 1231 : 1237);
    }

    @Override // z0.Z
    public final o i() {
        C2688L c2688l = new C2688L();
        c2688l.f21488y = this.f6855k;
        c2688l.f21489z = this.f6856l;
        c2688l.f21485A = this.f6857m;
        c2688l.f21486B = this.f6858n;
        c2688l.f21487C = this.f6859o;
        return c2688l;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        C2688L c2688l = (C2688L) oVar;
        c2688l.f21488y = this.f6855k;
        c2688l.f21489z = this.f6856l;
        c2688l.f21485A = this.f6857m;
        c2688l.f21486B = this.f6858n;
        c2688l.f21487C = this.f6859o;
    }

    public /* synthetic */ SizeElement(float f, float f5, float f6, float f7, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f5, (i & 4) != 0 ? Float.NaN : f6, (i & 8) != 0 ? Float.NaN : f7, true);
    }
}
