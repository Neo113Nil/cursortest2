package com.paypal.oslo.feature.balance.data.usecase.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl", f = "GetAutoReloadFundingInstrumentOptionsUseCaseImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {53, 54, 55, 56}, m = "invoke", n = {"amount", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "request", "isLowBalance", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-GetAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$2", "amount", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "request", "it", "isLowBalance", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-GetAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$2", "$i$a$-let-GetAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$2$depositOptions$1", "amount", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "depositOptions", "request", "isLowBalance", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-GetAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$2", "amount", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "depositOptions", "request", "it", "isLowBalance", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-GetAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$2", "$i$a$-let-GetAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$2$savingsOptions$1"}, nl = {54, 54, 56, 56}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes11.dex */
final class GetAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl getOutputSizeshNQ4ISI;
    boolean getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.invoke(null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1(com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl getAutoReloadFundingInstrumentOptionsUseCaseImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = getAutoReloadFundingInstrumentOptionsUseCaseImpl;
    }
}
