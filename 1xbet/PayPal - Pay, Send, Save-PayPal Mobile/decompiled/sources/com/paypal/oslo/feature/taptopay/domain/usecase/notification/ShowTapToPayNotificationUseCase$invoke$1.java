package com.paypal.oslo.feature.taptopay.domain.usecase.notification;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase", f = "ShowTapToPayNotificationUseCase.kt", i = {0, 0}, l = {45}, m = "invoke", n = {"payPalTransaction", "transaction"}, nl = {47}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class ShowTapToPayNotificationUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShowTapToPayNotificationUseCase$invoke$1(com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase showTapToPayNotificationUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = showTapToPayNotificationUseCase;
    }
}
