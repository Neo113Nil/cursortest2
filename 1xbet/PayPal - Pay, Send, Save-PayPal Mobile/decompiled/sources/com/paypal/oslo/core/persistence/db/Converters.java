package com.paypal.oslo.core.persistence.db;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/persistence/db/Converters;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/time/Instant;", "fromTimestampToInstant", "(Ljava/lang/Long;)Ljava/time/Instant;", "instant", "instantToTimestamp", "(Ljava/time/Instant;)Ljava/lang/Long;", "Ljava/util/Date;", "fromTimestampToDate", "(Ljava/lang/Long;)Ljava/util/Date;", "date", "dateToTimestamp", "(Ljava/util/Date;)Ljava/lang/Long;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Converters {
    public final java.time.Instant fromTimestampToInstant(java.lang.Long value) {
        if (value != null) {
            return java.time.Instant.ofEpochMilli(value.longValue());
        }
        return null;
    }

    public final java.lang.Long instantToTimestamp(java.time.Instant instant) {
        if (instant != null) {
            return java.lang.Long.valueOf(instant.toEpochMilli());
        }
        return null;
    }

    public final java.util.Date fromTimestampToDate(java.lang.Long value) {
        if (value != null) {
            return new java.util.Date(value.longValue());
        }
        return null;
    }

    public final java.lang.Long dateToTimestamp(java.util.Date date) {
        if (date != null) {
            return java.lang.Long.valueOf(date.getTime());
        }
        return null;
    }
}
