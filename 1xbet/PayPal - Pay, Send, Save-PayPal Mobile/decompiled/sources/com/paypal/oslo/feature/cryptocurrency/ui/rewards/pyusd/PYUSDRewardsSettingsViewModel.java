package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020&0)8\u0007¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u00100R \u00102\u001a\b\u0012\u0004\u0012\u00020/018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/PYUSDRewardsSettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsStatusUseCase;", "getPYUSDRewardsStatusUseCase", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/UpdatePYUSDRewardsEnrollmentUseCase;", "updatePYUSDRewardsEnrollmentUseCase", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/mapper/PYUSDRewardsStatusUiMapper;", "pyusdRewardsStatusUiMapper", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetAssetHoldingUseCase;", "getAssetHoldingUseCase", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/mapper/PYUSDRewardsHoldingsUiMapper;", "pyusdRewardsHoldingsUiMapper", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/coordinator/CryptocurrencyProvisioningCoordinator;", "provisioningCoordinator", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsStatusUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/UpdatePYUSDRewardsEnrollmentUseCase;Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/mapper/PYUSDRewardsStatusUiMapper;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetAssetHoldingUseCase;Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/mapper/PYUSDRewardsHoldingsUiMapper;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/coordinator/CryptocurrencyProvisioningCoordinator;)V", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEvent;", "event", "", "handleEvent$cryptocurrency_prodRelease", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEvent;)V", "getHighSpeedVideoFpsRangesFor", "()V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsStatusUseCase;", "getOutputFormats", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/UpdatePYUSDRewardsEnrollmentUseCase;", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/mapper/PYUSDRewardsStatusUiMapper;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetAssetHoldingUseCase;", "getInputFormats", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/mapper/PYUSDRewardsHoldingsUiMapper;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/coordinator/CryptocurrencyProvisioningCoordinator;", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PYUSDRewardsSettingsViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect> getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsHoldingsUiMapper getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsStatusUiMapper getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState> uiState;

    @javax.inject.Inject
    public PYUSDRewardsSettingsViewModel(com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getPYUSDRewardsStatusUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase updatePYUSDRewardsEnrollmentUseCase, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsStatusUiMapper pYUSDRewardsStatusUiMapper, com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getAssetHoldingUseCase, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsHoldingsUiMapper pYUSDRewardsHoldingsUiMapper, com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator cryptocurrencyProvisioningCoordinator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPYUSDRewardsStatusUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePYUSDRewardsEnrollmentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pYUSDRewardsStatusUiMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAssetHoldingUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pYUSDRewardsHoldingsUiMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyProvisioningCoordinator, "");
        this.Camera2StreamConfigurationMap = getPYUSDRewardsStatusUseCase;
        this.getHighSpeedVideoFpsRanges = updatePYUSDRewardsEnrollmentUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = pYUSDRewardsStatusUiMapper;
        this.getHighSpeedVideoFpsRangesFor = getAssetHoldingUseCase;
        this.getHighSpeedVideoSizes = pYUSDRewardsHoldingsUiMapper;
        this.getHighSpeedVideoSizesFor = cryptocurrencyProvisioningCoordinator;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState(false, false, null, false, false, false, 63, null));
        this.getInputSizeshNQ4ISI = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getOutputFormats = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$loadInitialData$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect> getEffect() {
        return this.effect;
    }

    public final void handleEvent$cryptocurrency_prodRelease(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.RewardsToggleChange) {
            if (((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.RewardsToggleChange) event).getEnabled()) {
                getHighSpeedVideoFpsRangesFor();
                return;
            } else {
                this.getOutputFormats.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect.ShowUnEnrollBottomSheet.INSTANCE);
                return;
            }
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.UnEnrollConfirmClick.INSTANCE)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.UnEnrollCancelClick.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.UnEnrollCloseClick.INSTANCE)) {
                return;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.ProvisioningCompleted.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            getHighSpeedVideoFpsRangesFor();
            return;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$updateRewardsEnrollment$1(this, false, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect.ShowDisableToast.INSTANCE, null), 3, null);
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$checkProvisioningAndNavigateToFlow$1(this, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel.$r8$lambda$BAUj9ukMDRhHFus1Cn0HjAC8eg0(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel.this);
            }
        }, null), 3, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BAUj9ukMDRhHFus1Cn0HjAC8eg0(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(pYUSDRewardsSettingsViewModel), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$updateRewardsEnrollment$1(pYUSDRewardsSettingsViewModel, true, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect.ShowEnableToast.INSTANCE, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }
}
