package com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel", f = "PlaidViewModel.kt", i = {0, 0, 0, 0}, l = {com.visa.cbp.getCertUsage.setAucAID}, m = "handleAddAction", n = {"jsonData", "publicToken", "institutionId", "instituteName"}, nl = {com.visa.cbp.getCertUsage.setAppPrgrmID}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes15.dex */
final class PlaidViewModel$handleAddAction$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.access$handleAddAction(this.getInputSizeshNQ4ISI, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlaidViewModel$handleAddAction$1(com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel plaidViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$handleAddAction$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = plaidViewModel;
    }
}
