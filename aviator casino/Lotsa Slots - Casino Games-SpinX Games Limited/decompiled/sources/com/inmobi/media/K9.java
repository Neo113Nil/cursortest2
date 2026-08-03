package com.inmobi.media;

/* loaded from: classes5.dex */
public final class K9 extends com.inmobi.media.Wn {
    public final com.inmobi.media.C2886xi d;
    public final com.inmobi.media.C2797u7 e;
    public final com.inmobi.media.C2799u9 f;
    public final java.lang.String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K9(com.inmobi.media.C2886xi container, com.inmobi.media.C2886xi renderView, com.inmobi.media.C2797u7 htmlAdTracker, com.inmobi.media.C2799u9 c2799u9) {
        super(container);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "container");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlAdTracker, "htmlAdTracker");
        this.d = renderView;
        this.e = htmlAdTracker;
        this.f = c2799u9;
        this.g = "K9";
    }

    @Override // com.inmobi.media.Wn
    public final void a(java.util.Map map) {
        android.view.View b;
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String tag = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag, "tag");
            c2799u9.a(tag, "startTrackingForImpression with " + (map != null ? java.lang.Integer.valueOf(map.size()) : null) + " friendly views");
        }
        this.d.setFriendlyViews(map);
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            java.lang.String tag2 = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag2, "tag");
            c2799u92.a(tag2, "startTrackingVisibility");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f5039a;
        com.inmobi.media.C2886xi c2886xi = gestureDetectorOnGestureListenerC2675pi instanceof com.inmobi.media.C2886xi ? (com.inmobi.media.C2886xi) gestureDetectorOnGestureListenerC2675pi : null;
        if (c2886xi == null) {
            return;
        }
        com.inmobi.media.C2797u7 c2797u7 = this.e;
        android.view.View b2 = b();
        if (b2 == null || (b = b()) == null) {
            return;
        }
        c2797u7.a(b2, b, c2886xi.getVISIBILITY_CHANGE_LISTENER(), this.c.getViewability(), true);
    }

    @Override // com.inmobi.media.Wn
    public final android.view.View c() {
        this.b = new java.lang.ref.WeakReference(this.d);
        return this.d;
    }

    @Override // com.inmobi.media.Wn
    public final void d() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String tag = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag, "tag");
            c2799u9.a(tag, "stopTrackingForImpression");
        }
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            java.lang.String tag2 = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag2, "tag");
            c2799u92.a(tag2, "stopTrackingForVisibility");
        }
        com.inmobi.media.C2797u7 c2797u7 = this.e;
        android.view.View b = b();
        if (b == null) {
            return;
        }
        c2797u7.b(b);
    }

    @Override // com.inmobi.media.Wn
    public final void a(android.view.View childView, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childView, "childView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String tag = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag, "tag");
            c2799u9.a(tag, "addFriendlyView - childView: " + childView + ", obstructionCode: " + obstructionCode);
        }
        java.util.Map<android.view.View, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose> friendlyViews = this.d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(childView, obstructionCode);
        }
        com.inmobi.media.U exposureTracker = this.d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(childView);
        }
    }

    @Override // com.inmobi.media.Wn
    public final void a(android.view.View childView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childView, "childView");
        java.util.Map<android.view.View, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose> friendlyViews = this.d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.remove(childView);
        }
        com.inmobi.media.U exposureTracker = this.d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(childView);
        }
    }

    @Override // com.inmobi.media.Wn
    public final void a(android.content.Context context, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String tag = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag, "tag");
            c2799u9.a(tag, "onActivityStateChanged - state - " + ((int) b));
        }
        try {
            if (b == 0) {
                this.e.a();
                return;
            }
            if (b == 1) {
                com.inmobi.media.C2797u7 c2797u7 = this.e;
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = c2797u7.f;
                if (interfaceC2772t9 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).c("HtmlAdTracker", "onActivityStopped");
                }
                com.inmobi.media.N8 n8 = c2797u7.g;
                if (n8 != null) {
                    java.lang.String TAG = n8.d;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    n8.c.a();
                    n8.e.removeCallbacksAndMessages(null);
                    n8.b.clear();
                }
                com.inmobi.media.X7 x7 = c2797u7.h;
                if (x7 != null) {
                    x7.e();
                    return;
                }
                return;
            }
            if (b == 2) {
                com.inmobi.media.C2797u7 c2797u72 = this.e;
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = c2797u72.f;
                if (interfaceC2772t92 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t92).c("HtmlAdTracker", "onActivityDestroyed");
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
                return;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(this.g, "tag");
        } catch (java.lang.Exception e) {
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                java.lang.String tag2 = this.g;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag2, "tag");
                c2799u92.b(tag2, "Exception in onActivityStateChanged with message : " + e.getMessage());
            }
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
        }
    }

    @Override // com.inmobi.media.Wn
    public final void a() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String tag = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag, "tag");
            c2799u9.a(tag, "destroy");
        }
        if (b() != null) {
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                java.lang.String tag2 = this.g;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag2, "tag");
                c2799u92.a(tag2, "stopTrackingForVisibility");
            }
            com.inmobi.media.C2797u7 c2797u7 = this.e;
            android.view.View b = b();
            if (b != null) {
                c2797u7.b(b);
            }
        }
        java.lang.ref.WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
    }
}
