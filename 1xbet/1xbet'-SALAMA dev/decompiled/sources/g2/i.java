package g2;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13156e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f13152a = str;
        this.f13153b = str2;
        this.f13154c = str3;
        this.f13155d = str4;
        this.f13156e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p151v2.t.a(this.f13152a, iVar.f13152a) && p151v2.t.a(this.f13153b, iVar.f13153b) && p151v2.t.a(this.f13154c, iVar.f13154c) && p151v2.t.a(this.f13155d, iVar.f13155d) && p151v2.t.a(this.f13156e, iVar.f13156e);
    }

    public final int hashCode() {
        String str = this.f13152a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13153b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f13154c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f13155d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f13156e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
