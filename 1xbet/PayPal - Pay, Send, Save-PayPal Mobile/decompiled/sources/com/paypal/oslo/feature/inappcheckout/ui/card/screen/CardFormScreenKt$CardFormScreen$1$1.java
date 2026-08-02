package com.paypal.oslo.feature.inappcheckout.ui.card.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$CardFormScreen$1$1", f = "CardFormScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CardFormScreenKt$CardFormScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams;
        java.lang.String fiId;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams2 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String cardBrand = updateCardParams2 != null ? updateCardParams2.getCardBrand() : null;
        com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams3 = this.getHighSpeedVideoFpsRangesFor;
        if (com.paypal.oslo.feature.inappcheckout.ui.util.CardUtilsKt.shouldLoadCardFormData(operationType, cardBrand, updateCardParams3 != null ? updateCardParams3.getLastDigits() : null) && (updateCardParams = this.getHighSpeedVideoFpsRangesFor) != null && (fiId = updateCardParams.getFiId()) != null) {
            this.getHighSpeedVideoSizes.loadCardFormData(fiId);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$CardFormScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$CardFormScreen$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardFormScreenKt$CardFormScreen$1$1(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType, com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams, com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$CardFormScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = operationType;
        this.getHighSpeedVideoFpsRangesFor = updateCardParams;
        this.getHighSpeedVideoSizes = cardSharedViewModel;
    }
}
