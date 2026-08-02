package com.paypal.oslo.feature.identity.passkey.login.challenge.data.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00060\u0006j\u0002`\u0007H\u0000¢\u0006\u0004\b\u0002\u0010\b\u001a\u001f\u0010\u0002\u001a\u00020\u0001*\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0002\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeError;", "toDomain", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeError;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeError;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "(Ljava/lang/Exception;)Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeError;", "", "path", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyLoginChallengeErrorMapperKt {
    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError toDomain(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return toDomain(((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError());
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError = (com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()));
        java.util.List<java.lang.Object> path = graphQLError.getPath();
        return toDomain(graphQLError.getMessage(), path != null ? kotlin.collections.CollectionsKt.joinToString$default(path, ".", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.passkey.login.challenge.data.mapper.PasskeyLoginChallengeErrorMapperKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.CharSequence valueOf;
                valueOf = java.lang.String.valueOf(obj);
                return valueOf;
            }
        }, 30, null) : null);
    }

    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError toDomain(com.paypal.oslo.core.network.http.error.NetworkError networkError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            return new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError.NetworkError(((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) networkError).getCause());
        }
        if (!(networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError)) {
            if (!(networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError.UnknownError(null, ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) networkError).getCause(), null, 5, null);
        }
        com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) networkError;
        int code = httpError.getCode();
        if (code == 401) {
            return com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError.UnauthorizedError.INSTANCE;
        }
        if (code == 404) {
            return com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError.NotFoundError.INSTANCE;
        }
        if (code == 500) {
            return new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError.ServerInternalError(java.lang.Integer.valueOf(httpError.getCode()));
        }
        return new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError.UnknownError(java.lang.Integer.valueOf(httpError.getCode()), null, null, 6, null);
    }

    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError toDomain(java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        if ((exc instanceof java.net.UnknownHostException) || (exc instanceof java.net.ConnectException) || (exc instanceof java.net.SocketTimeoutException)) {
            return new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError.TimeoutError(exc);
        }
        if (exc instanceof java.lang.IllegalArgumentException) {
            return new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError.ValidationError(null);
        }
        return new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError.UnknownError(null, exc, null, 4, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError toDomain$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = null;
        }
        return toDomain(str, str2);
    }

    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError toDomain(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"auth", com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper.ERROR_MSG_UNAUTHORIZED, "Authentication failed", "User is not authorized", "Invalid auth token", "Authorization required", "User authentication required", "auth_failure", "AUTH_ERROR"});
        if (!(listOf instanceof java.util.Collection) || !listOf.isEmpty()) {
            java.util.Iterator it = listOf.iterator();
            while (it.hasNext()) {
                if (kotlin.text.StringsKt.contains((java.lang.CharSequence) str, (java.lang.CharSequence) it.next(), true)) {
                    return com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError.AuthenticationError.INSTANCE;
                }
            }
        }
        java.util.List listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"not found", "Resource not found"});
        if (!(listOf2 instanceof java.util.Collection) || !listOf2.isEmpty()) {
            java.util.Iterator it2 = listOf2.iterator();
            while (it2.hasNext()) {
                if (kotlin.text.StringsKt.contains((java.lang.CharSequence) str, (java.lang.CharSequence) it2.next(), true)) {
                    return com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError.NotFoundError.INSTANCE;
                }
            }
        }
        java.util.List listOf3 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"missing", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_RESIDENT_KEY, "Missing required field"});
        if (!(listOf3 instanceof java.util.Collection) || !listOf3.isEmpty()) {
            java.util.Iterator it3 = listOf3.iterator();
            while (it3.hasNext()) {
                if (kotlin.text.StringsKt.contains((java.lang.CharSequence) str, (java.lang.CharSequence) it3.next(), true)) {
                    return com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError.MissingData.INSTANCE;
                }
            }
        }
        return new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError.UnknownError(null, null, str2, 3, null);
    }
}
