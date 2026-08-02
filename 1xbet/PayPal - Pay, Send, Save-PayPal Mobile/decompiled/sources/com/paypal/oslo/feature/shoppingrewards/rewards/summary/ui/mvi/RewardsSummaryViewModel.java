package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0018J\r\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u0018J\r\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010\u0018J\r\u0010 \u001a\u00020\u0010¢\u0006\u0004\b \u0010\u0018J!\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\"\u0010\u0012R\u0014\u0010%\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010+8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\"\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010+8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryViewModel;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/BaseViewModel;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiEffect;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/GetRewardsSummaryUseCase;", "getRewardsSummaryUseCase", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;", "stringResourceProvider", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/models/UiDataMappers;", "uiDataMappers", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/GetRewardsSummaryUseCase;Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/models/UiDataMappers;)V", "Landroidx/navigation3/runtime/NavKey;", "initialDestination", "deferredDestination", "", "onLoad", "(Landroidx/navigation3/runtime/NavKey;Landroidx/navigation3/runtime/NavKey;)V", "", "tabIndex", "onChangeTab", "(I)V", "onRetry", "()V", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick;", "event", "onClick", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick;)V", "onOfferActivated", "onCategorySelectionChanged", "onRedemptionCompleted", "onToastDisappear", "tabDestination", "handleOnLoad$shopping_rewards_prodRelease", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/GetRewardsSummaryUseCase;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/models/UiDataMappers;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "getAnalyticsMiddlewareDelegate$shopping_rewards_prodRelease", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "analyticsMiddlewareDelegate", "getSideEffectMiddlewareDelegate$shopping_rewards_prodRelease", "sideEffectMiddlewareDelegate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RewardsSummaryViewModel extends com.paypal.oslo.feature.shoppingrewards.shared.ui.core.BaseViewModel<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public RewardsSummaryViewModel(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase getRewardsSummaryUseCase, com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider stringResourceProvider, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers uiDataMappers) {
        super("RewardsSummaryViewModel", com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Initial.INSTANCE, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryReducer.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRewardsSummaryUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringResourceProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiDataMappers, "");
        this.getHighSpeedVideoSizes = getRewardsSummaryUseCase;
        this.getHighSpeedVideoFpsRangesFor = stringResourceProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = uiDataMappers;
    }

    public final void onLoad(androidx.navigation3.runtime.NavKey initialDestination, androidx.navigation3.runtime.NavKey deferredDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialDestination, "");
        processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoad(initialDestination, deferredDestination));
    }

    public final void onChangeTab(int tabIndex) {
        processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnChangeTab(tabIndex));
    }

    public final void onRetry() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnRetry.INSTANCE);
    }

    public final void onClick(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        processEvent(event);
    }

    public final void onOfferActivated() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnOfferActivated.INSTANCE);
    }

    public final void onCategorySelectionChanged() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnCategorySelectionChanged.INSTANCE);
    }

    public final void onRedemptionCompleted() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnRedemptionCompleted.INSTANCE);
    }

    public final void onToastDisappear() {
        processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnToastDisappeared.INSTANCE);
    }

    public final void handleOnLoad$shopping_rewards_prodRelease(androidx.navigation3.runtime.NavKey tabDestination, androidx.navigation3.runtime.NavKey deferredDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tabDestination, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel$handleOnLoad$1(this, tabDestination, deferredDestination, null), 3, null);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.BaseViewModel
    public final com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent> getAnalyticsMiddlewareDelegate$shopping_rewards_prodRelease() {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryAnalyticsMiddlewareDelegate();
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.BaseViewModel
    public final com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent> getSideEffectMiddlewareDelegate$shopping_rewards_prodRelease() {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummarySideEffectMiddlewareDelegate(this);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadError access$createLoadErrorEvent(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel rewardsSummaryViewModel, androidx.navigation3.runtime.NavKey navKey, androidx.navigation3.runtime.NavKey navKey2, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadError(rewardsSummaryViewModel.getHighResolutionOutputSizeshNQ4ISI.getTabIndex(navKey), navKey2, errorStateType);
    }
}
