package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B;\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0010H\u0096@¢\u0006\u0004\b\u0017\u0010\u0014J$\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010$\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockAuthRepository;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthRepository;", "Landroid/content/Context;", "context", "Lkotlinx/serialization/json/Json;", "json", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/FundingSelectionEntityMapper;", "fundingSelectionMapper", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/InitializeCheckoutEntityMapper;", "initializeCheckoutMapper", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/ContingencyMapper;", "contingencyMapper", "Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;", "mockFileNameProvider", "<init>", "(Landroid/content/Context;Lkotlinx/serialization/json/Json;Lcom/paypal/oslo/feature/inappcheckout/data/mapper/FundingSelectionEntityMapper;Lcom/paypal/oslo/feature/inappcheckout/data/mapper/InitializeCheckoutEntityMapper;Lcom/paypal/oslo/feature/inappcheckout/data/mapper/ContingencyMapper;Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "getAuthData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$TransferSessionError;", "Lcom/paypal/oslo/feature/inappcheckout/features/auth/SessionTransferData;", "transferSession", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;", "checkoutToken", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError;", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData;", "getOneShotAuthentication", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getHighSpeedVideoSizes", "Lkotlinx/serialization/json/Json;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/FundingSelectionEntityMapper;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/InitializeCheckoutEntityMapper;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/ContingencyMapper;", "getInputFormats", "Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockAuthRepository implements com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper getHighSpeedVideoSizes;
    private final android.content.Context getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.mapper.InitializeCheckoutEntityMapper Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider getInputFormats;
    public static final int $stable = 8;

    @javax.inject.Inject
    public MockAuthRepository(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, kotlinx.serialization.json.Json json, com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper fundingSelectionEntityMapper, com.paypal.oslo.feature.inappcheckout.data.mapper.InitializeCheckoutEntityMapper initializeCheckoutEntityMapper, com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper contingencyMapper, com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSelectionEntityMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeCheckoutEntityMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockFileNameProvider, "");
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighResolutionOutputSizeshNQ4ISI = json;
        this.getHighSpeedVideoSizes = fundingSelectionEntityMapper;
        this.Camera2StreamConfigurationMap = initializeCheckoutEntityMapper;
        this.getHighSpeedVideoFpsRangesFor = contingencyMapper;
        this.getInputFormats = mockFileNameProvider;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository
    public final java.lang.Object getAuthData(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse>> continuation) {
        return com.paypal.oslo.feature.inappcheckout.data.utils.RetryUtilKt.executeWithRetry(0, new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository$getAuthData$2(this, null), continuation);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository
    public final java.lang.Object transferSession(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.TransferSessionError, com.paypal.oslo.feature.inappcheckout.features.auth.SessionTransferData>> continuation) {
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.inappcheckout.features.auth.SessionTransferData(""));
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository
    public final java.lang.Object getOneShotAuthentication(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData>> continuation) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.lang.String value = checkoutToken.getValue();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("https://www.te-braintree.qa.paypal.com/checkoutnow?appSwitchEligible=false&token=");
            sb.append(value);
            com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData checkoutAuthenticationSuccessData = new com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData("", new com.paypal.oslo.feature.identity.api.model.CheckoutData(new com.paypal.oslo.feature.identity.api.model.CheckoutPreferences("https://gse-appstestbed.com/braintree-payments/cancel", "https://gse-appstestbed.com/braintree-payments/success", sb.toString(), null, new com.paypal.oslo.feature.identity.api.model.AppSwitchPreferences(null, null, null, null, null)), null));
            defaultRaise.complete();
            return new arrow.core.Either.Right(checkoutAuthenticationSuccessData);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity access$checkForFundingSelectionErrors(com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository mockAuthRepository, kotlinx.serialization.json.JsonObject jsonObject, java.lang.String str) {
        java.lang.String str2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        kotlinx.serialization.json.JsonElement jsonElement;
        kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get("fundingSelectionError");
        kotlinx.serialization.json.JsonObject jsonObject2 = jsonElement2 != null ? kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement2) : null;
        kotlinx.serialization.json.JsonArray jsonArray = (jsonObject2 == null || (jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY)) == null) ? null : kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement);
        if (jsonArray == null || jsonArray.isEmpty()) {
            return null;
        }
        kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonArray.get(0)).get((java.lang.Object) "name");
        if (jsonElement3 == null || (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) == null || (str2 = jsonPrimitive.getContent()) == null) {
            str2 = "UNKNOWN_ERROR";
        }
        java.lang.String str3 = str2;
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(str3, "Funding selection error from mock", kotlin.jvm.internal.Intrinsics.areEqual(str3, com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR), null, str);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity access$checkForTopLevelErrors(com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository mockAuthRepository, kotlinx.serialization.json.JsonObject jsonObject, java.lang.String str) {
        java.lang.String str2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        kotlinx.serialization.json.JsonElement jsonElement;
        kotlinx.serialization.json.JsonElement jsonElement2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
        kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);
        java.lang.String str3 = null;
        kotlinx.serialization.json.JsonArray jsonArray = jsonElement3 != null ? kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement3) : null;
        if (jsonArray == null || jsonArray.isEmpty()) {
            return null;
        }
        kotlinx.serialization.json.JsonObject jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonArray.get(0));
        kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS);
        kotlinx.serialization.json.JsonObject jsonObject3 = jsonElement4 != null ? kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement4) : null;
        if (jsonObject3 == null || (jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject3.get((java.lang.Object) "name")) == null || (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement2)) == null || (str2 = jsonPrimitive3.getContent()) == null) {
            str2 = "UNKNOWN_ERROR";
        }
        java.lang.String str4 = str2;
        kotlinx.serialization.json.JsonArray jsonArray2 = (jsonObject3 == null || (jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject3.get((java.lang.Object) "details")) == null) ? null : kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement);
        if (jsonArray2 != null && !jsonArray2.isEmpty()) {
            kotlinx.serialization.json.JsonElement jsonElement5 = (kotlinx.serialization.json.JsonElement) kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonArray2.get(0)).get((java.lang.Object) com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
            if (jsonElement5 != null && (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement5)) != null) {
                str3 = jsonPrimitive2.getContent();
            }
        } else {
            kotlinx.serialization.json.JsonElement jsonElement6 = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) "message");
            if (jsonElement6 != null && (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement6)) != null) {
                str3 = jsonPrimitive.getContent();
            }
        }
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(str4, str3 == null ? "An error occurred" : str3, kotlin.jvm.internal.Intrinsics.areEqual(str4, com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR), null, str);
    }

    public static final /* synthetic */ java.lang.String access$extractReturnUrl(com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository mockAuthRepository, kotlinx.serialization.json.JsonObject jsonObject) {
        kotlinx.serialization.json.JsonObject jsonObject2;
        kotlinx.serialization.json.JsonElement jsonElement;
        kotlinx.serialization.json.JsonObject jsonObject3;
        kotlinx.serialization.json.JsonElement jsonElement2;
        kotlinx.serialization.json.JsonObject jsonObject4;
        kotlinx.serialization.json.JsonElement jsonElement3;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject.get("initializeCheckout");
        if (jsonElement4 == null || (jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement4)) == null || (jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) "checkoutContext")) == null || (jsonObject3 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement)) == null || (jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject3.get((java.lang.Object) "integrationDetails")) == null || (jsonObject4 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement2)) == null || (jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject4.get((java.lang.Object) "returnUrl")) == null || (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) == null) {
            return null;
        }
        return jsonPrimitive.getContent();
    }

    public static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity access$toEntity(com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository mockAuthRepository, com.paypal.oslo.feature.inappcheckout.data.dto.BuyerInfoDTO buyerInfoDTO) {
        java.util.ArrayList arrayList;
        java.lang.String userId = buyerInfoDTO.getUserId();
        java.lang.String str = userId == null ? "" : userId;
        java.lang.String email = buyerInfoDTO.getEmail();
        java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO> contingencies = buyerInfoDTO.getContingencies();
        if (contingencies != null) {
            java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO> list = contingencies;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(mockAuthRepository.getHighSpeedVideoFpsRangesFor.map((com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        com.paypal.oslo.feature.inappcheckout.data.dto.ProfileImageDTO profileImage = buyerInfoDTO.getProfileImage();
        java.lang.String imagePath = profileImage != null ? profileImage.getImagePath() : null;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ProfileImage profileImage2 = new com.paypal.oslo.feature.inappcheckout.domain.entity.ProfileImage(imagePath != null ? imagePath : "");
        com.paypal.oslo.feature.inappcheckout.data.dto.BuyerNameDTO name2 = buyerInfoDTO.getName();
        java.lang.String givenName = name2 != null ? name2.getGivenName() : null;
        com.paypal.oslo.feature.inappcheckout.data.dto.BuyerNameDTO name3 = buyerInfoDTO.getName();
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity(str, new com.paypal.oslo.feature.inappcheckout.domain.entity.Name(givenName, name3 != null ? name3.getSurname() : null), profileImage2, arrayList, email);
    }
}
