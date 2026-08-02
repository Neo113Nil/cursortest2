package com.paypal.oslo.feature.wallet.cards.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/cards/domain/update/model/UpdateCardError;", "Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase$invoke$1", f = "UpdateNicknameUseCase.kt", i = {0, 0, 1, 1}, l = {48, 48}, m = "invokeSuspend", n = {"$this$flow", "request", "$this$flow", "request"}, nl = {48, 49}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class UpdateNicknameUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardError, ? extends com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0096, code lost:
    
        if (r3.emit(r6, r17) == r2) goto L21;
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
        kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (kotlin.text.StringsKt.isBlank(str2)) {
                str2 = null;
            }
            com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardRequest updateCardRequest2 = new com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardRequest(str, null, null, null, null, str2, kotlin.text.StringsKt.isBlank(this.getHighResolutionOutputSizeshNQ4ISI), 30, null);
            cardRepository = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateCardRequest2);
            this.Camera2StreamConfigurationMap = flowCollector2;
            this.getHighSpeedVideoSizes = 1;
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
        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardRequest updateCardRequest3 = (com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardRequest) this.getHighSpeedVideoFpsRangesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        updateCardRequest = updateCardRequest3;
        updateCard = obj;
        this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateCardRequest);
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardError, ? extends com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase$invoke$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase$invoke$1 updateNicknameUseCase$invoke$1 = new com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase$invoke$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats, continuation);
        updateNicknameUseCase$invoke$1.getHighSpeedVideoSizesFor = obj;
        return updateNicknameUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateNicknameUseCase$invoke$1(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase updateNicknameUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.getOutputFormats = updateNicknameUseCase;
    }
}
