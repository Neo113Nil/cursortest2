package com.ingo.sdk.kotlin.common.features.check_images;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/check_images/CheckImagesApi;", "Lcom/ingo/sdk/kotlin/common/core/http/SdkApi;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lio/ktor/client/HttpClient;", "httpClient", "<init>", "(Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;Lio/ktor/client/HttpClient;)V", "", "frontImageAsBase64", "backImageAsBase64", "Lcom/ingo/sdk/kotlin/common/features/location/LocationData;", "geoLocation", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "Lcom/ingo/sdk/kotlin/common/features/check_images/model/OcrResponse;", "processCheckImages", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingo/sdk/kotlin/common/features/location/LocationData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lio/ktor/client/HttpClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CheckImagesApi extends com.ingo.sdk.kotlin.common.core.http.SdkApi {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.IngoSdkConfiguration getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final io.ktor.client.HttpClient getHighResolutionOutputSizeshNQ4ISI;

    public CheckImagesApi(com.ingo.sdk.kotlin.common.IngoSdkConfiguration ingoSdkConfiguration, io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoSdkConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        this.getHighSpeedVideoFpsRangesFor = ingoSdkConfiguration;
        this.getHighResolutionOutputSizeshNQ4ISI = httpClient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0100, code lost:
    
        if (r14 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object processCheckImages(java.lang.String str, java.lang.String str2, com.ingo.sdk.kotlin.common.features.location.LocationData locationData, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse>> continuation) {
        com.ingo.sdk.kotlin.common.features.check_images.CheckImagesApi$processCheckImages$1 checkImagesApi$processCheckImages$1;
        int i;
        kotlin.reflect.KType kType;
        java.lang.String str3;
        java.lang.Object obj;
        io.ktor.client.statement.HttpResponse httpResponse;
        java.lang.Object obj2;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.check_images.CheckImagesApi$processCheckImages$1) {
            checkImagesApi$processCheckImages$1 = (com.ingo.sdk.kotlin.common.features.check_images.CheckImagesApi$processCheckImages$1) continuation;
            if ((checkImagesApi$processCheckImages$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                checkImagesApi$processCheckImages$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj3 = checkImagesApi$processCheckImages$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = checkImagesApi$processCheckImages$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "CheckImagesApi processCheckImages", null, 2, null);
                    java.lang.String baseUrl = this.getHighSpeedVideoFpsRangesFor.getBaseUrl();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(baseUrl);
                    sb.append("check-images");
                    java.lang.String obj4 = sb.toString();
                    trackApiRequestStarted(obj4);
                    io.ktor.client.HttpClient httpClient = this.getHighResolutionOutputSizeshNQ4ISI;
                    io.ktor.http.Url Url = io.ktor.http.URLUtilsKt.Url(obj4);
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                    httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
                    io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), Url);
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2 = httpRequestBuilder;
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, "Authorization", "Bearer ".concat(java.lang.String.valueOf(this.getHighSpeedVideoFpsRangesFor.getSdkAuthorizationToken())));
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, com.ingo.sdk.kotlin.common.core.http.HttpConstantsKt.KEY_IOVATION, this.getHighSpeedVideoFpsRangesFor.getDeviceBlackBox());
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, "CustomerId", this.getHighSpeedVideoFpsRangesFor.getCustomerId());
                    io.ktor.http.HttpMessagePropertiesKt.contentType(httpRequestBuilder2, io.ktor.http.ContentType.Application.INSTANCE.getJson());
                    httpRequestBuilder.setBody(new com.ingo.sdk.kotlin.common.features.check_images.model.OcrRequest(str, str2, locationData));
                    kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.check_images.model.OcrRequest.class);
                    try {
                        kType = kotlin.jvm.internal.Reflection.typeOf(com.ingo.sdk.kotlin.common.features.check_images.model.OcrRequest.class);
                    } catch (java.lang.Throwable unused) {
                        kType = null;
                    }
                    httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
                    io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                    checkImagesApi$processCheckImages$1.getHighResolutionOutputSizeshNQ4ISI = obj4;
                    checkImagesApi$processCheckImages$1.Camera2StreamConfigurationMap = 1;
                    java.lang.Object execute = httpStatement.execute(checkImagesApi$processCheckImages$1);
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
                    httpResponse = (io.ktor.client.statement.HttpResponse) checkImagesApi$processCheckImages$1.getHighSpeedVideoFpsRangesFor;
                    str3 = (java.lang.String) checkImagesApi$processCheckImages$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    obj2 = obj3;
                    java.lang.String str4 = (java.lang.String) obj2;
                    com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "CheckImagesApi processCheckImages responseString ".concat(java.lang.String.valueOf(str4)), null, 2, null);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getOK())) {
                        kotlinx.serialization.json.Json json = getJson();
                        json.getSerializersModule();
                        return new com.ingo.sdk.kotlin.common.core.functional.Either.Right(json.decodeFromString(com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse.INSTANCE.serializer(), str4));
                    }
                    trackApiRequestFailed(str3, httpResponse);
                    kotlinx.serialization.json.Json json2 = getJson();
                    json2.getSerializersModule();
                    return new com.ingo.sdk.kotlin.common.core.functional.Either.Left(new com.ingo.sdk.kotlin.common.core.exception.ApiFailure(new com.ingo.sdk.kotlin.common.model.ApiErrorThrowable(deserializeErrorResponse((com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse) json2.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse.INSTANCE.serializer(), str4), str4))));
                }
                java.lang.String str5 = (java.lang.String) checkImagesApi$processCheckImages$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj3);
                str3 = str5;
                obj = obj3;
                httpResponse = (io.ktor.client.statement.HttpResponse) obj;
                trackApiRequestCompleted(str3);
                checkImagesApi$processCheckImages$1.getHighResolutionOutputSizeshNQ4ISI = str3;
                checkImagesApi$processCheckImages$1.getHighSpeedVideoFpsRangesFor = httpResponse;
                checkImagesApi$processCheckImages$1.Camera2StreamConfigurationMap = 2;
                java.lang.Object bodyAsText$default = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, checkImagesApi$processCheckImages$1, 1, null);
                obj2 = bodyAsText$default;
            }
        }
        checkImagesApi$processCheckImages$1 = new com.ingo.sdk.kotlin.common.features.check_images.CheckImagesApi$processCheckImages$1(this, continuation);
        java.lang.Object obj32 = checkImagesApi$processCheckImages$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = checkImagesApi$processCheckImages$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        httpResponse = (io.ktor.client.statement.HttpResponse) obj;
        trackApiRequestCompleted(str3);
        checkImagesApi$processCheckImages$1.getHighResolutionOutputSizeshNQ4ISI = str3;
        checkImagesApi$processCheckImages$1.getHighSpeedVideoFpsRangesFor = httpResponse;
        checkImagesApi$processCheckImages$1.Camera2StreamConfigurationMap = 2;
        java.lang.Object bodyAsText$default2 = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, checkImagesApi$processCheckImages$1, 1, null);
        obj2 = bodyAsText$default2;
    }
}
