package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005B)\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fB!\b\u0017\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000eB+\b\u0017\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\r\u0012\b\b\u0002\u0010\n\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010 \u001a\u00020\u00122\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0086@¢\u0006\u0004\b \u0010!J#\u0010 \u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b \u0010$J\r\u0010%\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0012¢\u0006\u0004\b'\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0004¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u0004\u0018\u00018\u00002\u0006\u0010*\u001a\u00020\u0015¢\u0006\u0004\b+\u0010)J\u0013\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0015H\u0016¢\u0006\u0004\b/\u00100J!\u00104\u001a\u00020\u00122\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001201¢\u0006\u0004\b4\u00105J!\u00106\u001a\u00020\u00122\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001201¢\u0006\u0004\b6\u00105J\u001b\u00108\u001a\u00020\u00122\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001207¢\u0006\u0004\b8\u00109J\u001b\u0010:\u001a\u00020\u00122\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001207¢\u0006\u0004\b:\u00109J\u0019\u0010>\u001a\u00020=2\n\u0010<\u001a\u0006\u0012\u0002\b\u00030;¢\u0006\u0004\b>\u0010?J\u0019\u0010A\u001a\u00020=2\n\u0010@\u001a\u0006\u0012\u0002\b\u00030;¢\u0006\u0004\bA\u0010?J%\u0010B\u001a\u00020=2\n\u0010<\u001a\u0006\u0012\u0002\b\u00030;2\n\u0010@\u001a\u0006\u0012\u0002\b\u00030;¢\u0006\u0004\bB\u0010CR\u0016\u0010F\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010HR\u001d\u0010K\u001a\b\u0012\u0004\u0012\u0002020J8\u0007¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR \u0010O\u001a\b\u0012\u0004\u0012\u00020\u00120J8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010L\u001a\u0004\bP\u0010N"}, d2 = {"Landroidx/paging/PagingDataAdapter;", "", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "Lkotlin/coroutines/CoroutineContext;", "mainDispatcher", "workerDispatcher", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Lkotlinx/coroutines/CoroutineDispatcher;)V", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;", "strategy", "", "setStateRestorationPolicy", "(Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;)V", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "getItemId", "(I)J", "", "hasStableIds", "setHasStableIds", "(Z)V", "Landroidx/paging/PagingData;", "pagingData", "submitData", "(Landroidx/paging/PagingData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/Lifecycle;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "(Landroidx/lifecycle/Lifecycle;Landroidx/paging/PagingData;)V", "retry", "()V", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "getItem", "(I)Ljava/lang/Object;", "index", "peek", "Landroidx/paging/ItemSnapshotList;", "snapshot", "()Landroidx/paging/ItemSnapshotList;", "getItemCount", "()I", "Lkotlin/Function1;", "Landroidx/paging/CombinedLoadStates;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addLoadStateListener", "(Lkotlin/jvm/functions/Function1;)V", "removeLoadStateListener", "Lkotlin/Function0;", "addOnPagesUpdatedListener", "(Lkotlin/jvm/functions/Function0;)V", "removeOnPagesUpdatedListener", "Landroidx/paging/LoadStateAdapter;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "Landroidx/recyclerview/widget/ConcatAdapter;", "withLoadStateHeader", "(Landroidx/paging/LoadStateAdapter;)Landroidx/recyclerview/widget/ConcatAdapter;", "footer", "withLoadStateFooter", "withLoadStateHeaderAndFooter", "(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadStateAdapter;)Landroidx/recyclerview/widget/ConcatAdapter;", "Camera2StreamConfigurationMap", "Z", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/paging/AsyncPagingDataDiffer;", "Landroidx/paging/AsyncPagingDataDiffer;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/Flow;", "loadStateFlow", "Lkotlinx/coroutines/flow/Flow;", "getLoadStateFlow", "()Lkotlinx/coroutines/flow/Flow;", "onPagesUpdatedFlow", "getOnPagesUpdatedFlow"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PagingDataAdapter<T, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.paging.AsyncPagingDataDiffer<T> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.Flow<androidx.paging.CombinedLoadStates> loadStateFlow;
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> onPagesUpdatedFlow;

    public PagingDataAdapter(androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext2, "");
        androidx.paging.AsyncPagingDataDiffer<T> asyncPagingDataDiffer = new androidx.paging.AsyncPagingDataDiffer<>(itemCallback, new androidx.recyclerview.widget.AdapterListUpdateCallback(this), coroutineContext, coroutineContext2);
        this.getHighSpeedVideoFpsRanges = asyncPagingDataDiffer;
        super.setStateRestorationPolicy(androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT);
        registerAdapterDataObserver(new androidx.recyclerview.widget.RecyclerView.AdapterDataObserver(this) { // from class: androidx.paging.PagingDataAdapter.1
            final /* synthetic */ androidx.paging.PagingDataAdapter<T, VH> getHighResolutionOutputSizeshNQ4ISI;

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public final void onItemRangeInserted(int positionStart, int itemCount) {
                androidx.paging.PagingDataAdapter.access$_init_$considerAllowingStateRestoration(this.getHighResolutionOutputSizeshNQ4ISI);
                this.getHighResolutionOutputSizeshNQ4ISI.unregisterAdapterDataObserver(this);
                super.onItemRangeInserted(positionStart, itemCount);
            }
        });
        addLoadStateListener(new kotlin.jvm.functions.Function1<androidx.paging.CombinedLoadStates, kotlin.Unit>(this) { // from class: androidx.paging.PagingDataAdapter.2
            final /* synthetic */ androidx.paging.PagingDataAdapter<T, VH> getHighResolutionOutputSizeshNQ4ISI;

            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
            private boolean getHighSpeedVideoSizes = true;

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.paging.CombinedLoadStates combinedLoadStates) {
                invoke2(combinedLoadStates);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.paging.CombinedLoadStates loadStates) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadStates, "");
                if (this.getHighSpeedVideoSizes) {
                    this.getHighSpeedVideoSizes = false;
                } else if (loadStates.getSource().getRefresh() instanceof androidx.paging.LoadState.NotLoading) {
                    androidx.paging.PagingDataAdapter.access$_init_$considerAllowingStateRestoration(this.getHighResolutionOutputSizeshNQ4ISI);
                    this.getHighResolutionOutputSizeshNQ4ISI.removeLoadStateListener(this);
                }
            }
        });
        this.loadStateFlow = asyncPagingDataDiffer.getLoadStateFlow();
        this.onPagesUpdatedFlow = asyncPagingDataDiffer.getOnPagesUpdatedFlow();
    }

    public /* synthetic */ PagingDataAdapter(androidx.recyclerview.widget.DiffUtil.ItemCallback itemCallback, kotlinx.coroutines.MainCoroutineDispatcher mainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(itemCallback, (i & 2) != 0 ? kotlinx.coroutines.Dispatchers.getMain() : mainCoroutineDispatcher, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getDefault() : coroutineDispatcher);
    }

    public /* synthetic */ PagingDataAdapter(androidx.recyclerview.widget.DiffUtil.ItemCallback itemCallback, kotlinx.coroutines.MainCoroutineDispatcher mainCoroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(itemCallback, (i & 2) != 0 ? kotlinx.coroutines.Dispatchers.getMain() : mainCoroutineDispatcher);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by constructors which accept CoroutineContext")
    public /* synthetic */ PagingDataAdapter(androidx.recyclerview.widget.DiffUtil.ItemCallback itemCallback, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        this(itemCallback, (kotlin.coroutines.CoroutineContext) coroutineDispatcher, (kotlin.coroutines.CoroutineContext) kotlinx.coroutines.Dispatchers.getDefault());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
    }

    public /* synthetic */ PagingDataAdapter(androidx.recyclerview.widget.DiffUtil.ItemCallback itemCallback, kotlinx.coroutines.MainCoroutineDispatcher mainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(itemCallback, (i & 2) != 0 ? kotlinx.coroutines.Dispatchers.getMain() : mainCoroutineDispatcher, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getDefault() : coroutineDispatcher);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by constructors which accept CoroutineContext")
    public /* synthetic */ PagingDataAdapter(androidx.recyclerview.widget.DiffUtil.ItemCallback itemCallback, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2) {
        this(itemCallback, (kotlin.coroutines.CoroutineContext) coroutineDispatcher, (kotlin.coroutines.CoroutineContext) coroutineDispatcher2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setStateRestorationPolicy(androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy strategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "");
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        super.setStateRestorationPolicy(strategy);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean hasStableIds) {
        throw new java.lang.UnsupportedOperationException("Stable ids are unsupported on PagingDataAdapter.");
    }

    public final java.lang.Object submitData(androidx.paging.PagingData<T> pagingData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object submitData = this.getHighSpeedVideoFpsRanges.submitData(pagingData, continuation);
        return submitData == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? submitData : kotlin.Unit.INSTANCE;
    }

    public final void submitData(androidx.view.Lifecycle lifecycle, androidx.paging.PagingData<T> pagingData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingData, "");
        this.getHighSpeedVideoFpsRanges.submitData(lifecycle, pagingData);
    }

    public final void retry() {
        this.getHighSpeedVideoFpsRanges.retry();
    }

    public final void refresh() {
        this.getHighSpeedVideoFpsRanges.refresh();
    }

    protected final T getItem(int position) {
        return this.getHighSpeedVideoFpsRanges.getItem(position);
    }

    public final T peek(int index) {
        return this.getHighSpeedVideoFpsRanges.peek(index);
    }

    public final androidx.paging.ItemSnapshotList<T> snapshot() {
        return this.getHighSpeedVideoFpsRanges.snapshot();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.getHighSpeedVideoFpsRanges.getItemCount();
    }

    public final kotlinx.coroutines.flow.Flow<androidx.paging.CombinedLoadStates> getLoadStateFlow() {
        return this.loadStateFlow;
    }

    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> getOnPagesUpdatedFlow() {
        return this.onPagesUpdatedFlow;
    }

    public final void addLoadStateListener(kotlin.jvm.functions.Function1<? super androidx.paging.CombinedLoadStates, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.getHighSpeedVideoFpsRanges.addLoadStateListener(listener);
    }

    public final void removeLoadStateListener(kotlin.jvm.functions.Function1<? super androidx.paging.CombinedLoadStates, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.getHighSpeedVideoFpsRanges.removeLoadStateListener(listener);
    }

    public final void addOnPagesUpdatedListener(kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.getHighSpeedVideoFpsRanges.addOnPagesUpdatedListener(listener);
    }

    public final void removeOnPagesUpdatedListener(kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.getHighSpeedVideoFpsRanges.removeOnPagesUpdatedListener(listener);
    }

    public final androidx.recyclerview.widget.ConcatAdapter withLoadStateHeader(final androidx.paging.LoadStateAdapter<?> header) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "");
        addLoadStateListener(new kotlin.jvm.functions.Function1() { // from class: androidx.paging.PagingDataAdapter$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.paging.PagingDataAdapter.$r8$lambda$GNpWrbpXGLwyhVmUWv7FvMmT6io(androidx.paging.LoadStateAdapter.this, (androidx.paging.CombinedLoadStates) obj);
            }
        });
        return new androidx.recyclerview.widget.ConcatAdapter((androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>[]) new androidx.recyclerview.widget.RecyclerView.Adapter[]{header, this});
    }

    public final androidx.recyclerview.widget.ConcatAdapter withLoadStateFooter(final androidx.paging.LoadStateAdapter<?> footer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(footer, "");
        addLoadStateListener(new kotlin.jvm.functions.Function1() { // from class: androidx.paging.PagingDataAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.paging.PagingDataAdapter.$r8$lambda$YU7Vnmd_v3KSbXBE1j3z4qQsS80(androidx.paging.LoadStateAdapter.this, (androidx.paging.CombinedLoadStates) obj);
            }
        });
        return new androidx.recyclerview.widget.ConcatAdapter((androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>[]) new androidx.recyclerview.widget.RecyclerView.Adapter[]{this, footer});
    }

    public final androidx.recyclerview.widget.ConcatAdapter withLoadStateHeaderAndFooter(final androidx.paging.LoadStateAdapter<?> header, final androidx.paging.LoadStateAdapter<?> footer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(footer, "");
        addLoadStateListener(new kotlin.jvm.functions.Function1() { // from class: androidx.paging.PagingDataAdapter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.paging.PagingDataAdapter.$r8$lambda$2NxDAOX8LMkrOpokGPLWK3Uy9iQ(androidx.paging.LoadStateAdapter.this, footer, (androidx.paging.CombinedLoadStates) obj);
            }
        });
        return new androidx.recyclerview.widget.ConcatAdapter((androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>[]) new androidx.recyclerview.widget.RecyclerView.Adapter[]{header, this, footer});
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2NxDAOX8LMkrOpokGPLWK3Uy9iQ(androidx.paging.LoadStateAdapter loadStateAdapter, androidx.paging.LoadStateAdapter loadStateAdapter2, androidx.paging.CombinedLoadStates combinedLoadStates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedLoadStates, "");
        loadStateAdapter.setLoadState(combinedLoadStates.getPrepend());
        loadStateAdapter2.setLoadState(combinedLoadStates.getAppend());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GNpWrbpXGLwyhVmUWv7FvMmT6io(androidx.paging.LoadStateAdapter loadStateAdapter, androidx.paging.CombinedLoadStates combinedLoadStates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedLoadStates, "");
        loadStateAdapter.setLoadState(combinedLoadStates.getPrepend());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YU7Vnmd_v3KSbXBE1j3z4qQsS80(androidx.paging.LoadStateAdapter loadStateAdapter, androidx.paging.CombinedLoadStates combinedLoadStates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedLoadStates, "");
        loadStateAdapter.setLoadState(combinedLoadStates.getAppend());
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$_init_$considerAllowingStateRestoration(androidx.paging.PagingDataAdapter pagingDataAdapter) {
        if (pagingDataAdapter.getStateRestorationPolicy() != androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT || pagingDataAdapter.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        pagingDataAdapter.setStateRestorationPolicy(androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.ALLOW);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PagingDataAdapter(androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback, kotlin.coroutines.CoroutineContext coroutineContext) {
        this(itemCallback, coroutineContext, (kotlin.coroutines.CoroutineContext) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PagingDataAdapter(androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback) {
        this(itemCallback, (kotlin.coroutines.CoroutineContext) null, (kotlin.coroutines.CoroutineContext) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemCallback, "");
    }
}
