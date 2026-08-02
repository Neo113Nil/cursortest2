package com.paypal.oslo.feature.subscriptions.hub.ui.models;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\\\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b0\u0010\u0018R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;", "", "", "id", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "type", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "balancePreference", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "preferredFundingInstrument", "balanceFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/hub/domain/Merchant;", "merchant", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/LastPaymentInformationUiModel;", "lastPaymentInformation", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Lcom/paypal/oslo/feature/subscriptions/hub/domain/Merchant;Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/LastPaymentInformationUiModel;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "component3", "()Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "component4", "()Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "component5", "component6", "()Lcom/paypal/oslo/feature/subscriptions/hub/domain/Merchant;", "component7", "()Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/LastPaymentInformationUiModel;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Lcom/paypal/oslo/feature/subscriptions/hub/domain/Merchant;Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/LastPaymentInformationUiModel;)Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getType", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "getBalancePreference", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "getPreferredFundingInstrument", "getBalanceFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/hub/domain/Merchant;", "getMerchant", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/LastPaymentInformationUiModel;", "getLastPaymentInformation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SubscriptionItemUiModel {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel balanceFundingInstrument;
    private final com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel lastPaymentInformation;
    private final com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant;
    private final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel preferredFundingInstrument;
    private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType type;

    public SubscriptionItemUiModel(java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel2, com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant, com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel lastPaymentInformationUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balancePreference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
        this.id = str;
        this.type = agreementType;
        this.balancePreference = balancePreference;
        this.preferredFundingInstrument = fundingInstrumentUiModel;
        this.balanceFundingInstrument = fundingInstrumentUiModel2;
        this.merchant = merchant;
        this.lastPaymentInformation = lastPaymentInformationUiModel;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getType() {
        return this.type;
    }

    public /* synthetic */ SubscriptionItemUiModel(java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel2, com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant, com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel lastPaymentInformationUiModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, agreementType, (i & 4) != 0 ? com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.UNKNOWN : balancePreference, fundingInstrumentUiModel, fundingInstrumentUiModel2, merchant, lastPaymentInformationUiModel);
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference getBalancePreference() {
        return this.balancePreference;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel getPreferredFundingInstrument() {
        return this.preferredFundingInstrument;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel getBalanceFundingInstrument() {
        return this.balanceFundingInstrument;
    }

    public final com.paypal.oslo.feature.subscriptions.hub.domain.Merchant getMerchant() {
        return this.merchant;
    }

    public final com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel getLastPaymentInformation() {
        return this.lastPaymentInformation;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = this.type;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference = this.balancePreference;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel = this.preferredFundingInstrument;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel2 = this.balanceFundingInstrument;
        com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant = this.merchant;
        com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel lastPaymentInformationUiModel = this.lastPaymentInformation;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubscriptionItemUiModel(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(agreementType);
        sb.append(", balancePreference=");
        sb.append(balancePreference);
        sb.append(", preferredFundingInstrument=");
        sb.append(fundingInstrumentUiModel);
        sb.append(", balanceFundingInstrument=");
        sb.append(fundingInstrumentUiModel2);
        sb.append(", merchant=");
        sb.append(merchant);
        sb.append(", lastPaymentInformation=");
        sb.append(lastPaymentInformationUiModel);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.type.hashCode();
        int hashCode3 = this.balancePreference.hashCode();
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel = this.preferredFundingInstrument;
        int hashCode4 = fundingInstrumentUiModel == null ? 0 : fundingInstrumentUiModel.hashCode();
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel2 = this.balanceFundingInstrument;
        int hashCode5 = fundingInstrumentUiModel2 == null ? 0 : fundingInstrumentUiModel2.hashCode();
        int hashCode6 = this.merchant.hashCode();
        com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel lastPaymentInformationUiModel = this.lastPaymentInformation;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (lastPaymentInformationUiModel != null ? lastPaymentInformationUiModel.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel = (com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, subscriptionItemUiModel.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, subscriptionItemUiModel.type) && this.balancePreference == subscriptionItemUiModel.balancePreference && kotlin.jvm.internal.Intrinsics.areEqual(this.preferredFundingInstrument, subscriptionItemUiModel.preferredFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceFundingInstrument, subscriptionItemUiModel.balanceFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchant, subscriptionItemUiModel.merchant) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastPaymentInformation, subscriptionItemUiModel.lastPaymentInformation);
    }

    public final com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel copy(java.lang.String id, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType type, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel preferredFundingInstrument, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel balanceFundingInstrument, com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant, com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel lastPaymentInformation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balancePreference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
        return new com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel(id, type, balancePreference, preferredFundingInstrument, balanceFundingInstrument, merchant, lastPaymentInformation);
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel getLastPaymentInformation() {
        return this.lastPaymentInformation;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.hub.domain.Merchant getMerchant() {
        return this.merchant;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel getBalanceFundingInstrument() {
        return this.balanceFundingInstrument;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel getPreferredFundingInstrument() {
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

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel copy$default(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel, java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel2, com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant, com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel lastPaymentInformationUiModel, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionItemUiModel.id;
        }
        if ((i & 2) != 0) {
            agreementType = subscriptionItemUiModel.type;
        }
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType2 = agreementType;
        if ((i & 4) != 0) {
            balancePreference = subscriptionItemUiModel.balancePreference;
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference2 = balancePreference;
        if ((i & 8) != 0) {
            fundingInstrumentUiModel = subscriptionItemUiModel.preferredFundingInstrument;
        }
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel3 = fundingInstrumentUiModel;
        if ((i & 16) != 0) {
            fundingInstrumentUiModel2 = subscriptionItemUiModel.balanceFundingInstrument;
        }
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel4 = fundingInstrumentUiModel2;
        if ((i & 32) != 0) {
            merchant = subscriptionItemUiModel.merchant;
        }
        com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant2 = merchant;
        if ((i & 64) != 0) {
            lastPaymentInformationUiModel = subscriptionItemUiModel.lastPaymentInformation;
        }
        return subscriptionItemUiModel.copy(str, agreementType2, balancePreference2, fundingInstrumentUiModel3, fundingInstrumentUiModel4, merchant2, lastPaymentInformationUiModel);
    }
}
