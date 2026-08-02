package com.paypal.oslo.feature.p2p.ui.claim.middlewares;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware", f = "ClaimPreviewMiddleware.kt", i = {0, 0}, l = {119}, m = "toClaimPreviewData", n = {"$this$toClaimPreviewData", "currencySymbol"}, nl = {120}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class ClaimPreviewMiddleware$toClaimPreviewData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClaimPreviewMiddleware$toClaimPreviewData$1(com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware claimPreviewMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.claim.middlewares.ClaimPreviewMiddleware$toClaimPreviewData$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = claimPreviewMiddleware;
    }
}
