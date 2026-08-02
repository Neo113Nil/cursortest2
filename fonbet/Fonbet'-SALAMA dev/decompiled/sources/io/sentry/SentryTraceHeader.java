package io.sentry;

import io.sentry.exception.InvalidSentryTraceHeaderException;
import io.sentry.protocol.SentryId;

/* loaded from: classes2.dex */
public final class SentryTraceHeader {
    public static final String SENTRY_TRACE_HEADER = "sentry-trace";
    private final Boolean sampled;
    private final SpanId spanId;
    private final SentryId traceId;

    public SentryTraceHeader(SentryId sentryId, SpanId spanId, Boolean bool) {
        this.traceId = sentryId;
        this.spanId = spanId;
        this.sampled = bool;
    }

    public String getName() {
        return SENTRY_TRACE_HEADER;
    }

    public SpanId getSpanId() {
        return this.spanId;
    }

    public SentryId getTraceId() {
        return this.traceId;
    }

    public String getValue() {
        Boolean bool = this.sampled;
        if (bool == null) {
            return this.traceId + "-" + this.spanId;
        }
        return this.traceId + "-" + this.spanId + "-" + (bool.booleanValue() ? "1" : "0");
    }

    public Boolean isSampled() {
        return this.sampled;
    }

    public SentryTraceHeader(String str) {
        String[] split = str.split("-", -1);
        if (split.length >= 2) {
            if (split.length == 3) {
                this.sampled = Boolean.valueOf("1".equals(split[2]));
            } else {
                this.sampled = null;
            }
            try {
                this.traceId = new SentryId(split[0]);
                this.spanId = new SpanId(split[1]);
                return;
            } catch (Throwable th) {
                throw new InvalidSentryTraceHeaderException(str, th);
            }
        }
        throw new InvalidSentryTraceHeaderException(str);
    }
}
