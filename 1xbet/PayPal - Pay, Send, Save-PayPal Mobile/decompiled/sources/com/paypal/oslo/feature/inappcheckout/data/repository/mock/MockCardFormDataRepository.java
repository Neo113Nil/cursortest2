package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockCardFormDataRepository;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/CardFormDataRepository;", "Landroid/content/Context;", "context", "Lkotlinx/serialization/json/Json;", "json", "Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;", "mockFileNameProvider", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockCardJsonParser;", "jsonParser", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/CardFormDataEntityMapper;", "cardFormDataEntityMapper", "<init>", "(Landroid/content/Context;Lkotlinx/serialization/json/Json;Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockCardJsonParser;Lcom/paypal/oslo/feature/inappcheckout/data/mapper/CardFormDataEntityMapper;)V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "fiId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;", "getCardFormData", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lkotlinx/serialization/json/Json;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockCardJsonParser;", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/CardFormDataEntityMapper;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockCardFormDataRepository implements com.paypal.oslo.feature.inappcheckout.domain.repository.CardFormDataRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.mapper.CardFormDataEntityMapper getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    @javax.inject.Inject
    public MockCardFormDataRepository(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, kotlinx.serialization.json.Json json, com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser mockCardJsonParser, com.paypal.oslo.feature.inappcheckout.data.mapper.CardFormDataEntityMapper cardFormDataEntityMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockFileNameProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockCardJsonParser, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardFormDataEntityMapper, "");
        this.Camera2StreamConfigurationMap = context;
        this.getHighResolutionOutputSizeshNQ4ISI = json;
        this.getHighSpeedVideoFpsRangesFor = mockFileNameProvider;
        this.getHighSpeedVideoSizes = mockCardJsonParser;
        this.getHighSpeedVideoFpsRanges = cardFormDataEntityMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d5 A[Catch: all -> 0x0048, RaiseCancellationException -> 0x004b, TryCatch #4 {RaiseCancellationException -> 0x004b, all -> 0x0048, blocks: (B:11:0x0044, B:12:0x0085, B:16:0x00b7, B:18:0x00d5, B:20:0x00dd, B:22:0x00e7, B:24:0x00ed, B:25:0x00f3, B:29:0x00ff, B:31:0x0109, B:33:0x010f, B:35:0x0117, B:37:0x011f, B:39:0x0129, B:41:0x0131, B:42:0x0144, B:44:0x014a, B:46:0x015e, B:48:0x0164, B:51:0x016c, B:53:0x0176, B:55:0x017c, B:57:0x0186, B:59:0x018c, B:60:0x0192, B:62:0x019c, B:64:0x01a2, B:65:0x01a8, B:67:0x01b1, B:69:0x01bb, B:71:0x01c1, B:73:0x01c9, B:75:0x01d3, B:77:0x01d9, B:78:0x01dd, B:88:0x01f8, B:90:0x0202, B:92:0x020a, B:94:0x0214, B:96:0x021c, B:98:0x0224, B:100:0x022a, B:103:0x0233, B:104:0x0249, B:118:0x024f, B:119:0x0252, B:123:0x005f), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f8 A[Catch: all -> 0x0048, RaiseCancellationException -> 0x004b, TryCatch #4 {RaiseCancellationException -> 0x004b, all -> 0x0048, blocks: (B:11:0x0044, B:12:0x0085, B:16:0x00b7, B:18:0x00d5, B:20:0x00dd, B:22:0x00e7, B:24:0x00ed, B:25:0x00f3, B:29:0x00ff, B:31:0x0109, B:33:0x010f, B:35:0x0117, B:37:0x011f, B:39:0x0129, B:41:0x0131, B:42:0x0144, B:44:0x014a, B:46:0x015e, B:48:0x0164, B:51:0x016c, B:53:0x0176, B:55:0x017c, B:57:0x0186, B:59:0x018c, B:60:0x0192, B:62:0x019c, B:64:0x01a2, B:65:0x01a8, B:67:0x01b1, B:69:0x01bb, B:71:0x01c1, B:73:0x01c9, B:75:0x01d3, B:77:0x01d9, B:78:0x01dd, B:88:0x01f8, B:90:0x0202, B:92:0x020a, B:94:0x0214, B:96:0x021c, B:98:0x0224, B:100:0x022a, B:103:0x0233, B:104:0x0249, B:118:0x024f, B:119:0x0252, B:123:0x005f), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r5v0, types: [arrow.core.raise.DefaultRaise, int] */
    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.CardFormDataRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCardFormData(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity>> continuation) {
        com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardFormDataRepository$getCardFormData$1 mockCardFormDataRepository$getCardFormData$1;
        ?? r5;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        java.lang.String str3;
        kotlinx.serialization.json.JsonObject jsonObject;
        kotlinx.serialization.json.JsonElement jsonElement;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        kotlinx.serialization.json.JsonElement jsonElement2;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.inappcheckout.data.dto.PrefillCardInfoDTO prefillCardInfoDTO;
        kotlinx.serialization.json.JsonElement jsonElement3;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        kotlinx.serialization.json.JsonElement jsonElement4;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
        kotlinx.serialization.json.JsonElement jsonElement5;
        kotlinx.serialization.json.JsonObject jsonObject2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive4;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive5;
        kotlinx.serialization.json.JsonElement jsonElement6;
        kotlinx.serialization.json.JsonElement jsonElement7;
        kotlinx.serialization.json.JsonObject jsonObject3;
        kotlinx.serialization.json.JsonElement jsonElement8;
        kotlinx.serialization.json.JsonElement jsonElement9;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive6;
        try {
            try {
                if (continuation instanceof com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardFormDataRepository$getCardFormData$1) {
                    mockCardFormDataRepository$getCardFormData$1 = (com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardFormDataRepository$getCardFormData$1) continuation;
                    if ((mockCardFormDataRepository$getCardFormData$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                        mockCardFormDataRepository$getCardFormData$1.getOutputFormats -= 2147483648;
                        java.lang.Object obj = mockCardFormDataRepository$getCardFormData$1.getInputFormats;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        r5 = mockCardFormDataRepository$getCardFormData$1.getOutputFormats;
                        if (r5 != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            defaultRaise = new arrow.core.raise.DefaultRaise(false);
                            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                            mockCardFormDataRepository$getCardFormData$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            mockCardFormDataRepository$getCardFormData$1.getOutputMinFrameDuration = str2;
                            mockCardFormDataRepository$getCardFormData$1.getHighSpeedVideoSizesFor = defaultRaise;
                            mockCardFormDataRepository$getCardFormData$1.getInputSizeshNQ4ISI = defaultRaise2;
                            mockCardFormDataRepository$getCardFormData$1.Camera2StreamConfigurationMap = 0;
                            mockCardFormDataRepository$getCardFormData$1.getHighSpeedVideoFpsRanges = 0;
                            mockCardFormDataRepository$getCardFormData$1.getHighSpeedVideoSizes = 0;
                            mockCardFormDataRepository$getCardFormData$1.getHighSpeedVideoFpsRangesFor = 0;
                            mockCardFormDataRepository$getCardFormData$1.getOutputFormats = 1;
                            if (kotlinx.coroutines.DelayKt.delay(2000L, mockCardFormDataRepository$getCardFormData$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            raise = defaultRaise2;
                            str3 = str2;
                        } else {
                            if (r5 != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i = mockCardFormDataRepository$getCardFormData$1.getHighSpeedVideoFpsRangesFor;
                            int i2 = mockCardFormDataRepository$getCardFormData$1.getHighSpeedVideoSizes;
                            int i3 = mockCardFormDataRepository$getCardFormData$1.getHighSpeedVideoFpsRanges;
                            int i4 = mockCardFormDataRepository$getCardFormData$1.Camera2StreamConfigurationMap;
                            raise = (arrow.core.raise.Raise) mockCardFormDataRepository$getCardFormData$1.getInputSizeshNQ4ISI;
                            defaultRaise = (arrow.core.raise.DefaultRaise) mockCardFormDataRepository$getCardFormData$1.getHighSpeedVideoSizesFor;
                            str3 = (java.lang.String) mockCardFormDataRepository$getCardFormData$1.getOutputMinFrameDuration;
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        java.lang.String getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getGetHighResolutionOutputSizeshNQ4ISI();
                        android.content.Context context = this.Camera2StreamConfigurationMap;
                        kotlinx.serialization.json.Json json = this.getHighResolutionOutputSizeshNQ4ISI;
                        java.io.InputStream open = context.getAssets().open(getHighResolutionOutputSizeshNQ4ISI);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open, "");
                        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(open, kotlin.text.Charsets.UTF_8), 8192);
                        java.lang.String readText = kotlin.io.TextStreamsKt.readText(bufferedReader);
                        java.lang.String str4 = null;
                        kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                        json.getSerializersModule();
                        kotlinx.serialization.json.JsonElement jsonElement10 = (kotlinx.serialization.json.JsonElement) ((kotlinx.serialization.json.JsonObject) json.decodeFromString(kotlinx.serialization.json.JsonObject.INSTANCE.serializer(), readText)).get((java.lang.Object) "cardFormData");
                        jsonObject = jsonElement10 == null ? kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement10) : null;
                        if (kotlin.jvm.internal.Intrinsics.areEqual((jsonObject != null || (jsonElement9 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "__typename")) == null || (jsonPrimitive6 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement9)) == null) ? null : jsonPrimitive6.getContent(), "externalCardFormDataErrorResponse")) {
                            kotlinx.serialization.json.JsonObject jsonObject4 = (jsonObject == null || (jsonElement7 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "cardholder")) == null || (jsonObject3 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement7)) == null || (jsonElement8 = (kotlinx.serialization.json.JsonElement) jsonObject3.get((java.lang.Object) "name")) == null) ? null : kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement8);
                            kotlinx.serialization.json.JsonArray jsonArray = (jsonObject == null || (jsonElement6 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "addresses")) == null) ? null : kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement6);
                            if (jsonArray != null) {
                                kotlinx.serialization.json.JsonArray jsonArray2 = jsonArray;
                                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(jsonArray2, 10));
                                java.util.Iterator<kotlinx.serialization.json.JsonElement> it = jsonArray2.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(this.getHighSpeedVideoSizes.parseAddressDTO(kotlinx.serialization.json.JsonElementKt.getJsonObject(it.next())));
                                }
                                arrayList = arrayList2;
                            } else {
                                arrayList = null;
                            }
                            if (arrayList == null) {
                                arrayList = kotlin.collections.CollectionsKt.emptyList();
                            }
                            if (str3 == null || jsonObject == null || (jsonElement5 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "prefillCardInfo")) == null || (jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement5)) == null) {
                                prefillCardInfoDTO = null;
                            } else {
                                kotlinx.serialization.json.JsonElement jsonElement11 = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) "last4Digits");
                                java.lang.String content = (jsonElement11 == null || (jsonPrimitive5 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement11)) == null) ? null : jsonPrimitive5.getContent();
                                kotlinx.serialization.json.JsonElement jsonElement12 = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) "cardBrand");
                                prefillCardInfoDTO = new com.paypal.oslo.feature.inappcheckout.data.dto.PrefillCardInfoDTO(content, (jsonElement12 == null || (jsonPrimitive4 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement12)) == null) ? null : jsonPrimitive4.getContent());
                            }
                            java.lang.String content2 = (jsonObject4 == null || (jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject4.get((java.lang.Object) com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName)) == null || (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement4)) == null) ? null : jsonPrimitive3.getContent();
                            if (jsonObject4 != null && (jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject4.get((java.lang.Object) "surname")) != null && (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) != null) {
                                str4 = jsonPrimitive2.getContent();
                            }
                            com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity convert = this.getHighSpeedVideoFpsRanges.convert(new com.paypal.oslo.feature.inappcheckout.data.dto.CardFormDataDTO(new com.paypal.oslo.feature.inappcheckout.data.dto.CardholderDTO(content2, str4), arrayList, prefillCardInfoDTO));
                            defaultRaise.complete();
                            return new arrow.core.Either.Right(convert);
                        }
                        kotlinx.serialization.json.JsonElement jsonElement13 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);
                        kotlinx.serialization.json.JsonArray jsonArray3 = jsonElement13 != null ? kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement13) : null;
                        kotlinx.serialization.json.JsonObject jsonObject5 = (jsonArray3 == null || (jsonElement2 = (kotlinx.serialization.json.JsonElement) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) jsonArray3)) == null) ? null : kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement2);
                        if (jsonObject5 != null && (jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject5.get((java.lang.Object) "name")) != null && (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) != null) {
                            str4 = jsonPrimitive.getContent();
                        }
                        java.lang.String str5 = str4 == null ? "" : str4;
                        raise.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(str5, str5, false, null, null, 24, null));
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
                java.lang.String readText2 = kotlin.io.TextStreamsKt.readText(bufferedReader);
                java.lang.String str42 = null;
                kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                json.getSerializersModule();
                kotlinx.serialization.json.JsonElement jsonElement102 = (kotlinx.serialization.json.JsonElement) ((kotlinx.serialization.json.JsonObject) json.decodeFromString(kotlinx.serialization.json.JsonObject.INSTANCE.serializer(), readText2)).get((java.lang.Object) "cardFormData");
                if (jsonElement102 == null) {
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual((jsonObject != null || (jsonElement9 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "__typename")) == null || (jsonPrimitive6 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement9)) == null) ? null : jsonPrimitive6.getContent(), "externalCardFormDataErrorResponse")) {
                }
            } finally {
            }
            if (r5 != 0) {
            }
            java.lang.String getHighResolutionOutputSizeshNQ4ISI2 = this.getHighSpeedVideoFpsRangesFor.getGetHighResolutionOutputSizeshNQ4ISI();
            android.content.Context context2 = this.Camera2StreamConfigurationMap;
            kotlinx.serialization.json.Json json2 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.io.InputStream open2 = context2.getAssets().open(getHighResolutionOutputSizeshNQ4ISI2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open2, "");
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(open2, kotlin.text.Charsets.UTF_8), 8192);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            r5.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r5));
        } catch (java.lang.Throwable th) {
            r5.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        mockCardFormDataRepository$getCardFormData$1 = new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardFormDataRepository$getCardFormData$1(this, continuation);
        java.lang.Object obj2 = mockCardFormDataRepository$getCardFormData$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r5 = mockCardFormDataRepository$getCardFormData$1.getOutputFormats;
    }
}
