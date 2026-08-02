package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetState;Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeactivateContactlessSheetReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DeactivateContactlessSheetReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "DeactivateContactlessSheetReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEffect>> reduce(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState state, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Confirmation)) {
            if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Success)) {
                    if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Error) state;
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent.DismissClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEffect.DismissSheet.INSTANCE);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent.RetryClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Loading(error.getRetryCount() + 1), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent.InitializeSheet) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Confirmation.INSTANCE, null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
                com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Success success = (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Success) state;
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent.InitializeSheet) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Confirmation.INSTANCE, null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Loading loading = (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent.DeactivateSuccess) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Success.INSTANCE, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEffect.ShowDeactivationSuccessToast.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent.DeactivateFailed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Error(((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent.DeactivateFailed) event).getErrorType(), loading.getRetryCount()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent.InitializeSheet) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Confirmation.INSTANCE, null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Confirmation confirmation = (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Confirmation) state;
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent.InitializeSheet) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(confirmation, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent.DismissClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(confirmation, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEffect.DismissSheet.INSTANCE);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent.DeactivateClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState.Loading(0), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(confirmation, event);
    }
}
