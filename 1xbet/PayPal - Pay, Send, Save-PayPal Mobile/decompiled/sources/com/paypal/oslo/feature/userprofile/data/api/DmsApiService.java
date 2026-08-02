package com.paypal.oslo.feature.userprofile.data.api;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/data/api/DmsApiService;", "", "", "authorization", "Lokhttp3/RequestBody;", "requestBody", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lcom/paypal/oslo/feature/userprofile/data/model/DmsResponse;", "uploadPhoto", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DmsApiService {
    @retrofit2.http.Headers({"Content-Type: multipart/mixed; boundary=qqq"})
    @retrofit2.http.POST("v2/content/documents")
    java.lang.Object uploadPhoto(@retrofit2.http.Header("Authorization") java.lang.String str, @retrofit2.http.Body okhttp3.RequestBody requestBody, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, com.paypal.oslo.feature.userprofile.data.model.DmsResponse>> continuation);
}
