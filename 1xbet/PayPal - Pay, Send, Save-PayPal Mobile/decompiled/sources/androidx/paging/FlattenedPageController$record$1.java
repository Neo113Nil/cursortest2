package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE}, m = "record", n = {"event", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes7.dex */
final class FlattenedPageController$record$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.paging.FlattenedPageController<T> getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlattenedPageController$record$1(androidx.paging.FlattenedPageController<T> flattenedPageController, kotlin.coroutines.Continuation<? super androidx.paging.FlattenedPageController$record$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = flattenedPageController;
    }
}
