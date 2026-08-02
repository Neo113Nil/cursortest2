package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/DomainButtonData;", "", "", "label", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/DomainButtonState;", "state", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/DomainButtonState;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/DomainButtonState;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/DomainButtonState;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/DomainButtonData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLabel", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/DomainButtonState;", "getState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DomainButtonData {
    public static final int $stable = 0;
    private final java.lang.String label;
    private final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState state;

    public DomainButtonData(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState domainButtonState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainButtonState, "");
        this.label = str;
        this.state = domainButtonState;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState getState() {
        return this.state;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.label;
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState domainButtonState = this.state;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DomainButtonData(label=");
        sb.append(str);
        sb.append(", state=");
        sb.append(domainButtonState);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.label.hashCode() * 31) + this.state.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonData)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonData domainButtonData = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.label, domainButtonData.label) && this.state == domainButtonData.state;
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonData copy(java.lang.String label, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonData(label, state);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState getState() {
        return this.state;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonData copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonData domainButtonData, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState domainButtonState, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = domainButtonData.label;
        }
        if ((i & 2) != 0) {
            domainButtonState = domainButtonData.state;
        }
        return domainButtonData.copy(str, domainButtonState);
    }
}
