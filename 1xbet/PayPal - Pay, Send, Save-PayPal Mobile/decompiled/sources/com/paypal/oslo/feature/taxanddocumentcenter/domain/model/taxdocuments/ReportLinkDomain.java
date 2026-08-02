package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportLinkDomain;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "text", "", "url", "method", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCtaDomain;", "cta", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCtaDomain;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCtaDomain;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCtaDomain;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportLinkDomain;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "getText", "Ljava/lang/String;", "getUrl", "getMethod", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCtaDomain;", "getCta"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ReportLinkDomain {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain cta;
    private final java.lang.String method;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource text;
    private final java.lang.String url;

    public ReportLinkDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain taxReportCtaDomain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportTextResource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.text = taxReportTextResource;
        this.url = str;
        this.method = str2;
        this.cta = taxReportCtaDomain;
    }

    public /* synthetic */ ReportLinkDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain taxReportCtaDomain, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(taxReportTextResource, str, str2, (i & 8) != 0 ? null : taxReportCtaDomain);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getText() {
        return this.text;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String getMethod() {
        return this.method;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain getCta() {
        return this.cta;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource = this.text;
        java.lang.String str = this.url;
        java.lang.String str2 = this.method;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain taxReportCtaDomain = this.cta;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReportLinkDomain(text=");
        sb.append(taxReportTextResource);
        sb.append(", url=");
        sb.append(str);
        sb.append(", method=");
        sb.append(str2);
        sb.append(", cta=");
        sb.append(taxReportCtaDomain);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode();
        int hashCode2 = this.url.hashCode();
        int hashCode3 = this.method.hashCode();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain taxReportCtaDomain = this.cta;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (taxReportCtaDomain == null ? 0 : taxReportCtaDomain.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportLinkDomain)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportLinkDomain reportLinkDomain = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportLinkDomain) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.text, reportLinkDomain.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, reportLinkDomain.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.method, reportLinkDomain.method) && kotlin.jvm.internal.Intrinsics.areEqual(this.cta, reportLinkDomain.cta);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportLinkDomain copy(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource text, java.lang.String url, java.lang.String method, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain cta) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportLinkDomain(text, url, method, cta);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain getCta() {
        return this.cta;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMethod() {
        return this.method;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getText() {
        return this.text;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportLinkDomain copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportLinkDomain reportLinkDomain, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain taxReportCtaDomain, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            taxReportTextResource = reportLinkDomain.text;
        }
        if ((i & 2) != 0) {
            str = reportLinkDomain.url;
        }
        if ((i & 4) != 0) {
            str2 = reportLinkDomain.method;
        }
        if ((i & 8) != 0) {
            taxReportCtaDomain = reportLinkDomain.cta;
        }
        return reportLinkDomain.copy(taxReportTextResource, str, str2, taxReportCtaDomain);
    }
}
