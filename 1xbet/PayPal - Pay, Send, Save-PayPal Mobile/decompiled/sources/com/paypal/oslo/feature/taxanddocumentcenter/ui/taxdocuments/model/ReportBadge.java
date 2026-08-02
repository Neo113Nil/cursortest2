package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/ReportBadge;", "", "", "label", "Lcom/paypal/pds/components/BadgeStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "<init>", "(Ljava/lang/String;Lcom/paypal/pds/components/BadgeStyle;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/pds/components/BadgeStyle;", "copy", "(Ljava/lang/String;Lcom/paypal/pds/components/BadgeStyle;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/ReportBadge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLabel", "Lcom/paypal/pds/components/BadgeStyle;", "getStyle"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ReportBadge {
    public static final int $stable = 0;
    private final java.lang.String label;
    private final com.paypal.pds.components.BadgeStyle style;

    public ReportBadge(java.lang.String str, com.paypal.pds.components.BadgeStyle badgeStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(badgeStyle, "");
        this.label = str;
        this.style = badgeStyle;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final com.paypal.pds.components.BadgeStyle getStyle() {
        return this.style;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.label;
        com.paypal.pds.components.BadgeStyle badgeStyle = this.style;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReportBadge(label=");
        sb.append(str);
        sb.append(", style=");
        sb.append(badgeStyle);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.label.hashCode() * 31) + this.style.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportBadge)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportBadge reportBadge = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportBadge) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.label, reportBadge.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.style, reportBadge.style);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportBadge copy(java.lang.String label, com.paypal.pds.components.BadgeStyle style) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportBadge(label, style);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.pds.components.BadgeStyle getStyle() {
        return this.style;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportBadge copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportBadge reportBadge, java.lang.String str, com.paypal.pds.components.BadgeStyle badgeStyle, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = reportBadge.label;
        }
        if ((i & 2) != 0) {
            badgeStyle = reportBadge.style;
        }
        return reportBadge.copy(str, badgeStyle);
    }
}
