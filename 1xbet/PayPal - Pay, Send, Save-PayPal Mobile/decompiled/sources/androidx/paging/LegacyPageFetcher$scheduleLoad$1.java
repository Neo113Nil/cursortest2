package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1", f = "LegacyPageFetcher.jvmAndAndroid.kt", i = {0}, l = {53}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"}, v = 1)
/* loaded from: classes7.dex */
final class LegacyPageFetcher$scheduleLoad$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.paging.PagingSource.LoadParams<K> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.paging.LegacyPageFetcher<K, V> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.paging.LoadType getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = coroutineScope2;
            this.getHighSpeedVideoFpsRanges = 1;
            java.lang.Object load = this.getHighResolutionOutputSizeshNQ4ISI.getSource().load(this.Camera2StreamConfigurationMap, this);
            if (load == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
            obj = load;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.paging.PagingSource.LoadResult loadResult = (androidx.paging.PagingSource.LoadResult) obj;
        if (!this.getHighResolutionOutputSizeshNQ4ISI.getSource().getInvalid()) {
            coroutineDispatcher = ((androidx.paging.LegacyPageFetcher) this.getHighResolutionOutputSizeshNQ4ISI).getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineDispatcher, null, new androidx.paging.LegacyPageFetcher$scheduleLoad$1.AnonymousClass1(loadResult, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, null), 2, null);
            return kotlin.Unit.INSTANCE;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.detach();
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1$1", f = "LegacyPageFetcher.jvmAndAndroid.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.paging.LegacyPageFetcher$scheduleLoad$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.paging.PagingSource.LoadResult<K, V> Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.paging.LoadType getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.paging.LegacyPageFetcher<K, V> getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object obj2 = this.Camera2StreamConfigurationMap;
            if (obj2 instanceof androidx.paging.PagingSource.LoadResult.Page) {
                this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI, (androidx.paging.PagingSource.LoadResult.Page) obj2);
            } else if (obj2 instanceof androidx.paging.PagingSource.LoadResult.Error) {
                androidx.paging.LegacyPageFetcher.access$onLoadError(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, ((androidx.paging.PagingSource.LoadResult.Error) obj2).getThrowable());
            } else {
                if (!(obj2 instanceof androidx.paging.PagingSource.LoadResult.Invalid)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                androidx.paging.LegacyPageFetcher.access$onLoadInvalid(this.getHighSpeedVideoFpsRanges);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.paging.LegacyPageFetcher$scheduleLoad$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.paging.LegacyPageFetcher$scheduleLoad$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.paging.PagingSource.LoadResult<K, V> loadResult, androidx.paging.LegacyPageFetcher<K, V> legacyPageFetcher, androidx.paging.LoadType loadType, kotlin.coroutines.Continuation<? super androidx.paging.LegacyPageFetcher$scheduleLoad$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = loadResult;
            this.getHighSpeedVideoFpsRanges = legacyPageFetcher;
            this.getHighResolutionOutputSizeshNQ4ISI = loadType;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.LegacyPageFetcher$scheduleLoad$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.paging.LegacyPageFetcher$scheduleLoad$1 legacyPageFetcher$scheduleLoad$1 = new androidx.paging.LegacyPageFetcher$scheduleLoad$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        legacyPageFetcher$scheduleLoad$1.getHighSpeedVideoSizes = obj;
        return legacyPageFetcher$scheduleLoad$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyPageFetcher$scheduleLoad$1(androidx.paging.LegacyPageFetcher<K, V> legacyPageFetcher, androidx.paging.PagingSource.LoadParams<K> loadParams, androidx.paging.LoadType loadType, kotlin.coroutines.Continuation<? super androidx.paging.LegacyPageFetcher$scheduleLoad$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = legacyPageFetcher;
        this.Camera2StreamConfigurationMap = loadParams;
        this.getHighSpeedVideoFpsRangesFor = loadType;
    }
}
