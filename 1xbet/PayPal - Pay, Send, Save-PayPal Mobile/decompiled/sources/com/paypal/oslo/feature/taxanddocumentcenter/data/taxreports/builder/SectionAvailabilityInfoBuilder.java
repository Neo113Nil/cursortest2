package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SectionAvailabilityInfoBuilder;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/calculator/SectionExperienceCalculator;", "sectionExperienceCalculator", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/util/TaxReportDateUtil;", "dateUtil", "Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;", "countryConfig", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/calculator/SectionExperienceCalculator;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/util/TaxReportDateUtil;Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;)V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "section", "", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "countryCode", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionAvailabilityInfoDomain;", "build", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionAvailabilityInfoDomain;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/calculator/SectionExperienceCalculator;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/util/TaxReportDateUtil;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SectionAvailabilityInfoBuilder {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.SectionExperienceCalculator getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SectionAvailabilityInfoBuilder(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.SectionExperienceCalculator sectionExperienceCalculator, com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil taxReportDateUtil, com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig countryConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionExperienceCalculator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportDateUtil, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryConfig, "");
        this.getHighSpeedVideoSizes = sectionExperienceCalculator;
        this.Camera2StreamConfigurationMap = taxReportDateUtil;
        this.getHighSpeedVideoFpsRangesFor = countryConfig;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain build(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection section, java.lang.String year, java.lang.String countryCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(year, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType calculateSectionExperienceType$default = com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.SectionExperienceCalculator.calculateSectionExperienceType$default(this.getHighSpeedVideoSizes, section, year, countryCode, null, 8, null);
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor.getSectionWiseAvailabilityDate().get(section.getSectionTitle());
        if (str == null) {
            str = "";
        }
        int i = com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionAvailabilityInfoBuilder.WhenMappings.$EnumSwitchMapping$0[calculateSectionExperienceType$default.ordinal()];
        if (i == 1) {
            java.lang.String updatedAvailabilityDate = this.Camera2StreamConfigurationMap.getUpdatedAvailabilityDate(str, countryCode, this.getHighSpeedVideoFpsRangesFor);
            java.lang.String sectionAvailabilityMessageResourceKey = com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toSectionAvailabilityMessageResourceKey(calculateSectionExperienceType$default);
            return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain(calculateSectionExperienceType$default, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(sectionAvailabilityMessageResourceKey != null ? sectionAvailabilityMessageResourceKey : "", kotlin.collections.CollectionsKt.listOf(updatedAvailabilityDate)));
        }
        if (i == 2) {
            java.lang.String sectionAvailabilityMessageResourceKey2 = com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toSectionAvailabilityMessageResourceKey(calculateSectionExperienceType$default);
            return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain(calculateSectionExperienceType$default, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(sectionAvailabilityMessageResourceKey2 != null ? sectionAvailabilityMessageResourceKey2 : "", null, 2, null));
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain(calculateSectionExperienceType$default, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toNotEligibleMessageResourceKey(section), kotlin.collections.CollectionsKt.listOf(this.Camera2StreamConfigurationMap.getDisplayYear(year, countryCode))));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType.values().length];
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType.NOT_AVAILABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType.PENDING_REVIEW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType.NOT_ELIGIBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
