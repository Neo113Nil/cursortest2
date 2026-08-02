package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PagedList$dispatchStateChangeAsync$1", f = "PagedList.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class PagedList$dispatchStateChangeAsync$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.paging.LoadState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.paging.LoadType getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.paging.PagedList<T> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        java.util.List list2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            list = ((androidx.paging.PagedList) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoFpsRanges;
            kotlin.collections.CollectionsKt.removeAll(list, new kotlin.jvm.functions.Function1() { // from class: androidx.paging.PagedList$dispatchStateChangeAsync$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(androidx.paging.PagedList$dispatchStateChangeAsync$1.getHighSpeedVideoFpsRanges((java.lang.ref.WeakReference) obj2));
                }
            });
            list2 = ((androidx.paging.PagedList) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoFpsRanges;
            androidx.paging.LoadType loadType = this.getHighSpeedVideoFpsRanges;
            androidx.paging.LoadState loadState = this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) ((java.lang.ref.WeakReference) it.next()).get();
                if (function2 != null) {
                    function2.invoke(loadType, loadState);
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.PagedList$dispatchStateChangeAsync$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public static /* synthetic */ boolean getHighSpeedVideoFpsRanges(java.lang.ref.WeakReference weakReference) {
        return weakReference.get() == null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.paging.PagedList$dispatchStateChangeAsync$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagedList$dispatchStateChangeAsync$1(androidx.paging.PagedList<T> pagedList, androidx.paging.LoadType loadType, androidx.paging.LoadState loadState, kotlin.coroutines.Continuation<? super androidx.paging.PagedList$dispatchStateChangeAsync$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = pagedList;
        this.getHighSpeedVideoFpsRanges = loadType;
        this.getHighResolutionOutputSizeshNQ4ISI = loadState;
    }
}
