package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.jb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C3818jb extends PublisherCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<InMobiInterstitial> f7179a;

    public C3818jb(InMobiInterstitial interstitial) {
        Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        this.f7179a = new WeakReference<>(interstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(Map<Object, ? extends Object> params) {
        AbstractC3734gb mPubListener$media_release;
        Intrinsics.checkNotNullParameter(params, "params");
        InMobiInterstitial inMobiInterstitial = this.f7179a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, params);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        AbstractC3734gb mPubListener$media_release;
        InMobiInterstitial ad = this.f7179a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        ((C3762hb) mPubListener$media_release).f7139a.onAdDismissed(ad);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        AbstractC3734gb mPubListener$media_release;
        InMobiInterstitial ad = this.f7179a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        ((C3762hb) mPubListener$media_release).f7139a.onAdDisplayFailed(ad);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(AdMetaInfo info) {
        AbstractC3734gb mPubListener$media_release;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiInterstitial ad = this.f7179a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(info, "info");
        ((C3762hb) mPubListener$media_release).f7139a.onAdDisplayed(ad, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus status) {
        AbstractC3734gb mPubListener$media_release;
        Intrinsics.checkNotNullParameter(status, "status");
        InMobiInterstitial ad = this.f7179a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(status, "status");
        ((C3762hb) mPubListener$media_release).f7139a.onAdFetchFailed(ad, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo info) {
        AbstractC3734gb mPubListener$media_release;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiInterstitial inMobiInterstitial = this.f7179a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(C4113tm c4113tm) {
        InMobiInterstitial ad = this.f7179a.get();
        AbstractC3734gb mPubListener$media_release = ad != null ? ad.getMPubListener$media_release() : null;
        if (mPubListener$media_release == null) {
            if (c4113tm != null) {
                c4113tm.b();
            }
        } else {
            Intrinsics.checkNotNullParameter(ad, "ad");
            ((C3762hb) mPubListener$media_release).f7139a.onAdImpression(ad);
            if (c4113tm != null) {
                c4113tm.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(InMobiAdRequestStatus status) {
        AbstractC3734gb mPubListener$media_release;
        Intrinsics.checkNotNullParameter(status, "status");
        InMobiInterstitial inMobiInterstitial = this.f7179a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(AdMetaInfo info) {
        AbstractC3734gb mPubListener$media_release;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiInterstitial inMobiInterstitial = this.f7179a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.b(inMobiInterstitial, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdWillDisplay() {
        AbstractC3734gb mPubListener$media_release;
        InMobiInterstitial ad = this.f7179a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        ((C3762hb) mPubListener$media_release).f7139a.onAdWillDisplay(ad);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(String log) {
        AbstractC3734gb mPubListener$media_release;
        Intrinsics.checkNotNullParameter(log, "log");
        InMobiInterstitial inMobiInterstitial = this.f7179a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, log);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] request) {
        AbstractC3734gb mPubListener$media_release;
        Intrinsics.checkNotNullParameter(request, "request");
        InMobiInterstitial inMobiInterstitial = this.f7179a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C3762hb) mPubListener$media_release).f7139a.onRequestPayloadCreated(request);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus status) {
        AbstractC3734gb mPubListener$media_release;
        Intrinsics.checkNotNullParameter(status, "reason");
        InMobiInterstitial inMobiInterstitial = this.f7179a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(status, "status");
        ((C3762hb) mPubListener$media_release).f7139a.onRequestPayloadCreationFailed(status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(Map<Object, ? extends Object> rewards) {
        AbstractC3734gb mPubListener$media_release;
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        InMobiInterstitial ad = this.f7179a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        ((C3762hb) mPubListener$media_release).f7139a.onRewardsUnlocked(ad, rewards);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AbstractC3734gb mPubListener$media_release;
        InMobiInterstitial ad = this.f7179a.get();
        if (ad == null || (mPubListener$media_release = ad.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        ((C3762hb) mPubListener$media_release).f7139a.onUserLeftApplication(ad);
    }
}
