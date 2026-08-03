package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public final class H implements com.moloco.sdk.publisher.RewardedInterstitialAd, com.moloco.sdk.internal.publisher.s, com.moloco.sdk.publisher.FullscreenAd<com.moloco.sdk.publisher.RewardedInterstitialAdShowListener> {
    public static final com.moloco.sdk.internal.publisher.H.a e = new com.moloco.sdk.internal.publisher.H.a(null);
    public static final java.lang.String f = "reward_on_skip_visible";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.publisher.v<com.moloco.sdk.publisher.RewardedInterstitialAdShowListener> f7076a;
    public final java.lang.String b;
    public final com.moloco.sdk.internal.services.config.a c;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void a() {
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public H(com.moloco.sdk.internal.publisher.v<? super com.moloco.sdk.publisher.RewardedInterstitialAdShowListener> fullscreenAd, java.lang.String adUnitId, com.moloco.sdk.internal.services.config.a configService, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenAd, "fullscreenAd");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configService, "configService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f7076a = fullscreenAd;
        this.b = adUnitId;
        this.c = configService;
        this.d = metricsRecorder;
    }

    public static final com.moloco.sdk.internal.ortb.model.B a(com.moloco.sdk.internal.publisher.H h) {
        return h.f7076a.d();
    }

    public static final java.lang.Boolean b(com.moloco.sdk.internal.publisher.H h) {
        return h.f7076a.f();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i c(com.moloco.sdk.internal.publisher.H h) {
        return h.f7076a.b();
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        this.f7076a.destroy();
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public long getCreateAdObjectStartTime() {
        return this.f7076a.getCreateAdObjectStartTime();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.f7076a.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(java.lang.String bidResponseJson, com.moloco.sdk.publisher.AdLoad.Listener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.f7076a.load(bidResponseJson, listener);
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void setCreateAdObjectStartTime(long j) {
        this.f7076a.setCreateAdObjectStartTime(j);
    }

    public static final kotlin.Unit a(com.moloco.sdk.internal.publisher.J j, com.moloco.sdk.internal.publisher.H h, boolean z) {
        j.onRewardedVideoCompleted(com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(h.b, null, null, 6, null));
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    public void show(com.moloco.sdk.publisher.RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener) {
        final com.moloco.sdk.internal.publisher.J j = new com.moloco.sdk.internal.publisher.J(new com.moloco.sdk.internal.publisher.K(rewardedInterstitialAdShowListener, new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.publisher.H$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.publisher.H.a(com.moloco.sdk.internal.publisher.H.this);
            }
        }, com.moloco.sdk.internal.y.b()), this.f7076a.b() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.f7361a, new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.publisher.H$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.publisher.H.b(com.moloco.sdk.internal.publisher.H.this);
            }
        }, this.b, this.c.a(f), new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.publisher.H$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.publisher.H.c(com.moloco.sdk.internal.publisher.H.this);
            }
        }, this.d);
        this.f7076a.a(new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.internal.publisher.H$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.internal.publisher.H.a(com.moloco.sdk.internal.publisher.J.this, this, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        this.f7076a.a(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.publisher.H$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.publisher.H.a(com.moloco.sdk.internal.publisher.J.this);
            }
        });
        this.f7076a.show(j);
    }

    public static final kotlin.Unit a(com.moloco.sdk.internal.publisher.J j) {
        j.a();
        return kotlin.Unit.INSTANCE;
    }
}
