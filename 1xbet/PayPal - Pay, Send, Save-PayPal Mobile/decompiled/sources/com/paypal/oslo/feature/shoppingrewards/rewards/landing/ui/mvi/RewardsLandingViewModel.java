package com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00178QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingViewModel;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/BaseViewModel;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingUiState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingUiEffect;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/usecase/GetRewardsLandingUseCase;", "getRewardsLandingUseCase", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/RewardsLandingUiDataMapper;", "uiDataMapper", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/usecase/GetRewardsLandingUseCase;Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/RewardsLandingUiDataMapper;)V", "", "onLoad", "()V", "onRetry", "onTrackerClick", "handleOnLoad$shopping_rewards_prodRelease", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/usecase/GetRewardsLandingUseCase;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/RewardsLandingUiDataMapper;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "getSideEffectMiddlewareDelegate$shopping_rewards_prodRelease", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "sideEffectMiddlewareDelegate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RewardsLandingViewModel extends com.paypal.oslo.feature.shoppingrewards.shared.ui.core.BaseViewModel<com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingUiState, com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent, com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingUiEffect> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public RewardsLandingViewModel(com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase getRewardsLandingUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper rewardsLandingUiDataMapper) {
        super("RewardsLandingViewModel", com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingUiState.Initial.INSTANCE, com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingReducer.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRewardsLandingUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsLandingUiDataMapper, "");
        this.Camera2StreamConfigurationMap = getRewardsLandingUseCase;
        this.getHighSpeedVideoFpsRanges = rewardsLandingUiDataMapper;
    }

    public final void onLoad() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnLoad.INSTANCE);
    }

    public final void onRetry() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnRetry.INSTANCE);
    }

    public final void onTrackerClick() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnTrackerClick.INSTANCE);
    }

    public final void handleOnLoad$shopping_rewards_prodRelease() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel$handleOnLoad$1(this, null), 3, null);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.BaseViewModel
    public final com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingUiState, com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent> getSideEffectMiddlewareDelegate$shopping_rewards_prodRelease() {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingSideEffectMiddlewareDelegate(this);
    }
}
