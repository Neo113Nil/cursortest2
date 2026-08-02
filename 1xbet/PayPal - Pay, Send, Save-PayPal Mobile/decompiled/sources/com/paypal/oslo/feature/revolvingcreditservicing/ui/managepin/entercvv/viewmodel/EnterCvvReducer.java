package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00100\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEffect;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/utils/CvvLengthValidator;", "cvvLengthValidator", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/utils/CvvLengthValidator;)V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent;)Larrow/core/Either;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/utils/CvvLengthValidator;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EnterCvvReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEffect> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.CvvLengthValidator getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public EnterCvvReducer(com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.CvvLengthValidator cvvLengthValidator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvvLengthValidator, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cvvLengthValidator;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "EnterCvvReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEffect>> reduce(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState state, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.Ready)) {
                if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.FetchingPin)) {
                    if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.Error error = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.Error) state;
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnViewCreated) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(error, null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnBackClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEffect.NavigateToManageCard.INSTANCE);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnCvvChanged) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.ReadyInfo.copy$default(error.getReadyInfo(), null, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnCvvChanged) event).getCvv(), 1, null)), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.FetchingPin fetchingPin = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.FetchingPin) state;
                if ((event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnViewCreated) || (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnCvvChanged)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(fetchingPin, null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnBackClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.Ready(fetchingPin.getReadyInfo()), com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEffect.NavigateToManageCard.INSTANCE);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnPinReceived) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.Ready(fetchingPin.getReadyInfo()), new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEffect.NavigateToViewPin(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnPinReceived) event).getPin(), fetchingPin.getReadyInfo().getUiModel().getHasPhysicalCard()));
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnWrongCvvError) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.Error(fetchingPin.getReadyInfo()), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(fetchingPin, event);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.Ready) state;
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnViewCreated) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnCvvChanged) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready.copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.ReadyInfo.copy$default(ready.getReadyInfo(), null, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnCvvChanged) event).getCvv(), 1, null)), null, 2, null);
            }
            if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnViewPinClicked)) {
                return event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnBackClicked ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEffect.NavigateToManageCard.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI.isCvvLengthValid(ready.getReadyInfo().getCvv())) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.FetchingPin(ready.getReadyInfo()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.Error(ready.getReadyInfo()), null, 2, null);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.Initial initial = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnViewCreated) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.ReadyInfo(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnViewCreated) event).getUiModel(), "")), null, 2, null);
        }
        return event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnBackClicked ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEffect.NavigateToManageCard.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
