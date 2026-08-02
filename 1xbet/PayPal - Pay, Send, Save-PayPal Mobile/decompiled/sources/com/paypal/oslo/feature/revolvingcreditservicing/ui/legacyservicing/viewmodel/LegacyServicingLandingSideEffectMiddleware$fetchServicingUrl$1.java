package com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingSideEffectMiddleware", f = "LegacyServicingLandingSideEffectMiddleware.kt", i = {0, 0}, l = {48}, m = "fetchServicingUrl", n = {"eventDispatcher", "input"}, nl = {50}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class LegacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingSideEffectMiddleware getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingSideEffectMiddleware legacyServicingLandingSideEffectMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingSideEffectMiddleware$fetchServicingUrl$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = legacyServicingLandingSideEffectMiddleware;
    }
}
