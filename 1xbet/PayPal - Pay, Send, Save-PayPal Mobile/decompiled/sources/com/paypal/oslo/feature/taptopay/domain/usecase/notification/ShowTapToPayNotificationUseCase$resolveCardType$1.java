package com.paypal.oslo.feature.taptopay.domain.usecase.notification;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase", f = "ShowTapToPayNotificationUseCase.kt", i = {0}, l = {94}, m = "resolveCardType", n = {"cardId"}, nl = {95}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class ShowTapToPayNotificationUseCase$resolveCardType$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShowTapToPayNotificationUseCase$resolveCardType$1(com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase showTapToPayNotificationUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase$resolveCardType$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = showTapToPayNotificationUseCase;
    }
}
