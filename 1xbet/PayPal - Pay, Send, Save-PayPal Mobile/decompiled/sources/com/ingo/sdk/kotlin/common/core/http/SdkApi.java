package com.ingo.sdk.kotlin.common.core.http;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00138\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/http/SdkApi;", "Lcom/ingo/sdk/kotlin/common/core/http/BaseApi;", "<init>", "()V", "Lcom/ingo/sdk/kotlin/common/core/http/response/GenericErrorResponse;", "errorResponse", "", "responseString", "Lcom/ingo/sdk/kotlin/common/core/http/response/ErrorResponse;", "deserializeErrorResponse", "(Lcom/ingo/sdk/kotlin/common/core/http/response/GenericErrorResponse;Ljava/lang/String;)Lcom/ingo/sdk/kotlin/common/core/http/response/ErrorResponse;", "url", "", "apiAnalyticsProperties", "(Ljava/lang/String;)Ljava/util/Map;", "", "getHighSpeedVideoFpsRangesFor", "J", "getHighSpeedVideoSizes", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public class SdkApi extends com.ingo.sdk.kotlin.common.core.http.BaseApi {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private long getHighSpeedVideoSizes = com.ingo.sdk.kotlin.common.analytics.SystemTimeKt.systemTime();
    private final kotlinx.serialization.json.Json json = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.common.core.http.SdkApi$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.ingo.sdk.kotlin.common.core.http.SdkApi.m10763$r8$lambda$JFtCZJj6ru8G8amoo7xNbkAYes((kotlinx.serialization.json.JsonBuilder) obj);
        }
    }, 1, null);

    protected final kotlinx.serialization.json.Json getJson() {
        return this.json;
    }

    public com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse deserializeErrorResponse(com.ingo.sdk.kotlin.common.core.http.response.GenericErrorResponse errorResponse, java.lang.String responseString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseString, "");
        java.lang.String errorCode = errorResponse.getErrorCode();
        switch (errorCode.hashCode()) {
            case -1989750385:
                if (errorCode.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.DEVICE_VERIFICATION_FAILURE)) {
                    kotlinx.serialization.json.Json json = this.json;
                    json.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.DeviceVerificationFailureErrorResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case -1632556730:
                if (errorCode.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.TRANSACTION_CHECK_DECLINED)) {
                    kotlinx.serialization.json.Json json2 = this.json;
                    json2.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json2.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.TransactionDeclinedErrorResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case -1565660154:
                if (errorCode.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.TRANSACTION_IN_PROGRESS)) {
                    kotlinx.serialization.json.Json json3 = this.json;
                    json3.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json3.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case -1356775180:
                if (errorCode.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.UNAUTHORIZED)) {
                    kotlinx.serialization.json.Json json4 = this.json;
                    json4.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json4.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.UnauthorizedResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case -1034430145:
                if (errorCode.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.ENROLLMENT_NOT_COMPLETE)) {
                    kotlinx.serialization.json.Json json5 = this.json;
                    json5.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json5.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.CustomerEnrollmentNotCompleteResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case -950822010:
                if (errorCode.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.IDENTITY_VERIFICATION_FAILURE)) {
                    kotlinx.serialization.json.Json json6 = this.json;
                    json6.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json6.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.IdentityVerificationFailureResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case -820597285:
                if (errorCode.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.MANUAL_VERIFICATION_IN_PROGRESS)) {
                    kotlinx.serialization.json.Json json7 = this.json;
                    json7.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json7.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.IdentityVerificationInProgressErrorResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case -630263762:
                if (errorCode.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR)) {
                    kotlinx.serialization.json.Json json8 = this.json;
                    json8.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json8.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.InternalServerErrorResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case -578644664:
                if (errorCode.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.LOAD_AMOUNT_LESS_THAN_MINIMUM)) {
                    kotlinx.serialization.json.Json json9 = this.json;
                    json9.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json9.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.LoadAmountLessThanMinimumErrorResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case -283547995:
                if (errorCode.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INVALID_PROMO_CODE)) {
                    kotlinx.serialization.json.Json json10 = this.json;
                    json10.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json10.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.InvalidPromoCodeResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case 110872433:
                if (errorCode.equals("TRANSACTION_IN_REVIEW")) {
                    kotlinx.serialization.json.Json json11 = this.json;
                    json11.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json11.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.TransactionInReviewResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case 248778465:
                if (errorCode.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.TRANSACTION_VOIDED_CHECK_REQUIRED)) {
                    kotlinx.serialization.json.Json json12 = this.json;
                    json12.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json12.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.VoidImageRequiredResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case 306544279:
                if (errorCode.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INPUT_VALIDATION_ERROR)) {
                    kotlinx.serialization.json.Json json13 = this.json;
                    json13.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json13.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.InputValidationErrorResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case 437960460:
                if (errorCode.equals("LEGAL_DOCUMENTS_PENDING_ACCEPTANCE")) {
                    kotlinx.serialization.json.Json json14 = this.json;
                    json14.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json14.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.LegalDocumentsPendingAcceptanceResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case 460501168:
                if (errorCode.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.TRANSACTION_VOIDED_CHECK_IN_REVIEW)) {
                    kotlinx.serialization.json.Json json15 = this.json;
                    json15.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json15.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.VoidImageInReviewResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case 566468262:
                if (errorCode.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.IMAGE_PERSISTENCE_FAILURE)) {
                    kotlinx.serialization.json.Json json16 = this.json;
                    json16.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json16.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.ImagePersistenceFailureResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case 718750450:
                if (errorCode.equals("TRANSACTION_LOAD_FAILURE")) {
                    kotlinx.serialization.json.Json json17 = this.json;
                    json17.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json17.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.TransactionLoadFailureErrorResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case 1063480616:
                if (errorCode.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.IMAGE_VALIDATION_FAILURE)) {
                    kotlinx.serialization.json.Json json18 = this.json;
                    json18.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json18.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case 1088245833:
                if (errorCode.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.UNSUPPORTED_API_VERSION)) {
                    kotlinx.serialization.json.Json json19 = this.json;
                    json19.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json19.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.UnsupportedApiVersionResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case 1136900216:
                if (errorCode.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.SESSION_TIMEOUT)) {
                    kotlinx.serialization.json.Json json20 = this.json;
                    json20.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json20.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.SessionTimeoutResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case 1208365643:
                if (errorCode.equals("CUSTOMER_MANUAL_VERIFICATION_REQUIRED")) {
                    kotlinx.serialization.json.Json json21 = this.json;
                    json21.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json21.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.IdentityVerificationRequiredResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case 1479517600:
                if (errorCode.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.AMBIGUOUS_API_VERSION)) {
                    kotlinx.serialization.json.Json json22 = this.json;
                    json22.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json22.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.AmbiguousApiVersionResponse.INSTANCE.serializer(), responseString);
                }
                break;
            case 1828390561:
                if (errorCode.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.TRANSACTION_VOIDED_CHECK_SOFT_DECLINED)) {
                    kotlinx.serialization.json.Json json23 = this.json;
                    json23.getSerializersModule();
                    return (com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse) json23.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse.INSTANCE.serializer(), responseString);
                }
                break;
        }
        return errorResponse;
    }

    @Override // com.ingo.sdk.kotlin.common.core.http.BaseApi
    public java.util.Map<java.lang.String, java.lang.String> apiAnalyticsProperties(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        java.util.Map<java.lang.String, java.lang.String> defaultProperties$default = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties$default(null, 1, null);
        defaultProperties$default.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.Url, url);
        return defaultProperties$default;
    }

    /* renamed from: $r8$lambda$J-FtCZJj6ru8G8amoo7xNbkAYes, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10763$r8$lambda$JFtCZJj6ru8G8amoo7xNbkAYes(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setClassDiscriminator("#errorCode");
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setCoerceInputValues(true);
        return kotlin.Unit.INSTANCE;
    }
}
