package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/HeaderType;", "", "DiscreetOfferProgress", "MerchantLogo", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/HeaderType$DiscreetOfferProgress;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/HeaderType$MerchantLogo;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface HeaderType {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/HeaderType$DiscreetOfferProgress;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/HeaderType;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/rewardsprogressavatar/RewardsProgressAvatarUiData;", "progressAvatar", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/rewardsprogressavatar/RewardsProgressAvatarUiData;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/rewardsprogressavatar/RewardsProgressAvatarUiData;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/rewardsprogressavatar/RewardsProgressAvatarUiData;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/HeaderType$DiscreetOfferProgress;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/rewardsprogressavatar/RewardsProgressAvatarUiData;", "getProgressAvatar"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DiscreetOfferProgress implements com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.rewardsprogressavatar.RewardsProgressAvatarUiData progressAvatar;

        public DiscreetOfferProgress(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.rewardsprogressavatar.RewardsProgressAvatarUiData rewardsProgressAvatarUiData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsProgressAvatarUiData, "");
            this.progressAvatar = rewardsProgressAvatarUiData;
        }

        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.rewardsprogressavatar.RewardsProgressAvatarUiData getProgressAvatar() {
            return this.progressAvatar;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.rewardsprogressavatar.RewardsProgressAvatarUiData rewardsProgressAvatarUiData = this.progressAvatar;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DiscreetOfferProgress(progressAvatar=");
            sb.append(rewardsProgressAvatarUiData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.progressAvatar.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType.DiscreetOfferProgress) && kotlin.jvm.internal.Intrinsics.areEqual(this.progressAvatar, ((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType.DiscreetOfferProgress) other).progressAvatar);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType.DiscreetOfferProgress copy(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.rewardsprogressavatar.RewardsProgressAvatarUiData progressAvatar) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressAvatar, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType.DiscreetOfferProgress(progressAvatar);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.rewardsprogressavatar.RewardsProgressAvatarUiData getProgressAvatar() {
            return this.progressAvatar;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType.DiscreetOfferProgress copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType.DiscreetOfferProgress discreetOfferProgress, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.rewardsprogressavatar.RewardsProgressAvatarUiData rewardsProgressAvatarUiData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                rewardsProgressAvatarUiData = discreetOfferProgress.progressAvatar;
            }
            return discreetOfferProgress.copy(rewardsProgressAvatarUiData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/HeaderType$MerchantLogo;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/HeaderType;", "", "logoUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/HeaderType$MerchantLogo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLogoUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MerchantLogo implements com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType {
        public static final int $stable = 0;
        private final java.lang.String logoUrl;

        public MerchantLogo(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.logoUrl = str;
        }

        public final java.lang.String getLogoUrl() {
            return this.logoUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.logoUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MerchantLogo(logoUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.logoUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType.MerchantLogo) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, ((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType.MerchantLogo) other).logoUrl);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType.MerchantLogo copy(java.lang.String logoUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoUrl, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType.MerchantLogo(logoUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getLogoUrl() {
            return this.logoUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType.MerchantLogo copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType.MerchantLogo merchantLogo, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = merchantLogo.logoUrl;
            }
            return merchantLogo.copy(str);
        }
    }
}
