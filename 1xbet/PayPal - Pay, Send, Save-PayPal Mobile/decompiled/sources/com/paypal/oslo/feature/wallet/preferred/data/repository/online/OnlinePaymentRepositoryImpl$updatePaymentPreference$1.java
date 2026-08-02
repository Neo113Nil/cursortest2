package com.paypal.oslo.feature.wallet.preferred.data.repository.online;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.preferred.data.repository.online.OnlinePaymentRepositoryImpl", f = "OnlinePaymentRepositoryImpl.kt", i = {0, 0}, l = {64}, m = "updatePaymentPreference", n = {"financialInstrumentId", "input"}, nl = {65}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes16.dex */
final class OnlinePaymentRepositoryImpl$updatePaymentPreference$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.preferred.data.repository.online.OnlinePaymentRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.updatePaymentPreference(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnlinePaymentRepositoryImpl$updatePaymentPreference$1(com.paypal.oslo.feature.wallet.preferred.data.repository.online.OnlinePaymentRepositoryImpl onlinePaymentRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.preferred.data.repository.online.OnlinePaymentRepositoryImpl$updatePaymentPreference$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = onlinePaymentRepositoryImpl;
    }
}
