package g2;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f13146a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13147b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13148c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13149d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13150e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f13146a = str;
        this.f13147b = str2;
        this.f13148c = str3;
        this.f13149d = str4;
        this.f13150e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return v2.t.a(this.f13146a, iVar.f13146a) && v2.t.a(this.f13147b, iVar.f13147b) && v2.t.a(this.f13148c, iVar.f13148c) && v2.t.a(this.f13149d, iVar.f13149d) && v2.t.a(this.f13150e, iVar.f13150e);
    }

    public final int hashCode() {
        String str = this.f13146a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13147b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f13148c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f13149d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f13150e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
