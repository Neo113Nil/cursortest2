package com.paypal.oslo.feature.businesshome.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.domain.usecase.GetPayGetPaidVerificationStatusUseCaseImpl", f = "GetPayGetPaidVerificationStatusUseCaseImpl.kt", i = {2, 2, 2, 2, 2}, l = {34, 38, 45}, m = "invoke", n = {"accountSetupStatus", "this_$iv", "status", "$i$f$fold", "$i$a$-fold-GetPayGetPaidVerificationStatusUseCaseImpl$invoke$3"}, nl = {35, 39, 46}, s = {"L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes5.dex */
final class GetPayGetPaidVerificationStatusUseCaseImpl$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businesshome.domain.usecase.GetPayGetPaidVerificationStatusUseCaseImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetPayGetPaidVerificationStatusUseCaseImpl$invoke$1(com.paypal.oslo.feature.businesshome.domain.usecase.GetPayGetPaidVerificationStatusUseCaseImpl getPayGetPaidVerificationStatusUseCaseImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.domain.usecase.GetPayGetPaidVerificationStatusUseCaseImpl$invoke$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = getPayGetPaidVerificationStatusUseCaseImpl;
    }
}
