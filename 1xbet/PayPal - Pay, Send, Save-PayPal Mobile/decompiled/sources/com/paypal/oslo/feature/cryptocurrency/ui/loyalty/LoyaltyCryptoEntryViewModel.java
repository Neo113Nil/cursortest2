package com.paypal.oslo.feature.cryptocurrency.ui.loyalty;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/loyalty/LoyaltyCryptoEntryViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/coordinator/CryptocurrencyProvisioningCoordinator;", "provisioningCoordinator", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/coordinator/CryptocurrencyProvisioningCoordinator;)V", "", "navigateBack", "()V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/coordinator/CryptocurrencyProvisioningCoordinator;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/loyalty/model/LoyaltyCryptoEntryUiState;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/loyalty/model/LoyaltyCryptoEntryEffect;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/Flow;", "effect", "Lkotlinx/coroutines/flow/Flow;", "getEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoyaltyCryptoEntryViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryEffect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryEffect> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState> uiState;

    @javax.inject.Inject
    public LoyaltyCryptoEntryViewModel(com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator cryptocurrencyProvisioningCoordinator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyProvisioningCoordinator, "");
        this.getHighSpeedVideoFpsRanges = cryptocurrencyProvisioningCoordinator;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState.LOADING);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryEffect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.Camera2StreamConfigurationMap = Channel$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel$checkProvisioningAndProceed$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryEffect> getEffect() {
        return this.effect;
    }

    public final void navigateBack() {
        this.Camera2StreamConfigurationMap.mo9266trySendJP2dKIU(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryEffect.NavigateBack.INSTANCE);
    }
}
