package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ@\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/mapper/CategorizedSpecialFinancingItems;", "", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/specialfinancing/uimodel/SpecialFinancingItemUiModel;", "expiring", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.ACTIVE, "paidOff", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/mapper/CategorizedSpecialFinancingItems;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getExpiring", "getActive", "getPaidOff"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CategorizedSpecialFinancingItems {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> active;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> expiring;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> paidOff;

    public CategorizedSpecialFinancingItems(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> list, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> list2, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> list3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        this.expiring = list;
        this.active = list2;
        this.paidOff = list3;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> getExpiring() {
        return this.expiring;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> getActive() {
        return this.active;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> getPaidOff() {
        return this.paidOff;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> list = this.expiring;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> list2 = this.active;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> list3 = this.paidOff;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CategorizedSpecialFinancingItems(expiring=");
        sb.append(list);
        sb.append(", active=");
        sb.append(list2);
        sb.append(", paidOff=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.expiring.hashCode() * 31) + this.active.hashCode()) * 31) + this.paidOff.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.CategorizedSpecialFinancingItems)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.CategorizedSpecialFinancingItems categorizedSpecialFinancingItems = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.CategorizedSpecialFinancingItems) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.expiring, categorizedSpecialFinancingItems.expiring) && kotlin.jvm.internal.Intrinsics.areEqual(this.active, categorizedSpecialFinancingItems.active) && kotlin.jvm.internal.Intrinsics.areEqual(this.paidOff, categorizedSpecialFinancingItems.paidOff);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.CategorizedSpecialFinancingItems copy(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> expiring, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> active, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> paidOff) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiring, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(active, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paidOff, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.CategorizedSpecialFinancingItems(expiring, active, paidOff);
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> component3() {
        return this.paidOff;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> component2() {
        return this.active;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> component1() {
        return this.expiring;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.CategorizedSpecialFinancingItems copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.CategorizedSpecialFinancingItems categorizedSpecialFinancingItems, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = categorizedSpecialFinancingItems.expiring;
        }
        if ((i & 2) != 0) {
            list2 = categorizedSpecialFinancingItems.active;
        }
        if ((i & 4) != 0) {
            list3 = categorizedSpecialFinancingItems.paidOff;
        }
        return categorizedSpecialFinancingItems.copy(list, list2, list3);
    }
}
