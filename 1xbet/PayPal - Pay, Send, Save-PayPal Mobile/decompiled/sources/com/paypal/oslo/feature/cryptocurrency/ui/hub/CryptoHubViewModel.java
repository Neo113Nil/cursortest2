package com.paypal.oslo.feature.cryptocurrency.ui.hub;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 D2\u00020\u0001:\u0002EDBI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010 \u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010%\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010.\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00100R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00103R\u001d\u00105\u001a\b\u0012\u0004\u0012\u000202048\u0007¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010;R \u0010>\u001a\b\u0012\u0004\u0012\u00020:0=8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0018\u0010#\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010C"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/CryptoHubViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/usecase/CryptoHubUseCases;", "useCases", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/CryptoHubUiMappers;", "uiMappers", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/CryptoHubPollDataFacade;", "cryptoHubPollDataFacade", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/facade/PYUSDRewardsCardFacade;", "pyusdRewardsCardFacade", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "currencyProvider", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/coordinator/CryptocurrencyProvisioningCoordinator;", "provisioningCoordinator", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/usecase/CryptoHubUseCases;Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/CryptoHubUiMappers;Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/CryptoHubPollDataFacade;Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/facade/PYUSDRewardsCardFacade;Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/coordinator/CryptocurrencyProvisioningCoordinator;Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;)V", "", "startPolling", "()V", "stopPolling", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent;", "event", "handleEvent$cryptocurrency_prodRelease", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent;)V", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/CryptoHubViewModel$PendingAction;", "p0", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/CryptoHubViewModel$PendingAction;)V", "getInputFormats", "Landroidx/lifecycle/SavedStateHandle;", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDurationlomOqCM", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/usecase/CryptoHubUseCases;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/CryptoHubUiMappers;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/CryptoHubPollDataFacade;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/facade/PYUSDRewardsCardFacade;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/coordinator/CryptocurrencyProvisioningCoordinator;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect;", "Lkotlinx/coroutines/channels/Channel;", "getOutputFormats", "Lkotlinx/coroutines/flow/Flow;", "effect", "Lkotlinx/coroutines/flow/Flow;", "getEffect", "()Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "Companion", "PendingAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoHubViewModel extends androidx.view.ViewModel {
    private final com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState> getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect> getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider getInputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.view.SavedStateHandle getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator getOutputMinFrameDuration;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getOutputMinFrameDurationlomOqCM;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHubUiMappers getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState> uiState;
    private static final com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.Companion Companion = new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    @javax.inject.Inject
    public CryptoHubViewModel(androidx.view.SavedStateHandle savedStateHandle, com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases cryptoHubUseCases, com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHubUiMappers cryptoHubUiMappers, com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade cryptoHubPollDataFacade, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade pYUSDRewardsCardFacade, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider, com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator cryptocurrencyProvisioningCoordinator, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoHubUseCases, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoHubUiMappers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoHubPollDataFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pYUSDRewardsCardFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyProvisioningCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighSpeedVideoFpsRanges = savedStateHandle;
        this.getHighSpeedVideoFpsRangesFor = cryptoHubUseCases;
        this.getHighResolutionOutputSizeshNQ4ISI = cryptoHubUiMappers;
        this.Camera2StreamConfigurationMap = cryptoHubPollDataFacade;
        this.getHighSpeedVideoSizes = pYUSDRewardsCardFacade;
        this.getInputFormats = currencyProvider;
        this.getOutputMinFrameDuration = cryptocurrencyProvisioningCoordinator;
        this.getInputSizeshNQ4ISI = featureGateManager;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState(true, null, 2, 0 == true ? 1 : 0));
        this.getHighSpeedVideoSizesFor = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.getOutputFormats = Channel$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$loadInitialData$1(this, null), 3, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/CryptoHubViewModel$PendingAction;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class PendingAction {
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction getHighResolutionOutputSizeshNQ4ISI;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction getHighSpeedVideoFpsRanges;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction getHighSpeedVideoFpsRangesFor;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction getHighSpeedVideoSizes;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizesFor;
        private static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction[] getInputSizeshNQ4ISI;

        static {
            com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction pendingAction = new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction("BUY", 0);
            getHighSpeedVideoFpsRangesFor = pendingAction;
            com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction pendingAction2 = new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction("SELL", 1);
            Camera2StreamConfigurationMap = pendingAction2;
            com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction pendingAction3 = new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction("RECEIVE", 2);
            getHighResolutionOutputSizeshNQ4ISI = pendingAction3;
            com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction pendingAction4 = new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction(com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend, 3);
            getHighSpeedVideoSizes = pendingAction4;
            com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction pendingAction5 = new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction("PYUSD_REWARDS_ENROLL", 4);
            getHighSpeedVideoFpsRanges = pendingAction5;
            com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction[] pendingActionArr = {pendingAction, pendingAction2, pendingAction3, pendingAction4, pendingAction5};
            getInputSizeshNQ4ISI = pendingActionArr;
            getHighSpeedVideoSizesFor = kotlin.enums.EnumEntriesKt.enumEntries(pendingActionArr);
        }

        private PendingAction(java.lang.String str, int i) {
        }

        public static com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction[] values() {
            return (com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction[]) getInputSizeshNQ4ISI.clone();
        }

        public static com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction> getHighSpeedVideoFpsRanges() {
            return getHighSpeedVideoSizesFor;
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect> getEffect() {
        return this.effect;
    }

    public final void startPolling() {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = this.getOutputMinFrameDurationlomOqCM;
        if (job == null || !job.isActive()) {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$startPolling$1(this, null), 3, null);
            this.getOutputMinFrameDurationlomOqCM = launch$default;
        }
    }

    public final void stopPolling() {
        kotlinx.coroutines.Job job = this.getOutputMinFrameDurationlomOqCM;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.getOutputMinFrameDurationlomOqCM = null;
    }

    public final void handleEvent$cryptocurrency_prodRelease(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent event) {
        com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction pendingAction;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.BuyButtonClick.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$checkProvisioningAndNavigateToFlow$1(this, com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.BUY_CRYPTO, com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction.getHighSpeedVideoFpsRangesFor, null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.SellButtonClick.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$checkProvisioningAndNavigateToFlow$1(this, com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.SELL_CRYPTO, com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction.Camera2StreamConfigurationMap, null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.ReceiveButtonClick.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$checkProvisioningAndNavigateToFlow$1(this, com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.RECEIVE_CRYPTO, com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction.getHighResolutionOutputSizeshNQ4ISI, null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.SendButtonClick.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$checkProvisioningAndNavigateToFlow$1(this, com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.SEND_CRYPTO, com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction.getHighSpeedVideoSizes, null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.PYUSDRewardsLearnMoreButtonClick.INSTANCE)) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getOutputFormats.mo9266trySendJP2dKIU(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.ShowPYUSDRewardsLearnMoreBottomSheet.INSTANCE));
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.PYUSDRewardsOptInButtonClick.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$checkProvisioningAndNavigateToFlow$1(this, com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.BUY_SELL_CRYPTO, com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction.getHighSpeedVideoFpsRanges, null), 3, null);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CryptoMarketPriceClick) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getOutputFormats.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToDetailsScreen(((com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CryptoMarketPriceClick) event).getAssetSymbol())));
            return;
        }
        if (event instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CryptoSettingsOptionClick) {
            if (((com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CryptoSettingsOptionClick) event).getSettingsOption() == com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions.PYUSD_REWARDS) {
                this.getOutputFormats.mo9266trySendJP2dKIU(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToPYUSDRewardsSettingsScreen.INSTANCE);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.BuyMorePYUSDClick.INSTANCE)) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getOutputFormats.mo9266trySendJP2dKIU(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToBuyMorePYUSD.INSTANCE));
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CelsiusRedeemClaimCodeButtonClick.INSTANCE)) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getOutputFormats.mo9266trySendJP2dKIU(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToCelsiusClaimCodeScreen.INSTANCE));
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.RefreshRequested.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$loadInitialData$1(this, null), 3, null);
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.ProvisioningCompleted.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String str = (java.lang.String) this.getHighSpeedVideoFpsRanges.get("pending_action");
        if (str != null) {
            java.util.Iterator<E> it = com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction.getHighSpeedVideoFpsRanges().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction) obj).name(), str)) {
                        break;
                    }
                }
            }
            pendingAction = (com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction) obj;
        } else {
            pendingAction = null;
        }
        if (pendingAction != null) {
            getHighSpeedVideoFpsRangesFor(pendingAction);
        }
        this.getHighSpeedVideoFpsRanges.set("pending_action", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction p0) {
        int i = com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        if (i == 1) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getOutputFormats.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToAssetSelectionScreen(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType.BUY)));
            return;
        }
        if (i == 2) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getOutputFormats.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToAssetSelectionScreen(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType.SELL)));
            return;
        }
        if (i == 3) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getOutputFormats.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToAssetSelectionScreen(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType.RECEIVE)));
            return;
        }
        if (i == 4) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getOutputFormats.mo9266trySendJP2dKIU(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToSendFlow.INSTANCE));
        } else {
            if (i == 5) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$enrollForPYUSDRewards$1(this, null), 3, null);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                return;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/CryptoHubViewModel$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void access$reduce(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel cryptoHubViewModel, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings cryptoHoldings, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices cryptoMarketPrices, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pYUSDRewardsCardUiState) {
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoMarketPriceUi copy;
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingUi copy2;
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState loadedCryptoHubUiState = null;
        java.lang.Object[] objArr = 0;
        if (cryptoHoldings == null || cryptoMarketPrices == null) {
            cryptoHubViewModel.getHighSpeedVideoSizesFor.setValue(new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState(true, loadedCryptoHubUiState, 2, objArr == true ? 1 : 0));
            cryptoHubViewModel.getOutputFormats.mo9266trySendJP2dKIU(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToErrorScreen.INSTANCE);
            return;
        }
        java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrice> invoke = cryptoHubViewModel.getHighSpeedVideoFpsRangesFor.getFilterMarketPrices().invoke(cryptoMarketPrices.getMarketPrices(), cryptoHoldings);
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.HoldingsCardActionsUiState map = cryptoHubViewModel.getHighResolutionOutputSizeshNQ4ISI.getHoldingsCardActionsUiMapper().map(cryptoHubViewModel.getHighSpeedVideoFpsRangesFor.getGetCryptoCapabilities().invoke(cryptoMarketPrices.getCapabilities()), cryptoHoldings.getTotalHoldingValue());
        java.lang.String currencyCode = cryptoHoldings.getCurrencyCode();
        if (currencyCode.length() <= 0) {
            currencyCode = null;
        }
        if (currencyCode == null) {
            currencyCode = cryptoHubViewModel.getInputFormats.getCurrencyCode();
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState> mutableStateFlow = cryptoHubViewModel.getHighSpeedVideoSizesFor;
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState value = mutableStateFlow.getValue();
        java.lang.String totalHoldingValue = cryptoHoldings.getTotalHoldingValue();
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn totalReturn = cryptoHoldings.getTotalReturn();
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingsCardUiState cryptoHoldingsCardUiState = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingsCardUiState(totalHoldingValue, currencyCode, totalReturn != null ? cryptoHubViewModel.getHighResolutionOutputSizeshNQ4ISI.getCryptoHoldingsTotalReturnUiMapper().map(totalReturn) : null, map);
        java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding> holdings = cryptoHoldings.getHoldings();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(holdings, 10));
        for (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding cryptoHolding : holdings) {
            copy2 = r13.copy((r22 & 1) != 0 ? r13.assetName : null, (r22 & 2) != 0 ? r13.assetSymbol : null, (r22 & 4) != 0 ? r13.quantity : null, (r22 & 8) != 0 ? r13.formattedFiatPrice : null, (r22 & 16) != 0 ? r13.formattedTotalValue : null, (r22 & 32) != 0 ? r13.logoUrl : null, (r22 & 64) != 0 ? r13.formattedPriceMovementPercent : null, (r22 & 128) != 0 ? r13.priceMovementIndicator : null, (r22 & 256) != 0 ? r13.showPriceMovement : false, (r22 & 512) != 0 ? cryptoHubViewModel.getHighResolutionOutputSizeshNQ4ISI.getCryptoHoldingUiMapper().map(cryptoHolding).badge : cryptoHubViewModel.getHighSpeedVideoSizes.getBadgeInfoForCryptoAsset(cryptoHolding.getAssetSymbol(), pYUSDRewardsCardUiState != null ? pYUSDRewardsCardUiState.getStatus() : null));
            arrayList.add(copy2);
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrice> list = invoke;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrice cryptoMarketPrice : list) {
            copy = r12.copy((r18 & 1) != 0 ? r12.assetName : null, (r18 & 2) != 0 ? r12.assetSymbol : null, (r18 & 4) != 0 ? r12.logoUrl : null, (r18 & 8) != 0 ? r12.formattedFiatPrice : null, (r18 & 16) != 0 ? r12.formattedPriceMovementPercent : null, (r18 & 32) != 0 ? r12.priceMovementIndicator : null, (r18 & 64) != 0 ? r12.showPriceMovement : false, (r18 & 128) != 0 ? cryptoHubViewModel.getHighResolutionOutputSizeshNQ4ISI.getCryptoMarketPriceUiMapper().map(cryptoMarketPrice).badge : cryptoHubViewModel.getHighSpeedVideoSizes.getBadgeInfoForCryptoAsset(cryptoMarketPrice.getAssetSymbol(), pYUSDRewardsCardUiState != null ? pYUSDRewardsCardUiState.getStatus() : null));
            arrayList3.add(copy);
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        if (cryptoHubViewModel.getHighSpeedVideoSizes.isFeatureEnabled()) {
            createListBuilder.add(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions.PYUSD_REWARDS);
        }
        mutableStateFlow.setValue(value.copy(false, new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState(cryptoHoldingsCardUiState, pYUSDRewardsCardUiState, arrayList4, arrayList2, kotlin.collections.CollectionsKt.build(createListBuilder), cryptoHubViewModel.getInputSizeshNQ4ISI.isCelsiusEnabled())));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction.getHighSpeedVideoFpsRangesFor.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction.Camera2StreamConfigurationMap.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction.getHighResolutionOutputSizeshNQ4ISI.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction.getHighSpeedVideoSizes.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction.getHighSpeedVideoFpsRanges.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
