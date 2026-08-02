package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0, 1, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6, 7, 7, 7, 8}, l = {647, 300, 306, 669, 691, com.visa.cbp.getCertUsage.getODAData, 713, 735, 361}, m = "doInitialLoad", n = {"this_$iv", "$this$withLock_u24default$iv$iv", "$this$withLock_u24default$iv$iv", "result", "this_$iv", "$this$withLock_u24default$iv$iv", "result", "this_$iv", "$this$withLock_u24default$iv$iv", "result", "$this$withLock_u24default$iv$iv", "result", "this_$iv", "$this$withLock_u24default$iv$iv", "result", "this_$iv", "$this$withLock_u24default$iv$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0"}, v = 1)
/* loaded from: classes7.dex */
final class PageFetcherSnapshot$doInitialLoad$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ androidx.paging.PageFetcherSnapshot<Key, Value> getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes(this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$doInitialLoad$1(androidx.paging.PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcherSnapshot$doInitialLoad$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = pageFetcherSnapshot;
    }
}
