package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/utils/DateRangeUtils;", "", "<init>", "()V", "Ljava/time/LocalDate;", "date", "", "formatDate", "(Ljava/time/LocalDate;)Ljava/lang/String;", "formatDateOrEmpty", "selectedDate", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/utils/FromDateSelectionResult;", "handleFromDateSelected", "(Ljava/time/LocalDate;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/utils/FromDateSelectionResult;", "getDefaultFromDate", "()Ljava/time/LocalDate;", "getDefaultToDate", "Lkotlin/Function1;", "", "", "createSelectableDatePredicate", "()Lkotlin/jvm/functions/Function1;", "fromDate", "createToDateSelectablePredicate", "(Ljava/time/LocalDate;)Lkotlin/jvm/functions/Function1;", "utcMillis", "utcMillisToLocalDate", "(J)Ljava/time/LocalDate;", "Ljava/time/format/DateTimeFormatter;", "getHighSpeedVideoSizes", "Ljava/time/format/DateTimeFormatter;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DateRangeUtils {
    public static final int $stable;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.DateRangeUtils INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.DateRangeUtils();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.time.format.DateTimeFormatter getHighSpeedVideoFpsRanges;

    private DateRangeUtils() {
    }

    static {
        java.time.format.DateTimeFormatter ofLocalizedDate = java.time.format.DateTimeFormatter.ofLocalizedDate(java.time.format.FormatStyle.MEDIUM);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofLocalizedDate, "");
        getHighSpeedVideoFpsRanges = ofLocalizedDate;
        $stable = 8;
    }

    public final java.lang.String formatDate(java.time.LocalDate date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        java.lang.String format = date.format(getHighSpeedVideoFpsRanges);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public final java.lang.String formatDateOrEmpty(java.time.LocalDate date) {
        java.lang.String formatDate = date != null ? INSTANCE.formatDate(date) : null;
        return formatDate == null ? "" : formatDate;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.FromDateSelectionResult handleFromDateSelected(java.time.LocalDate selectedDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedDate, "");
        java.time.LocalDate now = java.time.LocalDate.now();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(now, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.FromDateSelectionResult(selectedDate, now);
    }

    public final java.time.LocalDate getDefaultFromDate() {
        java.time.LocalDate minusYears = java.time.LocalDate.now().minusYears(3L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(minusYears, "");
        return minusYears;
    }

    public final java.time.LocalDate getDefaultToDate() {
        java.time.LocalDate now = java.time.LocalDate.now();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(now, "");
        return now;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Long, java.lang.Boolean> createSelectableDatePredicate() {
        final java.time.LocalDate now = java.time.LocalDate.now(java.time.ZoneOffset.UTC);
        final java.time.LocalDate minusYears = now.minusYears(3L);
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.DateRangeUtils$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.DateRangeUtils.$r8$lambda$J4J9azgIDnJmWcerZBxEmOpSaoA(minusYears, now, ((java.lang.Long) obj).longValue()));
            }
        };
    }

    public final kotlin.jvm.functions.Function1<java.lang.Long, java.lang.Boolean> createToDateSelectablePredicate(final java.time.LocalDate fromDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fromDate, "");
        final java.time.LocalDate now = java.time.LocalDate.now(java.time.ZoneOffset.UTC);
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.DateRangeUtils$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.DateRangeUtils.m20329$r8$lambda$gOgjaIdczZC7zxFuAvuGwKqHc(fromDate, now, ((java.lang.Long) obj).longValue()));
            }
        };
    }

    public final java.time.LocalDate utcMillisToLocalDate(long utcMillis) {
        java.time.LocalDate localDate = java.time.Instant.ofEpochMilli(utcMillis).atZone(java.time.ZoneOffset.UTC).toLocalDate();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localDate, "");
        return localDate;
    }

    public static /* synthetic */ boolean $r8$lambda$J4J9azgIDnJmWcerZBxEmOpSaoA(java.time.LocalDate localDate, java.time.LocalDate localDate2, long j) {
        java.time.LocalDate utcMillisToLocalDate = INSTANCE.utcMillisToLocalDate(j);
        return (utcMillisToLocalDate.isBefore(localDate) || utcMillisToLocalDate.isAfter(localDate2)) ? false : true;
    }

    /* renamed from: $r8$lambda$g-OgjaIdcz-ZC7zxFuAvuGwKqHc, reason: not valid java name */
    public static /* synthetic */ boolean m20329$r8$lambda$gOgjaIdczZC7zxFuAvuGwKqHc(java.time.LocalDate localDate, java.time.LocalDate localDate2, long j) {
        java.time.LocalDate utcMillisToLocalDate = INSTANCE.utcMillisToLocalDate(j);
        return (utcMillisToLocalDate.isBefore(localDate) || utcMillisToLocalDate.isAfter(localDate2)) ? false : true;
    }
}
