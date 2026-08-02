package com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardState;Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReplaceDigitalCardReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState, com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent, com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ReplaceDigitalCardReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ReplaceDigitalCardReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState, com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect>> reduce(com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState state, com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState.Processing)) {
                if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState.Error) state;
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent.RetryButtonClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState.Processing(error.getCardArtUrl(), error.getRetryCount() + 1), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent.CloseButtonClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect.ReplaceCardFlowCancelled.INSTANCE);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState.Processing processing = (com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState.Processing) state;
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent.ReplacementCompleted) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(processing, new com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect.NavigateBackWithSuccess(true));
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent.ReplacementFailed) {
                com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent.ReplacementFailed replacementFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent.ReplacementFailed) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState.Error(replacementFailed.getErrorType(), replacementFailed.getErrorCode(), processing.getRetryCount(), processing.getCardArtUrl()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(processing, event);
        }
        com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState.Initial initial = (com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent.ConfirmReplacementClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState.Processing(initial.getCardArtUrl(), 0, 2, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent.CancelReplacementClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial, com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect.ReplaceCardFlowCancelled.INSTANCE);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
