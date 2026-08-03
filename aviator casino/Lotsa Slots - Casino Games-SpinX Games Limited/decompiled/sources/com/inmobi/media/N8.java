package com.inmobi.media;

/* loaded from: classes5.dex */
public final class N8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.WeakHashMap f4850a;
    public final java.util.WeakHashMap b;
    public final com.inmobi.media.X7 c;
    public final java.lang.String d;
    public final android.os.Handler e;
    public final com.inmobi.media.M8 f;
    public final long g;
    public final com.inmobi.media.C2741s7 h;

    public N8(com.inmobi.media.core.config.models.AdConfig.ViewabilityConfig viewabilityConfig, com.inmobi.media.X7 visibilityTracker, com.inmobi.media.C2741s7 listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewabilityConfig, "viewabilityConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibilityTracker, "visibilityTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        java.util.WeakHashMap weakHashMap = new java.util.WeakHashMap();
        java.util.WeakHashMap weakHashMap2 = new java.util.WeakHashMap();
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f4850a = weakHashMap;
        this.b = weakHashMap2;
        this.c = visibilityTracker;
        this.d = "N8";
        this.g = viewabilityConfig.getImpressionPollIntervalMillis();
        com.inmobi.media.K8 k8 = new com.inmobi.media.K8(this);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = visibilityTracker.d;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        visibilityTracker.h = k8;
        this.e = handler;
        this.f = new com.inmobi.media.M8(this);
        this.h = listener;
    }

    public final void a(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        this.f4850a.remove(view);
        this.b.remove(view);
        this.c.a(view);
    }
}
