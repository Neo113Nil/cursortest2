package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitPinNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$4$1", f = "DebitCardManagementScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardManagementScreenKt$DebitCardManagementScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState> getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult debitPinNavResult = (com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult) this.getOutputMinFrameDuration;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (debitPinNavResult.isPinSet()) {
            this.getHighResolutionOutputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt.getPinSuccessToastMessage(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt.access$DebitCardManagementScreen$lambda$0(this.getHighSpeedVideoSizes), com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt.access$DebitCardManagementScreen$lambda$0(this.getHighSpeedVideoSizes).getCardId(), this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap));
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel debitCardManagementViewModel = this.getHighSpeedVideoFpsRanges;
            java.lang.String cardId = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt.access$DebitCardManagementScreen$lambda$0(this.getHighSpeedVideoSizes).getCardId();
            if (cardId == null) {
                cardId = "";
            }
            debitCardManagementViewModel.processEvent(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LoadCardDetails(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshByCardId(cardId, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.None.INSTANCE)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult debitPinNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$4$1) create(debitPinNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$4$1 debitCardManagementScreenKt$DebitCardManagementScreen$4$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$4$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        debitCardManagementScreenKt$DebitCardManagementScreen$4$1.getOutputMinFrameDuration = obj;
        return debitCardManagementScreenKt$DebitCardManagementScreen$4$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DebitCardManagementScreenKt$DebitCardManagementScreen$4$1(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel debitCardManagementViewModel, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState> state, androidx.compose.runtime.MutableState<java.lang.String> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoFpsRanges = debitCardManagementViewModel;
        this.getHighSpeedVideoSizes = state;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
    }
}
