package D1;

import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7795M;
import l1.C7809a0;
import l1.InterfaceC7802U;
import l1.InterfaceC7829k0;
import n1.AbstractC8413f;
import n1.C8408a;
import n1.C8416i;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class J implements InterfaceC8412e, InterfaceC8410c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8408a f5279a = new C8408a();

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC2819t f5280b;

    @Override // n1.InterfaceC8412e
    public final long A0() {
        return this.f5279a.A0();
    }

    @Override // Z1.d
    public final float B(int i11) {
        return this.f5279a.B(i11);
    }

    @Override // Z1.d
    public final float C(float f7) {
        return f7 / this.f5279a.g();
    }

    @Override // n1.InterfaceC8412e
    public final void C0(long j11, long j12, long j13, float f7, @NotNull AbstractC8413f abstractC8413f, C7809a0 c7809a0, int i11) {
        this.f5279a.C0(j11, j12, j13, f7, abstractC8413f, c7809a0, i11);
    }

    @Override // Z1.d
    public final long D0(long j11) {
        return this.f5279a.D0(j11);
    }

    @Override // n1.InterfaceC8412e
    public final void E1(long j11, float f7, float f11, long j12, long j13, @NotNull AbstractC8413f abstractC8413f) {
        this.f5279a.E1(j11, f7, f11, j12, j13, abstractC8413f);
    }

    @Override // Z1.k
    public final long F(float f7) {
        return this.f5279a.F(f7);
    }

    @Override // n1.InterfaceC8410c
    public final void F0() {
        C8408a c8408a = this.f5279a;
        InterfaceC7802U a11 = c8408a.w0().a();
        InterfaceC2819t interfaceC2819t = this.f5280b;
        Intrinsics.f(interfaceC2819t);
        e.c child$ui_release = interfaceC2819t.getNode().getChild$ui_release();
        if (child$ui_release != null && (child$ui_release.getAggregateChildKindSet$ui_release() & 4) != 0) {
            while (child$ui_release != null && (child$ui_release.getKindSet$ui_release() & 2) == 0) {
                if ((child$ui_release.getKindSet$ui_release() & 4) != 0) {
                    break;
                } else {
                    child$ui_release = child$ui_release.getChild$ui_release();
                }
            }
        }
        child$ui_release = null;
        if (child$ui_release == null) {
            AbstractC2810k0 d11 = C2809k.d(interfaceC2819t, 4);
            if (d11.e2() == interfaceC2819t.getNode()) {
                d11 = d11.f2();
                Intrinsics.f(d11);
            }
            d11.v2(a11, c8408a.w0().c());
            return;
        }
        U0.b bVar = null;
        while (child$ui_release != null) {
            if (child$ui_release instanceof InterfaceC2819t) {
                InterfaceC2819t interfaceC2819t2 = (InterfaceC2819t) child$ui_release;
                o1.d c11 = c8408a.w0().c();
                AbstractC2810k0 d12 = C2809k.d(interfaceC2819t2, 4);
                long b11 = Z1.r.b(d12.a());
                H B02 = d12.B0();
                B02.getClass();
                ((AndroidComposeView) K.b(B02)).getF40539c().m(a11, b11, d12, interfaceC2819t2, c11);
            } else if ((child$ui_release.getKindSet$ui_release() & 4) != 0 && (child$ui_release instanceof AbstractC2813m)) {
                int i11 = 0;
                for (e.c J12 = ((AbstractC2813m) child$ui_release).J1(); J12 != null; J12 = J12.getChild$ui_release()) {
                    if ((J12.getKindSet$ui_release() & 4) != 0) {
                        i11++;
                        if (i11 == 1) {
                            child$ui_release = J12;
                        } else {
                            if (bVar == null) {
                                bVar = new U0.b(new e.c[16]);
                            }
                            if (child$ui_release != null) {
                                bVar.b(child$ui_release);
                                child$ui_release = null;
                            }
                            bVar.b(J12);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            child$ui_release = C2809k.b(bVar);
        }
    }

    @Override // n1.InterfaceC8412e
    public final void H0(long j11, long j12, long j13, long j14, @NotNull AbstractC8413f abstractC8413f) {
        this.f5279a.H0(j11, j12, j13, j14, abstractC8413f);
    }

    @Override // n1.InterfaceC8412e
    public final void H1(@NotNull AbstractC7799Q abstractC7799Q, long j11, long j12, long j13, float f7, @NotNull AbstractC8413f abstractC8413f) {
        this.f5279a.H1(abstractC7799Q, j11, j12, j13, f7, abstractC8413f);
    }

    @Override // n1.InterfaceC8412e
    public final void R(long j11, float f7, long j12, @NotNull AbstractC8413f abstractC8413f, int i11) {
        this.f5279a.R(j11, f7, j12, abstractC8413f, i11);
    }

    @Override // n1.InterfaceC8412e
    public final void S0(@NotNull l1.s0 s0Var, @NotNull AbstractC7799Q abstractC7799Q, float f7, @NotNull AbstractC8413f abstractC8413f, int i11) {
        this.f5279a.S0(s0Var, abstractC7799Q, f7, abstractC8413f, i11);
    }

    @Override // n1.InterfaceC8412e
    public final void T0(@NotNull l1.s0 s0Var, long j11, @NotNull AbstractC8413f abstractC8413f, int i11) {
        this.f5279a.T0(s0Var, j11, abstractC8413f, i11);
    }

    @Override // n1.InterfaceC8412e
    public final void U(long j11, long j12, long j13, float f7, int i11, l1.t0 t0Var) {
        this.f5279a.U(j11, j12, j13, f7, i11, t0Var);
    }

    @Override // n1.InterfaceC8412e
    public final void V0(@NotNull AbstractC7799Q abstractC7799Q, long j11, long j12, float f7, @NotNull AbstractC8413f abstractC8413f, int i11) {
        this.f5279a.V0(abstractC7799Q, j11, j12, f7, abstractC8413f, i11);
    }

    @Override // Z1.d
    public final int Y0(float f7) {
        return this.f5279a.Y0(f7);
    }

    @Override // Z1.d
    public final float Z0(long j11) {
        return this.f5279a.Z0(j11);
    }

    @Override // n1.InterfaceC8412e
    public final void d0(@NotNull AbstractC7799Q abstractC7799Q, float f7, long j11, @NotNull C8416i c8416i) {
        this.f5279a.d0(abstractC7799Q, f7, j11, c8416i);
    }

    @Override // Z1.d
    public final float g() {
        return this.f5279a.g();
    }

    @Override // n1.InterfaceC8412e
    @NotNull
    public final Z1.s getLayoutDirection() {
        return this.f5279a.getLayoutDirection();
    }

    @Override // n1.InterfaceC8412e
    public final void h0(@NotNull AbstractC7799Q abstractC7799Q, long j11, long j12, float f7, float f11) {
        this.f5279a.h0(abstractC7799Q, j11, j12, f7, f11);
    }

    @Override // n1.InterfaceC8412e
    public final long i() {
        return this.f5279a.i();
    }

    @Override // n1.InterfaceC8412e
    public final void j1(@NotNull InterfaceC7829k0 interfaceC7829k0, @NotNull AbstractC8413f abstractC8413f, C7795M c7795m) {
        this.f5279a.j1(interfaceC7829k0, abstractC8413f, c7795m);
    }

    public final void m(@NotNull InterfaceC7802U interfaceC7802U, long j11, @NotNull AbstractC2810k0 abstractC2810k0, @NotNull InterfaceC2819t interfaceC2819t, o1.d dVar) {
        InterfaceC2819t interfaceC2819t2 = this.f5280b;
        this.f5280b = interfaceC2819t;
        Z1.s layoutDirection = abstractC2810k0.getLayoutDirection();
        C8408a c8408a = this.f5279a;
        Z1.d b11 = c8408a.w0().b();
        Z1.s d11 = c8408a.w0().d();
        InterfaceC7802U a11 = c8408a.w0().a();
        long e11 = c8408a.w0().e();
        o1.d c11 = c8408a.w0().c();
        C8408a.b w02 = c8408a.w0();
        w02.h(abstractC2810k0);
        w02.j(layoutDirection);
        w02.g(interfaceC7802U);
        w02.k(j11);
        w02.i(dVar);
        interfaceC7802U.save();
        try {
            interfaceC2819t.draw(this);
            interfaceC7802U.p();
            C8408a.b w03 = c8408a.w0();
            w03.h(b11);
            w03.j(d11);
            w03.g(a11);
            w03.k(e11);
            w03.i(c11);
            this.f5280b = interfaceC2819t2;
        } catch (Throwable th2) {
            interfaceC7802U.p();
            C8408a.b w04 = c8408a.w0();
            w04.h(b11);
            w04.j(d11);
            w04.g(a11);
            w04.k(e11);
            w04.i(c11);
            throw th2;
        }
    }

    @Override // Z1.d
    public final long o(long j11) {
        return this.f5279a.o(j11);
    }

    @Override // Z1.k
    public final float p(long j11) {
        return this.f5279a.p(j11);
    }

    @Override // Z1.d
    public final long r(float f7) {
        return this.f5279a.r(f7);
    }

    @Override // n1.InterfaceC8412e
    public final void t0(@NotNull InterfaceC7829k0 interfaceC7829k0, long j11, long j12, long j13, long j14, float f7, @NotNull AbstractC8413f abstractC8413f, C7809a0 c7809a0, int i11, int i12) {
        this.f5279a.t0(interfaceC7829k0, j11, j12, j13, j14, f7, abstractC8413f, c7809a0, i11, i12);
    }

    @Override // n1.InterfaceC8412e
    public final void t1(@NotNull l1.w0 w0Var, long j11, long j12, float f7, @NotNull AbstractC8413f abstractC8413f) {
        this.f5279a.t1(w0Var, j11, j12, f7, abstractC8413f);
    }

    @Override // Z1.k
    public final float u1() {
        return this.f5279a.u1();
    }

    @Override // Z1.d
    public final float v1(float f7) {
        return this.f5279a.g() * f7;
    }

    @Override // n1.InterfaceC8412e
    @NotNull
    public final C8408a.b w0() {
        return this.f5279a.w0();
    }
}
