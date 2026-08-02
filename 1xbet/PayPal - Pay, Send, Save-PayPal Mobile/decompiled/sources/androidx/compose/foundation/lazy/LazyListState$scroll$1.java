package androidx.compose.foundation.lazy;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", i = {0, 0}, l = {462, 464}, m = "scroll", n = {"scrollPriority", "block"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes.dex */
final class LazyListState$scroll$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.lazy.LazyListState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.scroll(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyListState$scroll$1(androidx.compose.foundation.lazy.LazyListState lazyListState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.lazy.LazyListState$scroll$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = lazyListState;
    }
}
