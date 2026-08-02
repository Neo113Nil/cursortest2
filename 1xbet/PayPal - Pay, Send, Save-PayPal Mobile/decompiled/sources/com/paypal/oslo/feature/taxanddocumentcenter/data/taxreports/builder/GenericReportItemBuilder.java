package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/GenericReportItemBuilder;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportResourceCoordinator;", "resourceCoordinator", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportResourceCoordinator;)V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportDomain;", "report", "", "countryCode", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "section", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportItemDomain;", "buildItem", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportDomain;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportItemDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTypeDomain;", "p0", "p1", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTypeDomain;Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportResourceCoordinator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GenericReportItemBuilder {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GenericReportItemBuilder(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator taxReportResourceCoordinator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportResourceCoordinator, "");
        this.getHighResolutionOutputSizeshNQ4ISI = taxReportResourceCoordinator;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain buildItem(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain report, java.lang.String countryCode, java.lang.String year, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection section) {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource highSpeedVideoSizes;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain copy;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain copy2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(report, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(year, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        java.lang.String downloadId = report.getDownloadId();
        boolean z = downloadId == null || kotlin.text.StringsKt.isBlank(downloadId);
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toTitleResourceKey(report.getType()), null, 2, null);
        if (!z) {
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource highSpeedVideoSizes2 = getHighSpeedVideoSizes(report.getType(), year);
            java.lang.String downloadId2 = report.getDownloadId();
            copy2 = report.copy((r28 & 1) != 0 ? report.id : null, (r28 & 2) != 0 ? report.mode : null, (r28 & 4) != 0 ? report.status : null, (r28 & 8) != 0 ? report.type : null, (r28 & 16) != 0 ? report.name : null, (r28 & 32) != 0 ? report.createdTime : null, (r28 & 64) != 0 ? report.accountNumber : null, (r28 & 128) != 0 ? report.downloadId : null, (r28 & 256) != 0 ? report.correctionFlowStatus : null, (r28 & 512) != 0 ? report.correction : null, (r28 & 1024) != 0 ? report.inReview : false, (r28 & 2048) != 0 ? report.reportStatus : com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus.DOWNLOADABLE, (r28 & 4096) != 0 ? report.cta : this.getHighResolutionOutputSizeshNQ4ISI.buildDownloadCta(downloadId2 != null ? downloadId2 : "", year));
            return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain(copy2, stringKey, highSpeedVideoSizes2, null, null, null, 56, null);
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain type = report.getType();
        if (type == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_1099K) {
            kotlin.Pair<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType, java.lang.String> calculateExperienceAndAvailabilityDate = this.getHighResolutionOutputSizeshNQ4ISI.calculateExperienceAndAvailabilityDate(type, year, countryCode, section);
            highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getReportItemBuilder().getDescriptionResource(type, false, calculateExperienceAndAvailabilityDate.component1(), calculateExperienceAndAvailabilityDate.component2());
        } else {
            highSpeedVideoSizes = getHighSpeedVideoSizes(type, year);
        }
        copy = report.copy((r28 & 1) != 0 ? report.id : null, (r28 & 2) != 0 ? report.mode : null, (r28 & 4) != 0 ? report.status : null, (r28 & 8) != 0 ? report.type : null, (r28 & 16) != 0 ? report.name : null, (r28 & 32) != 0 ? report.createdTime : null, (r28 & 64) != 0 ? report.accountNumber : null, (r28 & 128) != 0 ? report.downloadId : null, (r28 & 256) != 0 ? report.correctionFlowStatus : null, (r28 & 512) != 0 ? report.correction : null, (r28 & 1024) != 0 ? report.inReview : false, (r28 & 2048) != 0 ? report.reportStatus : com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus.INPROGRESS, (r28 & 4096) != 0 ? report.cta : null);
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain(copy, stringKey, highSpeedVideoSizes, null, this.getHighResolutionOutputSizeshNQ4ISI.getReportItemBuilder().buildNotAvailableInlineNote(), null, 40, null);
    }

    private static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getHighSpeedVideoSizes(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain p0, java.lang.String p1) {
        int i = com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.GenericReportItemBuilder.WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toDescriptionResourceKey(p0), kotlin.collections.CollectionsKt.listOf(p1));
        }
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toDescriptionResourceKey(p0), null, 2, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.values().length];
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_1099_DA.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_TRANSACTIONS_STATEMENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SAVINGS_1099_INT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
