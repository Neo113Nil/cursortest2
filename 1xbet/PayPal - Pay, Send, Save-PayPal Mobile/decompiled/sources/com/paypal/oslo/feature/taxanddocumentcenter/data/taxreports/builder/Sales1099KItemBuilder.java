package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/Sales1099KItemBuilder;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportResourceCoordinator;", "resourceCoordinator", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/util/TaxReportDateUtil;", "dateUtil", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportResourceCoordinator;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/util/TaxReportDateUtil;)V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportDomain;", "report", "", "countryCode", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportItemDomain;", "buildItem", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportDomain;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportItemDomain;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportResourceCoordinator;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/util/TaxReportDateUtil;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Sales1099KItemBuilder {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public Sales1099KItemBuilder(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator taxReportResourceCoordinator, com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil taxReportDateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportResourceCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportDateUtil, "");
        this.getHighSpeedVideoSizes = taxReportResourceCoordinator;
        this.getHighSpeedVideoFpsRangesFor = taxReportDateUtil;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain buildItem(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain report, java.lang.String countryCode, java.lang.String year) {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain copy;
        kotlin.Pair pair;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain reportNoteDomain;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain copy2;
        java.lang.String formatCreatedTime;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(report, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(year, "");
        java.lang.String downloadId = report.getDownloadId();
        boolean z = downloadId == null || kotlin.text.StringsKt.isBlank(downloadId);
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toTitleResourceKey(report.getType()), null, 2, null);
        if (!z) {
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey2 = stringKey;
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey3 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toDescriptionResourceKey(report.getType()), null, 2, null);
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionDomain correction = report.getCorrection();
            java.lang.String deepLink = correction != null ? correction.getDeepLink() : null;
            if (deepLink == null) {
                deepLink = "";
            }
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey4 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey("feature_tax_and_document_center_link_self_correction", null, 2, null);
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain correctionFlowStatus = report.getCorrectionFlowStatus();
            int i = correctionFlowStatus == null ? -1 : com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.Sales1099KItemBuilder.WhenMappings.$EnumSwitchMapping$0[correctionFlowStatus.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    pair = kotlin.TuplesKt.to(null, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportLinkDomain(stringKey4, deepLink, "GET", new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain.DEEPLINK, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain.SELF_CORRECTION_1099K, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkDescriptionDomain(deepLink, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.HttpMethodDomain.GET), null, null, null, 56, null)));
                } else if (i == 2) {
                    pair = kotlin.TuplesKt.to(null, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportLinkDomain(stringKey4, "", "", new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain.GRAPHQL, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain.SELF_CORRECTION_1099K, null, null, null, null, 60, null)));
                } else if (i == 3) {
                    pair = kotlin.TuplesKt.to(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey("feature_tax_and_document_center_sales_1099k_self_correction_in_progress_text", null, 2, null), null, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain.SELF_CORRECTION_IN_PROGRESS, 2, null), null);
                } else if (i != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain reportNoteDomain2 = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain) pair.component1();
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportLinkDomain reportLinkDomain = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportLinkDomain) pair.component2();
                if (report.getMode() == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain.CORRECTION && report.getCreatedTime() != null) {
                    formatCreatedTime = this.getHighSpeedVideoFpsRangesFor.formatCreatedTime(report.getCreatedTime());
                    if (formatCreatedTime.length() > 0) {
                        reportNoteDomain = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey("feature_tax_and_document_center_updated_reports_note", kotlin.collections.CollectionsKt.listOf(formatCreatedTime)), null, null, 6, null);
                        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain[]{com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain.MANUAL_REVIEW, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain.PROCESSING_REPORT, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain.PROCESSING_FAILED});
                        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionDomain correction2 = report.getCorrection();
                        boolean contains = kotlin.collections.CollectionsKt.contains(listOf, correction2 != null ? correction2.getStatus() : null);
                        java.lang.String downloadId2 = report.getDownloadId();
                        copy2 = report.copy((r28 & 1) != 0 ? report.id : null, (r28 & 2) != 0 ? report.mode : null, (r28 & 4) != 0 ? report.status : null, (r28 & 8) != 0 ? report.type : null, (r28 & 16) != 0 ? report.name : null, (r28 & 32) != 0 ? report.createdTime : null, (r28 & 64) != 0 ? report.accountNumber : null, (r28 & 128) != 0 ? report.downloadId : null, (r28 & 256) != 0 ? report.correctionFlowStatus : null, (r28 & 512) != 0 ? report.correction : null, (r28 & 1024) != 0 ? report.inReview : contains, (r28 & 2048) != 0 ? report.reportStatus : com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus.DOWNLOADABLE, (r28 & 4096) != 0 ? report.cta : this.getHighSpeedVideoSizes.buildDownloadCta(downloadId2 != null ? downloadId2 : "", year));
                        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain(copy2, stringKey2, stringKey3, reportNoteDomain, null, reportLinkDomain, 16, null);
                    }
                }
                reportNoteDomain = reportNoteDomain2;
                java.util.List listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain[]{com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain.MANUAL_REVIEW, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain.PROCESSING_REPORT, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain.PROCESSING_FAILED});
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionDomain correction22 = report.getCorrection();
                boolean contains2 = kotlin.collections.CollectionsKt.contains(listOf2, correction22 != null ? correction22.getStatus() : null);
                java.lang.String downloadId22 = report.getDownloadId();
                copy2 = report.copy((r28 & 1) != 0 ? report.id : null, (r28 & 2) != 0 ? report.mode : null, (r28 & 4) != 0 ? report.status : null, (r28 & 8) != 0 ? report.type : null, (r28 & 16) != 0 ? report.name : null, (r28 & 32) != 0 ? report.createdTime : null, (r28 & 64) != 0 ? report.accountNumber : null, (r28 & 128) != 0 ? report.downloadId : null, (r28 & 256) != 0 ? report.correctionFlowStatus : null, (r28 & 512) != 0 ? report.correction : null, (r28 & 1024) != 0 ? report.inReview : contains2, (r28 & 2048) != 0 ? report.reportStatus : com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus.DOWNLOADABLE, (r28 & 4096) != 0 ? report.cta : this.getHighSpeedVideoSizes.buildDownloadCta(downloadId22 != null ? downloadId22 : "", year));
                return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain(copy2, stringKey2, stringKey3, reportNoteDomain, null, reportLinkDomain, 16, null);
            }
            pair = kotlin.TuplesKt.to(null, null);
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain reportNoteDomain22 = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain) pair.component1();
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportLinkDomain reportLinkDomain2 = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportLinkDomain) pair.component2();
            if (report.getMode() == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain.CORRECTION) {
                formatCreatedTime = this.getHighSpeedVideoFpsRangesFor.formatCreatedTime(report.getCreatedTime());
                if (formatCreatedTime.length() > 0) {
                }
            }
            reportNoteDomain = reportNoteDomain22;
            java.util.List listOf22 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain[]{com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain.MANUAL_REVIEW, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain.PROCESSING_REPORT, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain.PROCESSING_FAILED});
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionDomain correction222 = report.getCorrection();
            boolean contains22 = kotlin.collections.CollectionsKt.contains(listOf22, correction222 != null ? correction222.getStatus() : null);
            java.lang.String downloadId222 = report.getDownloadId();
            copy2 = report.copy((r28 & 1) != 0 ? report.id : null, (r28 & 2) != 0 ? report.mode : null, (r28 & 4) != 0 ? report.status : null, (r28 & 8) != 0 ? report.type : null, (r28 & 16) != 0 ? report.name : null, (r28 & 32) != 0 ? report.createdTime : null, (r28 & 64) != 0 ? report.accountNumber : null, (r28 & 128) != 0 ? report.downloadId : null, (r28 & 256) != 0 ? report.correctionFlowStatus : null, (r28 & 512) != 0 ? report.correction : null, (r28 & 1024) != 0 ? report.inReview : contains22, (r28 & 2048) != 0 ? report.reportStatus : com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus.DOWNLOADABLE, (r28 & 4096) != 0 ? report.cta : this.getHighSpeedVideoSizes.buildDownloadCta(downloadId222 != null ? downloadId222 : "", year));
            return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain(copy2, stringKey2, stringKey3, reportNoteDomain, null, reportLinkDomain2, 16, null);
        }
        kotlin.Pair<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType, java.lang.String> calculateExperienceAndAvailabilityDate = this.getHighSpeedVideoSizes.calculateExperienceAndAvailabilityDate(report.getType(), year, countryCode, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES);
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource descriptionResource = this.getHighSpeedVideoSizes.getReportItemBuilder().getDescriptionResource(report.getType(), false, calculateExperienceAndAvailabilityDate.component1(), calculateExperienceAndAvailabilityDate.component2());
        copy = report.copy((r28 & 1) != 0 ? report.id : null, (r28 & 2) != 0 ? report.mode : null, (r28 & 4) != 0 ? report.status : null, (r28 & 8) != 0 ? report.type : null, (r28 & 16) != 0 ? report.name : null, (r28 & 32) != 0 ? report.createdTime : null, (r28 & 64) != 0 ? report.accountNumber : null, (r28 & 128) != 0 ? report.downloadId : null, (r28 & 256) != 0 ? report.correctionFlowStatus : null, (r28 & 512) != 0 ? report.correction : null, (r28 & 1024) != 0 ? report.inReview : false, (r28 & 2048) != 0 ? report.reportStatus : com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus.INPROGRESS, (r28 & 4096) != 0 ? report.cta : null);
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain(copy, stringKey, descriptionResource, null, this.getHighSpeedVideoSizes.getReportItemBuilder().buildNotAvailableInlineNote(), null, 40, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain.values().length];
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain.ACTION_REQUIRED_RESUME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain.ACTION_REQUIRED_NEW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain.IN_PROGRESS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain.NOT_AVAILABLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
