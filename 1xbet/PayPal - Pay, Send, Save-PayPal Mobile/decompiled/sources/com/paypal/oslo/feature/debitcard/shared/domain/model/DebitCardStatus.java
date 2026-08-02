package com.paypal.oslo.feature.debitcard.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardStatus;", "", "Lcom/paypal/pds/components/BadgeStyle;", "badgeStyle", "", "statusText", "cardStatusDescription", "<init>", "(Lcom/paypal/pds/components/BadgeStyle;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/pds/components/BadgeStyle;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/pds/components/BadgeStyle;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardStatus;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/pds/components/BadgeStyle;", "getBadgeStyle", "Ljava/lang/String;", "getStatusText", "getCardStatusDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitCardStatus {
    public static final int $stable = 0;
    private final com.paypal.pds.components.BadgeStyle badgeStyle;
    private final java.lang.String cardStatusDescription;
    private final java.lang.String statusText;

    public DebitCardStatus(com.paypal.pds.components.BadgeStyle badgeStyle, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(badgeStyle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.badgeStyle = badgeStyle;
        this.statusText = str;
        this.cardStatusDescription = str2;
    }

    public final com.paypal.pds.components.BadgeStyle getBadgeStyle() {
        return this.badgeStyle;
    }

    public final java.lang.String getStatusText() {
        return this.statusText;
    }

    public /* synthetic */ DebitCardStatus(com.paypal.pds.components.BadgeStyle badgeStyle, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(badgeStyle, str, (i & 4) != 0 ? "" : str2);
    }

    public final java.lang.String getCardStatusDescription() {
        return this.cardStatusDescription;
    }

    public final java.lang.String toString() {
        com.paypal.pds.components.BadgeStyle badgeStyle = this.badgeStyle;
        java.lang.String str = this.statusText;
        java.lang.String str2 = this.cardStatusDescription;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitCardStatus(badgeStyle=");
        sb.append(badgeStyle);
        sb.append(", statusText=");
        sb.append(str);
        sb.append(", cardStatusDescription=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.badgeStyle.hashCode() * 31) + this.statusText.hashCode()) * 31) + this.cardStatusDescription.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus debitCardStatus = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.badgeStyle, debitCardStatus.badgeStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.statusText, debitCardStatus.statusText) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardStatusDescription, debitCardStatus.cardStatusDescription);
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus copy(com.paypal.pds.components.BadgeStyle badgeStyle, java.lang.String statusText, java.lang.String cardStatusDescription) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(badgeStyle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardStatusDescription, "");
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus(badgeStyle, statusText, cardStatusDescription);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCardStatusDescription() {
        return this.cardStatusDescription;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getStatusText() {
        return this.statusText;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.pds.components.BadgeStyle getBadgeStyle() {
        return this.badgeStyle;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus copy$default(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardStatus debitCardStatus, com.paypal.pds.components.BadgeStyle badgeStyle, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            badgeStyle = debitCardStatus.badgeStyle;
        }
        if ((i & 2) != 0) {
            str = debitCardStatus.statusText;
        }
        if ((i & 4) != 0) {
            str2 = debitCardStatus.cardStatusDescription;
        }
        return debitCardStatus.copy(badgeStyle, str, str2);
    }
}
