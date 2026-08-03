package com.inmobi.media;

/* renamed from: com.inmobi.media.ra, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2718ra extends com.inmobi.ads.controllers.PublisherCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference<com.inmobi.ads.InMobiInterstitial> f5424a;

    public C2718ra(com.inmobi.ads.InMobiInterstitial interstitial) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        this.f5424a = new java.lang.ref.WeakReference<>(interstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(java.util.Map<java.lang.Object, ? extends java.lang.Object> params) {
        com.inmobi.media.AbstractC2640oa mPubListener$media_release;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        com.inmobi.ads.InMobiInterstitial inMobiInterstitial = this.f5424a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, params);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        com.inmobi.media.AbstractC2640oa mPubListener$media_release;
        com.inmobi.ads.InMobiInterstitial ad = this.f5424a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        ((com.inmobi.media.C2666pa) mPubListener$media_release).f5387a.onAdDismissed(ad);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        com.inmobi.media.AbstractC2640oa mPubListener$media_release;
        com.inmobi.ads.InMobiInterstitial ad = this.f5424a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        ((com.inmobi.media.C2666pa) mPubListener$media_release).f5387a.onAdDisplayFailed(ad);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(com.inmobi.ads.AdMetaInfo info) {
        com.inmobi.media.AbstractC2640oa mPubListener$media_release;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        com.inmobi.ads.InMobiInterstitial ad = this.f5424a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        ((com.inmobi.media.C2666pa) mPubListener$media_release).f5387a.onAdDisplayed(ad, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(com.inmobi.ads.InMobiAdRequestStatus status) {
        com.inmobi.media.AbstractC2640oa mPubListener$media_release;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        com.inmobi.ads.InMobiInterstitial ad = this.f5424a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        ((com.inmobi.media.C2666pa) mPubListener$media_release).f5387a.onAdFetchFailed(ad, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(com.inmobi.ads.AdMetaInfo info) {
        com.inmobi.media.AbstractC2640oa mPubListener$media_release;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        com.inmobi.ads.InMobiInterstitial inMobiInterstitial = this.f5424a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(com.inmobi.media.C2888xk c2888xk) {
        com.inmobi.ads.InMobiInterstitial ad = this.f5424a.get();
        com.inmobi.media.AbstractC2640oa mPubListener$media_release = ad != null ? ad.getMPubListener$media_release() : null;
        if (mPubListener$media_release == null) {
            if (c2888xk != null) {
                c2888xk.b();
            }
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
            ((com.inmobi.media.C2666pa) mPubListener$media_release).f5387a.onAdImpression(ad);
            if (c2888xk != null) {
                c2888xk.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(com.inmobi.ads.InMobiAdRequestStatus status) {
        com.inmobi.media.AbstractC2640oa mPubListener$media_release;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        com.inmobi.ads.InMobiInterstitial inMobiInterstitial = this.f5424a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(com.inmobi.ads.AdMetaInfo info) {
        com.inmobi.media.AbstractC2640oa mPubListener$media_release;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        com.inmobi.ads.InMobiInterstitial inMobiInterstitial = this.f5424a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.b(inMobiInterstitial, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdWillDisplay() {
        com.inmobi.media.AbstractC2640oa mPubListener$media_release;
        com.inmobi.ads.InMobiInterstitial ad = this.f5424a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        ((com.inmobi.media.C2666pa) mPubListener$media_release).f5387a.onAdWillDisplay(ad);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(java.lang.String log) {
        com.inmobi.media.AbstractC2640oa mPubListener$media_release;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log, "log");
        com.inmobi.ads.InMobiInterstitial inMobiInterstitial = this.f5424a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, log);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] request) {
        com.inmobi.media.AbstractC2640oa mPubListener$media_release;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        com.inmobi.ads.InMobiInterstitial inMobiInterstitial = this.f5424a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((com.inmobi.media.C2666pa) mPubListener$media_release).f5387a.onRequestPayloadCreated(request);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(com.inmobi.ads.InMobiAdRequestStatus status) {
        com.inmobi.media.AbstractC2640oa mPubListener$media_release;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "reason");
        com.inmobi.ads.InMobiInterstitial inMobiInterstitial = this.f5424a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        ((com.inmobi.media.C2666pa) mPubListener$media_release).f5387a.onRequestPayloadCreationFailed(status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(java.util.Map<java.lang.Object, ? extends java.lang.Object> rewards) {
        com.inmobi.media.AbstractC2640oa mPubListener$media_release;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewards, "rewards");
        com.inmobi.ads.InMobiInterstitial ad = this.f5424a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewards, "rewards");
        ((com.inmobi.media.C2666pa) mPubListener$media_release).f5387a.onRewardsUnlocked(ad, rewards);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        com.inmobi.media.AbstractC2640oa mPubListener$media_release;
        com.inmobi.ads.InMobiInterstitial ad = this.f5424a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        ((com.inmobi.media.C2666pa) mPubListener$media_release).f5387a.onUserLeftApplication(ad);
    }
}
