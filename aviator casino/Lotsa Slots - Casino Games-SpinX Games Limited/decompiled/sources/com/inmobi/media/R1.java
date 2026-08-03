package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class R1 extends com.inmobi.ads.controllers.PublisherCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.ref.WeakReference<com.inmobi.ads.InMobiAudio> f4928a;

    public R1(com.inmobi.ads.InMobiAudio audio) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audio, "audio");
        this.f4928a = new java.lang.ref.WeakReference<>(audio);
    }

    public final java.lang.ref.WeakReference<com.inmobi.ads.InMobiAudio> a() {
        return this.f4928a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(java.util.Map<java.lang.Object, ? extends java.lang.Object> params) {
        com.inmobi.ads.listeners.AudioAdEventListener mPubListener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        com.inmobi.ads.InMobiAudio inMobiAudio = this.f4928a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdClicked(inMobiAudio, params);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        com.inmobi.ads.listeners.AudioAdEventListener mPubListener;
        com.inmobi.ads.InMobiAudio inMobiAudio = this.f4928a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdDismissed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        com.inmobi.ads.listeners.AudioAdEventListener mPubListener;
        com.inmobi.ads.InMobiAudio inMobiAudio = this.f4928a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdDisplayFailed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(com.inmobi.ads.AdMetaInfo info) {
        com.inmobi.ads.listeners.AudioAdEventListener mPubListener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        com.inmobi.ads.InMobiAudio inMobiAudio = this.f4928a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdDisplayed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(com.inmobi.ads.AdMetaInfo info) {
        com.inmobi.ads.listeners.AudioAdEventListener mPubListener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        com.inmobi.ads.InMobiAudio inMobiAudio = this.f4928a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdFetchSuccessful(inMobiAudio, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(com.inmobi.media.C2888xk c2888xk) {
        com.inmobi.ads.InMobiAudio inMobiAudio = this.f4928a.get();
        com.inmobi.ads.listeners.AudioAdEventListener mPubListener = inMobiAudio != null ? inMobiAudio.getMPubListener() : null;
        if (mPubListener == null) {
            if (c2888xk != null) {
                c2888xk.b();
            }
        } else {
            mPubListener.onAdImpression(inMobiAudio);
            if (c2888xk != null) {
                c2888xk.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(com.inmobi.ads.InMobiAdRequestStatus status) {
        com.inmobi.ads.listeners.AudioAdEventListener mPubListener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        com.inmobi.ads.InMobiAudio inMobiAudio = this.f4928a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdLoadFailed(inMobiAudio, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(com.inmobi.ads.AdMetaInfo info) {
        com.inmobi.ads.listeners.AudioAdEventListener mPubListener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        com.inmobi.ads.InMobiAudio inMobiAudio = this.f4928a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdLoadSucceeded(inMobiAudio, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAudioStatusChanged(com.inmobi.media.V1 item) {
        com.inmobi.ads.listeners.AudioAdEventListener mPubListener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "audioStatusInternal");
        com.inmobi.ads.InMobiAudio inMobiAudio = this.f4928a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        com.inmobi.media.V1.b.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        int ordinal = item.ordinal();
        mPubListener.onAudioStatusChanged(inMobiAudio, ordinal != 1 ? ordinal != 2 ? com.inmobi.ads.AudioStatus.COMPLETED : com.inmobi.ads.AudioStatus.PAUSED : com.inmobi.ads.AudioStatus.PLAYING);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] request) {
        com.inmobi.ads.listeners.AudioAdEventListener mPubListener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        com.inmobi.ads.InMobiAudio inMobiAudio = this.f4928a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onRequestPayloadCreated(request);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(com.inmobi.ads.InMobiAdRequestStatus reason) {
        com.inmobi.ads.listeners.AudioAdEventListener mPubListener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
        com.inmobi.ads.InMobiAudio inMobiAudio = this.f4928a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onRequestPayloadCreationFailed(reason);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(java.util.Map<java.lang.Object, ? extends java.lang.Object> rewards) {
        com.inmobi.ads.listeners.AudioAdEventListener mPubListener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewards, "rewards");
        com.inmobi.ads.InMobiAudio inMobiAudio = this.f4928a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onRewardsUnlocked(inMobiAudio, rewards);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        com.inmobi.ads.listeners.AudioAdEventListener mPubListener;
        com.inmobi.ads.InMobiAudio inMobiAudio = this.f4928a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onUserLeftApplication(inMobiAudio);
    }

    public final void a(java.lang.ref.WeakReference<com.inmobi.ads.InMobiAudio> weakReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.f4928a = weakReference;
    }
}
