package com.paypal.oslo.feature.xoom.ui.sendmoney;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel", f = "SendMoneyViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m = "createOnInitializedEventWithUrlAndHeaders", n = {"sendCurrencyCode", "receiveCurrencyCode", "destinationCountryCode", "amount", "refTag", "sendMoneyUrl", "initialUrl"}, nl = {192}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"}, v = 2)
/* loaded from: classes16.dex */
final class SendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel.access$createOnInitializedEventWithUrlAndHeaders(this.getInputSizeshNQ4ISI, null, null, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel sendMoneyViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = sendMoneyViewModel;
    }
}
