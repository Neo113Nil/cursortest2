package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d2\u0006\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportResourceCoordinator;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/ReportItemBuilder;", "reportItemBuilder", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SectionAvailabilityInfoBuilder;", "availabilityInfoBuilder", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/calculator/ReportExperienceCalculator;", "reportExperienceCalculator", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/util/TaxReportDateUtil;", "dateUtil", "Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;", "countryConfig", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/ReportItemBuilder;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SectionAvailabilityInfoBuilder;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/calculator/ReportExperienceCalculator;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/util/TaxReportDateUtil;Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;)V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTypeDomain;", "reportType", "", "requestedYear", "countryCode", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "section", "Lkotlin/Pair;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ExperienceType;", "calculateExperienceAndAvailabilityDate", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTypeDomain;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;)Lkotlin/Pair;", "downloadId", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "buildDownloadUrl", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "downloadIds", "buildDownloadAllUrl", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCtaDomain;", "buildDownloadCta", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCtaDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/ReportItemBuilder;", "getReportItemBuilder", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/ReportItemBuilder;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SectionAvailabilityInfoBuilder;", "getAvailabilityInfoBuilder", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SectionAvailabilityInfoBuilder;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/calculator/ReportExperienceCalculator;", "getReportExperienceCalculator", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/calculator/ReportExperienceCalculator;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/util/TaxReportDateUtil;", "getDateUtil", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/data/util/TaxReportDateUtil;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;", "getCountryConfig", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportResourceCoordinator {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionAvailabilityInfoBuilder availabilityInfoBuilder;
    private final com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig countryConfig;
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil dateUtil;
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.ReportExperienceCalculator reportExperienceCalculator;
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.ReportItemBuilder reportItemBuilder;

    @javax.inject.Inject
    public TaxReportResourceCoordinator(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.ReportItemBuilder reportItemBuilder, com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionAvailabilityInfoBuilder sectionAvailabilityInfoBuilder, com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.ReportExperienceCalculator reportExperienceCalculator, com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil taxReportDateUtil, com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig countryConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportItemBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionAvailabilityInfoBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportExperienceCalculator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportDateUtil, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryConfig, "");
        this.reportItemBuilder = reportItemBuilder;
        this.availabilityInfoBuilder = sectionAvailabilityInfoBuilder;
        this.reportExperienceCalculator = reportExperienceCalculator;
        this.dateUtil = taxReportDateUtil;
        this.countryConfig = countryConfig;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.ReportItemBuilder getReportItemBuilder() {
        return this.reportItemBuilder;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionAvailabilityInfoBuilder getAvailabilityInfoBuilder() {
        return this.availabilityInfoBuilder;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.ReportExperienceCalculator getReportExperienceCalculator() {
        return this.reportExperienceCalculator;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil getDateUtil() {
        return this.dateUtil;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig getCountryConfig() {
        return this.countryConfig;
    }

    public final kotlin.Pair<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType, java.lang.String> calculateExperienceAndAvailabilityDate(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain reportType, java.lang.String requestedYear, java.lang.String countryCode, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection section) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestedYear, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType calculateReportExperienceType$default = com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.ReportExperienceCalculator.calculateReportExperienceType$default(this.reportExperienceCalculator, reportType, requestedYear, countryCode, null, 8, null);
        if (calculateReportExperienceType$default == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType.NOT_AVAILABLE) {
            java.lang.String str2 = this.countryConfig.getSectionWiseAvailabilityDate().get(section.getSectionTitle());
            str = this.dateUtil.getUpdatedAvailabilityDate(str2 != null ? str2 : "", countryCode, this.countryConfig);
        } else {
            str = null;
        }
        return kotlin.TuplesKt.to(calculateReportExperienceType$default, str);
    }

    public final java.lang.String buildDownloadUrl(java.lang.String downloadId, java.lang.String year) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(year, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("/v1/customer/tax-reports?report_ids=");
        sb.append(downloadId);
        sb.append("&year=");
        sb.append(year);
        return sb.toString();
    }

    public final java.lang.String buildDownloadAllUrl(java.util.List<java.lang.String> downloadIds, java.lang.String year) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadIds, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(year, "");
        if (downloadIds.isEmpty()) {
            return "/v1/customer/tax-reports?year=".concat(java.lang.String.valueOf(year));
        }
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(downloadIds, "&", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator.$r8$lambda$eh9At4u4vEPOFvUG_DZQSty1Y4k((java.lang.String) obj);
            }
        }, 30, null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("/v1/customer/tax-reports?");
        sb.append(joinToString$default);
        sb.append("&year=");
        sb.append(year);
        return sb.toString();
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain buildDownloadCta(java.lang.String downloadId, java.lang.String year) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(year, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain.DOWNLOAD, null, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkDescriptionDomain(buildDownloadUrl(downloadId, year), com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain.GET), null, null, null, 58, null);
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$eh9At4u4vEPOFvUG_DZQSty1Y4k(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return "report_ids=".concat(java.lang.String.valueOf(str));
    }
}
