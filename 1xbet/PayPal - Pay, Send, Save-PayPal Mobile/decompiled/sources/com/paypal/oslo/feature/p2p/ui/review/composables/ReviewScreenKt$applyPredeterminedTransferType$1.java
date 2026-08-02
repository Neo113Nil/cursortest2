package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt", f = "ReviewScreen.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {1702}, m = "applyPredeterminedTransferType", n = {"attempt", "viewModels", "onNavigateToScamAlert", "onNavigateToHighRiskScamDecline", "selectedTransferType", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE, "typeId", "selectedShippingAddressId"}, nl = {1701}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"}, v = 2)
/* loaded from: classes13.dex */
final class ReviewScreenKt$applyPredeterminedTransferType$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.access$applyPredeterminedTransferType(null, null, null, null, this);
    }

    ReviewScreenKt$applyPredeterminedTransferType$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$applyPredeterminedTransferType$1> continuation) {
        super(continuation);
    }
}
