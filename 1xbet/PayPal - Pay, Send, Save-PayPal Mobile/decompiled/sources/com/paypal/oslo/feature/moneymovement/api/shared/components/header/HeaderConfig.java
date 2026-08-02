package com.paypal.oslo.feature.moneymovement.api.shared.components.header;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010Jf\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\"\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b)\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b\u000b\u0010\u0010R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b,\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderConfig;", "", "", "showAmount", "showDestination", "showNote", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderTrailing;", "trailingAmount", "trailingDestination", "", "notePlaceholder", "isInternationalFormat", "showSecondDestination", "<init>", "(ZZZLcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderTrailing;Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderTrailing;Ljava/lang/String;ZZ)V", "component1", "()Z", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderTrailing;", "component5", "component6", "()Ljava/lang/String;", "component7", "component8", "copy", "(ZZZLcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderTrailing;Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderTrailing;Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getShowAmount", "getShowDestination", "getShowNote", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderTrailing;", "getTrailingAmount", "getTrailingDestination", "Ljava/lang/String;", "getNotePlaceholder", "getShowSecondDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HeaderConfig {
    public static final int $stable = 0;
    private final boolean isInternationalFormat;
    private final java.lang.String notePlaceholder;
    private final boolean showAmount;
    private final boolean showDestination;
    private final boolean showNote;
    private final boolean showSecondDestination;
    private final com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing trailingAmount;
    private final com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing trailingDestination;

    public HeaderConfig(boolean z, boolean z2, boolean z3, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing headerTrailing, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing headerTrailing2, java.lang.String str, boolean z4, boolean z5) {
        this.showAmount = z;
        this.showDestination = z2;
        this.showNote = z3;
        this.trailingAmount = headerTrailing;
        this.trailingDestination = headerTrailing2;
        this.notePlaceholder = str;
        this.isInternationalFormat = z4;
        this.showSecondDestination = z5;
    }

    public /* synthetic */ HeaderConfig(boolean z, boolean z2, boolean z3, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing headerTrailing, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing headerTrailing2, java.lang.String str, boolean z4, boolean z5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? null : headerTrailing, (i & 16) != 0 ? null : headerTrailing2, (i & 32) == 0 ? str : null, (i & 64) == 0 ? z4 : true, (i & 128) == 0 ? z5 : false);
    }

    public final boolean getShowAmount() {
        return this.showAmount;
    }

    public final boolean getShowDestination() {
        return this.showDestination;
    }

    public final boolean getShowNote() {
        return this.showNote;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing getTrailingAmount() {
        return this.trailingAmount;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing getTrailingDestination() {
        return this.trailingDestination;
    }

    public final java.lang.String getNotePlaceholder() {
        return this.notePlaceholder;
    }

    public final boolean isInternationalFormat() {
        return this.isInternationalFormat;
    }

    public final boolean getShowSecondDestination() {
        return this.showSecondDestination;
    }

    public final java.lang.String toString() {
        boolean z = this.showAmount;
        boolean z2 = this.showDestination;
        boolean z3 = this.showNote;
        com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing headerTrailing = this.trailingAmount;
        com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing headerTrailing2 = this.trailingDestination;
        java.lang.String str = this.notePlaceholder;
        boolean z4 = this.isInternationalFormat;
        boolean z5 = this.showSecondDestination;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HeaderConfig(showAmount=");
        sb.append(z);
        sb.append(", showDestination=");
        sb.append(z2);
        sb.append(", showNote=");
        sb.append(z3);
        sb.append(", trailingAmount=");
        sb.append(headerTrailing);
        sb.append(", trailingDestination=");
        sb.append(headerTrailing2);
        sb.append(", notePlaceholder=");
        sb.append(str);
        sb.append(", isInternationalFormat=");
        sb.append(z4);
        sb.append(", showSecondDestination=");
        sb.append(z5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.showAmount);
        int hashCode2 = java.lang.Boolean.hashCode(this.showDestination);
        int hashCode3 = java.lang.Boolean.hashCode(this.showNote);
        com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing headerTrailing = this.trailingAmount;
        int hashCode4 = headerTrailing == null ? 0 : headerTrailing.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing headerTrailing2 = this.trailingDestination;
        int hashCode5 = headerTrailing2 == null ? 0 : headerTrailing2.hashCode();
        java.lang.String str = this.notePlaceholder;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isInternationalFormat)) * 31) + java.lang.Boolean.hashCode(this.showSecondDestination);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig headerConfig = (com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig) other;
        return this.showAmount == headerConfig.showAmount && this.showDestination == headerConfig.showDestination && this.showNote == headerConfig.showNote && this.trailingAmount == headerConfig.trailingAmount && this.trailingDestination == headerConfig.trailingDestination && kotlin.jvm.internal.Intrinsics.areEqual(this.notePlaceholder, headerConfig.notePlaceholder) && this.isInternationalFormat == headerConfig.isInternationalFormat && this.showSecondDestination == headerConfig.showSecondDestination;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig copy(boolean showAmount, boolean showDestination, boolean showNote, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing trailingAmount, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing trailingDestination, java.lang.String notePlaceholder, boolean isInternationalFormat, boolean showSecondDestination) {
        return new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig(showAmount, showDestination, showNote, trailingAmount, trailingDestination, notePlaceholder, isInternationalFormat, showSecondDestination);
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowSecondDestination() {
        return this.showSecondDestination;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsInternationalFormat() {
        return this.isInternationalFormat;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getNotePlaceholder() {
        return this.notePlaceholder;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing getTrailingDestination() {
        return this.trailingDestination;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing getTrailingAmount() {
        return this.trailingAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowNote() {
        return this.showNote;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowDestination() {
        return this.showDestination;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowAmount() {
        return this.showAmount;
    }

    public HeaderConfig() {
        this(false, false, false, null, null, null, false, false, 255, null);
    }
}
