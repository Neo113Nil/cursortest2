package com.paypal.oslo.core.network.http.error;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/http/error/HttpErrorMapper;", "Lcom/paypal/oslo/core/network/http/error/NetworkErrorMapper;", "<init>", "()V", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "mapToNetworkError", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/core/network/http/error/NetworkError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HttpErrorMapper implements com.paypal.oslo.core.network.http.error.NetworkErrorMapper {
    @Override // com.paypal.oslo.core.network.http.error.NetworkErrorMapper
    public final com.paypal.oslo.core.network.http.error.NetworkError mapToNetworkError(java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        if ((throwable instanceof java.net.UnknownHostException) || (throwable instanceof java.net.SocketTimeoutException) || (throwable instanceof java.io.IOException)) {
            return new com.paypal.oslo.core.network.http.error.NetworkError.NoInternet(throwable);
        }
        return new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(throwable);
    }
}
