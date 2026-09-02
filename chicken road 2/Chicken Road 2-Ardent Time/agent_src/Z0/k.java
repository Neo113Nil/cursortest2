package Z0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1910a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f1911b;

    /* renamed from: c, reason: collision with root package name */
    public final I0.b f1912c;

    /* renamed from: d, reason: collision with root package name */
    public Z0.j f1913d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1914e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1915f;

    public k(R0.b bVar, boolean z2) {
        I0.b bVar2 = new I0.b(bVar, "flutter/restoration", a1.o.f1949b, 9);
        this.f1914e = false;
        this.f1915f = false;
        Z0.h hVar = new Z0.h(5, this);
        this.f1912c = bVar2;
        this.f1910a = z2;
        bVar2.M(hVar);
    }

    public static java.util.HashMap a(byte[] bArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("enabled", java.lang.Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }
}
