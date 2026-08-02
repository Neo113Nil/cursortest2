package io.sentry.protocol;

import W5.AbstractC0486a1;
import e1.k;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.Span;
import io.sentry.SpanId;
import io.sentry.SpanStatus;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.SentryId;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class SentrySpan implements JsonUnknown, JsonSerializable {
    private Map<String, Object> data;
    private final String description;
    private final Map<String, MeasurementValue> measurements;
    private final String op;
    private final String origin;
    private final SpanId parentSpanId;
    private final SpanId spanId;
    private final Double startTimestamp;
    private final SpanStatus status;
    private final Map<String, String> tags;
    private final Double timestamp;
    private final SentryId traceId;
    private Map<String, Object> unknown;

    public static final class Deserializer implements JsonDeserializer<SentrySpan> {
        private Exception missingRequiredFieldException(String str, ILogger iLogger) {
            String h6 = AbstractC0486a1.h("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(h6);
            iLogger.log(SentryLevel.ERROR, h6, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentrySpan deserialize(ObjectReader objectReader, ILogger iLogger) {
            char c3;
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            Double d7 = null;
            Double d8 = null;
            SentryId sentryId = null;
            SpanId spanId = null;
            SpanId spanId2 = null;
            String str = null;
            String str2 = null;
            SpanStatus spanStatus = null;
            String str3 = null;
            Map map = null;
            Map map2 = null;
            Map map3 = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String nextName = objectReader.nextName();
                nextName.getClass();
                switch (nextName.hashCode()) {
                    case -2011840976:
                        if (nextName.equals("span_id")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1757797477:
                        if (nextName.equals("parent_span_id")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1724546052:
                        if (nextName.equals("description")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1526966919:
                        if (nextName.equals("start_timestamp")) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1008619738:
                        if (nextName.equals("origin")) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -892481550:
                        if (nextName.equals("status")) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -362243017:
                        if (nextName.equals("measurements")) {
                            c3 = 6;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 3553:
                        if (nextName.equals("op")) {
                            c3 = 7;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 3076010:
                        if (nextName.equals("data")) {
                            c3 = '\b';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 3552281:
                        if (nextName.equals("tags")) {
                            c3 = '\t';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 55126294:
                        if (nextName.equals("timestamp")) {
                            c3 = '\n';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1270300245:
                        if (nextName.equals("trace_id")) {
                            c3 = 11;
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                    case 0:
                        spanId = new SpanId.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case 1:
                        spanId2 = (SpanId) objectReader.nextOrNull(iLogger, new SpanId.Deserializer());
                        break;
                    case 2:
                        str2 = objectReader.nextStringOrNull();
                        break;
                    case 3:
                        try {
                            d7 = objectReader.nextDoubleOrNull();
                            break;
                        } catch (NumberFormatException unused) {
                            Date nextDateOrNull = objectReader.nextDateOrNull(iLogger);
                            if (nextDateOrNull == null) {
                                d7 = null;
                                break;
                            } else {
                                d7 = Double.valueOf(DateUtils.dateToSeconds(nextDateOrNull));
                                break;
                            }
                        }
                    case 4:
                        str3 = objectReader.nextStringOrNull();
                        break;
                    case 5:
                        spanStatus = (SpanStatus) objectReader.nextOrNull(iLogger, new SpanStatus.Deserializer());
                        break;
                    case 6:
                        map2 = objectReader.nextMapOrNull(iLogger, new MeasurementValue.Deserializer());
                        break;
                    case 7:
                        str = objectReader.nextStringOrNull();
                        break;
                    case '\b':
                        map3 = (Map) objectReader.nextObjectOrNull();
                        break;
                    case '\t':
                        map = (Map) objectReader.nextObjectOrNull();
                        break;
                    case '\n':
                        try {
                            d8 = objectReader.nextDoubleOrNull();
                            break;
                        } catch (NumberFormatException unused2) {
                            Date nextDateOrNull2 = objectReader.nextDateOrNull(iLogger);
                            if (nextDateOrNull2 == null) {
                                d8 = null;
                                break;
                            } else {
                                d8 = Double.valueOf(DateUtils.dateToSeconds(nextDateOrNull2));
                                break;
                            }
                        }
                    case 11:
                        sentryId = new SentryId.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            if (d7 == null) {
                throw missingRequiredFieldException("start_timestamp", iLogger);
            }
            if (sentryId == null) {
                throw missingRequiredFieldException("trace_id", iLogger);
            }
            if (spanId == null) {
                throw missingRequiredFieldException("span_id", iLogger);
            }
            if (str == null) {
                throw missingRequiredFieldException("op", iLogger);
            }
            if (map == null) {
                map = new HashMap();
            }
            if (map2 == null) {
                map2 = new HashMap();
            }
            SentrySpan sentrySpan = new SentrySpan(d7, d8, sentryId, spanId, spanId2, str, str2, spanStatus, str3, map, map2, map3);
            sentrySpan.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentrySpan;
        }
    }

    public static final class JsonKeys {
        public static final String DATA = "data";
        public static final String DESCRIPTION = "description";
        public static final String MEASUREMENTS = "measurements";
        public static final String OP = "op";
        public static final String ORIGIN = "origin";
        public static final String PARENT_SPAN_ID = "parent_span_id";
        public static final String SPAN_ID = "span_id";
        public static final String START_TIMESTAMP = "start_timestamp";
        public static final String STATUS = "status";
        public static final String TAGS = "tags";
        public static final String TIMESTAMP = "timestamp";
        public static final String TRACE_ID = "trace_id";
    }

    public SentrySpan(Span span) {
        this(span, span.getData());
    }

    private BigDecimal doubleToBigDecimal(Double d7) {
        return BigDecimal.valueOf(d7.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public String getDescription() {
        return this.description;
    }

    public Map<String, MeasurementValue> getMeasurements() {
        return this.measurements;
    }

    public String getOp() {
        return this.op;
    }

    public String getOrigin() {
        return this.origin;
    }

    public SpanId getParentSpanId() {
        return this.parentSpanId;
    }

    public SpanId getSpanId() {
        return this.spanId;
    }

    public Double getStartTimestamp() {
        return this.startTimestamp;
    }

    public SpanStatus getStatus() {
        return this.status;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public Double getTimestamp() {
        return this.timestamp;
    }

    public SentryId getTraceId() {
        return this.traceId;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public boolean isFinished() {
        return this.timestamp != null;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("start_timestamp").value(iLogger, doubleToBigDecimal(this.startTimestamp));
        if (this.timestamp != null) {
            objectWriter.name("timestamp").value(iLogger, doubleToBigDecimal(this.timestamp));
        }
        objectWriter.name("trace_id").value(iLogger, this.traceId);
        objectWriter.name("span_id").value(iLogger, this.spanId);
        if (this.parentSpanId != null) {
            objectWriter.name("parent_span_id").value(iLogger, this.parentSpanId);
        }
        objectWriter.name("op").value(this.op);
        if (this.description != null) {
            objectWriter.name("description").value(this.description);
        }
        if (this.status != null) {
            objectWriter.name("status").value(iLogger, this.status);
        }
        if (this.origin != null) {
            objectWriter.name("origin").value(iLogger, this.origin);
        }
        if (!this.tags.isEmpty()) {
            objectWriter.name("tags").value(iLogger, this.tags);
        }
        if (this.data != null) {
            objectWriter.name("data").value(iLogger, this.data);
        }
        if (!this.measurements.isEmpty()) {
            objectWriter.name("measurements").value(iLogger, this.measurements);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                k.p(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setData(Map<String, Object> map) {
        this.data = map;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public SentrySpan(Span span, Map<String, Object> map) {
        Objects.requireNonNull(span, "span is required");
        this.description = span.getDescription();
        this.op = span.getOperation();
        this.spanId = span.getSpanId();
        this.parentSpanId = span.getParentSpanId();
        this.traceId = span.getTraceId();
        this.status = span.getStatus();
        this.origin = span.getSpanContext().getOrigin();
        Map<String, String> newConcurrentHashMap = CollectionUtils.newConcurrentHashMap(span.getTags());
        this.tags = newConcurrentHashMap == null ? new ConcurrentHashMap<>() : newConcurrentHashMap;
        Map<String, MeasurementValue> newConcurrentHashMap2 = CollectionUtils.newConcurrentHashMap(span.getMeasurements());
        this.measurements = newConcurrentHashMap2 == null ? new ConcurrentHashMap<>() : newConcurrentHashMap2;
        this.timestamp = span.getFinishDate() == null ? null : Double.valueOf(DateUtils.nanosToSeconds(span.getStartDate().laterDateNanosTimestampByDiff(span.getFinishDate())));
        this.startTimestamp = Double.valueOf(DateUtils.nanosToSeconds(span.getStartDate().nanoTimestamp()));
        this.data = map;
    }

    public SentrySpan(Double d7, Double d8, SentryId sentryId, SpanId spanId, SpanId spanId2, String str, String str2, SpanStatus spanStatus, String str3, Map<String, String> map, Map<String, MeasurementValue> map2, Map<String, Object> map3) {
        this.startTimestamp = d7;
        this.timestamp = d8;
        this.traceId = sentryId;
        this.spanId = spanId;
        this.parentSpanId = spanId2;
        this.op = str;
        this.description = str2;
        this.status = spanStatus;
        this.origin = str3;
        this.tags = map;
        this.measurements = map2;
        this.data = map3;
    }
}
