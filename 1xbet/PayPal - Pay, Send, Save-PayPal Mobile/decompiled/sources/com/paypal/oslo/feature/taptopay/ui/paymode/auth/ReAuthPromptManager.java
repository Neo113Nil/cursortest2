package com.paypal.oslo.feature.taptopay.ui.paymode.auth;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002#$B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001aH\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ \u0010!\u001a\u00020 2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState$Success$AuthenticationRequired;", "authState", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager$AuthMethod;", "determineAuthMethod", "(Landroid/content/Context;Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState$Success$AuthenticationRequired;)Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager$AuthMethod;", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "useDeviceCredential", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthResult;", "showBiometricPrompt", "(Landroidx/fragment/app/FragmentActivity;ZLcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState$Success$AuthenticationRequired;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showAuthExpiredPrompt", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Intent;", "createKeyguardIntent", "(Landroid/content/Context;)Landroid/content/Intent;", "", "launchCustomAuth", "(Landroidx/fragment/app/FragmentActivity;Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState$Success$AuthenticationRequired;)V", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "Landroidx/biometric/BiometricPrompt$AuthenticationCallback;", "createBiometricCallback$taptopay_prodRelease", "(Lkotlinx/coroutines/CancellableContinuation;)Landroidx/biometric/BiometricPrompt$AuthenticationCallback;", "createAuthExpiredCallback$taptopay_prodRelease", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager$ReAuthOrchestrationResult;", "orchestrateAuthentication", "(Landroidx/fragment/app/FragmentActivity;Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState$Success$AuthenticationRequired;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ReAuthOrchestrationResult", "AuthMethod"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReAuthPromptManager {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ReAuthPromptManager() {
    }

    public final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod determineAuthMethod(android.content.Context context, com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired authState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authState, "");
        if (authState.getAuthenticationLauncher() != null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Using custom auth launcher from domain", null, null, 6, null);
            return com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod.CustomLauncher;
        }
        androidx.biometric.BiometricManager from = androidx.biometric.BiometricManager.from(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "");
        java.lang.Object systemService = context.getSystemService("keyguard");
        android.app.KeyguardManager keyguardManager = systemService instanceof android.app.KeyguardManager ? (android.app.KeyguardManager) systemService : null;
        int canAuthenticate = from.canAuthenticate(15);
        int canAuthenticate2 = android.os.Build.VERSION.SDK_INT >= 30 ? from.canAuthenticate(32768) : 12;
        if (canAuthenticate == 0) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Using BiometricPrompt with BIOMETRIC_STRONG", null, null, 6, null);
            return com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod.Biometric;
        }
        if (canAuthenticate2 == 0) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Using BiometricPrompt with DEVICE_CREDENTIAL (API 30+)", null, null, 6, null);
            return com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod.DeviceCredential;
        }
        if (keyguardManager != null && keyguardManager.isDeviceSecure()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Using KeyguardManager fallback", null, null, 6, null);
            return com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod.KeyguardManager;
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "No authentication method available", null, null, 6, null);
        return com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod.None;
    }

    public final android.content.Intent createKeyguardIntent(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("keyguard");
        android.app.KeyguardManager keyguardManager = systemService instanceof android.app.KeyguardManager ? (android.app.KeyguardManager) systemService : null;
        if (keyguardManager == null) {
            return null;
        }
        return keyguardManager.createConfirmDeviceCredentialIntent(context.getString(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_reauth_prompt_title), context.getString(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_reauth_prompt_subtitle));
    }

    public final void launchCustomAuth(androidx.fragment.app.FragmentActivity activity, com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired authState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authState, "");
        kotlin.jvm.functions.Function1<androidx.fragment.app.FragmentActivity, kotlin.Unit> authenticationLauncher = authState.getAuthenticationLauncher();
        if (authenticationLauncher != null) {
            authenticationLauncher.invoke(activity);
        }
    }

    public final androidx.biometric.BiometricPrompt.AuthenticationCallback createBiometricCallback$taptopay_prodRelease(final kotlinx.coroutines.CancellableContinuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "");
        return new androidx.biometric.BiometricPrompt.AuthenticationCallback() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager$createBiometricCallback$1
            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public final void onAuthenticationError(int errorCode, java.lang.CharSequence errString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errString, "");
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("BiometricPrompt error: ");
                sb.append(errorCode);
                sb.append(" - ");
                sb.append((java.lang.Object) errString);
                com.paypal.android.logger.Logger.d$default(logger, sb.toString(), null, null, 6, null);
                if (continuation.isActive()) {
                    com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult access$mapErrorToResult = com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.access$mapErrorToResult(this, errorCode);
                    kotlinx.coroutines.CancellableContinuation<com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult> cancellableContinuation = continuation;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(access$mapErrorToResult));
                }
            }

            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public final void onAuthenticationFailed() {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "BiometricPrompt authentication failed (retry allowed)", null, null, 6, null);
            }

            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public final void onAuthenticationSucceeded(androidx.biometric.BiometricPrompt.AuthenticationResult result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "BiometricPrompt authentication succeeded", null, null, 6, null);
                if (continuation.isActive()) {
                    kotlinx.coroutines.CancellableContinuation<com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult> cancellableContinuation = continuation;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.Success.INSTANCE));
                }
            }
        };
    }

    public final androidx.biometric.BiometricPrompt.AuthenticationCallback createAuthExpiredCallback$taptopay_prodRelease(final kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "");
        return new androidx.biometric.BiometricPrompt.AuthenticationCallback() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager$createAuthExpiredCallback$1
            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public final void onAuthenticationError(int errorCode, java.lang.CharSequence errString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errString, "");
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Auth expired prompt error: ");
                sb.append(errorCode);
                sb.append(" - ");
                sb.append((java.lang.Object) errString);
                com.paypal.android.logger.Logger.d$default(logger, sb.toString(), null, null, 6, null);
                if (continuation.isActive()) {
                    kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cancellableContinuation = continuation;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(java.lang.Boolean.FALSE));
                }
            }

            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public final void onAuthenticationFailed() {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Auth expired prompt failed (retry allowed)", null, null, 6, null);
            }

            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public final void onAuthenticationSucceeded(androidx.biometric.BiometricPrompt.AuthenticationResult result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Auth expired prompt succeeded", null, null, 6, null);
                if (continuation.isActive()) {
                    kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cancellableContinuation = continuation;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(java.lang.Boolean.TRUE));
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00df, code lost:
    
        if (r3 != r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0136, code lost:
    
        if (r3 == r5) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object orchestrateAuthentication(androidx.fragment.app.FragmentActivity fragmentActivity, com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired authenticationRequired, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult> continuation) {
        com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager$orchestrateAuthentication$1 reAuthPromptManager$orchestrateAuthentication$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager$orchestrateAuthentication$1) {
            reAuthPromptManager$orchestrateAuthentication$1 = (com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager$orchestrateAuthentication$1) continuation;
            if ((reAuthPromptManager$orchestrateAuthentication$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                reAuthPromptManager$orchestrateAuthentication$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = reAuthPromptManager$orchestrateAuthentication$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = reAuthPromptManager$orchestrateAuthentication$1.getHighSpeedVideoSizes;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult reAuthResult = (com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult) obj;
                        if (reAuthResult instanceof com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.Success) {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Biometric auth succeeded", null, null, 6, null);
                            return com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.Authenticated.INSTANCE;
                        }
                        if (!(reAuthResult instanceof com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.Failure)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Biometric auth failed: ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.Failure) reAuthResult).getReason())), null, null, 6, null);
                        return com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.Failed.INSTANCE;
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult reAuthResult2 = (com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult) obj;
                    if (reAuthResult2 instanceof com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.Success) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Biometric auth succeeded", null, null, 6, null);
                        return com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.Authenticated.INSTANCE;
                    }
                    if (!(reAuthResult2 instanceof com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.Failure)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Biometric auth failed: ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.Failure) reAuthResult2).getReason())), null, null, 6, null);
                    return com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.Failed.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.fragment.app.FragmentActivity fragmentActivity2 = fragmentActivity;
                com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod determineAuthMethod = determineAuthMethod(fragmentActivity2, authenticationRequired);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Handling re-auth with method: ".concat(java.lang.String.valueOf(determineAuthMethod)), null, null, 6, null);
                int i2 = com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.WhenMappings.$EnumSwitchMapping$0[determineAuthMethod.ordinal()];
                if (i2 == 1) {
                    launchCustomAuth(fragmentActivity, authenticationRequired);
                    return com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.CustomLauncherInvoked.INSTANCE;
                }
                if (i2 == 2) {
                    reAuthPromptManager$orchestrateAuthentication$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fragmentActivity);
                    reAuthPromptManager$orchestrateAuthentication$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationRequired);
                    reAuthPromptManager$orchestrateAuthentication$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(determineAuthMethod);
                    reAuthPromptManager$orchestrateAuthentication$1.getHighSpeedVideoSizes = 1;
                    obj = showBiometricPrompt(fragmentActivity, false, authenticationRequired, reAuthPromptManager$orchestrateAuthentication$1);
                } else {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "No authentication method available", null, null, null, 14, null);
                            return com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.Failed.INSTANCE;
                        }
                        android.content.Intent createKeyguardIntent = createKeyguardIntent(fragmentActivity2);
                        if (createKeyguardIntent != null) {
                            return new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.LaunchKeyguardIntent(createKeyguardIntent);
                        }
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to create KeyguardManager intent", null, null, null, 14, null);
                        return com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.Failed.INSTANCE;
                    }
                    reAuthPromptManager$orchestrateAuthentication$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fragmentActivity);
                    reAuthPromptManager$orchestrateAuthentication$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationRequired);
                    reAuthPromptManager$orchestrateAuthentication$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(determineAuthMethod);
                    reAuthPromptManager$orchestrateAuthentication$1.getHighSpeedVideoSizes = 2;
                    obj = showBiometricPrompt(fragmentActivity, true, authenticationRequired, reAuthPromptManager$orchestrateAuthentication$1);
                }
                return coroutine_suspended;
            }
        }
        reAuthPromptManager$orchestrateAuthentication$1 = new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager$orchestrateAuthentication$1(this, continuation);
        java.lang.Object obj2 = reAuthPromptManager$orchestrateAuthentication$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = reAuthPromptManager$orchestrateAuthentication$1.getHighSpeedVideoSizes;
        if (i == 0) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager$ReAuthOrchestrationResult;", "", "Authenticated", "Failed", "CustomLauncherInvoked", "LaunchKeyguardIntent", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager$ReAuthOrchestrationResult$Authenticated;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager$ReAuthOrchestrationResult$CustomLauncherInvoked;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager$ReAuthOrchestrationResult$Failed;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager$ReAuthOrchestrationResult$LaunchKeyguardIntent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface ReAuthOrchestrationResult {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager$ReAuthOrchestrationResult$Authenticated;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager$ReAuthOrchestrationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Authenticated implements com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.Authenticated INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.Authenticated();

            public final int hashCode() {
                return 1838073288;
            }

            private Authenticated() {
            }

            public final java.lang.String toString() {
                return "Authenticated";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.Authenticated)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager$ReAuthOrchestrationResult$Failed;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager$ReAuthOrchestrationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Failed implements com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.Failed INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.Failed();

            public final int hashCode() {
                return 1597648068;
            }

            private Failed() {
            }

            public final java.lang.String toString() {
                return "Failed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.Failed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager$ReAuthOrchestrationResult$CustomLauncherInvoked;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager$ReAuthOrchestrationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CustomLauncherInvoked implements com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.CustomLauncherInvoked INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.CustomLauncherInvoked();

            public final int hashCode() {
                return -30792684;
            }

            private CustomLauncherInvoked() {
            }

            public final java.lang.String toString() {
                return "CustomLauncherInvoked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.CustomLauncherInvoked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager$ReAuthOrchestrationResult$LaunchKeyguardIntent;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager$ReAuthOrchestrationResult;", "Landroid/content/Intent;", "intent", "<init>", "(Landroid/content/Intent;)V", "component1", "()Landroid/content/Intent;", "copy", "(Landroid/content/Intent;)Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager$ReAuthOrchestrationResult$LaunchKeyguardIntent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/content/Intent;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class LaunchKeyguardIntent implements com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult {
            public static final int $stable = 8;
            private final android.content.Intent intent;

            public LaunchKeyguardIntent(android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                this.intent = intent;
            }

            public final android.content.Intent getIntent() {
                return this.intent;
            }

            public final java.lang.String toString() {
                android.content.Intent intent = this.intent;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("LaunchKeyguardIntent(intent=");
                sb.append(intent);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.intent.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.LaunchKeyguardIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, ((com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.LaunchKeyguardIntent) other).intent);
            }

            public final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.LaunchKeyguardIntent copy(android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                return new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.LaunchKeyguardIntent(intent);
            }

            /* renamed from: component1, reason: from getter */
            public final android.content.Intent getIntent() {
                return this.intent;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.LaunchKeyguardIntent copy$default(com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.LaunchKeyguardIntent launchKeyguardIntent, android.content.Intent intent, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    intent = launchKeyguardIntent.intent;
                }
                return launchKeyguardIntent.copy(intent);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthPromptManager$AuthMethod;", "", "<init>", "(Ljava/lang/String;I)V", "CustomLauncher", "Biometric", "DeviceCredential", "KeyguardManager", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AuthMethod {
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod Biometric;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod CustomLauncher;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod DeviceCredential;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod KeyguardManager;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod None;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod[] getHighSpeedVideoSizes;

        private AuthMethod(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod authMethod = new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod("CustomLauncher", 0);
            CustomLauncher = authMethod;
            com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod authMethod2 = new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod("Biometric", 1);
            Biometric = authMethod2;
            com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod authMethod3 = new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod("DeviceCredential", 2);
            DeviceCredential = authMethod3;
            com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod authMethod4 = new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod("KeyguardManager", 3);
            KeyguardManager = authMethod4;
            com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod authMethod5 = new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, 4);
            None = authMethod5;
            com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod[] authMethodArr = {authMethod, authMethod2, authMethod3, authMethod4, authMethod5};
            getHighSpeedVideoSizes = authMethodArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(authMethodArr);
        }

        public static com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod[] values() {
            return (com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod[]) getHighSpeedVideoSizes.clone();
        }

        public static com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }

    public final java.lang.Object showBiometricPrompt(androidx.fragment.app.FragmentActivity fragmentActivity, boolean z, com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired authenticationRequired, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        java.util.concurrent.Executor mainExecutor = androidx.core.content.ContextCompat.getMainExecutor(fragmentActivity);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mainExecutor, "");
        authenticationRequired.getAuthErrorSetter().invoke(new kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.CharSequence, kotlin.Unit>() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager$showBiometricPrompt$2$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, java.lang.CharSequence charSequence) {
                int intValue = num.intValue();
                java.lang.CharSequence charSequence2 = charSequence;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Domain auth error callback invoked: ");
                sb.append(intValue);
                sb.append(" - ");
                sb.append((java.lang.Object) charSequence2);
                com.paypal.android.logger.Logger.d$default(logger, sb.toString(), null, null, 6, null);
                return kotlin.Unit.INSTANCE;
            }
        });
        authenticationRequired.getAuthFailedSetter().invoke(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager$showBiometricPrompt$2$2
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Domain auth failed callback invoked", null, null, 6, null);
                return kotlin.Unit.INSTANCE;
            }
        });
        authenticationRequired.getAuthSuccessSetter().invoke(new kotlin.jvm.functions.Function1<androidx.biometric.BiometricPrompt.AuthenticationResult, kotlin.Unit>() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager$showBiometricPrompt$2$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.biometric.BiometricPrompt.AuthenticationResult authenticationResult) {
                androidx.biometric.BiometricPrompt.AuthenticationResult authenticationResult2 = authenticationResult;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationResult2, "");
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Domain auth success callback invoked: ".concat(java.lang.String.valueOf(authenticationResult2.getAuthenticationType())), null, null, 6, null);
                return kotlin.Unit.INSTANCE;
            }
        });
        final androidx.biometric.BiometricPrompt biometricPrompt = new androidx.biometric.BiometricPrompt(fragmentActivity, mainExecutor, createBiometricCallback$taptopay_prodRelease(cancellableContinuationImpl2));
        androidx.biometric.BiometricPrompt.PromptInfo.Builder subtitle = new androidx.biometric.BiometricPrompt.PromptInfo.Builder().setTitle(fragmentActivity.getString(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_reauth_prompt_title)).setSubtitle(fragmentActivity.getString(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_reauth_prompt_subtitle));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(subtitle, "");
        if (z) {
            subtitle.setAllowedAuthenticators(32768);
        } else {
            subtitle.setAllowedAuthenticators(15);
            subtitle.setNegativeButtonText(fragmentActivity.getString(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_reauth_prompt_cancel));
        }
        androidx.biometric.BiometricPrompt.PromptInfo build = subtitle.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        try {
            biometricPrompt.authenticate(build);
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.oslo.feature.taptopay.LoggerKt.log.e("Failed to show BiometricPrompt - invalid configuration", e);
            if (cancellableContinuationImpl2.isActive()) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.Failure(com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason.PROMPT_FAILED)));
            }
        } catch (java.lang.IllegalStateException e2) {
            com.paypal.oslo.feature.taptopay.LoggerKt.log.e("Failed to show BiometricPrompt - invalid state", e2);
            if (cancellableContinuationImpl2.isActive()) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.Failure(com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason.PROMPT_FAILED)));
            }
        }
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager$showBiometricPrompt$2$4
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                androidx.biometric.BiometricPrompt.this.cancelAuthentication();
                return kotlin.Unit.INSTANCE;
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final java.lang.Object showAuthExpiredPrompt(androidx.fragment.app.FragmentActivity fragmentActivity, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        java.util.concurrent.Executor mainExecutor = androidx.core.content.ContextCompat.getMainExecutor(fragmentActivity);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mainExecutor, "");
        final androidx.biometric.BiometricPrompt biometricPrompt = new androidx.biometric.BiometricPrompt(fragmentActivity, mainExecutor, createAuthExpiredCallback$taptopay_prodRelease(cancellableContinuationImpl2));
        androidx.biometric.BiometricPrompt.PromptInfo build = new androidx.biometric.BiometricPrompt.PromptInfo.Builder().setTitle(fragmentActivity.getString(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_reauth_prompt_title)).setSubtitle(fragmentActivity.getString(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_reauth_prompt_subtitle)).setAllowedAuthenticators(32783).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        try {
            biometricPrompt.authenticate(build);
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.oslo.feature.taptopay.LoggerKt.log.e("Failed to show auth expired prompt - invalid configuration", e);
            if (cancellableContinuationImpl2.isActive()) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false)));
            }
        } catch (java.lang.IllegalStateException e2) {
            com.paypal.oslo.feature.taptopay.LoggerKt.log.e("Failed to show auth expired prompt - invalid state", e2);
            if (cancellableContinuationImpl2.isActive()) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false)));
            }
        }
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager$showAuthExpiredPrompt$2$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                androidx.biometric.BiometricPrompt.this.cancelAuthentication();
                return kotlin.Unit.INSTANCE;
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult access$mapErrorToResult(com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager reAuthPromptManager, int i) {
        com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason failureReason;
        if (i != 7) {
            if (i != 13) {
                if (i == 9) {
                    failureReason = com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason.LOCKOUT_PERMANENT;
                } else if (i != 10) {
                    failureReason = com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason.UNKNOWN;
                }
            }
            failureReason = com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason.USER_CANCELLED;
        } else {
            failureReason = com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason.LOCKOUT;
        }
        return new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.Failure(failureReason);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod.values().length];
            try {
                iArr[com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod.CustomLauncher.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod.Biometric.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod.DeviceCredential.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod.KeyguardManager.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.AuthMethod.None.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
