package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockAuthorizeBillingAgreementRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthorizeBillingAgreementRepository;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;", "mockFileNameProvider", "Lkotlinx/serialization/json/Json;", "json", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/ContingencyMapper;", "contingencyMapper", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;Lkotlinx/serialization/json/Json;Lcom/paypal/oslo/feature/inappcheckout/data/mapper/ContingencyMapper;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "fiSelected", "", "useBalance", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthorizeBACreationEntity;", com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.AUTHORIZE, "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getInputFormats", "Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lkotlinx/serialization/json/Json;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/ContingencyMapper;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "getInputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockAuthorizeBillingAgreementRepositoryImpl implements com.paypal.oslo.feature.inappcheckout.domain.repository.AuthorizeBillingAgreementRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper Camera2StreamConfigurationMap;
    private final android.content.Context getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicInteger getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    @javax.inject.Inject
    public MockAuthorizeBillingAgreementRepositoryImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider, kotlinx.serialization.json.Json json, com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper contingencyMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockFileNameProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoFpsRangesFor = mockFileNameProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = json;
        this.Camera2StreamConfigurationMap = contingencyMapper;
        this.getHighSpeedVideoSizes = coroutineDispatcher;
        this.getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.AuthorizeBillingAgreementRepository
    public final java.lang.Object authorize(java.lang.String str, java.lang.Boolean bool, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoSizes, new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl$authorize$2(str, this, bool, null), continuation);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity access$checkForTopLevelErrors(com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl mockAuthorizeBillingAgreementRepositoryImpl, kotlinx.serialization.json.JsonObject jsonObject) {
        java.lang.String str;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        kotlinx.serialization.json.JsonElement jsonElement;
        kotlinx.serialization.json.JsonElement jsonElement2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
        kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);
        java.lang.String str2 = null;
        kotlinx.serialization.json.JsonArray jsonArray = jsonElement3 != null ? kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement3) : null;
        if (jsonArray == null || jsonArray.isEmpty()) {
            return null;
        }
        kotlinx.serialization.json.JsonObject jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonArray.get(0));
        kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS);
        kotlinx.serialization.json.JsonObject jsonObject3 = jsonElement4 != null ? kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement4) : null;
        if (jsonObject3 == null || (jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject3.get((java.lang.Object) "name")) == null || (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement2)) == null || (str = jsonPrimitive3.getContent()) == null) {
            str = "UNKNOWN_ERROR";
        }
        java.lang.String str3 = str;
        kotlinx.serialization.json.JsonArray jsonArray2 = (jsonObject3 == null || (jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject3.get((java.lang.Object) "details")) == null) ? null : kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement);
        if (jsonArray2 != null && !jsonArray2.isEmpty()) {
            kotlinx.serialization.json.JsonElement jsonElement5 = (kotlinx.serialization.json.JsonElement) kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonArray2.get(0)).get((java.lang.Object) com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
            if (jsonElement5 != null && (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement5)) != null) {
                str2 = jsonPrimitive2.getContent();
            }
        } else {
            kotlinx.serialization.json.JsonElement jsonElement6 = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) "message");
            if (jsonElement6 != null && (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement6)) != null) {
                str2 = jsonPrimitive.getContent();
            }
        }
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(str3, str2 == null ? "An error occurred" : str2, kotlin.jvm.internal.Intrinsics.areEqual(str3, com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR), null, null);
    }

    public static final /* synthetic */ java.lang.String access$determineCtaMockFileName(com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl mockAuthorizeBillingAgreementRepositoryImpl, int i) {
        java.lang.String getHighSpeedVideoSizes = mockAuthorizeBillingAgreementRepositoryImpl.getHighSpeedVideoFpsRangesFor.getGetHighSpeedVideoSizes();
        return (i <= 1 || !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) getHighSpeedVideoSizes, (java.lang.CharSequence) "contingency", false, 2, (java.lang.Object) null)) ? getHighSpeedVideoSizes : "mocks/cta_mocks/cta_response_success.json";
    }
}
