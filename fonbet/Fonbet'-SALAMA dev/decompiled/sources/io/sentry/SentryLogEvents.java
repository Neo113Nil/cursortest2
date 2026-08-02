package io.sentry;

import io.sentry.SentryLogEvent;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class SentryLogEvents implements JsonUnknown, JsonSerializable {
    private List<SentryLogEvent> items;
    private Map<String, Object> unknown;

    public static final class Deserializer implements JsonDeserializer<SentryLogEvents> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryLogEvents deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            List list = null;
            HashMap hashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String nextName = objectReader.nextName();
                nextName.getClass();
                if (nextName.equals(JsonKeys.ITEMS)) {
                    list = objectReader.nextListOrNull(iLogger, new SentryLogEvent.Deserializer());
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, hashMap, nextName);
                }
            }
            objectReader.endObject();
            if (list != null) {
                SentryLogEvents sentryLogEvents = new SentryLogEvents(list);
                sentryLogEvents.setUnknown(hashMap);
                return sentryLogEvents;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"items\"");
            iLogger.log(SentryLevel.ERROR, "Missing required field \"items\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public static final class JsonKeys {
        public static final String ITEMS = "items";
    }

    public SentryLogEvents(List<SentryLogEvent> list) {
        this.items = list;
    }

    public List<SentryLogEvent> getItems() {
        return this.items;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name(JsonKeys.ITEMS).value(iLogger, this.items);
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
}
