package com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState;Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneConfirmationReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PhoneConfirmationReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return com.paypal.oslo.feature.identity.phoneconfirmation.PhoneConfirmationConstants.ReducerNames.PHONE_CONFIRMATION;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect>> reduce(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState state, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Error)) {
                    if (!(state instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Success)) {
                        if (!(state instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Disabled)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Disabled) state, event);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Success) state, event);
                }
                com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Error error = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Error) state;
                if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnDismissError) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Initial.INSTANCE, null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnSendCode) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Loading.INSTANCE, null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnCancel) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.NavigateBack.INSTANCE);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
            }
            com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Loading loading = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationInitiated) {
                com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationInitiated confirmationInitiated = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationInitiated) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Success(confirmationInitiated.getPhoneNumber(), confirmationInitiated.getCountryCode(), confirmationInitiated.getDeviceId(), confirmationInitiated.getOutput().getMaskedPhoneNumber()), new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.NavigateToOTPVerification(new com.paypal.oslo.feature.identity.phoneconfirmation.navigation.OTPVerificationScreenDestination(confirmationInitiated.getPhoneNumber(), confirmationInitiated.getOutput().getMaskedPhoneNumber(), confirmationInitiated.getCountryCode(), confirmationInitiated.getDeviceId())));
            }
            if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationFailed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Error(((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationFailed) event).getError().getDisplayMessage()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Initial initial = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnInit) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initial, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnSendCode) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Loading.INSTANCE, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnCancel) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.NavigateBack.INSTANCE);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
