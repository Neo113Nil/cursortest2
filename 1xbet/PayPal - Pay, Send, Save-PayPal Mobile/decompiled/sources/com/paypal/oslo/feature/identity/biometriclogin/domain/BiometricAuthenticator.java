package com.paypal.oslo.feature.identity.biometriclogin.domain;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J,\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/domain/BiometricAuthenticator;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "Ljava/security/Signature;", "signature", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;", "authenticate", "(Landroidx/fragment/app/FragmentActivity;Ljava/security/Signature;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BiometricAuthenticator {
    java.lang.Object authenticate(androidx.fragment.app.FragmentActivity fragmentActivity, java.security.Signature signature, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError, ? extends java.security.Signature>> continuation);
}
