package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1", f = "PageFetcherSnapshot.kt", i = {}, l = {96}, m = "emit", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass2.AnonymousClass1<T> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1(androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass2.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = anonymousClass1;
    }
}
