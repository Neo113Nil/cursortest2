package com.paypal.oslo.feature.identity.logincontroller.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiState;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiState;Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AuthenticateReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AuthenticateReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "AuthenticateReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect>> reduce(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState state, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent event) {
        com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateToUserVerification navigateToUserVerification;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.PreparingNativeAuth)) {
            if (!(state instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.UsingNativeAuth)) {
                if (!(state instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.AuthenticationSuccess)) {
                    if (!(state instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.AuthenticationCancelled)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.AuthenticationCancelled) state, event);
                }
                com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.AuthenticationSuccess authenticationSuccess = (com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.AuthenticationSuccess) state;
                if (event instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthInitialized) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.UsingNativeAuth(((com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthInitialized) event).getRequestId()), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(authenticationSuccess, event);
            }
            com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.UsingNativeAuth usingNativeAuth = (com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.UsingNativeAuth) state;
            if (event instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthCompleted) {
                com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthCompleted nativeAuthCompleted = (com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthCompleted) event;
                if (nativeAuthCompleted.getSuccess()) {
                    com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.AuthenticationSuccess authenticationSuccess2 = com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.AuthenticationSuccess.INSTANCE;
                    java.lang.String token = nativeAuthCompleted.getToken();
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(authenticationSuccess2, token != null ? new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerAuthSuccess(token) : null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(usingNativeAuth, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativePassiveAuthSuccessfullyCompleted) {
                com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.UsingNativeAuth usingNativeAuth2 = usingNativeAuth;
                java.lang.String token2 = ((com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativePassiveAuthSuccessfullyCompleted) event).getToken();
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(usingNativeAuth2, token2 != null ? new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerPassiveAuthSuccess(token2) : null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(usingNativeAuth, event);
        }
        com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.PreparingNativeAuth preparingNativeAuth = (com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.PreparingNativeAuth) state;
        if (event instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthInitialized) {
            com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthInitialized nativeAuthInitialized = (com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthInitialized) event;
            if (nativeAuthInitialized.isLinkAccountIntent() || !nativeAuthInitialized.getHasRememberedUser()) {
                navigateToUserVerification = new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateToUserVerification(nativeAuthInitialized.getRequestId());
            } else {
                navigateToUserVerification = new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateToRememberedLogin(nativeAuthInitialized.getRequestId());
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.UsingNativeAuth(nativeAuthInitialized.getRequestId()), navigateToUserVerification);
        }
        if (event instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.InContextAuthOptionsPrefetched) {
            com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.InContextAuthOptionsPrefetched inContextAuthOptionsPrefetched = (com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.InContextAuthOptionsPrefetched) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.UsingNativeAuth(inContextAuthOptionsPrefetched.getRequestId()), new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateDirectlyToAuthMethod(inContextAuthOptionsPrefetched.getAvailableMethods(), inContextAuthOptionsPrefetched.getPublicCredential(), inContextAuthOptionsPrefetched.getDisplayName(), inContextAuthOptionsPrefetched.getRequestId()));
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(preparingNativeAuth, event);
    }
}
