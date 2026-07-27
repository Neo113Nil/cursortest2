package com.applovin.impl;

import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public class e5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f4182a;
    private final Class b;
    public static final e5 c = new e5("com.applovin.sdk.impl.isFirstRun", String.class);
    public static final e5 d = new e5("com.applovin.sdk.launched_before", Boolean.class);
    public static final e5 e = new e5("com.applovin.sdk.launch_count", Long.class);
    public static final e5 f = new e5("com.applovin.sdk.last_launch_timestamp", Long.class);
    public static final e5 g = new e5("com.applovin.sdk.latest_installed_version", String.class);
    public static final e5 h = new e5("com.applovin.sdk.install_date", Long.class);
    public static final e5 i = new e5("com.applovin.sdk.av", Boolean.class);
    public static final e5 j = new e5("com.applovin.sdk.save_settings_with_sdk_key_agnostic_name", Boolean.class);
    public static final e5 k = new e5("com.applovin.sdk.user_id", String.class);
    public static final e5 l = new e5("com.applovin.sdk.compass_random_token", String.class);
    public static final e5 m = new e5("com.applovin.sdk.applovin_random_token", String.class);
    public static final e5 n = new e5("com.applovin.sdk.alart", String.class);
    public static final e5 o = new e5("com.applovin.sdk.aleid", String.class);
    public static final e5 p = new e5("com.applovin.sdk.device_test_group", String.class);
    public static final e5 q = new e5("com.applovin.sdk.compliance.has_user_consent", Boolean.class);
    public static final e5 r = new e5("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);
    public static final e5 s = new e5("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);
    public static final e5 t = new e5("com.applovin.sdk.has_seen_but_not_accepted_privacy_policy", Boolean.class);
    public static final e5 u = new e5("IABTCF_CmpSdkID", Object.class);
    public static final e5 v = new e5("IABTCF_CmpSdkVersion", Object.class);
    public static final e5 w = new e5("IABTCF_gdprApplies", Object.class);
    public static final e5 x = new e5(AndroidTcfDataSource.TCF_TCSTRING_KEY, String.class);
    public static final e5 y = new e5("IABTCF_AddtlConsent", String.class);
    public static final e5 z = new e5("IABTCF_VendorConsents", String.class);
    public static final e5 A = new e5("IABTCF_VendorLegitimateInterests", String.class);
    public static final e5 B = new e5("IABTCF_PurposeConsents", String.class);
    public static final e5 C = new e5("IABTCF_PurposeLegitimateInterests", String.class);
    public static final e5 D = new e5("IABTCF_SpecialFeaturesOptIns", String.class);
    public static final e5 E = new e5("com.applovin.sdk.impl.ad.persistence.queue", String.class);
    public static final e5 F = new e5("com.applovin.sdk.mediation.signal_providers", String.class);
    public static final e5 G = new e5("com.applovin.sdk.mediation.auto_init_adapters", String.class);
    public static final e5 H = new e5("com.applovin.sdk.persisted_data", String.class);
    public static final e5 I = new e5("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);
    public static final e5 J = new e5("com.applovin.sdk.mediation.should_use_applovin_adaptive_sizing_formula", Boolean.class);
    public static final e5 K = new e5("com.applovin.sdk.mediation.stats_per_ad_unit_since_install", String.class);
    public static final e5 L = new e5("com.applovin.sdk.mediation.stats_per_ad_format_since_install", String.class);
    public static final e5 M = new e5("com.applovin.sdk.user_agent", String.class);
    public static final e5 N = new e5("com.applovin.sdk.last_fullscreen_ad_timestamp_ms", Long.class);
    public static final e5 O = new e5("com.applovin.sdk.last_fullscreen_ad_duration_ms", Long.class);
    public static final e5 P = new e5("com.applovin.sdk.app_killed_urls_from_last_ad", String.class);
    public static final e5 Q = new e5("com.applovin.sdk.app_killed_last_ad_data", String.class);
    public static final e5 R = new e5("com.applovin.sdk.app_killed_last_mediated_ad_tracking_info", String.class);
    public static final e5 S = new e5("com.applovin.sdk.last_mediated_fullscreen_ad_duration_ms", Long.class);
    public static final e5 T = new e5("com.applovin.sdk.last_network_throughput_measurement_kbps", Long.class);
    public static final e5 U = new e5("com.applovin.sdk.network_throughput_measurement_snapshots", String.class);
    public static final e5 V = new e5("com.applovin.sdk.template_browser_package_name", String.class);

    public e5(String str, Class cls) {
        this.f4182a = str;
        this.b = cls;
    }

    public String a() {
        return this.f4182a;
    }

    public Class b() {
        return this.b;
    }

    public String toString() {
        return "Key{name='" + this.f4182a + "', type=" + this.b + AbstractJsonLexerKt.END_OBJ;
    }
}
