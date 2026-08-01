package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.listeners.AudioAdEventListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.k2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3837k2 extends PublisherCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<InMobiAudio> f7192a;

    public AbstractC3837k2(InMobiAudio audio) {
        Intrinsics.checkNotNullParameter(audio, "audio");
        this.f7192a = new WeakReference<>(audio);
    }

    public final WeakReference<InMobiAudio> a() {
        return this.f7192a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(Map<Object, ? extends Object> params) {
        AudioAdEventListener mPubListener;
        Intrinsics.checkNotNullParameter(params, "params");
        InMobiAudio inMobiAudio = this.f7192a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdClicked(inMobiAudio, params);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        AudioAdEventListener mPubListener;
        InMobiAudio inMobiAudio = this.f7192a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdDismissed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        AudioAdEventListener mPubListener;
        InMobiAudio inMobiAudio = this.f7192a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdDisplayFailed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(AdMetaInfo info) {
        AudioAdEventListener mPubListener;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiAudio inMobiAudio = this.f7192a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdDisplayed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo info) {
        AudioAdEventListener mPubListener;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiAudio inMobiAudio = this.f7192a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdFetchSuccessful(inMobiAudio, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(C4113tm c4113tm) {
        InMobiAudio inMobiAudio = this.f7192a.get();
        AudioAdEventListener mPubListener = inMobiAudio != null ? inMobiAudio.getMPubListener() : null;
        if (mPubListener == null) {
            if (c4113tm != null) {
                c4113tm.b();
            }
        } else {
            mPubListener.onAdImpression(inMobiAudio);
            if (c4113tm != null) {
                c4113tm.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(InMobiAdRequestStatus status) {
        AudioAdEventListener mPubListener;
        Intrinsics.checkNotNullParameter(status, "status");
        InMobiAudio inMobiAudio = this.f7192a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdLoadFailed(inMobiAudio, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(AdMetaInfo info) {
        AudioAdEventListener mPubListener;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiAudio inMobiAudio = this.f7192a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdLoadSucceeded(inMobiAudio, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAudioStatusChanged(EnumC3952o2 item) {
        AudioAdEventListener mPubListener;
        Intrinsics.checkNotNullParameter(item, "audioStatusInternal");
        InMobiAudio inMobiAudio = this.f7192a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        EnumC3952o2.b.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        int ordinal = item.ordinal();
        mPubListener.onAudioStatusChanged(inMobiAudio, ordinal != 1 ? ordinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED : AudioStatus.PLAYING);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] request) {
        AudioAdEventListener mPubListener;
        Intrinsics.checkNotNullParameter(request, "request");
        InMobiAudio inMobiAudio = this.f7192a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onRequestPayloadCreated(request);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus reason) {
        AudioAdEventListener mPubListener;
        Intrinsics.checkNotNullParameter(reason, "reason");
        InMobiAudio inMobiAudio = this.f7192a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onRequestPayloadCreationFailed(reason);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(Map<Object, ? extends Object> rewards) {
        AudioAdEventListener mPubListener;
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        InMobiAudio inMobiAudio = this.f7192a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onRewardsUnlocked(inMobiAudio, rewards);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AudioAdEventListener mPubListener;
        InMobiAudio inMobiAudio = this.f7192a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onUserLeftApplication(inMobiAudio);
    }

    public final void a(WeakReference<InMobiAudio> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.f7192a = weakReference;
    }
}
