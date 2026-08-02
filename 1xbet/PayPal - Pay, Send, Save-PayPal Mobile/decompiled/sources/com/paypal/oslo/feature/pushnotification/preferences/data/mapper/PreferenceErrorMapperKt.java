package com.paypal.oslo.feature.pushnotification.preferences.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/error/PreferencesError;", "toPreferenceDomainError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/pushnotification/preferences/domain/error/PreferencesError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PreferenceErrorMapperKt {
    public static final com.paypal.oslo.feature.pushnotification.preferences.domain.error.PreferencesError toPreferenceDomainError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        java.lang.String message;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                message = ((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) error).getCause().getMessage();
                if (message == null) {
                    message = "No Internet";
                }
            } else if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
                message = ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause().getMessage();
                if (message == null) {
                    message = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
                }
            } else {
                if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                message = ((com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error).getMessage();
                if (message == null) {
                    message = "Http error";
                }
            }
            return new com.paypal.oslo.feature.pushnotification.preferences.domain.error.PreferencesError.NetworkError(message);
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.pushnotification.preferences.domain.error.PreferencesError.Business.SyncFailed(((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()))).getMessage());
    }
}
