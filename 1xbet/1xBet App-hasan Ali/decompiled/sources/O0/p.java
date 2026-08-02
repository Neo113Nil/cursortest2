package O0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final o f4037a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4038b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4039c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4040d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4041e;

    public p(o oVar, l lVar, int i, int i5, Object obj) {
        this.f4037a = oVar;
        this.f4038b = lVar;
        this.f4039c = i;
        this.f4040d = i5;
        this.f4041e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.l.a(this.f4037a, pVar.f4037a) && kotlin.jvm.internal.l.a(this.f4038b, pVar.f4038b) && this.f4039c == pVar.f4039c && this.f4040d == pVar.f4040d && kotlin.jvm.internal.l.a(this.f4041e, pVar.f4041e);
    }

    public final int hashCode() {
        o oVar = this.f4037a;
        int hashCode = (((((((oVar == null ? 0 : oVar.hashCode()) * 31) + this.f4038b.f4033k) * 31) + this.f4039c) * 31) + this.f4040d) * 31;
        Object obj = this.f4041e;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f4037a);
        sb.append(", fontWeight=");
        sb.append(this.f4038b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.f4039c;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i5 = this.f4040d;
        if (i5 == 0) {
            str = "None";
        } else if (i5 == 1) {
            str = "Weight";
        } else if (i5 == 2) {
            str = "Style";
        } else if (i5 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f4041e);
        sb.append(')');
        return sb.toString();
    }
}
