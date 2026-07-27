package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.a4;
import com.applovin.impl.b5;
import com.applovin.impl.c5;
import com.applovin.impl.d3;
import com.applovin.impl.d4;
import com.applovin.impl.d5;
import com.applovin.impl.e5;
import com.applovin.impl.f1;
import com.applovin.impl.f5;
import com.applovin.impl.f7;
import com.applovin.impl.g1;
import com.applovin.impl.h2;
import com.applovin.impl.h4;
import com.applovin.impl.h6;
import com.applovin.impl.i6;
import com.applovin.impl.k1;
import com.applovin.impl.l7;
import com.applovin.impl.m8;
import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.n5;
import com.applovin.impl.o2;
import com.applovin.impl.o3;
import com.applovin.impl.o4;
import com.applovin.impl.p3;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.q8;
import com.applovin.impl.r0;
import com.applovin.impl.r7;
import com.applovin.impl.s0;
import com.applovin.impl.s1;
import com.applovin.impl.s2;
import com.applovin.impl.s7;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.t7;
import com.applovin.impl.v0;
import com.applovin.impl.v1;
import com.applovin.impl.v3;
import com.applovin.impl.x2;
import com.applovin.impl.x6;
import com.applovin.impl.y3;
import com.applovin.impl.y5;
import com.applovin.impl.z3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class l {
    public static l E0;
    protected static Context F0;
    private static boolean G0;
    private static final boolean I0;
    private static volatile com.applovin.impl.c J0;
    private AppLovinSdk.SdkInitializationListener A0;
    private AppLovinSdk.SdkInitializationListener B0;

    /* renamed from: a, reason: collision with root package name */
    private String f4474a;
    private String b;
    private WeakReference c;
    private final long d;
    private long e;
    private long f;
    private Long g;
    private long h;
    private final AppLovinSdkSettings j;
    private com.applovin.impl.mediation.e j0;
    private MaxSegmentCollection k;
    private String l;
    private List m0;
    private volatile AppLovinSdk q;
    private boolean r0;
    private String w0;
    private AppLovinSdkInitializationConfiguration x0;
    private static final Object K0 = new Object();
    private static final long H0 = System.currentTimeMillis();
    private final AtomicBoolean i = new AtomicBoolean();
    private final AtomicReference m = new AtomicReference();
    private final AtomicReference n = new AtomicReference();
    private final AtomicReference o = new AtomicReference();
    private final AtomicReference p = new AtomicReference();
    private final p r = new p(this);
    private final com.applovin.impl.f s = new com.applovin.impl.f(this);
    private final d3 t = new d3(this);
    private final s1 u = new s1(this);
    private final r7 v = new r7(this);
    private final AtomicReference w = new AtomicReference();
    private final AtomicReference x = new AtomicReference();
    private final AtomicReference y = new AtomicReference();
    private final AtomicReference z = new AtomicReference();
    private final AtomicReference A = new AtomicReference();
    private final AtomicReference B = new AtomicReference();
    private final AtomicReference C = new AtomicReference();
    private final AtomicReference D = new AtomicReference();
    private final AtomicReference E = new AtomicReference();
    private final AtomicReference F = new AtomicReference();
    private final AtomicReference G = new AtomicReference();
    private final AtomicReference H = new AtomicReference();
    private final AtomicReference I = new AtomicReference();
    private final AtomicReference J = new AtomicReference();
    private final AtomicReference K = new AtomicReference();
    private final AtomicReference L = new AtomicReference();
    private final AtomicReference M = new AtomicReference();
    private final AtomicReference N = new AtomicReference();
    private final AtomicReference O = new AtomicReference();
    private final AtomicReference P = new AtomicReference();
    private final AtomicReference Q = new AtomicReference();
    private final AtomicReference R = new AtomicReference();
    private final AtomicReference S = new AtomicReference();
    private final AtomicReference T = new AtomicReference();
    private final AtomicReference U = new AtomicReference();
    private final AtomicReference V = new AtomicReference();
    private final AtomicReference W = new AtomicReference();
    private final AtomicReference X = new AtomicReference();
    private final AtomicReference Y = new AtomicReference();
    private final AtomicReference Z = new AtomicReference();
    private final AtomicReference a0 = new AtomicReference();
    private final AtomicReference b0 = new AtomicReference();
    private final AtomicReference c0 = new AtomicReference();
    private final AtomicReference d0 = new AtomicReference();
    private final AtomicReference e0 = new AtomicReference();
    private final AtomicReference f0 = new AtomicReference();
    private final AtomicReference g0 = new AtomicReference();
    private final AtomicReference h0 = new AtomicReference();
    private final AtomicReference i0 = new AtomicReference();
    private final AtomicReference k0 = new AtomicReference();
    private final AtomicReference l0 = new AtomicReference();
    private final Object n0 = new Object();
    private final AtomicBoolean o0 = new AtomicBoolean(true);
    private final AtomicBoolean p0 = new AtomicBoolean();
    private final AtomicBoolean q0 = new AtomicBoolean();
    private boolean s0 = false;
    private boolean t0 = false;
    private boolean u0 = false;
    private int v0 = 0;
    private final Object y0 = new Object();
    private SdkConfigurationImpl z0 = new SdkConfigurationImpl(this);
    private final n5 C0 = new x6(this, true, "scheduleAdLoadIntegrationError", new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda4
        @Override // java.lang.Runnable
        public final void run() {
            l.this.M0();
        }
    });
    private final n5 D0 = new x6(this, true, "sdkInit", new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda5
        @Override // java.lang.Runnable
        public final void run() {
            l.this.N0();
        }
    });

    class a implements y5.b {
        a() {
        }

        @Override // com.applovin.impl.y5.b
        public void a(JSONObject jSONObject) {
            boolean isValid = JsonUtils.isValid(jSONObject);
            l.this.c(jSONObject);
            if (((Boolean) l.this.a(v3.q8)).booleanValue()) {
                l lVar = l.this;
                lVar.j0 = new com.applovin.impl.mediation.e(lVar);
            }
            l.this.n().a();
            s0.a(jSONObject, isValid, l.this);
            Boolean bool = JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE);
            l.this.W().a(bool.booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            l.this.E().b();
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putString(jSONObject2, "default_browser_package_name", StringUtils.emptyIfNull(m.K()));
            JsonUtils.putBoolean(jSONObject2, "init_success", isValid);
            JsonUtils.putInt(jSONObject2, "default_preferences_key_count", PreferenceManager.getDefaultSharedPreferences(l.F0).getAll().size());
            l.this.x0().d(h2.g, CollectionUtils.map("details", jSONObject2.toString()));
            l lVar2 = l.this;
            lVar2.m0 = lVar2.a(jSONObject);
            if (isValid) {
                l.this.z0.setEnabledAmazonAdUnitIds(CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", "")));
            }
            l.this.u0().a(jSONObject);
            l.this.b(jSONObject);
            x2.b(((Boolean) l.this.a(c5.D6)).booleanValue());
            x2.a(((Boolean) l.this.a(c5.E6)).booleanValue());
            l.this.R0();
            if (!((Boolean) l.this.a(c5.l3)).booleanValue() || isValid || !s0.a(l.p())) {
                l.this.P0();
                return;
            }
            l.this.Q();
            if (p.a()) {
                l.this.Q().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            l.this.U0();
        }
    }

    class b implements v0.c {
        b() {
        }

        @Override // com.applovin.impl.v0.c
        public void a(v0.b bVar) {
            l.this.Q();
            if (p.a()) {
                l.this.Q().a("AppLovinSdk", "Terms and Privacy Policy flow completed with status: " + bVar);
            }
            l.this.q0.set(bVar.b());
            if (!bVar.a()) {
                l.this.c("Initializing SDK in MAX environment...");
                return;
            }
            l.this.Q();
            if (p.a()) {
                l.this.Q().a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
            }
            l.this.T0();
            l.this.S0();
        }
    }

    class c implements y5.b {
        c() {
        }

        @Override // com.applovin.impl.y5.b
        public void a(JSONObject jSONObject) {
            l.this.c(jSONObject);
            l.this.i.set(false);
            l.this.P0();
        }
    }

    class d implements d4.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d4 f4478a;

        d(d4 d4Var) {
            this.f4478a = d4Var;
        }

        @Override // com.applovin.impl.d4.a
        public void a() {
            l.this.Q();
            if (p.a()) {
                l.this.Q().d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (l.this.n0) {
                if (!l.this.r0) {
                    l.this.T0();
                }
            }
            this.f4478a.b(this);
        }

        @Override // com.applovin.impl.d4.a
        public void b() {
        }
    }

    static {
        try {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    t7.c();
                }
            });
            I0 = true;
        } catch (Throwable unused) {
            I0 = false;
        }
    }

    public l(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        this.r0 = false;
        E0 = this;
        this.j = appLovinSdkSettings;
        this.d = System.currentTimeMillis();
        this.r0 = true;
        if (!H0()) {
            throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://support.axon.ai/en/max/android/overview/integration");
        }
        F0 = context.getApplicationContext();
        if (context instanceof Activity) {
            this.c = new WeakReference((Activity) context);
        }
    }

    private void C0() {
        Context context = F0;
        p Q = Q();
        f5 r0 = r0();
        v0 y = y();
        a(context);
        o0();
        k();
        e0();
        U().a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.a(this);
        String str = this.f4474a;
        if (str == null || str.length() != 86) {
            p.h("AppLovinSdk", "SDK key provided is invalid (" + this.f4474a + "). Expected length: 86 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (StringUtils.isValidString(this.b) && this.b.length() != 36) {
            String str2 = "Axon event key length " + this.b + " is invalid - expected 36";
            if (t7.c(this)) {
                throw new IllegalArgumentException(str2);
            }
            p.h("AppLovinSdk", str2);
        }
        if (y.l()) {
            String str3 = "Terms Flow has been replaced. " + y.g();
            if (t7.c(this)) {
                throw new IllegalStateException(str3);
            }
            p.h("AppLovinSdk", str3);
        }
        if (t7.j()) {
            p.h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!t7.b(this)) {
            p.h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (t7.m(context)) {
            this.j.setVerboseLogging(true);
        }
        q0().a(c5.k, Boolean.valueOf(this.j.isVerboseLoggingEnabled()));
        a4.e(this);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        e5 e5Var = e5.c;
        if (TextUtils.isEmpty((String) r0.a(e5Var, (Object) null, defaultSharedPreferences))) {
            this.t0 = true;
            r0.b(e5Var, Boolean.toString(true), defaultSharedPreferences);
        } else {
            r0.b(e5Var, Boolean.toString(false), defaultSharedPreferences);
        }
        e5 e5Var2 = e5.d;
        if (((Boolean) r0.a(e5Var2, Boolean.FALSE)).booleanValue()) {
            if (p.a()) {
                Q.a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.u0 = true;
        } else {
            if (p.a()) {
                Q.a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            r0.b(e5Var2, Boolean.TRUE);
            r0.b(e5.t, Boolean.valueOf(y.j()));
        }
        e5 e5Var3 = e5.e;
        this.f = ((Long) r0.a(e5Var3, 0L)).longValue() + 1;
        r0().b(e5Var3, Long.valueOf(this.f));
        e5 e5Var4 = e5.f;
        this.g = (Long) r0.a(e5Var4, null);
        r0().b(e5Var4, Long.valueOf(H0));
        e5 e5Var5 = e5.g;
        String str4 = (String) r0.a(e5Var5, null);
        if (StringUtils.isValidString(str4)) {
            if (AppLovinSdk.VERSION_CODE > t7.g(str4)) {
                r0.b(e5Var5, AppLovinSdk.VERSION);
            }
        } else {
            r0.b(e5Var5, AppLovinSdk.VERSION);
        }
        x0().d(h2.e, CollectionUtils.map("details", "isInitProviderContextSet=" + G0));
    }

    public static boolean H0() {
        return I0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0() {
        if (s0().f()) {
            return;
        }
        Q();
        if (p.a()) {
            Q().a("AppLovinSdk", "Timing out adapters init...");
        }
        s0().g();
        b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0() {
        i6 s0 = s0();
        int i = this.v0 + 1;
        this.v0 = i;
        s0.a((n5) new y5(i, this, new c()), i6.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0() {
        if (I0()) {
            o2.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0() {
        synchronized (this.n0) {
            boolean a2 = s0.a(p());
            if (!I0()) {
                Q();
                if (p.a()) {
                    Q().a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + X());
                }
            }
            if (!((Boolean) a(c5.m3)).booleanValue() || a2) {
                T0();
            }
            if (((Boolean) a(c5.l3)).booleanValue() && !a2) {
                Q();
                if (p.a()) {
                    Q().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                }
                U0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        Long l = (Long) a(c5.u3);
        if (l.longValue() >= 0 && this.i.compareAndSet(false, true)) {
            m8.a(l.longValue(), false, this, new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    l.this.L0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0() {
        if (!I0()) {
            c("Initializing SDK in non-MAX environment...");
            return;
        }
        if (!this.p0.compareAndSet(false, true)) {
            c("Consent flow is already shown. Initializing SDK in MAX environment...");
        } else if (!y().j()) {
            c("Consent flow is not enabled. Initializing SDK in MAX environment...");
        } else {
            y().a(w0(), new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0() {
        d4 e0 = e0();
        e0.a(new d(e0));
    }

    private Map Y() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) a(c5.r4)));
        } catch (JSONException unused) {
            return Collections.emptyMap();
        }
    }

    public static long o() {
        return H0;
    }

    public static Context p() {
        return F0;
    }

    public g1 A() {
        Object obj = this.U.get();
        if (obj == null) {
            synchronized (this.U) {
                obj = this.U.get();
                if (obj == null) {
                    obj = new g1(this);
                    this.U.set(obj);
                }
            }
        }
        if (obj == this.U) {
            obj = null;
        }
        return (g1) obj;
    }

    public AppLovinSdk A0() {
        return this.q;
    }

    public m B() {
        Object obj = this.A.get();
        if (obj == null) {
            synchronized (this.A) {
                obj = this.A.get();
                if (obj == null) {
                    obj = new m(this);
                    this.A.set(obj);
                }
            }
        }
        if (obj == this.A) {
            obj = null;
        }
        return (m) obj;
    }

    public boolean B0() {
        return this.u0;
    }

    public k1 C() {
        Object obj = this.D.get();
        if (obj == null) {
            synchronized (this.D) {
                obj = this.D.get();
                if (obj == null) {
                    obj = new k1(this);
                    this.D.set(obj);
                }
            }
        }
        if (obj == this.D) {
            obj = null;
        }
        return (k1) obj;
    }

    public String D() {
        return this.w0;
    }

    public boolean D0() {
        boolean z;
        synchronized (this.n0) {
            z = this.s0;
        }
        return z;
    }

    public s1 E() {
        return this.u;
    }

    public boolean E0() {
        return this.t0;
    }

    public String F() {
        return y0().d();
    }

    public boolean F0() {
        boolean z;
        synchronized (this.y0) {
            z = this.x0 != null;
        }
        return z;
    }

    public EventServiceImpl G() {
        Object obj = this.o.get();
        if (obj == null) {
            synchronized (this.o) {
                obj = this.o.get();
                if (obj == null) {
                    obj = new EventServiceImpl(this);
                    this.o.set(obj);
                }
            }
        }
        if (obj == this.o) {
            obj = null;
        }
        return (EventServiceImpl) obj;
    }

    public boolean G0() {
        boolean z;
        synchronized (this.n0) {
            z = this.r0;
        }
        return z;
    }

    public v1 H() {
        Object obj = this.k0.get();
        if (obj == null) {
            synchronized (this.k0) {
                obj = this.k0.get();
                if (obj == null) {
                    obj = new v1(this);
                    this.k0.set(obj);
                }
            }
        }
        if (obj == this.k0) {
            obj = null;
        }
        return (v1) obj;
    }

    public n I() {
        Object obj = this.G.get();
        if (obj == null) {
            synchronized (this.G) {
                obj = this.G.get();
                if (obj == null) {
                    obj = new n(this);
                    this.G.set(obj);
                }
            }
        }
        if (obj == this.G) {
            obj = null;
        }
        return (n) obj;
    }

    public boolean I0() {
        return StringUtils.containsIgnoreCase(X(), "max");
    }

    public o J() {
        Object obj = this.I.get();
        if (obj == null) {
            synchronized (this.I) {
                obj = this.I.get();
                if (obj == null) {
                    obj = new o(this);
                    this.I.set(obj);
                }
            }
        }
        if (obj == this.I) {
            obj = null;
        }
        return (o) obj;
    }

    public boolean J0() {
        return t7.a("com.unity3d.player.UnityPlayerActivity");
    }

    public Activity K() {
        WeakReference weakReference;
        if (!((Boolean) a(c5.G4)).booleanValue() || (weakReference = this.c) == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public AppLovinSdkInitializationConfiguration L() {
        return this.x0;
    }

    public long M() {
        return this.d;
    }

    public Long N() {
        return this.g;
    }

    public long O() {
        return this.f;
    }

    protected void O0() {
        b(false);
    }

    public s2 P() {
        Object obj = this.Y.get();
        if (obj == null) {
            synchronized (this.Y) {
                obj = this.Y.get();
                if (obj == null) {
                    obj = new s2(this);
                    this.Y.set(obj);
                }
            }
        }
        if (obj == this.Y) {
            obj = null;
        }
        return (s2) obj;
    }

    public p Q() {
        return this.r;
    }

    public void Q0() {
        if (StringUtils.isValidString(this.l)) {
            return;
        }
        this.l = "max";
    }

    public d3 R() {
        return this.t;
    }

    public com.applovin.impl.mediation.d S() {
        Object obj = this.i0.get();
        if (obj == null) {
            synchronized (this.i0) {
                obj = this.i0.get();
                if (obj == null) {
                    obj = new com.applovin.impl.mediation.d(this);
                    this.i0.set(obj);
                }
            }
        }
        if (obj == this.i0) {
            obj = null;
        }
        return (com.applovin.impl.mediation.d) obj;
    }

    public void S0() {
        u().a();
    }

    public com.applovin.impl.mediation.e T() {
        return this.j0;
    }

    public void T0() {
        synchronized (this.n0) {
            this.r0 = true;
            s0().h();
            d();
        }
    }

    public com.applovin.impl.mediation.f U() {
        Object obj = this.d0.get();
        if (obj == null) {
            synchronized (this.d0) {
                obj = this.d0.get();
                if (obj == null) {
                    obj = new com.applovin.impl.mediation.f(this);
                    this.d0.set(obj);
                }
            }
        }
        if (obj == this.d0) {
            obj = null;
        }
        return (com.applovin.impl.mediation.f) obj;
    }

    public com.applovin.impl.mediation.g V() {
        Object obj = this.c0.get();
        if (obj == null) {
            synchronized (this.c0) {
                obj = this.c0.get();
                if (obj == null) {
                    obj = new com.applovin.impl.mediation.g(this);
                    this.c0.set(obj);
                }
            }
        }
        if (obj == this.c0) {
            obj = null;
        }
        return (com.applovin.impl.mediation.g) obj;
    }

    public void V0() {
        p.h("AppLovinSdk", "Resetting SDK state...");
        q0().a();
        q0().e();
        if (this.o0.compareAndSet(true, false)) {
            T0();
        } else {
            this.o0.set(true);
        }
    }

    public t3 W() {
        Object obj = this.g0.get();
        if (obj == null) {
            synchronized (this.g0) {
                obj = this.g0.get();
                if (obj == null) {
                    obj = new t3(this);
                    this.g0.set(obj);
                }
            }
        }
        if (obj == this.g0) {
            obj = null;
        }
        return (t3) obj;
    }

    public void W0() {
        if (StringUtils.isValidString(this.w0)) {
            return;
        }
        this.w0 = "max";
        Q();
        if (p.a()) {
            Q().a("AppLovinSdk", "Detected mediation provider: MAX");
        }
    }

    public String X() {
        return this.l;
    }

    public void X0() {
        z().n();
    }

    public void Y0() {
        a((Map) null);
    }

    public MediationServiceImpl Z() {
        Object obj = this.e0.get();
        if (obj == null) {
            synchronized (this.e0) {
                obj = this.e0.get();
                if (obj == null) {
                    obj = new MediationServiceImpl(this);
                    this.e0.set(obj);
                }
            }
        }
        if (obj == this.e0) {
            obj = null;
        }
        return (MediationServiceImpl) obj;
    }

    public void Z0() {
        if ("admob".equalsIgnoreCase(this.l) && ((Boolean) a(c5.U3)).booleanValue()) {
            String str = (String) a(c5.T3);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            String str2 = AppLovinSdk.VERSION;
            if (str.startsWith(sb.append(str2).append(".").toString())) {
                return;
            }
            final String str3 = "Mismatched AdMob adapter (" + str + ") and AppLovin SDK (" + str2 + ") versions detected, which may cause compatibility issues.";
            p.h("AppLovinSdk", str3);
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    l.this.b(str3);
                }
            });
        }
    }

    public y3 a0() {
        Object obj = this.z.get();
        if (obj == null) {
            synchronized (this.z) {
                obj = this.z.get();
                if (obj == null) {
                    obj = new y3(this);
                    this.z.set(obj);
                }
            }
        }
        if (obj == this.z) {
            obj = null;
        }
        return (y3) obj;
    }

    public z3 b0() {
        Object obj = this.f0.get();
        if (obj == null) {
            synchronized (this.f0) {
                obj = this.f0.get();
                if (obj == null) {
                    obj = new z3();
                    this.f0.set(obj);
                }
            }
        }
        if (obj == this.f0) {
            obj = null;
        }
        return (z3) obj;
    }

    public q c0() {
        Object obj = this.h0.get();
        if (obj == null) {
            synchronized (this.h0) {
                obj = this.h0.get();
                if (obj == null) {
                    obj = new q(this);
                    this.h0.set(obj);
                }
            }
        }
        if (obj == this.h0) {
            obj = null;
        }
        return (q) obj;
    }

    public AppLovinNativeAdService d0() {
        Object obj = this.n.get();
        if (obj == null) {
            synchronized (this.n) {
                obj = this.n.get();
                if (obj == null) {
                    obj = new AppLovinNativeAdService(this);
                    this.n.set(obj);
                }
            }
        }
        if (obj == this.n) {
            obj = null;
        }
        return (AppLovinNativeAdService) obj;
    }

    public d4 e0() {
        Object obj = this.M.get();
        if (obj == null) {
            synchronized (this.M) {
                obj = this.M.get();
                if (obj == null) {
                    obj = new d4(p());
                    this.M.set(obj);
                }
            }
        }
        if (obj == this.M) {
            obj = null;
        }
        return (d4) obj;
    }

    public h4 f0() {
        Object obj = this.X.get();
        if (obj == null) {
            synchronized (this.X) {
                obj = this.X.get();
                if (obj == null) {
                    obj = new h4(this);
                    this.X.set(obj);
                }
            }
        }
        if (obj == this.X) {
            obj = null;
        }
        return (h4) obj;
    }

    public o4 g0() {
        Object obj = this.T.get();
        if (obj == null) {
            synchronized (this.T) {
                obj = this.T.get();
                if (obj == null) {
                    obj = new o4(this);
                    this.T.set(obj);
                }
            }
        }
        if (obj == this.T) {
            obj = null;
        }
        return (o4) obj;
    }

    public com.applovin.impl.sdk.network.b h0() {
        Object obj = this.a0.get();
        if (obj == null) {
            synchronized (this.a0) {
                obj = this.a0.get();
                if (obj == null) {
                    obj = new com.applovin.impl.sdk.network.b(this);
                    this.a0.set(obj);
                }
            }
        }
        if (obj == this.a0) {
            obj = null;
        }
        return (com.applovin.impl.sdk.network.b) obj;
    }

    public e i() {
        Object obj = this.V.get();
        if (obj == null) {
            synchronized (this.V) {
                obj = this.V.get();
                if (obj == null) {
                    obj = new e(this);
                    this.V.set(obj);
                }
            }
        }
        if (obj == this.V) {
            obj = null;
        }
        return (e) obj;
    }

    public PostbackServiceImpl i0() {
        Object obj = this.Z.get();
        if (obj == null) {
            synchronized (this.Z) {
                obj = this.Z.get();
                if (obj == null) {
                    obj = new PostbackServiceImpl(this);
                    this.Z.set(obj);
                }
            }
        }
        if (obj == this.Z) {
            obj = null;
        }
        return (PostbackServiceImpl) obj;
    }

    public f j() {
        Object obj = this.E.get();
        if (obj == null) {
            synchronized (this.E) {
                obj = this.E.get();
                if (obj == null) {
                    obj = new f(this);
                    this.E.set(obj);
                }
            }
        }
        if (obj == this.E) {
            obj = null;
        }
        return (f) obj;
    }

    public String j0() {
        return y0().a();
    }

    public com.applovin.impl.j k() {
        Object obj = this.b0.get();
        if (obj == null) {
            synchronized (this.b0) {
                obj = this.b0.get();
                if (obj == null) {
                    obj = new com.applovin.impl.j(this);
                    this.b0.set(obj);
                }
            }
        }
        if (obj == this.b0) {
            obj = null;
        }
        return (com.applovin.impl.j) obj;
    }

    public String k0() {
        return this.f4474a;
    }

    public AppLovinAdServiceImpl l() {
        Object obj = this.m.get();
        if (obj == null) {
            synchronized (this.m) {
                obj = this.m.get();
                if (obj == null) {
                    obj = new AppLovinAdServiceImpl(this);
                    this.m.set(obj);
                }
            }
        }
        if (obj == this.m) {
            obj = null;
        }
        return (AppLovinAdServiceImpl) obj;
    }

    public MaxSegmentCollectionImpl l0() {
        return (MaxSegmentCollectionImpl) this.k;
    }

    public h m() {
        Object obj = this.J.get();
        if (obj == null) {
            synchronized (this.J) {
                obj = this.J.get();
                if (obj == null) {
                    obj = new h();
                    this.J.set(obj);
                }
            }
        }
        if (obj == this.J) {
            obj = null;
        }
        return (h) obj;
    }

    public Map m0() {
        MaxSegmentCollectionImpl l0 = l0();
        if (l0 == null) {
            return null;
        }
        return l0.getJsonData();
    }

    public i n() {
        Object obj = this.W.get();
        if (obj == null) {
            synchronized (this.W) {
                obj = this.W.get();
                if (obj == null) {
                    obj = new i(this);
                    this.W.set(obj);
                }
            }
        }
        if (obj == this.W) {
            obj = null;
        }
        return (i) obj;
    }

    public b5 n0() {
        Object obj = this.O.get();
        if (obj == null) {
            synchronized (this.O) {
                obj = this.O.get();
                if (obj == null) {
                    obj = new b5(this);
                    this.O.set(obj);
                }
            }
        }
        if (obj == this.O) {
            obj = null;
        }
        return (b5) obj;
    }

    public SessionTracker o0() {
        Object obj = this.H.get();
        if (obj == null) {
            synchronized (this.H) {
                obj = this.H.get();
                if (obj == null) {
                    obj = new SessionTracker(this);
                    this.H.set(obj);
                }
            }
        }
        if (obj == this.H) {
            obj = null;
        }
        return (SessionTracker) obj;
    }

    public AppLovinSdkSettings p0() {
        return this.j;
    }

    public j q() {
        Object obj = this.P.get();
        if (obj == null) {
            synchronized (this.P) {
                obj = this.P.get();
                if (obj == null) {
                    obj = new j(this);
                    this.P.set(obj);
                }
            }
        }
        if (obj == this.P) {
            obj = null;
        }
        return (j) obj;
    }

    public d5 q0() {
        Object obj = this.x.get();
        if (obj == null) {
            synchronized (this.x) {
                obj = this.x.get();
                if (obj == null) {
                    obj = new d5(this);
                    this.x.set(obj);
                }
            }
        }
        if (obj == this.x) {
            obj = null;
        }
        return (d5) obj;
    }

    public String r() {
        return this.b;
    }

    public f5 r0() {
        Object obj = this.B.get();
        if (obj == null) {
            synchronized (this.B) {
                obj = this.B.get();
                if (obj == null) {
                    obj = new f5(this);
                    this.B.set(obj);
                }
            }
        }
        if (obj == this.B) {
            obj = null;
        }
        return (f5) obj;
    }

    public String s() {
        return y0().b();
    }

    public i6 s0() {
        Object obj = this.w.get();
        if (obj == null) {
            synchronized (this.w) {
                obj = this.w.get();
                if (obj == null) {
                    obj = new i6(this);
                    this.w.set(obj);
                }
            }
        }
        if (obj == this.w) {
            obj = null;
        }
        return (i6) obj;
    }

    public CmpServiceImpl t() {
        Object obj = this.p.get();
        if (obj == null) {
            synchronized (this.p) {
                obj = this.p.get();
                if (obj == null) {
                    obj = new CmpServiceImpl(this);
                    this.p.set(obj);
                }
            }
        }
        if (obj == this.p) {
            obj = null;
        }
        return (CmpServiceImpl) obj;
    }

    public f7 t0() {
        Object obj = this.R.get();
        if (obj == null) {
            synchronized (this.R) {
                obj = this.R.get();
                if (obj == null) {
                    obj = new f7(this);
                    this.R.set(obj);
                }
            }
        }
        if (obj == this.R) {
            obj = null;
        }
        return (f7) obj;
    }

    public String toString() {
        return "CoreSdk{sdkKey='" + this.f4474a + "', enabled=" + this.s0 + ", isFirstSession=" + this.t0 + AbstractJsonLexerKt.END_OBJ;
    }

    public k u() {
        Object obj = this.N.get();
        if (obj == null) {
            synchronized (this.N) {
                obj = this.N.get();
                if (obj == null) {
                    obj = new k(this);
                    this.N.set(obj);
                }
            }
        }
        if (obj == this.N) {
            obj = null;
        }
        return (k) obj;
    }

    public l7 u0() {
        Object obj = this.l0.get();
        if (obj == null) {
            synchronized (this.l0) {
                obj = this.l0.get();
                if (obj == null) {
                    obj = new l7(this);
                    this.l0.set(obj);
                }
            }
        }
        if (obj == this.l0) {
            obj = null;
        }
        return (l7) obj;
    }

    public String v() {
        return y0().c();
    }

    public long v0() {
        if (this.h == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - this.h;
    }

    public SdkConfigurationImpl w() {
        return this.z0;
    }

    public Activity w0() {
        Activity b2 = a(p()).b();
        return b2 != null ? b2 : K();
    }

    public r0 x() {
        Object obj = this.y.get();
        if (obj == null) {
            synchronized (this.y) {
                obj = this.y.get();
                if (obj == null) {
                    obj = new r0(this);
                    this.y.set(obj);
                }
            }
        }
        if (obj == this.y) {
            obj = null;
        }
        return (r0) obj;
    }

    public r7 x0() {
        return this.v;
    }

    public v0 y() {
        Object obj = this.Q.get();
        if (obj == null) {
            synchronized (this.Q) {
                obj = this.Q.get();
                if (obj == null) {
                    obj = new v0(this);
                    this.Q.set(obj);
                }
            }
        }
        if (obj == this.Q) {
            obj = null;
        }
        return (v0) obj;
    }

    public s7 y0() {
        Object obj = this.C.get();
        if (obj == null) {
            synchronized (this.C) {
                obj = this.C.get();
                if (obj == null) {
                    obj = new s7(this);
                    this.C.set(obj);
                }
            }
        }
        if (obj == this.C) {
            obj = null;
        }
        return (s7) obj;
    }

    public f1 z() {
        Object obj = this.S.get();
        if (obj == null) {
            synchronized (this.S) {
                obj = this.S.get();
                if (obj == null) {
                    obj = new f1(this);
                    this.S.set(obj);
                }
            }
        }
        if (obj == this.S) {
            obj = null;
        }
        return (f1) obj;
    }

    public q8 z0() {
        Object obj = this.L.get();
        if (obj == null) {
            synchronized (this.L) {
                obj = this.L.get();
                if (obj == null) {
                    obj = new q8(this);
                    this.L.set(obj);
                }
            }
        }
        if (obj == this.L) {
            obj = null;
        }
        return (q8) obj;
    }

    private void d() {
        i6 s0 = s0();
        int i = this.v0 + 1;
        this.v0 = i;
        s0.a((n5) new y5(i, this, new a()), i6.b.CORE);
    }

    public com.applovin.impl.c e() {
        return a(F0);
    }

    public com.applovin.impl.sdk.a f() {
        Object obj = this.F.get();
        if (obj == null) {
            synchronized (this.F) {
                obj = this.F.get();
                if (obj == null) {
                    obj = new com.applovin.impl.sdk.a(this);
                    this.F.set(obj);
                }
            }
        }
        if (obj == this.F) {
            obj = null;
        }
        return (com.applovin.impl.sdk.a) obj;
    }

    public com.applovin.impl.f g() {
        return this.s;
    }

    public com.applovin.impl.sdk.c h() {
        Object obj = this.K.get();
        if (obj == null) {
            synchronized (this.K) {
                obj = this.K.get();
                if (obj == null) {
                    obj = new com.applovin.impl.sdk.c(this);
                    this.K.set(obj);
                }
            }
        }
        if (obj == this.K) {
            obj = null;
        }
        return (com.applovin.impl.sdk.c) obj;
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        F0 = context.getApplicationContext();
        G0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        if (JsonUtils.isValid(jSONObject)) {
            this.h = System.currentTimeMillis();
            s0.c(jSONObject, this);
            s0.b(jSONObject, this);
            s0.a(jSONObject, this);
            p3.f(jSONObject, this);
            p3.d(jSONObject, this);
            p3.e(jSONObject, this);
            p3.g(jSONObject, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        C0();
        this.j.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            p.g("AppLovinSdk", "Setting plugin version: " + pluginVersion);
            q0().a(c5.T3, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) a(c5.s)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        i6 s0 = s0();
        n5 n5Var = this.C0;
        i6.b bVar = i6.b.CORE;
        s0.a(n5Var, bVar);
        s0().a(this.D0, bVar);
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.q = appLovinSdk;
    }

    public static String a(String str) {
        return a(str, (List) null);
    }

    public static String a(int i) {
        return a(i, (List) null);
    }

    public static String a(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context p = p();
        return a(p.getResources().getIdentifier(str, "string", p.getPackageName()), list);
    }

    public static String a(int i, List list) {
        String string = p().getResources().getString(i);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    public static com.applovin.impl.c a(Context context) {
        if (J0 == null) {
            synchronized (K0) {
                if (J0 == null) {
                    J0 = new com.applovin.impl.c(context);
                }
            }
        }
        return J0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        Q();
        if (p.a()) {
            Q().a("AppLovinSdk", str);
        }
        s0().a(new h6(this));
    }

    public void c() {
        synchronized (this.n0) {
            if (!this.r0 && !this.s0) {
                T0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList()).iterator();
        while (it.hasNext()) {
            p.h("AppLovinSdk", (String) it.next());
        }
    }

    public void a(final AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        synchronized (this.y0) {
            if (this.x0 != null) {
                p.h("AppLovinSdk", "AppLovin SDK already initialized with configuration: " + this.x0 + ". Ignoring the provided initialization configuration.");
                if (!D0() || sdkInitializationListener == null) {
                    return;
                }
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.this.a(sdkInitializationListener);
                    }
                });
                return;
            }
            this.e = System.currentTimeMillis();
            this.x0 = appLovinSdkInitializationConfiguration;
            this.A0 = sdkInitializationListener;
            if (p.a()) {
                this.r.a("AppLovinSdk", "Initializing with configuration: " + this.x0 + ", listener: " + (this.A0 != null ? "configured" : "none"));
            }
            this.f4474a = appLovinSdkInitializationConfiguration.getSdkKey();
            this.b = appLovinSdkInitializationConfiguration.getAxonEventKey();
            this.l = appLovinSdkInitializationConfiguration.getMediationProvider();
            this.k = appLovinSdkInitializationConfiguration.getSegmentCollection();
            t7.a(new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    l.this.a(appLovinSdkInitializationConfiguration);
                }
            });
        }
    }

    public List c(c5 c5Var) {
        return q0().c(c5Var);
    }

    public void c(e5 e5Var) {
        r0().b(e5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        if (!t7.c(this)) {
            HashMap hashMap = new HashMap();
            hashMap.put("details", "admob");
            hashMap.put("error_message", str);
            E().a(h2.e1, "adapterVersionMismatch", hashMap);
            return;
        }
        throw new IllegalStateException(str);
    }

    protected void b(boolean z) {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if (y().i() || (sdkInitializationListener = this.A0) == null) {
            return;
        }
        if (D0()) {
            this.A0 = null;
            this.B0 = null;
            U().a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
        } else {
            if (this.B0 == sdkInitializationListener) {
                return;
            }
            U().a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
            if (((Boolean) a(c5.p)).booleanValue()) {
                this.A0 = null;
            } else {
                this.B0 = sdkInitializationListener;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putBoolean(jSONObject, "enabled", D0());
        JsonUtils.putBoolean(jSONObject, "timeout", z);
        JsonUtils.putBoolean(jSONObject, "consent_flow_shown", this.q0.get());
        long currentTimeMillis = System.currentTimeMillis() - this.e;
        HashMap hashMap = new HashMap();
        hashMap.put("duration_ms", String.valueOf(currentTimeMillis));
        hashMap.put("details", jSONObject.toString());
        this.v.d(h2.l, hashMap);
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                l.this.b(sdkInitializationListener);
            }
        }, Math.max(0L, ((Long) a(c5.q)).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(JSONObject jSONObject) {
        List asList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(asList.size());
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            MaxAdFormat formatFromString = MaxAdFormat.formatFromString((String) it.next());
            if (formatFromString != null) {
                arrayList.add(formatFromString);
            }
        }
        return arrayList;
    }

    public void a(boolean z) {
        synchronized (this.n0) {
            this.r0 = false;
            this.s0 = z;
        }
        if (z) {
            List a2 = a4.a(this);
            if (a2.isEmpty()) {
                s0().g();
                O0();
                return;
            }
            Long l = (Long) a(v3.A7);
            x6 x6Var = new x6(this, true, "timeoutInitAdapters", new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    l.this.K0();
                }
            });
            Q();
            if (p.a()) {
                Q().a("AppLovinSdk", "Waiting for required adapters to init: " + a2 + " - timing out in " + l + "ms...");
            }
            s0().a(x6Var, i6.b.TIMEOUT, l.longValue(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        Q();
        if (p.a()) {
            Q().a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.z0);
    }

    public List b(c5 c5Var) {
        return q0().b(c5Var);
    }

    public void b(e5 e5Var, Object obj) {
        r0().b(e5Var, obj);
    }

    public Object b(e5 e5Var) {
        return r0().a(e5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        r12 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r12.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        r13 = (java.util.Map.Entry) r12.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (r11.startsWith((java.lang.String) r13.getKey()) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        r15.w0 = (java.lang.String) r13.getValue();
        Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        if (com.applovin.impl.sdk.p.a() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        Q().a("AppLovinSdk", "Detected mediation provider: " + r15.w0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bd, code lost:
    
        if (r6.booleanValue() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        r2.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        r8 = java.lang.Integer.valueOf(r8.intValue() - 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String b() {
        if (StringUtils.isValidString(this.w0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Map Y = Y();
        List c2 = c(c5.t4);
        Boolean bool = (Boolean) a(c5.u4);
        if (Y.isEmpty() && !bool.booleanValue()) {
            return null;
        }
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Integer num = (Integer) a(c5.s4);
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (num.intValue() <= 0) {
                    break;
                }
                String className = stackTraceElement.getClassName();
                Iterator it = c2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (className.startsWith((String) it.next())) {
                        break;
                    }
                }
            }
        } catch (Throwable th) {
            E().a("AppLovinSdk", "detectMediationProvider", th);
        }
        this.w0 = "unknown";
        Q();
        if (p.a()) {
            Q().k("AppLovinSdk", "Unable to detect mediation provider");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String join = StringUtils.join(",", arrayList);
        if (!((Boolean) a(c5.v4)).booleanValue()) {
            return join;
        }
        E().a(h2.d, "detectMediationProvider", CollectionUtils.hashMap("details", join));
        return null;
    }

    public void a(o3 o3Var) {
        if (s0().f()) {
            return;
        }
        List a2 = a4.a(this);
        if (a2.size() <= 0 || !U().a().containsAll(a2)) {
            return;
        }
        Q();
        if (p.a()) {
            Q().a("AppLovinSdk", "All required adapters initialized");
        }
        s0().g();
        O0();
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List list = this.m0;
        return (list == null || list.size() <= 0 || this.m0.contains(maxAdFormat)) ? false : true;
    }

    public void a() {
        String str = (String) r0().a(e5.g, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < t7.g(str)) {
                p.h("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
            }
        }
    }

    public Object a(c5 c5Var) {
        return q0().a(c5Var);
    }

    public boolean a(c5 c5Var, MaxAdFormat maxAdFormat) {
        return b(c5Var).contains(maxAdFormat);
    }

    public void a(Map map) {
        W().a(map);
    }

    public void a(Uri uri) {
        C().a(uri);
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        r0().a(str, obj, editor);
    }

    public Object a(e5 e5Var) {
        return a(e5Var, (Object) null);
    }

    public Object a(e5 e5Var, Object obj) {
        return r0().a(e5Var, obj);
    }

    public Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return f5.a(str, obj, cls, sharedPreferences);
    }

    public void a(SharedPreferences sharedPreferences) {
        r0().a(sharedPreferences);
    }
}
