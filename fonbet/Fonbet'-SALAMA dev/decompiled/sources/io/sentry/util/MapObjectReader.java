package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.ObjectReader;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class MapObjectReader implements ObjectReader {
    private final Deque<Map.Entry<String, Object>> stack;

    public MapObjectReader(Map<String, Object> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.stack = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    private <T> T nextValueOrNull() {
        try {
            return (T) nextValueOrNull(null, null);
        } catch (Exception e7) {
            throw new IOException(e7);
        }
    }

    @Override // io.sentry.ObjectReader
    public void beginArray() {
        Map.Entry<String, Object> removeLast = this.stack.removeLast();
        if (removeLast == null) {
            throw new IOException("No more entries");
        }
        Object value = removeLast.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        this.stack.addLast(new AbstractMap.SimpleEntry(null, JsonToken.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            this.stack.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    @Override // io.sentry.ObjectReader
    public void beginObject() {
        Map.Entry<String, Object> removeLast = this.stack.removeLast();
        if (removeLast == null) {
            throw new IOException("No more entries");
        }
        Object value = removeLast.getValue();
        if (!(value instanceof Map)) {
            throw new IOException("Current token is not an object");
        }
        this.stack.addLast(new AbstractMap.SimpleEntry(null, JsonToken.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            this.stack.addLast((Map.Entry) it.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.stack.clear();
    }

    @Override // io.sentry.ObjectReader
    public void endArray() {
        if (this.stack.size() > 1) {
            this.stack.removeLast();
        }
    }

    @Override // io.sentry.ObjectReader
    public void endObject() {
        if (this.stack.size() > 1) {
            this.stack.removeLast();
        }
    }

    @Override // io.sentry.ObjectReader
    public boolean hasNext() {
        return !this.stack.isEmpty();
    }

    @Override // io.sentry.ObjectReader
    public boolean nextBoolean() {
        Boolean bool = (Boolean) nextValueOrNull();
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IOException("Expected boolean");
    }

    @Override // io.sentry.ObjectReader
    public Boolean nextBooleanOrNull() {
        return (Boolean) nextValueOrNull();
    }

    @Override // io.sentry.ObjectReader
    public Date nextDateOrNull(ILogger iLogger) {
        return ObjectReader.dateOrNull(nextStringOrNull(), iLogger);
    }

    @Override // io.sentry.ObjectReader
    public double nextDouble() {
        Object nextValueOrNull = nextValueOrNull();
        if (nextValueOrNull instanceof Number) {
            return ((Number) nextValueOrNull).doubleValue();
        }
        throw new IOException("Expected double");
    }

    @Override // io.sentry.ObjectReader
    public Double nextDoubleOrNull() {
        Object nextValueOrNull = nextValueOrNull();
        if (nextValueOrNull instanceof Number) {
            return Double.valueOf(((Number) nextValueOrNull).doubleValue());
        }
        return null;
    }

    @Override // io.sentry.ObjectReader
    public float nextFloat() {
        Object nextValueOrNull = nextValueOrNull();
        if (nextValueOrNull instanceof Number) {
            return ((Number) nextValueOrNull).floatValue();
        }
        throw new IOException("Expected float");
    }

    @Override // io.sentry.ObjectReader
    public Float nextFloatOrNull() {
        Object nextValueOrNull = nextValueOrNull();
        if (nextValueOrNull instanceof Number) {
            return Float.valueOf(((Number) nextValueOrNull).floatValue());
        }
        return null;
    }

    @Override // io.sentry.ObjectReader
    public int nextInt() {
        Object nextValueOrNull = nextValueOrNull();
        if (nextValueOrNull instanceof Number) {
            return ((Number) nextValueOrNull).intValue();
        }
        throw new IOException("Expected int");
    }

    @Override // io.sentry.ObjectReader
    public Integer nextIntegerOrNull() {
        Object nextValueOrNull = nextValueOrNull();
        if (nextValueOrNull instanceof Number) {
            return Integer.valueOf(((Number) nextValueOrNull).intValue());
        }
        return null;
    }

    @Override // io.sentry.ObjectReader
    public <T> List<T> nextListOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer) {
        if (peek() == JsonToken.NULL) {
            nextNull();
            return null;
        }
        try {
            beginArray();
            ArrayList arrayList = new ArrayList();
            if (hasNext()) {
                do {
                    try {
                        arrayList.add(jsonDeserializer.deserialize(this, iLogger));
                    } catch (Exception e7) {
                        iLogger.log(SentryLevel.WARNING, "Failed to deserialize object in list.", e7);
                    }
                } while (peek() == JsonToken.BEGIN_OBJECT);
            }
            endArray();
            return arrayList;
        } catch (Exception e8) {
            throw new IOException(e8);
        }
    }

    @Override // io.sentry.ObjectReader
    public long nextLong() {
        Object nextValueOrNull = nextValueOrNull();
        if (nextValueOrNull instanceof Number) {
            return ((Number) nextValueOrNull).longValue();
        }
        throw new IOException("Expected long");
    }

    @Override // io.sentry.ObjectReader
    public Long nextLongOrNull() {
        Object nextValueOrNull = nextValueOrNull();
        if (nextValueOrNull instanceof Number) {
            return Long.valueOf(((Number) nextValueOrNull).longValue());
        }
        return null;
    }

    @Override // io.sentry.ObjectReader
    public <T> Map<String, List<T>> nextMapOfListOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer) {
        if (peek() == JsonToken.NULL) {
            nextNull();
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            beginObject();
            if (hasNext()) {
                while (true) {
                    String nextName = nextName();
                    List<T> nextListOrNull = nextListOrNull(iLogger, jsonDeserializer);
                    if (nextListOrNull != null) {
                        hashMap.put(nextName, nextListOrNull);
                    }
                    if (peek() != JsonToken.BEGIN_OBJECT && peek() != JsonToken.NAME) {
                        break;
                    }
                }
            }
            endObject();
            return hashMap;
        } catch (Exception e7) {
            throw new IOException(e7);
        }
    }

    @Override // io.sentry.ObjectReader
    public <T> Map<String, T> nextMapOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer) {
        if (peek() == JsonToken.NULL) {
            nextNull();
            return null;
        }
        try {
            beginObject();
            HashMap hashMap = new HashMap();
            if (hasNext()) {
                while (true) {
                    try {
                        hashMap.put(nextName(), jsonDeserializer.deserialize(this, iLogger));
                    } catch (Exception e7) {
                        iLogger.log(SentryLevel.WARNING, "Failed to deserialize object in map.", e7);
                    }
                    if (peek() != JsonToken.BEGIN_OBJECT && peek() != JsonToken.NAME) {
                        break;
                    }
                }
            }
            endObject();
            return hashMap;
        } catch (Exception e8) {
            throw new IOException(e8);
        }
    }

    @Override // io.sentry.ObjectReader
    public String nextName() {
        Map.Entry<String, Object> peekLast = this.stack.peekLast();
        if (peekLast != null && peekLast.getKey() != null) {
            return peekLast.getKey();
        }
        throw new IOException("Expected a name but was " + peek());
    }

    @Override // io.sentry.ObjectReader
    public void nextNull() {
        if (nextValueOrNull() == null) {
            return;
        }
        throw new IOException("Expected null but was " + peek());
    }

    @Override // io.sentry.ObjectReader
    public Object nextObjectOrNull() {
        return nextValueOrNull();
    }

    @Override // io.sentry.ObjectReader
    public <T> T nextOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer) {
        return (T) nextValueOrNull(iLogger, jsonDeserializer);
    }

    @Override // io.sentry.ObjectReader
    public String nextString() {
        String str = (String) nextValueOrNull();
        if (str != null) {
            return str;
        }
        throw new IOException("Expected string");
    }

    @Override // io.sentry.ObjectReader
    public String nextStringOrNull() {
        return (String) nextValueOrNull();
    }

    @Override // io.sentry.ObjectReader
    public TimeZone nextTimeZoneOrNull(ILogger iLogger) {
        String nextStringOrNull = nextStringOrNull();
        if (nextStringOrNull != null) {
            return TimeZone.getTimeZone(nextStringOrNull);
        }
        return null;
    }

    @Override // io.sentry.ObjectReader
    public void nextUnknown(ILogger iLogger, Map<String, Object> map, String str) {
        try {
            map.put(str, nextObjectOrNull());
        } catch (Exception e7) {
            iLogger.log(SentryLevel.ERROR, e7, "Error deserializing unknown key: %s", str);
        }
    }

    @Override // io.sentry.ObjectReader
    public JsonToken peek() {
        if (this.stack.isEmpty()) {
            return JsonToken.END_DOCUMENT;
        }
        Map.Entry<String, Object> peekLast = this.stack.peekLast();
        if (peekLast == null) {
            return JsonToken.END_DOCUMENT;
        }
        if (peekLast.getKey() != null) {
            return JsonToken.NAME;
        }
        Object value = peekLast.getValue();
        return value instanceof Map ? JsonToken.BEGIN_OBJECT : value instanceof List ? JsonToken.BEGIN_ARRAY : value instanceof String ? JsonToken.STRING : value instanceof Number ? JsonToken.NUMBER : value instanceof Boolean ? JsonToken.BOOLEAN : value instanceof JsonToken ? (JsonToken) value : JsonToken.END_DOCUMENT;
    }

    @Override // io.sentry.ObjectReader
    public void setLenient(boolean z4) {
    }

    @Override // io.sentry.ObjectReader
    public void skipValue() {
    }

    private <T> T nextValueOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer) {
        Map.Entry<String, Object> peekLast = this.stack.peekLast();
        if (peekLast == null) {
            return null;
        }
        T t7 = (T) peekLast.getValue();
        if (jsonDeserializer != null && iLogger != null) {
            return jsonDeserializer.deserialize(this, iLogger);
        }
        this.stack.removeLast();
        return t7;
    }
}
