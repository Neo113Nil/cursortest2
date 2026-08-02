package com.paypal.oslo.feature.identity.biometriclogin.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptManager;", "", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptFactory;", "biometricPromptFactory", "<init>", "(Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptFactory;)V", "Landroidx/fragment/app/FragmentActivity;", "activity", "Ljava/security/Signature;", "signature", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError;", "showPrompt", "(Landroidx/fragment/app/FragmentActivity;Ljava/security/Signature;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptFactory;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BiometricPromptManager {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptFactory getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public BiometricPromptManager(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptFactory biometricPromptFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricPromptFactory, "");
        this.getHighSpeedVideoFpsRanges = biometricPromptFactory;
    }

    public final java.lang.Object showPrompt(androidx.fragment.app.FragmentActivity fragmentActivity, java.security.Signature signature, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError, ? extends java.security.Signature>> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        java.util.concurrent.Executor mainExecutor = androidx.core.content.ContextCompat.getMainExecutor(fragmentActivity);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mainExecutor, "");
        final androidx.biometric.BiometricPrompt create = this.getHighSpeedVideoFpsRanges.create(fragmentActivity, mainExecutor, new androidx.biometric.BiometricPrompt.AuthenticationCallback() { // from class: com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptManager$showPrompt$2$callback$1
            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public final void onAuthenticationFailed() {
            }

            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public final void onAuthenticationError(int errorCode, java.lang.CharSequence errString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errString, "");
                if (cancellableContinuationImpl2.isActive()) {
                    kotlinx.coroutines.CancellableContinuation<arrow.core.Either<? extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError, ? extends java.security.Signature>> cancellableContinuation = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.INSTANCE.fromErrorCode(errorCode, errString.toString()))));
                }
            }

            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public final void onAuthenticationSucceeded(androidx.biometric.BiometricPrompt.AuthenticationResult result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                if (cancellableContinuationImpl2.isActive()) {
                    androidx.biometric.BiometricPrompt.CryptoObject cryptoObject = result.getCryptoObject();
                    java.security.Signature signature2 = cryptoObject != null ? cryptoObject.getSignature() : null;
                    if (signature2 != null) {
                        kotlinx.coroutines.CancellableContinuation<arrow.core.Either<? extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError, ? extends java.security.Signature>> cancellableContinuation = cancellableContinuationImpl2;
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(arrow.core.EitherKt.right(signature2)));
                    } else {
                        kotlinx.coroutines.CancellableContinuation<arrow.core.Either<? extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError, ? extends java.security.Signature>> cancellableContinuation2 = cancellableContinuationImpl2;
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        cancellableContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.SignatureNotReturned.INSTANCE)));
                    }
                }
            }
        });
        androidx.biometric.BiometricPrompt.PromptInfo build = new androidx.biometric.BiometricPrompt.PromptInfo.Builder().setTitle(fragmentActivity.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_biometric_prompt_title)).setSubtitle(fragmentActivity.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_biometric_prompt_subtitle)).setNegativeButtonText(fragmentActivity.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_biometric_prompt_cancel)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        create.authenticate(build, new androidx.biometric.BiometricPrompt.CryptoObject(signature));
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptManager$showPrompt$2$1
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
}
