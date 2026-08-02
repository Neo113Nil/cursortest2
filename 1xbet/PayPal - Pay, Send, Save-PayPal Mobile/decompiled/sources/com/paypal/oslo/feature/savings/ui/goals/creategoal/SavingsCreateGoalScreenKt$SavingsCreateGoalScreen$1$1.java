package com.paypal.oslo.feature.savings.ui.goals.creategoal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$SavingsCreateGoalScreen$1$1", f = "SavingsCreateGoalScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsCreateGoalScreenKt$SavingsCreateGoalScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.savings.analytics.SavingsScreenTrackerKt.trackSavingsScreen$default(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.CreateGoal.SCREEN_CONTENT, null, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$SavingsCreateGoalScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$SavingsCreateGoalScreen$1$1(continuation);
    }

    SavingsCreateGoalScreenKt$SavingsCreateGoalScreen$1$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalScreenKt$SavingsCreateGoalScreen$1$1> continuation) {
        super(2, continuation);
    }
}
