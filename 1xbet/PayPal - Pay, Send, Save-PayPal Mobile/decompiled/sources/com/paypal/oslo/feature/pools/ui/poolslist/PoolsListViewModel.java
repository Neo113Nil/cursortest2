package com.paypal.oslo.feature.pools.ui.poolslist;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R&\u0010+\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020(0-8\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u00102\u001a\b\u0012\u0004\u0012\u00020*0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u0010\u000eR\u001a\u00105\u001a\u0002048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010:R\u001e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010<"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/pools/domain/usecase/GetPoolsPaginatedUseCase;", "getPoolsPaginatedUseCase", "Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListReducer;", "reducer", "Lcom/paypal/oslo/feature/pools/extensions/PoolUiErrorMapper;", "errorMapper", "<init>", "(Lcom/paypal/oslo/feature/pools/domain/usecase/GetPoolsPaginatedUseCase;Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListReducer;Lcom/paypal/oslo/feature/pools/extensions/PoolUiErrorMapper;)V", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "getPoolsPagingData", "()Lkotlinx/coroutines/flow/Flow;", "", "poolId", "creatorAccountId", "", "navigateToPoolDetails", "(Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function0;", com.sun.jna.Callback.METHOD_NAME, "setRetryCallback", "(Lkotlin/jvm/functions/Function0;)V", "retry", "()V", "Landroidx/paging/LoadState;", "loadState", "onLoadStateChanged", "(Landroidx/paging/LoadState;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/pools/extensions/PoolUiErrorMapper;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;", "getOutputFormats", "Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListState;", "Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListIntent;", "Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListEffect;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "effect", "getEffect", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "errorResultRequestId", "Ljava/lang/String;", "getErrorResultRequestId-QDVFmTU", "()Ljava/lang/String;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "getInputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PoolsListViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.LoadState> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect> effect;
    private final java.lang.String errorResultRequestId;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState, com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent, com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.pools.domain.models.Pool>> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function0<kotlin.Unit> getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pools.domain.models.PoolUserRole getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState> uiState;

    @javax.inject.Inject
    public PoolsListViewModel(com.paypal.oslo.feature.pools.domain.usecase.GetPoolsPaginatedUseCase getPoolsPaginatedUseCase, com.paypal.oslo.feature.pools.ui.poolslist.PoolsListReducer poolsListReducer, com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper poolUiErrorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPoolsPaginatedUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolsListReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolUiErrorMapper, "");
        this.Camera2StreamConfigurationMap = poolUiErrorMapper;
        com.paypal.oslo.feature.pools.domain.models.PoolUserRole poolUserRole = com.paypal.oslo.feature.pools.domain.models.PoolUserRole.CREATOR;
        this.getHighSpeedVideoFpsRangesFor = poolUserRole;
        kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.pools.domain.models.Pool>> invoke = getPoolsPaginatedUseCase.invoke(poolUserRole, null);
        com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel poolsListViewModel = this;
        this.getHighSpeedVideoFpsRanges = androidx.paging.CachedPagingDataKt.cachedIn(invoke, androidx.view.ViewModelKt.getViewModelScope(poolsListViewModel));
        kotlinx.coroutines.CoroutineScope viewModelScope = androidx.view.ViewModelKt.getViewModelScope(poolsListViewModel);
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState, com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent, com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>(com.paypal.oslo.feature.pools.constants.PoolsConstants.ComponentNames.POOLS_LIST_VIEWMODEL_STORE, com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState.Initial.INSTANCE, poolsListReducer, null, viewModelScope, 8, null);
        this.getHighResolutionOutputSizeshNQ4ISI = mviStateStore;
        this.uiState = kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.onStart(mviStateStore.getUiState(), new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel$uiState$1(this, null)), androidx.view.ViewModelKt.getViewModelScope(poolsListViewModel), kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.INSTANCE, 5000L, 0L, 2, null), com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState.Initial.INSTANCE);
        this.effect = mviStateStore.getUiEffect();
        this.errorResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
        this.getHighSpeedVideoSizes = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new androidx.paging.LoadState.NotLoading(false));
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect> getEffect() {
        return this.effect;
    }

    /* renamed from: getErrorResultRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getErrorResultRequestId() {
        return this.errorResultRequestId;
    }

    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.pools.domain.models.Pool>> getPoolsPagingData() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void navigateToPoolDetails(java.lang.String poolId, java.lang.String creatorAccountId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creatorAccountId, "");
        this.getHighResolutionOutputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.NavigateToPoolDetails(poolId, creatorAccountId, this.getHighSpeedVideoFpsRangesFor));
    }

    public final void setRetryCallback(kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        this.getInputFormats = callback;
    }

    public final void retry() {
        this.getHighSpeedVideoSizes.setValue(new androidx.paging.LoadState.NotLoading(false));
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getInputFormats;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (java.lang.System.identityHashCode(((androidx.paging.LoadState.Error) r11).getError()) == java.lang.System.identityHashCode(((androidx.paging.LoadState.Error) r1).getError())) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLoadStateChanged(androidx.paging.LoadState loadState) {
        boolean z;
        com.paypal.oslo.feature.pools.domain.error.PoolError.Network network;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadState, "");
        androidx.paging.LoadState value = this.getHighSpeedVideoSizes.getValue();
        boolean z2 = loadState instanceof androidx.paging.LoadState.Error;
        if (z2) {
            if (value instanceof androidx.paging.LoadState.Error) {
            }
            z = true;
            if (z2) {
                this.getHighSpeedVideoSizes.setValue(loadState);
            }
            if (z || !z2) {
            }
            androidx.paging.LoadState.Error error = (androidx.paging.LoadState.Error) loadState;
            if (error.getError() instanceof com.paypal.oslo.feature.pools.domain.error.PoolsLoadException) {
                java.lang.Throwable error2 = error.getError();
                kotlin.jvm.internal.Intrinsics.checkNotNull(error2, "");
                network = ((com.paypal.oslo.feature.pools.domain.error.PoolsLoadException) error2).getPoolError();
            } else {
                network = new com.paypal.oslo.feature.pools.domain.error.PoolError.Network(null, 1, null);
            }
            com.paypal.oslo.feature.pools.shared.ui.error.PoolUiError map = this.Camera2StreamConfigurationMap.map(network);
            com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.pools.LoggerKt.log, com.paypal.android.logger.categories.Network.Error.INSTANCE, network instanceof com.paypal.oslo.feature.pools.domain.error.PoolError.Network ? com.paypal.oslo.feature.pools.logger.PoolsDatadogEvents.GET_POOLS_RESPONSE_NETWORK_ERROR : com.paypal.oslo.feature.pools.logger.PoolsDatadogEvents.GET_POOLS_RESPONSE_PARSE_ERROR, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, network.toString())), null, null, 24, null);
            this.getHighResolutionOutputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.OnLoadError(map.getTitleRes(), map.getDescriptionRes(), map.getPrimaryButtonRes()));
            return;
        }
        z = false;
        if (z2) {
        }
        if (z) {
        }
    }
}
