package com.inmobi.media;

/* renamed from: com.inmobi.media.c2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2315c2 extends com.inmobi.ads.controllers.PublisherCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.ref.WeakReference<com.inmobi.ads.InMobiBanner> f5133a;

    public C2315c2(com.inmobi.ads.InMobiBanner banner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(banner, "banner");
        this.f5133a = new java.lang.ref.WeakReference<>(banner);
    }

    public final java.lang.ref.WeakReference<com.inmobi.ads.InMobiBanner> a() {
        return this.f5133a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(java.util.Map<java.lang.Object, ? extends java.lang.Object> params) {
        com.inmobi.media.Y1 mPubListener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        com.inmobi.ads.InMobiBanner inMobiBanner = this.f5133a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, params);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        com.inmobi.ads.InMobiBanner ad = this.f5133a.get();
        if (ad == null) {
            return;
        }
        com.inmobi.media.Y1 mPubListener = ad.getMPubListener();
        if (mPubListener != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
            ((com.inmobi.media.Z1) mPubListener).f5076a.onAdDismissed(ad);
        }
        ad.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(com.inmobi.ads.AdMetaInfo info) {
        com.inmobi.media.Y1 mPubListener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        com.inmobi.ads.InMobiBanner ad = this.f5133a.get();
        if (ad == null || (mPubListener = ad.getMPubListener()) == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        ((com.inmobi.media.Z1) mPubListener).f5076a.onAdDisplayed(ad);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(com.inmobi.ads.InMobiAdRequestStatus status) {
        com.inmobi.media.Y1 mPubListener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        com.inmobi.ads.InMobiBanner ad = this.f5133a.get();
        if (ad == null || (mPubListener = ad.getMPubListener()) == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        ((com.inmobi.media.Z1) mPubListener).f5076a.onAdFetchFailed(ad, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(com.inmobi.ads.AdMetaInfo info) {
        com.inmobi.media.Y1 mPubListener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        com.inmobi.ads.InMobiBanner inMobiBanner = this.f5133a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(com.inmobi.media.C2888xk c2888xk) {
        com.inmobi.ads.InMobiBanner ad = this.f5133a.get();
        com.inmobi.media.Y1 mPubListener = ad != null ? ad.getMPubListener() : null;
        if (mPubListener == null) {
            if (c2888xk != null) {
                c2888xk.b();
            }
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
            ((com.inmobi.media.Z1) mPubListener).f5076a.onAdImpression(ad);
            if (c2888xk != null) {
                c2888xk.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(com.inmobi.ads.InMobiAdRequestStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("c2", "getSimpleName(...)");
        com.inmobi.ads.InMobiBanner inMobiBanner = this.f5133a.get();
        if (inMobiBanner == null) {
            return;
        }
        com.inmobi.media.Y1 mPubListener = inMobiBanner.getMPubListener();
        if (mPubListener != null) {
            mPubListener.a(inMobiBanner, status);
        }
        inMobiBanner.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(com.inmobi.ads.AdMetaInfo info) {
        com.inmobi.media.C2368e2 mAdManager;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        com.inmobi.ads.InMobiBanner inMobiBanner = this.f5133a.get();
        if (inMobiBanner == null || (mAdManager = inMobiBanner.getMAdManager()) == null) {
            return;
        }
        if (!mAdManager.l()) {
            mAdManager.h();
            inMobiBanner.swapAdUnitsAndDisplayAd$media_release();
            com.inmobi.media.Y1 mPubListener = inMobiBanner.getMPubListener();
            if (mPubListener != null) {
                mPubListener.b(inMobiBanner, info);
            }
            inMobiBanner.scheduleRefresh$media_release();
            return;
        }
        if (mAdManager.l()) {
            com.inmobi.media.AbstractC2551l1 f = mAdManager.f();
            if (f != null) {
                f.c((short) 2173);
                return;
            }
            return;
        }
        com.inmobi.media.AbstractC2551l1 f2 = mAdManager.f();
        if (f2 != null) {
            f2.c((short) 2174);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAudioStatusChanged(com.inmobi.media.V1 item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "audioStatusInternal");
        com.inmobi.ads.InMobiBanner inMobiBanner = this.f5133a.get();
        if (inMobiBanner == null) {
            return;
        }
        inMobiBanner.setAudioStatusInternal$media_release(item);
        com.inmobi.ads.banner.AudioListener mAudioListener = inMobiBanner.getMAudioListener();
        if (mAudioListener != null) {
            com.inmobi.media.V1.b.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
            int ordinal = item.ordinal();
            mAudioListener.onAudioStatusChanged(inMobiBanner, ordinal != 1 ? ordinal != 2 ? com.inmobi.ads.AudioStatus.COMPLETED : com.inmobi.ads.AudioStatus.PAUSED : com.inmobi.ads.AudioStatus.PLAYING);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(java.lang.String log) {
        com.inmobi.media.Y1 mPubListener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log, "log");
        com.inmobi.ads.InMobiBanner inMobiBanner = this.f5133a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, log);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] request) {
        com.inmobi.media.Y1 mPubListener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        com.inmobi.ads.InMobiBanner inMobiBanner = this.f5133a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        ((com.inmobi.media.Z1) mPubListener).f5076a.onRequestPayloadCreated(request);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(com.inmobi.ads.InMobiAdRequestStatus status) {
        com.inmobi.media.Y1 mPubListener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "reason");
        com.inmobi.ads.InMobiBanner inMobiBanner = this.f5133a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        ((com.inmobi.media.Z1) mPubListener).f5076a.onRequestPayloadCreationFailed(status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(java.util.Map<java.lang.Object, ? extends java.lang.Object> rewards) {
        com.inmobi.media.Y1 mPubListener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewards, "rewards");
        com.inmobi.ads.InMobiBanner ad = this.f5133a.get();
        if (ad == null || (mPubListener = ad.getMPubListener()) == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewards, "rewards");
        ((com.inmobi.media.Z1) mPubListener).f5076a.onRewardsUnlocked(ad, rewards);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        com.inmobi.media.Y1 mPubListener;
        com.inmobi.ads.InMobiBanner ad = this.f5133a.get();
        if (ad == null || (mPubListener = ad.getMPubListener()) == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        ((com.inmobi.media.Z1) mPubListener).f5076a.onUserLeftApplication(ad);
    }

    public final void a(java.lang.ref.WeakReference<com.inmobi.ads.InMobiBanner> weakReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.f5133a = weakReference;
    }
}
