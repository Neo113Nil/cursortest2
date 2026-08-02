package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0}, l = {647}, m = "currentPagingState", n = {"this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes7.dex */
final class PageFetcherSnapshot$currentPagingState$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.paging.PageFetcherSnapshot<Key, Value> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.currentPagingState(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$currentPagingState$1(androidx.paging.PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcherSnapshot$currentPagingState$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = pageFetcherSnapshot;
    }
}
