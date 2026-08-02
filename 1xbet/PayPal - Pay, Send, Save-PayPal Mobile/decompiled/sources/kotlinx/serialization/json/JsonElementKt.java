package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000f\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0003\u0010\u0014\u001a\u0017\u0010\u0003\u001a\u00020\u00162\b\u0010\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0003\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0014\u001a\u001b\u0010\u001b\u001a\u00020\u0015*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010\"\u001a\u00020!*\u00020\u0002H\u0000¢\u0006\u0004\b\"\u0010#\"\u001a\u0010%\u001a\u00020$8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0015\u0010+\u001a\u00020\u0002*\u00020\u00198G¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u0015\u0010/\u001a\u00020,*\u00020\u00198G¢\u0006\u0006\u001a\u0004\b-\u0010.\"\u0015\u00103\u001a\u000200*\u00020\u00198G¢\u0006\u0006\u001a\u0004\b1\u00102\"\u0015\u00106\u001a\u00020\u0016*\u00020\u00198G¢\u0006\u0006\u001a\u0004\b4\u00105\"\u0015\u0010:\u001a\u000207*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b8\u00109\"\u0017\u0010=\u001a\u0004\u0018\u000107*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b;\u0010<\"\u0015\u0010?\u001a\u00020!*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b>\u0010#\"\u0017\u0010B\u001a\u0004\u0018\u00010!*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b@\u0010A\"\u0015\u0010F\u001a\u00020C*\u00020\u00028G¢\u0006\u0006\u001a\u0004\bD\u0010E\"\u0017\u0010I\u001a\u0004\u0018\u00010C*\u00020\u00028G¢\u0006\u0006\u001a\u0004\bG\u0010H\"\u0015\u0010M\u001a\u00020J*\u00020\u00028G¢\u0006\u0006\u001a\u0004\bK\u0010L\"\u0017\u0010P\u001a\u0004\u0018\u00010J*\u00020\u00028G¢\u0006\u0006\u001a\u0004\bN\u0010O\"\u0015\u0010S\u001a\u00020\u0000*\u00020\u00028G¢\u0006\u0006\u001a\u0004\bQ\u0010R\"\u0017\u0010V\u001a\u0004\u0018\u00010\u0000*\u00020\u00028G¢\u0006\u0006\u001a\u0004\bT\u0010U\"\u0017\u0010Y\u001a\u0004\u0018\u00010\u0013*\u00020\u00028G¢\u0006\u0006\u001a\u0004\bW\u0010X"}, d2 = {"", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/serialization/json/JsonPrimitive;", com.datadog.android.sessionreplay.internal.gson.GsonExtKt.JSON_PRIMITIVE_TYPE, "(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;", "", "(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlin/UByte;", "JsonPrimitive-7apg3OU", "(B)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlin/UShort;", "JsonPrimitive-xj2QHRw", "(S)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlin/UInt;", "JsonPrimitive-WZ4Q5Ns", "(I)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlin/ULong;", "JsonPrimitive-VKZWuLQ", "(J)Lkotlinx/serialization/json/JsonPrimitive;", "", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;", "", "Lkotlinx/serialization/json/JsonNull;", "(Ljava/lang/Void;)Lkotlinx/serialization/json/JsonNull;", "JsonUnquotedLiteral", "Lkotlinx/serialization/json/JsonElement;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)Ljava/lang/Void;", "key", "expected", "unexpectedJson", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;", "", "parseLongImpl", "(Lkotlinx/serialization/json/JsonPrimitive;)J", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "jsonUnquotedLiteralDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getJsonUnquotedLiteralDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getJsonPrimitive", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;", "jsonPrimitive", "Lkotlinx/serialization/json/JsonObject;", "getJsonObject", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;", "jsonObject", "Lkotlinx/serialization/json/JsonArray;", "getJsonArray", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonArray;", "jsonArray", "getJsonNull", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonNull;", "jsonNull", "", "getInt", "(Lkotlinx/serialization/json/JsonPrimitive;)I", com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_INT, "getIntOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;", "intOrNull", "getLong", com.adjust.sdk.Constants.LONG, "getLongOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;", "longOrNull", "", "getDouble", "(Lkotlinx/serialization/json/JsonPrimitive;)D", com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_DOUBLE, "getDoubleOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;", "doubleOrNull", "", "getFloat", "(Lkotlinx/serialization/json/JsonPrimitive;)F", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT, "getFloatOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Float;", "floatOrNull", "getBoolean", "(Lkotlinx/serialization/json/JsonPrimitive;)Z", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN, "getBooleanOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;", "booleanOrNull", "getContentOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;", "contentOrNull"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
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

    /* renamed from: JsonPrimitive-7apg3OU, reason: not valid java name */
    public static final kotlinx.serialization.json.JsonPrimitive m24256JsonPrimitive7apg3OU(byte b) {
        return m24257JsonPrimitiveVKZWuLQ(kotlin.ULong.m23494constructorimpl(b & 255));
    }

    /* renamed from: JsonPrimitive-xj2QHRw, reason: not valid java name */
    public static final kotlinx.serialization.json.JsonPrimitive m24259JsonPrimitivexj2QHRw(short s) {
        return m24257JsonPrimitiveVKZWuLQ(kotlin.ULong.m23494constructorimpl(s & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* renamed from: JsonPrimitive-WZ4Q5Ns, reason: not valid java name */
    public static final kotlinx.serialization.json.JsonPrimitive m24258JsonPrimitiveWZ4Q5Ns(int i) {
        return m24257JsonPrimitiveVKZWuLQ(kotlin.ULong.m23494constructorimpl(i & 4294967295L));
    }

    /* renamed from: JsonPrimitive-VKZWuLQ, reason: not valid java name */
    public static final kotlinx.serialization.json.JsonPrimitive m24257JsonPrimitiveVKZWuLQ(long j) {
        return JsonUnquotedLiteral(java.lang.Long.toUnsignedString(j));
    }

    public static final kotlinx.serialization.json.JsonPrimitive JsonPrimitive(java.lang.String str) {
        if (str == null) {
            return kotlinx.serialization.json.JsonNull.INSTANCE;
        }
        return new kotlinx.serialization.json.JsonLiteral(str, true, null, 4, null);
    }

    public static final kotlinx.serialization.json.JsonNull JsonPrimitive(java.lang.Void r0) {
        return kotlinx.serialization.json.JsonNull.INSTANCE;
    }

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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "");
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive = jsonElement instanceof kotlinx.serialization.json.JsonPrimitive ? (kotlinx.serialization.json.JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        getHighResolutionOutputSizeshNQ4ISI(jsonElement, com.datadog.android.sessionreplay.internal.gson.GsonExtKt.JSON_PRIMITIVE_TYPE);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlinx.serialization.json.JsonObject getJsonObject(kotlinx.serialization.json.JsonElement jsonElement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "");
        kotlinx.serialization.json.JsonObject jsonObject = jsonElement instanceof kotlinx.serialization.json.JsonObject ? (kotlinx.serialization.json.JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        getHighResolutionOutputSizeshNQ4ISI(jsonElement, com.datadog.android.sessionreplay.internal.gson.GsonExtKt.JSON_OBJECT_TYPE);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlinx.serialization.json.JsonArray getJsonArray(kotlinx.serialization.json.JsonElement jsonElement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "");
        kotlinx.serialization.json.JsonArray jsonArray = jsonElement instanceof kotlinx.serialization.json.JsonArray ? (kotlinx.serialization.json.JsonArray) jsonElement : null;
        if (jsonArray != null) {
            return jsonArray;
        }
        getHighResolutionOutputSizeshNQ4ISI(jsonElement, com.datadog.android.sessionreplay.internal.gson.GsonExtKt.JSON_ARRAY_TYPE);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlinx.serialization.json.JsonNull getJsonNull(kotlinx.serialization.json.JsonElement jsonElement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "");
        kotlinx.serialization.json.JsonNull jsonNull = jsonElement instanceof kotlinx.serialization.json.JsonNull ? (kotlinx.serialization.json.JsonNull) jsonElement : null;
        if (jsonNull != null) {
            return jsonNull;
        }
        getHighResolutionOutputSizeshNQ4ISI(jsonElement, "JsonNull");
        throw new kotlin.KotlinNothingValueException();
    }

    public static final int getInt(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        try {
            long parseLongImpl = parseLongImpl(jsonPrimitive);
            if (androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask <= parseLongImpl && parseLongImpl <= androidx.collection.SieveCacheKt.NodeLinkMask) {
                return (int) parseLongImpl;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(jsonPrimitive.getContent());
            sb.append(" is not an Int");
            throw new java.lang.NumberFormatException(sb.toString());
        } catch (kotlinx.serialization.json.internal.JsonDecodingException e) {
            throw new java.lang.NumberFormatException(e.getMessage());
        }
    }

    public static final java.lang.Integer getIntOrNull(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        java.lang.Long l;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        try {
            l = java.lang.Long.valueOf(parseLongImpl(jsonPrimitive));
        } catch (kotlinx.serialization.json.internal.JsonDecodingException unused) {
            l = null;
        }
        if (l != null) {
            long longValue = l.longValue();
            if (androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask <= longValue && longValue <= androidx.collection.SieveCacheKt.NodeLinkMask) {
                return java.lang.Integer.valueOf((int) longValue);
            }
        }
        return null;
    }

    public static final long getLong(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        try {
            return parseLongImpl(jsonPrimitive);
        } catch (kotlinx.serialization.json.internal.JsonDecodingException e) {
            throw new java.lang.NumberFormatException(e.getMessage());
        }
    }

    public static final java.lang.Long getLongOrNull(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        try {
            return java.lang.Long.valueOf(parseLongImpl(jsonPrimitive));
        } catch (kotlinx.serialization.json.internal.JsonDecodingException unused) {
            return null;
        }
    }

    public static final double getDouble(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        return java.lang.Double.parseDouble(jsonPrimitive.getContent());
    }

    public static final java.lang.Double getDoubleOrNull(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        return kotlin.text.StringsKt.toDoubleOrNull(jsonPrimitive.getContent());
    }

    public static final float getFloat(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        return java.lang.Float.parseFloat(jsonPrimitive.getContent());
    }

    public static final java.lang.Float getFloatOrNull(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        return kotlin.text.StringsKt.toFloatOrNull(jsonPrimitive.getContent());
    }

    public static final boolean getBoolean(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        java.lang.Boolean booleanStrictOrNull = kotlinx.serialization.json.internal.StringOpsKt.toBooleanStrictOrNull(jsonPrimitive.getContent());
        if (booleanStrictOrNull != null) {
            return booleanStrictOrNull.booleanValue();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(jsonPrimitive);
        sb.append(" does not represent a Boolean");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public static final java.lang.Boolean getBooleanOrNull(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        return kotlinx.serialization.json.internal.StringOpsKt.toBooleanStrictOrNull(jsonPrimitive.getContent());
    }

    public static final java.lang.String getContentOrNull(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        if (jsonPrimitive instanceof kotlinx.serialization.json.JsonNull) {
            return null;
        }
        return jsonPrimitive.getContent();
    }

    private static final java.lang.Void getHighResolutionOutputSizeshNQ4ISI(kotlinx.serialization.json.JsonElement jsonElement, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Element ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(jsonElement.getClass()));
        sb.append(" is not a ");
        sb.append(str);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final java.lang.Void unexpectedJson(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Element ");
        sb.append(str);
        sb.append(" is not a ");
        sb.append(str2);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final long parseLongImpl(kotlinx.serialization.json.JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        return new kotlinx.serialization.json.internal.StringJsonLexer(jsonPrimitive.getContent()).consumeNumericLiteralFully();
    }
}
