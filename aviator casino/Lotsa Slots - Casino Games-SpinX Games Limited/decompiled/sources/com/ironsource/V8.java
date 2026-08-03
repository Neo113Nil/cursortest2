package com.ironsource;

/* loaded from: classes5.dex */
public final class V8 {
    public static final com.ironsource.V8.a c = new com.ironsource.V8.a(null);
    public static final java.lang.String d = "auctionId";
    public static final java.lang.String e = "adUnit";
    public static final java.lang.String f = "adFormat";
    public static final java.lang.String g = "mediationAdUnitName";
    public static final java.lang.String h = "mediationAdUnitId";
    public static final java.lang.String i = "country";
    public static final java.lang.String j = "ab";
    public static final java.lang.String k = "segmentName";
    public static final java.lang.String l = "placement";
    public static final java.lang.String m = "adNetwork";
    public static final java.lang.String n = "instanceName";
    public static final java.lang.String o = "instanceId";
    public static final java.lang.String p = "revenue";
    public static final java.lang.String q = "precision";
    public static final java.lang.String r = "encryptedCPM";
    public static final java.lang.String s = "creativeId";

    /* renamed from: a, reason: collision with root package name */
    private final com.unity3d.mediation.LevelPlayAdInfo f6023a;
    private final java.text.DecimalFormat b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public V8(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6023a = adInfo;
        this.b = new java.text.DecimalFormat("#.#####");
    }

    public final java.lang.String a() {
        return this.f6023a.getAb();
    }

    public final java.lang.String b() {
        return this.f6023a.getAdFormat();
    }

    public final java.lang.String c() {
        return this.f6023a.getAdNetwork();
    }

    public final org.json.JSONObject d() {
        return this.f6023a.impressionData$mediationsdk_release();
    }

    public final java.lang.String e() {
        return this.f6023a.getAuctionId();
    }

    public final java.lang.String f() {
        return this.f6023a.getCountry();
    }

    public final java.lang.String g() {
        return this.f6023a.getCreativeId();
    }

    public final java.lang.String h() {
        return this.f6023a.getEncryptedCPM();
    }

    public final java.lang.String i() {
        return this.f6023a.getInstanceId();
    }

    public final java.lang.String j() {
        return this.f6023a.getInstanceName();
    }

    public final java.lang.String k() {
        return this.f6023a.getAdUnitId();
    }

    public final java.lang.String l() {
        return this.f6023a.getAdUnitName();
    }

    public final java.lang.String m() {
        return this.f6023a.getPlacementName();
    }

    public final java.lang.String n() {
        return this.f6023a.getImpressionPrecision$mediationsdk_release();
    }

    public final double o() {
        return this.f6023a.getImpressionRevenue$mediationsdk_release();
    }

    public final java.lang.String p() {
        return this.f6023a.getSegmentName();
    }

    public java.lang.String toString() {
        java.lang.String e2 = e();
        java.lang.String l2 = l();
        java.lang.String k2 = k();
        java.lang.String b = b();
        java.lang.String f2 = f();
        java.lang.String a2 = a();
        java.lang.String p2 = p();
        java.lang.String m2 = m();
        java.lang.String c2 = c();
        java.lang.String j2 = j();
        java.lang.String i2 = i();
        o();
        return "auctionId: '" + e2 + "', mediationAdUnitName: '" + l2 + "', mediationAdUnitId: '" + k2 + "', adFormat: '" + b + "', country: '" + f2 + "', ab: '" + a2 + "', segmentName: '" + p2 + "', placement: '" + m2 + "', adNetwork: '" + c2 + "', instanceName: '" + j2 + "', instanceId: '" + i2 + "', revenue: " + this.b.format(o()) + ", precision: '" + n() + "', encryptedCPM: '" + h() + "', creativeId: '" + g() + "'";
    }
}
