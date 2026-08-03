package com.inmobi.media;

/* renamed from: com.inmobi.media.pi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class GestureDetectorOnGestureListenerC2675pi extends com.inmobi.media.AbstractC2920z2 implements com.inmobi.media.C, com.inmobi.media.G2, android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener, com.inmobi.media.Of, com.inmobi.media.InterfaceC2859wh {
    public static final com.inmobi.media.Vh g1 = new com.inmobi.media.Vh();
    public static final com.inmobi.media.Uh h1 = new com.inmobi.media.Uh();
    public static final java.lang.String i1 = "pi";
    public static final com.inmobi.media.I1 j1 = new com.inmobi.media.I1(java.lang.Boolean.FALSE, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.pi$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.y());
        }
    }, false, true);
    public java.lang.String A;
    public final android.view.GestureDetector A0;
    public com.inmobi.media.Ec B;
    public final com.inmobi.media.Mk B0;
    public boolean C;
    public boolean C0;
    public org.json.JSONObject D;
    public boolean D0;
    public org.json.JSONObject E;
    public com.inmobi.media.Y5 E0;
    public boolean F;
    public com.inmobi.media.W5 F0;
    public boolean G;
    public java.lang.String G0;
    public boolean H;
    public com.inmobi.media.Nf H0;
    public boolean I;
    public com.inmobi.media.L0 I0;
    public com.inmobi.media.Yn J;
    public final java.util.concurrent.atomic.AtomicBoolean J0;
    public boolean K;
    public boolean K0;
    public boolean L;
    public com.inmobi.media.U L0;
    public java.lang.String M;
    public java.lang.String M0;
    public final java.util.concurrent.atomic.AtomicBoolean N;
    public boolean N0;
    public final java.lang.Object O;
    public com.inmobi.media.Oo O0;
    public final java.lang.Object P;
    public boolean P0;
    public boolean Q;
    public java.util.Map Q0;
    public final boolean R;
    public final com.inmobi.media.Zh R0;
    public android.view.View S;
    public final com.inmobi.media.C2648oi S0;
    public android.webkit.WebChromeClient.CustomViewCallback T;
    public java.lang.String T0;
    public int U;
    public final com.inmobi.media.C2385ei U0;
    public boolean V;
    public final com.inmobi.media.C2279ai V0;
    public boolean W;
    public final com.inmobi.media.Xh W0;
    public boolean X0;
    public com.inmobi.media.H4 Y0;
    public com.inmobi.media.C2926z8 Z0;
    public long a0;
    public boolean a1;
    public final byte b;
    public java.lang.String b0;
    public com.inmobi.media.C2622ni b1;
    public final java.util.Set c;
    public final java.util.concurrent.atomic.AtomicBoolean c0;
    public com.inmobi.media.O8 c1;
    public java.lang.String d;
    public android.view.ViewTreeObserver.OnGlobalLayoutListener d0;
    public final com.inmobi.media.C2489ii d1;
    public final boolean e;
    public com.inmobi.media.C2936zi e0;
    public final com.inmobi.media.Th e1;
    public java.lang.String f;
    public final kotlin.Lazy f0;
    public com.inmobi.media.Mo f1;
    public volatile long g;
    public com.inmobi.media.C2592mg g0;
    public final com.inmobi.media.C2781ti h;
    public final kotlin.Lazy h0;
    public final com.inmobi.media.InterfaceC2772t9 i;
    public java.lang.String i0;
    public final com.inmobi.media.Qi j;
    public java.util.Map j0;
    public final com.inmobi.media.Bo k;
    public com.inmobi.media.F2 k0;
    public final com.inmobi.media.C2630o0 l;
    public com.inmobi.media.C l0;
    public final com.inmobi.media.core.config.models.AdConfig m;
    public boolean m0;
    public volatile boolean n;
    public com.inmobi.media.InterfaceC2842w0 n0;
    public volatile boolean o;
    public com.inmobi.media.Wn o0;
    public volatile boolean p;
    public final boolean p0;
    public com.inmobi.media.InterfaceC2513jg q;
    public int q0;
    public byte r;
    public java.lang.String r0;
    public final com.inmobi.media.C2887xj s;
    public int[] s0;
    public final kotlin.Lazy t;
    public long t0;
    public java.lang.ref.WeakReference u;
    public int u0;
    public java.lang.ref.WeakReference v;
    public final com.inmobi.media.Yh v0;
    public java.lang.ref.WeakReference w;
    public final com.inmobi.media.C2333ci w0;
    public com.inmobi.media.AbstractC2726ri x;
    public int x0;
    public final kotlinx.coroutines.sync.Mutex y;
    public int y0;
    public volatile kotlinx.coroutines.Job z;
    public com.inmobi.media.C2854wc z0;

    public /* synthetic */ GestureDetectorOnGestureListenerC2675pi(android.content.Context context, byte b, java.util.LinkedHashSet linkedHashSet, java.lang.String str, java.lang.String str2, long j, com.inmobi.media.C2781ti c2781ti, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, com.inmobi.media.Qi qi, com.inmobi.media.Bo bo, com.inmobi.media.C2630o0 c2630o0, com.inmobi.media.core.config.models.AdConfig adConfig, int i) {
        this(context, b, (i & 4) != 0 ? null : linkedHashSet, (i & 8) != 0 ? null : str, (i & 16) == 0, (i & 32) != 0 ? "DEFAULT" : str2, (i & 64) != 0 ? -1L : j, (i & 128) != 0 ? null : c2781ti, interfaceC2772t9, qi, bo, c2630o0, adConfig);
    }

    public static final com.inmobi.media.core.config.models.TelemetryConfig.LandingPageConfig A() {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.TelemetryConfig.class, "clazz");
        return ((com.inmobi.media.core.config.models.TelemetryConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.TelemetryConfig.class)).getLpConfig();
    }

    public static final com.inmobi.media.C2542kj c(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        return new com.inmobi.media.C2542kj(gestureDetectorOnGestureListenerC2675pi.k, gestureDetectorOnGestureListenerC2675pi.i);
    }

    public static final kotlin.Unit f() {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = com.inmobi.ads.rendering.InMobiAdActivity.u;
        if (gestureDetectorOnGestureListenerC2675pi != null) {
            gestureDetectorOnGestureListenerC2675pi.D();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void getAdType$annotations() {
    }

    public static /* synthetic */ void getCloseAssetArea$annotations() {
    }

    public static /* synthetic */ void getImpressionType$annotations() {
    }

    private final com.inmobi.media.core.config.models.TelemetryConfig.LandingPageConfig getLandingPageConfig() {
        return (com.inmobi.media.core.config.models.TelemetryConfig.LandingPageConfig) this.h0.getValue();
    }

    public static /* synthetic */ void getMarkupType$annotations() {
    }

    public static /* synthetic */ void getMarkupTypeAdUnit$annotations() {
    }

    private final com.inmobi.media.core.config.models.AdConfig.MraidConfig getMraidConfig() {
        return getAdConfig().getMraid();
    }

    public static /* synthetic */ void getPlacementType$annotations() {
    }

    private final com.inmobi.media.Ck getScrollThrottler() {
        return (com.inmobi.media.Ck) this.f0.getValue();
    }

    public static /* synthetic */ void getViewState$annotations() {
    }

    public static /* synthetic */ void getWindowInsetListener$annotations() {
    }

    public static final short m(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        return java.lang.Short.parseShort(str);
    }

    private final void setAdSize(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "setAdSize " + this);
        }
        com.inmobi.media.P5 p5 = com.inmobi.media.N5.f4847a;
        this.q0 = (int) (com.inmobi.media.N5.b() * java.lang.Integer.parseInt(((java.lang.String[]) new kotlin.text.Regex("x").split(str, 0).toArray(new java.lang.String[0]))[0]));
        this.t0 = ((int) (com.inmobi.media.N5.b() * java.lang.Integer.parseInt(((java.lang.String[]) new kotlin.text.Regex("x").split(str, 0).toArray(new java.lang.String[0]))[1]))) * this.q0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setOmidViewableAd(com.inmobi.media.Nk trackerAttr) {
        boolean z;
        java.lang.String str;
        com.iab.omid.library.inmobi.adsession.AdSessionContext createHtmlAdSessionContext;
        com.inmobi.media.Df df = null;
        df = null;
        df = null;
        if (this.a1) {
            com.inmobi.media.C2926z8 c2926z8 = this.Z0;
            if (c2926z8 != null) {
                com.inmobi.media.Wn viewableAd = this.o0;
                kotlin.jvm.internal.Intrinsics.checkNotNull(viewableAd);
                java.lang.String str2 = this.r0;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "adContainer");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewableAd, "viewableAd");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackerAttr, "trackerAttr");
                android.content.Context context = (android.content.Context) c2926z8.h.get();
                if (context != null) {
                    c2926z8.i = getAdConfig().getViewability().getOmidConfig().getOmidEnabled();
                    kotlinx.coroutines.CoroutineScope coroutineScope = c2926z8.d;
                    com.inmobi.media.Ie ie = new com.inmobi.media.Ie(c2926z8.d, c2926z8.c);
                    java.util.HashMap hashMap = trackerAttr.b;
                    java.lang.Object obj = hashMap.get("customReferenceData");
                    java.lang.String str3 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                    java.lang.Object obj2 = hashMap.get("isolateVerificationScripts");
                    java.lang.Boolean bool = obj2 instanceof java.lang.Boolean ? (java.lang.Boolean) obj2 : null;
                    java.lang.Object obj3 = hashMap.get("macros");
                    java.util.Map map = obj3 instanceof java.util.Map ? (java.util.Map) obj3 : null;
                    java.util.List<com.inmobi.media.videoPlayer.model.HtmlOmidTracker> omidTrackers = c2926z8.f5586a.getOmidTrackers();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(omidTrackers, 10));
                    for (java.util.Iterator it = omidTrackers.iterator(); it.hasNext(); it = it) {
                        com.inmobi.media.videoPlayer.model.HtmlOmidTracker htmlOmidTracker = (com.inmobi.media.videoPlayer.model.HtmlOmidTracker) it.next();
                        arrayList.add(new com.inmobi.media.Hf(htmlOmidTracker.getVendor(), htmlOmidTracker.getVerificationParams(), htmlOmidTracker.getUrl()));
                    }
                    com.inmobi.media.Gf gf = new com.inmobi.media.Gf(context, this, viewableAd, coroutineScope, ie, new com.inmobi.media.C2824v8(arrayList, map == null ? kotlin.collections.MapsKt.emptyMap() : map, str3 == null ? "" : str3, str2, kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.TRUE)), c2926z8.c);
                    c2926z8.p = gf;
                    df = gf;
                }
            }
        } else {
            java.lang.Object obj4 = trackerAttr.b.get("omidAdSession");
            com.inmobi.media.InterfaceC2394f1 interfaceC2394f1 = obj4 instanceof com.inmobi.media.InterfaceC2394f1 ? (com.inmobi.media.InterfaceC2394f1) obj4 : null;
            if (trackerAttr.b.containsKey("deferred")) {
                java.lang.Object obj5 = trackerAttr.b.get("deferred");
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                if (((java.lang.Boolean) obj5).booleanValue()) {
                    z = true;
                    java.lang.Object obj6 = trackerAttr.b.get("customReferenceData");
                    str = !(obj6 instanceof java.lang.String) ? (java.lang.String) obj6 : null;
                    if (z && interfaceC2394f1 != null) {
                        java.lang.String str4 = this.r0;
                        com.inmobi.media.Kf kf = com.inmobi.media.Jf.f4781a;
                        kf.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "webView");
                        createHtmlAdSessionContext = com.iab.omid.library.inmobi.adsession.AdSessionContext.createHtmlAdSessionContext(kf.b, this, str4, str);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createHtmlAdSessionContext, "createHtmlAdSessionContext(...)");
                        com.inmobi.media.C2723rf c2723rf = (com.inmobi.media.C2723rf) interfaceC2394f1;
                        if (createHtmlAdSessionContext != null) {
                            c2723rf.c = createHtmlAdSessionContext;
                        }
                    }
                    if (interfaceC2394f1 != null) {
                        com.inmobi.media.Wn wn = this.o0;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(wn);
                        df = new com.inmobi.media.Df(this, wn, interfaceC2394f1, this.i);
                    }
                }
            }
            z = false;
            java.lang.Object obj62 = trackerAttr.b.get("customReferenceData");
            if (!(obj62 instanceof java.lang.String)) {
            }
            if (z) {
                java.lang.String str42 = this.r0;
                com.inmobi.media.Kf kf2 = com.inmobi.media.Jf.f4781a;
                kf2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "webView");
                createHtmlAdSessionContext = com.iab.omid.library.inmobi.adsession.AdSessionContext.createHtmlAdSessionContext(kf2.b, this, str42, str);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createHtmlAdSessionContext, "createHtmlAdSessionContext(...)");
                com.inmobi.media.C2723rf c2723rf2 = (com.inmobi.media.C2723rf) interfaceC2394f1;
                if (createHtmlAdSessionContext != null) {
                }
            }
            if (interfaceC2394f1 != null) {
            }
        }
        if (df != null) {
            this.o0 = df;
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b(TAG, this.a1 ? "Failed to create OMID tracked hybrid video ad." : "Did not find a OMID ad session; the IAB decorator will not be applied.");
        }
    }

    public static final boolean y() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, com.unity3d.ads.BuildConfig.FLAVOR);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("enableImraidLogs", com.ironsource.X3.i.W);
        return a2.f4815a.getBoolean("enableImraidLogs", false);
    }

    public final void B() {
        android.app.Activity activity;
        if (getPlacementType() == 0) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            toString();
            if (((android.app.Activity) this.v.get()) == null) {
                int upperBoundForActivityContext = getAdConfig().getRendering().getUpperBoundForActivityContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "<this>");
                int i = 0;
                android.view.View view = this;
                loop0: while (true) {
                    activity = null;
                    if (view == null || i >= upperBoundForActivityContext) {
                        break;
                    }
                    android.content.Context context = view.getContext();
                    if (context instanceof android.app.Activity) {
                        activity = (android.app.Activity) context;
                        break;
                    }
                    while (context instanceof android.content.ContextWrapper) {
                        if (context instanceof android.app.Activity) {
                            activity = (android.app.Activity) context;
                            break loop0;
                        }
                        context = ((android.content.ContextWrapper) context).getBaseContext();
                    }
                    java.lang.Object parent = view.getParent();
                    view = (parent == null || !(parent instanceof android.view.View)) ? null : (android.view.View) parent;
                    i++;
                }
                if (activity != null) {
                    this.v = new java.lang.ref.WeakReference(activity);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        }
    }

    public void C() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "onImpressionFired " + this);
        }
        F();
        com.inmobi.media.C2926z8 c2926z8 = this.Z0;
        if (c2926z8 != null) {
            com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig htmlVideoPlayerConfig = c2926z8.j;
            com.inmobi.media.Gf gf = c2926z8.p;
            if (gf != null) {
                boolean skippable = htmlVideoPlayerConfig.getSkippable();
                float skipOffset = htmlVideoPlayerConfig.getSkipOffset();
                boolean autoplay = htmlVideoPlayerConfig.getAutoplay();
                if (skippable) {
                    com.inmobi.media.Ie ie = gf.e;
                    if (ie != null) {
                        ie.a(skipOffset, autoplay);
                    }
                } else {
                    com.inmobi.media.Ie ie2 = gf.e;
                    if (ie2 != null) {
                        ie2.a(autoplay);
                    }
                }
                com.inmobi.media.Ie ie3 = gf.e;
                if (ie3 != null) {
                    if (ie3.e == null) {
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = ie3.b;
                        if (interfaceC2772t92 != null) {
                            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(com.inmobi.media.AbstractC2367e1.f, "Failed to registerImpression: AdEvent is null");
                        }
                    } else {
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = ie3.b;
                        if (interfaceC2772t93 != null) {
                            ((com.inmobi.media.C2799u9) interfaceC2772t93).a(com.inmobi.media.AbstractC2367e1.f, "registerImpression");
                        }
                        com.inmobi.media.T4.a(ie3.f5167a, new com.inmobi.media.Z0(ie3, null));
                    }
                }
            }
        }
        getListener().a(getTelemetryOnAdImpression());
    }

    public final void D() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "onUserLandingCompleted " + this);
        }
        h("window.imraid.broadcastEvent('onUserLandingCompleted');");
    }

    public final void E() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "processUnload " + this);
        }
        if (this.N.get()) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
            if (interfaceC2772t92 != null) {
                java.lang.String TAG2 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(TAG2, "unload called on destroyed view");
                return;
            }
            return;
        }
        if (!z()) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.i;
            if (interfaceC2772t93 != null) {
                java.lang.String TAG3 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).b(TAG3, "mraid 3.0 is not enabled");
                return;
            }
            return;
        }
        if (this.D0) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.i;
            if (interfaceC2772t94 != null) {
                java.lang.String TAG4 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t94).b(TAG4, "unload called on failed view");
                return;
            }
            return;
        }
        if (this.P0) {
            return;
        }
        this.P0 = true;
        com.inmobi.media.ExecutorC2378ec executorC2378ec = (com.inmobi.media.ExecutorC2378ec) com.inmobi.media.AbstractC2740s6.e.getValue();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.pi$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.this);
            }
        };
        executorC2378ec.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC2378ec.f5177a.post(runnable);
    }

    public final void F() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "recordContextualData " + this);
        }
        com.inmobi.media.H4 h4 = this.Y0;
        if (h4 != null) {
            h4.a();
        }
    }

    public final void G() {
        java.lang.String str;
        com.inmobi.media.C2816v0 c2816v0;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.inmobi.media.C2816v0 c2816v02;
        java.lang.String str5;
        com.inmobi.media.C2684q1 c2684q1;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "sendTelemetryEventForNetworkLoad " + this);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String creativeId = getCreativeId();
        if (creativeId != null) {
            linkedHashMap.put("creativeId", creativeId);
        }
        java.lang.String impressionId = getImpressionId();
        if (impressionId != null) {
            linkedHashMap.put("impressionId", impressionId);
        }
        linkedHashMap.put("errorCode", java.lang.Short.valueOf(this.C0 ? (short) 2212 : (short) 2211));
        com.inmobi.media.C2781ti c2781ti = this.h;
        if (c2781ti != null && (c2684q1 = c2781ti.j) != null) {
            linkedHashMap.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - c2684q1.f5402a.c));
        }
        com.inmobi.media.C2781ti c2781ti2 = this.h;
        if (c2781ti2 != null && (c2816v02 = c2781ti2.f5469a) != null && (str5 = c2816v02.f) != null) {
            linkedHashMap.put("plType", str5);
        }
        com.inmobi.media.C2781ti c2781ti3 = this.h;
        if (c2781ti3 != null && (str4 = c2781ti3.f) != null) {
            linkedHashMap.put("creativeType", str4);
        }
        com.inmobi.media.C2781ti c2781ti4 = this.h;
        if (c2781ti4 != null && (str3 = c2781ti4.b) != null) {
            linkedHashMap.put("markupType", str3);
        }
        com.inmobi.media.C2781ti c2781ti5 = this.h;
        if (c2781ti5 != null && (c2816v0 = c2781ti5.f5469a) != null && (str2 = c2816v0.e) != null) {
            linkedHashMap.put("adType", str2);
        }
        com.inmobi.media.C2781ti c2781ti6 = this.h;
        if (c2781ti6 != null && (str = c2781ti6.d) != null) {
            linkedHashMap.put("metadataBlob", str);
        }
        com.inmobi.media.C2781ti c2781ti7 = this.h;
        if (c2781ti7 != null) {
            linkedHashMap.put("isRewarded", java.lang.Boolean.valueOf(c2781ti7.h));
        }
        a("NetworkLoadLimitExceeded", (java.util.HashMap) linkedHashMap);
    }

    public final void H() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "setCurrentPosition " + this);
        }
        this.E = new org.json.JSONObject();
        getLocationOnScreen(new int[2]);
        try {
            org.json.JSONObject jSONObject = this.E;
            if (jSONObject != null) {
                jSONObject.put("x", com.inmobi.media.J3.b(r0[0] / com.inmobi.media.N5.b()));
            }
            org.json.JSONObject jSONObject2 = this.E;
            if (jSONObject2 != null) {
                jSONObject2.put("y", com.inmobi.media.J3.b(r0[1] / com.inmobi.media.N5.b()));
            }
            int b = com.inmobi.media.J3.b(getWidth() / com.inmobi.media.N5.b());
            int b2 = com.inmobi.media.J3.b(getHeight() / com.inmobi.media.N5.b());
            org.json.JSONObject jSONObject3 = this.E;
            if (jSONObject3 != null) {
                jSONObject3.put("width", b);
            }
            org.json.JSONObject jSONObject4 = this.E;
            if (jSONObject4 != null) {
                jSONObject4.put("height", b2);
            }
        } catch (org.json.JSONException unused) {
        }
        synchronized (this.P) {
            this.G = false;
            this.P.notifyAll();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void I() {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        android.view.ViewGroup viewGroup3;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "setDefaultPosition " + this);
        }
        int[] iArr = new int[2];
        this.D = new org.json.JSONObject();
        if (this.w == null) {
            android.view.ViewParent parent = getParent();
            this.w = new java.lang.ref.WeakReference(parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null);
        }
        java.lang.ref.WeakReference weakReference = this.w;
        if ((weakReference != null ? (android.view.ViewGroup) weakReference.get() : null) != null) {
            java.lang.ref.WeakReference weakReference2 = this.w;
            if (weakReference2 != null && (viewGroup3 = (android.view.ViewGroup) weakReference2.get()) != null) {
                viewGroup3.getLocationOnScreen(iArr);
            }
            try {
                org.json.JSONObject jSONObject = this.D;
                if (jSONObject != null) {
                    jSONObject.put("x", com.inmobi.media.J3.b(iArr[0] / com.inmobi.media.N5.b()));
                }
                org.json.JSONObject jSONObject2 = this.D;
                if (jSONObject2 != null) {
                    jSONObject2.put("y", com.inmobi.media.J3.b(iArr[1] / com.inmobi.media.N5.b()));
                }
                java.lang.ref.WeakReference weakReference3 = this.w;
                int b = com.inmobi.media.J3.b(((weakReference3 == null || (viewGroup2 = (android.view.ViewGroup) weakReference3.get()) == null) ? 0 : viewGroup2.getWidth()) / com.inmobi.media.N5.b());
                java.lang.ref.WeakReference weakReference4 = this.w;
                int b2 = com.inmobi.media.J3.b(((weakReference4 == null || (viewGroup = (android.view.ViewGroup) weakReference4.get()) == null) ? 0 : viewGroup.getHeight()) / com.inmobi.media.N5.b());
                org.json.JSONObject jSONObject3 = this.D;
                if (jSONObject3 != null) {
                    jSONObject3.put("width", b);
                }
                org.json.JSONObject jSONObject4 = this.D;
                if (jSONObject4 != null) {
                    jSONObject4.put("height", b2);
                }
            } catch (org.json.JSONException unused) {
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        } else {
            try {
                org.json.JSONObject jSONObject5 = this.D;
                if (jSONObject5 != null) {
                    jSONObject5.put("x", 0);
                }
                org.json.JSONObject jSONObject6 = this.D;
                if (jSONObject6 != null) {
                    jSONObject6.put("y", 0);
                }
                org.json.JSONObject jSONObject7 = this.D;
                if (jSONObject7 != null) {
                    jSONObject7.put("width", 0);
                }
                org.json.JSONObject jSONObject8 = this.D;
                if (jSONObject8 != null) {
                    jSONObject8.put("height", 0);
                }
            } catch (org.json.JSONException unused2) {
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            }
        }
        synchronized (this.O) {
            this.F = false;
            this.O.notifyAll();
            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
        }
    }

    public final void J() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "setFallbackImpressionMinPercentageViewed " + this);
        }
        this.y0 = kotlin.jvm.internal.Intrinsics.areEqual("video", this.G0) ? getAdConfig().getViewability().getVideoImpressionMinPercentageViewed() : kotlin.jvm.internal.Intrinsics.areEqual("audio", this.G0) ? kotlin.jvm.internal.Intrinsics.areEqual("audio", getAdType()) ? getAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed();
    }

    public final void K() {
        this.x0 = kotlin.jvm.internal.Intrinsics.areEqual("video", this.G0) ? getAdConfig().getViewability().getVideoImpressionMinTimeViewed() : kotlin.jvm.internal.Intrinsics.areEqual("audio", this.G0) ? kotlin.jvm.internal.Intrinsics.areEqual("audio", getAdType()) ? getAdConfig().getViewability().getAudioImpressionMinTimeViewed() : getAdConfig().getViewability().getWebImpressionMinTimeViewed() : getAdConfig().getViewability().getWebImpressionMinTimeViewed();
    }

    public final void L() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "setFallbackImpressionParams " + this);
        }
        K();
        J();
        M();
    }

    public final void M() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "setFallbackImpressionType " + this);
        }
        java.lang.String adType = getAdType();
        this.r = kotlin.jvm.internal.Intrinsics.areEqual(adType, "banner") ? getAdConfig().getViewability().getBannerImpressionType() : kotlin.jvm.internal.Intrinsics.areEqual(adType, "audio") ? getAdConfig().getViewability().getAudioImpressionType() : getAdConfig().getViewability().getInterstitialImpressionType();
    }

    public final void N() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "setImpressionParams " + this);
        }
        if (this.c == null) {
            L();
            return;
        }
        try {
            L();
            for (com.inmobi.media.Nk nk : this.c) {
                if (nk.f4860a == 2) {
                    if (nk.b.containsKey("type")) {
                        java.lang.Object obj = nk.b.get("type");
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                        this.r = (byte) ((java.lang.Integer) obj).intValue();
                    } else {
                        M();
                    }
                    if (nk.b.containsKey("time")) {
                        java.lang.Object obj2 = nk.b.get("time");
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                        this.x0 = ((java.lang.Integer) obj2).intValue();
                    } else {
                        K();
                    }
                    if (nk.b.containsKey(com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY)) {
                        java.lang.Object obj3 = nk.b.get(com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                        this.y0 = ((java.lang.Integer) obj3).intValue();
                    } else {
                        J();
                    }
                    if (this.r == 2) {
                        if (nk.b.containsKey("pixel")) {
                            java.lang.Object obj4 = nk.b.get("pixel");
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                            this.u0 = ((java.lang.Integer) obj4).intValue();
                        } else {
                            M();
                        }
                        if (nk.b.containsKey("frame")) {
                            java.lang.Object obj5 = nk.b.get("frame");
                            this.s0 = obj5 instanceof int[] ? (int[]) obj5 : null;
                        } else {
                            M();
                        }
                    }
                }
            }
        } catch (org.json.JSONException unused) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
            if (interfaceC2772t92 != null) {
                java.lang.String TAG2 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(TAG2, "Exception in parsing the impressionType and pixel frame");
            }
            L();
        } catch (java.lang.Exception unused2) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.i;
            if (interfaceC2772t93 != null) {
                java.lang.String TAG3 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).b(TAG3, "SDK encountered an unexpected error in parsing impression parameters");
            }
            L();
        }
    }

    public final void O() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "setIsViewHardwareAccelerated " + this);
        }
        this.C = isHardwareAccelerated();
    }

    public final void P() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "skipFromInterActive " + this);
        }
        com.inmobi.media.H4 h4 = this.Y0;
        if (h4 != null) {
            h4.h();
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, "skipFromInterActive");
        }
    }

    public final void Q() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "startTrackingAudioVolume " + this);
        }
        if (!z() || this.e) {
            return;
        }
        com.inmobi.media.C2682q c2682q = com.inmobi.media.C2682q.f5400a;
        com.inmobi.media.Yh listener = this.v0;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.C2682q.g, null, null, new com.inmobi.media.C2549l(interfaceC2772t92, listener, null), 3, null);
    }

    public final void R() {
        java.util.Set linkedHashSet;
        java.util.Set<android.view.View> keySet;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "startTrackingExposure " + this);
        }
        if (!z() || this.e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
            if (interfaceC2772t92 != null) {
                java.lang.String TAG2 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(TAG2, "exposureTracker is already initialized");
            }
        } else {
            java.util.Map<android.view.View, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
            if (friendlyViews == null || (keySet = friendlyViews.keySet()) == null || (linkedHashSet = kotlin.collections.CollectionsKt.toMutableSet(keySet)) == null) {
                linkedHashSet = new java.util.LinkedHashSet();
            }
            this.L0 = new com.inmobi.media.U(this, linkedHashSet, getAdConfig().getMraid3().getExposureChangeInterval(), this.w0, this.i);
        }
        com.inmobi.media.U u = this.L0;
        if (u != null) {
            u.a();
        }
    }

    public final void S() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "stopTrackingAudioVolume " + this);
        }
        com.inmobi.media.C2682q c2682q = com.inmobi.media.C2682q.f5400a;
        com.inmobi.media.Yh listener = this.v0;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.C2682q.g, null, null, new com.inmobi.media.C2601n(interfaceC2772t92, listener, null), 3, null);
    }

    public final void T() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "stopTrackingExposure " + this);
        }
        com.inmobi.media.U u = this.L0;
        if (u != null) {
            u.b();
        }
    }

    public final void U() {
        new com.inmobi.media.C3(this, !this.H, !this.K, this.i).a(this.f1);
    }

    public final long V() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "timeSincePodShow " + this);
        }
        com.inmobi.media.InterfaceC2842w0 interfaceC2842w0 = this.n0;
        if (interfaceC2842w0 != null) {
            return ((com.inmobi.media.AbstractC2551l1) interfaceC2842w0).U();
        }
        return 0L;
    }

    public final void W() {
        getListener().e(this);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "ad dismissed");
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a();
        }
        com.inmobi.media.L0 l0 = this.I0;
        if (l0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
            l0 = null;
        }
        if (l0.d.get()) {
            l0.a("session end is already triggered");
            return;
        }
        if (!l0.f4808a.getEnabled()) {
            l0.a("config kill switch - false. ad quality will skip");
        } else if (l0.g == null) {
            l0.a("setup not done. ignore trigger");
        } else {
            l0.d.set(true);
            l0.a(false);
        }
    }

    public final void X() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "unregisterBackButtonPressedEventListener " + this);
        }
        this.M = null;
    }

    public final void Y() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "updateActivitiesOrientationProperties " + this);
        }
        android.app.Activity activity = (android.app.Activity) this.u.get();
        if (activity == null || !(activity instanceof com.inmobi.ads.rendering.InMobiAdActivity)) {
            return;
        }
        com.inmobi.media.Nf orientationProperties = this.H0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        com.inmobi.media.T8 t8 = ((com.inmobi.ads.rendering.InMobiAdActivity) activity).f4589a;
        if (t8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
            t8 = null;
        }
        t8.a(orientationProperties);
    }

    public final void a(com.inmobi.media.C2854wc movementGestureDetector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(movementGestureDetector, "movementGestureDetector");
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(2)) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "Pan gesture is disabled from config");
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            org.json.JSONArray jSONArray = movementGestureDetector.j;
            java.lang.Integer valueOf = jSONArray != null ? java.lang.Integer.valueOf(jSONArray.length()) : null;
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, kotlin.text.StringsKt.trimIndent("onPanDetected\n " + valueOf + " \n " + movementGestureDetector.j));
        }
        h("window.imraidview.onGestureDetected('2', '" + movementGestureDetector.j + "');");
    }

    public final void b(com.inmobi.media.C2854wc rotationDetector, android.view.MotionEvent initialEvent, android.view.MotionEvent endEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rotationDetector, "rotationDetector");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialEvent, "initialEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(3)) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "Rotation gesture is disabled from config");
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, kotlin.text.StringsKt.trimIndent(" Rotation detected " + rotationDetector.i + " \n " + initialEvent + " \n " + endEvent));
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put(new org.json.JSONArray((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.inmobi.media.J3.c(initialEvent.getX())), java.lang.Integer.valueOf(com.inmobi.media.J3.c(initialEvent.getY()))})));
        jSONArray.put(new org.json.JSONArray((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.inmobi.media.J3.c(initialEvent.getX(1))), java.lang.Integer.valueOf(com.inmobi.media.J3.c(initialEvent.getY(1)))})));
        jSONArray.put(new org.json.JSONArray((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.inmobi.media.J3.c(endEvent.getX())), java.lang.Integer.valueOf(com.inmobi.media.J3.c(endEvent.getY()))})));
        jSONArray.put(new org.json.JSONArray((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.inmobi.media.J3.c(endEvent.getX(1))), java.lang.Integer.valueOf(com.inmobi.media.J3.c(endEvent.getY(1)))})));
        h("window.imraidview.onGestureDetected('3', '" + jSONArray + "');");
    }

    public final void d(boolean z) {
        com.inmobi.media.Yn yn = z ? com.inmobi.media.Yn.c : com.inmobi.media.Yn.b;
        if (this.J != yn) {
            if (!this.Q) {
                this.J = yn;
                if (z) {
                    getListener().i(this);
                }
                c(z);
                com.inmobi.media.L0 l0 = this.I0;
                if (l0 != null) {
                    com.inmobi.media.Yn adViewableStatus = this.J;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adViewableStatus, "adViewableStatus");
                    l0.h = adViewableStatus;
                }
                p();
            }
            com.inmobi.media.C2926z8 c2926z8 = this.Z0;
            if (c2926z8 == null || c2926z8.g.get() || !com.inmobi.media.C2926z8.a(c2926z8, new com.inmobi.media.EnumC2850w8[]{com.inmobi.media.EnumC2850w8.c, com.inmobi.media.EnumC2850w8.e, com.inmobi.media.EnumC2850w8.f}, null, null, null, 14) || c2926z8.l == z) {
                return;
            }
            c2926z8.l = z;
            if (!z) {
                if (!c2926z8.g.get() && c2926z8.k.p.isPlaying()) {
                    c2926z8.k.f();
                    com.inmobi.media.R7 r7 = c2926z8.k;
                    com.inmobi.media.Bg state = com.inmobi.media.Bg.e;
                    r7.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
                    r7.t = state;
                    return;
                }
                return;
            }
            if (c2926z8.g.get()) {
                return;
            }
            com.inmobi.media.R7 r72 = c2926z8.k;
            if (r72.t == com.inmobi.media.Bg.e) {
                r72.e();
                com.inmobi.media.R7 r73 = c2926z8.k;
                com.inmobi.media.Bg state2 = com.inmobi.media.Bg.d;
                r73.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state2, "state");
                r73.t = state2;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        if (java.lang.Float.isNaN(event.getX()) || java.lang.Float.isNaN(event.getY())) {
            if (!this.K0) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
                if (interfaceC2772t9 != null) {
                    java.lang.String TAG = i1;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).b(TAG, "dispatchTouchEvent Invalid Coordinates " + event);
                }
                this.K0 = true;
            }
            return super.dispatchTouchEvent(event);
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, "dispatchTouchEvent " + this);
        }
        this.B0.a(event);
        if (getAdConfig().getRendering().getUseDispatchTouchEvent()) {
            a(event);
        }
        setViewTouchTimestamp(android.os.SystemClock.elapsedRealtime());
        return super.dispatchTouchEvent(event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        com.inmobi.media.C2701qi c2701qi;
        if (this.e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "view is in-app browser. Using EmbeddedBrowserViewClient.");
            }
            com.inmobi.media.Y5 y5 = new com.inmobi.media.Y5("IN_CUSTOM_BROWSER", new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.pi$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.f();
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.pi$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.a((org.json.JSONObject) obj);
                }
            }, new kotlin.jvm.functions.Function2() { // from class: com.inmobi.media.pi$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.a((java.lang.String) obj, (java.util.Map) obj2);
                }
            }, this.i, this.c1, getAdConfig().getCustomBrowser().getInt().getLoadCompletionDeBounce());
            this.E0 = y5;
            c2701qi = y5;
        } else {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
            if (interfaceC2772t92 != null) {
                java.lang.String TAG2 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).c(TAG2, "view is ad. Using RenderViewClient");
            }
            com.inmobi.media.C2701qi c2701qi2 = new com.inmobi.media.C2701qi(this.e0, this.i, new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.pi$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.this, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            java.lang.String adType = getAdType();
            c2701qi2.b = kotlin.jvm.internal.Intrinsics.areEqual(adType, "banner") ? getAdConfig().getRendering().getBannerNetworkLoadsLimit() : kotlin.jvm.internal.Intrinsics.areEqual(adType, "audio") ? getAdConfig().getRendering().getAudioNetworkLoadsLimit() : getAdConfig().getRendering().getOtherNetworkLoadsLimit();
            c2701qi = c2701qi2;
        }
        setWebViewClient(c2701qi);
    }

    public final void g() {
        java.lang.String TAG = i1;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        toString();
        kotlinx.coroutines.Job job = this.z;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.z = null;
    }

    public com.inmobi.media.core.config.models.AdConfig getAdConfig() {
        return this.m;
    }

    public final com.inmobi.media.C2630o0 getAdMetaData() {
        return this.l;
    }

    public final com.inmobi.media.InterfaceC2842w0 getAdPodHandler() {
        return this.n0;
    }

    public final com.inmobi.media.L0 getAdQualityManager() {
        com.inmobi.media.L0 l0 = this.I0;
        if (l0 != null) {
            return l0;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
        return null;
    }

    public java.lang.String getAdType() {
        return this.i0;
    }

    public final boolean getAllowAutoRedirection() {
        return this.m0;
    }

    public final int getArea() {
        return getHeight() * getWidth();
    }

    public final java.lang.ref.WeakReference<android.app.Activity> getBannerHolderActivity() {
        return this.v;
    }

    public final java.lang.String getBeaconUrl() {
        return this.M0;
    }

    public final com.inmobi.media.Mo getCloseAssetArea() {
        return this.f1;
    }

    public final long getConfiguredArea() {
        return this.t0;
    }

    public android.content.Context getContainerContext() {
        android.app.Activity activity = (android.app.Activity) this.u.get();
        if (activity != null) {
            return activity;
        }
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    public final java.lang.String getContentURL() {
        return this.r0;
    }

    public final com.inmobi.media.H4 getContextualDataHandler() {
        return this.Y0;
    }

    public final java.lang.String getCreativeID() {
        java.lang.String creativeId = getCreativeId();
        return creativeId == null ? "" : creativeId;
    }

    public java.lang.String getCreativeId() {
        return this.b0;
    }

    public final java.lang.String getCurrentPosition() {
        java.lang.String jSONObject;
        org.json.JSONObject jSONObject2 = this.E;
        return (jSONObject2 == null || (jSONObject = jSONObject2.toString()) == null) ? "" : jSONObject;
    }

    public final java.lang.Object getCurrentPositionMonitor() {
        return this.P;
    }

    public final int getCurrentRenderingPodAdIndex() {
        com.inmobi.media.InterfaceC2842w0 interfaceC2842w0 = this.n0;
        if (interfaceC2842w0 != null) {
            return ((com.inmobi.media.AbstractC2551l1) interfaceC2842w0).l(this);
        }
        return 0;
    }

    public java.lang.Object getDataModel() {
        return null;
    }

    public final java.lang.String getDefaultPosition() {
        java.lang.String jSONObject;
        org.json.JSONObject jSONObject2 = this.D;
        return (jSONObject2 == null || (jSONObject = jSONObject2.toString()) == null) ? "" : jSONObject;
    }

    public final java.lang.Object getDefaultPositionMonitor() {
        return this.O;
    }

    public final com.inmobi.media.W5 getEmbeddedBrowserJsCallbacks() {
        return this.F0;
    }

    public final com.inmobi.media.U getExposureTracker() {
        return this.L0;
    }

    public java.util.Map<android.view.View, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose> getFriendlyViews() {
        return this.j0;
    }

    public final android.app.Activity getFullScreenActivity() {
        return (android.app.Activity) this.u.get();
    }

    public com.inmobi.media.B getFullScreenEventsListener() {
        return this.d1;
    }

    public java.lang.String getImpressionId() {
        return this.d;
    }

    public final byte getImpressionType() {
        return this.r;
    }

    public final com.inmobi.media.O8 getInAppActivityBrowserClientListener() {
        return this.c1;
    }

    public final java.lang.String getLandingScheme() {
        return this.f;
    }

    public final com.inmobi.media.AbstractC2726ri getListener() {
        com.inmobi.media.AbstractC2726ri abstractC2726ri = this.x;
        if (abstractC2726ri != null) {
            return abstractC2726ri;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "listener getter " + this);
        }
        com.inmobi.media.Uh uh = h1;
        this.x = uh;
        return uh;
    }

    public final java.lang.String getMCreativeType() {
        return this.G0;
    }

    public final int getMImpressionMinPercentageViewed() {
        return this.y0;
    }

    public final int getMImpressionMinTimeViewed() {
        return this.x0;
    }

    public final com.inmobi.media.Wn getMViewableAd() {
        return this.o0;
    }

    public java.lang.String getMarkupType() {
        return this.T0;
    }

    public final java.lang.String getMarkupTypeAdUnit() {
        return this.T0;
    }

    public final com.inmobi.media.Ec getMediaProcessor() {
        return this.B;
    }

    public final int getMinimumPixelsPainted() {
        return this.u0;
    }

    public final java.lang.String getMraidJsString() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "mraidJsString getter " + this);
        }
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("mraid_js_store", "sharePrefFile");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
        com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "mraid_js_store");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("mraid_js_string", com.ironsource.X3.i.W);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("mraid_js_string", com.ironsource.X3.i.W);
        java.lang.String string = a2.f4815a.getString("mraid_js_string", null);
        if (string == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
            if (interfaceC2772t92 != null) {
                java.lang.String TAG2 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, "Returning default Mraid Js string.");
            }
            return "var imIsObjValid=function(a){return\"undefined\"!=typeof a&&null!=a?!0:!1},EventListeners=function(a){if(\"undefined\"===typeof a)throw Error(\"EventListeners constructor requires an event name\");this.event=a;this.count=0;var b=[];this.shouldRemember=-1!==[\"exposureChange\"].indexOf(a);this.lastArgs=null;this.add=function(a){b.push(a);++this.count;if(this.shouldRemember&&this.lastArgs)try{a.apply({},this.lastArgs)}catch(d){}};this.remove=function(a){var d=!1,e=this;b=b.filter(function(b){if(b=b===a)--e.count,\nd=!0;return!b});return d};this.removeAll=function(){b=[];this.count=0};this.broadcast=function(a){this.shouldRemember&&(this.lastArgs=a);b.forEach(function(d){try{d.apply({},a)}catch(b){}})};this.toString=function(){var c=[a,\":\"];b.forEach(function(a){c.push(\"|\",String(a),\"|\")});return c.join(\"\")}},InmobiObj=function(){this.listeners=[];this.addEventListener=function(a,b){try{if(imIsObjValid(b)&&imIsObjValid(a)){var c=this.listeners;c[a]||(c[a]=new EventListeners(a));c[a].add(b);\"micIntensityChange\"==\na&&window.imraidview.startListeningMicIntensity();\"deviceMuted\"==a&&window.imraidview.startListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&window.imraidview.startListeningDeviceVolumeChange();\"volumeChange\"==a&&window.imraidview.startListeningVolumeChange();\"headphones\"==a&&window.imraidview.startListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&window.imraidview.startListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&window.imraidview.registerDownloaderCallbacks()}}catch(d){this.log(d)}};\nthis.removeEventListener=function(a,b){if(imIsObjValid(a)){var c=this.listeners;imIsObjValid(c[a])&&(imIsObjValid(b)?c[a].remove(b):c[a].removeAll());\"micIntensityChange\"==a&&0==c[a].count&&window.imraidview.stopListeningMicIntensity();\"deviceMuted\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceVolumeChange();\"volumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningVolumeChange();\"headphones\"==\na&&0==c[a].count&&window.imraidview.stopListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&0==c[a].count&&window.imraidview.stopListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&0==c[a].count&&window.imraidview.unregisterDownloaderCallbacks()}};this.broadcastEvent=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)b[c]=arguments[c];c=b.shift();try{var d=this.listeners;d[c]||(d[c]=new EventListeners(c));d[c].broadcast(b)}catch(e){}}};\nthis.sendSaveContentResult=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)if(2==c){var d=arguments[c],d=JSON.parse(d);b[c]=d}else b[c]=arguments[c];d=b[1];\"success\"!=d&&(c=b[0].substring(b[0].indexOf(\"_\")+1),imraid.saveContentIDMap[c]&&delete imraid.saveContentIDMap[c]);window.imraid.broadcastEvent(b[0],b[1],b[2])}}},__im__iosNativeMessageHandler=void 0;\nwindow.webkit&&(window.webkit.messageHandlers&&window.webkit.messageHandlers.nativeMessageHandler)&&(__im__iosNativeMessageHandler=window.webkit.messageHandlers.nativeMessageHandler);\nvar __im__iosNativeCall={nativeCallInFlight:!1,nativeCallQueue:[],executeNativeCall:function(a){this.nativeCallInFlight?this.nativeCallQueue.push(a):(this.nativeCallInFlight=!0,imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=a)},nativeCallComplete:function(a){0==this.nativeCallQueue.length?this.nativeCallInFlight=!1:(a=this.nativeCallQueue.shift(),imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=\na)}},IOSNativeCall=function(){this.urlScheme=\"\";this.executeNativeCall=function(a){if(imIsObjValid(__im__iosNativeMessageHandler)){d={};d.command=a;d.scheme=this.urlScheme;for(var b={},c=1;c<arguments.length;c+=2)e=arguments[c+1],null!=e&&(b[arguments[c]]=\"\"+e);d.params=b}else for(var d=this.urlScheme+\"://\"+a,e,b=!0,c=1;c<arguments.length;c+=2)e=arguments[c+1],null!=e&&(b?(d+=\"?\",b=!1):d+=\"&\",d+=arguments[c]+\"=\"+escape(e));__im__iosNativeCall.executeNativeCall(d);return\"OK\"};this.nativeCallComplete=\nfunction(a){__im__iosNativeCall.nativeCallComplete(a);return\"OK\"};this.updateKV=function(a,b){this[a]=b;var c=this.broadcastMap[a];c&&this.broadcastEvent(c,b)}};\n(function(){var a=window.mraidview={};a.orientationProperties={allowOrientationChange:!0,forceOrientation:\"none\",direction:\"right\"};var b=[],c=!1;a.detectAndBlockFraud=function(d){a.isPossibleFraud()&&a.fireRedirectFraudBeacon(d);return!1};a.popupBlocked=function(d){a.firePopupBlockedBeacon(d)};a.zeroPad=function(a){var b=\"\";10>a&&(b+=\"0\");return b+a};a.supports=function(a){console.log(\"bridge: supports (MRAID)\");if(\"string\"!=typeof a)window.mraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\n\"supports\");else return\"false\"!=sdkController.supports(\"window.mraidview\",a)};a.useCustomClose=function(a){try{sdkController.useCustomClose(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"use CustomClose: \"+b)}};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};a.stackCommands=function(a,e){c?b.push(a):(eval(a),e&&(c=!0))};a.setOrientationProperties=function(b){try{b?(\"undefined\"!=typeof b.allowOrientationChange&&(a.orientationProperties.allowOrientationChange=\nb.allowOrientationChange),\"undefined\"!=typeof b.forceOrientation&&(a.orientationProperties.forceOrientation=b.forceOrientation)):b=null,sdkController.setOrientationProperties(\"window.mraidview\",a.stringify(a.orientationProperties))}catch(e){imraidview.showAlert(\"setOrientationProperties: \"+e+\", props = \"+b)}};a.getOrientationProperties=function(){return{forceOrientation:a.orientationProperties.forceOrientation,allowOrientationChange:a.orientationProperties.allowOrientationChange}};a.resizeProps=null;\na.open=function(a){\"undefined\"==typeof a&&(a=null);try{sdkController.open(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"open: \"+b)}};a.getScreenSize=function(){try{return eval(\"(\"+sdkController.getScreenSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getScreenSize: \"+a)}};a.getMaxSize=function(){try{return eval(\"(\"+sdkController.getMaxSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getMaxSize: \"+a)}};a.getCurrentPosition=function(){try{return eval(\"(\"+sdkController.getCurrentPosition(\"window.mraidview\")+\n\")\")}catch(a){imraidview.showAlert(\"getCurrentPosition: \"+a)}};a.getDefaultPosition=function(){try{return eval(\"(\"+sdkController.getDefaultPosition(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getDefaultPosition: \"+a)}};a.getState=function(){try{return String(sdkController.getState(\"window.mraidview\"))}catch(a){imraidview.showAlert(\"getState: \"+a)}};a.isViewable=function(){if(imraidview.fallbackViewabilityEnabled())return imraidview.checkFallbackViewable();try{return sdkController.isViewable(\"window.mraidview\")}catch(a){imraidview.showAlert(\"isViewable: \"+\na)}};a.getPlacementType=function(){return sdkController.getPlacementType(\"window.mraidview\")};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};\"function\"!=typeof String.prototype.startsWith&&(String.prototype.startsWith=function(a){return 0==this.indexOf(a)});a.playVideo=function(a){var b=\"\";null!=a&&(b=a);try{sdkController.playVideo(\"window.mraidview\",b)}catch(c){imraidview.showAlert(\"playVideo: \"+c)}};a.stringify=function(b){if(\"undefined\"===\ntypeof JSON){var c=\"\",h;if(\"undefined\"==typeof b.length)return a.stringifyArg(b);for(h=0;h<b.length;h++)0<h&&(c+=\",\"),c+=a.stringifyArg(b[h]);return c+\"]\"}return JSON.stringify(b)};a.stringifyArg=function(a){var b,c,f;c=typeof a;b=\"\";if(\"number\"===c||\"boolean\"===c)b+=args;else if(a instanceof Array)b=b+\"[\"+a+\"]\";else if(a instanceof Object){c=!0;b+=\"{\";for(f in a)null!==a[f]&&(c||(b+=\",\"),b=b+'\"'+f+'\":',c=typeof a[f],b=\"number\"===c||\"boolean\"===c?b+a[f]:\"function\"===typeof a[f]?b+'\"\"':a[f]instanceof\nObject?b+this.stringify(args[i][f]):b+'\"'+a[f]+'\"',c=!1);b+=\"}\"}else a=a.replace(/\\\\/g,\"\\\\\\\\\"),a=a.replace(/\"/g,'\\\\\"'),b=b+'\"'+a+'\"';imraidview.showAlert(\"json:\"+b);return b};getPID=function(a){var b=\"\";null!=a&&(\"undefined\"!=typeof a.id&&null!=a.id)&&(b=a.id);return b};a.storePicture=function(b){console.log(\"bridge: storePicture\");if(\"string\"!=typeof b)window.mraid.broadcastEvent(\"error\",\"storePicture method expects url as string parameter\",\"storePicture\");else{if(a.supports(\"storePicture\"))return!window.confirm(\"Do you want to download the file?\")?\n(window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled by user.\",\"storePicture\"),!1):sdkController.storePicture(\"window.mraidview\",b);window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled because it is unsupported in this device/app.\",\"storePicture\")}};a.fireMediaTrackingEvent=function(a,b){};a.fireMediaErrorEvent=function(a,b){};a.fireMediaTimeUpdateEvent=function(a,b,c){};a.fireMediaCloseEvent=function(a,b,c){};a.fireMediaVolumeChangeEvent=function(a,b,c){};\na.broadcastEvent=function(){window.mraid.broadcastEvent.apply(window.mraid,arguments)};a.unload=function(){try{sdkController.unload(\"window.mraidview\")}catch(a){}};a.getCurrentAppOrientation=function(){var b;switch(a.orientation){case 0:case 180:b=\"portrait\";break;case 90:case 270:b=\"landscape\";break;default:b=\"none\"}return{orientation:b,locked:!1}};a.expand=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.expand(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"executeNativeExpand: \"+\nb+\", URL = \"+a)}};a.setExpandProperties=function(b){try{b?this.props=b:b=null;if(\"undefined\"!=typeof b.lockOrientation&&null!=b.lockOrientation&&\"undefined\"!=typeof b.orientation&&null!=b.orientation){var c={};c.allowOrientationChange=!b.lockOrientation;c.forceOrientation=b.orientation;a.setOrientationProperties(c)}sdkController.setExpandProperties(\"window.mraidview\",a.stringify(b))}catch(h){imraidview.showAlert(\"executeNativesetExpandProperties: \"+h+\", props = \"+b)}};a.getExpandProperties=function(){try{return eval(\"(\"+\nsdkController.getExpandProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getExpandProperties: \"+a)}};a.resizeProps=null;a.setResizeProperties=function(b){var c,h;try{c=parseInt(b.width);h=parseInt(b.height);if(isNaN(c)||isNaN(h)||1>c||1>h)throw\"Invalid\";b.width=c;b.height=h;a.resizeProps=b;sdkController.setResizeProperties(\"window.mraidview\",a.stringify(b))}catch(f){window.mraid.broadcastEvent(\"error\",\"Invalid properties.\",\"setResizeProperties\")}};a.getResizeProperties=function(){try{return eval(\"(\"+\nsdkController.getResizeProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getResizeProperties: \"+a)}};a.resize=function(){if(null==a.resizeProps)window.mraid.broadcastEvent(\"error\",\"Valid resize dimensions must be provided before calling resize\",\"resize\");else try{sdkController.resize(\"window.mraidview\")}catch(b){imraidview.showAlert(\"resize called in bridge\")}}})();\n(function(){var a=window.mraid=new InmobiObj,b=window.mraidview,c=!1;b.isAdShownToUser=!1;b.onUserInteraction=function(){imraidview.onUserInteraction();c=!0};b.isPossibleFraud=function(){return a.supports(\"redirectFraudDetection\")&&(!b.isAdShownToUser||!c)};b.fireRedirectFraudBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var c={};c.trigger=a;c.isAdShown=b.isAdShownToUser.toString();inmobi.recordEvent(135,c)}};b.getSdkVersionInt=function(){for(var a=imraid.getSdkVersion().split(\".\"),\nb=a.length,c=\"\",f=0;f<b;f++)c+=a[f];return parseInt(c)};b.firePopupBlockedBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var b={};b.trigger=a;inmobi.recordEvent(136,b)}};window.onbeforeunload=function(){b.detectAndBlockFraud(\"redirect\")};a.addEventListener(\"viewableChange\",function(a){a&&!b.isAdShownToUser&&(b.isAdShownToUser=!0);\"function\"===typeof b.iosBannerExposureChange&&b.iosBannerExposureChange(a)});a.useCustomClose=b.useCustomClose;a.close=b.close;a.getExpandProperties=\nfunction(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"getExpandProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getExpandProperties is deprecated\",\"getExpandProperties\");return b.getExpandProperties()};a.setExpandProperties=function(c){1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"setExpandProperties\"):(\"undefined\"!=typeof c&&(\"useCustomClose\"in c&&\"undefined\"!=typeof a.getState()&&\"expanded\"!=\na.getState())&&a.useCustomClose(c.useCustomClose),window.mraid.broadcastEvent(\"error\",\"MRAID setExpandProperties is deprecated\",\"setExpandProperties\"),b.setExpandProperties(c))};a.getResizeProperties=function(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"getResizeProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getResizeProperties is deprecated\",\"getResizeProperties\");return b.getResizeProperties()};a.setResizeProperties=function(a){1083<=\nb.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"setResizeProperties\"):(window.mraid.broadcastEvent(\"error\",\"MRAID setResizeProperties is deprecated\",\"setResizeProperties\"),b.setResizeProperties(a))};a.getOrientationProperties=b.getOrientationProperties;a.setOrientationProperties=b.setOrientationProperties;a.expand=function(a){try{1083<=b.getSdkVersionInt()?\"string\"===typeof a&&\"\"!==a.trim()?b.open(a):window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"expand\"):\n(window.mraid.broadcastEvent(\"error\",\"MRAID expand is deprecated\",\"expand\"),b.expand(a))}catch(c){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getMaxSize=b.getMaxSize;a.getState=b.getState;a.isViewable=b.isViewable;a.createCalendarEvent=function(a){window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"createCalendarEvent\")};a.open=function(c){b.detectAndBlockFraud(\"mraid.open\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"open\"):b.open(c))};a.resize=function(){try{1083<=\nb.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"MRAID resize not supported\",\"resize\"):(window.mraid.broadcastEvent(\"error\",\"MRAID resize is deprecated\",\"resize\"),b.expand())}catch(a){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getVersion=function(){return\"3.0\"};a.getPlacementType=b.getPlacementType;a.playVideo=function(a){b.playVideo(a)};a.getScreenSize=b.getScreenSize;a.getCurrentPosition=b.getCurrentPosition;a.getDefaultPosition=b.getDefaultPosition;a.supports=function(a){return b.supports(a)};\na.storePicture=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"storePicture\"):b.storePicture(c)};a.unload=function(){b.unload()};a.getCurrentAppOrientation=b.getCurrentAppOrientation;a.getLocation=function(){return null};a.getAudioVolume=b.getAudioVolume})();\n(function(){var a=window.imraidview={},b=!1,c={RESUME:\"resume\",PAUSE:\"pause\",MUTE:\"mute\",UNMUTE:\"unmute\",SHOW:\"show\",HIDE:\"hide\",SKIP:\"skip\"};a.setOrientationProperties=function(b){try{b?(\"undefined\"!=typeof b.allowOrientationChange&&(mraidview.orientationProperties.allowOrientationChange=b.allowOrientationChange),\"undefined\"!=typeof b.forceOrientation&&(mraidview.orientationProperties.forceOrientation=b.forceOrientation),\"undefined\"!=typeof b.direction&&(mraidview.orientationProperties.direction=\nb.direction)):b=null,sdkController.setOrientationProperties(\"window.imraidview\",mraidview.stringify(mraidview.orientationProperties))}catch(c){a.showAlert(\"setOrientationProperties: \"+c+\", props = \"+b)}};a.getOrientationProperties=function(){return mraidview.orientationProperties};a.firePostStatusEvent=function(a){window.imraid.broadcastEvent(\"postStatus\",a)};a.fireMediaTrackingEvent=function(a,b){var c={};c.name=a;var d=\"inmobi_media_\"+a;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(d=d+\"_\"+b);window.imraid.broadcastEvent(d,\nc)};a.fireMediaErrorEvent=function(a,b){var c={name:\"error\"};c.code=b;var d=\"inmobi_media_\"+c.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(d=d+\"_\"+a);window.imraid.broadcastEvent(d,c)};a.fireMediaTimeUpdateEvent=function(a,b,c){var d={name:\"timeupdate\",target:{}};d.target.currentTime=b;d.target.duration=c;b=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,d)};a.saveContent=function(a,b,c){window.imraid.addEventListener(\"saveContent_\"+a,c);\nsdkController.saveContent(\"window.imraidview\",a,b)};a.cancelSaveContent=function(a){sdkController.cancelSaveContent(\"window.imraidview\",a)};a.disableCloseRegion=function(a){sdkController.disableCloseRegion(\"window.imraidview\",a)};a.fireGalleryImageSelectedEvent=function(a,b,c){var d=new Image;d.src=\"data:image/jpeg;base64,\"+a;d.width=b;d.height=c;window.imraid.broadcastEvent(\"galleryImageSelected\",d)};a.fireCameraPictureCatpturedEvent=function(a,b,c){var d=new Image;d.src=\"data:image/jpeg;base64,\"+\na;d.width=b;d.height=c;window.imraid.broadcastEvent(\"cameraPictureCaptured\",d)};a.fireMediaCloseEvent=function(a,b,c){var d={name:\"close\"};d.viaUserInteraction=b;d.target={};d.target.currentTime=c;b=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,d)};a.fireMediaVolumeChangeEvent=function(a,b,c){var d={name:\"volumechange\",target:{}};d.target.volume=b;d.target.muted=c;b=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+\na);window.imraid.broadcastEvent(b,d)};a.fireDeviceMuteChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceMuted\",a)};a.fireDeviceVolumeChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceVolumeChange\",a)};a.fireHeadphonePluggedEvent=function(a){window.imraid.broadcastEvent(\"headphones\",a)};a.showAlert=function(a){sdkController.showAlert(\"window.imraidview\",a)};a.openExternal=function(b,c){try{600<=getSdkVersionInt()?sdkController.openExternal(\"window.imraidview\",b,c):sdkController.openExternal(\"window.imraidview\",\nb)}catch(d){a.showAlert(\"openExternal: \"+d)}};a.log=function(b){try{sdkController.log(\"window.imraidview\",b)}catch(c){a.showAlert(\"log: \"+c)}};a.getPlatform=function(){return\"android\"};a.asyncPing=function(b){try{sdkController.asyncPing(\"window.imraidview\",b)}catch(c){a.showAlert(\"asyncPing: \"+c)}};a.startListeningDeviceMuteEvents=function(){sdkController.registerDeviceMuteEventListener(\"window.imraidview\")};a.stopListeningDeviceMuteEvents=function(){sdkController.unregisterDeviceMuteEventListener(\"window.imraidview\")};\na.startListeningDeviceVolumeChange=function(){sdkController.registerDeviceVolumeChangeEventListener(\"window.imraidview\")};a.stopListeningDeviceVolumeChange=function(){sdkController.unregisterDeviceVolumeChangeEventListener(\"window.imraidview\")};a.startListeningHeadphonePluggedEvents=function(){sdkController.registerHeadphonePluggedEventListener(\"window.imraidview\")};a.stopListeningHeadphonePluggedEvents=function(){sdkController.unregisterHeadphonePluggedEventListener(\"window.imraidview\")};getSdkVersionInt=\nfunction(){for(var b=a.getSdkVersion().split(\".\"),c=b.length,d=\"\",e=0;e<c;e++)d+=b[e];return parseInt(d)};a.getSdkVersionInt=getSdkVersionInt;a.getSdkVersion=function(){return window._im_imaiview.getSdkVersion()};a.supports=function(a){console.log(\"bridge: supports (IMRAID)\");if(\"string\"!=typeof a)window.imraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\"supports\");else return\"false\"!=sdkController.supports(\"window.imraidview\",a)};a.postToSocial=function(b,c,d,e){window.imraid.broadcastEvent(\"error\",\n\"Method not supported\",\"postToSocial\");a.log(\"Method postToSocial not supported\")};a.incentCompleted=function(a){if(\"object\"!=typeof a||null==a)sdkController.incentCompleted(\"window.imraidview\",null);else try{sdkController.incentCompleted(\"window.imraidview\",JSON.stringify(a))}catch(b){sdkController.incentCompleted(\"window.imraidview\",null)}};a.getOrientation=function(){try{return String(sdkController.getOrientation(\"window.imraidview\"))}catch(b){a.showAlert(\"getOrientation: \"+b)}};a.acceptAction=\nfunction(b){try{sdkController.acceptAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"acceptAction: \"+c+\", params = \"+b)}};a.rejectAction=function(b){try{sdkController.rejectAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"rejectAction: \"+c+\", params = \"+b)}};a.updateToPassbook=function(b){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"updateToPassbook\");a.log(\"Method not supported\")};a.isDeviceMuted=function(){return\"false\"!=sdkController.isDeviceMuted(\"window.imraidview\")};\na.getDeviceVolume=function(){return 603>=getSdkVersionInt()?-1:sdkController.getDeviceVolume(\"window.imraidview\")};a.isHeadPhonesPlugged=function(){return\"false\"!=sdkController.isHeadphonePlugged(\"window.imraidview\")};a.sendSaveContentResult=function(){window.imraid.sendSaveContentResult.apply(window.imraid,arguments)};a.broadcastEvent=function(){window.imraid.broadcastEvent.apply(window.imraid,arguments)};a.disableBackButton=function(a){void 0==a||\"boolean\"!=typeof a?console.log(\"disableBackButton called with invalid params\"):\nsdkController.disableBackButton(\"window.imraidview\",a)};a.isBackButtonDisabled=function(){return sdkController.isBackButtonDisabled(\"window.imraidview\")};a.startListeningForBackButtonPressedEvent=function(){sdkController.registerBackButtonPressedEventListener(\"window.imraidview\")};a.stopListeningForBackButtonPressedEvent=function(){sdkController.unregisterBackButtonPressedEventListener(\"window.imraidview\")};a.hideStatusBar=function(){};a.setOpaqueBackground=function(){};a.startDownloader=function(a,\nb,c){682<=getSdkVersionInt()&&sdkController.startDownloader(\"window.imraidview\",a,b,c)};a.registerDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.registerDownloaderCallbacks(\"window.imraidview\")};a.unregisterDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.unregisterDownloaderCallbacks(\"window.imraidview\")};a.getDownloadProgress=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadProgress(\"window.imraidview\"):-1};a.getDownloadStatus=function(){return 682<=\ngetSdkVersionInt()?sdkController.getDownloadStatus(\"window.imraidview\"):-1};a.fireEvent=function(a){700<=getSdkVersionInt()&&(\"fireSkip\"===a?sdkController.fireSkip(\"window.imraidview\"):\"fireComplete\"===a?sdkController.fireComplete(\"window.imraidview\"):\"showEndCard\"===a&&sdkController.showEndCard(\"window.imraidview\"))};a.saveBlob=function(a){700<=getSdkVersionInt()&&sdkController.saveBlob(\"window.imraidview\",a)};a.getBlob=function(a,b){700<=getSdkVersionInt()&&sdkController.getBlob(a,b)};a.setCloseEndCardTracker=\nfunction(a){700<=getSdkVersionInt()&&sdkController.setCloseEndCardTracker(\"window.imraidview\",a)};a.getRenderableAdIndexes=function(){try{if(917<=getSdkVersionInt())return sdkController.getRenderableAdIndexes(\"window.imraidview\")}catch(a){}return\"[]\"};a.getCurrentRenderingIndex=function(){try{if(917<=getSdkVersionInt())return sdkController.getCurrentRenderingIndex(\"window.imraidview\")}catch(a){}return-1};a.showAd=function(a){try{917<=getSdkVersionInt()&&sdkController.showAd(\"window.imraidview\",a)}catch(b){}};\na.timeSinceShow=function(){try{if(917<=getSdkVersionInt())return sdkController.timeSinceShow(\"window.imraidview\")}catch(a){}return-1};a.getShowTimeStamp=function(){try{if(917<=getSdkVersionInt())return sdkController.getShowTimeStamp(\"window.imraidview\")}catch(a){}return-1};a.closeAll=function(){try{917<=getSdkVersionInt()&&sdkController.closeAll(\"window.imraidview\")}catch(a){}};a.loadAd=function(a){try{917<=getSdkVersionInt()&&sdkController.loadAd(\"window.imraidview\",a)}catch(b){}};a.setAdContext=\nfunction(a){try{917<=getSdkVersionInt()&&sdkController.setAdContext(\"window.imraidview\",a)}catch(b){}};a.getAdContext=function(){try{if(917<=getSdkVersionInt())return sdkController.getAdContext(\"window.imraidview\")}catch(a){}return\"\"};a.openWithoutTracker=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.openWithoutTracker(\"window.imraidview\",a)}catch(b){}};a.impressionRendered=function(){window.imraid.broadcastEvent(\"impressionRendered\")};a.customExpandInNative=function(a,b,c){try{void 0==\na||\"string\"!=typeof a?console.log(\"url called with invalid params\"):void 0==b||\"number\"!=typeof b?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"boolean\"!=typeof c?console.log(\"hideCloseButton called with invalid params\"):sdkController.customExpandInNative(\"window.imraidview\",a,b,c)}catch(d){}};a.customExpand=function(b,c,d,e,f){try{void 0==d||\"number\"!=typeof d?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"number\"!=typeof c?console.log(\"inputType called with invalid params\"):\nvoid 0==e||\"boolean\"!=typeof e?console.log(\"topNavBarVisible called with invalid params\"):void 0==f||\"boolean\"!=typeof f?console.log(\"bottomNavBarVisible called with invalid params\"):sdkController.customExpand(\"window.imraidview\",b,c,d,e,f)}catch(h){a.showAlert(\"executeNativeCustomExpand: \"+h+\", input = \"+b+\", inputType = \"+c+\", screenPercentage = \"+d+\", bottomNavBarVisible = \"+f+\", topNavBarVisible = \"+e)}};a.closeCustomExpand=function(){try{sdkController.closeCustomExpand(\"window.imraidview\")}catch(a){}};\na.onGestureDetected=function(a,b){window.imraid.broadcastEvent(\"onGestureDetected\",a,b)};a.onUserLandingCompleted=function(){window.imraid.broadcastEvent(\"onUserLandingCompleted\")};a.onUserInteraction=function(){window.imraid.broadcastEvent(\"onUserInteraction\")};a.impressionFired=function(){try{sdkController.impressionFired(\"window.imraidview\")}catch(a){}};a.getMaxDeviceVolume=function(){try{return sdkController.getMaxDeviceVolume(\"window.imraidview\")}catch(a){return 15}};a.zoom=function(a){try{sdkController.zoom(\"window.imraidview\",\na)}catch(b){}};a.onAudioStateChanged=function(a){try{sdkController.onAudioStateChanged(\"window.imraidview\",a)}catch(b){}};a.submitAdReport=function(a){try{sdkController.submitAdReport(\"window.imraidview\",void 0!=a.adQualityUrl?a.adQualityUrl:null,void 0!=a.enableUserAdReportScreenshot?a.enableUserAdReportScreenshot:null,void 0!=a.templateInfo?a.templateInfo:null)}catch(b){}};a.logTelemetryEvent=function(a){try{var b=void 0!=a.eventType?a.eventType:null,c=void 0!=a.payload?a.payload:null;a=null;null!=\nc&&(a=mraidview.stringify(c));sdkController.logTelemetryEvent(\"window.imraidview\",b,a)}catch(d){}};a.onUserAudioMuteInteraction=function(a){try{sdkController.onUserAudioMuteInteraction(\"window.imraidview\",a)}catch(b){}};a.enableFallbackViewabilityFunctionality=function(){b=!0;a.checkFallbackViewable()&&window.mraid.broadcastEvent(\"viewableChange\",!0);mraid.addEventListener(\"sizeChange\",function(){window.mraid.broadcastEvent(\"viewableChange\",a.checkFallbackViewable())})};a.checkFallbackViewable=function(){try{var b=\nmraidview.getCurrentPosition(),c=b.height;return 40<=b.width&&40<=c?!0:!1}catch(d){a.showAlert(\"checkFallbackViewable: \"+d)}};a.fallbackViewabilityEnabled=function(){return b};a.getSafeArea=function(){try{return JSON.parse(sdkController.getSafeArea(\"window.imraidview\"))}catch(a){return null}};a.loadWebView=function(b,c){try{\"string\"!==typeof b?a.showAlert(\"loadWebView: id parameter should be a string\"):\"string\"!==typeof c?a.showAlert(\"loadWebView: html parameter should be a string\"):sdkController.loadWebView(\"window.imraidview\",\nb,c)}catch(d){a.showAlert(\"loadWebView: \"+d)}};a.showWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"showWebView: id parameter should be a string\"):sdkController.showWebView(\"window.imraidview\",b)}catch(c){a.showAlert(\"showWebView: \"+c)}};a.sendMessage=function(b,c){try{\"string\"!==typeof b?a.showAlert(\"sendMessage: id parameter should be a string\"):\"string\"!==typeof c?a.showAlert(\"sendMessage: message parameter should be a string\"):sdkController.sendMessage(\"window.imraidview\",b,c)}catch(d){a.showAlert(\"sendMessage: \"+\nd)}};a.destroyWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"destroyWebView: id parameter should be a string\"):sdkController.destroyWebView(\"window.imraidview\",b)}catch(c){a.showAlert(\"destroyWebView: \"+c)}};a.pingV2=function(b){if(\"object\"===typeof b&&null!==b)try{sdkController.pingV2(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"pingV2: \"+c)}else a.showAlert(\"pingV2: pingJson is not a valid JSON object\")};a.enableNativeGestures=function(b){try{\"boolean\"!==typeof b?a.log(\"enableNativeGestures: 'enabled' must be a boolean.\"):\nsdkController.enableNativeGestures(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableNativeGestures: \"+c)}};a.enableTouchBeginCallback=function(b){try{\"boolean\"!==typeof b?a.log(\"enableTouchEndCallback: 'enabled' must be a boolean.\"):sdkController.enableTouchBeginCallback(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableTouchBeginCallback: \"+c)}};a.enableTouchEndCallback=function(b){try{\"boolean\"!==typeof b?a.log(\"enableTouchEndCallback: 'enabled' must be a boolean.\"):sdkController.enableTouchEndCallback(\"window.imraidview\",\nb)}catch(c){a.showAlert(\"enableTouchEndCallback: \"+c)}};var d=function(){try{var a=window.mraidview.getSdkVersionInt();return 1110===a||1111===a}catch(b){return!1}},e=0,h=function(a,b){var c=Number(a);return!isNaN(c)&&isFinite(c)?Math.round(c*b):a};a.createVideoPlayer=function(b){try{if(!(0<e))try{e=\"number\"===typeof window.devicePixelRatio&&0<window.devicePixelRatio?window.devicePixelRatio:1}catch(c){e=1}if(d())try{var f=b.config;\"undefined\"!==typeof f.playbackUpdateInterval&&null!==f.playbackUpdateInterval&&\n(f.playbackInterval=f.playbackUpdateInterval);var g=f.videoViewPosition;null!==g&&(\"undefined\"!==typeof g&&\"undefined\"!==typeof g.x&&null!==g.x)&&(g.x=h(g.x,e));null!==g&&(\"undefined\"!==typeof g&&\"undefined\"!==typeof g.y&&null!==g.y)&&(g.y=h(g.y,e))}catch(l){a.showAlert(\"applyCreateVideoPlayerContractPatch: \"+l)}k();sdkController.createVideoPlayer(\"window.imraidview\",JSON.stringify(b))}catch(r){a.showAlert(\"createVideoPlayer: \"+r)}};a.updateVideoPosition=function(b){try{sdkController.updateVideoPosition(\"window.imraidview\",\nJSON.stringify(b))}catch(c){a.showAlert(\"updateVideoPosition: \"+c)}};a.executeVideoPlayerActions=function(b,d){try{if(!Object.values(c).includes(b))throw Error(\"Invalid videoCommand\");sdkController.executeVideoPlayerActions(\"window.imraidview\",b,JSON.stringify(d))}catch(e){a.showAlert(\"executeVideoPlayerActions: \"+e)}};a.getPlaybackState=function(){try{return sdkController.getPlaybackState(\"window.imraidview\")}catch(b){return a.showAlert(\"getPlaybackState: \"+b),null}};a.destroyVideoPlayer=function(){try{l(),\nsdkController.destroyVideoPlayer(\"window.imraidview\")}catch(b){a.showAlert(\"destroyVideoPlayer: \"+b)}};var f=null,g=!1,k=function(){if(!g&&d())try{f=window.imraid.broadcastEvent,window.imraid.broadcastEvent=function(b){try{if(1<arguments.length&&\"VideoPlayerPosition\"===arguments[0]&&window.mraidview){var c=arguments[1];c&&(\"undefined\"!==typeof c.x&&null!==c.x)&&(c.x=h(c.x,1/e));c&&(\"undefined\"!==typeof c.y&&null!==c.y)&&(c.y=h(c.y,1/e))}if(\"function\"===typeof f)return f.apply(this,arguments)}catch(d){a.showAlert(\"originalBroadcastEvent failed: \"+\nd)}},g=!0}catch(b){l(),a.showAlert(\"Registering listener failed: \"+b)}},l=function(){try{g&&(window.imraid.broadcastEvent=f,f=null,g=!1)}catch(b){a.showAlert(\"Unregistering listener failed: \"+b)}}})();\n(function(){var a=window.imraid=new InmobiObj,b=window.imraidview;a.getOrientation=b.getOrientation;a.setOrientationProperties=b.setOrientationProperties;a.getOrientationProperties=b.getOrientationProperties;a.saveContentIDMap={};a.saveContent=function(c,e,h){var f=arguments.length,g,k=null;if(3>f){if(\"function\"===typeof arguments[f-1])g=arguments[f-1];else return;k={reason:1}}else a.saveContentIDMap[c]&&(g=arguments[2],k={reason:11,url:arguments[1]});\"function\"!==!g&&(k?(window.imraid.addEventListener(\"saveContent_failed_\"+\nc,g),window.imraid.sendSaveContentResult(\"saveContent_failed_\"+c,\"failed\",JSON.stringify(k))):(a.removeEventListener(\"saveContent_\"+c),a.saveContentIDMap[c]=!0,b.saveContent(c,e,h)))};a.cancelSaveContent=function(a){b.cancelSaveContent(a)};a.asyncPing=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"asyncPing\"):b.asyncPing(c)};a.disableCloseRegion=b.disableCloseRegion;a.getSdkVersion=b.getSdkVersion;a.log=function(c){\"undefined\"==typeof c?a.broadcastEvent(\"error\",\"message is required.\",\n\"log\"):\"string\"==typeof c?b.log(c):b.log(JSON.stringify(c))};a.getInMobiAIVersion=function(){return\"2.0\"};a.getVendorName=function(){return\"inmobi\"};a.openExternal=function(a,c){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imraid.openExternal\")||b.openExternal(a,c)};a.updateToPassbook=function(c){mraidview.detectAndBlockFraud(\"imraid.updateToPassbook\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"updateToPassbook\"):\nb.updateToPassbook(c))};a.postToSocial=function(a,c,h,f){mraidview.detectAndBlockFraud(\"imraid.postToSocial\")||b.postToSocial(a,c,h,f)};a.getPlatform=b.getPlatform;a.incentCompleted=b.incentCompleted;a.loadSKStore=b.loadSKStore;a.showSKStore=function(a){mraidview.detectAndBlockFraud(\"imraid.showSKStore\")||b.showSKStore(a)};a.pingV2=b.pingV2;a.enableHitTest=b.enableHitTest;a.enableNativeGestures=b.enableNativeGestures;a.enableTouchBeginCallback=b.enableTouchBeginCallback;a.enableTouchEndCallback=b.enableTouchEndCallback;\na.skoverlay=b.skoverlay;a.skoverlayWithSkan=b.skoverlayWithSkan;a.zoom=b.zoom;a.dismissSKOverlay=b.dismissSKOverlay;a.supports=function(a){return b.supports(a)};a.isDeviceMuted=function(){return!imIsObjValid(a.listeners.deviceMuted)?-1:b.isDeviceMuted()};a.isHeadPhonesPlugged=function(){return!imIsObjValid(a.listeners.headphones)?!1:b.isHeadPhonesPlugged()};a.getDeviceVolume=function(){return b.getDeviceVolume()};a.setDeviceVolume=function(a){b.setDeviceVolume(a)};a.hideStatusBar=function(){b.hideStatusBar()};\na.setOpaqueBackground=function(){b.setOpaqueBackground()};a.getRenderableAdIndexes=b.getRenderableAdIndexes;a.getCurrentRenderingIndex=b.getCurrentRenderingIndex;a.showAd=b.showAd;a.timeSinceShow=b.timeSinceShow;a.closeAll=b.closeAll;a.loadAd=b.loadAd;a.setAdContext=b.setAdContext;a.getAdContext=b.getAdContext;a.getShowTimeStamp=b.getShowTimeStamp;a.disableBackButton=b.disableBackButton;a.isBackButtonDisabled=b.isBackButtonDisabled;a.startDownloader=b.startDownloader;a.getDownloadProgress=b.getDownloadProgress;\na.getDownloadStatus=b.getDownloadStatus;a.fireEvent=b.fireEvent;a.saveBlob=b.saveBlob;a.getBlob=b.getBlob;a.setCloseEndCardTracker=b.setCloseEndCardTracker;a.openWithoutTracker=b.openWithoutTracker;a.impressionRendered=b.impressionRendered;a.onGestureDetected=b.onGestureDetected;a.onUserLandingCompleted=b.onUserLandingCompleted;a.customExpand=b.customExpand;a.closeCustomExpand=b.closeCustomExpand;a.customExpandInNative=b.customExpandInNative;a.impressionFired=b.impressionFired;a.getImraidVersion=\nb.getImraidVersion;a.getMaxDeviceVolume=b.getMaxDeviceVolume;a.onAudioStateChanged=b.onAudioStateChanged;a.onUserAudioMuteInteraction=b.onUserAudioMuteInteraction;a.submitAdReport=b.submitAdReport;a.enableFallbackViewabilityFunctionality=b.enableFallbackViewabilityFunctionality;a.logTelemetryEvent=b.logTelemetryEvent;a.getSafeArea=b.getSafeArea;a.onReceviedSKANCallback=b.onReceviedSKANCallback;a.getOpenMode=b.getOpenMode;a.loadWebView=b.loadWebView;a.showWebView=b.showWebView;a.sendMessage=b.sendMessage;\na.destroyWebView=b.destroyWebView;a.createVideoPlayer=function(a){b.createVideoPlayer(a)};a.updateVideoPosition=function(a){b.updateVideoPosition(a)};a.executeVideoPlayerActions=function(a,c){b.executeVideoPlayerActions(a,c)};a.getPlaybackState=function(){return b.getPlaybackState()};a.destroyVideoPlayer=function(){b.destroyVideoPlayer()};try{a.addEventListener(\"onUserLandingCompleted\",function(){1080>b.getSdkVersionInt()&&a.broadcastEvent(\"onUserLandingInitialized\")})}catch(c){}})();\n(function(){var a=window._im_imaiview={ios:{}};window.imaiview=a;a.broadcastEvent=function(){for(var a=Array(arguments.length),c=0;c<arguments.length;c++)a[c]=arguments[c];c=a.shift();try{window.mraid.broadcastEvent(c,a)}catch(d){}};a.getPlatform=function(){return\"android\"};a.getPlatformVersion=function(){return sdkController.getPlatformVersion(\"window.imaiview\")};a.log=function(a){sdkController.log(\"window.imaiview\",a)};a.openEmbedded=function(a){sdkController.openEmbedded(\"window.imaiview\",a)};\na.openExternal=function(a,c){600<=getSdkVersionInt()?sdkController.openExternal(\"window.imaiview\",a,c):sdkController.openExternal(\"window.imaiview\",a)};a.ping=function(a,c){sdkController.ping(\"window.imaiview\",a,c)};a.pingInWebView=function(a,c){sdkController.pingInWebView(\"window.imaiview\",a,c)};a.getSdkVersion=function(){try{var a=sdkController.getSdkVersion(\"window.imaiview\");if(\"string\"==typeof a&&null!=a)return a}catch(c){return\"3.7.0\"}};a.onUserInteraction=function(a){if(\"object\"!=typeof a||\nnull==a)sdkController.onUserInteraction(\"window.imaiview\",null);else try{sdkController.onUserInteraction(\"window.imaiview\",JSON.stringify(a))}catch(c){sdkController.onUserInteraction(\"window.imaiview\",null)}};a.fireAdReady=function(){sdkController.fireAdReady(\"window.imaiview\")};a.fireAdFailed=function(a){try{\"number\"===typeof a&&Number.isFinite(a)&&1120<=getSdkVersionInt()?sdkController.fireAdFailed(\"window.imaiview\",a):sdkController.fireAdFailed(\"window.imaiview\")}catch(c){sdkController.fireAdFailed(\"window.imaiview\")}};\na.broadcastEvent=function(){window.imai.broadcastEvent.apply(window.imai,arguments)}})();\n(function(){var a=window._im_imaiview;window._im_imai=new InmobiObj;window._im_imai.ios=new InmobiObj;var b=window._im_imai;window.imai=window._im_imai;b.matchString=function(a,b){if(\"string\"!=typeof a||null==a||null==b)return-1;var e=-1;try{e=a.indexOf(b)}catch(h){}return e};b.isHttpUrl=function(a){return\"string\"!=typeof a||null==a?!1:0==b.matchString(a,\"http://\")?!0:0==b.matchString(a,\"https://\")?!0:!1};b.appendTapParams=function(a,d,e){if(!imIsObjValid(d)||!imIsObjValid(e))return a;b.isHttpUrl(a)&&\n(a=-1==b.matchString(a,\"?\")?a+(\"?u-tap-o=\"+d+\",\"+e):a+(\"&u-tap-o=\"+d+\",\"+e));return a};b.performAdClick=function(a,d){d=d||event;if(imIsObjValid(a)){var e=a.clickConfig,h=a.landingConfig;if(!imIsObjValid(e)&&!imIsObjValid(h))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var f=null,g=null,k=null,l=null,n=null,m=null,q=null,p=null;if(imIsObjValid(d))try{l=d.changedTouches[0].pageX,n=d.changedTouches[0].pageY}catch(s){n=\nl=0}imIsObjValid(h)?imIsObjValid(e)?(m=h.url,q=h.fallbackUrl,p=h.urlType,f=e.url,g=e.pingWV,k=e.fr):(m=h.url,p=h.urlType):(m=e.url,p=e.urlType);e=b.getPlatform();try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof g&&\"number\"!=typeof g||null==g)g=!0;if(0>g||1<g)g=!0;if(\"number\"!=typeof p||null==p)p=0;f=b.appendTapParams(f,l,n);imIsObjValid(f)?!0==g?b.pingInWebView(f,k):b.ping(f,k):b.log(\"clickurl provided is null.\");if(imIsObjValid(m))switch(imIsObjValid(f)||\n(m=b.appendTapParams(m,l,n)),p){case 1:b.openEmbedded(m);break;case 2:\"ios\"==e?b.ios.openItunesProductView(m):this.broadcastEvent(\"error\",\"Cannot process openItunesProductView for os\"+e);break;default:b.openExternal(m,q)}else b.log(\"Landing url provided is null.\")}catch(r){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.performActionClick=function(a,d){d=d||event;if(imIsObjValid(a)){var e=a.clickConfig,h=a.landingConfig;\nif(!imIsObjValid(e)&&!imIsObjValid(h))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var f=null,g=null,k=null,l=null,n=null;if(imIsObjValid(d))try{l=d.changedTouches[0].pageX,n=d.changedTouches[0].pageY}catch(m){n=l=0}imIsObjValid(e)&&(f=e.url,g=e.pingWV,k=e.fr);try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof g&&\"number\"!=typeof g||null==g)g=\n!0;if(0>g||1<g)g=!0;f=b.appendTapParams(f,l,n);imIsObjValid(f)?!0==g?b.pingInWebView(f,k):b.ping(f,k):b.log(\"clickurl provided is null.\");b.onUserInteraction(h)}catch(q){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.getVersion=function(){return\"1.0\"};b.getPlatform=a.getPlatform;b.getPlatformVersion=a.getPlatformVersion;b.log=a.log;b.openEmbedded=function(b){console.log(\"openEmbedded is deprecated, will be removed in future version\");\nmraidview.detectAndBlockFraud(\"imai.openEmbedded\")||a.openEmbedded(b)};b.openExternal=function(b,d){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imai.openExternal\")||a.openExternal(b,d)};b.ping=a.ping;b.pingInWebView=a.pingInWebView;b.onUserInteraction=a.onUserInteraction;b.getSdkVersion=a.getSdkVersion;b.loadSKStore=a.loadSKStore;b.showSKStore=function(b){mraidview.detectAndBlockFraud(\"imai.showSKStore\")||a.showSKStore(b)};b.ios.openItunesProductView=\nfunction(b){mraidview.detectAndBlockFraud(\"imai.ios.openItunesProductView\")||a.ios.openItunesProductView(b)};b.fireAdReady=a.fireAdReady;b.fireAdFailed=a.fireAdFailed})();";
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.i;
        if (interfaceC2772t93 != null) {
            java.lang.String TAG3 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a(TAG3, "Returning fetched Mraid Js string.");
        }
        return string;
    }

    public final com.inmobi.media.Nf getOrientationProperties() {
        return this.H0;
    }

    public final long getPlacementId() {
        return this.a0;
    }

    public byte getPlacementType() {
        return this.b;
    }

    public final com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState getPlaybackState() {
        com.inmobi.media.C2926z8 c2926z8 = this.Z0;
        if (c2926z8 == null) {
            return null;
        }
        if (c2926z8.g.get()) {
            return new com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState();
        }
        if (c2926z8.q.get() == com.inmobi.media.EnumC2850w8.f5524a) {
            com.inmobi.media.EnumC2374e8[] enumC2374e8Arr = com.inmobi.media.EnumC2374e8.f5173a;
            c2926z8.a("getVideoPlayerState", "Playback state requested before load", (java.lang.String) null);
        }
        return c2926z8.k.a();
    }

    public com.inmobi.media.C getReferenceContainer() {
        return this.l0;
    }

    public final com.inmobi.media.C2936zi getRenderViewTelemetry() {
        return this.e0;
    }

    public final org.json.JSONArray getRenderableAdIndexes() {
        com.inmobi.media.InterfaceC2842w0 interfaceC2842w0 = this.n0;
        return interfaceC2842w0 != null ? ((com.inmobi.media.AbstractC2551l1) interfaceC2842w0).w() : new org.json.JSONArray();
    }

    public final com.inmobi.media.core.config.models.AdConfig.RenderingConfig getRenderingConfig() {
        return getAdConfig().getRendering();
    }

    public final com.inmobi.media.Qi getRoute() {
        return this.j;
    }

    public final org.json.JSONObject getSafeArea() {
        com.inmobi.media.No no;
        com.inmobi.media.Oo oo = this.O0;
        if (oo != null) {
            java.lang.Integer f = com.inmobi.media.N5.f();
            if (f == null && (f = com.inmobi.media.N5.g) == null) {
                no = null;
            } else {
                f.intValue();
                no = (com.inmobi.media.No) oo.d.get(f);
            }
            if (no != null) {
                return no.a();
            }
        }
        return null;
    }

    public final boolean getShouldFireLandingPageBeacons() {
        return this.N0;
    }

    public final long getShowTimeStamp() {
        com.inmobi.media.InterfaceC2842w0 interfaceC2842w0 = this.n0;
        if (interfaceC2842w0 != null) {
            return ((com.inmobi.media.AbstractC2551l1) interfaceC2842w0).x();
        }
        return 0L;
    }

    public final com.inmobi.media.C2542kj getSiblingWebviewManager() {
        return (com.inmobi.media.C2542kj) this.t.getValue();
    }

    public java.util.Map<java.lang.String, com.inmobi.media.C2709r1> getTelemetryManagerMap() {
        return this.Q0;
    }

    public com.inmobi.media.C2888xk getTelemetryOnAdImpression() {
        java.util.Map<java.lang.String, com.inmobi.media.C2709r1> telemetryManagerMap = getTelemetryManagerMap();
        return new com.inmobi.media.C2888xk(telemetryManagerMap != null ? telemetryManagerMap.get("AdImpressionSuccessful") : null, this.G0, getCreativeId(), getImpressionId(), getMarkupType());
    }

    public final boolean getUnloaded() {
        return this.P0;
    }

    public final com.inmobi.media.InterfaceC2339co getVISIBILITY_CHANGE_LISTENER() {
        return this.W0;
    }

    public android.view.View getVideoContainerView() {
        return null;
    }

    public final java.lang.String getViewState() {
        return this.A;
    }

    @Override // com.inmobi.media.InterfaceC2859wh
    public long getViewTouchTimestamp() {
        return this.g;
    }

    @Override // com.inmobi.media.C
    public com.inmobi.media.Wn getViewableAd() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "viewableAd getter " + this);
        }
        if (this.o0 == null) {
            this.o0 = new com.inmobi.media.J9(this, new com.inmobi.media.Xn(this), new com.inmobi.media.C2797u7(this.r, this.G0, this.x0, this.y0, getVisibilityTrackingMinPercentage(), this.i), this.i);
            java.util.Set<com.inmobi.media.Nk> set = this.c;
            if (set != null) {
                for (com.inmobi.media.Nk nk : set) {
                    try {
                        if (nk.f4860a == 3) {
                            setOmidViewableAd(nk);
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    } catch (java.lang.Exception e) {
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
                        if (interfaceC2772t92 != null) {
                            java.lang.String TAG2 = i1;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                            ((com.inmobi.media.C2799u9) interfaceC2772t92).b(TAG2, "Exception occurred while creating the HTML viewable ad : " + e.getMessage());
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        com.inmobi.media.Wn wn = this.o0;
        kotlin.jvm.internal.Intrinsics.checkNotNull(wn);
        return wn;
    }

    public final int[] getViewableFrameArray() {
        return this.s0;
    }

    public final int getVisibilityTrackingMinPercentage() {
        return kotlin.jvm.internal.Intrinsics.areEqual("audio", getAdType()) ? getAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed();
    }

    public final com.inmobi.media.Bo getWebViewFactory() {
        return this.k;
    }

    public final com.inmobi.media.Lo getWindowInsetListener() {
        return this.S0;
    }

    public final com.inmobi.media.C2887xj getWvStateMachine() {
        return this.s;
    }

    public final void h(final java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "js");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "injectJavaScript " + this + " - " + value);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.Lazy lazy = com.inmobi.media.AbstractC2740s6.f5441a;
        com.inmobi.media.ExecutorC2378ec executorC2378ec = (com.inmobi.media.ExecutorC2378ec) com.inmobi.media.AbstractC2740s6.e.getValue();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.pi$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.d(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.this, value);
            }
        };
        executorC2378ec.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC2378ec.f5177a.postAtFrontOfQueue(runnable);
    }

    public final void i(java.lang.String content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        com.inmobi.media.C2936zi c2936zi = this.e0;
        if (c2936zi != null) {
            c2936zi.b();
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "loadDataInWebView " + this);
        }
        this.Q = false;
        if (this.N.get()) {
            return;
        }
        loadDataWithBaseURL("", content, "text/html", "UTF-8", null);
    }

    public final void j() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "deferredDestroy " + this);
        }
        super.destroy();
    }

    public final void k() {
        if (this.N.get()) {
            return;
        }
        if (!this.I) {
            this.I = true;
            return;
        }
        g();
        android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.d0;
        if (onGlobalLayoutListener != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            this.d0 = null;
        }
        this.N.set(true);
        this.k.a(this.j.b);
        com.inmobi.media.Oo oo = this.O0;
        if (oo != null) {
            oo.a();
        }
        com.inmobi.media.H4 h4 = this.Y0;
        if (h4 != null) {
            h4.b();
        }
        this.Q = true;
        this.U = -1;
        com.inmobi.media.C2926z8 c2926z8 = this.Z0;
        if (c2926z8 != null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = c2926z8.c;
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("HybridVideoPlayerHandler", "destroy");
            }
            c2926z8.a();
            com.inmobi.media.Gf gf = c2926z8.p;
            if (gf != null) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = gf.g;
                if (interfaceC2772t92 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Gf", "TAG");
                    ((com.inmobi.media.C2799u9) interfaceC2772t92).c("Gf", "stopOmidSession");
                }
                com.inmobi.media.Ie ie = gf.e;
                if (ie != null) {
                    if (ie.c == null) {
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = ie.b;
                        if (interfaceC2772t93 != null) {
                            ((com.inmobi.media.C2799u9) interfaceC2772t93).a(com.inmobi.media.AbstractC2367e1.f, "Failed to stopAdSession. adSession is null");
                        }
                    } else {
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = ie.b;
                        if (interfaceC2772t94 != null) {
                            ((com.inmobi.media.C2799u9) interfaceC2772t94).a(com.inmobi.media.AbstractC2367e1.f, "stopAdSession");
                        }
                        com.iab.omid.library.inmobi.adsession.AdSession adSession = ie.c;
                        if (adSession != null) {
                            adSession.finish();
                        }
                        ie.c = null;
                    }
                }
            }
            c2926z8.p = null;
            com.inmobi.media.J3.a(c2926z8.d);
        }
        this.Z0 = null;
        removeJavascriptInterface("sdkController");
        com.inmobi.media.Ec ec = this.B;
        if (ec != null) {
            com.inmobi.media.C2484ic c2484ic = ec.d;
            if (c2484ic != null) {
                c2484ic.a();
            }
            ec.d = null;
            com.inmobi.media.C2484ic c2484ic2 = ec.e;
            if (c2484ic2 != null) {
                c2484ic2.a();
            }
            ec.e = null;
            com.inmobi.media.C2484ic c2484ic3 = ec.f;
            if (c2484ic3 != null) {
                c2484ic3.a();
            }
            ec.f = null;
        }
        this.u.clear();
        this.v.clear();
        java.lang.ref.WeakReference weakReference = this.w;
        if (weakReference != null) {
            weakReference.clear();
        }
        com.inmobi.media.Wn wn = this.o0;
        if (wn != null) {
            wn.d();
        }
        com.inmobi.media.Wn wn2 = this.o0;
        if (wn2 != null) {
            wn2.a();
        }
        com.inmobi.media.C2592mg c2592mg = this.g0;
        if (c2592mg != null) {
            com.inmobi.media.J8 j8 = com.inmobi.media.C2331cg.b;
            if (j8 != null) {
                java.lang.String id = c2592mg.c;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
                j8.b.remove(id);
                java.util.Iterator it = j8.b.entrySet().iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                    if (((java.lang.ref.WeakReference) ((java.util.Map.Entry) next).getValue()).get() == null) {
                        it.remove();
                    }
                }
            }
            com.inmobi.media.C2768t5 c2768t5 = com.inmobi.media.C2331cg.c;
            if (c2768t5 != null) {
                java.lang.String id2 = c2592mg.c;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id2, "id");
                c2768t5.b.remove(id2);
                java.util.Iterator it2 = c2768t5.b.entrySet().iterator();
                while (it2.hasNext()) {
                    java.lang.Object next2 = it2.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
                    if (((java.lang.ref.WeakReference) ((java.util.Map.Entry) next2).getValue()).get() == null) {
                        it2.remove();
                    }
                }
            }
            c2592mg.d.set(true);
        }
        this.g0 = null;
        T();
        S();
        java.util.Map<android.view.View, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.clear();
        }
        setFriendlyViews(null);
        this.F0 = null;
        this.x = null;
        this.l0 = null;
        this.n0 = null;
        this.C0 = false;
        this.c1 = null;
        android.view.ViewParent parent = getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.f, null, null, new com.inmobi.media.C2305bi(viewGroup, this, null), 3, null);
        }
    }

    public final void l(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "registerBackButtonPressedEventListener " + this);
        }
        this.M = str;
    }

    public void n() {
        com.inmobi.media.InterfaceC2842w0 interfaceC2842w0;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "dismissCurrentViewContainer " + this);
        }
        com.inmobi.media.Ec ec = this.B;
        if (ec != null) {
            com.inmobi.media.C2668pc c2668pc = ec.c;
            if (c2668pc != null) {
                c2668pc.b();
            }
            ec.c = null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.webkit.Profile.DEFAULT_PROFILE_NAME, this.A)) {
            setAndUpdateViewState("Hidden");
            android.view.ViewParent parent = getParent();
            boolean z = parent instanceof android.view.ViewGroup;
            if (z) {
                this.k.b(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.pi$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.c((com.inmobi.media.C2886xi) obj);
                    }
                });
            }
            if (1 == this.b) {
                o();
            } else if (z) {
                ((android.view.ViewGroup) parent).removeAllViews();
            }
        }
        if (this.J != com.inmobi.media.Yn.c || (interfaceC2842w0 = this.n0) == null) {
            return;
        }
        interfaceC2842w0.a(this, getFullScreenActivity());
    }

    public final void o() {
        android.app.Activity fullScreenActivity;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "finishFullScreenActivity " + this);
        }
        android.util.SparseArray sparseArray = com.inmobi.ads.rendering.InMobiAdActivity.t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "container");
        com.inmobi.ads.rendering.InMobiAdActivity.t.remove(hashCode());
        if (getFullScreenActivity() == null) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.webkit.Profile.DEFAULT_PROFILE_NAME, this.A)) {
                setAndUpdateViewState("Hidden");
            }
            W();
            return;
        }
        com.inmobi.media.InterfaceC2842w0 interfaceC2842w0 = this.n0;
        if (interfaceC2842w0 == null || !interfaceC2842w0.a(this)) {
            android.app.Activity fullScreenActivity2 = getFullScreenActivity();
            kotlin.jvm.internal.Intrinsics.checkNotNull(fullScreenActivity2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
            ((com.inmobi.ads.rendering.InMobiAdActivity) fullScreenActivity2).e = true;
            android.app.Activity fullScreenActivity3 = getFullScreenActivity();
            if (fullScreenActivity3 != null) {
                fullScreenActivity3.finish();
            }
            if (this.U == -1 || (fullScreenActivity = getFullScreenActivity()) == null) {
                return;
            }
            fullScreenActivity.overridePendingTransition(0, this.U);
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.inmobi.media.Ph ph;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "onAttachedToWindow " + this);
        }
        super.onAttachedToWindow();
        if (!this.e) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.j.b, com.unity3d.ads.BuildConfig.FLAVOR)) {
                getListener().d(this);
            }
            if (getAdConfig().getRendering().getEnableActivityContextOnBannerAttach()) {
                B();
            }
        }
        com.inmobi.media.Ec ec = this.B;
        if (ec != null) {
            com.inmobi.media.C2484ic c2484ic = ec.d;
            if (c2484ic != null) {
                c2484ic.b();
            }
            com.inmobi.media.C2484ic c2484ic2 = ec.e;
            if (c2484ic2 != null) {
                c2484ic2.b();
            }
            com.inmobi.media.C2484ic c2484ic3 = ec.f;
            if (c2484ic3 != null) {
                c2484ic3.b();
            }
        }
        O();
        if (this.w == null) {
            android.view.ViewParent parent = getParent();
            this.w = new java.lang.ref.WeakReference(parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null);
        }
        U();
        R();
        Q();
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, "==== CHECKPOINT REACHED - VISIBLE ====");
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.i;
        if (interfaceC2772t93 == null || (ph = ((com.inmobi.media.C2799u9) interfaceC2772t93).f5484a) == null) {
            return;
        }
        ph.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "onDetachedFromWindow " + this);
        }
        com.inmobi.media.Y5 y5 = this.E0;
        if (y5 != null) {
            com.inmobi.media.Y5.a(y5, 8, true, null, 12);
            com.inmobi.media.C2465hj c2465hj = y5.m;
            if (!c2465hj.f && c2465hj.f5245a > 0) {
                c2465hj.f = true;
                c2465hj.g = com.inmobi.media.EnumC2412fj.f;
                c2465hj.a();
            }
            kotlinx.coroutines.CoroutineScopeKt.cancel$default(c2465hj.d, null, 1, null);
        }
        com.inmobi.media.Ec ec = this.B;
        if (ec != null) {
            com.inmobi.media.C2484ic c2484ic = ec.d;
            if (c2484ic != null) {
                c2484ic.a();
            }
            com.inmobi.media.C2484ic c2484ic2 = ec.e;
            if (c2484ic2 != null) {
                c2484ic2.a();
            }
            com.inmobi.media.C2484ic c2484ic3 = ec.f;
            if (c2484ic3 != null) {
                c2484ic3.a();
            }
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, "Detached from window");
        }
        com.inmobi.media.L0 l0 = this.I0;
        if (l0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
            l0 = null;
        }
        if (l0.d.get()) {
            l0.a("session end is already triggered");
        } else if (!l0.f4808a.getEnabled()) {
            l0.a("config kill switch - false. ad quality will skip");
        } else if (l0.g == null) {
            l0.a("setup not done. ignore trigger");
        } else {
            l0.d.set(true);
            l0.a(false);
        }
        if (this.J0.get()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.C2515ji(this, null), 3, null);
        }
        U();
        T();
        S();
        try {
            super.onDetachedFromWindow();
        } catch (java.lang.IllegalArgumentException e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.i;
            if (interfaceC2772t93 != null) {
                java.lang.String TAG3 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).b(TAG3, "Detaching WebView from window encountered an error ( " + e.getMessage() + " )");
            }
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(android.view.MotionEvent e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
        if (!this.n) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "DoubleTap gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(1)) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
            if (interfaceC2772t92 != null) {
                java.lang.String TAG2 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).c(TAG2, "Double tap gesture is disabled from config");
            }
            return false;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.i;
        if (interfaceC2772t93 != null) {
            java.lang.String TAG3 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a(TAG3, "onDoubleTapEvent detected \n " + e);
        }
        setViewTouchTimestamp(android.os.SystemClock.elapsedRealtime());
        if (e.getAction() == 0) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            try {
                jSONArray.put(com.inmobi.media.J3.c(e.getX()));
                jSONArray.put(com.inmobi.media.J3.c(e.getY()));
            } catch (org.json.JSONException e2) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.i;
                if (interfaceC2772t94 != null) {
                    java.lang.String TAG4 = i1;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                    ((com.inmobi.media.C2799u9) interfaceC2772t94).a(TAG4, "Exception in onDoubleTap", e2);
                }
            }
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            jSONArray2.put(jSONArray);
            h("window.imraidview.onGestureDetected('1', '" + jSONArray2 + "');");
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(android.view.MotionEvent e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent e2, float f, float f2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e2, "e2");
        if (!this.n) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "Fling gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(6)) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
            if (interfaceC2772t92 != null) {
                java.lang.String TAG2 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).c(TAG2, "fling gesture is disabled from config");
            }
            return false;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            jSONArray.put(motionEvent == null ? new org.json.JSONArray() : new org.json.JSONArray((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.inmobi.media.J3.c(motionEvent.getX())), java.lang.Integer.valueOf(com.inmobi.media.J3.c(motionEvent.getY()))})));
            jSONArray.put(new org.json.JSONArray((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.inmobi.media.J3.c(e2.getX())), java.lang.Integer.valueOf(com.inmobi.media.J3.c(e2.getY()))})));
            jSONArray.put(new org.json.JSONArray((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Float[]{java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2)})));
        } catch (java.lang.Exception e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.i;
            if (interfaceC2772t93 != null) {
                java.lang.String TAG3 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).a(TAG3, "Exception in onFling", e);
            }
        }
        h("window.imraidview.onGestureDetected('6', '" + jSONArray + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
        if (!this.n) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "Long Press gesture is disabled via enableNativeGestures API");
                return;
            }
            return;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(5)) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
            if (interfaceC2772t92 != null) {
                java.lang.String TAG2 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).c(TAG2, "LongPress gesture is disabled from config");
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.i;
        if (interfaceC2772t93 != null) {
            java.lang.String TAG3 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a(TAG3, "onLongPress detected \n " + e);
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            jSONArray.put(com.inmobi.media.J3.c(e.getX()));
            jSONArray.put(com.inmobi.media.J3.c(e.getY()));
        } catch (org.json.JSONException e2) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.i;
            if (interfaceC2772t94 != null) {
                java.lang.String TAG4 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t94).a(TAG4, "Exception in onLongPress", e2);
            }
        }
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('5', '" + jSONArray2 + "');");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e2, float f, float f2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e2, "e2");
        if (this.e && !this.W) {
            this.W = true;
            android.util.SparseArray sparseArray = com.inmobi.ads.rendering.InMobiAdActivity.t;
            g1.getClass();
            org.json.JSONObject jsonObject = com.inmobi.media.Vh.a("IN_CUSTOM_BROWSER", "onScroll");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = com.inmobi.ads.rendering.InMobiAdActivity.u;
            if (gestureDetectorOnGestureListenerC2675pi != null) {
                gestureDetectorOnGestureListenerC2675pi.c(jsonObject);
            }
            return false;
        }
        if (!this.n) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "Scroll gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, "onScroll detected \n " + motionEvent + " \n " + e2);
        }
        if (!this.e) {
            com.inmobi.media.Ck scrollThrottler = getScrollThrottler();
            scrollThrottler.getClass();
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (elapsedRealtime - scrollThrottler.b < scrollThrottler.f4646a) {
                scrollThrottler.b = elapsedRealtime;
            } else {
                scrollThrottler.b = elapsedRealtime;
                if (getRenderingConfig().getSupportedGestures().contains(8)) {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    try {
                        jSONArray.put(motionEvent == null ? new org.json.JSONArray() : new org.json.JSONArray((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.inmobi.media.J3.c(motionEvent.getX())), java.lang.Integer.valueOf(com.inmobi.media.J3.c(motionEvent.getY()))})));
                        jSONArray.put(new org.json.JSONArray((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.inmobi.media.J3.c(e2.getX())), java.lang.Integer.valueOf(com.inmobi.media.J3.c(e2.getY()))})));
                    } catch (java.lang.Exception e) {
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.i;
                        if (interfaceC2772t93 != null) {
                            java.lang.String TAG3 = i1;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                            ((com.inmobi.media.C2799u9) interfaceC2772t93).a(TAG3, "Exception in onScroll", e);
                        }
                    }
                    h("window.imraidview.onGestureDetected('8', '" + jSONArray + "');");
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(android.view.MotionEvent e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(android.view.MotionEvent e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
        if (!this.n) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "SingleTapConfirmed gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(0)) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
            if (interfaceC2772t92 != null) {
                java.lang.String TAG2 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).c(TAG2, "Click gesture is disabled from config");
            }
            return false;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.i;
        if (interfaceC2772t93 != null) {
            java.lang.String TAG3 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a(TAG3, "onSingleTapConfirmed detected \n " + e);
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            jSONArray.put(com.inmobi.media.J3.c(e.getX()));
            jSONArray.put(com.inmobi.media.J3.c(e.getY()));
        } catch (org.json.JSONException e2) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.i;
            if (interfaceC2772t94 != null) {
                java.lang.String TAG4 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t94).a(TAG4, "Exception in onSingleTapConfirmed", e2);
            }
        }
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('0', '" + jSONArray2 + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(android.view.MotionEvent e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "onSingleTapUp detected \n " + e);
        }
        setViewTouchTimestamp(android.os.SystemClock.elapsedRealtime());
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "onSizeChanged " + this);
        }
        super.onSizeChanged(i, i2, i3, i4);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, "onSizeChanged (" + i + ", " + i2 + ")");
        }
        if (i == 0 || i2 == 0) {
            return;
        }
        a(com.inmobi.media.J3.b(i / com.inmobi.media.N5.b()), com.inmobi.media.J3.b(i2 / com.inmobi.media.N5.b()));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        if (java.lang.Float.isNaN(event.getX()) || java.lang.Float.isNaN(event.getY())) {
            if (!this.K0) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
                if (interfaceC2772t9 != null) {
                    java.lang.String TAG = i1;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).b(TAG, "onTouchEvent Invalid Coordinates " + event);
                }
                this.K0 = true;
            }
            return super.onTouchEvent(event);
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, "onTouchEvent " + this);
        }
        if (!getAdConfig().getRendering().getUseDispatchTouchEvent()) {
            a(event);
        }
        setViewTouchTimestamp(android.os.SystemClock.elapsedRealtime());
        return super.onTouchEvent(event);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        android.app.Activity fullScreenActivity;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "onWindowFocusChanged " + this + " - " + z);
        }
        super.onWindowFocusChanged(z);
        if (z) {
            if (isShown()) {
                com.inmobi.media.C2715r7 c2715r7 = com.inmobi.media.C2797u7.k;
                if (c2715r7.b(this, this, this.y0) && c2715r7.a(this, this, this.y0)) {
                    z = true;
                }
            }
            z = false;
        }
        if (android.os.Build.VERSION.SDK_INT <= 23 || (fullScreenActivity = getFullScreenActivity()) == null || !fullScreenActivity.isInMultiWindowMode()) {
            d(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r2.a(r4, r4, r5) != false) goto L19;
     */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWindowVisibilityChanged(int i) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "onWindowVisibilityChanged " + this + io.ktor.sse.ServerSentEventKt.SPACE + i);
        }
        super.onWindowVisibilityChanged(i);
        boolean z = true;
        boolean z2 = i == 0;
        if (z2) {
            int visibilityTrackingMinPercentage = getVisibilityTrackingMinPercentage();
            if (isShown()) {
                com.inmobi.media.C2715r7 c2715r7 = com.inmobi.media.C2797u7.k;
                if (c2715r7.b(this, this, visibilityTrackingMinPercentage)) {
                }
            }
            z = false;
        } else {
            z = z2;
        }
        d(z);
    }

    public final void p() {
        com.inmobi.media.L0 l0;
        com.inmobi.media.ads.network.common.model.AdQualityControl adQualityControl;
        android.app.Activity activity;
        com.inmobi.media.L0 l02;
        com.inmobi.media.ads.network.common.model.AdQualityControl adQualityControl2;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "fireAQSession - " + getAdType() + " type - sdk - " + android.os.Build.VERSION.SDK_INT);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getAdType(), "int") || android.os.Build.VERSION.SDK_INT < 29 || (activity = (android.app.Activity) this.u.get()) == null) {
            com.inmobi.media.L0 l03 = this.I0;
            if (l03 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
                l0 = null;
            } else {
                l0 = l03;
            }
            l0.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "adView");
            if (!l0.a()) {
                l0.a("session state invalid");
                return;
            }
            l0.a("session start trigger...");
            l0.c.set(true);
            com.inmobi.media.ads.network.common.model.AdQualityControl adQualityControl3 = l0.g;
            if (adQualityControl3 == null || !adQualityControl3.getTakeScreenshot() || (adQualityControl = l0.g) == null) {
                return;
            }
            l0.a(this, (long) (adQualityControl.getScreenshotDelayInSeconds() * 1000), false, (com.inmobi.media.Zh) null);
            return;
        }
        com.inmobi.media.L0 l04 = this.I0;
        if (l04 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
            l02 = null;
        } else {
            l02 = l04;
        }
        l02.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        if (!l02.a()) {
            l02.a("session state invalid");
            return;
        }
        l02.a("session start trigger...");
        l02.c.set(true);
        com.inmobi.media.ads.network.common.model.AdQualityControl adQualityControl4 = l02.g;
        if (adQualityControl4 == null || !adQualityControl4.getTakeScreenshot() || (adQualityControl2 = l02.g) == null) {
            return;
        }
        l02.a(activity, (long) (adQualityControl2.getScreenshotDelayInSeconds() * 1000), false, (com.inmobi.media.Zh) null);
    }

    public final void q() {
        if (this.N.get()) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b(TAG, "fireAdReady called on destroyed view");
                return;
            }
            return;
        }
        if (this.P0) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
            if (interfaceC2772t92 != null) {
                java.lang.String TAG2 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, "fireAdReady " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        com.inmobi.media.C2936zi c2936zi = this.e0;
        if (c2936zi != null) {
            java.util.Map a2 = c2936zi.a();
            long j = c2936zi.c;
            kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j;
            a2.put("latency", java.lang.Long.valueOf(elapsedRealtime));
            c2936zi.h = elapsedRealtime;
            java.lang.String a3 = c2936zi.a("FireAdReady");
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b(a3, a2, com.inmobi.media.EnumC2728rk.f5431a);
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.i;
        if (interfaceC2772t93 != null) {
            java.lang.String TAG3 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a(TAG3, "fireAdReady " + this);
        }
        this.C0 = true;
        if (this.r == 0) {
            u();
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.C2594mi(this, null), 3, null);
        getListener().h(this);
    }

    public final void r() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "fireBackButtonPressedEvent " + this);
        }
        java.lang.String str = this.M;
        if (str != null) {
            a(str, "broadcastEvent('backButtonPressed')");
        }
    }

    public final void s() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "fireClickTrackers " + this);
        }
        com.inmobi.media.H4 h4 = this.Y0;
        if (h4 != null) {
            h4.f();
        }
        v();
        getListener().b(this);
    }

    public final void setAdPodHandler(com.inmobi.media.InterfaceC2842w0 interfaceC2842w0) {
        this.n0 = interfaceC2842w0;
    }

    public void setAdType(java.lang.String str) {
        this.i0 = str;
    }

    public final void setAllowAutoRedirection(boolean z) {
        this.m0 = z;
    }

    public final void setAndUpdateViewState(java.lang.String state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "setAndUpdateViewState " + this);
        }
        this.A = state;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, "set state:" + this.A);
        }
        java.util.Locale ENGLISH = java.util.Locale.ENGLISH;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        java.lang.String lowerCase = state.toLowerCase(ENGLISH);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        f(lowerCase);
    }

    public final void setBackButtonDisabled(boolean z) {
        this.L = z;
    }

    public final void setBannerHolderActivity(java.lang.ref.WeakReference<android.app.Activity> weakReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.v = weakReference;
    }

    public final void setBeaconUrl(java.lang.String str) {
        this.M0 = str;
    }

    public final void setBlobProvider(com.inmobi.media.F2 f2) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "setBlobProvider " + this);
        }
        this.k0 = f2;
    }

    public final void setCloseAssetArea(com.inmobi.media.Mo value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        if (!this.X0) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (!com.inmobi.media.J3.a(context)) {
                return;
            }
        }
        this.f1 = new com.inmobi.media.Mo(0, value.b, value.c, 0);
    }

    public final void setConfiguredArea(long j) {
        this.t0 = getWidth() * getHeight();
    }

    public final void setContentURL(java.lang.String str) {
        this.r0 = str;
    }

    public final void setContextualDataHandler(com.inmobi.media.H4 h4) {
        this.Y0 = h4;
    }

    public void setCreativeId(java.lang.String str) {
        this.b0 = str;
    }

    public final void setDisableBackButton(boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "setDisableBackButton " + this);
        }
        this.L = z;
    }

    public final void setEmbeddedBrowserJsCallbacks(com.inmobi.media.W5 w5) {
        this.F0 = w5;
    }

    public final void setEnableNativeGestures(boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "enableNativeGestures " + this + io.ktor.sse.ServerSentEventKt.SPACE + z);
        }
        boolean z2 = this.n;
        this.n = z;
        if (z && !z2) {
            if (this.z0 == null) {
                this.z0 = new com.inmobi.media.C2854wc(this);
            }
        } else {
            if (z || !z2) {
                return;
            }
            this.z0 = null;
        }
    }

    public final void setEnableTouchBeginCallback(boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "setEnableTouchBeginCallback " + this + io.ktor.sse.ServerSentEventKt.SPACE + z);
        }
        this.p = z;
    }

    public final void setEnableTouchEndCallback(boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "setEnableTouchEndCallback " + this + io.ktor.sse.ServerSentEventKt.SPACE + z);
        }
        this.o = z;
    }

    public void setExitAnimation(int i) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "setExitAnimation " + this);
        }
        this.U = i;
    }

    public final void setExposureTracker(com.inmobi.media.U u) {
        this.L0 = u;
    }

    public void setFriendlyViews(java.util.Map<android.view.View, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose> map) {
        this.j0 = map;
    }

    public void setFullScreenActivityContext(android.app.Activity activity) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "setFullScreenActivityContext " + this);
        }
        this.u = new java.lang.ref.WeakReference(activity);
        Y();
        if (this.e || activity == null) {
            return;
        }
        com.inmobi.media.Oo oo = this.O0;
        if (oo != null) {
            oo.a();
        }
        this.O0 = new com.inmobi.media.Oo(activity, this.S0, this.i);
    }

    public final void setImmersiveMode(boolean z) {
        this.X0 = z;
    }

    public void setImpressionId(java.lang.String str) {
        this.d = str;
    }

    public final void setInAppActivityBrowserClientListener(com.inmobi.media.O8 o8) {
        this.c1 = o8;
    }

    public final void setLandingPageTelemetryControlInfoOnWebViewClient(com.inmobi.media.C2431gb c2431gb) {
        com.inmobi.media.Y5 y5 = this.E0;
        if (y5 != null) {
            y5.k = c2431gb;
            y5.l = new com.inmobi.media.C2377eb(c2431gb, y5);
        }
    }

    public final void setLandingScheme(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f = str;
    }

    public final void setMCreativeType(java.lang.String str) {
        this.G0 = str;
    }

    public final void setMImpressionMinPercentageViewed(int i) {
        this.y0 = i;
    }

    public final void setMImpressionMinTimeViewed(int i) {
        this.x0 = i;
    }

    public final void setMViewableAd(com.inmobi.media.Wn wn) {
        this.o0 = wn;
    }

    public final void setMarkupTypeAdUnit(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.T0 = str;
    }

    public final void setOrientationProperties(com.inmobi.media.Nf nf) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nf, "<set-?>");
        this.H0 = nf;
    }

    public final void setPingAckListener(com.inmobi.media.InterfaceC2513jg pingAckListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pingAckListener, "pingAckListener");
        this.q = pingAckListener;
    }

    public final void setPingManager(com.inmobi.media.C2592mg pingManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pingManager, "pingManager");
        this.g0 = pingManager;
    }

    public final void setPlacementId(long j) {
        this.a0 = j;
    }

    public final void setPreloadView(boolean z) {
    }

    public void setReferenceContainer(com.inmobi.media.C c) {
        this.l0 = c;
    }

    public final void setRenderViewEventListener(com.inmobi.media.AbstractC2726ri abstractC2726ri) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "setRenderViewEventListener " + this);
        }
        this.x = abstractC2726ri;
    }

    public final void setRenderViewTelemetry(com.inmobi.media.C2936zi c2936zi) {
        this.e0 = c2936zi;
    }

    public final void setScrollable(boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "setScrollable " + this);
        }
        setScrollContainer(z);
        setVerticalScrollBarEnabled(z);
        setHorizontalScrollBarEnabled(z);
    }

    public final void setShouldFireLandingPageBeacons(boolean z) {
        this.N0 = z;
    }

    public void setTelemetryManagerMap(java.util.Map<java.lang.String, com.inmobi.media.C2709r1> map) {
        this.Q0 = map;
    }

    public final void setUnloaded(boolean z) {
        this.P0 = z;
    }

    public final void setUseCustomClose(boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "setUseCustomClose " + this + io.ktor.sse.ServerSentEventKt.SPACE + z);
        }
        this.H = z;
    }

    public void setViewTouchTimestamp(long j) {
        this.g = j;
    }

    public final void setWatermark(final com.inmobi.ads.WatermarkData watermarkData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        if (!getAdConfig().getWatermarkEnabled()) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "Watermark disabled from config. ignoring...");
                return;
            }
            return;
        }
        final byte[] decode = android.util.Base64.decode(watermarkData.getWatermarkBase64EncodedString(), 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        if (!this.c0.get()) {
            this.c0.set(true);
            this.d0 = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.inmobi.media.pi$$ExternalSyntheticLambda7
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.this, decode, watermarkData);
                }
            };
            getViewTreeObserver().addOnGlobalLayoutListener(this.d0);
        } else {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
            if (interfaceC2772t92 != null) {
                java.lang.String TAG2 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).c(TAG2, "Watermark layout listener already set; ignoring duplicate setWatermark call");
            }
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "stopLoading " + this);
        }
        if (this.N.get()) {
            return;
        }
        super.stopLoading();
    }

    public final void t() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "fireEvent " + this + " 2");
        }
    }

    public void u() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "fireImpression " + this);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual("video", this.G0) || kotlin.jvm.internal.Intrinsics.areEqual("audio", this.G0)) {
            return;
        }
        F();
        h("window.imraidview.impressionRendered();");
        getListener().c(this);
    }

    public final void v() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "fireOnUserInteraction " + this);
        }
        h("window.imraidview.onUserInteraction();");
    }

    public final void w() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "firePopupBlockedEvent " + this);
        }
        h("window.mraidview.popupBlocked('popupBlocked')");
    }

    public final void x() {
        android.app.Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity != null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "fullScreenActivity is not null and finishing");
            }
            com.inmobi.ads.rendering.InMobiAdActivity inMobiAdActivity = fullScreenActivity instanceof com.inmobi.ads.rendering.InMobiAdActivity ? (com.inmobi.ads.rendering.InMobiAdActivity) fullScreenActivity : null;
            if (inMobiAdActivity != null) {
                inMobiAdActivity.b();
            } else {
                fullScreenActivity.finish();
            }
        }
    }

    public final boolean z() {
        if (kotlin.jvm.internal.Intrinsics.areEqual(getAdType(), "banner") && getAdConfig().getMraid3().getBannerEnabled()) {
            return true;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(getAdType(), "int") && getAdConfig().getMraid3().getInterstitialEnabled();
    }

    public final void m() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "dismissCurrentIntAdViewContainerInShowNextPodFlow " + this);
        }
        com.inmobi.media.Ec ec = this.B;
        if (ec != null) {
            com.inmobi.media.C2668pc c2668pc = ec.c;
            if (c2668pc != null) {
                c2668pc.b();
            }
            ec.c = null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.webkit.Profile.DEFAULT_PROFILE_NAME, this.A)) {
            setAndUpdateViewState("Hidden");
            if (getParent() instanceof android.view.ViewGroup) {
                this.k.b(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.pi$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.b((com.inmobi.media.C2886xi) obj);
                    }
                });
            }
            android.util.SparseArray sparseArray = com.inmobi.ads.rendering.InMobiAdActivity.t;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "container");
            com.inmobi.ads.rendering.InMobiAdActivity.t.remove(hashCode());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GestureDetectorOnGestureListenerC2675pi(android.content.Context context, byte b, java.util.Set set, java.lang.String str, boolean z, java.lang.String landingScheme, long j, com.inmobi.media.C2781ti c2781ti, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, com.inmobi.media.Qi route, com.inmobi.media.Bo webViewFactory, com.inmobi.media.C2630o0 c2630o0, com.inmobi.media.core.config.models.AdConfig adConfig) {
        super(r10);
        com.inmobi.media.Th wh;
        com.inmobi.media.Mo mo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "route");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.b = b;
        this.c = set;
        this.d = str;
        this.e = z;
        this.f = landingScheme;
        this.g = j;
        this.h = c2781ti;
        this.i = interfaceC2772t9;
        this.j = route;
        this.k = webViewFactory;
        this.l = c2630o0;
        this.m = adConfig;
        this.p = true;
        this.q = new com.inmobi.media.C2568li(this);
        this.s = new com.inmobi.media.C2887xj(interfaceC2772t9);
        this.t = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.pi$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.c(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.this);
            }
        });
        this.u = new java.lang.ref.WeakReference(null);
        this.v = new java.lang.ref.WeakReference(null);
        this.y = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.A = androidx.webkit.Profile.DEFAULT_PROFILE_NAME;
        this.F = true;
        this.G = true;
        this.I = true;
        this.J = com.inmobi.media.Yn.f5073a;
        this.N = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.O = new java.lang.Object();
        this.P = new java.lang.Object();
        this.R = true;
        this.U = -1;
        this.a0 = Long.MIN_VALUE;
        this.c0 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f0 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.pi$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.b(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.this);
            }
        });
        this.h0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.pi$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.A();
            }
        });
        this.v0 = new com.inmobi.media.Yh(this);
        this.w0 = new com.inmobi.media.C2333ci(this);
        this.x0 = Integer.MIN_VALUE;
        this.y0 = Integer.MIN_VALUE;
        this.J0 = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.R0 = new com.inmobi.media.Zh(this);
        this.S0 = new com.inmobi.media.C2648oi(this);
        this.T0 = "html";
        this.U0 = new com.inmobi.media.C2385ei(this, context);
        this.V0 = new com.inmobi.media.C2279ai(this);
        this.W0 = new com.inmobi.media.Xh(this);
        java.lang.String TAG = i1;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        toString();
        g1.getClass();
        j1.a();
        this.l0 = this;
        this.p0 = true;
        this.H0 = new com.inmobi.media.Nf();
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(context, this);
        gestureDetector.setOnDoubleTapListener(this);
        gestureDetector.setIsLongpressEnabled(b == 1);
        this.A0 = gestureDetector;
        this.B0 = new com.inmobi.media.Mk(this);
        if (this.n && this.z0 == null) {
            this.z0 = new com.inmobi.media.C2854wc(this);
        }
        if (c2781ti != null) {
            this.e0 = new com.inmobi.media.C2936zi(c2781ti);
        }
        com.inmobi.media.Sh.a(this, interfaceC2772t9);
        if (c2630o0 != null) {
            setAdType(c2630o0.f5363a);
            this.X0 = c2630o0.b;
            this.a0 = c2630o0.c;
            this.m0 = c2630o0.d;
            setCreativeId(c2630o0.e);
            this.n0 = c2630o0.i;
            this.r0 = c2630o0.j;
            this.T0 = c2630o0.g;
            java.lang.String str2 = c2630o0.h;
            if (str2 != null) {
                setAdSize(str2);
            }
            setTelemetryManagerMap(c2630o0.k);
            b(c2630o0.f);
        }
        this.b1 = new com.inmobi.media.C2622ni(this);
        this.c1 = new com.inmobi.media.C2359di(this);
        this.d1 = new com.inmobi.media.C2489ii(this);
        if (getAdConfig().getRendering().getDisableShowCustomView()) {
            wh = new com.inmobi.media.Th(this);
        } else {
            wh = new com.inmobi.media.Wh(this);
        }
        this.e1 = wh;
        if (!this.X0 && !com.inmobi.media.J3.a(context)) {
            mo = new com.inmobi.media.Mo(0, 0, 0, 0);
        } else {
            mo = new com.inmobi.media.Mo(0, 44, 44, 0);
        }
        this.f1 = mo;
    }

    public final void j(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "loadScript " + this);
        }
        loadUrl(str);
    }

    public final void l() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "disableHardwareAcceleration called. " + this);
        }
        try {
            setLayerType(1, null);
        } catch (java.lang.Exception e) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
        }
    }

    public final void f(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "fireStateChange " + this + io.ktor.sse.ServerSentEventKt.SPACE + str);
        }
        h("window.mraidview.broadcastEvent('stateChange','" + str + "');");
    }

    public final void g(java.lang.String json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        if (getAdConfig().getPingV2().getEnabled()) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "handlePing " + this);
            }
            if (this.g0 == null) {
                this.g0 = new com.inmobi.media.C2592mg(this.q, this.e0);
            }
            com.inmobi.media.C2592mg c2592mg = this.g0;
            kotlin.jvm.internal.Intrinsics.checkNotNull(c2592mg);
            c2592mg.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.d, null, null, new com.inmobi.media.C2539kg(c2592mg, json, null), 3, null);
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, "pings v2 is disabled " + this);
        }
        com.inmobi.media.C2936zi c2936zi = this.e0;
        if (c2936zi != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("unknown", "priority");
            java.util.Map a2 = c2936zi.a();
            a2.put("errorCode", (short) 2257);
            a2.put("trigger", "unknown");
            a2.put("retryCount", java.lang.String.valueOf(0));
            com.inmobi.media.AbstractC2724rg.a("PingFailed", a2);
        }
        com.inmobi.media.InterfaceC2513jg interfaceC2513jg = this.q;
        com.inmobi.media.EnumC2347d6[] enumC2347d6Arr = com.inmobi.media.EnumC2347d6.f5154a;
        ((com.inmobi.media.C2568li) interfaceC2513jg).a("", -100, "Ping V2 is disabled from SDK config", java.lang.System.currentTimeMillis(), 0);
    }

    public final void c(java.lang.String str, java.lang.String str2) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "sendTelemetryForAutoRedirectFraud " + this + io.ktor.sse.ServerSentEventKt.SPACE + str + io.ktor.sse.ServerSentEventKt.SPACE + str2);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String creativeId = getCreativeId();
        if (creativeId != null) {
            hashMap.put("creativeId", creativeId);
        }
        hashMap.put("trigger", str);
        java.lang.String impressionId = getImpressionId();
        if (impressionId != null) {
            hashMap.put("impressionId", impressionId);
        }
        hashMap.put("adType", str2);
        a("BlockAutoRedirection", hashMap);
    }

    public final void f(boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "processUseCustomCloseRequest " + this + io.ktor.sse.ServerSentEventKt.SPACE + z);
        }
        setUseCustomClose(z);
        U();
    }

    public final void i() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "completeFromInterActive " + this);
        }
        com.inmobi.media.H4 h4 = this.Y0;
        if (h4 != null) {
            h4.g();
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, "completeFromInterActive");
        }
    }

    public final void c(boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "fireViewableChange " + this + io.ktor.sse.ServerSentEventKt.SPACE + z);
        }
        h("window.mraidview.broadcastEvent('viewableChange'," + z + ");");
    }

    public static final kotlin.Unit c(com.inmobi.media.C2886xi it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.n();
        return kotlin.Unit.INSTANCE;
    }

    public final void a(com.inmobi.media.C2854wc movementGestureDetector, android.view.MotionEvent initialEvent, android.view.MotionEvent endEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(movementGestureDetector, "movementGestureDetector");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialEvent, "initialEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        if (!this.e && getRenderingConfig().getSupportedGestures().contains(4)) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, kotlin.text.StringsKt.trimIndent(" onScaleDetected\n " + initialEvent + " \n " + endEvent));
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            float f = 2;
            jSONArray.put(new org.json.JSONArray((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.inmobi.media.J3.c((endEvent.getX(1) + endEvent.getX()) / f)), java.lang.Integer.valueOf(com.inmobi.media.J3.c((endEvent.getY(1) + endEvent.getY()) / f))})));
            h("window.imraidview.onGestureDetected('4', '" + jSONArray + "');");
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).c(TAG2, "Pinch gesture is disabled from config");
        }
    }

    public final void c(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "evaluateScript " + this);
        }
        evaluateJavascript(str, null);
    }

    @Override // com.inmobi.media.InterfaceC2859wh
    public final boolean c() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "canRedirectExternally Called");
        }
        if (getRenderingConfig().getAutoRedirectionEnforcement()) {
            return getViewTouchTimestamp() != -1 && android.os.SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (r6.equals("html5video") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0119, code lost:
    
        if (r5.C == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011d, code lost:
    
        if (r5.R == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011f, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0120, code lost:
    
        r6 = r5.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0122, code lost:
    
        if (r6 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0124, code lost:
    
        r2 = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "TAG");
        ((com.inmobi.media.C2799u9) r6).c(r2, "HTML5 video supported:" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0114, code lost:
    
        if (r6.equals("inlineVideo") == false) goto L76;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0146 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "supports " + this + io.ktor.sse.ServerSentEventKt.SPACE + str);
        }
        boolean z = false;
        if (str != null) {
            switch (str.hashCode()) {
                case -1886160473:
                    if (str.equals("playVideo")) {
                        return true;
                    }
                    break;
                case -1647691422:
                    break;
                case -988153970:
                    if (str.equals("pingV2")) {
                        com.inmobi.media.core.config.models.AdConfig.PingsV2Config pingV2 = getAdConfig().getPingV2();
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
                        if (interfaceC2772t92 != null) {
                            java.lang.String TAG2 = i1;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, "supports(pingV2) " + pingV2.getEnabled());
                        }
                        return pingV2.getEnabled();
                    }
                    break;
                case -315615134:
                    str.equals("streaming");
                    break;
                case -168584769:
                    if (str.equals("edge-to-edge")) {
                        if (getPlacementType() != 1) {
                            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.i;
                            if (interfaceC2772t93 != null) {
                                java.lang.String TAG3 = i1;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                                ((com.inmobi.media.C2799u9) interfaceC2772t93).b(TAG3, "EDGE_TO_EDGE is only supported for fullscreen ads. supports(edge-to-edge) = false");
                            }
                            return false;
                        }
                        if (this.X0) {
                            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.i;
                            if (interfaceC2772t94 != null) {
                                java.lang.String TAG4 = i1;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                                ((com.inmobi.media.C2799u9) interfaceC2772t94).b(TAG4, "Ad is in Immersive mode. supports(edge-to-edge) = false");
                            }
                            return false;
                        }
                        android.content.Context context = getContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        return com.inmobi.media.J3.a(context);
                    }
                    break;
                case 1137617595:
                    if (str.equals(com.ironsource.X3.i.v)) {
                        return this.X0;
                    }
                    break;
                case 1509574865:
                    break;
                case 1511497695:
                    if (str.equals("hybridVideo") && getAdConfig().getHybridNative().getIsEnabled()) {
                        java.lang.String maxSupportedPlayerVersion = getAdConfig().getHybridNative().getMaxSupportedPlayerVersion();
                        com.inmobi.media.C2936zi c2936zi = this.e0;
                        try {
                            com.inmobi.media.AbstractC2520jn.a(maxSupportedPlayerVersion);
                            return true;
                        } catch (com.inmobi.media.Ag e) {
                            if (c2936zi != null) {
                                c2936zi.a(e.f4603a);
                            }
                        }
                    }
                    return false;
                case 1642189884:
                    if (!str.equals("saveContent")) {
                    }
                    break;
                case 1772979069:
                    str.equals("redirectFraudDetection");
                    break;
            }
        }
        return false;
    }

    public final void c(java.lang.String jsCallbackNamespace, java.lang.String callback, java.lang.String blob) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blob, "blob");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "retrievedBlob");
        }
        a(jsCallbackNamespace, callback + "(" + blob + ");");
    }

    public final void b(float f, float f2) {
        if (!this.o) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "Touch End is disabled via enableTouchEnd API");
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, "onTouchEnd detected");
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            jSONArray.put(com.inmobi.media.J3.c(f));
            jSONArray.put(com.inmobi.media.J3.c(f2));
        } catch (org.json.JSONException e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.i;
            if (interfaceC2772t93 != null) {
                java.lang.String TAG3 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).a(TAG3, "Exception in onTouchEnd", e);
            }
        }
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('10', '" + jSONArray2 + "');");
    }

    public final void c(int i) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "showPodAdAtIndex " + this + io.ktor.sse.ServerSentEventKt.SPACE + i);
        }
        if (this.J == com.inmobi.media.Yn.c && this.n0 != null && !this.N.get()) {
            com.inmobi.media.InterfaceC2842w0 interfaceC2842w0 = this.n0;
            if (interfaceC2842w0 != null) {
                interfaceC2842w0.a(i, this, getFullScreenActivity());
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).b(TAG2, "Cannot show index pod ad as the current ad is not viewable");
        }
        b(false);
    }

    public final void c(org.json.JSONObject jsonObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        if (getLandingPageConfig().getEnableOnLpLifeCycleEvent()) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "onLpLifeCycleEvent " + this);
            }
            h("window.imraid.broadcastEvent('onLpLifeCycleEvent', " + jsonObject + ");");
        }
    }

    public final void c(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi sourceView, java.lang.String targetId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetId, "targetId");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "fireShowWebViewSuccess " + this);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("id", targetId);
        sourceView.h("window.imraidview.broadcastEvent('webViewShown'," + jSONObject + ");");
    }

    public static final com.inmobi.media.Ck b(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        return new com.inmobi.media.Ck(gestureDetectorOnGestureListenerC2675pi.getAdConfig().getRendering().getScrollThrottleInterval());
    }

    @Override // com.inmobi.media.C
    public void b() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "destroyContainer " + this);
        }
        k();
        this.k.b(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.pi$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.a((com.inmobi.media.C2886xi) obj);
            }
        });
        removeAllViews();
        com.inmobi.media.core.config.models.AdConfig.OmidConfig omidConfig = getAdConfig().getViewability().getOmidConfig();
        if (this.p0 && omidConfig.isOmidEnabled()) {
            com.inmobi.media.Jf.f4781a.getClass();
            if (com.iab.omid.library.inmobi.Omid.isActive()) {
                new com.inmobi.media.C2808ui(this, omidConfig.getWebViewRetainTime()).a();
                return;
            }
        }
        super.destroy();
    }

    public final void a(float f, float f2) {
        if (!this.p) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "Touch Begin is disabled via enableTouchBegin API");
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, "onTouchBegin detected");
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            jSONArray.put(com.inmobi.media.J3.c(f));
            jSONArray.put(com.inmobi.media.J3.c(f2));
        } catch (org.json.JSONException e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.i;
            if (interfaceC2772t93 != null) {
                java.lang.String TAG3 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).a(TAG3, "Exception in onTouchBegin", e);
            }
        }
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('9', '" + jSONArray2 + "');");
    }

    public final void e(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "fireDetectAutoRedirectFraud " + this + io.ktor.sse.ServerSentEventKt.SPACE + str);
        }
        h("window.mraidview.fireRedirectFraudBeacon('" + str + "')");
    }

    public final void e(boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "processDisableCloseRegionRequest " + this + io.ktor.sse.ServerSentEventKt.SPACE + z);
        }
        this.K = z;
        U();
    }

    public final void h() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "closeAll " + this);
        }
        com.inmobi.media.InterfaceC2842w0 interfaceC2842w0 = this.n0;
        if (interfaceC2842w0 != null) {
            interfaceC2842w0.b();
        }
        x();
    }

    public final void b(com.inmobi.media.Lf orientation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "handle orientationChange " + this + io.ktor.sse.ServerSentEventKt.SPACE + orientation);
        }
        a(com.inmobi.media.Mf.a(orientation));
    }

    public static final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView, byte[] bArr, com.inmobi.ads.WatermarkData watermarkData) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = renderView.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "adding overlay to renderview");
        }
        android.content.Context context = renderView.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        android.widget.FrameLayout overlayLayout = com.inmobi.media.AbstractC2732ro.a(context, bArr, watermarkData.getAlpha());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overlayLayout, "overlayLayout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (renderView.getParent() != null) {
            android.view.ViewParent parent = renderView.getParent();
            kotlin.jvm.internal.Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).addView(overlayLayout, 0);
        }
        renderView.getViewableAd().a(overlayLayout, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose.NOT_VISIBLE);
        android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = renderView.d0;
        if (onGlobalLayoutListener != null) {
            renderView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            renderView.d0 = null;
        }
    }

    public final void b(java.lang.String str, java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "processMediaPlaybackRequest " + this);
        }
        if (this.P0) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
            if (interfaceC2772t92 != null) {
                java.lang.String TAG2 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(TAG2, "Media playback is not allowed after unload! Ignoring request ...");
                return;
            }
            return;
        }
        if (1 != this.b) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.i;
            if (interfaceC2772t93 != null) {
                java.lang.String TAG3 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).b(TAG3, "Media playback is only supported on full screen ads! Ignoring request ...");
                return;
            }
            return;
        }
        android.app.Activity activity = (android.app.Activity) this.u.get();
        if (activity == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.i;
            if (interfaceC2772t94 != null) {
                java.lang.String TAG4 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t94).b(TAG4, "Media playback is  not allowed before it is visible! Ignoring request ...");
            }
            a(str, "Media playback is  not allowed before it is visible! Ignoring request ...", "playVideo");
            return;
        }
        com.inmobi.media.Ec ec = this.B;
        if (ec != null) {
            ec.a(url, activity);
        }
    }

    public static final kotlin.Unit b(com.inmobi.media.C2886xi it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.n();
        return kotlin.Unit.INSTANCE;
    }

    public final void b(int i) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "loadPodAd " + this);
        }
        if (this.J == com.inmobi.media.Yn.c && this.n0 != null && !this.N.get()) {
            com.inmobi.media.InterfaceC2842w0 interfaceC2842w0 = this.n0;
            if (interfaceC2842w0 != null) {
                interfaceC2842w0.a(i, this);
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).b(TAG2, "Cannot load index pod ad as the current ad is not viewable");
        }
        a(false);
    }

    public final void b(boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "fireNextAdShowComplete " + this);
        }
        java.lang.String str = "window.imraidview.broadcastEvent('adShowSuccess'," + z + ");";
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, str + " Index: " + getCurrentRenderingPodAdIndex());
        }
        h(str);
    }

    public final void b(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "creativeType " + this + io.ktor.sse.ServerSentEventKt.SPACE + str);
        }
        this.G0 = str;
    }

    public final void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "onUserLandingInitialized " + this + " isInAppBrowser: " + this.e);
        }
        h("window.imraid.broadcastEvent('onUserLandingInitialized');");
        if (str2 == null) {
            return;
        }
        a(str2, "broadcastEvent('" + str + "Successful','" + str3 + "');");
    }

    public final void b(org.json.JSONObject jsonObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "onCTLifeCycleEvent " + this);
        }
        h("window.imraid.broadcastEvent('onCTLifeCycleEvent', " + jsonObject + ");");
    }

    public final void b(java.lang.String trackerName, java.util.Map macros) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "fireLandingPageTracker " + this);
        }
        getListener().a(this, trackerName, macros);
    }

    public final void b(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi sourceView, java.lang.String targetId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetId, "targetId");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "fireLoadWebViewSuccess " + this);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("id", targetId);
        com.inmobi.media.C2936zi c2936zi = this.e0;
        jSONObject.put("latency", c2936zi != null ? c2936zi.h : 0L);
        sourceView.h("window.imraidview.broadcastEvent('webViewLoaded', " + jSONObject + ");");
    }

    public final void a(java.lang.String url, java.lang.String templateInfoStr, boolean z) {
        android.app.Activity activity;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(templateInfoStr, "templateInfoStr");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(templateInfoStr);
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "report - " + getAdType() + " type - sdk - " + android.os.Build.VERSION.SDK_INT);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(getAdType(), "int") && android.os.Build.VERSION.SDK_INT >= 29 && (activity = (android.app.Activity) this.u.get()) != null) {
                kotlin.Lazy lazy = com.inmobi.media.E0.f4672a;
                com.inmobi.media.E0.a(activity, this, url, z, jSONObject, this.R0);
            } else {
                kotlin.Lazy lazy2 = com.inmobi.media.E0.f4672a;
                com.inmobi.media.E0.a(this, this, url, z, jSONObject, this.R0);
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
            if (interfaceC2772t92 != null) {
                java.lang.String TAG2 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, "issue wile reporting ad", e);
            }
        }
    }

    public final void a(android.view.MotionEvent motionEvent) {
        com.inmobi.media.C2854wc c2854wc;
        if (this.e && !this.V) {
            this.V = true;
            android.util.SparseArray sparseArray = com.inmobi.ads.rendering.InMobiAdActivity.t;
            g1.getClass();
            org.json.JSONObject jsonObject = com.inmobi.media.Vh.a("IN_CUSTOM_BROWSER", "onInteraction");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = com.inmobi.ads.rendering.InMobiAdActivity.u;
            if (gestureDetectorOnGestureListenerC2675pi != null) {
                gestureDetectorOnGestureListenerC2675pi.c(jsonObject);
            }
        }
        if (this.b == 1 && (c2854wc = this.z0) != null) {
            c2854wc.a(motionEvent);
        }
        this.A0.onTouchEvent(motionEvent);
    }

    public final void a(com.inmobi.media.AbstractC2726ri abstractC2726ri) {
        com.inmobi.ads.WatermarkData watermarkData;
        com.inmobi.media.ads.network.common.model.AdQualityControl adQualityControl;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "initialize " + this);
        }
        int i = android.os.Build.VERSION.SDK_INT;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.T0, "htmlUrl")) {
            getSettings().setMixedContentMode(2);
        }
        N();
        this.x = abstractC2726ri;
        android.view.ViewParent parent = getParent();
        this.w = new java.lang.ref.WeakReference(parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null);
        setBackgroundColor(getRenderingConfig().getWebviewBackgroundColor());
        java.lang.String url = getMraidConfig().getUrl();
        int maxRetries = getMraidConfig().getMaxRetries();
        int retryInterval = getMraidConfig().getRetryInterval();
        long expiry = getMraidConfig().getExpiry();
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        com.inmobi.media.C2905yc c2905yc = new com.inmobi.media.C2905yc(url, maxRetries, retryInterval, expiry, interfaceC2772t92);
        if (url != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.C2880xc(c2905yc, null), 3, null);
        } else if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = c2905yc.f;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).b(TAG2, "MRAID Js Url provided is invalid.");
        }
        setImportantForAccessibility(2);
        setScrollable(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(getAdConfig().getRendering().getEnableDomStorage());
        getSettings().setGeolocationEnabled(true);
        e();
        if (this.e && getAdConfig().getEnableCookiesOnInAppBrowser()) {
            android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
        setWebChromeClient(this.e1);
        if (!this.e) {
            com.inmobi.media.Ca ca = new com.inmobi.media.Ca(this.b, this);
            com.inmobi.media.InterfaceC2772t9 logger = this.i;
            if (logger != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
                ca.c = logger;
            }
            addJavascriptInterface(ca, "sdkController");
        }
        this.B = new com.inmobi.media.Ec(this, this.i);
        this.I0 = new com.inmobi.media.L0(getAdConfig().getAdQuality(), this.i);
        if (i >= 29) {
            android.webkit.WebViewRenderProcessClient c2834vi = new com.inmobi.media.C2834vi(this.i, this.e0);
            java.lang.Object value = com.inmobi.media.AbstractC2740s6.c.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            setWebViewRenderProcessClient((java.util.concurrent.ExecutorService) value, c2834vi);
        }
        com.inmobi.media.C2630o0 c2630o0 = this.l;
        if (c2630o0 != null && (adQualityControl = c2630o0.n) != null) {
            com.inmobi.media.L0 l0 = this.I0;
            if (l0 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
                l0 = null;
            }
            l0.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adQualityControl, "adQualityControl");
            l0.a("adQuality session setup");
            if (!l0.f4808a.getEnabled()) {
                l0.a("config kill switch while setup - false. ad quality will skip");
            } else if (l0.c.get()) {
                l0.a("session already started. skip");
            } else {
                l0.a("verifying control flags");
                java.lang.String beacon = adQualityControl.getBeacon();
                if (beacon != null && beacon.length() == 0) {
                    l0.a("no beacon received. aborting...");
                    kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.E0.e;
                    if (coroutineScope != null) {
                        kotlinx.coroutines.CoroutineScopeKt.cancel(coroutineScope, new java.util.concurrent.CancellationException("Shutdown"));
                    }
                    com.inmobi.media.E0.e = null;
                    l0.a("session end - cleanup");
                    l0.g = null;
                    l0.f.clear();
                    l0.c.set(false);
                    l0.d.set(false);
                    l0.a("ad quality session is already in progress. skipping...");
                } else {
                    l0.g = adQualityControl;
                }
            }
        }
        com.inmobi.media.C2630o0 c2630o02 = this.l;
        if (c2630o02 != null && (watermarkData = c2630o02.m) != null) {
            setWatermark(watermarkData);
        }
        com.inmobi.media.C2630o0 c2630o03 = this.l;
        if (c2630o03 == null || !kotlin.jvm.internal.Intrinsics.areEqual(c2630o03.l, java.lang.Boolean.TRUE)) {
            return;
        }
        l();
    }

    public final void k(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.inmobi.media.C2936zi c2936zi = this.e0;
        if (c2936zi != null) {
            c2936zi.b();
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "loadUrlInWebView " + this);
        }
        this.Q = false;
        if (this.N.get()) {
            return;
        }
        loadUrl(url);
    }

    public final void a(android.widget.RelativeLayout adView) {
        com.inmobi.media.Gf gf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "adBackgroundView");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("HtmlVideoPlayer", "inflateVideoPlayer " + this);
        }
        com.inmobi.media.C2926z8 c2926z8 = this.Z0;
        if (c2926z8 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "parentView");
            if (c2926z8.g.get()) {
                return;
            }
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = c2926z8.c;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b("HybridVideoPlayerHandler", "Inflate called");
            }
            if (c2926z8.i && (gf = c2926z8.p) != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "parentView");
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = gf.g;
                if (interfaceC2772t93 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Gf", "TAG");
                    ((com.inmobi.media.C2799u9) interfaceC2772t93).c("Gf", "startOmidSession");
                }
                com.inmobi.media.Ie ie = gf.e;
                if (ie != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "adView");
                    if (ie.c == null) {
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = ie.b;
                        if (interfaceC2772t94 != null) {
                            ((com.inmobi.media.C2799u9) interfaceC2772t94).a(com.inmobi.media.AbstractC2367e1.f, "Failed to registerAdView. adSession is null");
                        }
                    } else {
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t95 = ie.b;
                        if (interfaceC2772t95 != null) {
                            ((com.inmobi.media.C2799u9) interfaceC2772t95).a(com.inmobi.media.AbstractC2367e1.f, "registerAdView");
                        }
                        com.inmobi.media.T4.a(ie.f5167a, new com.inmobi.media.Y0(ie, adView, null));
                    }
                }
                com.inmobi.media.Ie ie2 = gf.e;
                if (ie2 != null) {
                    if (ie2.c == null) {
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t96 = ie2.b;
                        if (interfaceC2772t96 != null) {
                            ((com.inmobi.media.C2799u9) interfaceC2772t96).a(com.inmobi.media.AbstractC2367e1.f, "Failed to startAdSession. adSession is null");
                        }
                    } else {
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t97 = ie2.b;
                        if (interfaceC2772t97 != null) {
                            ((com.inmobi.media.C2799u9) interfaceC2772t97).a(com.inmobi.media.AbstractC2367e1.f, "startAdSession");
                        }
                        com.inmobi.media.T4.a(ie2.f5167a, new com.inmobi.media.C2288b1(ie2, null));
                    }
                }
            }
            c2926z8.k.a(adView);
            c2926z8.k.e();
            c2926z8.o = true;
        }
    }

    public final void a(com.inmobi.media.EnumC2771t8 enumC2771t8, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            obj = "'" + obj + "'";
        }
        java.lang.String str = "window.imraid.broadcastEvent('" + enumC2771t8.f5461a + "', " + obj + ");";
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b(TAG, "fireHtmlVideoEvents: " + str);
        }
        h(str);
    }

    public final void a(java.util.HashMap params) {
        com.inmobi.media.Gf gf;
        com.inmobi.media.Ie ie;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        getListener().a(params);
        com.inmobi.media.C2926z8 c2926z8 = this.Z0;
        if (c2926z8 == null || (gf = c2926z8.p) == null || (ie = gf.e) == null) {
            return;
        }
        ie.a(com.iab.omid.library.inmobi.adsession.media.InteractionType.CLICK);
    }

    public static final kotlin.Unit a(org.json.JSONObject jsonObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "it");
        android.util.SparseArray sparseArray = com.inmobi.ads.rendering.InMobiAdActivity.t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = com.inmobi.ads.rendering.InMobiAdActivity.u;
        if (gestureDetectorOnGestureListenerC2675pi != null) {
            gestureDetectorOnGestureListenerC2675pi.c(jsonObject);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(java.lang.String trackerName, java.util.Map macros) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
        android.util.SparseArray sparseArray = com.inmobi.ads.rendering.InMobiAdActivity.t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = com.inmobi.ads.rendering.InMobiAdActivity.u;
        if (gestureDetectorOnGestureListenerC2675pi != null) {
            gestureDetectorOnGestureListenerC2675pi.b(trackerName, macros);
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "initContextualData " + this);
        }
        this.Y0 = new com.inmobi.media.H4(ad != null ? ad.getContextData() : null, this.a0);
    }

    public static final kotlin.Unit a(com.inmobi.media.C2886xi it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.b();
        return kotlin.Unit.INSTANCE;
    }

    public final void a(java.lang.String url, boolean z) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        if (!z) {
            k(url);
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "loadHtmlUrl: prefetching URL content before WebView load");
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.inmobi.media.C2936zi c2936zi = this.e0;
        if (c2936zi != null) {
            java.util.Map a2 = c2936zi.a();
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("HtmlUrlPrefetchStarted", a2, com.inmobi.media.EnumC2728rk.f5431a);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.C2438gi(url, this, elapsedRealtime, null), 3, null);
        this.z = launch$default;
    }

    @Override // com.inmobi.media.InterfaceC2859wh
    public final void a(java.lang.String mraidApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mraidApi, "mraidApi");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "sendFraudBeaconAndTelemetryEvent " + this);
        }
        e(mraidApi);
        java.lang.String adType = getAdType();
        if (adType == null) {
            adType = "banner";
        }
        c(mraidApi, adType);
    }

    public final void a(boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "fireNextAdLoadComplete " + this);
        }
        java.lang.String str = "window.imraidview.broadcastEvent('adLoadSuccess'," + z + ");";
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.i;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).c(TAG2, str + " Index: " + getCurrentRenderingPodAdIndex());
        }
        h(str);
    }

    public final void a(int i, int i2) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "fireSizeChanged " + this + " w-" + i + " h-" + i2);
        }
        h("window.mraidview.broadcastEvent('sizeChange'," + i + "," + i2 + ");");
    }

    public final void a(int i) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "fireOrientationChange " + this + io.ktor.sse.ServerSentEventKt.SPACE + i);
        }
        h("window.imraid.broadcastEvent('orientationChange','" + i + "');");
    }

    public final void a(java.lang.String str, org.json.JSONObject message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "fireError " + this + " - " + message);
        }
        h("window.imraidview.broadcastEvent('error','" + message + "', '" + str + "');");
        d(message);
    }

    public final void a(java.lang.String str, java.lang.String message, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "fireError " + this + " - " + message + " - " + str2);
        }
        if (str == null || str2 == null) {
            return;
        }
        a(str, "broadcastEvent('error',\"" + message + "\", \"" + str2 + "\")");
    }

    public final void a(java.lang.String str, java.lang.String callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "fireJavaScriptCallback " + this);
        }
        if (str == null) {
            return;
        }
        h(str + "." + callback);
    }

    public final void a(java.lang.String str, java.util.HashMap hashMap) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "processTelemetryEvent " + this);
        }
        getListener().a(str, hashMap);
    }

    public void a(com.inmobi.media.Nf orientationProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "setOrientationProperties " + this);
        }
        this.H0 = orientationProperties;
        Y();
    }

    public static final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        gestureDetectorOnGestureListenerC2675pi.getListener().j(gestureDetectorOnGestureListenerC2675pi);
    }

    @Override // com.inmobi.media.Of
    public final void a(com.inmobi.media.Lf orientation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "onOrientationUpdate " + this);
        }
    }

    public final void a(com.inmobi.media.Lf orientation, com.inmobi.media.No no) {
        org.json.JSONObject jSONObject;
        com.inmobi.media.Mo mo;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "fireOnSafeAreaChanged " + this);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(no, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
        try {
            no.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
            mo = (com.inmobi.media.Mo) no.f4863a.get(orientation);
        } catch (java.lang.Exception unused) {
        }
        if (mo != null) {
            jSONObject = mo.a();
            jSONObject.put("orientation", com.inmobi.media.Mf.a(orientation));
            h("window.imraid.broadcastEvent('onSafeAreaChange', " + jSONObject + ")");
        }
        jSONObject = null;
        h("window.imraid.broadcastEvent('onSafeAreaChange', " + jSONObject + ")");
    }

    @Override // com.inmobi.media.AbstractC2920z2
    public final com.inmobi.media.C2325cb d() {
        com.inmobi.media.C2457hb c2457hb;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.inmobi.media.C2816v0 c2816v0;
        java.lang.String str4;
        com.inmobi.media.C2816v0 c2816v02;
        java.lang.String str5;
        com.inmobi.media.C2816v0 c2816v03;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "initLandingPageHandler " + this);
        }
        boolean z = this.e;
        java.lang.String str6 = this.f;
        boolean cctEnabled = getAdConfig().getCctEnabled();
        boolean partialTabsEnabled = getAdConfig().getPartialTabsEnabled();
        com.inmobi.media.C2781ti c2781ti = this.h;
        com.inmobi.media.C2352db c2352db = new com.inmobi.media.C2352db(z, str6, cctEnabled, partialTabsEnabled, c2781ti != null ? c2781ti.m : null);
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        com.inmobi.media.C2279ai c2279ai = this.V0;
        com.inmobi.media.C2385ei c2385ei = this.U0;
        if (this.e) {
            c2457hb = null;
        } else {
            com.inmobi.media.C2781ti c2781ti2 = this.h;
            long j = (c2781ti2 == null || (c2816v03 = c2781ti2.f5469a) == null) ? 0L : c2816v03.f5497a;
            java.lang.String impressionId = getImpressionId();
            java.lang.String str7 = impressionId == null ? "" : impressionId;
            com.inmobi.media.C2781ti c2781ti3 = this.h;
            c2457hb = new com.inmobi.media.C2457hb(j, str7, (c2781ti3 == null || (c2816v02 = c2781ti3.f5469a) == null || (str5 = c2816v02.f) == null) ? "" : str5, (c2781ti3 == null || (c2816v0 = c2781ti3.f5469a) == null || (str4 = c2816v0.e) == null) ? "" : str4, (c2781ti3 == null || (str3 = c2781ti3.b) == null) ? "" : str3, (c2781ti3 == null || (str2 = c2781ti3.f) == null) ? "" : str2, (c2781ti3 == null || (str = c2781ti3.d) == null) ? "" : str, c2781ti3 != null ? c2781ti3.h : false, this.f);
        }
        return new com.inmobi.media.C2325cb(context, c2352db, c2279ai, c2385ei, this, c2457hb, this.i, new java.lang.ref.WeakReference(this));
    }

    public final void d(org.json.JSONObject jSONObject) {
        short s;
        final java.lang.String optString = jSONObject.optString("errorCode");
        java.lang.Object a2 = com.inmobi.media.L3.a(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.pi$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Short.valueOf(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.m(optString));
            }
        });
        if (kotlin.Result.m10805isSuccessimpl(a2)) {
            short shortValue = ((java.lang.Number) a2).shortValue();
            com.inmobi.media.C2936zi c2936zi = this.e0;
            if (c2936zi != null) {
                java.util.Map a3 = c2936zi.a();
                switch (shortValue) {
                    case 101:
                        s = 2261;
                        break;
                    case 102:
                        s = 2262;
                        break;
                    case 103:
                        s = 2263;
                        break;
                    case 104:
                        s = 2267;
                        break;
                    case 105:
                        s = 2266;
                        break;
                    case 106:
                        s = 2265;
                        break;
                    case 107:
                        s = 2264;
                        break;
                    default:
                        switch (shortValue) {
                            case MRAID_ERROR_VALUE:
                                s = 2268;
                                break;
                            case INVALID_IFA_STATUS_VALUE:
                                s = 2269;
                                break;
                            case 303:
                                s = 2270;
                                break;
                            case 304:
                                s = 2271;
                                break;
                            case MRAID_BRIDGE_ERROR_VALUE:
                                s = 2272;
                                break;
                            case 306:
                                s = 2273;
                                break;
                            case 307:
                                s = 2274;
                                break;
                            case 308:
                                s = 2275;
                                break;
                            case ASSET_FAILED_TO_DELETE_VALUE:
                                s = 2276;
                                break;
                            case AD_HTML_FAILED_TO_LOAD_VALUE:
                                s = 2277;
                                break;
                            case MRAID_JS_CALL_EMPTY_VALUE:
                                s = 2278;
                                break;
                            case DEEPLINK_OPEN_FAILED_VALUE:
                                s = 2280;
                                break;
                            case EVALUATE_JAVASCRIPT_FAILED_VALUE:
                                s = 2281;
                                break;
                            default:
                                s = shortValue;
                                break;
                        }
                }
                a3.put("errorCode", java.lang.Short.valueOf(s));
                long j = c2936zi.c;
                kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
                a3.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j));
                com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("CompanionWebViewLoadFailed", a3, com.inmobi.media.EnumC2728rk.f5431a);
            }
        }
    }

    public static final void d(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, java.lang.String str) {
        try {
            if (gestureDetectorOnGestureListenerC2675pi.N.get()) {
                return;
            }
            java.lang.String str2 = "javascript:try{" + str + "}catch(e){}";
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = gestureDetectorOnGestureListenerC2675pi.i;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "Injecting javascript");
            }
            gestureDetectorOnGestureListenerC2675pi.c(str2);
        } catch (java.lang.Exception e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = gestureDetectorOnGestureListenerC2675pi.i;
            if (interfaceC2772t92 != null) {
                java.lang.String TAG2 = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(TAG2, "SDK encountered an unexpected error injecting JavaScript in the Ad container; " + e.getMessage());
            }
        }
    }

    public final void d(java.lang.String errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.P0) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "fireAdFailed " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        this.D0 = true;
        com.inmobi.media.C2936zi c2936zi = this.e0;
        if (c2936zi != null) {
            java.util.Map a2 = c2936zi.a();
            long j = c2936zi.c;
            kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
            a2.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j));
            java.lang.String a3 = c2936zi.a("FireAdFailed");
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b(a3, a2, com.inmobi.media.EnumC2728rk.f5431a);
        }
        getListener().a(this, errorCode);
    }

    public static java.lang.String d(int i) {
        return "SDK_" + i;
    }

    public final boolean a(android.webkit.JsResult jsResult) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "shouldRenderPopup " + this);
        }
        if (getRenderingConfig().getShouldRenderPopup()) {
            return true;
        }
        jsResult.cancel();
        w();
        return false;
    }

    @Override // com.inmobi.media.InterfaceC2859wh
    public final boolean a() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "hasUserInteracted " + getViewTouchTimestamp() + io.ktor.sse.ServerSentEventKt.SPACE + getRenderingConfig().getUserTouchResetTime());
        }
        if (!getRenderingConfig().getAutoRedirectionEnforcement() || this.m0) {
            return true;
        }
        return getViewTouchTimestamp() != -1 && android.os.SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
    }

    public final void a(java.lang.Exception e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "handlePingException " + this, e);
        }
        com.inmobi.media.InterfaceC2513jg interfaceC2513jg = this.q;
        com.inmobi.media.EnumC2347d6[] enumC2347d6Arr = com.inmobi.media.EnumC2347d6.f5154a;
        ((com.inmobi.media.C2568li) interfaceC2513jg).a("", androidx.media3.common.PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED, "Ping exception occurred", java.lang.System.currentTimeMillis(), 0);
        kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
        com.inmobi.media.AbstractC2665p9.a(e);
    }

    public static final kotlin.Unit a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = gestureDetectorOnGestureListenerC2675pi.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "onRenderProcessGone");
        }
        gestureDetectorOnGestureListenerC2675pi.getListener().a(gestureDetectorOnGestureListenerC2675pi, z);
        return kotlin.Unit.INSTANCE;
    }

    public final void a(boolean z, short s) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "fireRenderProcessGoneTelemetry");
        }
        com.inmobi.media.C2936zi c2936zi = this.e0;
        if (c2936zi != null) {
            c2936zi.a(z, s);
        }
    }

    public final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi sourceView, java.lang.String targetId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetId, "targetId");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.i;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(TAG, "fireDestroyWebViewSuccess " + this);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("id", targetId);
        sourceView.h("window.imraidview.broadcastEvent('destroyWebView'," + jSONObject + ");");
    }
}
