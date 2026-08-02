package com.paypal.oslo.feature.subscriptions.businesseshub.domain;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJZ\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b'\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b*\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b+\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/LinkedBusinessAgreementItem;", "", "", "agreementId", "agreementName", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;", "preferredFundingInstrument", "balanceFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "balancePreference", "merchantId", "agreementImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;", "component4", "component5", "()Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/LinkedBusinessAgreementItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAgreementId", "getAgreementName", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;", "getPreferredFundingInstrument", "getBalanceFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "getBalancePreference", "getMerchantId", "getAgreementImageUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LinkedBusinessAgreementItem {
    public static final int $stable = 0;
    private final java.lang.String agreementId;
    private final java.lang.String agreementImageUrl;
    private final java.lang.String agreementName;
    private final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument balanceFundingInstrument;
    private final com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference;
    private final java.lang.String merchantId;
    private final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument preferredFundingInstrument;

    public LinkedBusinessAgreementItem(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balancePreference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.agreementId = str;
        this.agreementName = str2;
        this.preferredFundingInstrument = fundingInstrument;
        this.balanceFundingInstrument = fundingInstrument2;
        this.balancePreference = balancePreference;
        this.merchantId = str3;
        this.agreementImageUrl = str4;
    }

    public final java.lang.String getAgreementId() {
        return this.agreementId;
    }

    public final java.lang.String getAgreementName() {
        return this.agreementName;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument getPreferredFundingInstrument() {
        return this.preferredFundingInstrument;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument getBalanceFundingInstrument() {
        return this.balanceFundingInstrument;
    }

    public /* synthetic */ LinkedBusinessAgreementItem(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, fundingInstrument, (i & 8) != 0 ? null : fundingInstrument2, (i & 16) != 0 ? com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.UNKNOWN : balancePreference, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4);
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference getBalancePreference() {
        return this.balancePreference;
    }

    public final java.lang.String getMerchantId() {
        return this.merchantId;
    }

    public final java.lang.String getAgreementImageUrl() {
        return this.agreementImageUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.agreementId;
        java.lang.String str2 = this.agreementName;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument = this.preferredFundingInstrument;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2 = this.balanceFundingInstrument;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference = this.balancePreference;
        java.lang.String str3 = this.merchantId;
        java.lang.String str4 = this.agreementImageUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkedBusinessAgreementItem(agreementId=");
        sb.append(str);
        sb.append(", agreementName=");
        sb.append(str2);
        sb.append(", preferredFundingInstrument=");
        sb.append(fundingInstrument);
        sb.append(", balanceFundingInstrument=");
        sb.append(fundingInstrument2);
        sb.append(", balancePreference=");
        sb.append(balancePreference);
        sb.append(", merchantId=");
        sb.append(str3);
        sb.append(", agreementImageUrl=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.agreementId.hashCode();
        int hashCode2 = this.agreementName.hashCode();
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument = this.preferredFundingInstrument;
        int hashCode3 = fundingInstrument == null ? 0 : fundingInstrument.hashCode();
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2 = this.balanceFundingInstrument;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (fundingInstrument2 != null ? fundingInstrument2.hashCode() : 0)) * 31) + this.balancePreference.hashCode()) * 31) + this.merchantId.hashCode()) * 31) + this.agreementImageUrl.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem linkedBusinessAgreementItem = (com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.agreementId, linkedBusinessAgreementItem.agreementId) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementName, linkedBusinessAgreementItem.agreementName) && kotlin.jvm.internal.Intrinsics.areEqual(this.preferredFundingInstrument, linkedBusinessAgreementItem.preferredFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceFundingInstrument, linkedBusinessAgreementItem.balanceFundingInstrument) && this.balancePreference == linkedBusinessAgreementItem.balancePreference && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantId, linkedBusinessAgreementItem.merchantId) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementImageUrl, linkedBusinessAgreementItem.agreementImageUrl);
    }

    public final com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem copy(java.lang.String agreementId, java.lang.String agreementName, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument preferredFundingInstrument, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument balanceFundingInstrument, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, java.lang.String merchantId, java.lang.String agreementImageUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balancePreference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementImageUrl, "");
        return new com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem(agreementId, agreementName, preferredFundingInstrument, balanceFundingInstrument, balancePreference, merchantId, agreementImageUrl);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getAgreementImageUrl() {
        return this.agreementImageUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getMerchantId() {
        return this.merchantId;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference getBalancePreference() {
        return this.balancePreference;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument getBalanceFundingInstrument() {
        return this.balanceFundingInstrument;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument getPreferredFundingInstrument() {
        return this.preferredFundingInstrument;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAgreementName() {
        return this.agreementName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAgreementId() {
        return this.agreementId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem copy$default(com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem linkedBusinessAgreementItem, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = linkedBusinessAgreementItem.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = linkedBusinessAgreementItem.agreementName;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            fundingInstrument = linkedBusinessAgreementItem.preferredFundingInstrument;
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument3 = fundingInstrument;
        if ((i & 8) != 0) {
            fundingInstrument2 = linkedBusinessAgreementItem.balanceFundingInstrument;
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument4 = fundingInstrument2;
        if ((i & 16) != 0) {
            balancePreference = linkedBusinessAgreementItem.balancePreference;
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference2 = balancePreference;
        if ((i & 32) != 0) {
            str3 = linkedBusinessAgreementItem.merchantId;
        }
        java.lang.String str6 = str3;
        if ((i & 64) != 0) {
            str4 = linkedBusinessAgreementItem.agreementImageUrl;
        }
        return linkedBusinessAgreementItem.copy(str, str5, fundingInstrument3, fundingInstrument4, balancePreference2, str6, str4);
    }
}
