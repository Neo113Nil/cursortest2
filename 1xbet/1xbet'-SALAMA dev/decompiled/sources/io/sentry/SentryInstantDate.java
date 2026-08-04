package io.sentry;

import java.time.Instant;

/* JADX INFO: loaded from: classes2.dex */
public final class SentryInstantDate extends SentryDate {
    private final Instant date;

    public SentryInstantDate() {
        this(Instant.now());
    }

    @Override // io.sentry.SentryDate
    public long nanoTimestamp() {
        return DateUtils.secondsToNanos(this.date.getEpochSecond()) + ((long) this.date.getNano());
    }

    public SentryInstantDate(Instant instant) {
        this.date = instant;
    }
}
