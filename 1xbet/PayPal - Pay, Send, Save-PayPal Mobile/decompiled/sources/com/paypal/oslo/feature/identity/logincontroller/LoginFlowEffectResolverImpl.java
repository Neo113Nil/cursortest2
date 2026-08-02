package com.paypal.oslo.feature.identity.logincontroller;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/LoginFlowEffectResolverImpl;", "Lcom/paypal/oslo/feature/identity/logincontroller/LoginEffectResolver;", "<init>", "()V", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect;", "effect", "Landroidx/navigation3/runtime/NavKey;", "resolve", "(Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect;)Landroidx/navigation3/runtime/NavKey;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoginFlowEffectResolverImpl implements com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver {
    public static final int $stable = 0;

    @javax.inject.Inject
    public LoginFlowEffectResolverImpl() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    @Override // com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver
    public final androidx.navigation3.runtime.NavKey resolve(com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect effect) {
        com.paypal.oslo.feature.identity.login.domain.model.AuthOptions authOptions;
        com.paypal.oslo.feature.identity.login.domain.model.AuthOptions authOptions2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(effect, "");
        if (effect instanceof com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.NavigateToCredentialEntry) {
            com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.NavigateToCredentialEntry navigateToCredentialEntry = (com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.NavigateToCredentialEntry) effect;
            return new com.paypal.oslo.feature.identity.userverification.navigation.UserVerificationScreenDestination(navigateToCredentialEntry.getRequestId(), navigateToCredentialEntry.getAuthIntent(), (com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        if (effect instanceof com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.AuthMethodRequired) {
            com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.AuthMethodRequired authMethodRequired = (com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.AuthMethodRequired) effect;
            if (authMethodRequired.getAvailableMethods().isEmpty()) {
                return new com.paypal.oslo.feature.identity.passwordlogin.navigation.PasswordScreenDestination(authMethodRequired.getPublicCredential(), authMethodRequired.getRequestId(), authMethodRequired.getDisplayName(), authMethodRequired.getAuthIntent());
            }
            if (authMethodRequired.getPreferredMethod() != null) {
                authOptions2 = authMethodRequired.getPreferredMethod();
            } else if (authMethodRequired.getAvailableMethods().size() == 1) {
                authOptions2 = (com.paypal.oslo.feature.identity.login.domain.model.AuthOptions) kotlin.collections.CollectionsKt.first((java.util.List) authMethodRequired.getAvailableMethods());
            } else {
                java.util.Iterator it = authMethodRequired.getAvailableMethods().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        authOptions = 0;
                        break;
                    }
                    authOptions = it.next();
                    if (((com.paypal.oslo.feature.identity.login.domain.model.AuthOptions) authOptions) instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption) {
                        break;
                    }
                }
                authOptions2 = authOptions;
                if (authOptions2 == null) {
                    authOptions2 = (com.paypal.oslo.feature.identity.login.domain.model.AuthOptions) kotlin.collections.CollectionsKt.first((java.util.List) authMethodRequired.getAvailableMethods());
                }
            }
            java.lang.String publicCredential = authMethodRequired.getPublicCredential();
            java.lang.String requestId = authMethodRequired.getRequestId();
            com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent = authMethodRequired.getAuthIntent();
            if ((authOptions2 instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasskeyAuthOption) || (authOptions2 instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption) || (authOptions2 instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.BiometricAuthOption)) {
                return new com.paypal.oslo.feature.identity.passwordlogin.navigation.PasswordScreenDestination(publicCredential, requestId, publicCredential, authIntent);
            }
            if (!(authOptions2 instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption oTPAuthOption = (com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption) authOptions2;
            java.lang.String nonce = oTPAuthOption.getNonce();
            java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge> phoneChallenges = oTPAuthOption.getPhoneChallenges();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(phoneChallenges, 10));
            for (com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge phoneChallenge : phoneChallenges) {
                arrayList.add(new com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.model.PhoneData(phoneChallenge.getChallengeId(), phoneChallenge.getPhoneNumber(), phoneChallenge.isNotified()));
            }
            return new com.paypal.oslo.feature.identity.otplogin.verifyotp.navigation.OtpVerificationScreenDestination(requestId, publicCredential, new com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.model.OtpChallengeData(nonce, true, arrayList));
        }
        if (effect instanceof com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.ChallengeRequired) {
            com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.ChallengeRequired challengeRequired = (com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.ChallengeRequired) effect;
            return new com.paypal.oslo.feature.identity.stepup.navigation.StepupDestination(challengeRequired.getRequestId(), challengeRequired.getChallengeResult(), (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType) null, (com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        throw new java.lang.IllegalStateException("Should not reach here ".concat(java.lang.String.valueOf(effect)).toString());
    }
}
