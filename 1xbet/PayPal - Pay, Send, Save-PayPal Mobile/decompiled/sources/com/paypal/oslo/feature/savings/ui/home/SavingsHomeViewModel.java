package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001d¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\u001d¢\u0006\u0004\b!\u0010\u001fJ\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0016¢\u0006\u0004\b(\u0010\u001aJ\r\u0010)\u001a\u00020\u0016¢\u0006\u0004\b)\u0010\u001aJ9\u0010/\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020*2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u00101\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010?R&\u0010E\u001a\u0014\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020C0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010DR\u0016\u0010=\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010FR\u0016\u0010G\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010FR$\u0010H\u001a\u0004\u0018\u00010\"8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010$\"\u0004\bK\u0010LR$\u0010N\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bN\u0010F\u001a\u0004\bO\u0010\u001fR\u0016\u00108\u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bE\u0010FR \u0010Q\u001a\b\u0012\u0004\u0012\u00020B0P8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR \u0010V\u001a\b\u0012\u0004\u0012\u00020C0U8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/savings/manager/SavingsFeatureManager;", "savingsFeatureManager", "Lcom/paypal/oslo/feature/savings/domain/usecase/GetSavingsHubDataUseCase;", "getSavingsHubDataUseCase", "Lcom/paypal/oslo/feature/savings/domain/usecase/GetCachedGoalsUseCase;", "getCachedGoalsUseCase", "Lcom/paypal/oslo/feature/savings/domain/usecase/UpdateTaxStatementDeliveryPreferenceUseCase;", "updateTaxStatementDeliveryPreferenceUseCase", "Lcom/paypal/oslo/feature/savings/domain/usecase/GetGoalSuccessStatusUseCase;", "getGoalSuccessStatusUseCase", "Lcom/paypal/oslo/feature/savings/domain/usecase/ShouldAutoShowTaxPreferencePromptUseCase;", "shouldAutoShowTaxPreferencePromptUseCase", "Lcom/paypal/oslo/feature/savings/domain/usecase/MarkTaxPreferencePromptShownUseCase;", "markTaxPreferencePromptShownUseCase", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/savings/manager/SavingsFeatureManager;Lcom/paypal/oslo/feature/savings/domain/usecase/GetSavingsHubDataUseCase;Lcom/paypal/oslo/feature/savings/domain/usecase/GetCachedGoalsUseCase;Lcom/paypal/oslo/feature/savings/domain/usecase/UpdateTaxStatementDeliveryPreferenceUseCase;Lcom/paypal/oslo/feature/savings/domain/usecase/GetGoalSuccessStatusUseCase;Lcom/paypal/oslo/feature/savings/domain/usecase/ShouldAutoShowTaxPreferencePromptUseCase;Lcom/paypal/oslo/feature/savings/domain/usecase/MarkTaxPreferencePromptShownUseCase;Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeReducer;)V", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "intent", "", "processIntent", "(Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;)V", "initialize", "()V", "initializeIfNeeded", "onNavigatingToSmartRoute", "", "shouldRefreshAfterResume", "()Z", "isAddMoneyFeatureAvailable", "isBetaDisclosureEnabled", "", "getBetaOptOutUrl", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGeneralSavingsGoal", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "markTaxPreferencePromptAsShownIfNeeded", "clearGoalForSuccessSheet", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/SavingsInitialFlowType;", "initialFlowType", "preselectedMoneyBoxId", "settingId", "fiType", "handleInitialFlowIfNeeded", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/SavingsInitialFlowType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/savings/manager/SavingsFeatureManager;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/savings/domain/usecase/GetSavingsHubDataUseCase;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/savings/domain/usecase/GetCachedGoalsUseCase;", "getOutputSizes", "Lcom/paypal/oslo/feature/savings/domain/usecase/UpdateTaxStatementDeliveryPreferenceUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/savings/domain/usecase/GetGoalSuccessStatusUseCase;", "Camera2StreamConfigurationMap", "getInputFormats", "Lcom/paypal/oslo/feature/savings/domain/usecase/ShouldAutoShowTaxPreferencePromptUseCase;", "Lcom/paypal/oslo/feature/savings/domain/usecase/MarkTaxPreferencePromptShownUseCase;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getOutputFormats", "Z", "getInputSizeshNQ4ISI", "lastGoalSuccess", "Ljava/lang/String;", "getLastGoalSuccess", "setLastGoalSuccess", "(Ljava/lang/String;)V", "p0", "wasAutoShownTaxPreference", "getWasAutoShownTaxPreference", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsHomeViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.usecase.MarkTaxPreferencePromptShownUseCase getHighSpeedVideoSizesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.usecase.GetGoalSuccessStatusUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getInputFormats;
    private final com.paypal.oslo.feature.savings.domain.usecase.GetCachedGoalsUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.savings.ui.home.SavingsHomeState, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent, com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect> getOutputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.usecase.ShouldAutoShowTaxPreferencePromptUseCase getOutputMinFrameDuration;
    private boolean getInputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private boolean getOutputSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.manager.SavingsFeatureManager getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.usecase.UpdateTaxStatementDeliveryPreferenceUseCase getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String lastGoalSuccess;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.savings.ui.home.SavingsHomeState> uiState;
    private boolean wasAutoShownTaxPreference;

    @javax.inject.Inject
    public SavingsHomeViewModel(com.paypal.oslo.feature.savings.manager.SavingsFeatureManager savingsFeatureManager, com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase getSavingsHubDataUseCase, com.paypal.oslo.feature.savings.domain.usecase.GetCachedGoalsUseCase getCachedGoalsUseCase, com.paypal.oslo.feature.savings.domain.usecase.UpdateTaxStatementDeliveryPreferenceUseCase updateTaxStatementDeliveryPreferenceUseCase, com.paypal.oslo.feature.savings.domain.usecase.GetGoalSuccessStatusUseCase getGoalSuccessStatusUseCase, com.paypal.oslo.feature.savings.domain.usecase.ShouldAutoShowTaxPreferencePromptUseCase shouldAutoShowTaxPreferencePromptUseCase, com.paypal.oslo.feature.savings.domain.usecase.MarkTaxPreferencePromptShownUseCase markTaxPreferencePromptShownUseCase, com.paypal.oslo.feature.savings.ui.home.SavingsHomeReducer savingsHomeReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsFeatureManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getSavingsHubDataUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCachedGoalsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateTaxStatementDeliveryPreferenceUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getGoalSuccessStatusUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shouldAutoShowTaxPreferencePromptUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markTaxPreferencePromptShownUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsHomeReducer, "");
        this.getHighSpeedVideoFpsRanges = savingsFeatureManager;
        this.getHighSpeedVideoFpsRangesFor = getSavingsHubDataUseCase;
        this.getHighSpeedVideoSizes = getCachedGoalsUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = updateTaxStatementDeliveryPreferenceUseCase;
        this.Camera2StreamConfigurationMap = getGoalSuccessStatusUseCase;
        this.getOutputMinFrameDuration = shouldAutoShowTaxPreferencePromptUseCase;
        this.getHighSpeedVideoSizesFor = markTaxPreferencePromptShownUseCase;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.savings.ui.home.SavingsHomeState, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent, com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>(com.paypal.oslo.feature.savings.constants.SavingsConstants.ComponentNames.SAVINGS_HOME_VIEWMODEL_STORE, com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Initial.INSTANCE, savingsHomeReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1(this)), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getOutputFormats = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final java.lang.String getLastGoalSuccess() {
        return this.lastGoalSuccess;
    }

    public final void setLastGoalSuccess(java.lang.String str) {
        this.lastGoalSuccess = str;
    }

    public final boolean getWasAutoShownTaxPreference() {
        return this.wasAutoShownTaxPreference;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.savings.ui.home.SavingsHomeState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processIntent(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        this.getOutputFormats.onEvent(intent);
    }

    public final void initialize() {
        processIntent(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.Initialize.INSTANCE);
    }

    public final void initializeIfNeeded() {
        if (this.uiState.getValue() instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Initial) {
            initialize();
        }
    }

    public final void onNavigatingToSmartRoute() {
        this.getInputSizeshNQ4ISI = true;
    }

    public final boolean shouldRefreshAfterResume() {
        boolean z = this.getInputSizeshNQ4ISI;
        this.getInputSizeshNQ4ISI = false;
        return z;
    }

    public final boolean isAddMoneyFeatureAvailable() {
        return this.getHighSpeedVideoFpsRanges.isAddMoneyFeatureAvailable();
    }

    public final boolean isBetaDisclosureEnabled() {
        return this.getHighSpeedVideoFpsRanges.isBetaDisclosureEnabled();
    }

    public final java.lang.String getBetaOptOutUrl() {
        return this.getHighSpeedVideoFpsRanges.getBetaOptOutUrl();
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGeneralSavingsGoal() {
        java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> invoke = this.getHighSpeedVideoSizes.invoke();
        java.lang.Object obj = null;
        if (invoke == null) {
            return null;
        }
        java.util.Iterator<T> it = invoke.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) next).isGeneralSavingsTile()) {
                obj = next;
                break;
            }
        }
        return (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj;
    }

    public final void markTaxPreferencePromptAsShownIfNeeded() {
        if (this.getOutputSizes) {
            this.getOutputSizes = false;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$markTaxPreferencePromptAsShownIfNeeded$1(this, null), 3, null);
        }
    }

    public final void clearGoalForSuccessSheet() {
        processIntent(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.ClearGoalForSuccessSheet.INSTANCE);
    }

    public static /* synthetic */ boolean handleInitialFlowIfNeeded$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel savingsHomeViewModel, com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType savingsInitialFlowType, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        return savingsHomeViewModel.handleInitialFlowIfNeeded(savingsInitialFlowType, str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0119 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleInitialFlowIfNeeded(com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType initialFlowType, java.lang.String preselectedMoneyBoxId, java.lang.String settingId, java.lang.String fiType) {
        boolean z;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialFlowType, "");
        if (!this.getInputFormats && (this.uiState.getValue() instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success)) {
            this.getInputFormats = true;
            int i = com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel.WhenMappings.$EnumSwitchMapping$0[initialFlowType.ordinal()];
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = null;
            if (i == 1) {
                java.lang.String str = settingId;
                boolean z3 = str == null || str.length() == 0;
                java.lang.String str2 = preselectedMoneyBoxId;
                if (((str2 != null && str2.length() != 0) || !z3) && (this.uiState.getValue() instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success)) {
                    java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> invoke = this.getHighSpeedVideoSizes.invoke();
                    if (invoke != null) {
                        for (java.lang.Object obj : invoke) {
                            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(goalSummaryDTO2.getId(), preselectedMoneyBoxId)) {
                                com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettings = goalSummaryDTO2.getTransferSettings();
                                java.lang.String id = transferSettings != null ? transferSettings.getId() : null;
                                if (id != null && id.length() != 0) {
                                    z = true;
                                    if (!z3) {
                                        com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettings2 = goalSummaryDTO2.getTransferSettings();
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(transferSettings2 != null ? transferSettings2.getId() : null, settingId)) {
                                            z2 = true;
                                            if (z || z2) {
                                                goalSummaryDTO = obj;
                                                break;
                                            }
                                        }
                                    }
                                    z2 = false;
                                    if (z) {
                                    }
                                    goalSummaryDTO = obj;
                                    break;
                                }
                            }
                            z = false;
                            if (!z3) {
                            }
                            z2 = false;
                            if (z) {
                            }
                            goalSummaryDTO = obj;
                        }
                        goalSummaryDTO = goalSummaryDTO;
                    }
                    if (goalSummaryDTO != null) {
                        processIntent(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAutoSaveManage(goalSummaryDTO));
                    }
                }
            } else if (i == 2) {
                processIntent(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.CreateGoalClicked.INSTANCE);
            } else if (i != 3) {
                if (i == 4) {
                    java.lang.String str3 = fiType;
                    if (str3 != null && str3.length() != 0) {
                        processIntent(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAddMoneyWithFiType(fiType));
                    } else {
                        processIntent(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AddMoneyGeneralSavingsClicked.INSTANCE);
                    }
                }
            } else if (preselectedMoneyBoxId != null && (this.uiState.getValue() instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success)) {
                java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> invoke2 = this.getHighSpeedVideoSizes.invoke();
                if (invoke2 != null) {
                    java.util.Iterator<T> it = invoke2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) next).getId(), preselectedMoneyBoxId)) {
                            goalSummaryDTO = next;
                            break;
                        }
                    }
                    goalSummaryDTO = goalSummaryDTO;
                }
                if (goalSummaryDTO != null) {
                    processIntent(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GoalClicked(goalSummaryDTO));
                }
            }
        }
        return false;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType.AUTO_SAVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType.CREATE_GOAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType.GOAL_DETAILS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType.ADD_MONEY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
