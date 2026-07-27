package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.AudioAdEventListener;
import com.inmobi.media.AbstractC3604bm;
import com.inmobi.media.AbstractC3727g4;
import com.inmobi.media.AbstractC3837k2;
import com.inmobi.media.AbstractC3841k6;
import com.inmobi.media.AbstractC3914mk;
import com.inmobi.media.AbstractC3942nk;
import com.inmobi.media.AbstractC4260z4;
import com.inmobi.media.C3600bi;
import com.inmobi.media.C3725g2;
import com.inmobi.media.C3900m6;
import com.inmobi.media.C3981p2;
import com.inmobi.media.C9;
import com.inmobi.media.J4;
import com.inmobi.media.Kc;
import com.inmobi.media.Y5;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001)B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0012\u001a\u00020\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001e\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001f\u0010\rJ!\u0010#\u001a\u00020\u000b2\b\b\u0001\u0010!\u001a\u00020 2\b\b\u0001\u0010\"\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010\rJ\r\u0010&\u001a\u00020\u000b¢\u0006\u0004\b&\u0010\rJ\r\u0010'\u001a\u00020\u000b¢\u0006\u0004\b'\u0010\rJ\u000f\u0010(\u001a\u00020\u000bH\u0007¢\u0006\u0004\b(\u0010\rR$\u0010.\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u001cR$\u00106\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/inmobi/ads/InMobiAudio;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "placementId", "(Landroid/content/Context;J)V", "", "load", "()V", "show", "", "", "extras", "setExtras", "(Ljava/util/Map;)V", "keywords", "setKeywords", "(Ljava/lang/String;)V", "contentUrl", "setContentUrl", "Lcom/inmobi/ads/listeners/AudioAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, InAppPurchaseConstants.METHOD_SET_LISTENER, "(Lcom/inmobi/ads/listeners/AudioAdEventListener;)V", "disableHardwareAcceleration", "onAttachedToWindow", "onDetachedFromWindow", "", "widthInDp", "heightInDp", "setAudioSize", "(II)V", "setupViewSizeObserver", CampaignEx.JSON_NATIVE_VIDEO_RESUME, CampaignEx.JSON_NATIVE_VIDEO_PAUSE, "destroy", "a", "Lcom/inmobi/ads/listeners/AudioAdEventListener;", "getMPubListener$media_release", "()Lcom/inmobi/ads/listeners/AudioAdEventListener;", "setMPubListener$media_release", "mPubListener", "Lcom/inmobi/media/p2;", "b", "Lcom/inmobi/media/p2;", "getMAdManager$media_release", "()Lcom/inmobi/media/p2;", "setMAdManager$media_release", "(Lcom/inmobi/media/p2;)V", "mAdManager", "getFrameSizeString", "()Ljava/lang/String;", "frameSizeString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InMobiAudio extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public AudioAdEventListener mPubListener;

    /* renamed from: b, reason: from kotlin metadata */
    public C3981p2 mAdManager;
    public final WeakReference c;
    public final C3600bi d;
    public long e;
    public int f;
    public int g;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/ads/InMobiAudio$a;", "Lcom/inmobi/media/k2;", "Lcom/inmobi/ads/InMobiAudio;", "audio", "<init>", "(Lcom/inmobi/ads/InMobiAudio;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "status", "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "", "getType", "()B", "type", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends AbstractC3837k2 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InMobiAudio audio) {
            super(audio);
            Intrinsics.checkNotNullParameter(audio, "audio");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus status) {
            AudioAdEventListener mPubListener;
            Intrinsics.checkNotNullParameter(status, "status");
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
                return;
            }
            mPubListener.onAdLoadFailed(inMobiAudio, status);
        }

        @Override // com.inmobi.media.AbstractC3837k2, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null) {
                return;
            }
            try {
                C3981p2 mAdManager = inMobiAudio.getMAdManager();
                if (mAdManager != null) {
                    mAdManager.k();
                }
            } catch (IllegalStateException e) {
                Kc.a((byte) 1, "InMobiAudio", e.getMessage());
                AudioAdEventListener mPubListener = inMobiAudio.getMPubListener();
                if (mPubListener != null) {
                    mPubListener.onAdLoadFailed(inMobiAudio, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        a aVar = new a(this);
        C3600bi c3600bi = new C3600bi();
        this.d = c3600bi;
        if (!AbstractC3914mk.c()) {
            throw new SdkNotInitializedException("InMobiAudio");
        }
        if (context instanceof Activity) {
            this.c = new WeakReference(context);
        }
        this.mAdManager = new C3981p2(aVar);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "placementId");
        if (attributeValue != null) {
            long a2 = a(attributeValue);
            if (a2 == Long.MIN_VALUE) {
                throw new InvalidPlacementIdException();
            }
            c3600bi.f7031a = a2;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        C3981p2 c3981p2 = this.mAdManager;
        if (c3981p2 != null) {
            c3981p2.a(context2, c3600bi, getFrameSizeString());
        }
    }

    public static final boolean access$hasValidSize(InMobiAudio inMobiAudio) {
        return inMobiAudio.f > 0 && inMobiAudio.g > 0;
    }

    private final String getFrameSizeString() {
        return this.f + "x" + this.g;
    }

    public final boolean a() {
        if (this.f <= 0 || this.g <= 0) {
            if (getLayoutParams() == null) {
                Kc.a((byte) 1, "InMobiAudio", "The layout params of the audio ad view must be set before calling load or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
            if (getLayoutParams().width == -2 || getLayoutParams().height == -2) {
                Kc.a((byte) 1, "InMobiAudio", "The height or width of a Audio ad can't be WRAP_CONTENT or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
            if (getLayoutParams() != null) {
                this.f = AbstractC3727g4.b(getLayoutParams().width / AbstractC3841k6.b());
                this.g = AbstractC3727g4.b(getLayoutParams().height / AbstractC3841k6.b());
            }
        }
        return true;
    }

    public final void b() {
        C3981p2 c3981p2;
        C3725g2 c3725g2;
        try {
            J4 j4 = AbstractC4260z4.f7518a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            J4 j42 = AbstractC4260z4.f7518a;
            if (!((AdConfig) j42.a(AdConfig.class)).getAudio().getIsAudioEnabled()) {
                C3981p2 c3981p22 = this.mAdManager;
                if (c3981p22 != null) {
                    c3981p22.a((short) 107);
                }
                C3981p2 c3981p23 = this.mAdManager;
                if (c3981p23 != null) {
                    c3981p23.a(c3981p23.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.FEATURE_DISABLED));
                }
                Kc.a((byte) 1, "InMobi", "");
                return;
            }
            C3600bi c3600bi = this.d;
            c3600bi.getClass();
            Intrinsics.checkNotNullParameter("NonAB", "<set-?>");
            c3600bi.h = "NonAB";
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C3981p2 c3981p24 = this.mAdManager;
            if (c3981p24 != null) {
                c3981p24.a(context, this.d, getFrameSizeString());
            }
            C3981p2 c3981p25 = this.mAdManager;
            if (c3981p25 != null && (c3725g2 = c3981p25.j) != null && c3725g2.b == 7) {
                C3981p2 c3981p26 = this.mAdManager;
                if (c3981p26 != null) {
                    c3981p26.b((short) 15);
                }
                AudioAdEventListener audioAdEventListener = this.mPubListener;
                if (audioAdEventListener != null) {
                    audioAdEventListener.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                }
                Kc.a((byte) 1, "InMobiAudio", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                return;
            }
            if (!a()) {
                C3981p2 c3981p27 = this.mAdManager;
                if (c3981p27 != null) {
                    c3981p27.a((short) 108);
                }
                C3981p2 c3981p28 = this.mAdManager;
                if (c3981p28 != null) {
                    c3981p28.a(c3981p28.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
                    return;
                }
                return;
            }
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            if (((AdConfig) j42.a(AdConfig.class)).getAudio().getMinDeviceVolume() > Y5.f6965a.a(AbstractC3914mk.f7252a, AbstractC3914mk.g)) {
                C3981p2 c3981p29 = this.mAdManager;
                if (c3981p29 != null) {
                    c3981p29.a((short) 106);
                }
                C3981p2 c3981p210 = this.mAdManager;
                if (c3981p210 != null) {
                    c3981p210.a(c3981p210.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.DEVICE_AUDIO_LEVEL_LOW));
                    return;
                }
                return;
            }
            if (this.f <= 0 || this.g <= 0) {
                Runnable runnable = new Runnable() { // from class: com.inmobi.ads.InMobiAudio$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InMobiAudio.a(InMobiAudio.this);
                    }
                };
                Lazy lazy = AbstractC3604bm.f7033a;
                Intrinsics.checkNotNullParameter(runnable, "runnable");
                ((Handler) AbstractC3604bm.f7033a.getValue()).postDelayed(runnable, 200L);
                return;
            }
            long j = this.e;
            if (j == 0 || (c3981p2 = this.mAdManager) == null || c3981p2.a(j)) {
                this.e = SystemClock.elapsedRealtime();
                C3981p2 c3981p211 = this.mAdManager;
                if (c3981p211 != null) {
                    c3981p211.b(getFrameSizeString());
                }
            }
        } catch (Exception e) {
            C3981p2 c3981p212 = this.mAdManager;
            if (c3981p212 != null) {
                c3981p212.a((short) 105);
            }
            Kc.a((byte) 1, "InMobiAudio", "Unable to load ad; SDK encountered an unexpected error");
            String str = "Load failed with unexpected error: " + e.getMessage();
        }
    }

    public final void destroy() {
        removeAllViews();
        C3981p2 c3981p2 = this.mAdManager;
        if (c3981p2 != null) {
            c3981p2.h();
        }
        this.mPubListener = null;
    }

    public final void disableHardwareAcceleration() {
        this.d.e = true;
    }

    /* renamed from: getMAdManager$media_release, reason: from getter */
    public final C3981p2 getMAdManager() {
        return this.mAdManager;
    }

    /* renamed from: getMPubListener$media_release, reason: from getter */
    public final AudioAdEventListener getMPubListener() {
        return this.mPubListener;
    }

    public final void load() {
        C3981p2 c3981p2 = this.mAdManager;
        if (c3981p2 != null) {
            c3981p2.g();
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            C3981p2 c3981p2 = this.mAdManager;
            if (c3981p2 != null) {
                c3981p2.j();
            }
            if (getLayoutParams() != null) {
                this.f = AbstractC3727g4.b(getLayoutParams().width / AbstractC3841k6.b());
                this.g = AbstractC3727g4.b(getLayoutParams().height / AbstractC3841k6.b());
            }
            if (this.f <= 0 || this.g <= 0) {
                setupViewSizeObserver();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                C3900m6 c3900m6 = AbstractC3841k6.f7196a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                Intrinsics.checkNotNullExpressionValue(rootWindowInsets, "getRootWindowInsets(...)");
                AbstractC3841k6.a(rootWindowInsets, context);
            }
        } catch (Exception e) {
            Kc.a((byte) 1, "InMobiAudio", "InMobiAudio#onAttachedToWindow() handler threw unexpected error");
            String str = "InMobiAudio#onAttachedToWindow() handler threw unexpected error: " + e.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            C3981p2 c3981p2 = this.mAdManager;
            if (c3981p2 != null) {
                c3981p2.p();
            }
        } catch (Exception e) {
            Kc.a((byte) 1, "InMobiAudio", "InMobiAudio.onDetachedFromWindow() handler threw unexpected error");
            String str = "InMobiAudio.onDetachedFromWindow() handler threw unexpected error: " + e.getMessage();
        }
    }

    public final void pause() {
        C3981p2 c3981p2;
        try {
            if (this.c != null || (c3981p2 = this.mAdManager) == null) {
                return;
            }
            c3981p2.i();
        } catch (Exception e) {
            Kc.a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
            String str = "SDK encountered unexpected error in pausing ad; " + e.getMessage();
        }
    }

    public final void resume() {
        C3981p2 c3981p2;
        try {
            if (this.c != null || (c3981p2 = this.mAdManager) == null) {
                return;
            }
            c3981p2.l();
        } catch (Exception e) {
            Kc.a((byte) 1, "InMobi", "Could not resume ad; SDK encountered an unexpected error");
            String str = "SDK encountered unexpected error in resuming ad; " + e.getMessage();
        }
    }

    public final void setAudioSize(int widthInDp, int heightInDp) {
        this.f = widthInDp;
        this.g = heightInDp;
    }

    public final void setContentUrl(String contentUrl) {
        Intrinsics.checkNotNullParameter(contentUrl, "contentUrl");
        this.d.f = contentUrl;
    }

    public final void setExtras(Map<String, String> extras) {
        if (extras != null) {
            String str = extras.get("tp");
            if (str != null && !TextUtils.isEmpty(str)) {
                AbstractC3942nk.b = str;
            }
            String str2 = extras.get("tp-v");
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                AbstractC3942nk.f7270a = str2;
            }
        }
        this.d.d = extras;
    }

    public final void setKeywords(String keywords) {
        this.d.c = keywords;
    }

    public final void setListener(AudioAdEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mPubListener = listener;
    }

    public final void setMAdManager$media_release(C3981p2 c3981p2) {
        this.mAdManager = c3981p2;
    }

    public final void setMPubListener$media_release(AudioAdEventListener audioAdEventListener) {
        this.mPubListener = audioAdEventListener;
    }

    public final void setupViewSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new C9(this));
    }

    public final void show() {
        C3981p2 c3981p2 = this.mAdManager;
        if (c3981p2 != null) {
            c3981p2.n();
        }
        C3981p2 c3981p22 = this.mAdManager;
        if (c3981p22 != null) {
            c3981p22.a(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(Context context, long j) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        a aVar = new a(this);
        C3600bi c3600bi = new C3600bi();
        this.d = c3600bi;
        if (AbstractC3914mk.c()) {
            if (context instanceof Activity) {
                this.c = new WeakReference(context);
            }
            C3981p2 c3981p2 = new C3981p2(aVar);
            this.mAdManager = c3981p2;
            c3600bi.f7031a = j;
            c3981p2.a(context, c3600bi, getFrameSizeString());
            return;
        }
        throw new SdkNotInitializedException("InMobiAudio");
    }

    public static final void a(InMobiAudio inMobiAudio) {
        C3981p2 c3981p2;
        try {
            if (inMobiAudio.f > 0 && inMobiAudio.g > 0) {
                long j = inMobiAudio.e;
                if (j == 0 || (c3981p2 = inMobiAudio.mAdManager) == null || c3981p2.a(j)) {
                    inMobiAudio.e = SystemClock.elapsedRealtime();
                    C3981p2 c3981p22 = inMobiAudio.mAdManager;
                    if (c3981p22 != null) {
                        c3981p22.b(inMobiAudio.getFrameSizeString());
                        return;
                    }
                    return;
                }
                return;
            }
            Kc.a((byte) 1, "InMobiAudio", "The height or width of the audio ad can not be determined");
            C3981p2 c3981p23 = inMobiAudio.mAdManager;
            if (c3981p23 != null) {
                c3981p23.a((short) 108);
            }
            C3981p2 c3981p24 = inMobiAudio.mAdManager;
            if (c3981p24 != null) {
                c3981p24.a(c3981p24.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        } catch (Exception e) {
            C3981p2 c3981p25 = inMobiAudio.mAdManager;
            if (c3981p25 != null) {
                c3981p25.a((short) 105);
            }
            Kc.a((byte) 1, "InMobiAudio", "SDK encountered unexpected error while loading an ad");
            String str = "InMobiAudio$4.run() threw unexpected error: " + e.getMessage();
        }
    }

    public static long a(String str) {
        try {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            StringBuilder sb = new StringBuilder(str.subSequence(i, length + 1).toString());
            if (StringsKt.equals("plid-", sb.substring(0, 5), true)) {
                String substring = sb.substring(5, sb.length());
                Intrinsics.checkNotNull(substring);
                int length2 = substring.length() - 1;
                int i2 = 0;
                boolean z3 = false;
                while (i2 <= length2) {
                    boolean z4 = Intrinsics.compare((int) substring.charAt(!z3 ? i2 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        }
                        length2--;
                    } else if (z4) {
                        i2++;
                    } else {
                        z3 = true;
                    }
                }
                return Long.parseLong(substring.subSequence(i2, length2 + 1).toString());
            }
            Kc.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            Kc.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        } catch (NumberFormatException unused) {
            Kc.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Audio creation failed.");
            Kc.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        } catch (StringIndexOutOfBoundsException unused2) {
            Kc.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            Kc.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        }
    }
}
