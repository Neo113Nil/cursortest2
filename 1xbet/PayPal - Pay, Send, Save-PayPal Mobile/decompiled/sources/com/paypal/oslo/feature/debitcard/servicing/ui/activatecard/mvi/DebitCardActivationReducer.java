package com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState;Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationEvent;)Larrow/core/Either;", "p0", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState;)Larrow/core/Either;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardActivationReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DebitCardActivationReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "DebitCardActivationReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEffect>> reduce(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState state, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error) state;
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.CvvChanged) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error.copy$default(error, ((com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.CvvChanged) event).getCvv(), null, null, null, 0, 30, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.ActivateCardClicked) {
                    return getHighSpeedVideoFpsRanges(error);
                }
                if ((event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.BackClicked) || (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.ErrorDismissCtaClicked)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEffect.NavigateBack.INSTANCE);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.DidNotGetYourCardClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEffect.NavigateToCardNotReceivedScreen.INSTANCE);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.ErrorActionCtaClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Loading(error.getCvv(), error.getRetryCount() + 1), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Loading loading = (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.ActivationSuccess) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEffect.NavigateToCardManagement.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.ActivationFailed) {
                com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.ActivationFailed activationFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.ActivationFailed) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error(activationFailed.getInlineErrorType() == null ? loading.getCvv() : "", activationFailed.getInlineErrorType(), activationFailed.getErrorTag(), activationFailed.getErrorType(), loading.getRetryCount()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Initial initial = (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.CvvChanged) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initial.copy(((com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.CvvChanged) event).getCvv()), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.ActivateCardClicked) {
            return getHighSpeedVideoFpsRanges(initial);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.BackClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEffect.NavigateBack.INSTANCE);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.DidNotGetYourCardClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEffect.NavigateToCardNotReceivedScreen.INSTANCE);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }

    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEffect>> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState p0) {
        if (p0.getCvv().length() == 3) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Loading(p0.getCvv(), 0, 2, null), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error(p0.getCvv(), com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType.CVV_REQUIRED, null, null, 0, 28, null), null, 2, null);
    }
}
