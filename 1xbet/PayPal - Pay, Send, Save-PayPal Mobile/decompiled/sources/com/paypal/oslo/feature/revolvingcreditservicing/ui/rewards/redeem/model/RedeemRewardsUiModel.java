package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b \b\u0080\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b(\u0010&J\u0094\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b1\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b\u0005\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b\u0006\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b8\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b9\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010!R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010#R\u001a\u0010\u000f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b>\u0010\u001dR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\b@\u0010&R\u001a\u0010\u0012\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\bA\u0010&R\u001a\u0010\u0013\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\bB\u0010&R\u0011\u0010D\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bC\u0010\u0019R\u0011\u0010E\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bE\u0010\u0019R\u0013\u0010G\u001a\u0004\u0018\u00010\u00078G¢\u0006\u0006\u001a\u0004\bF\u0010\u001dR\u0011\u0010I\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\bH\u0010&R\u0011\u0010K\u001a\u00020.8G¢\u0006\u0006\u001a\u0004\bJ\u00100R\u0011\u0010L\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bL\u0010\u0019R\u0011\u0010N\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bM\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "availableRewards", "", "isPayPalPlusEligible", "isPayPalPlusEnrolled", "", "payPalPlusConversionRate", "loyaltyProgramTermsUrl", "rewardsProgramTermsUrl", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardsCalculation;", "rewardsCalculation", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;", "selectedRedemptionOption", "enteredAmount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "validationError", "termsText", "termsLinkText", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardsCalculation;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "component2", "()Z", "component3", "()Ljava/lang/Boolean;", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardsCalculation;", "component8", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;", "component9", "component10", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "component11", "component12", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardsCalculation;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getAvailableRewards", "Z", "Ljava/lang/Boolean;", "Ljava/lang/String;", "getPayPalPlusConversionRate", "getLoyaltyProgramTermsUrl", "getRewardsProgramTermsUrl", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardsCalculation;", "getRewardsCalculation", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;", "getSelectedRedemptionOption", "getEnteredAmount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getValidationError", "getTermsText", "getTermsLinkText", "getShowLoyaltyTerms", "showLoyaltyTerms", "isSelectOptionError", "getTermsUrl", "termsUrl", "getRedeemButtonText", "redeemButtonText", "getPointsPerDollar", "pointsPerDollar", "isRedeemButtonEnabled", "getShouldShowRedeemTerms", "shouldShowRedeemTerms"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RedeemRewardsUiModel {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount availableRewards;
    private final java.lang.String enteredAmount;
    private final boolean isPayPalPlusEligible;
    private final java.lang.Boolean isPayPalPlusEnrolled;
    private final java.lang.String loyaltyProgramTermsUrl;
    private final java.lang.String payPalPlusConversionRate;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation rewardsCalculation;
    private final java.lang.String rewardsProgramTermsUrl;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption selectedRedemptionOption;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString termsLinkText;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString termsText;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString validationError;

    public RedeemRewardsUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, boolean z, java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation rewardsCalculation, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption, java.lang.String str4, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redemptionOption, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString3, "");
        this.availableRewards = currencyAmount;
        this.isPayPalPlusEligible = z;
        this.isPayPalPlusEnrolled = bool;
        this.payPalPlusConversionRate = str;
        this.loyaltyProgramTermsUrl = str2;
        this.rewardsProgramTermsUrl = str3;
        this.rewardsCalculation = rewardsCalculation;
        this.selectedRedemptionOption = redemptionOption;
        this.enteredAmount = str4;
        this.validationError = uiString;
        this.termsText = uiString2;
        this.termsLinkText = uiString3;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getAvailableRewards() {
        return this.availableRewards;
    }

    public final boolean isPayPalPlusEligible() {
        return this.isPayPalPlusEligible;
    }

    public final java.lang.Boolean isPayPalPlusEnrolled() {
        return this.isPayPalPlusEnrolled;
    }

    public final java.lang.String getPayPalPlusConversionRate() {
        return this.payPalPlusConversionRate;
    }

    public final java.lang.String getLoyaltyProgramTermsUrl() {
        return this.loyaltyProgramTermsUrl;
    }

    public final java.lang.String getRewardsProgramTermsUrl() {
        return this.rewardsProgramTermsUrl;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation getRewardsCalculation() {
        return this.rewardsCalculation;
    }

    public /* synthetic */ RedeemRewardsUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, boolean z, java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation rewardsCalculation, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption, java.lang.String str4, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(currencyAmount, z, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : rewardsCalculation, (i & 128) != 0 ? com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.NONE : redemptionOption, (i & 256) != 0 ? "0" : str4, (i & 512) != 0 ? null : uiString, (i & 1024) != 0 ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_rewards_redemption_terms, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null) : uiString2, (i & 2048) != 0 ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_rewards_redemption_paypal_plus_rewards_terms_link, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null) : uiString3);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption getSelectedRedemptionOption() {
        return this.selectedRedemptionOption;
    }

    public final java.lang.String getEnteredAmount() {
        return this.enteredAmount;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getValidationError() {
        return this.validationError;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getTermsText() {
        return this.termsText;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getTermsLinkText() {
        return this.termsLinkText;
    }

    public final boolean getShowLoyaltyTerms() {
        return this.selectedRedemptionOption == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.PAYPAL_PLUS_POINTS && this.loyaltyProgramTermsUrl != null;
    }

    public final boolean isSelectOptionError() {
        return kotlin.jvm.internal.Intrinsics.areEqual(this.validationError, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_rewards_redemption_select_redemption_option_error, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }

    public final java.lang.String getTermsUrl() {
        if (getShouldShowRedeemTerms()) {
            return this.loyaltyProgramTermsUrl;
        }
        if (this.isPayPalPlusEligible) {
            return null;
        }
        return this.rewardsProgramTermsUrl;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getRedeemButtonText() {
        if (this.selectedRedemptionOption == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.PAYPAL_PLUS_POINTS) {
            int i = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_rewards_redemption_redeem_points_button;
            java.lang.String str = this.enteredAmount;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation rewardsCalculation = this.rewardsCalculation;
            java.lang.Float percent = rewardsCalculation != null ? rewardsCalculation.getPercent() : null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation rewardsCalculation2 = this.rewardsCalculation;
            java.lang.String roundingStrategy = rewardsCalculation2 != null ? rewardsCalculation2.getRoundingStrategy() : null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation rewardsCalculation3 = this.rewardsCalculation;
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i, new java.lang.Object[]{java.lang.String.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.utils.RewardsUtilsKt.calculatePoints(str, percent, roundingStrategy, rewardsCalculation3 != null ? rewardsCalculation3.getScale() : null))}, null, false, 12, null);
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_rewards_redemption_redeem_button, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final int getPointsPerDollar() {
        java.lang.Float percent;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation rewardsCalculation = this.rewardsCalculation;
        return (int) (((rewardsCalculation == null || (percent = rewardsCalculation.getPercent()) == null) ? 0.0f : percent.floatValue()) * 100.0f);
    }

    public final boolean isRedeemButtonEnabled() {
        return com.paypal.oslo.feature.revolvingcreditservicing.utils.NumberUtilsKt.isValidPositiveAmount(this.enteredAmount) && this.validationError == null;
    }

    public final boolean getShouldShowRedeemTerms() {
        java.lang.Boolean bool = this.isPayPalPlusEnrolled;
        return (bool == null || bool.booleanValue() || !this.isPayPalPlusEligible) ? false : true;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.availableRewards;
        boolean z = this.isPayPalPlusEligible;
        java.lang.Boolean bool = this.isPayPalPlusEnrolled;
        java.lang.String str = this.payPalPlusConversionRate;
        java.lang.String str2 = this.loyaltyProgramTermsUrl;
        java.lang.String str3 = this.rewardsProgramTermsUrl;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation rewardsCalculation = this.rewardsCalculation;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption = this.selectedRedemptionOption;
        java.lang.String str4 = this.enteredAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.validationError;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = this.termsText;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3 = this.termsLinkText;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RedeemRewardsUiModel(availableRewards=");
        sb.append(currencyAmount);
        sb.append(", isPayPalPlusEligible=");
        sb.append(z);
        sb.append(", isPayPalPlusEnrolled=");
        sb.append(bool);
        sb.append(", payPalPlusConversionRate=");
        sb.append(str);
        sb.append(", loyaltyProgramTermsUrl=");
        sb.append(str2);
        sb.append(", rewardsProgramTermsUrl=");
        sb.append(str3);
        sb.append(", rewardsCalculation=");
        sb.append(rewardsCalculation);
        sb.append(", selectedRedemptionOption=");
        sb.append(redemptionOption);
        sb.append(", enteredAmount=");
        sb.append(str4);
        sb.append(", validationError=");
        sb.append(uiString);
        sb.append(", termsText=");
        sb.append(uiString2);
        sb.append(", termsLinkText=");
        sb.append(uiString3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.availableRewards.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.isPayPalPlusEligible);
        java.lang.Boolean bool = this.isPayPalPlusEnrolled;
        int hashCode3 = bool == null ? 0 : bool.hashCode();
        java.lang.String str = this.payPalPlusConversionRate;
        int hashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.loyaltyProgramTermsUrl;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.rewardsProgramTermsUrl;
        int hashCode6 = str3 == null ? 0 : str3.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation rewardsCalculation = this.rewardsCalculation;
        int hashCode7 = rewardsCalculation == null ? 0 : rewardsCalculation.hashCode();
        int hashCode8 = this.selectedRedemptionOption.hashCode();
        int hashCode9 = this.enteredAmount.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.validationError;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (uiString != null ? uiString.hashCode() : 0)) * 31) + this.termsText.hashCode()) * 31) + this.termsLinkText.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel redeemRewardsUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.availableRewards, redeemRewardsUiModel.availableRewards) && this.isPayPalPlusEligible == redeemRewardsUiModel.isPayPalPlusEligible && kotlin.jvm.internal.Intrinsics.areEqual(this.isPayPalPlusEnrolled, redeemRewardsUiModel.isPayPalPlusEnrolled) && kotlin.jvm.internal.Intrinsics.areEqual(this.payPalPlusConversionRate, redeemRewardsUiModel.payPalPlusConversionRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.loyaltyProgramTermsUrl, redeemRewardsUiModel.loyaltyProgramTermsUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsProgramTermsUrl, redeemRewardsUiModel.rewardsProgramTermsUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsCalculation, redeemRewardsUiModel.rewardsCalculation) && this.selectedRedemptionOption == redeemRewardsUiModel.selectedRedemptionOption && kotlin.jvm.internal.Intrinsics.areEqual(this.enteredAmount, redeemRewardsUiModel.enteredAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.validationError, redeemRewardsUiModel.validationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.termsText, redeemRewardsUiModel.termsText) && kotlin.jvm.internal.Intrinsics.areEqual(this.termsLinkText, redeemRewardsUiModel.termsLinkText);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount availableRewards, boolean isPayPalPlusEligible, java.lang.Boolean isPayPalPlusEnrolled, java.lang.String payPalPlusConversionRate, java.lang.String loyaltyProgramTermsUrl, java.lang.String rewardsProgramTermsUrl, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation rewardsCalculation, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption selectedRedemptionOption, java.lang.String enteredAmount, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString validationError, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString termsText, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString termsLinkText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableRewards, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedRedemptionOption, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enteredAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsLinkText, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel(availableRewards, isPayPalPlusEligible, isPayPalPlusEnrolled, payPalPlusConversionRate, loyaltyProgramTermsUrl, rewardsProgramTermsUrl, rewardsCalculation, selectedRedemptionOption, enteredAmount, validationError, termsText, termsLinkText);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getEnteredAmount() {
        return this.enteredAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption getSelectedRedemptionOption() {
        return this.selectedRedemptionOption;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation getRewardsCalculation() {
        return this.rewardsCalculation;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getRewardsProgramTermsUrl() {
        return this.rewardsProgramTermsUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getLoyaltyProgramTermsUrl() {
        return this.loyaltyProgramTermsUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPayPalPlusConversionRate() {
        return this.payPalPlusConversionRate;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Boolean getIsPayPalPlusEnrolled() {
        return this.isPayPalPlusEnrolled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsPayPalPlusEligible() {
        return this.isPayPalPlusEligible;
    }

    /* renamed from: component12, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getTermsLinkText() {
        return this.termsLinkText;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getTermsText() {
        return this.termsText;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getValidationError() {
        return this.validationError;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getAvailableRewards() {
        return this.availableRewards;
    }
}
