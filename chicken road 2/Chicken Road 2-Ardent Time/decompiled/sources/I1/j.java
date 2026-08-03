package I1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.regex.Pattern f733j = java.util.regex.Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.regex.Pattern f734k = java.util.regex.Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.regex.Pattern f735l = java.util.regex.Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.regex.Pattern f736m = java.util.regex.Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f737a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f738b;

    /* renamed from: c, reason: collision with root package name */
    public final long f739c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f740d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f741e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f742f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f743g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f744h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f745i;

    public j(java.lang.String str, java.lang.String str2, long j2, java.lang.String str3, java.lang.String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f737a = str;
        this.f738b = str2;
        this.f739c = j2;
        this.f740d = str3;
        this.f741e = str4;
        this.f742f = z2;
        this.f743g = z3;
        this.f744h = z4;
        this.f745i = z5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof I1.j) {
            I1.j jVar = (I1.j) obj;
            if (kotlin.jvm.internal.i.a(jVar.f737a, this.f737a) && kotlin.jvm.internal.i.a(jVar.f738b, this.f738b) && jVar.f739c == this.f739c && kotlin.jvm.internal.i.a(jVar.f740d, this.f740d) && kotlin.jvm.internal.i.a(jVar.f741e, this.f741e) && jVar.f742f == this.f742f && jVar.f743g == this.f743g && jVar.f744h == this.f744h && jVar.f745i == this.f745i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f745i) + ((java.lang.Boolean.hashCode(this.f744h) + ((java.lang.Boolean.hashCode(this.f743g) + ((java.lang.Boolean.hashCode(this.f742f) + B1.a.e(this.f741e, B1.a.e(this.f740d, (java.lang.Long.hashCode(this.f739c) + B1.a.e(this.f738b, B1.a.e(this.f737a, 527, 31), 31)) * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f737a);
        sb.append('=');
        sb.append(this.f738b);
        if (this.f744h) {
            long j2 = this.f739c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                java.lang.String format = ((java.text.DateFormat) N1.d.f1149a.get()).format(new java.util.Date(j2));
                kotlin.jvm.internal.i.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.f745i) {
            sb.append("; domain=");
            sb.append(this.f740d);
        }
        sb.append("; path=");
        sb.append(this.f741e);
        if (this.f742f) {
            sb.append("; secure");
        }
        if (this.f743g) {
            sb.append("; httponly");
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString()");
        return sb2;
    }
}
