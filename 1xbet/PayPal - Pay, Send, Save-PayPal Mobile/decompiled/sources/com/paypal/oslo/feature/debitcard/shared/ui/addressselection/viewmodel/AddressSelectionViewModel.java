package com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00150\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/viewmodel/AddressSelectionViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEffect;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionReducer;", "reducer", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetAddressesUseCase;", "getAddressesUseCase", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/SaveAddressUseCase;", "saveAddressUseCase", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;", "debitCardWebViewUrlBuilder", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionReducer;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetAddressesUseCase;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/SaveAddressUseCase;Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;)V", "initialState", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState;", "", "stateStoreName", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "middlewares", "()Ljava/util/List;", "event", "", "onEvent", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetAddressesUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/SaveAddressUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;", "getDebitCardWebViewUrlBuilder", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "effect", "Lkotlinx/coroutines/flow/Flow;", "getEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressSelectionViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEffect> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesUseCase getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder debitCardWebViewUrlBuilder;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEffect> effect;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState> state;

    public final com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder getDebitCardWebViewUrlBuilder() {
        return this.debitCardWebViewUrlBuilder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public AddressSelectionViewModel(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionReducer addressSelectionReducer, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesUseCase getAddressesUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase saveAddressUseCase, com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder debitCardWebViewUrlBuilder) {
        super(addressSelectionReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressSelectionReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAddressesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saveAddressUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardWebViewUrlBuilder, "");
        this.getHighSpeedVideoFpsRanges = getAddressesUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = saveAddressUseCase;
        this.debitCardWebViewUrlBuilder = debitCardWebViewUrlBuilder;
        this.state = getUiState();
        this.effect = getUiEffect();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState initialState() {
        return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Initial.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "AddressSelectionViewModel";
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEffect> getEffect() {
        return this.effect;
    }

    public final void onEvent(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        processEvent(event);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent>> middlewares() {
        return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent>() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadAddresses) {
                    com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadAddresses loadAddresses = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadAddresses) event;
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r4), null, null, new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel$loadAddresses$1(loadAddresses.getDebitInstrumentId(), loadAddresses.getProductName(), com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel.this, loadAddresses.getNewlyAddedAddressId(), null), 3, null);
                } else if ((event instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveAddress) && (input.getStates().getSecond() instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Saving)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r4), null, null, new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel$saveSelectedAddress$1(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel.this, null), 3, null);
                }
            }
        });
    }
}
