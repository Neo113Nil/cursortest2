package com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryUiState;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryUiState;Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/mvi/PasswordRecoveryEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PasswordRecoveryReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState, com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent, com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PasswordRecoveryReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "PasswordRecoveryReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState, com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiEffect>> reduce(com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState state, com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Idle)) {
            if (!(state instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Success)) {
                    if (!(state instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Error error = (com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Error) state;
                    if (event instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSubmit) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Loading.INSTANCE, null, 2, null);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSkip.INSTANCE)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiEffect.NavigateBack.INSTANCE);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.BannerDismiss.INSTANCE)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Idle.INSTANCE, null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
                com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Success success = (com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Success) state;
                if (event instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSuccess) {
                    com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSuccess createPasswordSuccess = (com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSuccess) event;
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Success.INSTANCE, new com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiEffect.SavePasswordToManagerAndNavigateToNextScreen(createPasswordSuccess.getCredential(), createPasswordSuccess.getNewPassword()));
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
            }
            com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Loading loading = (com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSuccess) {
                com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSuccess createPasswordSuccess2 = (com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSuccess) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Success.INSTANCE, new com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiEffect.SavePasswordToManagerAndNavigateToNextScreen(createPasswordSuccess2.getCredential(), createPasswordSuccess2.getNewPassword()));
            }
            if (event instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordError) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Error(((com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordError) event).getError().toString()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
        }
        com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Idle idle = (com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Idle) state;
        if (event instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSubmit) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Loading.INSTANCE, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSuccess) {
            com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSuccess createPasswordSuccess3 = (com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSuccess) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Success.INSTANCE, new com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiEffect.SavePasswordToManagerAndNavigateToNextScreen(createPasswordSuccess3.getCredential(), createPasswordSuccess3.getNewPassword()));
        }
        if (event instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordError) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiState.Error(((com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordError) event).getError().toString()), null, 2, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.CreatePasswordSkip.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(idle, com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryUiEffect.NavigateBack.INSTANCE);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryEvent.BannerDismiss.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(idle, null, 2, null);
    }
}
