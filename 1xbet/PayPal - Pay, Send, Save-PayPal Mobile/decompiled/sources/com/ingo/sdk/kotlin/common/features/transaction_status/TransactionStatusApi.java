package com.ingo.sdk.kotlin.common.features.transaction_status;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/transaction_status/TransactionStatusApi;", "Lcom/ingo/sdk/kotlin/common/core/http/SdkApi;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;Lio/ktor/client/HttpClient;)V", "", "transactionId", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/ApiFailure;", "Lcom/ingo/sdk/kotlin/common/features/transaction_status/model/TransactionStatusResponse;", "getTransactionStatus", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "getConfiguration", "()Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionStatusApi extends com.ingo.sdk.kotlin.common.core.http.SdkApi {
    private final io.ktor.client.HttpClient client;
    private final com.ingo.sdk.kotlin.common.IngoSdkConfiguration configuration;

    public final io.ktor.client.HttpClient getClient() {
        return this.client;
    }

    public final com.ingo.sdk.kotlin.common.IngoSdkConfiguration getConfiguration() {
        return this.configuration;
    }

    public TransactionStatusApi(com.ingo.sdk.kotlin.common.IngoSdkConfiguration ingoSdkConfiguration, io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoSdkConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        this.configuration = ingoSdkConfiguration;
        this.client = httpClient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c3, code lost:
    
        if (r11 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getTransactionStatus(java.lang.String str, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<com.ingo.sdk.kotlin.common.core.exception.ApiFailure, com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse>> continuation) {
        com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusApi$getTransactionStatus$1 transactionStatusApi$getTransactionStatus$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.String obj;
        java.lang.Object bodyAsText$default;
        java.lang.String str2;
        io.ktor.client.statement.HttpResponse httpResponse;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusApi$getTransactionStatus$1) {
            transactionStatusApi$getTransactionStatus$1 = (com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusApi$getTransactionStatus$1) continuation;
            if ((transactionStatusApi$getTransactionStatus$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                transactionStatusApi$getTransactionStatus$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj2 = transactionStatusApi$getTransactionStatus$1.getHighSpeedVideoSizes;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transactionStatusApi$getTransactionStatus$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    java.lang.String baseUrl = this.configuration.getBaseUrl();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(baseUrl);
                    sb.append("transactions/");
                    sb.append(str);
                    sb.append("/approval-status");
                    obj = sb.toString();
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
                    transactionStatusApi$getTransactionStatus$1.Camera2StreamConfigurationMap = obj;
                    transactionStatusApi$getTransactionStatus$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj2 = httpStatement.execute(transactionStatusApi$getTransactionStatus$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        httpResponse = (io.ktor.client.statement.HttpResponse) transactionStatusApi$getTransactionStatus$1.getHighResolutionOutputSizeshNQ4ISI;
                        str2 = (java.lang.String) transactionStatusApi$getTransactionStatus$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        java.lang.String str3 = (java.lang.String) obj2;
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getOK())) {
                            kotlinx.serialization.json.Json json = getJson();
                            json.getSerializersModule();
                            return new com.ingo.sdk.kotlin.common.core.functional.Either.Right(json.decodeFromString(com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse.INSTANCE.serializer(), str3));
                        }
                        trackApiRequestFailed(str2, httpResponse);
                        kotlinx.serialization.json.Json json2 = getJson();
                        json2.getSerializersModule();
                        return new com.ingo.sdk.kotlin.common.core.functional.Either.Left(new com.ingo.sdk.kotlin.common.core.exception.ApiFailure(new com.ingo.sdk.kotlin.common.model.ApiErrorThrowable(deserializeErrorResponse((com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse) json2.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse.INSTANCE.serializer(), str3), str3))));
                    }
                    obj = (java.lang.String) transactionStatusApi$getTransactionStatus$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                io.ktor.client.statement.HttpResponse httpResponse2 = (io.ktor.client.statement.HttpResponse) obj2;
                trackApiRequestCompleted(obj);
                transactionStatusApi$getTransactionStatus$1.Camera2StreamConfigurationMap = obj;
                transactionStatusApi$getTransactionStatus$1.getHighResolutionOutputSizeshNQ4ISI = httpResponse2;
                transactionStatusApi$getTransactionStatus$1.getHighSpeedVideoFpsRangesFor = 2;
                bodyAsText$default = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse2, null, transactionStatusApi$getTransactionStatus$1, 1, null);
                if (bodyAsText$default != coroutine_suspended) {
                    str2 = obj;
                    httpResponse = httpResponse2;
                    obj2 = bodyAsText$default;
                    java.lang.String str32 = (java.lang.String) obj2;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getOK())) {
                    }
                }
                return coroutine_suspended;
            }
        }
        transactionStatusApi$getTransactionStatus$1 = new com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusApi$getTransactionStatus$1(this, continuation);
        java.lang.Object obj22 = transactionStatusApi$getTransactionStatus$1.getHighSpeedVideoSizes;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transactionStatusApi$getTransactionStatus$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        io.ktor.client.statement.HttpResponse httpResponse22 = (io.ktor.client.statement.HttpResponse) obj22;
        trackApiRequestCompleted(obj);
        transactionStatusApi$getTransactionStatus$1.Camera2StreamConfigurationMap = obj;
        transactionStatusApi$getTransactionStatus$1.getHighResolutionOutputSizeshNQ4ISI = httpResponse22;
        transactionStatusApi$getTransactionStatus$1.getHighSpeedVideoFpsRangesFor = 2;
        bodyAsText$default = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse22, null, transactionStatusApi$getTransactionStatus$1, 1, null);
        if (bodyAsText$default != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
