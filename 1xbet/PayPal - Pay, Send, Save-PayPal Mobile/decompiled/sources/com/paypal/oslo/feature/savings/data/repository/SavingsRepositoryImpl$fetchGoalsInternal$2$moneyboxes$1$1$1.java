package com.paypal.oslo.feature.savings.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/paypal/oslo/feature/savings/domain/model/MoneyboxData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1$1$1", f = "SavingsRepositoryImpl.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends com.paypal.oslo.feature.savings.domain.model.MoneyboxData>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ arrow.core.raise.Raise<com.paypal.oslo.feature.savings.domain.model.SavingsError> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient;
        arrow.core.raise.Raise<com.paypal.oslo.feature.savings.domain.model.SavingsError> raise;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            arrow.core.raise.Raise<com.paypal.oslo.feature.savings.domain.model.SavingsError> raise2 = this.getHighResolutionOutputSizeshNQ4ISI;
            savingsApolloClient = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = raise2;
            this.Camera2StreamConfigurationMap = 1;
            java.lang.Object goals = savingsApolloClient.getGoals(this.getHighSpeedVideoFpsRanges, this);
            if (goals == coroutine_suspended) {
                return coroutine_suspended;
            }
            raise = raise2;
            obj = goals;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            raise = (arrow.core.raise.Raise) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return raise.bind((arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, ? extends A>) obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends com.paypal.oslo.feature.savings.domain.model.MoneyboxData>> continuation) {
        return ((com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SavingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1$1$1(arrow.core.raise.Raise<? super com.paypal.oslo.feature.savings.domain.model.SavingsError> raise, com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl savingsRepositoryImpl, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = raise;
        this.getHighSpeedVideoSizes = savingsRepositoryImpl;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
