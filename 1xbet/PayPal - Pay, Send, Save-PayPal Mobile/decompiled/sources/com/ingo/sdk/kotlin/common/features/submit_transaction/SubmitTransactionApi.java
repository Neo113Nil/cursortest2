package com.ingo.sdk.kotlin.common.features.submit_transaction;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JD\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/submit_transaction/SubmitTransactionApi;", "Lcom/ingo/sdk/kotlin/common/core/http/SdkApi;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;Lio/ktor/client/HttpClient;)V", "", "transactionReferenceNumber", "promoCode", "accountIdentifier", "Lcom/ingo/sdk/kotlin/common/constants/FundsTiming;", "fundsTiming", "Lcom/ingo/sdk/kotlin/common/features/location/LocationData;", "geoLocation", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/ApiFailure;", "Lcom/ingo/sdk/kotlin/common/features/submit_transaction/model/SubmitTransactionResponse;", "submitTransaction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingo/sdk/kotlin/common/constants/FundsTiming;Lcom/ingo/sdk/kotlin/common/features/location/LocationData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "getConfiguration", "()Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SubmitTransactionApi extends com.ingo.sdk.kotlin.common.core.http.SdkApi {
    private final io.ktor.client.HttpClient client;
    private final com.ingo.sdk.kotlin.common.IngoSdkConfiguration configuration;

    public final io.ktor.client.HttpClient getClient() {
        return this.client;
    }

    public final com.ingo.sdk.kotlin.common.IngoSdkConfiguration getConfiguration() {
        return this.configuration;
    }

    public SubmitTransactionApi(com.ingo.sdk.kotlin.common.IngoSdkConfiguration ingoSdkConfiguration, io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoSdkConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        this.configuration = ingoSdkConfiguration;
        this.client = httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object submitTransaction(java.lang.String str, java.lang.String str2, java.lang.String str3, com.ingo.sdk.kotlin.common.constants.FundsTiming fundsTiming, com.ingo.sdk.kotlin.common.features.location.LocationData locationData, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<com.ingo.sdk.kotlin.common.core.exception.ApiFailure, com.ingo.sdk.kotlin.common.features.submit_transaction.model.SubmitTransactionResponse>> continuation) {
        com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionApi$submitTransaction$1 submitTransactionApi$submitTransaction$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.String str4;
        kotlin.reflect.KType kType;
        java.lang.String str5;
        java.lang.Object bodyAsText$default;
        io.ktor.client.statement.HttpResponse httpResponse;
        java.lang.String str6;
        java.lang.String str7;
        io.ktor.http.HttpStatusCode status;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionApi$submitTransaction$1) {
            submitTransactionApi$submitTransaction$1 = (com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionApi$submitTransaction$1) continuation;
            if ((submitTransactionApi$submitTransaction$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                submitTransactionApi$submitTransaction$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = submitTransactionApi$submitTransaction$1.getHighResolutionOutputSizeshNQ4ISI;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = submitTransactionApi$submitTransaction$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String baseUrl = this.configuration.getBaseUrl();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(baseUrl);
                    sb.append("transactions/submit-for-approval");
                    java.lang.String obj2 = sb.toString();
                    trackApiRequestStarted(obj2);
                    io.ktor.client.HttpClient httpClient = this.client;
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                    httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
                    io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, obj2);
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2 = httpRequestBuilder;
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, "Authorization", "Bearer ".concat(java.lang.String.valueOf(this.configuration.getSdkAuthorizationToken())));
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, com.ingo.sdk.kotlin.common.core.http.HttpConstantsKt.KEY_IOVATION, this.configuration.getDeviceBlackBox());
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, "CustomerId", this.configuration.getCustomerId());
                    io.ktor.http.HttpMessagePropertiesKt.contentType(httpRequestBuilder2, io.ktor.http.ContentType.Application.INSTANCE.getJson());
                    int value = fundsTiming.getValue();
                    if (value == com.ingo.sdk.kotlin.common.constants.InDaysFundsTiming.INSTANCE.getValue()) {
                        str4 = "IN_DAYS";
                    } else {
                        str4 = value == com.ingo.sdk.kotlin.common.constants.InMinutesFundsTiming.INSTANCE.getValue() ? "IN_MINUTES" : "";
                    }
                    httpRequestBuilder.setBody(new com.ingo.sdk.kotlin.common.features.submit_transaction.model.SubmitTransactionRequest(str, str2, str3, str4, locationData));
                    kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.submit_transaction.model.SubmitTransactionRequest.class);
                    try {
                        kType = kotlin.jvm.internal.Reflection.typeOf(com.ingo.sdk.kotlin.common.features.submit_transaction.model.SubmitTransactionRequest.class);
                    } catch (java.lang.Throwable unused) {
                        kType = null;
                    }
                    httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
                    io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                    submitTransactionApi$submitTransaction$1.getHighSpeedVideoFpsRangesFor = obj2;
                    submitTransactionApi$submitTransaction$1.getHighSpeedVideoSizes = 1;
                    java.lang.Object execute = httpStatement.execute(submitTransactionApi$submitTransaction$1);
                    if (execute != coroutine_suspended) {
                        str5 = obj2;
                        obj = execute;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    httpResponse = (io.ktor.client.statement.HttpResponse) submitTransactionApi$submitTransaction$1.getHighSpeedVideoFpsRanges;
                    str6 = (java.lang.String) submitTransactionApi$submitTransaction$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str7 = (java.lang.String) obj;
                    status = httpResponse.getStatus();
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getOK()) || kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getAccepted())) {
                        kotlinx.serialization.json.Json json = getJson();
                        json.getSerializersModule();
                        return new com.ingo.sdk.kotlin.common.core.functional.Either.Right(json.decodeFromString(com.ingo.sdk.kotlin.common.features.submit_transaction.model.SubmitTransactionResponse.INSTANCE.serializer(), str7));
                    }
                    trackApiRequestFailed(str6, httpResponse);
                    kotlinx.serialization.json.Json json2 = getJson();
                    json2.getSerializersModule();
                    return new com.ingo.sdk.kotlin.common.core.functional.Either.Left(new com.ingo.sdk.kotlin.common.core.exception.ApiFailure(new com.ingo.sdk.kotlin.common.model.ApiErrorThrowable(deserializeErrorResponse((com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse) json2.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse.INSTANCE.serializer(), str7), str7))));
                }
                str5 = (java.lang.String) submitTransactionApi$submitTransaction$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.client.statement.HttpResponse httpResponse2 = (io.ktor.client.statement.HttpResponse) obj;
                trackApiRequestCompleted(str5);
                submitTransactionApi$submitTransaction$1.getHighSpeedVideoFpsRangesFor = str5;
                submitTransactionApi$submitTransaction$1.getHighSpeedVideoFpsRanges = httpResponse2;
                submitTransactionApi$submitTransaction$1.getHighSpeedVideoSizes = 2;
                bodyAsText$default = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse2, null, submitTransactionApi$submitTransaction$1, 1, null);
                if (bodyAsText$default != coroutine_suspended) {
                    httpResponse = httpResponse2;
                    obj = bodyAsText$default;
                    str6 = str5;
                    str7 = (java.lang.String) obj;
                    status = httpResponse.getStatus();
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getOK())) {
                    }
                    kotlinx.serialization.json.Json json3 = getJson();
                    json3.getSerializersModule();
                    return new com.ingo.sdk.kotlin.common.core.functional.Either.Right(json3.decodeFromString(com.ingo.sdk.kotlin.common.features.submit_transaction.model.SubmitTransactionResponse.INSTANCE.serializer(), str7));
                }
                return coroutine_suspended;
            }
        }
        submitTransactionApi$submitTransaction$1 = new com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionApi$submitTransaction$1(this, continuation);
        java.lang.Object obj3 = submitTransactionApi$submitTransaction$1.getHighResolutionOutputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = submitTransactionApi$submitTransaction$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        io.ktor.client.statement.HttpResponse httpResponse22 = (io.ktor.client.statement.HttpResponse) obj3;
        trackApiRequestCompleted(str5);
        submitTransactionApi$submitTransaction$1.getHighSpeedVideoFpsRangesFor = str5;
        submitTransactionApi$submitTransaction$1.getHighSpeedVideoFpsRanges = httpResponse22;
        submitTransactionApi$submitTransaction$1.getHighSpeedVideoSizes = 2;
        bodyAsText$default = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse22, null, submitTransactionApi$submitTransaction$1, 1, null);
        if (bodyAsText$default != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
