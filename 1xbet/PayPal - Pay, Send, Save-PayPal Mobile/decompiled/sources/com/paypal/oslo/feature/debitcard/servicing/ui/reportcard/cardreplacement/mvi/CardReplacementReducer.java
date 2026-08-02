package com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState;Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardReplacementReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CardReplacementReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "CardReplacementReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect>> reduce(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState state, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent event) {
        com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateBackWithCancellation navigateBackWithCancellation;
        com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateToDebitCardManagement navigateToDebitCardManagement;
        com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Initial copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Processing)) {
                if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Success)) {
                    if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Error) state;
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.RetryButtonClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Processing(error.getCardArtUrl(), error.getRetryCount() + 1, error.getPrimary(), error.getProductName()), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.CloseButtonClicked) {
                        if (error.getErrorType() == com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.CONTACT_CUSTOMER_SERVICE) {
                            if (error.getPrimary()) {
                                navigateBackWithCancellation = com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateToBalanceDashboard.INSTANCE;
                            } else {
                                navigateBackWithCancellation = com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateToDebitCardManagement.INSTANCE;
                            }
                        } else {
                            navigateBackWithCancellation = com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateBackWithCancellation.INSTANCE;
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, navigateBackWithCancellation);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
                com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Success success = (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Success) state;
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.OkButtonClicked) {
                    if (success.getPrimary()) {
                        navigateToDebitCardManagement = com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateToBalanceDashboard.INSTANCE;
                    } else {
                        navigateToDebitCardManagement = com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateToDebitCardManagement.INSTANCE;
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, navigateToDebitCardManagement);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Processing processing = (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Processing) state;
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.ReplacementSuccess) {
                com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.ReplacementSuccess replacementSuccess = (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.ReplacementSuccess) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Success(replacementSuccess.getSuccessTitle(), replacementSuccess.getSuccessDescription(), processing.getCardArtUrl(), processing.getPrimary(), processing.getProductName()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.ReplacementFailed) {
                com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.ReplacementFailed replacementFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.ReplacementFailed) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Error(replacementFailed.getErrorType(), replacementFailed.getErrorCode(), processing.getRetryCount(), processing.getCardArtUrl(), processing.getPrimary(), processing.getProductName()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(processing, event);
        }
        com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Initial initial = (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.SendNewCardClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Processing(initial.getCardArtUrl(), 0, initial.getPrimary(), initial.getProductName(), 2, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.ChangeAddressClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial, new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateToChangeAddress(initial.getDebitInstrumentId(), initial.getProductName()));
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.BackButtonClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect.NavigateBackWithCancellation.INSTANCE);
        }
        if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.AddressChanged)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
        }
        copy = initial.copy((r20 & 1) != 0 ? initial.displayAddress : ((com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.AddressChanged) event).getDisplayAddress(), (r20 & 2) != 0 ? initial.debitInstrumentId : null, (r20 & 4) != 0 ? initial.productName : null, (r20 & 8) != 0 ? initial.cardArtUrl : null, (r20 & 16) != 0 ? initial.cardLastFourDigits : null, (r20 & 32) != 0 ? initial.title : null, (r20 & 64) != 0 ? initial.description : null, (r20 & 128) != 0 ? initial.ctaText : null, (r20 & 256) != 0 ? initial.primary : false);
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy, null, 2, null);
    }
}
