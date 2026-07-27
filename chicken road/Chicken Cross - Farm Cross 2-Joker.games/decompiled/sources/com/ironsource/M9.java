package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class M9 {

    /* renamed from: a, reason: collision with root package name */
    private final int f7794a;
    private final String b;
    private final JSONObject c;
    private final C4647t d;
    private final C4647t e;
    private final C4647t f;

    public M9(int i, String controllerUrl, JSONObject controllerConfig, C4647t bannerConfig, C4647t interstitialConfig, C4647t rewardedConfig) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        Intrinsics.checkNotNullParameter(bannerConfig, "bannerConfig");
        Intrinsics.checkNotNullParameter(interstitialConfig, "interstitialConfig");
        Intrinsics.checkNotNullParameter(rewardedConfig, "rewardedConfig");
        this.f7794a = i;
        this.b = controllerUrl;
        this.c = controllerConfig;
        this.d = bannerConfig;
        this.e = interstitialConfig;
        this.f = rewardedConfig;
    }

    public final int a() {
        return this.f7794a;
    }

    public final String b() {
        return this.b;
    }

    public final JSONObject c() {
        return this.c;
    }

    public final C4647t d() {
        return this.d;
    }

    public final C4647t e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M9)) {
            return false;
        }
        M9 m9 = (M9) obj;
        return this.f7794a == m9.f7794a && Intrinsics.areEqual(this.b, m9.b) && Intrinsics.areEqual(this.c, m9.c) && Intrinsics.areEqual(this.d, m9.d) && Intrinsics.areEqual(this.e, m9.e) && Intrinsics.areEqual(this.f, m9.f);
    }

    public final C4647t f() {
        return this.f;
    }

    public final C4647t g() {
        return this.d;
    }

    public final JSONObject h() {
        return this.c;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f7794a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String i() {
        return this.b;
    }

    public final C4647t j() {
        return this.e;
    }

    public final int k() {
        return this.f7794a;
    }

    public final C4647t l() {
        return this.f;
    }

    public String toString() {
        return "IronSourceAdsInitConfig(logLevel=" + this.f7794a + ", controllerUrl=" + this.b + ", controllerConfig=" + this.c + ", bannerConfig=" + this.d + ", interstitialConfig=" + this.e + ", rewardedConfig=" + this.f + ")";
    }

    public final M9 a(int i, String controllerUrl, JSONObject controllerConfig, C4647t bannerConfig, C4647t interstitialConfig, C4647t rewardedConfig) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        Intrinsics.checkNotNullParameter(bannerConfig, "bannerConfig");
        Intrinsics.checkNotNullParameter(interstitialConfig, "interstitialConfig");
        Intrinsics.checkNotNullParameter(rewardedConfig, "rewardedConfig");
        return new M9(i, controllerUrl, controllerConfig, bannerConfig, interstitialConfig, rewardedConfig);
    }

    public static /* synthetic */ M9 a(M9 m9, int i, String str, JSONObject jSONObject, C4647t c4647t, C4647t c4647t2, C4647t c4647t3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = m9.f7794a;
        }
        if ((i2 & 2) != 0) {
            str = m9.b;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            jSONObject = m9.c;
        }
        JSONObject jSONObject2 = jSONObject;
        if ((i2 & 8) != 0) {
            c4647t = m9.d;
        }
        C4647t c4647t4 = c4647t;
        if ((i2 & 16) != 0) {
            c4647t2 = m9.e;
        }
        C4647t c4647t5 = c4647t2;
        if ((i2 & 32) != 0) {
            c4647t3 = m9.f;
        }
        return m9.a(i, str2, jSONObject2, c4647t4, c4647t5, c4647t3);
    }
}
