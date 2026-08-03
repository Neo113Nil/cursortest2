package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Z5 extends com.inmobi.media.AbstractC2920z2 implements com.inmobi.media.InterfaceC2859wh {
    public long b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final kotlin.jvm.functions.Function1 f;
    public final com.inmobi.media.InterfaceC2772t9 g;
    public com.inmobi.media.Y5 h;
    public final java.lang.String i;
    public com.inmobi.media.C2431gb j;
    public boolean k;
    public boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z5(android.content.Context context, long j, java.lang.String placementType, java.lang.String impressionId, java.lang.String creativeId, kotlin.jvm.functions.Function1 onLpLifecycleEvent, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementType, "placementType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onLpLifecycleEvent, "onLpLifecycleEvent");
        this.b = j;
        this.c = placementType;
        this.d = impressionId;
        this.e = creativeId;
        this.f = onLpLifecycleEvent;
        this.g = interfaceC2772t9;
        this.i = "Z5";
        setImportantForAccessibility(2);
        getSettings().setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        e();
        if (getAdConfig().getEnableCookiesOnInAppBrowser()) {
            android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
    }

    public static final kotlin.Unit a(com.inmobi.media.Z5 z5) {
        com.inmobi.media.X5 x5;
        android.view.ViewParent parent = z5.getParent();
        com.inmobi.media.U5 u5 = parent instanceof com.inmobi.media.U5 ? (com.inmobi.media.U5) parent : null;
        if (u5 != null && (x5 = u5.d) != null) {
            com.inmobi.media.C c = ((com.inmobi.media.Q8) x5).f4912a.b;
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = c instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi ? (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c : null;
            if (gestureDetectorOnGestureListenerC2675pi != null) {
                gestureDetectorOnGestureListenerC2675pi.D();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    private final com.inmobi.media.core.config.models.AdConfig getAdConfig() {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        return (com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class);
    }

    private final com.inmobi.media.core.config.models.AdConfig.RenderingConfig getRenderingConfig() {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        return ((com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class)).getRendering();
    }

    @Override // com.inmobi.media.InterfaceC2859wh
    public final boolean c() {
        java.lang.String TAG = this.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        return !getRenderingConfig().getAutoRedirectionEnforcement() || ((getViewTouchTimestamp() > (-1L) ? 1 : (getViewTouchTimestamp() == (-1L) ? 0 : -1)) != 0 && ((android.os.SystemClock.elapsedRealtime() - getViewTouchTimestamp()) > getRenderingConfig().getUserTouchResetTime() ? 1 : ((android.os.SystemClock.elapsedRealtime() - getViewTouchTimestamp()) == getRenderingConfig().getUserTouchResetTime() ? 0 : -1)) < 0);
    }

    @Override // com.inmobi.media.AbstractC2920z2
    public final com.inmobi.media.C2325cb d() {
        com.inmobi.media.C2352db c2352db = new com.inmobi.media.C2352db(true, null, getAdConfig().getCctEnabled(), 18);
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new com.inmobi.media.C2325cb(context, c2352db, null, this, null, this.g, 140);
    }

    public final void e() {
        com.inmobi.media.Y5 y5 = new com.inmobi.media.Y5("IN_CUSTOM_EXPAND", new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Z5$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Z5.a(com.inmobi.media.Z5.this);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Z5$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Z5.a(com.inmobi.media.Z5.this, (org.json.JSONObject) obj);
            }
        }, new kotlin.jvm.functions.Function2() { // from class: com.inmobi.media.Z5$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.inmobi.media.Z5.a(com.inmobi.media.Z5.this, (java.lang.String) obj, (java.util.Map) obj2);
            }
        }, this.g, null, 0L);
        setWebViewClient(y5);
        this.h = y5;
    }

    public final com.inmobi.media.C2431gb getLandingPageTelemetryControlInfo() {
        return this.j;
    }

    @Override // com.inmobi.media.InterfaceC2859wh
    public long getViewTouchTimestamp() {
        return this.b;
    }

    @Override // android.webkit.WebView
    public final void loadData(java.lang.String data, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        super.loadData(data, str, str2);
        com.inmobi.media.Y5 y5 = this.h;
        if (y5 != null) {
            y5.d = true;
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        super.loadUrl(url);
        com.inmobi.media.Y5 y5 = this.h;
        if (y5 != null) {
            y5.d = true;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        if (!this.l) {
            this.l = true;
            kotlin.jvm.functions.Function1 function1 = this.f;
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.g1.getClass();
            function1.invoke(com.inmobi.media.Vh.a("IN_CUSTOM_EXPAND", "onScroll"));
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        setViewTouchTimestamp(android.os.SystemClock.elapsedRealtime());
        if (!this.k) {
            this.k = true;
            kotlin.jvm.functions.Function1 function1 = this.f;
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.g1.getClass();
            function1.invoke(com.inmobi.media.Vh.a("IN_CUSTOM_EXPAND", "onInteraction"));
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setLandingPageTelemetryControlInfo(com.inmobi.media.C2431gb c2431gb) {
        this.j = c2431gb;
        com.inmobi.media.Y5 y5 = this.h;
        if (y5 != null) {
            y5.k = c2431gb;
            y5.l = new com.inmobi.media.C2377eb(c2431gb, y5);
        }
    }

    public void setViewTouchTimestamp(long j) {
        this.b = j;
    }

    public static final kotlin.Unit a(com.inmobi.media.Z5 z5, org.json.JSONObject it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        z5.f.invoke(it);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(com.inmobi.media.Z5 z5, java.lang.String trackerName, java.util.Map macros) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
        android.view.ViewParent parent = z5.getParent();
        com.inmobi.media.U5 u5 = parent instanceof com.inmobi.media.U5 ? (com.inmobi.media.U5) parent : null;
        if (u5 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackerName, "trackerName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
            com.inmobi.media.X5 x5 = u5.d;
            if (x5 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackerName, "trackerName");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
                com.inmobi.media.C c = ((com.inmobi.media.Q8) x5).f4912a.b;
                com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = c instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi ? (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c : null;
                if (gestureDetectorOnGestureListenerC2675pi != null) {
                    gestureDetectorOnGestureListenerC2675pi.b(trackerName, macros);
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.inmobi.media.InterfaceC2859wh
    public final boolean a() {
        java.lang.String TAG = this.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        return !getRenderingConfig().getAutoRedirectionEnforcement() || ((getViewTouchTimestamp() > (-1L) ? 1 : (getViewTouchTimestamp() == (-1L) ? 0 : -1)) != 0 && ((android.os.SystemClock.elapsedRealtime() - getViewTouchTimestamp()) > getRenderingConfig().getUserTouchResetTime() ? 1 : ((android.os.SystemClock.elapsedRealtime() - getViewTouchTimestamp()) == getRenderingConfig().getUserTouchResetTime() ? 0 : -1)) < 0);
    }

    @Override // com.inmobi.media.InterfaceC2859wh
    public final void a(java.lang.String api) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(api, "api");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("creativeId", this.e);
        hashMap.put("trigger", api);
        hashMap.put("impressionId", this.d);
        hashMap.put("adType", this.c);
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("BlockAutoRedirection", hashMap, com.inmobi.media.EnumC2728rk.f5431a);
    }
}
