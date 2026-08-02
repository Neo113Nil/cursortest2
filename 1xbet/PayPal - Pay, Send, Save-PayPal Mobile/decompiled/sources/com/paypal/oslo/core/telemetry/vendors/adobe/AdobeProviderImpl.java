package com.paypal.oslo.core.telemetry.vendors.adobe;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobeProviderImpl;", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobeProvider;", "Lcom/paypal/oslo/core/telemetry/config/TelemetryFeatureGateProvider;", "telemetryFeatureGateProvider", "<init>", "(Lcom/paypal/oslo/core/telemetry/config/TelemetryFeatureGateProvider;)V", "", "experienceCloudId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/telemetry/config/TelemetryFeatureGateProvider;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdobeProviderImpl implements com.paypal.oslo.core.telemetry.vendors.adobe.AdobeProvider {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AdobeProviderImpl(com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider telemetryFeatureGateProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryFeatureGateProvider, "");
        this.Camera2StreamConfigurationMap = telemetryFeatureGateProvider;
    }

    @Override // com.paypal.oslo.core.telemetry.vendors.adobe.AdobeProvider
    public final java.lang.Object experienceCloudId(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
        if (!this.Camera2StreamConfigurationMap.isAdobeEnabled()) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            safeContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(null));
        } else {
            com.adobe.marketing.mobile.edge.identity.Identity.getExperienceCloudId(new com.adobe.marketing.mobile.AdobeCallbackWithError<java.lang.String>() { // from class: com.paypal.oslo.core.telemetry.vendors.adobe.AdobeProviderImpl$handleCallback$1
                @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
                public final void fail(com.adobe.marketing.mobile.AdobeError adobeError) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adobeError, "");
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "Unable to get Adobe Cloud ID", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("adobe_error_code", java.lang.Integer.valueOf(adobeError.getErrorCode())), kotlin.TuplesKt.to("adobe_error_name", adobeError.getErrorName())), null, null, 12, null);
                    kotlin.coroutines.Continuation<java.lang.String> continuation2 = safeContinuation2;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    continuation2.resumeWith(kotlin.Result.m23436constructorimpl(null));
                }

                @Override // com.adobe.marketing.mobile.AdobeCallback
                public final void call(java.lang.String cloudId) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudId, "");
                    kotlin.coroutines.Continuation<java.lang.String> continuation2 = safeContinuation2;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    continuation2.resumeWith(kotlin.Result.m23436constructorimpl(cloudId));
                }
            });
        }
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
