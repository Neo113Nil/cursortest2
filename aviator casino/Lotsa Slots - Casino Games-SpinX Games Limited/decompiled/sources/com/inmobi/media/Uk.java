package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Uk extends com.inmobi.media.AbstractC2421g1 {

    /* renamed from: a, reason: collision with root package name */
    public byte f5001a;
    public java.lang.Boolean b;
    public com.inmobi.ads.controllers.PublisherCallbacks c;
    public final android.os.Handler d = new android.os.Handler(android.os.Looper.getMainLooper());
    public com.inmobi.ads.AdMetaInfo e;
    public com.inmobi.media.C2799u9 f;
    public com.inmobi.ads.WatermarkData g;

    public static final void a(com.inmobi.media.AbstractC2551l1 abstractC2551l1, com.inmobi.media.Uk uk, com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (abstractC2551l1 != null) {
            abstractC2551l1.b((byte) 1);
        }
        com.inmobi.media.C2799u9 c2799u9 = uk.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.a("Uk", "callback - onAdLoadFailed");
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = uk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadFailed(inMobiAdRequestStatus);
        }
        com.inmobi.media.C2799u9 c2799u92 = uk.f;
        if (c2799u92 != null) {
            c2799u92.a();
        }
    }

    public final void b(final com.inmobi.media.AbstractC2551l1 abstractC2551l1, final com.inmobi.ads.InMobiAdRequestStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.c("Uk", "onLoadFailure " + this);
        }
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u92.d("Uk", "AdManager state - LOAD_FAILED");
        }
        this.f5001a = (byte) 3;
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.Uk$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Uk.a(com.inmobi.media.AbstractC2551l1.this, this, status);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC2421g1
    public final void c() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.c("Uk", "onAdWillShow " + this);
        }
        byte b = this.f5001a;
        if (b == 4 || b == 5) {
            return;
        }
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.Uk$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Uk.b(com.inmobi.media.Uk.this);
            }
        });
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u92.d("Uk", "AdManager state - WILL_DISPLAY");
        }
        this.f5001a = (byte) 4;
    }

    @Override // com.inmobi.media.AbstractC2421g1
    public final void e() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.c("Uk", "onUserLeftApplication " + this);
        }
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.Uk$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Uk.c(com.inmobi.media.Uk.this);
            }
        });
    }

    public abstract com.inmobi.media.AbstractC2551l1 f();

    public void g() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.c("Uk", "submitAdLoadCalled " + this);
        }
        com.inmobi.media.AbstractC2551l1 f = f();
        if (f != null) {
            f.P();
        }
    }

    @Override // com.inmobi.media.AbstractC2421g1
    public final void a(final com.inmobi.ads.InMobiAdRequestStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.c("Uk", "onAdFetchFailed " + this);
        }
        this.f5001a = (byte) 3;
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.Uk$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Uk.a(com.inmobi.media.Uk.this, status);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC2421g1
    public void b(com.inmobi.ads.AdMetaInfo info) {
        com.inmobi.media.AbstractC2551l1 f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.c("Uk", "onAdFetchSuccess " + this);
        }
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u92.d("Uk", "AdManager state - FETCHED");
        }
        this.f5001a = (byte) 7;
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = this.c;
        if (publisherCallbacks == null || publisherCallbacks.getType() != 1 || (f = f()) == null) {
            return;
        }
        f.b((byte) 2);
    }

    public static final void a(com.inmobi.media.Uk uk, com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus) {
        com.inmobi.media.C2799u9 c2799u9 = uk.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.a("Uk", "callback - onAdFetchFailed");
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = uk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchFailed(inMobiAdRequestStatus);
        }
        com.inmobi.media.C2799u9 c2799u92 = uk.f;
        if (c2799u92 != null) {
            c2799u92.a();
        }
    }

    @Override // com.inmobi.media.AbstractC2421g1
    public void c(com.inmobi.ads.AdMetaInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.c("Uk", "onAdLoadSucceeded " + this);
        }
        this.e = info;
        com.inmobi.media.AbstractC2551l1 f = f();
        if (f != null) {
            f.b((byte) 1);
        }
    }

    public static final void b(com.inmobi.media.Uk uk) {
        com.inmobi.media.C2799u9 c2799u9 = uk.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.a("Uk", "callback - onAdWillShow");
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = uk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdWillDisplay();
        }
    }

    @Override // com.inmobi.media.AbstractC2421g1
    public void a(final com.inmobi.ads.AdMetaInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.c("Uk", "onAdDisplayed " + this);
        }
        if (this.f5001a != 5) {
            this.e = info;
            this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.Uk$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.Uk.a(com.inmobi.media.Uk.this, info);
                }
            });
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
                c2799u92.d("Uk", "AdManager state - DISPLAYED");
            }
            this.f5001a = (byte) 5;
        }
    }

    public static final void c(com.inmobi.media.Uk uk) {
        com.inmobi.media.C2799u9 c2799u9 = uk.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.a("Uk", "callback - onUserLeftApplication");
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = uk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onUserLeftApplication();
        }
    }

    @Override // com.inmobi.media.AbstractC2421g1
    public final void b(final java.util.HashMap rewards) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewards, "rewards");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.c("Uk", "onAdRewardActionCompleted " + this);
        }
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.Uk$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Uk.b(com.inmobi.media.Uk.this, rewards);
            }
        });
    }

    public static final void b(com.inmobi.media.Uk uk, java.util.Map map) {
        com.inmobi.media.C2799u9 c2799u9 = uk.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.a("Uk", "callback - onRewardsUnlocked");
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = uk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onRewardsUnlocked(map);
        }
    }

    public static final void a(com.inmobi.media.Uk uk, com.inmobi.ads.AdMetaInfo adMetaInfo) {
        com.inmobi.media.C2799u9 c2799u9 = uk.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.a("Uk", "callback - onAdDisplayed");
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = uk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayed(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.AbstractC2421g1
    public void a(com.inmobi.media.AbstractC2551l1 abstractC2551l1, com.inmobi.ads.InMobiAdRequestStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.c("Uk", "onAdLoadFailed " + this);
        }
        b(abstractC2551l1, status);
    }

    @Override // com.inmobi.media.AbstractC2421g1
    public final void a(final java.util.HashMap params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.c("Uk", "onAdInteraction " + this);
        }
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.Uk$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Uk.a(com.inmobi.media.Uk.this, params);
            }
        });
    }

    public static final void a(com.inmobi.media.Uk uk, java.util.Map map) {
        com.inmobi.media.C2799u9 c2799u9 = uk.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.a("Uk", "callback - onAdClicked");
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = uk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdClicked(map);
        }
    }

    public final void a(com.inmobi.ads.controllers.PublisherCallbacks callbacks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.a("Uk", "getSignals " + this);
        }
        if (f() != null) {
            this.c = callbacks;
            callbacks.onRequestPayloadCreationFailed(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
        }
    }

    public void a(byte[] bArr, com.inmobi.ads.controllers.PublisherCallbacks callbacks) {
        com.inmobi.media.C2693qa c2693qa;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.c("Uk", "load " + this);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.b, java.lang.Boolean.TRUE)) {
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
                c2799u92.a("Uk", "Cannot call load(byte[]) API after load() API is called");
            }
            com.inmobi.media.C2744sa c2744sa = (com.inmobi.media.C2744sa) this;
            b(c2744sa.h, new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            com.inmobi.media.C2693qa c2693qa2 = c2744sa.h;
            if (c2693qa2 != null) {
                c2693qa2.b((short) 2140);
                return;
            }
            return;
        }
        this.b = java.lang.Boolean.FALSE;
        this.f5001a = (byte) 1;
        com.inmobi.media.C2799u9 logger = this.f;
        if (logger != null && (c2693qa = ((com.inmobi.media.C2744sa) this).h) != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
            c2693qa.i = logger;
            com.inmobi.media.C2287b0 c2287b0 = c2693qa.u;
            c2287b0.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
            c2287b0.f = logger;
        }
        com.inmobi.media.C2744sa c2744sa2 = (com.inmobi.media.C2744sa) this;
        com.inmobi.media.C2693qa c2693qa3 = c2744sa2.h;
        if (c2693qa3 == null || c2693qa3 == null || !c2693qa3.d((byte) 1)) {
            return;
        }
        com.inmobi.media.C2799u9 c2799u93 = this.f;
        if (c2799u93 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u93.a("Uk", "load starting. Started INTERNAL_LOAD_TIMER");
        }
        this.c = callbacks;
        com.inmobi.media.C2693qa c2693qa4 = c2744sa2.h;
        if (c2693qa4 != null) {
            c2693qa4.a(bArr);
        }
    }

    public void a(com.inmobi.ads.WatermarkData watermarkData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.c("Uk", "setWatermark - " + watermarkData.getWatermarkBase64EncodedString());
        }
        this.g = watermarkData;
    }

    public final boolean a(java.lang.String tag, java.lang.String placementString, com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementString, "placementString");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            c2799u9.c(tag, "canProceedToLoad " + this);
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks2 = this.c;
        if (publisherCallbacks2 != null && publisherCallbacks != null && publisherCallbacks2.getType() != publisherCallbacks.getType()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            com.inmobi.media.Sb.a((byte) 1, "Uk", "preload() and load() cannot be called on the same instance, please use a different instance.");
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                c2799u92.b(tag, "preload() and load() cannot be called on the same instance, please use a different instance.");
            }
            com.inmobi.media.AbstractC2551l1 f = f();
            if (f != null) {
                f.b((short) 2005);
            }
            b(f(), new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            return false;
        }
        byte b = this.f5001a;
        if (b == 8) {
            com.inmobi.media.Sb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            com.inmobi.media.C2799u9 c2799u93 = this.f;
            if (c2799u93 != null) {
                c2799u93.b(tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            }
            com.inmobi.media.AbstractC2551l1 f2 = f();
            if (f2 != null) {
                f2.b((short) 2002);
            }
            return false;
        }
        if (b == 1) {
            com.inmobi.media.Sb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            com.inmobi.media.C2799u9 c2799u94 = this.f;
            if (c2799u94 != null) {
                c2799u94.b(tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            }
            com.inmobi.media.AbstractC2551l1 f3 = f();
            if (f3 != null) {
                f3.b((short) 2001);
            }
            return false;
        }
        if (b != 5) {
            return true;
        }
        com.inmobi.media.Sb.a((byte) 1, tag, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + placementString);
        com.inmobi.media.C2799u9 c2799u95 = this.f;
        if (c2799u95 != null) {
            c2799u95.b(tag, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + placementString);
        }
        b(f(), new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
        com.inmobi.media.AbstractC2551l1 f4 = f();
        if (f4 != null) {
            f4.c((short) 2003);
        }
        return false;
    }

    public final boolean a(java.lang.String tag, java.lang.String placementString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementString, "placementString");
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.c("Uk", "canRender " + this);
        }
        byte b = this.f5001a;
        if (b == 1) {
            com.inmobi.media.Sb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            com.inmobi.media.C2799u9 c2799u92 = this.f;
            if (c2799u92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
                c2799u92.b("Uk", "adload in progress");
            }
            com.inmobi.media.AbstractC2551l1 f = f();
            if (f != null) {
                f.c((short) 2129);
            }
            return false;
        }
        if (b == 8) {
            com.inmobi.media.Sb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            com.inmobi.media.C2799u9 c2799u93 = this.f;
            if (c2799u93 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
                c2799u93.b("Uk", "ad loading into view is in progress");
            }
            com.inmobi.media.AbstractC2551l1 f2 = f();
            if (f2 != null) {
                f2.c((short) 2164);
            }
            return false;
        }
        if (b != 5) {
            if (b == 7) {
                return true;
            }
            com.inmobi.media.C2799u9 c2799u94 = this.f;
            if (c2799u94 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
                c2799u94.b("Uk", "ad in illegal state");
            }
            com.inmobi.media.AbstractC2551l1 f3 = f();
            if (f3 != null) {
                f3.c((short) 2165);
            }
            com.inmobi.media.AbstractC2551l1 f4 = f();
            if (f4 != null) {
                f4.K();
            }
            b(f(), new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            throw new java.lang.IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        com.inmobi.media.Sb.a((byte) 1, tag, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + placementString);
        com.inmobi.media.C2799u9 c2799u95 = this.f;
        if (c2799u95 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u95.b("Uk", "ad active before renderAd");
        }
        com.inmobi.media.AbstractC2551l1 f5 = f();
        if (f5 != null) {
            f5.c((short) 2130);
        }
        com.inmobi.media.AbstractC2551l1 f6 = f();
        if (f6 != null) {
            f6.K();
        }
        b(f(), new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
        return false;
    }

    @Override // com.inmobi.media.AbstractC2421g1
    public void a() {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.c("Uk", "onAdDismissed " + this);
        }
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.Uk$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Uk.a(com.inmobi.media.Uk.this);
            }
        });
        com.inmobi.media.C2799u9 c2799u92 = this.f;
        if (c2799u92 != null) {
            c2799u92.a();
        }
    }

    public static final void a(com.inmobi.media.Uk uk) {
        com.inmobi.media.C2799u9 c2799u9 = uk.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.a("Uk", "callback - onAdDismissed");
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = uk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
            return;
        }
        com.inmobi.media.C2799u9 c2799u92 = uk.f;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u92.b("Uk", "callback is null");
        }
    }

    @Override // com.inmobi.media.AbstractC2421g1
    public final void a(final com.inmobi.media.C2888xk c2888xk) {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.c("Uk", "onAdImpression " + this);
        }
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.Uk$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Uk.a(com.inmobi.media.Uk.this, c2888xk);
            }
        });
    }

    public static final void a(com.inmobi.media.Uk uk, com.inmobi.media.C2888xk c2888xk) {
        if (uk.c == null) {
            com.inmobi.media.C2799u9 c2799u9 = uk.f;
            if (c2799u9 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
                c2799u9.b("Uk", "callback is null");
            }
            if (c2888xk != null) {
                c2888xk.b();
                return;
            }
            return;
        }
        com.inmobi.media.C2799u9 c2799u92 = uk.f;
        if (c2799u92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u92.a("Uk", "callback - onAdImpression");
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = uk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdImpression(c2888xk);
        }
    }

    @Override // com.inmobi.media.AbstractC2421g1
    public final void a(final com.inmobi.media.V1 audioStatusInternal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.Uk$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Uk.a(com.inmobi.media.Uk.this, audioStatusInternal);
            }
        });
    }

    public static final void a(com.inmobi.media.Uk uk, com.inmobi.media.V1 v1) {
        com.inmobi.media.C2799u9 c2799u9 = uk.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.a("Uk", "callback - onAudioStatusChanged - " + v1.f5006a);
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = uk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAudioStatusChanged(v1);
        }
    }

    @Override // com.inmobi.media.AbstractC2421g1
    public final void a(final java.lang.String log) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log, "log");
        this.d.post(new java.lang.Runnable() { // from class: com.inmobi.media.Uk$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Uk.a(com.inmobi.media.Uk.this, log);
            }
        });
    }

    public static final void a(com.inmobi.media.Uk uk, java.lang.String str) {
        com.inmobi.media.C2799u9 c2799u9 = uk.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.a("Uk", "callback - onImraidLog");
        }
        com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks = uk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onImraidLog(str);
        }
    }

    public void a(short s) {
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Uk", "TAG");
            c2799u9.c("Uk", "submitAdLoadDroppedAtSDK " + this);
        }
        com.inmobi.media.AbstractC2551l1 f = f();
        if (f != null) {
            f.b(s);
        }
    }
}
