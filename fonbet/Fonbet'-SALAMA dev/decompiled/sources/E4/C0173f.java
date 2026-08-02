package E4;

/* renamed from: E4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0173f {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0172e f2179a;

    /* renamed from: b, reason: collision with root package name */
    public final H4.k f2180b;

    public C0173f(EnumC0172e enumC0172e, H4.k kVar) {
        this.f2179a = enumC0172e;
        this.f2180b = kVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0173f)) {
            return false;
        }
        C0173f c0173f = (C0173f) obj;
        return this.f2179a.equals(c0173f.f2179a) && this.f2180b.equals(c0173f.f2180b);
    }

    public final int hashCode() {
        int hashCode = (this.f2179a.hashCode() + 1891) * 31;
        H4.k kVar = this.f2180b;
        return kVar.f3327e.hashCode() + ((kVar.f3323a.f3318a.hashCode() + hashCode) * 31);
    }

    public final String toString() {
        return "DocumentViewChange(" + this.f2180b + "," + this.f2179a + ")";
    }
}
