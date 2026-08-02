package com.izettle.android.serialization;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lcom/izettle/android/serialization/JsonElement;", "asJsonElement", "(Ljava/lang/String;)Lcom/izettle/android/serialization/JsonElement;", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "Lkotlin/Pair;", "", "readEscapeCharacter", "(Ljava/lang/String;I)Lkotlin/Pair;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JsonParserKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair<java.lang.Character, java.lang.Integer> readEscapeCharacter(java.lang.String str, int i) {
        int i2;
        char charAt = str.charAt(i);
        if (charAt != 'u') {
            if (charAt == 't') {
                return kotlin.TuplesKt.to('\t', 1);
            }
            if (charAt == 'b') {
                return kotlin.TuplesKt.to('\b', 1);
            }
            if (charAt == 'n') {
                return kotlin.TuplesKt.to('\n', 1);
            }
            if (charAt == 'r') {
                return kotlin.TuplesKt.to('\r', 1);
            }
            if (charAt == '\'' || charAt == '\"' || charAt == '\\' || charAt == '/' || charAt == '\n') {
                return kotlin.TuplesKt.to(java.lang.Character.valueOf(charAt), 1);
            }
            throw new com.izettle.android.serialization.JsonParseException("Invalid escape sequence");
        }
        int i3 = i + 4;
        char c = 0;
        if (i3 > str.length() - 1) {
            throw new com.izettle.android.serialization.JsonParseException(charAt, i, "Unterminated escape sequence", new char[0]);
        }
        for (int i4 = i + 1; i4 < i + 5; i4++) {
            char charAt2 = str.charAt(i4);
            char c2 = (char) (c << 4);
            if ('0' <= charAt2 && charAt2 < ':') {
                i2 = charAt2 - '0';
            } else if ('a' <= charAt2 && charAt2 < 'g') {
                i2 = charAt2 - 'W';
            } else {
                if ('A' > charAt2 || charAt2 >= 'G') {
                    throw new java.lang.NumberFormatException("\\u".concat(java.lang.String.valueOf(kotlin.text.StringsKt.substring(str, new kotlin.ranges.IntRange(i, i3)))));
                }
                i2 = charAt2 - '7';
            }
            c = (char) (c2 + i2);
        }
        return kotlin.TuplesKt.to(java.lang.Character.valueOf(c), 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.izettle.android.serialization.JsonElement asJsonElement(java.lang.String str) {
        com.izettle.android.serialization.JsonPrimitive jsonPrimitive;
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "null")) {
            return new com.izettle.android.serialization.JsonNull();
        }
        java.lang.Boolean booleanStrictOrNull = kotlin.text.StringsKt.toBooleanStrictOrNull(str);
        if (booleanStrictOrNull != null) {
            jsonPrimitive = new com.izettle.android.serialization.JsonPrimitive(booleanStrictOrNull.booleanValue());
        } else {
            java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(str);
            if (intOrNull != null) {
                jsonPrimitive = new com.izettle.android.serialization.JsonPrimitive(intOrNull.intValue());
            } else {
                java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(str);
                if (doubleOrNull != null) {
                    jsonPrimitive = new com.izettle.android.serialization.JsonPrimitive(doubleOrNull.doubleValue());
                } else {
                    jsonPrimitive = new com.izettle.android.serialization.JsonPrimitive(str);
                }
            }
        }
        return jsonPrimitive;
    }
}
