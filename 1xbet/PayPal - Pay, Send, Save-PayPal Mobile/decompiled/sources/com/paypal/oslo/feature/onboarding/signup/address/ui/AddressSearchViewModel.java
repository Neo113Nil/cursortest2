package com.paypal.oslo.feature.onboarding.signup.address.ui;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u000eJ\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0#8\u0007¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010-R \u0010/\u001a\b\u0012\u0004\u0012\u00020,0.8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0016\u00103\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/address/ui/AddressSearchViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/onboarding/signup/address/domain/usecase/AddressAutocompleteUseCase;", "addressAutocompleteUseCase", "Lcom/paypal/oslo/feature/onboarding/signup/address/domain/usecase/AddressDetailsUseCase;", "addressDetailsUseCase", "Lcom/paypal/oslo/feature/onboarding/errorstruct/ui/ErrorMessageMapper;", "errorMessageMapper", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/address/domain/usecase/AddressAutocompleteUseCase;Lcom/paypal/oslo/feature/onboarding/signup/address/domain/usecase/AddressDetailsUseCase;Lcom/paypal/oslo/feature/onboarding/errorstruct/ui/ErrorMessageMapper;)V", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "code", "", "setCountryCode-tgPz1l0", "(Ljava/lang/String;)V", "setCountryCode", "", "query", "onAddressSearchQueryChanged", "Lcom/paypal/oslo/feature/onboarding/signup/address/domain/model/AddressSuggestion;", "selectedAddress", "onAddressSelected", "(Lcom/paypal/oslo/feature/onboarding/signup/address/domain/model/AddressSuggestion;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/onboarding/signup/address/domain/usecase/AddressAutocompleteUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/onboarding/signup/address/domain/usecase/AddressDetailsUseCase;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/onboarding/errorstruct/ui/ErrorMessageMapper;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/onboarding/signup/address/ui/model/AddressSearchUiState;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/StateFlow;", "addressSearchUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getAddressSearchUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/Job;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "selectedAddressFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getSelectedAddressFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "getOutputFormats", "Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressSearchViewModel extends androidx.view.ViewModel {
    public static final long ADDRESS_SEARCH_DELAY_MS = 300;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState> addressSearchUiState;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressDetailsUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressAutocompleteUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.core.i18n.domain.model.Address> getInputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.errorstruct.ui.ErrorMessageMapper getHighSpeedVideoSizes;
    private java.lang.String getOutputFormats;
    private kotlinx.coroutines.Job getOutputMinFrameDuration;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.core.i18n.domain.model.Address> selectedAddressFlow;
    public static final int $stable = 8;

    @javax.inject.Inject
    public AddressSearchViewModel(com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressAutocompleteUseCase addressAutocompleteUseCase, com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressDetailsUseCase addressDetailsUseCase, com.paypal.oslo.feature.onboarding.errorstruct.ui.ErrorMessageMapper errorMessageMapper) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressAutocompleteUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressDetailsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessageMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = addressAutocompleteUseCase;
        this.getHighSpeedVideoFpsRangesFor = addressDetailsUseCase;
        this.getHighSpeedVideoSizes = errorMessageMapper;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState(null, false, null, null, 15, null));
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.addressSearchUiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        this.getHighSpeedVideoFpsRanges = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow("");
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.core.i18n.domain.model.Address> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getInputSizeshNQ4ISI = MutableSharedFlow$default;
        this.selectedAddressFlow = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.getOutputFormats = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl("US");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$setupAddressSuggestionsCollector$1(this, null), 3, null);
        this.getOutputMinFrameDuration = launch$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$searchAddress(com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel addressSearchViewModel, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$searchAddress$1 addressSearchViewModel$searchAddress$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$searchAddress$1) {
            addressSearchViewModel$searchAddress$1 = (com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$searchAddress$1) continuation;
            if ((addressSearchViewModel$searchAddress$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                addressSearchViewModel$searchAddress$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = addressSearchViewModel$searchAddress$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = addressSearchViewModel$searchAddress$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.onboarding.signup.address.domain.usecase.AddressAutocompleteUseCase addressAutocompleteUseCase = addressSearchViewModel.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.String str2 = addressSearchViewModel.getOutputFormats;
                    addressSearchViewModel$searchAddress$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    addressSearchViewModel$searchAddress$1.Camera2StreamConfigurationMap = 1;
                    obj = addressAutocompleteUseCase.m16212invokeJmYZZyY(str, str2, addressSearchViewModel$searchAddress$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    java.util.List list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState> mutableStateFlow = addressSearchViewModel.Camera2StreamConfigurationMap;
                    mutableStateFlow.setValue(com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState.copy$default(mutableStateFlow.getValue(), null, false, list, null, 1, null));
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError apiCallError = (com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError) ((arrow.core.Either.Left) either).getValue();
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState> mutableStateFlow2 = addressSearchViewModel.Camera2StreamConfigurationMap;
                    mutableStateFlow2.setValue(com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState.copy$default(mutableStateFlow2.getValue(), null, false, kotlin.collections.CollectionsKt.emptyList(), addressSearchViewModel.getHighSpeedVideoSizes.mapToUserMessage(apiCallError), 1, null));
                    com.paypal.oslo.feature.onboarding.signup.address.analytics.AddressSearchAnalytics.INSTANCE.trackError$onboarding_prodRelease(com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallErrorKt.toErrorDetails(apiCallError));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        addressSearchViewModel$searchAddress$1 = new com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$searchAddress$1(addressSearchViewModel, continuation);
        java.lang.Object obj2 = addressSearchViewModel$searchAddress$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = addressSearchViewModel$searchAddress$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState> getAddressSearchUiState() {
        return this.addressSearchUiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.core.i18n.domain.model.Address> getSelectedAddressFlow() {
        return this.selectedAddressFlow;
    }

    /* renamed from: setCountryCode-tgPz1l0, reason: not valid java name */
    public final void m16224setCountryCodetgPz1l0(java.lang.String code) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
        this.getOutputFormats = code;
    }

    public final void onAddressSearchQueryChanged(java.lang.String query) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState> mutableStateFlow = this.Camera2StreamConfigurationMap;
        mutableStateFlow.setValue(com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState.copy$default(mutableStateFlow.getValue(), query, false, null, null, 14, null));
        this.getHighSpeedVideoFpsRanges.setValue(query);
    }

    public final void onAddressSelected(com.paypal.oslo.feature.onboarding.signup.address.domain.model.AddressSuggestion selectedAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedAddress, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$onAddressSelected$1(this, selectedAddress, null), 3, null);
    }
}
