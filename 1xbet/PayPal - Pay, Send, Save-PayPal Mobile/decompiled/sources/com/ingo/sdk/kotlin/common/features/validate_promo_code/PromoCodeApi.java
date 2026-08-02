package com.ingo.sdk.kotlin.common.features.validate_promo_code;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/validate_promo_code/PromoCodeApi;", "Lcom/ingo/sdk/kotlin/common/core/http/SdkApi;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;Lio/ktor/client/HttpClient;)V", "", "transactionReferenceNumber", "promoCode", "accountIdentifier", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/ApiFailure;", "Lcom/ingo/sdk/kotlin/common/features/validate_promo_code/model/PromoCodeResponse;", "applyPromoCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "getConfiguration", "()Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PromoCodeApi extends com.ingo.sdk.kotlin.common.core.http.SdkApi {
    private final io.ktor.client.HttpClient client;
    private final com.ingo.sdk.kotlin.common.IngoSdkConfiguration configuration;

    public final io.ktor.client.HttpClient getClient() {
        return this.client;
    }

    public final com.ingo.sdk.kotlin.common.IngoSdkConfiguration getConfiguration() {
        return this.configuration;
    }

    public PromoCodeApi(com.ingo.sdk.kotlin.common.IngoSdkConfiguration ingoSdkConfiguration, io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoSdkConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        this.configuration = ingoSdkConfiguration;
        this.client = httpClient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ee, code lost:
    
        if (r12 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        if (r12 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object applyPromoCode(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<com.ingo.sdk.kotlin.common.core.exception.ApiFailure, com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeResponse>> continuation) {
        com.ingo.sdk.kotlin.common.features.validate_promo_code.PromoCodeApi$applyPromoCode$1 promoCodeApi$applyPromoCode$1;
        int i;
        java.lang.String obj;
        kotlin.reflect.KType kType;
        java.lang.Object obj2;
        java.lang.String str4;
        io.ktor.client.statement.HttpResponse httpResponse;
        java.lang.Object obj3;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.validate_promo_code.PromoCodeApi$applyPromoCode$1) {
            promoCodeApi$applyPromoCode$1 = (com.ingo.sdk.kotlin.common.features.validate_promo_code.PromoCodeApi$applyPromoCode$1) continuation;
            if ((promoCodeApi$applyPromoCode$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                promoCodeApi$applyPromoCode$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj4 = promoCodeApi$applyPromoCode$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = promoCodeApi$applyPromoCode$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj4);
                    com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeRequest promoCodeRequest = new com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeRequest(str, str2, str3);
                    java.lang.String baseUrl = this.configuration.getBaseUrl();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(baseUrl);
                    sb.append("promotions/validate-code");
                    obj = sb.toString();
                    trackApiRequestStarted(obj);
                    io.ktor.client.HttpClient httpClient = this.client;
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                    httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
                    io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, obj);
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2 = httpRequestBuilder;
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, "Authorization", "Bearer ".concat(java.lang.String.valueOf(this.configuration.getSdkAuthorizationToken())));
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, com.ingo.sdk.kotlin.common.core.http.HttpConstantsKt.KEY_IOVATION, this.configuration.getDeviceBlackBox());
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, "CustomerId", this.configuration.getCustomerId());
                    io.ktor.http.HttpMessagePropertiesKt.contentType(httpRequestBuilder2, io.ktor.http.ContentType.Application.INSTANCE.getJson());
                    httpRequestBuilder.setBody(promoCodeRequest);
                    kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeRequest.class);
                    try {
                        kType = kotlin.jvm.internal.Reflection.typeOf(com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeRequest.class);
                    } catch (java.lang.Throwable unused) {
                        kType = null;
                    }
                    httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
                    io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                    promoCodeApi$applyPromoCode$1.getHighSpeedVideoSizes = obj;
                    promoCodeApi$applyPromoCode$1.getHighSpeedVideoFpsRanges = 1;
                    java.lang.Object execute = httpStatement.execute(promoCodeApi$applyPromoCode$1);
                    obj2 = execute;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        httpResponse = (io.ktor.client.statement.HttpResponse) promoCodeApi$applyPromoCode$1.Camera2StreamConfigurationMap;
                        str4 = (java.lang.String) promoCodeApi$applyPromoCode$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj4);
                        obj3 = obj4;
                        java.lang.String str5 = (java.lang.String) obj3;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getOK())) {
                            kotlinx.serialization.json.Json json = getJson();
                            json.getSerializersModule();
                            return new com.ingo.sdk.kotlin.common.core.functional.Either.Right(json.decodeFromString(com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeResponse.INSTANCE.serializer(), str5));
                        }
                        trackApiRequestFailed(str4, httpResponse);
                        kotlinx.serialization.json.Json json2 = getJson();
                        json2.getSerializersModule();
                        return new com.ingo.sdk.kotlin.common.core.functional.Either.Left(new com.ingo.sdk.kotlin.common.core.exception.ApiFailure(new com.ingo.sdk.kotlin.common.model.ApiErrorThrowable(deserializeErrorResponse((com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse) json2.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse.INSTANCE.serializer(), str5), str5))));
                    }
                    obj = (java.lang.String) promoCodeApi$applyPromoCode$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj4);
                    obj2 = obj4;
                }
                str4 = obj;
                httpResponse = (io.ktor.client.statement.HttpResponse) obj2;
                trackApiRequestCompleted(str4);
                promoCodeApi$applyPromoCode$1.getHighSpeedVideoSizes = str4;
                promoCodeApi$applyPromoCode$1.Camera2StreamConfigurationMap = httpResponse;
                promoCodeApi$applyPromoCode$1.getHighSpeedVideoFpsRanges = 2;
                java.lang.Object bodyAsText$default = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, promoCodeApi$applyPromoCode$1, 1, null);
                obj3 = bodyAsText$default;
            }
        }
        promoCodeApi$applyPromoCode$1 = new com.ingo.sdk.kotlin.common.features.validate_promo_code.PromoCodeApi$applyPromoCode$1(this, continuation);
        java.lang.Object obj42 = promoCodeApi$applyPromoCode$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = promoCodeApi$applyPromoCode$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        str4 = obj;
        httpResponse = (io.ktor.client.statement.HttpResponse) obj2;
        trackApiRequestCompleted(str4);
        promoCodeApi$applyPromoCode$1.getHighSpeedVideoSizes = str4;
        promoCodeApi$applyPromoCode$1.Camera2StreamConfigurationMap = httpResponse;
        promoCodeApi$applyPromoCode$1.getHighSpeedVideoFpsRanges = 2;
        java.lang.Object bodyAsText$default2 = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, promoCodeApi$applyPromoCode$1, 1, null);
        obj3 = bodyAsText$default2;
    }
}
