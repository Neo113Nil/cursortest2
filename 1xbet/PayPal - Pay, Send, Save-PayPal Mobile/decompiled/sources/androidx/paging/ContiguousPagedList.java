package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 c*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u00052\b\u0012\u0004\u0012\u00028\u00010\u0006:\u0001cBi\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0010\u0010\u0019\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00010\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J%\u0010%\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00172\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\b%\u0010&J'\u0010*\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001aH\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001aH\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001aH\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001fH\u0016¢\u0006\u0004\b0\u00101J)\u00104\u001a\u00020\u001f2\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001f02H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u001dH\u0016¢\u0006\u0004\b8\u0010!J\u0017\u0010;\u001a\u00020\u001f2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u001fH\u0016¢\u0006\u0004\b=\u00101J\u0017\u0010?\u001a\u00020\u001f2\u0006\u0010>\u001a\u000209H\u0016¢\u0006\u0004\b?\u0010<J'\u0010C\u001a\u00020\u001f2\u0006\u0010@\u001a\u0002092\u0006\u0010A\u001a\u0002092\u0006\u0010B\u001a\u000209H\u0016¢\u0006\u0004\bC\u0010DJ'\u0010F\u001a\u00020\u001f2\u0006\u0010E\u001a\u0002092\u0006\u0010A\u001a\u0002092\u0006\u0010B\u001a\u000209H\u0016¢\u0006\u0004\bF\u0010DJ\u001f\u0010H\u001a\u00020\u001f2\u0006\u0010G\u001a\u0002092\u0006\u0010>\u001a\u000209H\u0016¢\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\u00020\u001f2\u0006\u0010G\u001a\u0002092\u0006\u0010>\u001a\u000209H\u0016¢\u0006\u0004\bJ\u0010IR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010K\u001a\u0004\bL\u0010MR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010N\u001a\u0004\bO\u0010PR\u0016\u0010.\u001a\u0004\u0018\u00018\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010QR\u0016\u0010T\u001a\u0002098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010,\u001a\u0002098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010SR\u0016\u0010%\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bV\u0010UR\u0016\u0010X\u001a\u0002098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bW\u0010SR\u0016\u0010W\u001a\u0002098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010SR\u0016\u0010Y\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bX\u0010UR\u0014\u0010Z\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bZ\u0010UR \u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010[8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bY\u0010\\R\u001c\u0010`\u001a\u0004\u0018\u00018\u00008WX\u0096\u0004¢\u0006\f\u0012\u0004\b_\u00101\u001a\u0004\b]\u0010^R\u0014\u0010a\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b"}, d2 = {"Landroidx/paging/ContiguousPagedList;", "", "K", "V", "Landroidx/paging/PagedList;", "Landroidx/paging/PagedStorage$Callback;", "Landroidx/paging/LegacyPageFetcher$PageConsumer;", "Landroidx/paging/PagingSource;", "pagingSource", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "backgroundDispatcher", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "Landroidx/paging/PagedList$Config;", "config", "Landroidx/paging/PagingSource$LoadResult$Page;", "initialPage", "initialLastKey", "<init>", "(Landroidx/paging/PagingSource;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/PagedList$BoundaryCallback;Landroidx/paging/PagedList$Config;Landroidx/paging/PagingSource$LoadResult$Page;Ljava/lang/Object;)V", "Landroidx/paging/LoadType;", "type", "page", "", "onPageResult", "(Landroidx/paging/LoadType;Landroidx/paging/PagingSource$LoadResult$Page;)Z", "Landroidx/paging/LoadState;", "state", "", "onStateChanged", "(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", "p0", "", "p1", "getHighSpeedVideoSizes", "(Landroidx/paging/LoadType;Ljava/util/List;)V", "deferEmpty", "deferBegin", "deferEnd", "deferBoundaryCallbacks$paging_common", "(ZZZ)V", "Camera2StreamConfigurationMap", "(Z)V", "getHighSpeedVideoFpsRangesFor", "(ZZ)V", "retry", "()V", "Lkotlin/Function2;", com.sun.jna.Callback.METHOD_NAME, "dispatchCurrentLoadState", "(Lkotlin/jvm/functions/Function2;)V", "loadType", "loadState", "setInitialLoadState", "", "index", "loadAroundInternal", "(I)V", "detach", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "onInitialized", "leadingNulls", "changed", "added", "onPagePrepended", "(III)V", "endPosition", "onPageAppended", "startOfDrops", "onPagesRemoved", "(II)V", "onPagesSwappedToPlaceholder", "Landroidx/paging/PagingSource;", "getPagingSource", "()Landroidx/paging/PagingSource;", "Landroidx/paging/PagedList$BoundaryCallback;", "getBoundaryCallback$paging_common", "()Landroidx/paging/PagedList$BoundaryCallback;", "Ljava/lang/Object;", "getHighSpeedVideoSizesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Z", "getHighResolutionOutputSizeshNQ4ISI", "getOutputMinFrameDuration", "getOutputFormats", "getInputSizeshNQ4ISI", "getInputFormats", "Landroidx/paging/LegacyPageFetcher;", "Landroidx/paging/LegacyPageFetcher;", "getLastKey", "()Ljava/lang/Object;", "getLastKey$annotations", "lastKey", "isDetached", "()Z", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class ContiguousPagedList<K, V> extends androidx.paging.PagedList<V> implements androidx.paging.PagedStorage.Callback, androidx.paging.LegacyPageFetcher.PageConsumer<V> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.paging.ContiguousPagedList.Companion INSTANCE = new androidx.paging.ContiguousPagedList.Companion(null);
    private int Camera2StreamConfigurationMap;
    private final androidx.paging.PagedList.BoundaryCallback<V> boundaryCallback;
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;
    private final K getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;
    private final boolean getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.paging.LegacyPageFetcher<K, V> getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private boolean getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private int getOutputFormats;
    private final androidx.paging.PagingSource<K, V> pagingSource;

    public static /* synthetic */ void getLastKey$annotations() {
    }

    @Override // androidx.paging.PagedList
    public final androidx.paging.PagingSource<K, V> getPagingSource() {
        return this.pagingSource;
    }

    public final androidx.paging.PagedList.BoundaryCallback<V> getBoundaryCallback$paging_common() {
        return this.boundaryCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContiguousPagedList(androidx.paging.PagingSource<K, V> pagingSource, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2, androidx.paging.PagedList.BoundaryCallback<V> boundaryCallback, androidx.paging.PagedList.Config config, androidx.paging.PagingSource.LoadResult.Page<K, V> page, K k) {
        super(pagingSource, coroutineScope, coroutineDispatcher, new androidx.paging.PagedStorage(), config);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        this.pagingSource = pagingSource;
        this.boundaryCallback = boundaryCallback;
        this.getHighSpeedVideoFpsRangesFor = k;
        this.getOutputFormats = Integer.MAX_VALUE;
        this.getOutputMinFrameDuration = Integer.MIN_VALUE;
        this.getInputFormats = config.maxSize != Integer.MAX_VALUE;
        androidx.paging.PagedStorage<V> storage$paging_common = getStorage$paging_common();
        kotlin.jvm.internal.Intrinsics.checkNotNull(storage$paging_common, "");
        this.getHighSpeedVideoSizesFor = new androidx.paging.LegacyPageFetcher<>(coroutineScope, config, pagingSource, coroutineDispatcher, coroutineDispatcher2, this, storage$paging_common);
        if (config.enablePlaceholders) {
            getStorage$paging_common().init(page.getItemsBefore() != Integer.MIN_VALUE ? page.getItemsBefore() : 0, page, page.getItemsAfter() != Integer.MIN_VALUE ? page.getItemsAfter() : 0, 0, this, (page.getItemsBefore() == Integer.MIN_VALUE || page.getItemsAfter() == Integer.MIN_VALUE) ? false : true);
        } else {
            getStorage$paging_common().init(0, page, 0, page.getItemsBefore() != Integer.MIN_VALUE ? page.getItemsBefore() : 0, this, false);
        }
        getHighSpeedVideoSizes(androidx.paging.LoadType.REFRESH, page.getData());
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\t"}, d2 = {"Landroidx/paging/ContiguousPagedList$Companion;", "", "<init>", "()V", "", "prefetchDistance", "index", "leadingNulls", "getPrependItemsRequested$paging_common", "(III)I", "itemsBeforeTrailingNulls", "getAppendItemsRequested$paging_common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final int getAppendItemsRequested$paging_common(int prefetchDistance, int index, int itemsBeforeTrailingNulls) {
            return ((index + prefetchDistance) + 1) - itemsBeforeTrailingNulls;
        }

        public final int getPrependItemsRequested$paging_common(int prefetchDistance, int index, int leadingNulls) {
            return prefetchDistance - (index - leadingNulls);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.paging.PagedList
    public K getLastKey() {
        K refreshKey;
        androidx.paging.PagingState<?, V> refreshKeyInfo = getStorage$paging_common().getRefreshKeyInfo(getConfig());
        return (refreshKeyInfo == null || (refreshKey = this.pagingSource.getRefreshKey(refreshKeyInfo)) == null) ? this.getHighSpeedVideoFpsRangesFor : refreshKey;
    }

    @Override // androidx.paging.PagedList
    public boolean isDetached() {
        return this.getHighSpeedVideoSizesFor.isDetached();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        if (r0.isEmpty() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0092, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        if (r0.isEmpty() == false) goto L32;
     */
    @Override // androidx.paging.LegacyPageFetcher.PageConsumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onPageResult(androidx.paging.LoadType type, androidx.paging.PagingSource.LoadResult.Page<?, V> page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        java.util.List<? extends V> data = page.getData();
        boolean z = false;
        boolean z2 = lastLoad() > getStorage$paging_common().getMiddleOfLoadedRange();
        boolean z3 = this.getInputFormats && getStorage$paging_common().shouldPreTrimNewPage(getConfig().maxSize, getRequiredRemainder(), data.size());
        if (type == androidx.paging.LoadType.APPEND) {
            if (z3 && !z2) {
                this.Camera2StreamConfigurationMap = 0;
            } else {
                getStorage$paging_common().appendPage$paging_common(page, this);
                int size = this.Camera2StreamConfigurationMap - data.size();
                this.Camera2StreamConfigurationMap = size;
                if (size > 0) {
                }
            }
        } else {
            if (type != androidx.paging.LoadType.PREPEND) {
                throw new java.lang.IllegalArgumentException("unexpected result type ".concat(java.lang.String.valueOf(type)));
            }
            if (z3 && z2) {
                this.getHighSpeedVideoFpsRanges = 0;
            } else {
                getStorage$paging_common().prependPage$paging_common(page, this);
                int size2 = this.getHighSpeedVideoFpsRanges - data.size();
                this.getHighSpeedVideoFpsRanges = size2;
                if (size2 > 0) {
                }
            }
        }
        if (this.getInputFormats) {
            if (z2) {
                if (!(this.getHighSpeedVideoSizesFor.getLoadStateManager().getStartState() instanceof androidx.paging.LoadState.Loading) && getStorage$paging_common().trimFromFront$paging_common(this.getInputSizeshNQ4ISI, getConfig().maxSize, getRequiredRemainder(), this)) {
                    this.getHighSpeedVideoSizesFor.getLoadStateManager().setState(androidx.paging.LoadType.PREPEND, androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common());
                }
            } else if (!(this.getHighSpeedVideoSizesFor.getLoadStateManager().getEndState() instanceof androidx.paging.LoadState.Loading) && getStorage$paging_common().trimFromEnd$paging_common(this.getInputSizeshNQ4ISI, getConfig().maxSize, getRequiredRemainder(), this)) {
                this.getHighSpeedVideoSizesFor.getLoadStateManager().setState(androidx.paging.LoadType.APPEND, androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common());
            }
        }
        getHighSpeedVideoSizes(type, data);
        return z;
    }

    @Override // androidx.paging.LegacyPageFetcher.PageConsumer
    public void onStateChanged(androidx.paging.LoadType type, androidx.paging.LoadState state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        dispatchStateChangeAsync$paging_common(type, state);
    }

    private final void getHighSpeedVideoSizes(androidx.paging.LoadType p0, java.util.List<? extends V> p1) {
        if (this.boundaryCallback != null) {
            boolean z = false;
            boolean z2 = getStorage$paging_common().size() == 0;
            boolean z3 = !z2 && p0 == androidx.paging.LoadType.PREPEND && p1.isEmpty();
            if (!z2 && p0 == androidx.paging.LoadType.APPEND && p1.isEmpty()) {
                z = true;
            }
            deferBoundaryCallbacks$paging_common(z2, z3, z);
        }
    }

    public final void deferBoundaryCallbacks$paging_common(boolean deferEmpty, boolean deferBegin, boolean deferEnd) {
        if (this.boundaryCallback == null) {
            throw new java.lang.IllegalStateException("Can't defer BoundaryCallback, no instance");
        }
        if (this.getOutputFormats == Integer.MAX_VALUE) {
            this.getOutputFormats = getStorage$paging_common().size();
        }
        if (this.getOutputMinFrameDuration == Integer.MIN_VALUE) {
            this.getOutputMinFrameDuration = 0;
        }
        if (deferEmpty || deferBegin || deferEnd) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), getNotifyDispatcher(), null, new androidx.paging.ContiguousPagedList$deferBoundaryCallbacks$1(deferEmpty, this, deferBegin, deferEnd, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(boolean p0) {
        boolean z = this.getHighSpeedVideoSizes && this.getOutputFormats <= getConfig().prefetchDistance;
        boolean z2 = this.getHighResolutionOutputSizeshNQ4ISI && this.getOutputMinFrameDuration >= (size() - 1) - getConfig().prefetchDistance;
        if (z || z2) {
            if (z) {
                this.getHighSpeedVideoSizes = false;
            }
            if (z2) {
                this.getHighResolutionOutputSizeshNQ4ISI = false;
            }
            if (p0) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), getNotifyDispatcher(), null, new androidx.paging.ContiguousPagedList$tryDispatchBoundaryCallbacks$1(this, z, z2, null), 2, null);
            } else {
                getHighSpeedVideoFpsRangesFor(z, z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(boolean p0, boolean p1) {
        if (p0) {
            androidx.paging.PagedList.BoundaryCallback<V> boundaryCallback = this.boundaryCallback;
            kotlin.jvm.internal.Intrinsics.checkNotNull(boundaryCallback);
            boundaryCallback.onItemAtFrontLoaded(getStorage$paging_common().getFirstLoadedItem$paging_common());
        }
        if (p1) {
            androidx.paging.PagedList.BoundaryCallback<V> boundaryCallback2 = this.boundaryCallback;
            kotlin.jvm.internal.Intrinsics.checkNotNull(boundaryCallback2);
            boundaryCallback2.onItemAtEndLoaded(getStorage$paging_common().getLastLoadedItem$paging_common());
        }
    }

    @Override // androidx.paging.PagedList
    public void retry() {
        java.lang.Runnable refreshRetryCallback;
        super.retry();
        this.getHighSpeedVideoSizesFor.retry();
        if (!(this.getHighSpeedVideoSizesFor.getLoadStateManager().getRefreshState() instanceof androidx.paging.LoadState.Error) || (refreshRetryCallback = getRefreshRetryCallback()) == null) {
            return;
        }
        refreshRetryCallback.run();
    }

    @Override // androidx.paging.PagedList
    public void dispatchCurrentLoadState(kotlin.jvm.functions.Function2<? super androidx.paging.LoadType, ? super androidx.paging.LoadState, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        this.getHighSpeedVideoSizesFor.getLoadStateManager().dispatchCurrentLoadState(callback);
    }

    @Override // androidx.paging.PagedList
    public void setInitialLoadState(androidx.paging.LoadType loadType, androidx.paging.LoadState loadState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState, "");
        this.getHighSpeedVideoSizesFor.getLoadStateManager().setState(loadType, loadState);
    }

    @Override // androidx.paging.PagedList
    public void loadAroundInternal(int index) {
        androidx.paging.ContiguousPagedList.Companion companion = INSTANCE;
        int prependItemsRequested$paging_common = companion.getPrependItemsRequested$paging_common(getConfig().prefetchDistance, index, getStorage$paging_common().getPlaceholdersBefore());
        int appendItemsRequested$paging_common = companion.getAppendItemsRequested$paging_common(getConfig().prefetchDistance, index, getStorage$paging_common().getPlaceholdersBefore() + getStorage$paging_common().getDataCount());
        int max = java.lang.Math.max(prependItemsRequested$paging_common, this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRanges = max;
        if (max > 0) {
            this.getHighSpeedVideoSizesFor.trySchedulePrepend();
        }
        int max2 = java.lang.Math.max(appendItemsRequested$paging_common, this.Camera2StreamConfigurationMap);
        this.Camera2StreamConfigurationMap = max2;
        if (max2 > 0) {
            this.getHighSpeedVideoSizesFor.tryScheduleAppend();
        }
        this.getOutputFormats = java.lang.Math.min(this.getOutputFormats, index);
        this.getOutputMinFrameDuration = java.lang.Math.max(this.getOutputMinFrameDuration, index);
        Camera2StreamConfigurationMap(true);
    }

    @Override // androidx.paging.PagedList
    public void detach() {
        this.getHighSpeedVideoSizesFor.detach();
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onInitialized(int count) {
        notifyInserted$paging_common(0, count);
        this.getInputSizeshNQ4ISI = getStorage$paging_common().getPlaceholdersBefore() > 0 || getStorage$paging_common().getPlaceholdersAfter() > 0;
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPagePrepended(int leadingNulls, int changed, int added) {
        notifyChanged(leadingNulls, changed);
        notifyInserted$paging_common(0, added);
        this.getOutputFormats += added;
        this.getOutputMinFrameDuration += added;
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPageAppended(int endPosition, int changed, int added) {
        notifyChanged(endPosition, changed);
        notifyInserted$paging_common(endPosition + changed, added);
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPagesRemoved(int startOfDrops, int count) {
        notifyRemoved(startOfDrops, count);
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPagesSwappedToPlaceholder(int startOfDrops, int count) {
        notifyChanged(startOfDrops, count);
    }
}
