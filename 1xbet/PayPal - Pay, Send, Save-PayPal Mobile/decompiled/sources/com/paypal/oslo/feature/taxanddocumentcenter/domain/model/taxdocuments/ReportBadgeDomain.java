package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportBadgeDomain;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "label", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/BadgeType;", "type", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/BadgeType;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "component2", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/BadgeType;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/BadgeType;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportBadgeDomain;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "getLabel", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/BadgeType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ReportBadgeDomain {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource label;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.BadgeType type;

    public ReportBadgeDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.BadgeType badgeType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportTextResource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(badgeType, "");
        this.label = taxReportTextResource;
        this.type = badgeType;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getLabel() {
        return this.label;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.BadgeType getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource = this.label;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.BadgeType badgeType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReportBadgeDomain(label=");
        sb.append(taxReportTextResource);
        sb.append(", type=");
        sb.append(badgeType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.label.hashCode() * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportBadgeDomain)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportBadgeDomain reportBadgeDomain = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportBadgeDomain) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.label, reportBadgeDomain.label) && this.type == reportBadgeDomain.type;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportBadgeDomain copy(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource label, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.BadgeType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportBadgeDomain(label, type);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.BadgeType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getLabel() {
        return this.label;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportBadgeDomain copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportBadgeDomain reportBadgeDomain, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.BadgeType badgeType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            taxReportTextResource = reportBadgeDomain.label;
        }
        if ((i & 2) != 0) {
            badgeType = reportBadgeDomain.type;
        }
        return reportBadgeDomain.copy(taxReportTextResource, badgeType);
    }
}
