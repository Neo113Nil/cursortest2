package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/savings/navigation/result/CreateGoalSuccessNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt$SavingsHomeNavResultHandlers$4$1", f = "SavingsHomeScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsHomeScreenKt$SavingsHomeNavResultHandlers$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.savings.navigation.result.CreateGoalSuccessNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.savings.navigation.result.CreateGoalSuccessNavResult createGoalSuccessNavResult = (com.paypal.oslo.feature.savings.navigation.result.CreateGoalSuccessNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeHelpersKt.m18865handleCreateGoalSuccessvFXjZRc(createGoalSuccessNavResult, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.savings.navigation.result.CreateGoalSuccessNavResult createGoalSuccessNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt$SavingsHomeNavResultHandlers$4$1) create(createGoalSuccessNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt$SavingsHomeNavResultHandlers$4$1 savingsHomeScreenKt$SavingsHomeNavResultHandlers$4$1 = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt$SavingsHomeNavResultHandlers$4$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        savingsHomeScreenKt$SavingsHomeNavResultHandlers$4$1.Camera2StreamConfigurationMap = obj;
        return savingsHomeScreenKt$SavingsHomeNavResultHandlers$4$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsHomeScreenKt$SavingsHomeNavResultHandlers$4$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt$SavingsHomeNavResultHandlers$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.getHighSpeedVideoSizes = str;
    }
}
