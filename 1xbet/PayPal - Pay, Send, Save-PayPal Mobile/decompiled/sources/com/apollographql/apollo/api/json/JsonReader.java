package com.apollographql.apollo.api.json;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001-J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H&¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0000H&¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0000H&¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000bH&¢\u0006\u0004\b\u0012\u0010\rJ\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H&¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u00162\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0%H&¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\"H&¢\u0006\u0004\b)\u0010$J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020*0%H&¢\u0006\u0004\b+\u0010,ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/json/JsonReader;", "Ljava/io/Closeable;", "Lokio/getOutputFormats;", "Lcom/apollographql/apollo/api/json/JsonReader$Token;", "peek", "()Lcom/apollographql/apollo/api/json/JsonReader$Token;", "beginArray", "()Lcom/apollographql/apollo/api/json/JsonReader;", "endArray", "beginObject", "endObject", "", "hasNext", "()Z", "", "nextName", "()Ljava/lang/String;", "nextString", "nextBoolean", "", "nextNull", "()Ljava/lang/Void;", "", "nextInt", "()I", "", "nextDouble", "()D", "", "nextLong", "()J", "Lcom/apollographql/apollo/api/json/JsonNumber;", "nextNumber", "()Lcom/apollographql/apollo/api/json/JsonNumber;", "", "skipValue", "()V", "", "names", "selectName", "(Ljava/util/List;)I", "rewind", "", "getPath", "()Ljava/util/List;", "Token"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface JsonReader extends java.io.Closeable {
    com.apollographql.apollo.api.json.JsonReader beginArray() throws java.io.IOException;

    com.apollographql.apollo.api.json.JsonReader beginObject() throws java.io.IOException;

    com.apollographql.apollo.api.json.JsonReader endArray() throws java.io.IOException;

    com.apollographql.apollo.api.json.JsonReader endObject() throws java.io.IOException;

    java.util.List<java.lang.Object> getPath();

    boolean hasNext() throws java.io.IOException;

    boolean nextBoolean() throws java.io.IOException;

    double nextDouble() throws java.io.IOException;

    int nextInt() throws java.io.IOException;

    long nextLong() throws java.io.IOException;

    java.lang.String nextName() throws java.io.IOException;

    java.lang.Void nextNull() throws java.io.IOException;

    com.apollographql.apollo.api.json.JsonNumber nextNumber() throws java.io.IOException;

    java.lang.String nextString() throws java.io.IOException;

    com.apollographql.apollo.api.json.JsonReader.Token peek() throws java.io.IOException;

    void rewind();

    int selectName(java.util.List<java.lang.String> names) throws java.io.IOException;

    void skipValue() throws java.io.IOException;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/apollographql/apollo/api/json/JsonReader$Token;", "", "<init>", "(Ljava/lang/String;I)V", "BEGIN_ARRAY", "END_ARRAY", "BEGIN_OBJECT", "END_OBJECT", "NAME", "STRING", "NUMBER", "LONG", "BOOLEAN", "NULL", "END_DOCUMENT", "ANY"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Token {
        public static final com.apollographql.apollo.api.json.JsonReader.Token ANY;
        public static final com.apollographql.apollo.api.json.JsonReader.Token BEGIN_ARRAY;
        public static final com.apollographql.apollo.api.json.JsonReader.Token BEGIN_OBJECT;
        public static final com.apollographql.apollo.api.json.JsonReader.Token BOOLEAN;
        public static final com.apollographql.apollo.api.json.JsonReader.Token END_ARRAY;
        public static final com.apollographql.apollo.api.json.JsonReader.Token END_DOCUMENT;
        public static final com.apollographql.apollo.api.json.JsonReader.Token END_OBJECT;
        public static final com.apollographql.apollo.api.json.JsonReader.Token LONG;
        public static final com.apollographql.apollo.api.json.JsonReader.Token NAME;
        public static final com.apollographql.apollo.api.json.JsonReader.Token NULL;
        public static final com.apollographql.apollo.api.json.JsonReader.Token NUMBER;
        public static final com.apollographql.apollo.api.json.JsonReader.Token STRING;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ com.apollographql.apollo.api.json.JsonReader.Token[] getHighSpeedVideoFpsRangesFor;

        private Token(java.lang.String str, int i) {
        }

        static {
            com.apollographql.apollo.api.json.JsonReader.Token token = new com.apollographql.apollo.api.json.JsonReader.Token("BEGIN_ARRAY", 0);
            BEGIN_ARRAY = token;
            com.apollographql.apollo.api.json.JsonReader.Token token2 = new com.apollographql.apollo.api.json.JsonReader.Token("END_ARRAY", 1);
            END_ARRAY = token2;
            com.apollographql.apollo.api.json.JsonReader.Token token3 = new com.apollographql.apollo.api.json.JsonReader.Token("BEGIN_OBJECT", 2);
            BEGIN_OBJECT = token3;
            com.apollographql.apollo.api.json.JsonReader.Token token4 = new com.apollographql.apollo.api.json.JsonReader.Token("END_OBJECT", 3);
            END_OBJECT = token4;
            com.apollographql.apollo.api.json.JsonReader.Token token5 = new com.apollographql.apollo.api.json.JsonReader.Token("NAME", 4);
            NAME = token5;
            com.apollographql.apollo.api.json.JsonReader.Token token6 = new com.apollographql.apollo.api.json.JsonReader.Token("STRING", 5);
            STRING = token6;
            com.apollographql.apollo.api.json.JsonReader.Token token7 = new com.apollographql.apollo.api.json.JsonReader.Token("NUMBER", 6);
            NUMBER = token7;
            com.apollographql.apollo.api.json.JsonReader.Token token8 = new com.apollographql.apollo.api.json.JsonReader.Token("LONG", 7);
            LONG = token8;
            com.apollographql.apollo.api.json.JsonReader.Token token9 = new com.apollographql.apollo.api.json.JsonReader.Token("BOOLEAN", 8);
            BOOLEAN = token9;
            com.apollographql.apollo.api.json.JsonReader.Token token10 = new com.apollographql.apollo.api.json.JsonReader.Token("NULL", 9);
            NULL = token10;
            com.apollographql.apollo.api.json.JsonReader.Token token11 = new com.apollographql.apollo.api.json.JsonReader.Token("END_DOCUMENT", 10);
            END_DOCUMENT = token11;
            com.apollographql.apollo.api.json.JsonReader.Token token12 = new com.apollographql.apollo.api.json.JsonReader.Token("ANY", 11);
            ANY = token12;
            com.apollographql.apollo.api.json.JsonReader.Token[] tokenArr = {token, token2, token3, token4, token5, token6, token7, token8, token9, token10, token11, token12};
            getHighSpeedVideoFpsRangesFor = tokenArr;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(tokenArr);
        }

        public static com.apollographql.apollo.api.json.JsonReader.Token valueOf(java.lang.String str) {
            return (com.apollographql.apollo.api.json.JsonReader.Token) java.lang.Enum.valueOf(com.apollographql.apollo.api.json.JsonReader.Token.class, str);
        }

        public static com.apollographql.apollo.api.json.JsonReader.Token[] values() {
            return (com.apollographql.apollo.api.json.JsonReader.Token[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static kotlin.enums.EnumEntries<com.apollographql.apollo.api.json.JsonReader.Token> getEntries() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
    }
}
