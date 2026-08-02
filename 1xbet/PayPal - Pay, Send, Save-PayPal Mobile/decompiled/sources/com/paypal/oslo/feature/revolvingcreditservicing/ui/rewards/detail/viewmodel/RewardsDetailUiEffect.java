package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "NavigateToRedeemRewards", "NavigateToRewardsProgramTerms", "NavigateToLearnMore", "NavigateToMakePaymentFromPastDueError", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect$NavigateToLearnMore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect$NavigateToMakePaymentFromPastDueError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect$NavigateToRedeemRewards;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect$NavigateToRewardsProgramTerms;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class RewardsDetailUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private RewardsDetailUiEffect(java.lang.String str) {
        this.name = str;
    }

    public /* synthetic */ RewardsDetailUiEffect(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "RewardsDetailUiEffect" : str, null);
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateBack();

        public final int hashCode() {
            return -2089758241;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J\u008a\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b.\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b\t\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b\n\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b\u000b\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b7\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b8\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b9\u0010\u0019R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b:\u0010\u0019R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b<\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect$NavigateToRedeemRewards;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "availableRewards", "", "creditAccountId", "", "isPayPalPlusEligible", "isPayPalPlusEnrolled", "isPayPalPlusCbmcEnabled", "payPalPlusConversionRate", "rewardsProgramTermsUrl", "loyaltyProgramLearnMoreUrl", "loyaltyProgramTermsUrl", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardsCalculation;", "rewardsCalculation", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardsCalculation;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "component3", "()Ljava/lang/String;", "component4", "()Z", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardsCalculation;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardsCalculation;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect$NavigateToRedeemRewards;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getAvailableRewards", "Ljava/lang/String;", "getCreditAccountId", "Z", "Ljava/lang/Boolean;", "getPayPalPlusConversionRate", "getRewardsProgramTermsUrl", "getLoyaltyProgramLearnMoreUrl", "getLoyaltyProgramTermsUrl", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardsCalculation;", "getRewardsCalculation"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToRedeemRewards extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount availableRewards;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        private final boolean isPayPalPlusCbmcEnabled;
        private final boolean isPayPalPlusEligible;
        private final java.lang.Boolean isPayPalPlusEnrolled;
        private final java.lang.String loyaltyProgramLearnMoreUrl;
        private final java.lang.String loyaltyProgramTermsUrl;
        private final java.lang.String payPalPlusConversionRate;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation rewardsCalculation;
        private final java.lang.String rewardsProgramTermsUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToRedeemRewards(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.lang.String str, boolean z, java.lang.Boolean bool, boolean z2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation rewardsCalculation) {
            super("NavigateToRedeemRewards", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.creditProductIdentifier = creditProductIdentifier;
            this.availableRewards = currencyAmount;
            this.creditAccountId = str;
            this.isPayPalPlusEligible = z;
            this.isPayPalPlusEnrolled = bool;
            this.isPayPalPlusCbmcEnabled = z2;
            this.payPalPlusConversionRate = str2;
            this.rewardsProgramTermsUrl = str3;
            this.loyaltyProgramLearnMoreUrl = str4;
            this.loyaltyProgramTermsUrl = str5;
            this.rewardsCalculation = rewardsCalculation;
        }

        public /* synthetic */ NavigateToRedeemRewards(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.lang.String str, boolean z, java.lang.Boolean bool, boolean z2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation rewardsCalculation, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(creditProductIdentifier, currencyAmount, str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : rewardsCalculation);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getAvailableRewards() {
            return this.availableRewards;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final boolean isPayPalPlusEligible() {
            return this.isPayPalPlusEligible;
        }

        public final java.lang.Boolean isPayPalPlusEnrolled() {
            return this.isPayPalPlusEnrolled;
        }

        public final boolean isPayPalPlusCbmcEnabled() {
            return this.isPayPalPlusCbmcEnabled;
        }

        public final java.lang.String getPayPalPlusConversionRate() {
            return this.payPalPlusConversionRate;
        }

        public final java.lang.String getRewardsProgramTermsUrl() {
            return this.rewardsProgramTermsUrl;
        }

        public final java.lang.String getLoyaltyProgramLearnMoreUrl() {
            return this.loyaltyProgramLearnMoreUrl;
        }

        public final java.lang.String getLoyaltyProgramTermsUrl() {
            return this.loyaltyProgramTermsUrl;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation getRewardsCalculation() {
            return this.rewardsCalculation;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.availableRewards;
            java.lang.String str = this.creditAccountId;
            boolean z = this.isPayPalPlusEligible;
            java.lang.Boolean bool = this.isPayPalPlusEnrolled;
            boolean z2 = this.isPayPalPlusCbmcEnabled;
            java.lang.String str2 = this.payPalPlusConversionRate;
            java.lang.String str3 = this.rewardsProgramTermsUrl;
            java.lang.String str4 = this.loyaltyProgramLearnMoreUrl;
            java.lang.String str5 = this.loyaltyProgramTermsUrl;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation rewardsCalculation = this.rewardsCalculation;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToRedeemRewards(creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(", availableRewards=");
            sb.append(currencyAmount);
            sb.append(", creditAccountId=");
            sb.append(str);
            sb.append(", isPayPalPlusEligible=");
            sb.append(z);
            sb.append(", isPayPalPlusEnrolled=");
            sb.append(bool);
            sb.append(", isPayPalPlusCbmcEnabled=");
            sb.append(z2);
            sb.append(", payPalPlusConversionRate=");
            sb.append(str2);
            sb.append(", rewardsProgramTermsUrl=");
            sb.append(str3);
            sb.append(", loyaltyProgramLearnMoreUrl=");
            sb.append(str4);
            sb.append(", loyaltyProgramTermsUrl=");
            sb.append(str5);
            sb.append(", rewardsCalculation=");
            sb.append(rewardsCalculation);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.creditProductIdentifier.hashCode();
            int hashCode2 = this.availableRewards.hashCode();
            int hashCode3 = this.creditAccountId.hashCode();
            int hashCode4 = java.lang.Boolean.hashCode(this.isPayPalPlusEligible);
            java.lang.Boolean bool = this.isPayPalPlusEnrolled;
            int hashCode5 = bool == null ? 0 : bool.hashCode();
            int hashCode6 = java.lang.Boolean.hashCode(this.isPayPalPlusCbmcEnabled);
            java.lang.String str = this.payPalPlusConversionRate;
            int hashCode7 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.rewardsProgramTermsUrl;
            int hashCode8 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.loyaltyProgramLearnMoreUrl;
            int hashCode9 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.loyaltyProgramTermsUrl;
            int hashCode10 = str4 == null ? 0 : str4.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation rewardsCalculation = this.rewardsCalculation;
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (rewardsCalculation != null ? rewardsCalculation.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToRedeemRewards)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToRedeemRewards navigateToRedeemRewards = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToRedeemRewards) other;
            return this.creditProductIdentifier == navigateToRedeemRewards.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.availableRewards, navigateToRedeemRewards.availableRewards) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, navigateToRedeemRewards.creditAccountId) && this.isPayPalPlusEligible == navigateToRedeemRewards.isPayPalPlusEligible && kotlin.jvm.internal.Intrinsics.areEqual(this.isPayPalPlusEnrolled, navigateToRedeemRewards.isPayPalPlusEnrolled) && this.isPayPalPlusCbmcEnabled == navigateToRedeemRewards.isPayPalPlusCbmcEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.payPalPlusConversionRate, navigateToRedeemRewards.payPalPlusConversionRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsProgramTermsUrl, navigateToRedeemRewards.rewardsProgramTermsUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.loyaltyProgramLearnMoreUrl, navigateToRedeemRewards.loyaltyProgramLearnMoreUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.loyaltyProgramTermsUrl, navigateToRedeemRewards.loyaltyProgramTermsUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsCalculation, navigateToRedeemRewards.rewardsCalculation);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToRedeemRewards copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount availableRewards, java.lang.String creditAccountId, boolean isPayPalPlusEligible, java.lang.Boolean isPayPalPlusEnrolled, boolean isPayPalPlusCbmcEnabled, java.lang.String payPalPlusConversionRate, java.lang.String rewardsProgramTermsUrl, java.lang.String loyaltyProgramLearnMoreUrl, java.lang.String loyaltyProgramTermsUrl, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation rewardsCalculation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableRewards, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToRedeemRewards(creditProductIdentifier, availableRewards, creditAccountId, isPayPalPlusEligible, isPayPalPlusEnrolled, isPayPalPlusCbmcEnabled, payPalPlusConversionRate, rewardsProgramTermsUrl, loyaltyProgramLearnMoreUrl, loyaltyProgramTermsUrl, rewardsCalculation);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getLoyaltyProgramLearnMoreUrl() {
            return this.loyaltyProgramLearnMoreUrl;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getRewardsProgramTermsUrl() {
            return this.rewardsProgramTermsUrl;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getPayPalPlusConversionRate() {
            return this.payPalPlusConversionRate;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsPayPalPlusCbmcEnabled() {
            return this.isPayPalPlusCbmcEnabled;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Boolean getIsPayPalPlusEnrolled() {
            return this.isPayPalPlusEnrolled;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsPayPalPlusEligible() {
            return this.isPayPalPlusEligible;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getAvailableRewards() {
            return this.availableRewards;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation getRewardsCalculation() {
            return this.rewardsCalculation;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getLoyaltyProgramTermsUrl() {
            return this.loyaltyProgramTermsUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect$NavigateToRewardsProgramTerms;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect$NavigateToRewardsProgramTerms;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToRewardsProgramTerms extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToRewardsProgramTerms(java.lang.String str) {
            super("NavigateToRewardsProgramTerms", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToRewardsProgramTerms(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToRewardsProgramTerms) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToRewardsProgramTerms) other).url);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToRewardsProgramTerms copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToRewardsProgramTerms(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToRewardsProgramTerms copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToRewardsProgramTerms navigateToRewardsProgramTerms, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToRewardsProgramTerms.url;
            }
            return navigateToRewardsProgramTerms.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect$NavigateToLearnMore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect$NavigateToLearnMore;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToLearnMore extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToLearnMore(java.lang.String str) {
            super("NavigateToLearnMore", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToLearnMore(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToLearnMore) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToLearnMore) other).url);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToLearnMore copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToLearnMore(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToLearnMore copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToLearnMore navigateToLearnMore, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToLearnMore.url;
            }
            return navigateToLearnMore.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect$NavigateToMakePaymentFromPastDueError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect;", "", "creditAccountId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect$NavigateToMakePaymentFromPastDueError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToMakePaymentFromPastDueError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;

        public NavigateToMakePaymentFromPastDueError(java.lang.String str) {
            super("NavigateToMakePaymentFromPastDueError", null);
            this.creditAccountId = str;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToMakePaymentFromPastDueError(creditAccountId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.creditAccountId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToMakePaymentFromPastDueError) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToMakePaymentFromPastDueError) other).creditAccountId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToMakePaymentFromPastDueError copy(java.lang.String creditAccountId) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToMakePaymentFromPastDueError(creditAccountId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToMakePaymentFromPastDueError copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToMakePaymentFromPastDueError navigateToMakePaymentFromPastDueError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToMakePaymentFromPastDueError.creditAccountId;
            }
            return navigateToMakePaymentFromPastDueError.copy(str);
        }
    }

    public /* synthetic */ RewardsDetailUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
