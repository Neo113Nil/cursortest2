package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCorrectionDomain;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCorrectionStatusDomain;", "status", "", "id", "deepLink", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCorrectionStatusDomain;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCorrectionStatusDomain;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCorrectionStatusDomain;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCorrectionDomain;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCorrectionStatusDomain;", "getStatus", "Ljava/lang/String;", "getId", "getDeepLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TaxReportCorrectionDomain {
    public static final int $stable = 0;
    private final java.lang.String deepLink;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain status;

    public TaxReportCorrectionDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain taxReportCorrectionStatusDomain, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportCorrectionStatusDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.status = taxReportCorrectionStatusDomain;
        this.id = str;
        this.deepLink = str2;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain getStatus() {
        return this.status;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getDeepLink() {
        return this.deepLink;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain taxReportCorrectionStatusDomain = this.status;
        java.lang.String str = this.id;
        java.lang.String str2 = this.deepLink;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TaxReportCorrectionDomain(status=");
        sb.append(taxReportCorrectionStatusDomain);
        sb.append(", id=");
        sb.append(str);
        sb.append(", deepLink=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.status.hashCode() * 31) + this.id.hashCode()) * 31) + this.deepLink.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionDomain)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionDomain taxReportCorrectionDomain = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionDomain) other;
        return this.status == taxReportCorrectionDomain.status && kotlin.jvm.internal.Intrinsics.areEqual(this.id, taxReportCorrectionDomain.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.deepLink, taxReportCorrectionDomain.deepLink);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionDomain copy(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain status, java.lang.String id, java.lang.String deepLink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLink, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionDomain(status, id, deepLink);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDeepLink() {
        return this.deepLink;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain getStatus() {
        return this.status;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionDomain copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionDomain taxReportCorrectionDomain, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain taxReportCorrectionStatusDomain, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            taxReportCorrectionStatusDomain = taxReportCorrectionDomain.status;
        }
        if ((i & 2) != 0) {
            str = taxReportCorrectionDomain.id;
        }
        if ((i & 4) != 0) {
            str2 = taxReportCorrectionDomain.deepLink;
        }
        return taxReportCorrectionDomain.copy(taxReportCorrectionStatusDomain, str, str2);
    }
}
