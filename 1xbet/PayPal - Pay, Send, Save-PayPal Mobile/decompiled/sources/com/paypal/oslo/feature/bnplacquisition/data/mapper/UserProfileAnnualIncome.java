package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/mapper/UserProfileAnnualIncome;", "", "", "isRequired", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "amount", "<init>", "(ZLcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "copy", "(ZLcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)Lcom/paypal/oslo/feature/bnplacquisition/data/mapper/UserProfileAnnualIncome;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UserProfileAnnualIncome {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment amount;
    private final boolean isRequired;

    public UserProfileAnnualIncome(boolean z, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
        this.isRequired = z;
        this.amount = bnplAcquisitionMoneyFragment;
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getAmount() {
        return this.amount;
    }

    public final java.lang.String toString() {
        boolean z = this.isRequired;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment = this.amount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserProfileAnnualIncome(isRequired=");
        sb.append(z);
        sb.append(", amount=");
        sb.append(bnplAcquisitionMoneyFragment);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isRequired);
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment = this.amount;
        return (hashCode * 31) + (bnplAcquisitionMoneyFragment == null ? 0 : bnplAcquisitionMoneyFragment.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileAnnualIncome)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileAnnualIncome userProfileAnnualIncome = (com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileAnnualIncome) other;
        return this.isRequired == userProfileAnnualIncome.isRequired && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, userProfileAnnualIncome.amount);
    }

    public final com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileAnnualIncome copy(boolean isRequired, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment amount) {
        return new com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileAnnualIncome(isRequired, amount);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileAnnualIncome copy$default(com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileAnnualIncome userProfileAnnualIncome, boolean z, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = userProfileAnnualIncome.isRequired;
        }
        if ((i & 2) != 0) {
            bnplAcquisitionMoneyFragment = userProfileAnnualIncome.amount;
        }
        return userProfileAnnualIncome.copy(z, bnplAcquisitionMoneyFragment);
    }
}
