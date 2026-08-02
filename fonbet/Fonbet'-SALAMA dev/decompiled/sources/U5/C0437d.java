package U5;

import a.AbstractC0603a;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: U5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0437d {

    /* renamed from: i, reason: collision with root package name */
    public static final C0437d f6473i;

    /* renamed from: a, reason: collision with root package name */
    public final r f6474a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f6475b;

    /* renamed from: c, reason: collision with root package name */
    public final K4.m f6476c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[][] f6477d;

    /* renamed from: e, reason: collision with root package name */
    public final List f6478e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f6479f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f6480g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f6481h;

    static {
        C0436c c0436c = new C0436c();
        c0436c.f6465e = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        c0436c.f6461a = Collections.emptyList();
        f6473i = new C0437d(c0436c);
    }

    public C0437d(C0436c c0436c) {
        this.f6474a = (r) c0436c.f6462b;
        this.f6475b = (Executor) c0436c.f6463c;
        this.f6476c = (K4.m) c0436c.f6464d;
        this.f6477d = (Object[][]) c0436c.f6465e;
        this.f6478e = c0436c.f6461a;
        this.f6479f = (Boolean) c0436c.f6466f;
        this.f6480g = (Integer) c0436c.f6467g;
        this.f6481h = (Integer) c0436c.f6468h;
    }

    public static C0436c b(C0437d c0437d) {
        C0436c c0436c = new C0436c();
        c0436c.f6462b = c0437d.f6474a;
        c0436c.f6463c = c0437d.f6475b;
        c0436c.f6464d = c0437d.f6476c;
        c0436c.f6465e = c0437d.f6477d;
        c0436c.f6461a = c0437d.f6478e;
        c0436c.f6466f = c0437d.f6479f;
        c0436c.f6467g = c0437d.f6480g;
        c0436c.f6468h = c0437d.f6481h;
        return c0436c;
    }

    public final Object a(J0.a aVar) {
        p3.f.k(aVar, "key");
        int i7 = 0;
        while (true) {
            Object[][] objArr = this.f6477d;
            if (i7 >= objArr.length) {
                return null;
            }
            if (aVar.equals(objArr[i7][0])) {
                return objArr[i7][1];
            }
            i7++;
        }
    }

    public final C0437d c(J0.a aVar, Object obj) {
        Object[][] objArr;
        p3.f.k(aVar, "key");
        C0436c b7 = b(this);
        int i7 = 0;
        while (true) {
            objArr = this.f6477d;
            if (i7 >= objArr.length) {
                i7 = -1;
                break;
            }
            if (aVar.equals(objArr[i7][0])) {
                break;
            }
            i7++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + (i7 == -1 ? 1 : 0), 2);
        b7.f6465e = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        if (i7 == -1) {
            ((Object[][]) b7.f6465e)[objArr.length] = new Object[]{aVar, obj};
        } else {
            ((Object[][]) b7.f6465e)[i7] = new Object[]{aVar, obj};
        }
        return new C0437d(b7);
    }

    public final String toString() {
        D3.j u02 = AbstractC0603a.u0(this);
        u02.a(this.f6474a, "deadline");
        u02.a(null, "authority");
        u02.a(this.f6476c, "callCredentials");
        Executor executor = this.f6475b;
        u02.a(executor != null ? executor.getClass() : null, "executor");
        u02.a(null, "compressorName");
        u02.a(Arrays.deepToString(this.f6477d), "customOptions");
        u02.c("waitForReady", Boolean.TRUE.equals(this.f6479f));
        u02.a(this.f6480g, "maxInboundMessageSize");
        u02.a(this.f6481h, "maxOutboundMessageSize");
        u02.a(this.f6478e, "streamTracerFactories");
        return u02.toString();
    }
}
