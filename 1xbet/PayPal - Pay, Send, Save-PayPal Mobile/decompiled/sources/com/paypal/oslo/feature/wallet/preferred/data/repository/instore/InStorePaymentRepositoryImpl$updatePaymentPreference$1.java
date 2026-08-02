package com.paypal.oslo.feature.wallet.preferred.data.repository.instore;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl", f = "InStorePaymentRepositoryImpl.kt", i = {0, 0}, l = {67}, m = "updatePaymentPreference", n = {"params", "input"}, nl = {68}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes16.dex */
final class InStorePaymentRepositoryImpl$updatePaymentPreference$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.updatePaymentPreference(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InStorePaymentRepositoryImpl$updatePaymentPreference$1(com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl inStorePaymentRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl$updatePaymentPreference$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = inStorePaymentRepositoryImpl;
    }
}
