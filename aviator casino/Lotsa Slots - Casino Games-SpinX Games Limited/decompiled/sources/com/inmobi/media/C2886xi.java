package com.inmobi.media;

/* renamed from: com.inmobi.media.xi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2886xi extends com.inmobi.media.GestureDetectorOnGestureListenerC2675pi {
    public final byte k1;
    public final com.inmobi.media.C2799u9 l1;
    public final java.lang.String m1;
    public final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi n1;
    public final com.inmobi.media.C2860wi o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2886xi(android.content.Context context, byte b, com.inmobi.media.C2799u9 c2799u9, com.inmobi.media.C2630o0 adMetaData, com.inmobi.media.Bo webViewFactory, com.inmobi.media.Qi route, com.inmobi.media.core.config.models.AdConfig adConfig) {
        super(context, b, null, null, adMetaData.r, 0L, adMetaData.s, c2799u9, route, webViewFactory, adMetaData, adConfig, 92);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adMetaData, "adMetaData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "route");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        this.k1 = b;
        this.l1 = c2799u9;
        this.m1 = "RenderViewSibling - " + route.b;
        webViewFactory.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.unity3d.ads.BuildConfig.FLAVOR, "id");
        this.n1 = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) webViewFactory.b.get(com.unity3d.ads.BuildConfig.FLAVOR);
        this.o1 = new com.inmobi.media.C2860wi(this, webViewFactory, route);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi getAdRenderView() {
        com.inmobi.media.C2799u9 c2799u9;
        if (this.n1 == null && (c2799u9 = this.l1) != null) {
            c2799u9.b(this.m1, "Ad RenderView not found for id: " + getRoute().b);
        }
        return this.n1;
    }

    private static /* synthetic */ void getOverrideListener$annotations() {
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2675pi
    public final void C() {
    }

    public final void Z() {
        java.util.Map<android.view.View, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose> friendlyViews;
        com.inmobi.media.C2799u9 c2799u9 = this.l1;
        if (c2799u9 != null) {
            c2799u9.a(this.m1, "initialize RenderViewSibling");
        }
        a(this.o1);
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adRenderView = getAdRenderView();
        setContextualDataHandler(adRenderView != null ? adRenderView.getContextualDataHandler() : null);
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adRenderView2 = getAdRenderView();
        setEmbeddedBrowserJsCallbacks(adRenderView2 != null ? adRenderView2.getEmbeddedBrowserJsCallbacks() : null);
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adRenderView3 = getAdRenderView();
        if (adRenderView3 == null || (friendlyViews = adRenderView3.getFriendlyViews()) == null) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<android.view.View, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose> entry : friendlyViews.entrySet()) {
            if (!(entry.getKey() instanceof com.inmobi.media.C2886xi)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        com.inmobi.media.C2799u9 c2799u92 = this.l1;
        if (c2799u92 != null) {
            c2799u92.a(this.m1, "Setting friendly views from adRenderView: " + linkedHashMap);
        }
        setFriendlyViews(kotlin.collections.MapsKt.toMutableMap(linkedHashMap));
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2675pi
    public final void a(com.inmobi.media.Nf orientationProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        com.inmobi.media.C2799u9 c2799u9 = this.l1;
        if (c2799u9 != null) {
            c2799u9.a(this.m1, "setOrientationProperties " + this);
        }
        setOrientationProperties(orientationProperties);
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2675pi, com.inmobi.media.C
    public final void b() {
        k();
        removeAllViews();
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "null cannot be cast to non-null type android.webkit.WebView");
        destroy();
    }

    public final com.inmobi.media.InterfaceC2772t9 getLogger() {
        return this.l1;
    }

    public final byte getMPlacementType() {
        return this.k1;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2675pi, com.inmobi.media.C
    public com.inmobi.media.Wn getViewableAd() {
        if (getMViewableAd() == null) {
            setMViewableAd(new com.inmobi.media.K9(this, this, new com.inmobi.media.C2797u7(getImpressionType(), getMCreativeType(), getMImpressionMinTimeViewed(), getMImpressionMinPercentageViewed(), getAdConfig().getViewability().getCompanionVisibilityMinPercentageViewed(), this.l1), this.l1));
        }
        com.inmobi.media.Wn mViewableAd = getMViewableAd();
        kotlin.jvm.internal.Intrinsics.checkNotNull(mViewableAd);
        return mViewableAd;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2675pi
    public final void n() {
        com.inmobi.media.C2799u9 c2799u9 = this.l1;
        if (c2799u9 != null) {
            c2799u9.a(this.m1, "dismissCurrentViewContainer " + this);
        }
        com.inmobi.media.Ec mediaProcessor = getMediaProcessor();
        if (mediaProcessor != null) {
            com.inmobi.media.C2668pc c2668pc = mediaProcessor.c;
            if (c2668pc != null) {
                c2668pc.b();
            }
            mediaProcessor.c = null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.webkit.Profile.DEFAULT_PROFILE_NAME, getViewState())) {
            setAndUpdateViewState("Hidden");
        }
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2675pi, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.inmobi.media.Bo webViewFactory = getWebViewFactory();
        java.lang.String id = getRoute().f4920a;
        webViewFactory.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) webViewFactory.b.get(id);
        if (gestureDetectorOnGestureListenerC2675pi != null) {
            c(gestureDetectorOnGestureListenerC2675pi, getRoute().b);
            return;
        }
        com.inmobi.media.C2799u9 c2799u9 = this.l1;
        if (c2799u9 != null) {
            c2799u9.b(this.m1, "Not able to give show success as the source view is not present");
        }
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2675pi
    public final void u() {
    }
}
