package io.sentry.profilemeasurements;

import e1.k;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class ProfileMeasurementValue implements JsonUnknown, JsonSerializable {
    private String relativeStartNs;
    private double timestamp;
    private Map<String, Object> unknown;
    private double value;

    public static final class Deserializer implements JsonDeserializer<ProfileMeasurementValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public ProfileMeasurementValue deserialize(ObjectReader objectReader, ILogger iLogger) {
            String nextName;
            Double valueOf;
            objectReader.beginObject();
            ProfileMeasurementValue profileMeasurementValue = new ProfileMeasurementValue();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                nextName = objectReader.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "elapsed_since_start_ns":
                        String nextStringOrNull = objectReader.nextStringOrNull();
                        if (nextStringOrNull == null) {
                            break;
                        } else {
                            profileMeasurementValue.relativeStartNs = nextStringOrNull;
                            break;
                        }
                    case "timestamp":
                        try {
                            valueOf = objectReader.nextDoubleOrNull();
                        } catch (NumberFormatException unused) {
                            Date nextDateOrNull = objectReader.nextDateOrNull(iLogger);
                            valueOf = nextDateOrNull != null ? Double.valueOf(DateUtils.dateToSeconds(nextDateOrNull)) : null;
                        }
                        if (valueOf == null) {
                            break;
                        } else {
                            profileMeasurementValue.timestamp = valueOf.doubleValue();
                            break;
                        }
                    case "value":
                        Double nextDoubleOrNull = objectReader.nextDoubleOrNull();
                        if (nextDoubleOrNull == null) {
                            break;
                        } else {
                            profileMeasurementValue.value = nextDoubleOrNull.doubleValue();
                            break;
                        }
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            profileMeasurementValue.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return profileMeasurementValue;
        }
    }

    public static final class JsonKeys {
        public static final String START_NS = "elapsed_since_start_ns";
        public static final String TIMESTAMP = "timestamp";
        public static final String VALUE = "value";
    }

    public ProfileMeasurementValue() {
        this(0L, 0, 0L);
    }

    private BigDecimal doubleToBigDecimal(Double d7) {
        return BigDecimal.valueOf(d7.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProfileMeasurementValue.class != obj.getClass()) {
            return false;
        }
        ProfileMeasurementValue profileMeasurementValue = (ProfileMeasurementValue) obj;
        return Objects.equals(this.unknown, profileMeasurementValue.unknown) && this.relativeStartNs.equals(profileMeasurementValue.relativeStartNs) && this.value == profileMeasurementValue.value && this.timestamp == profileMeasurementValue.timestamp;
    }

    public String getRelativeStartNs() {
        return this.relativeStartNs;
    }

    public double getTimestamp() {
        return this.timestamp;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public double getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.unknown, this.relativeStartNs, Double.valueOf(this.value));
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("value").value(iLogger, Double.valueOf(this.value));
        objectWriter.name(JsonKeys.START_NS).value(iLogger, this.relativeStartNs);
        objectWriter.name("timestamp").value(iLogger, doubleToBigDecimal(Double.valueOf(this.timestamp)));
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                k.p(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public ProfileMeasurementValue(Long l7, Number number, long j) {
        this.relativeStartNs = l7.toString();
        this.value = number.doubleValue();
        this.timestamp = DateUtils.nanosToSeconds(j);
    }
}
