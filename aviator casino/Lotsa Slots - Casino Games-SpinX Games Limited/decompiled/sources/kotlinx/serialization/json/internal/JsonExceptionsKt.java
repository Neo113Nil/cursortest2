package kotlinx.serialization.json.internal;

/* compiled from: JsonExceptions.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0000\u001a\u0016\u0010\u0011\u001a\u00020\u000e*\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0000\u001a\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0000\u001a \u0010\u0017\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0000\u001a \u0010\u0018\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002\u001a\u0016\u0010\u0019\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u001a"}, d2 = {"JsonDecodingException", "Lkotlinx/serialization/json/internal/JsonDecodingException;", "offset", "", "message", "", "input", "", "InvalidFloatingPointEncoded", "Lkotlinx/serialization/json/internal/JsonEncodingException;", "value", "", "output", "throwInvalidFloatingPointDecoded", "", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "result", "invalidTrailingComma", "entity", "InvalidKeyKindException", "keyDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", com.ironsource.X3.i.W, "InvalidFloatingPointDecoded", "unexpectedFpErrorMessage", "minify", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonExceptionsKt {
    public static final kotlinx.serialization.json.internal.JsonDecodingException JsonDecodingException(int i, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        if (i >= 0) {
            message = "Unexpected JSON token at offset " + i + ": " + message;
        }
        return new kotlinx.serialization.json.internal.JsonDecodingException(message);
    }

    public static final kotlinx.serialization.json.internal.JsonDecodingException JsonDecodingException(int i, java.lang.String message, java.lang.CharSequence input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        return JsonDecodingException(i, message + "\nJSON input: " + ((java.lang.Object) minify(input, i)));
    }

    public static final kotlinx.serialization.json.internal.JsonEncodingException InvalidFloatingPointEncoded(java.lang.Number value, java.lang.String output) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        return new kotlinx.serialization.json.internal.JsonEncodingException("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((java.lang.Object) minify$default(output, 0, 1, null)));
    }

    public static final java.lang.Void throwInvalidFloatingPointDecoded(kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer, java.lang.Number result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractJsonLexer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, kotlinx.serialization.json.internal.AbstractJsonLexerKt.specialFlowingValuesHint, 2, null);
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ java.lang.Void invalidTrailingComma$default(kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "object";
        }
        return invalidTrailingComma(abstractJsonLexer, str);
    }

    public static final java.lang.Void invalidTrailingComma(kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer, java.lang.String entity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractJsonLexer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "entity");
        abstractJsonLexer.fail("Trailing comma before the end of JSON " + entity, abstractJsonLexer.currentPosition - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlinx.serialization.json.internal.JsonEncodingException InvalidKeyKindException(kotlinx.serialization.descriptors.SerialDescriptor keyDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        return new kotlinx.serialization.json.internal.JsonEncodingException("Value of type '" + keyDescriptor.getSerialName() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final kotlinx.serialization.json.internal.JsonEncodingException InvalidFloatingPointEncoded(java.lang.Number value, java.lang.String key, java.lang.String output) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        return new kotlinx.serialization.json.internal.JsonEncodingException(unexpectedFpErrorMessage(value, key, output));
    }

    public static final kotlinx.serialization.json.internal.JsonDecodingException InvalidFloatingPointDecoded(java.lang.Number value, java.lang.String key, java.lang.String output) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        return JsonDecodingException(-1, unexpectedFpErrorMessage(value, key, output));
    }

    private static final java.lang.String unexpectedFpErrorMessage(java.lang.Number number, java.lang.String str, java.lang.String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((java.lang.Object) minify$default(str2, 0, 1, null));
    }

    public static /* synthetic */ java.lang.CharSequence minify$default(java.lang.CharSequence charSequence, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return minify(charSequence, i);
    }

    public static final java.lang.CharSequence minify(java.lang.CharSequence charSequence, int i) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        java.lang.String str2 = ".....";
        if (i == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i2 = i - 30;
        int i3 = i + 30;
        if (i2 > 0) {
            str = ".....";
        } else {
            str = "";
        }
        if (i3 >= charSequence.length()) {
            str2 = "";
        }
        return str + charSequence.subSequence(kotlin.ranges.RangesKt.coerceAtLeast(i2, 0), kotlin.ranges.RangesKt.coerceAtMost(i3, charSequence.length())).toString() + str2;
    }
}
