package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.applovin.impl.h2;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.L6;
import com.ironsource.U3;
import java.io.OutputStream;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class i2 {
    private static volatile ExecutorService g;

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f4236a;
    protected final com.applovin.impl.sdk.p b;
    private final h2.b c;
    private final Map d = Collections.synchronizedMap(new HashMap());
    private final Set e = Collections.synchronizedSet(new HashSet());
    private static final int f = (int) TimeUnit.SECONDS.toMillis(30);
    private static final Object h = new Object();

    class a implements ThreadFactory {

        /* renamed from: com.applovin.impl.i2$a$a, reason: collision with other inner class name */
        class C0073a implements Thread.UncaughtExceptionHandler {
            C0073a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                i2.this.f4236a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    i2.this.f4236a.Q().a("HealthEventsReporter", "Caught unhandled exception", th);
                }
            }
        }

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:health_events_reporter");
            thread.setDaemon(true);
            thread.setPriority(((Integer) i2.this.f4236a.a(c5.S)).intValue());
            thread.setUncaughtExceptionHandler(new C0073a());
            return thread;
        }
    }

    public i2(com.applovin.impl.sdk.l lVar, h2.b bVar) {
        this.f4236a = lVar;
        this.b = lVar.Q();
        this.c = bVar;
        a();
    }

    private void a() {
        if (g != null) {
            return;
        }
        synchronized (h) {
            if (g != null) {
                return;
            }
            g = Executors.newFixedThreadPool(1, new a());
        }
    }

    private void c(h2 h2Var, List list) {
        HttpURLConnection httpURLConnection;
        Throwable th;
        if (h2Var.a() == h2.b.AD || h2Var.a() == h2.b.MEDIATED_AD || h2Var.a() == h2.b.USER_SESSION || !t7.a(((Integer) this.f4236a.a(c5.B)).intValue())) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            try {
                httpURLConnection = (HttpURLConnection) a(h2Var, map).openConnection();
                try {
                    int i = f;
                    httpURLConnection.setConnectTimeout(i);
                    httpURLConnection.setReadTimeout(i);
                    httpURLConnection.setDefaultUseCaches(false);
                    httpURLConnection.setAllowUserInteraction(false);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("AppLovin-Event-Type", h2Var.b());
                    int responseCode = httpURLConnection.getResponseCode();
                    if (com.applovin.impl.sdk.p.a()) {
                        this.b.a("HealthEventsReporter", h2Var.b() + " reported with code " + responseCode + " and extra parameters " + map);
                    }
                    this.d.put(h2Var, Long.valueOf(System.currentTimeMillis()));
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (com.applovin.impl.sdk.p.a()) {
                            this.b.d("HealthEventsReporter", "Failed to report " + h2Var.b() + " with extra parameters " + map, th);
                        }
                        t7.a(httpURLConnection, this.f4236a);
                    } finally {
                        t7.a(httpURLConnection, this.f4236a);
                    }
                }
            } catch (Throwable th3) {
                httpURLConnection = null;
                th = th3;
            }
        }
    }

    public void d(h2 h2Var, Map map) {
        a(h2Var, map, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(String str, h2 h2Var, JSONObject jSONObject) {
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(str);
            byte[] bytes = jSONObject.toString().getBytes("UTF-8");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            try {
                int i = f;
                httpURLConnection2.setConnectTimeout(i);
                httpURLConnection2.setReadTimeout(i);
                httpURLConnection2.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                httpURLConnection2.setDefaultUseCaches(false);
                httpURLConnection2.setAllowUserInteraction(false);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setInstanceFollowRedirects(true);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setFixedLengthStreamingMode(bytes.length);
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setRequestProperty("AppLovin-Event-Type", h2Var.b());
                OutputStream outputStream = httpURLConnection2.getOutputStream();
                outputStream.write(bytes);
                outputStream.close();
                int responseCode = httpURLConnection2.getResponseCode();
                if (com.applovin.impl.sdk.p.a()) {
                    this.b.a("HealthEventsReporter", h2Var.b() + " reported with code " + responseCode);
                }
                this.d.put(h2Var, Long.valueOf(System.currentTimeMillis()));
                t7.a(httpURLConnection2, this.f4236a);
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.b.d("HealthEventsReporter", "Failed to report " + h2Var.b(), th);
                    }
                } finally {
                    t7.a(httpURLConnection, this.f4236a);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void d(final h2 h2Var, List list) {
        final String str = (String) this.f4236a.a(c5.C);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        double a2 = h2Var.a(this.f4236a);
        if (t7.a(a2)) {
            if (((Boolean) this.f4236a.a(c5.I)).booleanValue()) {
                a(str, h2Var, a(h2Var, a2, list));
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final JSONObject a3 = a(h2Var, a2, Collections.singletonList((Map) it.next()));
                g.execute(new Runnable() { // from class: com.applovin.impl.i2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        i2.this.a(str, h2Var, a3);
                    }
                });
            }
        }
    }

    public void a(h2 h2Var, String str) {
        a(h2Var, str, new HashMap());
    }

    public void a(h2 h2Var, String str, Map map) {
        map.put("source", str);
        d(h2Var, map);
    }

    public void a(h2 h2Var, String str, Map map, String str2) {
        if (!StringUtils.isValidString(str2) || this.e.add(str2)) {
            map.put("source", str);
            a(h2Var, str, map);
        }
    }

    public void a(h2 h2Var, Map map, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        a(h2Var, arrayList, j);
    }

    private Map b(h2 h2Var, Map map) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", h2Var.b());
        if (h2Var == h2.X0 || h2Var == h2.W0 || h2Var == h2.n1 || h2Var == h2.l1) {
            if (((Boolean) this.f4236a.a(c5.w4)).booleanValue()) {
                CollectionUtils.putStringIfValid("wvvc", String.valueOf(r8.d()), hashMap);
                CollectionUtils.putStringIfValid("wvv", r8.c(), hashMap);
                CollectionUtils.putStringIfValid("wvpn", r8.b(), hashMap);
            }
            CollectionUtils.putStringIfValid("oglv", this.f4236a.B().L(), hashMap);
        }
        Map O = this.f4236a.B().O();
        hashMap.put(L6.H, String.valueOf(O.get(L6.H)));
        hashMap.put("country_code", String.valueOf(O.get("country_code")));
        hashMap.put("cc", this.f4236a.w().getCountryCode());
        hashMap.put("applovin_random_token", this.f4236a.j0());
        hashMap.put("compass_random_token", this.f4236a.v());
        hashMap.put("model", Build.MODEL);
        hashMap.put("brand", Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("revision", Build.DEVICE);
        hashMap.put(L6.F, Build.VERSION.RELEASE);
        hashMap.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        CollectionUtils.putStringIfValid("ad_review_sdk_version", j.b(), hashMap);
        hashMap.put(L6.u, (String) this.f4236a.a(c5.t));
        b(hashMap);
        a(hashMap);
        if (map != null) {
            hashMap.putAll(c(h2Var, map));
        }
        return hashMap;
    }

    private Map c(h2 h2Var, Map map) {
        HashMap hashMap = new HashMap(map);
        if (h2Var == h2.b1) {
            hashMap.remove("details");
        }
        return hashMap;
    }

    public void a(final h2 h2Var, final List list, long j) {
        if (a(h2Var, j)) {
            return;
        }
        try {
            g.execute(new Runnable() { // from class: com.applovin.impl.i2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    i2.this.b(h2Var, list);
                }
            });
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.d("HealthEventsReporter", "Failed to report " + h2Var.b() + " with extra parameters collection " + list, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(h2 h2Var, List list) {
        if (AppLovinSdkUtils.isEmulator()) {
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.b.a("HealthEventsReporter", "Reporting " + h2Var.b() + " with extra parameters collection " + list);
        }
        if (this.c != h2Var.a()) {
            m1.a("Health event " + h2Var.b() + " category: " + h2Var.a() + " does not match the reporter category: " + this.c, new Object[0]);
        }
        c(h2Var, list);
        d(h2Var, list);
    }

    private URL a(h2 h2Var, Map map) {
        StringBuilder sb = new StringBuilder("https://ms.applovin.com/1.0/sdk/error?");
        Iterator it = b(h2Var, map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String encode = URLEncoder.encode((String) entry.getKey(), "UTF-8");
            sb.append(encode).append(U3.j.b).append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
            if (it.hasNext()) {
                sb.append(U3.j.c);
            }
        }
        return new URL(sb.toString());
    }

    private void b(Map map) {
        PackageInfo a2 = t7.a(com.applovin.impl.sdk.l.p(), 0);
        map.put("package_name", com.applovin.impl.sdk.l.p().getPackageName());
        map.put("app_version", a2 != null ? a2.versionName : "");
        map.put("app_version_code", String.valueOf(a2 != null ? a2.versionCode : 0));
    }

    private JSONObject a(h2 h2Var, double d, List list) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "ts_ms", System.currentTimeMillis());
        if (h2Var == h2.X0 || h2Var == h2.W0 || h2Var == h2.n1 || h2Var == h2.l1) {
            if (((Boolean) this.f4236a.a(c5.w4)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "wvvc", String.valueOf(r8.d()));
                JsonUtils.putStringIfValid(jSONObject, "wvv", r8.c());
                JsonUtils.putStringIfValid(jSONObject, "wvpn", r8.b());
            }
            JsonUtils.putStringIfValid(jSONObject, "oglv", this.f4236a.B().L());
        }
        JSONObject jSONObject2 = new JSONObject();
        Map O = this.f4236a.B().O();
        JsonUtils.putObject(jSONObject2, L6.H, O.get(L6.H));
        JsonUtils.putObject(jSONObject2, L6.F, O.get(L6.F));
        JsonUtils.putObject(jSONObject2, "api_level", String.valueOf(O.get("api_level")));
        JsonUtils.putObject(jSONObject2, "brand", O.get("brand"));
        JsonUtils.putObject(jSONObject2, "model", O.get("model"));
        JsonUtils.putObject(jSONObject2, "brand_name", O.get("brand_name"));
        JsonUtils.putObject(jSONObject2, "hardware", O.get("hardware"));
        JsonUtils.putObject(jSONObject2, "revision", O.get("revision"));
        JsonUtils.putObject(jSONObject2, "country_code", O.get("country_code"));
        JsonUtils.putObject(jSONObject2, "cc", this.f4236a.w().getCountryCode());
        JsonUtils.putObject(jSONObject2, "applovin_random_token", this.f4236a.j0());
        JsonUtils.putObject(jSONObject2, "compass_random_token", this.f4236a.v());
        JsonUtils.putObject(jSONObject2, "art", StringUtils.emptyIfNull(this.f4236a.s()));
        JsonUtils.putObject(jSONObject2, "ad_review_sdk_version", StringUtils.emptyIfNull(j.b()));
        Map H = this.f4236a.B().H();
        JsonUtils.putObject(jSONObject2, "sdk_version", H.get("sdk_version"));
        JsonUtils.putObject(jSONObject2, "plugin_version", this.f4236a.a(c5.T3));
        JsonUtils.putObject(jSONObject2, "app_version", H.get("app_version"));
        JsonUtils.putObject(jSONObject2, "package_name", H.get("package_name"));
        JsonUtils.putObject(jSONObject2, "app_version_code", String.valueOf(H.get("app_version_code")));
        JsonUtils.putObject(jSONObject2, "first_install", Boolean.toString(Boolean.TRUE.equals((Boolean) H.get("first_install_v2"))));
        JsonUtils.putObject(jSONObject2, L6.u, this.f4236a.a(c5.t));
        JsonUtils.putObject(jSONObject2, "mediation_provider", this.f4236a.X());
        SessionTracker o0 = this.f4236a.o0();
        JsonUtils.putObject(jSONObject2, "app_state", o0.getCurrentApplicationState().b());
        JsonUtils.putObject(jSONObject2, "app_state_duration_ms", Long.valueOf(o0.getCurrentApplicationStateDurationMillis()));
        JsonUtils.putObject(jSONObject2, SDKAnalyticsEvents.PARAMETER_SESSION_ID, o0.getSessionId());
        JsonUtils.putObject(jSONObject2, "session_duration_ms", Long.valueOf(System.currentTimeMillis() - com.applovin.impl.sdk.l.o()));
        JsonUtils.putObject(jSONObject, "shared_fields", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putDouble(jSONObject3, "ts_ms", System.currentTimeMillis());
            JsonUtils.putString(jSONObject3, "type", h2Var.b());
            JsonUtils.putDouble(jSONObject3, "weight", d);
            JsonUtils.putString(jSONObject3, "level", "DEBUG");
            a(map);
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) map);
            jSONArray.put(jSONObject3);
        }
        JsonUtils.putObject(jSONObject, "events", jSONArray);
        return jSONObject;
    }

    private void a(Map map) {
        if (map == null) {
            return;
        }
        Object a2 = this.f4236a.J().a();
        Long c = this.f4236a.J().c();
        boolean z = a2 instanceof com.applovin.impl.sdk.ad.b;
        String str = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c;
        if (z) {
            map.put("fs_ad_network", "AppLovin");
            map.put("fs_ad_creative_id", Long.toString(((com.applovin.impl.sdk.ad.b) a2).getAdIdNumber()));
            if (c != null) {
                str = c.toString();
            }
            map.put("fs_ad_memory_usage", str);
            return;
        }
        if (a2 instanceof c3) {
            c3 c3Var = (c3) a2;
            map.put("fs_ad_network", c3Var.getNetworkName());
            map.put("fs_ad_creative_id", c3Var.getCreativeId());
            if (c != null) {
                str = c.toString();
            }
            map.put("fs_ad_memory_usage", str);
            return;
        }
        map.put("fs_ad_network", "None");
        map.put("fs_ad_creative_id", "None");
        map.put("fs_ad_memory_usage", "None");
    }

    private boolean a(h2 h2Var, long j) {
        Long l = (Long) this.d.get(h2Var);
        return System.currentTimeMillis() - (l != null ? l.longValue() : -1L) < j;
    }
}
