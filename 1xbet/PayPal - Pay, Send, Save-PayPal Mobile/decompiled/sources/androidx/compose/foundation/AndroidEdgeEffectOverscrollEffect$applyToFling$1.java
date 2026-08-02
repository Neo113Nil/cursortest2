package androidx.compose.foundation;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", i = {1}, l = {688, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT}, m = "applyToFling-BMRW4eQ", n = {"remainingVelocity"}, s = {"J$0"}, v = 1)
/* loaded from: classes6.dex */
final class AndroidEdgeEffectOverscrollEffect$applyToFling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    long getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.mo1265applyToFlingBMRW4eQ(0L, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidEdgeEffectOverscrollEffect$applyToFling$1(androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, kotlin.coroutines.Continuation<? super androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = androidEdgeEffectOverscrollEffect;
    }
}
