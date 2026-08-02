package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00011B3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0019\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0015\u0010\u001e\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR&\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020#0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010(\u001a\b\u0012\u0004\u0012\u00020\"0'8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010-\u001a\b\u0012\u0004\u0012\u00020#0,8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RewardsDetailArgs;", "navArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatterFacade", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/rewards/GetRewardsSummaryUseCase;", "getRewardsSummaryUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;", "featureGateManager", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RewardsDetailArgs;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/rewards/GetRewardsSummaryUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailReducer;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RewardsDetailArgs;", "getNavArgs", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RewardsDetailArgs;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/rewards/GetRewardsSummaryUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailSideEffectMiddleware;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailObservabilityMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getOutputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RewardsDetailViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.GetRewardsSummaryUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect> getOutputFormats;
    private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsDetailArgs navArgs;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RewardsDetailArgs;", "navArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RewardsDetailArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsDetailArgs navArgs);
    }

    @dagger.assisted.AssistedInject
    public RewardsDetailViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsDetailArgs rewardsDetailArgs, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.GetRewardsSummaryUseCase getRewardsSummaryUseCase, com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailReducer rewardsDetailReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsDetailArgs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRewardsSummaryUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsDetailReducer, "");
        this.navArgs = rewardsDetailArgs;
        this.getHighSpeedVideoFpsRangesFor = currencyFormatterFacade;
        this.getHighSpeedVideoFpsRanges = getRewardsSummaryUseCase;
        this.Camera2StreamConfigurationMap = featureGateManager;
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel.$r8$lambda$OfbloocmDVa7M9wQ3OgPDcouSIU(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel.this);
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI = lazy;
        kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel.$r8$lambda$TeDEJ4FzgWw06tBtVj9sXq9aFQw(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel.this);
            }
        });
        this.getHighSpeedVideoSizes = lazy2;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("RewardsViewModel.store", com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Initial.INSTANCE, rewardsDetailReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailSideEffectMiddleware) lazy.getValue(), (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailObservabilityMiddleware) lazy2.getValue()}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getOutputFormats = mviStateStore;
        processEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnViewCreated(rewardsDetailArgs.getRewardsSummary(), rewardsDetailArgs.getProductFeatureOffers(), rewardsDetailArgs.getRewardsContentUrls(), rewardsDetailArgs.getHasPastDueAmount(), rewardsDetailArgs.getCreditAccountId(), rewardsDetailArgs.getRewardsSummary() != null));
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsDetailArgs getNavArgs() {
        return this.navArgs;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getOutputFormats.onEvent(event);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailSideEffectMiddleware $r8$lambda$OfbloocmDVa7M9wQ3OgPDcouSIU(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel rewardsDetailViewModel) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailSideEffectMiddleware(rewardsDetailViewModel.getHighSpeedVideoFpsRangesFor, rewardsDetailViewModel.getHighSpeedVideoFpsRanges, rewardsDetailViewModel.navArgs.getCpi(), rewardsDetailViewModel.Camera2StreamConfigurationMap);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailObservabilityMiddleware $r8$lambda$TeDEJ4FzgWw06tBtVj9sXq9aFQw(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel rewardsDetailViewModel) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailObservabilityMiddleware(rewardsDetailViewModel.navArgs.getCpi());
    }
}
