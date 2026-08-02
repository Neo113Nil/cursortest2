package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl", f = "CLIRepositoryImpl.kt", i = {0, 0, 0}, l = {44}, m = "fetchCreditLineIncreaseOffer", n = {"creditProductIdentifier", "creditAccountId", "query"}, nl = {48}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes14.dex */
final class CLIRepositoryImpl$fetchCreditLineIncreaseOffer$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getOutputFormats.fetchCreditLineIncreaseOffer(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CLIRepositoryImpl$fetchCreditLineIncreaseOffer$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl cLIRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl$fetchCreditLineIncreaseOffer$1> continuation) {
        super(continuation);
        this.getOutputFormats = cLIRepositoryImpl;
    }
}
