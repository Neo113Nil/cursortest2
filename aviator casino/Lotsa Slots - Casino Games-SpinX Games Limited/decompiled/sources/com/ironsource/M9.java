package com.ironsource;

/* loaded from: classes5.dex */
public final class M9 {

    /* renamed from: a, reason: collision with root package name */
    private final int f5825a;
    private final java.lang.String b;
    private final org.json.JSONObject c;
    private final com.ironsource.C3282t d;
    private final com.ironsource.C3282t e;
    private final com.ironsource.C3282t f;

    public M9(int i, java.lang.String controllerUrl, org.json.JSONObject controllerConfig, com.ironsource.C3282t bannerConfig, com.ironsource.C3282t interstitialConfig, com.ironsource.C3282t rewardedConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerConfig, "bannerConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialConfig, "interstitialConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardedConfig, "rewardedConfig");
        this.f5825a = i;
        this.b = controllerUrl;
        this.c = controllerConfig;
        this.d = bannerConfig;
        this.e = interstitialConfig;
        this.f = rewardedConfig;
    }

    public final int a() {
        return this.f5825a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final org.json.JSONObject c() {
        return this.c;
    }

    public final com.ironsource.C3282t d() {
        return this.d;
    }

    public final com.ironsource.C3282t e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.M9)) {
            return false;
        }
        com.ironsource.M9 m9 = (com.ironsource.M9) obj;
        return this.f5825a == m9.f5825a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, m9.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, m9.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, m9.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, m9.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, m9.f);
    }

    public final com.ironsource.C3282t f() {
        return this.f;
    }

    public final com.ironsource.C3282t g() {
        return this.d;
    }

    public final org.json.JSONObject h() {
        return this.c;
    }

    public int hashCode() {
        return (((((((((this.f5825a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final java.lang.String i() {
        return this.b;
    }

    public final com.ironsource.C3282t j() {
        return this.e;
    }

    public final int k() {
        return this.f5825a;
    }

    public final com.ironsource.C3282t l() {
        return this.f;
    }

    public java.lang.String toString() {
        return "IronSourceAdsInitConfig(logLevel=" + this.f5825a + ", controllerUrl=" + this.b + ", controllerConfig=" + this.c + ", bannerConfig=" + this.d + ", interstitialConfig=" + this.e + ", rewardedConfig=" + this.f + ")";
    }

    public final com.ironsource.M9 a(int i, java.lang.String controllerUrl, org.json.JSONObject controllerConfig, com.ironsource.C3282t bannerConfig, com.ironsource.C3282t interstitialConfig, com.ironsource.C3282t rewardedConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerConfig, "bannerConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialConfig, "interstitialConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardedConfig, "rewardedConfig");
        return new com.ironsource.M9(i, controllerUrl, controllerConfig, bannerConfig, interstitialConfig, rewardedConfig);
    }

    public static /* synthetic */ com.ironsource.M9 a(com.ironsource.M9 m9, int i, java.lang.String str, org.json.JSONObject jSONObject, com.ironsource.C3282t c3282t, com.ironsource.C3282t c3282t2, com.ironsource.C3282t c3282t3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = m9.f5825a;
        }
        if ((i2 & 2) != 0) {
            str = m9.b;
        }
        java.lang.String str2 = str;
        if ((i2 & 4) != 0) {
            jSONObject = m9.c;
        }
        org.json.JSONObject jSONObject2 = jSONObject;
        if ((i2 & 8) != 0) {
            c3282t = m9.d;
        }
        com.ironsource.C3282t c3282t4 = c3282t;
        if ((i2 & 16) != 0) {
            c3282t2 = m9.e;
        }
        com.ironsource.C3282t c3282t5 = c3282t2;
        if ((i2 & 32) != 0) {
            c3282t3 = m9.f;
        }
        return m9.a(i, str2, jSONObject2, c3282t4, c3282t5, c3282t3);
    }
}
