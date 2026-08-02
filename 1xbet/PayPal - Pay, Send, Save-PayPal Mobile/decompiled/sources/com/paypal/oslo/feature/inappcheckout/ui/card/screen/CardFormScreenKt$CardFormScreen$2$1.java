package com.paypal.oslo.feature.inappcheckout.ui.card.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$CardFormScreen$2$1", f = "CardFormScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CardFormScreenKt$CardFormScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity> getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel = this.getHighSpeedVideoSizesFor;
        com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String fiId = updateCardParams != null ? updateCardParams.getFiId() : null;
        com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams2 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String cardBrand = updateCardParams2 != null ? updateCardParams2.getCardBrand() : null;
        com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams3 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String lastDigits = updateCardParams3 != null ? updateCardParams3.getLastDigits() : null;
        com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity access$CardFormScreen$lambda$1 = com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt.access$CardFormScreen$lambda$1(this.getHighSpeedVideoFpsRanges);
        com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity access$CardFormScreen$lambda$2 = com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt.access$CardFormScreen$lambda$2(this.getHighSpeedVideoSizes);
        booleanValue = ((java.lang.Boolean) this.Camera2StreamConfigurationMap.getValue()).booleanValue();
        cardFormViewModel.initialize(operationType, fiId, cardBrand, lastDigits, access$CardFormScreen$lambda$1, access$CardFormScreen$lambda$2, booleanValue);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$CardFormScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$CardFormScreen$2$1(this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardFormScreenKt$CardFormScreen$2$1(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel, com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType, com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams, androidx.compose.runtime.State<com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity> state, androidx.compose.runtime.State<com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity> state2, androidx.compose.runtime.State<java.lang.Boolean> state3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$CardFormScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = cardFormViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = operationType;
        this.getHighSpeedVideoFpsRangesFor = updateCardParams;
        this.getHighSpeedVideoFpsRanges = state;
        this.getHighSpeedVideoSizes = state2;
        this.Camera2StreamConfigurationMap = state3;
    }
}
