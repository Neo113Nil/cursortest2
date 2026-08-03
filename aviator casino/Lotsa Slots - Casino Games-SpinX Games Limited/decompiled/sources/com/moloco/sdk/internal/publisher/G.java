package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public final class G {

    public static final class a implements com.moloco.sdk.publisher.InterstitialAdShowListener, com.moloco.sdk.publisher.AdShowListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.publisher.AdShowListener f7075a;

        public a(com.moloco.sdk.publisher.InterstitialAdShowListener interstitialAdShowListener) {
            this.f7075a = com.moloco.sdk.internal.publisher.C3426j.a(interstitialAdShowListener);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdClicked(com.moloco.sdk.publisher.MolocoAd molocoAd) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            this.f7075a.onAdClicked(molocoAd);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdHidden(com.moloco.sdk.publisher.MolocoAd molocoAd) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            this.f7075a.onAdHidden(molocoAd);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowFailed(com.moloco.sdk.publisher.MolocoAdError molocoAdError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
            this.f7075a.onAdShowFailed(molocoAdError);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowSuccess(com.moloco.sdk.publisher.MolocoAd molocoAd) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            this.f7075a.onAdShowSuccess(molocoAd);
        }
    }

    public static final com.moloco.sdk.publisher.InterstitialAd a(android.content.Context context, com.moloco.sdk.internal.services.InterfaceC3435f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, java.lang.String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, com.moloco.sdk.internal.publisher.u<com.moloco.sdk.publisher.InterstitialAdShowListener> adDataHolder, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.internal.publisher.C3417a adCreateLoadTimeoutManager, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adDataHolder, "adDataHolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new com.moloco.sdk.internal.publisher.F(new com.moloco.sdk.internal.publisher.v(context, appLifecycleTrackerService, customUserEventBuilderService, adUnitId, persistentHttpRequest, externalLinkHandler, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.internal.publisher.G$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.internal.publisher.G.a((com.moloco.sdk.internal.ortb.model.z) obj);
            }
        }, adDataHolder, com.moloco.sdk.publisher.AdFormatType.INTERSTITIAL, watermark, adCreateLoadTimeoutManager, metricsRecorder));
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h a(com.moloco.sdk.internal.ortb.model.z zVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h b;
        return (zVar == null || (b = com.moloco.sdk.internal.d.b(zVar)) == null) ? com.moloco.sdk.internal.d.b() : b;
    }

    public static final com.moloco.sdk.publisher.InterstitialAdShowListener a(com.moloco.sdk.publisher.InterstitialAdShowListener interstitialAdShowListener) {
        return new com.moloco.sdk.internal.publisher.G.a(interstitialAdShowListener);
    }
}
