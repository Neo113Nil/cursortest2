package com.paypal.oslo.feature.pools.ui.createpool;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0&8\u0007¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010,\u001a\b\u0012\u0004\u0012\u00020$0+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/pools/domain/usecase/CreatePoolUseCase;", "createPoolUseCase", "Lcom/paypal/oslo/feature/pools/extensions/PoolUiErrorMapper;", "errorMapper", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/pools/domain/usecase/CreatePoolUseCase;Lcom/paypal/oslo/feature/pools/extensions/PoolUiErrorMapper;Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolReducer;)V", "", "name", "", "onNameChanged", "(Ljava/lang/String;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "onDescriptionChanged", "url", "onBackgroundImageUrlChanged", "Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "amount", "onTargetAmountChanged", "(Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;)V", "date", "onTargetDateChanged", "onSubmitClicked", "()V", "onDismissError", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/pools/domain/usecase/CreatePoolUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/pools/extensions/PoolUiErrorMapper;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "effect", "Lkotlinx/coroutines/flow/Flow;", "getEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CreatePoolViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect> effect;
    private final com.paypal.oslo.feature.pools.domain.usecase.CreatePoolUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState, com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent, com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState> uiState;

    @javax.inject.Inject
    public CreatePoolViewModel(com.paypal.oslo.feature.pools.domain.usecase.CreatePoolUseCase createPoolUseCase, com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper poolUiErrorMapper, com.paypal.oslo.feature.pools.ui.createpool.CreatePoolReducer createPoolReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createPoolUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolUiErrorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createPoolReducer, "");
        this.getHighSpeedVideoFpsRanges = createPoolUseCase;
        this.getHighSpeedVideoSizes = poolUiErrorMapper;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState, com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent, com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>(com.paypal.oslo.feature.pools.constants.PoolsConstants.ComponentNames.CREATE_POOL_VIEWMODEL_STORE, new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing(null, null, null, null, null, 31, null), createPoolReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel$sideEffectsMiddleware$1(this)), androidx.view.ViewModelKt.getViewModelScope(this));
        this.Camera2StreamConfigurationMap = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.effect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect> getEffect() {
        return this.effect;
    }

    public final void onNameChanged(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        this.Camera2StreamConfigurationMap.onEvent(new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.NameChanged(name2));
    }

    public final void onDescriptionChanged(java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        this.Camera2StreamConfigurationMap.onEvent(new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.DescriptionChanged(description));
    }

    public final void onBackgroundImageUrlChanged(java.lang.String url) {
        this.Camera2StreamConfigurationMap.onEvent(new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.BackgroundImageUrlChanged(url));
    }

    public final void onTargetAmountChanged(com.paypal.oslo.feature.pools.domain.models.PoolAmount amount) {
        this.Camera2StreamConfigurationMap.onEvent(new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.TargetAmountChanged(amount));
    }

    public final void onTargetDateChanged(java.lang.String date) {
        this.Camera2StreamConfigurationMap.onEvent(new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.TargetDateChanged(date));
    }

    public final void onSubmitClicked() {
        this.Camera2StreamConfigurationMap.onEvent(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.SubmitClicked.INSTANCE);
    }

    public final void onDismissError() {
        this.Camera2StreamConfigurationMap.onEvent(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.DismissError.INSTANCE);
    }
}
