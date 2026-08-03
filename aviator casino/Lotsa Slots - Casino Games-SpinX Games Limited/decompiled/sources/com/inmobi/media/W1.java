package com.inmobi.media;

/* loaded from: classes5.dex */
public final class W1 extends com.inmobi.media.Uk {
    public com.inmobi.media.N1 h;
    public com.inmobi.media.N1 i;
    public com.inmobi.media.N1 j;
    public com.inmobi.media.N1 k;

    public W1(com.inmobi.ads.InMobiAudio.a callbacks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.c = callbacks;
    }

    public static final void a(com.inmobi.media.W1 w1, com.inmobi.ads.AdMetaInfo adMetaInfo) {
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = w1.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
        }
    }

    public static final void b(com.inmobi.media.W1 w1, com.inmobi.ads.AdMetaInfo adMetaInfo) {
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = w1.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2421g1
    public final void c(final com.inmobi.ads.AdMetaInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.c(str, "onAdLoadSucceeded " + this);
        }
        super.c(info);
        this.f5001a = (byte) 0;
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            java.lang.String str2 = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            c2799u92.d(str2, "AdManager state - CREATED");
        }
        com.inmobi.media.C2799u9 c2799u93 = this.f;
        if (c2799u93 != null) {
            java.lang.String str3 = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            c2799u93.a(str3, "Ad load successful, providing callback");
        }
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.W1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.W1.b(com.inmobi.media.W1.this, info);
            }
        });
    }

    @Override // com.inmobi.media.Uk
    public final com.inmobi.media.AbstractC2551l1 f() {
        return m() ? this.j : this.k;
    }

    @Override // com.inmobi.media.Uk
    public final void g() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.a(str, "submitAdLoadCalled " + this);
        }
        com.inmobi.media.N1 n1 = this.k;
        if (n1 != null) {
            n1.P();
        }
    }

    public final void h() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.a(str, "clear " + this);
        }
        p();
        com.inmobi.media.N1 n1 = this.h;
        if (n1 != null) {
            n1.d();
        }
        this.h = null;
        com.inmobi.media.N1 n12 = this.i;
        if (n12 != null) {
            n12.d();
        }
        this.i = null;
        this.j = null;
        this.k = null;
        this.b = null;
    }

    public final void i() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.a(str, "pause " + this);
        }
        com.inmobi.media.N1 n1 = this.j;
        if (n1 != null) {
            n1.X();
        }
    }

    public final void j() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.c(str, "registerLifeCycleCallbacks " + this);
        }
        com.inmobi.media.N1 n1 = this.h;
        if (n1 != null) {
            n1.Z();
        }
        com.inmobi.media.N1 n12 = this.i;
        if (n12 != null) {
            n12.Z();
        }
    }

    public final void k() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.a(str, "loadIntoView " + this);
        }
        com.inmobi.media.N1 n1 = this.k;
        if (n1 == null) {
            throw new java.lang.IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (a("InMobi", java.lang.String.valueOf(n1.l.f5497a))) {
            this.f5001a = (byte) 8;
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                java.lang.String str2 = com.inmobi.media.X1.f5043a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                c2799u92.d(str2, "AdManager state - LOADING_INTO_VIEW");
            }
            n1.a0();
        }
    }

    public final void l() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.a(str, "resume " + this);
        }
        com.inmobi.media.N1 n1 = this.j;
        if (n1 != null) {
            n1.Y();
        }
    }

    public final boolean m() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.c(str, "shouldUseForegroundUnit " + this);
        }
        com.inmobi.media.N1 n1 = this.j;
        java.lang.Byte valueOf = n1 != null ? java.lang.Byte.valueOf(n1.b) : null;
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            java.lang.String str2 = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            c2799u92.d(str2, "State - " + valueOf);
        }
        if (valueOf != null && valueOf.byteValue() == 4) {
            return true;
        }
        if (valueOf == null || valueOf.byteValue() != 7) {
            return valueOf != null && valueOf.byteValue() == 6;
        }
        return true;
    }

    public final void n() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.a(str, "submitAdShowCalled " + this);
        }
        com.inmobi.media.N1 n1 = this.k;
        if (n1 != null) {
            n1.R();
        }
    }

    public final void o() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.a(str, "swapAdUnits " + this);
        }
        com.inmobi.media.N1 n1 = this.j;
        if (kotlin.jvm.internal.Intrinsics.areEqual(n1, this.h)) {
            this.j = this.i;
            this.k = this.h;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(n1, this.i) || n1 == null) {
            this.j = this.h;
            this.k = this.i;
        }
    }

    public final void p() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.c(str, "unregisterLifecycleCallbacks " + this);
        }
        com.inmobi.media.N1 n1 = this.h;
        if (n1 != null) {
            n1.c0();
        }
        com.inmobi.media.N1 n12 = this.i;
        if (n12 != null) {
            n12.c0();
        }
    }

    public final boolean a(long j) {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.c(str, "checkForRefreshRate " + this);
        }
        if (this.k == null) {
            return false;
        }
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        int minRefreshInterval = ((com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class)).getAudio().getMinRefreshInterval();
        if (android.os.SystemClock.elapsedRealtime() - j >= minRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        b(this.k, new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minRefreshInterval + " seconds"));
        java.lang.String str2 = com.inmobi.media.X1.f5043a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        com.inmobi.media.N1 n1 = this.k;
        com.inmobi.media.Sb.a((byte) 1, str2, "Ad cannot be refreshed before " + minRefreshInterval + " seconds (AdPlacement Id = " + (n1 != null ? n1.l : null) + ")");
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            com.inmobi.media.N1 n12 = this.k;
            c2799u92.b(str2, "Ad cannot be refreshed before " + minRefreshInterval + " seconds (AdPlacement Id = " + (n12 != null ? n12.l : null) + ")");
        }
        return false;
    }

    public final void b(java.lang.String adSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.a(str, "load 1 " + this);
        }
        com.inmobi.media.N1 n1 = this.k;
        if (n1 != null && a("InMobi", java.lang.String.valueOf(n1.l.f5497a), this.c) && n1.d((byte) 1)) {
            this.f5001a = (byte) 1;
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                java.lang.String str2 = com.inmobi.media.X1.f5043a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                c2799u92.d(str2, "AdManager state - LOADING");
            }
            this.e = null;
            n1.c(adSize);
            n1.b(false);
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2421g1
    public final void b(final com.inmobi.ads.AdMetaInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.c(str, "onAdFetchSuccess " + this);
        }
        com.inmobi.media.N1 n1 = this.k;
        if ((n1 != null ? n1.b(0) : null) == null) {
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                java.lang.String str2 = com.inmobi.media.X1.f5043a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                c2799u92.b(str2, "adObject is null, fetch failed");
            }
            a((com.inmobi.media.AbstractC2551l1) null, new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        com.inmobi.media.C2799u9 c2799u93 = this.f;
        if (c2799u93 != null) {
            java.lang.String str3 = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            c2799u93.a(str3, "Ad fetch successful, calling loadIntoView()");
        }
        super.b(info);
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.W1$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.W1.a(com.inmobi.media.W1.this, info);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC2421g1
    public final void b() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.a(str, "onAdShowFailed " + this);
        }
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.W1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.W1.a(com.inmobi.media.W1.this);
            }
        });
    }

    public final void b(android.widget.RelativeLayout relativeLayout) {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.a(str, "showAudioAd");
        }
        com.inmobi.media.N1 n1 = this.j;
        if (n1 != null && n1.b == 7) {
            java.lang.String str2 = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            com.inmobi.media.Sb.a((byte) 1, str2, "An ad is currently being viewed by the user. Please wait for the user to close the ad before showing another ad.");
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                c2799u92.b(str2, "ad is active");
            }
            com.inmobi.media.N1 n12 = this.k;
            if (n12 != null) {
                n12.f((short) 15);
                return;
            }
            return;
        }
        com.inmobi.media.N1 n13 = this.k;
        if (n13 != null) {
            com.inmobi.media.C2799u9 c2799u93 = n13.i;
            if (c2799u93 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c2799u93.c("l1", "canProceedToShow");
            }
            if (n13.A()) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                com.inmobi.media.Sb.a((byte) 1, "l1", "Ad Show has failed because current ad is expired. Please call load() again.");
                com.inmobi.media.C2799u9 c2799u94 = n13.i;
                if (c2799u94 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c2799u94.b("l1", "ad is expired");
                }
                n13.d0();
                return;
            }
            byte b = n13.b;
            if (b == 1 || b == 2) {
                com.inmobi.media.Sb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
                com.inmobi.media.C2799u9 c2799u95 = n13.i;
                if (c2799u95 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c2799u95.b("l1", "ad is not ready");
                }
                com.inmobi.media.C2799u9 c2799u96 = n13.i;
                if (c2799u96 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c2799u96.a("l1", "callback - onShowFailure");
                }
                n13.f((short) 2152);
                return;
            }
            if (b == 3) {
                com.inmobi.media.Sb.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                n13.f((short) 0);
                com.inmobi.media.C2799u9 c2799u97 = n13.i;
                if (c2799u97 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c2799u97.a("l1", "callback - onShowFailure");
                }
                com.inmobi.media.C2799u9 c2799u98 = n13.i;
                if (c2799u98 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c2799u98.b("l1", "ad is failed");
                    return;
                }
                return;
            }
            if (b == 8) {
                com.inmobi.media.Sb.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                n13.f((short) 0);
                com.inmobi.media.C2799u9 c2799u99 = n13.i;
                if (c2799u99 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c2799u99.a("l1", "callback - onShowFailure");
                }
                com.inmobi.media.C2799u9 c2799u910 = n13.i;
                if (c2799u910 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c2799u910.b("l1", "ad is unloaded");
                    return;
                }
                return;
            }
            if (b == 0) {
                com.inmobi.media.Sb.a((byte) 1, "InMobi", "Ad Show has Failed. Please call load() before calling show().");
                n13.f((short) 0);
                com.inmobi.media.C2799u9 c2799u911 = n13.i;
                if (c2799u911 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c2799u911.a("l1", "callback - onShowFailure");
                }
                com.inmobi.media.C2799u9 c2799u912 = n13.i;
                if (c2799u912 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c2799u912.b("l1", "show called before load");
                    return;
                }
                return;
            }
            o();
            a(relativeLayout);
        }
    }

    public final void b(short s) {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.b(str, "submitAdLoadFailed " + this);
        }
        com.inmobi.media.N1 n1 = this.k;
        if (n1 != null) {
            n1.c((short) 15);
        }
    }

    public final void a(android.widget.RelativeLayout relativeLayout) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi j;
        com.inmobi.media.C2816v0 c2816v0;
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.a(str, "displayAd " + this);
        }
        com.inmobi.media.N1 n1 = this.j;
        if (n1 == null || (j = n1.j()) == null) {
            return;
        }
        com.inmobi.media.Wn viewableAd = j.getViewableAd();
        com.inmobi.media.N1 n12 = this.j;
        if (n12 != null && (c2816v0 = n12.l) != null && c2816v0.j) {
            j.l();
        }
        android.view.ViewParent parent = j.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        android.view.View c = viewableAd.c();
        viewableAd.a((java.util.Map) null);
        com.inmobi.media.N1 n13 = this.k;
        if (n13 != null) {
            n13.X();
        }
        if (viewGroup == null) {
            relativeLayout.addView(c, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(c, layoutParams);
        }
        com.inmobi.media.N1 n14 = this.k;
        if (n14 != null) {
            n14.d();
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2421g1
    public final void a() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.a(str, "onAdDismissed " + this);
        }
        this.f5001a = (byte) 0;
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            java.lang.String str2 = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            c2799u92.d(str2, "AdManager state - CREATED");
        }
        com.inmobi.media.C2799u9 c2799u93 = this.f;
        if (c2799u93 != null) {
            c2799u93.a();
        }
        super.a();
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2421g1
    public final void a(com.inmobi.ads.AdMetaInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.a(str, "onAdDisplayed");
        }
        super.a(info);
        com.inmobi.media.AbstractC2551l1 f = f();
        if (f != null) {
            f.S();
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2421g1
    public final void a(com.inmobi.media.AbstractC2551l1 abstractC2551l1, com.inmobi.ads.InMobiAdRequestStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.b(str, com.ironsource.Vf.b);
        }
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            c2799u92.a();
        }
    }

    public static final void a(com.inmobi.media.W1 w1) {
        com.inmobi.media.C2799u9 c2799u9 = w1.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.a(str, "callback - onAdDisplayFailed");
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = w1.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        com.inmobi.media.C2799u9 c2799u92 = w1.f;
        if (c2799u92 != null) {
            c2799u92.a();
        }
    }

    public final void a(final com.inmobi.ads.InMobiAudio audio) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audio, "audio");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.a(str, "show called");
        }
        try {
            if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                b(audio);
            } else {
                this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.W1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.inmobi.media.W1.a(com.inmobi.media.W1.this, audio);
                    }
                });
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.N1 n1 = this.k;
            if (n1 != null) {
                n1.f((short) 26);
            }
            java.lang.String str2 = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            com.inmobi.media.Sb.a((byte) 1, str2, "Unable to show ad; SDK encountered an unexpected error");
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                c2799u92.b(str2, "Show failed with unexpected error: " + e.getMessage());
            }
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
        }
    }

    @Override // com.inmobi.media.Uk
    public final void a(short s) {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            java.lang.String str = com.inmobi.media.X1.f5043a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            c2799u9.b(str, "submitAdLoadDroppedAtSDK " + this);
        }
        com.inmobi.media.N1 n1 = this.k;
        if (n1 != null) {
            n1.b(s);
        }
    }

    public final void a(android.content.Context context, com.inmobi.media.Sg pubSettings, java.lang.String adSize) {
        java.lang.String m10Context;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
        java.lang.String str2 = com.inmobi.media.X1.f5043a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("audio", "mAdType");
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
            com.inmobi.media.C2816v0 c2816v0 = new com.inmobi.media.C2816v0(j, str, "audio", str4);
            c2816v0.d = str3;
            c2816v0.c = map;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "<set-?>");
            c2816v0.h = adSize;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m10Context, "<set-?>");
            c2816v0.i = m10Context;
            c2816v0.g = uuid;
            c2816v0.j = z;
            c2816v0.k = str5;
            com.inmobi.media.N1 n1 = this.h;
            if (n1 != null && this.i != null) {
                n1.a(context, c2816v0, this);
                com.inmobi.media.N1 n12 = this.i;
                if (n12 != null) {
                    n12.a(context, c2816v0, this);
                }
            } else {
                this.h = new com.inmobi.media.N1(context, c2816v0, this);
                this.i = new com.inmobi.media.N1(context, c2816v0, this);
                this.k = this.h;
            }
            java.lang.String str6 = pubSettings.g;
            if (str6 != null) {
                com.inmobi.media.C2799u9 c2799u9 = this.f;
                if (c2799u9 != null) {
                    c2799u9.a();
                }
                com.inmobi.media.C2799u9 a2 = com.inmobi.media.Sh.a("audio", str6);
                this.f = a2;
                if (a2 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                    a2.a(str2, "adding audioAdUnit1 to reference tracker");
                }
                com.inmobi.media.N1 n13 = this.h;
                kotlin.jvm.internal.Intrinsics.checkNotNull(n13);
                com.inmobi.media.Sh.a(n13, this.f);
                com.inmobi.media.C2799u9 c2799u92 = this.f;
                if (c2799u92 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                    c2799u92.a(str2, "adding audioAdUnit2 to reference tracker");
                }
                com.inmobi.media.N1 n14 = this.i;
                kotlin.jvm.internal.Intrinsics.checkNotNull(n14);
                com.inmobi.media.Sh.a(n14, this.f);
                return;
            }
            return;
        }
        throw new java.lang.IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
    }

    public static final void a(com.inmobi.media.W1 w1, android.widget.RelativeLayout relativeLayout) {
        w1.b(relativeLayout);
    }
}
