package g2;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13143c;

    public f(String str, String str2, String str3) {
        this.f13141a = str;
        this.f13142b = str2;
        this.f13143c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return p151v2.t.a(this.f13141a, fVar.f13141a) && p151v2.t.a(this.f13142b, fVar.f13142b) && p151v2.t.a(this.f13143c, fVar.f13143c);
    }

    public final int hashCode() {
        int iHashCode = this.f13141a.hashCode() * 31;
        String str = this.f13142b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13143c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
