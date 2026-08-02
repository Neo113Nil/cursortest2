package com.paypal.oslo.core.network.graphql.error;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/ApolloErrorMapper;", "Lcom/paypal/oslo/core/network/http/error/NetworkErrorMapper;", "<init>", "()V", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "mapToNetworkError", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/core/network/http/error/NetworkError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApolloErrorMapper implements com.paypal.oslo.core.network.http.error.NetworkErrorMapper {
    @Override // com.paypal.oslo.core.network.http.error.NetworkErrorMapper
    public final com.paypal.oslo.core.network.http.error.NetworkError mapToNetworkError(java.lang.Throwable throwable) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(throwable, com.apollographql.apollo.exception.OfflineException.INSTANCE)) {
            return new com.paypal.oslo.core.network.http.error.NetworkError.NoInternet(throwable);
        }
        if (!(throwable instanceof com.apollographql.apollo.exception.ApolloException)) {
            return null;
        }
        com.apollographql.apollo.exception.ApolloException apolloException = (com.apollographql.apollo.exception.ApolloException) throwable;
        if (!(apolloException instanceof com.apollographql.apollo.exception.ApolloHttpException)) {
            return apolloException instanceof com.apollographql.apollo.exception.ApolloNetworkException ? new com.paypal.oslo.core.network.http.error.NetworkError.NoInternet(throwable) : new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(throwable);
        }
        com.apollographql.apollo.exception.ApolloHttpException apolloHttpException = (com.apollographql.apollo.exception.ApolloHttpException) throwable;
        int statusCode = apolloHttpException.getStatusCode();
        java.lang.String message = throwable.getMessage();
        okio.BufferedSource body = apolloHttpException.getBody();
        java.lang.String readUtf8 = body != null ? body.readUtf8() : null;
        java.util.Iterator<T> it = apolloHttpException.getHeaders().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.text.StringsKt.equals(((com.apollographql.apollo.api.http.HttpHeader) obj).getName(), com.paypal.oslo.core.network.http.NetworkConstants.PAYPAL_DEBUG_ID_HEADER, true)) {
                break;
            }
        }
        com.apollographql.apollo.api.http.HttpHeader httpHeader = (com.apollographql.apollo.api.http.HttpHeader) obj;
        return new com.paypal.oslo.core.network.http.error.NetworkError.HttpError(statusCode, message, readUtf8, httpHeader != null ? httpHeader.getValue() : null);
    }
}
