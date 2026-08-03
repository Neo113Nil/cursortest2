package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
public class FeaturesManager {
    private static volatile com.ironsource.sdk.controller.FeaturesManager d = null;
    private static final java.lang.String e = "debugMode";

    /* renamed from: a, reason: collision with root package name */
    private java.util.Map<java.lang.String, ?> f6596a;
    private final java.util.ArrayList<java.lang.String> b = new com.ironsource.sdk.controller.FeaturesManager.a();
    private com.ironsource.InterfaceC3166m8 c = com.ironsource.Jb.Y().t();

    class a extends java.util.ArrayList<java.lang.String> {
        a() {
            add(com.ironsource.X3.d.f);
            add(com.ironsource.X3.d.e);
            add(com.ironsource.X3.d.g);
            add(com.ironsource.X3.d.h);
            add(com.ironsource.X3.d.i);
            add(com.ironsource.X3.d.j);
            add(com.ironsource.X3.d.k);
            add(com.ironsource.X3.d.l);
            add(com.ironsource.X3.d.m);
        }
    }

    private FeaturesManager() {
        if (d != null) {
            throw new java.lang.RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        this.f6596a = new java.util.HashMap();
    }

    public static com.ironsource.sdk.controller.FeaturesManager getInstance() {
        if (d == null) {
            synchronized (com.ironsource.sdk.controller.FeaturesManager.class) {
                if (d == null) {
                    d = new com.ironsource.sdk.controller.FeaturesManager();
                }
            }
        }
        return d;
    }

    java.util.ArrayList<java.lang.String> a() {
        return new java.util.ArrayList<>(this.b);
    }

    public org.json.JSONObject getDataManagerConfig() {
        org.json.JSONObject networkConfiguration = com.ironsource.sdk.utils.SDKUtils.getNetworkConfiguration();
        return networkConfiguration.has(com.ironsource.X3.a.d) ? networkConfiguration.optJSONObject(com.ironsource.X3.a.d) : new org.json.JSONObject();
    }

    public int getDebugMode() {
        java.lang.Integer num = 0;
        try {
            if (this.f6596a.containsKey("debugMode")) {
                num = (java.lang.Integer) this.f6596a.get("debugMode");
            }
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public com.ironsource.J3 getFeatureFlagCatchUrlError() {
        return new com.ironsource.J3(com.ironsource.sdk.utils.SDKUtils.getNetworkConfiguration().optJSONObject(com.ironsource.J3.a.c));
    }

    public com.ironsource.K3 getFeatureFlagClickCheck() {
        return new com.ironsource.K3(com.ironsource.sdk.utils.SDKUtils.getNetworkConfiguration());
    }

    public com.ironsource.Y6 getFeatureFlagHealthCheck() {
        org.json.JSONObject a2 = this.c.a(com.ironsource.X3.a.r);
        return a2 instanceof org.json.JSONObject ? new com.ironsource.Y6(a2) : new com.ironsource.Y6(null);
    }

    public boolean getFeatureFlagLoadControllerAndPlayerFromBundle() {
        return com.ironsource.sdk.utils.SDKUtils.getNetworkFeatureConfiguration().optBoolean(com.ironsource.X3.a.w, false);
    }

    public int getInitRecoverTrials() {
        org.json.JSONObject optJSONObject = com.ironsource.sdk.utils.SDKUtils.getNetworkConfiguration().optJSONObject(com.ironsource.X3.a.f);
        if (optJSONObject != null) {
            return optJSONObject.optInt(com.ironsource.X3.a.e, 0);
        }
        return 0;
    }

    public com.ironsource.C3012df getSessionHistoryConfig() {
        org.json.JSONObject networkConfiguration = com.ironsource.sdk.utils.SDKUtils.getNetworkConfiguration();
        return new com.ironsource.C3012df(networkConfiguration.has(com.ironsource.X3.a.s) ? networkConfiguration.optJSONObject(com.ironsource.X3.a.s) : new org.json.JSONObject());
    }

    public boolean getStopUseOnResumeAndPause() {
        return java.lang.Boolean.TRUE.equals(this.c.c(com.ironsource.X3.a.u));
    }

    public void updateDebugConfigurations(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return;
        }
        this.f6596a = map;
    }
}
