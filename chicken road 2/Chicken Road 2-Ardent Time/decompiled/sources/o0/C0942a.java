package o0;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0942a {

    /* renamed from: a, reason: collision with root package name */
    public final int f8120a;

    /* renamed from: b, reason: collision with root package name */
    public final x0.e f8121b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.InterfaceC0938b f8122c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f8123d;

    public C0942a(x0.e eVar, n0.InterfaceC0938b interfaceC0938b, java.lang.String str) {
        this.f8121b = eVar;
        this.f8122c = interfaceC0938b;
        this.f8123d = str;
        this.f8120a = java.util.Arrays.hashCode(new java.lang.Object[]{eVar, interfaceC0938b, str});
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0.C0942a)) {
            return false;
        }
        o0.C0942a c0942a = (o0.C0942a) obj;
        return p0.AbstractC0966r.e(this.f8121b, c0942a.f8121b) && p0.AbstractC0966r.e(this.f8122c, c0942a.f8122c) && p0.AbstractC0966r.e(this.f8123d, c0942a.f8123d);
    }

    public final int hashCode() {
        return this.f8120a;
    }
}
