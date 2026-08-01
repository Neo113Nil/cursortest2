package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.measurement.AppMeasurement;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class h2 {
    public static final h2 A;
    public static final h2 A0;
    public static final h2 B;
    public static final h2 B0;
    public static final h2 C;
    public static final h2 C0;
    public static final h2 D;
    public static final h2 D0;
    public static final h2 E;
    public static final h2 E0;
    public static final h2 F;
    public static final h2 F0;
    public static final h2 G;
    public static final h2 G0;
    public static final h2 H;
    public static final h2 H0;
    public static final h2 I;
    public static final h2 I0;
    public static final h2 J;
    public static final h2 J0;
    public static final h2 K;
    public static final h2 K0;
    public static final h2 L;
    public static final h2 L0;
    public static final h2 M;
    public static final h2 M0;
    public static final h2 N;
    public static final h2 N0;
    public static final h2 O;
    public static final h2 O0;
    public static final h2 P;
    public static final h2 P0;
    public static final h2 Q;
    public static final h2 Q0;
    public static final h2 R;
    public static final h2 R0;
    public static final h2 S;
    public static final h2 S0;
    public static final h2 T;
    public static final h2 T0;
    public static final h2 U;
    public static final h2 U0;
    public static final h2 V;
    public static final h2 V0;
    public static final h2 W;
    public static final h2 W0;
    public static final h2 X;
    public static final h2 X0;
    public static final h2 Y;
    public static final h2 Y0;
    public static final h2 Z;
    public static final h2 Z0;
    public static final h2 a0;
    public static final h2 a1;
    public static final h2 b0;
    public static final h2 b1;
    private static JSONObject c;
    public static final h2 c0;
    public static final h2 c1;
    public static final h2 d;
    public static final h2 d0;
    public static final h2 d1;
    public static final h2 e;
    public static final h2 e0;
    public static final h2 e1;
    public static final h2 f;
    public static final h2 f0;
    public static final h2 f1;
    public static final h2 g;
    public static final h2 g0;
    public static final h2 g1;
    public static final h2 h;
    public static final h2 h0;
    public static final h2 h1;
    public static final h2 i;
    public static final h2 i0;
    public static final h2 i1;
    public static final h2 j;
    public static final h2 j0;
    public static final h2 j1;
    public static final h2 k;
    public static final h2 k0;
    public static final h2 k1;
    public static final h2 l;
    public static final h2 l0;
    public static final h2 l1;
    public static final h2 m;
    public static final h2 m0;
    public static final h2 m1;
    public static final h2 n;
    public static final h2 n0;
    public static final h2 n1;
    public static final h2 o;
    public static final h2 o0;
    public static final h2 o1;
    public static final h2 p;
    public static final h2 p0;
    public static final h2 p1;
    public static final h2 q;
    public static final h2 q0;
    public static final h2 q1;
    public static final h2 r;
    public static final h2 r0;
    public static final h2 s;
    public static final h2 s0;
    public static final h2 t;
    public static final h2 t0;
    public static final h2 u;
    public static final h2 u0;
    public static final h2 v;
    public static final h2 v0;
    public static final h2 w;
    public static final h2 w0;
    public static final h2 x;
    public static final h2 x0;
    public static final h2 y;
    public static final h2 y0;
    public static final h2 z;
    public static final h2 z0;

    /* renamed from: a, reason: collision with root package name */
    private final String f4227a;
    private final b b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4228a;

        static {
            int[] iArr = new int[b.values().length];
            f4228a = iArr;
            try {
                iArr[b.AD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4228a[b.MEDIATED_AD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4228a[b.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4228a[b.USER_SESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        AD,
        MEDIATED_AD,
        ERROR,
        USER_SESSION
    }

    static {
        b bVar = b.ERROR;
        d = new h2("generic", bVar);
        b bVar2 = b.USER_SESSION;
        e = new h2("sdk_init", bVar2);
        f = new h2("cache_init", bVar2);
        g = new h2("generic_user_session_info", bVar2);
        h = new h2("third_party_sdks_detected", bVar2);
        i = new h2("fetch_basic_settings_started", bVar2);
        j = new h2("fetch_basic_settings_success", bVar2);
        k = new h2("fetch_basic_settings_failure", bVar2);
        l = new h2("pub_init_callback", bVar2);
        m = new h2("sdk_extra_parameter_set", bVar2);
        n = new h2("app_validation_success", bVar2);
        o = new h2("app_validation_failure", bVar2);
        p = new h2("ad_reshow_skipped_after_user_swiped_app", bVar2);
        q = new h2("consent_flow_started", bVar2);
        r = new h2("terms_and_privacy_policy_alert_shown", bVar2);
        s = new h2("terms_and_privacy_policy_alert_hidden", bVar2);
        t = new h2("cmp_load_started", bVar2);
        u = new h2("cmp_load_success", bVar2);
        v = new h2("cmp_load_failure", bVar2);
        w = new h2("cmp_show_attempted", bVar2);
        x = new h2("cmp_show_failure", bVar2);
        y = new h2("cmp_hidden", bVar2);
        z = new h2("consent_flow_completed", bVar2);
        b bVar3 = b.AD;
        A = new h2("ad_requested", bVar3);
        B = new h2("ad_request_success", bVar3);
        C = new h2("ad_request_failure", bVar3);
        D = new h2("ad_load_success", bVar3);
        E = new h2("ad_load_failure", bVar3);
        F = new h2("ad_display_attempted", bVar3);
        G = new h2("ad_displayed", bVar3);
        H = new h2("ad_reshown", bVar3);
        I = new h2("ad_display_failure", bVar3);
        J = new h2("ad_hidden", bVar3);
        K = new h2("reward_reporting_error", bVar3);
        L = new h2("reward_validation_error", bVar3);
        M = new h2("user_not_rewarded", bVar3);
        N = new h2("original_resource_urls_restored", bVar3);
        O = new h2("resource_load_started", bVar3);
        P = new h2("resource_retrieved_from_cache", bVar3);
        Q = new h2("resource_load_success", bVar3);
        R = new h2("resource_load_failure", bVar3);
        S = new h2("resource_download_started", bVar3);
        T = new h2("resource_stream_loaded", bVar3);
        U = new h2("resource_download_success", bVar3);
        V = new h2("resource_download_failure", bVar3);
        W = new h2("invalid_mpd_manifest", bVar3);
        X = new h2("ad_persist_request", bVar3);
        Y = new h2("ad_persist_success", bVar3);
        Z = new h2("ad_persist_failure", bVar3);
        a0 = new h2("persisted_ad_requested", bVar3);
        b0 = new h2("persisted_ad_load_success", bVar3);
        c0 = new h2("persisted_ad_load_failure", bVar3);
        d0 = new h2("persisted_ad_expired", bVar3);
        e0 = new h2("custom_intent_launch_success", bVar3);
        f0 = new h2("custom_intent_launch_failure", bVar3);
        b bVar4 = b.MEDIATED_AD;
        g0 = new h2("adapter_init_started", bVar4);
        h0 = new h2("adapter_init_success", bVar4);
        i0 = new h2("adapter_init_failure", bVar4);
        j0 = new h2("signal_collection_success", bVar4);
        k0 = new h2("signal_collection_failure", bVar4);
        l0 = new h2("mediated_ad_requested", bVar4);
        m0 = new h2("mediated_ad_request_success", bVar4);
        n0 = new h2("mediated_ad_request_failure", bVar4);
        o0 = new h2("mediated_ad_load_started", bVar4);
        p0 = new h2("mediated_ad_load_success", bVar4);
        q0 = new h2("mediated_ad_load_failure", bVar4);
        r0 = new h2("waterfall_processing_complete", bVar4);
        s0 = new h2("mediated_ad_display_attempted", bVar4);
        t0 = new h2("mediated_ad_displayed", bVar4);
        u0 = new h2("mediated_ad_viewability_impression_called", bVar4);
        v0 = new h2("mediated_ad_display_failure", bVar4);
        w0 = new h2("mediated_ad_hidden", bVar4);
        x0 = new h2("mediated_ad_hidden_callback_not_called", bVar4);
        y0 = new h2("mediated_ad_reward_reporting_error", bVar4);
        z0 = new h2("mediated_ad_reward_validation_error", bVar4);
        A0 = new h2("user_not_rewarded_for_mediated_ad", bVar4);
        B0 = new h2("mediated_ad_extra_parameter_set", bVar4);
        C0 = new h2("mediated_ad_failover_missing_cached_ad", bVar4);
        D0 = new h2("mediated_ad_failover_attempted", bVar4);
        E0 = new h2("mediated_ad_failover_success", bVar4);
        F0 = new h2("mediated_ad_failover_failure", bVar4);
        G0 = new h2("missing_failover_ad_in_waterfall", bVar4);
        H0 = new h2("failover_ad_load_started", bVar4);
        I0 = new h2("failover_ad_load_success", bVar4);
        J0 = new h2("failover_ad_load_failure", bVar4);
        K0 = new h2("failover_ad_ecpm_below_floor", bVar4);
        L0 = new h2("failover_ad_expired_in_cache", bVar4);
        M0 = new h2("failover_ad_evicted_from_cache", bVar4);
        N0 = new h2("activity_destroyed_by_app_relaunch", bVar);
        O0 = new h2("activity_missing", bVar);
        P0 = new h2("ad_context_violation", bVar);
        Q0 = new h2("al_fs_activity_finished_externally", bVar);
        R0 = new h2("anr", bVar);
        S0 = new h2("app_exit_info_stack_trace", bVar);
        T0 = new h2("app_killed_during_ad", bVar);
        U0 = new h2("app_killed_during_mediated_ad", bVar);
        V0 = new h2("auto_redirect", bVar);
        W0 = new h2("black_view_detected", bVar);
        X0 = new h2("black_view", bVar);
        Y0 = new h2("cache_error", bVar);
        Z0 = new h2("caught_exception", bVar);
        a1 = new h2("consent_flow_error", bVar);
        b1 = new h2(AppMeasurement.CRASH_ORIGIN, bVar);
        c1 = new h2("file_error", bVar);
        d1 = new h2("haptic_error", bVar);
        e1 = new h2("integration_error", bVar);
        f1 = new h2("media_error", bVar);
        g1 = new h2("memory_leak", bVar);
        h1 = new h2("native_error", bVar);
        i1 = new h2("network_error", bVar);
        j1 = new h2("task_exception", bVar);
        k1 = new h2("task_latency_alert", bVar);
        l1 = new h2("template_error", bVar);
        m1 = new h2("unexpected_state", bVar);
        n1 = new h2("web_view_error", bVar);
        o1 = new h2("payload_decode_failure", bVar);
        p1 = new h2("request_encode_failure", bVar);
        q1 = new h2("response_decode_failure", bVar);
    }

    public h2(String str, b bVar) {
        this.f4227a = str;
        this.b = bVar;
    }

    public b a() {
        return this.b;
    }

    public String b() {
        return this.f4227a;
    }

    public double a(com.applovin.impl.sdk.l lVar) {
        if (t7.k(com.applovin.impl.sdk.l.p())) {
            return 100.0d;
        }
        double a2 = a(this.f4227a, lVar);
        if (a2 >= 0.0d) {
            return a2;
        }
        double a3 = a(this.b, lVar);
        return a3 >= 0.0d ? a3 : ((Float) lVar.a(c5.H)).floatValue();
    }

    private double a(String str, com.applovin.impl.sdk.l lVar) {
        if (c == null) {
            c = JsonUtils.deserialize((String) lVar.a(c5.D));
        }
        Double d2 = JsonUtils.getDouble(c, str, (Double) null);
        if (d2 != null) {
            return d2.doubleValue();
        }
        return -1.0d;
    }

    private double a(b bVar, com.applovin.impl.sdk.l lVar) {
        float floatValue;
        int i2 = a.f4228a[bVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            floatValue = ((Float) lVar.a(c5.E)).floatValue();
        } else if (i2 == 3) {
            floatValue = ((Float) lVar.a(c5.F)).floatValue();
        } else {
            if (i2 != 4) {
                return -1.0d;
            }
            floatValue = ((Float) lVar.a(c5.G)).floatValue();
        }
        return floatValue;
    }
}
