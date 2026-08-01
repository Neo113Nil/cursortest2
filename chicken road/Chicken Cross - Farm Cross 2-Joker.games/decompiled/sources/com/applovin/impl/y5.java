package com.applovin.impl;

import android.app.ActivityManager;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.i6;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.security.ProviderInstaller;
import com.ironsource.L6;
import com.ironsource.U3;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class y5 extends n5 {
    private static final AtomicBoolean j = new AtomicBoolean();
    private final int g;
    private final Object h;
    private b i;

    public interface b {
        void a(JSONObject jSONObject);
    }

    private class c extends n5 {
        public c(com.applovin.impl.sdk.l lVar) {
            super("TaskTimeoutFetchBasicSettings", lVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y5.this.i != null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.b(this.b, "Timing out fetch basic settings...");
                }
                y5.this.a(new JSONObject());
            }
        }
    }

    public y5(int i, com.applovin.impl.sdk.l lVar, b bVar) {
        super("TaskFetchBasicSettings", lVar, true);
        this.h = new Object();
        this.g = i;
        this.i = bVar;
    }

    private HashMap b(String str) {
        return a(str, 0L, 0, null, null);
    }

    private String f() {
        return s0.a((String) this.f4351a.a(c5.k0), "5.0/i", b());
    }

    private String g() {
        return s0.a((String) this.f4351a.a(c5.j0), "5.0/i", b());
    }

    protected JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.applovin.impl.sdk.l lVar = this.f4351a;
            c5 c5Var = c5.J5;
            if (((Boolean) lVar.a(c5Var)).booleanValue() || ((Boolean) this.f4351a.a(c5Var)).booleanValue()) {
                jSONObject.put("rid", UUID.randomUUID().toString());
            }
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", j.b());
            jSONObject.put("init_count", this.g);
            jSONObject.put("server_installed_at", this.f4351a.a(c5.o));
            if (this.f4351a.E0()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f4351a.B0()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "process_name", t7.c(a()));
            JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", t7.i(a()));
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.f4351a.a(c5.T3));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.f4351a.X());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.f4351a.D());
            jSONObject.put("installed_mediation_adapters", a4.b(this.f4351a));
            Map H = this.f4351a.B().H();
            jSONObject.put("package_name", H.get("package_name"));
            jSONObject.put("app_version", H.get("app_version"));
            jSONObject.put("debug", H.get("debug"));
            jSONObject.put("tg", H.get("tg"));
            jSONObject.put("target_sdk", H.get("target_sdk"));
            jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, H.get(SDKAnalyticsEvents.PARAMETER_SESSION_ID));
            List list = (List) H.get("application_start_info");
            if (!CollectionUtils.isEmpty(list)) {
                JsonUtils.putJsonArray(jSONObject, "application_start_info", new JSONArray((Collection) list));
            }
            List list2 = (List) H.get("application_exit_info");
            if (!CollectionUtils.isEmpty(list2)) {
                JsonUtils.putJsonArray(jSONObject, "application_exit_info", new JSONArray((Collection) list2));
            }
            List<String> adUnitIds = this.f4351a.L() != null ? this.f4351a.L().getAdUnitIds() : null;
            if (adUnitIds != null && adUnitIds.size() > 0) {
                List<String> removeTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(adUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(removeTrimmedEmptyStrings, removeTrimmedEmptyStrings.size()));
            }
            jSONObject.put(AndroidTcfDataSource.TCF_TCSTRING_KEY, H.get(AndroidTcfDataSource.TCF_TCSTRING_KEY));
            jSONObject.put("IABTCF_gdprApplies", H.get("IABTCF_gdprApplies"));
            Object obj = H.get("IABTCF_AddtlConsent");
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, "IABTCF_AddtlConsent", (String) obj);
            }
            jSONObject.put("consent_flow_info", this.f4351a.y().b());
            Map O = this.f4351a.B().O();
            jSONObject.put(L6.H, O.get(L6.H));
            jSONObject.put(L6.F, O.get(L6.F));
            jSONObject.put("locale", O.get("locale"));
            jSONObject.put("brand", O.get("brand"));
            jSONObject.put("brand_name", O.get("brand_name"));
            jSONObject.put("hardware", O.get("hardware"));
            jSONObject.put("model", O.get("model"));
            jSONObject.put("revision", O.get("revision"));
            jSONObject.put("is_tablet", O.get("is_tablet"));
            jSONObject.put("screen_size_in", O.get("screen_size_in"));
            jSONObject.put("supported_abis", O.get("supported_abis"));
            if (((Boolean) this.f4351a.a(c5.e4)).booleanValue()) {
                jSONObject.put("mtl", this.f4351a.o0().getLastTrimMemoryLevel());
            }
            try {
                ActivityManager activityManager = (ActivityManager) com.applovin.impl.sdk.l.p().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            v.a f = this.f4351a.B().f();
            jSONObject.put("dnt", f.c());
            jSONObject.put("dnt_code", f.b().b());
            Boolean b2 = q0.c().b(a());
            if (((Boolean) this.f4351a.a(c5.O3)).booleanValue() && StringUtils.isValidString(f.a()) && !Boolean.TRUE.equals(b2)) {
                jSONObject.put("idfa", f.a());
            }
            m.b I = this.f4351a.B().I();
            if (((Boolean) this.f4351a.a(c5.H3)).booleanValue() && I != null && !Boolean.TRUE.equals(b2)) {
                jSONObject.put("idfv", I.f4481a);
                jSONObject.put("idfv_scope", I.b);
            }
            if (((Boolean) this.f4351a.a(c5.K3)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f4351a.v());
            }
            if (((Boolean) this.f4351a.a(c5.M3)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f4351a.j0());
            }
            if (((Boolean) this.f4351a.a(c5.Q3)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "art", this.f4351a.s());
            }
            JsonUtils.putStringIfValid(jSONObject, "eventid", this.f4351a.F());
            if (this.f4351a.u0().c()) {
                jSONObject.put("test_mode", true);
            }
            List b3 = this.f4351a.u0().b();
            if (b3 != null && !b3.isEmpty()) {
                jSONObject.put("test_mode_networks", b3);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f4351a.p0().getExtraParameters()));
            Map m0 = this.f4351a.m0();
            if (!CollectionUtils.isEmpty(m0)) {
                jSONObject.put("segments", new JSONObject(m0));
            }
        } catch (JSONException e) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Failed to create JSON body", e);
            }
            this.f4351a.E().a(this.b, "createJSONBody", e);
        }
        return jSONObject;
    }

    protected Map h() {
        HashMap hashMap = new HashMap();
        if (!((Boolean) this.f4351a.a(c5.K5)).booleanValue() && !((Boolean) this.f4351a.a(c5.J5)).booleanValue()) {
            hashMap.put("rid", UUID.randomUUID().toString());
        }
        if (!((Boolean) this.f4351a.a(c5.u5)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f4351a.k0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f4351a.r(), hashMap);
        Boolean b2 = q0.b().b(a());
        if (b2 != null) {
            hashMap.put("huc", b2.toString());
        }
        Boolean b3 = q0.c().b(a());
        if (b3 != null) {
            hashMap.put("aru", b3.toString());
        }
        Boolean b4 = q0.a().b(a());
        if (b4 != null) {
            hashMap.put("dns", b4.toString());
        }
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!p0.f() && j.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(com.applovin.impl.sdk.l.p());
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.a(this.b, "Cannot update security provider", th);
                }
            }
        }
        this.f4351a.x0().d(h2.i, b(g()));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.applovin.impl.sdk.network.a a2 = com.applovin.impl.sdk.network.a.a(this.f4351a).b(g()).a(f()).b(h()).a(e()).b(((Boolean) this.f4351a.a(c5.W5)).booleanValue()).c("POST").a((Object) new JSONObject()).a(((Integer) this.f4351a.a(c5.k3)).intValue()).b(((Integer) this.f4351a.a(c5.n3)).intValue()).c(((Integer) this.f4351a.a(c5.j3)).intValue()).e(((Boolean) this.f4351a.a(c5.w3)).booleanValue()).a(z4.a.a(((Integer) this.f4351a.a(c5.z5)).intValue())).f(true).a();
        this.f4351a.s0().a(new c(this.f4351a), i6.b.TIMEOUT, ((Integer) this.f4351a.a(r3)).intValue() + 250);
        a aVar = new a(a2, this.f4351a, d(), elapsedRealtime);
        aVar.c(c5.j0);
        aVar.b(c5.k0);
        this.f4351a.s0().a(aVar);
    }

    class a extends r6 {
        final /* synthetic */ long n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar, boolean z, long j) {
            super(aVar, lVar, z);
            this.n = j;
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.n;
            y5.this.a(jSONObject);
            this.f4351a.x0().d(h2.j, y5.this.a(str, elapsedRealtime, i, jSONObject, null));
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Unable to fetch basic SDK settings: server returned " + i);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.n;
            y5.this.a(jSONObject != null ? jSONObject : new JSONObject());
            this.f4351a.x0().d(h2.k, y5.this.a(str, elapsedRealtime, i, jSONObject, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(String str, long j2, int i, JSONObject jSONObject, String str2) {
        Uri build = Uri.parse(str).buildUpon().clearQuery().build();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, U3.j.D, build.getHost());
        if (jSONObject != null) {
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "auto_init_adapters", null);
            if (jSONArray != null) {
                JsonUtils.putInt(jSONObject2, "signal_provider_count", jSONArray.length());
            }
            if (jSONArray2 != null) {
                JsonUtils.putInt(jSONObject2, "auto_init_adapter_count", jSONArray2.length());
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("attempt_number", Integer.toString(this.g));
        hashMap.put("error_message", str2);
        hashMap.put("url", build.toString());
        hashMap.put("details", jSONObject2.toString());
        hashMap.put("duration_ms", Long.toString(j2));
        hashMap.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, Integer.toString(i));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.h) {
            bVar = this.i;
            this.i = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
