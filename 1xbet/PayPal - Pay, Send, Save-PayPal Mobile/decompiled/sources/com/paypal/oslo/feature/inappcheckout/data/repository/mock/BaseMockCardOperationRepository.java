package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J<\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0084@¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/BaseMockCardOperationRepository;", "", "Landroid/content/Context;", "context", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Landroid/content/Context;Lkotlinx/serialization/json/Json;)V", "", "mockFileName", "operationKey", "errorResponseType", "", "unknownErrorResId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationSuccessEntity;", "executeMockCardOperation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public class BaseMockCardOperationRepository {
    private final android.content.Context context;
    private final kotlinx.serialization.json.Json json;
    public static final int $stable = 8;

    public BaseMockCardOperationRepository(android.content.Context context, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.context = context;
        this.json = json;
    }

    protected final android.content.Context getContext() {
        return this.context;
    }

    protected final kotlinx.serialization.json.Json getJson() {
        return this.json;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00dd A[Catch: all -> 0x0050, RaiseCancellationException -> 0x0053, TryCatch #6 {RaiseCancellationException -> 0x0053, all -> 0x0050, blocks: (B:11:0x004a, B:13:0x0095, B:17:0x00c1, B:19:0x00dd, B:21:0x00e5, B:23:0x00ef, B:25:0x00f5, B:26:0x00fb, B:29:0x0103, B:31:0x010d, B:33:0x0113, B:34:0x0119, B:38:0x0129, B:40:0x0133, B:42:0x013b, B:44:0x0145, B:46:0x014d, B:48:0x0157, B:50:0x015d, B:53:0x0166, B:55:0x016e, B:56:0x0177, B:57:0x0191, B:72:0x0197, B:73:0x019a, B:15:0x00b7, B:68:0x0194), top: B:10:0x004a, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0129 A[Catch: all -> 0x0050, RaiseCancellationException -> 0x0053, TryCatch #6 {RaiseCancellationException -> 0x0053, all -> 0x0050, blocks: (B:11:0x004a, B:13:0x0095, B:17:0x00c1, B:19:0x00dd, B:21:0x00e5, B:23:0x00ef, B:25:0x00f5, B:26:0x00fb, B:29:0x0103, B:31:0x010d, B:33:0x0113, B:34:0x0119, B:38:0x0129, B:40:0x0133, B:42:0x013b, B:44:0x0145, B:46:0x014d, B:48:0x0157, B:50:0x015d, B:53:0x0166, B:55:0x016e, B:56:0x0177, B:57:0x0191, B:72:0x0197, B:73:0x019a, B:15:0x00b7, B:68:0x0194), top: B:10:0x004a, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final java.lang.Object executeMockCardOperation(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity>> continuation) {
        com.paypal.oslo.feature.inappcheckout.data.repository.mock.BaseMockCardOperationRepository$executeMockCardOperation$1 baseMockCardOperationRepository$executeMockCardOperation$1;
        int i2;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.String str4;
        int i3;
        arrow.core.raise.Raise raise;
        java.lang.String str5;
        java.lang.String str6;
        kotlinx.serialization.json.JsonObject jsonObject;
        kotlinx.serialization.json.JsonElement jsonElement;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        kotlinx.serialization.json.JsonElement jsonElement2;
        kotlinx.serialization.json.JsonElement jsonElement3;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        kotlinx.serialization.json.JsonElement jsonElement4;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
        try {
            if (continuation instanceof com.paypal.oslo.feature.inappcheckout.data.repository.mock.BaseMockCardOperationRepository$executeMockCardOperation$1) {
                baseMockCardOperationRepository$executeMockCardOperation$1 = (com.paypal.oslo.feature.inappcheckout.data.repository.mock.BaseMockCardOperationRepository$executeMockCardOperation$1) continuation;
                if ((baseMockCardOperationRepository$executeMockCardOperation$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                    baseMockCardOperationRepository$executeMockCardOperation$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                    java.lang.Object obj = baseMockCardOperationRepository$executeMockCardOperation$1.getOutputStallDuration;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = baseMockCardOperationRepository$executeMockCardOperation$1.getOutputMinFrameDurationlomOqCM;
                    if (i2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrow.core.raise.DefaultRaise defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
                        try {
                            arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise2;
                            baseMockCardOperationRepository$executeMockCardOperation$1.getOutputFormats = str;
                            baseMockCardOperationRepository$executeMockCardOperation$1.getHighSpeedVideoSizesFor = str2;
                            str4 = str3;
                            baseMockCardOperationRepository$executeMockCardOperation$1.getInputFormats = str4;
                            baseMockCardOperationRepository$executeMockCardOperation$1.getInputSizeshNQ4ISI = defaultRaise2;
                            baseMockCardOperationRepository$executeMockCardOperation$1.getOutputMinFrameDuration = defaultRaise3;
                            i3 = i;
                            baseMockCardOperationRepository$executeMockCardOperation$1.getHighSpeedVideoSizes = i3;
                            baseMockCardOperationRepository$executeMockCardOperation$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            baseMockCardOperationRepository$executeMockCardOperation$1.getHighSpeedVideoFpsRangesFor = 0;
                            baseMockCardOperationRepository$executeMockCardOperation$1.getHighSpeedVideoFpsRanges = 0;
                            baseMockCardOperationRepository$executeMockCardOperation$1.Camera2StreamConfigurationMap = 0;
                            baseMockCardOperationRepository$executeMockCardOperation$1.getOutputMinFrameDurationlomOqCM = 1;
                            if (kotlinx.coroutines.DelayKt.delay(2000L, baseMockCardOperationRepository$executeMockCardOperation$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            defaultRaise = defaultRaise2;
                            raise = defaultRaise3;
                            str5 = str;
                            str6 = str2;
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i4 = baseMockCardOperationRepository$executeMockCardOperation$1.Camera2StreamConfigurationMap;
                        int i5 = baseMockCardOperationRepository$executeMockCardOperation$1.getHighSpeedVideoFpsRanges;
                        int i6 = baseMockCardOperationRepository$executeMockCardOperation$1.getHighSpeedVideoFpsRangesFor;
                        int i7 = baseMockCardOperationRepository$executeMockCardOperation$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i8 = baseMockCardOperationRepository$executeMockCardOperation$1.getHighSpeedVideoSizes;
                        raise = (arrow.core.raise.Raise) baseMockCardOperationRepository$executeMockCardOperation$1.getOutputMinFrameDuration;
                        defaultRaise = (arrow.core.raise.DefaultRaise) baseMockCardOperationRepository$executeMockCardOperation$1.getInputSizeshNQ4ISI;
                        java.lang.String str7 = (java.lang.String) baseMockCardOperationRepository$executeMockCardOperation$1.getInputFormats;
                        str6 = (java.lang.String) baseMockCardOperationRepository$executeMockCardOperation$1.getHighSpeedVideoSizesFor;
                        str5 = (java.lang.String) baseMockCardOperationRepository$executeMockCardOperation$1.getOutputFormats;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            i3 = i8;
                            str4 = str7;
                        } catch (arrow.core.raise.RaiseCancellationException e2) {
                            e = e2;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    android.content.Context context = this.context;
                    kotlinx.serialization.json.Json json = this.json;
                    java.io.InputStream open = context.getAssets().open(str5);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open, "");
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(open, kotlin.text.Charsets.UTF_8), 8192);
                    java.lang.String readText = kotlin.io.TextStreamsKt.readText(bufferedReader);
                    java.lang.String str8 = null;
                    kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                    json.getSerializersModule();
                    kotlinx.serialization.json.JsonElement jsonElement5 = (kotlinx.serialization.json.JsonElement) ((kotlinx.serialization.json.JsonObject) json.decodeFromString(kotlinx.serialization.json.JsonObject.INSTANCE.serializer(), readText)).get((java.lang.Object) str6);
                    jsonObject = jsonElement5 == null ? kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement5) : null;
                    if (kotlin.jvm.internal.Intrinsics.areEqual((jsonObject != null || (jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "__typename")) == null || (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement4)) == null) ? null : jsonPrimitive3.getContent(), str4)) {
                        com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity cardOperationSuccessEntity = new com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity((jsonObject == null || (jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "id")) == null || (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) == null) ? null : jsonPrimitive2.getContent(), null);
                        defaultRaise.complete();
                        return new arrow.core.Either.Right(cardOperationSuccessEntity);
                    }
                    kotlinx.serialization.json.JsonElement jsonElement6 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);
                    kotlinx.serialization.json.JsonArray jsonArray = jsonElement6 != null ? kotlinx.serialization.json.JsonElementKt.getJsonArray(jsonElement6) : null;
                    kotlinx.serialization.json.JsonObject jsonObject2 = (jsonArray == null || (jsonElement2 = (kotlinx.serialization.json.JsonElement) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) jsonArray)) == null) ? null : kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement2);
                    if (jsonObject2 != null && (jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) "name")) != null && (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) != null) {
                        str8 = jsonPrimitive.getContent();
                    }
                    java.lang.String str9 = str8 == null ? "" : str8;
                    java.lang.String string = kotlin.jvm.internal.Intrinsics.areEqual(str9, "UNKNOWN") ? this.context.getString(i3) : str9;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                    raise.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(str9, string, false, null, null, 24, null));
                    throw new kotlin.KotlinNothingValueException();
                }
            }
            java.lang.String readText2 = kotlin.io.TextStreamsKt.readText(bufferedReader);
            java.lang.String str82 = null;
            kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
            json.getSerializersModule();
            kotlinx.serialization.json.JsonElement jsonElement52 = (kotlinx.serialization.json.JsonElement) ((kotlinx.serialization.json.JsonObject) json.decodeFromString(kotlinx.serialization.json.JsonObject.INSTANCE.serializer(), readText2)).get((java.lang.Object) str6);
            if (jsonElement52 == null) {
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual((jsonObject != null || (jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "__typename")) == null || (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement4)) == null) ? null : jsonPrimitive3.getContent(), str4)) {
            }
        } finally {
        }
        baseMockCardOperationRepository$executeMockCardOperation$1 = new com.paypal.oslo.feature.inappcheckout.data.repository.mock.BaseMockCardOperationRepository$executeMockCardOperation$1(this, continuation);
        java.lang.Object obj2 = baseMockCardOperationRepository$executeMockCardOperation$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = baseMockCardOperationRepository$executeMockCardOperation$1.getOutputMinFrameDurationlomOqCM;
        if (i2 != 0) {
        }
        android.content.Context context2 = this.context;
        kotlinx.serialization.json.Json json2 = this.json;
        java.io.InputStream open2 = context2.getAssets().open(str5);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open2, "");
        java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(open2, kotlin.text.Charsets.UTF_8), 8192);
    }
}
