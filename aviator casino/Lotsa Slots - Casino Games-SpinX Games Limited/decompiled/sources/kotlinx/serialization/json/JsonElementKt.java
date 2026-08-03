package kotlinx.serialization.json;

/* compiled from: JsonElement.kt */
@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0005\u001a\u0017\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0012\u001a\u0012\u0010\u0000\u001a\u00020\u00132\b\u0010\u0002\u001a\u0004\u0018\u00010\u0014H\u0007\u001a\u0012\u0010\u0015\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0012H\u0007\u001a\u0014\u0010N\u001a\u00020\u0014*\u00020\u001b2\u0006\u0010O\u001a\u00020\u0012H\u0002\u001a$\u0010P\u001a\u0004\u0018\u0001HQ\"\u0004\b\u0000\u0010Q2\f\u0010R\u001a\b\u0012\u0004\u0012\u0002HQ0SH\u0082\b¢\u0006\u0002\u0010T\u001a\"\u0010U\u001a\u0002HQ\"\u0004\b\u0000\u0010Q2\f\u0010R\u001a\b\u0012\u0004\u0012\u0002HQ0SH\u0082\b¢\u0006\u0002\u0010T\u001a\u0018\u0010V\u001a\u00020\u00142\u0006\u0010W\u001a\u00020\u00122\u0006\u0010X\u001a\u00020\u0012H\u0001\u001a\f\u0010Y\u001a\u000201*\u00020\u0001H\u0000\"\u0014\u0010\u0016\u001a\u00020\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0015\u0010\u001a\u001a\u00020\u0001*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0015\u0010\u001e\u001a\u00020\u001f*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0015\u0010\"\u001a\u00020#*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u0015\u0010&\u001a\u00020\u0013*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b'\u0010(\"\u0015\u0010)\u001a\u00020**\u00020\u00018F¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u0017\u0010-\u001a\u0004\u0018\u00010**\u00020\u00018F¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0015\u00100\u001a\u000201*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b2\u00103\"\u0017\u00104\u001a\u0004\u0018\u000101*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b5\u00106\"\u0015\u00107\u001a\u000208*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b9\u0010:\"\u0017\u0010;\u001a\u0004\u0018\u000108*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b<\u0010=\"\u0015\u0010>\u001a\u00020?*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b@\u0010A\"\u0017\u0010B\u001a\u0004\u0018\u00010?*\u00020\u00018F¢\u0006\u0006\u001a\u0004\bC\u0010D\"\u0015\u0010E\u001a\u00020\u0003*\u00020\u00018F¢\u0006\u0006\u001a\u0004\bF\u0010G\"\u0017\u0010H\u001a\u0004\u0018\u00010\u0003*\u00020\u00018F¢\u0006\u0006\u001a\u0004\bI\u0010J\"\u0017\u0010K\u001a\u0004\u0018\u00010\u0012*\u00020\u00018F¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006Z"}, d2 = {"JsonPrimitive", "Lkotlinx/serialization/json/JsonPrimitive;", "value", "", "(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;", "", "Lkotlin/UByte;", "JsonPrimitive-7apg3OU", "(B)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlin/UShort;", "JsonPrimitive-xj2QHRw", "(S)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlin/UInt;", "JsonPrimitive-WZ4Q5Ns", "(I)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlin/ULong;", "JsonPrimitive-VKZWuLQ", "(J)Lkotlinx/serialization/json/JsonPrimitive;", "", "Lkotlinx/serialization/json/JsonNull;", "", "JsonUnquotedLiteral", "jsonUnquotedLiteralDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getJsonUnquotedLiteralDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "jsonPrimitive", "Lkotlinx/serialization/json/JsonElement;", "getJsonPrimitive", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;", "jsonObject", "Lkotlinx/serialization/json/JsonObject;", "getJsonObject", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;", "jsonArray", "Lkotlinx/serialization/json/JsonArray;", "getJsonArray", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonArray;", "jsonNull", "getJsonNull", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonNull;", "int", "", "getInt", "(Lkotlinx/serialization/json/JsonPrimitive;)I", "intOrNull", "getIntOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;", com.adjust.sdk.Constants.LONG, "", "getLong", "(Lkotlinx/serialization/json/JsonPrimitive;)J", "longOrNull", "getLongOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;", "double", "", "getDouble", "(Lkotlinx/serialization/json/JsonPrimitive;)D", "doubleOrNull", "getDoubleOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;", "float", "", "getFloat", "(Lkotlinx/serialization/json/JsonPrimitive;)F", "floatOrNull", "getFloatOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Float;", "boolean", "getBoolean", "(Lkotlinx/serialization/json/JsonPrimitive;)Z", "booleanOrNull", "getBooleanOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;", "contentOrNull", "getContentOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;", "error", "element", "exceptionToNull", "T", com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE, "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "exceptionToNumberFormatException", "unexpectedJson", com.ironsource.X3.i.W, "expected", "parseLongImpl", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonElementKt {
    private static final kotlinx.serialization.descriptors.SerialDescriptor jsonUnquotedLiteralDescriptor = kotlinx.serialization.internal.InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlinx.serialization.json.JsonUnquotedLiteral", kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE));

    public static final kotlinx.serialization.json.JsonPrimitive JsonPrimitive(java.lang.Boolean bool) {
        if (bool == null) {
            return kotlinx.serialization.json.JsonNull.INSTANCE;
        }
        return new kotlinx.serialization.json.JsonLiteral(bool, false, null, 4, null);
    }

    public static final kotlinx.serialization.json.JsonPrimitive JsonPrimitive(java.lang.Number number) {
        if (number == null) {
            return kotlinx.serialization.json.JsonNull.INSTANCE;
        }
        return new kotlinx.serialization.json.JsonLiteral(number, false, null, 4, null);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    /* renamed from: JsonPrimitive-7apg3OU, reason: not valid java name */
    public static final kotlinx.serialization.json.JsonPrimitive m12445JsonPrimitive7apg3OU(byte b) {
        return m12446JsonPrimitiveVKZWuLQ(kotlin.ULong.m10975constructorimpl(b & 255));
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    /* renamed from: JsonPrimitive-xj2QHRw, reason: not valid java name */
    public static final kotlinx.serialization.json.JsonPrimitive m12448JsonPrimitivexj2QHRw(short s) {
        return m12446JsonPrimitiveVKZWuLQ(kotlin.ULong.m10975constructorimpl(s & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    /* renamed from: JsonPrimitive-WZ4Q5Ns, reason: not valid java name */
    public static final kotlinx.serialization.json.JsonPrimitive m12447JsonPrimitiveWZ4Q5Ns(int i) {
        return m12446JsonPrimitiveVKZWuLQ(kotlin.ULong.m10975constructorimpl(i & 4294967295L));
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    /* renamed from: JsonPrimitive-VKZWuLQ, reason: not valid java name */
    public static final kotlinx.serialization.json.JsonPrimitive m12446JsonPrimitiveVKZWuLQ(long j) {
        java.lang.String m;
        m = kotlin.UByte$$ExternalSyntheticBackport0.m(j, 10);
        return JsonUnquotedLiteral(m);
    }

    public static final kotlinx.serialization.json.JsonPrimitive JsonPrimitive(java.lang.String str) {
        if (str == null) {
            return kotlinx.serialization.json.JsonNull.INSTANCE;
        }
        return new kotlinx.serialization.json.JsonLiteral(str, true, null, 4, null);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.json.JsonNull JsonPrimitive(java.lang.Void r0) {
        return kotlinx.serialization.json.JsonNull.INSTANCE;
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.json.JsonPrimitive JsonUnquotedLiteral(java.lang.String str) {
        if (str == null) {
            return kotlinx.serialization.json.JsonNull.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, kotlinx.serialization.json.JsonNull.INSTANCE.getContent())) {
            throw new kotlinx.serialization.json.internal.JsonEncodingException("Creating a literal unquoted value of 'null' is forbidden. If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive");
        }
        return new kotlinx.serialization.json.JsonLiteral(str, false, jsonUnquotedLiteralDescriptor);
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor getJsonUnquotedLiteralDescriptor() {
        return jsonUnquotedLiteralDescriptor;
    }

    public static final kotlinx.serialization.json.JsonPrimitive getJsonPrimitive(kotlinx.serialization.json.JsonElement jsonElement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive = jsonElement instanceof kotlinx.serialization.json.JsonPrimitive ? (kotlinx.serialization.json.JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        error(jsonElement, "JsonPrimitive");
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlinx.serialization.json.JsonObject getJsonObject(kotlinx.serialization.json.JsonElement jsonElement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        kotlinx.serialization.json.JsonObject jsonObject = jsonElement instanceof kotlinx.serialization.json.JsonObject ? (kotlinx.serialization.json.JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        error(jsonElement, "JsonObject");
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlinx.serialization.json.JsonArray getJsonArray(kotlinx.serialization.json.JsonElement jsonElement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        kotlinx.serialization.json.JsonArray jsonArray = jsonElement instanceof kotlinx.serialization.json.JsonArray ? (kotlinx.serialization.json.JsonArray) jsonElement : null;
        if (jsonArray != null) {
            return jsonArray;
        }
        error(jsonElement, "JsonArray");
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlinx.serialization.json.JsonNull getJsonNull(kotlinx.serialization.json.JsonElement jsonElement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        kotlinx.serialization.json.JsonNull jsonNull = jsonElement instanceof kotlinx.serialization.json.JsonNull ? (kotlinx.serialization.json.JsonNull) jsonElement : null;
        if (jsonNull != null) {
            return jsonNull;
        }
        error(jsonElement, "JsonNull");
        throw new kotlin.KotlinNothingValueException();
    }

    public static final int getInt(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            long parseLongImpl = parseLongImpl(jsonPrimitive);
            if (-2147483648L <= parseLongImpl && parseLongImpl <= 2147483647L) {
                return (int) parseLongImpl;
            }
            throw new java.lang.NumberFormatException(jsonPrimitive.getContent() + " is not an Int");
        } catch (kotlinx.serialization.json.internal.JsonDecodingException e) {
            throw new java.lang.NumberFormatException(e.getMessage());
        }
    }

    public static final java.lang.Integer getIntOrNull(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        java.lang.Long l;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            l = java.lang.Long.valueOf(parseLongImpl(jsonPrimitive));
        } catch (kotlinx.serialization.json.internal.JsonDecodingException unused) {
            l = null;
        }
        if (l != null) {
            long longValue = l.longValue();
            if (-2147483648L <= longValue && longValue <= 2147483647L) {
                return java.lang.Integer.valueOf((int) longValue);
            }
        }
        return null;
    }

    public static final long getLong(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            return parseLongImpl(jsonPrimitive);
        } catch (kotlinx.serialization.json.internal.JsonDecodingException e) {
            throw new java.lang.NumberFormatException(e.getMessage());
        }
    }

    public static final java.lang.Long getLongOrNull(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            return java.lang.Long.valueOf(parseLongImpl(jsonPrimitive));
        } catch (kotlinx.serialization.json.internal.JsonDecodingException unused) {
            return null;
        }
    }

    public static final double getDouble(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return java.lang.Double.parseDouble(jsonPrimitive.getContent());
    }

    public static final java.lang.Double getDoubleOrNull(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return kotlin.text.StringsKt.toDoubleOrNull(jsonPrimitive.getContent());
    }

    public static final float getFloat(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return java.lang.Float.parseFloat(jsonPrimitive.getContent());
    }

    public static final java.lang.Float getFloatOrNull(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return kotlin.text.StringsKt.toFloatOrNull(jsonPrimitive.getContent());
    }

    public static final boolean getBoolean(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        java.lang.Boolean booleanStrictOrNull = kotlinx.serialization.json.internal.StringOpsKt.toBooleanStrictOrNull(jsonPrimitive.getContent());
        if (booleanStrictOrNull != null) {
            return booleanStrictOrNull.booleanValue();
        }
        throw new java.lang.IllegalStateException(jsonPrimitive + " does not represent a Boolean");
    }

    public static final java.lang.Boolean getBooleanOrNull(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return kotlinx.serialization.json.internal.StringOpsKt.toBooleanStrictOrNull(jsonPrimitive.getContent());
    }

    public static final java.lang.String getContentOrNull(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof kotlinx.serialization.json.JsonNull) {
            return null;
        }
        return jsonPrimitive.getContent();
    }

    private static final java.lang.Void error(kotlinx.serialization.json.JsonElement jsonElement, java.lang.String str) {
        throw new java.lang.IllegalArgumentException("Element " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(jsonElement.getClass()) + " is not a " + str);
    }

    private static final <T> T exceptionToNull(kotlin.jvm.functions.Function0<? extends T> function0) {
        try {
            return function0.invoke();
        } catch (kotlinx.serialization.json.internal.JsonDecodingException unused) {
            return null;
        }
    }

    private static final <T> T exceptionToNumberFormatException(kotlin.jvm.functions.Function0<? extends T> function0) {
        try {
            return function0.invoke();
        } catch (kotlinx.serialization.json.internal.JsonDecodingException e) {
            throw new java.lang.NumberFormatException(e.getMessage());
        }
    }

    public static final java.lang.Void unexpectedJson(java.lang.String key, java.lang.String expected) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expected, "expected");
        throw new java.lang.IllegalArgumentException("Element " + key + " is not a " + expected);
    }

    public static final long parseLongImpl(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return new kotlinx.serialization.json.internal.StringJsonLexer(jsonPrimitive.getContent()).consumeNumericLiteralFully();
    }
}
