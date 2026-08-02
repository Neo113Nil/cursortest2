package com.paypal.oslo.feature.businesshome.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/model/BusinessHomeFeed;", "", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsightsError;", "Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsights;", "merchantInsights", "", "showAccountSetupCard", "<init>", "(Larrow/core/Either;Z)V", "component1", "()Larrow/core/Either;", "component2", "()Z", "copy", "(Larrow/core/Either;Z)Lcom/paypal/oslo/feature/businesshome/domain/model/BusinessHomeFeed;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Larrow/core/Either;", "getMerchantInsights", "Z", "getShowAccountSetupCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BusinessHomeFeed {
    public static final int $stable = 8;
    private final arrow.core.Either<com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError, com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights> merchantInsights;
    private final boolean showAccountSetupCard;

    /* JADX WARN: Multi-variable type inference failed */
    public BusinessHomeFeed(arrow.core.Either<? extends com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError, com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights> either, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        this.merchantInsights = either;
        this.showAccountSetupCard = z;
    }

    public final arrow.core.Either<com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError, com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights> getMerchantInsights() {
        return this.merchantInsights;
    }

    public final boolean getShowAccountSetupCard() {
        return this.showAccountSetupCard;
    }

    public final java.lang.String toString() {
        arrow.core.Either<com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError, com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights> either = this.merchantInsights;
        boolean z = this.showAccountSetupCard;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BusinessHomeFeed(merchantInsights=");
        sb.append(either);
        sb.append(", showAccountSetupCard=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.merchantInsights.hashCode() * 31) + java.lang.Boolean.hashCode(this.showAccountSetupCard);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesshome.domain.model.BusinessHomeFeed)) {
            return false;
        }
        com.paypal.oslo.feature.businesshome.domain.model.BusinessHomeFeed businessHomeFeed = (com.paypal.oslo.feature.businesshome.domain.model.BusinessHomeFeed) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.merchantInsights, businessHomeFeed.merchantInsights) && this.showAccountSetupCard == businessHomeFeed.showAccountSetupCard;
    }

    public final com.paypal.oslo.feature.businesshome.domain.model.BusinessHomeFeed copy(arrow.core.Either<? extends com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError, com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights> merchantInsights, boolean showAccountSetupCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantInsights, "");
        return new com.paypal.oslo.feature.businesshome.domain.model.BusinessHomeFeed(merchantInsights, showAccountSetupCard);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowAccountSetupCard() {
        return this.showAccountSetupCard;
    }

    public final arrow.core.Either<com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError, com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights> component1() {
        return this.merchantInsights;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.businesshome.domain.model.BusinessHomeFeed copy$default(com.paypal.oslo.feature.businesshome.domain.model.BusinessHomeFeed businessHomeFeed, arrow.core.Either either, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            either = businessHomeFeed.merchantInsights;
        }
        if ((i & 2) != 0) {
            z = businessHomeFeed.showAccountSetupCard;
        }
        return businessHomeFeed.copy(either, z);
    }
}
