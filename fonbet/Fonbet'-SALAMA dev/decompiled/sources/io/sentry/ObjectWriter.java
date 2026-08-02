package io.sentry;

/* loaded from: classes2.dex */
public interface ObjectWriter {
    ObjectWriter beginArray();

    ObjectWriter beginObject();

    ObjectWriter endArray();

    ObjectWriter endObject();

    String getIndent();

    ObjectWriter jsonValue(String str);

    ObjectWriter name(String str);

    ObjectWriter nullValue();

    void setIndent(String str);

    void setLenient(boolean z4);

    ObjectWriter value(double d7);

    ObjectWriter value(long j);

    ObjectWriter value(ILogger iLogger, Object obj);

    ObjectWriter value(Boolean bool);

    ObjectWriter value(Number number);

    ObjectWriter value(String str);

    ObjectWriter value(boolean z4);
}
