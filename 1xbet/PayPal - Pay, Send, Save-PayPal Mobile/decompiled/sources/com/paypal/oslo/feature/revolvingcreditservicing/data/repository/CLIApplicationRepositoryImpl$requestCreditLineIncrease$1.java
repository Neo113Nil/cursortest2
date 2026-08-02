package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIApplicationRepositoryImpl", f = "CLIApplicationRepositoryImpl.kt", i = {0, 0}, l = {41}, m = "requestCreditLineIncrease", n = {"request", "mutation"}, nl = {45}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class CLIApplicationRepositoryImpl$requestCreditLineIncrease$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIApplicationRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.requestCreditLineIncrease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CLIApplicationRepositoryImpl$requestCreditLineIncrease$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIApplicationRepositoryImpl cLIApplicationRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIApplicationRepositoryImpl$requestCreditLineIncrease$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = cLIApplicationRepositoryImpl;
    }
}
