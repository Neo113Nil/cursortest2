package com.paypal.oslo.feature.wallet.cards.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/cards/domain/update/model/UpdateCardError;", "Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateExpiryCardUseCase$invoke$1", f = "UpdateExpiryCardUseCase.kt", i = {0, 0, 1, 1}, l = {53, 53}, m = "invokeSuspend", n = {"$this$flow", "request", "$this$flow", "request"}, nl = {53, 54}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class UpdateExpiryCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardError, ? extends com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateExpiryCardUseCase getHighSpeedVideoSizesFor;
    int getInputFormats;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        if (r3.emit(r5, r16) == r2) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository cardRepository;
        java.lang.Object updateCard;
        com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardRequest updateCardRequest;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardRequest updateCardRequest2 = new com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardRequest(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, null, null, false, 112, null);
            cardRepository = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRangesFor;
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateCardRequest2);
            this.getOutputFormats = flowCollector2;
            this.getInputFormats = 1;
            updateCard = cardRepository.updateCard(updateCardRequest2, this);
            if (updateCard != coroutine_suspended) {
                updateCardRequest = updateCardRequest2;
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
        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getOutputFormats;
        com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardRequest updateCardRequest3 = (com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardRequest) this.getHighSpeedVideoFpsRanges;
        kotlin.ResultKt.throwOnFailure(obj);
        updateCardRequest = updateCardRequest3;
        updateCard = obj;
        this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateCardRequest);
        this.getOutputFormats = null;
        this.getInputFormats = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardError, ? extends com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateExpiryCardUseCase$invoke$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateExpiryCardUseCase$invoke$1 updateExpiryCardUseCase$invoke$1 = new com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateExpiryCardUseCase$invoke$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, continuation);
        updateExpiryCardUseCase$invoke$1.getInputSizeshNQ4ISI = obj;
        return updateExpiryCardUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateExpiryCardUseCase$invoke$1(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateExpiryCardUseCase updateExpiryCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateExpiryCardUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.Camera2StreamConfigurationMap = str3;
        this.getHighResolutionOutputSizeshNQ4ISI = str4;
        this.getHighSpeedVideoSizesFor = updateExpiryCardUseCase;
    }
}
