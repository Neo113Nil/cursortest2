package I1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f683n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f684a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f685b;

    /* renamed from: c, reason: collision with root package name */
    public final int f686c;

    /* renamed from: d, reason: collision with root package name */
    public final int f687d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f688e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f689f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f690g;

    /* renamed from: h, reason: collision with root package name */
    public final int f691h;

    /* renamed from: i, reason: collision with root package name */
    public final int f692i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f693j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f694k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f695l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f696m;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        kotlin.jvm.internal.i.e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z2, boolean z3, int i2, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, boolean z7, boolean z8, boolean z9, java.lang.String str) {
        this.f684a = z2;
        this.f685b = z3;
        this.f686c = i2;
        this.f687d = i3;
        this.f688e = z4;
        this.f689f = z5;
        this.f690g = z6;
        this.f691h = i4;
        this.f692i = i5;
        this.f693j = z7;
        this.f694k = z8;
        this.f695l = z9;
        this.f696m = str;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f696m;
        if (str != null) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.f684a) {
            sb.append("no-cache, ");
        }
        if (this.f685b) {
            sb.append("no-store, ");
        }
        int i2 = this.f686c;
        if (i2 != -1) {
            sb.append("max-age=");
            sb.append(i2);
            sb.append(", ");
        }
        int i3 = this.f687d;
        if (i3 != -1) {
            sb.append("s-maxage=");
            sb.append(i3);
            sb.append(", ");
        }
        if (this.f688e) {
            sb.append("private, ");
        }
        if (this.f689f) {
            sb.append("public, ");
        }
        if (this.f690g) {
            sb.append("must-revalidate, ");
        }
        int i4 = this.f691h;
        if (i4 != -1) {
            sb.append("max-stale=");
            sb.append(i4);
            sb.append(", ");
        }
        int i5 = this.f692i;
        if (i5 != -1) {
            sb.append("min-fresh=");
            sb.append(i5);
            sb.append(", ");
        }
        if (this.f693j) {
            sb.append("only-if-cached, ");
        }
        if (this.f694k) {
            sb.append("no-transform, ");
        }
        if (this.f695l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f696m = sb2;
        return sb2;
    }
}
