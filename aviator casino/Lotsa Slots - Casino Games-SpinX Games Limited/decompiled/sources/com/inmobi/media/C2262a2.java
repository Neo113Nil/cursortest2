package com.inmobi.media;

/* renamed from: com.inmobi.media.a2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2262a2 extends com.inmobi.media.AbstractC2551l1 implements android.app.Application.ActivityLifecycleCallbacks {
    public final java.lang.String F;
    public final java.lang.String G;
    public boolean H;
    public int I;
    public final com.inmobi.media.C2289b2 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2262a2(android.content.Context context, com.inmobi.media.C2816v0 placement, com.inmobi.media.Uk uk) {
        super(context, placement, uk);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        this.F = "a2";
        this.G = "InMobi";
        this.J = new com.inmobi.media.C2289b2();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("a2", "TAG");
        long j = placement.f5497a;
        a(context, placement, uk);
    }

    public static final void a(com.inmobi.media.C2262a2 c2262a2, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, int i) {
        int indexOf = c2262a2.h.indexOf(gestureDetectorOnGestureListenerC2675pi);
        try {
            com.inmobi.media.AbstractC2421g1 n = c2262a2.n();
            com.inmobi.media.C2799u9 c2799u9 = c2262a2.i;
            if (c2799u9 != null) {
                java.lang.String TAG = c2262a2.F;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c2799u9.c(TAG, "callback onShowNextPodAd");
            }
            if (n != null) {
                n.a(i, indexOf, gestureDetectorOnGestureListenerC2675pi);
            }
        } catch (java.lang.Exception unused) {
            c2262a2.b(indexOf, false);
            c2262a2.e(indexOf);
        }
    }

    public static final void b(com.inmobi.media.C2262a2 c2262a2) {
        try {
            if (c2262a2.b == 7) {
                int i = c2262a2.I - 1;
                c2262a2.I = i;
                if (i == 0) {
                    c2262a2.c((byte) 6);
                    com.inmobi.media.AbstractC2421g1 n = c2262a2.n();
                    if (n != null) {
                        n.a();
                    }
                }
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.C2799u9 c2799u9 = c2262a2.i;
            if (c2799u9 != null) {
                java.lang.String TAG = c2262a2.F;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c2799u9.b(TAG, "BannerAdUnit.onAdScreenDismissed threw unexpected error: " + e.getMessage());
            }
        }
    }

    public static final void c(com.inmobi.media.C2262a2 c2262a2) {
        try {
            if (c2262a2.b != 6) {
                if (c2262a2.b == 7) {
                    c2262a2.I++;
                    return;
                }
                return;
            }
            c2262a2.I++;
            c2262a2.c((byte) 7);
            com.inmobi.media.C2799u9 c2799u9 = c2262a2.i;
            if (c2799u9 != null) {
                java.lang.String TAG = c2262a2.F;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c2799u9.d(TAG, "AdUnit " + c2262a2 + " state - ACTIVE");
            }
            com.inmobi.media.C2799u9 c2799u92 = c2262a2.i;
            if (c2799u92 != null) {
                c2799u92.c(c2262a2.G, "Successfully displayed banner ad for placement Id : " + c2262a2.l);
            }
            com.inmobi.media.AbstractC2421g1 n = c2262a2.n();
            if (n != null) {
                c2262a2.a(n);
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.C2799u9 c2799u93 = c2262a2.i;
            if (c2799u93 != null) {
                java.lang.String TAG2 = c2262a2.F;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c2799u93.b(TAG2, "BannerAdUnit.onAdScreenDisplayed threw unexpected error: " + e.getMessage());
            }
        }
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final void D() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "load " + this);
        }
        if (W()) {
            super.D();
        }
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final boolean F() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 == null) {
            return false;
        }
        java.lang.String TAG = this.F;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        c2799u9.c(TAG, "missingPrerequisitesForAd " + this);
        return false;
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final void G() {
        com.inmobi.media.AbstractC2421g1 n;
        super.G();
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            c2799u9.c(this.G, "Banner ad fetch successful for placement id: " + this.l);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(t(), "html") && !kotlin.jvm.internal.Intrinsics.areEqual(t(), "htmlUrl")) {
            a(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 57);
        }
        if (this.b != 2 || (n = n()) == null) {
            return;
        }
        c(n);
    }

    public boolean W() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "canProceedToLoad " + this);
        }
        F();
        if (1 == this.b || 2 == this.b) {
            com.inmobi.media.Sb.a((byte) 1, this.G, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                java.lang.String TAG2 = this.F;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c2799u92.b(TAG2, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            }
            if (1 == this.b) {
                b((short) 2008);
            } else {
                b((short) 2011);
            }
            return false;
        }
        if (7 != this.b) {
            com.inmobi.media.C2799u9 c2799u93 = this.i;
            if (c2799u93 != null) {
                c2799u93.c(this.G, "Fetching a Banner ad for placement id: " + this.l);
            }
            E();
            return true;
        }
        b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
        com.inmobi.media.C2799u9 c2799u94 = this.i;
        if (c2799u94 != null) {
            java.lang.String TAG3 = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            c2799u94.b(TAG3, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.l.f5497a);
        }
        return false;
    }

    public final void X() {
        com.inmobi.media.Wn viewableAd;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "onPause " + this);
        }
        byte b = this.b;
        if (b == 4 || b == 6 || b == 7) {
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi j = j();
            android.content.Context o = o();
            if (j == null || o == null || (viewableAd = j.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(o, (byte) 1);
        }
    }

    public final void Y() {
        com.inmobi.media.Wn viewableAd;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "onResume " + this);
        }
        byte b = this.b;
        if (b == 4 || b == 6 || b == 7) {
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi j = j();
            android.content.Context o = o();
            if (j == null || o == null || (viewableAd = j.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(o, (byte) 0);
        }
    }

    public final void Z() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "registerLifeCycleCallbacks " + this);
        }
        android.content.Context o = o();
        if (o != null) {
            com.inmobi.media.Xi.a(o, this);
        }
    }

    public final void a0() {
        com.inmobi.media.core.config.models.AdConfig adConfig;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.l.f, "AB") && (adConfig = this.c) != null && adConfig.getSkipNetCheckHB()) {
            com.inmobi.media.C2799u9 c2799u9 = this.i;
            if (c2799u9 != null) {
                java.lang.String TAG = this.F;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c2799u9.a(TAG, "renderAd without internet check");
            }
            b0();
            return;
        }
        com.inmobi.media.C2799u9 c2799u92 = this.i;
        if (c2799u92 != null) {
            java.lang.String TAG2 = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c2799u92.a(TAG2, "renderAd");
        }
        a(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.a2$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.C2262a2.e(com.inmobi.media.C2262a2.this);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.a2$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.C2262a2.a(com.inmobi.media.C2262a2.this, (com.inmobi.media.EnumC2372e6) obj);
            }
        });
    }

    public final void b0() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "renderAdPostInternetCheck");
        }
        try {
            if (N()) {
                return;
            }
            com.inmobi.media.C2709r1 c2709r1 = this.z;
            c2709r1.getClass();
            c2709r1.g = android.os.SystemClock.elapsedRealtime();
            android.os.Handler handler = this.j;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.inmobi.media.a2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.inmobi.media.C2262a2.f(com.inmobi.media.C2262a2.this);
                    }
                });
            }
        } catch (java.lang.IllegalStateException e) {
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                java.lang.String TAG2 = this.F;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c2799u92.a(TAG2, "Exception while loading ad.", e);
            }
            b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    public final void c0() {
        android.app.Application application;
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "unregisterLifeCycleCallbacks " + this);
        }
        android.content.Context o = o();
        android.app.Activity activity = o instanceof android.app.Activity ? (android.app.Activity) o : null;
        if (activity == null || (application = activity.getApplication()) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final void d() {
        this.J.f5113a = false;
        super.d();
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final synchronized void e(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "onAdScreenDismissed " + this);
        }
        super.e(renderView);
        android.os.Handler handler = this.j;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.inmobi.media.a2$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.C2262a2.b(com.inmobi.media.C2262a2.this);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public final synchronized void f(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "onAdScreenDisplayed " + this);
        }
        super.f(renderView);
        android.os.Handler handler = this.j;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.inmobi.media.a2$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.C2262a2.c(com.inmobi.media.C2262a2.this);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final void i() {
        if (this.h.isEmpty()) {
            return;
        }
        if (this.s) {
            java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.firstOrNull(this.r);
            if (num != null) {
                com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) kotlin.collections.CollectionsKt.getOrNull(this.h, num.intValue());
                if (kotlin.jvm.internal.Intrinsics.areEqual(gestureDetectorOnGestureListenerC2675pi != null ? gestureDetectorOnGestureListenerC2675pi.getMarkupType() : null, "htmlUrl")) {
                    b(gestureDetectorOnGestureListenerC2675pi, com.inmobi.media.AbstractC2551l1.p(gestureDetectorOnGestureListenerC2675pi));
                    gestureDetectorOnGestureListenerC2675pi.g();
                    return;
                }
                return;
            }
            return;
        }
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            if (!this.r.contains(java.lang.Integer.valueOf(i))) {
                com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) this.h.get(i);
                if (kotlin.jvm.internal.Intrinsics.areEqual(gestureDetectorOnGestureListenerC2675pi2 != null ? gestureDetectorOnGestureListenerC2675pi2.getMarkupType() : null, "htmlUrl")) {
                    b(gestureDetectorOnGestureListenerC2675pi2, com.inmobi.media.AbstractC2551l1.p(gestureDetectorOnGestureListenerC2675pi2));
                    gestureDetectorOnGestureListenerC2675pi2.g();
                }
            }
        }
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final java.util.HashMap l() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "adSpecificRequestParams getter " + this);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("u-rt", this.H ? "1" : "0");
        hashMap.put("mk-ad-slot", this.l.h);
        return hashMap;
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public java.lang.String m() {
        return "banner";
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final void o(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        int indexOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (this.s && (indexOf = this.h.indexOf(renderView)) > this.p && renderView.J != com.inmobi.media.Yn.c) {
            this.r.remove(java.lang.Integer.valueOf(indexOf));
        } else {
            V();
            super.o(renderView);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "onActivityCreated " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "onActivityDestroyed " + this);
        }
        android.content.Context o = o();
        if (kotlin.jvm.internal.Intrinsics.areEqual(o, activity)) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(o, "null cannot be cast to non-null type android.app.Activity");
            ((android.app.Activity) o).getApplication().unregisterActivityLifecycleCallbacks(this);
            d();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "onActivityPaused " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "onActivityResumed " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "outState");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "onActivitySaveInstanceState " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "onActivityStarted " + this);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(o(), activity)) {
            Y();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "onActivityStopped " + this);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(o(), activity)) {
            X();
        }
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi r() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "htmlAdContainer getter " + this);
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (this.h.size() <= 0 || this.p >= this.h.size()) ? null : (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) this.h.get(this.p);
        if (this.l.j && gestureDetectorOnGestureListenerC2675pi != null) {
            gestureDetectorOnGestureListenerC2675pi.l();
        }
        return gestureDetectorOnGestureListenerC2675pi;
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final byte u() {
        return (byte) 0;
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final void m(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "handleRenderViewSignaledAdReady " + this);
        }
        super.m(gestureDetectorOnGestureListenerC2675pi);
        if (this.s && this.h.indexOf(gestureDetectorOnGestureListenerC2675pi) > 0 && this.b == 6) {
            b((byte) 1);
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) this.h.get(this.p);
            if (gestureDetectorOnGestureListenerC2675pi2 != null) {
                gestureDetectorOnGestureListenerC2675pi2.a(true);
                return;
            }
            return;
        }
        if (this.b != 2) {
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                java.lang.String TAG2 = this.F;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c2799u92.a(TAG2, "AdUnit is not in available state, ignoring the ad ready signal - " + ((int) this.b));
                return;
            }
            return;
        }
        b((byte) 1);
        c((byte) 4);
        com.inmobi.media.C2799u9 c2799u93 = this.i;
        if (c2799u93 != null) {
            java.lang.String TAG3 = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            c2799u93.d(TAG3, "AdUnit " + this + " state - READY");
        }
        com.inmobi.media.C2709r1 c2709r1 = this.z;
        c2709r1.getClass();
        c2709r1.i = android.os.SystemClock.elapsedRealtime();
        Q();
        T();
        com.inmobi.media.C2799u9 c2799u94 = this.i;
        if (c2799u94 != null) {
            c2799u94.c(this.G, "Successfully loaded Banner ad markup in the WebView for placement id: " + this.l);
        }
        com.inmobi.media.AbstractC2421g1 n = n();
        if (n != null) {
            d(n);
        } else {
            com.inmobi.media.C2799u9 c2799u95 = this.i;
            if (c2799u95 != null) {
                java.lang.String TAG4 = this.F;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                c2799u95.b(TAG4, "AdUnit listener is null");
            }
        }
        h();
    }

    public static final void d(com.inmobi.media.C2262a2 c2262a2) {
        try {
            if (c2262a2.b == 4) {
                c2262a2.c((byte) 6);
                com.inmobi.media.C2799u9 c2799u9 = c2262a2.i;
                if (c2799u9 != null) {
                    java.lang.String TAG = c2262a2.F;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    c2799u9.d(TAG, "AdUnit " + c2262a2 + " state - RENDERED");
                }
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.C2799u9 c2799u92 = c2262a2.i;
            if (c2799u92 != null) {
                java.lang.String TAG2 = c2262a2.F;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c2799u92.b(TAG2, "BannerAdUnit.onRenderViewVisible threw unexpected error: " + e.getMessage());
            }
        }
    }

    public static final kotlin.Unit e(com.inmobi.media.C2262a2 c2262a2) {
        com.inmobi.media.C2799u9 c2799u9 = c2262a2.i;
        if (c2799u9 != null) {
            java.lang.String TAG = c2262a2.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "loadWithRetry success");
        }
        c2262a2.b0();
        return kotlin.Unit.INSTANCE;
    }

    public static final void f(com.inmobi.media.C2262a2 c2262a2) {
        java.util.LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        if (c2262a2.s) {
            c2262a2.q = java.lang.System.currentTimeMillis();
            com.inmobi.media.ads.network.common.model.AdSet s = c2262a2.s();
            if (s != null && (ads = s.getAds()) != null) {
                int i = 0;
                for (java.lang.Object obj : ads) {
                    int i2 = i + 1;
                    if (i < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    c2262a2.r.add(java.lang.Integer.valueOf(i));
                    i = i2;
                }
            }
        }
        c2262a2.O();
    }

    @Override // com.inmobi.media.InterfaceC2842w0
    public final void b() {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "closeAll " + this);
        }
    }

    @Override // com.inmobi.media.AbstractC2551l1
    public final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, short s, java.lang.String failureErrorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureErrorCode, "failureErrorCode");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "handleRenderViewSignaledAdFailed " + this);
        }
        super.a(gestureDetectorOnGestureListenerC2675pi, s, failureErrorCode);
        if (this.s) {
            int indexOf = this.h.indexOf(gestureDetectorOnGestureListenerC2675pi);
            a(indexOf, true);
            if (indexOf > 0 && this.b == 6) {
                b((byte) 1);
                com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) this.h.get(this.p);
                if (gestureDetectorOnGestureListenerC2675pi2 != null) {
                    gestureDetectorOnGestureListenerC2675pi2.a(false);
                }
            }
        }
        if (this.b == 2) {
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                c2799u92.c(this.G, "Failed to load the Banner markup in the WebView for placement id: " + this.l);
            }
            b(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
        }
    }

    public final boolean b(int i, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "isInValidShowPodIndex " + i + io.ktor.sse.ServerSentEventKt.SPACE + this.r + io.ktor.sse.ServerSentEventKt.SPACE + this.h.indexOf(gestureDetectorOnGestureListenerC2675pi) + io.ktor.sse.ServerSentEventKt.SPACE + this + io.ktor.sse.ServerSentEventKt.SPACE);
        }
        if (!this.r.contains(java.lang.Integer.valueOf(i)) || i <= this.h.indexOf(gestureDetectorOnGestureListenerC2675pi) || this.h.get(i) == null) {
            return true;
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) this.h.get(i);
        return (gestureDetectorOnGestureListenerC2675pi2 == null || gestureDetectorOnGestureListenerC2675pi2.C0) ? false : true;
    }

    @Override // com.inmobi.media.AbstractC2551l1, com.inmobi.media.AbstractC2726ri
    public void i(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "onRenderViewVisible " + this);
        }
        super.i(renderView);
        android.os.Handler handler = this.j;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.inmobi.media.a2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.C2262a2.d(com.inmobi.media.C2262a2.this);
                }
            });
        }
    }

    public final void c(java.lang.String str) {
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "setAdSize " + this);
        }
        com.inmobi.media.C2816v0 c2816v0 = this.l;
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        c2816v0.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        c2816v0.h = str;
    }

    public final void b(boolean z) {
        com.inmobi.media.C2799u9 c2799u9;
        com.inmobi.media.C2799u9 c2799u92 = this.i;
        if (c2799u92 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u92.a(TAG, "load " + this);
        }
        if (z && (c2799u9 = this.i) != null) {
            c2799u9.c(this.G, "Initiating Banner refresh for placement id: " + this.l);
        }
        this.H = z;
        D();
    }

    @Override // com.inmobi.media.InterfaceC2842w0
    public final void a(int i, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "loadPodAd " + this);
        }
        if (this.r.contains(java.lang.Integer.valueOf(i)) && i > this.h.indexOf(renderView)) {
            this.o = i;
            android.os.Handler handler = this.j;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.inmobi.media.a2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.inmobi.media.C2262a2.a(com.inmobi.media.C2262a2.this);
                    }
                });
                return;
            }
            return;
        }
        com.inmobi.media.C2799u9 c2799u92 = this.i;
        if (c2799u92 != null) {
            java.lang.String TAG2 = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c2799u92.a(TAG2, "No more ads present in pod adSet or current adSet is not pod adSet");
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.h;
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) copyOnWriteArrayList.get(copyOnWriteArrayList.indexOf(renderView));
        if (gestureDetectorOnGestureListenerC2675pi != null) {
            gestureDetectorOnGestureListenerC2675pi.a(false);
        }
    }

    public static final void a(com.inmobi.media.C2262a2 c2262a2) {
        com.inmobi.media.C2799u9 c2799u9 = c2262a2.i;
        if (c2799u9 != null) {
            java.lang.String TAG = c2262a2.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "start loading html ad");
        }
        c2262a2.O();
    }

    public static final kotlin.Unit a(com.inmobi.media.C2262a2 c2262a2, com.inmobi.media.EnumC2372e6 errorCode) {
        short s;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "it");
        com.inmobi.media.C2799u9 c2799u9 = c2262a2.i;
        if (c2799u9 != null) {
            java.lang.String TAG = c2262a2.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.b(TAG, "loadWithRetry error - " + errorCode);
        }
        com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus = new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        int ordinal = errorCode.ordinal();
        if (ordinal != 0) {
            if (ordinal != 21) {
                switch (ordinal) {
                    case 12:
                        s = 2123;
                        break;
                    case 13:
                        s = 2124;
                        break;
                    case 14:
                        s = 2125;
                        break;
                    case 15:
                        s = 2126;
                        break;
                    case 16:
                        s = 2127;
                        break;
                }
            } else {
                s = 2229;
            }
            c2262a2.a(inMobiAdRequestStatus, true, s);
            return kotlin.Unit.INSTANCE;
        }
        s = 2122;
        c2262a2.a(inMobiAdRequestStatus, true, s);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.inmobi.media.AbstractC2551l1, com.inmobi.media.InterfaceC2842w0
    public final void a(final int i, final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.C2799u9 c2799u9 = this.i;
        if (c2799u9 != null) {
            java.lang.String TAG = this.F;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "showPodAdAtIndex " + this + " index - " + i);
        }
        if (!this.s) {
            com.inmobi.media.C2799u9 c2799u92 = this.i;
            if (c2799u92 != null) {
                java.lang.String TAG2 = this.F;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c2799u92.b(TAG2, "Cannot show an pod ad as isPod is not set.");
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.h;
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) copyOnWriteArrayList.get(copyOnWriteArrayList.indexOf(renderView));
            if (gestureDetectorOnGestureListenerC2675pi != null) {
                gestureDetectorOnGestureListenerC2675pi.b(false);
                return;
            }
            return;
        }
        if (b(i, renderView)) {
            com.inmobi.media.C2799u9 c2799u93 = this.i;
            if (c2799u93 != null) {
                java.lang.String TAG3 = this.F;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                c2799u93.b(TAG3, "Cannot show an pod ad with invalid index passed");
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = this.h;
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) copyOnWriteArrayList2.get(copyOnWriteArrayList2.indexOf(renderView));
            if (gestureDetectorOnGestureListenerC2675pi2 != null) {
                gestureDetectorOnGestureListenerC2675pi2.b(false);
                return;
            }
            return;
        }
        super.a(i, renderView, context);
        android.os.Handler handler = this.j;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.inmobi.media.a2$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.C2262a2.a(com.inmobi.media.C2262a2.this, renderView, i);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public void a(com.inmobi.media.V1 audioStatusInternal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        com.inmobi.media.AbstractC2421g1 n = n();
        if (n != null) {
            n.a(audioStatusInternal);
        }
        com.inmobi.media.C2289b2 c2289b2 = this.J;
        c2289b2.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        if (!c2289b2.f5113a && audioStatusInternal == com.inmobi.media.V1.e) {
            c2289b2.f5113a = true;
            com.inmobi.media.C2323c9 c2323c9 = com.inmobi.media.C2323c9.c;
            c2323c9.f5190a = java.lang.System.currentTimeMillis();
            c2323c9.b++;
        }
    }

    @Override // com.inmobi.media.AbstractC2726ri
    public void a(boolean z) {
        com.inmobi.media.C2323c9 c2323c9 = com.inmobi.media.C2323c9.c;
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
        com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "banner_audio_pref_file");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_mute_count", com.ironsource.X3.i.W);
        int i = a2.f4815a.getInt("user_mute_count", 0);
        a2.a("user_mute_count", z ? java.lang.Math.max(0, i - 1) : i + 1, false);
    }

    @Override // com.inmobi.media.AbstractC2551l1, com.inmobi.media.AbstractC2726ri
    public final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.a(renderView, z);
        byte b = this.b;
        if (b != 4 && b != 6) {
            if (b == 7) {
                renderView.a(z, this.b == 7 ? z ? (short) 2224 : (short) 2223 : (short) 2227);
                return;
            }
            return;
        }
        byte b2 = this.b;
        if (b2 == 4) {
            r1 = z ? (short) 2220 : (short) 2219;
        } else if (b2 == 6) {
            r1 = z ? (short) 2222 : (short) 2221;
        }
        K();
        renderView.a(z, r1);
    }
}
