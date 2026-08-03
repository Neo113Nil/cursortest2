package kotlinx.serialization.json.internal;

/* compiled from: JsonTreeReader.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0002J\u001e\u0010\r\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000fH\u0082@¢\u0006\u0002\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0082\bJ\b\u0010\u0016\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\tH\u0002J\u0006\u0010\u001a\u001a\u00020\u000eJ\b\u0010\u001b\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeReader;", "", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "lexer", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "<init>", "(Lkotlinx/serialization/json/JsonConfiguration;Lkotlinx/serialization/json/internal/AbstractJsonLexer;)V", "isLenient", "", "trailingCommaAllowed", "stackDepth", "", "readObject", "Lkotlinx/serialization/json/JsonElement;", "Lkotlin/DeepRecursiveScope;", "", "(Lkotlin/DeepRecursiveScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readObjectImpl", "Lkotlinx/serialization/json/JsonObject;", "reader", "Lkotlin/Function0;", "readArray", "readValue", "Lkotlinx/serialization/json/JsonPrimitive;", "isString", "read", "readDeepRecursive", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonTreeReader {
    private final boolean isLenient;
    private final kotlinx.serialization.json.internal.AbstractJsonLexer lexer;
    private int stackDepth;
    private final boolean trailingCommaAllowed;

    public JsonTreeReader(kotlinx.serialization.json.JsonConfiguration configuration, kotlinx.serialization.json.internal.AbstractJsonLexer lexer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.lexer = lexer;
        this.isLenient = configuration.getIsLenient();
        this.trailingCommaAllowed = configuration.getAllowTrailingComma();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0097 -> B:10:0x00a1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object readObject(kotlin.DeepRecursiveScope<kotlin.Unit, kotlinx.serialization.json.JsonElement> deepRecursiveScope, kotlin.coroutines.Continuation<? super kotlinx.serialization.json.JsonElement> continuation) {
        kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 jsonTreeReader$readObject$2;
        int i;
        kotlinx.serialization.json.internal.JsonTreeReader jsonTreeReader;
        java.util.LinkedHashMap linkedHashMap;
        kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 jsonTreeReader$readObject$22;
        byte b;
        kotlin.DeepRecursiveScope deepRecursiveScope2;
        if (continuation instanceof kotlinx.serialization.json.internal.JsonTreeReader$readObject$2) {
            jsonTreeReader$readObject$2 = (kotlinx.serialization.json.internal.JsonTreeReader$readObject$2) continuation;
            if ((jsonTreeReader$readObject$2.label & Integer.MIN_VALUE) != 0) {
                jsonTreeReader$readObject$2.label -= Integer.MIN_VALUE;
                java.lang.Object obj = jsonTreeReader$readObject$2.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = jsonTreeReader$readObject$2.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    byte consumeNextToken = this.lexer.consumeNextToken((byte) 6);
                    if (this.lexer.peekNextToken() == 4) {
                        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    jsonTreeReader = this;
                    linkedHashMap = new java.util.LinkedHashMap();
                    jsonTreeReader$readObject$22 = jsonTreeReader$readObject$2;
                    b = consumeNextToken;
                    deepRecursiveScope2 = deepRecursiveScope;
                    if (jsonTreeReader.lexer.canConsumeValue()) {
                    }
                    if (b == 6) {
                    }
                    return new kotlinx.serialization.json.JsonObject(linkedHashMap);
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.String str = (java.lang.String) jsonTreeReader$readObject$2.L$3;
                linkedHashMap = (java.util.LinkedHashMap) jsonTreeReader$readObject$2.L$2;
                jsonTreeReader = (kotlinx.serialization.json.internal.JsonTreeReader) jsonTreeReader$readObject$2.L$1;
                kotlin.DeepRecursiveScope deepRecursiveScope3 = (kotlin.DeepRecursiveScope) jsonTreeReader$readObject$2.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                linkedHashMap.put(str, (kotlinx.serialization.json.JsonElement) obj);
                byte consumeNextToken2 = jsonTreeReader.lexer.consumeNextToken();
                if (consumeNextToken2 == 4) {
                    if (consumeNextToken2 != 7) {
                        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(jsonTreeReader.lexer, "Expected end of the object or comma", 0, null, 6, null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    b = consumeNextToken2;
                    if (b == 6) {
                        jsonTreeReader.lexer.consumeNextToken((byte) 7);
                    } else if (b == 4) {
                        if (!jsonTreeReader.trailingCommaAllowed) {
                            kotlinx.serialization.json.internal.JsonExceptionsKt.invalidTrailingComma$default(jsonTreeReader.lexer, null, 1, null);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        jsonTreeReader.lexer.consumeNextToken((byte) 7);
                    }
                    return new kotlinx.serialization.json.JsonObject(linkedHashMap);
                }
                jsonTreeReader$readObject$22 = jsonTreeReader$readObject$2;
                b = consumeNextToken2;
                deepRecursiveScope2 = deepRecursiveScope3;
                if (jsonTreeReader.lexer.canConsumeValue()) {
                    java.lang.String consumeStringLenient = jsonTreeReader.isLenient ? jsonTreeReader.lexer.consumeStringLenient() : jsonTreeReader.lexer.consumeString();
                    jsonTreeReader.lexer.consumeNextToken((byte) 5);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    jsonTreeReader$readObject$22.L$0 = deepRecursiveScope2;
                    jsonTreeReader$readObject$22.L$1 = jsonTreeReader;
                    jsonTreeReader$readObject$22.L$2 = linkedHashMap;
                    jsonTreeReader$readObject$22.L$3 = consumeStringLenient;
                    jsonTreeReader$readObject$22.label = 1;
                    java.lang.Object callRecursive = deepRecursiveScope2.callRecursive(unit, jsonTreeReader$readObject$22);
                    if (callRecursive == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    deepRecursiveScope3 = deepRecursiveScope2;
                    obj = callRecursive;
                    kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 jsonTreeReader$readObject$23 = jsonTreeReader$readObject$22;
                    str = consumeStringLenient;
                    jsonTreeReader$readObject$2 = jsonTreeReader$readObject$23;
                    linkedHashMap.put(str, (kotlinx.serialization.json.JsonElement) obj);
                    byte consumeNextToken22 = jsonTreeReader.lexer.consumeNextToken();
                    if (consumeNextToken22 == 4) {
                    }
                }
                if (b == 6) {
                }
                return new kotlinx.serialization.json.JsonObject(linkedHashMap);
            }
        }
        jsonTreeReader$readObject$2 = new kotlinx.serialization.json.internal.JsonTreeReader$readObject$2(this, continuation);
        java.lang.Object obj2 = jsonTreeReader$readObject$2.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = jsonTreeReader$readObject$2.label;
        if (i != 0) {
        }
    }

    private final kotlinx.serialization.json.JsonObject readObjectImpl(kotlin.jvm.functions.Function0<? extends kotlinx.serialization.json.JsonElement> reader) {
        byte consumeNextToken = this.lexer.consumeNextToken((byte) 6);
        if (this.lexer.peekNextToken() == 4) {
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        while (true) {
            if (!this.lexer.canConsumeValue()) {
                break;
            }
            java.lang.String consumeStringLenient = this.isLenient ? this.lexer.consumeStringLenient() : this.lexer.consumeString();
            this.lexer.consumeNextToken((byte) 5);
            linkedHashMap.put(consumeStringLenient, reader.invoke());
            consumeNextToken = this.lexer.consumeNextToken();
            if (consumeNextToken != 4) {
                if (consumeNextToken != 7) {
                    kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.lexer, "Expected end of the object or comma", 0, null, 6, null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }
        }
        if (consumeNextToken == 6) {
            this.lexer.consumeNextToken((byte) 7);
        } else if (consumeNextToken == 4) {
            if (!this.trailingCommaAllowed) {
                kotlinx.serialization.json.internal.JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
                throw new kotlin.KotlinNothingValueException();
            }
            this.lexer.consumeNextToken((byte) 7);
        }
        return new kotlinx.serialization.json.JsonObject(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.serialization.json.JsonElement readArray() {
        byte consumeNextToken = this.lexer.consumeNextToken();
        if (this.lexer.peekNextToken() == 4) {
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (this.lexer.canConsumeValue()) {
            arrayList.add(read());
            consumeNextToken = this.lexer.consumeNextToken();
            if (consumeNextToken != 4) {
                kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer = this.lexer;
                boolean z = consumeNextToken == 9;
                int i = abstractJsonLexer.currentPosition;
                if (!z) {
                    kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, "Expected end of the array or comma", i, null, 4, null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }
        }
        if (consumeNextToken == 8) {
            this.lexer.consumeNextToken((byte) 9);
        } else if (consumeNextToken == 4) {
            if (!this.trailingCommaAllowed) {
                kotlinx.serialization.json.internal.JsonExceptionsKt.invalidTrailingComma(this.lexer, "array");
                throw new kotlin.KotlinNothingValueException();
            }
            this.lexer.consumeNextToken((byte) 9);
        }
        return new kotlinx.serialization.json.JsonArray(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.serialization.json.JsonPrimitive readValue(boolean isString) {
        java.lang.String consumeStringLenient;
        if (this.isLenient || !isString) {
            consumeStringLenient = this.lexer.consumeStringLenient();
        } else {
            consumeStringLenient = this.lexer.consumeString();
        }
        java.lang.String str = consumeStringLenient;
        return (isString || !kotlin.jvm.internal.Intrinsics.areEqual(str, kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL)) ? new kotlinx.serialization.json.JsonLiteral(str, isString, null, 4, null) : kotlinx.serialization.json.JsonNull.INSTANCE;
    }

    public final kotlinx.serialization.json.JsonElement read() {
        kotlinx.serialization.json.JsonElement readObject;
        byte peekNextToken = this.lexer.peekNextToken();
        if (peekNextToken == 1) {
            return readValue(true);
        }
        if (peekNextToken == 0) {
            return readValue(false);
        }
        if (peekNextToken == 6) {
            int i = this.stackDepth + 1;
            this.stackDepth = i;
            if (i == 200) {
                readObject = readDeepRecursive();
            } else {
                readObject = readObject();
            }
            this.stackDepth--;
            return readObject;
        }
        if (peekNextToken == 8) {
            return readArray();
        }
        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.lexer, "Cannot read Json element because of unexpected " + kotlinx.serialization.json.internal.AbstractJsonLexerKt.tokenDescription(peekNextToken), 0, null, 6, null);
        throw new kotlin.KotlinNothingValueException();
    }

    private final kotlinx.serialization.json.JsonElement readDeepRecursive() {
        return (kotlinx.serialization.json.JsonElement) kotlin.DeepRecursiveKt.invoke(new kotlin.DeepRecursiveFunction(new kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1(this, null)), kotlin.Unit.INSTANCE);
    }

    private final kotlinx.serialization.json.JsonElement readObject() {
        byte consumeNextToken = this.lexer.consumeNextToken((byte) 6);
        if (this.lexer.peekNextToken() == 4) {
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        while (true) {
            if (!this.lexer.canConsumeValue()) {
                break;
            }
            java.lang.String consumeStringLenient = this.isLenient ? this.lexer.consumeStringLenient() : this.lexer.consumeString();
            this.lexer.consumeNextToken((byte) 5);
            linkedHashMap.put(consumeStringLenient, read());
            consumeNextToken = this.lexer.consumeNextToken();
            if (consumeNextToken != 4) {
                if (consumeNextToken != 7) {
                    kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.lexer, "Expected end of the object or comma", 0, null, 6, null);
                    throw new kotlin.KotlinNothingValueException();
                }
            }
        }
        if (consumeNextToken == 6) {
            this.lexer.consumeNextToken((byte) 7);
        } else if (consumeNextToken == 4) {
            if (!this.trailingCommaAllowed) {
                kotlinx.serialization.json.internal.JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
                throw new kotlin.KotlinNothingValueException();
            }
            this.lexer.consumeNextToken((byte) 7);
        }
        return new kotlinx.serialization.json.JsonObject(linkedHashMap);
    }
}
