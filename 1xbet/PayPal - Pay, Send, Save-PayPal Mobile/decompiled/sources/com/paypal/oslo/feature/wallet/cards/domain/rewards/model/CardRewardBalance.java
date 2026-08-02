package com.paypal.oslo.feature.wallet.cards.domain.rewards.model;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b.\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0094\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b/\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b8\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b9\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b<\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b>\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\b?\u0010$R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\b\u0013\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardBalance;", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardDenomination;", "denomination", "", "conversionFactor", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TARGET_CURRENCY_CODE, "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "targetCurrencyBalance", "minimumTargetCurrencyRewardsSpend", "maximumTargetCurrencyRewardsSpend", "", "targetCurrencyDecimalPrecision", "programCurrencyDecimalPrecision", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardRoundingMode;", "targetCurrencyRoundingMode", "programCurrencyRoundingMode", "", "isMonetary", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardDenomination;Ljava/lang/Double;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardRoundingMode;Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardRoundingMode;Ljava/lang/Boolean;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardDenomination;", "component2", "()Ljava/lang/Double;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "component5", "component6", "component7", "()Ljava/lang/Integer;", "component8", "component9", "()Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardRoundingMode;", "component10", "component11", "()Ljava/lang/Boolean;", "copy", "(Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardDenomination;Ljava/lang/Double;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardRoundingMode;Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardRoundingMode;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardBalance;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardDenomination;", "getDenomination", "Ljava/lang/Double;", "getConversionFactor", "Ljava/lang/String;", "getTargetCurrencyCode", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getTargetCurrencyBalance", "getMinimumTargetCurrencyRewardsSpend", "getMaximumTargetCurrencyRewardsSpend", "Ljava/lang/Integer;", "getTargetCurrencyDecimalPrecision", "getProgramCurrencyDecimalPrecision", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardRoundingMode;", "getTargetCurrencyRoundingMode", "getProgramCurrencyRoundingMode", "Ljava/lang/Boolean;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CardRewardBalance {
    public static final int $stable = 8;
    private final java.lang.Double conversionFactor;
    private final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination denomination;
    private final java.lang.Boolean isMonetary;
    private final com.paypal.oslo.feature.wallet.common.domain.model.Money maximumTargetCurrencyRewardsSpend;
    private final com.paypal.oslo.feature.wallet.common.domain.model.Money minimumTargetCurrencyRewardsSpend;
    private final java.lang.Integer programCurrencyDecimalPrecision;
    private final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode programCurrencyRoundingMode;
    private final com.paypal.oslo.feature.wallet.common.domain.model.Money targetCurrencyBalance;
    private final java.lang.String targetCurrencyCode;
    private final java.lang.Integer targetCurrencyDecimalPrecision;
    private final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode targetCurrencyRoundingMode;

    public CardRewardBalance(com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination cardRewardDenomination, java.lang.Double d, java.lang.String str, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.common.domain.model.Money money2, com.paypal.oslo.feature.wallet.common.domain.model.Money money3, java.lang.Integer num, java.lang.Integer num2, com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode cardRewardRoundingMode, com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode cardRewardRoundingMode2, java.lang.Boolean bool) {
        this.denomination = cardRewardDenomination;
        this.conversionFactor = d;
        this.targetCurrencyCode = str;
        this.targetCurrencyBalance = money;
        this.minimumTargetCurrencyRewardsSpend = money2;
        this.maximumTargetCurrencyRewardsSpend = money3;
        this.targetCurrencyDecimalPrecision = num;
        this.programCurrencyDecimalPrecision = num2;
        this.targetCurrencyRoundingMode = cardRewardRoundingMode;
        this.programCurrencyRoundingMode = cardRewardRoundingMode2;
        this.isMonetary = bool;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination getDenomination() {
        return this.denomination;
    }

    public final java.lang.Double getConversionFactor() {
        return this.conversionFactor;
    }

    public final java.lang.String getTargetCurrencyCode() {
        return this.targetCurrencyCode;
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getTargetCurrencyBalance() {
        return this.targetCurrencyBalance;
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getMinimumTargetCurrencyRewardsSpend() {
        return this.minimumTargetCurrencyRewardsSpend;
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getMaximumTargetCurrencyRewardsSpend() {
        return this.maximumTargetCurrencyRewardsSpend;
    }

    public final java.lang.Integer getTargetCurrencyDecimalPrecision() {
        return this.targetCurrencyDecimalPrecision;
    }

    public final java.lang.Integer getProgramCurrencyDecimalPrecision() {
        return this.programCurrencyDecimalPrecision;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode getTargetCurrencyRoundingMode() {
        return this.targetCurrencyRoundingMode;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode getProgramCurrencyRoundingMode() {
        return this.programCurrencyRoundingMode;
    }

    public final java.lang.Boolean isMonetary() {
        return this.isMonetary;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination cardRewardDenomination = this.denomination;
        java.lang.Double d = this.conversionFactor;
        java.lang.String str = this.targetCurrencyCode;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.targetCurrencyBalance;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money2 = this.minimumTargetCurrencyRewardsSpend;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money3 = this.maximumTargetCurrencyRewardsSpend;
        java.lang.Integer num = this.targetCurrencyDecimalPrecision;
        java.lang.Integer num2 = this.programCurrencyDecimalPrecision;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode cardRewardRoundingMode = this.targetCurrencyRoundingMode;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode cardRewardRoundingMode2 = this.programCurrencyRoundingMode;
        java.lang.Boolean bool = this.isMonetary;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardRewardBalance(denomination=");
        sb.append(cardRewardDenomination);
        sb.append(", conversionFactor=");
        sb.append(d);
        sb.append(", targetCurrencyCode=");
        sb.append(str);
        sb.append(", targetCurrencyBalance=");
        sb.append(money);
        sb.append(", minimumTargetCurrencyRewardsSpend=");
        sb.append(money2);
        sb.append(", maximumTargetCurrencyRewardsSpend=");
        sb.append(money3);
        sb.append(", targetCurrencyDecimalPrecision=");
        sb.append(num);
        sb.append(", programCurrencyDecimalPrecision=");
        sb.append(num2);
        sb.append(", targetCurrencyRoundingMode=");
        sb.append(cardRewardRoundingMode);
        sb.append(", programCurrencyRoundingMode=");
        sb.append(cardRewardRoundingMode2);
        sb.append(", isMonetary=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination cardRewardDenomination = this.denomination;
        int hashCode = cardRewardDenomination == null ? 0 : cardRewardDenomination.hashCode();
        java.lang.Double d = this.conversionFactor;
        int hashCode2 = d == null ? 0 : d.hashCode();
        java.lang.String str = this.targetCurrencyCode;
        int hashCode3 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.targetCurrencyBalance;
        int hashCode4 = money == null ? 0 : money.hashCode();
        com.paypal.oslo.feature.wallet.common.domain.model.Money money2 = this.minimumTargetCurrencyRewardsSpend;
        int hashCode5 = money2 == null ? 0 : money2.hashCode();
        com.paypal.oslo.feature.wallet.common.domain.model.Money money3 = this.maximumTargetCurrencyRewardsSpend;
        int hashCode6 = money3 == null ? 0 : money3.hashCode();
        java.lang.Integer num = this.targetCurrencyDecimalPrecision;
        int hashCode7 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.programCurrencyDecimalPrecision;
        int hashCode8 = num2 == null ? 0 : num2.hashCode();
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode cardRewardRoundingMode = this.targetCurrencyRoundingMode;
        int hashCode9 = cardRewardRoundingMode == null ? 0 : cardRewardRoundingMode.hashCode();
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode cardRewardRoundingMode2 = this.programCurrencyRoundingMode;
        int hashCode10 = cardRewardRoundingMode2 == null ? 0 : cardRewardRoundingMode2.hashCode();
        java.lang.Boolean bool = this.isMonetary;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardBalance)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardBalance cardRewardBalance = (com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardBalance) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.denomination, cardRewardBalance.denomination) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.conversionFactor, (java.lang.Object) cardRewardBalance.conversionFactor) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetCurrencyCode, cardRewardBalance.targetCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetCurrencyBalance, cardRewardBalance.targetCurrencyBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.minimumTargetCurrencyRewardsSpend, cardRewardBalance.minimumTargetCurrencyRewardsSpend) && kotlin.jvm.internal.Intrinsics.areEqual(this.maximumTargetCurrencyRewardsSpend, cardRewardBalance.maximumTargetCurrencyRewardsSpend) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetCurrencyDecimalPrecision, cardRewardBalance.targetCurrencyDecimalPrecision) && kotlin.jvm.internal.Intrinsics.areEqual(this.programCurrencyDecimalPrecision, cardRewardBalance.programCurrencyDecimalPrecision) && this.targetCurrencyRoundingMode == cardRewardBalance.targetCurrencyRoundingMode && this.programCurrencyRoundingMode == cardRewardBalance.programCurrencyRoundingMode && kotlin.jvm.internal.Intrinsics.areEqual(this.isMonetary, cardRewardBalance.isMonetary);
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardBalance copy(com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination denomination, java.lang.Double conversionFactor, java.lang.String targetCurrencyCode, com.paypal.oslo.feature.wallet.common.domain.model.Money targetCurrencyBalance, com.paypal.oslo.feature.wallet.common.domain.model.Money minimumTargetCurrencyRewardsSpend, com.paypal.oslo.feature.wallet.common.domain.model.Money maximumTargetCurrencyRewardsSpend, java.lang.Integer targetCurrencyDecimalPrecision, java.lang.Integer programCurrencyDecimalPrecision, com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode targetCurrencyRoundingMode, com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode programCurrencyRoundingMode, java.lang.Boolean isMonetary) {
        return new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardBalance(denomination, conversionFactor, targetCurrencyCode, targetCurrencyBalance, minimumTargetCurrencyRewardsSpend, maximumTargetCurrencyRewardsSpend, targetCurrencyDecimalPrecision, programCurrencyDecimalPrecision, targetCurrencyRoundingMode, programCurrencyRoundingMode, isMonetary);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode getTargetCurrencyRoundingMode() {
        return this.targetCurrencyRoundingMode;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.Integer getProgramCurrencyDecimalPrecision() {
        return this.programCurrencyDecimalPrecision;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.Integer getTargetCurrencyDecimalPrecision() {
        return this.targetCurrencyDecimalPrecision;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getMaximumTargetCurrencyRewardsSpend() {
        return this.maximumTargetCurrencyRewardsSpend;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getMinimumTargetCurrencyRewardsSpend() {
        return this.minimumTargetCurrencyRewardsSpend;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getTargetCurrencyBalance() {
        return this.targetCurrencyBalance;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTargetCurrencyCode() {
        return this.targetCurrencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Double getConversionFactor() {
        return this.conversionFactor;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.Boolean getIsMonetary() {
        return this.isMonetary;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode getProgramCurrencyRoundingMode() {
        return this.programCurrencyRoundingMode;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination getDenomination() {
        return this.denomination;
    }
}
