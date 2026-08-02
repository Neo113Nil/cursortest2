package io.sentry;

import java.util.Locale;

/* loaded from: classes2.dex */
public enum SentryLevel implements JsonSerializable {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    public static final class Deserializer implements JsonDeserializer<SentryLevel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryLevel deserialize(ObjectReader objectReader, ILogger iLogger) {
            return SentryLevel.valueOf(objectReader.nextString().toUpperCase(Locale.ROOT));
        }
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.value(name().toLowerCase(Locale.ROOT));
    }
}
