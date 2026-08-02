package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ButtonDomain;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "title", "", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCtaDomain;", "cta", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCtaDomain;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCtaDomain;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCtaDomain;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ButtonDomain;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "getTitle", "Ljava/lang/String;", "getColor", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCtaDomain;", "getCta"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ButtonDomain {
    public static final int $stable = 8;
    private final java.lang.String color;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain cta;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource title;

    public ButtonDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, java.lang.String str, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain taxReportCtaDomain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportTextResource, "");
        this.title = taxReportTextResource;
        this.color = str;
        this.cta = taxReportCtaDomain;
    }

    public /* synthetic */ ButtonDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, java.lang.String str, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain taxReportCtaDomain, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(taxReportTextResource, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : taxReportCtaDomain);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getTitle() {
        return this.title;
    }

    public final java.lang.String getColor() {
        return this.color;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain getCta() {
        return this.cta;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource = this.title;
        java.lang.String str = this.color;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain taxReportCtaDomain = this.cta;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ButtonDomain(title=");
        sb.append(taxReportTextResource);
        sb.append(", color=");
        sb.append(str);
        sb.append(", cta=");
        sb.append(taxReportCtaDomain);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode();
        java.lang.String str = this.color;
        int hashCode2 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain taxReportCtaDomain = this.cta;
        return (((hashCode * 31) + hashCode2) * 31) + (taxReportCtaDomain != null ? taxReportCtaDomain.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ButtonDomain)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ButtonDomain buttonDomain = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ButtonDomain) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, buttonDomain.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.color, buttonDomain.color) && kotlin.jvm.internal.Intrinsics.areEqual(this.cta, buttonDomain.cta);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ButtonDomain copy(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource title, java.lang.String color, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain cta) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ButtonDomain(title, color, cta);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain getCta() {
        return this.cta;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getColor() {
        return this.color;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ButtonDomain copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ButtonDomain buttonDomain, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, java.lang.String str, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain taxReportCtaDomain, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            taxReportTextResource = buttonDomain.title;
        }
        if ((i & 2) != 0) {
            str = buttonDomain.color;
        }
        if ((i & 4) != 0) {
            taxReportCtaDomain = buttonDomain.cta;
        }
        return buttonDomain.copy(taxReportTextResource, str, taxReportCtaDomain);
    }
}
