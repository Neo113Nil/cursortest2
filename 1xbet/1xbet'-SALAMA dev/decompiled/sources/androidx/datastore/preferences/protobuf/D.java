package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f9106b = new r(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9107a;

    public D(C0666k c0666k) {
        AbstractC0677w.a(c0666k, "output");
        this.f9107a = c0666k;
        c0666k.f9216m = this;
    }

    public void a(int i7, boolean z4) {
        ((C0666k) this.f9107a).T0(i7, z4);
    }

    public void b(int i7, C0662g c0662g) {
        ((C0666k) this.f9107a).U0(i7, c0662g);
    }

    public void c(int i7, double d7) {
        C0666k c0666k = (C0666k) this.f9107a;
        c0666k.getClass();
        c0666k.Y0(i7, Double.doubleToRawLongBits(d7));
    }

    public void d(int i7, int i8) {
        ((C0666k) this.f9107a).a1(i7, i8);
    }

    public void e(int i7, int i8) {
        ((C0666k) this.f9107a).W0(i7, i8);
    }

    public void f(int i7, long j) {
        ((C0666k) this.f9107a).Y0(i7, j);
    }

    public void g(float f7, int i7) {
        C0666k c0666k = (C0666k) this.f9107a;
        c0666k.getClass();
        c0666k.W0(i7, Float.floatToRawIntBits(f7));
    }

    public void h(int i7, Object obj, U u4) {
        C0666k c0666k = (C0666k) this.f9107a;
        c0666k.e1(i7, 3);
        u4.e((AbstractC0656a) obj, c0666k.f9216m);
        c0666k.e1(i7, 4);
    }

    public void i(int i7, int i8) {
        ((C0666k) this.f9107a).a1(i7, i8);
    }

    public void j(int i7, long j) {
        ((C0666k) this.f9107a).h1(i7, j);
    }

    public void k(int i7, Object obj, U u4) {
        C0666k c0666k = (C0666k) this.f9107a;
        AbstractC0656a abstractC0656a = (AbstractC0656a) obj;
        c0666k.e1(i7, 2);
        c0666k.g1(abstractC0656a.a(u4));
        u4.e(abstractC0656a, c0666k.f9216m);
    }

    public void l(int i7, int i8) {
        ((C0666k) this.f9107a).W0(i7, i8);
    }

    public void m(int i7, long j) {
        ((C0666k) this.f9107a).Y0(i7, j);
    }

    public void n(int i7, int i8) {
        ((C0666k) this.f9107a).f1(i7, (i8 >> 31) ^ (i8 << 1));
    }

    public void o(int i7, long j) {
        ((C0666k) this.f9107a).h1(i7, (j >> 63) ^ (j << 1));
    }

    public void p(int i7, int i8) {
        ((C0666k) this.f9107a).f1(i7, i8);
    }

    public void q(int i7, long j) {
        ((C0666k) this.f9107a).h1(i7, j);
    }

    public D() {
        Q q7 = Q.f9136c;
        J j = f9106b;
        try {
            j = (J) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        J[] jArr = {r.f9251b, j};
        C c3 = new C();
        c3.f9105a = jArr;
        Charset charset = AbstractC0677w.f9255a;
        this.f9107a = c3;
    }
}
