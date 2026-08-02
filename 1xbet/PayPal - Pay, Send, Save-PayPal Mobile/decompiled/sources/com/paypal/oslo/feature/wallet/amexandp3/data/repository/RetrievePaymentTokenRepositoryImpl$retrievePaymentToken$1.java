package com.paypal.oslo.feature.wallet.amexandp3.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.amexandp3.data.repository.RetrievePaymentTokenRepositoryImpl", f = "RetrievePaymentTokenRepositoryImpl.kt", i = {0, 0}, l = {53}, m = "retrievePaymentToken", n = {"id", "query"}, nl = {54}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class RetrievePaymentTokenRepositoryImpl$retrievePaymentToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.data.repository.RetrievePaymentTokenRepositoryImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.retrievePaymentToken(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetrievePaymentTokenRepositoryImpl$retrievePaymentToken$1(com.paypal.oslo.feature.wallet.amexandp3.data.repository.RetrievePaymentTokenRepositoryImpl retrievePaymentTokenRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.amexandp3.data.repository.RetrievePaymentTokenRepositoryImpl$retrievePaymentToken$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = retrievePaymentTokenRepositoryImpl;
    }
}
