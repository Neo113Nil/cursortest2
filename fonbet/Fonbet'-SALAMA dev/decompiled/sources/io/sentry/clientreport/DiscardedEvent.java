package io.sentry.clientreport;

import W5.AbstractC0486a1;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class DiscardedEvent implements JsonUnknown, JsonSerializable {
    private final String category;
    private final Long quantity;
    private final String reason;
    private Map<String, Object> unknown;

    public static final class Deserializer implements JsonDeserializer<DiscardedEvent> {
        private Exception missingRequiredFieldException(String str, ILogger iLogger) {
            String h6 = AbstractC0486a1.h("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(h6);
            iLogger.log(SentryLevel.ERROR, h6, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public DiscardedEvent deserialize(ObjectReader objectReader, ILogger iLogger) {
            String nextName;
            objectReader.beginObject();
            String str = null;
            String str2 = null;
            Long l7 = null;
            HashMap hashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                nextName = objectReader.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "quantity":
                        l7 = objectReader.nextLongOrNull();
                        break;
                    case "reason":
                        str = objectReader.nextStringOrNull();
                        break;
                    case "category":
                        str2 = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        objectReader.nextUnknown(iLogger, hashMap, nextName);
                        break;
                }
            }
            objectReader.endObject();
            if (str == null) {
                throw missingRequiredFieldException(JsonKeys.REASON, iLogger);
            }
            if (str2 == null) {
                throw missingRequiredFieldException("category", iLogger);
            }
            if (l7 == null) {
                throw missingRequiredFieldException(JsonKeys.QUANTITY, iLogger);
            }
            DiscardedEvent discardedEvent = new DiscardedEvent(str, str2, l7);
            discardedEvent.setUnknown(hashMap);
            return discardedEvent;
        }
    }

    public static final class JsonKeys {
        public static final String CATEGORY = "category";
        public static final String QUANTITY = "quantity";
        public static final String REASON = "reason";
    }

    public DiscardedEvent(String str, String str2, Long l7) {
        this.reason = str;
        this.category = str2;
        this.quantity = l7;
    }

    public String getCategory() {
        return this.category;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public String getReason() {
        return this.reason;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name(JsonKeys.REASON).value(this.reason);
        objectWriter.name("category").value(this.category);
        objectWriter.name(JsonKeys.QUANTITY).value(this.quantity);
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

    public String toString() {
        return "DiscardedEvent{reason='" + this.reason + "', category='" + this.category + "', quantity=" + this.quantity + '}';
    }
}
