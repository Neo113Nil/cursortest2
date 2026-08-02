package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\u0007\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/CashbackRewardUiModel;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "currentRewards", "yearToDateRewardsAmount", "alert", "", "isVisible", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Z)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "component2", "component3", "component4", "()Z", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/CashbackRewardUiModel;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getCurrentRewards", "getYearToDateRewardsAmount", "getAlert", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CashbackRewardUiModel {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString alert;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString currentRewards;
    private final boolean isVisible;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString yearToDateRewardsAmount;

    public CashbackRewardUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3, boolean z) {
        this.currentRewards = uiString;
        this.yearToDateRewardsAmount = uiString2;
        this.alert = uiString3;
        this.isVisible = z;
    }

    public /* synthetic */ CashbackRewardUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiString, (i & 2) != 0 ? null : uiString2, (i & 4) != 0 ? null : uiString3, (i & 8) != 0 ? false : z);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getCurrentRewards() {
        return this.currentRewards;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getYearToDateRewardsAmount() {
        return this.yearToDateRewardsAmount;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getAlert() {
        return this.alert;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.currentRewards;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = this.yearToDateRewardsAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3 = this.alert;
        boolean z = this.isVisible;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CashbackRewardUiModel(currentRewards=");
        sb.append(uiString);
        sb.append(", yearToDateRewardsAmount=");
        sb.append(uiString2);
        sb.append(", alert=");
        sb.append(uiString3);
        sb.append(", isVisible=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.currentRewards;
        int hashCode = uiString == null ? 0 : uiString.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = this.yearToDateRewardsAmount;
        int hashCode2 = uiString2 == null ? 0 : uiString2.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3 = this.alert;
        return (((((hashCode * 31) + hashCode2) * 31) + (uiString3 != null ? uiString3.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isVisible);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel cashbackRewardUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.currentRewards, cashbackRewardUiModel.currentRewards) && kotlin.jvm.internal.Intrinsics.areEqual(this.yearToDateRewardsAmount, cashbackRewardUiModel.yearToDateRewardsAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.alert, cashbackRewardUiModel.alert) && this.isVisible == cashbackRewardUiModel.isVisible;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString currentRewards, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString yearToDateRewardsAmount, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString alert, boolean isVisible) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel(currentRewards, yearToDateRewardsAmount, alert, isVisible);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getAlert() {
        return this.alert;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getYearToDateRewardsAmount() {
        return this.yearToDateRewardsAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getCurrentRewards() {
        return this.currentRewards;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel cashbackRewardUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            uiString = cashbackRewardUiModel.currentRewards;
        }
        if ((i & 2) != 0) {
            uiString2 = cashbackRewardUiModel.yearToDateRewardsAmount;
        }
        if ((i & 4) != 0) {
            uiString3 = cashbackRewardUiModel.alert;
        }
        if ((i & 8) != 0) {
            z = cashbackRewardUiModel.isVisible;
        }
        return cashbackRewardUiModel.copy(uiString, uiString2, uiString3, z);
    }

    public CashbackRewardUiModel() {
        this(null, null, null, false, 15, null);
    }
}
