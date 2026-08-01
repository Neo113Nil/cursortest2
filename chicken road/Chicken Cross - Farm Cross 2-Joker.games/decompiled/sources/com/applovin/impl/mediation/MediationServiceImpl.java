package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.a4;
import com.applovin.impl.a7;
import com.applovin.impl.c3;
import com.applovin.impl.c5;
import com.applovin.impl.e3;
import com.applovin.impl.e5;
import com.applovin.impl.g3;
import com.applovin.impl.g5;
import com.applovin.impl.g6;
import com.applovin.impl.h2;
import com.applovin.impl.h5;
import com.applovin.impl.i;
import com.applovin.impl.i5;
import com.applovin.impl.i6;
import com.applovin.impl.j2;
import com.applovin.impl.l3;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n5;
import com.applovin.impl.o3;
import com.applovin.impl.o6;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.h;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t6;
import com.applovin.impl.t7;
import com.applovin.impl.v3;
import com.applovin.impl.w3;
import com.applovin.impl.x2;
import com.applovin.impl.x3;
import com.applovin.impl.x4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final l f4308a;
    private final p b;
    private final g5 c;
    private final AtomicReference d = new AtomicReference();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4309a;

        static {
            int[] iArr = new int[MaxAdapter.InitializationStatus.values().length];
            f4309a = iArr;
            try {
                iArr[MaxAdapter.InitializationStatus.DOES_NOT_APPLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4309a[MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4309a[MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4309a[MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4309a[MaxAdapter.InitializationStatus.NOT_INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4309a[MaxAdapter.InitializationStatus.INITIALIZING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class b implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0077a {

        /* renamed from: a, reason: collision with root package name */
        private final c3 f4310a;
        private a.InterfaceC0077a b;

        public b(c3 c3Var, a.InterfaceC0077a interfaceC0077a) {
            this.f4310a = c3Var;
            this.b = interfaceC0077a;
        }

        public void a(a.InterfaceC0077a interfaceC0077a) {
            this.b = interfaceC0077a;
        }

        public void b(MaxAd maxAd, Bundle bundle) {
            this.f4310a.a(bundle);
            x2.b(this.b, maxAd);
        }

        public void c(MaxAd maxAd, Bundle bundle) {
            this.f4310a.a(bundle);
            this.f4310a.e0();
            p unused = MediationServiceImpl.this.b;
            if (p.a()) {
                MediationServiceImpl.this.b.a("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f4310a, this.b);
            if (!((Boolean) MediationServiceImpl.this.f4308a.a(v3.I8)).booleanValue() || this.f4310a.u().compareAndSet(false, true)) {
                MediationServiceImpl.this.f4308a.m().a(this.f4310a, h.c.SHOW);
                MediationServiceImpl.this.f4308a.u().b(this.f4310a, "DID_DISPLAY");
                if (maxAd.getFormat().isFullscreenAd()) {
                    MediationServiceImpl.this.f4308a.J().a(this.f4310a);
                }
                x2.c(this.b, maxAd);
            }
        }

        public void d(MaxAd maxAd, Bundle bundle) {
            this.f4310a.a(bundle);
            x2.d(this.b, maxAd);
        }

        public void e(final MaxAd maxAd, Bundle bundle) {
            this.f4310a.a(bundle);
            this.f4310a.f0();
            MediationServiceImpl.this.f4308a.m().a(this.f4310a, h.c.HIDE);
            MediationServiceImpl.this.a(this.f4310a);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MediationServiceImpl.b.this.a(maxAd);
                }
            }, maxAd instanceof g3 ? ((g3) maxAd).o0() : 0L);
        }

        public void f(MaxAd maxAd, Bundle bundle) {
            this.f4310a.a(bundle);
            this.f4310a.h0();
            MediationServiceImpl.this.f4308a.m().a(this.f4310a, h.c.LOAD);
            MediationServiceImpl.this.b(this.f4310a);
            x2.f(this.b, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            a(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            b(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            a(maxAd, maxError, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            c(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            d(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            e(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f4310a.h0();
            MediationServiceImpl.this.b(this.f4310a, maxError, this.b);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            f(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            a(maxAd, maxReward, (Bundle) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.f4308a.J().b(maxAd);
            }
            x2.e(this.b, maxAd);
        }

        public void a(MaxAd maxAd, Bundle bundle) {
            this.f4310a.a(bundle);
            MediationServiceImpl.this.f4308a.m().a(this.f4310a, h.c.CLICK);
            MediationServiceImpl.this.a(this.f4310a, this.b);
            x2.a((MaxAdListener) this.b, maxAd);
        }

        public void a(MaxAd maxAd, MaxError maxError, Bundle bundle) {
            this.f4310a.a(bundle);
            this.f4310a.d0();
            MediationServiceImpl.this.a(this.f4310a, maxError, this.b);
            if (maxAd.getFormat() == MaxAdFormat.REWARDED && (maxAd instanceof g3)) {
                ((g3) maxAd).m0();
            }
        }

        public void a(MaxAd maxAd, MaxReward maxReward, Bundle bundle) {
            this.f4310a.a(bundle);
            x2.a(this.b, maxAd, maxReward);
            MediationServiceImpl.this.f4308a.s0().a((n5) new t6((g3) maxAd, MediationServiceImpl.this.f4308a), i6.b.OTHER);
        }
    }

    public MediationServiceImpl(l lVar) {
        this.f4308a = lVar;
        this.b = lVar.Q();
        this.c = new g5(lVar);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    public void collectSignal(final i5 i5Var, Context context, final h5.a aVar) {
        if (i5Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        e3 u = i5Var.u();
        final String b2 = u.b();
        final MaxAdFormat a2 = u.a();
        h5 b3 = this.c.b(i5Var, b2, a2);
        if (b3 != null) {
            aVar.a(h5.a(b3));
            return;
        }
        final h a3 = this.f4308a.V().a(i5Var, i5Var.A());
        if (a3 == null) {
            aVar.a(h5.a(i5Var, new MaxErrorImpl("Could not load adapter")));
            return;
        }
        final x4 x4Var = new x4("SignalCollection:" + i5Var.c());
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        Executor executor = x4.j;
        x4Var.a(executor, new x4.b() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda5
            @Override // com.applovin.impl.x4.b
            public final void a(boolean z, Object obj, Object obj2) {
                MediationServiceImpl.this.a(elapsedRealtime, a3, b2, i5Var, a2, aVar, z, (String) obj, (MaxError) obj2);
            }
        });
        o6.a(i5Var.m(), x4Var, new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + i5Var.c() + ") timed out collecting signal"), "MediationService", this.f4308a);
        final Activity w0 = context instanceof Activity ? (Activity) context : this.f4308a.w0();
        final MaxAdapterParametersImpl a4 = MaxAdapterParametersImpl.a(i5Var, b2, a2);
        if (i5Var.w()) {
            x4 a5 = this.f4308a.U().a(i5Var, w0);
            a5.a(executor, new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    MediationServiceImpl.this.a(x4Var, a3, a4, i5Var, w0);
                }
            });
            a5.a(executor, new x4.a() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda7
                @Override // com.applovin.impl.x4.a
                public final void a(Object obj) {
                    MediationServiceImpl.this.a(a3, x4Var, (String) obj);
                }
            });
            return;
        }
        if (i5Var.x()) {
            x4 a6 = this.f4308a.U().a(i5Var, w0);
            if (a6.e() && !i5Var.z()) {
                if (p.a()) {
                    this.b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + a3.g());
                }
                x4Var.a(new MaxErrorImpl("Could not initialize adapter: " + ((String) a6.b())));
                return;
            }
        }
        if (p.a()) {
            this.b.a("MediationService", "Collecting signal for adapter: " + a3.g());
        }
        a3.a(a4, i5Var, w0, x4Var);
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof c3) {
            if (p.a()) {
                this.b.d("MediationService", "Destroying " + maxAd);
            }
            c3 c3Var = (c3) maxAd;
            h B = c3Var.B();
            if (B != null) {
                B.a();
                c3Var.t();
            }
            this.f4308a.k().c(c3Var.T());
            this.f4308a.m().a(c3Var, h.c.DESTROY);
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return (JSONObject) this.d.getAndSet(null);
    }

    public void loadAd(String str, String str2, MaxAdFormat maxAdFormat, i iVar, Map<String, Object> map, Map<String, Object> map2, Context context, a.InterfaceC0077a interfaceC0077a) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No Ad Unit ID specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (interfaceC0077a == null) {
            throw new IllegalArgumentException("No listener specified");
        }
        if (TextUtils.isEmpty(this.f4308a.X())) {
            p.h("AppLovinSdk", "Mediation provider is null. Please set the mediation provider in the AppLovinSdkInitializationConfiguration.Builder when initializing the AppLovinSDK.");
        }
        if (!this.f4308a.D0()) {
            p.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        List<String> adUnitIds = this.f4308a.L() != null ? this.f4308a.L().getAdUnitIds() : null;
        boolean startsWith = str.startsWith("test_mode");
        if (adUnitIds != null && adUnitIds.size() > 0 && !adUnitIds.contains(str) && !startsWith) {
            if (t7.c(this.f4308a)) {
                String str3 = "Ad Unit ID " + str + " has not been initialized. When you use selective init, any ad units that you do not explicitly specify are excluded from serving ads for the current session. For more information visit our docs: https://support.axon.ai/en/max/android/overview/advanced-settings#selective-init";
                if (((Boolean) this.f4308a.a(c5.I6)).booleanValue()) {
                    throw new RuntimeException(str3);
                }
                if (p.a()) {
                    this.b.b("MediationService", str3);
                }
            }
            this.f4308a.E().a(h2.e1, "uninitialized_ad_unit_id", CollectionUtils.hashMap("ad_unit_id", str), "uninitialized_ad_unit_id" + str);
        }
        this.f4308a.c();
        if (str.length() != 16 && !startsWith && !this.f4308a.k0().startsWith("05TMD")) {
            p.h("MediationService", "Ad unit ID provided for " + maxAdFormat.getLabel() + " is invalid (" + str + "). Expected length: 16 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (this.f4308a.a(maxAdFormat)) {
            p.h("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
            x2.a(interfaceC0077a, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
            return;
        }
        this.f4308a.W0();
        x2.a((MaxAdRequestListener) interfaceC0077a, str, true);
        if (this.f4308a.T() != null) {
            this.f4308a.T().a(str, str2, maxAdFormat, iVar, map, map2, context, interfaceC0077a);
        } else {
            this.f4308a.S().a(str, str2, maxAdFormat, iVar, map, map2, context, interfaceC0077a);
        }
    }

    public void loadThirdPartyMediatedAd(final String str, final c3 c3Var, final Activity activity, final a.InterfaceC0077a interfaceC0077a) {
        x4 x4Var;
        if (c3Var == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (p.a()) {
            this.b.a("MediationService", "Loading " + c3Var + "...");
        }
        this.f4308a.R().a(h2.o0, c3Var, CollectionUtils.hashMap("details", "sdk_initialized=" + this.f4308a.D0()));
        this.f4308a.m().a(c3Var, h.c.LOADING);
        this.f4308a.u().b(c3Var, "WILL_LOAD");
        final h a2 = this.f4308a.V().a(c3Var);
        if (a2 == null) {
            String str2 = "Failed to load " + c3Var + ": adapter not loaded";
            p.h("MediationService", str2);
            b(c3Var, new MaxErrorImpl(-5001, str2), interfaceC0077a);
            return;
        }
        final MaxAdapterParametersImpl a3 = MaxAdapterParametersImpl.a(c3Var);
        if (c3Var.b0()) {
            x4Var = this.f4308a.U().a(c3Var, activity);
        } else {
            if (c3Var.c0()) {
                this.f4308a.U().a(c3Var, activity);
            }
            x4Var = null;
        }
        x4 x4Var2 = x4Var;
        final c3 a4 = c3Var.a(a2);
        a2.a(str, a4);
        a4.i0();
        if (x4Var2 == null) {
            a2.a(str, a3, a4, activity, new b(a4, interfaceC0077a));
            return;
        }
        Executor executor = x4.j;
        x4Var2.a(executor, new x4.a() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda2
            @Override // com.applovin.impl.x4.a
            public final void a(Object obj) {
                MediationServiceImpl.this.a(c3Var, interfaceC0077a, (String) obj);
            }
        });
        x4Var2.a(executor, new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                MediationServiceImpl.this.a(a2, str, a3, a4, activity, interfaceC0077a);
            }
        });
    }

    public void maybeFireAppKilledWhilePlayingMediatedAdPostback() {
        String str = (String) this.f4308a.b(e5.R);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str, new JSONObject());
        if (a(JsonUtils.getLong(jsonObjectFromJsonString, "timestamp_ms", 0L))) {
            Long l = (Long) this.f4308a.b(e5.S);
            String l2 = l != null ? l.toString() : "";
            JSONObject jSONObject = JsonUtils.getJSONObject(jsonObjectFromJsonString, "ad_info");
            Map tryToStringMap = jSONObject != null ? JsonUtils.tryToStringMap(jSONObject) : new HashMap(1);
            CollectionUtils.putStringIfValid("duration_ms", l2, tryToStringMap);
            this.f4308a.E().d(h2.U0, tryToStringMap);
            List list = JsonUtils.getList(jsonObjectFromJsonString, "app_killed_urls", Collections.emptyList());
            if (CollectionUtils.isEmpty(list)) {
                if (p.a()) {
                    this.b.k("MediationService", "Unable to track app killed during mediated ad from previous run. Missing app killed tracking URLs.");
                }
            } else {
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jsonObjectFromJsonString, "user_info");
                Map<String, String> tryToStringMap2 = jSONObject2 != null ? JsonUtils.tryToStringMap(jSONObject2) : a4.c(this.f4308a);
                tryToStringMap2.put("{IMP_DURATION_MS}", l2);
                JSONObject jSONObject3 = JsonUtils.getJSONObject(jsonObjectFromJsonString, "postback_body");
                a("mappk", list, tryToStringMap2, jSONObject3 != null ? JsonUtils.tryToStringObjectMap(jSONObject3) : null, null, null, true);
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object a2 = this.f4308a.J().a();
            if (a2 instanceof c3) {
                a((MaxError) MaxAdapterError.WEBVIEW_ERROR, (c3) a2, true);
            }
        }
    }

    public void processAdDisplayErrorPostbackForUserError(MaxError maxError, c3 c3Var) {
        a(maxError, c3Var, false);
    }

    public void processAdapterInitializationPostback(o3 o3Var, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        hashMap.put("{INIT_TIME_MS}", String.valueOf(j));
        a("minit", hashMap, new MaxErrorImpl(str), o3Var);
        Map a2 = j2.a(o3Var);
        CollectionUtils.putStringIfValid("adapter_init_status", String.valueOf(initializationStatus.getCode()), a2);
        CollectionUtils.putStringIfValid("error_message", str, a2);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j), a2);
        switch (a.f4309a[initializationStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f4308a.R().d(h2.h0, a2);
                break;
            case 4:
                this.f4308a.R().d(h2.i0, a2);
                break;
            case 5:
            case 6:
                this.f4308a.Q();
                if (p.a()) {
                    this.f4308a.Q().k("MediationService", "Adapter init postback called while the adapter is not fully initialized.");
                }
                this.f4308a.E().a(h2.d, "adapterNotInitializedForPostback", a2);
                break;
        }
    }

    public void processCallbackAdImpressionPostback(c3 c3Var, a.InterfaceC0077a interfaceC0077a) {
        if (c3Var.R().endsWith("cimp")) {
            this.f4308a.u().b(c3Var);
            x2.a((MaxAdRevenueListener) interfaceC0077a, (MaxAd) c3Var);
        }
        HashMap hashMap = new HashMap(2);
        if (c3Var instanceof g3) {
            hashMap.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(((g3) c3Var).x0()));
        }
        String emptyIfNull = StringUtils.emptyIfNull(this.f4308a.y0().e());
        if (!((Boolean) this.f4308a.a(c5.P3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mcimp", hashMap, c3Var);
        this.f4308a.R().a(h2.t0, c3Var);
    }

    public void processRawAdImpression(c3 c3Var, a.InterfaceC0077a interfaceC0077a) {
        this.f4308a.u().b(c3Var, "WILL_DISPLAY");
        if (c3Var.R().endsWith("mimp")) {
            this.f4308a.u().b(c3Var);
            x2.a((MaxAdRevenueListener) interfaceC0077a, (MaxAd) c3Var);
        }
        if (((Boolean) this.f4308a.a(c5.W4)).booleanValue()) {
            this.f4308a.a0().a(w3.g, x3.a(c3Var), Long.valueOf(System.currentTimeMillis() - this.f4308a.M()));
        }
        HashMap hashMap = new HashMap(3);
        if (c3Var instanceof g3) {
            g3 g3Var = (g3) c3Var;
            hashMap.put("{TIME_TO_SHOW_MS}", String.valueOf(g3Var.s0()));
            hashMap.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(g3Var.x0()));
        }
        String emptyIfNull = StringUtils.emptyIfNull(this.f4308a.y0().e());
        if (!((Boolean) this.f4308a.a(c5.P3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mimp", hashMap, c3Var);
        this.f4308a.R().a(h2.s0, c3Var);
    }

    public void processViewabilityAdImpressionPostback(l3 l3Var, long j, a.InterfaceC0077a interfaceC0077a) {
        if (l3Var.R().endsWith("vimp")) {
            this.f4308a.u().b(l3Var);
            x2.a((MaxAdRevenueListener) interfaceC0077a, (MaxAd) l3Var);
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("{VIEWABILITY_FLAGS}", String.valueOf(j));
        hashMap.put("{USED_VIEWABILITY_TIMER}", String.valueOf(l3Var.t0()));
        String emptyIfNull = StringUtils.emptyIfNull(this.f4308a.y0().e());
        if (!((Boolean) this.f4308a.a(c5.P3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mvimp", hashMap, l3Var);
        this.f4308a.R().a(h2.u0, l3Var);
    }

    public void processWaterfallInfoPostback(MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl, MaxError maxError, long j, long j2) {
        e3 requestParameters = maxAdWaterfallInfoImpl.getRequestParameters();
        String b2 = requestParameters.b();
        MaxAdFormat a2 = requestParameters.a();
        HashMap hashMap = new HashMap();
        CollectionUtils.putStringIfValid(FirebaseAnalytics.Param.AD_FORMAT, a2.getLabel(), hashMap);
        CollectionUtils.putStringIfValid("ad_unit_id", b2, hashMap);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j2), hashMap);
        CollectionUtils.putStringIfValid("ad_event_id", maxAdWaterfallInfoImpl.getEventId(), hashMap);
        if (maxError != null) {
            hashMap.putAll(j2.a(maxError));
        }
        this.f4308a.R().d(h2.r0, hashMap);
        if (CollectionUtils.isEmpty(maxAdWaterfallInfoImpl.getPostbackUrls())) {
            return;
        }
        HashMap hashMap2 = new HashMap(8);
        CollectionUtils.putStringIfValid("mcode", maxAdWaterfallInfoImpl.getMCode(), hashMap2);
        CollectionUtils.putStringIfValid("ad_unit_id", b2, hashMap2);
        CollectionUtils.putStringIfValid(FirebaseAnalytics.Param.AD_FORMAT, a2.getLabel(), hashMap2);
        CollectionUtils.putStringIfValid("name", maxAdWaterfallInfoImpl.getName(), hashMap2);
        CollectionUtils.putLongIfValid("request_latency_ms", Long.valueOf(j2), hashMap2);
        CollectionUtils.putLongIfValid("request_start_timestamp_ms", Long.valueOf(j), hashMap2);
        CollectionUtils.putLongIfValid("wf_latency_ms", Long.valueOf(maxAdWaterfallInfoImpl.getLatencyMillis()), hashMap2);
        hashMap2.put("arn_info", requestParameters.f().e());
        List<MaxNetworkResponseInfo> networkResponses = maxAdWaterfallInfoImpl.getNetworkResponses();
        ArrayList arrayList = new ArrayList(networkResponses.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : networkResponses) {
            MaxMediatedNetworkInfo mediatedNetwork = maxNetworkResponseInfo.getMediatedNetwork();
            HashMap hashMap3 = new HashMap(5);
            CollectionUtils.putStringIfValid("bcode", ((MaxNetworkResponseInfoImpl) maxNetworkResponseInfo).getBCode(), hashMap3);
            hashMap3.put("name", mediatedNetwork.getName());
            CollectionUtils.putLongIfValid("latency_ms", Long.valueOf(maxNetworkResponseInfo.getLatencyMillis()), hashMap3);
            hashMap3.put("load_state", Integer.valueOf(maxNetworkResponseInfo.getAdLoadState().ordinal()));
            MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxNetworkResponseInfo.getError();
            if (maxErrorImpl != null) {
                HashMap hashMap4 = new HashMap(4);
                hashMap4.put("error_code", Integer.valueOf(maxErrorImpl.getCode()));
                hashMap4.put("error_message", maxErrorImpl.getMessage());
                hashMap4.put("third_party_sdk_error_code", Integer.valueOf(maxErrorImpl.getMediatedNetworkErrorCode()));
                hashMap4.put("third_party_sdk_error_message", maxErrorImpl.getMediatedNetworkErrorMessage());
                hashMap3.put("error_info", hashMap4);
            }
            arrayList.add(hashMap3);
        }
        hashMap2.put("ads_info", arrayList);
        a("mwf_info", maxAdWaterfallInfoImpl.getPostbackUrls(), Collections.EMPTY_MAP, hashMap2, null, null, false);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.d.set(jSONObject);
    }

    public void showFullscreenAd(final g3 g3Var, final Activity activity, final Map<String, Object> map, final Map<String, Object> map2, final a.InterfaceC0077a interfaceC0077a) {
        if (g3Var == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null && MaxAdFormat.APP_OPEN != g3Var.getFormat()) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f4308a.J().a(true);
        final h b2 = b(g3Var);
        long u0 = g3Var.u0();
        if (p.a()) {
            this.b.d("MediationService", "Showing ad " + g3Var.getAdUnitId() + " with delay of " + u0 + "ms...");
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                MediationServiceImpl.this.a(g3Var, b2, activity, interfaceC0077a, map, map2);
            }
        }, u0);
    }

    private h b(g3 g3Var) {
        h B = g3Var.B();
        if (B != null) {
            return B;
        }
        this.f4308a.J().a(false);
        if (p.a()) {
            this.b.k("MediationService", "Failed to show " + g3Var + ": adapter not found");
        }
        p.h("MediationService", "There may be an integration problem with the adapter for Ad Unit ID '" + g3Var.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(g3 g3Var, h hVar, Activity activity, a.InterfaceC0077a interfaceC0077a, Map map, Map map2) {
        a(g3Var);
        hVar.b(g3Var, activity);
        a(g3Var, interfaceC0077a, activity, map, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(g3 g3Var, h hVar, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, a.InterfaceC0077a interfaceC0077a, Map map, Map map2) {
        a(g3Var);
        hVar.a(g3Var, viewGroup, lifecycle, activity);
        a(g3Var, interfaceC0077a, activity, map, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(c3 c3Var, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, c3Var);
        destroyAd(c3Var);
        x2.a(maxAdListener, c3Var.getAdUnitId(), maxError);
    }

    public void showFullscreenAd(final g3 g3Var, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity, final Map<String, Object> map, final Map<String, Object> map2, final a.InterfaceC0077a interfaceC0077a) {
        if (g3Var == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity != null) {
            this.f4308a.J().a(true);
            final h b2 = b(g3Var);
            long u0 = g3Var.u0();
            if (p.a()) {
                this.b.d("MediationService", "Showing ad " + g3Var.getAdUnitId() + " with delay of " + u0 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    MediationServiceImpl.this.a(g3Var, b2, viewGroup, lifecycle, activity, interfaceC0077a, map, map2);
                }
            }, u0);
            return;
        }
        throw new IllegalArgumentException("No activity specified");
    }

    private void a(g3 g3Var) {
        if (g3Var.getFormat() == MaxAdFormat.REWARDED) {
            this.f4308a.s0().a((n5) new a7(g3Var, this.f4308a), i6.b.OTHER);
        }
    }

    private void a(final g3 g3Var, a.InterfaceC0077a interfaceC0077a, final Activity activity, final Map map, final Map map2) {
        this.f4308a.J().a(false);
        a(g3Var, (MaxAdListener) interfaceC0077a);
        if (p.a()) {
            this.b.a("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpression(g3Var, interfaceC0077a);
        if (((Boolean) this.f4308a.a(v3.r8)).booleanValue() && this.f4308a.T() == null && this.f4308a.S().a((MaxAd) g3Var)) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MediationServiceImpl.this.a(g3Var, map, map2, activity);
                }
            }, ((Long) this.f4308a.a(v3.s8)).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(c3 c3Var) {
        this.f4308a.u().b(c3Var, "DID_LOAD");
        if (c3Var.R().endsWith("load")) {
            this.f4308a.u().b(c3Var);
        }
        HashMap hashMap = new HashMap(3);
        long I = c3Var.I();
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(I));
        if (c3Var.getFormat().isFullscreenAd()) {
            o.a b2 = this.f4308a.J().b(c3Var.getAdUnitId());
            hashMap.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(b2.a()));
            hashMap.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(b2.b()));
            hashMap.put("{FAILOVER_LOAD}", String.valueOf(((g3) c3Var).z0()));
        }
        a("load", hashMap, c3Var);
        Map a2 = j2.a(c3Var);
        a2.put("duration_ms", String.valueOf(I));
        a2.put("details", "sdk_initialized=" + this.f4308a.D0());
        this.f4308a.R().d(h2.p0, a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(g3 g3Var, Map map, Map map2, Activity activity) {
        this.f4308a.S().a(g3Var.getAdUnitId(), (String) null, g3Var.getFormat(), i.SEQUENTIAL_OR_PRECACHE, map, map2, activity, (a.InterfaceC0077a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c3 c3Var, a.InterfaceC0077a interfaceC0077a, String str) {
        String str2 = "Failed to load " + c3Var + ": adapter init failed with error: " + str;
        if (p.a()) {
            this.b.k("MediationService", str2);
        }
        b(c3Var, new MaxErrorImpl(MaxAdapterError.NOT_INITIALIZED.getErrorCode(), "Adapter initialization failed"), interfaceC0077a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h hVar, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, c3 c3Var, Activity activity, a.InterfaceC0077a interfaceC0077a) {
        hVar.a(str, maxAdapterParametersImpl, c3Var, activity, new b(c3Var, interfaceC0077a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j, h hVar, String str, i5 i5Var, MaxAdFormat maxAdFormat, h5.a aVar, boolean z, String str2, MaxError maxError) {
        h5 a2;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (z) {
            if (p.a()) {
                this.b.a("MediationService", "Signal collection successful from: " + hVar.g() + " for Ad Unit ID: " + str + " with signal: \"" + str2 + "\"");
            }
            a2 = h5.a(i5Var, hVar, str2, j, elapsedRealtime);
            this.c.a(a2, i5Var, str, maxAdFormat);
            HashMap hashMap = new HashMap();
            CollectionUtils.putStringIfValid("network_name", i5Var.c(), hashMap);
            CollectionUtils.putStringIfValid("adapter_class", i5Var.b(), hashMap);
            CollectionUtils.putStringIfValid("adapter_version", hVar.b(), hashMap);
            CollectionUtils.putStringIfValid("duration_ms", String.valueOf(elapsedRealtime), hashMap);
            CollectionUtils.putStringIfValid(FirebaseAnalytics.Param.AD_FORMAT, String.valueOf(maxAdFormat.getLabel()), hashMap);
            CollectionUtils.putStringIfValid("ad_unit_id", str, hashMap);
            this.f4308a.R().d(h2.j0, hashMap);
        } else {
            if (p.a()) {
                this.b.b("MediationService", "Signal collection failed from: " + hVar.g() + " for Ad Unit ID: " + str + " with error message: \"" + maxError.getMessage() + "\"");
            }
            a2 = h5.a(i5Var, hVar, maxError, j, elapsedRealtime);
            a(a2, i5Var, hVar);
        }
        aVar.a(a2);
        hVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(x4 x4Var, h hVar, MaxAdapterParametersImpl maxAdapterParametersImpl, i5 i5Var, Activity activity) {
        if (x4Var.d()) {
            return;
        }
        if (p.a()) {
            this.b.a("MediationService", "Collecting signal for now-initialized adapter: " + hVar.g());
        }
        hVar.a(maxAdapterParametersImpl, i5Var, activity, x4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h hVar, x4 x4Var, String str) {
        if (p.a()) {
            this.b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + hVar.g());
        }
        x4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_NOT_INITIALIZED, "Could not initialize adapter: " + str));
    }

    private void a(final g3 g3Var, final MaxAdListener maxAdListener) {
        final Long l = (Long) this.f4308a.a(v3.g8);
        if (l.longValue() <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                MediationServiceImpl.this.a(g3Var, l, maxAdListener);
            }
        }, l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(g3 g3Var, Long l, MaxAdListener maxAdListener) {
        if (g3Var.u().get()) {
            return;
        }
        String str = "Ad (" + g3Var.k() + ") has not been displayed after " + l + "ms. Failing ad display...";
        p.h("MediationService", str);
        a(g3Var, new MaxErrorImpl(-1, str), maxAdListener);
        this.f4308a.J().b(g3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c3 c3Var, MaxError maxError, MaxAdListener maxAdListener) {
        this.f4308a.m().a(c3Var, h.c.SHOW_ERROR);
        this.f4308a.u().b(c3Var, "DID_FAIL_DISPLAY");
        a(maxError, c3Var, true);
        if (c3Var.u().compareAndSet(false, true)) {
            x2.a(maxAdListener, c3Var, maxError);
        }
    }

    private void a(MaxError maxError, c3 c3Var) {
        HashMap hashMap = new HashMap(3);
        long I = c3Var.I();
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(I));
        if (c3Var.getFormat().isFullscreenAd()) {
            o.a b2 = this.f4308a.J().b(c3Var.getAdUnitId());
            hashMap.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(b2.a()));
            hashMap.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(b2.b()));
            hashMap.put("{FAILOVER_LOAD}", String.valueOf(((g3) c3Var).z0()));
        }
        a("mlerr", hashMap, maxError, c3Var);
        Map a2 = j2.a(c3Var);
        a2.putAll(j2.a(maxError));
        a2.put("duration_ms", String.valueOf(I));
        a2.put("details", "sdk_initialized=" + this.f4308a.D0());
        this.f4308a.R().d(h2.q0, a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c3 c3Var) {
        this.f4308a.u().b(c3Var, "DID_HIDE");
        HashMap hashMap = new HashMap(1);
        String emptyIfNull = StringUtils.emptyIfNull(this.f4308a.y0().e());
        if (!((Boolean) this.f4308a.a(c5.P3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        boolean z = c3Var.w().get();
        if (((Boolean) this.f4308a.a(c5.Z2)).booleanValue()) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("ad_hidden_callback_manually_invoked", Boolean.valueOf(z));
            a("mclose", null, hashMap, hashMap2, null, c3Var, true);
        } else {
            a("mclose", hashMap, c3Var);
        }
        long V = c3Var.V();
        long K = c3Var.K();
        Map map = CollectionUtils.map("duration_ms", String.valueOf(V));
        map.put("details", "foreground_duration_ms=" + K + ",ad_hidden_callback_manually_invoked=" + z);
        this.f4308a.R().a(h2.w0, c3Var, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c3 c3Var, a.InterfaceC0077a interfaceC0077a) {
        this.f4308a.u().b(c3Var, "DID_CLICKED");
        this.f4308a.u().b(c3Var, "DID_CLICK");
        if (c3Var.R().endsWith("click")) {
            this.f4308a.u().b(c3Var);
            x2.a((MaxAdRevenueListener) interfaceC0077a, (MaxAd) c3Var);
        }
        HashMap hashMap = new HashMap(1);
        String emptyIfNull = StringUtils.emptyIfNull(this.f4308a.y0().e());
        if (!((Boolean) this.f4308a.a(c5.P3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mclick", hashMap, c3Var);
    }

    private void a(MaxError maxError, c3 c3Var, boolean z) {
        HashMap hashMap = new HashMap(1);
        if (c3Var instanceof g3) {
            hashMap.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(((g3) c3Var).x0()));
        }
        a("mierr", hashMap, maxError, c3Var, z);
        if (!z || c3Var == null) {
            return;
        }
        this.f4308a.R().a(h2.v0, c3Var, maxError, CollectionUtils.map("duration_ms", String.valueOf(c3Var.G())));
    }

    private void a(h5 h5Var, i5 i5Var, h hVar) {
        long b2 = h5Var.b();
        HashMap hashMap = new HashMap(3);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(b2));
        CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", hVar.b(), hashMap);
        CollectionUtils.putStringIfValid("{SDK_VERSION}", hVar.i(), hashMap);
        a("serr", hashMap, h5Var.c(), i5Var);
        Map a2 = j2.a(h5Var.c());
        CollectionUtils.putStringIfValid("network_name", i5Var.c(), a2);
        CollectionUtils.putStringIfValid("adapter_class", i5Var.b(), a2);
        CollectionUtils.putStringIfValid("adapter_version", hVar.b(), a2);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(b2), a2);
        this.f4308a.R().d(h2.k0, a2);
    }

    private void a(String str, Map map, o3 o3Var) {
        a(str, map, (MaxError) null, o3Var);
    }

    private void a(String str, Map map, MaxError maxError, o3 o3Var) {
        a(str, map, maxError, o3Var, true);
    }

    private void a(String str, Map map, MaxError maxError, o3 o3Var, boolean z) {
        String str2;
        Map map2 = CollectionUtils.map(map);
        String str3 = "";
        map2.put("{PLACEMENT}", z ? StringUtils.emptyIfNull(o3Var.getPlacement()) : "");
        if (!z) {
            str2 = "";
        } else {
            str2 = StringUtils.emptyIfNull(o3Var.e());
        }
        map2.put("{CUSTOM_DATA}", str2);
        if (o3Var instanceof c3) {
            c3 c3Var = (c3) o3Var;
            if (z) {
                str3 = StringUtils.emptyIfNull(c3Var.getCreativeId());
            }
            map2.put("{CREATIVE_ID}", str3);
        }
        a(str, null, map2, null, maxError, o3Var, z);
    }

    private void a(String str, List list, Map map, Map map2, MaxError maxError, o3 o3Var, boolean z) {
        this.f4308a.s0().a((n5) new g6(str, list, map, map2, maxError, o3Var, this.f4308a, z), i6.b.OTHER);
    }

    private boolean a(long j) {
        return System.currentTimeMillis() - j <= ((Long) this.f4308a.a(c5.M2)).longValue();
    }
}
