package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcherSnapshotState$Holder", f = "PageFetcherSnapshotState.kt", i = {0, 0}, l = {431}, m = "withLock", n = {"block", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes7.dex */
final class PageFetcherSnapshotState$Holder$withLock$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.paging.PageFetcherSnapshotState.Holder<Key, Value> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.withLock(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshotState$Holder$withLock$1(androidx.paging.PageFetcherSnapshotState.Holder<Key, Value> holder, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcherSnapshotState$Holder$withLock$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = holder;
    }
}
