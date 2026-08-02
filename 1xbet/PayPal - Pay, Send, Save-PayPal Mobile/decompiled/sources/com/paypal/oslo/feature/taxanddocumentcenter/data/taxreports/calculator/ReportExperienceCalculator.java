package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/calculator/ReportExperienceCalculator;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/util/TaxReportDateUtil;", "dateUtil", "Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;", "countryConfig", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/data/util/TaxReportDateUtil;Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;)V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTypeDomain;", "reportType", "", "requestedYear", "countryCode", "Ljava/time/LocalDate;", "currentDate", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ExperienceType;", "calculateReportExperienceType", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTypeDomain;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ExperienceType;", "availabilityDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;Ljava/time/LocalDate;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ExperienceType;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/util/TaxReportDateUtil;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReportExperienceCalculator {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;
    private static final java.time.format.DateTimeFormatter getHighResolutionOutputSizeshNQ4ISI = java.time.format.DateTimeFormatter.ofPattern("MMMM dd, yyyy", java.util.Locale.ENGLISH);

    @javax.inject.Inject
    public ReportExperienceCalculator(com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil taxReportDateUtil, com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig countryConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportDateUtil, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryConfig, "");
        this.getHighSpeedVideoFpsRangesFor = taxReportDateUtil;
        this.getHighSpeedVideoFpsRanges = countryConfig;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType calculateReportExperienceType$default(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.ReportExperienceCalculator reportExperienceCalculator, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain taxReportTypeDomain, java.lang.String str, java.lang.String str2, java.time.LocalDate localDate, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            localDate = java.time.LocalDate.now();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localDate, "");
        }
        return reportExperienceCalculator.calculateReportExperienceType(taxReportTypeDomain, str, str2, localDate);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType calculateReportExperienceType(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain reportType, java.lang.String requestedYear, java.lang.String countryCode, java.time.LocalDate currentDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestedYear, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentDate, "");
        java.lang.String str = this.getHighSpeedVideoFpsRanges.getSectionWiseAvailabilityDate().get(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportExtensionsKt.toSection(reportType).getSectionTitle());
        return calculateReportExperienceType(str == null ? "" : str, requestedYear, countryCode, this.getHighSpeedVideoFpsRanges, currentDate);
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType calculateReportExperienceType$default(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.ReportExperienceCalculator reportExperienceCalculator, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig countryConfig, java.time.LocalDate localDate, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            localDate = java.time.LocalDate.now();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localDate, "");
        }
        return reportExperienceCalculator.calculateReportExperienceType(str, str2, str3, countryConfig, localDate);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType calculateReportExperienceType(java.lang.String availabilityDate, java.lang.String requestedYear, java.lang.String countryCode, com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig countryConfig, java.time.LocalDate currentDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availabilityDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestedYear, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentDate, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor.getCurrentFinancialYear(countryConfig, currentDate), requestedYear)) {
            java.time.LocalDate parse = java.time.LocalDate.parse(this.getHighSpeedVideoFpsRangesFor.getUpdatedAvailabilityDate(availabilityDate, countryCode, countryConfig), getHighResolutionOutputSizeshNQ4ISI);
            if (currentDate.isBefore(parse) || currentDate.isEqual(parse)) {
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType.NOT_AVAILABLE;
            }
        }
        return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType.PENDING_REVIEW;
    }
}
