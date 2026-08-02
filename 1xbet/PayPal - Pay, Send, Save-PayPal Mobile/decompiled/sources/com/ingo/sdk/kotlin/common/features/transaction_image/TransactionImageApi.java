package com.ingo.sdk.kotlin.common.features.transaction_image;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/transaction_image/TransactionImageApi;", "Lcom/ingo/sdk/kotlin/common/core/http/SdkApi;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;Lio/ktor/client/HttpClient;)V", "", "url", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/ApiFailure;", "", "getTransactionImage", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "getConfiguration", "()Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionImageApi extends com.ingo.sdk.kotlin.common.core.http.SdkApi {
    private final io.ktor.client.HttpClient client;
    private final com.ingo.sdk.kotlin.common.IngoSdkConfiguration configuration;

    public final io.ktor.client.HttpClient getClient() {
        return this.client;
    }

    public final com.ingo.sdk.kotlin.common.IngoSdkConfiguration getConfiguration() {
        return this.configuration;
    }

    public TransactionImageApi(com.ingo.sdk.kotlin.common.IngoSdkConfiguration ingoSdkConfiguration, io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoSdkConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        this.configuration = ingoSdkConfiguration;
        this.client = httpClient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cc, code lost:
    
        if (r12 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
    
        if (r12 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e1, code lost:
    
        if (r12 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        if (r12 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getTransactionImage(java.lang.String str, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<com.ingo.sdk.kotlin.common.core.exception.ApiFailure, byte[]>> continuation) {
        com.ingo.sdk.kotlin.common.features.transaction_image.TransactionImageApi$getTransactionImage$1 transactionImageApi$getTransactionImage$1;
        int i;
        io.ktor.client.statement.HttpResponse httpResponse;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.transaction_image.TransactionImageApi$getTransactionImage$1) {
            transactionImageApi$getTransactionImage$1 = (com.ingo.sdk.kotlin.common.features.transaction_image.TransactionImageApi$getTransactionImage$1) continuation;
            if ((transactionImageApi$getTransactionImage$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                transactionImageApi$getTransactionImage$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = transactionImageApi$getTransactionImage$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transactionImageApi$getTransactionImage$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    trackApiRequestStarted(str);
                    io.ktor.client.HttpClient httpClient = this.client;
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                    io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2 = httpRequestBuilder;
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, "Authorization", "Bearer ".concat(java.lang.String.valueOf(this.configuration.getSdkAuthorizationToken())));
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, com.ingo.sdk.kotlin.common.core.http.HttpConstantsKt.KEY_IOVATION, this.configuration.getDeviceBlackBox());
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, "CustomerId", this.configuration.getCustomerId());
                    httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                    io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                    transactionImageApi$getTransactionImage$1.getHighSpeedVideoFpsRangesFor = str;
                    transactionImageApi$getTransactionImage$1.Camera2StreamConfigurationMap = 1;
                    obj = httpStatement.execute(transactionImageApi$getTransactionImage$1);
                } else if (i == 1) {
                    str = (java.lang.String) transactionImageApi$getTransactionImage$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            return new com.ingo.sdk.kotlin.common.core.functional.Either.Right(obj);
                        }
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String str2 = (java.lang.String) obj;
                        kotlinx.serialization.json.Json json = getJson();
                        json.getSerializersModule();
                        return new com.ingo.sdk.kotlin.common.core.functional.Either.Left(new com.ingo.sdk.kotlin.common.core.exception.ApiFailure(new com.ingo.sdk.kotlin.common.model.ApiErrorThrowable(deserializeErrorResponse((com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse) json.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse.INSTANCE.serializer(), str2), str2))));
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    transactionImageApi$getTransactionImage$1.Camera2StreamConfigurationMap = 3;
                    obj = io.ktor.utils.io.ByteReadChannelOperationsKt.toByteArray((io.ktor.utils.io.ByteReadChannel) obj, transactionImageApi$getTransactionImage$1);
                }
                httpResponse = (io.ktor.client.statement.HttpResponse) obj;
                trackApiRequestCompleted(str);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getOK())) {
                    transactionImageApi$getTransactionImage$1.getHighSpeedVideoFpsRangesFor = null;
                    transactionImageApi$getTransactionImage$1.Camera2StreamConfigurationMap = 2;
                    obj = io.ktor.client.statement.HttpResponseKt.bodyAsChannel(httpResponse, transactionImageApi$getTransactionImage$1);
                } else {
                    trackApiRequestFailed(str, httpResponse);
                    transactionImageApi$getTransactionImage$1.getHighSpeedVideoFpsRangesFor = null;
                    transactionImageApi$getTransactionImage$1.Camera2StreamConfigurationMap = 4;
                    obj = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, transactionImageApi$getTransactionImage$1, 1, null);
                }
                return coroutine_suspended;
            }
        }
        transactionImageApi$getTransactionImage$1 = new com.ingo.sdk.kotlin.common.features.transaction_image.TransactionImageApi$getTransactionImage$1(this, continuation);
        java.lang.Object obj2 = transactionImageApi$getTransactionImage$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transactionImageApi$getTransactionImage$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        httpResponse = (io.ktor.client.statement.HttpResponse) obj2;
        trackApiRequestCompleted(str);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getOK())) {
        }
        return coroutine_suspended2;
    }
}
