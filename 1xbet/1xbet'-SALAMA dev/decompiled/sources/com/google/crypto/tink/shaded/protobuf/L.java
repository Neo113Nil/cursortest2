package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class L {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0839t f11721b = new C0839t(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11722a;

    public L(C0832l c0832l) {
        A.a(c0832l, "output");
        this.f11722a = c0832l;
        c0832l.f11800g = this;
    }

    public void a(int i7, boolean z4) throws Z4.b {
        C0832l c0832l = (C0832l) this.f11722a;
        c0832l.L0(i7, 0);
        c0832l.E0(z4 ? (byte) 1 : (byte) 0);
    }

    public void b(int i7, AbstractC0829i abstractC0829i) throws Z4.b {
        C0832l c0832l = (C0832l) this.f11722a;
        c0832l.L0(i7, 2);
        c0832l.M0(abstractC0829i.size());
        C0828h c0828h = (C0828h) abstractC0829i;
        c0832l.F0(c0828h.f11777d, c0828h.A(), c0828h.size());
    }

    public void c(int i7, double d7) throws Z4.b {
        C0832l c0832l = (C0832l) this.f11722a;
        c0832l.getClass();
        c0832l.I0(i7, Double.doubleToRawLongBits(d7));
    }

    public void d(int i7, int i8) throws Z4.b {
        C0832l c0832l = (C0832l) this.f11722a;
        c0832l.L0(i7, 0);
        c0832l.K0(i8);
    }

    public void e(int i7, int i8) throws Z4.b {
        ((C0832l) this.f11722a).G0(i7, i8);
    }

    public void f(int i7, long j) throws Z4.b {
        ((C0832l) this.f11722a).I0(i7, j);
    }

    public void g(float f7, int i7) throws Z4.b {
        C0832l c0832l = (C0832l) this.f11722a;
        c0832l.getClass();
        c0832l.G0(i7, Float.floatToRawIntBits(f7));
    }

    public void h(int i7, Object obj, c0 c0Var) throws Z4.b {
        C0832l c0832l = (C0832l) this.f11722a;
        c0832l.L0(i7, 3);
        c0Var.i((AbstractC0821a) obj, c0832l.f11800g);
        c0832l.L0(i7, 4);
    }

    public void i(int i7, int i8) throws Z4.b {
        C0832l c0832l = (C0832l) this.f11722a;
        c0832l.L0(i7, 0);
        c0832l.K0(i8);
    }

    public void j(int i7, long j) throws Z4.b {
        ((C0832l) this.f11722a).N0(i7, j);
    }

    public void k(int i7, Object obj, c0 c0Var) throws Z4.b {
        AbstractC0821a abstractC0821a = (AbstractC0821a) obj;
        C0832l c0832l = (C0832l) this.f11722a;
        c0832l.L0(i7, 2);
        c0832l.M0(abstractC0821a.b(c0Var));
        c0Var.i(abstractC0821a, c0832l.f11800g);
    }

    public void l(int i7, int i8) throws Z4.b {
        ((C0832l) this.f11722a).G0(i7, i8);
    }

    public void m(int i7, long j) throws Z4.b {
        ((C0832l) this.f11722a).I0(i7, j);
    }

    public void n(int i7, int i8) throws Z4.b {
        C0832l c0832l = (C0832l) this.f11722a;
        c0832l.L0(i7, 0);
        c0832l.M0((i8 >> 31) ^ (i8 << 1));
    }

    public void o(int i7, long j) throws Z4.b {
        ((C0832l) this.f11722a).N0(i7, (j >> 63) ^ (j << 1));
    }

    public void p(int i7, int i8) throws Z4.b {
        C0832l c0832l = (C0832l) this.f11722a;
        c0832l.L0(i7, 0);
        c0832l.M0(i8);
    }

    public void q(int i7, long j) throws Z4.b {
        ((C0832l) this.f11722a).N0(i7, j);
    }

    public L() {
        P p5;
        try {
            p5 = (P) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            p5 = f11721b;
        }
        P[] pArr = {C0839t.f11824b, p5};
        K k7 = new K();
        k7.f11720a = pArr;
        Charset charset = A.f11702a;
        this.f11722a = k7;
    }
}
