package M;

import P.C0315s;
import n.AbstractC2107A;
import y.C2654j;
import z0.InterfaceC2755l;

/* loaded from: classes.dex */
public final class i0 implements v.Y {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3355a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3356b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3357c;

    public i0(boolean z3, float f, long j5) {
        this.f3355a = z3;
        this.f3356b = f;
        this.f3357c = j5;
    }

    @Override // v.T
    public final v.U a(C2654j c2654j, C0315s c0315s) {
        c0315s.X(1257603829);
        c0315s.q(false);
        return v.h0.f20247k;
    }

    @Override // v.Y
    public final InterfaceC2755l b(C2654j c2654j) {
        C0254z c0254z = new C0254z(1, this);
        return new B(c2654j, this.f3355a, this.f3356b, c0254z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (this.f3355a == i0Var.f3355a && W0.f.a(this.f3356b, i0Var.f3356b)) {
            return i0.p.c(this.f3357c, i0Var.f3357c);
        }
        return false;
    }

    public final int hashCode() {
        return i0.p.i(this.f3357c) + AbstractC2107A.n(this.f3356b, (this.f3355a ? 1231 : 1237) * 31, 961);
    }
}
