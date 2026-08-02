package com.paypal.oslo.feature.moneymovement.api.domain;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureInfo;", "", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureAlertType;", "alertType", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureType;", "type", "", "linkText", "linkUrl", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureAlertType;Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureAlertType;", "component2", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureType;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureAlertType;Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureType;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureAlertType;", "getAlertType", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureType;", "getType", "Ljava/lang/String;", "getLinkText", "getLinkUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PlanDisclosureInfo {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType alertType;
    private final java.lang.String linkText;
    private final java.lang.String linkUrl;
    private final com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType type;

    public PlanDisclosureInfo(com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType planDisclosureAlertType, com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType planDisclosureType, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planDisclosureAlertType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planDisclosureType, "");
        this.alertType = planDisclosureAlertType;
        this.type = planDisclosureType;
        this.linkText = str;
        this.linkUrl = str2;
    }

    public /* synthetic */ PlanDisclosureInfo(com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType planDisclosureAlertType, com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType planDisclosureType, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(planDisclosureAlertType, planDisclosureType, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType getAlertType() {
        return this.alertType;
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType getType() {
        return this.type;
    }

    public final java.lang.String getLinkText() {
        return this.linkText;
    }

    public final java.lang.String getLinkUrl() {
        return this.linkUrl;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType planDisclosureAlertType = this.alertType;
        com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType planDisclosureType = this.type;
        java.lang.String str = this.linkText;
        java.lang.String str2 = this.linkUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanDisclosureInfo(alertType=");
        sb.append(planDisclosureAlertType);
        sb.append(", type=");
        sb.append(planDisclosureType);
        sb.append(", linkText=");
        sb.append(str);
        sb.append(", linkUrl=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.alertType.hashCode();
        int hashCode2 = this.type.hashCode();
        java.lang.String str = this.linkText;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.linkUrl;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo planDisclosureInfo = (com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo) other;
        return this.alertType == planDisclosureInfo.alertType && this.type == planDisclosureInfo.type && kotlin.jvm.internal.Intrinsics.areEqual(this.linkText, planDisclosureInfo.linkText) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkUrl, planDisclosureInfo.linkUrl);
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo copy(com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType alertType, com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType type, java.lang.String linkText, java.lang.String linkUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo(alertType, type, linkText, linkUrl);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLinkUrl() {
        return this.linkUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLinkText() {
        return this.linkText;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType getAlertType() {
        return this.alertType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo copy$default(com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo planDisclosureInfo, com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType planDisclosureAlertType, com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType planDisclosureType, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            planDisclosureAlertType = planDisclosureInfo.alertType;
        }
        if ((i & 2) != 0) {
            planDisclosureType = planDisclosureInfo.type;
        }
        if ((i & 4) != 0) {
            str = planDisclosureInfo.linkText;
        }
        if ((i & 8) != 0) {
            str2 = planDisclosureInfo.linkUrl;
        }
        return planDisclosureInfo.copy(planDisclosureAlertType, planDisclosureType, str, str2);
    }
}
