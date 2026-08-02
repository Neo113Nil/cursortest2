package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class SentryLogEventAttributeValue implements JsonUnknown, JsonSerializable {
    private String type;
    private Map<String, Object> unknown;
    private Object value;

    public static final class Deserializer implements JsonDeserializer<SentryLogEventAttributeValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryLogEventAttributeValue deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            String str = null;
            Object obj = null;
            HashMap hashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String nextName = objectReader.nextName();
                nextName.getClass();
                if (nextName.equals("type")) {
                    str = objectReader.nextStringOrNull();
                } else if (nextName.equals("value")) {
                    obj = objectReader.nextObjectOrNull();
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, hashMap, nextName);
                }
            }
            objectReader.endObject();
            if (str != null) {
                SentryLogEventAttributeValue sentryLogEventAttributeValue = new SentryLogEventAttributeValue(str, obj);
                sentryLogEventAttributeValue.setUnknown(hashMap);
                return sentryLogEventAttributeValue;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
            iLogger.log(SentryLevel.ERROR, "Missing required field \"type\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public static final class JsonKeys {
        public static final String TYPE = "type";
        public static final String VALUE = "value";
    }

    public SentryLogEventAttributeValue(String str, Object obj) {
        this.type = str;
        if (obj == null || !str.equals("string")) {
            this.value = obj;
        } else {
            this.value = obj.toString();
        }
    }

    public String getType() {
        return this.type;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public Object getValue() {
        return this.value;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("type").value(iLogger, this.type);
        objectWriter.name("value").value(iLogger, this.value);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public SentryLogEventAttributeValue(SentryAttributeType sentryAttributeType, Object obj) {
        this(sentryAttributeType.apiName(), obj);
    }
}
