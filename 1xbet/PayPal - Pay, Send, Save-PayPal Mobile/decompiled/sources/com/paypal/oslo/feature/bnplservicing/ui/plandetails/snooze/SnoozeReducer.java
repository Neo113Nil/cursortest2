package com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeUiState;Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SnoozeReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState, com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent, com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public SnoozeReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "SnoozeReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState, com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiEffect>> reduce(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState state, com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState, com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiEffect>> unexpectedEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Schedule)) {
            if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Confirmation)) {
                if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Submitting)) {
                    if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Error) state, event);
                } else {
                    com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Submitting submitting = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Submitting) state;
                    if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.OnSnoozeSuccess) {
                        unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output(submitting, com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiEffect.SnoozeConfirmed.INSTANCE);
                    } else {
                        unexpectedEvent = event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.OnSnoozeError ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Error.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(submitting, event);
                    }
                }
            } else {
                com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Confirmation confirmation = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Confirmation) state;
                if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.BackClicked) {
                    unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(confirmation, null, 2, null);
                } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.TransitionToSchedule) {
                    unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Schedule(((com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.TransitionToSchedule) event).getUiModel()), null, 2, null);
                } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.ConfirmClicked) {
                    unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Submitting(confirmation.getUiModel()), null, 2, null);
                } else {
                    unexpectedEvent = event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.ConsentNotChecked ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Confirmation.copy$default(confirmation, null, true, 1, null), null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(confirmation, event);
                }
            }
        } else {
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Schedule schedule = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Schedule) state;
            if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.OptionSelected) {
                unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(schedule, null, 2, null);
            } else {
                unexpectedEvent = event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.TransitionToConfirmation ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiState.Confirmation(((com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeEvent.TransitionToConfirmation) event).getUiModel(), false, 2, null), null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(schedule, event);
            }
        }
        if (unexpectedEvent instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logBnplServReducerEvent$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, getName(), event.getName(), false, 4, null);
            return unexpectedEvent;
        }
        if (unexpectedEvent instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logBnplServReducerEvent(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, getName(), event.getName(), true);
            return unexpectedEvent;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
