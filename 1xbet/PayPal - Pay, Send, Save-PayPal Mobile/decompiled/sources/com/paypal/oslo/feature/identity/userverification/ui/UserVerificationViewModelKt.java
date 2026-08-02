package com.paypal.oslo.feature.identity.userverification.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$SignUpWithGoogleCredential;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;", "toSignupIntent", "(Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$SignUpWithGoogleCredential;)Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UserVerificationViewModelKt {
    public static final com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent toSignupIntent(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpWithGoogleCredential signUpWithGoogleCredential) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signUpWithGoogleCredential, "");
        return new com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithGoogle(com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15922constructorimpl(signUpWithGoogleCredential.getEmail()), com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15931constructorimpl(signUpWithGoogleCredential.getFirstName()), com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15970constructorimpl(signUpWithGoogleCredential.getLastName()), com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl.m15988constructorimpl(signUpWithGoogleCredential.getProfileUrl()), com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken.m15952constructorimpl(signUpWithGoogleCredential.getGoogleIdToken()), null, 32, null);
    }
}
