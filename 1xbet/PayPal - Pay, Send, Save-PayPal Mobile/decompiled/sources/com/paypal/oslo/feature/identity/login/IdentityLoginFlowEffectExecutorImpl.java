package com.paypal.oslo.feature.identity.login;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0015\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u001a\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u0015\u0010\u001cR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/identity/login/IdentityLoginFlowEffectExecutorImpl;", "Lcom/paypal/oslo/feature/identity/login/IdentityLoginFlowEffectExecutor;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginUseCase;", "biometricLoginUseCase", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/usecase/PasskeyLoginUseCase;", "passkeyLoginUseCase", "Lcom/paypal/oslo/feature/identity/userverification/domain/usecase/VerifyCredentialUseCase;", "verifyCredentialUseCase", "Lcom/paypal/oslo/feature/identity/login/ActivityProvider;", "activityProvider", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "<init>", "(Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginUseCase;Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/usecase/PasskeyLoginUseCase;Lcom/paypal/oslo/feature/identity/userverification/domain/usecase/VerifyCredentialUseCase;Lcom/paypal/oslo/feature/identity/login/ActivityProvider;Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect;", "effect", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;", "execute", "(Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$PrefetchAuthOptions;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect$PrefetchAuthOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginUseCase;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/usecase/PasskeyLoginUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/userverification/domain/usecase/VerifyCredentialUseCase;", "Lcom/paypal/oslo/feature/identity/login/ActivityProvider;", "Lcom/paypal/oslo/core/navigation/AppNavigator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IdentityLoginFlowEffectExecutorImpl implements com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutor {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.login.ActivityProvider getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public IdentityLoginFlowEffectExecutorImpl(com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase biometricLoginUseCase, com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase passkeyLoginUseCase, com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase verifyCredentialUseCase, com.paypal.oslo.feature.identity.login.ActivityProvider activityProvider, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricLoginUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyLoginUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verifyCredentialUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.getHighSpeedVideoFpsRangesFor = biometricLoginUseCase;
        this.getHighSpeedVideoFpsRanges = passkeyLoginUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = verifyCredentialUseCase;
        this.getHighSpeedVideoSizes = activityProvider;
        this.Camera2StreamConfigurationMap = appNavigator;
    }

    @Override // com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutor
    public final java.lang.Object execute(com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect identityLoginFlowEffect, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction> continuation) {
        if (identityLoginFlowEffect instanceof com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.AttemptBiometric) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(continuation);
            return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : (com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction) highSpeedVideoSizes;
        }
        if (identityLoginFlowEffect instanceof com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.AttemptPasskey) {
            java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(continuation);
            return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : (com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction) highSpeedVideoFpsRangesFor;
        }
        if (identityLoginFlowEffect instanceof com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.PrefetchAuthOptions) {
            java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.PrefetchAuthOptions) identityLoginFlowEffect, continuation);
            return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : (com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction) highResolutionOutputSizeshNQ4ISI;
        }
        if (!(identityLoginFlowEffect instanceof com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToFullScreenAuth)) {
            if (!(identityLoginFlowEffect instanceof com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToInContextBottomSheet)) {
                if (!(identityLoginFlowEffect instanceof com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToStepUpChallenge)) {
                    if (!(identityLoginFlowEffect instanceof com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.RunPostLogin)) {
                        if (identityLoginFlowEffect instanceof com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.DismissAuthUI) {
                            return Camera2StreamConfigurationMap(continuation);
                        }
                        if (identityLoginFlowEffect instanceof com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.CancelInFlightEffects) {
                            return null;
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PostLoginResult(((com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.RunPostLogin) identityLoginFlowEffect).getToken());
                }
                com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.CredentialEntryResult credentialEntryResult = new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.CredentialEntryResult(arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE));
                return credentialEntryResult == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? credentialEntryResult : credentialEntryResult;
            }
            java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeNavigateToInContextBottomSheet$2(this, com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU(), (com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToInContextBottomSheet) identityLoginFlowEffect, null), continuation);
            return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : (com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction) withContext;
        }
        java.lang.Object withContext2 = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeNavigateToFullScreen$2(this, com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU(), (com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToFullScreenAuth) identityLoginFlowEffect, null), continuation);
        return withContext2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext2 : (com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction) withContext2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult$NotEligible] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction> continuation) {
        com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeAttemptBiometric$1 identityLoginFlowEffectExecutorImpl$executeAttemptBiometric$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeAttemptBiometric$1) {
                identityLoginFlowEffectExecutorImpl$executeAttemptBiometric$1 = (com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeAttemptBiometric$1) continuation;
                if ((identityLoginFlowEffectExecutorImpl$executeAttemptBiometric$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    identityLoginFlowEffectExecutorImpl$executeAttemptBiometric$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = identityLoginFlowEffectExecutorImpl$executeAttemptBiometric$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = identityLoginFlowEffectExecutorImpl$executeAttemptBiometric$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.fragment.app.FragmentActivity currentActivity = this.getHighSpeedVideoSizes.getCurrentActivity();
                        if (currentActivity == null) {
                            return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.BiometricResult(com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.NotEligible.INSTANCE);
                        }
                        kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                        objectRef2.element = com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.NotEligible.INSTANCE;
                        kotlinx.coroutines.MainCoroutineDispatcher main = kotlinx.coroutines.Dispatchers.getMain();
                        com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeAttemptBiometric$2 identityLoginFlowEffectExecutorImpl$executeAttemptBiometric$2 = new com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeAttemptBiometric$2(this, currentActivity, objectRef2, null);
                        identityLoginFlowEffectExecutorImpl$executeAttemptBiometric$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currentActivity);
                        identityLoginFlowEffectExecutorImpl$executeAttemptBiometric$1.getHighSpeedVideoFpsRangesFor = objectRef2;
                        identityLoginFlowEffectExecutorImpl$executeAttemptBiometric$1.getHighSpeedVideoSizes = 1;
                        if (kotlinx.coroutines.BuildersKt.withContext(main, identityLoginFlowEffectExecutorImpl$executeAttemptBiometric$2, identityLoginFlowEffectExecutorImpl$executeAttemptBiometric$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef = objectRef2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) identityLoginFlowEffectExecutorImpl$executeAttemptBiometric$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.BiometricResult((com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult) objectRef.element);
                }
            }
            if (i != 0) {
            }
            return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.BiometricResult((com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult) objectRef.element);
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            java.lang.Exception exc = e2;
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Biometric login error", exc);
            return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.BiometricResult(new com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.Failed(exc));
        }
        identityLoginFlowEffectExecutorImpl$executeAttemptBiometric$1 = new com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeAttemptBiometric$1(this, continuation);
        java.lang.Object obj2 = identityLoginFlowEffectExecutorImpl$executeAttemptBiometric$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identityLoginFlowEffectExecutorImpl$executeAttemptBiometric$1.getHighSpeedVideoSizes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[Catch: Exception -> 0x00d9, CancellationException -> 0x00f2, TryCatch #2 {CancellationException -> 0x00f2, Exception -> 0x00d9, blocks: (B:11:0x002b, B:12:0x0065, B:14:0x006b, B:16:0x007b, B:17:0x00a5, B:18:0x00d0, B:21:0x0094, B:23:0x0098, B:24:0x00ab, B:25:0x00b0, B:26:0x00b1, B:28:0x00b5, B:31:0x00c1, B:32:0x00ca, B:33:0x00c6, B:34:0x00d3, B:35:0x00d8, B:42:0x004c), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1 A[Catch: Exception -> 0x00d9, CancellationException -> 0x00f2, TryCatch #2 {CancellationException -> 0x00f2, Exception -> 0x00d9, blocks: (B:11:0x002b, B:12:0x0065, B:14:0x006b, B:16:0x007b, B:17:0x00a5, B:18:0x00d0, B:21:0x0094, B:23:0x0098, B:24:0x00ab, B:25:0x00b0, B:26:0x00b1, B:28:0x00b5, B:31:0x00c1, B:32:0x00ca, B:33:0x00c6, B:34:0x00d3, B:35:0x00d8, B:42:0x004c), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction> continuation) {
        com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeAttemptPasskey$1 identityLoginFlowEffectExecutorImpl$executeAttemptPasskey$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.NotEligible notEligible;
        com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PasskeyResult passkeyResult;
        com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.ChallengeRequired challengeRequired;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeAttemptPasskey$1) {
                identityLoginFlowEffectExecutorImpl$executeAttemptPasskey$1 = (com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeAttemptPasskey$1) continuation;
                if ((identityLoginFlowEffectExecutorImpl$executeAttemptPasskey$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    identityLoginFlowEffectExecutorImpl$executeAttemptPasskey$1.getHighSpeedVideoSizes -= 2147483648;
                    com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeAttemptPasskey$1 identityLoginFlowEffectExecutorImpl$executeAttemptPasskey$12 = identityLoginFlowEffectExecutorImpl$executeAttemptPasskey$1;
                    java.lang.Object obj = identityLoginFlowEffectExecutorImpl$executeAttemptPasskey$12.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = identityLoginFlowEffectExecutorImpl$executeAttemptPasskey$12.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.fragment.app.FragmentActivity currentActivity = this.getHighSpeedVideoSizes.getCurrentActivity();
                        if (currentActivity == null) {
                            return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PasskeyResult(com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.NotEligible.INSTANCE);
                        }
                        identityLoginFlowEffectExecutorImpl$executeAttemptPasskey$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currentActivity);
                        identityLoginFlowEffectExecutorImpl$executeAttemptPasskey$12.getHighSpeedVideoSizes = 1;
                        obj = com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase.invoke$default(this.getHighSpeedVideoFpsRanges, currentActivity, null, identityLoginFlowEffectExecutorImpl$executeAttemptPasskey$12, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    either = (arrow.core.Either) obj;
                    if (!(either instanceof arrow.core.Either.Right)) {
                        com.paypal.oslo.feature.identity.login.domain.model.LoginResult loginResult = ((com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess) ((arrow.core.Either.Right) either).getValue()).getLoginResult();
                        if (loginResult instanceof com.paypal.oslo.feature.identity.login.domain.model.Success) {
                            challengeRequired = new com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.Success(new com.paypal.oslo.core.identity.domain.model.Token.UserAccessToken(((com.paypal.oslo.feature.identity.login.domain.model.Success) loginResult).getFirstPartyUserAccessToken().getTokenValue()));
                        } else {
                            if (!(loginResult instanceof com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            challengeRequired = new com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.ChallengeRequired(((com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired) loginResult).getChallengeResult());
                        }
                        passkeyResult = new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PasskeyResult(challengeRequired);
                    } else {
                        if (!(either instanceof arrow.core.Either.Left)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        if (((com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError) ((arrow.core.Either.Left) either).getValue()) instanceof com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError.AssertionFailed) {
                            notEligible = com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.UserCancelled.INSTANCE;
                        } else {
                            notEligible = com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.NotEligible.INSTANCE;
                        }
                        passkeyResult = new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PasskeyResult(notEligible);
                    }
                    return passkeyResult;
                }
            }
            if (i != 0) {
            }
            either = (arrow.core.Either) obj;
            if (!(either instanceof arrow.core.Either.Right)) {
            }
            return passkeyResult;
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            java.lang.Exception exc = e2;
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Passkey login error", exc);
            return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PasskeyResult(new com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.Failed(exc));
        }
        identityLoginFlowEffectExecutorImpl$executeAttemptPasskey$1 = new com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeAttemptPasskey$1(this, continuation);
        com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeAttemptPasskey$1 identityLoginFlowEffectExecutorImpl$executeAttemptPasskey$122 = identityLoginFlowEffectExecutorImpl$executeAttemptPasskey$1;
        java.lang.Object obj2 = identityLoginFlowEffectExecutorImpl$executeAttemptPasskey$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identityLoginFlowEffectExecutorImpl$executeAttemptPasskey$122.getHighSpeedVideoSizes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.PrefetchAuthOptions prefetchAuthOptions, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction> continuation) {
        com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executePrefetchAuthOptions$1 identityLoginFlowEffectExecutorImpl$executePrefetchAuthOptions$1;
        int i;
        arrow.core.Either either;
        java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> listOf;
        if (continuation instanceof com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executePrefetchAuthOptions$1) {
            identityLoginFlowEffectExecutorImpl$executePrefetchAuthOptions$1 = (com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executePrefetchAuthOptions$1) continuation;
            if ((identityLoginFlowEffectExecutorImpl$executePrefetchAuthOptions$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                identityLoginFlowEffectExecutorImpl$executePrefetchAuthOptions$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = identityLoginFlowEffectExecutorImpl$executePrefetchAuthOptions$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = identityLoginFlowEffectExecutorImpl$executePrefetchAuthOptions$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) prefetchAuthOptions.getCredential(), (java.lang.CharSequence) "@", false, 2, (java.lang.Object) null)) {
                        com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential emailCredential = new com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential(prefetchAuthOptions.getCredential(), null, 2, null);
                        com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase verifyCredentialUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest verifyCredentialRequest = new com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest(com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LOGIN, emailCredential);
                        identityLoginFlowEffectExecutorImpl$executePrefetchAuthOptions$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(prefetchAuthOptions);
                        identityLoginFlowEffectExecutorImpl$executePrefetchAuthOptions$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailCredential);
                        identityLoginFlowEffectExecutorImpl$executePrefetchAuthOptions$1.getHighSpeedVideoFpsRanges = 1;
                        obj = verifyCredentialUseCase.invoke(verifyCredentialRequest, identityLoginFlowEffectExecutorImpl$executePrefetchAuthOptions$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Skipping auth options prefetch for non-email credential", null, null, 6, null);
                        return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.AuthOptionsResult(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption.INSTANCE));
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult verifyCredentialResult = (com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult) ((arrow.core.Either.Right) either).getValue();
                    listOf = verifyCredentialResult instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.VerifyCredentialSuccess ? ((com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.VerifyCredentialSuccess) verifyCredentialResult).getAuthOptions() : kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption.INSTANCE);
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "VerifyCredential prefetch failed, defaulting to password", null, null, 6, null);
                    listOf = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption.INSTANCE);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.AuthOptionsResult(listOf);
            }
        }
        identityLoginFlowEffectExecutorImpl$executePrefetchAuthOptions$1 = new com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executePrefetchAuthOptions$1(this, continuation);
        java.lang.Object obj2 = identityLoginFlowEffectExecutorImpl$executePrefetchAuthOptions$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identityLoginFlowEffectExecutorImpl$executePrefetchAuthOptions$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.AuthOptionsResult(listOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction> continuation) {
        com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeDismissAuthUI$1 identityLoginFlowEffectExecutorImpl$executeDismissAuthUI$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeDismissAuthUI$1) {
            identityLoginFlowEffectExecutorImpl$executeDismissAuthUI$1 = (com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeDismissAuthUI$1) continuation;
            if ((identityLoginFlowEffectExecutorImpl$executeDismissAuthUI$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                identityLoginFlowEffectExecutorImpl$executeDismissAuthUI$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = identityLoginFlowEffectExecutorImpl$executeDismissAuthUI$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = identityLoginFlowEffectExecutorImpl$executeDismissAuthUI$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.MainCoroutineDispatcher main = kotlinx.coroutines.Dispatchers.getMain();
                    com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeDismissAuthUI$2 identityLoginFlowEffectExecutorImpl$executeDismissAuthUI$2 = new com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeDismissAuthUI$2(this, null);
                    identityLoginFlowEffectExecutorImpl$executeDismissAuthUI$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.BuildersKt.withContext(main, identityLoginFlowEffectExecutorImpl$executeDismissAuthUI$2, identityLoginFlowEffectExecutorImpl$executeDismissAuthUI$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return null;
            }
        }
        identityLoginFlowEffectExecutorImpl$executeDismissAuthUI$1 = new com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeDismissAuthUI$1(this, continuation);
        java.lang.Object obj2 = identityLoginFlowEffectExecutorImpl$executeDismissAuthUI$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identityLoginFlowEffectExecutorImpl$executeDismissAuthUI$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086 A[Catch: Exception -> 0x00ce, CancellationException -> 0x00e6, TryCatch #2 {CancellationException -> 0x00e6, Exception -> 0x00ce, blocks: (B:11:0x002e, B:12:0x007c, B:14:0x0086, B:15:0x00c5, B:18:0x00a3, B:20:0x00a7, B:21:0x00c8, B:22:0x00cd, B:29:0x0060), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3 A[Catch: Exception -> 0x00ce, CancellationException -> 0x00e6, TryCatch #2 {CancellationException -> 0x00e6, Exception -> 0x00ce, blocks: (B:11:0x002e, B:12:0x007c, B:14:0x0086, B:15:0x00c5, B:18:0x00a3, B:20:0x00a7, B:21:0x00c8, B:22:0x00cd, B:29:0x0060), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction> continuation) {
        com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$awaitNavResult$1 identityLoginFlowEffectExecutorImpl$awaitNavResult$1;
        int i;
        arrow.core.Either<com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled, com.paypal.oslo.core.identity.domain.model.Token> result;
        com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.CredentialEntryResult credentialEntryResult;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$awaitNavResult$1) {
                identityLoginFlowEffectExecutorImpl$awaitNavResult$1 = (com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$awaitNavResult$1) continuation;
                if ((identityLoginFlowEffectExecutorImpl$awaitNavResult$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    identityLoginFlowEffectExecutorImpl$awaitNavResult$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = identityLoginFlowEffectExecutorImpl$awaitNavResult$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = identityLoginFlowEffectExecutorImpl$awaitNavResult$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        final kotlinx.coroutines.flow.Flow<java.lang.Object> m11582getScopedResultFlowInternalDpEMydE = this.Camera2StreamConfigurationMap.getNavResultManager().m11582getScopedResultFlowInternalDpEMydE(str);
                        if (m11582getScopedResultFlowInternalDpEMydE == null) {
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Authentication result flow was null", null, null, 6, null);
                            return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.CredentialEntryResult(arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE));
                        }
                        kotlinx.coroutines.flow.Flow<java.lang.Object> flow = new kotlinx.coroutines.flow.Flow<java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$awaitNavResult-qCNXlvQ$$inlined$filterIsInstance$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector, kotlin.coroutines.Continuation continuation2) {
                                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$awaitNavResultqCNXlvQ$$inlined$filterIsInstance$1.AnonymousClass2(flowCollector), continuation2);
                                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                            }

                            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                            /* renamed from: com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$awaitNavResult-qCNXlvQ$$inlined$filterIsInstance$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                                    com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$awaitNavResultqCNXlvQ$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                                    int i;
                                    if (continuation instanceof com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$awaitNavResultqCNXlvQ$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) {
                                        anonymousClass1 = (com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$awaitNavResultqCNXlvQ$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) continuation;
                                        if ((anonymousClass1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                                            anonymousClass1.getOutputMinFrameDuration -= 2147483648;
                                            java.lang.Object obj2 = anonymousClass1.getInputFormats;
                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            i = anonymousClass1.getOutputMinFrameDuration;
                                            if (i != 0) {
                                                kotlin.ResultKt.throwOnFailure(obj2);
                                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                                if (obj instanceof com.paypal.oslo.feature.identity.api.navigation.result.AuthenticationNavResult) {
                                                    anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                                    anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                                    anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                                    anonymousClass1.getHighSpeedVideoFpsRangesFor = 0;
                                                    anonymousClass1.getOutputMinFrameDuration = 1;
                                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                int i2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoSizes;
                                                java.lang.Object obj4 = anonymousClass1.Camera2StreamConfigurationMap;
                                                kotlin.ResultKt.throwOnFailure(obj2);
                                            }
                                            return kotlin.Unit.INSTANCE;
                                        }
                                    }
                                    anonymousClass1 = new com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$awaitNavResultqCNXlvQ$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1(continuation);
                                    java.lang.Object obj22 = anonymousClass1.getInputFormats;
                                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.getOutputMinFrameDuration;
                                    if (i != 0) {
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }

                                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$awaitNavResult-qCNXlvQ$$inlined$filterIsInstance$1$2", f = "IdentityLoginFlowEffectExecutor.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, nl = {52}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                                /* renamed from: com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$awaitNavResult-qCNXlvQ$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                                    java.lang.Object Camera2StreamConfigurationMap;
                                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                                    java.lang.Object getHighSpeedVideoFpsRanges;
                                    int getHighSpeedVideoFpsRangesFor;
                                    java.lang.Object getHighSpeedVideoSizes;
                                    /* synthetic */ java.lang.Object getInputFormats;
                                    int getOutputMinFrameDuration;

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                        this.getInputFormats = obj;
                                        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
                                        return com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$awaitNavResultqCNXlvQ$$inlined$filterIsInstance$1.AnonymousClass2.this.emit(null, this);
                                    }

                                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                        super(continuation);
                                    }
                                }

                                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                                    this.Camera2StreamConfigurationMap = flowCollector;
                                }
                            }
                        };
                        identityLoginFlowEffectExecutorImpl$awaitNavResult$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        identityLoginFlowEffectExecutorImpl$awaitNavResult$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(m11582getScopedResultFlowInternalDpEMydE);
                        identityLoginFlowEffectExecutorImpl$awaitNavResult$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = kotlinx.coroutines.flow.FlowKt.first(flow, identityLoginFlowEffectExecutorImpl$awaitNavResult$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    result = ((com.paypal.oslo.feature.identity.api.navigation.result.AuthenticationNavResult) obj).getResult();
                    if (!(result instanceof arrow.core.Either.Right)) {
                        com.paypal.oslo.core.identity.domain.model.Token token = (com.paypal.oslo.core.identity.domain.model.Token) ((arrow.core.Either.Right) result).getValue();
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Authentication completed successfully", null, null, 6, null);
                        credentialEntryResult = new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.CredentialEntryResult(arrow.core.EitherKt.right(token));
                    } else {
                        if (!(result instanceof arrow.core.Either.Left)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "User cancelled authentication", null, null, 6, null);
                        credentialEntryResult = new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.CredentialEntryResult(arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE));
                    }
                    return credentialEntryResult;
                }
            }
            if (i != 0) {
            }
            result = ((com.paypal.oslo.feature.identity.api.navigation.result.AuthenticationNavResult) obj).getResult();
            if (!(result instanceof arrow.core.Either.Right)) {
            }
            return credentialEntryResult;
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Error waiting for authentication result", e2);
            return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.CredentialEntryResult(arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE));
        }
        identityLoginFlowEffectExecutorImpl$awaitNavResult$1 = new com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$awaitNavResult$1(this, continuation);
        java.lang.Object obj2 = identityLoginFlowEffectExecutorImpl$awaitNavResult$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identityLoginFlowEffectExecutorImpl$awaitNavResult$1.getHighSpeedVideoFpsRangesFor;
    }

    public static final /* synthetic */ java.lang.Object access$executeNavigateToStepUp(com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl identityLoginFlowEffectExecutorImpl, kotlin.coroutines.Continuation continuation) {
        return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.CredentialEntryResult(arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE));
    }
}
