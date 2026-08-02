package com.paypal.oslo.feature.verificationcapture.network;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J6\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/network/DocumentUploadApi;", "", "Lokhttp3/RequestBody;", "request", "", "Lokhttp3/MultipartBody$Part;", "files", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lcom/paypal/oslo/feature/verificationcapture/data/dto/UploadDocumentResponse;", "uploadDocument", "(Lokhttp3/RequestBody;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DocumentUploadApi {
    @retrofit2.http.POST("/v1/customer/documents")
    @retrofit2.http.Multipart
    java.lang.Object uploadDocument(@retrofit2.http.Part("Request") okhttp3.RequestBody requestBody, @retrofit2.http.Part java.util.List<okhttp3.MultipartBody.Part> list, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, com.paypal.oslo.feature.verificationcapture.data.dto.UploadDocumentResponse>> continuation);
}
