package androidx.paging;

@kotlin.Deprecated(message = "ItemKeyedDataSource is deprecated and has been replaced by PagingSource", replaceWith = @kotlin.ReplaceWith(expression = "PagingSource<Key, Value>", imports = {"androidx.paging.PagingSource"}))
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0004,-./B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0080@¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u0004\u0018\u00018\u0000*\b\u0012\u0004\u0012\u00028\u00010\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u0004\u0018\u00018\u0000*\b\u0012\u0004\u0012\u00028\u00010\fH\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0080@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0080@¢\u0006\u0004\b\u0016\u0010\u0015J+\u0010\u001a\u001a\u00020\u00192\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H&¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001d\u001a\u00020\u00192\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\u001f\u001a\u00020\u00192\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cH&¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u0001H&¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u0001H\u0010¢\u0006\u0004\b#\u0010\"JC\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010$*\u00020\u00012\u001e\u0010&\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\f0%¢\u0006\u0004\b'\u0010(JC\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010$*\u00020\u00012\u001e\u0010&\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\f0)¢\u0006\u0004\b'\u0010*J7\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010$*\u00020\u00012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020%¢\u0006\u0004\b+\u0010(J7\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010$*\u00020\u00012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020)¢\u0006\u0004\b+\u0010*"}, d2 = {"Landroidx/paging/ItemKeyedDataSource;", "", "Key", "Value", "Landroidx/paging/DataSource;", "<init>", "()V", "Landroidx/paging/DataSource$Params;", "params", "Landroidx/paging/DataSource$BaseResult;", "load$paging_common", "(Landroidx/paging/DataSource$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getPrevKey$paging_common", "(Ljava/util/List;)Ljava/lang/Object;", "getNextKey$paging_common", "Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "loadInitial$paging_common", "(Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/ItemKeyedDataSource$LoadParams;", "loadBefore$paging_common", "(Landroidx/paging/ItemKeyedDataSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAfter$paging_common", "Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;", com.sun.jna.Callback.METHOD_NAME, "", "loadInitial", "(Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;)V", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "loadAfter", "(Landroidx/paging/ItemKeyedDataSource$LoadParams;Landroidx/paging/ItemKeyedDataSource$LoadCallback;)V", "loadBefore", "item", "getKey", "(Ljava/lang/Object;)Ljava/lang/Object;", "getKeyInternal$paging_common", "ToValue", "Landroidx/arch/core/util/Function;", "function", "mapByPage", "(Landroidx/arch/core/util/Function;)Landroidx/paging/ItemKeyedDataSource;", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Landroidx/paging/ItemKeyedDataSource;", "map", "LoadInitialParams", "LoadParams", "LoadInitialCallback", "LoadCallback"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ItemKeyedDataSource<Key, Value> extends androidx.paging.DataSource<Key, Value> {

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "Value", "", "<init>", "()V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "onResult", "(Ljava/util/List;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class LoadCallback<Value> {
        public abstract void onResult(java.util.List<? extends Value> data);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;", "Value", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "<init>", "()V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", com.daon.sdk.face.license.License.FEATURE_POSITION, com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT, "", "onResult", "(Ljava/util/List;II)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class LoadInitialCallback<Value> extends androidx.paging.ItemKeyedDataSource.LoadCallback<Value> {
        public abstract void onResult(java.util.List<? extends Value> data, int position, int totalCount);
    }

    public abstract Key getKey(Value item);

    public abstract void loadAfter(androidx.paging.ItemKeyedDataSource.LoadParams<Key> params, androidx.paging.ItemKeyedDataSource.LoadCallback<Value> callback);

    public abstract void loadBefore(androidx.paging.ItemKeyedDataSource.LoadParams<Key> params, androidx.paging.ItemKeyedDataSource.LoadCallback<Value> callback);

    public abstract void loadInitial(androidx.paging.ItemKeyedDataSource.LoadInitialParams<Key> params, androidx.paging.ItemKeyedDataSource.LoadInitialCallback<Value> callback);

    public ItemKeyedDataSource() {
        super(androidx.paging.DataSource.KeyType.ITEM_KEYED);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\f"}, d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "", "Key", "requestedInitialKey", "", "requestedLoadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "Ljava/lang/Object;", com.visa.cbp.getEncExpo.warmup, "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class LoadInitialParams<Key> {
        public final boolean placeholdersEnabled;
        public final Key requestedInitialKey;
        public final int requestedLoadSize;

        public LoadInitialParams(Key key, int i, boolean z) {
            this.requestedInitialKey = key;
            this.requestedLoadSize = i;
            this.placeholdersEnabled = z;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00028\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\t"}, d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadParams;", "", "Key", "key", "", "requestedLoadSize", "<init>", "(Ljava/lang/Object;I)V", "Ljava/lang/Object;", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        int i = androidx.paging.ItemKeyedDataSource.WhenMappings.$EnumSwitchMapping$0[params.getType().ordinal()];
        if (i == 1) {
            return loadInitial$paging_common(new androidx.paging.ItemKeyedDataSource.LoadInitialParams<>(params.getKey(), params.getInitialLoadSize(), params.getPlaceholdersEnabled()), continuation);
        }
        if (i == 2) {
            Key key = params.getKey();
            kotlin.jvm.internal.Intrinsics.checkNotNull(key);
            return loadBefore$paging_common(new androidx.paging.ItemKeyedDataSource.LoadParams<>(key, params.getPageSize()), continuation);
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        Key key2 = params.getKey();
        kotlin.jvm.internal.Intrinsics.checkNotNull(key2);
        return loadAfter$paging_common(new androidx.paging.ItemKeyedDataSource.LoadParams<>(key2, params.getPageSize()), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Key getPrevKey$paging_common(java.util.List<? extends Value> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.lang.Object firstOrNull = kotlin.collections.CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) list);
        if (firstOrNull != null) {
            return (Key) getKey(firstOrNull);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Key getNextKey$paging_common(java.util.List<? extends Value> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.lang.Object lastOrNull = kotlin.collections.CollectionsKt.lastOrNull((java.util.List<? extends java.lang.Object>) list);
        if (lastOrNull != null) {
            return (Key) getKey(lastOrNull);
        }
        return null;
    }

    @Override // androidx.paging.DataSource
    public Key getKeyInternal$paging_common(Value item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        return getKey(item);
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> androidx.paging.ItemKeyedDataSource<Key, ToValue> mapByPage(androidx.arch.core.util.Function<java.util.List<Value>, java.util.List<ToValue>> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        return new androidx.paging.WrapperItemKeyedDataSource(this, function);
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> androidx.paging.ItemKeyedDataSource<Key, ToValue> mapByPage(final kotlin.jvm.functions.Function1<? super java.util.List<? extends Value>, ? extends java.util.List<? extends ToValue>> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        return mapByPage((androidx.arch.core.util.Function) new androidx.arch.core.util.Function() { // from class: androidx.paging.ItemKeyedDataSource$$ExternalSyntheticLambda1
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return androidx.paging.ItemKeyedDataSource.$r8$lambda$ORtfuBCMSpSxbFgoz8Kp1F87oyw(kotlin.jvm.functions.Function1.this, (java.util.List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> androidx.paging.ItemKeyedDataSource<Key, ToValue> map(final androidx.arch.core.util.Function<Value, ToValue> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        return mapByPage((androidx.arch.core.util.Function) new androidx.arch.core.util.Function() { // from class: androidx.paging.ItemKeyedDataSource$$ExternalSyntheticLambda2
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return androidx.paging.ItemKeyedDataSource.$r8$lambda$7pTL_5WoQ0BUE2QxGzNiujw5xYQ(androidx.arch.core.util.Function.this, (java.util.List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> androidx.paging.ItemKeyedDataSource<Key, ToValue> map(final kotlin.jvm.functions.Function1<? super Value, ? extends ToValue> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        return mapByPage((androidx.arch.core.util.Function) new androidx.arch.core.util.Function() { // from class: androidx.paging.ItemKeyedDataSource$$ExternalSyntheticLambda0
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return androidx.paging.ItemKeyedDataSource.$r8$lambda$REcoPOptYLBN6uEi_lTWl_UJO3E(kotlin.jvm.functions.Function1.this, (java.util.List) obj);
            }
        });
    }

    public final java.lang.Object loadInitial$paging_common(androidx.paging.ItemKeyedDataSource.LoadInitialParams<Key> loadInitialParams, kotlin.coroutines.Continuation<? super androidx.paging.DataSource.BaseResult<Value>> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        loadInitial(loadInitialParams, new androidx.paging.ItemKeyedDataSource.LoadInitialCallback<Value>() { // from class: androidx.paging.ItemKeyedDataSource$loadInitial$2$1
            @Override // androidx.paging.ItemKeyedDataSource.LoadInitialCallback
            public final void onResult(java.util.List<? extends Value> data, int position, int totalCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                kotlinx.coroutines.CancellableContinuation<androidx.paging.DataSource.BaseResult<Value>> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(new androidx.paging.DataSource.BaseResult(data, this.getPrevKey$paging_common(data), this.getNextKey$paging_common(data), position, (totalCount - data.size()) - position)));
            }

            @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
            public final void onResult(java.util.List<? extends Value> data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                kotlinx.coroutines.CancellableContinuation<androidx.paging.DataSource.BaseResult<Value>> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(new androidx.paging.DataSource.BaseResult(data, this.getPrevKey$paging_common(data), this.getNextKey$paging_common(data), 0, 0, 24, null)));
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final java.lang.Object loadBefore$paging_common(androidx.paging.ItemKeyedDataSource.LoadParams<Key> loadParams, kotlin.coroutines.Continuation<? super androidx.paging.DataSource.BaseResult<Value>> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        loadBefore(loadParams, access$asCallback(this, cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final java.lang.Object loadAfter$paging_common(androidx.paging.ItemKeyedDataSource.LoadParams<Key> loadParams, kotlin.coroutines.Continuation<? super androidx.paging.DataSource.BaseResult<Value>> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        loadAfter(loadParams, access$asCallback(this, cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static /* synthetic */ java.util.List $r8$lambda$7pTL_5WoQ0BUE2QxGzNiujw5xYQ(androidx.arch.core.util.Function function, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(function.apply(it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ java.util.List $r8$lambda$ORtfuBCMSpSxbFgoz8Kp1F87oyw(kotlin.jvm.functions.Function1 function1, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        return (java.util.List) function1.invoke(list);
    }

    public static /* synthetic */ java.util.List $r8$lambda$REcoPOptYLBN6uEi_lTWl_UJO3E(kotlin.jvm.functions.Function1 function1, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(function1.invoke(it.next()));
        }
        return arrayList;
    }

    public static final /* synthetic */ androidx.paging.ItemKeyedDataSource$asCallback$1 access$asCallback(final androidx.paging.ItemKeyedDataSource itemKeyedDataSource, final kotlinx.coroutines.CancellableContinuation cancellableContinuation) {
        return new androidx.paging.ItemKeyedDataSource.LoadCallback<Value>() { // from class: androidx.paging.ItemKeyedDataSource$asCallback$1
            @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
            public final void onResult(java.util.List<? extends Value> data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                kotlinx.coroutines.CancellableContinuation<androidx.paging.DataSource.BaseResult<Value>> cancellableContinuation2 = cancellableContinuation;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(new androidx.paging.DataSource.BaseResult(data, itemKeyedDataSource.getPrevKey$paging_common(data), itemKeyedDataSource.getNextKey$paging_common(data), 0, 0, 24, null)));
            }
        };
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.paging.LoadType.values().length];
            try {
                iArr[androidx.paging.LoadType.REFRESH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.paging.LoadType.PREPEND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.paging.LoadType.APPEND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
