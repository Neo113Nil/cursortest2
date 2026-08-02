package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.LivePagedList$invalidate$1", f = "LivePagedList.kt", i = {0, 1, 1}, l = {86, 91}, m = "invokeSuspend", n = {"pagingSource", "pagingSource", "lastKey"}, s = {"L$0", "L$0", "L$1"}, v = 1)
/* loaded from: classes7.dex */
final class LivePagedList$invalidate$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.paging.LivePagedList<Key, Value> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.paging.PagedList pagedList;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0;
        kotlin.jvm.functions.Function0 function02;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
        androidx.paging.PagingSource pagingSource;
        androidx.paging.PagedList.Config config;
        androidx.paging.PagedList pagedList2;
        androidx.paging.PagedList.Config config2;
        java.lang.Object obj2;
        androidx.paging.PagingSource.LoadResult loadResult;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher3;
        androidx.paging.PagedList.BoundaryCallback boundaryCallback;
        androidx.paging.PagedList.Config config3;
        androidx.paging.PagedList pagedList3;
        androidx.paging.PagedList pagedList4;
        androidx.paging.PagedList pagedList5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pagedList = ((androidx.paging.LivePagedList) this.getHighSpeedVideoFpsRanges).getOutputMinFrameDuration;
            androidx.paging.PagingSource pagingSource2 = pagedList.getPagingSource();
            function0 = ((androidx.paging.LivePagedList) this.getHighSpeedVideoFpsRanges).getInputSizeshNQ4ISI;
            pagingSource2.unregisterInvalidatedCallback(function0);
            function02 = ((androidx.paging.LivePagedList) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRanges;
            androidx.paging.PagingSource pagingSource3 = (androidx.paging.PagingSource) function02.invoke();
            function03 = ((androidx.paging.LivePagedList) this.getHighSpeedVideoFpsRanges).getInputSizeshNQ4ISI;
            pagingSource3.registerInvalidatedCallback(function03);
            if (pagingSource3 instanceof androidx.paging.LegacyPagingSource) {
                config = ((androidx.paging.LivePagedList) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRangesFor;
                ((androidx.paging.LegacyPagingSource) pagingSource3).setPageSize(config.pageSize);
            }
            coroutineDispatcher = ((androidx.paging.LivePagedList) this.getHighSpeedVideoFpsRanges).Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = pagingSource3;
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, new androidx.paging.LivePagedList$invalidate$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, null), this) != coroutine_suspended) {
                pagingSource = pagingSource3;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj3 = this.getHighSpeedVideoFpsRangesFor;
            pagingSource = (androidx.paging.PagingSource) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            obj2 = obj3;
            loadResult = (androidx.paging.PagingSource.LoadResult) obj;
            if (!(loadResult instanceof androidx.paging.PagingSource.LoadResult.Invalid)) {
                pagedList5 = ((androidx.paging.LivePagedList) this.getHighSpeedVideoFpsRanges).getOutputMinFrameDuration;
                pagedList5.setInitialLoadState(androidx.paging.LoadType.REFRESH, new androidx.paging.LoadState.NotLoading(false));
                pagingSource.invalidate();
            } else if (loadResult instanceof androidx.paging.PagingSource.LoadResult.Error) {
                pagedList4 = ((androidx.paging.LivePagedList) this.getHighSpeedVideoFpsRanges).getOutputMinFrameDuration;
                pagedList4.setInitialLoadState(androidx.paging.LoadType.REFRESH, new androidx.paging.LoadState.Error(((androidx.paging.PagingSource.LoadResult.Error) loadResult).getThrowable()));
            } else {
                if (!(loadResult instanceof androidx.paging.PagingSource.LoadResult.Page)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                coroutineScope = ((androidx.paging.LivePagedList) this.getHighSpeedVideoFpsRanges).getHighResolutionOutputSizeshNQ4ISI;
                coroutineDispatcher2 = ((androidx.paging.LivePagedList) this.getHighSpeedVideoFpsRanges).Camera2StreamConfigurationMap;
                coroutineDispatcher3 = ((androidx.paging.LivePagedList) this.getHighSpeedVideoFpsRanges).getInputFormats;
                boundaryCallback = ((androidx.paging.LivePagedList) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoSizes;
                config3 = ((androidx.paging.LivePagedList) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRangesFor;
                androidx.paging.PagedList create = androidx.paging.PagedList.INSTANCE.create(pagingSource, (androidx.paging.PagingSource.LoadResult.Page) loadResult, coroutineScope, coroutineDispatcher2, coroutineDispatcher3, boundaryCallback, config3, obj2);
                androidx.paging.LivePagedList<Key, Value> livePagedList = this.getHighSpeedVideoFpsRanges;
                pagedList3 = ((androidx.paging.LivePagedList) livePagedList).getOutputMinFrameDuration;
                androidx.paging.LivePagedList.access$onItemUpdate(livePagedList, pagedList3, create);
                ((androidx.paging.LivePagedList) this.getHighSpeedVideoFpsRanges).getOutputMinFrameDuration = create;
                this.getHighSpeedVideoFpsRanges.postValue(create);
            }
            return kotlin.Unit.INSTANCE;
        }
        pagingSource = (androidx.paging.PagingSource) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        pagedList2 = ((androidx.paging.LivePagedList) this.getHighSpeedVideoFpsRanges).getOutputMinFrameDuration;
        java.lang.Object lastKey = pagedList2.getLastKey();
        config2 = ((androidx.paging.LivePagedList) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = pagingSource;
        this.getHighSpeedVideoFpsRangesFor = lastKey;
        this.getHighSpeedVideoSizes = 2;
        java.lang.Object load = pagingSource.load(androidx.paging.PagedListKt.toRefreshLoadParams(config2, lastKey), this);
        if (load != coroutine_suspended) {
            obj2 = lastKey;
            obj = load;
            loadResult = (androidx.paging.PagingSource.LoadResult) obj;
            if (!(loadResult instanceof androidx.paging.PagingSource.LoadResult.Invalid)) {
            }
            return kotlin.Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.LivePagedList$invalidate$1$1", f = "LivePagedList.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.paging.LivePagedList$invalidate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.paging.LivePagedList<Key, Value> getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.paging.PagedList pagedList;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            pagedList = ((androidx.paging.LivePagedList) this.getHighSpeedVideoFpsRanges).getOutputMinFrameDuration;
            pagedList.setInitialLoadState(androidx.paging.LoadType.REFRESH, androidx.paging.LoadState.Loading.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.paging.LivePagedList$invalidate$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.paging.LivePagedList$invalidate$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.paging.LivePagedList<Key, Value> livePagedList, kotlin.coroutines.Continuation<? super androidx.paging.LivePagedList$invalidate$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = livePagedList;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.LivePagedList$invalidate$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.paging.LivePagedList$invalidate$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LivePagedList$invalidate$1(androidx.paging.LivePagedList<Key, Value> livePagedList, kotlin.coroutines.Continuation<? super androidx.paging.LivePagedList$invalidate$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = livePagedList;
    }
}
