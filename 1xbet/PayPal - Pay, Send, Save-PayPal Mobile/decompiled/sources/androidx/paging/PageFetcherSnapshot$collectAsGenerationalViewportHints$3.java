package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/paging/GenerationalViewportHint;", "previous", io.ktor.http.LinkHeader.Rel.Next}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class PageFetcherSnapshot$collectAsGenerationalViewportHints$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.paging.GenerationalViewportHint, androidx.paging.GenerationalViewportHint, kotlin.coroutines.Continuation<? super androidx.paging.GenerationalViewportHint>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.paging.LoadType getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.paging.GenerationalViewportHint generationalViewportHint = (androidx.paging.GenerationalViewportHint) this.getHighSpeedVideoSizes;
        androidx.paging.GenerationalViewportHint generationalViewportHint2 = (androidx.paging.GenerationalViewportHint) this.getHighResolutionOutputSizeshNQ4ISI;
        return androidx.paging.PageFetcherSnapshotKt.shouldPrioritizeOver(generationalViewportHint2, generationalViewportHint, this.getHighSpeedVideoFpsRanges) ? generationalViewportHint2 : generationalViewportHint;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(androidx.paging.GenerationalViewportHint generationalViewportHint, androidx.paging.GenerationalViewportHint generationalViewportHint2, kotlin.coroutines.Continuation<? super androidx.paging.GenerationalViewportHint> continuation) {
        androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3 pageFetcherSnapshot$collectAsGenerationalViewportHints$3 = new androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3(this.getHighSpeedVideoFpsRanges, continuation);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.getHighSpeedVideoSizes = generationalViewportHint;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.getHighResolutionOutputSizeshNQ4ISI = generationalViewportHint2;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$3.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$collectAsGenerationalViewportHints$3(androidx.paging.LoadType loadType, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRanges = loadType;
    }
}
