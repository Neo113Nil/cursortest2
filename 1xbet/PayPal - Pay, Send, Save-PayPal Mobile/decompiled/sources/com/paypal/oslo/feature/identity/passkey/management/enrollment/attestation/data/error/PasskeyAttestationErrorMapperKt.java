package com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.error;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00060\u0004j\u0002`\u0005H\u0000¢\u0006\u0004\b\u0002\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationError;", "toDomain", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationError;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "(Ljava/lang/Exception;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyAttestationErrorMapperKt {
    public static final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError toDomain(com.paypal.oslo.core.network.http.error.NetworkError networkError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.NetworkError(((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) networkError).getCause());
        }
        if (!(networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError)) {
            if (!(networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.UnknownError(((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) networkError).getCause(), null, 2, null);
        }
        com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) networkError;
        int code = httpError.getCode();
        if (code == 401) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.AuthenticationError(null, 1, null);
        }
        if (code == 404) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.NotFoundError(null, 1, null);
        }
        if (code == 500) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.ServerError(httpError.getCode(), null, 2, null);
        }
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.UnknownError(null, java.lang.String.valueOf(httpError.getCode()), 1, null);
    }

    public static final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError toDomain(java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        if ((exc instanceof java.net.UnknownHostException) || (exc instanceof java.net.ConnectException) || (exc instanceof java.net.SocketTimeoutException)) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.NetworkError(exc);
        }
        if (exc instanceof java.lang.IllegalArgumentException) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.ValidationError(exc);
        }
        if (exc instanceof java.lang.IllegalStateException) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.InvalidState(exc);
        }
        if (exc instanceof java.lang.SecurityException) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.SecurityError(exc);
        }
        boolean z = exc instanceof androidx.view.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
        if (!z && !(exc instanceof androidx.view.exceptions.CreateCredentialCancellationException) && !(exc instanceof androidx.view.exceptions.CreateCredentialInterruptedException) && !(exc instanceof androidx.view.exceptions.CreateCredentialNoCreateOptionException) && !(exc instanceof androidx.view.exceptions.CreateCredentialProviderConfigurationException) && !(exc instanceof java.lang.UnsupportedOperationException) && !(exc instanceof androidx.view.exceptions.CreateCredentialException)) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.UnknownError(exc, null);
        }
        if (z) {
            androidx.view.exceptions.publickeycredential.CreatePublicKeyCredentialDomException createPublicKeyCredentialDomException = (androidx.view.exceptions.publickeycredential.CreatePublicKeyCredentialDomException) exc;
            return createPublicKeyCredentialDomException.getDomError() instanceof androidx.view.exceptions.domerrors.InvalidStateError ? new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.CredentialAlreadyExists(createPublicKeyCredentialDomException) : new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.UnknownError(createPublicKeyCredentialDomException, "DOM_ERROR");
        }
        if (exc instanceof androidx.view.exceptions.CreateCredentialCancellationException) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.UserCancelled(exc);
        }
        if (exc instanceof androidx.view.exceptions.CreateCredentialInterruptedException) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.Interrupted(exc);
        }
        if (exc instanceof androidx.view.exceptions.CreateCredentialNoCreateOptionException) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.NoCreateOption(exc);
        }
        if (exc instanceof androidx.view.exceptions.CreateCredentialProviderConfigurationException) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.ProviderNotAvailable(exc);
        }
        if (exc instanceof java.lang.UnsupportedOperationException) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.UnsupportedPlatform(exc);
        }
        if (exc instanceof androidx.view.exceptions.CreateCredentialException) {
            return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.UnknownError(exc, "CREDENTIAL_ERROR");
        }
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.UnknownError(exc, null);
    }
}
