package com.paypal.oslo.feature.oneonboarding.ui.common;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$ContextualFocusAndAnalyticsEffects$3$1", f = "ContextualErrorBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ContextualErrorBannerKt$ContextualFocusAndAnalyticsEffects$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list = this.getHighSpeedVideoSizes;
        if (list != null) {
            android.content.Context context = this.Camera2StreamConfigurationMap;
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMapperKt.toErrorMessage((com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo) obj2, context) != null) {
                    break;
                }
            }
            com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo contextualInfo = (com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo) obj2;
            if (contextualInfo != null) {
                com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage errorMessage = com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMapperKt.toErrorMessage(contextualInfo, this.Camera2StreamConfigurationMap);
                if (errorMessage == null) {
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.oslo.feature.oneonboarding.analytics.ProvisioningAnalyticsKt.trackPageError(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalytics.ACTION_PROVISION_PRODUCT, contextualInfo.getIssue(), errorMessage.getTitle());
                return kotlin.Unit.INSTANCE;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$ContextualFocusAndAnalyticsEffects$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$ContextualFocusAndAnalyticsEffects$3$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContextualErrorBannerKt$ContextualFocusAndAnalyticsEffects$3$1(java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list, android.content.Context context, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$ContextualFocusAndAnalyticsEffects$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = list;
        this.Camera2StreamConfigurationMap = context;
        this.getHighResolutionOutputSizeshNQ4ISI = intentId;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
