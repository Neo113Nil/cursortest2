package io.sentry.logger;

import io.sentry.SentryAttributes;
import io.sentry.SentryDate;

/* JADX INFO: loaded from: classes2.dex */
public final class SentryLogParameters {
    private SentryAttributes attributes;
    private SentryDate timestamp;

    public static SentryLogParameters create(SentryDate sentryDate, SentryAttributes sentryAttributes) {
        SentryLogParameters sentryLogParameters = new SentryLogParameters();
        sentryLogParameters.setTimestamp(sentryDate);
        sentryLogParameters.setAttributes(sentryAttributes);
        return sentryLogParameters;
    }

    public SentryAttributes getAttributes() {
        return this.attributes;
    }

    public SentryDate getTimestamp() {
        return this.timestamp;
    }

    public void setAttributes(SentryAttributes sentryAttributes) {
        this.attributes = sentryAttributes;
    }

    public void setTimestamp(SentryDate sentryDate) {
        this.timestamp = sentryDate;
    }

    public static SentryLogParameters create(SentryAttributes sentryAttributes) {
        return create(null, sentryAttributes);
    }
}
