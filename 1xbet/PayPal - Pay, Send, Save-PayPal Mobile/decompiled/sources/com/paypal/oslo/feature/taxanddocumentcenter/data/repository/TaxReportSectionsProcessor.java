package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JG\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00060\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/repository/TaxReportSectionsProcessor;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportSectionBuilder;", "taxReportSectionBuilder", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportSectionBuilder;)V", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportDomain;", "reports", "", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "countryCode", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;", "error", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSectionDomain;", "buildSectionsWithError", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;)Larrow/core/Ior;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportSectionBuilder;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportSectionsProcessor {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportSectionBuilder getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public TaxReportSectionsProcessor(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportSectionBuilder taxReportSectionBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportSectionBuilder, "");
        this.getHighResolutionOutputSizeshNQ4ISI = taxReportSectionBuilder;
    }

    public final arrow.core.Ior<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain>> buildSectionsWithError(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain> reports, java.lang.String year, java.lang.String countryCode, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reports, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(year, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        if (error instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.SectionError) {
            return new arrow.core.Ior.Both(error, this.getHighResolutionOutputSizeshNQ4ISI.buildSectionsWithErrorHandling(reports, year, countryCode, error));
        }
        if (error == null) {
            return new arrow.core.Ior.Right(this.getHighResolutionOutputSizeshNQ4ISI.buildAllSections(reports, year, countryCode));
        }
        if (!reports.isEmpty()) {
            return new arrow.core.Ior.Both(error, this.getHighResolutionOutputSizeshNQ4ISI.buildAllSections(reports, year, countryCode));
        }
        return new arrow.core.Ior.Left(error);
    }
}
