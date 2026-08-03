package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Pc extends com.inmobi.ads.controllers.PublisherCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2278ah f4895a;
    public final com.inmobi.media.C2536kd b;
    public final java.lang.ref.WeakReference c;

    public Pc(com.inmobi.ads.InMobiNative inMobiNative, com.inmobi.media.C2278ah publisherListenersModel, com.inmobi.media.C2536kd nativeFlowManagerNotifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherListenersModel, "publisherListenersModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeFlowManagerNotifier, "nativeFlowManagerNotifier");
        this.f4895a = publisherListenersModel;
        this.b = nativeFlowManagerNotifier;
        this.c = new java.lang.ref.WeakReference(inMobiNative);
    }

    public static final kotlin.Unit b(com.inmobi.media.Pc pc, com.inmobi.ads.InMobiNative inMobiNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        com.inmobi.ads.listeners.NativeAdEventListener nativeAdEventListener = pc.f4895a.f5105a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFullScreenDismissed(inMobiNative);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit c(com.inmobi.media.Pc pc, com.inmobi.ads.InMobiNative inMobiNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        com.inmobi.ads.listeners.NativeAdEventListener nativeAdEventListener = pc.f4895a.f5105a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFullScreenDisplayed(inMobiNative);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit d(com.inmobi.media.Pc pc, com.inmobi.ads.InMobiNative inMobiNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        com.inmobi.ads.listeners.NativeAdEventListener nativeAdEventListener = pc.f4895a.f5105a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onUserWillLeaveApplication(inMobiNative);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit e(com.inmobi.media.Pc pc, com.inmobi.ads.InMobiNative inMobiNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        com.inmobi.ads.listeners.VideoEventListener videoEventListener = pc.f4895a.b;
        if (videoEventListener != null) {
            videoEventListener.onVideoCompleted(inMobiNative);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit f(com.inmobi.media.Pc pc, com.inmobi.ads.InMobiNative inMobiNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        com.inmobi.ads.listeners.VideoEventListener videoEventListener = pc.f4895a.b;
        if (videoEventListener != null) {
            videoEventListener.onVideoPaused(inMobiNative);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit g(com.inmobi.media.Pc pc, com.inmobi.ads.InMobiNative inMobiNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        com.inmobi.ads.listeners.VideoEventListener videoEventListener = pc.f4895a.b;
        if (videoEventListener != null) {
            videoEventListener.onVideoResumed(inMobiNative);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit h(com.inmobi.media.Pc pc, com.inmobi.ads.InMobiNative inMobiNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        com.inmobi.ads.listeners.VideoEventListener videoEventListener = pc.f4895a.b;
        if (videoEventListener != null) {
            videoEventListener.onVideoStarted(inMobiNative);
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void a(kotlin.jvm.functions.Function1 function1) {
        com.inmobi.ads.InMobiNative inMobiNative = (com.inmobi.ads.InMobiNative) this.c.get();
        if (inMobiNative == null) {
            com.inmobi.media.Sb.a((byte) 1, "NativeCallbacks", "Lost reference to InMobiNative! callback cannot be given");
        } else {
            function1.invoke(inMobiNative);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final byte getType() {
        return (byte) 0;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdClicked(java.util.Map params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        a(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Pc$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Pc.a(com.inmobi.media.Pc.this, (com.inmobi.ads.InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdDismissed() {
        a(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Pc$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Pc.b(com.inmobi.media.Pc.this, (com.inmobi.ads.InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdDisplayed(com.inmobi.ads.AdMetaInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        a(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Pc$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Pc.c(com.inmobi.media.Pc.this, (com.inmobi.ads.InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdFetchFailed(com.inmobi.ads.InMobiAdRequestStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        onAdLoadFailed(status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdFetchSuccessful(final com.inmobi.ads.AdMetaInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        a(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Pc$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Pc.a(com.inmobi.media.Pc.this, info, (com.inmobi.ads.InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdImpression(final com.inmobi.media.C2888xk c2888xk) {
        a(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Pc$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Pc.a(com.inmobi.media.Pc.this, c2888xk, (com.inmobi.ads.InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdLoadFailed(final com.inmobi.ads.InMobiAdRequestStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        a(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Pc$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Pc.a(com.inmobi.media.Pc.this, status, (com.inmobi.ads.InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAudioStateChanged(final boolean z) {
        a(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Pc$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Pc.a(z, this, (com.inmobi.ads.InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onUserLeftApplication() {
        a(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Pc$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Pc.d(com.inmobi.media.Pc.this, (com.inmobi.ads.InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoCompleted() {
        a(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Pc$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Pc.e(com.inmobi.media.Pc.this, (com.inmobi.ads.InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoPaused() {
        a(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Pc$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Pc.f(com.inmobi.media.Pc.this, (com.inmobi.ads.InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoResumed() {
        a(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Pc$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Pc.g(com.inmobi.media.Pc.this, (com.inmobi.ads.InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoStarted() {
        a(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Pc$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Pc.h(com.inmobi.media.Pc.this, (com.inmobi.ads.InMobiNative) obj);
            }
        });
    }

    public static final kotlin.Unit a(com.inmobi.media.Pc pc, com.inmobi.ads.AdMetaInfo adMetaInfo, com.inmobi.ads.InMobiNative inMobiNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        com.inmobi.media.Ic ic = pc.b.f5294a.d.b;
        ic.getClass();
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = ic.c;
        com.inmobi.media.S6 s6 = interfaceC2782tj instanceof com.inmobi.media.S6 ? (com.inmobi.media.S6) interfaceC2782tj : null;
        if (s6 != null) {
            com.inmobi.media.InterfaceC2772t9 l = s6.l();
            if (l != null) {
                ((com.inmobi.media.C2799u9) l).a("AUM-FetchedState", "Inflate Called");
            }
            com.inmobi.media.C2433gd c2433gd = (com.inmobi.media.C2433gd) s6;
            com.inmobi.media.InterfaceC2772t9 l2 = c2433gd.l();
            if (l2 != null) {
                ((com.inmobi.media.C2799u9) l2).a("AUM-NativeFetchedState", "transitionToLoadingState Called - starting ad inflation");
            }
            c2433gd.j.a(new com.inmobi.media.Kd(c2433gd.f, c2433gd.g, c2433gd.h, c2433gd.i, c2433gd.j), c2433gd);
        }
        com.inmobi.ads.listeners.NativeAdEventListener nativeAdEventListener = pc.f4895a.f5105a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFetchSuccessful(inMobiNative, adMetaInfo);
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void a(final com.inmobi.media.C2511je pubData, final com.inmobi.ads.AdMetaInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pubData, "pubData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        a(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Pc$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Pc.a(com.inmobi.media.Pc.this, pubData, info, (com.inmobi.ads.InMobiNative) obj);
            }
        });
    }

    public static final kotlin.Unit a(com.inmobi.media.Pc pc, com.inmobi.media.C2511je pubData, com.inmobi.ads.AdMetaInfo adMetaInfo, com.inmobi.ads.InMobiNative inMobiNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        com.inmobi.media.C2536kd c2536kd = pc.b;
        c2536kd.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pubData, "pubData");
        c2536kd.f5294a.e = pubData;
        com.inmobi.ads.listeners.NativeAdEventListener nativeAdEventListener = pc.f4895a.f5105a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdLoadSucceeded(inMobiNative, adMetaInfo);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(com.inmobi.media.Pc pc, com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus, com.inmobi.ads.InMobiNative inMobiNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        com.inmobi.ads.listeners.NativeAdEventListener nativeAdEventListener = pc.f4895a.f5105a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdLoadFailed(inMobiNative, inMobiAdRequestStatus);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(com.inmobi.media.Pc pc, com.inmobi.ads.InMobiNative inMobiNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        com.inmobi.ads.listeners.NativeAdEventListener nativeAdEventListener = pc.f4895a.f5105a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdClicked(inMobiNative);
        }
        com.inmobi.ads.InMobiNative.LockScreenListener lockScreenListener = pc.f4895a.c;
        if (lockScreenListener != null) {
            lockScreenListener.onActionRequired(inMobiNative);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(boolean z, com.inmobi.media.Pc pc, com.inmobi.ads.InMobiNative inMobiNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        com.inmobi.ads.listeners.VideoEventListener videoEventListener = pc.f4895a.b;
        if (videoEventListener != null) {
            videoEventListener.onAudioStateChanged(inMobiNative, z);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(com.inmobi.media.Pc pc, com.inmobi.media.C2888xk c2888xk, com.inmobi.ads.InMobiNative inMobiNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        com.inmobi.ads.listeners.NativeAdEventListener nativeAdEventListener = pc.f4895a.f5105a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdImpression(inMobiNative);
        }
        if (c2888xk != null) {
            c2888xk.c();
        }
        return kotlin.Unit.INSTANCE;
    }
}
