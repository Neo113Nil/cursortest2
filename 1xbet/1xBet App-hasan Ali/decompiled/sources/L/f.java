package L;

import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.InterfaceC0289e0;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import n.AbstractC2107A;
import v.T;
import v.U;
import y.C2654j;

/* loaded from: classes.dex */
public final class f implements T {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2929a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2930b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0289e0 f2931c;

    public f(boolean z3, float f, InterfaceC0289e0 interfaceC0289e0) {
        this.f2929a = z3;
        this.f2930b = f;
        this.f2931c = interfaceC0289e0;
    }

    @Override // v.T
    public final U a(C2654j c2654j, C0315s c0315s) {
        long b3;
        c0315s.X(988743187);
        x xVar = (x) c0315s.j(z.f2993a);
        InterfaceC0289e0 interfaceC0289e0 = this.f2931c;
        if (((i0.p) interfaceC0289e0.getValue()).f17295a != i0.p.f17293g) {
            c0315s.X(-303571590);
            c0315s.q(false);
            b3 = ((i0.p) interfaceC0289e0.getValue()).f17295a;
        } else {
            c0315s.X(-303521246);
            b3 = xVar.b(c0315s);
            c0315s.q(false);
        }
        InterfaceC0289e0 w5 = AbstractC0329z.w(new i0.p(b3), c0315s);
        InterfaceC0289e0 w6 = AbstractC0329z.w(xVar.a(c0315s), c0315s);
        c0315s.X(331259447);
        ViewGroup b5 = A.b((View) c0315s.j(AndroidCompositionLocals_androidKt.f));
        boolean f = c0315s.f(c2654j) | c0315s.f(this) | c0315s.f(b5);
        Object M5 = c0315s.M();
        Object obj = C0302l.f4480a;
        if (f || M5 == obj) {
            Object c0213a = new C0213a(this.f2929a, this.f2930b, w5, w6, b5);
            c0315s.i0(c0213a);
            M5 = c0213a;
        }
        C0213a c0213a2 = (C0213a) M5;
        c0315s.q(false);
        boolean f5 = c0315s.f(c2654j) | c0315s.h(c0213a2);
        Object M6 = c0315s.M();
        if (f5 || M6 == obj) {
            M6 = new g(c2654j, c0213a2, null);
            c0315s.i0(M6);
        }
        AbstractC0329z.f(c0213a2, c2654j, (i4.e) M6, c0315s);
        c0315s.q(false);
        return c0213a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f2929a == fVar.f2929a && W0.f.a(this.f2930b, fVar.f2930b) && this.f2931c.equals(fVar.f2931c);
    }

    public final int hashCode() {
        return this.f2931c.hashCode() + AbstractC2107A.n(this.f2930b, (this.f2929a ? 1231 : 1237) * 31, 31);
    }
}
