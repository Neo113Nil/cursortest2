package com.paypal.oslo.feature.taxanddocumentcenter.data.util;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/util/TaxReportDateUtil;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;", "countryConfig", "Ljava/time/LocalDate;", "currentDate", "", "getCurrentFinancialYear", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;Ljava/time/LocalDate;)Ljava/lang/String;", "availabilityDate", "countryCode", "getUpdatedAvailabilityDate", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;)Ljava/lang/String;", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "getDisplayYear", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "createdTime", "formatCreatedTime", "(Ljava/lang/String;)Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportDateUtil {
    public static final int $stable = 0;
    private static final java.time.format.DateTimeFormatter Camera2StreamConfigurationMap = java.time.format.DateTimeFormatter.ofPattern("MMM dd, yyyy", java.util.Locale.ENGLISH);

    @javax.inject.Inject
    public TaxReportDateUtil() {
    }

    public static /* synthetic */ java.lang.String getCurrentFinancialYear$default(com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil taxReportDateUtil, com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig countryConfig, java.time.LocalDate localDate, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            localDate = java.time.LocalDate.now();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localDate, "");
        }
        return taxReportDateUtil.getCurrentFinancialYear(countryConfig, localDate);
    }

    public final java.lang.String getCurrentFinancialYear(com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig countryConfig, java.time.LocalDate currentDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentDate, "");
        int financialYearEndingMonth = countryConfig.getFinancialYearEndingMonth();
        int financialYearEndingDate = countryConfig.getFinancialYearEndingDate();
        int year = currentDate.getYear();
        int monthValue = currentDate.getMonthValue();
        int dayOfMonth = currentDate.getDayOfMonth();
        if (financialYearEndingMonth > monthValue || (financialYearEndingMonth == monthValue && financialYearEndingDate >= dayOfMonth)) {
            year--;
        }
        return java.lang.String.valueOf(year);
    }

    public final java.lang.String getUpdatedAvailabilityDate(java.lang.String availabilityDate, java.lang.String countryCode, com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig countryConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availabilityDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryConfig, "");
        int parseInt = java.lang.Integer.parseInt(getCurrentFinancialYear$default(this, countryConfig, null, 2, null));
        if (kotlin.text.StringsKt.equals(countryCode, "US", true)) {
            parseInt++;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(availabilityDate);
        sb.append(", ");
        sb.append(parseInt);
        return sb.toString();
    }

    public final java.lang.String getDisplayYear(java.lang.String year, java.lang.String countryCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(year, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        if (!kotlin.text.StringsKt.equals(countryCode, "GB", true) && !kotlin.text.StringsKt.equals(countryCode, "UK", true)) {
            return year;
        }
        int parseInt = java.lang.Integer.parseInt(year);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(parseInt - 1);
        sb.append("-");
        sb.append(year);
        return sb.toString();
    }

    public final java.lang.String formatCreatedTime(java.lang.String createdTime) {
        java.lang.String str = createdTime;
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            return "";
        }
        try {
            java.lang.String format = java.time.OffsetDateTime.parse(createdTime).format(Camera2StreamConfigurationMap);
            kotlin.jvm.internal.Intrinsics.checkNotNull(format);
            return format;
        } catch (java.time.format.DateTimeParseException e) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Failed to parse createdTime", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("input", createdTime), kotlin.TuplesKt.to("exception", e.toString())), null, 4, null);
            return "";
        }
    }
}
