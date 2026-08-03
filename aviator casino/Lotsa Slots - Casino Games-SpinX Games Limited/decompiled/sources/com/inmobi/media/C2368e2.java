package com.inmobi.media;

/* renamed from: com.inmobi.media.e2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2368e2 extends com.inmobi.media.Uk {
    public final java.lang.String h = "InMobi";
    public final java.lang.String i = "e2";
    public com.inmobi.media.C2262a2 j;
    public com.inmobi.media.C2262a2 k;
    public com.inmobi.media.C2262a2 l;
    public com.inmobi.media.C2262a2 m;

    public final boolean a(long j) {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "checkForRefreshRate " + this);
        }
        com.inmobi.media.C2262a2 c2262a2 = this.m;
        if (c2262a2 == null) {
            return false;
        }
        com.inmobi.media.core.config.models.AdConfig adConfig = c2262a2.c;
        kotlin.jvm.internal.Intrinsics.checkNotNull(adConfig);
        int minimumRefreshInterval = adConfig.getMinimumRefreshInterval();
        if (android.os.SystemClock.elapsedRealtime() - j >= minimumRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            java.lang.String TAG2 = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c2799u92.b(TAG2, "Early refresh request");
        }
        b(this.m, new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minimumRefreshInterval + " seconds"));
        java.lang.String TAG3 = this.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
        com.inmobi.media.C2262a2 c2262a22 = this.m;
        com.inmobi.media.Sb.a((byte) 1, TAG3, "Ad cannot be refreshed before " + minimumRefreshInterval + " seconds (AdPlacement Id = " + (c2262a22 != null ? c2262a22.l : null) + ")");
        com.inmobi.media.C2799u9 c2799u93 = this.f;
        if (c2799u93 != null) {
            java.lang.String TAG4 = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            com.inmobi.media.C2262a2 c2262a23 = this.m;
            c2799u93.b(TAG4, "Ad cannot be refreshed before " + minimumRefreshInterval + " seconds (AdPlacement Id = " + (c2262a23 != null ? c2262a23.l : null) + ")");
        }
        return false;
    }

    public final void b(com.inmobi.ads.InMobiBanner inMobiBanner) {
        com.inmobi.media.C2816v0 c2816v0;
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "displayInternal " + this);
        }
        com.inmobi.media.C2262a2 c2262a2 = this.l;
        if (c2262a2 == null) {
            return;
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi j = c2262a2.j();
        if (!(j instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi)) {
            j = null;
        }
        if (j == null) {
            return;
        }
        com.inmobi.media.Wn viewableAd = j.getViewableAd();
        com.inmobi.media.C2262a2 c2262a22 = this.l;
        if (c2262a22 != null && (c2816v0 = c2262a22.l) != null && c2816v0.j) {
            j.l();
        }
        android.view.View c = viewableAd.c();
        viewableAd.a(new java.util.HashMap());
        android.view.ViewParent parent = j.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        if (viewGroup == null) {
            inMobiBanner.addView(c, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(c, layoutParams);
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2421g1
    public final void c(final com.inmobi.ads.AdMetaInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "onAdLoadSucceeded " + this);
        }
        super.c(info);
        this.f5001a = (byte) 0;
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            java.lang.String TAG2 = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c2799u92.a(TAG2, "Ad load successful, providing callback");
        }
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.e2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C2368e2.b(com.inmobi.media.C2368e2.this, info);
            }
        });
    }

    @Override // com.inmobi.media.Uk
    public final com.inmobi.media.AbstractC2551l1 f() {
        return q() ? this.l : this.m;
    }

    public final void h() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "canProceedForSuccess " + this);
        }
    }

    public final boolean i() {
        com.inmobi.media.C2262a2 c2262a2;
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "canScheduleRefresh " + this);
        }
        com.inmobi.media.C2262a2 c2262a22 = this.m;
        if (c2262a22 == null) {
            return false;
        }
        byte b = c2262a22.b;
        java.lang.Byte valueOf = java.lang.Byte.valueOf(b);
        valueOf.getClass();
        if (b != 4) {
            valueOf.getClass();
            if (b != 1) {
                valueOf.getClass();
                if (b != 2 && ((c2262a2 = this.l) == null || c2262a2.b != 7)) {
                    return true;
                }
            }
        }
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            java.lang.String TAG2 = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c2799u92.a(TAG2, "Ignoring an attempt to schedule refresh when an ad is already loading or active.");
        }
        return false;
    }

    public final void j() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "clear " + this);
        }
        t();
        com.inmobi.media.C2262a2 c2262a2 = this.j;
        if (c2262a2 != null) {
            c2262a2.d();
        }
        this.j = null;
        com.inmobi.media.C2262a2 c2262a22 = this.k;
        if (c2262a22 != null) {
            c2262a22.d();
        }
        this.k = null;
        this.f = null;
        this.l = null;
        this.m = null;
        this.b = null;
    }

    public final int k() {
        com.inmobi.media.core.config.models.AdConfig adConfig;
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "defaultRefreshInterval " + this);
        }
        com.inmobi.media.AbstractC2551l1 f = f();
        if (f == null || (adConfig = f.c) == null) {
            return -1;
        }
        return adConfig.getDefaultRefreshInterval();
    }

    public final boolean l() {
        java.lang.Boolean bool;
        java.lang.Boolean bool2;
        java.lang.String TAG = this.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        kotlin.jvm.internal.Intrinsics.areEqual(this.l, this.j);
        java.lang.String TAG2 = this.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        kotlin.jvm.internal.Intrinsics.areEqual(this.m, this.j);
        java.lang.String TAG3 = this.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
        kotlin.jvm.internal.Intrinsics.areEqual(this.l, this.k);
        java.lang.String TAG4 = this.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
        kotlin.jvm.internal.Intrinsics.areEqual(this.m, this.k);
        java.lang.String TAG5 = this.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
        com.inmobi.media.C2262a2 c2262a2 = this.j;
        if (c2262a2 != null) {
            bool = java.lang.Boolean.valueOf(c2262a2.b == 7);
        } else {
            bool = null;
        }
        com.inmobi.media.C2262a2 c2262a22 = this.j;
        java.lang.Byte valueOf = c2262a22 != null ? java.lang.Byte.valueOf(c2262a22.b) : null;
        com.inmobi.media.C2262a2 c2262a23 = this.j;
        java.util.Objects.toString(bool);
        java.util.Objects.toString(valueOf);
        java.util.Objects.toString(c2262a23);
        java.lang.String TAG6 = this.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG6, "TAG");
        com.inmobi.media.C2262a2 c2262a24 = this.k;
        if (c2262a24 != null) {
            bool2 = java.lang.Boolean.valueOf(c2262a24.b == 7);
        } else {
            bool2 = null;
        }
        com.inmobi.media.C2262a2 c2262a25 = this.k;
        java.lang.Byte valueOf2 = c2262a25 != null ? java.lang.Byte.valueOf(c2262a25.b) : null;
        com.inmobi.media.C2262a2 c2262a26 = this.k;
        java.util.Objects.toString(bool2);
        java.util.Objects.toString(valueOf2);
        java.util.Objects.toString(c2262a26);
        com.inmobi.media.C2262a2 c2262a27 = this.l;
        return c2262a27 != null && c2262a27.b == 7;
    }

    public final void m() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "pause " + this);
        }
        com.inmobi.media.C2262a2 c2262a2 = this.l;
        if (c2262a2 != null) {
            c2262a2.X();
        }
    }

    public final void n() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "registerLifeCycleCallbacks " + this);
        }
        com.inmobi.media.C2262a2 c2262a2 = this.j;
        if (c2262a2 != null) {
            c2262a2.Z();
        }
        com.inmobi.media.C2262a2 c2262a22 = this.k;
        if (c2262a22 != null) {
            c2262a22.Z();
        }
    }

    public final void o() {
        com.inmobi.media.C2262a2 c2262a2;
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "render " + this);
        }
        com.inmobi.media.C2262a2 c2262a22 = this.m;
        if (c2262a22 == null) {
            throw new java.lang.IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (a(this.h, java.lang.String.valueOf(c2262a22.l.f5497a))) {
            com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = this.c;
            if (publisherCallbacks != null && publisherCallbacks.getType() == 1 && (c2262a2 = this.m) != null) {
                c2262a2.d((byte) 1);
            }
            this.f5001a = (byte) 8;
            c2262a22.a0();
        }
    }

    public final void p() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "resume " + this);
        }
        com.inmobi.media.C2262a2 c2262a2 = this.l;
        if (c2262a2 != null) {
            c2262a2.Y();
        }
    }

    public final boolean q() {
        com.inmobi.media.C2262a2 c2262a2 = this.l;
        java.lang.Byte valueOf = c2262a2 != null ? java.lang.Byte.valueOf(c2262a2.b) : null;
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "shouldUseForegroundUnit " + this + " state - " + valueOf);
        }
        if (valueOf != null && valueOf.byteValue() == 4) {
            return true;
        }
        if (valueOf == null || valueOf.byteValue() != 7) {
            return valueOf != null && valueOf.byteValue() == 6;
        }
        return true;
    }

    public final void r() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "submitAdShowFail " + this);
        }
        com.inmobi.media.AbstractC2551l1 f = f();
        if (f != null) {
            f.d((short) 2239);
        }
    }

    public final void s() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "swapAdUnits " + this);
        }
        com.inmobi.media.C2262a2 c2262a2 = this.l;
        if (c2262a2 == null) {
            this.l = this.j;
            this.m = this.k;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(c2262a2, this.j)) {
            this.l = this.k;
            this.m = this.j;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(c2262a2, this.k)) {
            this.l = this.j;
            this.m = this.k;
        }
    }

    public final void t() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "unregisterLifeCycleCallbacks " + this);
        }
        com.inmobi.media.C2262a2 c2262a2 = this.j;
        if (c2262a2 != null) {
            c2262a2.c0();
        }
        com.inmobi.media.C2262a2 c2262a22 = this.k;
        if (c2262a22 != null) {
            c2262a22.c0();
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2421g1
    public final void b(final com.inmobi.ads.AdMetaInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "onAdFetchSuccess " + this);
        }
        this.e = info;
        com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus = new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        com.inmobi.media.C2262a2 c2262a2 = this.m;
        if ((c2262a2 != null ? c2262a2.b(0) : null) == null) {
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                java.lang.String TAG2 = this.i;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c2799u92.b(TAG2, "backgroundAdUnit ad object is null");
            }
            a((com.inmobi.media.AbstractC2551l1) null, inMobiAdRequestStatus);
            b((short) 2189);
            return;
        }
        com.inmobi.media.C2799u9 c2799u93 = this.f;
        if (c2799u93 != null) {
            java.lang.String TAG3 = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            c2799u93.a(TAG3, "Ad fetch successful, calling loadAd()");
        }
        super.b(info);
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.e2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C2368e2.a(com.inmobi.media.C2368e2.this, info);
            }
        });
    }

    public final void a(com.inmobi.ads.InMobiBanner banner) {
        com.inmobi.media.C2816v0 c2816v0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(banner, "banner");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "displayAd " + this);
        }
        com.inmobi.media.C2262a2 c2262a2 = this.l;
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi j = c2262a2 != null ? c2262a2.j() : null;
        if (!(j instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi)) {
            j = null;
        }
        if (j == null) {
            return;
        }
        com.inmobi.media.Wn viewableAd = j.getViewableAd();
        com.inmobi.media.C2262a2 c2262a22 = this.l;
        if (c2262a22 != null && (c2816v0 = c2262a22.l) != null && c2816v0.j) {
            j.l();
        }
        android.view.ViewParent parent = j.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        android.view.View c = viewableAd.c();
        viewableAd.a(new java.util.HashMap());
        com.inmobi.media.C2262a2 c2262a23 = this.m;
        if (c2262a23 != null) {
            c2262a23.X();
        }
        com.inmobi.media.C2262a2 c2262a24 = this.l;
        if (c2262a24 != null && c2262a24.b == 8) {
            android.view.View view = new android.view.View(banner.getContext());
            view.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
            if (viewGroup == null) {
                banner.addView(view, layoutParams);
            } else {
                viewGroup.removeAllViews();
                viewGroup.addView(view, layoutParams);
            }
            r();
        } else if (viewGroup == null) {
            banner.addView(c, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(c, layoutParams);
        }
        com.inmobi.media.C2262a2 c2262a25 = this.m;
        if (c2262a25 != null) {
            c2262a25.d();
        }
    }

    public static final void b(com.inmobi.media.C2368e2 c2368e2, com.inmobi.ads.AdMetaInfo adMetaInfo) {
        com.inmobi.media.C2799u9 c2799u9 = c2368e2.f;
        if (c2799u9 != null) {
            java.lang.String TAG = c2368e2.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "callback - onAdLoadSucceeded");
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = c2368e2.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        } else {
            c2368e2.b((short) 2184);
        }
    }

    public final void b(short s) {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "submitAdLoadFailed " + this);
        }
        com.inmobi.media.AbstractC2551l1 f = f();
        if (f != null) {
            f.c(s);
        }
    }

    public final int a(int i, int i2) {
        com.inmobi.media.core.config.models.AdConfig adConfig;
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "getRefreshInterval " + this);
        }
        com.inmobi.media.C2262a2 c2262a2 = this.m;
        return (c2262a2 == null || (adConfig = c2262a2.c) == null) ? i2 : i < adConfig.getMinimumRefreshInterval() ? adConfig.getMinimumRefreshInterval() : i;
    }

    public final void a(com.inmobi.ads.controllers.PublisherCallbacks callbacks, java.lang.String adSize, boolean z) {
        com.inmobi.media.C2262a2 c2262a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "load 1 " + this);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.b, java.lang.Boolean.FALSE)) {
            b(this.m, new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            com.inmobi.media.C2262a2 c2262a22 = this.m;
            if (c2262a22 != null) {
                c2262a22.b((short) 2006);
            }
            com.inmobi.media.Sb.a((byte) 1, this.h, "Cannot call load() API after calling load(byte[])");
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                java.lang.String TAG2 = this.i;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c2799u92.b(TAG2, "Cannot call load() API after calling load(byte[])");
                return;
            }
            return;
        }
        this.b = java.lang.Boolean.TRUE;
        if (this.c == null) {
            this.c = callbacks;
        }
        com.inmobi.media.C2262a2 c2262a23 = this.m;
        if (c2262a23 == null || !a(this.h, java.lang.String.valueOf(c2262a23.l), callbacks) || (c2262a2 = this.m) == null) {
            return;
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = this.c;
        if (c2262a2.d((publisherCallbacks == null || publisherCallbacks.getType() != 1) ? (byte) 1 : (byte) 2)) {
            com.inmobi.media.C2799u9 c2799u93 = this.f;
            if (c2799u93 != null) {
                java.lang.String TAG3 = this.i;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                c2799u93.d(TAG3, "AdManager state - LOADING");
            }
            this.f5001a = (byte) 1;
            this.e = null;
            com.inmobi.media.C2262a2 c2262a24 = this.m;
            kotlin.jvm.internal.Intrinsics.checkNotNull(c2262a24);
            c2262a24.c(adSize);
            com.inmobi.media.C2262a2 c2262a25 = this.m;
            kotlin.jvm.internal.Intrinsics.checkNotNull(c2262a25);
            c2262a25.b(z);
        }
    }

    @Override // com.inmobi.media.Uk
    public final void a(byte[] bArr, com.inmobi.ads.controllers.PublisherCallbacks callbacks) {
        com.inmobi.media.C2262a2 c2262a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "load 2 " + this);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.b, java.lang.Boolean.TRUE)) {
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                java.lang.String TAG2 = this.i;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c2799u92.b(TAG2, "Cannot call load(byte[]) API after load() API is called");
                return;
            }
            return;
        }
        this.b = java.lang.Boolean.FALSE;
        this.f5001a = (byte) 1;
        this.c = callbacks;
        if (this.m != null) {
            com.inmobi.media.C2262a2 c2262a22 = this.l;
            if ((c2262a22 == null || !c2262a22.C()) && (c2262a2 = this.m) != null && c2262a2.d((byte) 1)) {
                com.inmobi.media.C2799u9 c2799u93 = this.f;
                if (c2799u93 != null) {
                    java.lang.String TAG3 = this.i;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                    c2799u93.a(TAG3, "timer started - load banner");
                }
                com.inmobi.media.C2262a2 c2262a23 = this.m;
                if (c2262a23 != null) {
                    c2262a23.E();
                }
                com.inmobi.media.C2262a2 c2262a24 = this.m;
                if (c2262a24 != null) {
                    c2262a24.a(bArr);
                }
            }
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2421g1
    public final void a() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "onAdDismissed " + this);
        }
        this.f5001a = (byte) 0;
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            java.lang.String TAG2 = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c2799u92.d(TAG2, "AdManager state - CREATED");
        }
        super.a();
    }

    public static final void a(com.inmobi.media.C2368e2 c2368e2, com.inmobi.ads.AdMetaInfo adMetaInfo) {
        com.inmobi.media.C2799u9 c2799u9 = c2368e2.f;
        if (c2799u9 != null) {
            java.lang.String TAG = c2368e2.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.a(TAG, "callback - onAdFetchSuccessful");
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = c2368e2.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
            return;
        }
        com.inmobi.media.C2799u9 c2799u92 = c2368e2.f;
        if (c2799u92 != null) {
            java.lang.String TAG2 = c2368e2.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c2799u92.b(TAG2, "callback null");
        }
    }

    @Override // com.inmobi.media.AbstractC2421g1
    public final void a(int i, final int i2, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        android.view.ViewParent parent;
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String TAG = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c2799u9.c(TAG, "onShowNextPodAd " + this);
        }
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            java.lang.String TAG2 = this.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c2799u92.a(TAG2, "on Show next pod ad index: " + i);
        }
        if (gestureDetectorOnGestureListenerC2675pi != null) {
            try {
                parent = gestureDetectorOnGestureListenerC2675pi.getParent();
            } catch (java.lang.Exception unused) {
                com.inmobi.media.C2262a2 c2262a2 = this.l;
                if (c2262a2 != null) {
                    c2262a2.e(i2);
                }
                com.inmobi.media.C2262a2 c2262a22 = this.l;
                if (c2262a22 != null) {
                    c2262a22.b(i2, false);
                    return;
                }
                return;
            }
        } else {
            parent = null;
        }
        com.inmobi.ads.InMobiBanner inMobiBanner = parent instanceof com.inmobi.ads.InMobiBanner ? (com.inmobi.ads.InMobiBanner) parent : null;
        if (inMobiBanner != null) {
            com.inmobi.media.C2262a2 c2262a23 = this.l;
            if (c2262a23 != null) {
                c2262a23.b(i2, true);
            }
            b(inMobiBanner);
            this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.e2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.C2368e2.a(com.inmobi.media.C2368e2.this, i2);
                }
            });
            return;
        }
        com.inmobi.media.C2262a2 c2262a24 = this.l;
        if (c2262a24 != null) {
            c2262a24.e(i2);
        }
        com.inmobi.media.C2262a2 c2262a25 = this.l;
        if (c2262a25 != null) {
            c2262a25.b(i2, false);
        }
    }

    public final void a(android.content.Context context, com.inmobi.media.Sg pubSettings, java.lang.String adSize) {
        java.lang.String m10Context;
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("banner", "logType");
        java.lang.String TAG = this.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("banner", "mAdType");
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (context instanceof android.app.Activity) {
            m10Context = "activity";
        } else {
            m10Context = "others";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m10Context, "m10Context");
        long j = pubSettings.f4958a;
        java.lang.String str3 = pubSettings.b;
        java.util.Map map = pubSettings.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
        boolean z = pubSettings.d;
        java.lang.String str4 = pubSettings.g;
        java.lang.String str5 = pubSettings.e;
        if (j != Long.MIN_VALUE) {
            if (map == null || (str = (java.lang.String) map.get("tp")) == null) {
                str = "";
            }
            com.inmobi.media.C2816v0 c2816v0 = new com.inmobi.media.C2816v0(j, str, "banner", str4);
            c2816v0.d = str3;
            c2816v0.c = map;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "<set-?>");
            c2816v0.h = adSize;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m10Context, "<set-?>");
            c2816v0.i = m10Context;
            c2816v0.g = uuid;
            c2816v0.j = z;
            c2816v0.k = str5;
            java.lang.String str6 = pubSettings.g;
            if (str6 != null) {
                com.inmobi.media.C2799u9 c2799u9 = this.f;
                if (c2799u9 != null) {
                    c2799u9.a();
                }
                this.f = com.inmobi.media.Sh.a("banner", str6);
            }
            com.inmobi.media.C2262a2 c2262a2 = this.j;
            if (c2262a2 != null && this.k != null) {
                c2262a2.a(context, c2816v0, this);
                com.inmobi.media.C2262a2 c2262a22 = this.k;
                if (c2262a22 != null) {
                    c2262a22.a(context, c2816v0, this);
                }
            } else {
                this.j = new com.inmobi.media.C2262a2(context, c2816v0, this);
                com.inmobi.media.C2262a2 c2262a23 = new com.inmobi.media.C2262a2(context, c2816v0, this);
                this.k = c2262a23;
                this.m = this.j;
                this.l = c2262a23;
            }
            com.inmobi.media.C2799u9 logger = this.f;
            if (logger != null) {
                com.inmobi.media.C2262a2 c2262a24 = this.j;
                if (c2262a24 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
                    c2262a24.i = logger;
                    com.inmobi.media.C2287b0 c2287b0 = c2262a24.u;
                    c2287b0.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
                    c2287b0.f = logger;
                }
                com.inmobi.media.C2262a2 c2262a25 = this.k;
                if (c2262a25 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
                    c2262a25.i = logger;
                    com.inmobi.media.C2287b0 c2287b02 = c2262a25.u;
                    c2287b02.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
                    c2287b02.f = logger;
                }
                com.inmobi.media.C2799u9 c2799u92 = this.f;
                if (c2799u92 != null) {
                    java.lang.String str7 = this.i;
                    str2 = "TAG";
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, str2);
                    c2799u92.a(str7, "adding mBannerAdUnit1 to reference tracker");
                } else {
                    str2 = "TAG";
                }
                com.inmobi.media.Ib ib = com.inmobi.media.Sh.f4959a;
                com.inmobi.media.C2262a2 c2262a26 = this.j;
                kotlin.jvm.internal.Intrinsics.checkNotNull(c2262a26);
                com.inmobi.media.Sh.a(c2262a26, this.f);
                com.inmobi.media.C2799u9 c2799u93 = this.f;
                if (c2799u93 != null) {
                    java.lang.String str8 = this.i;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str8, str2);
                    c2799u93.a(str8, "adding mBannerAdUnit2 to reference tracker");
                }
                com.inmobi.media.C2262a2 c2262a27 = this.k;
                kotlin.jvm.internal.Intrinsics.checkNotNull(c2262a27);
                com.inmobi.media.Sh.a(c2262a27, this.f);
            }
            com.inmobi.ads.WatermarkData watermarkData = this.g;
            if (watermarkData != null) {
                com.inmobi.media.C2262a2 c2262a28 = this.j;
                if (c2262a28 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
                    c2262a28.A = watermarkData;
                    com.inmobi.media.GestureDetectorOnGestureListenerC2675pi r = c2262a28.r();
                    if (r != null) {
                        r.setWatermark(watermarkData);
                    }
                }
                com.inmobi.media.C2262a2 c2262a29 = this.k;
                if (c2262a29 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
                    c2262a29.A = watermarkData;
                    com.inmobi.media.GestureDetectorOnGestureListenerC2675pi r2 = c2262a29.r();
                    if (r2 != null) {
                        r2.setWatermark(watermarkData);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new java.lang.IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
    }

    public static final void a(com.inmobi.media.C2368e2 c2368e2, int i) {
        com.inmobi.media.C2262a2 c2262a2 = c2368e2.l;
        if (c2262a2 != null) {
            c2262a2.a(i, false);
        }
    }

    @Override // com.inmobi.media.Uk
    public final void a(com.inmobi.ads.WatermarkData watermarkData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        super.a(watermarkData);
        com.inmobi.media.C2262a2 c2262a2 = this.j;
        if (c2262a2 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
            c2262a2.A = watermarkData;
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi r = c2262a2.r();
            if (r != null) {
                r.setWatermark(watermarkData);
            }
        }
        com.inmobi.media.C2262a2 c2262a22 = this.k;
        if (c2262a22 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
            c2262a22.A = watermarkData;
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi r2 = c2262a22.r();
            if (r2 != null) {
                r2.setWatermark(watermarkData);
            }
        }
    }
}
