package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/ReplaceDigitalCardNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$1$1", f = "DebitCardManagementScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardManagementScreenKt$DebitCardManagementScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.debitcard.servicing.navigation.result.ReplaceDigitalCardNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getHighSpeedVideoSizes;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.debitcard.servicing.navigation.result.ReplaceDigitalCardNavResult replaceDigitalCardNavResult = (com.paypal.oslo.feature.debitcard.servicing.navigation.result.ReplaceDigitalCardNavResult) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputFormats != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (replaceDigitalCardNavResult.isRefreshRequired()) {
            this.Camera2StreamConfigurationMap.setValue(this.getHighSpeedVideoFpsRanges);
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.ReplaceDigitalCardAnalytics.SCREEN_SUCCESS, com.paypal.oslo.feature.debitcard.shared.analytics.ReplaceDigitalCardAnalytics.INSTANCE.getUserIntent(this.getHighSpeedVideoSizes), null, null, 12, null);
            this.getHighResolutionOutputSizeshNQ4ISI.processEvent(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LoadCardDetails(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshAllCards(null, 1, null)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.navigation.result.ReplaceDigitalCardNavResult replaceDigitalCardNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$1$1) create(replaceDigitalCardNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$1$1 debitCardManagementScreenKt$DebitCardManagementScreen$1$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        debitCardManagementScreenKt$DebitCardManagementScreen$1$1.getHighSpeedVideoFpsRangesFor = obj;
        return debitCardManagementScreenKt$DebitCardManagementScreen$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardManagementScreenKt$DebitCardManagementScreen$1$1(java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel debitCardManagementViewModel, androidx.compose.runtime.MutableState<java.lang.String> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = debitCardProductName;
        this.getHighResolutionOutputSizeshNQ4ISI = debitCardManagementViewModel;
        this.Camera2StreamConfigurationMap = mutableState;
    }
}
