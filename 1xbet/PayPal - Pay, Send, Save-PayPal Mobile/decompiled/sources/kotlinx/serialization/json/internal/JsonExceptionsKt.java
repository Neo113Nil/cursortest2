package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0005\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0016\u001a\u00020\u0012*\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u001d\u001a'\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001d\u0010%\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b%\u0010&"}, d2 = {"", "offset", "", "message", "Lkotlinx/serialization/json/internal/JsonDecodingException;", "JsonDecodingException", "(ILjava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;", "", "input", "(ILjava/lang/String;Ljava/lang/CharSequence;)Lkotlinx/serialization/json/internal/JsonDecodingException;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "output", "Lkotlinx/serialization/json/internal/JsonEncodingException;", "InvalidFloatingPointEncoded", "(Ljava/lang/Number;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonEncodingException;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "result", "", "throwInvalidFloatingPointDecoded", "(Lkotlinx/serialization/json/internal/AbstractJsonLexer;Ljava/lang/Number;)Ljava/lang/Void;", "entity", "invalidTrailingComma", "(Lkotlinx/serialization/json/internal/AbstractJsonLexer;Ljava/lang/String;)Ljava/lang/Void;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "keyDescriptor", "InvalidKeyKindException", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/json/internal/JsonEncodingException;", "key", "(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonEncodingException;", "InvalidFloatingPointDecoded", "(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;", "p0", "p1", "p2", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "minify", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonExceptionsKt {
    public static final kotlinx.serialization.json.internal.JsonDecodingException JsonDecodingException(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (i >= 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected JSON token at offset ");
            sb.append(i);
            sb.append(": ");
            sb.append(str);
            str = sb.toString();
        }
        return new kotlinx.serialization.json.internal.JsonDecodingException(str);
    }

    public static final kotlinx.serialization.json.internal.JsonDecodingException JsonDecodingException(int i, java.lang.String str, java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("\nJSON input: ");
        sb.append((java.lang.Object) minify(charSequence, i));
        return JsonDecodingException(i, sb.toString());
    }

    public static final kotlinx.serialization.json.internal.JsonEncodingException InvalidFloatingPointEncoded(java.lang.Number number, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        sb.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        sb.append((java.lang.Object) minify$default(str, 0, 1, null));
        return new kotlinx.serialization.json.internal.JsonEncodingException(sb.toString());
    }

    public static final java.lang.Void throwInvalidFloatingPointDecoded(kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer, java.lang.Number number) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractJsonLexer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        sb.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification");
        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, sb.toString(), 0, kotlinx.serialization.json.internal.AbstractJsonLexerKt.specialFlowingValuesHint, 2, null);
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ java.lang.Void invalidTrailingComma$default(kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "object";
        }
        return invalidTrailingComma(abstractJsonLexer, str);
    }

    public static final java.lang.Void invalidTrailingComma(kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractJsonLexer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        abstractJsonLexer.fail("Trailing comma before the end of JSON ".concat(java.lang.String.valueOf(str)), abstractJsonLexer.currentPosition - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlinx.serialization.json.internal.JsonEncodingException InvalidKeyKindException(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Value of type '");
        sb.append(serialDescriptor.getSerialName());
        sb.append("' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '");
        sb.append(serialDescriptor.getKind());
        sb.append("'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
        return new kotlinx.serialization.json.internal.JsonEncodingException(sb.toString());
    }

    public static final kotlinx.serialization.json.internal.JsonEncodingException InvalidFloatingPointEncoded(java.lang.Number number, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new kotlinx.serialization.json.internal.JsonEncodingException(getHighSpeedVideoFpsRangesFor(number, str, str2));
    }

    public static final kotlinx.serialization.json.internal.JsonDecodingException InvalidFloatingPointDecoded(java.lang.Number number, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return JsonDecodingException(-1, getHighSpeedVideoFpsRangesFor(number, str, str2));
    }

    private static final java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.Number number, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        sb.append(" with key ");
        sb.append(str);
        sb.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        sb.append((java.lang.Object) minify$default(str2, 0, 1, null));
        return sb.toString();
    }

    public static /* synthetic */ java.lang.CharSequence minify$default(java.lang.CharSequence charSequence, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return minify(charSequence, i);
    }

    public static final java.lang.CharSequence minify(java.lang.CharSequence charSequence, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i != -1) {
            int i2 = i - 30;
            int i3 = i + 30;
            java.lang.String str = i2 <= 0 ? "" : ".....";
            java.lang.String str2 = i3 < charSequence.length() ? "....." : "";
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(charSequence.subSequence(kotlin.ranges.RangesKt.coerceAtLeast(i2, 0), kotlin.ranges.RangesKt.coerceAtMost(i3, charSequence.length())).toString());
            sb.append(str2);
            return sb.toString();
        }
        int length = charSequence.length() - 60;
        if (length <= 0) {
            return charSequence;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(".....");
        sb2.append(charSequence.subSequence(length, charSequence.length()).toString());
        return sb2.toString();
    }
}
