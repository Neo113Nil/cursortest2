package com.paypal.oslo.feature.savings.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsError;", "Lcom/paypal/oslo/feature/savings/domain/model/DepositOptionsData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase$invoke$2$deferredFiOptionsCall$1", f = "GetFinancialInstrumentsUseCase.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class GetFinancialInstrumentsUseCase$invoke$2$deferredFiOptionsCall$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, ? extends com.paypal.oslo.feature.savings.domain.model.DepositOptionsData>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.DepositOptionsInput getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.savings.domain.usecase.GetDepositOptionsUseCase getDepositOptionsUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        getDepositOptionsUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object invoke = getDepositOptionsUseCase.invoke(this.getHighSpeedVideoFpsRanges, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, ? extends com.paypal.oslo.feature.savings.domain.model.DepositOptionsData>> continuation) {
        return ((com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase$invoke$2$deferredFiOptionsCall$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase$invoke$2$deferredFiOptionsCall$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetFinancialInstrumentsUseCase$invoke$2$deferredFiOptionsCall$1(com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase getFinancialInstrumentsUseCase, com.paypal.oslo.feature.savings.domain.model.DepositOptionsInput depositOptionsInput, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase$invoke$2$deferredFiOptionsCall$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = getFinancialInstrumentsUseCase;
        this.getHighSpeedVideoFpsRanges = depositOptionsInput;
    }
}
