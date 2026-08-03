package com.ironsource;

/* loaded from: classes5.dex */
public class Ff {

    /* renamed from: a, reason: collision with root package name */
    private static final java.util.Map<com.ironsource.mediationsdk.IronSource.a, com.ironsource.C3247r0> f5712a = new java.util.HashMap();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5713a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.unity3d.mediation.LevelPlay.AdFormat.values().length];
            b = iArr;
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                b[com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                b[com.unity3d.mediation.LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                b[com.unity3d.mediation.LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.ironsource.mediationsdk.IronSource.a.values().length];
            f5713a = iArr2;
            try {
                iArr2[com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f5713a[com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f5713a[com.ironsource.mediationsdk.IronSource.a.NATIVE_AD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f5713a[com.ironsource.mediationsdk.IronSource.a.BANNER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    public static com.ironsource.S0 a(com.ironsource.AbstractC3355x0 abstractC3355x0, int i) {
        return a(abstractC3355x0).a(abstractC3355x0.b().c(), abstractC3355x0.m(), i);
    }

    public static com.ironsource.Ff.b b(com.ironsource.mediationsdk.IronSource.a aVar) {
        return new com.ironsource.Ff.b(aVar);
    }

    public static int c(com.ironsource.mediationsdk.IronSource.a aVar) {
        int i = com.ironsource.Ff.a.f5713a[aVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? com.ironsource.AbstractC3143l3.e.NOT_SUPPORTED.b() : com.ironsource.AbstractC3143l3.e.BANNER.b() : com.ironsource.AbstractC3143l3.e.NATIVE_AD.b() : com.ironsource.AbstractC3143l3.e.INTERSTITIAL.b() : com.ironsource.AbstractC3143l3.e.REWARDED_VIDEO.b();
    }

    public static com.ironsource.mediationsdk.IronSource.a b(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return null;
        }
        int i = com.ironsource.Ff.a.b[adFormat.ordinal()];
        if (i == 1) {
            return com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO;
        }
        if (i == 2) {
            return com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL;
        }
        if (i == 3) {
            return com.ironsource.mediationsdk.IronSource.a.BANNER;
        }
        if (i != 4) {
            return null;
        }
        return com.ironsource.mediationsdk.IronSource.a.NATIVE_AD;
    }

    private static com.ironsource.C3247r0 a(com.ironsource.AbstractC3355x0 abstractC3355x0) {
        java.util.Map<com.ironsource.mediationsdk.IronSource.a, com.ironsource.C3247r0> map = f5712a;
        if (map.containsKey(abstractC3355x0.b().a())) {
            return map.get(abstractC3355x0.b().a());
        }
        com.ironsource.C3247r0 c3247r0 = new com.ironsource.C3247r0();
        map.put(abstractC3355x0.b().a(), c3247r0);
        return c3247r0;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.mediationsdk.IronSource.a f5714a;

        public b(com.ironsource.mediationsdk.IronSource.a aVar) {
            this.f5714a = aVar;
        }

        private java.lang.String b() {
            com.ironsource.mediationsdk.IronSource.a aVar = this.f5714a;
            return aVar != null ? aVar.name() : "";
        }

        public java.lang.String a(java.lang.String str, java.lang.String str2) {
            java.lang.String str3;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(b());
            if (android.text.TextUtils.isEmpty(str2)) {
                str3 = "";
            } else {
                str3 = " - " + str2;
            }
            sb.append(str3);
            java.lang.String sb2 = sb.toString();
            if (android.text.TextUtils.isEmpty(str)) {
                return sb2;
            }
            return sb2 + " - " + str;
        }

        public java.lang.String a(java.lang.String str) {
            return a(str, null);
        }

        public java.lang.String a() {
            return a(null);
        }
    }

    public static com.ironsource.C2953aa a() {
        return com.ironsource.mediationsdk.p.h().n();
    }

    public static void a(java.lang.Throwable th) {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "SafeRunnable", th);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("reason", th.getMessage());
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_SDK_INTERNAL_ERROR, jSONObject);
    }

    public static void a(java.lang.Exception exc) {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "Exception", exc);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("reason", exc.getMessage());
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_LOAD_ARM_DATA_PARSE_ERROR, jSONObject);
    }

    public static void a(com.ironsource.EnumC3378y5 enumC3378y5, org.json.JSONObject jSONObject) {
        com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(enumC3378y5, com.ironsource.C3079ha.a(com.ironsource.mediationsdk.utils.IronSourceUtils.b(false), jSONObject)));
    }

    public static boolean a(com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface, com.ironsource.mediationsdk.IronSource.a aVar, java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        if (com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface) || !((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(a(aVar))) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public static java.lang.String a(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        int i = com.ironsource.Ff.a.b[adFormat.ordinal()];
        if (i == 1) {
            return "rewarded";
        }
        if (i == 2) {
            return "interstitial";
        }
        if (i == 3) {
            return "banner";
        }
        if (i != 4) {
            return "";
        }
        return "nativeAd";
    }

    public static com.unity3d.mediation.LevelPlay.AdFormat a(com.ironsource.mediationsdk.IronSource.a aVar) {
        int i = com.ironsource.Ff.a.f5713a[aVar.ordinal()];
        if (i == 1) {
            return com.unity3d.mediation.LevelPlay.AdFormat.REWARDED;
        }
        if (i == 2) {
            return com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i == 3) {
            return com.unity3d.mediation.LevelPlay.AdFormat.NATIVE_AD;
        }
        if (i != 4) {
            return null;
        }
        return com.unity3d.mediation.LevelPlay.AdFormat.BANNER;
    }
}
