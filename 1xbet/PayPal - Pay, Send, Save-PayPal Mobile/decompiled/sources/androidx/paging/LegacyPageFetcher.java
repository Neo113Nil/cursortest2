package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002?@BW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010\u001eJ\r\u0010!\u001a\u00020\u0017¢\u0006\u0004\b!\u0010\u001eJ\r\u0010\"\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010\u001eR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010,R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u00100R\u0018\u0010+\u001a\u000601j\u0002`28\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u00103R(\u00105\u001a\u0002048\u0007@\u0007X\u0086\u000e¢\u0006\u0018\n\u0004\b5\u00106\u0012\u0004\b;\u0010\u001e\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0011\u0010=\u001a\u00020<8G¢\u0006\u0006\u001a\u0004\b=\u0010>"}, d2 = {"Landroidx/paging/LegacyPageFetcher;", "", "K", "V", "Lkotlinx/coroutines/CoroutineScope;", "pagedListScope", "Landroidx/paging/PagedList$Config;", "config", "Landroidx/paging/PagingSource;", "source", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "fetchDispatcher", "Landroidx/paging/LegacyPageFetcher$PageConsumer;", "pageConsumer", "Landroidx/paging/LegacyPageFetcher$KeyProvider;", "keyProvider", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/paging/PagedList$Config;Landroidx/paging/PagingSource;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/LegacyPageFetcher$PageConsumer;Landroidx/paging/LegacyPageFetcher$KeyProvider;)V", "Landroidx/paging/LoadType;", "p0", "Landroidx/paging/PagingSource$LoadParams;", "p1", "", "getHighSpeedVideoFpsRangesFor", "(Landroidx/paging/LoadType;Landroidx/paging/PagingSource$LoadParams;)V", "Landroidx/paging/PagingSource$LoadResult$Page;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/paging/LoadType;Landroidx/paging/PagingSource$LoadResult$Page;)V", "trySchedulePrepend", "()V", "tryScheduleAppend", "getHighSpeedVideoSizes", "retry", "detach", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/paging/PagedList$Config;", "getConfig", "()Landroidx/paging/PagedList$Config;", "Landroidx/paging/PagingSource;", "getSource", "()Landroidx/paging/PagingSource;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineDispatcher;", "Landroidx/paging/LegacyPageFetcher$PageConsumer;", "getPageConsumer", "()Landroidx/paging/LegacyPageFetcher$PageConsumer;", "Landroidx/paging/LegacyPageFetcher$KeyProvider;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/paging/internal/getHighSpeedVideoFpsRangesFor;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/paging/PagedList$LoadStateManager;", "loadStateManager", "Landroidx/paging/PagedList$LoadStateManager;", "getLoadStateManager", "()Landroidx/paging/PagedList$LoadStateManager;", "setLoadStateManager", "(Landroidx/paging/PagedList$LoadStateManager;)V", "getLoadStateManager$annotations", "", "isDetached", "()Z", "PageConsumer", "KeyProvider"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LegacyPageFetcher<K, V> {
    private final kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;
    private final androidx.paging.PagedList.Config config;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.paging.LegacyPageFetcher.KeyProvider<K> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRangesFor;
    private androidx.paging.PagedList.LoadStateManager loadStateManager;
    private final androidx.paging.LegacyPageFetcher.PageConsumer<V> pageConsumer;
    private final androidx.paging.PagingSource<K, V> source;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b`\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00018\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00018\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/paging/LegacyPageFetcher$KeyProvider;", "", "K", "getPrevKey", "()Ljava/lang/Object;", "prevKey", "getNextKey", "nextKey"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface KeyProvider<K> {
        K getNextKey();

        K getPrevKey();
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/paging/LegacyPageFetcher$PageConsumer;", "", "V", "Landroidx/paging/LoadType;", "type", "Landroidx/paging/PagingSource$LoadResult$Page;", "page", "", "onPageResult", "(Landroidx/paging/LoadType;Landroidx/paging/PagingSource$LoadResult$Page;)Z", "Landroidx/paging/LoadState;", "state", "", "onStateChanged", "(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PageConsumer<V> {
        boolean onPageResult(androidx.paging.LoadType type, androidx.paging.PagingSource.LoadResult.Page<?, V> page);

        void onStateChanged(androidx.paging.LoadType type, androidx.paging.LoadState state);
    }

    public static /* synthetic */ void getLoadStateManager$annotations() {
    }

    public LegacyPageFetcher(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.paging.PagedList.Config config, androidx.paging.PagingSource<K, V> pagingSource, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2, androidx.paging.LegacyPageFetcher.PageConsumer<V> pageConsumer, androidx.paging.LegacyPageFetcher.KeyProvider<K> keyProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageConsumer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyProvider, "");
        this.Camera2StreamConfigurationMap = coroutineScope;
        this.config = config;
        this.source = pagingSource;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineDispatcher;
        this.getHighSpeedVideoFpsRangesFor = coroutineDispatcher2;
        this.pageConsumer = pageConsumer;
        this.getHighSpeedVideoSizes = keyProvider;
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.loadStateManager = new androidx.paging.PagedList.LoadStateManager(this) { // from class: androidx.paging.LegacyPageFetcher$loadStateManager$1
            final /* synthetic */ androidx.paging.LegacyPageFetcher<K, V> getHighResolutionOutputSizeshNQ4ISI;

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }

            @Override // androidx.paging.PagedList.LoadStateManager
            public final void onStateChanged(androidx.paging.LoadType type, androidx.paging.LoadState state) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
                this.getHighResolutionOutputSizeshNQ4ISI.getPageConsumer().onStateChanged(type, state);
            }
        };
    }

    public final androidx.paging.PagedList.Config getConfig() {
        return this.config;
    }

    public final androidx.paging.PagingSource<K, V> getSource() {
        return this.source;
    }

    public final androidx.paging.LegacyPageFetcher.PageConsumer<V> getPageConsumer() {
        return this.pageConsumer;
    }

    public final androidx.paging.PagedList.LoadStateManager getLoadStateManager() {
        return this.loadStateManager;
    }

    public final void setLoadStateManager(androidx.paging.PagedList.LoadStateManager loadStateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadStateManager, "");
        this.loadStateManager = loadStateManager;
    }

    public final boolean isDetached() {
        return this.getHighSpeedVideoFpsRanges.get();
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.paging.LoadType p0, androidx.paging.PagingSource.LoadParams<K> p1) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, null, new androidx.paging.LegacyPageFetcher$scheduleLoad$1(this, p1, p0, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.paging.LoadType p0, androidx.paging.PagingSource.LoadResult.Page<K, V> p1) {
        if (isDetached()) {
            return;
        }
        if (this.pageConsumer.onPageResult(p0, p1)) {
            int i = androidx.paging.LegacyPageFetcher.WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
            if (i == 1) {
                getHighSpeedVideoFpsRangesFor();
                return;
            } else {
                if (i == 2) {
                    getHighSpeedVideoSizes();
                    return;
                }
                throw new java.lang.IllegalStateException("Can only fetch more during append/prepend");
            }
        }
        this.loadStateManager.setState(p0, p1.getData().isEmpty() ? androidx.paging.LoadState.NotLoading.INSTANCE.getComplete$paging_common() : androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common());
    }

    public final void trySchedulePrepend() {
        androidx.paging.LoadState startState = this.loadStateManager.getStartState();
        if (!(startState instanceof androidx.paging.LoadState.NotLoading) || startState.getEndOfPaginationReached()) {
            return;
        }
        getHighSpeedVideoFpsRangesFor();
    }

    public final void tryScheduleAppend() {
        androidx.paging.LoadState endState = this.loadStateManager.getEndState();
        if (!(endState instanceof androidx.paging.LoadState.NotLoading) || endState.getEndOfPaginationReached()) {
            return;
        }
        getHighSpeedVideoSizes();
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        K prevKey = this.getHighSpeedVideoSizes.getPrevKey();
        if (prevKey == null) {
            getHighResolutionOutputSizeshNQ4ISI(androidx.paging.LoadType.PREPEND, androidx.paging.PagingSource.LoadResult.Page.INSTANCE.empty$paging_common());
            return;
        }
        this.loadStateManager.setState(androidx.paging.LoadType.PREPEND, androidx.paging.LoadState.Loading.INSTANCE);
        getHighSpeedVideoFpsRangesFor(androidx.paging.LoadType.PREPEND, new androidx.paging.PagingSource.LoadParams.Prepend(prevKey, this.config.pageSize, this.config.enablePlaceholders));
    }

    private final void getHighSpeedVideoSizes() {
        K nextKey = this.getHighSpeedVideoSizes.getNextKey();
        if (nextKey == null) {
            getHighResolutionOutputSizeshNQ4ISI(androidx.paging.LoadType.APPEND, androidx.paging.PagingSource.LoadResult.Page.INSTANCE.empty$paging_common());
            return;
        }
        this.loadStateManager.setState(androidx.paging.LoadType.APPEND, androidx.paging.LoadState.Loading.INSTANCE);
        getHighSpeedVideoFpsRangesFor(androidx.paging.LoadType.APPEND, new androidx.paging.PagingSource.LoadParams.Append(nextKey, this.config.pageSize, this.config.enablePlaceholders));
    }

    public final void retry() {
        if (this.loadStateManager.getStartState() instanceof androidx.paging.LoadState.Error) {
            getHighSpeedVideoFpsRangesFor();
        }
        if (this.loadStateManager.getEndState() instanceof androidx.paging.LoadState.Error) {
            getHighSpeedVideoSizes();
        }
    }

    public final void detach() {
        this.getHighSpeedVideoFpsRanges.set(true);
    }

    public static final /* synthetic */ void access$onLoadError(androidx.paging.LegacyPageFetcher legacyPageFetcher, androidx.paging.LoadType loadType, java.lang.Throwable th) {
        if (legacyPageFetcher.isDetached()) {
            return;
        }
        legacyPageFetcher.loadStateManager.setState(loadType, new androidx.paging.LoadState.Error(th));
    }

    public static final /* synthetic */ void access$onLoadInvalid(androidx.paging.LegacyPageFetcher legacyPageFetcher) {
        legacyPageFetcher.source.invalidate();
        legacyPageFetcher.detach();
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.paging.LoadType.values().length];
            try {
                iArr[androidx.paging.LoadType.PREPEND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.paging.LoadType.APPEND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
