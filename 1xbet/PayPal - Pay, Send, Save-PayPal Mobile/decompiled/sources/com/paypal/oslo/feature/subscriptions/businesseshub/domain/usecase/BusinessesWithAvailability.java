package com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/usecase/BusinessesWithAvailability;", "", "", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/LinkedBusinessAgreementItem;", "businesses", "", "shouldShowLinkEntryPoints", "<init>", "(Ljava/util/List;Z)V", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/usecase/BusinessesWithAvailability;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getBusinesses", "Z", "getShouldShowLinkEntryPoints"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BusinessesWithAvailability {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem> businesses;
    private final boolean shouldShowLinkEntryPoints;

    public BusinessesWithAvailability(java.util.List<com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.businesses = list;
        this.shouldShowLinkEntryPoints = z;
    }

    public final java.util.List<com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem> getBusinesses() {
        return this.businesses;
    }

    public final boolean getShouldShowLinkEntryPoints() {
        return this.shouldShowLinkEntryPoints;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem> list = this.businesses;
        boolean z = this.shouldShowLinkEntryPoints;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BusinessesWithAvailability(businesses=");
        sb.append(list);
        sb.append(", shouldShowLinkEntryPoints=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.businesses.hashCode() * 31) + java.lang.Boolean.hashCode(this.shouldShowLinkEntryPoints);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.BusinessesWithAvailability)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.BusinessesWithAvailability businessesWithAvailability = (com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.BusinessesWithAvailability) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.businesses, businessesWithAvailability.businesses) && this.shouldShowLinkEntryPoints == businessesWithAvailability.shouldShowLinkEntryPoints;
    }

    public final com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.BusinessesWithAvailability copy(java.util.List<com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem> businesses, boolean shouldShowLinkEntryPoints) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businesses, "");
        return new com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.BusinessesWithAvailability(businesses, shouldShowLinkEntryPoints);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldShowLinkEntryPoints() {
        return this.shouldShowLinkEntryPoints;
    }

    public final java.util.List<com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem> component1() {
        return this.businesses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.BusinessesWithAvailability copy$default(com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.BusinessesWithAvailability businessesWithAvailability, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = businessesWithAvailability.businesses;
        }
        if ((i & 2) != 0) {
            z = businessesWithAvailability.shouldShowLinkEntryPoints;
        }
        return businessesWithAvailability.copy(list, z);
    }
}
