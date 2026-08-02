package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\t\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0016\u0010\u0010\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeReader;", "", "Lkotlinx/serialization/json/JsonConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "lexer", "<init>", "(Lkotlinx/serialization/json/JsonConfiguration;Lkotlinx/serialization/json/internal/AbstractJsonLexer;)V", "Lkotlinx/serialization/json/JsonElement;", "getHighSpeedVideoFpsRanges", "()Lkotlinx/serialization/json/JsonElement;", "", "p0", "Lkotlinx/serialization/json/JsonPrimitive;", "(Z)Lkotlinx/serialization/json/JsonPrimitive;", "read", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Z", "getHighResolutionOutputSizeshNQ4ISI", "", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonTreeReader {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.serialization.json.internal.AbstractJsonLexer Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRanges;

    public JsonTreeReader(kotlinx.serialization.json.JsonConfiguration jsonConfiguration, kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractJsonLexer, "");
        this.Camera2StreamConfigurationMap = abstractJsonLexer;
        this.getHighSpeedVideoFpsRanges = jsonConfiguration.getIsLenient();
        this.getHighResolutionOutputSizeshNQ4ISI = jsonConfiguration.getAllowTrailingComma();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ab -> B:10:0x00b1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$readObject(kotlinx.serialization.json.internal.JsonTreeReader jsonTreeReader, kotlin.DeepRecursiveScope deepRecursiveScope, kotlin.coroutines.Continuation continuation) {
        kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 jsonTreeReader$readObject$2;
        int i;
        kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 jsonTreeReader$readObject$22;
        java.util.LinkedHashMap linkedHashMap;
        int i2;
        byte b;
        kotlin.DeepRecursiveScope deepRecursiveScope2;
        kotlinx.serialization.json.internal.JsonTreeReader jsonTreeReader2 = jsonTreeReader;
        if (continuation instanceof kotlinx.serialization.json.internal.JsonTreeReader$readObject$2) {
            jsonTreeReader$readObject$2 = (kotlinx.serialization.json.internal.JsonTreeReader$readObject$2) continuation;
            if ((jsonTreeReader$readObject$2.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                jsonTreeReader$readObject$2.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = jsonTreeReader$readObject$2.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = jsonTreeReader$readObject$2.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    byte consumeNextToken = jsonTreeReader2.Camera2StreamConfigurationMap.consumeNextToken((byte) 6);
                    if (jsonTreeReader2.Camera2StreamConfigurationMap.peekNextToken() == 4) {
                        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(jsonTreeReader2.Camera2StreamConfigurationMap, "Unexpected leading comma", 0, null, 6, null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    jsonTreeReader$readObject$22 = jsonTreeReader$readObject$2;
                    linkedHashMap = new java.util.LinkedHashMap();
                    i2 = 0;
                    b = consumeNextToken;
                    deepRecursiveScope2 = deepRecursiveScope;
                    if (jsonTreeReader2.Camera2StreamConfigurationMap.canConsumeValue()) {
                    }
                    if (b == 6) {
                    }
                    return new kotlinx.serialization.json.JsonObject(linkedHashMap);
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = jsonTreeReader$readObject$2.getHighSpeedVideoSizes;
                byte b2 = jsonTreeReader$readObject$2.getHighSpeedVideoFpsRangesFor;
                int i4 = jsonTreeReader$readObject$2.getHighSpeedVideoFpsRanges;
                java.lang.String str = (java.lang.String) jsonTreeReader$readObject$2.getHighSpeedVideoSizesFor;
                java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) jsonTreeReader$readObject$2.getInputFormats;
                kotlinx.serialization.json.internal.JsonTreeReader jsonTreeReader3 = (kotlinx.serialization.json.internal.JsonTreeReader) jsonTreeReader$readObject$2.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.DeepRecursiveScope deepRecursiveScope3 = (kotlin.DeepRecursiveScope) jsonTreeReader$readObject$2.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 jsonTreeReader$readObject$23 = jsonTreeReader$readObject$2;
                i2 = i4;
                jsonTreeReader2 = jsonTreeReader3;
                linkedHashMap = linkedHashMap2;
                jsonTreeReader$readObject$22 = jsonTreeReader$readObject$23;
                linkedHashMap.put(str, (kotlinx.serialization.json.JsonElement) obj);
                b = jsonTreeReader2.Camera2StreamConfigurationMap.consumeNextToken();
                if (b != 4) {
                    deepRecursiveScope2 = deepRecursiveScope3;
                    if (jsonTreeReader2.Camera2StreamConfigurationMap.canConsumeValue()) {
                        java.lang.String consumeStringLenient = jsonTreeReader2.getHighSpeedVideoFpsRanges ? jsonTreeReader2.Camera2StreamConfigurationMap.consumeStringLenient() : jsonTreeReader2.Camera2StreamConfigurationMap.consumeString();
                        jsonTreeReader2.Camera2StreamConfigurationMap.consumeNextToken((byte) 5);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        jsonTreeReader$readObject$22.Camera2StreamConfigurationMap = deepRecursiveScope2;
                        jsonTreeReader$readObject$22.getHighResolutionOutputSizeshNQ4ISI = jsonTreeReader2;
                        jsonTreeReader$readObject$22.getInputFormats = linkedHashMap;
                        jsonTreeReader$readObject$22.getHighSpeedVideoSizesFor = consumeStringLenient;
                        jsonTreeReader$readObject$22.getHighSpeedVideoFpsRanges = i2;
                        jsonTreeReader$readObject$22.getHighSpeedVideoFpsRangesFor = b;
                        jsonTreeReader$readObject$22.getHighSpeedVideoSizes = 0;
                        jsonTreeReader$readObject$22.getOutputMinFrameDuration = 1;
                        java.lang.Object callRecursive = deepRecursiveScope2.callRecursive(unit, jsonTreeReader$readObject$22);
                        if (callRecursive == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        java.lang.String str2 = consumeStringLenient;
                        deepRecursiveScope3 = deepRecursiveScope2;
                        obj = callRecursive;
                        str = str2;
                        linkedHashMap.put(str, (kotlinx.serialization.json.JsonElement) obj);
                        b = jsonTreeReader2.Camera2StreamConfigurationMap.consumeNextToken();
                        if (b != 4) {
                        }
                    }
                    if (b == 6) {
                    }
                    return new kotlinx.serialization.json.JsonObject(linkedHashMap);
                }
                if (b != 7) {
                    kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(jsonTreeReader2.Camera2StreamConfigurationMap, "Expected end of the object or comma", 0, null, 6, null);
                    throw new kotlin.KotlinNothingValueException();
                }
                if (b == 6) {
                    jsonTreeReader2.Camera2StreamConfigurationMap.consumeNextToken((byte) 7);
                } else if (b == 4) {
                    if (!jsonTreeReader2.getHighResolutionOutputSizeshNQ4ISI) {
                        kotlinx.serialization.json.internal.JsonExceptionsKt.invalidTrailingComma$default(jsonTreeReader2.Camera2StreamConfigurationMap, null, 1, null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    jsonTreeReader2.Camera2StreamConfigurationMap.consumeNextToken((byte) 7);
                }
                return new kotlinx.serialization.json.JsonObject(linkedHashMap);
            }
        }
        jsonTreeReader$readObject$2 = new kotlinx.serialization.json.internal.JsonTreeReader$readObject$2(jsonTreeReader2, continuation);
        java.lang.Object obj2 = jsonTreeReader$readObject$2.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = jsonTreeReader$readObject$2.getOutputMinFrameDuration;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.serialization.json.JsonElement getHighSpeedVideoFpsRanges() {
        byte consumeNextToken = this.Camera2StreamConfigurationMap.consumeNextToken();
        if (this.Camera2StreamConfigurationMap.peekNextToken() == 4) {
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.Camera2StreamConfigurationMap, "Unexpected leading comma", 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (this.Camera2StreamConfigurationMap.canConsumeValue()) {
            arrayList.add(read());
            consumeNextToken = this.Camera2StreamConfigurationMap.consumeNextToken();
            if (consumeNextToken != 4) {
                kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer = this.Camera2StreamConfigurationMap;
                boolean z = consumeNextToken == 9;
                int i = abstractJsonLexer.currentPosition;
                if (!z) {
                    kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, "Expected end of the array or comma", i, null, 4, null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }
        }
        if (consumeNextToken == 8) {
            this.Camera2StreamConfigurationMap.consumeNextToken((byte) 9);
        } else if (consumeNextToken == 4) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                kotlinx.serialization.json.internal.JsonExceptionsKt.invalidTrailingComma(this.Camera2StreamConfigurationMap, "array");
                throw new kotlin.KotlinNothingValueException();
            }
            this.Camera2StreamConfigurationMap.consumeNextToken((byte) 9);
        }
        return new kotlinx.serialization.json.JsonArray(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.serialization.json.JsonPrimitive getHighSpeedVideoFpsRanges(boolean p0) {
        java.lang.String consumeStringLenient;
        if (this.getHighSpeedVideoFpsRanges || !p0) {
            consumeStringLenient = this.Camera2StreamConfigurationMap.consumeStringLenient();
        } else {
            consumeStringLenient = this.Camera2StreamConfigurationMap.consumeString();
        }
        java.lang.String str = consumeStringLenient;
        return (p0 || !kotlin.jvm.internal.Intrinsics.areEqual(str, "null")) ? new kotlinx.serialization.json.JsonLiteral(str, p0, null, 4, null) : kotlinx.serialization.json.JsonNull.INSTANCE;
    }

    public final kotlinx.serialization.json.JsonElement read() {
        kotlinx.serialization.json.JsonObject jsonObject;
        byte peekNextToken = this.Camera2StreamConfigurationMap.peekNextToken();
        if (peekNextToken == 1) {
            return getHighSpeedVideoFpsRanges(true);
        }
        if (peekNextToken == 0) {
            return getHighSpeedVideoFpsRanges(false);
        }
        if (peekNextToken != 6) {
            if (peekNextToken == 8) {
                return getHighSpeedVideoFpsRanges();
            }
            kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer = this.Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot read Json element because of unexpected ");
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.tokenDescription(peekNextToken));
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, sb.toString(), 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
        int i = this.getHighSpeedVideoFpsRangesFor + 1;
        this.getHighSpeedVideoFpsRangesFor = i;
        if (i == 200) {
            jsonObject = (kotlinx.serialization.json.JsonElement) kotlin.DeepRecursiveKt.invoke(new kotlin.DeepRecursiveFunction(new kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1(this, null)), kotlin.Unit.INSTANCE);
        } else {
            byte consumeNextToken = this.Camera2StreamConfigurationMap.consumeNextToken((byte) 6);
            if (this.Camera2StreamConfigurationMap.peekNextToken() == 4) {
                kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.Camera2StreamConfigurationMap, "Unexpected leading comma", 0, null, 6, null);
                throw new kotlin.KotlinNothingValueException();
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            while (true) {
                if (!this.Camera2StreamConfigurationMap.canConsumeValue()) {
                    break;
                }
                java.lang.String consumeStringLenient = this.getHighSpeedVideoFpsRanges ? this.Camera2StreamConfigurationMap.consumeStringLenient() : this.Camera2StreamConfigurationMap.consumeString();
                this.Camera2StreamConfigurationMap.consumeNextToken((byte) 5);
                linkedHashMap.put(consumeStringLenient, read());
                consumeNextToken = this.Camera2StreamConfigurationMap.consumeNextToken();
                if (consumeNextToken != 4) {
                    if (consumeNextToken != 7) {
                        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.Camera2StreamConfigurationMap, "Expected end of the object or comma", 0, null, 6, null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
            }
            if (consumeNextToken == 6) {
                this.Camera2StreamConfigurationMap.consumeNextToken((byte) 7);
            } else if (consumeNextToken == 4) {
                if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                    kotlinx.serialization.json.internal.JsonExceptionsKt.invalidTrailingComma$default(this.Camera2StreamConfigurationMap, null, 1, null);
                    throw new kotlin.KotlinNothingValueException();
                }
                this.Camera2StreamConfigurationMap.consumeNextToken((byte) 7);
            }
            jsonObject = new kotlinx.serialization.json.JsonObject(linkedHashMap);
        }
        this.getHighSpeedVideoFpsRangesFor--;
        return jsonObject;
    }
}
