package com.paypal.oslo.feature.taxanddocumentcenter.domain.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;", "", "toErrorMessage", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxDocumentCenterErrorKt {
    public static final java.lang.String toErrorMessage(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxDocumentCenterError, "");
        return taxDocumentCenterError instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.ServerError ? ((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.ServerError) taxDocumentCenterError).getMessage() : taxDocumentCenterError instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.SectionError ? ((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.SectionError) taxDocumentCenterError).getMessage() : "";
    }
}
