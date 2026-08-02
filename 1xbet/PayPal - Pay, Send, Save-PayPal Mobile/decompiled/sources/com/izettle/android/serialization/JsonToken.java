package com.izettle.android.serialization;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\f\n\u0002\b\u000e\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/izettle/android/serialization/JsonToken;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;IC)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getValue", "()C", "BEGIN_OBJECT", "END_OBJECT", "BEGIN_ARRAY", "END_ARRAY", "DOUBLE_QUOTE", "SINGLE_QUOTE", "COLON", "COMMA"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JsonToken {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.izettle.android.serialization.JsonToken[] $VALUES;
    private final char value;
    public static final com.izettle.android.serialization.JsonToken BEGIN_OBJECT = new com.izettle.android.serialization.JsonToken("BEGIN_OBJECT", 0, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
    public static final com.izettle.android.serialization.JsonToken END_OBJECT = new com.izettle.android.serialization.JsonToken("END_OBJECT", 1, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
    public static final com.izettle.android.serialization.JsonToken BEGIN_ARRAY = new com.izettle.android.serialization.JsonToken("BEGIN_ARRAY", 2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
    public static final com.izettle.android.serialization.JsonToken END_ARRAY = new com.izettle.android.serialization.JsonToken("END_ARRAY", 3, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
    public static final com.izettle.android.serialization.JsonToken DOUBLE_QUOTE = new com.izettle.android.serialization.JsonToken("DOUBLE_QUOTE", 4, '\"');
    public static final com.izettle.android.serialization.JsonToken SINGLE_QUOTE = new com.izettle.android.serialization.JsonToken("SINGLE_QUOTE", 5, '\'');
    public static final com.izettle.android.serialization.JsonToken COLON = new com.izettle.android.serialization.JsonToken("COLON", 6, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
    public static final com.izettle.android.serialization.JsonToken COMMA = new com.izettle.android.serialization.JsonToken("COMMA", 7, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);

    private JsonToken(java.lang.String str, int i, char c) {
        this.value = c;
    }

    public final char getValue() {
        return this.value;
    }

    static {
        com.izettle.android.serialization.JsonToken[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static com.izettle.android.serialization.JsonToken[] values() {
        return (com.izettle.android.serialization.JsonToken[]) $VALUES.clone();
    }

    public static com.izettle.android.serialization.JsonToken valueOf(java.lang.String str) {
        return (com.izettle.android.serialization.JsonToken) java.lang.Enum.valueOf(com.izettle.android.serialization.JsonToken.class, str);
    }

    public static kotlin.enums.EnumEntries<com.izettle.android.serialization.JsonToken> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.izettle.android.serialization.JsonToken[] $values() {
        return new com.izettle.android.serialization.JsonToken[]{BEGIN_OBJECT, END_OBJECT, BEGIN_ARRAY, END_ARRAY, DOUBLE_QUOTE, SINGLE_QUOTE, COLON, COMMA};
    }
}
