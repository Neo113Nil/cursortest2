package com.paypal.oslo.feature.identity.passkey.login.assertion.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00060\u0004j\u0002`\u0005H\u0000¢\u0006\u0004\b\u0002\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "toDomain", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "(Ljava/lang/Exception;)Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyAssertionErrorMapperKt {
    public static final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError toDomain(com.paypal.oslo.core.network.http.error.NetworkError networkError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NetworkError(((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) networkError).getCause());
        }
        if (!(networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError)) {
            if (!(networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UnknownError(null, ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) networkError).getCause(), 1, null);
        }
        com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) networkError;
        int code = httpError.getCode();
        if (code == 401) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.AuthenticationError(null, 1, null);
        }
        if (code == 404) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NotFoundError(null, 1, null);
        }
        if (code == 500) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ServerError(java.lang.Integer.valueOf(httpError.getCode()), null, 2, null);
        }
        return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UnknownError(java.lang.String.valueOf(httpError.getCode()), null, 2, null);
    }

    public static final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError toDomain(java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        if ((exc instanceof java.net.UnknownHostException) || (exc instanceof java.net.ConnectException) || (exc instanceof java.net.SocketTimeoutException)) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NetworkError(exc);
        }
        if (exc instanceof java.lang.IllegalArgumentException) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ValidationError(exc);
        }
        if (exc instanceof java.lang.SecurityException) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.SecurityError(exc);
        }
        if (exc instanceof androidx.view.exceptions.GetCredentialCancellationException) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UserCancelled(exc);
        }
        if (exc instanceof androidx.view.exceptions.GetCredentialInterruptedException) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.Interrupted(exc);
        }
        if (exc instanceof androidx.view.exceptions.NoCredentialException) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NoCredentialsFound(exc);
        }
        if (exc instanceof java.lang.UnsupportedOperationException) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UnsupportedPlatform(exc);
        }
        if (exc instanceof androidx.view.exceptions.GetCredentialException) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UnknownError("CREDENTIAL_ERROR", (androidx.view.exceptions.GetCredentialException) exc);
        }
        if (exc instanceof java.util.concurrent.CancellationException) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ProcessCancelled(exc);
        }
        return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UnknownError(null, exc);
    }
}
