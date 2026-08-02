package com.paypal.oslo.feature.savings.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/paypal/oslo/feature/savings/domain/model/MoneyboxData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1", f = "SavingsRepositoryImpl.kt", i = {0}, l = {143}, m = "invokeSuspend", n = {"$this$coroutineScope"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class SavingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends java.util.List<? extends com.paypal.oslo.feature.savings.domain.model.MoneyboxData>>>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ arrow.core.raise.Raise<com.paypal.oslo.feature.savings.domain.model.SavingsError> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Deferred async$default;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.List<java.lang.String> savings_goal_types = com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories.INSTANCE.getSAVINGS_GOAL_TYPES();
        arrow.core.raise.Raise<com.paypal.oslo.feature.savings.domain.model.SavingsError> raise = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl savingsRepositoryImpl = this.getHighSpeedVideoSizes;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(savings_goal_types, 10));
        java.util.Iterator<T> it = savings_goal_types.iterator();
        while (it.hasNext()) {
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1$1$1(raise, savingsRepositoryImpl, (java.lang.String) it.next(), null), 3, null);
            arrayList.add(async$default);
        }
        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.Object awaitAll = kotlinx.coroutines.AwaitKt.awaitAll(arrayList, this);
        return awaitAll == coroutine_suspended ? coroutine_suspended : awaitAll;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends java.util.List<? extends com.paypal.oslo.feature.savings.domain.model.MoneyboxData>>> continuation) {
        return ((com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1 savingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        savingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1.getHighSpeedVideoFpsRanges = obj;
        return savingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SavingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1(arrow.core.raise.Raise<? super com.paypal.oslo.feature.savings.domain.model.SavingsError> raise, com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl savingsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = raise;
        this.getHighSpeedVideoSizes = savingsRepositoryImpl;
    }
}
