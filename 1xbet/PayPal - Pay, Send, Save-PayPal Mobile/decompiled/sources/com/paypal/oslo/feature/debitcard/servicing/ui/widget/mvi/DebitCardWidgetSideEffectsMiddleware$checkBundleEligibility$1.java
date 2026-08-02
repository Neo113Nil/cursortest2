package com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware", f = "DebitCardWidgetSideEffectsMiddleware.kt", i = {}, l = {350}, m = "checkBundleEligibility", n = {}, nl = {408}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardWidgetSideEffectsMiddleware$checkBundleEligibility$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardWidgetSideEffectsMiddleware$checkBundleEligibility$1(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware debitCardWidgetSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$checkBundleEligibility$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = debitCardWidgetSideEffectsMiddleware;
    }
}
