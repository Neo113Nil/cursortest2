package com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00130\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/viewmodel/RequestPhysicalCardViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEffect;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardReducer;", "reducer", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/RequestPhysicalCardUseCase;", "requestPhysicalCardUseCase", "Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardDateFormatter;", "dateFormatter", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardReducer;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/RequestPhysicalCardUseCase;Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardDateFormatter;)V", "", "stateStoreName", "()Ljava/lang/String;", "initialState", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "middlewares", "()Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/RequestPhysicalCardUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardDateFormatter;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RequestPhysicalCardViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEffect> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.RequestPhysicalCardUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public RequestPhysicalCardViewModel(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardReducer requestPhysicalCardReducer, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.RequestPhysicalCardUseCase requestPhysicalCardUseCase, com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter debitCardDateFormatter) {
        super(requestPhysicalCardReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPhysicalCardReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPhysicalCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardDateFormatter, "");
        this.getHighResolutionOutputSizeshNQ4ISI = requestPhysicalCardUseCase;
        this.getHighSpeedVideoFpsRangesFor = debitCardDateFormatter;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "RequestPhysicalCardViewModel.store";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState initialState() {
        return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Initial.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent>> middlewares() {
        return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent>() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                if (input.getEvent() instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestCard) {
                    com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel requestPhysicalCardViewModel = com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel.this;
                    com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent event = input.getEvent();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(event, "");
                    java.lang.String cardId = ((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestCard) event).getCardId();
                    com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent event2 = input.getEvent();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(event2, "");
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(requestPhysicalCardViewModel), null, null, new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel$callReissueCardApi$1(cardId, ((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestCard) event2).getAddressId(), requestPhysicalCardViewModel, null), 3, null);
                }
            }
        });
    }
}
