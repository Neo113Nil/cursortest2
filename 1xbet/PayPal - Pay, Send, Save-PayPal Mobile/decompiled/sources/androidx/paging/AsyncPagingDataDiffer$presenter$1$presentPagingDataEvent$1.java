package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.AsyncPagingDataDiffer$presenter$1", f = "AsyncPagingDataDiffer.kt", i = {0}, l = {183}, m = "presentPagingDataEvent", n = {"$this$presentPagingDataEvent_u24lambda_u240"}, s = {"L$2"}, v = 1)
/* loaded from: classes7.dex */
final class AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ androidx.paging.AsyncPagingDataDiffer$presenter$1 getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return presentPagingDataEvent(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1(androidx.paging.AsyncPagingDataDiffer$presenter$1 asyncPagingDataDiffer$presenter$1, kotlin.coroutines.Continuation<? super androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = asyncPagingDataDiffer$presenter$1;
    }
}
