package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class L {

    /* renamed from: b, reason: collision with root package name */
    public static final C0883t f11721b = new C0883t(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f11722a;

    public L(C0876l c0876l) {
        A.a(c0876l, "output");
        this.f11722a = c0876l;
        c0876l.f11800g = this;
    }

    public void a(int i7, boolean z4) {
        C0876l c0876l = (C0876l) this.f11722a;
        c0876l.L0(i7, 0);
        c0876l.E0(z4 ? (byte) 1 : (byte) 0);
    }

    public void b(int i7, AbstractC0873i abstractC0873i) {
        C0876l c0876l = (C0876l) this.f11722a;
        c0876l.L0(i7, 2);
        c0876l.M0(abstractC0873i.size());
        C0872h c0872h = (C0872h) abstractC0873i;
        c0876l.F0(c0872h.f11777d, c0872h.A(), c0872h.size());
    }

    public void c(int i7, double d7) {
        C0876l c0876l = (C0876l) this.f11722a;
        c0876l.getClass();
        c0876l.I0(i7, Double.doubleToRawLongBits(d7));
    }

    public void d(int i7, int i8) {
        C0876l c0876l = (C0876l) this.f11722a;
        c0876l.L0(i7, 0);
        c0876l.K0(i8);
    }

    public void e(int i7, int i8) {
        ((C0876l) this.f11722a).G0(i7, i8);
    }

    public void f(int i7, long j) {
        ((C0876l) this.f11722a).I0(i7, j);
    }

    public void g(float f7, int i7) {
        C0876l c0876l = (C0876l) this.f11722a;
        c0876l.getClass();
        c0876l.G0(i7, Float.floatToRawIntBits(f7));
    }

    public void h(int i7, Object obj, c0 c0Var) {
        C0876l c0876l = (C0876l) this.f11722a;
        c0876l.L0(i7, 3);
        c0Var.i((AbstractC0865a) obj, c0876l.f11800g);
        c0876l.L0(i7, 4);
    }

    public void i(int i7, int i8) {
        C0876l c0876l = (C0876l) this.f11722a;
        c0876l.L0(i7, 0);
        c0876l.K0(i8);
    }

    public void j(int i7, long j) {
        ((C0876l) this.f11722a).N0(i7, j);
    }

    public void k(int i7, Object obj, c0 c0Var) {
        AbstractC0865a abstractC0865a = (AbstractC0865a) obj;
        C0876l c0876l = (C0876l) this.f11722a;
        c0876l.L0(i7, 2);
        c0876l.M0(abstractC0865a.b(c0Var));
        c0Var.i(abstractC0865a, c0876l.f11800g);
    }

    public void l(int i7, int i8) {
        ((C0876l) this.f11722a).G0(i7, i8);
    }

    public void m(int i7, long j) {
        ((C0876l) this.f11722a).I0(i7, j);
    }

    public void n(int i7, int i8) {
        C0876l c0876l = (C0876l) this.f11722a;
        c0876l.L0(i7, 0);
        c0876l.M0((i8 >> 31) ^ (i8 << 1));
    }

    public void o(int i7, long j) {
        ((C0876l) this.f11722a).N0(i7, (j >> 63) ^ (j << 1));
    }

    public void p(int i7, int i8) {
        C0876l c0876l = (C0876l) this.f11722a;
        c0876l.L0(i7, 0);
        c0876l.M0(i8);
    }

    public void q(int i7, long j) {
        ((C0876l) this.f11722a).N0(i7, j);
    }

    public L() {
        P p5;
        try {
            p5 = (P) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            p5 = f11721b;
        }
        P[] pArr = {C0883t.f11824b, p5};
        K k7 = new K();
        k7.f11720a = pArr;
        Charset charset = A.f11702a;
        this.f11722a = k7;
    }
}
