package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ0\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxDocumentsPageDataDomain;", "", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSectionDomain;", "reportSections", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/FaqItem;", "faqItems", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxDocumentsPageDataDomain;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getReportSections", "getFaqItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TaxDocumentsPageDataDomain {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem> faqItems;
    private final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain> reportSections;

    public TaxDocumentsPageDataDomain(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain> list, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.reportSections = list;
        this.faqItems = list2;
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain> getReportSections() {
        return this.reportSections;
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem> getFaqItems() {
        return this.faqItems;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain> list = this.reportSections;
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem> list2 = this.faqItems;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TaxDocumentsPageDataDomain(reportSections=");
        sb.append(list);
        sb.append(", faqItems=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.reportSections.hashCode() * 31) + this.faqItems.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain taxDocumentsPageDataDomain = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.reportSections, taxDocumentsPageDataDomain.reportSections) && kotlin.jvm.internal.Intrinsics.areEqual(this.faqItems, taxDocumentsPageDataDomain.faqItems);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain copy(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain> reportSections, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem> faqItems) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportSections, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faqItems, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain(reportSections, faqItems);
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem> component2() {
        return this.faqItems;
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain> component1() {
        return this.reportSections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxDocumentsPageDataDomain taxDocumentsPageDataDomain, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = taxDocumentsPageDataDomain.reportSections;
        }
        if ((i & 2) != 0) {
            list2 = taxDocumentsPageDataDomain.faqItems;
        }
        return taxDocumentsPageDataDomain.copy(list, list2);
    }
}
