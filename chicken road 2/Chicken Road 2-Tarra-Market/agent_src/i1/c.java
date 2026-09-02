package i1;

import io.appmetrica.analytics.BuildConfig;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1294a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1295b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1296c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1297d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1298e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1299f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1300g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1301h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1302i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1303j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1304k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1305l;

    /* renamed from: m, reason: collision with root package name */
    public String f1306m;

    static {
        C0.v vVar = new C0.v();
        vVar.f133a = true;
        new c(vVar);
        C0.v vVar2 = new C0.v();
        vVar2.f135c = true;
        long seconds = TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
        vVar2.f134b = seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE;
        new c(vVar2);
    }

    public c(boolean z2, boolean z3, int i2, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, boolean z7, boolean z8, boolean z9, String str) {
        this.f1294a = z2;
        this.f1295b = z3;
        this.f1296c = i2;
        this.f1297d = i3;
        this.f1298e = z4;
        this.f1299f = z5;
        this.f1300g = z6;
        this.f1301h = i4;
        this.f1302i = i5;
        this.f1303j = z7;
        this.f1304k = z8;
        this.f1305l = z9;
        this.f1306m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c a(m mVar) {
        int i2;
        int i3;
        String str;
        char charAt;
        m mVar2 = mVar;
        int d2 = mVar.d();
        int i4 = 0;
        boolean z2 = true;
        String str2 = null;
        boolean z3 = false;
        boolean z4 = false;
        int i5 = -1;
        int i6 = -1;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i7 = -1;
        int i8 = -1;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (i4 < d2) {
            String b2 = mVar2.b(i4);
            String e2 = mVar2.e(i4);
            if (b2.equalsIgnoreCase("Cache-Control")) {
                if (str2 == null) {
                    str2 = e2;
                    for (i2 = 0; i2 < e2.length(); i2 = i3) {
                        int e3 = m1.d.e(i2, e2, "=,;");
                        String trim = e2.substring(i2, e3).trim();
                        if (e3 == e2.length() || e2.charAt(e3) == ',' || e2.charAt(e3) == ';') {
                            i3 = e3 + 1;
                            str = null;
                        } else {
                            while (true) {
                                e3++;
                                if (e3 >= e2.length() || ((charAt = e2.charAt(e3)) != ' ' && charAt != '\t')) {
                                    break;
                                }
                            }
                            if (e3 >= e2.length() || e2.charAt(e3) != '\"') {
                                i3 = m1.d.e(e3, e2, ",;");
                                str = e2.substring(e3, i3).trim();
                            } else {
                                int i9 = e3 + 1;
                                int e4 = m1.d.e(i9, e2, "\"");
                                str = e2.substring(i9, e4);
                                i3 = e4 + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(trim)) {
                            z3 = true;
                        } else if ("no-store".equalsIgnoreCase(trim)) {
                            z4 = true;
                        } else if ("max-age".equalsIgnoreCase(trim)) {
                            i5 = m1.d.c(-1, str);
                        } else if ("s-maxage".equalsIgnoreCase(trim)) {
                            i6 = m1.d.c(-1, str);
                        } else if ("private".equalsIgnoreCase(trim)) {
                            z5 = true;
                        } else if (BuildConfig.SDK_BUILD_FLAVOR.equalsIgnoreCase(trim)) {
                            z6 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(trim)) {
                            z7 = true;
                        } else if ("max-stale".equalsIgnoreCase(trim)) {
                            i7 = m1.d.c(Integer.MAX_VALUE, str);
                        } else if ("min-fresh".equalsIgnoreCase(trim)) {
                            i8 = m1.d.c(-1, str);
                        } else if ("only-if-cached".equalsIgnoreCase(trim)) {
                            z8 = true;
                        } else if ("no-transform".equalsIgnoreCase(trim)) {
                            z9 = true;
                        } else if ("immutable".equalsIgnoreCase(trim)) {
                            z10 = true;
                        }
                    }
                    i4++;
                    mVar2 = mVar;
                }
            } else if (!b2.equalsIgnoreCase("Pragma")) {
                i4++;
                mVar2 = mVar;
            }
            z2 = false;
            while (i2 < e2.length()) {
            }
            i4++;
            mVar2 = mVar;
        }
        return new c(z3, z4, i5, i6, z5, z6, z7, i7, i8, z8, z9, z10, !z2 ? null : str2);
    }

    public final String toString() {
        String str = this.f1306m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f1294a) {
                sb.append("no-cache, ");
            }
            if (this.f1295b) {
                sb.append("no-store, ");
            }
            int i2 = this.f1296c;
            if (i2 != -1) {
                sb.append("max-age=");
                sb.append(i2);
                sb.append(", ");
            }
            int i3 = this.f1297d;
            if (i3 != -1) {
                sb.append("s-maxage=");
                sb.append(i3);
                sb.append(", ");
            }
            if (this.f1298e) {
                sb.append("private, ");
            }
            if (this.f1299f) {
                sb.append("public, ");
            }
            if (this.f1300g) {
                sb.append("must-revalidate, ");
            }
            int i4 = this.f1301h;
            if (i4 != -1) {
                sb.append("max-stale=");
                sb.append(i4);
                sb.append(", ");
            }
            int i5 = this.f1302i;
            if (i5 != -1) {
                sb.append("min-fresh=");
                sb.append(i5);
                sb.append(", ");
            }
            if (this.f1303j) {
                sb.append("only-if-cached, ");
            }
            if (this.f1304k) {
                sb.append("no-transform, ");
            }
            if (this.f1305l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.f1306m = str;
        }
        return str;
    }

    public c(C0.v vVar) {
        this.f1294a = vVar.f133a;
        this.f1295b = false;
        this.f1296c = -1;
        this.f1297d = -1;
        this.f1298e = false;
        this.f1299f = false;
        this.f1300g = false;
        this.f1301h = vVar.f134b;
        this.f1302i = -1;
        this.f1303j = vVar.f135c;
        this.f1304k = false;
        this.f1305l = false;
    }
}
