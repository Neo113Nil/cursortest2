package androidx.paging.compose;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u001d\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u0013\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR7\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010(\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b&\u0010'R+\u0010/\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020)8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,\"\u0004\b-\u0010."}, d2 = {"Landroidx/paging/compose/LazyPagingItems;", "", "T", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "<init>", "(Lkotlinx/coroutines/flow/Flow;)V", "", "index", "get", "(I)Ljava/lang/Object;", "peek", "", "retry", "()V", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "collectLoadState$paging_compose", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectPagingData$paging_compose", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/coroutines/CoroutineContext;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/coroutines/CoroutineContext;", "getHighSpeedVideoSizes", "Landroidx/paging/compose/LazyPagingItems$pagingDataPresenter$1;", "Landroidx/paging/compose/LazyPagingItems$pagingDataPresenter$1;", "Landroidx/paging/ItemSnapshotList;", "<set-?>", "itemSnapshotList$delegate", "Landroidx/compose/runtime/MutableState;", "getItemSnapshotList", "()Landroidx/paging/ItemSnapshotList;", "setItemSnapshotList", "(Landroidx/paging/ItemSnapshotList;)V", "itemSnapshotList", "getItemCount", "()I", "itemCount", "Landroidx/paging/CombinedLoadStates;", "loadState$delegate", "getLoadState", "()Landroidx/paging/CombinedLoadStates;", "setLoadState", "(Landroidx/paging/CombinedLoadStates;)V", "loadState"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LazyPagingItems<T> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<T>> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.paging.compose.LazyPagingItems$pagingDataPresenter$1 getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: itemSnapshotList$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState itemSnapshotList;

    /* renamed from: loadState$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState loadState;

    public LazyPagingItems(kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<T>> flow) {
        androidx.paging.LoadStates loadStates;
        androidx.paging.LoadStates loadStates2;
        androidx.paging.LoadStates loadStates3;
        androidx.paging.LoadStates loadStates4;
        this.getHighSpeedVideoFpsRangesFor = flow;
        final kotlin.coroutines.CoroutineContext uiDispatcher = androidx.paging.compose.UiDispatcher_androidKt.getUiDispatcher();
        this.getHighSpeedVideoSizes = uiDispatcher;
        final androidx.paging.PagingData pagingData = flow instanceof kotlinx.coroutines.flow.SharedFlow ? (androidx.paging.PagingData) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) ((kotlinx.coroutines.flow.SharedFlow) flow).getReplayCache()) : null;
        androidx.paging.PagingDataPresenter<T> pagingDataPresenter = new androidx.paging.PagingDataPresenter<T>(this, uiDispatcher, pagingData) { // from class: androidx.paging.compose.LazyPagingItems$pagingDataPresenter$1
            final /* synthetic */ androidx.paging.compose.LazyPagingItems<T> getHighSpeedVideoFpsRangesFor;

            {
                this.getHighSpeedVideoFpsRangesFor = this;
            }

            @Override // androidx.paging.PagingDataPresenter
            public final java.lang.Object presentPagingDataEvent(androidx.paging.PagingDataEvent<T> pagingDataEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                r1.setItemSnapshotList(snapshot());
                return kotlin.Unit.INSTANCE;
            }
        };
        this.getHighResolutionOutputSizeshNQ4ISI = pagingDataPresenter;
        this.itemSnapshotList = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(pagingDataPresenter.snapshot(), null, 2, null);
        androidx.paging.CombinedLoadStates value = pagingDataPresenter.getLoadStateFlow().getValue();
        if (value == null) {
            loadStates = androidx.paging.compose.LazyPagingItemsKt.getHighSpeedVideoFpsRanges;
            androidx.paging.LoadState refresh = loadStates.getRefresh();
            loadStates2 = androidx.paging.compose.LazyPagingItemsKt.getHighSpeedVideoFpsRanges;
            androidx.paging.LoadState prepend = loadStates2.getPrepend();
            loadStates3 = androidx.paging.compose.LazyPagingItemsKt.getHighSpeedVideoFpsRanges;
            androidx.paging.LoadState append = loadStates3.getAppend();
            loadStates4 = androidx.paging.compose.LazyPagingItemsKt.getHighSpeedVideoFpsRanges;
            value = new androidx.paging.CombinedLoadStates(refresh, prepend, append, loadStates4, null, 16, null);
        }
        this.loadState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(value, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setItemSnapshotList(androidx.paging.ItemSnapshotList<T> itemSnapshotList) {
        this.itemSnapshotList.setValue(itemSnapshotList);
    }

    public final androidx.paging.ItemSnapshotList<T> getItemSnapshotList() {
        return (androidx.paging.ItemSnapshotList) this.itemSnapshotList.getValue();
    }

    public final int getItemCount() {
        return getItemSnapshotList().size();
    }

    public final T get(int index) {
        get(index);
        return getItemSnapshotList().get(index);
    }

    public final T peek(int index) {
        return getItemSnapshotList().get(index);
    }

    public final void retry() {
        retry();
    }

    public final void refresh() {
        refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLoadState(androidx.paging.CombinedLoadStates combinedLoadStates) {
        this.loadState.setValue(combinedLoadStates);
    }

    public final androidx.paging.CombinedLoadStates getLoadState() {
        return (androidx.paging.CombinedLoadStates) this.loadState.getValue();
    }

    public final java.lang.Object collectLoadState$paging_compose(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.filterNotNull(getLoadStateFlow()).collect(new kotlinx.coroutines.flow.FlowCollector(this) { // from class: androidx.paging.compose.LazyPagingItems$collectLoadState$2
            final /* synthetic */ androidx.paging.compose.LazyPagingItems<T> getHighSpeedVideoFpsRanges;

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                this.getHighSpeedVideoFpsRanges.setLoadState((androidx.paging.CombinedLoadStates) obj);
                return kotlin.Unit.INSTANCE;
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object collectPagingData$paging_compose(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collectLatest = kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRangesFor, new androidx.paging.compose.LazyPagingItems$collectPagingData$2(this, null), continuation);
        return collectLatest == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collectLatest : kotlin.Unit.INSTANCE;
    }
}
