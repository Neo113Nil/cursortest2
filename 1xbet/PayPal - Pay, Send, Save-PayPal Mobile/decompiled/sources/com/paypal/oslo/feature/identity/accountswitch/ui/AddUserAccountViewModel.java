package com.paypal.oslo.feature.identity.accountswitch.ui;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e8\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\"\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/ui/AddUserAccountViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/GetAddUserAccountOptionsUseCase;", "addUserAccountOptionsUseCase", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/GenerateMerchantOnboardingUrlUseCase;", "generateMerchantOnboardingUrlUseCase", "<init>", "(Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/GetAddUserAccountOptionsUseCase;Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/GenerateMerchantOnboardingUrlUseCase;)V", "", "", "linkProfileOptions", "", "loadOptions", "(Ljava/util/List;)V", "Landroidx/navigation3/runtime/NavKey;", "defaultDestination", "resolvePostLoginDestination", "(Landroidx/navigation3/runtime/NavKey;)Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/MerchantOnboardingUrlResult;", "generateMerchantOnboardingUrl", "()Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/MerchantOnboardingUrlResult;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/GetAddUserAccountOptionsUseCase;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/GenerateMerchantOnboardingUrlUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/identity/accountswitch/ui/AddUserAccountUiState;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/identity/api/accountswitch/domain/model/LinkProfileOptionType;", "getHighResolutionOutputSizeshNQ4ISI", "linkProfileType", "getLinkProfileType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddUserAccountViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetAddUserAccountOptionsUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType> linkProfileType;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState> uiState;

    @javax.inject.Inject
    public AddUserAccountViewModel(com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetAddUserAccountOptionsUseCase getAddUserAccountOptionsUseCase, com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase generateMerchantOnboardingUrlUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAddUserAccountOptionsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generateMerchantOnboardingUrlUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = getAddUserAccountOptionsUseCase;
        this.Camera2StreamConfigurationMap = generateMerchantOnboardingUrlUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState.Loading.INSTANCE);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow2;
        this.linkProfileType = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType> getLinkProfileType() {
        return this.linkProfileType;
    }

    public final void loadOptions(java.util.List<java.lang.String> linkProfileOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkProfileOptions, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel$loadOptions$1(this, linkProfileOptions, null), 3, null);
    }

    public final androidx.navigation3.runtime.NavKey resolvePostLoginDestination(androidx.navigation3.runtime.NavKey defaultDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDestination, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue() == com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType.LINK_BUSINESS ? com.paypal.oslo.feature.businesshome.api.navigation.BusinessHomeDestination.INSTANCE : defaultDestination;
    }

    public final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.MerchantOnboardingUrlResult generateMerchantOnboardingUrl() {
        com.paypal.oslo.feature.identity.accountswitch.domain.usecase.MerchantOnboardingUrlResult invoke = this.Camera2StreamConfigurationMap.invoke();
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("hasCodeVerifier", java.lang.String.valueOf(invoke.getCodeVerifier().length() > 0));
        pairArr[1] = kotlin.TuplesKt.to("codeVerifierLength", java.lang.String.valueOf(invoke.getCodeVerifier().length()));
        com.paypal.android.logger.Logger.d$default(logger, "Generated merchant onboarding URL with code verifier", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        return invoke;
    }
}
