package com.paypal.oslo.feature.xoom.data;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\b\u0010\tJ2\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u000b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/xoom/data/XoomApiService;", "", "", "", "headerMap", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lcom/paypal/oslo/feature/xoom/data/response/UserResponse;", "fetchMe", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/xoom/data/response/FailedPaymentResponse;", "createFailedPaymentInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface XoomApiService {
    @com.paypal.oslo.core.network.rest.noauth.NoAuth
    @retrofit2.http.Headers({"Accept: application/json"})
    @retrofit2.http.POST("xoom/cool/v1/failed-payment")
    java.lang.Object createFailedPaymentInfo(@retrofit2.http.HeaderMap java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, com.paypal.oslo.feature.xoom.data.response.FailedPaymentResponse>> continuation);

    @com.paypal.oslo.core.network.rest.noauth.NoAuth
    @retrofit2.http.Headers({"Accept: application/json"})
    @retrofit2.http.GET("xoom/mobile/v1/users/me")
    java.lang.Object fetchMe(@retrofit2.http.HeaderMap java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, com.paypal.oslo.feature.xoom.data.response.UserResponse>> continuation);
}
