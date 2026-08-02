package androidx.compose.ui.scrollcapture;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {136, 138, 142}, m = "onScrollCaptureImageRequest", n = {"session", "captureArea", "targetMin", "targetMax", "session", "captureArea", "targetMin", "targetMax", "session", "captureArea", "targetMin", "targetMax"}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 1)
/* loaded from: classes6.dex */
final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback getInputFormats;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object aW_;
        this.getOutputFormats = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        aW_ = this.getInputFormats.aW_(null, null, this);
        return aW_;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2(androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback composeScrollCaptureCallback, kotlin.coroutines.Continuation<? super androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2> continuation) {
        super(continuation);
        this.getInputFormats = composeScrollCaptureCallback;
    }
}
