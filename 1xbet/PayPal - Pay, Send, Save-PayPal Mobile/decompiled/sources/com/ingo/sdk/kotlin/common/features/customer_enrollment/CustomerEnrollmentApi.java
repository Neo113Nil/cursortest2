package com.ingo.sdk.kotlin.common.features.customer_enrollment;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J<\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/CustomerEnrollmentApi;", "Lcom/ingo/sdk/kotlin/common/core/http/SdkApi;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;Lio/ktor/client/HttpClient;)V", "", "ssn", "dob", "mobilePhoneNumber", "Lcom/ingo/sdk/kotlin/common/features/location/LocationData;", "geoLocation", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/model/CustomerEnrollmentResponse;", "completeEnrollment", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingo/sdk/kotlin/common/features/location/LocationData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "getConfiguration", "()Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CustomerEnrollmentApi extends com.ingo.sdk.kotlin.common.core.http.SdkApi {
    private final io.ktor.client.HttpClient client;
    private final com.ingo.sdk.kotlin.common.IngoSdkConfiguration configuration;

    public final io.ktor.client.HttpClient getClient() {
        return this.client;
    }

    public final com.ingo.sdk.kotlin.common.IngoSdkConfiguration getConfiguration() {
        return this.configuration;
    }

    public CustomerEnrollmentApi(com.ingo.sdk.kotlin.common.IngoSdkConfiguration ingoSdkConfiguration, io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoSdkConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        this.configuration = ingoSdkConfiguration;
        this.client = httpClient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ef, code lost:
    
        if (r15 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object completeEnrollment(java.lang.String str, java.lang.String str2, java.lang.String str3, com.ingo.sdk.kotlin.common.features.location.LocationData locationData, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse>> continuation) {
        com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentApi$completeEnrollment$1 customerEnrollmentApi$completeEnrollment$1;
        int i;
        kotlin.reflect.KType kType;
        java.lang.String str4;
        java.lang.Object obj;
        io.ktor.client.statement.HttpResponse httpResponse;
        java.lang.Object obj2;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentApi$completeEnrollment$1) {
            customerEnrollmentApi$completeEnrollment$1 = (com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentApi$completeEnrollment$1) continuation;
            if ((customerEnrollmentApi$completeEnrollment$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                customerEnrollmentApi$completeEnrollment$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj3 = customerEnrollmentApi$completeEnrollment$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = customerEnrollmentApi$completeEnrollment$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    java.lang.String baseUrl = this.configuration.getBaseUrl();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(baseUrl);
                    sb.append("enrollment/complete");
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
                    httpRequestBuilder.setBody(new com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentRequest(str, str2, str3, locationData));
                    kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentRequest.class);
                    try {
                        kType = kotlin.jvm.internal.Reflection.typeOf(com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentRequest.class);
                    } catch (java.lang.Throwable unused) {
                        kType = null;
                    }
                    httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
                    io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                    customerEnrollmentApi$completeEnrollment$1.getHighSpeedVideoFpsRanges = obj4;
                    customerEnrollmentApi$completeEnrollment$1.getHighSpeedVideoFpsRangesFor = 1;
                    java.lang.Object execute = httpStatement.execute(customerEnrollmentApi$completeEnrollment$1);
                    if (execute != coroutine_suspended) {
                        str4 = obj4;
                        obj = execute;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    httpResponse = (io.ktor.client.statement.HttpResponse) customerEnrollmentApi$completeEnrollment$1.getHighSpeedVideoSizes;
                    str4 = (java.lang.String) customerEnrollmentApi$completeEnrollment$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    obj2 = obj3;
                    java.lang.String str5 = (java.lang.String) obj2;
                    io.ktor.http.HttpStatusCode status = httpResponse.getStatus();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getOK()) || kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getCreated()) || kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getAccepted()) || kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getNoContent())) {
                        kotlinx.serialization.json.Json json = getJson();
                        json.getSerializersModule();
                        return new com.ingo.sdk.kotlin.common.core.functional.Either.Right(json.decodeFromString(com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse.INSTANCE.serializer(), str5));
                    }
                    trackApiRequestFailed(str4, httpResponse);
                    kotlinx.serialization.json.Json json2 = getJson();
                    json2.getSerializersModule();
                    return new com.ingo.sdk.kotlin.common.core.functional.Either.Left(new com.ingo.sdk.kotlin.common.core.exception.ApiFailure(new com.ingo.sdk.kotlin.common.model.ApiErrorThrowable(deserializeErrorResponse((com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse) json2.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse.INSTANCE.serializer(), str5), str5))));
                }
                java.lang.String str6 = (java.lang.String) customerEnrollmentApi$completeEnrollment$1.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj3);
                str4 = str6;
                obj = obj3;
                httpResponse = (io.ktor.client.statement.HttpResponse) obj;
                trackApiRequestCompleted(str4);
                customerEnrollmentApi$completeEnrollment$1.getHighSpeedVideoFpsRanges = str4;
                customerEnrollmentApi$completeEnrollment$1.getHighSpeedVideoSizes = httpResponse;
                customerEnrollmentApi$completeEnrollment$1.getHighSpeedVideoFpsRangesFor = 2;
                java.lang.Object bodyAsText$default = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, customerEnrollmentApi$completeEnrollment$1, 1, null);
                obj2 = bodyAsText$default;
            }
        }
        customerEnrollmentApi$completeEnrollment$1 = new com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentApi$completeEnrollment$1(this, continuation);
        java.lang.Object obj32 = customerEnrollmentApi$completeEnrollment$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = customerEnrollmentApi$completeEnrollment$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        httpResponse = (io.ktor.client.statement.HttpResponse) obj;
        trackApiRequestCompleted(str4);
        customerEnrollmentApi$completeEnrollment$1.getHighSpeedVideoFpsRanges = str4;
        customerEnrollmentApi$completeEnrollment$1.getHighSpeedVideoSizes = httpResponse;
        customerEnrollmentApi$completeEnrollment$1.getHighSpeedVideoFpsRangesFor = 2;
        java.lang.Object bodyAsText$default2 = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, customerEnrollmentApi$completeEnrollment$1, 1, null);
        obj2 = bodyAsText$default2;
    }
}
