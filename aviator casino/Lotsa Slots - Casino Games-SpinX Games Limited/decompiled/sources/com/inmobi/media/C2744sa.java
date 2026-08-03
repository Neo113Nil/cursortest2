package com.inmobi.media;

/* renamed from: com.inmobi.media.sa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2744sa extends com.inmobi.media.Uk {
    public static final /* synthetic */ int j = 0;
    public com.inmobi.media.C2693qa h;
    public boolean i;

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2421g1
    public final void a() {
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.sa$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C2744sa.a(com.inmobi.media.C2744sa.this);
            }
        });
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            c2799u9.d("InterstitialUnifiedAdManager", "AdManager state - CREATED");
        }
        this.f5001a = (byte) 0;
        this.b = null;
        com.inmobi.media.C2693qa c2693qa = this.h;
        if (c2693qa != null) {
            c2693qa.d();
        }
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            c2799u92.a();
        }
    }

    public final void b(com.inmobi.ads.controllers.PublisherCallbacks callbacks) {
        com.inmobi.media.C2693qa c2693qa;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        if (this.c == null) {
            this.c = callbacks;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.b, java.lang.Boolean.FALSE)) {
            com.inmobi.media.C2693qa c2693qa2 = this.h;
            if (c2693qa2 != null) {
                c2693qa2.b((short) 2006);
            }
            callbacks.onAdLoadFailed(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            com.inmobi.media.C2799u9 c2799u9 = this.f;
            if (c2799u9 != null) {
                c2799u9.b("InMobi", "Cannot call load() API after calling load(byte[])");
            }
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "Cannot call load() API after calling load(byte[])");
            return;
        }
        if (this.i) {
            com.inmobi.media.C2693qa c2693qa3 = this.h;
            if (c2693qa3 != null) {
                c2693qa3.b((short) 2004);
            }
            callbacks.onAdLoadFailed(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                c2799u92.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            return;
        }
        this.b = java.lang.Boolean.TRUE;
        com.inmobi.media.C2693qa c2693qa4 = this.h;
        if (c2693qa4 == null || !a("InMobi", java.lang.String.valueOf(c2693qa4.l), callbacks) || (c2693qa = this.h) == null) {
            return;
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = this.c;
        if (c2693qa.d((publisherCallbacks == null || publisherCallbacks.getType() != 1) ? (byte) 1 : (byte) 2)) {
            this.f5001a = (byte) 1;
            com.inmobi.media.C2799u9 c2799u93 = this.f;
            if (c2799u93 != null) {
                com.inmobi.media.C2693qa c2693qa5 = this.h;
                c2799u93.c("InterstitialUnifiedAdManager", "Fetching an Interstitial ad for placement id: " + (c2693qa5 != null ? c2693qa5.l : null));
            }
            com.inmobi.media.C2693qa c2693qa6 = this.h;
            com.inmobi.media.Sb.a((byte) 2, "InterstitialUnifiedAdManager", "Fetching an Interstitial ad for placement id: " + (c2693qa6 != null ? c2693qa6.l : null));
            com.inmobi.media.C2693qa c2693qa7 = this.h;
            if (c2693qa7 != null) {
                c2693qa7.e(this);
            }
            com.inmobi.media.C2693qa c2693qa8 = this.h;
            if (c2693qa8 != null) {
                c2693qa8.D();
            }
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2421g1
    public final void c(com.inmobi.ads.AdMetaInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            c2799u9.c("InterstitialUnifiedAdManager", "onAdLoadSucceeded");
        }
        if (this.h != null) {
            d(info);
            return;
        }
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            c2799u92.b("InterstitialUnifiedAdManager", "adUnit is null");
        }
        com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus = new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        byte b = this.f5001a;
        if (b == 8 || b == 1) {
            b((com.inmobi.media.AbstractC2551l1) null, inMobiAdRequestStatus);
            return;
        }
        if (b == 2) {
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "Unable to Show Ad, canShowAd Failed");
            com.inmobi.media.C2799u9 c2799u93 = this.f;
            if (c2799u93 != null) {
                c2799u93.b("InMobi", "Unable to Show Ad, canShowAd Failed");
            }
            a(true, (short) 0);
            return;
        }
        if (b != 5) {
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "Invalid state passed in fireErrorScenarioCallback");
            com.inmobi.media.C2799u9 c2799u94 = this.f;
            if (c2799u94 != null) {
                c2799u94.b("InMobi", "Invalid state passed in fireErrorScenarioCallback");
                return;
            }
            return;
        }
        com.inmobi.media.Sb.a((byte) 1, "InMobi", "Ad will be dismissed, Internal error");
        com.inmobi.media.C2799u9 c2799u95 = this.f;
        if (c2799u95 != null) {
            c2799u95.b("InMobi", "Ad will be dismissed, Internal error");
        }
        com.inmobi.media.C2693qa c2693qa = this.h;
        if (c2693qa != null) {
            c2693qa.b((byte) 4);
        }
        a();
    }

    public final void d(final com.inmobi.ads.AdMetaInfo adMetaInfo) {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            c2799u9.c("InterstitialUnifiedAdManager", com.ironsource.Ad.f);
        }
        super.c(adMetaInfo);
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            c2799u92.d("InterstitialUnifiedAdManager", "AdManager state - LOADED");
        }
        this.f5001a = (byte) 2;
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.sa$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C2744sa.b(com.inmobi.media.C2744sa.this, adMetaInfo);
            }
        });
    }

    @Override // com.inmobi.media.Uk
    public final com.inmobi.media.AbstractC2551l1 f() {
        return this.h;
    }

    public final boolean h() {
        byte b = this.f5001a;
        if (b == 1) {
            com.inmobi.media.C2799u9 c2799u9 = this.f;
            if (c2799u9 != null) {
                c2799u9.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a(false, (short) 2147);
            return false;
        }
        if (b == 7) {
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                c2799u92.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            a(false, (short) 2168);
            return false;
        }
        if (b != 5) {
            if (!this.i) {
                return true;
            }
            com.inmobi.media.C2693qa c2693qa = this.h;
            if (c2693qa != null) {
                c2693qa.d((short) 2149);
            }
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            com.inmobi.media.C2799u9 c2799u93 = this.f;
            if (c2799u93 != null) {
                c2799u93.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            return false;
        }
        com.inmobi.media.C2693qa c2693qa2 = this.h;
        if (c2693qa2 != null) {
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + c2693qa2.l);
            com.inmobi.media.C2799u9 c2799u94 = this.f;
            if (c2799u94 != null) {
                com.inmobi.media.C2693qa c2693qa3 = this.h;
                c2799u94.b("InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + (c2693qa3 != null ? c2693qa3.l : null));
            }
            a(false, (short) 2148);
        }
        return false;
    }

    public final void i() {
        com.inmobi.media.C2693qa c2693qa;
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            c2799u9.a("InterstitialUnifiedAdManager", "render");
        }
        com.inmobi.media.C2693qa c2693qa2 = this.h;
        if (c2693qa2 == null) {
            throw new java.lang.IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (c2693qa2.b == 4 && this.e != null) {
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                c2799u92.c("InterstitialUnifiedAdManager", "already in ready state");
            }
            com.inmobi.ads.AdMetaInfo adMetaInfo = this.e;
            kotlin.jvm.internal.Intrinsics.checkNotNull(adMetaInfo);
            d(adMetaInfo);
            return;
        }
        if (this.i) {
            com.inmobi.media.C2799u9 c2799u93 = this.f;
            if (c2799u93 != null) {
                c2799u93.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            b(this.h, new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            com.inmobi.media.C2693qa c2693qa3 = this.h;
            if (c2693qa3 != null) {
                c2693qa3.c((short) 2128);
                return;
            }
            return;
        }
        com.inmobi.media.C2693qa c2693qa4 = this.h;
        com.inmobi.media.ads.network.common.model.Ad b = c2693qa4 != null ? c2693qa4.b(0) : null;
        com.inmobi.media.C2693qa c2693qa5 = this.h;
        boolean a2 = a("InMobi", java.lang.String.valueOf(c2693qa5 != null ? c2693qa5.l : null));
        if (b == null) {
            com.inmobi.media.C2799u9 c2799u94 = this.f;
            if (c2799u94 != null) {
                c2799u94.b("InterstitialUnifiedAdManager", "ad is null. failure");
            }
            b(this.h, new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            com.inmobi.media.C2693qa c2693qa6 = this.h;
            if (c2693qa6 != null) {
                c2693qa6.b((short) 2166);
            }
        }
        if (this.e == null) {
            com.inmobi.media.C2799u9 c2799u95 = this.f;
            if (c2799u95 != null) {
                c2799u95.b("InterstitialUnifiedAdManager", "ad meta info is null. failure");
            }
            b(this.h, new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            com.inmobi.media.C2693qa c2693qa7 = this.h;
            if (c2693qa7 != null) {
                c2693qa7.b((short) 2167);
            }
        }
        if (b == null || !a2) {
            return;
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = this.c;
        if (publisherCallbacks != null && publisherCallbacks.getType() == 1 && (c2693qa = this.h) != null) {
            c2693qa.d((byte) 1);
        }
        com.inmobi.media.C2799u9 c2799u96 = this.f;
        if (c2799u96 != null) {
            c2799u96.d("InterstitialUnifiedAdManager", "AdManager state - LOADING_INTO_VIEW");
        }
        this.f5001a = (byte) 8;
        com.inmobi.media.C2693qa c2693qa8 = this.h;
        if (c2693qa8 != null) {
            c2693qa8.Y();
        }
    }

    @Override // com.inmobi.media.AbstractC2421g1
    public final void d() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            c2799u9.a("InterstitialUnifiedAdManager", "showTimeOut");
        }
        com.inmobi.media.C2693qa c2693qa = this.h;
        if (c2693qa != null) {
            if (c2693qa.b != 6 && c2693qa.b != 7) {
                a(true, (short) 2159);
            } else {
                c2693qa.f(this);
            }
        }
    }

    public static final void a(com.inmobi.media.C2744sa c2744sa) {
        com.inmobi.media.C2799u9 c2799u9 = c2744sa.f;
        if (c2799u9 != null) {
            c2799u9.a("InterstitialUnifiedAdManager", "callback - onAdDismissed");
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = c2744sa.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
        }
    }

    public static final void a(com.inmobi.media.C2744sa c2744sa, com.inmobi.ads.AdMetaInfo adMetaInfo) {
        com.inmobi.media.C2799u9 c2799u9 = c2744sa.f;
        if (c2799u9 != null) {
            c2799u9.a("InterstitialUnifiedAdManager", "callback - onAdFetchSuccessful");
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = c2744sa.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
        }
    }

    public final void a(boolean z, short s) {
        com.inmobi.media.C2693qa c2693qa;
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            c2799u9.c("InterstitialUnifiedAdManager", "onShowFailure");
        }
        if (s != 0 && (c2693qa = this.h) != null) {
            c2693qa.d(s);
        }
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.sa$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C2744sa.c(com.inmobi.media.C2744sa.this);
            }
        });
        if (z) {
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                c2799u92.d("InterstitialUnifiedAdManager", "AdManager state - FAILED");
            }
            this.f5001a = (byte) 6;
            com.inmobi.media.C2693qa c2693qa2 = this.h;
            if (c2693qa2 != null) {
                c2693qa2.d();
            }
        }
        com.inmobi.media.C2799u9 c2799u93 = this.f;
        if (c2799u93 != null) {
            c2799u93.a();
        }
    }

    public static final void c(com.inmobi.media.C2744sa c2744sa) {
        com.inmobi.media.C2799u9 c2799u9 = c2744sa.f;
        if (c2799u9 != null) {
            c2799u9.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = c2744sa.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        com.inmobi.media.C2799u9 c2799u92 = c2744sa.f;
        if (c2799u92 != null) {
            c2799u92.a();
        }
        com.inmobi.media.C2693qa c2693qa = c2744sa.h;
        if (c2693qa != null) {
            c2693qa.b((byte) 4);
        }
    }

    public final void a(android.app.Activity activity) {
        com.inmobi.media.C2440gk c2440gk;
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            c2799u9.a("InterstitialUnifiedAdManager", com.ironsource.C3232q2.v);
        }
        com.inmobi.media.C2693qa c2693qa = this.h;
        if (c2693qa != null && (c2440gk = c2693qa.H) != null) {
            c2440gk.b = true;
        }
        if (c2693qa != null) {
            c2693qa.R();
        }
        if (h()) {
            if (!com.inmobi.media.AbstractC2268a7.a()) {
                if (this.h != null) {
                    a(true, (short) 2141);
                    return;
                }
                return;
            }
            com.inmobi.media.C2693qa c2693qa2 = this.h;
            if (c2693qa2 == null || !c2693qa2.d((byte) 4)) {
                return;
            }
            this.i = true;
            com.inmobi.media.C2693qa c2693qa3 = this.h;
            if (c2693qa3 != null) {
                c2693qa3.a(this, activity);
            }
        }
    }

    public final void a(com.inmobi.media.Sg pubSettings, android.content.Context context, boolean z, java.lang.String logType) {
        com.inmobi.media.C2693qa c2693qa;
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi j2;
        com.inmobi.media.C2693qa c2693qa2;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logType, "logType");
        if (this.h == null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("int", "mAdType");
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            long j3 = pubSettings.f4958a;
            java.lang.String str2 = pubSettings.b;
            java.util.Map map = pubSettings.c;
            java.lang.String str3 = pubSettings.g;
            java.lang.String str4 = pubSettings.e;
            if (j3 != Long.MIN_VALUE) {
                com.inmobi.media.C2816v0 c2816v0 = new com.inmobi.media.C2816v0(j3, (map == null || (str = (java.lang.String) map.get("tp")) == null) ? "" : str, "int", str3);
                c2816v0.d = str2;
                c2816v0.c = map;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "<set-?>");
                c2816v0.h = "";
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("activity", "<set-?>");
                c2816v0.i = "activity";
                c2816v0.g = uuid;
                c2816v0.j = false;
                c2816v0.k = str4;
                this.h = new com.inmobi.media.C2693qa(context, c2816v0, this);
            } else {
                throw new java.lang.IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
            }
        }
        if (z) {
            g();
        }
        java.lang.String str5 = pubSettings.g;
        if (str5 != null) {
            com.inmobi.media.C2799u9 c2799u9 = this.f;
            if (c2799u9 != null) {
                c2799u9.a();
            }
            com.inmobi.media.C2799u9 a2 = com.inmobi.media.Sh.a(logType, str5);
            this.f = a2;
            if (a2 != null) {
                a2.a("InterstitialUnifiedAdManager", "Ad Unit initialised");
            }
            com.inmobi.media.C2799u9 logger = this.f;
            if (logger != null && (c2693qa2 = this.h) != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
                c2693qa2.i = logger;
                com.inmobi.media.C2287b0 c2287b0 = c2693qa2.u;
                c2287b0.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
                c2287b0.f = logger;
            }
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                c2799u92.a("InterstitialUnifiedAdManager", "adding interstitialAdUnit in referenceTracker");
            }
            com.inmobi.media.C2693qa c2693qa3 = this.h;
            kotlin.jvm.internal.Intrinsics.checkNotNull(c2693qa3);
            com.inmobi.media.Sh.a(c2693qa3, this.f);
        }
        com.inmobi.media.C2693qa c2693qa4 = this.h;
        if (c2693qa4 != null) {
            c2693qa4.a(context);
        }
        com.inmobi.media.C2693qa c2693qa5 = this.h;
        if (c2693qa5 != null) {
            c2693qa5.a(pubSettings.c);
        }
        com.inmobi.media.C2693qa c2693qa6 = this.h;
        if (c2693qa6 != null) {
            c2693qa6.L();
        }
        if (pubSettings.d && (c2693qa = this.h) != null && (j2 = c2693qa.j()) != null) {
            c2693qa.G = true;
            j2.l();
        }
        com.inmobi.ads.WatermarkData watermarkData = this.g;
        if (watermarkData != null) {
            com.inmobi.media.C2693qa c2693qa7 = this.h;
            if (c2693qa7 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
                c2693qa7.A = watermarkData;
                com.inmobi.media.GestureDetectorOnGestureListenerC2675pi r = c2693qa7.r();
                if (r != null) {
                    r.setWatermark(watermarkData);
                }
            }
            com.inmobi.media.C2799u9 c2799u93 = this.f;
            if (c2799u93 != null) {
                c2799u93.c("InterstitialUnifiedAdManager", "setting up watermark");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC2421g1
    public final void b() {
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.sa$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C2744sa.b(com.inmobi.media.C2744sa.this);
            }
        });
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            c2799u9.d("InterstitialUnifiedAdManager", "AdManager state - DISPLAY_FAILED");
        }
        this.f5001a = (byte) 6;
        com.inmobi.media.C2693qa c2693qa = this.h;
        if (c2693qa != null) {
            c2693qa.d();
        }
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            c2799u92.a();
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2421g1
    public final void b(final com.inmobi.ads.AdMetaInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            c2799u9.c("InterstitialUnifiedAdManager", "onAdFetchSuccess");
        }
        this.e = info;
        if (this.h == null) {
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                c2799u92.b("InterstitialUnifiedAdManager", "onAdFetchSuccess - adUnit is null - fail");
            }
            a((com.inmobi.media.AbstractC2551l1) null, new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            a((short) 2190);
            return;
        }
        super.b(info);
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.sa$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C2744sa.a(com.inmobi.media.C2744sa.this, info);
            }
        });
    }

    public static final void b(com.inmobi.media.C2744sa c2744sa) {
        com.inmobi.media.C2799u9 c2799u9 = c2744sa.f;
        if (c2799u9 != null) {
            c2799u9.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = c2744sa.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        com.inmobi.media.C2693qa c2693qa = c2744sa.h;
        if (c2693qa != null) {
            c2693qa.b((byte) 4);
        }
    }

    public static final void b(com.inmobi.media.C2744sa c2744sa, com.inmobi.ads.AdMetaInfo adMetaInfo) {
        com.inmobi.media.C2799u9 c2799u9 = c2744sa.f;
        if (c2799u9 != null) {
            c2799u9.a("InterstitialUnifiedAdManager", "callback - onAdLoadSucceeded");
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = c2744sa.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2421g1
    public final void a(com.inmobi.ads.AdMetaInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        super.a(info);
        com.inmobi.media.C2693qa c2693qa = this.h;
        if (c2693qa != null) {
            c2693qa.S();
        }
        this.i = false;
    }

    @Override // com.inmobi.media.Uk
    public final void a(com.inmobi.ads.WatermarkData watermarkData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        super.a(watermarkData);
        com.inmobi.media.C2693qa c2693qa = this.h;
        if (c2693qa != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
            c2693qa.A = watermarkData;
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi r = c2693qa.r();
            if (r != null) {
                r.setWatermark(watermarkData);
            }
        }
    }
}
