package T4;

import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class D {

    /* renamed from: b, reason: collision with root package name */
    public static final C0152b f2808b;

    /* renamed from: c, reason: collision with root package name */
    public static final D f2809c;

    /* renamed from: d, reason: collision with root package name */
    public static final D f2810d;

    /* renamed from: e, reason: collision with root package name */
    public static final D f2811e;

    /* renamed from: f, reason: collision with root package name */
    public static final D f2812f;

    /* renamed from: g, reason: collision with root package name */
    public static final D f2813g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ D[] f2814h;

    /* renamed from: a, reason: collision with root package name */
    public final String f2815a;

    static {
        D d6 = new D("TLS_1_3", 0, "TLSv1.3");
        f2809c = d6;
        D d7 = new D("TLS_1_2", 1, "TLSv1.2");
        f2810d = d7;
        D d8 = new D("TLS_1_1", 2, "TLSv1.1");
        f2811e = d8;
        D d9 = new D("TLS_1_0", 3, "TLSv1");
        f2812f = d9;
        D d10 = new D("SSL_3_0", 4, "SSLv3");
        f2813g = d10;
        D[] dArr = {d6, d7, d8, d9, d10};
        f2814h = dArr;
        AbstractC1477a.n(dArr);
        f2808b = new C0152b();
    }

    public D(String str, int i2, String str2) {
        this.f2815a = str2;
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f2814h.clone();
    }
}
