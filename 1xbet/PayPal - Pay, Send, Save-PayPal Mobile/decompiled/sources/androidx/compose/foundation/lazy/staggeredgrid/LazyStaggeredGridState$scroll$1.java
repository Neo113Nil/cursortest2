package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState", f = "LazyStaggeredGridState.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, m = "scroll", n = {"scrollPriority", "block"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes.dex */
final class LazyStaggeredGridState$scroll$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.scroll(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyStaggeredGridState$scroll$1(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = lazyStaggeredGridState;
    }
}
