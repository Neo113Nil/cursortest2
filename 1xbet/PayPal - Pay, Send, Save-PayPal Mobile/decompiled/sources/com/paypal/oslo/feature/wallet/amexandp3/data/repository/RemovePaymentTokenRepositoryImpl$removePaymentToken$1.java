package com.paypal.oslo.feature.wallet.amexandp3.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.amexandp3.data.repository.RemovePaymentTokenRepositoryImpl", f = "RemovePaymentTokenRepositoryImpl.kt", i = {0, 0}, l = {49}, m = "removePaymentToken", n = {"paymentTokenId", "mutation"}, nl = {50}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class RemovePaymentTokenRepositoryImpl$removePaymentToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.data.repository.RemovePaymentTokenRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.removePaymentToken(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemovePaymentTokenRepositoryImpl$removePaymentToken$1(com.paypal.oslo.feature.wallet.amexandp3.data.repository.RemovePaymentTokenRepositoryImpl removePaymentTokenRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.amexandp3.data.repository.RemovePaymentTokenRepositoryImpl$removePaymentToken$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = removePaymentTokenRepositoryImpl;
    }
}
