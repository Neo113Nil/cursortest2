package com.paypal.oslo.feature.businesshome.ui.accountsetup;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0!8\u0007¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010(R \u0010*\u001a\b\u0012\u0004\u0012\u00020'0)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/accountsetup/AccountSetupViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/businesshome/domain/usecase/GetAccountSetupStatusUseCase;", "getAccountSetupStatusUseCase", "Lcom/paypal/oslo/feature/businesshome/domain/usecase/IsMandatoryAccountSetupCompleteUseCase;", "isMandatoryAccountSetupCompleteUseCase", "Lcom/paypal/oslo/feature/businesshome/domain/usecase/CompleteDemoAccountSetupStepUseCase;", "completeDemoAccountSetupStepUseCase", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/feature/businesshome/domain/usecase/GetAccountSetupStatusUseCase;Lcom/paypal/oslo/feature/businesshome/domain/usecase/IsMandatoryAccountSetupCompleteUseCase;Lcom/paypal/oslo/feature/businesshome/domain/usecase/CompleteDemoAccountSetupStepUseCase;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "loadData$business_home_prodRelease", "()V", "Lcom/paypal/oslo/feature/businesshome/ui/home/AccountSetupUiData$StepType;", "stepType", "onStepClick$business_home_prodRelease", "(Lcom/paypal/oslo/feature/businesshome/ui/home/AccountSetupUiData$StepType;)V", "onContinueTapped$business_home_prodRelease", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/businesshome/domain/usecase/GetAccountSetupStatusUseCase;", "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/businesshome/domain/usecase/IsMandatoryAccountSetupCompleteUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/businesshome/domain/usecase/CompleteDemoAccountSetupStepUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/businesshome/ui/accountsetup/AccountSetupUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/businesshome/ui/accountsetup/AccountSetupEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "effects", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffects", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AccountSetupViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesshome.domain.usecase.GetAccountSetupStatusUseCase getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupEffect> effects;
    private final com.paypal.oslo.feature.businesshome.domain.usecase.CompleteDemoAccountSetupStepUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupEffect> getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesshome.domain.usecase.IsMandatoryAccountSetupCompleteUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState> uiState;

    @javax.inject.Inject
    public AccountSetupViewModel(com.paypal.oslo.feature.businesshome.domain.usecase.GetAccountSetupStatusUseCase getAccountSetupStatusUseCase, com.paypal.oslo.feature.businesshome.domain.usecase.IsMandatoryAccountSetupCompleteUseCase isMandatoryAccountSetupCompleteUseCase, com.paypal.oslo.feature.businesshome.domain.usecase.CompleteDemoAccountSetupStepUseCase completeDemoAccountSetupStepUseCase, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAccountSetupStatusUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isMandatoryAccountSetupCompleteUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completeDemoAccountSetupStepUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoSizes = getAccountSetupStatusUseCase;
        this.Camera2StreamConfigurationMap = isMandatoryAccountSetupCompleteUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = completeDemoAccountSetupStepUseCase;
        this.getHighSpeedVideoFpsRangesFor = featureGate;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Loading.INSTANCE);
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getOutputMinFrameDuration = MutableSharedFlow$default;
        this.effects = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupEffect> getEffects() {
        return this.effects;
    }

    public final void loadData$business_home_prodRelease() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel$loadData$1(this, null), 3, null);
    }

    public final void onStepClick$business_home_prodRelease(com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType stepType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepType, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel$onStepClick$1(this, stepType, null), 3, null);
    }

    public final void onContinueTapped$business_home_prodRelease() {
        com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState value = this.getHighSpeedVideoFpsRanges.getValue();
        java.lang.Object obj = null;
        com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Success success = value instanceof com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Success ? (com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Success) value : null;
        if (success != null) {
            java.util.Iterator<T> it = success.getPayAndGetPaidSteps().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (!((com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step) next).isCompleted()) {
                    obj = next;
                    break;
                }
            }
            com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step step = (com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step) obj;
            if (step == null) {
                return;
            }
            onStepClick$business_home_prodRelease(step.getType());
        }
    }

    public static final /* synthetic */ void access$updateUiState(com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel accountSetupViewModel, com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus accountSetupStatus) {
        java.util.Set set;
        java.util.Set set2;
        com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData uiData = com.paypal.oslo.feature.businesshome.ui.mapper.AccountSetupUiMapperKt.toUiData(accountSetupStatus);
        java.util.List<com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step> accountSetupSteps = uiData.getAccountSetupSteps();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : accountSetupSteps) {
            set2 = com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModelKt.getHighSpeedVideoFpsRanges;
            if (kotlin.collections.CollectionsKt.contains(set2, ((com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step) obj).getType())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        set = com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModelKt.getHighSpeedVideoFpsRanges;
        java.util.Set<com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.AccountSetup> set3 = set;
        boolean z = true;
        if (!(set3 instanceof java.util.Collection) || !set3.isEmpty()) {
            loop1: for (com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.AccountSetup accountSetup : set3) {
                java.util.ArrayList<com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step> arrayList3 = arrayList2;
                if (!arrayList3.isEmpty()) {
                    for (com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step step : arrayList3) {
                        if (step.getType() != accountSetup || !step.isCompleted()) {
                        }
                    }
                }
                z = false;
            }
        }
        accountSetupViewModel.getHighSpeedVideoFpsRanges.setValue(new com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupUiState.Success(uiData, z, arrayList2));
    }
}
