package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ao\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001ao\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u0011\u001a\u007f\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00130\u00122\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\r\u0010\u0018\u001a\u007f\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00130\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\r\u0010\u0019"}, d2 = {"", "Key", "Value", "Landroidx/paging/DataSource$Factory;", "Landroidx/paging/PagedList$Config;", "config", "initialLoadKey", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "Ljava/util/concurrent/Executor;", "fetchExecutor", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "toLiveData", "(Landroidx/paging/DataSource$Factory;Landroidx/paging/PagedList$Config;Ljava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Ljava/util/concurrent/Executor;)Landroidx/lifecycle/LiveData;", "", "pageSize", "(Landroidx/paging/DataSource$Factory;ILjava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Ljava/util/concurrent/Executor;)Landroidx/lifecycle/LiveData;", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineDispatcher;", "fetchDispatcher", "(Lkotlin/jvm/functions/Function0;Landroidx/paging/PagedList$Config;Ljava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;)Landroidx/lifecycle/LiveData;", "(Lkotlin/jvm/functions/Function0;ILjava/lang/Object;Landroidx/paging/PagedList$BoundaryCallback;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;)Landroidx/lifecycle/LiveData;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LivePagedListKt {
    public static /* synthetic */ androidx.view.LiveData toLiveData$default(androidx.paging.DataSource.Factory factory, androidx.paging.PagedList.Config config, java.lang.Object obj, androidx.paging.PagedList.BoundaryCallback boundaryCallback, java.util.concurrent.Executor executor, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        if ((i & 4) != 0) {
            boundaryCallback = null;
        }
        if ((i & 8) != 0) {
            executor = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(executor, "");
        }
        return toLiveData((androidx.paging.DataSource.Factory<java.lang.Object, Value>) factory, config, obj, boundaryCallback, executor);
    }

    @kotlin.Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.ReplaceWith(expression = "Pager(\n            PagingConfig(\n                config.pageSize,\n                config.prefetchDistance,\n                config.enablePlaceholders,\n                config.initialLoadSizeHint,\n                config.maxSize\n            ),\n            initialLoadKey,\n            this.asPagingSourceFactory(fetchExecutor.asCoroutineDispatcher())\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData", "kotlinx.coroutines.asCoroutineDispatcher"}))
    public static final <Key, Value> androidx.view.LiveData<androidx.paging.PagedList<Value>> toLiveData(androidx.paging.DataSource.Factory<Key, Value> factory, androidx.paging.PagedList.Config config, Key key, androidx.paging.PagedList.BoundaryCallback<Value> boundaryCallback, java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        return new androidx.paging.LivePagedListBuilder(factory, config).setInitialLoadKey(key).setBoundaryCallback(boundaryCallback).setFetchExecutor(executor).build();
    }

    public static /* synthetic */ androidx.view.LiveData toLiveData$default(androidx.paging.DataSource.Factory factory, int i, java.lang.Object obj, androidx.paging.PagedList.BoundaryCallback boundaryCallback, java.util.concurrent.Executor executor, int i2, java.lang.Object obj2) {
        if ((i2 & 2) != 0) {
            obj = null;
        }
        if ((i2 & 4) != 0) {
            boundaryCallback = null;
        }
        if ((i2 & 8) != 0) {
            executor = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(executor, "");
        }
        return toLiveData((androidx.paging.DataSource.Factory<java.lang.Object, Value>) factory, i, obj, boundaryCallback, executor);
    }

    @kotlin.Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.ReplaceWith(expression = "Pager(\n            PagingConfig(pageSize),\n            initialLoadKey,\n            this.asPagingSourceFactory(fetchExecutor.asCoroutineDispatcher())\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData", "kotlinx.coroutines.asCoroutineDispatcher"}))
    public static final <Key, Value> androidx.view.LiveData<androidx.paging.PagedList<Value>> toLiveData(androidx.paging.DataSource.Factory<Key, Value> factory, int i, Key key, androidx.paging.PagedList.BoundaryCallback<Value> boundaryCallback, java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        return new androidx.paging.LivePagedListBuilder(factory, androidx.paging.PagedListConfigKt.Config$default(i, 0, false, 0, 0, 30, null)).setInitialLoadKey(key).setBoundaryCallback(boundaryCallback).setFetchExecutor(executor).build();
    }

    public static /* synthetic */ androidx.view.LiveData toLiveData$default(kotlin.jvm.functions.Function0 function0, androidx.paging.PagedList.Config config, java.lang.Object obj, androidx.paging.PagedList.BoundaryCallback boundaryCallback, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, java.lang.Object obj2) {
        java.lang.Object obj3 = (i & 2) != 0 ? null : obj;
        androidx.paging.PagedList.BoundaryCallback boundaryCallback2 = (i & 4) != 0 ? null : boundaryCallback;
        if ((i & 8) != 0) {
            coroutineScope = kotlinx.coroutines.GlobalScope.INSTANCE;
        }
        kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
        if ((i & 16) != 0) {
            java.util.concurrent.Executor iOThreadExecutor = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iOThreadExecutor, "");
            coroutineDispatcher = kotlinx.coroutines.ExecutorsKt.from(iOThreadExecutor);
        }
        return toLiveData((kotlin.jvm.functions.Function0<? extends androidx.paging.PagingSource<java.lang.Object, Value>>) function0, config, obj3, boundaryCallback2, coroutineScope2, coroutineDispatcher);
    }

    @kotlin.Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.ReplaceWith(expression = "Pager(\n            PagingConfig(\n                config.pageSize,\n                config.prefetchDistance,\n                config.enablePlaceholders,\n                config.initialLoadSizeHint,\n                config.maxSize\n            ),\n            initialLoadKey,\n            this\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData"}))
    public static final <Key, Value> androidx.view.LiveData<androidx.paging.PagedList<Value>> toLiveData(kotlin.jvm.functions.Function0<? extends androidx.paging.PagingSource<Key, Value>> function0, androidx.paging.PagedList.Config config, Key key, androidx.paging.PagedList.BoundaryCallback<Value> boundaryCallback, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        java.util.concurrent.Executor mainThreadExecutor = androidx.arch.core.executor.ArchTaskExecutor.getMainThreadExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "");
        return new androidx.paging.LivePagedList(coroutineScope, key, config, boundaryCallback, function0, kotlinx.coroutines.ExecutorsKt.from(mainThreadExecutor), coroutineDispatcher);
    }

    public static /* synthetic */ androidx.view.LiveData toLiveData$default(kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj, androidx.paging.PagedList.BoundaryCallback boundaryCallback, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i2, java.lang.Object obj2) {
        java.lang.Object obj3 = (i2 & 2) != 0 ? null : obj;
        androidx.paging.PagedList.BoundaryCallback boundaryCallback2 = (i2 & 4) != 0 ? null : boundaryCallback;
        if ((i2 & 8) != 0) {
            coroutineScope = kotlinx.coroutines.GlobalScope.INSTANCE;
        }
        kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
        if ((i2 & 16) != 0) {
            java.util.concurrent.Executor iOThreadExecutor = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iOThreadExecutor, "");
            coroutineDispatcher = kotlinx.coroutines.ExecutorsKt.from(iOThreadExecutor);
        }
        return toLiveData((kotlin.jvm.functions.Function0<? extends androidx.paging.PagingSource<java.lang.Object, Value>>) function0, i, obj3, boundaryCallback2, coroutineScope2, coroutineDispatcher);
    }

    @kotlin.Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.ReplaceWith(expression = "Pager(\n            PagingConfig(pageSize),\n            initialLoadKey,\n            this\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData"}))
    public static final <Key, Value> androidx.view.LiveData<androidx.paging.PagedList<Value>> toLiveData(kotlin.jvm.functions.Function0<? extends androidx.paging.PagingSource<Key, Value>> function0, int i, Key key, androidx.paging.PagedList.BoundaryCallback<Value> boundaryCallback, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        androidx.paging.PagedList.Config build = new androidx.paging.PagedList.Config.Builder().setPageSize(i).build();
        java.util.concurrent.Executor mainThreadExecutor = androidx.arch.core.executor.ArchTaskExecutor.getMainThreadExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "");
        return new androidx.paging.LivePagedList(coroutineScope, key, build, boundaryCallback, function0, kotlinx.coroutines.ExecutorsKt.from(mainThreadExecutor), coroutineDispatcher);
    }
}
