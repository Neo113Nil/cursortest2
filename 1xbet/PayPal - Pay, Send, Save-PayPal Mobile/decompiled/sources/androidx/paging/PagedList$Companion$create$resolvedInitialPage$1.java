package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [T, K] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Landroidx/paging/PagingSource$LoadResult$Page;", "K", "T", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PagedList$Companion$create$resolvedInitialPage$1", f = "PagedList.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class PagedList$Companion$create$resolvedInitialPage$1<K, T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult.Page<K, T>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.paging.PagingSource<K, T> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.paging.PagingSource.LoadParams.Refresh<K> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            obj = this.getHighResolutionOutputSizeshNQ4ISI.load(this.getHighSpeedVideoSizes, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.paging.PagingSource.LoadResult loadResult = (androidx.paging.PagingSource.LoadResult) obj;
        if (loadResult instanceof androidx.paging.PagingSource.LoadResult.Page) {
            return (androidx.paging.PagingSource.LoadResult.Page) loadResult;
        }
        if (loadResult instanceof androidx.paging.PagingSource.LoadResult.Error) {
            throw ((androidx.paging.PagingSource.LoadResult.Error) loadResult).getThrowable();
        }
        if (!(loadResult instanceof androidx.paging.PagingSource.LoadResult.Invalid)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        throw new java.lang.IllegalStateException("Failed to create PagedList. The provided PagingSource returned LoadResult.Invalid, but a LoadResult.Page was expected. To use a PagingSource which supports invalidation, use a PagedList builder that accepts a factory method for PagingSource or DataSource.Factory, such as LivePagedList.");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.paging.PagedList$Companion$create$resolvedInitialPage$1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.paging.PagedList$Companion$create$resolvedInitialPage$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagedList$Companion$create$resolvedInitialPage$1(androidx.paging.PagingSource<K, T> pagingSource, androidx.paging.PagingSource.LoadParams.Refresh<K> refresh, kotlin.coroutines.Continuation<? super androidx.paging.PagedList$Companion$create$resolvedInitialPage$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = pagingSource;
        this.getHighSpeedVideoSizes = refresh;
    }
}
