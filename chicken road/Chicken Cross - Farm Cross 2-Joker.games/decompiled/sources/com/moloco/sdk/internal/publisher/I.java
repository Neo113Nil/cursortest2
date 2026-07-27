package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class I implements RewardedInterstitialAd, s, FullscreenAd<RewardedInterstitialAdShowListener> {
    public static final a e = new a(null);
    public static final String f = "reward_on_skip_visible";

    /* renamed from: a, reason: collision with root package name */
    public final w<RewardedInterstitialAdShowListener> f10588a;
    public final String b;
    public final com.moloco.sdk.internal.services.config.a c;
    public final MetricsRecorder d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void a() {
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public I(w<? super RewardedInterstitialAdShowListener> fullscreenAd, String adUnitId, com.moloco.sdk.internal.services.config.a configService, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(fullscreenAd, "fullscreenAd");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f10588a = fullscreenAd;
        this.b = adUnitId;
        this.c = configService;
        this.d = metricsRecorder;
    }

    public static final Boolean b(I i) {
        return i.f10588a.f();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j c(I i) {
        return i.f10588a.b();
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void a(long j, long j2) {
        this.f10588a.a(j, j2);
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        this.f10588a.destroy();
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: getCreateAdObjectDuration-UwyO8pc */
    public long mo7561getCreateAdObjectDurationUwyO8pc() {
        return this.f10588a.mo7561getCreateAdObjectDurationUwyO8pc();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.f10588a.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(String bidResponseJson, AdLoad.Listener listener) {
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.f10588a.load(bidResponseJson, listener);
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: setCreateAdObjectDuration-LRDsOJo */
    public void mo7562setCreateAdObjectDurationLRDsOJo(long j) {
        this.f10588a.mo7562setCreateAdObjectDurationLRDsOJo(j);
    }

    public static final com.moloco.sdk.internal.ortb.model.D a(I i) {
        return i.f10588a.d();
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    public void show(RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener) {
        final K k = new K(new L(rewardedInterstitialAdShowListener, new Function0() { // from class: com.moloco.sdk.internal.publisher.I$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I.a(I.this);
            }
        }, com.moloco.sdk.internal.A.b()), this.f10588a.b() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.f11577a, new Function0() { // from class: com.moloco.sdk.internal.publisher.I$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I.b(I.this);
            }
        }, this.b, this.c.a(f), new Function0() { // from class: com.moloco.sdk.internal.publisher.I$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I.c(I.this);
            }
        }, this.d);
        this.f10588a.a(new Function1() { // from class: com.moloco.sdk.internal.publisher.I$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I.a(K.this, this, ((Boolean) obj).booleanValue());
            }
        });
        this.f10588a.a(new Function0() { // from class: com.moloco.sdk.internal.publisher.I$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I.a(K.this);
            }
        });
        this.f10588a.show(k);
    }

    public static final Unit a(K k, I i, boolean z) {
        k.onRewardedVideoCompleted(MolocoAdKt.createAdInfo$default(i.b, null, null, 6, null));
        return Unit.INSTANCE;
    }

    public static final Unit a(K k) {
        k.a();
        return Unit.INSTANCE;
    }
}
