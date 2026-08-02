package androidx.paging;

@kotlin.Deprecated(message = "PageKeyedDataSource is deprecated and has been replaced by PagingSource", replaceWith = @kotlin.ReplaceWith(expression = "PagingSource<Key, Value>", imports = {"androidx.paging.PagingSource"}))
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0004/012B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0080@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0012J1\u0010\u0017\u001a\u00020\u00162\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H&¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001a\u001a\u00020\u00162\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001c\u001a\u00020\u00162\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H&¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u0001H\u0010¢\u0006\u0004\b\u001e\u0010\u001fJC\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010 *\u00020\u00012\u001e\u0010#\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\"0!¢\u0006\u0004\b$\u0010%JC\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010 *\u00020\u00012\u001e\u0010#\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\"0&¢\u0006\u0004\b$\u0010'J7\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010 *\u00020\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020!¢\u0006\u0004\b(\u0010%J7\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010 *\u00020\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020&¢\u0006\u0004\b(\u0010'R \u0010*\u001a\u00020)8\u0011X\u0090D¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010\u0006\u001a\u0004\b,\u0010-"}, d2 = {"Landroidx/paging/PageKeyedDataSource;", "", "Key", "Value", "Landroidx/paging/DataSource;", "<init>", "()V", "Landroidx/paging/DataSource$Params;", "params", "Landroidx/paging/DataSource$BaseResult;", "load$paging_common", "(Landroidx/paging/DataSource$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "p0", "getHighSpeedVideoFpsRanges", "(Landroidx/paging/PageKeyedDataSource$LoadInitialParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "Camera2StreamConfigurationMap", "(Landroidx/paging/PageKeyedDataSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", com.sun.jna.Callback.METHOD_NAME, "", "loadInitial", "(Landroidx/paging/PageKeyedDataSource$LoadInitialParams;Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;)V", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadBefore", "(Landroidx/paging/PageKeyedDataSource$LoadParams;Landroidx/paging/PageKeyedDataSource$LoadCallback;)V", "loadAfter", "item", "getKeyInternal$paging_common", "(Ljava/lang/Object;)Ljava/lang/Object;", "ToValue", "Landroidx/arch/core/util/Function;", "", "function", "mapByPage", "(Landroidx/arch/core/util/Function;)Landroidx/paging/PageKeyedDataSource;", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Landroidx/paging/PageKeyedDataSource;", "map", "", "supportsPageDropping", "Z", "getSupportsPageDropping$paging_common", "()Z", "getSupportsPageDropping$paging_common$annotations", "LoadInitialParams", "LoadParams", "LoadInitialCallback", "LoadCallback"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PageKeyedDataSource<Key, Value> extends androidx.paging.DataSource<Key, Value> {
    private final boolean supportsPageDropping;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00030\u00062\b\u0010\b\u001a\u0004\u0018\u00018\u0002H&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadCallback;", "Key", "Value", "", "<init>", "()V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "adjacentPageKey", "", "onResult", "(Ljava/util/List;Ljava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class LoadCallback<Key, Value> {
        public abstract void onResult(java.util.List<? extends Value> data, Key adjacentPageKey);
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000e\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00018\u00022\b\u0010\f\u001a\u0004\u0018\u00018\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u000e\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00030\u00062\b\u0010\u000b\u001a\u0004\u0018\u00018\u00022\b\u0010\f\u001a\u0004\u0018\u00018\u0002H&¢\u0006\u0004\b\u000e\u0010\u0010"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "Key", "Value", "", "<init>", "()V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", com.daon.sdk.face.license.License.FEATURE_POSITION, com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT, "previousPageKey", "nextPageKey", "", "onResult", "(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;)V", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class LoadInitialCallback<Key, Value> {
        public abstract void onResult(java.util.List<? extends Value> data, int position, int totalCount, Key previousPageKey, Key nextPageKey);

        public abstract void onResult(java.util.List<? extends Value> data, Key previousPageKey, Key nextPageKey);
    }

    public static /* synthetic */ void getSupportsPageDropping$paging_common$annotations() {
    }

    public abstract void loadAfter(androidx.paging.PageKeyedDataSource.LoadParams<Key> params, androidx.paging.PageKeyedDataSource.LoadCallback<Key, Value> callback);

    public abstract void loadBefore(androidx.paging.PageKeyedDataSource.LoadParams<Key> params, androidx.paging.PageKeyedDataSource.LoadCallback<Key, Value> callback);

    public abstract void loadInitial(androidx.paging.PageKeyedDataSource.LoadInitialParams<Key> params, androidx.paging.PageKeyedDataSource.LoadInitialCallback<Key, Value> callback);

    public PageKeyedDataSource() {
        super(androidx.paging.DataSource.KeyType.PAGE_KEYED);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\tR\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\n"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "", "Key", "", "requestedLoadSize", "", "placeholdersEnabled", "<init>", "(IZ)V", com.visa.cbp.getEncExpo.warmup, "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class LoadInitialParams<Key> {
        public final boolean placeholdersEnabled;
        public final int requestedLoadSize;

        public LoadInitialParams(int i, boolean z) {
            this.requestedLoadSize = i;
            this.placeholdersEnabled = z;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00028\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\t"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadParams;", "", "Key", "key", "", "requestedLoadSize", "<init>", "(Ljava/lang/Object;I)V", "Ljava/lang/Object;", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class LoadParams<Key> {
        public final Key key;
        public final int requestedLoadSize;

        public LoadParams(Key key, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            this.key = key;
            this.requestedLoadSize = i;
        }
    }

    @Override // androidx.paging.DataSource
    public final java.lang.Object load$paging_common(androidx.paging.DataSource.Params<Key> params, kotlin.coroutines.Continuation<? super androidx.paging.DataSource.BaseResult<Value>> continuation) {
        if (params.getType() == androidx.paging.LoadType.REFRESH) {
            return getHighSpeedVideoFpsRanges(new androidx.paging.PageKeyedDataSource.LoadInitialParams<>(params.getInitialLoadSize(), params.getPlaceholdersEnabled()), continuation);
        }
        if (params.getKey() == null) {
            return androidx.paging.DataSource.BaseResult.INSTANCE.empty$paging_common();
        }
        if (params.getType() == androidx.paging.LoadType.PREPEND) {
            return Camera2StreamConfigurationMap(new androidx.paging.PageKeyedDataSource.LoadParams<>(params.getKey(), params.getPageSize()), continuation);
        }
        if (params.getType() == androidx.paging.LoadType.APPEND) {
            return getHighSpeedVideoSizes(new androidx.paging.PageKeyedDataSource.LoadParams<>(params.getKey(), params.getPageSize()), continuation);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported type ");
        sb.append(params.getType());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // androidx.paging.DataSource
    public Key getKeyInternal$paging_common(Value item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        throw new java.lang.IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    @Override // androidx.paging.DataSource
    /* renamed from: getSupportsPageDropping$paging_common, reason: from getter */
    public boolean getSupportsPageDropping() {
        return this.supportsPageDropping;
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> androidx.paging.PageKeyedDataSource<Key, ToValue> mapByPage(androidx.arch.core.util.Function<java.util.List<Value>, java.util.List<ToValue>> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        return new androidx.paging.WrapperPageKeyedDataSource(this, function);
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> androidx.paging.PageKeyedDataSource<Key, ToValue> mapByPage(final kotlin.jvm.functions.Function1<? super java.util.List<? extends Value>, ? extends java.util.List<? extends ToValue>> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        return mapByPage((androidx.arch.core.util.Function) new androidx.arch.core.util.Function() { // from class: androidx.paging.PageKeyedDataSource$$ExternalSyntheticLambda1
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return androidx.paging.PageKeyedDataSource.$r8$lambda$XPAWQ0hvZyRot2hiAup0dg8fgfU(kotlin.jvm.functions.Function1.this, (java.util.List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> androidx.paging.PageKeyedDataSource<Key, ToValue> map(final androidx.arch.core.util.Function<Value, ToValue> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        return mapByPage((androidx.arch.core.util.Function) new androidx.arch.core.util.Function() { // from class: androidx.paging.PageKeyedDataSource$$ExternalSyntheticLambda0
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return androidx.paging.PageKeyedDataSource.$r8$lambda$AmlXjr8nVulpjWajz7my3sTHK9k(androidx.arch.core.util.Function.this, (java.util.List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> androidx.paging.PageKeyedDataSource<Key, ToValue> map(final kotlin.jvm.functions.Function1<? super Value, ? extends ToValue> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        return mapByPage((androidx.arch.core.util.Function) new androidx.arch.core.util.Function() { // from class: androidx.paging.PageKeyedDataSource$$ExternalSyntheticLambda2
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return androidx.paging.PageKeyedDataSource.$r8$lambda$IWFYAtJDhH24WR7AJ8BClAIb9j8(kotlin.jvm.functions.Function1.this, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRanges(androidx.paging.PageKeyedDataSource.LoadInitialParams<Key> loadInitialParams, kotlin.coroutines.Continuation<? super androidx.paging.DataSource.BaseResult<Value>> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        loadInitial(loadInitialParams, new androidx.paging.PageKeyedDataSource.LoadInitialCallback<Key, Value>() { // from class: androidx.paging.PageKeyedDataSource$loadInitial$2$1
            @Override // androidx.paging.PageKeyedDataSource.LoadInitialCallback
            public final void onResult(java.util.List<? extends Value> data, int position, int totalCount, Key previousPageKey, Key nextPageKey) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                kotlinx.coroutines.CancellableContinuation<androidx.paging.DataSource.BaseResult<Value>> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(new androidx.paging.DataSource.BaseResult(data, previousPageKey, nextPageKey, position, (totalCount - data.size()) - position)));
            }

            @Override // androidx.paging.PageKeyedDataSource.LoadInitialCallback
            public final void onResult(java.util.List<? extends Value> data, Key previousPageKey, Key nextPageKey) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                kotlinx.coroutines.CancellableContinuation<androidx.paging.DataSource.BaseResult<Value>> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(new androidx.paging.DataSource.BaseResult(data, previousPageKey, nextPageKey, 0, 0, 24, null)));
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object Camera2StreamConfigurationMap(androidx.paging.PageKeyedDataSource.LoadParams<Key> loadParams, kotlin.coroutines.Continuation<? super androidx.paging.DataSource.BaseResult<Value>> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        loadBefore(loadParams, access$continuationAsCallback(this, cancellableContinuationImpl, false));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoSizes(androidx.paging.PageKeyedDataSource.LoadParams<Key> loadParams, kotlin.coroutines.Continuation<? super androidx.paging.DataSource.BaseResult<Value>> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        loadAfter(loadParams, access$continuationAsCallback(this, cancellableContinuationImpl, true));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static /* synthetic */ java.util.List $r8$lambda$AmlXjr8nVulpjWajz7my3sTHK9k(androidx.arch.core.util.Function function, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(function.apply(it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ java.util.List $r8$lambda$IWFYAtJDhH24WR7AJ8BClAIb9j8(kotlin.jvm.functions.Function1 function1, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(function1.invoke(it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ java.util.List $r8$lambda$XPAWQ0hvZyRot2hiAup0dg8fgfU(kotlin.jvm.functions.Function1 function1, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        return (java.util.List) function1.invoke(list);
    }

    public static final /* synthetic */ androidx.paging.PageKeyedDataSource.LoadCallback access$continuationAsCallback(androidx.paging.PageKeyedDataSource pageKeyedDataSource, final kotlinx.coroutines.CancellableContinuation cancellableContinuation, final boolean z) {
        return new androidx.paging.PageKeyedDataSource.LoadCallback<Key, Value>() { // from class: androidx.paging.PageKeyedDataSource$continuationAsCallback$1
            @Override // androidx.paging.PageKeyedDataSource.LoadCallback
            public final void onResult(java.util.List<? extends Value> data, Key adjacentPageKey) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                kotlinx.coroutines.CancellableContinuation<androidx.paging.DataSource.BaseResult<Value>> cancellableContinuation2 = cancellableContinuation;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                boolean z2 = z;
                cancellableContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(new androidx.paging.DataSource.BaseResult(data, z2 ? null : adjacentPageKey, !z2 ? null : adjacentPageKey, 0, 0, 24, null)));
            }
        };
    }
}
