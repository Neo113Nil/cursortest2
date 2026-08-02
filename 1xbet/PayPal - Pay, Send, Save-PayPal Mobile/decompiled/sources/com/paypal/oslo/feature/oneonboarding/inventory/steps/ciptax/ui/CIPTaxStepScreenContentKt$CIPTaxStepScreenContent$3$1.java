package com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$3$1", f = "CIPTaxStepScreenContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.Pair pair;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list = this.Camera2StreamConfigurationMap;
        if (list != null) {
            android.content.Context context = this.getHighSpeedVideoFpsRangesFor;
            java.util.Iterator<T> it = list.iterator();
            do {
                pair = null;
                if (!it.hasNext()) {
                    break;
                }
                com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo contextualInfo = (com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo) it.next();
                com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage errorMessage = com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMapperKt.toErrorMessage(contextualInfo, context);
                if (errorMessage != null) {
                    pair = kotlin.TuplesKt.to(contextualInfo, errorMessage);
                }
            } while (pair == null);
            if (pair != null) {
                com.paypal.oslo.feature.oneonboarding.analytics.ProvisioningAnalyticsKt.trackPageError(this.getHighSpeedVideoSizes, com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.analytics.CipTaxStepAnalytics.SCREEN_ID_CIP_TAX, com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalytics.ACTION_PROVISION_PRODUCT, ((com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo) pair.component1()).getIssue(), ((com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage) pair.component2()).getTitle());
                return kotlin.Unit.INSTANCE;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$3$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$3$1(java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = list;
        this.getHighSpeedVideoSizes = intentId;
        this.getHighSpeedVideoFpsRangesFor = context;
    }
}
