package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE}, m = "awaitFirstDown", n = {"$this$awaitFirstDown", "pass", "requireUnconsumed"}, s = {"L$0", "L$1", "Z$0"}, v = 1)
/* loaded from: classes.dex */
final class TapGestureDetectorKt$awaitFirstDown$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(null, false, null, this);
    }

    TapGestureDetectorKt$awaitFirstDown$2(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2> continuation) {
        super(continuation);
    }
}
