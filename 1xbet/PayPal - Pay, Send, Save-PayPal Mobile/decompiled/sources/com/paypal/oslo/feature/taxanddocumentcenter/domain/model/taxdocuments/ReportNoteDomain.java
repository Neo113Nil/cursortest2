package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportNoteDomain;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "title", "toastMessage", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/NoteTypeDomain;", "type", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/NoteTypeDomain;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "component2", "component3", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/NoteTypeDomain;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/NoteTypeDomain;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportNoteDomain;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "getTitle", "getToastMessage", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/NoteTypeDomain;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ReportNoteDomain {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource title;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource toastMessage;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain type;

    public ReportNoteDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource2, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain noteTypeDomain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportTextResource, "");
        this.title = taxReportTextResource;
        this.toastMessage = taxReportTextResource2;
        this.type = noteTypeDomain;
    }

    public /* synthetic */ ReportNoteDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource2, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain noteTypeDomain, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(taxReportTextResource, (i & 2) != 0 ? null : taxReportTextResource2, (i & 4) != 0 ? null : noteTypeDomain);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getToastMessage() {
        return this.toastMessage;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource = this.title;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource2 = this.toastMessage;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain noteTypeDomain = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReportNoteDomain(title=");
        sb.append(taxReportTextResource);
        sb.append(", toastMessage=");
        sb.append(taxReportTextResource2);
        sb.append(", type=");
        sb.append(noteTypeDomain);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource = this.toastMessage;
        int hashCode2 = taxReportTextResource == null ? 0 : taxReportTextResource.hashCode();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain noteTypeDomain = this.type;
        return (((hashCode * 31) + hashCode2) * 31) + (noteTypeDomain != null ? noteTypeDomain.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain reportNoteDomain = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, reportNoteDomain.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.toastMessage, reportNoteDomain.toastMessage) && this.type == reportNoteDomain.type;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain copy(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource title, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource toastMessage, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain(title, toastMessage, type);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getToastMessage() {
        return this.toastMessage;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain reportNoteDomain, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource2, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.NoteTypeDomain noteTypeDomain, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            taxReportTextResource = reportNoteDomain.title;
        }
        if ((i & 2) != 0) {
            taxReportTextResource2 = reportNoteDomain.toastMessage;
        }
        if ((i & 4) != 0) {
            noteTypeDomain = reportNoteDomain.type;
        }
        return reportNoteDomain.copy(taxReportTextResource, taxReportTextResource2, noteTypeDomain);
    }
}
