package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b \u0010!J=\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J?\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120&¢\u0006\u0004\b(\u0010)J1\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b*\u0010+JA\u00100\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00142\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u00172\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120&H\u0002¢\u0006\u0004\b0\u0010)J\u0017\u00102\u001a\u0002012\u0006\u0010,\u001a\u00020\u0012H\u0002¢\u0006\u0004\b2\u00103R\u0014\u00105\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00104R\u0014\u00100\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00102\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u00107\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010=\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010@"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportSectionBuilder;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportResourceCoordinator;", "resourceCoordinator", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SalesSectionItemBuilder;", "salesSectionItemBuilder", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SavingsSectionItemBuilder;", "savingsSectionItemBuilder", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/GenericReportItemBuilder;", "genericReportItemBuilder", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/YearInReviewItemBuilder;", "yearInReviewItemBuilder", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SectionReportSorter;", "sectionReportSorter", "Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;", "countryConfig", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportResourceCoordinator;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SalesSectionItemBuilder;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SavingsSectionItemBuilder;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/GenericReportItemBuilder;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/YearInReviewItemBuilder;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SectionReportSorter;Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;)V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "section", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportDomain;", "reports", "", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "countryCode", "", "hasSectionError", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSectionDomain;", "buildSection", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSectionDomain;", "allReports", "buildYearInReviewSection", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSectionDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;", "error", "buildSectionsWithErrorHandling", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;)Ljava/util/List;", "", "affectedSections", "buildSectionsWithPartialData", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ljava/util/List;", "buildAllSections", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "p0", "p1", "p2", "p3", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionToolTipInfoDomain;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionToolTipInfoDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportResourceCoordinator;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SalesSectionItemBuilder;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SavingsSectionItemBuilder;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/GenericReportItemBuilder;", "getOutputFormats", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/YearInReviewItemBuilder;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SectionReportSorter;", "getInputFormats", "Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportSectionBuilder {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.GenericReportItemBuilder getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SavingsSectionItemBuilder Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesSectionItemBuilder getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.YearInReviewItemBuilder getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionReportSorter getInputFormats;

    @javax.inject.Inject
    public TaxReportSectionBuilder(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator taxReportResourceCoordinator, com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesSectionItemBuilder salesSectionItemBuilder, com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SavingsSectionItemBuilder savingsSectionItemBuilder, com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.GenericReportItemBuilder genericReportItemBuilder, com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.YearInReviewItemBuilder yearInReviewItemBuilder, com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionReportSorter sectionReportSorter, com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig countryConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportResourceCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(salesSectionItemBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsSectionItemBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(genericReportItemBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearInReviewItemBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionReportSorter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryConfig, "");
        this.getHighSpeedVideoSizes = taxReportResourceCoordinator;
        this.getHighSpeedVideoFpsRanges = salesSectionItemBuilder;
        this.Camera2StreamConfigurationMap = savingsSectionItemBuilder;
        this.getHighResolutionOutputSizeshNQ4ISI = genericReportItemBuilder;
        this.getHighSpeedVideoFpsRangesFor = yearInReviewItemBuilder;
        this.getInputFormats = sectionReportSorter;
        this.getOutputMinFrameDuration = countryConfig;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain buildSection$default(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportSectionBuilder taxReportSectionBuilder, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection, java.util.List list, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return taxReportSectionBuilder.buildSection(taxReportSection, list, str, str2, z);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain buildSection(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection section, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain> reports, java.lang.String year, java.lang.String countryCode, boolean hasSectionError) {
        java.util.ArrayList buildItems;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reports, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(year, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        if (hasSectionError) {
            return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain(section, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toTitleResourceKey(section), null, 2, null), kotlin.collections.CollectionsKt.emptyList(), null, getHighResolutionOutputSizeshNQ4ISI(section), true, year);
        }
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain> sortReportsForSection = this.getInputFormats.sortReportsForSection(section, reports);
        if (com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportValidationUtilsKt.shouldShowAvailabilityBanner(sortReportsForSection)) {
            return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain(section, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toTitleResourceKey(section), null, 2, null), kotlin.collections.CollectionsKt.emptyList(), this.getHighSpeedVideoSizes.getAvailabilityInfoBuilder().build(section, year, countryCode), getHighResolutionOutputSizeshNQ4ISI(section), false, year);
        }
        int i = com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportSectionBuilder.WhenMappings.$EnumSwitchMapping$0[section.ordinal()];
        if (i == 1) {
            buildItems = this.Camera2StreamConfigurationMap.buildItems(sortReportsForSection, year);
        } else if (i == 2) {
            java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain> list = sortReportsForSection;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(this.getHighSpeedVideoFpsRanges.buildItem((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain) it.next(), countryCode, year));
            }
            buildItems = arrayList;
        } else {
            if (i != 3 && i != 4) {
                if (i != 5) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                throw new java.lang.IllegalStateException("Year in Review section should not be processed through buildSectionItems(). Use buildYearInReviewSection() instead as it requires all reports across sections.".toString());
            }
            java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain> list2 = sortReportsForSection;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(this.getHighResolutionOutputSizeshNQ4ISI.buildItem((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain) it2.next(), countryCode, year, section));
            }
            buildItems = arrayList2;
        }
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain(section, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toTitleResourceKey(section), null, 2, null), buildItems, null, getHighResolutionOutputSizeshNQ4ISI(section), false, year);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain buildYearInReviewSection(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain> allReports, java.lang.String year) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allReports, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(year, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.YEAR_IN_REVIEW, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toTitleResourceKey(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.YEAR_IN_REVIEW), null, 2, null), kotlin.collections.CollectionsKt.listOf(this.getHighSpeedVideoFpsRangesFor.buildItem(allReports, year)), null, null, false, year);
    }

    public static /* synthetic */ java.util.List buildSectionsWithErrorHandling$default(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportSectionBuilder taxReportSectionBuilder, java.util.List list, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            taxDocumentCenterError = null;
        }
        return taxReportSectionBuilder.buildSectionsWithErrorHandling(list, str, str2, taxDocumentCenterError);
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain> buildSectionsWithErrorHandling(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain> allReports, java.lang.String year, java.lang.String countryCode, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allReports, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(year, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        if (error instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.SectionError) {
            return buildSectionsWithPartialData(allReports, year, countryCode, kotlin.collections.CollectionsKt.toSet(((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.SectionError) error).getAffectedSections()));
        }
        return buildAllSections(allReports, year, countryCode);
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain> buildSectionsWithPartialData(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain> allReports, java.lang.String year, java.lang.String countryCode, java.util.Set<? extends com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection> affectedSections) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allReports, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(year, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affectedSections, "");
        return getHighSpeedVideoFpsRanges(allReports, year, countryCode, affectedSections);
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain> buildAllSections(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain> allReports, java.lang.String year, java.lang.String countryCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allReports, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(year, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        return getHighSpeedVideoFpsRanges(allReports, year, countryCode, kotlin.collections.SetsKt.emptySet());
    }

    private final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain> getHighSpeedVideoFpsRanges(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain> p0, java.lang.String p1, java.lang.String p2, java.util.Set<? extends com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection> p3) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.getOutputMinFrameDuration.isYearInReview() && !p0.isEmpty()) {
            java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain> list = p0;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.String downloadId = ((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain) it.next()).getDownloadId();
                    if (downloadId != null && !kotlin.text.StringsKt.isBlank(downloadId)) {
                        arrayList.add(buildYearInReviewSection(p0, p1));
                        break;
                    }
                }
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj2 : p0) {
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection section = com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportExtensionsKt.toSection(((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain) obj2).getType());
            java.lang.Object obj3 = linkedHashMap.get(section);
            if (obj3 == null) {
                obj3 = (java.util.List) new java.util.ArrayList();
                linkedHashMap.put(section, obj3);
            }
            ((java.util.List) obj3).add(obj2);
        }
        java.util.List<java.lang.String> taxDocumentSectionOrder = this.getOutputMinFrameDuration.getTaxDocumentSectionOrder();
        java.util.ArrayList<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection> arrayList2 = new java.util.ArrayList();
        for (java.lang.String str : taxDocumentSectionOrder) {
            java.util.Iterator<E> it2 = com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection) obj).getSectionTitle(), str)) {
                    break;
                }
            }
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection) obj;
            if (taxReportSection != null) {
                arrayList2.add(taxReportSection);
            }
        }
        for (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection2 : arrayList2) {
            java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain> list2 = (java.util.List) linkedHashMap.get(taxReportSection2);
            if (list2 == null) {
                list2 = kotlin.collections.CollectionsKt.emptyList();
            }
            arrayList.add(buildSection(taxReportSection2, list2, p1, p2, p3.contains(taxReportSection2)));
        }
        return arrayList;
    }

    private static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionToolTipInfoDomain getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection p0) {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey;
        if (p0 == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.SAVINGS) {
            stringKey = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toTooltipResourceKey(p0), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.MINIMUM_SAVINGS_INTEREST_AMOUNT));
        } else {
            stringKey = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toTooltipResourceKey(p0), null, 2, null);
        }
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionToolTipInfoDomain(stringKey);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.values().length];
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.SAVINGS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.CRYPTO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.REWARDS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.YEAR_IN_REVIEW.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
