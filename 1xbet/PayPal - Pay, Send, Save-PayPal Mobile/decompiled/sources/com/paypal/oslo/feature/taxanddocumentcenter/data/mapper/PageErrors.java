package com.paypal.oslo.feature.taxanddocumentcenter.data.mapper;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/PageErrors;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;", "reportError", "faqError", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;", "component2", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;)Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/PageErrors;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;", "getReportError", "getFaqError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PageErrors {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError faqError;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError reportError;

    public PageErrors(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError2) {
        this.reportError = taxDocumentCenterError;
        this.faqError = taxDocumentCenterError2;
    }

    public /* synthetic */ PageErrors(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : taxDocumentCenterError, (i & 2) != 0 ? null : taxDocumentCenterError2);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError getReportError() {
        return this.reportError;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError getFaqError() {
        return this.faqError;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError = this.reportError;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError2 = this.faqError;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PageErrors(reportError=");
        sb.append(taxDocumentCenterError);
        sb.append(", faqError=");
        sb.append(taxDocumentCenterError2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError = this.reportError;
        int hashCode = taxDocumentCenterError == null ? 0 : taxDocumentCenterError.hashCode();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError2 = this.faqError;
        return (hashCode * 31) + (taxDocumentCenterError2 != null ? taxDocumentCenterError2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.PageErrors)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.PageErrors pageErrors = (com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.PageErrors) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.reportError, pageErrors.reportError) && kotlin.jvm.internal.Intrinsics.areEqual(this.faqError, pageErrors.faqError);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.PageErrors copy(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError reportError, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError faqError) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.PageErrors(reportError, faqError);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError getFaqError() {
        return this.faqError;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError getReportError() {
        return this.reportError;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.PageErrors copy$default(com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.PageErrors pageErrors, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            taxDocumentCenterError = pageErrors.reportError;
        }
        if ((i & 2) != 0) {
            taxDocumentCenterError2 = pageErrors.faqError;
        }
        return pageErrors.copy(taxDocumentCenterError, taxDocumentCenterError2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PageErrors() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
