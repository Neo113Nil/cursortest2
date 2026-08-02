package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class mf {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3642a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private final boolean e;
    private final int f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;

    @javax.annotation.Nullable
    private java.lang.String k;
    private final boolean m;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f3643o;

    static {
        com.facetec.sdk.mf.e eVar = new com.facetec.sdk.mf.e();
        eVar.c = true;
        eVar.e();
        com.facetec.sdk.mf.e eVar2 = new com.facetec.sdk.mf.e();
        eVar2.g = true;
        long seconds = java.util.concurrent.TimeUnit.SECONDS.toSeconds(androidx.collection.SieveCacheKt.NodeLinkMask);
        eVar2.b = seconds > androidx.collection.SieveCacheKt.NodeLinkMask ? Integer.MAX_VALUE : (int) seconds;
        eVar2.e();
    }

    private mf(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, @javax.annotation.Nullable java.lang.String str) {
        this.e = z;
        this.g = z2;
        this.i = i;
        this.h = i2;
        this.c = z3;
        this.d = z4;
        this.f3642a = z5;
        this.f = i3;
        this.j = i4;
        this.b = z6;
        this.f3643o = z7;
        this.m = z8;
        this.k = str;
    }

    mf(com.facetec.sdk.mf.e eVar) {
        this.e = eVar.c;
        this.g = eVar.e;
        this.i = eVar.f3644a;
        this.h = -1;
        this.c = false;
        this.d = false;
        this.f3642a = false;
        this.f = eVar.b;
        this.j = eVar.d;
        this.b = eVar.g;
        this.f3643o = eVar.j;
        this.m = eVar.f;
    }

    public final boolean a() {
        return this.e;
    }

    public final boolean d() {
        return this.g;
    }

    public final int c() {
        return this.i;
    }

    public final int b() {
        return this.f;
    }

    public final int e() {
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.facetec.sdk.mf d(com.facetec.sdk.mm mmVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        java.lang.String str;
        int e2 = mmVar.e();
        boolean z2 = true;
        java.lang.String str2 = null;
        boolean z3 = false;
        boolean z4 = false;
        int i4 = -1;
        int i5 = -1;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i6 = -1;
        int i7 = -1;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (i < e2) {
            java.lang.String a2 = mmVar.a(i);
            java.lang.String e3 = mmVar.e(i);
            if (!a2.equalsIgnoreCase("Cache-Control")) {
                i = a2.equalsIgnoreCase(com.google.common.net.HttpHeaders.PRAGMA) ? 0 : i + 1;
            } else if (str2 == null) {
                str2 = e3;
                i2 = 0;
                while (i2 < e3.length()) {
                    int e4 = com.facetec.sdk.nz.e(e3, i2, "=,;");
                    java.lang.String trim = e3.substring(i2, e4).trim();
                    if (e4 == e3.length() || e3.charAt(e4) == ',' || e3.charAt(e4) == ';') {
                        z = true;
                        i3 = e4 + 1;
                        str = null;
                    } else {
                        int b = com.facetec.sdk.nz.b(e3, e4 + 1);
                        if (b < e3.length() && e3.charAt(b) == '\"') {
                            int i8 = b + 1;
                            int e5 = com.facetec.sdk.nz.e(e3, i8, "\"");
                            str = e3.substring(i8, e5);
                            z = true;
                            i3 = e5 + 1;
                        } else {
                            z = true;
                            i3 = com.facetec.sdk.nz.e(e3, b, ",;");
                            str = e3.substring(b, i3).trim();
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(trim)) {
                        i2 = i3;
                        z3 = z;
                    } else if (io.ktor.client.utils.CacheControl.NO_STORE.equalsIgnoreCase(trim)) {
                        i2 = i3;
                        z4 = z;
                    } else {
                        if (io.ktor.client.utils.CacheControl.MAX_AGE.equalsIgnoreCase(trim)) {
                            i4 = com.facetec.sdk.nz.c(str, -1);
                        } else if (io.ktor.client.utils.CacheControl.S_MAX_AGE.equalsIgnoreCase(trim)) {
                            i5 = com.facetec.sdk.nz.c(str, -1);
                        } else if (io.ktor.client.utils.CacheControl.PRIVATE.equalsIgnoreCase(trim)) {
                            i2 = i3;
                            z5 = z;
                        } else if ("public".equalsIgnoreCase(trim)) {
                            i2 = i3;
                            z6 = z;
                        } else if (io.ktor.client.utils.CacheControl.MUST_REVALIDATE.equalsIgnoreCase(trim)) {
                            i2 = i3;
                            z7 = z;
                        } else if (io.ktor.client.utils.CacheControl.MAX_STALE.equalsIgnoreCase(trim)) {
                            i6 = com.facetec.sdk.nz.c(str, Integer.MAX_VALUE);
                        } else if (io.ktor.client.utils.CacheControl.MIN_FRESH.equalsIgnoreCase(trim)) {
                            i7 = com.facetec.sdk.nz.c(str, -1);
                        } else if (io.ktor.client.utils.CacheControl.ONLY_IF_CACHED.equalsIgnoreCase(trim)) {
                            i2 = i3;
                            z8 = z;
                        } else if (io.ktor.client.utils.CacheControl.NO_TRANSFORM.equalsIgnoreCase(trim)) {
                            i2 = i3;
                            z9 = z;
                        } else if ("immutable".equalsIgnoreCase(trim)) {
                            z10 = z;
                        }
                        i2 = i3;
                    }
                }
            }
            z2 = false;
            i2 = 0;
            while (i2 < e3.length()) {
            }
        }
        return new com.facetec.sdk.mf(z3, z4, i4, i5, z5, z6, z7, i6, i7, z8, z9, z10, !z2 ? null : str2);
    }

    public final java.lang.String toString() {
        java.lang.String obj;
        java.lang.String str = this.k;
        if (str != null) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.e) {
            sb.append("no-cache, ");
        }
        if (this.g) {
            sb.append("no-store, ");
        }
        if (this.i != -1) {
            sb.append("max-age=");
            sb.append(this.i);
            sb.append(", ");
        }
        if (this.h != -1) {
            sb.append("s-maxage=");
            sb.append(this.h);
            sb.append(", ");
        }
        if (this.c) {
            sb.append("private, ");
        }
        if (this.d) {
            sb.append("public, ");
        }
        if (this.f3642a) {
            sb.append("must-revalidate, ");
        }
        if (this.f != -1) {
            sb.append("max-stale=");
            sb.append(this.f);
            sb.append(", ");
        }
        if (this.j != -1) {
            sb.append("min-fresh=");
            sb.append(this.j);
            sb.append(", ");
        }
        if (this.b) {
            sb.append("only-if-cached, ");
        }
        if (this.f3643o) {
            sb.append("no-transform, ");
        }
        if (this.m) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            obj = "";
        } else {
            sb.delete(sb.length() - 2, sb.length());
            obj = sb.toString();
        }
        this.k = obj;
        return obj;
    }

    public static final class e {
        boolean c;
        boolean e;
        boolean f;
        boolean g;
        boolean j;

        /* renamed from: a, reason: collision with root package name */
        int f3644a = -1;
        int b = -1;
        int d = -1;

        public final com.facetec.sdk.mf e() {
            return new com.facetec.sdk.mf(this);
        }
    }
}
