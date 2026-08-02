package com.paypal.oslo.feature.identity.rememberedlogin.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiState;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiState;Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RememberedLoginReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public RememberedLoginReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "RememberedLoginReducer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect>> reduce(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState state, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent event) {
        com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded copy;
        com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded copy2;
        com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded copy3;
        com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded copy4;
        com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded copy5;
        com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded copy6;
        com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded copy7;
        com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded copy8;
        com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded copy9;
        com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded copy10;
        com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.CallVerifyCredentials callVerifyCredentials;
        com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded copy11;
        com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded copy12;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        int i = 2;
        com.paypal.oslo.core.mvi.UiEffect uiEffect = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr4 = 0;
        java.lang.Object[] objArr5 = 0;
        java.lang.Object[] objArr6 = 0;
        java.lang.Object[] objArr7 = 0;
        java.lang.Object[] objArr8 = 0;
        java.lang.Object[] objArr9 = 0;
        java.lang.Object[] objArr10 = 0;
        java.lang.Object[] objArr11 = 0;
        java.lang.Object[] objArr12 = 0;
        java.lang.Object[] objArr13 = 0;
        java.lang.Object[] objArr14 = 0;
        java.lang.Object[] objArr15 = 0;
        java.lang.Object[] objArr16 = 0;
        java.lang.Object[] objArr17 = 0;
        java.lang.Object[] objArr18 = 0;
        java.lang.Object[] objArr19 = 0;
        java.lang.Object[] objArr20 = 0;
        java.lang.Object[] objArr21 = 0;
        java.lang.Object[] objArr22 = 0;
        java.lang.Object[] objArr23 = 0;
        java.lang.Object[] objArr24 = 0;
        java.lang.Object[] objArr25 = 0;
        java.lang.Object[] objArr26 = 0;
        java.lang.Object[] objArr27 = 0;
        if (state instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Initial) {
            com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Initial initial = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Initial) state;
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.LoadUserData.INSTANCE)) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Loading.INSTANCE, uiEffect, i, objArr27 == true ? 1 : 0));
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(initial, event));
        }
        if (state instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded) {
            com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded userDataLoaded = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded) state;
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.ChangeUser.INSTANCE)) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(userDataLoaded, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ChangeUser.INSTANCE));
            }
            if (event instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.NextClicked) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(userDataLoaded, new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToPasswordScreen(userDataLoaded.getLoginCredential(), com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption.INSTANCE, ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.NextClicked) event).getRequestId())));
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAutoTriggered.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAutoTriggered.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialStarted.INSTANCE) && !(event instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialSuccess) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialCompleted.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialFailed.INSTANCE)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricPromptTriggered.INSTANCE) && !(event instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthSuccess) && !(event instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthError) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthCanceled.INSTANCE)) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyPromptTriggered.INSTANCE) && !(event instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthSuccess) && !(event instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthError) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthCanceled.INSTANCE)) {
                        if (!(event instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAttemptFailed)) {
                            if (!(event instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAttemptFailed)) {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.LoginButtonClicked.INSTANCE)) {
                                    return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(userDataLoaded, event));
                                }
                                com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel.NextAuthAction nextAuthMethod = com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel.AuthMethodState.INSTANCE.fromAttemptCounts(userDataLoaded.getBiometricAttemptCount(), userDataLoaded.getPasskeyAttemptCount()).getNextAuthMethod();
                                if (nextAuthMethod instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel.NextAuthAction.AttemptBiometric) {
                                    callVerifyCredentials = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.RetryBiometricAuth(userDataLoaded.getLoginCredential());
                                } else if (nextAuthMethod instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel.NextAuthAction.AttemptPasskey) {
                                    callVerifyCredentials = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.RetryPasskeyAuth(userDataLoaded.getLoginCredential());
                                } else {
                                    if (!(nextAuthMethod instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel.NextAuthAction.FallbackToVerifyCredentials)) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    callVerifyCredentials = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.CallVerifyCredentials(userDataLoaded.getLoginCredential());
                                }
                                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(userDataLoaded, callVerifyCredentials));
                            }
                            copy11 = userDataLoaded.copy((r32 & 1) != 0 ? userDataLoaded.displayName : null, (r32 & 2) != 0 ? userDataLoaded.publicCredential : null, (r32 & 4) != 0 ? userDataLoaded.loginCredential : null, (r32 & 8) != 0 ? userDataLoaded.avatarUrl : null, (r32 & 16) != 0 ? userDataLoaded.availableAuthOptions : null, (r32 & 32) != 0 ? userDataLoaded.isBiometricPromptShown : false, (r32 & 64) != 0 ? userDataLoaded.isPasskeyPromptShown : false, (r32 & 128) != 0 ? userDataLoaded.biometricAutoTriggered : false, (r32 & 256) != 0 ? userDataLoaded.passkeyAutoTriggered : false, (r32 & 512) != 0 ? userDataLoaded.authMethodBeingTriggered : null, (r32 & 1024) != 0 ? userDataLoaded.isVerifyingCredentials : false, (r32 & 2048) != 0 ? userDataLoaded.biometricAttemptCount : 0, (r32 & 4096) != 0 ? userDataLoaded.passkeyAttemptCount : userDataLoaded.getPasskeyAttemptCount() + 1, (r32 & 8192) != 0 ? userDataLoaded.biometricManualCancelled : false, (r32 & 16384) != 0 ? userDataLoaded.passkeyManualCancelled : ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAttemptFailed) event).getWasCancelled() || userDataLoaded.getPasskeyManualCancelled());
                            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(copy11, objArr24 == true ? 1 : 0, i, objArr23 == true ? 1 : 0));
                        }
                        copy12 = userDataLoaded.copy((r32 & 1) != 0 ? userDataLoaded.displayName : null, (r32 & 2) != 0 ? userDataLoaded.publicCredential : null, (r32 & 4) != 0 ? userDataLoaded.loginCredential : null, (r32 & 8) != 0 ? userDataLoaded.avatarUrl : null, (r32 & 16) != 0 ? userDataLoaded.availableAuthOptions : null, (r32 & 32) != 0 ? userDataLoaded.isBiometricPromptShown : false, (r32 & 64) != 0 ? userDataLoaded.isPasskeyPromptShown : false, (r32 & 128) != 0 ? userDataLoaded.biometricAutoTriggered : false, (r32 & 256) != 0 ? userDataLoaded.passkeyAutoTriggered : false, (r32 & 512) != 0 ? userDataLoaded.authMethodBeingTriggered : null, (r32 & 1024) != 0 ? userDataLoaded.isVerifyingCredentials : false, (r32 & 2048) != 0 ? userDataLoaded.biometricAttemptCount : userDataLoaded.getBiometricAttemptCount() + 1, (r32 & 4096) != 0 ? userDataLoaded.passkeyAttemptCount : 0, (r32 & 8192) != 0 ? userDataLoaded.biometricManualCancelled : ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAttemptFailed) event).getWasCancelled() || userDataLoaded.getBiometricManualCancelled(), (r32 & 16384) != 0 ? userDataLoaded.passkeyManualCancelled : false);
                        return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(copy12, objArr26 == true ? 1 : 0, i, objArr25 == true ? 1 : 0));
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyPromptTriggered.INSTANCE)) {
                        if (!(event instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthSuccess) && !(event instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthError) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthCanceled.INSTANCE)) {
                            return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(userDataLoaded, event));
                        }
                        copy9 = userDataLoaded.copy((r32 & 1) != 0 ? userDataLoaded.displayName : null, (r32 & 2) != 0 ? userDataLoaded.publicCredential : null, (r32 & 4) != 0 ? userDataLoaded.loginCredential : null, (r32 & 8) != 0 ? userDataLoaded.avatarUrl : null, (r32 & 16) != 0 ? userDataLoaded.availableAuthOptions : null, (r32 & 32) != 0 ? userDataLoaded.isBiometricPromptShown : false, (r32 & 64) != 0 ? userDataLoaded.isPasskeyPromptShown : false, (r32 & 128) != 0 ? userDataLoaded.biometricAutoTriggered : false, (r32 & 256) != 0 ? userDataLoaded.passkeyAutoTriggered : false, (r32 & 512) != 0 ? userDataLoaded.authMethodBeingTriggered : null, (r32 & 1024) != 0 ? userDataLoaded.isVerifyingCredentials : false, (r32 & 2048) != 0 ? userDataLoaded.biometricAttemptCount : 0, (r32 & 4096) != 0 ? userDataLoaded.passkeyAttemptCount : 0, (r32 & 8192) != 0 ? userDataLoaded.biometricManualCancelled : false, (r32 & 16384) != 0 ? userDataLoaded.passkeyManualCancelled : false);
                        return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(copy9, objArr20 == true ? 1 : 0, i, objArr19 == true ? 1 : 0));
                    }
                    copy10 = userDataLoaded.copy((r32 & 1) != 0 ? userDataLoaded.displayName : null, (r32 & 2) != 0 ? userDataLoaded.publicCredential : null, (r32 & 4) != 0 ? userDataLoaded.loginCredential : null, (r32 & 8) != 0 ? userDataLoaded.avatarUrl : null, (r32 & 16) != 0 ? userDataLoaded.availableAuthOptions : null, (r32 & 32) != 0 ? userDataLoaded.isBiometricPromptShown : false, (r32 & 64) != 0 ? userDataLoaded.isPasskeyPromptShown : true, (r32 & 128) != 0 ? userDataLoaded.biometricAutoTriggered : false, (r32 & 256) != 0 ? userDataLoaded.passkeyAutoTriggered : false, (r32 & 512) != 0 ? userDataLoaded.authMethodBeingTriggered : null, (r32 & 1024) != 0 ? userDataLoaded.isVerifyingCredentials : false, (r32 & 2048) != 0 ? userDataLoaded.biometricAttemptCount : 0, (r32 & 4096) != 0 ? userDataLoaded.passkeyAttemptCount : 0, (r32 & 8192) != 0 ? userDataLoaded.biometricManualCancelled : false, (r32 & 16384) != 0 ? userDataLoaded.passkeyManualCancelled : false);
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(copy10, objArr22 == true ? 1 : 0, i, objArr21 == true ? 1 : 0));
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricPromptTriggered.INSTANCE)) {
                    if (!(event instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthSuccess) && !(event instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthError) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthCanceled.INSTANCE)) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(userDataLoaded, event));
                    }
                    copy7 = userDataLoaded.copy((r32 & 1) != 0 ? userDataLoaded.displayName : null, (r32 & 2) != 0 ? userDataLoaded.publicCredential : null, (r32 & 4) != 0 ? userDataLoaded.loginCredential : null, (r32 & 8) != 0 ? userDataLoaded.avatarUrl : null, (r32 & 16) != 0 ? userDataLoaded.availableAuthOptions : null, (r32 & 32) != 0 ? userDataLoaded.isBiometricPromptShown : false, (r32 & 64) != 0 ? userDataLoaded.isPasskeyPromptShown : false, (r32 & 128) != 0 ? userDataLoaded.biometricAutoTriggered : false, (r32 & 256) != 0 ? userDataLoaded.passkeyAutoTriggered : false, (r32 & 512) != 0 ? userDataLoaded.authMethodBeingTriggered : null, (r32 & 1024) != 0 ? userDataLoaded.isVerifyingCredentials : false, (r32 & 2048) != 0 ? userDataLoaded.biometricAttemptCount : 0, (r32 & 4096) != 0 ? userDataLoaded.passkeyAttemptCount : 0, (r32 & 8192) != 0 ? userDataLoaded.biometricManualCancelled : false, (r32 & 16384) != 0 ? userDataLoaded.passkeyManualCancelled : false);
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(copy7, objArr16 == true ? 1 : 0, i, objArr15 == true ? 1 : 0));
                }
                copy8 = userDataLoaded.copy((r32 & 1) != 0 ? userDataLoaded.displayName : null, (r32 & 2) != 0 ? userDataLoaded.publicCredential : null, (r32 & 4) != 0 ? userDataLoaded.loginCredential : null, (r32 & 8) != 0 ? userDataLoaded.avatarUrl : null, (r32 & 16) != 0 ? userDataLoaded.availableAuthOptions : null, (r32 & 32) != 0 ? userDataLoaded.isBiometricPromptShown : true, (r32 & 64) != 0 ? userDataLoaded.isPasskeyPromptShown : false, (r32 & 128) != 0 ? userDataLoaded.biometricAutoTriggered : false, (r32 & 256) != 0 ? userDataLoaded.passkeyAutoTriggered : false, (r32 & 512) != 0 ? userDataLoaded.authMethodBeingTriggered : null, (r32 & 1024) != 0 ? userDataLoaded.isVerifyingCredentials : false, (r32 & 2048) != 0 ? userDataLoaded.biometricAttemptCount : 0, (r32 & 4096) != 0 ? userDataLoaded.passkeyAttemptCount : 0, (r32 & 8192) != 0 ? userDataLoaded.biometricManualCancelled : false, (r32 & 16384) != 0 ? userDataLoaded.passkeyManualCancelled : false);
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(copy8, objArr18 == true ? 1 : 0, i, objArr17 == true ? 1 : 0));
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAutoTriggered.INSTANCE)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAutoTriggered.INSTANCE)) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialStarted.INSTANCE)) {
                        if (event instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialSuccess) {
                            com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialSuccess verifyCredentialSuccess = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialSuccess) event;
                            copy3 = userDataLoaded.copy((r32 & 1) != 0 ? userDataLoaded.displayName : null, (r32 & 2) != 0 ? userDataLoaded.publicCredential : null, (r32 & 4) != 0 ? userDataLoaded.loginCredential : null, (r32 & 8) != 0 ? userDataLoaded.avatarUrl : null, (r32 & 16) != 0 ? userDataLoaded.availableAuthOptions : verifyCredentialSuccess.getAuthOptions(), (r32 & 32) != 0 ? userDataLoaded.isBiometricPromptShown : false, (r32 & 64) != 0 ? userDataLoaded.isPasskeyPromptShown : false, (r32 & 128) != 0 ? userDataLoaded.biometricAutoTriggered : false, (r32 & 256) != 0 ? userDataLoaded.passkeyAutoTriggered : false, (r32 & 512) != 0 ? userDataLoaded.authMethodBeingTriggered : null, (r32 & 1024) != 0 ? userDataLoaded.isVerifyingCredentials : false, (r32 & 2048) != 0 ? userDataLoaded.biometricAttemptCount : 0, (r32 & 4096) != 0 ? userDataLoaded.passkeyAttemptCount : 0, (r32 & 8192) != 0 ? userDataLoaded.biometricManualCancelled : false, (r32 & 16384) != 0 ? userDataLoaded.passkeyManualCancelled : false);
                            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(copy3, new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToAuthMethod(userDataLoaded.getLoginCredential(), userDataLoaded.getDisplayName(), verifyCredentialSuccess.getAuthOptions())));
                        }
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialCompleted.INSTANCE)) {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialFailed.INSTANCE)) {
                                return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(userDataLoaded, event));
                            }
                            copy = userDataLoaded.copy((r32 & 1) != 0 ? userDataLoaded.displayName : null, (r32 & 2) != 0 ? userDataLoaded.publicCredential : null, (r32 & 4) != 0 ? userDataLoaded.loginCredential : null, (r32 & 8) != 0 ? userDataLoaded.avatarUrl : null, (r32 & 16) != 0 ? userDataLoaded.availableAuthOptions : null, (r32 & 32) != 0 ? userDataLoaded.isBiometricPromptShown : false, (r32 & 64) != 0 ? userDataLoaded.isPasskeyPromptShown : false, (r32 & 128) != 0 ? userDataLoaded.biometricAutoTriggered : false, (r32 & 256) != 0 ? userDataLoaded.passkeyAutoTriggered : false, (r32 & 512) != 0 ? userDataLoaded.authMethodBeingTriggered : null, (r32 & 1024) != 0 ? userDataLoaded.isVerifyingCredentials : false, (r32 & 2048) != 0 ? userDataLoaded.biometricAttemptCount : 0, (r32 & 4096) != 0 ? userDataLoaded.passkeyAttemptCount : 0, (r32 & 8192) != 0 ? userDataLoaded.biometricManualCancelled : false, (r32 & 16384) != 0 ? userDataLoaded.passkeyManualCancelled : false);
                            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(copy, new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.FallbackToPasswordScreen(userDataLoaded.getLoginCredential(), userDataLoaded.getDisplayName())));
                        }
                        copy2 = userDataLoaded.copy((r32 & 1) != 0 ? userDataLoaded.displayName : null, (r32 & 2) != 0 ? userDataLoaded.publicCredential : null, (r32 & 4) != 0 ? userDataLoaded.loginCredential : null, (r32 & 8) != 0 ? userDataLoaded.avatarUrl : null, (r32 & 16) != 0 ? userDataLoaded.availableAuthOptions : null, (r32 & 32) != 0 ? userDataLoaded.isBiometricPromptShown : false, (r32 & 64) != 0 ? userDataLoaded.isPasskeyPromptShown : false, (r32 & 128) != 0 ? userDataLoaded.biometricAutoTriggered : false, (r32 & 256) != 0 ? userDataLoaded.passkeyAutoTriggered : false, (r32 & 512) != 0 ? userDataLoaded.authMethodBeingTriggered : null, (r32 & 1024) != 0 ? userDataLoaded.isVerifyingCredentials : false, (r32 & 2048) != 0 ? userDataLoaded.biometricAttemptCount : 0, (r32 & 4096) != 0 ? userDataLoaded.passkeyAttemptCount : 0, (r32 & 8192) != 0 ? userDataLoaded.biometricManualCancelled : false, (r32 & 16384) != 0 ? userDataLoaded.passkeyManualCancelled : false);
                        return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(copy2, objArr8 == true ? 1 : 0, i, objArr7 == true ? 1 : 0));
                    }
                    copy4 = userDataLoaded.copy((r32 & 1) != 0 ? userDataLoaded.displayName : null, (r32 & 2) != 0 ? userDataLoaded.publicCredential : null, (r32 & 4) != 0 ? userDataLoaded.loginCredential : null, (r32 & 8) != 0 ? userDataLoaded.avatarUrl : null, (r32 & 16) != 0 ? userDataLoaded.availableAuthOptions : null, (r32 & 32) != 0 ? userDataLoaded.isBiometricPromptShown : false, (r32 & 64) != 0 ? userDataLoaded.isPasskeyPromptShown : false, (r32 & 128) != 0 ? userDataLoaded.biometricAutoTriggered : false, (r32 & 256) != 0 ? userDataLoaded.passkeyAutoTriggered : false, (r32 & 512) != 0 ? userDataLoaded.authMethodBeingTriggered : null, (r32 & 1024) != 0 ? userDataLoaded.isVerifyingCredentials : true, (r32 & 2048) != 0 ? userDataLoaded.biometricAttemptCount : 0, (r32 & 4096) != 0 ? userDataLoaded.passkeyAttemptCount : 0, (r32 & 8192) != 0 ? userDataLoaded.biometricManualCancelled : false, (r32 & 16384) != 0 ? userDataLoaded.passkeyManualCancelled : false);
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(copy4, objArr10 == true ? 1 : 0, i, objArr9 == true ? 1 : 0));
                }
                copy5 = userDataLoaded.copy((r32 & 1) != 0 ? userDataLoaded.displayName : null, (r32 & 2) != 0 ? userDataLoaded.publicCredential : null, (r32 & 4) != 0 ? userDataLoaded.loginCredential : null, (r32 & 8) != 0 ? userDataLoaded.avatarUrl : null, (r32 & 16) != 0 ? userDataLoaded.availableAuthOptions : null, (r32 & 32) != 0 ? userDataLoaded.isBiometricPromptShown : false, (r32 & 64) != 0 ? userDataLoaded.isPasskeyPromptShown : false, (r32 & 128) != 0 ? userDataLoaded.biometricAutoTriggered : false, (r32 & 256) != 0 ? userDataLoaded.passkeyAutoTriggered : true, (r32 & 512) != 0 ? userDataLoaded.authMethodBeingTriggered : null, (r32 & 1024) != 0 ? userDataLoaded.isVerifyingCredentials : false, (r32 & 2048) != 0 ? userDataLoaded.biometricAttemptCount : 0, (r32 & 4096) != 0 ? userDataLoaded.passkeyAttemptCount : 0, (r32 & 8192) != 0 ? userDataLoaded.biometricManualCancelled : false, (r32 & 16384) != 0 ? userDataLoaded.passkeyManualCancelled : false);
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(copy5, objArr12 == true ? 1 : 0, i, objArr11 == true ? 1 : 0));
            }
            copy6 = userDataLoaded.copy((r32 & 1) != 0 ? userDataLoaded.displayName : null, (r32 & 2) != 0 ? userDataLoaded.publicCredential : null, (r32 & 4) != 0 ? userDataLoaded.loginCredential : null, (r32 & 8) != 0 ? userDataLoaded.avatarUrl : null, (r32 & 16) != 0 ? userDataLoaded.availableAuthOptions : null, (r32 & 32) != 0 ? userDataLoaded.isBiometricPromptShown : false, (r32 & 64) != 0 ? userDataLoaded.isPasskeyPromptShown : false, (r32 & 128) != 0 ? userDataLoaded.biometricAutoTriggered : true, (r32 & 256) != 0 ? userDataLoaded.passkeyAutoTriggered : false, (r32 & 512) != 0 ? userDataLoaded.authMethodBeingTriggered : null, (r32 & 1024) != 0 ? userDataLoaded.isVerifyingCredentials : false, (r32 & 2048) != 0 ? userDataLoaded.biometricAttemptCount : 0, (r32 & 4096) != 0 ? userDataLoaded.passkeyAttemptCount : 0, (r32 & 8192) != 0 ? userDataLoaded.biometricManualCancelled : false, (r32 & 16384) != 0 ? userDataLoaded.passkeyManualCancelled : false);
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(copy6, objArr14 == true ? 1 : 0, i, objArr13 == true ? 1 : 0));
        }
        if (state instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Loading) {
            com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Loading loading = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataSuccess) {
                com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataSuccess userDataSuccess = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataSuccess) event;
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded(userDataSuccess.getDisplayName(), userDataSuccess.getPublicCredential(), userDataSuccess.getLoginCredential(), userDataSuccess.getAvatarUrl(), null, false, false, false, false, null, false, 0, 0, false, false, 32752, null), objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0));
            }
            if (event instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataError) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Error(((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataError) event).getMessage()), objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0));
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(loading, event));
        }
        if (!(state instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Error)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Error error = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Error) state;
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.LoadUserData.INSTANCE)) {
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Loading.INSTANCE, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.ChangeUser.INSTANCE)) {
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(error, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ChangeUser.INSTANCE));
        }
        return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(error, event));
    }
}
