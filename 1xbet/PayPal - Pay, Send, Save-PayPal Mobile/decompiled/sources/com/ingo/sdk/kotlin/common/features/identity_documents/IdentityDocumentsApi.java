package com.ingo.sdk.kotlin.common.features.identity_documents;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/identity_documents/IdentityDocumentsApi;", "Lcom/ingo/sdk/kotlin/common/core/http/SdkApi;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;Lio/ktor/client/HttpClient;)V", "", "frontIdentificationDocumentImage", "backIdentificationDocumentImage", "customerSelfieImage", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/ApiFailure;", "Lcom/ingo/sdk/kotlin/common/features/identity_documents/model/IdentityDocumentsResponse;", "uploadIdentityDocuments", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "getConfiguration", "()Lcom/ingo/sdk/kotlin/common/IngoSdkConfiguration;", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IdentityDocumentsApi extends com.ingo.sdk.kotlin.common.core.http.SdkApi {
    private final io.ktor.client.HttpClient client;
    private final com.ingo.sdk.kotlin.common.IngoSdkConfiguration configuration;

    public final io.ktor.client.HttpClient getClient() {
        return this.client;
    }

    public final com.ingo.sdk.kotlin.common.IngoSdkConfiguration getConfiguration() {
        return this.configuration;
    }

    public IdentityDocumentsApi(com.ingo.sdk.kotlin.common.IngoSdkConfiguration ingoSdkConfiguration, io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoSdkConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        this.configuration = ingoSdkConfiguration;
        this.client = httpClient;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(6:5|6|(1:(1:(1:(3:11|12|13)(2:15|16))(2:17|(2:19|20)(2:21|22)))(1:23))(4:42|43|44|45)|24|(4:35|36|37|38)(1:32)|34))|49|6|(0)(0)|24|(1:26)|35|36|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x012f, code lost:
    
        if (r1 != r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x017d, code lost:
    
        if (r1 != r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x016f, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
    
        if (r1 != r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object uploadIdentityDocuments(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<com.ingo.sdk.kotlin.common.core.exception.ApiFailure, com.ingo.sdk.kotlin.common.features.identity_documents.model.IdentityDocumentsResponse>> continuation) {
        com.ingo.sdk.kotlin.common.features.identity_documents.IdentityDocumentsApi$uploadIdentityDocuments$1 identityDocumentsApi$uploadIdentityDocuments$1;
        java.lang.Object obj;
        int i;
        java.lang.String obj2;
        kotlin.reflect.KType kType;
        io.ktor.client.statement.HttpResponse httpResponse;
        io.ktor.http.HttpStatusCode status;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.identity_documents.IdentityDocumentsApi$uploadIdentityDocuments$1) {
            identityDocumentsApi$uploadIdentityDocuments$1 = (com.ingo.sdk.kotlin.common.features.identity_documents.IdentityDocumentsApi$uploadIdentityDocuments$1) continuation;
            if ((identityDocumentsApi$uploadIdentityDocuments$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                identityDocumentsApi$uploadIdentityDocuments$1.getHighSpeedVideoSizes -= 2147483648;
                obj = identityDocumentsApi$uploadIdentityDocuments$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = identityDocumentsApi$uploadIdentityDocuments$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String baseUrl = this.configuration.getBaseUrl();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(baseUrl);
                    sb.append("customers/manual-verification");
                    obj2 = sb.toString();
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
                    httpRequestBuilder.setBody(new com.ingo.sdk.kotlin.common.features.identity_documents.model.IdentityDocumentsRequest(str, str2, str3, this.configuration.getCustomerId()));
                    kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.identity_documents.model.IdentityDocumentsRequest.class);
                    try {
                        kType = kotlin.jvm.internal.Reflection.typeOf(com.ingo.sdk.kotlin.common.features.identity_documents.model.IdentityDocumentsRequest.class);
                    } catch (java.lang.Throwable unused) {
                        kType = null;
                    }
                    httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
                    io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                    identityDocumentsApi$uploadIdentityDocuments$1.getHighSpeedVideoFpsRangesFor = obj2;
                    identityDocumentsApi$uploadIdentityDocuments$1.getHighSpeedVideoSizes = 1;
                    obj = httpStatement.execute(identityDocumentsApi$uploadIdentityDocuments$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            if (obj != null) {
                                return new com.ingo.sdk.kotlin.common.core.functional.Either.Right((com.ingo.sdk.kotlin.common.features.identity_documents.model.IdentityDocumentsResponse) obj);
                            }
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.features.identity_documents.model.IdentityDocumentsResponse");
                        }
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String str4 = (java.lang.String) obj;
                        kotlinx.serialization.json.Json json = getJson();
                        json.getSerializersModule();
                        return new com.ingo.sdk.kotlin.common.core.functional.Either.Left(new com.ingo.sdk.kotlin.common.core.exception.ApiFailure(new com.ingo.sdk.kotlin.common.model.ApiErrorThrowable(deserializeErrorResponse((com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse) json.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse.INSTANCE.serializer(), str4), str4))));
                    }
                    obj2 = (java.lang.String) identityDocumentsApi$uploadIdentityDocuments$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                httpResponse = (io.ktor.client.statement.HttpResponse) obj;
                trackApiRequestCompleted(obj2);
                status = httpResponse.getStatus();
                if (kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getOK()) && !kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getCreated()) && !kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getAccepted()) && !kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getNoContent())) {
                    trackApiRequestFailed(obj2, httpResponse);
                    identityDocumentsApi$uploadIdentityDocuments$1.getHighSpeedVideoFpsRangesFor = null;
                    identityDocumentsApi$uploadIdentityDocuments$1.getHighSpeedVideoSizes = 3;
                    obj = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, identityDocumentsApi$uploadIdentityDocuments$1, 1, null);
                } else {
                    io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
                    kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.identity_documents.model.IdentityDocumentsResponse.class);
                    kotlin.reflect.KType kType2 = kotlin.jvm.internal.Reflection.typeOf(com.ingo.sdk.kotlin.common.features.identity_documents.model.IdentityDocumentsResponse.class);
                    io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass2, kType2);
                    identityDocumentsApi$uploadIdentityDocuments$1.getHighSpeedVideoFpsRangesFor = null;
                    identityDocumentsApi$uploadIdentityDocuments$1.getHighSpeedVideoSizes = 2;
                    obj = call.bodyNullable(typeInfo, identityDocumentsApi$uploadIdentityDocuments$1);
                }
                return coroutine_suspended;
            }
        }
        identityDocumentsApi$uploadIdentityDocuments$1 = new com.ingo.sdk.kotlin.common.features.identity_documents.IdentityDocumentsApi$uploadIdentityDocuments$1(this, continuation);
        obj = identityDocumentsApi$uploadIdentityDocuments$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identityDocumentsApi$uploadIdentityDocuments$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        httpResponse = (io.ktor.client.statement.HttpResponse) obj;
        trackApiRequestCompleted(obj2);
        status = httpResponse.getStatus();
        if (kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getOK())) {
        }
        io.ktor.client.call.HttpClientCall call2 = httpResponse.getCall();
        kotlin.reflect.KClass orCreateKotlinClass22 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.identity_documents.model.IdentityDocumentsResponse.class);
        kotlin.reflect.KType kType22 = kotlin.jvm.internal.Reflection.typeOf(com.ingo.sdk.kotlin.common.features.identity_documents.model.IdentityDocumentsResponse.class);
        io.ktor.util.reflect.TypeInfo typeInfo2 = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass22, kType22);
        identityDocumentsApi$uploadIdentityDocuments$1.getHighSpeedVideoFpsRangesFor = null;
        identityDocumentsApi$uploadIdentityDocuments$1.getHighSpeedVideoSizes = 2;
        obj = call2.bodyNullable(typeInfo2, identityDocumentsApi$uploadIdentityDocuments$1);
    }
}
