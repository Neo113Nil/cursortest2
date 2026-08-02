package com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware", f = "DebitCardWidgetSideEffectsMiddleware.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 188}, m = "handleDataFetch", n = {"currentState", "eventDispatcher", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "request", "currentState", "eventDispatcher", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "request", "result", "instruments"}, nl = {181, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardWidgetSideEffectsMiddleware$handleDataFetch$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getInputFormats.getHighSpeedVideoFpsRanges(null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardWidgetSideEffectsMiddleware$handleDataFetch$1(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware debitCardWidgetSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$handleDataFetch$1> continuation) {
        super(continuation);
        this.getInputFormats = debitCardWidgetSideEffectsMiddleware;
    }
}
