package com.paypal.oslo.feature.balance.data.usecase.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl", f = "GetAutoReloadFundingInstrumentOptionsUseCaseImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {103}, m = "toFundingInstrumentBank", n = {"$this$toFundingInstrumentBank", "bank", "maximumLimit", "displayName", "it", "$i$a$-let-GetAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$2"}, nl = {103}, s = {"L$0", "L$1", "L$2", "L$3", "L$11", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class GetAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    boolean getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    /* synthetic */ java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl isOutputSupportedForhNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getValidOutputFormatsForInputhNQ4ISI = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOption) null, (com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.BankAccount) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption>) this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1(com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl getAutoReloadFundingInstrumentOptionsUseCaseImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1> continuation) {
        super(continuation);
        this.isOutputSupportedForhNQ4ISI = getAutoReloadFundingInstrumentOptionsUseCaseImpl;
    }
}
