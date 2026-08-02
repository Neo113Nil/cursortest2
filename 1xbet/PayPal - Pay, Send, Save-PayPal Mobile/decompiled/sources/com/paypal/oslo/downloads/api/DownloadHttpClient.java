package com.paypal.oslo.downloads.api;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/downloads/api/DownloadHttpClient;", "", "Lcom/paypal/oslo/downloads/api/model/DownloadRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/downloads/api/HttpDownloadError;", "Lokhttp3/Response;", "download", "(Lcom/paypal/oslo/downloads/api/model/DownloadRequest;)Larrow/core/Either;", "downloadAsync", "(Lcom/paypal/oslo/downloads/api/model/DownloadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DownloadHttpClient {
    arrow.core.Either<com.paypal.oslo.downloads.api.HttpDownloadError, okhttp3.Response> download(com.paypal.oslo.downloads.api.model.DownloadRequest request);

    java.lang.Object downloadAsync(com.paypal.oslo.downloads.api.model.DownloadRequest downloadRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.downloads.api.HttpDownloadError, okhttp3.Response>> continuation);
}
