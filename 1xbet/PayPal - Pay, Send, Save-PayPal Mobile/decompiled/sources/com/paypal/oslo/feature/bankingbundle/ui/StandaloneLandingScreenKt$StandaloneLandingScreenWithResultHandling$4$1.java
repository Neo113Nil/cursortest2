package com.paypal.oslo.feature.bankingbundle.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/category/navigation/result/CategoryNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$4$1", f = "StandaloneLandingScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.shoppingrewards.api.rewards.category.navigation.result.CategoryNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.shoppingrewards.api.rewards.category.navigation.result.CategoryNavResult categoryNavResult = (com.paypal.oslo.feature.shoppingrewards.api.rewards.category.navigation.result.CategoryNavResult) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges.handleIntent(new com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingIntent.OnCategorySelectionResult(categoryNavResult));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.api.rewards.category.navigation.result.CategoryNavResult categoryNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$4$1) create(categoryNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$4$1 standaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$4$1 = new com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$4$1(this.getHighSpeedVideoFpsRanges, continuation);
        standaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$4$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return standaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$4$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$4$1(com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel standaloneLandingViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingScreenKt$StandaloneLandingScreenWithResultHandling$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = standaloneLandingViewModel;
    }
}
