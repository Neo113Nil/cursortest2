package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/ReportLink;", "", "", "text", "url", "method", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;", "cta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/ReportLink;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText", "getUrl", "getMethod", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;", "getCta"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ReportLink {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta cta;
    private final java.lang.String method;
    private final java.lang.String text;
    private final java.lang.String url;

    public ReportLink(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.text = str;
        this.url = str2;
        this.method = str3;
        this.cta = taxReportCta;
    }

    public /* synthetic */ ReportLink(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : taxReportCta);
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String getMethod() {
        return this.method;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta getCta() {
        return this.cta;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.text;
        java.lang.String str2 = this.url;
        java.lang.String str3 = this.method;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta = this.cta;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReportLink(text=");
        sb.append(str);
        sb.append(", url=");
        sb.append(str2);
        sb.append(", method=");
        sb.append(str3);
        sb.append(", cta=");
        sb.append(taxReportCta);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode();
        int hashCode2 = this.url.hashCode();
        int hashCode3 = this.method.hashCode();
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta = this.cta;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (taxReportCta == null ? 0 : taxReportCta.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportLink)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportLink reportLink = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportLink) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.text, reportLink.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, reportLink.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.method, reportLink.method) && kotlin.jvm.internal.Intrinsics.areEqual(this.cta, reportLink.cta);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportLink copy(java.lang.String text, java.lang.String url, java.lang.String method, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta cta) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportLink(text, url, method, cta);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta getCta() {
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
    public final java.lang.String getText() {
        return this.text;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportLink copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportLink reportLink, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = reportLink.text;
        }
        if ((i & 2) != 0) {
            str2 = reportLink.url;
        }
        if ((i & 4) != 0) {
            str3 = reportLink.method;
        }
        if ((i & 8) != 0) {
            taxReportCta = reportLink.cta;
        }
        return reportLink.copy(str, str2, str3, taxReportCta);
    }
}
