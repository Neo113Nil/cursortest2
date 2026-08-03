package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f6439a = "BANNER";
    public static final java.lang.String b = "LARGE";
    public static final java.lang.String c = "RECTANGLE";
    public static final java.lang.String d = "LEADERBOARD";
    public static final java.lang.String e = "SMART";
    public static final java.lang.String f = "CUSTOM";
    public static final java.lang.String g = "MEDIUM_RECTANGLE";
    public static final java.lang.String h = "bannerAdSize";
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = 2;
    public static final int l = 3;
    public static final int m = 4;
    public static final int n = 5;
    public static final int o = 6;
    public static final int p = -1;
    public static final java.lang.String q = "Adaptive=true";

    interface a {
        void a(java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, java.lang.StringBuilder sb);
    }

    interface b {
        void a();

        void a(java.lang.String str);
    }

    static void a(com.ironsource.mediationsdk.o oVar, com.ironsource.C3018e3 c3018e3, com.ironsource.mediationsdk.j.b bVar) {
        java.lang.String str;
        if (c(oVar)) {
            str = null;
        } else {
            str = java.lang.String.format("can't load banner - %s", oVar == null ? "banner is null" : "banner is destroyed");
        }
        if (c3018e3 == null || android.text.TextUtils.isEmpty(c3018e3.c())) {
            str = java.lang.String.format("can't load banner - %s", c3018e3 == null ? "placement is null" : "placement name is empty");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            bVar.a();
        } else {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(str);
            bVar.a(str);
        }
    }

    public static com.ironsource.mediationsdk.ISBannerSize b() {
        if (com.ironsource.mediationsdk.AdapterUtils.isLargeScreen(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext())) {
            a(e, 728, 90);
        }
        return a(e, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    }

    static boolean c(com.ironsource.mediationsdk.o oVar) {
        return (oVar == null || oVar.b()) ? false : true;
    }

    public static int b(int i2) {
        if (!com.ironsource.mediationsdk.p.h().G()) {
            com.ironsource.mediationsdk.logger.IronLog.API.error("The mediation must be successfully initiated before calling this API");
            return -1;
        }
        return a(i2);
    }

    public static void b(com.ironsource.mediationsdk.o oVar) {
        com.ironsource.mediationsdk.ISBannerSize size;
        if (oVar == null || (size = oVar.getSize()) == null || !size.isSmart()) {
            return;
        }
        com.ironsource.mediationsdk.ISBannerSize b2 = b();
        com.ironsource.mediationsdk.m.f6449a.a(b2, size.e);
        b2.setAdaptive(size.isAdaptive());
        oVar.setBannerSize(b2);
    }

    static void a(com.ironsource.mediationsdk.o oVar, com.ironsource.mediationsdk.j.b bVar) {
        if (oVar != null && !oVar.b()) {
            bVar.a();
        } else {
            bVar.a(java.lang.String.format("can't destroy banner - %s", oVar == null ? "banner is null" : "banner is destroyed"));
        }
    }

    static long a(long j2, long j3) {
        return j3 - (new java.util.Date().getTime() - j2);
    }

    public static com.ironsource.mediationsdk.ISBannerSize a(java.lang.String str, int i2, int i3) {
        return new com.ironsource.mediationsdk.ISBannerSize(str, i2, i3);
    }

    public static com.ironsource.mediationsdk.ISBannerSize a() {
        return new com.ironsource.mediationsdk.ISBannerSize(d, 728, 90);
    }

    public static void a(com.ironsource.mediationsdk.o oVar) {
        if (oVar != null) {
            oVar.a();
        }
    }

    public static void a(final com.ironsource.mediationsdk.o oVar, final android.view.View view, final android.widget.FrameLayout.LayoutParams layoutParams, final com.ironsource.InterfaceC3322v3 interfaceC3322v3) {
        if (oVar == null || view == null || layoutParams == null) {
            return;
        }
        final android.content.Context applicationContext = com.ironsource.environment.ContextProvider.getInstance().getApplicationContext();
        final com.ironsource.mediationsdk.ISBannerSize size = oVar.getSize();
        com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.j$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.mediationsdk.j.a(com.ironsource.mediationsdk.o.this, view, size, applicationContext, layoutParams, interfaceC3322v3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.ironsource.mediationsdk.o oVar, android.view.View view, com.ironsource.mediationsdk.ISBannerSize iSBannerSize, android.content.Context context, android.widget.FrameLayout.LayoutParams layoutParams, com.ironsource.InterfaceC3322v3 interfaceC3322v3) {
        try {
            oVar.removeAllViews();
            android.view.ViewParent parent = view.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(view);
            }
            if (iSBannerSize != null) {
                if (iSBannerSize.isAdaptive()) {
                    a(oVar, view, context, iSBannerSize);
                } else {
                    oVar.addView(view, 0, layoutParams);
                }
            }
            if (interfaceC3322v3 != null) {
                interfaceC3322v3.a();
            }
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Error while binding a banner - " + android.util.Log.getStackTraceString(e2));
        }
    }

    public static void a(com.ironsource.mediationsdk.o oVar, android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        a(oVar, view, layoutParams, (com.ironsource.InterfaceC3322v3) null);
    }

    private static void a(com.ironsource.mediationsdk.o oVar, android.view.View view, android.content.Context context, com.ironsource.mediationsdk.ISBannerSize iSBannerSize) {
        int dpToPixels = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(context, iSBannerSize.e.d());
        int dpToPixels2 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(context, iSBannerSize.e.c());
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(dpToPixels, dpToPixels2);
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(context);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setGravity(17);
        relativeLayout.addView(view, 0);
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) oVar.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new android.widget.FrameLayout.LayoutParams(dpToPixels, dpToPixels2);
        }
        layoutParams2.height = dpToPixels2;
        layoutParams2.width = dpToPixels;
        layoutParams2.gravity = 17;
        oVar.setLayoutParams(layoutParams2);
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("containerParams height - " + iSBannerSize.e.c() + " width - " + iSBannerSize.e.d());
        oVar.addView(relativeLayout, 0, layoutParams2);
    }

    public static int a(int i2) {
        int i3 = -1;
        try {
            i3 = a(a(com.ironsource.mediationsdk.c.b()), i2);
            a(i2, i3);
            com.ironsource.mediationsdk.logger.IronLog.API.verbose("Maximal height - " + i3 + " for width - " + i2);
            return i3;
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Failed to get adaptive height: " + e2.getMessage());
            return i3;
        }
    }

    private static java.util.Map<java.lang.String, java.lang.Object> a(com.ironsource.mediationsdk.c cVar) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        concurrentHashMap.putAll(cVar.a());
        concurrentHashMap.putAll(cVar.c());
        return concurrentHashMap;
    }

    private static int a(java.util.Map<java.lang.String, java.lang.Object> map, int i2) {
        int i3 = -1;
        for (java.lang.Object obj : map.values()) {
            try {
                i3 = java.lang.Math.max(i3, a(obj, i2));
            } catch (java.lang.Throwable th) {
                a(obj, th);
            }
        }
        return i3;
    }

    private static int a(java.lang.Object obj, int i2) {
        if (obj instanceof com.ironsource.mediationsdk.AbstractAdapter) {
            return ((com.ironsource.mediationsdk.AbstractAdapter) obj).getAdaptiveHeight(i2);
        }
        if (obj instanceof com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter) {
            return ((com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter) obj).getAdaptiveHeight(i2);
        }
        return -1;
    }

    private static void a(java.lang.Object obj, java.lang.Throwable th) {
        java.lang.String simpleName = obj != null ? obj.getClass().getSimpleName() : "unknown";
        com.ironsource.C3180n4.d().a(th);
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Exception while calling getAdaptiveHeight for adapter - " + simpleName + ": " + th.getMessage());
    }

    private static void a(int i2, int i3) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (i3 == -1) {
                jSONObject.put("errorCode", 2);
                jSONObject.put("reason", "No networks found supporting adaptive banners");
            } else {
                jSONObject.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, "w:" + i2 + ",h:" + i3);
            }
            com.ironsource.F9.i().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.BN_GET_MAXIMAL_ADAPTIVE_HEIGHT, jSONObject));
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
    }

    public static void a(java.util.Map<java.lang.String, java.lang.Object> map, com.ironsource.mediationsdk.ISBannerSize iSBannerSize) {
        char c2;
        if (iSBannerSize != null) {
            try {
                java.lang.String description = iSBannerSize.getDescription();
                switch (description.hashCode()) {
                    case -387072689:
                        if (description.equals(c)) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 72205083:
                        if (description.equals(b)) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 79011241:
                        if (description.equals(e)) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 446888797:
                        if (description.equals(d)) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1951953708:
                        if (description.equals(f6439a)) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1999208305:
                        if (description.equals(f)) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                if (c2 == 0) {
                    map.put(h, 1);
                } else if (c2 == 1) {
                    map.put(h, 2);
                } else if (c2 == 2) {
                    map.put(h, 3);
                } else if (c2 == 3) {
                    map.put(h, 4);
                } else if (c2 == 4) {
                    map.put(h, 5);
                } else if (c2 == 5) {
                    map.put(h, 6);
                    map.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
                }
                if (iSBannerSize.isAdaptive()) {
                    java.lang.String a2 = a(iSBannerSize);
                    if (map.containsKey(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1)) {
                        a2 = map.get(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1) + " , " + a(iSBannerSize);
                    }
                    map.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, a2);
                }
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(android.util.Log.getStackTraceString(e2));
            }
        }
    }

    public static java.lang.String a(com.ironsource.mediationsdk.ISBannerSize iSBannerSize) {
        return "Adaptive=true, size: " + iSBannerSize.e.d() + "x" + iSBannerSize.e.c() + "; fallback: " + iSBannerSize.getDescription() + ", size: " + iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight() + ";";
    }

    public static boolean a(com.ironsource.T7 t7, int i2, int i3) {
        if (t7 != null && t7.d() > 0 && t7.c() > 0) {
            if (t7.d() >= i2 && t7.c() >= i3) {
                return true;
            }
            com.ironsource.mediationsdk.logger.IronLog.API.warning("Container size too small: Banner may not display correctly.");
            return true;
        }
        com.ironsource.mediationsdk.logger.IronLog.API.warning("Container size is invalid: Default banner size will be used.");
        return false;
    }
}
