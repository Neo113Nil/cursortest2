package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", i = {0, 0}, l = {496, 498}, m = "scroll", n = {"scrollPriority", "block"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes.dex */
final class LazyGridState$scroll$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.lazy.grid.LazyGridState getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.scroll(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyGridState$scroll$1(androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = lazyGridState;
    }
}
