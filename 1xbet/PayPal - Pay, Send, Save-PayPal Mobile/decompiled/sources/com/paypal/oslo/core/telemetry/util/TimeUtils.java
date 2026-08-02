package com.paypal.oslo.core.telemetry.util;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/telemetry/util/TimeUtils;", "", "<init>", "()V", "", "currentTimeMillis", "()J", "", "currentFormattedUtcTime", "()Ljava/lang/String;", "timeMillis", "formattedUtcTime", "(J)Ljava/lang/String;", "Ljava/time/format/DateTimeFormatter;", "Camera2StreamConfigurationMap", "Ljava/time/format/DateTimeFormatter;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TimeUtils {
    public static final int $stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.time.format.DateTimeFormatter getHighResolutionOutputSizeshNQ4ISI;
    public static final com.paypal.oslo.core.telemetry.util.TimeUtils INSTANCE = new com.paypal.oslo.core.telemetry.util.TimeUtils();

    private TimeUtils() {
    }

    static {
        java.time.format.DateTimeFormatter withZone = java.time.format.DateTimeFormatter.ofPattern(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_UTC_FORMAT_UTC_Z).withZone(java.time.ZoneOffset.UTC);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(withZone, "");
        getHighResolutionOutputSizeshNQ4ISI = withZone;
        $stable = 8;
    }

    public final long currentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }

    public final java.lang.String currentFormattedUtcTime() {
        return formattedUtcTime(currentTimeMillis());
    }

    public final java.lang.String formattedUtcTime(long timeMillis) {
        java.lang.String format = getHighResolutionOutputSizeshNQ4ISI.format(java.time.Instant.ofEpochMilli(timeMillis));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
