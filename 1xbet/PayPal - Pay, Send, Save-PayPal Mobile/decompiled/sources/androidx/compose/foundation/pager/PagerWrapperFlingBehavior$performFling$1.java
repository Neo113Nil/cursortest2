package androidx.compose.foundation.pager;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "LazyLayoutPager.kt", i = {}, l = {384}, m = "performFling", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class PagerWrapperFlingBehavior$performFling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.pager.PagerWrapperFlingBehavior getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.performFling(null, 0.0f, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagerWrapperFlingBehavior$performFling$1(androidx.compose.foundation.pager.PagerWrapperFlingBehavior pagerWrapperFlingBehavior, kotlin.coroutines.Continuation<? super androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = pagerWrapperFlingBehavior;
    }
}
