package com.paypal.oslo.feature.pushnotification.delivery.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase", f = "ProcessNotificationActionUseCase.kt", i = {0, 0, 0}, l = {71}, m = "invoke", n = {com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "code", "accountId"}, nl = {75}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class ProcessNotificationActionUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getInputFormats.invoke(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProcessNotificationActionUseCase$invoke$1(com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase processNotificationActionUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase$invoke$1> continuation) {
        super(continuation);
        this.getInputFormats = processNotificationActionUseCase;
    }
}
