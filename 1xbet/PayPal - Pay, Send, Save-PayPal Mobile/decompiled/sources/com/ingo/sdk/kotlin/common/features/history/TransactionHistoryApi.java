package com.ingo.sdk.kotlin.common.features.history;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/history/TransactionHistoryApi;", "Lcom/ingo/sdk/kotlin/common/core/http/SdkApi;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;Lio/ktor/client/HttpClient;)V", "", "pageSize", "pageNumber", "", "transactionReferenceNumber", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/ApiFailure;", "Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionHistoryResponse;", "getTransactionStatus", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "getConfiguration", "()Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionHistoryApi extends com.ingo.sdk.kotlin.common.core.http.SdkApi {
    private final io.ktor.client.HttpClient client;
    private final com.ingo.sdk.kotlin.common.IngoSdkConfiguration configuration;

    public final io.ktor.client.HttpClient getClient() {
        return this.client;
    }

    public final com.ingo.sdk.kotlin.common.IngoSdkConfiguration getConfiguration() {
        return this.configuration;
    }

    public TransactionHistoryApi(com.ingo.sdk.kotlin.common.IngoSdkConfiguration ingoSdkConfiguration, io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoSdkConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        this.configuration = ingoSdkConfiguration;
        this.client = httpClient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00fd, code lost:
    
        if (r10 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ff, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e9, code lost:
    
        if (r10 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getTransactionStatus(int i, int i2, java.lang.String str, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<com.ingo.sdk.kotlin.common.core.exception.ApiFailure, com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse>> continuation) {
        com.ingo.sdk.kotlin.common.features.history.TransactionHistoryApi$getTransactionStatus$1 transactionHistoryApi$getTransactionStatus$1;
        int i3;
        java.lang.String obj;
        java.lang.Object obj2;
        java.lang.String str2;
        io.ktor.client.statement.HttpResponse httpResponse;
        java.lang.Object obj3;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.history.TransactionHistoryApi$getTransactionStatus$1) {
            transactionHistoryApi$getTransactionStatus$1 = (com.ingo.sdk.kotlin.common.features.history.TransactionHistoryApi$getTransactionStatus$1) continuation;
            if ((transactionHistoryApi$getTransactionStatus$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                transactionHistoryApi$getTransactionStatus$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj4 = transactionHistoryApi$getTransactionStatus$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = transactionHistoryApi$getTransactionStatus$1.getHighSpeedVideoFpsRanges;
                if (i3 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj4);
                    java.lang.String concat = !kotlin.text.StringsKt.isBlank(str) ? "&transactionReferenceNumber=".concat(java.lang.String.valueOf(str)) : "";
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("transactions/?context=mobile&pageSize=");
                    sb.append(i);
                    sb.append("&pageNumber=");
                    sb.append(i2);
                    sb.append(concat);
                    java.lang.String obj5 = sb.toString();
                    java.lang.String baseUrl = this.configuration.getBaseUrl();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(baseUrl);
                    sb2.append(obj5);
                    obj = sb2.toString();
                    trackApiRequestStarted(obj);
                    io.ktor.client.HttpClient httpClient = this.client;
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                    io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, obj);
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2 = httpRequestBuilder;
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, "Authorization", "Bearer ".concat(java.lang.String.valueOf(this.configuration.getSdkAuthorizationToken())));
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, com.ingo.sdk.kotlin.common.core.http.HttpConstantsKt.KEY_IOVATION, this.configuration.getDeviceBlackBox());
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, "CustomerId", this.configuration.getCustomerId());
                    io.ktor.http.HttpMessagePropertiesKt.contentType(httpRequestBuilder2, io.ktor.http.ContentType.Application.INSTANCE.getJson());
                    httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                    io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                    transactionHistoryApi$getTransactionStatus$1.getHighSpeedVideoFpsRangesFor = obj;
                    transactionHistoryApi$getTransactionStatus$1.getHighSpeedVideoFpsRanges = 1;
                    java.lang.Object execute = httpStatement.execute(transactionHistoryApi$getTransactionStatus$1);
                    obj2 = execute;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        httpResponse = (io.ktor.client.statement.HttpResponse) transactionHistoryApi$getTransactionStatus$1.Camera2StreamConfigurationMap;
                        str2 = (java.lang.String) transactionHistoryApi$getTransactionStatus$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj4);
                        obj3 = obj4;
                        java.lang.String str3 = (java.lang.String) obj3;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getOK())) {
                            kotlinx.serialization.json.Json json = getJson();
                            json.getSerializersModule();
                            return new com.ingo.sdk.kotlin.common.core.functional.Either.Right(json.decodeFromString(com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse.INSTANCE.serializer(), str3));
                        }
                        trackApiRequestFailed(str2, httpResponse);
                        kotlinx.serialization.json.Json json2 = getJson();
                        json2.getSerializersModule();
                        return new com.ingo.sdk.kotlin.common.core.functional.Either.Left(new com.ingo.sdk.kotlin.common.core.exception.ApiFailure(new com.ingo.sdk.kotlin.common.model.ApiErrorThrowable(deserializeErrorResponse((com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse) json2.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse.INSTANCE.serializer(), str3), str3))));
                    }
                    obj = (java.lang.String) transactionHistoryApi$getTransactionStatus$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj4);
                    obj2 = obj4;
                }
                str2 = obj;
                httpResponse = (io.ktor.client.statement.HttpResponse) obj2;
                trackApiRequestCompleted(str2);
                transactionHistoryApi$getTransactionStatus$1.getHighSpeedVideoFpsRangesFor = str2;
                transactionHistoryApi$getTransactionStatus$1.Camera2StreamConfigurationMap = httpResponse;
                transactionHistoryApi$getTransactionStatus$1.getHighSpeedVideoFpsRanges = 2;
                java.lang.Object bodyAsText$default = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, transactionHistoryApi$getTransactionStatus$1, 1, null);
                obj3 = bodyAsText$default;
            }
        }
        transactionHistoryApi$getTransactionStatus$1 = new com.ingo.sdk.kotlin.common.features.history.TransactionHistoryApi$getTransactionStatus$1(this, continuation);
        java.lang.Object obj42 = transactionHistoryApi$getTransactionStatus$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = transactionHistoryApi$getTransactionStatus$1.getHighSpeedVideoFpsRanges;
        if (i3 != 0) {
        }
        str2 = obj;
        httpResponse = (io.ktor.client.statement.HttpResponse) obj2;
        trackApiRequestCompleted(str2);
        transactionHistoryApi$getTransactionStatus$1.getHighSpeedVideoFpsRangesFor = str2;
        transactionHistoryApi$getTransactionStatus$1.Camera2StreamConfigurationMap = httpResponse;
        transactionHistoryApi$getTransactionStatus$1.getHighSpeedVideoFpsRanges = 2;
        java.lang.Object bodyAsText$default2 = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, transactionHistoryApi$getTransactionStatus$1, 1, null);
        obj3 = bodyAsText$default2;
    }
}
