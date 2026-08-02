package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/savings/navigation/result/TaxStatementPreferenceNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt$SavingsHomeNavResultHandlers$6$1", f = "SavingsHomeScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsHomeScreenKt$SavingsHomeNavResultHandlers$6$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.savings.navigation.result.TaxStatementPreferenceNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.savings.navigation.result.TaxStatementPreferenceNavResult taxStatementPreferenceNavResult = (com.paypal.oslo.feature.savings.navigation.result.TaxStatementPreferenceNavResult) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt.handleTaxPreferenceConfirm(this.Camera2StreamConfigurationMap, taxStatementPreferenceNavResult.getSelectedDigital(), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.savings.navigation.result.TaxStatementPreferenceNavResult taxStatementPreferenceNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt$SavingsHomeNavResultHandlers$6$1) create(taxStatementPreferenceNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt$SavingsHomeNavResultHandlers$6$1 savingsHomeScreenKt$SavingsHomeNavResultHandlers$6$1 = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt$SavingsHomeNavResultHandlers$6$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        savingsHomeScreenKt$SavingsHomeNavResultHandlers$6$1.getHighSpeedVideoFpsRangesFor = obj;
        return savingsHomeScreenKt$SavingsHomeNavResultHandlers$6$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsHomeScreenKt$SavingsHomeNavResultHandlers$6$1(com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel savingsHomeViewModel, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt$SavingsHomeNavResultHandlers$6$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = savingsHomeViewModel;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
    }
}
