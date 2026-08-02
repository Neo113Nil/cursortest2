package g2;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f13135a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13136b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13137c;

    public f(String str, String str2, String str3) {
        this.f13135a = str;
        this.f13136b = str2;
        this.f13137c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return v2.t.a(this.f13135a, fVar.f13135a) && v2.t.a(this.f13136b, fVar.f13136b) && v2.t.a(this.f13137c, fVar.f13137c);
    }

    public final int hashCode() {
        int hashCode = this.f13135a.hashCode() * 31;
        String str = this.f13136b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13137c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
