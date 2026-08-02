package com.paypal.oslo.feature.identity.passkey.management.list.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00060\bj\u0002`\tH\u0000¢\u0006\u0004\b\u0002\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "toDomain", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "Lcom/paypal/oslo/core/network/http/error/NetworkError$HttpError;", "(Lcom/paypal/oslo/core/network/http/error/NetworkError$HttpError;)Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "(Ljava/lang/Exception;)Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyListErrorMapperKt {
    public static final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError toDomain(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return toDomain(((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError());
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError = (com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()));
        java.util.List<java.lang.Object> path = graphQLError.getPath();
        java.lang.String joinToString$default = path != null ? kotlin.collections.CollectionsKt.joinToString$default(path, ".", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.passkey.management.list.data.mapper.PasskeyListErrorMapperKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.CharSequence valueOf;
                valueOf = java.lang.String.valueOf(obj);
                return valueOf;
            }
        }, 30, null) : null;
        java.lang.String message = graphQLError.getMessage();
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"auth", com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper.ERROR_MSG_UNAUTHORIZED, "Authentication failed", "User is not authorized", "Invalid auth token", "Authorization required", "User authentication required", "auth_failure", "AUTH_ERROR"});
        if (!(listOf instanceof java.util.Collection) || !listOf.isEmpty()) {
            java.util.Iterator it = listOf.iterator();
            while (it.hasNext()) {
                if (kotlin.text.StringsKt.contains((java.lang.CharSequence) message, (java.lang.CharSequence) it.next(), true)) {
                    return com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.AuthenticationError.INSTANCE;
                }
            }
        }
        java.util.List listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"not found", "Resource not found", "Passkey not found", "No passkeys found"});
        if (!(listOf2 instanceof java.util.Collection) || !listOf2.isEmpty()) {
            java.util.Iterator it2 = listOf2.iterator();
            while (it2.hasNext()) {
                if (kotlin.text.StringsKt.contains((java.lang.CharSequence) message, (java.lang.CharSequence) it2.next(), true)) {
                    return com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.NotFoundError.INSTANCE;
                }
            }
        }
        java.util.List listOf3 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"missing", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_RESIDENT_KEY, "Missing required field", "null data"});
        if (!(listOf3 instanceof java.util.Collection) || !listOf3.isEmpty()) {
            java.util.Iterator it3 = listOf3.iterator();
            while (it3.hasNext()) {
                if (kotlin.text.StringsKt.contains((java.lang.CharSequence) message, (java.lang.CharSequence) it3.next(), true)) {
                    return com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.MissingData.INSTANCE;
                }
            }
        }
        java.util.List listOf4 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"validation", "invalid", com.adjust.sdk.Constants.MALFORMED, "Invalid request"});
        if (!(listOf4 instanceof java.util.Collection) || !listOf4.isEmpty()) {
            java.util.Iterator it4 = listOf4.iterator();
            while (it4.hasNext()) {
                if (kotlin.text.StringsKt.contains((java.lang.CharSequence) message, (java.lang.CharSequence) it4.next(), true)) {
                    return com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.ValidationError.INSTANCE;
                }
            }
        }
        java.util.List listOf5 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"security", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "forbidden", "Security violation"});
        if (!(listOf5 instanceof java.util.Collection) || !listOf5.isEmpty()) {
            java.util.Iterator it5 = listOf5.iterator();
            while (it5.hasNext()) {
                if (kotlin.text.StringsKt.contains((java.lang.CharSequence) message, (java.lang.CharSequence) it5.next(), true)) {
                    return com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.SecurityError.INSTANCE;
                }
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQL error: ");
        sb.append(message);
        sb.append(" (path: ");
        sb.append(joinToString$default);
        sb.append(")");
        return new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.UnknownError(new java.lang.Exception(sb.toString()));
    }

    public static final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError toDomain(com.paypal.oslo.core.network.http.error.NetworkError networkError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            java.lang.Throwable cause = ((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) networkError).getCause();
            kotlin.jvm.internal.Intrinsics.checkNotNull(cause, "");
            return new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.NetworkError((java.lang.Exception) cause);
        }
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            return toDomain((com.paypal.oslo.core.network.http.error.NetworkError.HttpError) networkError);
        }
        if (!(networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.Throwable cause2 = ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) networkError).getCause();
        kotlin.jvm.internal.Intrinsics.checkNotNull(cause2, "");
        return new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.UnknownError((java.lang.Exception) cause2);
    }

    public static final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError toDomain(com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpError, "");
        int code = httpError.getCode();
        if (code == 401) {
            return com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.UnauthorizedError.INSTANCE;
        }
        if (code == 404) {
            return com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.NotFoundError.INSTANCE;
        }
        if (code == 500) {
            return com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.ServerInternalError.INSTANCE;
        }
        int code2 = httpError.getCode();
        java.lang.String message = httpError.getMessage();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HTTP ");
        sb.append(code2);
        sb.append(": ");
        sb.append(message);
        return new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.UnknownError(new java.lang.Exception(sb.toString()));
    }

    public static final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError toDomain(java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        if ((exc instanceof java.net.UnknownHostException) || (exc instanceof java.net.ConnectException) || (exc instanceof java.net.SocketTimeoutException)) {
            return new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.TimeoutError(exc);
        }
        if (exc instanceof kotlinx.serialization.SerializationException) {
            return com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.ValidationError.INSTANCE;
        }
        if (exc instanceof java.lang.SecurityException) {
            return com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.SecurityError.INSTANCE;
        }
        return new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.UnknownError(exc);
    }
}
