package com.paypal.oslo.feature.bankingbundle.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bankingbundle.ui.BenefitsComparisonScreenKt$BenefitsComparisonScreen$1$1", f = "BenefitsComparisonScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BenefitsComparisonScreenKt$BenefitsComparisonScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAvailable(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.BenefitsComparisonScreen.IDENTIFIER), null, null, null, 14, null), com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.INSTANCE.getScreenShownAction(), null, null, null, 28, null).track(com.paypal.oslo.feature.bankingbundle.AnalyticsTrackerKt.analyticsTracker);
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAvailable(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.BenefitsComparisonScreen.IDENTIFIER), null, null, null, 14, null), com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.INSTANCE.getScreenLoadedAction(), null, null, null, 28, null).track(com.paypal.oslo.feature.bankingbundle.AnalyticsTrackerKt.analyticsTracker);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bankingbundle.ui.BenefitsComparisonScreenKt$BenefitsComparisonScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bankingbundle.ui.BenefitsComparisonScreenKt$BenefitsComparisonScreen$1$1(continuation);
    }

    BenefitsComparisonScreenKt$BenefitsComparisonScreen$1$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bankingbundle.ui.BenefitsComparisonScreenKt$BenefitsComparisonScreen$1$1> continuation) {
        super(2, continuation);
    }
}
