package androidx.compose.foundation.pager;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 1}, l = {691, 696}, m = "scroll$suspendImpl", n = {"$this", "scrollPriority", "block", "$this"}, s = {"L$0", "L$1", "L$2", "L$0"}, v = 1)
/* loaded from: classes.dex */
final class PagerState$scroll$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.foundation.pager.PagerState getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return androidx.compose.foundation.pager.PagerState.getHighResolutionOutputSizeshNQ4ISI(this.getOutputFormats, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagerState$scroll$1(androidx.compose.foundation.pager.PagerState pagerState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.pager.PagerState$scroll$1> continuation) {
        super(continuation);
        this.getOutputFormats = pagerState;
    }
}
