package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE}, m = "getStateAsEvents", n = {"$this$withLock_u24default$iv"}, s = {"L$0"}, v = 1)
/* loaded from: classes7.dex */
final class FlattenedPageController$getStateAsEvents$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.paging.FlattenedPageController<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlattenedPageController$getStateAsEvents$1(androidx.paging.FlattenedPageController<T> flattenedPageController, kotlin.coroutines.Continuation<? super androidx.paging.FlattenedPageController$getStateAsEvents$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = flattenedPageController;
    }
}
