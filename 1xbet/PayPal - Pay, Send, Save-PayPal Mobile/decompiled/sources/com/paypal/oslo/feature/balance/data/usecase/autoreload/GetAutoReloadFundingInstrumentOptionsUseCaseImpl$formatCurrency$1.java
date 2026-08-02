package com.paypal.oslo.feature.balance.data.usecase.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl", f = "GetAutoReloadFundingInstrumentOptionsUseCaseImpl.kt", i = {0, 0}, l = {151}, m = "formatCurrency-sKlSBDo", n = {"currencyCode", "amount"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class GetAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor((java.lang.String) null, (java.math.BigDecimal) null, (kotlin.coroutines.Continuation<? super java.lang.String>) this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1(com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl getAutoReloadFundingInstrumentOptionsUseCaseImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = getAutoReloadFundingInstrumentOptionsUseCaseImpl;
    }
}
