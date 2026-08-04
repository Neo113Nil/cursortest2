package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public enum SentryLogLevel implements JsonSerializable {
    TRACE(1),
    DEBUG(5),
    INFO(9),
    WARN(13),
    ERROR(17),
    FATAL(21);

    private final int severityNumber;

    public static final class Deserializer implements JsonDeserializer<SentryLogLevel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryLogLevel deserialize(ObjectReader objectReader, ILogger iLogger) {
            return SentryLogLevel.valueOf(objectReader.nextString().toUpperCase(Locale.ROOT));
        }
    }

    SentryLogLevel(int i7) {
        this.severityNumber = i7;
    }

    public int getSeverityNumber() {
        return this.severityNumber;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.value(name().toLowerCase(Locale.ROOT));
    }
}
