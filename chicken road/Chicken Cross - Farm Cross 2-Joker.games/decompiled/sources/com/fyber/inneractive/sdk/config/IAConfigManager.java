package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class IAConfigManager {
    public static long S;
    public final com.fyber.inneractive.sdk.util.y0 A;
    public g B;
    public m C;
    public com.fyber.inneractive.sdk.network.v0 D;
    public h E;
    public final com.fyber.inneractive.sdk.ignite.h F;
    public final com.fyber.inneractive.sdk.cache.l G;
    public final com.fyber.inneractive.sdk.network.f H;
    public final HashMap I;
    public final com.fyber.inneractive.sdk.serverapi.extradata.d J;
    public final AtomicBoolean K;
    public final AtomicBoolean L;
    public com.fyber.inneractive.sdk.measurement.e M;
    public WebView N;
    public final com.fyber.inneractive.sdk.config.global.r O;
    public com.fyber.inneractive.sdk.config.cellular.a P;
    public final AtomicBoolean Q;

    /* renamed from: a, reason: collision with root package name */
    public HashMap f5233a = new HashMap();
    public HashMap b = new HashMap();
    public String c;
    public String d;
    public String e;
    public volatile Integer f;
    public Context g;
    public final CopyOnWriteArrayList h;
    public boolean i;
    public final p0 j;
    public InneractiveUserConfig k;
    public boolean l;
    public String m;
    public InneractiveMediationName n;
    public String o;
    public String p;
    public ArrayList q;
    public boolean r;
    public final com.fyber.inneractive.sdk.network.l0 s;
    public String t;
    public v u;
    public j v;
    public w w;
    public final c1 x;
    public t1 y;
    public com.fyber.inneractive.sdk.config.global.a z;
    public static final IAConfigManager R = new IAConfigManager();
    public static final k0 T = new k0();

    public interface OnConfigurationReadyAndValidListener {
        void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc);
    }

    public IAConfigManager() {
        new HashSet();
        this.i = false;
        this.j = new p0();
        this.l = false;
        this.r = false;
        this.s = new com.fyber.inneractive.sdk.network.l0();
        this.t = "";
        this.x = new c1();
        this.A = new com.fyber.inneractive.sdk.util.y0();
        this.F = new com.fyber.inneractive.sdk.ignite.h();
        this.G = new com.fyber.inneractive.sdk.cache.l();
        this.H = new com.fyber.inneractive.sdk.network.f();
        this.I = new HashMap();
        this.K = new AtomicBoolean();
        this.L = new AtomicBoolean(false);
        this.O = com.fyber.inneractive.sdk.config.global.r.a();
        this.Q = new AtomicBoolean(false);
        this.h = new CopyOnWriteArrayList();
        this.J = new com.fyber.inneractive.sdk.serverapi.extradata.d();
    }

    public static void addListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        R.h.add(onConfigurationReadyAndValidListener);
    }

    public static JSONArray b() {
        com.fyber.inneractive.sdk.serverapi.extradata.d dVar = R.J;
        dVar.getClass();
        JSONArray jSONArray = (JSONArray) dVar.a(new JSONArray(), new com.fyber.inneractive.sdk.serverapi.extradata.b());
        if (jSONArray == null) {
            IAlog.a("%sExtra data JSON is empty", "UserExtraDataManager");
            return null;
        }
        IAlog.a("%sReturning extra data JSON objects", "UserExtraDataManager");
        return jSONArray;
    }

    public static boolean c() {
        h hVar = R.E;
        if (hVar == null) {
            return false;
        }
        return hVar.i();
    }

    public static boolean d() {
        IAConfigManager iAConfigManager = R;
        boolean z = iAConfigManager.e != null;
        int i = n.f5271a;
        boolean booleanValue = Boolean.valueOf(System.getProperty("ia.testEnvironmentConfiguration.forceConfigRefresh", Boolean.toString(false))).booleanValue();
        if ((z && System.currentTimeMillis() - S > 3600000) || booleanValue) {
            if (booleanValue) {
                v vVar = iAConfigManager.u;
                vVar.d = false;
                com.fyber.inneractive.sdk.util.r.f5965a.execute(new com.fyber.inneractive.sdk.util.l(vVar.e));
            }
            a();
            com.fyber.inneractive.sdk.web.b1 b1Var = com.fyber.inneractive.sdk.web.b1.c;
            b1Var.getClass();
            com.fyber.inneractive.sdk.util.r.f5965a.execute(new com.fyber.inneractive.sdk.web.a1(b1Var));
        }
        return z;
    }

    public static void e() {
        Integer num;
        Integer num2;
        IAConfigManager iAConfigManager = R;
        iAConfigManager.L.set(true);
        if (iAConfigManager.Q.compareAndSet(false, true)) {
            h hVar = iAConfigManager.E;
            if (hVar != null) {
                num2 = hVar.f();
                num = hVar.g();
            } else {
                num = null;
                num2 = null;
            }
            new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.u.IA_IAB_GDPR_TCF_PURPOSE_1_DISABLED).a("cmp_id", num2, "cmp_version", num).a((String) null);
        }
    }

    public static void f() {
        SharedPreferences sharedPreferences = com.fyber.inneractive.sdk.util.o.f5960a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("IAConfigFQE", true).apply();
        }
    }

    public static boolean g() {
        IAConfigManager iAConfigManager = R;
        Boolean c = ((com.fyber.inneractive.sdk.config.global.features.m) iAConfigManager.O.a(com.fyber.inneractive.sdk.config.global.features.m.class)).c(com.ironsource.mediationsdk.metadata.a.k);
        boolean booleanValue = c != null ? c.booleanValue() : false;
        IAlog.a("OMSDK AB %s", String.valueOf(booleanValue));
        if (booleanValue) {
            com.fyber.inneractive.sdk.measurement.e eVar = iAConfigManager.M;
            return eVar == null || !eVar.f5440a;
        }
        IAlog.a("OM SDK disabled", new Object[0]);
        IAlog.d("OM SDK disabled", new Object[0]);
        return false;
    }

    public static void removeListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        R.h.remove(onConfigurationReadyAndValidListener);
    }

    public final void a(boolean z, Exception exc) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener = (OnConfigurationReadyAndValidListener) it.next();
            if (onConfigurationReadyAndValidListener != null) {
                IAlog.e("notifying listener configuration state has been resolved", new Object[0]);
                onConfigurationReadyAndValidListener.onConfigurationReadyAndValid(this, z, !z ? exc : null);
            }
        }
    }

    public static void a() {
        IAConfigManager iAConfigManager = R;
        g gVar = iAConfigManager.B;
        if (gVar != null) {
            iAConfigManager.s.a(gVar);
        }
        v vVar = iAConfigManager.u;
        if (vVar.d) {
            return;
        }
        iAConfigManager.s.a(new com.fyber.inneractive.sdk.network.v0(new s(vVar), vVar.f5290a, vVar.e));
    }

    public static void a(String str, String str2) {
        IAConfigManager iAConfigManager = R;
        if ("max".equalsIgnoreCase(iAConfigManager.m)) {
            IAlog.a("%sMediation is MAX, not reporting publisher privacy api usage", IAlog.a(IAConfigManager.class));
            return;
        }
        if (iAConfigManager.K.get()) {
            IAlog.a("%sAlready reported publisher privacy api usage", IAlog.a(IAConfigManager.class));
            return;
        }
        if (iAConfigManager.L.get() || iAConfigManager.f != null) {
            if (!iAConfigManager.K.get()) {
                iAConfigManager.K.set(true);
                SharedPreferences sharedPreferences = com.fyber.inneractive.sdk.util.o.f5960a.getSharedPreferences("IAConfigurationPreferences", 0);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putBoolean("privacy_api_usage_reported", true).apply();
                }
            }
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.u.PUBLISHER_PRIVACY_API_USAGE);
            if (str2 == null) {
                str2 = "";
            }
            wVar.a(str, str2).a((String) null);
            return;
        }
        IAlog.a("%sDT location headers are null, dropping publisher privacy api usage", IAlog.a(IAConfigManager.class));
    }
}
