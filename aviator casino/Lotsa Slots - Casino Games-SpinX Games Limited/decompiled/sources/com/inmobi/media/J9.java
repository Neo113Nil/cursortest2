package com.inmobi.media;

/* loaded from: classes5.dex */
public final class J9 extends com.inmobi.media.Wn {
    public final com.inmobi.media.Xn d;
    public final com.inmobi.media.C2797u7 e;
    public final com.inmobi.media.InterfaceC2772t9 f;
    public final java.lang.String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J9(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi container, com.inmobi.media.Xn mViewableAd, com.inmobi.media.C2797u7 htmlAdTracker, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        super(container);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "container");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mViewableAd, "mViewableAd");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlAdTracker, "htmlAdTracker");
        this.d = mViewableAd;
        this.e = htmlAdTracker;
        this.f = interfaceC2772t9;
        this.g = "J9";
    }

    @Override // com.inmobi.media.Wn
    public final void a(java.util.Map map) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "startTrackingForImpression with " + (map != null ? java.lang.Integer.valueOf(map.size()) : null) + " friendly views");
        }
        android.view.View view = this.d.b();
        if (view != null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f;
            if (interfaceC2772t92 != null) {
                java.lang.String TAG2 = this.g;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, "start tracking");
            }
            com.inmobi.media.core.config.models.AdConfig.ViewabilityConfig viewabilityConfig = this.c.getViewability();
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f5039a;
            kotlin.jvm.internal.Intrinsics.checkNotNull(gestureDetectorOnGestureListenerC2675pi, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            gestureDetectorOnGestureListenerC2675pi.setFriendlyViews(map);
            com.inmobi.media.C2797u7 c2797u7 = this.e;
            c2797u7.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "token");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewabilityConfig, "viewabilityConfig");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = c2797u7.f;
            if (interfaceC2772t93 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t93).c("HtmlAdTracker", "startTrackingForImpression");
            }
            if (c2797u7.f5482a == 0) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = c2797u7.f;
                if (interfaceC2772t94 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t94).b("HtmlAdTracker", "impression type is loaded. return");
                }
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(c2797u7.b, "video") || kotlin.jvm.internal.Intrinsics.areEqual(c2797u7.b, "audio")) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t95 = c2797u7.f;
                if (interfaceC2772t95 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t95).b("HtmlAdTracker", "creative type is video and audio. return");
                }
            } else {
                com.inmobi.media.N8 a2 = c2797u7.a(c2797u7.f5482a, viewabilityConfig);
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t96 = c2797u7.f;
                if (interfaceC2772t96 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t96).c("HtmlAdTracker", "impression tracker add view");
                }
                int i = c2797u7.d;
                int i2 = c2797u7.c;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "token");
                com.inmobi.media.L8 l8 = (com.inmobi.media.L8) a2.f4850a.get(view);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(l8 != null ? l8.f4813a : null, view)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
                    a2.f4850a.remove(view);
                    a2.b.remove(view);
                    a2.c.a(view);
                    a2.f4850a.put(view, new com.inmobi.media.L8(view, i, i2));
                    com.inmobi.media.X7 x7 = a2.c;
                    x7.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
                    x7.a(view, view, view, i);
                }
            }
            this.e.a(view, view, gestureDetectorOnGestureListenerC2675pi.getVISIBILITY_CHANGE_LISTENER(), viewabilityConfig, false);
            this.d.getClass();
        }
    }

    @Override // com.inmobi.media.Wn
    public final android.view.View b() {
        return this.d.b();
    }

    @Override // com.inmobi.media.Wn
    public final android.view.View c() {
        return this.d.c();
    }

    @Override // com.inmobi.media.Wn
    public final void d() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "stopTrackingForImpression");
        }
        android.view.View b = this.d.b();
        if (b != null) {
            this.e.a(b);
            this.d.getClass();
        }
    }

    @Override // com.inmobi.media.Wn
    public final void a(android.view.View childView, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childView, "childView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
        if (childView instanceof com.inmobi.media.C2886xi) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
            if (interfaceC2772t9 != null) {
                java.lang.String TAG = this.g;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "Ignoring RenderViewSibling as friendly view");
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f;
        if (interfaceC2772t92 != null) {
            java.lang.String TAG2 = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(TAG2, "Adding friendly view: " + childView.getClass().getSimpleName() + " with obstruction code: " + obstructionCode);
        }
        this.d.a(childView, obstructionCode);
    }

    @Override // com.inmobi.media.Wn
    public final void a(android.view.View childView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childView, "childView");
        if (childView instanceof com.inmobi.media.C2886xi) {
            return;
        }
        this.d.a(childView);
    }

    @Override // com.inmobi.media.Wn
    public final void a(android.content.Context context, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "onActivityStateChanged - state - " + ((int) b));
        }
        try {
            if (b == 0) {
                this.e.a();
            } else if (b == 1) {
                com.inmobi.media.C2797u7 c2797u7 = this.e;
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = c2797u7.f;
                if (interfaceC2772t92 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t92).c("HtmlAdTracker", "onActivityStopped");
                }
                com.inmobi.media.N8 n8 = c2797u7.g;
                if (n8 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n8.d, "TAG");
                    n8.c.a();
                    n8.e.removeCallbacksAndMessages(null);
                    n8.b.clear();
                }
                com.inmobi.media.X7 x7 = c2797u7.h;
                if (x7 != null) {
                    x7.e();
                }
            } else if (b == 2) {
                com.inmobi.media.C2797u7 c2797u72 = this.e;
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = c2797u72.f;
                if (interfaceC2772t93 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t93).c("HtmlAdTracker", "onActivityDestroyed");
                }
                com.inmobi.media.N8 n82 = c2797u72.g;
                if (n82 != null) {
                    n82.f4850a.clear();
                    n82.b.clear();
                    n82.c.a();
                    n82.e.removeMessages(0);
                    n82.c.b();
                }
                c2797u72.g = null;
                com.inmobi.media.X7 x72 = c2797u72.h;
                if (x72 != null) {
                    x72.b();
                }
                c2797u72.h = null;
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(this.g, "TAG");
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.f;
            if (interfaceC2772t94 != null) {
                java.lang.String TAG2 = this.g;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t94).b(TAG2, "Exception in onActivityStateChanged with message : " + e.getMessage());
            }
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(e));
        } finally {
            this.d.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Override // com.inmobi.media.Wn
    public final void a() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            java.lang.String TAG = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(TAG, "destroy");
        }
        android.view.View b = this.d.b();
        if (b != null) {
            this.e.a(b);
            this.e.b(b);
        }
        java.lang.ref.WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
        java.lang.ref.WeakReference weakReference2 = this.d.b;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
    }
}
