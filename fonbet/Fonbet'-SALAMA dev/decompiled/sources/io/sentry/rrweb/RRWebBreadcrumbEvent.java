package io.sentry.rrweb;

import e1.k;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.util.CollectionUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class RRWebBreadcrumbEvent extends RRWebEvent implements JsonUnknown, JsonSerializable {
    public static final String EVENT_TAG = "breadcrumb";
    private double breadcrumbTimestamp;
    private String breadcrumbType;
    private String category;
    private Map<String, Object> data;
    private Map<String, Object> dataUnknown;
    private SentryLevel level;
    private String message;
    private Map<String, Object> payloadUnknown;
    private String tag;
    private Map<String, Object> unknown;

    public static final class Deserializer implements JsonDeserializer<RRWebBreadcrumbEvent> {
        private void deserializeData(RRWebBreadcrumbEvent rRWebBreadcrumbEvent, ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String nextName = objectReader.nextName();
                nextName.getClass();
                if (nextName.equals("payload")) {
                    deserializePayload(rRWebBreadcrumbEvent, objectReader, iLogger);
                } else if (nextName.equals("tag")) {
                    String nextStringOrNull = objectReader.nextStringOrNull();
                    if (nextStringOrNull == null) {
                        nextStringOrNull = "";
                    }
                    rRWebBreadcrumbEvent.tag = nextStringOrNull;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, nextName);
                }
            }
            rRWebBreadcrumbEvent.setDataUnknown(concurrentHashMap);
            objectReader.endObject();
        }

        private void deserializePayload(RRWebBreadcrumbEvent rRWebBreadcrumbEvent, ObjectReader objectReader, ILogger iLogger) {
            String nextName;
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                nextName = objectReader.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "data":
                        Map newConcurrentHashMap = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                        if (newConcurrentHashMap == null) {
                            break;
                        } else {
                            rRWebBreadcrumbEvent.data = newConcurrentHashMap;
                            break;
                        }
                    case "type":
                        rRWebBreadcrumbEvent.breadcrumbType = objectReader.nextStringOrNull();
                        break;
                    case "category":
                        rRWebBreadcrumbEvent.category = objectReader.nextStringOrNull();
                        break;
                    case "timestamp":
                        rRWebBreadcrumbEvent.breadcrumbTimestamp = objectReader.nextDouble();
                        break;
                    case "level":
                        try {
                            rRWebBreadcrumbEvent.level = new SentryLevel.Deserializer().deserialize(objectReader, iLogger);
                            break;
                        } catch (Exception e7) {
                            iLogger.log(SentryLevel.DEBUG, e7, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                    case "message":
                        rRWebBreadcrumbEvent.message = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            rRWebBreadcrumbEvent.setPayloadUnknown(concurrentHashMap);
            objectReader.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public RRWebBreadcrumbEvent deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            RRWebBreadcrumbEvent rRWebBreadcrumbEvent = new RRWebBreadcrumbEvent();
            RRWebEvent.Deserializer deserializer = new RRWebEvent.Deserializer();
            HashMap hashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String nextName = objectReader.nextName();
                nextName.getClass();
                if (nextName.equals("data")) {
                    deserializeData(rRWebBreadcrumbEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebBreadcrumbEvent, nextName, objectReader, iLogger)) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, hashMap, nextName);
                }
            }
            rRWebBreadcrumbEvent.setUnknown(hashMap);
            objectReader.endObject();
            return rRWebBreadcrumbEvent;
        }
    }

    public static final class JsonKeys {
        public static final String CATEGORY = "category";
        public static final String DATA = "data";
        public static final String LEVEL = "level";
        public static final String MESSAGE = "message";
        public static final String PAYLOAD = "payload";
        public static final String TIMESTAMP = "timestamp";
        public static final String TYPE = "type";
    }

    public RRWebBreadcrumbEvent() {
        super(RRWebEventType.Custom);
        this.tag = EVENT_TAG;
    }

    private void serializeData(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("tag").value(this.tag);
        objectWriter.name("payload");
        serializePayload(objectWriter, iLogger);
        Map<String, Object> map = this.dataUnknown;
        if (map != null) {
            for (String str : map.keySet()) {
                k.p(this.dataUnknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    private void serializePayload(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.breadcrumbType != null) {
            objectWriter.name("type").value(this.breadcrumbType);
        }
        objectWriter.name("timestamp").value(iLogger, BigDecimal.valueOf(this.breadcrumbTimestamp));
        if (this.category != null) {
            objectWriter.name("category").value(this.category);
        }
        if (this.message != null) {
            objectWriter.name("message").value(this.message);
        }
        if (this.level != null) {
            objectWriter.name("level").value(iLogger, this.level);
        }
        if (this.data != null) {
            objectWriter.name("data").value(iLogger, this.data);
        }
        Map<String, Object> map = this.payloadUnknown;
        if (map != null) {
            for (String str : map.keySet()) {
                k.p(this.payloadUnknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public double getBreadcrumbTimestamp() {
        return this.breadcrumbTimestamp;
    }

    public String getBreadcrumbType() {
        return this.breadcrumbType;
    }

    public String getCategory() {
        return this.category;
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public Map<String, Object> getDataUnknown() {
        return this.dataUnknown;
    }

    public SentryLevel getLevel() {
        return this.level;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, Object> getPayloadUnknown() {
        return this.payloadUnknown;
    }

    public String getTag() {
        return this.tag;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        new RRWebEvent.Serializer().serialize(this, objectWriter, iLogger);
        objectWriter.name("data");
        serializeData(objectWriter, iLogger);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                k.p(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setBreadcrumbTimestamp(double d7) {
        this.breadcrumbTimestamp = d7;
    }

    public void setBreadcrumbType(String str) {
        this.breadcrumbType = str;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setData(Map<String, Object> map) {
        this.data = map == null ? null : new ConcurrentHashMap(map);
    }

    public void setDataUnknown(Map<String, Object> map) {
        this.dataUnknown = map;
    }

    public void setLevel(SentryLevel sentryLevel) {
        this.level = sentryLevel;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setPayloadUnknown(Map<String, Object> map) {
        this.payloadUnknown = map;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }
}
