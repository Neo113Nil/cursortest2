package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SalesTransactionStatementItemBuilder;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportResourceCoordinator;", "resourceCoordinator", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportResourceCoordinator;)V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportDomain;", "report", "", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportItemDomain;", "buildItem", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportDomain;Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportItemDomain;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportResourceCoordinator;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SalesTransactionStatementItemBuilder {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public SalesTransactionStatementItemBuilder(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator taxReportResourceCoordinator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportResourceCoordinator, "");
        this.getHighSpeedVideoFpsRangesFor = taxReportResourceCoordinator;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain buildItem(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain report, java.lang.String year) {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain taxReportCtaDomain;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain copy;
        int i;
        ?? r7;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain reportNoteDomain;
        boolean z;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain reportNoteDomain2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(report, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(year, "");
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toTitleResourceKey(report.getType()), null, 2, null);
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toDescriptionResourceKey(report.getType()), kotlin.collections.CollectionsKt.listOf(year));
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain status = report.getStatus();
        int i2 = status == null ? -1 : com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesTransactionStatementItemBuilder.WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i2 == 1) {
            reportStatus = com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus.DOWNLOADABLE;
        } else if (i2 == 2 || i2 == 3) {
            reportStatus = com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus.INPROGRESS;
        } else if (i2 == 4) {
            reportStatus = com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus.RECON_REQUEST_AVAILABLE;
        } else {
            reportStatus = com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus.INPROGRESS;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus2 = reportStatus;
        if (report.getStatus() == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain.GENERATED) {
            java.lang.String downloadId = report.getDownloadId();
            if (downloadId == null) {
                downloadId = "";
            }
            taxReportCtaDomain = this.getHighSpeedVideoFpsRangesFor.buildDownloadCta(downloadId, year);
        } else {
            taxReportCtaDomain = null;
        }
        copy = report.copy((r28 & 1) != 0 ? report.id : null, (r28 & 2) != 0 ? report.mode : null, (r28 & 4) != 0 ? report.status : null, (r28 & 8) != 0 ? report.type : null, (r28 & 16) != 0 ? report.name : null, (r28 & 32) != 0 ? report.createdTime : null, (r28 & 64) != 0 ? report.accountNumber : null, (r28 & 128) != 0 ? report.downloadId : null, (r28 & 256) != 0 ? report.correctionFlowStatus : null, (r28 & 512) != 0 ? report.correction : null, (r28 & 1024) != 0 ? report.inReview : false, (r28 & 2048) != 0 ? report.reportStatus : reportStatus2, (r28 & 4096) != 0 ? report.cta : taxReportCtaDomain);
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey3 = stringKey;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey4 = stringKey2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain status2 = report.getStatus();
        int i3 = status2 == null ? -1 : com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesTransactionStatementItemBuilder.WhenMappings.$EnumSwitchMapping$0[status2.ordinal()];
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                i = 4;
                if (i3 != 4) {
                    z = false;
                    reportNoteDomain2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey("feature_tax_and_document_center_sales_transaction_statement_in_progress_text", null, 2, null), null, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain.RECON_REQUEST_INPROGRESS, 2, null);
                }
            } else {
                i = 4;
                z = false;
                reportNoteDomain2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey("feature_tax_and_document_center_sales_transaction_statement_not_available_yet_text", null, 2, null), null, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain.RECON_UNAVAILABLE, 2, null);
            }
            reportNoteDomain = reportNoteDomain2;
            r7 = z;
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain status3 = report.getStatus();
            int i4 = status3 != null ? com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesTransactionStatementItemBuilder.WhenMappings.$EnumSwitchMapping$0[status3.ordinal()] : -1;
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain buildNotAvailableInlineNote = (i4 != 1 || i4 == i) ? r7 : this.getHighSpeedVideoFpsRangesFor.getReportItemBuilder().buildNotAvailableInlineNote();
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain status4 = report.getStatus();
            return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain(copy, stringKey3, stringKey4, reportNoteDomain, buildNotAvailableInlineNote, (status4 != null && com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesTransactionStatementItemBuilder.WhenMappings.$EnumSwitchMapping$0[status4.ordinal()] == i) ? new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportLinkDomain(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey("feature_tax_and_document_center_link_request_transaction_statement", r7, 2, r7), "", "", new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain.HALF_SHEET, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain.REQUEST_STATEMENT, null, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain.RECON, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetDataDomain(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey("feature_tax_and_document_center_request_statement_title", r7, 2, r7), null, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey("feature_tax_and_document_center_request_statement_description", r7, 2, r7), new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ButtonDomain(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey("feature_tax_and_document_center_request_statement_primary_button_text", r7, 2, r7), null, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain.GRAPHQL, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain.REQUEST_TRANSACTION_STATEMENT, null, null, null, null, 60, null), 2, null), null, 2, null), null, 36, null)) : r7);
        }
        i = 4;
        r7 = 0;
        reportNoteDomain = null;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain status32 = report.getStatus();
        int i42 = status32 != null ? com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesTransactionStatementItemBuilder.WhenMappings.$EnumSwitchMapping$0[status32.ordinal()] : -1;
        if (i42 != 1) {
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain status42 = report.getStatus();
        if (status42 != null) {
            return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain(copy, stringKey3, stringKey4, reportNoteDomain, buildNotAvailableInlineNote, (status42 != null && com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesTransactionStatementItemBuilder.WhenMappings.$EnumSwitchMapping$0[status42.ordinal()] == i) ? new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportLinkDomain(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey("feature_tax_and_document_center_link_request_transaction_statement", r7, 2, r7), "", "", new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain.HALF_SHEET, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain.REQUEST_STATEMENT, null, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain.RECON, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetDataDomain(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey("feature_tax_and_document_center_request_statement_title", r7, 2, r7), null, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey("feature_tax_and_document_center_request_statement_description", r7, 2, r7), new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ButtonDomain(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey("feature_tax_and_document_center_request_statement_primary_button_text", r7, 2, r7), null, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain.GRAPHQL, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain.REQUEST_TRANSACTION_STATEMENT, null, null, null, null, 60, null), 2, null), null, 2, null), null, 36, null)) : r7);
        }
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain(copy, stringKey3, stringKey4, reportNoteDomain, buildNotAvailableInlineNote, (status42 != null && com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesTransactionStatementItemBuilder.WhenMappings.$EnumSwitchMapping$0[status42.ordinal()] == i) ? new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportLinkDomain(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey("feature_tax_and_document_center_link_request_transaction_statement", r7, 2, r7), "", "", new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain.HALF_SHEET, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain.REQUEST_STATEMENT, null, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain.RECON, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetDataDomain(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey("feature_tax_and_document_center_request_statement_title", r7, 2, r7), null, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey("feature_tax_and_document_center_request_statement_description", r7, 2, r7), new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ButtonDomain(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey("feature_tax_and_document_center_request_statement_primary_button_text", r7, 2, r7), null, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain.GRAPHQL, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain.REQUEST_TRANSACTION_STATEMENT, null, null, null, null, 60, null), 2, null), null, 2, null), null, 36, null)) : r7);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain.values().length];
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain.GENERATED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain.DEPENDENT_REPORT_NOT_READY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain.UNAVAILABLE_NO_ACTION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain.GENERATION_ON_ACTION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
