package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: b, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.C0083t f2228b = new androidx.datastore.preferences.protobuf.C0083t(1);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f2229a;

    public F(androidx.datastore.preferences.protobuf.C0077m c0077m) {
        androidx.datastore.preferences.protobuf.AbstractC0088y.a(c0077m, "output");
        this.f2229a = c0077m;
        c0077m.f2337a = this;
    }

    public void a(int i2, boolean z2) {
        ((androidx.datastore.preferences.protobuf.C0077m) this.f2229a).i0(i2, z2);
    }

    public void b(int i2, androidx.datastore.preferences.protobuf.C0071g c0071g) {
        ((androidx.datastore.preferences.protobuf.C0077m) this.f2229a).j0(i2, c0071g);
    }

    public void c(int i2, double d2) {
        androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) this.f2229a;
        c0077m.getClass();
        c0077m.n0(i2, java.lang.Double.doubleToRawLongBits(d2));
    }

    public void d(int i2, int i3) {
        ((androidx.datastore.preferences.protobuf.C0077m) this.f2229a).p0(i2, i3);
    }

    public void e(int i2, int i3) {
        ((androidx.datastore.preferences.protobuf.C0077m) this.f2229a).l0(i2, i3);
    }

    public void f(int i2, long j2) {
        ((androidx.datastore.preferences.protobuf.C0077m) this.f2229a).n0(i2, j2);
    }

    public void g(int i2, float f2) {
        androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) this.f2229a;
        c0077m.getClass();
        c0077m.l0(i2, java.lang.Float.floatToRawIntBits(f2));
    }

    public void h(int i2, java.lang.Object obj, androidx.datastore.preferences.protobuf.W w2) {
        androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) this.f2229a;
        c0077m.t0(i2, 3);
        w2.d((androidx.datastore.preferences.protobuf.AbstractC0065a) obj, c0077m.f2337a);
        c0077m.t0(i2, 4);
    }

    public void i(int i2, int i3) {
        ((androidx.datastore.preferences.protobuf.C0077m) this.f2229a).p0(i2, i3);
    }

    public void j(int i2, long j2) {
        ((androidx.datastore.preferences.protobuf.C0077m) this.f2229a).w0(i2, j2);
    }

    public void k(int i2, java.lang.Object obj, androidx.datastore.preferences.protobuf.W w2) {
        androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) this.f2229a;
        androidx.datastore.preferences.protobuf.AbstractC0065a abstractC0065a = (androidx.datastore.preferences.protobuf.AbstractC0065a) obj;
        c0077m.t0(i2, 2);
        c0077m.v0(abstractC0065a.a(w2));
        w2.d(abstractC0065a, c0077m.f2337a);
    }

    public void l(int i2, int i3) {
        ((androidx.datastore.preferences.protobuf.C0077m) this.f2229a).l0(i2, i3);
    }

    public void m(int i2, long j2) {
        ((androidx.datastore.preferences.protobuf.C0077m) this.f2229a).n0(i2, j2);
    }

    public void n(int i2, int i3) {
        ((androidx.datastore.preferences.protobuf.C0077m) this.f2229a).u0(i2, (i3 >> 31) ^ (i3 << 1));
    }

    public void o(int i2, long j2) {
        ((androidx.datastore.preferences.protobuf.C0077m) this.f2229a).w0(i2, (j2 >> 63) ^ (j2 << 1));
    }

    public void p(int i2, int i3) {
        ((androidx.datastore.preferences.protobuf.C0077m) this.f2229a).u0(i2, i3);
    }

    public void q(int i2, long j2) {
        ((androidx.datastore.preferences.protobuf.C0077m) this.f2229a).w0(i2, j2);
    }

    public F() {
        androidx.datastore.preferences.protobuf.T t = androidx.datastore.preferences.protobuf.T.f2259c;
        java.lang.Object obj = f2228b;
        try {
            obj = (androidx.datastore.preferences.protobuf.L) java.lang.Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (java.lang.Exception unused) {
        }
        androidx.datastore.preferences.protobuf.L[] lArr = {androidx.datastore.preferences.protobuf.C0083t.f2372b, obj};
        androidx.datastore.preferences.protobuf.E e2 = new androidx.datastore.preferences.protobuf.E();
        e2.f2227a = lArr;
        java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC0088y.f2376a;
        this.f2229a = e2;
    }
}
