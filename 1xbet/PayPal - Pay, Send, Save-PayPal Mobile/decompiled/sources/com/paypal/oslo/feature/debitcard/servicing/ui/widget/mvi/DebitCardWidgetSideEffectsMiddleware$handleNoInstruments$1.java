package com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware", f = "DebitCardWidgetSideEffectsMiddleware.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, 247}, m = "handleNoInstruments", n = {com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "eventDispatcher", "countryCode", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "eventDispatcher", "countryCode", "hideReason"}, nl = {236, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardWidgetSideEffectsMiddleware$handleNoInstruments$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getOutputMinFrameDuration = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputFormats.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName) null, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent, kotlin.Unit>) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardWidgetSideEffectsMiddleware$handleNoInstruments$1(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware debitCardWidgetSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$handleNoInstruments$1> continuation) {
        super(continuation);
        this.getOutputFormats = debitCardWidgetSideEffectsMiddleware;
    }
}
