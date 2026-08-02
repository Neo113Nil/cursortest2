package y4;

import java.util.concurrent.TimeUnit;

/* renamed from: y4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2675c {

    /* renamed from: n, reason: collision with root package name */
    public static final C2675c f21303n = new C2675c(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: o, reason: collision with root package name */
    public static final C2675c f21304o;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21305a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21306b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21307c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21308d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21309e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f21310g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21311h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f21312j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f21313k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f21314l;

    /* renamed from: m, reason: collision with root package name */
    public String f21315m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        kotlin.jvm.internal.l.f("timeUnit", timeUnit);
        long seconds = timeUnit.toSeconds(Integer.MAX_VALUE);
        f21304o = new C2675c(false, false, -1, -1, false, false, false, seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE, -1, true, false, false, null);
    }

    public C2675c(boolean z3, boolean z5, int i, int i5, boolean z6, boolean z7, boolean z8, int i6, int i7, boolean z9, boolean z10, boolean z11, String str) {
        this.f21305a = z3;
        this.f21306b = z5;
        this.f21307c = i;
        this.f21308d = i5;
        this.f21309e = z6;
        this.f = z7;
        this.f21310g = z8;
        this.f21311h = i6;
        this.i = i7;
        this.f21312j = z9;
        this.f21313k = z10;
        this.f21314l = z11;
        this.f21315m = str;
    }

    public final String toString() {
        String str = this.f21315m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f21305a) {
            sb.append("no-cache, ");
        }
        if (this.f21306b) {
            sb.append("no-store, ");
        }
        int i = this.f21307c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i5 = this.f21308d;
        if (i5 != -1) {
            sb.append("s-maxage=");
            sb.append(i5);
            sb.append(", ");
        }
        if (this.f21309e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.f21310g) {
            sb.append("must-revalidate, ");
        }
        int i6 = this.f21311h;
        if (i6 != -1) {
            sb.append("max-stale=");
            sb.append(i6);
            sb.append(", ");
        }
        int i7 = this.i;
        if (i7 != -1) {
            sb.append("min-fresh=");
            sb.append(i7);
            sb.append(", ");
        }
        if (this.f21312j) {
            sb.append("only-if-cached, ");
        }
        if (this.f21313k) {
            sb.append("no-transform, ");
        }
        if (this.f21314l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", sb2);
        this.f21315m = sb2;
        return sb2;
    }
}
