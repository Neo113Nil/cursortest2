package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: b, reason: collision with root package name */
    public static final C0144t f2160b = new C0144t(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f2161a;

    public F(C0138m c0138m) {
        AbstractC0149y.a(c0138m, "output");
        this.f2161a = c0138m;
        c0138m.f2264b = this;
    }

    public void a(int i3, Object obj, W w3) {
        C0138m c0138m = (C0138m) this.f2161a;
        c0138m.J0(i3, 3);
        w3.b((AbstractC0126a) obj, c0138m.f2264b);
        c0138m.J0(i3, 4);
    }

    public F() {
        T t3 = T.f2190c;
        Object obj = f2160b;
        try {
            obj = (L) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
        }
        L[] lArr = {C0144t.f2296b, obj};
        E e3 = new E();
        e3.f2159a = lArr;
        Charset charset = AbstractC0149y.f2300a;
        this.f2161a = e3;
    }
}
