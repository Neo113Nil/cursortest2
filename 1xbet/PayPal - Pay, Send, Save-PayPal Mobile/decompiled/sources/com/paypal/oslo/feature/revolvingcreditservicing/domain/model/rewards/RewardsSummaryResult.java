package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardsSummaryResult;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;", "rewardsSummary", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;", "productFeatureOffers", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;", "rewardsContentUrls", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardsSummaryResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;", "getRewardsSummary", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;", "getProductFeatureOffers", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;", "getRewardsContentUrls"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RewardsSummaryResult {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary;

    public RewardsSummaryResult(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsSummary, "");
        this.rewardsSummary = rewardsSummary;
        this.productFeatureOffers = productFeatureOffers;
        this.rewardsContentUrls = rewardsContentUrls;
    }

    public /* synthetic */ RewardsSummaryResult(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(rewardsSummary, productFeatureOffers, (i & 4) != 0 ? null : rewardsContentUrls);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary getRewardsSummary() {
        return this.rewardsSummary;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers getProductFeatureOffers() {
        return this.productFeatureOffers;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls getRewardsContentUrls() {
        return this.rewardsContentUrls;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary = this.rewardsSummary;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers = this.productFeatureOffers;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls = this.rewardsContentUrls;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RewardsSummaryResult(rewardsSummary=");
        sb.append(rewardsSummary);
        sb.append(", productFeatureOffers=");
        sb.append(productFeatureOffers);
        sb.append(", rewardsContentUrls=");
        sb.append(rewardsContentUrls);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.rewardsSummary.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers = this.productFeatureOffers;
        int hashCode2 = productFeatureOffers == null ? 0 : productFeatureOffers.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls = this.rewardsContentUrls;
        return (((hashCode * 31) + hashCode2) * 31) + (rewardsContentUrls != null ? rewardsContentUrls.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsSummaryResult)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsSummaryResult rewardsSummaryResult = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsSummaryResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsSummary, rewardsSummaryResult.rewardsSummary) && kotlin.jvm.internal.Intrinsics.areEqual(this.productFeatureOffers, rewardsSummaryResult.productFeatureOffers) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsContentUrls, rewardsSummaryResult.rewardsContentUrls);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsSummaryResult copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsSummary, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsSummaryResult(rewardsSummary, productFeatureOffers, rewardsContentUrls);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls getRewardsContentUrls() {
        return this.rewardsContentUrls;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers getProductFeatureOffers() {
        return this.productFeatureOffers;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary getRewardsSummary() {
        return this.rewardsSummary;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsSummaryResult copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsSummaryResult rewardsSummaryResult, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            rewardsSummary = rewardsSummaryResult.rewardsSummary;
        }
        if ((i & 2) != 0) {
            productFeatureOffers = rewardsSummaryResult.productFeatureOffers;
        }
        if ((i & 4) != 0) {
            rewardsContentUrls = rewardsSummaryResult.rewardsContentUrls;
        }
        return rewardsSummaryResult.copy(rewardsSummary, productFeatureOffers, rewardsContentUrls);
    }
}
