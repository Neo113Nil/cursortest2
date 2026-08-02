package com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.reducer;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/idcapturetimeout/reducer/IdCaptureTimeoutReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/idcapturetimeout/contract/IdCaptureTimeoutUiState;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/idcapturetimeout/contract/IdCaptureTimeoutEvent;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/idcapturetimeout/contract/IdCaptureTimeoutUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/idcapturetimeout/contract/IdCaptureTimeoutUiState;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/idcapturetimeout/contract/IdCaptureTimeoutEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IdCaptureTimeoutReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public IdCaptureTimeoutReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "IdCaptureTimeoutReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiEffect>> reduce(com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiState state, com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiState.Initial) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiState.Initial initial = (com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiState.Initial) state;
            if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent.Initialize) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiState.Ready.INSTANCE, null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiState.Ready)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiState.Ready ready = (com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiState.Ready) state;
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent.RetryAutoCaptureTapped.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiEffect.NavigateToRetryAutoCapture.INSTANCE);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutEvent.ManualCaptureTapped.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.contract.IdCaptureTimeoutUiEffect.NavigateToManualCapture.INSTANCE);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
    }
}
