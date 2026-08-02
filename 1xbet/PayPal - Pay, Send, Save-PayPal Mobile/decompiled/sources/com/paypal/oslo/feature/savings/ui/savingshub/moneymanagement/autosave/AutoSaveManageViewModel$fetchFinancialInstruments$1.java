package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel", f = "AutoSaveManageViewModel.kt", i = {0, 0, 0, 0}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.ENROLLMENT_MOBILE_WALLET_ALREADY_ENROLLED}, m = "fetchFinancialInstruments", n = {"amount", "currencyCode", "onSuccess", "depositOptionsInput"}, nl = {535}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes14.dex */
final class AutoSaveManageViewModel$fetchFinancialInstruments$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getInputFormats = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(null, null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoSaveManageViewModel$fetchFinancialInstruments$1(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$fetchFinancialInstruments$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = autoSaveManageViewModel;
    }
}
