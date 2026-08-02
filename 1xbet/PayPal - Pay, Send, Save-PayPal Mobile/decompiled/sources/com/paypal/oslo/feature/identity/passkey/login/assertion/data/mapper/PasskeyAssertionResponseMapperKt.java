package com.paypal.oslo.feature.identity.passkey.login.assertion.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/credentials/GetCredentialResponse;", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;", "passkeyLoginCredentialChallenge", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionResult;", "toDomain", "(Landroidx/credentials/GetCredentialResponse;Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyAssertionResponseMapperKt {
    public static final arrow.core.Either<com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError, com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionResult> toDomain(androidx.view.GetCredentialResponse getCredentialResponse, com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge passkeyLoginCredentialChallenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCredentialResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyLoginCredentialChallenge, "");
        androidx.view.Credential credential = getCredentialResponse.getCredential();
        if (!(credential instanceof androidx.view.PublicKeyCredential)) {
            java.lang.String simpleName = credential.getClass().getSimpleName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "");
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.InvalidCredentialType(null, simpleName, null, 5, null));
        }
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess(((androidx.view.PublicKeyCredential) credential).getAuthenticationResponseJson(), passkeyLoginCredentialChallenge));
    }
}
