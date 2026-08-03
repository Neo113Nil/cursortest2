package com.ironsource;

/* loaded from: classes5.dex */
public final class P {
    public static final com.ironsource.P.a f = new com.ironsource.P.a(null);
    public static final java.lang.String g = "0";
    public static final java.lang.String h = "0";
    public static final java.lang.String i = "0";
    public static final java.lang.String j = "0";

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.J9 f5886a;
    private com.ironsource.R7 b;
    private java.lang.String c;
    private com.ironsource.EnumC3194o0 d;
    private double e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public P(com.ironsource.J9 adInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        this.f5886a = adInstance;
        this.b = com.ironsource.R7.UnknownProvider;
        this.c = "0";
        this.d = com.ironsource.EnumC3194o0.LOAD_REQUEST;
        this.e = new java.util.Date().getTime() / 1000.0d;
    }

    public final com.ironsource.J9 a() {
        return this.f5886a;
    }

    public final com.ironsource.mediationsdk.IronSource.a b() {
        return this.f5886a.i() ? com.ironsource.mediationsdk.IronSource.a.BANNER : this.f5886a.n() ? com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO : com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL;
    }

    public final java.lang.String c() {
        java.lang.String e = this.f5886a.e();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "adInstance.id");
        return e;
    }

    public final com.ironsource.J9 d() {
        return this.f5886a;
    }

    public final com.ironsource.R7 e() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.P)) {
            return false;
        }
        com.ironsource.P p = (com.ironsource.P) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(c(), p.c()) && kotlin.jvm.internal.Intrinsics.areEqual(g(), p.g()) && b() == p.b() && kotlin.jvm.internal.Intrinsics.areEqual(i(), p.i()) && this.b == p.b && kotlin.jvm.internal.Intrinsics.areEqual(this.c, p.c) && this.d == p.d;
    }

    public final com.ironsource.EnumC3194o0 f() {
        return this.d;
    }

    public final java.lang.String g() {
        java.lang.String c = this.f5886a.c();
        return c == null ? "0" : c;
    }

    public final java.lang.String h() {
        return this.c;
    }

    public int hashCode() {
        return java.util.Objects.hash(c(), g(), b(), i(), this.b, this.c, this.d, java.lang.Double.valueOf(this.e));
    }

    public final java.lang.String i() {
        java.lang.String g2 = this.f5886a.g();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(g2, "adInstance.name");
        return g2;
    }

    public final double j() {
        return this.e;
    }

    public java.lang.String toString() {
        java.lang.String jSONObject = new org.json.JSONObject().put(com.ironsource.sdk.controller.f.b.c, c()).put("advertiserBundleId", this.c).put("adProvider", this.b.ordinal()).put("adStatus", this.d.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.e).put("adUnitId", g()).put("adFormat", b().toString()).put("instanceId", i()).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n        .pu…ceId)\n        .toString()");
        return jSONObject;
    }

    public final com.ironsource.P a(com.ironsource.J9 adInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return new com.ironsource.P(adInstance);
    }

    public static /* synthetic */ com.ironsource.P a(com.ironsource.P p, com.ironsource.J9 j9, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            j9 = p.f5886a;
        }
        return p.a(j9);
    }

    public final void a(com.ironsource.R7 r7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "<set-?>");
        this.b = r7;
    }

    public final void a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.c = str;
    }

    public final void a(com.ironsource.EnumC3194o0 enumC3194o0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumC3194o0, "<set-?>");
        this.d = enumC3194o0;
    }

    public final void a(double d) {
        this.e = d;
    }
}
