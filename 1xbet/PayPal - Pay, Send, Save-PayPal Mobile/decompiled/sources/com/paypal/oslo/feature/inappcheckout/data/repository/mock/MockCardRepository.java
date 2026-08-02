package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockCardRepository;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/CardRepository;", "Landroid/content/Context;", "context", "Lkotlinx/serialization/json/Json;", "json", "Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;", "mockFileNameProvider", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockCardJsonParser;", "jsonParser", "<init>", "(Landroid/content/Context;Lkotlinx/serialization/json/Json;Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockCardJsonParser;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FIMetadataEntity;", "getFIMetadata", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardMetadata;", "getCardBrand", "getHighSpeedVideoFpsRangesFor", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lkotlinx/serialization/json/Json;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockCardJsonParser;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockCardRepository implements com.paypal.oslo.feature.inappcheckout.domain.repository.CardRepository {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    @javax.inject.Inject
    public MockCardRepository(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, kotlinx.serialization.json.Json json, com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser mockCardJsonParser) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockFileNameProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockCardJsonParser, "");
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoSizes = json;
        this.getHighSpeedVideoFpsRanges = mockFileNameProvider;
        this.getHighSpeedVideoFpsRangesFor = mockCardJsonParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1 A[Catch: all -> 0x003a, RaiseCancellationException -> 0x003d, TryCatch #6 {RaiseCancellationException -> 0x003d, all -> 0x003a, blocks: (B:11:0x0036, B:12:0x0070, B:16:0x00a3, B:18:0x00c1, B:20:0x00c9, B:21:0x00dc, B:23:0x00e2, B:25:0x00f6, B:27:0x00fb, B:28:0x00ff, B:38:0x0112, B:39:0x0115), top: B:10:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c9 A[Catch: all -> 0x003a, RaiseCancellationException -> 0x003d, TryCatch #6 {RaiseCancellationException -> 0x003d, all -> 0x003a, blocks: (B:11:0x0036, B:12:0x0070, B:16:0x00a3, B:18:0x00c1, B:20:0x00c9, B:21:0x00dc, B:23:0x00e2, B:25:0x00f6, B:27:0x00fb, B:28:0x00ff, B:38:0x0112, B:39:0x0115), top: B:10:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb A[Catch: all -> 0x003a, RaiseCancellationException -> 0x003d, TryCatch #6 {RaiseCancellationException -> 0x003d, all -> 0x003a, blocks: (B:11:0x0036, B:12:0x0070, B:16:0x00a3, B:18:0x00c1, B:20:0x00c9, B:21:0x00dc, B:23:0x00e2, B:25:0x00f6, B:27:0x00fb, B:28:0x00ff, B:38:0x0112, B:39:0x0115), top: B:10:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getFIMetadata(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity>> continuation) {
        com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository$getFIMetadata$1 mockCardRepository$getFIMetadata$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.util.ArrayList arrayList;
        kotlinx.serialization.json.JsonArray jsonArray;
        try {
            if (continuation instanceof com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository$getFIMetadata$1) {
                mockCardRepository$getFIMetadata$1 = (com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository$getFIMetadata$1) continuation;
                if ((mockCardRepository$getFIMetadata$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                    mockCardRepository$getFIMetadata$1.getOutputMinFrameDuration -= 2147483648;
                    java.lang.Object obj = mockCardRepository$getFIMetadata$1.getInputFormats;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = mockCardRepository$getFIMetadata$1.getOutputMinFrameDuration;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        try {
                            mockCardRepository$getFIMetadata$1.getHighSpeedVideoFpsRangesFor = defaultRaise;
                            mockCardRepository$getFIMetadata$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise);
                            mockCardRepository$getFIMetadata$1.Camera2StreamConfigurationMap = 0;
                            mockCardRepository$getFIMetadata$1.getHighSpeedVideoSizes = 0;
                            mockCardRepository$getFIMetadata$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            mockCardRepository$getFIMetadata$1.getHighSpeedVideoFpsRanges = 0;
                            mockCardRepository$getFIMetadata$1.getOutputMinFrameDuration = 1;
                            if (kotlinx.coroutines.DelayKt.delay(2000L, mockCardRepository$getFIMetadata$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            defaultRaise2 = defaultRaise;
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = mockCardRepository$getFIMetadata$1.getHighSpeedVideoFpsRanges;
                        int i3 = mockCardRepository$getFIMetadata$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i4 = mockCardRepository$getFIMetadata$1.getHighSpeedVideoSizes;
                        int i5 = mockCardRepository$getFIMetadata$1.Camera2StreamConfigurationMap;
                        defaultRaise2 = (arrow.core.raise.DefaultRaise) mockCardRepository$getFIMetadata$1.getHighSpeedVideoFpsRangesFor;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                        } catch (arrow.core.raise.RaiseCancellationException e2) {
                            e = e2;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    java.lang.String getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getGetHighResolutionOutputSizeshNQ4ISI();
                    android.content.Context context = this.Camera2StreamConfigurationMap;
                    kotlinx.serialization.json.Json json = this.getHighSpeedVideoSizes;
                    java.io.InputStream open = context.getAssets().open(getHighResolutionOutputSizeshNQ4ISI);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open, "");
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(open, kotlin.text.Charsets.UTF_8), 8192);
                    java.lang.String readText = kotlin.io.TextStreamsKt.readText(bufferedReader);
                    arrayList = null;
                    kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                    json.getSerializersModule();
                    kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) ((kotlinx.serialization.json.JsonObject) json.decodeFromString(kotlinx.serialization.json.JsonObject.INSTANCE.serializer(), readText)).get((java.lang.Object) "financialInstrumentMetadataTypeList");
                    jsonArray = jsonElement == null ? kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement) : null;
                    if (jsonArray != null) {
                        kotlinx.serialization.json.JsonArray jsonArray2 = jsonArray;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(jsonArray2, 10));
                        java.util.Iterator<kotlinx.serialization.json.JsonElement> it = jsonArray2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(this.getHighSpeedVideoFpsRangesFor.parseMetadataType(kotlinx.serialization.json.JsonElementKt.getJsonObject(it.next())));
                        }
                        arrayList = arrayList2;
                    }
                    if (arrayList == null) {
                        arrayList = kotlin.collections.CollectionsKt.emptyList();
                    }
                    com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fIMetadataEntity = new com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity(arrayList);
                    defaultRaise2.complete();
                    return new arrow.core.Either.Right(fIMetadataEntity);
                }
            }
            java.lang.String readText2 = kotlin.io.TextStreamsKt.readText(bufferedReader);
            arrayList = null;
            kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
            json.getSerializersModule();
            kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) ((kotlinx.serialization.json.JsonObject) json.decodeFromString(kotlinx.serialization.json.JsonObject.INSTANCE.serializer(), readText2)).get((java.lang.Object) "financialInstrumentMetadataTypeList");
            if (jsonElement2 == null) {
            }
            if (jsonArray != null) {
            }
            if (arrayList == null) {
            }
            com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fIMetadataEntity2 = new com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity(arrayList);
            defaultRaise2.complete();
            return new arrow.core.Either.Right(fIMetadataEntity2);
        } finally {
        }
        mockCardRepository$getFIMetadata$1 = new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository$getFIMetadata$1(this, continuation);
        java.lang.Object obj2 = mockCardRepository$getFIMetadata$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockCardRepository$getFIMetadata$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        java.lang.String getHighResolutionOutputSizeshNQ4ISI2 = this.getHighSpeedVideoFpsRanges.getGetHighResolutionOutputSizeshNQ4ISI();
        android.content.Context context2 = this.Camera2StreamConfigurationMap;
        kotlinx.serialization.json.Json json2 = this.getHighSpeedVideoSizes;
        java.io.InputStream open2 = context2.getAssets().open(getHighResolutionOutputSizeshNQ4ISI2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open2, "");
        java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(open2, kotlin.text.Charsets.UTF_8), 8192);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1 A[Catch: all -> 0x003a, RaiseCancellationException -> 0x003d, TryCatch #6 {RaiseCancellationException -> 0x003d, all -> 0x003a, blocks: (B:11:0x0036, B:12:0x0070, B:16:0x00a3, B:18:0x00c1, B:20:0x00c9, B:21:0x00d6, B:23:0x00dc, B:25:0x00f0, B:27:0x00f6, B:30:0x00fe, B:36:0x0102, B:38:0x0107, B:39:0x010b, B:42:0x011d, B:52:0x012e, B:53:0x0131), top: B:10:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c9 A[Catch: all -> 0x003a, RaiseCancellationException -> 0x003d, TryCatch #6 {RaiseCancellationException -> 0x003d, all -> 0x003a, blocks: (B:11:0x0036, B:12:0x0070, B:16:0x00a3, B:18:0x00c1, B:20:0x00c9, B:21:0x00d6, B:23:0x00dc, B:25:0x00f0, B:27:0x00f6, B:30:0x00fe, B:36:0x0102, B:38:0x0107, B:39:0x010b, B:42:0x011d, B:52:0x012e, B:53:0x0131), top: B:10:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107 A[Catch: all -> 0x003a, RaiseCancellationException -> 0x003d, TryCatch #6 {RaiseCancellationException -> 0x003d, all -> 0x003a, blocks: (B:11:0x0036, B:12:0x0070, B:16:0x00a3, B:18:0x00c1, B:20:0x00c9, B:21:0x00d6, B:23:0x00dc, B:25:0x00f0, B:27:0x00f6, B:30:0x00fe, B:36:0x0102, B:38:0x0107, B:39:0x010b, B:42:0x011d, B:52:0x012e, B:53:0x0131), top: B:10:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCardBrand(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.CardMetadata>> continuation) {
        com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository$getCardBrand$1 mockCardRepository$getCardBrand$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.util.ArrayList arrayList;
        kotlinx.serialization.json.JsonArray jsonArray;
        java.lang.String str;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        try {
            if (continuation instanceof com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository$getCardBrand$1) {
                mockCardRepository$getCardBrand$1 = (com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository$getCardBrand$1) continuation;
                if ((mockCardRepository$getCardBrand$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                    mockCardRepository$getCardBrand$1.getOutputMinFrameDuration -= 2147483648;
                    java.lang.Object obj = mockCardRepository$getCardBrand$1.getOutputFormats;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = mockCardRepository$getCardBrand$1.getOutputMinFrameDuration;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        try {
                            mockCardRepository$getCardBrand$1.getHighSpeedVideoSizes = defaultRaise;
                            mockCardRepository$getCardBrand$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise);
                            mockCardRepository$getCardBrand$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            mockCardRepository$getCardBrand$1.getHighSpeedVideoFpsRanges = 0;
                            mockCardRepository$getCardBrand$1.Camera2StreamConfigurationMap = 0;
                            mockCardRepository$getCardBrand$1.getHighSpeedVideoFpsRangesFor = 0;
                            mockCardRepository$getCardBrand$1.getOutputMinFrameDuration = 1;
                            if (kotlinx.coroutines.DelayKt.delay(2000L, mockCardRepository$getCardBrand$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            defaultRaise2 = defaultRaise;
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = mockCardRepository$getCardBrand$1.getHighSpeedVideoFpsRangesFor;
                        int i3 = mockCardRepository$getCardBrand$1.Camera2StreamConfigurationMap;
                        int i4 = mockCardRepository$getCardBrand$1.getHighSpeedVideoFpsRanges;
                        int i5 = mockCardRepository$getCardBrand$1.getHighResolutionOutputSizeshNQ4ISI;
                        defaultRaise2 = (arrow.core.raise.DefaultRaise) mockCardRepository$getCardBrand$1.getHighSpeedVideoSizes;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                        } catch (arrow.core.raise.RaiseCancellationException e2) {
                            e = e2;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    java.lang.String getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getGetHighResolutionOutputSizeshNQ4ISI();
                    android.content.Context context = this.Camera2StreamConfigurationMap;
                    kotlinx.serialization.json.Json json = this.getHighSpeedVideoSizes;
                    java.io.InputStream open = context.getAssets().open(getHighResolutionOutputSizeshNQ4ISI);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open, "");
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(open, kotlin.text.Charsets.UTF_8), 8192);
                    java.lang.String readText = kotlin.io.TextStreamsKt.readText(bufferedReader);
                    arrayList = null;
                    kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                    json.getSerializersModule();
                    kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) ((kotlinx.serialization.json.JsonObject) json.decodeFromString(kotlinx.serialization.json.JsonObject.INSTANCE.serializer(), readText)).get((java.lang.Object) "cardMetadataList");
                    jsonArray = jsonElement == null ? kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement) : null;
                    if (jsonArray != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.Iterator<kotlinx.serialization.json.JsonElement> it = jsonArray.iterator();
                        while (it.hasNext()) {
                            kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) kotlinx.serialization.json.JsonElementKt.getJsonObject(it.next()).get((java.lang.Object) "brand");
                            java.lang.String content = (jsonElement2 == null || (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : jsonPrimitive.getContent();
                            if (content != null) {
                                arrayList2.add(content);
                            }
                        }
                        arrayList = arrayList2;
                    }
                    if (arrayList == null) {
                        arrayList = kotlin.collections.CollectionsKt.emptyList();
                    }
                    str = (java.lang.String) kotlin.collections.CollectionsKt.randomOrNull(arrayList, kotlin.random.Random.INSTANCE);
                    if (str == null) {
                        str = "VISA";
                    }
                    com.paypal.oslo.feature.inappcheckout.domain.entity.CardMetadata cardMetadata = new com.paypal.oslo.feature.inappcheckout.domain.entity.CardMetadata(str);
                    defaultRaise2.complete();
                    return new arrow.core.Either.Right(cardMetadata);
                }
            }
            java.lang.String readText2 = kotlin.io.TextStreamsKt.readText(bufferedReader);
            arrayList = null;
            kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
            json.getSerializersModule();
            kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) ((kotlinx.serialization.json.JsonObject) json.decodeFromString(kotlinx.serialization.json.JsonObject.INSTANCE.serializer(), readText2)).get((java.lang.Object) "cardMetadataList");
            if (jsonElement3 == null) {
            }
            if (jsonArray != null) {
            }
            if (arrayList == null) {
            }
            str = (java.lang.String) kotlin.collections.CollectionsKt.randomOrNull(arrayList, kotlin.random.Random.INSTANCE);
            if (str == null) {
            }
            com.paypal.oslo.feature.inappcheckout.domain.entity.CardMetadata cardMetadata2 = new com.paypal.oslo.feature.inappcheckout.domain.entity.CardMetadata(str);
            defaultRaise2.complete();
            return new arrow.core.Either.Right(cardMetadata2);
        } finally {
        }
        mockCardRepository$getCardBrand$1 = new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository$getCardBrand$1(this, continuation);
        java.lang.Object obj2 = mockCardRepository$getCardBrand$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockCardRepository$getCardBrand$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        java.lang.String getHighResolutionOutputSizeshNQ4ISI2 = this.getHighSpeedVideoFpsRanges.getGetHighResolutionOutputSizeshNQ4ISI();
        android.content.Context context2 = this.Camera2StreamConfigurationMap;
        kotlinx.serialization.json.Json json2 = this.getHighSpeedVideoSizes;
        java.io.InputStream open2 = context2.getAssets().open(getHighResolutionOutputSizeshNQ4ISI2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open2, "");
        java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(open2, kotlin.text.Charsets.UTF_8), 8192);
    }
}
