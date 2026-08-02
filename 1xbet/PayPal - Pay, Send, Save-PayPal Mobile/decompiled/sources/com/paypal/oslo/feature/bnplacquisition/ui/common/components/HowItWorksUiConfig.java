package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/HowItWorksUiConfig;", "", "", "smallPaddingFromHeaderToList", "useNumericBadges", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/HowItWorksUiConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSmallPaddingFromHeaderToList", "getUseNumericBadges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class HowItWorksUiConfig {
    public static final int $stable = 0;
    private final boolean smallPaddingFromHeaderToList;
    private final boolean useNumericBadges;

    public HowItWorksUiConfig(boolean z, boolean z2) {
        this.smallPaddingFromHeaderToList = z;
        this.useNumericBadges = z2;
    }

    public /* synthetic */ HowItWorksUiConfig(boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? true : z2);
    }

    public final boolean getSmallPaddingFromHeaderToList() {
        return this.smallPaddingFromHeaderToList;
    }

    public final boolean getUseNumericBadges() {
        return this.useNumericBadges;
    }

    public final java.lang.String toString() {
        boolean z = this.smallPaddingFromHeaderToList;
        boolean z2 = this.useNumericBadges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HowItWorksUiConfig(smallPaddingFromHeaderToList=");
        sb.append(z);
        sb.append(", useNumericBadges=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.smallPaddingFromHeaderToList) * 31) + java.lang.Boolean.hashCode(this.useNumericBadges);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiConfig)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiConfig howItWorksUiConfig = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiConfig) other;
        return this.smallPaddingFromHeaderToList == howItWorksUiConfig.smallPaddingFromHeaderToList && this.useNumericBadges == howItWorksUiConfig.useNumericBadges;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiConfig copy(boolean smallPaddingFromHeaderToList, boolean useNumericBadges) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiConfig(smallPaddingFromHeaderToList, useNumericBadges);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getUseNumericBadges() {
        return this.useNumericBadges;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSmallPaddingFromHeaderToList() {
        return this.smallPaddingFromHeaderToList;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiConfig copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksUiConfig howItWorksUiConfig, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = howItWorksUiConfig.smallPaddingFromHeaderToList;
        }
        if ((i & 2) != 0) {
            z2 = howItWorksUiConfig.useNumericBadges;
        }
        return howItWorksUiConfig.copy(z, z2);
    }
}
