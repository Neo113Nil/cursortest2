package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public final class I {
    public static final com.moloco.sdk.publisher.RewardedInterstitialAd a(android.content.Context context, com.moloco.sdk.internal.services.InterfaceC3435f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, java.lang.String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, com.moloco.sdk.internal.publisher.u<com.moloco.sdk.publisher.RewardedInterstitialAdShowListener> adDataHolder, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.internal.publisher.C3417a adCreateLoadTimeoutManager, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.internal.services.config.a configService) {
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configService, "configService");
        return new com.moloco.sdk.internal.publisher.H(new com.moloco.sdk.internal.publisher.v(context, appLifecycleTrackerService, customUserEventBuilderService, adUnitId, persistentHttpRequest, externalLinkHandler, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.internal.publisher.I$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.internal.publisher.I.a((com.moloco.sdk.internal.ortb.model.z) obj);
            }
        }, adDataHolder, com.moloco.sdk.publisher.AdFormatType.REWARDED, watermark, adCreateLoadTimeoutManager, metricsRecorder), adUnitId, configService, metricsRecorder);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h a(com.moloco.sdk.internal.ortb.model.z zVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h b;
        return (zVar == null || (b = com.moloco.sdk.internal.d.b(zVar)) == null) ? com.moloco.sdk.internal.d.b() : b;
    }
}
