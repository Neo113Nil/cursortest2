package com.ironsource.sdk.controller;

import com.ironsource.C4341bf;
import com.ironsource.C4491k4;
import com.ironsource.G3;
import com.ironsource.H3;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4495k8;
import com.ironsource.U3;
import com.ironsource.V6;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class FeaturesManager {
    private static volatile FeaturesManager d = null;
    private static final String e = "debugMode";

    /* renamed from: a, reason: collision with root package name */
    private Map<String, ?> f8535a;
    private final ArrayList<String> b = new a();
    private InterfaceC4495k8 c = Ib.a0().t();

    class a extends ArrayList<String> {
        a() {
            add(U3.d.f);
            add(U3.d.e);
            add(U3.d.g);
            add(U3.d.h);
            add(U3.d.i);
            add(U3.d.j);
            add(U3.d.k);
            add(U3.d.l);
            add(U3.d.m);
        }
    }

    private FeaturesManager() {
        if (d != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        this.f8535a = new HashMap();
    }

    public static FeaturesManager getInstance() {
        if (d == null) {
            synchronized (FeaturesManager.class) {
                if (d == null) {
                    d = new FeaturesManager();
                }
            }
        }
        return d;
    }

    ArrayList<String> a() {
        return new ArrayList<>(this.b);
    }

    public JSONObject getDataManagerConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return networkConfiguration.has(U3.a.d) ? networkConfiguration.optJSONObject(U3.a.d) : new JSONObject();
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f8535a.containsKey("debugMode")) {
                num = (Integer) this.f8535a.get("debugMode");
            }
        } catch (Exception e2) {
            C4491k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public G3 getFeatureFlagCatchUrlError() {
        return new G3(SDKUtils.getNetworkConfiguration().optJSONObject(G3.a.c));
    }

    public H3 getFeatureFlagClickCheck() {
        return new H3(SDKUtils.getNetworkConfiguration());
    }

    public V6 getFeatureFlagHealthCheck() {
        JSONObject a2 = this.c.a(U3.a.r);
        return a2 instanceof JSONObject ? new V6(a2) : new V6(null);
    }

    public boolean getFeatureFlagLoadControllerAndPlayerFromBundle() {
        return SDKUtils.getNetworkFeatureConfiguration().optBoolean(U3.a.w, false);
    }

    public int getInitRecoverTrials() {
        JSONObject optJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject("init");
        if (optJSONObject != null) {
            return optJSONObject.optInt(U3.a.e, 0);
        }
        return 0;
    }

    public C4341bf getSessionHistoryConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return new C4341bf(networkConfiguration.has(U3.a.s) ? networkConfiguration.optJSONObject(U3.a.s) : new JSONObject());
    }

    public boolean getStopUseOnResumeAndPause() {
        return Boolean.TRUE.equals(this.c.c(U3.a.u));
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f8535a = map;
    }
}
