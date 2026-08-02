package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware", f = "PushProvisioningWidgetSideEffectsMiddleware.kt", i = {0, 0, 0}, l = {94}, m = "getPushProvisioningStatus", n = {"starPayClient", "eventDispatcher", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME}, nl = {101}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes12.dex */
final class PushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getInputFormats.getHighSpeedVideoSizes(null, null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware pushProvisioningWidgetSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1> continuation) {
        super(continuation);
        this.getInputFormats = pushProvisioningWidgetSideEffectsMiddleware;
    }
}
