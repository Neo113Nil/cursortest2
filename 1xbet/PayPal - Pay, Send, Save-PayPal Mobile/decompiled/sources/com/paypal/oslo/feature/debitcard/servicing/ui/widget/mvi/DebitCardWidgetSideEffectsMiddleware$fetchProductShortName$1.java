package com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware", f = "DebitCardWidgetSideEffectsMiddleware.kt", i = {0, 0}, l = {383}, m = "fetchProductShortName", n = {com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "countryCode"}, nl = {387}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardWidgetSideEffectsMiddleware$fetchProductShortName$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName) null, (java.lang.String) null, (kotlin.coroutines.Continuation<? super java.lang.String>) this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardWidgetSideEffectsMiddleware$fetchProductShortName$1(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware debitCardWidgetSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$fetchProductShortName$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = debitCardWidgetSideEffectsMiddleware;
    }
}
