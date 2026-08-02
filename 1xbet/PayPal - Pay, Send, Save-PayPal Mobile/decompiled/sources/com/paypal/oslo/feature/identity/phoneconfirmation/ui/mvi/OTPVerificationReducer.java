package com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState;Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OTPVerificationReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public OTPVerificationReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return com.paypal.oslo.feature.identity.phoneconfirmation.PhoneConfirmationConstants.ReducerNames.OTP_VERIFICATION;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect>> reduce(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState state, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent event) {
        com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError error;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Error)) {
                    if (!(state instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.CodeResent)) {
                        if (!(state instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Success)) {
                            if (!(state instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Disabled)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Disabled) state, event);
                        }
                        com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Success success = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Success) state;
                        if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnDone) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.VerificationComplete(success.getPhoneNumber()));
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                    }
                    com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.CodeResent codeResent = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.CodeResent) state;
                    if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnDismissMessage) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial(codeResent.getOtpCode(), codeResent.getMaskedPhoneNumber()), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnOtpCodeChanged) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial(((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnOtpCodeChanged) event).getCode(), codeResent.getMaskedPhoneNumber()), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnVerify) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Loading(((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnVerify) event).getOtpCode(), codeResent.getMaskedPhoneNumber(), false), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnResendCode) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Loading(codeResent.getOtpCode(), codeResent.getMaskedPhoneNumber(), true), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnBack) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(codeResent, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.NavigateBack.INSTANCE);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(codeResent, event);
                }
                com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Error error2 = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Error) state;
                if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnDismissMessage) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial(error2.getOtpCode(), error2.getMaskedPhoneNumber()), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnOtpCodeChanged) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Error.copy$default(error2, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnOtpCodeChanged) event).getCode(), null, null, 6, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnVerify) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Loading(((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnVerify) event).getOtpCode(), error2.getMaskedPhoneNumber(), false), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnResendCode) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Loading(error2.getOtpCode(), error2.getMaskedPhoneNumber(), true), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnBack) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error2, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.NavigateBack.INSTANCE);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error2, event);
            }
            com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Loading loading = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.VerificationSucceeded) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Success(((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.VerificationSucceeded) event).getPhoneNumber()), com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.HideKeyboard.INSTANCE);
            }
            boolean z = event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.VerificationFailed;
            if (z || (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.CodeResendFailed)) {
                if (z) {
                    error = ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.VerificationFailed) event).getError();
                } else {
                    if (!(event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.CodeResendFailed)) {
                        throw new java.lang.IllegalStateException(com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.UNEXCEPTED_EVENT_TYPE.toString());
                    }
                    error = ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.CodeResendFailed) event).getError();
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Error(loading.getOtpCode(), loading.getMaskedPhoneNumber(), error.getDisplayMessage()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.CodeResentSuccessfully) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.CodeResent("", loading.getMaskedPhoneNumber()), new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.ShowSuccessToast("A new code has been sent to ".concat(java.lang.String.valueOf(loading.getMaskedPhoneNumber()))));
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial initial = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnInit) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial("", ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnInit) event).getMaskedPhoneNumber()), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnOtpCodeChanged) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial.copy$default(initial, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnOtpCodeChanged) event).getCode(), null, 2, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnVerify) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Loading(((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnVerify) event).getOtpCode(), initial.getMaskedPhoneNumber(), false), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnResendCode) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Loading(initial.getOtpCode(), initial.getMaskedPhoneNumber(), true), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnBack) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.NavigateBack.INSTANCE);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
