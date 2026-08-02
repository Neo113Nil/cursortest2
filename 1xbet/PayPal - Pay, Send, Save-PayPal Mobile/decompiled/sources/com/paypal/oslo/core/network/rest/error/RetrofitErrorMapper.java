package com.paypal.oslo.core.network.rest.error;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/rest/error/RetrofitErrorMapper;", "Lcom/paypal/oslo/core/network/http/error/NetworkErrorMapper;", "<init>", "()V", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "mapToNetworkError", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/core/network/http/error/NetworkError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RetrofitErrorMapper implements com.paypal.oslo.core.network.http.error.NetworkErrorMapper {
    @Override // com.paypal.oslo.core.network.http.error.NetworkErrorMapper
    public final com.paypal.oslo.core.network.http.error.NetworkError mapToNetworkError(java.lang.Throwable throwable) {
        okhttp3.Headers headers;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = null;
        r1 = null;
        java.lang.String str = null;
        retrofit2.HttpException httpException = throwable instanceof retrofit2.HttpException ? (retrofit2.HttpException) throwable : null;
        if (httpException != null) {
            int code = httpException.code();
            java.lang.String message = httpException.message();
            retrofit2.Response<?> response = httpException.response();
            if (response != null && (headers = response.headers()) != null) {
                str = headers.get(com.paypal.oslo.core.network.http.NetworkConstants.PAYPAL_DEBUG_ID_HEADER);
            }
            httpError = new com.paypal.oslo.core.network.http.error.NetworkError.HttpError(code, message, null, str, 4, null);
        }
        return httpError;
    }
}
