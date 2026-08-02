package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "hint", "Landroidx/paging/ViewportHint;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1", f = "PageFetcherSnapshot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.paging.ViewportHint, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.paging.PageFetcherSnapshot<Key, Value> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.paging.PagingConfig pagingConfig;
        boolean z;
        androidx.paging.PagingConfig pagingConfig2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.paging.ViewportHint viewportHint = (androidx.paging.ViewportHint) this.getHighSpeedVideoFpsRanges;
        int presentedItemsBefore = viewportHint.getPresentedItemsBefore() * (-1);
        pagingConfig = ((androidx.paging.PageFetcherSnapshot) this.getHighSpeedVideoFpsRangesFor).Camera2StreamConfigurationMap;
        if (presentedItemsBefore <= pagingConfig.jumpThreshold) {
            int presentedItemsAfter = viewportHint.getPresentedItemsAfter() * (-1);
            pagingConfig2 = ((androidx.paging.PageFetcherSnapshot) this.getHighSpeedVideoFpsRangesFor).Camera2StreamConfigurationMap;
            if (presentedItemsAfter <= pagingConfig2.jumpThreshold) {
                z = false;
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
            }
        }
        z = true;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.paging.ViewportHint viewportHint, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1) create(viewportHint, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 pageFetcherSnapshot$startConsumingHints$1$jumpHint$1 = new androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        pageFetcherSnapshot$startConsumingHints$1$jumpHint$1.getHighSpeedVideoFpsRanges = obj;
        return pageFetcherSnapshot$startConsumingHints$1$jumpHint$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(androidx.paging.PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot;
    }
}
