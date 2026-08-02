package com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013Jv\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0013R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b(\u0010\u0013R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b)\u0010\u0013R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b*\u0010\u0013R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b+\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/FilterOptions;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansPresentmentCategory;", "plansPresentmentCategory", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus;", "withAnyOfThePlanStatuses", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlanTag;", "withAnyOfTheTags", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "withCreditProductIdentifiers", "withNoneOfTheTags", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/AccountStatus;", "withAccountStatuses", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansPresentmentCategory;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansPresentmentCategory;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansPresentmentCategory;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/FilterOptions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansPresentmentCategory;", "getPlansPresentmentCategory", "Ljava/util/List;", "getWithAnyOfThePlanStatuses", "getWithAnyOfTheTags", "getWithCreditProductIdentifiers", "getWithNoneOfTheTags", "getWithAccountStatuses"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FilterOptions {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory plansPresentmentCategory;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus> withAccountStatuses;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus> withAnyOfThePlanStatuses;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> withAnyOfTheTags;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> withCreditProductIdentifiers;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> withNoneOfTheTags;

    /* JADX WARN: Multi-variable type inference failed */
    public FilterOptions(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory plansPresentmentCategory, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus> list, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> list2, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list3, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> list4, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus> list5) {
        this.plansPresentmentCategory = plansPresentmentCategory;
        this.withAnyOfThePlanStatuses = list;
        this.withAnyOfTheTags = list2;
        this.withCreditProductIdentifiers = list3;
        this.withNoneOfTheTags = list4;
        this.withAccountStatuses = list5;
    }

    public /* synthetic */ FilterOptions(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory plansPresentmentCategory, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : plansPresentmentCategory, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4, (i & 32) != 0 ? null : list5);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory getPlansPresentmentCategory() {
        return this.plansPresentmentCategory;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus> getWithAnyOfThePlanStatuses() {
        return this.withAnyOfThePlanStatuses;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> getWithAnyOfTheTags() {
        return this.withAnyOfTheTags;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> getWithCreditProductIdentifiers() {
        return this.withCreditProductIdentifiers;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> getWithNoneOfTheTags() {
        return this.withNoneOfTheTags;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus> getWithAccountStatuses() {
        return this.withAccountStatuses;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory plansPresentmentCategory = this.plansPresentmentCategory;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus> list = this.withAnyOfThePlanStatuses;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> list2 = this.withAnyOfTheTags;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list3 = this.withCreditProductIdentifiers;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> list4 = this.withNoneOfTheTags;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus> list5 = this.withAccountStatuses;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FilterOptions(plansPresentmentCategory=");
        sb.append(plansPresentmentCategory);
        sb.append(", withAnyOfThePlanStatuses=");
        sb.append(list);
        sb.append(", withAnyOfTheTags=");
        sb.append(list2);
        sb.append(", withCreditProductIdentifiers=");
        sb.append(list3);
        sb.append(", withNoneOfTheTags=");
        sb.append(list4);
        sb.append(", withAccountStatuses=");
        sb.append(list5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory plansPresentmentCategory = this.plansPresentmentCategory;
        int hashCode = plansPresentmentCategory == null ? 0 : plansPresentmentCategory.hashCode();
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus> list = this.withAnyOfThePlanStatuses;
        int hashCode2 = list == null ? 0 : list.hashCode();
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> list2 = this.withAnyOfTheTags;
        int hashCode3 = list2 == null ? 0 : list2.hashCode();
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list3 = this.withCreditProductIdentifiers;
        int hashCode4 = list3 == null ? 0 : list3.hashCode();
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> list4 = this.withNoneOfTheTags;
        int hashCode5 = list4 == null ? 0 : list4.hashCode();
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus> list5 = this.withAccountStatuses;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (list5 != null ? list5.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.FilterOptions)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.FilterOptions filterOptions = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.FilterOptions) other;
        return this.plansPresentmentCategory == filterOptions.plansPresentmentCategory && kotlin.jvm.internal.Intrinsics.areEqual(this.withAnyOfThePlanStatuses, filterOptions.withAnyOfThePlanStatuses) && kotlin.jvm.internal.Intrinsics.areEqual(this.withAnyOfTheTags, filterOptions.withAnyOfTheTags) && kotlin.jvm.internal.Intrinsics.areEqual(this.withCreditProductIdentifiers, filterOptions.withCreditProductIdentifiers) && kotlin.jvm.internal.Intrinsics.areEqual(this.withNoneOfTheTags, filterOptions.withNoneOfTheTags) && kotlin.jvm.internal.Intrinsics.areEqual(this.withAccountStatuses, filterOptions.withAccountStatuses);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.FilterOptions copy(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory plansPresentmentCategory, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus> withAnyOfThePlanStatuses, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> withAnyOfTheTags, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> withCreditProductIdentifiers, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> withNoneOfTheTags, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus> withAccountStatuses) {
        return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.FilterOptions(plansPresentmentCategory, withAnyOfThePlanStatuses, withAnyOfTheTags, withCreditProductIdentifiers, withNoneOfTheTags, withAccountStatuses);
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus> component6() {
        return this.withAccountStatuses;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> component5() {
        return this.withNoneOfTheTags;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> component4() {
        return this.withCreditProductIdentifiers;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> component3() {
        return this.withAnyOfTheTags;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus> component2() {
        return this.withAnyOfThePlanStatuses;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory getPlansPresentmentCategory() {
        return this.plansPresentmentCategory;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.FilterOptions copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.FilterOptions filterOptions, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory plansPresentmentCategory, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            plansPresentmentCategory = filterOptions.plansPresentmentCategory;
        }
        if ((i & 2) != 0) {
            list = filterOptions.withAnyOfThePlanStatuses;
        }
        java.util.List list6 = list;
        if ((i & 4) != 0) {
            list2 = filterOptions.withAnyOfTheTags;
        }
        java.util.List list7 = list2;
        if ((i & 8) != 0) {
            list3 = filterOptions.withCreditProductIdentifiers;
        }
        java.util.List list8 = list3;
        if ((i & 16) != 0) {
            list4 = filterOptions.withNoneOfTheTags;
        }
        java.util.List list9 = list4;
        if ((i & 32) != 0) {
            list5 = filterOptions.withAccountStatuses;
        }
        return filterOptions.copy(plansPresentmentCategory, list6, list7, list8, list9, list5);
    }

    public FilterOptions() {
        this(null, null, null, null, null, null, 63, null);
    }
}
