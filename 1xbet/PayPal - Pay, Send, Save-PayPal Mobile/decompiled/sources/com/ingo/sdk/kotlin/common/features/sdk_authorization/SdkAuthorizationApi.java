package com.ingo.sdk.kotlin.common.features.sdk_authorization;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/SdkAuthorizationApi;", "Lcom/ingo/sdk/kotlin/common/core/http/SdkApi;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;Lio/ktor/client/HttpClient;)V", "", "ingoSdkVersion", "partnerAppName", "partnerAppVersion", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/ApiFailure;", "", com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.AUTHORIZE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "getConfiguration", "()Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SdkAuthorizationApi extends com.ingo.sdk.kotlin.common.core.http.SdkApi {
    private final io.ktor.client.HttpClient client;
    private final com.ingo.sdk.kotlin.common.IngoSdkConfiguration configuration;

    public final com.ingo.sdk.kotlin.common.IngoSdkConfiguration getConfiguration() {
        return this.configuration;
    }

    public final io.ktor.client.HttpClient getClient() {
        return this.client;
    }

    public SdkAuthorizationApi(com.ingo.sdk.kotlin.common.IngoSdkConfiguration ingoSdkConfiguration, io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoSdkConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        this.configuration = ingoSdkConfiguration;
        this.client = httpClient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0153, code lost:
    
        if (r1 == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0191, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010d, code lost:
    
        if (r1 != r3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object authorize(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<com.ingo.sdk.kotlin.common.core.exception.ApiFailure, ? extends java.lang.Object>> continuation) {
        com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationApi$authorize$1 sdkAuthorizationApi$authorize$1;
        int i;
        java.lang.String obj;
        kotlin.reflect.KType kType;
        io.ktor.http.HttpStatusCode status;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationApi$authorize$1) {
            sdkAuthorizationApi$authorize$1 = (com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationApi$authorize$1) continuation;
            if ((sdkAuthorizationApi$authorize$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                sdkAuthorizationApi$authorize$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj2 = sdkAuthorizationApi$authorize$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sdkAuthorizationApi$authorize$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    java.lang.String baseUrl = this.configuration.getBaseUrl();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(baseUrl);
                    sb.append(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.AUTHORIZE);
                    obj = sb.toString();
                    com.ingo.sdk.kotlin.common.features.sdk_authorization.model.SdkAuthorizationRequest sdkAuthorizationRequest = new com.ingo.sdk.kotlin.common.features.sdk_authorization.model.SdkAuthorizationRequest(this.configuration.getSdkAuthorizationToken(), this.configuration.getCustomerId(), this.configuration.getDeviceBlackBox(), str, new com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo(this.configuration.getDeviceInfo().getDeviceDetails(), this.configuration.getDeviceInfo().getPlatform(), this.configuration.getDeviceInfo().getPlatformVersion()), new com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo(str3, str2));
                    trackApiRequestStarted(obj);
                    io.ktor.client.HttpClient httpClient = this.client;
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                    httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
                    io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, obj);
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2 = httpRequestBuilder;
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, "Authorization", "Bearer ".concat(java.lang.String.valueOf(this.configuration.getSdkAuthorizationToken())));
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, com.ingo.sdk.kotlin.common.core.http.HttpConstantsKt.KEY_IOVATION, this.configuration.getDeviceBlackBox());
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, "CustomerId", this.configuration.getCustomerId());
                    httpRequestBuilder.setBody(sdkAuthorizationRequest);
                    kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.sdk_authorization.model.SdkAuthorizationRequest.class);
                    try {
                        kType = kotlin.jvm.internal.Reflection.typeOf(com.ingo.sdk.kotlin.common.features.sdk_authorization.model.SdkAuthorizationRequest.class);
                    } catch (java.lang.Throwable unused) {
                        kType = null;
                    }
                    httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
                    io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                    sdkAuthorizationApi$authorize$1.getHighSpeedVideoFpsRangesFor = obj;
                    sdkAuthorizationApi$authorize$1.getHighSpeedVideoFpsRanges = 1;
                    obj2 = httpStatement.execute(sdkAuthorizationApi$authorize$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj2);
                        java.lang.String str4 = (java.lang.String) obj2;
                        kotlinx.serialization.json.Json json = getJson();
                        json.getSerializersModule();
                        return new com.ingo.sdk.kotlin.common.core.functional.Either.Left(new com.ingo.sdk.kotlin.common.core.exception.ApiFailure(new com.ingo.sdk.kotlin.common.model.ApiErrorThrowable(deserializeErrorResponse((com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse) json.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse.INSTANCE.serializer(), str4), str4))));
                    }
                    obj = (java.lang.String) sdkAuthorizationApi$authorize$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) obj2;
                trackApiRequestCompleted(obj);
                status = httpResponse.getStatus();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getOK()) || kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getCreated()) || kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getAccepted()) || kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getNoContent())) {
                    return new com.ingo.sdk.kotlin.common.core.functional.Either.Right(new java.lang.Object());
                }
                trackApiRequestFailed(obj, httpResponse);
                sdkAuthorizationApi$authorize$1.getHighSpeedVideoFpsRangesFor = null;
                sdkAuthorizationApi$authorize$1.getHighSpeedVideoFpsRanges = 2;
                obj2 = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, sdkAuthorizationApi$authorize$1, 1, null);
            }
        }
        sdkAuthorizationApi$authorize$1 = new com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationApi$authorize$1(this, continuation);
        java.lang.Object obj22 = sdkAuthorizationApi$authorize$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sdkAuthorizationApi$authorize$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        io.ktor.client.statement.HttpResponse httpResponse2 = (io.ktor.client.statement.HttpResponse) obj22;
        trackApiRequestCompleted(obj);
        status = httpResponse2.getStatus();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getOK())) {
        }
        return new com.ingo.sdk.kotlin.common.core.functional.Either.Right(new java.lang.Object());
    }
}
