package androidx.compose.foundation.pager;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0}, l = {663, 670}, m = "animateScrollToPage", n = {"animationSpec", "page", "pageOffsetFraction"}, s = {"L$0", "I$0", "F$0"}, v = 1)
/* loaded from: classes.dex */
final class PagerState$animateScrollToPage$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    float getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.foundation.pager.PagerState getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getOutputFormats.animateScrollToPage(0, 0.0f, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagerState$animateScrollToPage$1(androidx.compose.foundation.pager.PagerState pagerState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.pager.PagerState$animateScrollToPage$1> continuation) {
        super(continuation);
        this.getOutputFormats = pagerState;
    }
}
