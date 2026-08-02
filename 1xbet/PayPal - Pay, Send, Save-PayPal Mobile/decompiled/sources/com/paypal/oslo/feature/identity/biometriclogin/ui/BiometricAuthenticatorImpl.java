package com.paypal.oslo.feature.identity.biometriclogin.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAuthenticatorImpl;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/BiometricAuthenticator;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptManager;", "biometricPromptManager", "<init>", "(Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptManager;)V", "Landroidx/fragment/app/FragmentActivity;", "activity", "Ljava/security/Signature;", "signature", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;", "authenticate", "(Landroidx/fragment/app/FragmentActivity;Ljava/security/Signature;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptManager;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BiometricAuthenticatorImpl implements com.paypal.oslo.feature.identity.biometriclogin.domain.BiometricAuthenticator {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptManager getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public BiometricAuthenticatorImpl(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptManager biometricPromptManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricPromptManager, "");
        this.getHighSpeedVideoFpsRanges = biometricPromptManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.identity.biometriclogin.domain.BiometricAuthenticator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object authenticate(androidx.fragment.app.FragmentActivity fragmentActivity, java.security.Signature signature, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError, ? extends java.security.Signature>> continuation) {
        com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAuthenticatorImpl$authenticate$1 biometricAuthenticatorImpl$authenticate$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAuthenticatorImpl$authenticate$1) {
            biometricAuthenticatorImpl$authenticate$1 = (com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAuthenticatorImpl$authenticate$1) continuation;
            if ((biometricAuthenticatorImpl$authenticate$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                biometricAuthenticatorImpl$authenticate$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = biometricAuthenticatorImpl$authenticate$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = biometricAuthenticatorImpl$authenticate$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptManager biometricPromptManager = this.getHighSpeedVideoFpsRanges;
                    biometricAuthenticatorImpl$authenticate$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fragmentActivity);
                    biometricAuthenticatorImpl$authenticate$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(signature);
                    biometricAuthenticatorImpl$authenticate$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = biometricPromptManager.showPrompt(fragmentActivity, signature, biometricAuthenticatorImpl$authenticate$1);
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
                if (!(either instanceof arrow.core.Either.Left)) {
                    return new arrow.core.Either.Left(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginErrorMapperKt.toBiometricLoginError((com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError) ((arrow.core.Either.Left) either).getValue()));
                }
                if (either instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        biometricAuthenticatorImpl$authenticate$1 = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAuthenticatorImpl$authenticate$1(this, continuation);
        java.lang.Object obj2 = biometricAuthenticatorImpl$authenticate$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = biometricAuthenticatorImpl$authenticate$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }
}
