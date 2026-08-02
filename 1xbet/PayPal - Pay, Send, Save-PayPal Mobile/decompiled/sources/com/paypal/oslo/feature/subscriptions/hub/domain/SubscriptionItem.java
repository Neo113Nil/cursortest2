package com.paypal.oslo.feature.subscriptions.hub.domain;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\\\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b0\u0010\u0018R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/domain/SubscriptionItem;", "", "", "id", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "type", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "balancePreference", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;", "preferredFundingInstrument", "balanceFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/hub/domain/Merchant;", "merchant", "Lcom/paypal/oslo/feature/subscriptions/hub/domain/LastPaymentInformation;", "lastPaymentInformation", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Lcom/paypal/oslo/feature/subscriptions/hub/domain/Merchant;Lcom/paypal/oslo/feature/subscriptions/hub/domain/LastPaymentInformation;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "component3", "()Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "component4", "()Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;", "component5", "component6", "()Lcom/paypal/oslo/feature/subscriptions/hub/domain/Merchant;", "component7", "()Lcom/paypal/oslo/feature/subscriptions/hub/domain/LastPaymentInformation;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Lcom/paypal/oslo/feature/subscriptions/hub/domain/Merchant;Lcom/paypal/oslo/feature/subscriptions/hub/domain/LastPaymentInformation;)Lcom/paypal/oslo/feature/subscriptions/hub/domain/SubscriptionItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getType", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "getBalancePreference", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;", "getPreferredFundingInstrument", "getBalanceFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/hub/domain/Merchant;", "getMerchant", "Lcom/paypal/oslo/feature/subscriptions/hub/domain/LastPaymentInformation;", "getLastPaymentInformation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SubscriptionItem {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument balanceFundingInstrument;
    private final com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation lastPaymentInformation;
    private final com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant;
    private final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument preferredFundingInstrument;
    private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType type;

    public SubscriptionItem(java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2, com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant, com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation lastPaymentInformation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balancePreference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
        this.id = str;
        this.type = agreementType;
        this.balancePreference = balancePreference;
        this.preferredFundingInstrument = fundingInstrument;
        this.balanceFundingInstrument = fundingInstrument2;
        this.merchant = merchant;
        this.lastPaymentInformation = lastPaymentInformation;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getType() {
        return this.type;
    }

    public /* synthetic */ SubscriptionItem(java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2, com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant, com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation lastPaymentInformation, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, agreementType, (i & 4) != 0 ? com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.UNKNOWN : balancePreference, fundingInstrument, fundingInstrument2, merchant, lastPaymentInformation);
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference getBalancePreference() {
        return this.balancePreference;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument getPreferredFundingInstrument() {
        return this.preferredFundingInstrument;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument getBalanceFundingInstrument() {
        return this.balanceFundingInstrument;
    }

    public final com.paypal.oslo.feature.subscriptions.hub.domain.Merchant getMerchant() {
        return this.merchant;
    }

    public final com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation getLastPaymentInformation() {
        return this.lastPaymentInformation;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = this.type;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference = this.balancePreference;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument = this.preferredFundingInstrument;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2 = this.balanceFundingInstrument;
        com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant = this.merchant;
        com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation lastPaymentInformation = this.lastPaymentInformation;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubscriptionItem(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(agreementType);
        sb.append(", balancePreference=");
        sb.append(balancePreference);
        sb.append(", preferredFundingInstrument=");
        sb.append(fundingInstrument);
        sb.append(", balanceFundingInstrument=");
        sb.append(fundingInstrument2);
        sb.append(", merchant=");
        sb.append(merchant);
        sb.append(", lastPaymentInformation=");
        sb.append(lastPaymentInformation);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.type.hashCode();
        int hashCode3 = this.balancePreference.hashCode();
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument = this.preferredFundingInstrument;
        int hashCode4 = fundingInstrument == null ? 0 : fundingInstrument.hashCode();
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2 = this.balanceFundingInstrument;
        int hashCode5 = fundingInstrument2 == null ? 0 : fundingInstrument2.hashCode();
        int hashCode6 = this.merchant.hashCode();
        com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation lastPaymentInformation = this.lastPaymentInformation;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (lastPaymentInformation != null ? lastPaymentInformation.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem subscriptionItem = (com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, subscriptionItem.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, subscriptionItem.type) && this.balancePreference == subscriptionItem.balancePreference && kotlin.jvm.internal.Intrinsics.areEqual(this.preferredFundingInstrument, subscriptionItem.preferredFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceFundingInstrument, subscriptionItem.balanceFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchant, subscriptionItem.merchant) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastPaymentInformation, subscriptionItem.lastPaymentInformation);
    }

    public final com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem copy(java.lang.String id, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType type, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument preferredFundingInstrument, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument balanceFundingInstrument, com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant, com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation lastPaymentInformation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balancePreference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
        return new com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem(id, type, balancePreference, preferredFundingInstrument, balanceFundingInstrument, merchant, lastPaymentInformation);
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation getLastPaymentInformation() {
        return this.lastPaymentInformation;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.hub.domain.Merchant getMerchant() {
        return this.merchant;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument getBalanceFundingInstrument() {
        return this.balanceFundingInstrument;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument getPreferredFundingInstrument() {
        return this.preferredFundingInstrument;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference getBalancePreference() {
        return this.balancePreference;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem copy$default(com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem subscriptionItem, java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2, com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant, com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation lastPaymentInformation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionItem.id;
        }
        if ((i & 2) != 0) {
            agreementType = subscriptionItem.type;
        }
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType2 = agreementType;
        if ((i & 4) != 0) {
            balancePreference = subscriptionItem.balancePreference;
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference2 = balancePreference;
        if ((i & 8) != 0) {
            fundingInstrument = subscriptionItem.preferredFundingInstrument;
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument3 = fundingInstrument;
        if ((i & 16) != 0) {
            fundingInstrument2 = subscriptionItem.balanceFundingInstrument;
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument4 = fundingInstrument2;
        if ((i & 32) != 0) {
            merchant = subscriptionItem.merchant;
        }
        com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant2 = merchant;
        if ((i & 64) != 0) {
            lastPaymentInformation = subscriptionItem.lastPaymentInformation;
        }
        return subscriptionItem.copy(str, agreementType2, balancePreference2, fundingInstrument3, fundingInstrument4, merchant2, lastPaymentInformation);
    }
}
