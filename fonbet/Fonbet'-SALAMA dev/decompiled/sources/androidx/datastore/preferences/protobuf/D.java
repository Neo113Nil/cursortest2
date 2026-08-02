package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: b, reason: collision with root package name */
    public static final r f9106b = new r(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f9107a;

    public D(C0687k c0687k) {
        AbstractC0698w.a(c0687k, "output");
        this.f9107a = c0687k;
        c0687k.f9216m = this;
    }

    public void a(int i7, boolean z4) {
        ((C0687k) this.f9107a).T0(i7, z4);
    }

    public void b(int i7, C0683g c0683g) {
        ((C0687k) this.f9107a).U0(i7, c0683g);
    }

    public void c(int i7, double d7) {
        C0687k c0687k = (C0687k) this.f9107a;
        c0687k.getClass();
        c0687k.Y0(i7, Double.doubleToRawLongBits(d7));
    }

    public void d(int i7, int i8) {
        ((C0687k) this.f9107a).a1(i7, i8);
    }

    public void e(int i7, int i8) {
        ((C0687k) this.f9107a).W0(i7, i8);
    }

    public void f(int i7, long j) {
        ((C0687k) this.f9107a).Y0(i7, j);
    }

    public void g(float f7, int i7) {
        C0687k c0687k = (C0687k) this.f9107a;
        c0687k.getClass();
        c0687k.W0(i7, Float.floatToRawIntBits(f7));
    }

    public void h(int i7, Object obj, U u4) {
        C0687k c0687k = (C0687k) this.f9107a;
        c0687k.e1(i7, 3);
        u4.e((AbstractC0677a) obj, c0687k.f9216m);
        c0687k.e1(i7, 4);
    }

    public void i(int i7, int i8) {
        ((C0687k) this.f9107a).a1(i7, i8);
    }

    public void j(int i7, long j) {
        ((C0687k) this.f9107a).h1(i7, j);
    }

    public void k(int i7, Object obj, U u4) {
        C0687k c0687k = (C0687k) this.f9107a;
        AbstractC0677a abstractC0677a = (AbstractC0677a) obj;
        c0687k.e1(i7, 2);
        c0687k.g1(abstractC0677a.a(u4));
        u4.e(abstractC0677a, c0687k.f9216m);
    }

    public void l(int i7, int i8) {
        ((C0687k) this.f9107a).W0(i7, i8);
    }

    public void m(int i7, long j) {
        ((C0687k) this.f9107a).Y0(i7, j);
    }

    public void n(int i7, int i8) {
        ((C0687k) this.f9107a).f1(i7, (i8 >> 31) ^ (i8 << 1));
    }

    public void o(int i7, long j) {
        ((C0687k) this.f9107a).h1(i7, (j >> 63) ^ (j << 1));
    }

    public void p(int i7, int i8) {
        ((C0687k) this.f9107a).f1(i7, i8);
    }

    public void q(int i7, long j) {
        ((C0687k) this.f9107a).h1(i7, j);
    }

    public D() {
        Q q7 = Q.f9136c;
        Object obj = f9106b;
        try {
            obj = (J) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        J[] jArr = {r.f9251b, obj};
        C c3 = new C();
        c3.f9105a = jArr;
        Charset charset = AbstractC0698w.f9255a;
        this.f9107a = c3;
    }
}
