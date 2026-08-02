package androidx.paging;

@kotlin.Deprecated(message = "PositionalDataSource is deprecated and has been replaced by PagingSource", replaceWith = @kotlin.ReplaceWith(expression = "PagingSource<Int, T>", imports = {"androidx.paging.PagingSource"}))
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b'\u0018\u0000 -*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003:\u0005./01-B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0080@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\b\u001a\u00020\fH\u0080@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0019\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u001e*\u00020\u00012\u001e\u0010!\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 0\u001f¢\u0006\u0004\b\"\u0010#J=\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u001e*\u00020\u00012\u001e\u0010!\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 0$¢\u0006\u0004\b\"\u0010%J1\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u001e*\u00020\u00012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f¢\u0006\u0004\b&\u0010#J1\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u001e*\u00020\u00012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$¢\u0006\u0004\b&\u0010%R \u0010(\u001a\u00020'8\u0011X\u0090D¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u0006\u001a\u0004\b*\u0010+"}, d2 = {"Landroidx/paging/PositionalDataSource;", "", "T", "Landroidx/paging/DataSource;", "", "<init>", "()V", "Landroidx/paging/DataSource$Params;", "params", "Landroidx/paging/DataSource$BaseResult;", "load$paging_common", "(Landroidx/paging/DataSource$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PositionalDataSource$LoadInitialParams;", "loadInitial$paging_common", "(Landroidx/paging/PositionalDataSource$LoadInitialParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PositionalDataSource$LoadRangeParams;", "p0", "getHighSpeedVideoSizes", "(Landroidx/paging/PositionalDataSource$LoadRangeParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PositionalDataSource$LoadInitialCallback;", com.sun.jna.Callback.METHOD_NAME, "", "loadInitial", "(Landroidx/paging/PositionalDataSource$LoadInitialParams;Landroidx/paging/PositionalDataSource$LoadInitialCallback;)V", "Landroidx/paging/PositionalDataSource$LoadRangeCallback;", "loadRange", "(Landroidx/paging/PositionalDataSource$LoadRangeParams;Landroidx/paging/PositionalDataSource$LoadRangeCallback;)V", "item", "getKeyInternal$paging_common", "(Ljava/lang/Object;)Ljava/lang/Integer;", "V", "Landroidx/arch/core/util/Function;", "", "function", "mapByPage", "(Landroidx/arch/core/util/Function;)Landroidx/paging/PositionalDataSource;", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Landroidx/paging/PositionalDataSource;", "map", "", "isContiguous", "Z", "isContiguous$paging_common", "()Z", "isContiguous$paging_common$annotations", "Companion", "LoadInitialParams", "LoadRangeParams", "LoadInitialCallback", "LoadRangeCallback"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PositionalDataSource<T> extends androidx.paging.DataSource<java.lang.Integer, T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.paging.PositionalDataSource.Companion INSTANCE = new androidx.paging.PositionalDataSource.Companion(null);
    private final boolean isContiguous;

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\r"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadInitialCallback;", "T", "", "<init>", "()V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", com.daon.sdk.face.license.License.FEATURE_POSITION, com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT, "", "onResult", "(Ljava/util/List;II)V", "(Ljava/util/List;I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class LoadInitialCallback<T> {
        public abstract void onResult(java.util.List<? extends T> data, int position);

        public abstract void onResult(java.util.List<? extends T> data, int position, int totalCount);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H&¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadRangeCallback;", "T", "", "<init>", "()V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "onResult", "(Ljava/util/List;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class LoadRangeCallback<T> {
        public abstract void onResult(java.util.List<? extends T> data);
    }

    public static /* synthetic */ void isContiguous$paging_common$annotations() {
    }

    public abstract void loadInitial(androidx.paging.PositionalDataSource.LoadInitialParams params, androidx.paging.PositionalDataSource.LoadInitialCallback<T> callback);

    public abstract void loadRange(androidx.paging.PositionalDataSource.LoadRangeParams params, androidx.paging.PositionalDataSource.LoadRangeCallback<T> callback);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.paging.DataSource
    public /* bridge */ /* synthetic */ java.lang.Integer getKeyInternal$paging_common(java.lang.Object obj) {
        return getKeyInternal$paging_common((androidx.paging.PositionalDataSource<T>) obj);
    }

    public PositionalDataSource() {
        super(androidx.paging.DataSource.KeyType.POSITIONAL);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0011\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0011\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadInitialParams;", "", "", "requestedStartPosition", "requestedLoadSize", "pageSize", "", "placeholdersEnabled", "<init>", "(IIIZ)V", com.visa.cbp.getEncExpo.warmup, "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class LoadInitialParams {
        public final int pageSize;
        public final boolean placeholdersEnabled;
        public final int requestedLoadSize;
        public final int requestedStartPosition;

        public LoadInitialParams(int i, int i2, int i3, boolean z) {
            this.requestedStartPosition = i;
            this.requestedLoadSize = i2;
            this.pageSize = i3;
            this.placeholdersEnabled = z;
            if (i < 0) {
                throw new java.lang.IllegalStateException("invalid start position: ".concat(java.lang.String.valueOf(i)).toString());
            }
            if (i2 < 0) {
                throw new java.lang.IllegalStateException("invalid load size: ".concat(java.lang.String.valueOf(i2)).toString());
            }
            if (i3 < 0) {
                throw new java.lang.IllegalStateException("invalid page size: ".concat(java.lang.String.valueOf(i3)).toString());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadRangeParams;", "", "", "startPosition", "loadSize", "<init>", "(II)V", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class LoadRangeParams {
        public final int loadSize;
        public final int startPosition;

        public LoadRangeParams(int i, int i2) {
            this.startPosition = i;
            this.loadSize = i2;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/paging/PositionalDataSource$Companion;", "", "<init>", "()V", "Landroidx/paging/PositionalDataSource$LoadInitialParams;", "params", "", com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT, "computeInitialLoadPosition", "(Landroidx/paging/PositionalDataSource$LoadInitialParams;I)I", "initialLoadPosition", "computeInitialLoadSize", "(Landroidx/paging/PositionalDataSource$LoadInitialParams;II)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final int computeInitialLoadPosition(androidx.paging.PositionalDataSource.LoadInitialParams params, int totalCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
            int i = params.requestedStartPosition;
            int i2 = params.requestedLoadSize;
            int i3 = params.pageSize;
            return java.lang.Math.max(0, java.lang.Math.min(((((totalCount - i2) + i3) - 1) / i3) * i3, (i / i3) * i3));
        }

        @kotlin.jvm.JvmStatic
        public final int computeInitialLoadSize(androidx.paging.PositionalDataSource.LoadInitialParams params, int initialLoadPosition, int totalCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
            return java.lang.Math.min(totalCount - initialLoadPosition, params.requestedLoadSize);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.paging.DataSource
    public final java.lang.Object load$paging_common(androidx.paging.DataSource.Params<java.lang.Integer> params, kotlin.coroutines.Continuation<? super androidx.paging.DataSource.BaseResult<T>> continuation) {
        if (params.getType() == androidx.paging.LoadType.REFRESH) {
            int initialLoadSize = params.getInitialLoadSize();
            int i = 0;
            if (params.getKey() != null) {
                int intValue = params.getKey().intValue();
                if (params.getPlaceholdersEnabled()) {
                    initialLoadSize = java.lang.Math.max(initialLoadSize / params.getPageSize(), 2) * params.getPageSize();
                    i = java.lang.Math.max(0, ((intValue - (initialLoadSize / 2)) / params.getPageSize()) * params.getPageSize());
                } else {
                    i = java.lang.Math.max(0, intValue - (initialLoadSize / 2));
                }
            }
            return loadInitial$paging_common(new androidx.paging.PositionalDataSource.LoadInitialParams(i, initialLoadSize, params.getPageSize(), params.getPlaceholdersEnabled()), continuation);
        }
        java.lang.Integer key = params.getKey();
        kotlin.jvm.internal.Intrinsics.checkNotNull(key);
        int intValue2 = key.intValue();
        int pageSize = params.getPageSize();
        if (params.getType() == androidx.paging.LoadType.PREPEND) {
            pageSize = java.lang.Math.min(pageSize, intValue2);
            intValue2 -= pageSize;
        }
        return getHighSpeedVideoSizes(new androidx.paging.PositionalDataSource.LoadRangeParams(intValue2, pageSize), continuation);
    }

    @Override // androidx.paging.DataSource
    /* renamed from: isContiguous$paging_common, reason: from getter */
    public boolean getIsContiguous() {
        return this.isContiguous;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.DataSource
    public final java.lang.Integer getKeyInternal$paging_common(T item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        throw new java.lang.IllegalStateException("Cannot get key by item in positionalDataSource");
    }

    @Override // androidx.paging.DataSource
    public final <V> androidx.paging.PositionalDataSource<V> mapByPage(androidx.arch.core.util.Function<java.util.List<T>, java.util.List<V>> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        return new androidx.paging.WrapperPositionalDataSource(this, function);
    }

    @Override // androidx.paging.DataSource
    public final <V> androidx.paging.PositionalDataSource<V> mapByPage(final kotlin.jvm.functions.Function1<? super java.util.List<? extends T>, ? extends java.util.List<? extends V>> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        return mapByPage((androidx.arch.core.util.Function) new androidx.arch.core.util.Function() { // from class: androidx.paging.PositionalDataSource$$ExternalSyntheticLambda0
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return androidx.paging.PositionalDataSource.m9265$r8$lambda$f8J9nTLQOyL1uk4L0ZSRM0Fa1o(kotlin.jvm.functions.Function1.this, (java.util.List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public final <V> androidx.paging.PositionalDataSource<V> map(final androidx.arch.core.util.Function<T, V> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        return mapByPage((androidx.arch.core.util.Function) new androidx.arch.core.util.Function() { // from class: androidx.paging.PositionalDataSource$$ExternalSyntheticLambda1
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return androidx.paging.PositionalDataSource.$r8$lambda$jokTwkcB5nMfcs34YoCVs57wMXA(androidx.arch.core.util.Function.this, (java.util.List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public final <V> androidx.paging.PositionalDataSource<V> map(final kotlin.jvm.functions.Function1<? super T, ? extends V> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        return mapByPage((androidx.arch.core.util.Function) new androidx.arch.core.util.Function() { // from class: androidx.paging.PositionalDataSource$$ExternalSyntheticLambda2
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return androidx.paging.PositionalDataSource.$r8$lambda$HXUx3uoPbG0eOKZsfTvBCOVD14c(kotlin.jvm.functions.Function1.this, (java.util.List) obj);
            }
        });
    }

    public final java.lang.Object loadInitial$paging_common(final androidx.paging.PositionalDataSource.LoadInitialParams loadInitialParams, kotlin.coroutines.Continuation<? super androidx.paging.DataSource.BaseResult<T>> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        loadInitial(loadInitialParams, new androidx.paging.PositionalDataSource.LoadInitialCallback<T>(this) { // from class: androidx.paging.PositionalDataSource$loadInitial$2$1
            final /* synthetic */ androidx.paging.PositionalDataSource<T> getHighSpeedVideoFpsRanges;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.getHighSpeedVideoFpsRanges = this;
            }

            @Override // androidx.paging.PositionalDataSource.LoadInitialCallback
            public final void onResult(java.util.List<? extends T> data, int position, int totalCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                if (this.getHighSpeedVideoFpsRanges.isInvalid()) {
                    kotlinx.coroutines.CancellableContinuation<androidx.paging.DataSource.BaseResult<T>> cancellableContinuation = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(androidx.paging.DataSource.BaseResult.INSTANCE.empty$paging_common()));
                } else {
                    int size = data.size() + position;
                    getHighResolutionOutputSizeshNQ4ISI(loadInitialParams, new androidx.paging.DataSource.BaseResult<>(data, position == 0 ? null : java.lang.Integer.valueOf(position), size != totalCount ? java.lang.Integer.valueOf(size) : null, position, (totalCount - data.size()) - position));
                }
            }

            @Override // androidx.paging.PositionalDataSource.LoadInitialCallback
            public final void onResult(java.util.List<? extends T> data, int position) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                if (this.getHighSpeedVideoFpsRanges.isInvalid()) {
                    kotlinx.coroutines.CancellableContinuation<androidx.paging.DataSource.BaseResult<T>> cancellableContinuation = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(androidx.paging.DataSource.BaseResult.INSTANCE.empty$paging_common()));
                    return;
                }
                getHighResolutionOutputSizeshNQ4ISI(loadInitialParams, new androidx.paging.DataSource.BaseResult<>(data, position == 0 ? null : java.lang.Integer.valueOf(position), java.lang.Integer.valueOf(data.size() + position), position, Integer.MIN_VALUE));
            }

            private final void getHighResolutionOutputSizeshNQ4ISI(androidx.paging.PositionalDataSource.LoadInitialParams p0, androidx.paging.DataSource.BaseResult<T> p1) {
                if (p0.placeholdersEnabled) {
                    p1.validateForInitialTiling$paging_common(p0.pageSize);
                }
                kotlinx.coroutines.CancellableContinuation<androidx.paging.DataSource.BaseResult<T>> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(p1));
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoSizes(final androidx.paging.PositionalDataSource.LoadRangeParams loadRangeParams, kotlin.coroutines.Continuation<? super androidx.paging.DataSource.BaseResult<T>> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        loadRange(loadRangeParams, new androidx.paging.PositionalDataSource.LoadRangeCallback<T>() { // from class: androidx.paging.PositionalDataSource$loadRange$2$1
            @Override // androidx.paging.PositionalDataSource.LoadRangeCallback
            public final void onResult(java.util.List<? extends T> data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                java.lang.Integer valueOf = androidx.paging.PositionalDataSource.LoadRangeParams.this.startPosition == 0 ? null : java.lang.Integer.valueOf(androidx.paging.PositionalDataSource.LoadRangeParams.this.startPosition);
                if (this.isInvalid()) {
                    kotlinx.coroutines.CancellableContinuation<androidx.paging.DataSource.BaseResult<T>> cancellableContinuation = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(androidx.paging.DataSource.BaseResult.INSTANCE.empty$paging_common()));
                } else {
                    kotlinx.coroutines.CancellableContinuation<androidx.paging.DataSource.BaseResult<T>> cancellableContinuation2 = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    cancellableContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(new androidx.paging.DataSource.BaseResult(data, valueOf, java.lang.Integer.valueOf(androidx.paging.PositionalDataSource.LoadRangeParams.this.startPosition + data.size()), 0, 0, 24, null)));
                }
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static /* synthetic */ java.util.List $r8$lambda$HXUx3uoPbG0eOKZsfTvBCOVD14c(kotlin.jvm.functions.Function1 function1, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(function1.invoke(it.next()));
        }
        return arrayList;
    }

    /* renamed from: $r8$lambda$f8J9nTLQOyL1uk4L0ZSRM0-Fa1o, reason: not valid java name */
    public static /* synthetic */ java.util.List m9265$r8$lambda$f8J9nTLQOyL1uk4L0ZSRM0Fa1o(kotlin.jvm.functions.Function1 function1, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        return (java.util.List) function1.invoke(list);
    }

    public static /* synthetic */ java.util.List $r8$lambda$jokTwkcB5nMfcs34YoCVs57wMXA(androidx.arch.core.util.Function function, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(function.apply(it.next()));
        }
        return arrayList;
    }

    @kotlin.jvm.JvmStatic
    public static final int computeInitialLoadSize(androidx.paging.PositionalDataSource.LoadInitialParams loadInitialParams, int i, int i2) {
        return INSTANCE.computeInitialLoadSize(loadInitialParams, i, i2);
    }

    @kotlin.jvm.JvmStatic
    public static final int computeInitialLoadPosition(androidx.paging.PositionalDataSource.LoadInitialParams loadInitialParams, int i) {
        return INSTANCE.computeInitialLoadPosition(loadInitialParams, i);
    }
}
