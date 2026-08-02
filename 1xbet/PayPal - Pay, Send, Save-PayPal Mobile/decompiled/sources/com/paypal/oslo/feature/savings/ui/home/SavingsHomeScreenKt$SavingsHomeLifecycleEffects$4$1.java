package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt$SavingsHomeLifecycleEffects$4$1", f = "SavingsHomeScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsHomeScreenKt$SavingsHomeLifecycleEffects$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeState getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeState savingsHomeState = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success success = savingsHomeState instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success ? (com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success) savingsHomeState : null;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalForSuccessSheet = success != null ? success.getGoalForSuccessSheet() : null;
        if (com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt.access$canShowSuccessSheet(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes.getLastGoalSuccess()) && goalForSuccessSheet != null) {
            this.Camera2StreamConfigurationMap.invoke();
            this.getHighSpeedVideoSizes.setLastGoalSuccess(goalForSuccessSheet.getId());
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt$SavingsHomeLifecycleEffects$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt$SavingsHomeLifecycleEffects$4$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsHomeScreenKt$SavingsHomeLifecycleEffects$4$1(com.paypal.oslo.feature.savings.ui.home.SavingsHomeState savingsHomeState, com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel savingsHomeViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt$SavingsHomeLifecycleEffects$4$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = savingsHomeState;
        this.getHighSpeedVideoSizes = savingsHomeViewModel;
        this.Camera2StreamConfigurationMap = function0;
    }
}
