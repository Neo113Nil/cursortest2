package androidx.compose.foundation;

import A.B;
import H0.v;
import I.U;
import android.view.View;
import b0.o;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;
import v.b0;
import v.c0;
import v.m0;
import z0.AbstractC2749f;
import z0.Z;

/* loaded from: classes.dex */
public final class MagnifierElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final B f6819k;

    /* renamed from: l, reason: collision with root package name */
    public final U f6820l;

    /* renamed from: m, reason: collision with root package name */
    public final m0 f6821m;

    public MagnifierElement(B b3, U u5, m0 m0Var) {
        this.f6819k = b3;
        this.f6820l = u5;
        this.f6821m = m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        B b3 = ((MagnifierElement) obj).f6819k;
        return false;
    }

    public final int hashCode() {
        int i = (int) 9205357638345293824L;
        return this.f6821m.hashCode() + ((this.f6820l.hashCode() + ((((Float.floatToIntBits(Float.NaN) + AbstractC2107A.n(Float.NaN, (i + ((((Float.floatToIntBits(Float.NaN) + (this.f6819k.hashCode() * 961)) * 31) + 1231) * 31)) * 31, 31)) * 31) + 1231) * 31)) * 31);
    }

    @Override // z0.Z
    public final o i() {
        return new b0(this.f6819k, this.f6820l, this.f6821m);
    }

    @Override // z0.Z
    public final void k(o oVar) {
        b0 b0Var = (b0) oVar;
        b0Var.getClass();
        m0 m0Var = b0Var.f20198A;
        View view = b0Var.f20199B;
        W0.c cVar = b0Var.f20200C;
        b0Var.f20207y = this.f6819k;
        b0Var.f20208z = this.f6820l;
        m0 m0Var2 = this.f6821m;
        b0Var.f20198A = m0Var2;
        View x5 = AbstractC2749f.x(b0Var);
        W0.c cVar2 = AbstractC2749f.v(b0Var).f21607H;
        if (b0Var.f20201D != null) {
            v vVar = c0.f20214a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !m0Var2.a()) || !W0.f.a(Float.NaN, Float.NaN) || !W0.f.a(Float.NaN, Float.NaN) || !m0Var2.equals(m0Var) || !x5.equals(view) || !l.a(cVar2, cVar)) {
                b0Var.z0();
            }
        }
        b0Var.A0();
    }
}
