package com.paypal.oslo.feature.taxanddocumentcenter.domain.util;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/util/DateRangeApiUtils;", "", "<init>", "()V", "Ljava/time/LocalDate;", "startDate", "endDate", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/util/DateRangeIso;", "calculateDateRange", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/util/DateRangeIso;", "date", "", "formatToStartOfDayUtc", "(Ljava/time/LocalDate;)Ljava/lang/String;", "formatToEndOfDayUtc", "Ljava/time/format/DateTimeFormatter;", "getHighSpeedVideoFpsRangesFor", "Ljava/time/format/DateTimeFormatter;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DateRangeApiUtils {
    public static final int $stable;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.util.DateRangeApiUtils INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.domain.util.DateRangeApiUtils();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.time.format.DateTimeFormatter Camera2StreamConfigurationMap;

    private DateRangeApiUtils() {
    }

    static {
        java.time.format.DateTimeFormatter ofPattern = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofPattern, "");
        Camera2StreamConfigurationMap = ofPattern;
        $stable = 8;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.util.DateRangeIso calculateDateRange(java.time.LocalDate startDate, java.time.LocalDate endDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endDate, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.util.DateRangeIso(formatToStartOfDayUtc(startDate), formatToEndOfDayUtc(endDate));
    }

    public final java.lang.String formatToStartOfDayUtc(java.time.LocalDate date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        java.lang.String format = java.time.ZonedDateTime.of(date, java.time.LocalTime.MIN, java.time.ZoneOffset.UTC).format(Camera2StreamConfigurationMap);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public final java.lang.String formatToEndOfDayUtc(java.time.LocalDate date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        java.lang.String format = java.time.ZonedDateTime.of(date, java.time.LocalTime.of(23, 59, 59, 0), java.time.ZoneOffset.UTC).format(Camera2StreamConfigurationMap);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
