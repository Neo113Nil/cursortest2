package com.paypal.oslo.feature.pushnotification.delivery.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationActionRepositoryImpl", f = "NotificationActionRepositoryImpl.kt", i = {0, 0, 0, 0, 0}, l = {49}, m = "processAction", n = {com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "code", "accountId", "input", "mutation"}, nl = {85}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes5.dex */
final class NotificationActionRepositoryImpl$processAction$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationActionRepositoryImpl getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getInputFormats.processAction(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationActionRepositoryImpl$processAction$1(com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationActionRepositoryImpl notificationActionRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationActionRepositoryImpl$processAction$1> continuation) {
        super(continuation);
        this.getInputFormats = notificationActionRepositoryImpl;
    }
}
