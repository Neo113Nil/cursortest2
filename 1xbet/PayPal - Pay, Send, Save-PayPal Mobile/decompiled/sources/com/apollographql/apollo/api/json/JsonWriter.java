package com.apollographql.apollo.api.json;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0003\u001a\u00020\u0000H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0000H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0000H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0000H&¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0000H&¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\rH&¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u000fH&¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0011H&¢\u0006\u0004\b\u000b\u0010\u0012J\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0013H&¢\u0006\u0004\b\u000b\u0010\u0014J\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0015H&¢\u0006\u0004\b\u000b\u0010\u0016J\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0017H&¢\u0006\u0004\b\u000b\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/json/JsonWriter;", "Ljava/io/Closeable;", "Lokio/getOutputFormats;", "beginArray", "()Lcom/apollographql/apollo/api/json/JsonWriter;", "endArray", "beginObject", "endObject", "", "name", "(Ljava/lang/String;)Lcom/apollographql/apollo/api/json/JsonWriter;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "nullValue", "", "(Z)Lcom/apollographql/apollo/api/json/JsonWriter;", "", "(D)Lcom/apollographql/apollo/api/json/JsonWriter;", "", "(I)Lcom/apollographql/apollo/api/json/JsonWriter;", "", "(J)Lcom/apollographql/apollo/api/json/JsonWriter;", "Lcom/apollographql/apollo/api/json/JsonNumber;", "(Lcom/apollographql/apollo/api/json/JsonNumber;)Lcom/apollographql/apollo/api/json/JsonWriter;", "Lcom/apollographql/apollo/api/Upload;", "(Lcom/apollographql/apollo/api/Upload;)Lcom/apollographql/apollo/api/json/JsonWriter;", "", "flush", "()V", "getPath", "()Ljava/lang/String;", "path"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface JsonWriter extends java.io.Closeable {
    com.apollographql.apollo.api.json.JsonWriter beginArray() throws java.io.IOException;

    com.apollographql.apollo.api.json.JsonWriter beginObject() throws java.io.IOException;

    com.apollographql.apollo.api.json.JsonWriter endArray() throws java.io.IOException;

    com.apollographql.apollo.api.json.JsonWriter endObject() throws java.io.IOException;

    void flush() throws java.io.IOException;

    java.lang.String getPath();

    com.apollographql.apollo.api.json.JsonWriter name(java.lang.String name2) throws java.io.IOException;

    com.apollographql.apollo.api.json.JsonWriter nullValue() throws java.io.IOException;

    com.apollographql.apollo.api.json.JsonWriter value(double value) throws java.io.IOException;

    com.apollographql.apollo.api.json.JsonWriter value(int value) throws java.io.IOException;

    com.apollographql.apollo.api.json.JsonWriter value(long value) throws java.io.IOException;

    com.apollographql.apollo.api.json.JsonWriter value(com.apollographql.apollo.api.Upload value) throws java.io.IOException;

    com.apollographql.apollo.api.json.JsonWriter value(com.apollographql.apollo.api.json.JsonNumber value) throws java.io.IOException;

    com.apollographql.apollo.api.json.JsonWriter value(java.lang.String value) throws java.io.IOException;

    com.apollographql.apollo.api.json.JsonWriter value(boolean value) throws java.io.IOException;
}
