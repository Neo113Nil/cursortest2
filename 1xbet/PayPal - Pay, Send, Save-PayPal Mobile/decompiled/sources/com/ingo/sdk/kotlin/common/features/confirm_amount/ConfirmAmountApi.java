package com.ingo.sdk.kotlin.common.features.confirm_amount;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/confirm_amount/ConfirmAmountApi;", "Lcom/ingo/sdk/kotlin/common/core/http/SdkApi;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;Lio/ktor/client/HttpClient;)V", "", "amount", "", "transactionReferenceNumber", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "Lcom/ingo/sdk/kotlin/common/features/confirm_amount/model/ConfirmAmountResponse;", "confirmAmount", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "getConfiguration", "()Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConfirmAmountApi extends com.ingo.sdk.kotlin.common.core.http.SdkApi {
    private final io.ktor.client.HttpClient client;
    private final com.ingo.sdk.kotlin.common.IngoSdkConfiguration configuration;

    public ConfirmAmountApi(com.ingo.sdk.kotlin.common.IngoSdkConfiguration ingoSdkConfiguration, io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoSdkConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        this.configuration = ingoSdkConfiguration;
        this.client = httpClient;
    }

    public final io.ktor.client.HttpClient getClient() {
        return this.client;
    }

    public final com.ingo.sdk.kotlin.common.IngoSdkConfiguration getConfiguration() {
        return this.configuration;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ef, code lost:
    
        if (r14 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object confirmAmount(long j, java.lang.String str, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse>> continuation) {
        com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountApi$confirmAmount$1 confirmAmountApi$confirmAmount$1;
        int i;
        kotlin.reflect.KType kType;
        java.lang.String str2;
        java.lang.Object obj;
        io.ktor.client.statement.HttpResponse httpResponse;
        java.lang.Object obj2;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountApi$confirmAmount$1) {
            confirmAmountApi$confirmAmount$1 = (com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountApi$confirmAmount$1) continuation;
            if ((confirmAmountApi$confirmAmount$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                confirmAmountApi$confirmAmount$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj3 = confirmAmountApi$confirmAmount$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = confirmAmountApi$confirmAmount$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    java.lang.String baseUrl = this.configuration.getBaseUrl();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(baseUrl);
                    sb.append("transactions/confirm-check-amount");
                    java.lang.String obj4 = sb.toString();
                    trackApiRequestStarted(obj4);
                    io.ktor.client.HttpClient httpClient = this.client;
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                    httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
                    io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, obj4);
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2 = httpRequestBuilder;
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, "Authorization", "Bearer ".concat(java.lang.String.valueOf(this.configuration.getSdkAuthorizationToken())));
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, com.ingo.sdk.kotlin.common.core.http.HttpConstantsKt.KEY_IOVATION, this.configuration.getDeviceBlackBox());
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, "CustomerId", this.configuration.getCustomerId());
                    io.ktor.http.HttpMessagePropertiesKt.contentType(httpRequestBuilder2, io.ktor.http.ContentType.Application.INSTANCE.getJson());
                    httpRequestBuilder.setBody(new com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountRequest(str, j));
                    kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountRequest.class);
                    try {
                        kType = kotlin.jvm.internal.Reflection.typeOf(com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountRequest.class);
                    } catch (java.lang.Throwable unused) {
                        kType = null;
                    }
                    httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
                    io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                    confirmAmountApi$confirmAmount$1.getHighResolutionOutputSizeshNQ4ISI = obj4;
                    confirmAmountApi$confirmAmount$1.getHighSpeedVideoFpsRanges = 1;
                    java.lang.Object execute = httpStatement.execute(confirmAmountApi$confirmAmount$1);
                    if (execute != coroutine_suspended) {
                        str2 = obj4;
                        obj = execute;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    httpResponse = (io.ktor.client.statement.HttpResponse) confirmAmountApi$confirmAmount$1.Camera2StreamConfigurationMap;
                    str2 = (java.lang.String) confirmAmountApi$confirmAmount$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    obj2 = obj3;
                    java.lang.String str3 = (java.lang.String) obj2;
                    io.ktor.http.HttpStatusCode status = httpResponse.getStatus();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getOK()) || kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getAccepted())) {
                        kotlinx.serialization.json.Json json = getJson();
                        json.getSerializersModule();
                        return new com.ingo.sdk.kotlin.common.core.functional.Either.Right(json.decodeFromString(com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse.INSTANCE.serializer(), str3));
                    }
                    trackApiRequestFailed(str2, httpResponse);
                    kotlinx.serialization.json.Json json2 = getJson();
                    json2.getSerializersModule();
                    return new com.ingo.sdk.kotlin.common.core.functional.Either.Left(new com.ingo.sdk.kotlin.common.core.exception.ApiFailure(new com.ingo.sdk.kotlin.common.model.ApiErrorThrowable(deserializeErrorResponse((com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse) json2.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse.INSTANCE.serializer(), str3), str3))));
                }
                java.lang.String str4 = (java.lang.String) confirmAmountApi$confirmAmount$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj3);
                str2 = str4;
                obj = obj3;
                httpResponse = (io.ktor.client.statement.HttpResponse) obj;
                trackApiRequestCompleted(str2);
                confirmAmountApi$confirmAmount$1.getHighResolutionOutputSizeshNQ4ISI = str2;
                confirmAmountApi$confirmAmount$1.Camera2StreamConfigurationMap = httpResponse;
                confirmAmountApi$confirmAmount$1.getHighSpeedVideoFpsRanges = 2;
                java.lang.Object bodyAsText$default = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, confirmAmountApi$confirmAmount$1, 1, null);
                obj2 = bodyAsText$default;
            }
        }
        confirmAmountApi$confirmAmount$1 = new com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountApi$confirmAmount$1(this, continuation);
        java.lang.Object obj32 = confirmAmountApi$confirmAmount$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = confirmAmountApi$confirmAmount$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        httpResponse = (io.ktor.client.statement.HttpResponse) obj;
        trackApiRequestCompleted(str2);
        confirmAmountApi$confirmAmount$1.getHighResolutionOutputSizeshNQ4ISI = str2;
        confirmAmountApi$confirmAmount$1.Camera2StreamConfigurationMap = httpResponse;
        confirmAmountApi$confirmAmount$1.getHighSpeedVideoFpsRanges = 2;
        java.lang.Object bodyAsText$default2 = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, confirmAmountApi$confirmAmount$1, 1, null);
        obj2 = bodyAsText$default2;
    }
}
