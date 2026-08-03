package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Bo {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.InterfaceC2772t9 f4632a;
    public final java.util.concurrent.ConcurrentHashMap b = new java.util.concurrent.ConcurrentHashMap();

    public Bo(com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        this.f4632a = interfaceC2772t9;
    }

    public final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, java.lang.String str) {
        this.b.put(str, gestureDetectorOnGestureListenerC2675pi);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4632a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("SiblingWebViewManager", "Registered bridge for WebView ID: " + str);
        }
    }

    public final void b(kotlin.jvm.functions.Function1 action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.b;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) entry.getValue()) instanceof com.inmobi.media.C2886xi) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) ((java.util.Map.Entry) it.next()).getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(gestureDetectorOnGestureListenerC2675pi, "null cannot be cast to non-null type com.inmobi.ads.containers.companions.RenderViewSibling");
            action.invoke((com.inmobi.media.C2886xi) gestureDetectorOnGestureListenerC2675pi);
        }
    }

    public final void a(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        this.b.remove(id);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4632a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("SiblingWebViewManager", "Unregistered bridge for WebView ID: " + id);
        }
    }

    public final void a(kotlin.jvm.functions.Function1 action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) this.b.get(com.unity3d.ads.BuildConfig.FLAVOR);
        if (gestureDetectorOnGestureListenerC2675pi != null) {
            action.invoke(gestureDetectorOnGestureListenerC2675pi);
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.b;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(entry.getKey(), com.unity3d.ads.BuildConfig.FLAVOR)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) ((java.util.Map.Entry) it.next()).getValue());
        }
    }

    public final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a(com.inmobi.media.Qi route, android.content.Context context, short s, com.inmobi.media.C2630o0 adMetaData, com.inmobi.media.core.config.models.AdConfig adConfig) {
        com.inmobi.media.Qi qi;
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi c2886xi;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "route");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adMetaData, "adMetaData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        if (s == 0) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4632a;
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("SiblingWebViewManager", "Creating standard WebView with ID: " + route.b);
            }
            c2886xi = new com.inmobi.media.GestureDetectorOnGestureListenerC2675pi(context, adMetaData.o, adMetaData.p, adMetaData.q, adMetaData.r, 0L, adMetaData.s, adMetaData.t, route, this, adMetaData, adConfig, 80);
            qi = route;
        } else if (s == 1) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f4632a;
            qi = route;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a("SiblingWebViewManager", "Creating Sibling WebView with ID: " + qi.b);
            }
            c2886xi = new com.inmobi.media.C2886xi(context, adMetaData.o, adMetaData.t, com.inmobi.media.C2630o0.a(adMetaData, null, 4194047), this, route, adConfig);
        } else {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.f4632a;
            if (interfaceC2772t93 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t93).b("SiblingWebViewManager", "Unsupported WebView type: " + ((int) s));
            }
            throw new java.lang.IllegalArgumentException("Unsupported WebView type: " + ((int) s));
        }
        a(c2886xi, qi.b);
        return c2886xi;
    }
}
