package com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetTaxReportsUseCase;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/repository/TaxReportsRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/repository/TaxReportsRepository;)V", "", "fiscalYear", "countryCode", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSectionDomain;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/repository/TaxReportsRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetTaxReportsUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReportsRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetTaxReportsUseCase(com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReportsRepository taxReportsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportsRepository, "");
        this.getHighSpeedVideoSizes = taxReportsRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError, ? extends java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain>>> continuation) {
        return this.getHighSpeedVideoSizes.getTaxReportSections(str, str2, continuation);
    }
}
