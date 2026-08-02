package com.ingo.sdk.kotlin.common.features.void_image;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/void_image/VoidImageApi;", "Lcom/ingo/sdk/kotlin/common/core/http/SdkApi;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lio/ktor/client/HttpClient;", "httpClient", "<init>", "(Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;Lio/ktor/client/HttpClient;)V", "", "transactionReferenceNumber", "voidImageAsBase64", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "Lcom/ingo/sdk/kotlin/common/features/void_image/model/VoidImageResponse;", "uploadVoidImage", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lio/ktor/client/HttpClient;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VoidImageApi extends com.ingo.sdk.kotlin.common.core.http.SdkApi {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.IngoSdkConfiguration getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final io.ktor.client.HttpClient getHighSpeedVideoFpsRangesFor;

    public VoidImageApi(com.ingo.sdk.kotlin.common.IngoSdkConfiguration ingoSdkConfiguration, io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoSdkConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        this.getHighSpeedVideoSizes = ingoSdkConfiguration;
        this.getHighSpeedVideoFpsRangesFor = httpClient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0100, code lost:
    
        if (r13 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object uploadVoidImage(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.void_image.model.VoidImageResponse>> continuation) {
        com.ingo.sdk.kotlin.common.features.void_image.VoidImageApi$uploadVoidImage$1 voidImageApi$uploadVoidImage$1;
        int i;
        kotlin.reflect.KType kType;
        java.lang.String str3;
        java.lang.Object obj;
        io.ktor.client.statement.HttpResponse httpResponse;
        java.lang.Object obj2;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.void_image.VoidImageApi$uploadVoidImage$1) {
            voidImageApi$uploadVoidImage$1 = (com.ingo.sdk.kotlin.common.features.void_image.VoidImageApi$uploadVoidImage$1) continuation;
            if ((voidImageApi$uploadVoidImage$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                voidImageApi$uploadVoidImage$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj3 = voidImageApi$uploadVoidImage$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = voidImageApi$uploadVoidImage$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    java.lang.String baseUrl = this.getHighSpeedVideoSizes.getBaseUrl();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(baseUrl);
                    sb.append("check-images/voided-image");
                    java.lang.String obj4 = sb.toString();
                    trackApiRequestStarted(obj4);
                    io.ktor.client.HttpClient httpClient = this.getHighSpeedVideoFpsRangesFor;
                    io.ktor.http.Url Url = io.ktor.http.URLUtilsKt.Url(obj4);
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                    httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
                    io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), Url);
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2 = httpRequestBuilder;
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, "Authorization", "Bearer ".concat(java.lang.String.valueOf(this.getHighSpeedVideoSizes.getSdkAuthorizationToken())));
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, com.ingo.sdk.kotlin.common.core.http.HttpConstantsKt.KEY_IOVATION, this.getHighSpeedVideoSizes.getDeviceBlackBox());
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, com.ingo.sdk.kotlin.common.core.http.HttpConstantsKt.KEY_IOVATION, this.getHighSpeedVideoSizes.getDeviceBlackBox());
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, "CustomerId", this.getHighSpeedVideoSizes.getCustomerId());
                    io.ktor.http.HttpMessagePropertiesKt.contentType(httpRequestBuilder2, io.ktor.http.ContentType.Application.INSTANCE.getJson());
                    httpRequestBuilder.setBody(new com.ingo.sdk.kotlin.common.features.void_image.model.VoidImageRequest(str, str2));
                    kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.void_image.model.VoidImageRequest.class);
                    try {
                        kType = kotlin.jvm.internal.Reflection.typeOf(com.ingo.sdk.kotlin.common.features.void_image.model.VoidImageRequest.class);
                    } catch (java.lang.Throwable unused) {
                        kType = null;
                    }
                    httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
                    io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                    voidImageApi$uploadVoidImage$1.Camera2StreamConfigurationMap = obj4;
                    voidImageApi$uploadVoidImage$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    java.lang.Object execute = httpStatement.execute(voidImageApi$uploadVoidImage$1);
                    if (execute != coroutine_suspended) {
                        str3 = obj4;
                        obj = execute;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    httpResponse = (io.ktor.client.statement.HttpResponse) voidImageApi$uploadVoidImage$1.getHighSpeedVideoFpsRangesFor;
                    str3 = (java.lang.String) voidImageApi$uploadVoidImage$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    obj2 = obj3;
                    java.lang.String str4 = (java.lang.String) obj2;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getAccepted())) {
                        kotlinx.serialization.json.Json json = getJson();
                        json.getSerializersModule();
                        return new com.ingo.sdk.kotlin.common.core.functional.Either.Right(json.decodeFromString(com.ingo.sdk.kotlin.common.features.void_image.model.VoidImageResponse.INSTANCE.serializer(), str4));
                    }
                    trackApiRequestFailed(str3, httpResponse);
                    kotlinx.serialization.json.Json json2 = getJson();
                    json2.getSerializersModule();
                    return new com.ingo.sdk.kotlin.common.core.functional.Either.Left(new com.ingo.sdk.kotlin.common.core.exception.ApiFailure(new com.ingo.sdk.kotlin.common.model.ApiErrorThrowable(deserializeErrorResponse((com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse) json2.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse.INSTANCE.serializer(), str4), str4))));
                }
                java.lang.String str5 = (java.lang.String) voidImageApi$uploadVoidImage$1.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj3);
                str3 = str5;
                obj = obj3;
                httpResponse = (io.ktor.client.statement.HttpResponse) obj;
                trackApiRequestCompleted(str3);
                voidImageApi$uploadVoidImage$1.Camera2StreamConfigurationMap = str3;
                voidImageApi$uploadVoidImage$1.getHighSpeedVideoFpsRangesFor = httpResponse;
                voidImageApi$uploadVoidImage$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                java.lang.Object bodyAsText$default = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, voidImageApi$uploadVoidImage$1, 1, null);
                obj2 = bodyAsText$default;
            }
        }
        voidImageApi$uploadVoidImage$1 = new com.ingo.sdk.kotlin.common.features.void_image.VoidImageApi$uploadVoidImage$1(this, continuation);
        java.lang.Object obj32 = voidImageApi$uploadVoidImage$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = voidImageApi$uploadVoidImage$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        httpResponse = (io.ktor.client.statement.HttpResponse) obj;
        trackApiRequestCompleted(str3);
        voidImageApi$uploadVoidImage$1.Camera2StreamConfigurationMap = str3;
        voidImageApi$uploadVoidImage$1.getHighSpeedVideoFpsRangesFor = httpResponse;
        voidImageApi$uploadVoidImage$1.getHighResolutionOutputSizeshNQ4ISI = 2;
        java.lang.Object bodyAsText$default2 = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, voidImageApi$uploadVoidImage$1, 1, null);
        obj2 = bodyAsText$default2;
    }
}
