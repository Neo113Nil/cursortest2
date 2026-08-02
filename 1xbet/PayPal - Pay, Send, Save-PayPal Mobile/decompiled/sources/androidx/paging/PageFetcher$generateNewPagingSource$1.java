package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcher", f = "PageFetcher.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m = "generateNewPagingSource", n = {"previousPagingSource"}, s = {"L$0"}, v = 1)
/* loaded from: classes7.dex */
final class PageFetcher$generateNewPagingSource$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.paging.PageFetcher<Key, Value> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return androidx.paging.PageFetcher.access$generateNewPagingSource(this.getHighResolutionOutputSizeshNQ4ISI, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcher$generateNewPagingSource$1(androidx.paging.PageFetcher<Key, Value> pageFetcher, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcher$generateNewPagingSource$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = pageFetcher;
    }
}
