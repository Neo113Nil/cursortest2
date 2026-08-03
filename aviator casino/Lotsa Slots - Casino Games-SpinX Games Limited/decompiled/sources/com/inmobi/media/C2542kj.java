package com.inmobi.media;

/* renamed from: com.inmobi.media.kj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2542kj {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.Bo f5297a;
    public final com.inmobi.media.InterfaceC2772t9 b;

    public C2542kj(com.inmobi.media.Bo wvFactory, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wvFactory, "wvFactory");
        this.f5297a = wvFactory;
        this.b = interfaceC2772t9;
    }

    public final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a() {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a(com.unity3d.ads.BuildConfig.FLAVOR);
        if (a2 != null) {
            return a2;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kj", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("kj", "AdRenderView is null, cannot initialize webview.");
        }
        return null;
    }

    public final void b(java.lang.String sourceId, java.lang.String targetId) {
        java.lang.Object obj;
        java.lang.Integer a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetId, "targetId");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kj", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("kj", "showWebView " + this);
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a3 = a(sourceId);
        if (a3 == null) {
            return;
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a4 = a(targetId);
        if (a4 == null) {
            kotlin.Lazy lazy = com.inmobi.media.Gi.f4728a;
            org.json.JSONObject a5 = com.inmobi.media.AbstractC2516jj.a(targetId, "targetViewId", "id", targetId);
            a5.put("errorCode", 304);
            a3.a("showWebView", a5);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(targetId, com.unity3d.ads.BuildConfig.FLAVOR)) {
            a(a3, targetId, "showWebView");
            return;
        }
        if (!(a4 instanceof com.inmobi.media.C2886xi)) {
            kotlin.Lazy lazy2 = com.inmobi.media.Gi.f4728a;
            org.json.JSONObject a6 = com.inmobi.media.AbstractC2516jj.a(targetId, "targetViewId", "id", targetId);
            a6.put("errorCode", com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE);
            a3.a("showWebView", a6);
            return;
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a7 = a();
        if (a7 != null && !a7.isAttachedToWindow()) {
            kotlin.Lazy lazy3 = com.inmobi.media.Gi.f4728a;
            org.json.JSONObject a8 = com.inmobi.media.AbstractC2516jj.a(targetId, "targetViewId", "id", targetId);
            a8.put("errorCode", com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE);
            a3.a("showWebView", a8);
            return;
        }
        java.lang.Integer a9 = a4.getWvStateMachine().a(5);
        if (a9 != null) {
            int intValue = a9.intValue();
            kotlin.Lazy lazy4 = com.inmobi.media.Gi.f4728a;
            org.json.JSONObject a10 = com.inmobi.media.AbstractC2516jj.a(targetId, "targetViewId", "id", targetId);
            a10.put("errorCode", intValue);
            a3.a("showWebView", a10);
            return;
        }
        java.util.Iterator it = kotlin.collections.MapsKt.toMap(this.f5297a.b).values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) obj;
            if (gestureDetectorOnGestureListenerC2675pi.getWvStateMachine().b == 105 && !kotlin.jvm.internal.Intrinsics.areEqual(gestureDetectorOnGestureListenerC2675pi, a4) && !kotlin.jvm.internal.Intrinsics.areEqual(gestureDetectorOnGestureListenerC2675pi.getRoute().b, com.unity3d.ads.BuildConfig.FLAVOR)) {
                break;
            }
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) obj;
        if (gestureDetectorOnGestureListenerC2675pi2 != null && (a2 = gestureDetectorOnGestureListenerC2675pi2.getWvStateMachine().a(7)) != null) {
            int intValue2 = a2.intValue();
            kotlin.Lazy lazy5 = com.inmobi.media.Gi.f4728a;
            org.json.JSONObject a11 = com.inmobi.media.AbstractC2516jj.a(targetId, "targetViewId", "id", targetId);
            a11.put("errorCode", intValue2);
            a3.a("showWebView", a11);
        }
        com.inmobi.media.C2886xi c2886xi = (com.inmobi.media.C2886xi) a4;
        if (c2886xi.isAttachedToWindow()) {
            a(a4, a3, targetId);
            return;
        }
        a(a3, c2886xi);
        a(a4);
        com.inmobi.media.Wn viewableAd = c2886xi.getViewableAd();
        java.util.Map<android.view.View, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose> friendlyViews = a4.getFriendlyViews();
        if (friendlyViews == null) {
            friendlyViews = new java.util.HashMap<>();
        }
        viewableAd.a(friendlyViews);
    }

    public final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a(java.lang.String id) {
        com.inmobi.media.Bo bo = this.f5297a;
        bo.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) bo.b.get(id);
        if (gestureDetectorOnGestureListenerC2675pi != null) {
            return gestureDetectorOnGestureListenerC2675pi;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 == null) {
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kj", "TAG");
        ((com.inmobi.media.C2799u9) interfaceC2772t9).b("kj", "View with ID: " + id + " not found.");
        return null;
    }

    public final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, com.inmobi.media.C2886xi c2886xi) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kj", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("kj", "setUpLayoutForAd " + this);
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a();
        android.content.Context containerContext = a2 != null ? a2.getContainerContext() : null;
        if (containerContext == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.b;
            if (interfaceC2772t92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kj", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b("kj", "Context is null, cannot initialize webview.");
            }
            containerContext = null;
        }
        if (containerContext == null) {
            return;
        }
        if (!(containerContext instanceof com.inmobi.ads.rendering.InMobiAdActivity)) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.b;
            if (interfaceC2772t93 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kj", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).b("kj", "Context is not an instance of InMobiAdActivity.");
            }
            a(gestureDetectorOnGestureListenerC2675pi, c2886xi.getRoute().b, "loadWebView");
            return;
        }
        c2886xi.setFullScreenActivityContext((android.app.Activity) containerContext);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.b;
        if (interfaceC2772t94 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kj", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t94).a("kj", "target View's Viewable ad - " + c2886xi.getViewableAd());
        }
        android.view.View c = c2886xi.getViewableAd().c();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((com.inmobi.ads.rendering.InMobiAdActivity) containerContext).findViewById(65534);
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(context);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        if ((c != null ? c.getParent() : null) != null) {
            android.view.ViewParent parent = c.getParent();
            android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(c);
            }
        }
        relativeLayout.addView(c, layoutParams2);
        viewGroup.addView(relativeLayout, layoutParams);
        c2886xi.a(relativeLayout);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t95 = this.b;
        if (interfaceC2772t95 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kj", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t95).a("kj", "Target View added - the inflatedView is - " + c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewGroup] */
    public final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        com.inmobi.media.Wn viewableAd;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kj", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("kj", "Add renderViewSibling as friendlyView for omsdkTracking  " + this);
        }
        android.view.ViewParent parent = gestureDetectorOnGestureListenerC2675pi.getParent();
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (gestureDetectorOnGestureListenerC2675pi2 != null) {
            gestureDetectorOnGestureListenerC2675pi = gestureDetectorOnGestureListenerC2675pi2;
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a();
        if (a2 == null || (viewableAd = a2.getViewableAd()) == null) {
            return;
        }
        viewableAd.a(gestureDetectorOnGestureListenerC2675pi, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose.OTHER);
    }

    public final void a(java.lang.String sourceId, java.lang.String targetId, java.lang.String html) {
        android.content.Context context;
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetId, "targetId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(html, "html");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kj", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("kj", "loadWebView " + this);
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a3 = a();
        android.content.Context containerContext = a3 != null ? a3.getContainerContext() : null;
        if (containerContext == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.b;
            if (interfaceC2772t92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kj", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b("kj", "Context is null, cannot initialize webview.");
            }
            context = null;
        } else {
            context = containerContext;
        }
        if (context == null || (a2 = a(sourceId)) == null) {
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(targetId, com.unity3d.ads.BuildConfig.FLAVOR)) {
            a(a2, targetId, "loadWebView");
            return;
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a4 = a();
        if (a4 == null) {
            a2.a("loadWebView", com.inmobi.media.Gi.a(targetId, 304));
            return;
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a5 = a(targetId);
        if (a5 != null) {
            int i = a5.getWvStateMachine().b;
            kotlin.Lazy lazy = com.inmobi.media.Gi.f4728a;
            org.json.JSONObject a6 = com.inmobi.media.AbstractC2516jj.a(targetId, "targetViewId", "id", targetId);
            a6.put("errorCode", i);
            a2.a("loadWebView", a6);
            return;
        }
        com.inmobi.media.C2886xi a7 = a(a4, targetId, this, a2, context, android.os.SystemClock.elapsedRealtime());
        if (a7 != null) {
            a7.i(html);
        }
    }

    public static final com.inmobi.media.C2886xi a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, java.lang.String str, com.inmobi.media.C2542kj c2542kj, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2, android.content.Context context, long j) {
        com.inmobi.media.C2630o0 c2630o0;
        com.inmobi.media.C2630o0 c2630o02;
        com.inmobi.media.C2781ti c2781ti;
        com.inmobi.media.C2630o0 adMetaData = gestureDetectorOnGestureListenerC2675pi.getAdMetaData();
        if (adMetaData != null) {
            com.inmobi.media.C2781ti c2781ti2 = gestureDetectorOnGestureListenerC2675pi.getAdMetaData().s;
            if (c2781ti2 != null) {
                com.inmobi.media.C2816v0 placement = c2781ti2.f5469a;
                java.lang.String markupType = c2781ti2.b;
                java.lang.String impressionId = c2781ti2.c;
                java.lang.String telemetryMetadataBlob = c2781ti2.d;
                int i = c2781ti2.e;
                java.lang.String creativeType = c2781ti2.f;
                java.lang.String creativeId = c2781ti2.g;
                boolean z = c2781ti2.h;
                int i2 = c2781ti2.i;
                com.inmobi.media.C2684q1 c2684q1 = c2781ti2.j;
                com.inmobi.media.C2911yi c2911yi = c2781ti2.k;
                com.inmobi.media.ads.network.common.model.InlineParams inlineParams = c2781ti2.m;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markupType, "markupType");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionId, "impressionId");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryMetadataBlob, "telemetryMetadataBlob");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creativeType, "creativeType");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creativeId, "creativeId");
                c2630o02 = adMetaData;
                c2781ti = new com.inmobi.media.C2781ti(placement, markupType, impressionId, telemetryMetadataBlob, i, creativeType, creativeId, z, i2, c2684q1, c2911yi, str, inlineParams);
            } else {
                c2630o02 = adMetaData;
                c2781ti = null;
            }
            c2630o0 = com.inmobi.media.C2630o0.a(c2630o02, c2781ti, 3665663);
        } else {
            c2630o0 = null;
        }
        if (c2630o0 == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = c2542kj.b;
            if (interfaceC2772t9 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kj", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("kj", "AdMetaData is null, cannot initialize webview.");
            }
            return null;
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = c2542kj.f5297a.a(new com.inmobi.media.Qi(gestureDetectorOnGestureListenerC2675pi2.getRoute().b, str), context, (short) 1, c2630o0, gestureDetectorOnGestureListenerC2675pi.getAdConfig());
        com.inmobi.media.C2886xi c2886xi = a2 instanceof com.inmobi.media.C2886xi ? (com.inmobi.media.C2886xi) a2 : null;
        if (c2886xi == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = c2542kj.b;
            if (interfaceC2772t92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kj", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b("kj", "Failed to create Sibling WebView with ID: " + str);
            }
            gestureDetectorOnGestureListenerC2675pi2.a("loadWebView", com.inmobi.media.Gi.a(str, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE));
            return null;
        }
        java.lang.Integer a3 = c2886xi.getWvStateMachine().a(1);
        if (a3 != null) {
            gestureDetectorOnGestureListenerC2675pi2.a("loadWebView", com.inmobi.media.Gi.a(str, a3.intValue()));
        }
        c2886xi.Z();
        com.inmobi.media.C2936zi renderViewTelemetry = c2886xi.getRenderViewTelemetry();
        if (renderViewTelemetry != null) {
            renderViewTelemetry.b = j;
        }
        return c2886xi;
    }

    public final void a(java.lang.String sourceId, java.lang.String targetId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetId, "targetId");
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a(sourceId);
        if (a2 == null) {
            return;
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a3 = a(targetId);
        if (a3 == null) {
            kotlin.Lazy lazy = com.inmobi.media.Gi.f4728a;
            org.json.JSONObject a4 = com.inmobi.media.AbstractC2516jj.a(targetId, "targetViewId", "id", targetId);
            a4.put("errorCode", 304);
            a2.a("destroyWebView", a4);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(targetId, com.unity3d.ads.BuildConfig.FLAVOR)) {
            a(a2, targetId, "destroyWebView");
            return;
        }
        java.lang.Integer a5 = a3.getWvStateMachine().a(8);
        if (a5 != null) {
            int intValue = a5.intValue();
            kotlin.Lazy lazy2 = com.inmobi.media.Gi.f4728a;
            org.json.JSONObject a6 = com.inmobi.media.AbstractC2516jj.a(targetId, "targetViewId", "id", targetId);
            a6.put("errorCode", intValue);
            a2.a("destroyWebView", a6);
            return;
        }
        a3.b();
        a2.a(a2, targetId);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kj", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("kj", "WebView with ID: " + targetId + " removed from parent.");
        }
    }

    public final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, java.lang.String str, java.lang.String str2) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kj", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("kj", "Cannot perform operations on default WebView with ID: " + str);
        }
        gestureDetectorOnGestureListenerC2675pi.a(str2, com.inmobi.media.Gi.a(str, 303));
    }

    public final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2, java.lang.String str) {
        android.view.ViewParent parent = gestureDetectorOnGestureListenerC2675pi.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            viewGroup = gestureDetectorOnGestureListenerC2675pi;
        }
        android.view.ViewParent parent2 = viewGroup.getParent();
        android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
        if (viewGroup2 == null) {
            gestureDetectorOnGestureListenerC2675pi2.a("showWebView", com.inmobi.media.Gi.a(str, 307));
            return;
        }
        if (viewGroup2.indexOfChild(viewGroup) != -1) {
            viewGroup2.bringChildToFront(viewGroup);
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
            if (interfaceC2772t9 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kj", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("kj", "Sibling view brought to front: " + gestureDetectorOnGestureListenerC2675pi);
            }
        } else {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.b;
            if (interfaceC2772t92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kj", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b("kj", "Sibling view not found in parent: " + gestureDetectorOnGestureListenerC2675pi);
            }
        }
        gestureDetectorOnGestureListenerC2675pi2.c(gestureDetectorOnGestureListenerC2675pi2, str);
    }

    public final void b(java.lang.String sourceId, java.lang.String targetId, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetId, "targetId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a(sourceId);
        if (a2 == null) {
            return;
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a3 = a(targetId);
        if (a3 == null) {
            kotlin.Lazy lazy = com.inmobi.media.Gi.f4728a;
            org.json.JSONObject a4 = com.inmobi.media.AbstractC2516jj.a(targetId, "targetViewId", "id", targetId);
            a4.put("errorCode", 304);
            a2.a(com.ironsource.C3023e8.j, a4);
            return;
        }
        int i = a3.getWvStateMachine().b;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(a3.getRoute().b, com.unity3d.ads.BuildConfig.FLAVOR) && kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{101, 104, 107}).contains(java.lang.Integer.valueOf(i))) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
            if (interfaceC2772t9 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kj", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("kj", "WebView is not in state to receive messages: " + targetId);
            }
            int i2 = a3.getWvStateMachine().b;
            kotlin.Lazy lazy2 = com.inmobi.media.Gi.f4728a;
            org.json.JSONObject a5 = com.inmobi.media.AbstractC2516jj.a(targetId, "targetViewId", "id", targetId);
            a5.put("errorCode", i2);
            a2.a(com.ironsource.C3023e8.j, a5);
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.b;
        if (interfaceC2772t92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("kj", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a("kj", "Sending message to WebView ID: " + targetId);
        }
        a3.h(message);
    }
}
