package com.vungle.ads.internal.network;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.ironsource.C4761z5;
import com.unity.purchasing.BuildConfig;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleCSBData;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.l2;
import com.vungle.ads.internal.model.a1;
import com.vungle.ads.internal.model.b3;
import com.vungle.ads.internal.model.c3;
import com.vungle.ads.internal.model.d1;
import com.vungle.ads.internal.model.d3;
import com.vungle.ads.internal.model.h1;
import com.vungle.ads.internal.model.j0;
import com.vungle.ads.internal.model.j3;
import com.vungle.ads.internal.model.k1;
import com.vungle.ads.internal.model.m0;
import com.vungle.ads.internal.model.n1;
import com.vungle.ads.internal.model.q1;
import com.vungle.ads.internal.model.t1;
import com.vungle.ads.internal.model.u0;
import com.vungle.ads.internal.model.u1;
import com.vungle.ads.internal.model.x0;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.COPPA;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient;", "", "com/vungle/ads/internal/network/u", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class VungleApiClient {
    private static final String BASE_URL = "https://config.ads.vungle.com/";
    private static final boolean interceptorEnabled = false;

    /* renamed from: a, reason: collision with root package name */
    public final Context f12038a;
    public final com.vungle.ads.internal.platform.f b;
    public final FilePreferences c;
    public e0 d;
    public e0 e;
    public c3 f;
    public j0 g;
    public m0 h;
    public String i;
    public Boolean j;
    public final Lazy k;
    public ConcurrentHashMap l;
    public Interceptor m;
    private static final Set<Interceptor> networkInterceptors = new HashSet();
    private static final Set<Interceptor> logInterceptors = new HashSet();
    public static final Json n = JsonKt.Json$default(null, s.f12059a, 1, null);

    public VungleApiClient(Context applicationContext, com.vungle.ads.internal.platform.f platform, FilePreferences filePreferences) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(filePreferences, "filePreferences");
        this.f12038a = applicationContext;
        this.b = platform;
        this.c = filePreferences;
        this.i = System.getProperty("http.agent");
        this.k = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new a0(applicationContext));
        this.l = new ConcurrentHashMap();
        this.m = new Interceptor() { // from class: com.vungle.ads.internal.network.VungleApiClient$$ExternalSyntheticLambda0
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return VungleApiClient.a(VungleApiClient.this, chain);
            }
        };
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder proxySelector = builder.readTimeout(60L, timeUnit).connectTimeout(60L, timeUnit).addInterceptor(this.m).proxySelector(new v());
        if (interceptorEnabled) {
            Iterator<Interceptor> it = logInterceptors.iterator();
            while (it.hasNext()) {
                proxySelector.addInterceptor(it.next());
            }
            Iterator<Interceptor> it2 = networkInterceptors.iterator();
            while (it2.hasNext()) {
                proxySelector.addNetworkInterceptor(it2.next());
            }
        }
        OkHttpClient build = proxySelector.build();
        OkHttpClient build2 = proxySelector.addInterceptor(new u()).build();
        this.e = new e0(build);
        this.d = new e0(build2);
    }

    public static final Response a(VungleApiClient this$0, Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        try {
            try {
                Response proceed = chain.proceed(request);
                String str = proceed.headers().get("Retry-After");
                if (str == null || str.length() == 0) {
                    return proceed;
                }
                try {
                    long parseLong = Long.parseLong(str);
                    if (parseLong <= 0) {
                        return proceed;
                    }
                    String encodedPath = request.url().encodedPath();
                    long currentTimeMillis = (parseLong * 1000) + System.currentTimeMillis();
                    if (!StringsKt.endsWith$default(encodedPath, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, false, 2, (Object) null)) {
                        return proceed;
                    }
                    RequestBody body = request.body();
                    this$0.getClass();
                    String a2 = a(body);
                    if (a2.length() <= 0) {
                        return proceed;
                    }
                    this$0.l.put(a2, Long.valueOf(currentTimeMillis));
                    return proceed;
                } catch (Exception unused) {
                    boolean z = com.vungle.ads.internal.util.u.f12190a;
                    com.vungle.ads.internal.util.t.a("VungleApiClient", "Retry-After value is not an valid value");
                    return proceed;
                }
            } catch (Exception e) {
                boolean z2 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.b("VungleApiClient", com.iab.omid.library.vungle.internal.l.a("Exception: ").append(e.getMessage()).append(" for ").append(request.url()).toString());
                this$0.getClass();
                return new Response.Builder().request(request).code(500).protocol(Protocol.HTTP_1_1).message("Server is busy").body(ResponseBody.INSTANCE.create("{\"Error\":\"Server is busy\"}", MediaType.INSTANCE.parse(C4761z5.M))).build();
            }
        } catch (OutOfMemoryError unused2) {
            boolean z3 = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.b("VungleApiClient", com.iab.omid.library.vungle.internal.l.a("OOM for ").append(request.url()).toString());
            this$0.getClass();
            return new Response.Builder().request(request).code(500).protocol(Protocol.HTTP_1_1).message("OOM").body(ResponseBody.INSTANCE.create(new byte[0], (MediaType) null)).build();
        }
    }

    public final long b(String placementID) {
        Intrinsics.checkNotNullParameter(placementID, "placementID");
        Long l = (Long) this.l.get(placementID);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final synchronized void c(String appId) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(appId, "appId");
        f0.a(appId);
        String str = BuildConfig.VERSION_NAME;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                packageInfo = this.f12038a.getPackageManager().getPackageInfo(this.f12038a.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n                    ap…      )\n                }");
            } else {
                packageInfo = this.f12038a.getPackageManager().getPackageInfo(this.f12038a.getPackageName(), 0);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n                    ap…      )\n                }");
            }
            String str2 = packageInfo.versionName;
            Intrinsics.checkNotNullExpressionValue(str2, "packageInfo.versionName");
            str = str2;
        } catch (Exception unused) {
        }
        f0.b(str);
        this.f = a(this.f12038a);
        String packageName = this.f12038a.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "applicationContext.packageName");
        this.h = new m0(packageName, str, appId);
        this.j = d();
    }

    public final void d(String adMarkup) {
        Intrinsics.checkNotNullParameter(adMarkup, "adMarkup");
        Intrinsics.checkNotNullParameter("https://events.ads.vungle.com/rtadebugging", C4761z5.r);
        this.e.a(RequestBody.INSTANCE.create(adMarkup, MediaType.INSTANCE.parse(C4761z5.M))).a(new z());
    }

    public final n1 b(boolean z) {
        String a2;
        String configExtension = ConfigManager.INSTANCE.getConfigExtension();
        if (configExtension != null && configExtension.length() == 0) {
            configExtension = this.c.getString("config_extension");
        }
        if (z) {
            try {
                a2 = ((com.vungle.ads.internal.signals.j) this.k.getValue()).a();
            } catch (Exception e) {
                boolean z2 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.b("VungleApiClient", com.iab.omid.library.vungle.internal.l.a("Couldn't convert signals for sending. Error: ").append(e.getMessage()).toString());
            }
            if ((configExtension != null || configExtension.length() == 0) && (a2 == null || a2.length() == 0)) {
                return null;
            }
            ConfigManager.INSTANCE.getClass();
            return new n1(configExtension, a2, Long.valueOf(ConfigManager.b()));
        }
        a2 = null;
        if (configExtension != null) {
        }
        return null;
    }

    public final Boolean d() {
        Boolean bool;
        try {
            try {
                GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
                Intrinsics.checkNotNullExpressionValue(googleApiAvailabilityLight, "getInstance()");
                bool = Boolean.valueOf(googleApiAvailabilityLight.isGooglePlayServicesAvailable(this.f12038a) == 0);
            } catch (NoClassDefFoundError unused) {
                boolean z = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("VungleApiClient", "Play services Not available");
                bool = Boolean.FALSE;
                try {
                    this.c.a(false, "isPlaySvcAvailable").b();
                } catch (Exception unused2) {
                    boolean z2 = com.vungle.ads.internal.util.u.f12190a;
                    com.vungle.ads.internal.util.t.c("VungleApiClient", "Failure to write GPS availability to DB");
                }
            }
            try {
                this.c.a(bool.booleanValue(), "isPlaySvcAvailable").b();
            } catch (Exception unused3) {
                boolean z3 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("VungleApiClient", "Unexpected exception from Play services lib.");
                return bool;
            }
        } catch (Exception unused4) {
            bool = null;
        }
        return bool;
    }

    public static t1 c(boolean z) {
        String value;
        t1 t1Var = new t1(null, null, null, null, null);
        PrivacyManager.INSTANCE.getClass();
        String b = PrivacyManager.b();
        String str = PrivacyManager.e;
        if (str == null) {
            str = "no_interaction";
        }
        String str2 = str;
        String str3 = PrivacyManager.f;
        String str4 = str3 == null ? "" : str3;
        Long l = PrivacyManager.g;
        t1Var.f12015a = new h1(l != null ? l.longValue() : 0L, b, str2, str4);
        PrivacyConsent privacyConsent = PrivacyManager.h;
        if (privacyConsent == null || (value = privacyConsent.getValue()) == null) {
            value = PrivacyConsent.UNKNOWN.getValue();
        }
        t1Var.b = new x0(value);
        if (PrivacyManager.c() != COPPA.COPPA_NOTSET) {
            t1Var.c = new a1(PrivacyManager.c().getValue());
        }
        if (PrivacyManager.f()) {
            SharedPreferences sharedPreferences = PrivacyManager.j;
            String string = sharedPreferences != null ? sharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, "") : null;
            t1Var.e = new k1(string != null ? string : "");
        }
        if (z) {
            t1Var.d = VungleAds.firstPartyData;
        }
        return t1Var;
    }

    public final String c() {
        if (ContextCompat.checkSelfPermission(this.f12038a, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.f12038a.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "unknown";
        }
        int subtype = activeNetworkInfo.getSubtype();
        if (subtype == 1) {
            return "gprs";
        }
        if (subtype == 2) {
            return "edge";
        }
        if (subtype == 20) {
            return "5g";
        }
        switch (subtype) {
            case 4:
                return "wcdma";
            case 5:
                return "cdma_evdo_0";
            case 6:
                return "cdma_evdo_a";
            case 7:
                return "cdma_1xrtt";
            case 8:
                return "hsdpa";
            case 9:
                return "hsupa";
            default:
                switch (subtype) {
                    case 12:
                        return "cdma_evdo_b";
                    case 13:
                        return "lte";
                    case 14:
                        return "hrpd";
                    default:
                        return "unknown";
                }
        }
    }

    public static String a(RequestBody requestBody) {
        String str;
        q1 c;
        List a2;
        Buffer buffer;
        try {
            Json json = n;
            try {
                buffer = new Buffer();
            } catch (Exception unused) {
            }
            if (requestBody != null) {
                requestBody.writeTo(buffer);
                str = buffer.readUtf8();
                KSerializer<Object> serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(u1.class));
                Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                c = ((u1) json.decodeFromString(serializer, str)).c();
                if (c == null && (a2 = c.a()) != null) {
                    String str2 = (String) a2.get(0);
                    return str2 == null ? "" : str2;
                }
            }
            str = "";
            KSerializer<Object> serializer2 = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(u1.class));
            Intrinsics.checkNotNull(serializer2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            c = ((u1) json.decodeFromString(serializer2, str)).c();
            return c == null ? "" : "";
        } catch (Exception unused2) {
            return "";
        }
    }

    public final boolean a(String placementID) {
        Intrinsics.checkNotNullParameter(placementID, "placementID");
        Long l = (Long) this.l.get(placementID);
        if ((l != null ? l.longValue() : 0L) > System.currentTimeMillis()) {
            return true;
        }
        this.l.remove(placementID);
        return false;
    }

    public final m a() {
        m0 m0Var = this.h;
        if (m0Var == null) {
            return null;
        }
        u1 u1Var = new u1(a(true), m0Var, c(false));
        n1 b = b(false);
        if (b != null) {
            u1Var.a(b);
        }
        com.vungle.ads.internal.util.m mVar = com.vungle.ads.internal.util.n.f12186a;
        String str = BASE_URL;
        if (!com.vungle.ads.internal.util.n.a(str)) {
            str = BASE_URL;
        }
        if (!StringsKt.endsWith$default(str, "/", false, 2, (Object) null)) {
            str = str + FileSystemKt.UnixPathSeparator;
        }
        return this.e.b(f0.d(), str + "config", u1Var);
    }

    public final m a(String placement, VungleAdSize vungleAdSize) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        String adsEndpoint = ConfigManager.INSTANCE.getAdsEndpoint();
        u1 a2 = a(!ConfigManager.t(), ConfigManager.d());
        q1 q1Var = new q1(CollectionsKt.listOf(placement), (Long) null, (String) null, (String) null, (String) null, (d1) null, 126);
        if (vungleAdSize != null) {
            q1Var.a(new u0(vungleAdSize.getWidth(), vungleAdSize.getHeight()));
        }
        a2.a(q1Var);
        return this.d.a(f0.d(), adsEndpoint, a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m a(String placement, VungleAdSize vungleAdSize, VungleCSBData vungleCSBData) {
        d1 d1Var;
        JsonObject jsonObject;
        Intrinsics.checkNotNullParameter(placement, "placement");
        ConfigManager.INSTANCE.getClass();
        String e = ConfigManager.e();
        u1 a2 = a(!ConfigManager.t(), ConfigManager.d());
        if (vungleCSBData != null) {
            Map<String, String> extras = vungleCSBData.getExtras();
            if (extras != null) {
                if (extras.isEmpty()) {
                    extras = null;
                }
                if (extras != null) {
                    JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                    for (Map.Entry<String, String> entry : extras.entrySet()) {
                        jsonObjectBuilder.put(entry.getKey(), JsonElementKt.JsonPrimitive(entry.getValue()));
                    }
                    jsonObject = jsonObjectBuilder.build();
                    d1Var = new d1(vungleCSBData.getBidFloor(), vungleCSBData.getPhase(), vungleCSBData.getIsVXWinner(), vungleCSBData.getAuctionId(), vungleCSBData.getCreativeId(), vungleCSBData.getAdUnitId(), jsonObject != null ? jsonObject.toString() : null);
                }
            }
            jsonObject = null;
            d1Var = new d1(vungleCSBData.getBidFloor(), vungleCSBData.getPhase(), vungleCSBData.getIsVXWinner(), vungleCSBData.getAuctionId(), vungleCSBData.getCreativeId(), vungleCSBData.getAdUnitId(), jsonObject != null ? jsonObject.toString() : null);
        } else {
            d1Var = null;
        }
        q1 q1Var = new q1(CollectionsKt.listOf(placement), (Long) null, (String) null, (String) null, (String) null, d1Var, 62);
        if (vungleAdSize != null) {
            q1Var.a(new u0(vungleAdSize.getWidth(), vungleAdSize.getHeight()));
        }
        a2.a(q1Var);
        return this.d.a(f0.d(), e, a2);
    }

    public final String b() {
        if (ContextCompat.checkSelfPermission(this.f12038a, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.f12038a.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                return "MOBILE";
            }
            if (type == 1 || type == 6) {
                return "WIFI";
            }
            if (type == 7) {
                return "BLUETOOTH";
            }
            if (type != 9) {
                return "UNKNOWN";
            }
            return "ETHERNET";
        }
        return "NONE";
    }

    public final m a(q1 request) {
        m0 m0Var;
        Intrinsics.checkNotNullParameter(request, "request");
        ConfigManager.INSTANCE.getClass();
        String o = ConfigManager.o();
        if (o == null || o.length() == 0 || (m0Var = this.h) == null) {
            return null;
        }
        u1 u1Var = new u1(a(false), m0Var, c(false));
        u1Var.a(request);
        n1 b = b(false);
        if (b != null) {
            u1Var.a(b);
        }
        return this.e.c(f0.d(), o, u1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        r3 = r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        r3 = java.lang.Integer.valueOf(r3.code());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d3 a(String url, Map map, String str, g requestType, com.vungle.ads.internal.util.s sVar) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        if (!com.vungle.ads.internal.util.n.a(url)) {
            return new d3("Invalid URL", true, false, 4);
        }
        try {
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(new URL(url).getHost()) && URLUtil.isHttpUrl(url)) {
                return new d3("Clear Text Traffic is blocked", false, false, 6);
            }
            try {
                String str2 = this.i;
                if (str2 == null) {
                    str2 = "";
                }
                o a2 = this.e.a(str2, url, requestType, map, str != null ? RequestBody.INSTANCE.create(str, MediaType.INSTANCE.parse(C4761z5.M)) : null).a();
                if (a2 != null && a2.c()) {
                    return null;
                }
                Integer num = null;
                if (CollectionsKt.contains(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(Sdk.SDKError.Reason.MRAID_ERROR_VALUE), Integer.valueOf(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE), 307, 308}), num)) {
                    AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.NOTIFICATION_REDIRECT, 0L, sVar, url, 2);
                    return null;
                }
                return new d3("unsuccessful response, error code: " + num + ", message: " + (a2 != null ? a2.d() : null), false, num != null && new IntRange(500, CommonGatewayClient.CODE_599).contains(num.intValue()), 2);
            } catch (Throwable th) {
                String localizedMessage = th.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "IOException";
                }
                return new d3(localizedMessage, false, true, 2);
            }
        } catch (MalformedURLException e) {
            String localizedMessage2 = e.getLocalizedMessage();
            if (localizedMessage2 == null) {
                localizedMessage2 = "MalformedURLException";
            }
            return new d3(localizedMessage2, true, false, 4);
        }
    }

    public final void a(LinkedBlockingQueue metrics, com.vungle.ads.internal.y requestListener) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        ConfigManager.INSTANCE.getClass();
        String n2 = ConfigManager.n();
        if (n2.length() == 0) {
            requestListener.a();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Iterator it = metrics.iterator();
        while (it.hasNext()) {
            Sdk.SDKMetric.Builder builder = (Sdk.SDKMetric.Builder) it.next();
            builder.setSessionId(((com.vungle.ads.internal.signals.j) this.k.getValue()).d());
            ConfigManager configManager = ConfigManager.INSTANCE;
            String placementReferenceId = builder.getPlacementReferenceId();
            configManager.getClass();
            j3 a2 = ConfigManager.a(placementReferenceId);
            if (a2 != null) {
                String c = a2.c();
                if (c == null) {
                    c = "";
                }
                builder.setPlacementType(c);
            }
            String b = b();
            if (b != null) {
                builder.setConnectionType(b);
            }
            String c2 = c();
            if (c2 != null) {
                builder.setConnectionTypeDetail(c2);
            }
            Sdk.SDKMetric build = builder.build();
            boolean z = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.b("VungleApiClient", com.iab.omid.library.vungle.internal.l.a("Sending Metric: ").append(build.getType()).toString());
            linkedBlockingQueue.add(build);
        }
        Sdk.MetricBatch build2 = Sdk.MetricBatch.newBuilder().addAllMetrics(linkedBlockingQueue).build();
        RequestBody.Companion companion = RequestBody.INSTANCE;
        MediaType parse = MediaType.INSTANCE.parse(CommonGatewayClient.HEADER_PROTOBUF);
        byte[] byteArray = build2.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "batch.toByteArray()");
        this.e.b(f0.d(), n2, RequestBody.Companion.create$default(companion, parse, byteArray, 0, 0, 12, (Object) null)).a(new y(requestListener));
    }

    public final void a(LinkedBlockingQueue errors, com.vungle.ads.internal.x requestListener) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        ConfigManager.INSTANCE.getClass();
        String h = ConfigManager.h();
        if (h.length() == 0) {
            requestListener.a();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Iterator it = errors.iterator();
        while (it.hasNext()) {
            Sdk.SDKError.Builder builder = (Sdk.SDKError.Builder) it.next();
            builder.setSessionId(((com.vungle.ads.internal.signals.j) this.k.getValue()).d());
            ConfigManager configManager = ConfigManager.INSTANCE;
            String placementReferenceId = builder.getPlacementReferenceId();
            configManager.getClass();
            j3 a2 = ConfigManager.a(placementReferenceId);
            if (a2 != null) {
                String c = a2.c();
                if (c == null) {
                    c = "";
                }
                builder.setPlacementType(c);
            }
            String b = b();
            if (b != null) {
                builder.setConnectionType(b);
            }
            String c2 = c();
            if (c2 != null) {
                builder.setConnectionTypeDetail(c2);
            }
            Sdk.SDKError build = builder.build();
            boolean z = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.b("VungleApiClient", com.iab.omid.library.vungle.internal.l.a("Sending Error: ").append(build.getReason()).toString());
            linkedBlockingQueue.add(build);
        }
        Sdk.SDKErrorBatch build2 = Sdk.SDKErrorBatch.newBuilder().addAllErrors(linkedBlockingQueue).build();
        RequestBody.Companion companion = RequestBody.INSTANCE;
        byte[] byteArray = build2.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "batch.toByteArray()");
        this.e.a(f0.d(), h, companion.create(byteArray, MediaType.INSTANCE.parse(CommonGatewayClient.HEADER_PROTOBUF), 0, build2.toByteArray().length)).a(new x(requestListener));
    }

    public final c3 a(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        c3 c3Var = new c3(MANUFACTURER, MODEL, RELEASE, com.vungle.ads.internal.platform.a.a(context), Intrinsics.areEqual("Amazon", MANUFACTURER) ? "amazon" : "android", displayMetrics.widthPixels, displayMetrics.heightPixels, this.i);
        try {
            String j = ((com.vungle.ads.internal.platform.c) this.b).j();
            this.i = j;
            c3Var.b(j);
            l2 l2Var = new l2(Sdk.SDKMetric.SDKMetricType.USER_AGENT_LOAD_DURATION_MS);
            l2Var.e();
            ((com.vungle.ads.internal.platform.c) this.b).a(new w(this, l2Var));
            j0 j0Var = this.g;
            if (j0Var == null) {
                j0Var = ((com.vungle.ads.internal.platform.c) this.b).a();
            }
            this.g = j0Var;
        } catch (Exception e) {
            boolean z = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.b("VungleApiClient", com.iab.omid.library.vungle.internal.l.a("Cannot Get UserAgent. Setting Default Device UserAgent.").append(e.getLocalizedMessage()).toString());
        }
        return c3Var;
    }

    public final u1 a(boolean z, boolean z2) {
        u1 u1Var = new u1(a(false), this.h, c(z2), null, null);
        n1 b = b(z);
        if (b != null) {
            u1Var.d = b;
        }
        return u1Var;
    }

    public final synchronized c3 a(boolean z) {
        c3 a2;
        String str;
        c3 c3Var = this.f;
        if (c3Var == null) {
            c3Var = a(this.f12038a);
            this.f = c3Var;
        }
        a2 = c3.a(c3Var);
        b3 b3Var = new b3();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = this.f12038a.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        a2.a(displayMetrics.heightPixels);
        a2.b(displayMetrics.widthPixels);
        j0 j0Var = this.g;
        if (j0Var == null) {
            j0Var = ((com.vungle.ads.internal.platform.c) this.b).a();
        }
        this.g = j0Var;
        String a3 = j0Var.a();
        j0 j0Var2 = this.g;
        Boolean valueOf = j0Var2 != null ? Boolean.valueOf(j0Var2.b()) : null;
        PrivacyManager.INSTANCE.getClass();
        if (PrivacyManager.e()) {
            if (a3 != null) {
                if (Intrinsics.areEqual("Amazon", Build.MANUFACTURER)) {
                    b3Var.a(a3);
                } else {
                    b3Var.f(a3);
                }
                a2.a(a3);
            } else {
                a2.a("");
            }
        }
        if (z || !PrivacyManager.e()) {
            a2.a((String) null);
            b3Var.f(null);
            b3Var.a((String) null);
        }
        boolean z2 = true;
        a2.a(Intrinsics.areEqual(valueOf, Boolean.TRUE) ? 1 : 0);
        if (this.j == null) {
            this.j = this.c.a("isPlaySvcAvailable");
        }
        if (this.j == null) {
            this.j = d();
        }
        Boolean bool = this.j;
        b3Var.a(bool != null ? bool.booleanValue() : false);
        if (PrivacyManager.a() != 2) {
            String b = ((com.vungle.ads.internal.platform.c) this.b).b();
            if (b != null) {
                b3Var.b(b);
            }
            Integer c = ((com.vungle.ads.internal.platform.c) this.b).c();
            if (c != null) {
                b3Var.a(Integer.valueOf(c.intValue()));
            }
        }
        Intent registerReceiver = this.f12038a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                b3Var.a(intExtra / intExtra2);
            }
            int intExtra3 = registerReceiver.getIntExtra("status", -1);
            if (intExtra3 == -1) {
                str = "UNKNOWN";
            } else if (intExtra3 != 2 && intExtra3 != 5) {
                str = "NOT_CHARGING";
            } else {
                int intExtra4 = registerReceiver.getIntExtra("plugged", -1);
                if (intExtra4 == 1) {
                    str = "BATTERY_PLUGGED_AC";
                } else if (intExtra4 == 2) {
                    str = "BATTERY_PLUGGED_USB";
                } else if (intExtra4 != 4) {
                    str = "BATTERY_PLUGGED_OTHERS";
                } else {
                    str = "BATTERY_PLUGGED_WIRELESS";
                }
            }
        } else {
            str = "UNKNOWN";
        }
        b3Var.c(str);
        b3Var.a(((com.vungle.ads.internal.platform.c) this.b).l() ? 1 : 0);
        String b2 = b();
        if (b2 != null) {
            b3Var.d(b2);
        }
        String c2 = c();
        if (c2 != null) {
            b3Var.e(c2);
        }
        b3Var.i(Locale.getDefault().toString());
        b3Var.h(Locale.getDefault().getLanguage());
        b3Var.j(TimeZone.getDefault().getID());
        b3Var.b(((com.vungle.ads.internal.platform.c) this.b).k());
        b3Var.c(((com.vungle.ads.internal.platform.c) this.b).o() ? 1 : 0);
        if (Intrinsics.areEqual("Amazon", Build.MANUFACTURER)) {
            z2 = this.f12038a.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
        } else {
            Object systemService2 = this.f12038a.getSystemService("uimode");
            Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.app.UiModeManager");
            if (((UiModeManager) systemService2).getCurrentModeType() != 4) {
                z2 = false;
            }
        }
        b3Var.b(z2);
        this.b.getClass();
        b3Var.a();
        b3Var.b(((com.vungle.ads.internal.platform.c) this.b).m() ? 1 : 0);
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.r()) {
            b3Var.d(Long.valueOf(((com.vungle.ads.internal.platform.c) this.b).i()));
            b3Var.b(Long.valueOf(((com.vungle.ads.internal.platform.c) this.b).h()));
            b3Var.c(Long.valueOf(((com.vungle.ads.internal.platform.c) this.b).g()));
            b3Var.a(Long.valueOf(((com.vungle.ads.internal.platform.c) this.b).d()));
        }
        b3Var.g(((com.vungle.ads.internal.platform.c) this.b).f());
        a2.b(this.i);
        a2.a(b3Var);
        return a2;
    }
}
