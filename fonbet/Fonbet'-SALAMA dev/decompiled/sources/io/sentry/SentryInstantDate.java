package io.sentry;

import java.time.Instant;

/* loaded from: classes2.dex */
public final class SentryInstantDate extends SentryDate {
    private final Instant date;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SentryInstantDate() {
        this(r0);
        Instant now;
        now = Instant.now();
    }

    @Override // io.sentry.SentryDate
    public long nanoTimestamp() {
        long epochSecond;
        int nano;
        epochSecond = this.date.getEpochSecond();
        long secondsToNanos = DateUtils.secondsToNanos(epochSecond);
        nano = this.date.getNano();
        return secondsToNanos + nano;
    }

    public SentryInstantDate(Instant instant) {
        this.date = instant;
    }
}
