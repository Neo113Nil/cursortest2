package com.inmobi.media;

/* renamed from: com.inmobi.media.wi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2860wi extends com.inmobi.media.AbstractC2726ri {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2886xi f5531a;
    public final /* synthetic */ com.inmobi.media.Bo b;
    public final /* synthetic */ com.inmobi.media.Qi c;

    public C2860wi(com.inmobi.media.C2886xi c2886xi, com.inmobi.media.Bo bo, com.inmobi.media.Qi qi) {
        this.f5531a = c2886xi;
        this.b = bo;
        this.c = qi;
    }

    public static final void a(com.inmobi.media.Bo bo, com.inmobi.media.Qi qi, com.inmobi.media.C2886xi c2886xi, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        java.lang.String id = qi.f4920a;
        bo.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) bo.b.get(id);
        if (gestureDetectorOnGestureListenerC2675pi2 == null) {
            com.inmobi.media.InterfaceC2772t9 logger = c2886xi.getLogger();
            if (logger != null) {
                ((com.inmobi.media.C2799u9) logger).b(c2886xi.m1, "Source RenderView not found for id: " + qi.f4920a);
                return;
            }
            return;
        }
        java.lang.Integer a2 = gestureDetectorOnGestureListenerC2675pi.getWvStateMachine().a(3);
        if (a2 != null) {
            int intValue = a2.intValue();
            com.inmobi.media.InterfaceC2772t9 logger2 = c2886xi.getLogger();
            if (logger2 != null) {
                ((com.inmobi.media.C2799u9) logger2).b(c2886xi.m1, "Failed to transition to FIRE_AD_FAILED state: " + intValue);
            }
            gestureDetectorOnGestureListenerC2675pi2.a("loadWebView", com.inmobi.media.Gi.a(gestureDetectorOnGestureListenerC2675pi.getRoute().b, intValue));
        }
    }

    public static final void b(com.inmobi.media.Bo bo, com.inmobi.media.Qi qi, com.inmobi.media.C2886xi c2886xi, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        java.lang.String id = qi.f4920a;
        bo.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) bo.b.get(id);
        if (gestureDetectorOnGestureListenerC2675pi2 == null) {
            com.inmobi.media.InterfaceC2772t9 logger = c2886xi.getLogger();
            if (logger != null) {
                ((com.inmobi.media.C2799u9) logger).b(c2886xi.m1, "Source RenderView not found for id: " + qi.f4920a);
                return;
            }
            return;
        }
        java.lang.Integer a2 = gestureDetectorOnGestureListenerC2675pi.getWvStateMachine().a(2);
        if (a2 == null) {
            c2886xi.b(gestureDetectorOnGestureListenerC2675pi2, qi.b);
            return;
        }
        int intValue = a2.intValue();
        com.inmobi.media.InterfaceC2772t9 logger2 = c2886xi.getLogger();
        if (logger2 != null) {
            ((com.inmobi.media.C2799u9) logger2).b(c2886xi.m1, "Failed to transition to FIRE_AD_READY state: " + intValue);
        }
        gestureDetectorOnGestureListenerC2675pi2.a("loadWebView", com.inmobi.media.Gi.a(gestureDetectorOnGestureListenerC2675pi.getRoute().b, intValue));
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void c() {
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void e(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adRenderView;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        adRenderView = this.f5531a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().e(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void f(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void g(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void h(final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        kotlin.Lazy lazy = com.inmobi.media.AbstractC2740s6.f5441a;
        com.inmobi.media.ExecutorC2378ec executorC2378ec = (com.inmobi.media.ExecutorC2378ec) com.inmobi.media.AbstractC2740s6.e.getValue();
        final com.inmobi.media.Bo bo = this.b;
        final com.inmobi.media.Qi qi = this.c;
        final com.inmobi.media.C2886xi c2886xi = this.f5531a;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.wi$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C2860wi.b(com.inmobi.media.Bo.this, qi, c2886xi, renderView);
            }
        };
        executorC2378ec.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC2378ec.f5177a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void i(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void j(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adRenderView;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        adRenderView = this.f5531a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().j(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView, final boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.ExecutorC2378ec executorC2378ec = (com.inmobi.media.ExecutorC2378ec) com.inmobi.media.AbstractC2740s6.e.getValue();
        final com.inmobi.media.C2886xi c2886xi = this.f5531a;
        final com.inmobi.media.Qi qi = this.c;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.wi$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C2860wi.a(com.inmobi.media.C2886xi.this, qi, z);
            }
        };
        executorC2378ec.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC2378ec.f5177a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void b(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adRenderView;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        adRenderView = this.f5531a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().b(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void a(com.inmobi.media.C2888xk telemetryOnAdImpression) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adRenderView;
        com.inmobi.media.AbstractC2726ri listener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryOnAdImpression, "telemetryOnAdImpression");
        adRenderView = this.f5531a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(telemetryOnAdImpression);
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void a(final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView, java.lang.String errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        kotlin.Lazy lazy = com.inmobi.media.AbstractC2740s6.f5441a;
        com.inmobi.media.ExecutorC2378ec executorC2378ec = (com.inmobi.media.ExecutorC2378ec) com.inmobi.media.AbstractC2740s6.e.getValue();
        final com.inmobi.media.Bo bo = this.b;
        final com.inmobi.media.Qi qi = this.c;
        final com.inmobi.media.C2886xi c2886xi = this.f5531a;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.wi$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C2860wi.a(com.inmobi.media.Bo.this, qi, c2886xi, renderView);
            }
        };
        executorC2378ec.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC2378ec.f5177a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void a(java.util.HashMap params) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adRenderView;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        adRenderView = this.f5531a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.a(params);
        }
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void a(java.lang.String eventType, java.util.HashMap kv) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adRenderView;
        com.inmobi.media.AbstractC2726ri listener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kv, "kv");
        adRenderView = this.f5531a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(eventType, kv);
    }

    @Override // com.inmobi.media.AbstractC2726ri, com.inmobi.media.InterfaceC2729rl
    public final void a() {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adRenderView;
        com.inmobi.media.AbstractC2726ri listener;
        adRenderView = this.f5531a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a();
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView, java.lang.String trackerName, java.util.Map macros) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adRenderView;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
        adRenderView = this.f5531a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, trackerName, macros);
        }
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void a(com.inmobi.media.V1 audioStatusInternal) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adRenderView;
        com.inmobi.media.AbstractC2726ri listener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        adRenderView = this.f5531a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(audioStatusInternal);
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void a(boolean z) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adRenderView;
        com.inmobi.media.AbstractC2726ri listener;
        adRenderView = this.f5531a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(z);
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final void a(java.lang.String data) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adRenderView;
        com.inmobi.media.AbstractC2726ri listener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        adRenderView = this.f5531a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(data);
    }

    public static final void a(com.inmobi.media.C2886xi c2886xi, com.inmobi.media.Qi qi, boolean z) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adRenderView;
        if (c2886xi.getWvStateMachine().a(4) != null) {
            c2886xi.a("loadWebView", com.inmobi.media.Gi.a(qi.b, 307));
        }
        adRenderView = c2886xi.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, z);
        }
    }
}
