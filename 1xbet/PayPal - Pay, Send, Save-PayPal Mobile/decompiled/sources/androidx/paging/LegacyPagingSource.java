package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 &*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0005:\u0001&B#\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$"}, d2 = {"Landroidx/paging/LegacyPagingSource;", "", "Key", "Value", "Landroidx/paging/PagingSource;", "Landroidx/paging/CompatLegacyPagingSource;", "Lkotlin/coroutines/CoroutineContext;", "fetchContext", "Landroidx/paging/DataSource;", "dataSource", "<init>", "(Lkotlin/coroutines/CoroutineContext;Landroidx/paging/DataSource;)V", "", "pageSize", "", "setPageSize", "(I)V", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/coroutines/CoroutineContext;", "Camera2StreamConfigurationMap", "Landroidx/paging/DataSource;", "getDataSource$paging_common", "()Landroidx/paging/DataSource;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "", "getJumpingSupported", "()Z", "jumpingSupported", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LegacyPagingSource<Key, Value> extends androidx.paging.PagingSource<Key, Value> implements androidx.paging.CompatLegacyPagingSource {
    private static final androidx.paging.LegacyPagingSource.Companion Companion = new androidx.paging.LegacyPagingSource.Companion(null);
    private final androidx.paging.DataSource<Key, Value> dataSource;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRangesFor;

    public LegacyPagingSource(kotlin.coroutines.CoroutineContext coroutineContext, androidx.paging.DataSource<Key, Value> dataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSource, "");
        this.Camera2StreamConfigurationMap = coroutineContext;
        this.dataSource = dataSource;
        this.getHighSpeedVideoFpsRangesFor = Integer.MIN_VALUE;
        dataSource.addInvalidatedCallback(new androidx.paging.LegacyPagingSource.AnonymousClass1(this));
        registerInvalidatedCallback(new kotlin.jvm.functions.Function0() { // from class: androidx.paging.LegacyPagingSource$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.paging.LegacyPagingSource.m9257$r8$lambda$fb4yp6cB0Yzd_6f1wGmAB4XwU(androidx.paging.LegacyPagingSource.this);
            }
        });
    }

    public final androidx.paging.DataSource<Key, Value> getDataSource$paging_common() {
        return this.dataSource;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.paging.LegacyPagingSource$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 implements androidx.paging.DataSource.InvalidatedCallback, kotlin.jvm.internal.FunctionAdapter {
        final /* synthetic */ androidx.paging.LegacyPagingSource<Key, Value> getHighResolutionOutputSizeshNQ4ISI;

        @Override // androidx.paging.DataSource.InvalidatedCallback
        public final void onInvalidated() {
            this.getHighResolutionOutputSizeshNQ4ISI.invalidate();
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final kotlin.Function<?> getFunctionDelegate() {
            return new kotlin.jvm.internal.FunctionReferenceImpl(0, this.getHighResolutionOutputSizeshNQ4ISI, androidx.paging.LegacyPagingSource.class, "invalidate", "invalidate()V", 0);
        }

        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof androidx.paging.DataSource.InvalidatedCallback) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
                return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        AnonymousClass1(androidx.paging.LegacyPagingSource<Key, Value> legacyPagingSource) {
            this.getHighResolutionOutputSizeshNQ4ISI = legacyPagingSource;
        }
    }

    @Override // androidx.paging.CompatLegacyPagingSource
    public final void setPageSize(int pageSize) {
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != Integer.MIN_VALUE && pageSize != i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Page size is already set to ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        this.getHighSpeedVideoFpsRangesFor = pageSize;
    }

    @Override // androidx.paging.PagingSource
    public final java.lang.Object load(androidx.paging.PagingSource.LoadParams<Key> loadParams, kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<Key, Value>> continuation) {
        androidx.paging.LoadType loadType;
        int loadSize;
        boolean z = loadParams instanceof androidx.paging.PagingSource.LoadParams.Refresh;
        if (z) {
            loadType = androidx.paging.LoadType.REFRESH;
        } else if (loadParams instanceof androidx.paging.PagingSource.LoadParams.Append) {
            loadType = androidx.paging.LoadType.APPEND;
        } else {
            if (!(loadParams instanceof androidx.paging.PagingSource.LoadParams.Prepend)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            loadType = androidx.paging.LoadType.PREPEND;
        }
        androidx.paging.LoadType loadType2 = loadType;
        if (this.getHighSpeedVideoFpsRangesFor == Integer.MIN_VALUE) {
            java.lang.System.out.println((java.lang.Object) "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            if (z) {
                androidx.paging.PagingSource.LoadParams.Refresh refresh = (androidx.paging.PagingSource.LoadParams.Refresh) loadParams;
                if (refresh.getLoadSize() % 3 == 0) {
                    loadSize = refresh.getLoadSize() / 3;
                    this.getHighSpeedVideoFpsRangesFor = loadSize;
                }
            }
            loadSize = loadParams.getLoadSize();
            this.getHighSpeedVideoFpsRangesFor = loadSize;
        }
        return kotlinx.coroutines.BuildersKt.withContext(this.Camera2StreamConfigurationMap, new androidx.paging.LegacyPagingSource$load$2(this, new androidx.paging.DataSource.Params(loadType2, loadParams.getKey(), loadParams.getLoadSize(), loadParams.getPlaceholdersEnabled(), this.getHighSpeedVideoFpsRangesFor), loadParams, null), continuation);
    }

    @Override // androidx.paging.PagingSource
    public final Key getRefreshKey(androidx.paging.PagingState<Key, Value> state) {
        java.lang.Object obj;
        Value closestItemToPosition;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        int i = androidx.paging.LegacyPagingSource.WhenMappings.$EnumSwitchMapping$0[this.dataSource.getType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return null;
            }
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.Integer anchorPosition = state.getAnchorPosition();
            if (anchorPosition == null || (closestItemToPosition = state.closestItemToPosition(anchorPosition.intValue())) == null) {
                return null;
            }
            return this.dataSource.getKeyInternal$paging_common(closestItemToPosition);
        }
        java.lang.Integer anchorPosition2 = state.getAnchorPosition();
        if (anchorPosition2 == null) {
            return null;
        }
        int intValue = anchorPosition2.intValue();
        int i2 = intValue - ((androidx.paging.PagingState) state).getHighSpeedVideoFpsRangesFor;
        for (int i3 = 0; i3 < kotlin.collections.CollectionsKt.getLastIndex(state.getPages()) && i2 > kotlin.collections.CollectionsKt.getLastIndex(state.getPages().get(i3).getData()); i3++) {
            i2 -= state.getPages().get(i3).getData().size();
        }
        androidx.paging.PagingSource.LoadResult.Page<Key, Value> closestPageToPosition = state.closestPageToPosition(intValue);
        if (closestPageToPosition == null || (obj = closestPageToPosition.getPrevKey()) == null) {
            obj = 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return (Key) java.lang.Integer.valueOf(((java.lang.Integer) obj).intValue() + i2);
    }

    @Override // androidx.paging.PagingSource
    public final boolean getJumpingSupported() {
        return this.dataSource.getType() == androidx.paging.DataSource.KeyType.POSITIONAL;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/paging/LegacyPagingSource$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$fb4yp6-cB0Yzd_6f1wGmA-B4XwU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9257$r8$lambda$fb4yp6cB0Yzd_6f1wGmAB4XwU(androidx.paging.LegacyPagingSource legacyPagingSource) {
        legacyPagingSource.dataSource.removeInvalidatedCallback(new androidx.paging.LegacyPagingSource$2$1(legacyPagingSource));
        legacyPagingSource.dataSource.invalidate();
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.paging.DataSource.KeyType.values().length];
            try {
                iArr[androidx.paging.DataSource.KeyType.POSITIONAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.paging.DataSource.KeyType.PAGE_KEYED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.paging.DataSource.KeyType.ITEM_KEYED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
