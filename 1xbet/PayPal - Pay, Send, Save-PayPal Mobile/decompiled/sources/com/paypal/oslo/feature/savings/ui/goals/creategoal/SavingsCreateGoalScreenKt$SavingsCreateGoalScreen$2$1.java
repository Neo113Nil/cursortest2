package com.paypal.oslo.feature.savings.ui.goals.creategoal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/savings/navigation/result/CreateGoalSuccessNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$SavingsCreateGoalScreen$2$1", f = "SavingsCreateGoalScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsCreateGoalScreenKt$SavingsCreateGoalScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.savings.navigation.result.CreateGoalSuccessNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final com.paypal.oslo.feature.savings.navigation.result.CreateGoalSuccessNavResult createGoalSuccessNavResult = (com.paypal.oslo.feature.savings.navigation.result.CreateGoalSuccessNavResult) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$SavingsCreateGoalScreen$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$SavingsCreateGoalScreen$2$1.getHighSpeedVideoSizes(com.paypal.oslo.feature.savings.navigation.result.CreateGoalSuccessNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.savings.navigation.result.CreateGoalSuccessNavResult createGoalSuccessNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(createGoalSuccessNavResult);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.savings.navigation.result.CreateGoalSuccessNavResult createGoalSuccessNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$SavingsCreateGoalScreen$2$1) create(createGoalSuccessNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$SavingsCreateGoalScreen$2$1 savingsCreateGoalScreenKt$SavingsCreateGoalScreen$2$1 = new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$SavingsCreateGoalScreen$2$1(this.Camera2StreamConfigurationMap, continuation);
        savingsCreateGoalScreenKt$SavingsCreateGoalScreen$2$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return savingsCreateGoalScreenKt$SavingsCreateGoalScreen$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsCreateGoalScreenKt$SavingsCreateGoalScreen$2$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$SavingsCreateGoalScreen$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = appNavigator;
    }
}
