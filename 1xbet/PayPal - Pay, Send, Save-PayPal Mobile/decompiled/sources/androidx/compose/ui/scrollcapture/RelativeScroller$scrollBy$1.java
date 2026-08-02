package androidx.compose.ui.scrollcapture;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.scrollcapture.RelativeScroller", f = "ComposeScrollCaptureCallback.android.kt", i = {}, l = {324}, m = "scrollBy", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class RelativeScroller$scrollBy$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.scrollcapture.RelativeScroller getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(0.0f, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RelativeScroller$scrollBy$1(androidx.compose.ui.scrollcapture.RelativeScroller relativeScroller, kotlin.coroutines.Continuation<? super androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = relativeScroller;
    }
}
