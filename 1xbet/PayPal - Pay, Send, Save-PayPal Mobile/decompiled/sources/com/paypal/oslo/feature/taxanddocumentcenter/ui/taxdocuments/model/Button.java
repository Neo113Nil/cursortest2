package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/Button;", "", "", "title", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;", "cta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/Button;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getColor", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;", "getCta"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Button {
    public static final int $stable = 8;
    private final java.lang.String color;
    private final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta cta;
    private final java.lang.String title;

    public Button(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
        this.color = str2;
        this.cta = taxReportCta;
    }

    public /* synthetic */ Button(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : taxReportCta);
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getColor() {
        return this.color;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta getCta() {
        return this.cta;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.color;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta = this.cta;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Button(title=");
        sb.append(str);
        sb.append(", color=");
        sb.append(str2);
        sb.append(", cta=");
        sb.append(taxReportCta);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode();
        java.lang.String str = this.color;
        int hashCode2 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta = this.cta;
        return (((hashCode * 31) + hashCode2) * 31) + (taxReportCta != null ? taxReportCta.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.Button)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.Button button = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.Button) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, button.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.color, button.color) && kotlin.jvm.internal.Intrinsics.areEqual(this.cta, button.cta);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.Button copy(java.lang.String title, java.lang.String color, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta cta) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.Button(title, color, cta);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta getCta() {
        return this.cta;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getColor() {
        return this.color;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.Button copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.Button button, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = button.title;
        }
        if ((i & 2) != 0) {
            str2 = button.color;
        }
        if ((i & 4) != 0) {
            taxReportCta = button.cta;
        }
        return button.copy(str, str2, taxReportCta);
    }
}
