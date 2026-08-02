package com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00110\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0014\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/viewmodel/RequestPhysicalCardDecisionViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEffect;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionReducer;", "reducer", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/DebitInstrumentForRequestPhysicalCardUseCase;", "debitInstrumentForRequestPhysicalCardUseCase", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionReducer;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/DebitInstrumentForRequestPhysicalCardUseCase;)V", "", "stateStoreName", "()Ljava/lang/String;", "initialState", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionState;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "middlewares", "()Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/DebitInstrumentForRequestPhysicalCardUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RequestPhysicalCardDecisionViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEffect> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.DebitInstrumentForRequestPhysicalCardUseCase Camera2StreamConfigurationMap;
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public RequestPhysicalCardDecisionViewModel(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionReducer requestPhysicalCardDecisionReducer, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.DebitInstrumentForRequestPhysicalCardUseCase debitInstrumentForRequestPhysicalCardUseCase) {
        super(requestPhysicalCardDecisionReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPhysicalCardDecisionReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentForRequestPhysicalCardUseCase, "");
        this.Camera2StreamConfigurationMap = debitInstrumentForRequestPhysicalCardUseCase;
        this.getHighSpeedVideoFpsRangesFor = "";
        this.getHighSpeedVideoFpsRanges = "";
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "RequestPhysicalCardDecisionViewModel.store";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState initialState() {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Loading(0, 1, null);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent>> middlewares() {
        return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent>() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchDebitInstrument) {
                    com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchDebitInstrument fetchDebitInstrument = (com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchDebitInstrument) event;
                    com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel.this.getHighSpeedVideoFpsRangesFor = fetchDebitInstrument.getProductName();
                    com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel.this.getHighSpeedVideoFpsRanges = fetchDebitInstrument.getInstrumentId();
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r3), null, null, new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel$fetchDebitInstrument$1(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel.this, null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.Retry) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r3), null, null, new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel$fetchDebitInstrument$1(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel.this, null), 3, null);
                }
            }
        });
    }
}
