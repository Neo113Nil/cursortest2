package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Hd extends PublisherCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final C3882li f6602a;
    public final C3625ce b;
    public final WeakReference c;

    public Hd(InMobiNative inMobiNative, C3882li publisherListenersModel, C3625ce nativeFlowManagerNotifier) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        Intrinsics.checkNotNullParameter(publisherListenersModel, "publisherListenersModel");
        Intrinsics.checkNotNullParameter(nativeFlowManagerNotifier, "nativeFlowManagerNotifier");
        this.f6602a = publisherListenersModel;
        this.b = nativeFlowManagerNotifier;
        this.c = new WeakReference(inMobiNative);
    }

    public static final Unit b(Hd hd, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hd.f6602a.f7228a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFullScreenDismissed(inMobiNative);
        }
        return Unit.INSTANCE;
    }

    public static final Unit c(Hd hd, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hd.f6602a.f7228a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFullScreenDisplayed(inMobiNative);
        }
        return Unit.INSTANCE;
    }

    public static final Unit d(Hd hd, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hd.f6602a.f7228a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onUserWillLeaveApplication(inMobiNative);
        }
        return Unit.INSTANCE;
    }

    public static final Unit e(Hd hd, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = hd.f6602a.b;
        if (videoEventListener != null) {
            videoEventListener.onVideoCompleted(inMobiNative);
        }
        return Unit.INSTANCE;
    }

    public static final Unit f(Hd hd, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = hd.f6602a.b;
        if (videoEventListener != null) {
            videoEventListener.onVideoPaused(inMobiNative);
        }
        return Unit.INSTANCE;
    }

    public static final Unit g(Hd hd, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = hd.f6602a.b;
        if (videoEventListener != null) {
            videoEventListener.onVideoResumed(inMobiNative);
        }
        return Unit.INSTANCE;
    }

    public static final Unit h(Hd hd, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = hd.f6602a.b;
        if (videoEventListener != null) {
            videoEventListener.onVideoStarted(inMobiNative);
        }
        return Unit.INSTANCE;
    }

    public final void a(Function1 function1) {
        InMobiNative inMobiNative = (InMobiNative) this.c.get();
        if (inMobiNative == null) {
            Kc.a((byte) 1, "NativeCallbacks", "Lost reference to InMobiNative! callback cannot be given");
        } else {
            function1.invoke(inMobiNative);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final byte getType() {
        return (byte) 0;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdClicked(Map params) {
        Intrinsics.checkNotNullParameter(params, "params");
        a(new Function1() { // from class: com.inmobi.media.Hd$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hd.a(Hd.this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdDismissed() {
        a(new Function1() { // from class: com.inmobi.media.Hd$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hd.b(Hd.this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdDisplayed(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        a(new Function1() { // from class: com.inmobi.media.Hd$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hd.c(Hd.this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdFetchFailed(InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        onAdLoadFailed(status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdFetchSuccessful(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        a(new Function1() { // from class: com.inmobi.media.Hd$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hd.a(Hd.this, info, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdImpression(final C4113tm c4113tm) {
        a(new Function1() { // from class: com.inmobi.media.Hd$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hd.a(Hd.this, c4113tm, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdLoadFailed(final InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        a(new Function1() { // from class: com.inmobi.media.Hd$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hd.a(Hd.this, status, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAudioStateChanged(final boolean z) {
        a(new Function1() { // from class: com.inmobi.media.Hd$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hd.a(z, this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onUserLeftApplication() {
        a(new Function1() { // from class: com.inmobi.media.Hd$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hd.d(Hd.this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoCompleted() {
        a(new Function1() { // from class: com.inmobi.media.Hd$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hd.e(Hd.this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoPaused() {
        a(new Function1() { // from class: com.inmobi.media.Hd$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hd.f(Hd.this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoResumed() {
        a(new Function1() { // from class: com.inmobi.media.Hd$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hd.g(Hd.this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoStarted() {
        a(new Function1() { // from class: com.inmobi.media.Hd$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hd.h(Hd.this, (InMobiNative) obj);
            }
        });
    }

    public static final Unit a(Hd hd, AdMetaInfo adMetaInfo, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        Ad ad = hd.b.f7046a.d.b;
        ad.getClass();
        Ok ok = ad.c;
        AbstractC3986p7 abstractC3986p7 = ok instanceof AbstractC3986p7 ? (AbstractC3986p7) ok : null;
        if (abstractC3986p7 != null) {
            Y9 l = abstractC3986p7.l();
            if (l != null) {
                ((Z9) l).a("AUM-FetchedState", "Inflate Called");
            }
            Yd yd = (Yd) abstractC3986p7;
            Y9 l2 = yd.l();
            if (l2 != null) {
                ((Z9) l2).a("AUM-NativeFetchedState", "transitionToLoadingState Called - starting ad inflation");
            }
            yd.j.a(new Ce(yd.f, yd.g, yd.h, yd.i, yd.j), yd);
        }
        NativeAdEventListener nativeAdEventListener = hd.f6602a.f7228a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFetchSuccessful(inMobiNative, adMetaInfo);
        }
        return Unit.INSTANCE;
    }

    public final void a(final C3626cf pubData, final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(pubData, "pubData");
        Intrinsics.checkNotNullParameter(info, "info");
        a(new Function1() { // from class: com.inmobi.media.Hd$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Hd.a(Hd.this, pubData, info, (InMobiNative) obj);
            }
        });
    }

    public static final Unit a(Hd hd, C3626cf pubData, AdMetaInfo adMetaInfo, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        C3625ce c3625ce = hd.b;
        c3625ce.getClass();
        Intrinsics.checkNotNullParameter(pubData, "pubData");
        c3625ce.f7046a.e = pubData;
        NativeAdEventListener nativeAdEventListener = hd.f6602a.f7228a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdLoadSucceeded(inMobiNative, adMetaInfo);
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(Hd hd, InMobiAdRequestStatus inMobiAdRequestStatus, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hd.f6602a.f7228a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdLoadFailed(inMobiNative, inMobiAdRequestStatus);
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(Hd hd, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hd.f6602a.f7228a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdClicked(inMobiNative);
        }
        InMobiNative.LockScreenListener lockScreenListener = hd.f6602a.c;
        if (lockScreenListener != null) {
            lockScreenListener.onActionRequired(inMobiNative);
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(boolean z, Hd hd, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        String str = "[AdFlow] PublisherCallbacks: onAudioStateChanged: " + z;
        VideoEventListener videoEventListener = hd.f6602a.b;
        if (videoEventListener != null) {
            videoEventListener.onAudioStateChanged(inMobiNative, z);
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(Hd hd, C4113tm c4113tm, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hd.f6602a.f7228a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdImpression(inMobiNative);
        }
        if (c4113tm != null) {
            c4113tm.c();
        }
        return Unit.INSTANCE;
    }
}
