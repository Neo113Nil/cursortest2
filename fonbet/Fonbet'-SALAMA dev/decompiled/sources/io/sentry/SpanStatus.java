package io.sentry;

import java.util.Locale;

/* loaded from: classes2.dex */
public enum SpanStatus implements JsonSerializable {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(HttpStatusCodeRange.DEFAULT_MIN),
    UNKNOWN(HttpStatusCodeRange.DEFAULT_MIN),
    UNKNOWN_ERROR(HttpStatusCodeRange.DEFAULT_MIN),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(HttpStatusCodeRange.DEFAULT_MIN),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    public static final class Deserializer implements JsonDeserializer<SpanStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SpanStatus deserialize(ObjectReader objectReader, ILogger iLogger) {
            return SpanStatus.valueOf(objectReader.nextString().toUpperCase(Locale.ROOT));
        }
    }

    SpanStatus(int i7) {
        this.minHttpStatusCode = i7;
        this.maxHttpStatusCode = i7;
    }

    public static SpanStatus fromApiNameSafely(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static SpanStatus fromHttpStatusCode(int i7) {
        for (SpanStatus spanStatus : values()) {
            if (spanStatus.matches(i7)) {
                return spanStatus;
            }
        }
        return null;
    }

    private boolean matches(int i7) {
        return i7 >= this.minHttpStatusCode && i7 <= this.maxHttpStatusCode;
    }

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.value(apiName());
    }

    public static SpanStatus fromHttpStatusCode(Integer num, SpanStatus spanStatus) {
        SpanStatus fromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : spanStatus;
        return fromHttpStatusCode != null ? fromHttpStatusCode : spanStatus;
    }

    SpanStatus(int i7, int i8) {
        this.minHttpStatusCode = i7;
        this.maxHttpStatusCode = i8;
    }
}
