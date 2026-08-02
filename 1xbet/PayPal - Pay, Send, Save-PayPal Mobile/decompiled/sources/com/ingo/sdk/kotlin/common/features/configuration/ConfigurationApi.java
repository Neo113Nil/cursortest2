package com.ingo.sdk.kotlin.common.features.configuration;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/configuration/ConfigurationApi;", "Lcom/ingo/sdk/kotlin/common/core/http/SdkApi;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lio/ktor/client/HttpClient;", "httpClient", "<init>", "(Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;Lio/ktor/client/HttpClient;)V", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "Lcom/ingo/sdk/kotlin/common/features/configuration/model/ConfigurationResponse;", "getConfiguration", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "Camera2StreamConfigurationMap", "Lio/ktor/client/HttpClient;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConfigurationApi extends com.ingo.sdk.kotlin.common.core.http.SdkApi {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final io.ktor.client.HttpClient getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.IngoSdkConfiguration Camera2StreamConfigurationMap;

    public ConfigurationApi(com.ingo.sdk.kotlin.common.IngoSdkConfiguration ingoSdkConfiguration, io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoSdkConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        this.Camera2StreamConfigurationMap = ingoSdkConfiguration;
        this.getHighResolutionOutputSizeshNQ4ISI = httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getConfiguration(kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse>> continuation) {
        com.ingo.sdk.kotlin.common.features.configuration.ConfigurationApi$getConfiguration$1 configurationApi$getConfiguration$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.String str;
        java.lang.Object bodyAsText$default;
        io.ktor.client.statement.HttpResponse httpResponse;
        java.lang.String str2;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.configuration.ConfigurationApi$getConfiguration$1) {
            configurationApi$getConfiguration$1 = (com.ingo.sdk.kotlin.common.features.configuration.ConfigurationApi$getConfiguration$1) continuation;
            if ((configurationApi$getConfiguration$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                configurationApi$getConfiguration$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = configurationApi$getConfiguration$1.getHighSpeedVideoFpsRanges;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = configurationApi$getConfiguration$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String baseUrl = this.Camera2StreamConfigurationMap.getBaseUrl();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(baseUrl);
                    sb.append(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY);
                    java.lang.String obj2 = sb.toString();
                    trackApiRequestStarted(obj2);
                    io.ktor.client.HttpClient httpClient = this.getHighResolutionOutputSizeshNQ4ISI;
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                    io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, obj2);
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2 = httpRequestBuilder;
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, "Authorization", "Bearer ".concat(java.lang.String.valueOf(this.Camera2StreamConfigurationMap.getSdkAuthorizationToken())));
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, com.ingo.sdk.kotlin.common.core.http.HttpConstantsKt.KEY_IOVATION, this.Camera2StreamConfigurationMap.getDeviceBlackBox());
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, "CustomerId", this.Camera2StreamConfigurationMap.getCustomerId());
                    httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                    io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                    configurationApi$getConfiguration$1.getHighResolutionOutputSizeshNQ4ISI = obj2;
                    configurationApi$getConfiguration$1.getHighSpeedVideoFpsRangesFor = 1;
                    java.lang.Object execute = httpStatement.execute(configurationApi$getConfiguration$1);
                    if (execute != coroutine_suspended) {
                        str = obj2;
                        obj = execute;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    httpResponse = (io.ktor.client.statement.HttpResponse) configurationApi$getConfiguration$1.Camera2StreamConfigurationMap;
                    str2 = (java.lang.String) configurationApi$getConfiguration$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String str3 = (java.lang.String) obj;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getOK())) {
                        kotlinx.serialization.json.Json json = getJson();
                        json.getSerializersModule();
                        return new com.ingo.sdk.kotlin.common.core.functional.Either.Right(json.decodeFromString(com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse.INSTANCE.serializer(), str3));
                    }
                    trackApiRequestFailed(str2, httpResponse);
                    kotlinx.serialization.json.Json json2 = getJson();
                    json2.getSerializersModule();
                    return new com.ingo.sdk.kotlin.common.core.functional.Either.Left(new com.ingo.sdk.kotlin.common.core.exception.ApiFailure(new com.ingo.sdk.kotlin.common.model.ApiErrorThrowable(deserializeErrorResponse((com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse) json2.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse.INSTANCE.serializer(), str3), str3))));
                }
                str = (java.lang.String) configurationApi$getConfiguration$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.client.statement.HttpResponse httpResponse2 = (io.ktor.client.statement.HttpResponse) obj;
                trackApiRequestCompleted(str);
                configurationApi$getConfiguration$1.getHighResolutionOutputSizeshNQ4ISI = str;
                configurationApi$getConfiguration$1.Camera2StreamConfigurationMap = httpResponse2;
                configurationApi$getConfiguration$1.getHighSpeedVideoFpsRangesFor = 2;
                bodyAsText$default = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse2, null, configurationApi$getConfiguration$1, 1, null);
                if (bodyAsText$default != coroutine_suspended) {
                    httpResponse = httpResponse2;
                    obj = bodyAsText$default;
                    str2 = str;
                    java.lang.String str32 = (java.lang.String) obj;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getOK())) {
                    }
                }
                return coroutine_suspended;
            }
        }
        configurationApi$getConfiguration$1 = new com.ingo.sdk.kotlin.common.features.configuration.ConfigurationApi$getConfiguration$1(this, continuation);
        java.lang.Object obj3 = configurationApi$getConfiguration$1.getHighSpeedVideoFpsRanges;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = configurationApi$getConfiguration$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        io.ktor.client.statement.HttpResponse httpResponse22 = (io.ktor.client.statement.HttpResponse) obj3;
        trackApiRequestCompleted(str);
        configurationApi$getConfiguration$1.getHighResolutionOutputSizeshNQ4ISI = str;
        configurationApi$getConfiguration$1.Camera2StreamConfigurationMap = httpResponse22;
        configurationApi$getConfiguration$1.getHighSpeedVideoFpsRangesFor = 2;
        bodyAsText$default = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse22, null, configurationApi$getConfiguration$1, 1, null);
        if (bodyAsText$default != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
