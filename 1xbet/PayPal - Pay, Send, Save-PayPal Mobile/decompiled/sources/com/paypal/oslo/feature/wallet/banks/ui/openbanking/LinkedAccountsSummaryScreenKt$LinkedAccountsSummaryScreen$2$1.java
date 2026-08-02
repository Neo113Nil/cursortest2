package com.paypal.oslo.feature.wallet.banks.ui.openbanking;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt$LinkedAccountsSummaryScreen$2$1", f = "LinkedAccountsSummaryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class LinkedAccountsSummaryScreenKt$LinkedAccountsSummaryScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoFpsRangesFor.getValue()).booleanValue();
        if (!booleanValue) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                this.Camera2StreamConfigurationMap.finishFlowWithResult(this.getHighSpeedVideoFpsRanges);
            } else {
                this.Camera2StreamConfigurationMap.finishFlowWithResult(this.getHighSpeedVideoSizes);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt$LinkedAccountsSummaryScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt$LinkedAccountsSummaryScreen$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkedAccountsSummaryScreenKt$LinkedAccountsSummaryScreen$2$1(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> list, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success success, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error error, androidx.compose.runtime.State<java.lang.Boolean> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSummaryScreenKt$LinkedAccountsSummaryScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.Camera2StreamConfigurationMap = bankSharedViewModel;
        this.getHighSpeedVideoFpsRanges = success;
        this.getHighSpeedVideoSizes = error;
        this.getHighSpeedVideoFpsRangesFor = state;
    }
}
