package com.paypal.oslo.feature.bnplacquisition.ui.address.add;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R&\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e8\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddReducer;", "reducer", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetAddressLayoutUseCase;", "getAddressLayoutUseCase", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldValidators;", "formFieldValidators", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiMapper;", "uiMapper", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddReducer;Lcom/paypal/oslo/core/i18n/domain/usecase/GetAddressLayoutUseCase;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldValidators;Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiMapper;)V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddReducer;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetAddressLayoutUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldValidators;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiMapper;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressAddViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddReducer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiMapper getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState> uiState;

    @javax.inject.Inject
    public AddressAddViewModel(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddReducer addressAddReducer, com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators formFieldValidators, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiMapper addressAddUiMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressAddReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAddressLayoutUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formFieldValidators, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressAddUiMapper, "");
        this.getHighSpeedVideoFpsRangesFor = addressAddReducer;
        this.Camera2StreamConfigurationMap = getAddressLayoutUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = formFieldValidators;
        this.getHighSpeedVideoSizes = addressAddUiMapper;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("AddressAddViewModel.store", com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState.Loading.INSTANCE, addressAddReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel$eventsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FetchAddressLayout) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r3), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel$fetchAddressLayoutAndLoad$1(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel.this, ((com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FetchAddressLayout) event).getPrefilledAddress(), null), 3, null);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Pressed.INSTANCE)) {
                    com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel.access$validateAllFieldsAndProceed(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel.this, input.getStates().getSecond());
                } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.ValidateField) {
                    com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel.access$validateSingleField(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel.this, input.getStates().getSecond(), ((com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.ValidateField) event).getFieldId());
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRanges = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$validateWithAddressHandler(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel addressAddViewModel, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel addressAddUiModel, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel$validateWithAddressHandler$1 addressAddViewModel$validateWithAddressHandler$1;
        int i;
        arrow.core.Either either;
        java.util.List list;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel$validateWithAddressHandler$1) {
            addressAddViewModel$validateWithAddressHandler$1 = (com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel$validateWithAddressHandler$1) continuation;
            if ((addressAddViewModel$validateWithAddressHandler$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                addressAddViewModel$validateWithAddressHandler$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = addressAddViewModel$validateWithAddressHandler$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = addressAddViewModel$validateWithAddressHandler$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> addressFieldRows = addressAddUiModel.getAddressFieldRows();
                    com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators formFieldValidators = addressAddViewModel.getHighResolutionOutputSizeshNQ4ISI;
                    addressAddViewModel$validateWithAddressHandler$1.getHighSpeedVideoSizes = addressAddUiModel;
                    addressAddViewModel$validateWithAddressHandler$1.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.validateAllAddressFields(addressFieldRows, formFieldValidators, addressAddViewModel$validateWithAddressHandler$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    addressAddUiModel = (com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel) addressAddViewModel$validateWithAddressHandler$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel addressAddUiModel2 = addressAddUiModel;
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    list = (java.util.List) ((arrow.core.Either.Left) either).getValue();
                }
                com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel copy$default = com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel.copy$default(addressAddUiModel2, list, null, null, null, 14, null);
                if (!(either instanceof arrow.core.Either.Left)) {
                    addressAddViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Invalid(copy$default));
                } else {
                    addressAddViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Valid(copy$default));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        addressAddViewModel$validateWithAddressHandler$1 = new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel$validateWithAddressHandler$1(addressAddViewModel, continuation);
        java.lang.Object obj2 = addressAddViewModel$validateWithAddressHandler$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = addressAddViewModel$validateWithAddressHandler$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel addressAddUiModel22 = addressAddUiModel;
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel copy$default2 = com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiModel.copy$default(addressAddUiModel22, list, null, null, null, 14, null);
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRanges.onEvent(event);
    }

    public static final /* synthetic */ void access$validateAllFieldsAndProceed(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel addressAddViewModel, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState addressAddUiState) {
        if (addressAddUiState instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState.Success) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(addressAddViewModel), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel$validateAllFieldsAndProceed$1(addressAddViewModel, addressAddUiState, null), 3, null);
        }
    }

    public static final /* synthetic */ void access$validateSingleField(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel addressAddViewModel, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState addressAddUiState, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId) {
        if (addressAddUiState instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState.Success) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(addressAddViewModel), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel$validateSingleField$1(addressAddUiState, formFieldId, addressAddViewModel, null), 3, null);
        }
    }
}
