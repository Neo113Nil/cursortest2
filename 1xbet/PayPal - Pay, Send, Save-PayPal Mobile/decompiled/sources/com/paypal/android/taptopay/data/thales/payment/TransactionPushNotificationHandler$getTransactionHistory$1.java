package com.paypal.android.taptopay.data.thales.payment;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler", f = "TransactionPushNotificationHandler.kt", i = {}, l = {91}, m = "getTransactionHistory", n = {}, s = {})
/* loaded from: classes4.dex */
final class TransactionPushNotificationHandler$getTransactionHistory$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionPushNotificationHandler$getTransactionHistory$1(com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler transactionPushNotificationHandler, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$getTransactionHistory$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = transactionPushNotificationHandler;
    }
}
