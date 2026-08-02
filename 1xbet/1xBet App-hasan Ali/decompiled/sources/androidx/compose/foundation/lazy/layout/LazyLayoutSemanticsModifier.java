package androidx.compose.foundation.lazy.layout;

import A.C0004d;
import B.F;
import b0.o;
import kotlin.jvm.internal.l;
import m4.InterfaceC2104g;
import x.P;
import z0.AbstractC2749f;
import z0.Z;

/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2104g f6873k;

    /* renamed from: l, reason: collision with root package name */
    public final C0004d f6874l;

    /* renamed from: m, reason: collision with root package name */
    public final P f6875m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f6876n;

    public LazyLayoutSemanticsModifier(InterfaceC2104g interfaceC2104g, C0004d c0004d, P p5, boolean z3) {
        this.f6873k = interfaceC2104g;
        this.f6874l = c0004d;
        this.f6875m = p5;
        this.f6876n = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f6873k == lazyLayoutSemanticsModifier.f6873k && l.a(this.f6874l, lazyLayoutSemanticsModifier.f6874l) && this.f6875m == lazyLayoutSemanticsModifier.f6875m && this.f6876n == lazyLayoutSemanticsModifier.f6876n;
    }

    public final int hashCode() {
        return ((((this.f6875m.hashCode() + ((this.f6874l.hashCode() + (this.f6873k.hashCode() * 31)) * 31)) * 31) + (this.f6876n ? 1231 : 1237)) * 31) + 1237;
    }

    @Override // z0.Z
    public final o i() {
        P p5 = this.f6875m;
        return new F(this.f6873k, this.f6874l, p5, this.f6876n);
    }

    @Override // z0.Z
    public final void k(o oVar) {
        F f = (F) oVar;
        f.f623y = this.f6873k;
        f.f624z = this.f6874l;
        P p5 = f.f618A;
        P p6 = this.f6875m;
        if (p5 != p6) {
            f.f618A = p6;
            AbstractC2749f.o(f);
        }
        boolean z3 = f.f619B;
        boolean z5 = this.f6876n;
        if (z3 == z5) {
            return;
        }
        f.f619B = z5;
        f.y0();
        AbstractC2749f.o(f);
    }
}
