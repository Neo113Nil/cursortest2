package androidx.paging;

@kotlin.Deprecated(message = "PagedList is deprecated and has been replaced by PagingData")
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B%\b\u0017\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB%\b\u0017\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fB+\b\u0017\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\r\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u0010B+\b\u0017\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\r\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\u0011J!\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"0!¢\u0006\u0004\b#\u0010$R(\u0010'\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010*\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010+\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u00101R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00103"}, d2 = {"Landroidx/paging/LivePagedListBuilder;", "", "Key", "Value", "Landroidx/paging/DataSource$Factory;", "dataSourceFactory", "Landroidx/paging/PagedList$Config;", "config", "<init>", "(Landroidx/paging/DataSource$Factory;Landroidx/paging/PagedList$Config;)V", "", "pageSize", "(Landroidx/paging/DataSource$Factory;I)V", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "pagingSourceFactory", "(Lkotlin/jvm/functions/Function0;Landroidx/paging/PagedList$Config;)V", "(Lkotlin/jvm/functions/Function0;I)V", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "setCoroutineScope", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/paging/LivePagedListBuilder;", "key", "setInitialLoadKey", "(Ljava/lang/Object;)Landroidx/paging/LivePagedListBuilder;", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "setBoundaryCallback", "(Landroidx/paging/PagedList$BoundaryCallback;)Landroidx/paging/LivePagedListBuilder;", "Ljava/util/concurrent/Executor;", "fetchExecutor", "setFetchExecutor", "(Ljava/util/concurrent/Executor;)Landroidx/paging/LivePagedListBuilder;", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "build", "()Landroidx/lifecycle/LiveData;", "getInputFormats", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Landroidx/paging/DataSource$Factory;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/paging/PagedList$Config;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineScope;", "getInputSizeshNQ4ISI", "Ljava/lang/Object;", "Landroidx/paging/PagedList$BoundaryCallback;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LivePagedListBuilder<Key, Value> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.paging.DataSource.Factory<Key, Value> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.paging.PagedList.Config Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.paging.PagedList.BoundaryCallback<Value> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizesFor;
    private kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<androidx.paging.PagingSource<Key, Value>> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private Key getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.ReplaceWith(expression = "Pager(\n                PagingConfig(\n                    config.pageSize,\n                    config.prefetchDistance,\n                    config.enablePlaceholders,\n                    config.initialLoadSizeHint,\n                    config.maxSize\n                ),\n                initialLoadKey,\n                dataSourceFactory.asPagingSourceFactory(Dispatchers.IO)\n            ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData", "kotlinx.coroutines.Dispatchers"}))
    public LivePagedListBuilder(androidx.paging.DataSource.Factory<Key, Value> factory, androidx.paging.PagedList.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        this.getHighSpeedVideoSizes = kotlinx.coroutines.GlobalScope.INSTANCE;
        java.util.concurrent.Executor iOThreadExecutor = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iOThreadExecutor, "");
        this.getHighSpeedVideoSizesFor = kotlinx.coroutines.ExecutorsKt.from(iOThreadExecutor);
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = factory;
        this.Camera2StreamConfigurationMap = config;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.ReplaceWith(expression = "Pager(\n                PagingConfig(pageSize),\n                initialLoadKey,\n                dataSourceFactory.asPagingSourceFactory(Dispatchers.IO)\n            ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData", "kotlinx.coroutines.Dispatchers"}))
    public LivePagedListBuilder(androidx.paging.DataSource.Factory<Key, Value> factory, int i) {
        this(factory, new androidx.paging.PagedList.Config.Builder().setPageSize(i).build());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.ReplaceWith(expression = "Pager(\n                PagingConfig(\n                    config.pageSize,\n                    config.prefetchDistance,\n                    config.enablePlaceholders,\n                    config.initialLoadSizeHint,\n                    config.maxSize\n                ),\n                initialLoadKey,\n                this\n            ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData"}))
    public LivePagedListBuilder(kotlin.jvm.functions.Function0<? extends androidx.paging.PagingSource<Key, Value>> function0, androidx.paging.PagedList.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        this.getHighSpeedVideoSizes = kotlinx.coroutines.GlobalScope.INSTANCE;
        java.util.concurrent.Executor iOThreadExecutor = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iOThreadExecutor, "");
        this.getHighSpeedVideoSizesFor = kotlinx.coroutines.ExecutorsKt.from(iOThreadExecutor);
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.getHighSpeedVideoFpsRanges = null;
        this.Camera2StreamConfigurationMap = config;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.ReplaceWith(expression = "Pager(\n                PagingConfig(pageSize),\n                initialLoadKey,\n                this\n            ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData"}))
    public LivePagedListBuilder(kotlin.jvm.functions.Function0<? extends androidx.paging.PagingSource<Key, Value>> function0, int i) {
        this(function0, new androidx.paging.PagedList.Config.Builder().setPageSize(i).build());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
    }

    public final androidx.paging.LivePagedListBuilder<Key, Value> setCoroutineScope(kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoSizes = coroutineScope;
        return this;
    }

    public final androidx.paging.LivePagedListBuilder<Key, Value> setInitialLoadKey(Key key) {
        this.getHighResolutionOutputSizeshNQ4ISI = key;
        return this;
    }

    public final androidx.paging.LivePagedListBuilder<Key, Value> setBoundaryCallback(androidx.paging.PagedList.BoundaryCallback<Value> boundaryCallback) {
        this.getInputSizeshNQ4ISI = boundaryCallback;
        return this;
    }

    public final androidx.paging.LivePagedListBuilder<Key, Value> setFetchExecutor(java.util.concurrent.Executor fetchExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchExecutor, "");
        this.getHighSpeedVideoSizesFor = kotlinx.coroutines.ExecutorsKt.from(fetchExecutor);
        return this;
    }

    public final androidx.view.LiveData<androidx.paging.PagedList<Value>> build() {
        kotlin.jvm.functions.Function0<androidx.paging.PagingSource<Key, Value>> function0 = this.getHighSpeedVideoFpsRangesFor;
        if (function0 == null) {
            androidx.paging.DataSource.Factory<Key, Value> factory = this.getHighSpeedVideoFpsRanges;
            function0 = factory != null ? factory.asPagingSourceFactory(this.getHighSpeedVideoSizesFor) : null;
        }
        kotlin.jvm.functions.Function0<androidx.paging.PagingSource<Key, Value>> function02 = function0;
        if (function02 == null) {
            throw new java.lang.IllegalStateException("LivePagedList cannot be built without a PagingSourceFactory or DataSource.Factory".toString());
        }
        kotlinx.coroutines.CoroutineScope coroutineScope = this.getHighSpeedVideoSizes;
        Key key = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.paging.PagedList.Config config = this.Camera2StreamConfigurationMap;
        androidx.paging.PagedList.BoundaryCallback<Value> boundaryCallback = this.getInputSizeshNQ4ISI;
        java.util.concurrent.Executor mainThreadExecutor = androidx.arch.core.executor.ArchTaskExecutor.getMainThreadExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "");
        return new androidx.paging.LivePagedList(coroutineScope, key, config, boundaryCallback, function02, kotlinx.coroutines.ExecutorsKt.from(mainThreadExecutor), this.getHighSpeedVideoSizesFor);
    }
}
