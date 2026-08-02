package io.sentry;

import io.sentry.vendor.gson.stream.JsonWriter;
import java.io.Writer;

/* loaded from: classes2.dex */
public final class JsonObjectWriter implements ObjectWriter {
    private final JsonObjectSerializer jsonObjectSerializer;
    private final JsonWriter jsonWriter;

    public JsonObjectWriter(Writer writer, int i7) {
        this.jsonWriter = new JsonWriter(writer);
        this.jsonObjectSerializer = new JsonObjectSerializer(i7);
    }

    @Override // io.sentry.ObjectWriter
    public String getIndent() {
        return this.jsonWriter.getIndent();
    }

    @Override // io.sentry.ObjectWriter
    public ObjectWriter jsonValue(String str) {
        this.jsonWriter.jsonValue(str);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public void setIndent(String str) {
        this.jsonWriter.setIndent(str);
    }

    @Override // io.sentry.ObjectWriter
    public void setLenient(boolean z4) {
        this.jsonWriter.setLenient(z4);
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter beginArray() {
        this.jsonWriter.beginArray();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter beginObject() {
        this.jsonWriter.beginObject();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter endArray() {
        this.jsonWriter.endArray();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter endObject() {
        this.jsonWriter.endObject();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter name(String str) {
        this.jsonWriter.name(str);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter nullValue() {
        this.jsonWriter.nullValue();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(String str) {
        this.jsonWriter.value(str);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(boolean z4) {
        this.jsonWriter.value(z4);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(Boolean bool) {
        this.jsonWriter.value(bool);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(double d7) {
        this.jsonWriter.value(d7);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(long j) {
        this.jsonWriter.value(j);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(Number number) {
        this.jsonWriter.value(number);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(ILogger iLogger, Object obj) {
        this.jsonObjectSerializer.serialize(this, iLogger, obj);
        return this;
    }
}
