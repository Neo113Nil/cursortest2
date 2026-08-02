package com.paypal.oslo.feature.balance.data.usecase.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl", f = "GetAutoReloadFundingInstrumentOptionsUseCaseImpl.kt", i = {0, 0}, l = {134}, m = "toFundingInstrumentSavings", n = {"$this$toFundingInstrumentSavings", "currentBalance"}, nl = {136}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class GetAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccount) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption>) this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1(com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl getAutoReloadFundingInstrumentOptionsUseCaseImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = getAutoReloadFundingInstrumentOptionsUseCaseImpl;
    }
}
