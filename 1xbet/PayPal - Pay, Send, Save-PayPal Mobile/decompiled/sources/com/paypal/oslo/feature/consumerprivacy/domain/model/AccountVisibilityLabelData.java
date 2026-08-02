package com.paypal.oslo.feature.consumerprivacy.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityLabelData;", "", "", "allowDiscoverability", "<init>", "(Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityLabelData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getAllowDiscoverability"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AccountVisibilityLabelData {
    public static final int $stable = 0;
    private final java.lang.Boolean allowDiscoverability;

    public AccountVisibilityLabelData(java.lang.Boolean bool) {
        this.allowDiscoverability = bool;
    }

    public final java.lang.Boolean getAllowDiscoverability() {
        return this.allowDiscoverability;
    }

    public final java.lang.String toString() {
        java.lang.Boolean bool = this.allowDiscoverability;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AccountVisibilityLabelData(allowDiscoverability=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Boolean bool = this.allowDiscoverability;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityLabelData) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowDiscoverability, ((com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityLabelData) other).allowDiscoverability);
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityLabelData copy(java.lang.Boolean allowDiscoverability) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityLabelData(allowDiscoverability);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Boolean getAllowDiscoverability() {
        return this.allowDiscoverability;
    }

    public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityLabelData copy$default(com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityLabelData accountVisibilityLabelData, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = accountVisibilityLabelData.allowDiscoverability;
        }
        return accountVisibilityLabelData.copy(bool);
    }
}
