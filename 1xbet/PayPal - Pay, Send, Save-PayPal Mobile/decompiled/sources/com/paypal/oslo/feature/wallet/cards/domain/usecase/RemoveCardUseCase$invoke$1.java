package com.paypal.oslo.feature.wallet.cards.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/cards/domain/remove/model/CardRemoveError;", "Lcom/paypal/oslo/feature/wallet/cards/domain/remove/model/CardRemove;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.domain.usecase.RemoveCardUseCase$invoke$1", f = "RemoveCardUseCase.kt", i = {0, 1}, l = {43, 43}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, nl = {43, 44}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes15.dex */
final class RemoveCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemoveError, ? extends com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemove>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.usecase.RemoveCardUseCase Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r2.emit(r8, r7) == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository cardRepository;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cardRepository = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
            this.getHighResolutionOutputSizeshNQ4ISI = flowCollector2;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = cardRepository.removeCard(this.getHighSpeedVideoSizes, this);
            if (obj != coroutine_suspended) {
                flowCollector = flowCollector2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRangesFor = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemoveError, ? extends com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemove>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.domain.usecase.RemoveCardUseCase$invoke$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.cards.domain.usecase.RemoveCardUseCase$invoke$1 removeCardUseCase$invoke$1 = new com.paypal.oslo.feature.wallet.cards.domain.usecase.RemoveCardUseCase$invoke$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        removeCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = obj;
        return removeCardUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoveCardUseCase$invoke$1(com.paypal.oslo.feature.wallet.cards.domain.usecase.RemoveCardUseCase removeCardUseCase, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.domain.usecase.RemoveCardUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = removeCardUseCase;
        this.getHighSpeedVideoSizes = str;
    }
}
