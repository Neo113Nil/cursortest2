package com.paypal.oslo.feature.subscriptions.details.domain.model;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0017J\u0010\u0010%\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0017J\u0098\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b7\u0010\u0017R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b<\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b=\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010#R\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b@\u0010\u0017R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bB\u0010&R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\bC\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/domain/model/SubscriptionDetails;", "", "", "agreementId", "merchantName", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "type", "merchantImageUrl", "", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;", "fundingInstruments", "preferredFundingInstrument", "balanceFundingInstrument", "merchantContact", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;", "managementType", "merchantId", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "balancePreference", "merchantWebsiteUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "component4", "component5", "()Ljava/util/List;", "component6", "()Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;", "component7", "component8", "component9", "()Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;", "component10", "component11", "()Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/details/domain/model/SubscriptionDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAgreementId", "getMerchantName", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getType", "getMerchantImageUrl", "Ljava/util/List;", "getFundingInstruments", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;", "getPreferredFundingInstrument", "getBalanceFundingInstrument", "getMerchantContact", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;", "getManagementType", "getMerchantId", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "getBalancePreference", "getMerchantWebsiteUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SubscriptionDetails {
    public static final int $stable = 8;
    private final java.lang.String agreementId;
    private final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument balanceFundingInstrument;
    private final com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference;
    private final java.util.List<com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument> fundingInstruments;
    private final com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType managementType;
    private final java.lang.String merchantContact;
    private final java.lang.String merchantId;
    private final java.lang.String merchantImageUrl;
    private final java.lang.String merchantName;
    private final java.lang.String merchantWebsiteUrl;
    private final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument preferredFundingInstrument;
    private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType type;

    public SubscriptionDetails(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, java.lang.String str3, java.util.List<com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument> list, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2, java.lang.String str4, com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType, java.lang.String str5, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantManagementType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balancePreference, "");
        this.agreementId = str;
        this.merchantName = str2;
        this.type = agreementType;
        this.merchantImageUrl = str3;
        this.fundingInstruments = list;
        this.preferredFundingInstrument = fundingInstrument;
        this.balanceFundingInstrument = fundingInstrument2;
        this.merchantContact = str4;
        this.managementType = merchantManagementType;
        this.merchantId = str5;
        this.balancePreference = balancePreference;
        this.merchantWebsiteUrl = str6;
    }

    public final java.lang.String getAgreementId() {
        return this.agreementId;
    }

    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getType() {
        return this.type;
    }

    public final java.lang.String getMerchantImageUrl() {
        return this.merchantImageUrl;
    }

    public final java.util.List<com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument> getFundingInstruments() {
        return this.fundingInstruments;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument getPreferredFundingInstrument() {
        return this.preferredFundingInstrument;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument getBalanceFundingInstrument() {
        return this.balanceFundingInstrument;
    }

    public final java.lang.String getMerchantContact() {
        return this.merchantContact;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType getManagementType() {
        return this.managementType;
    }

    public /* synthetic */ SubscriptionDetails(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, java.lang.String str3, java.util.List list, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2, java.lang.String str4, com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType, java.lang.String str5, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, java.lang.String str6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, agreementType, str3, list, fundingInstrument, fundingInstrument2, str4, merchantManagementType, (i & 512) != 0 ? "" : str5, (i & 1024) != 0 ? com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.UNKNOWN : balancePreference, (i & 2048) != 0 ? null : str6);
    }

    public final java.lang.String getMerchantId() {
        return this.merchantId;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference getBalancePreference() {
        return this.balancePreference;
    }

    public final java.lang.String getMerchantWebsiteUrl() {
        return this.merchantWebsiteUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.agreementId;
        java.lang.String str2 = this.merchantName;
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = this.type;
        java.lang.String str3 = this.merchantImageUrl;
        java.util.List<com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument> list = this.fundingInstruments;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument = this.preferredFundingInstrument;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2 = this.balanceFundingInstrument;
        java.lang.String str4 = this.merchantContact;
        com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType = this.managementType;
        java.lang.String str5 = this.merchantId;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference = this.balancePreference;
        java.lang.String str6 = this.merchantWebsiteUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubscriptionDetails(agreementId=");
        sb.append(str);
        sb.append(", merchantName=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(agreementType);
        sb.append(", merchantImageUrl=");
        sb.append(str3);
        sb.append(", fundingInstruments=");
        sb.append(list);
        sb.append(", preferredFundingInstrument=");
        sb.append(fundingInstrument);
        sb.append(", balanceFundingInstrument=");
        sb.append(fundingInstrument2);
        sb.append(", merchantContact=");
        sb.append(str4);
        sb.append(", managementType=");
        sb.append(merchantManagementType);
        sb.append(", merchantId=");
        sb.append(str5);
        sb.append(", balancePreference=");
        sb.append(balancePreference);
        sb.append(", merchantWebsiteUrl=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.agreementId.hashCode();
        int hashCode2 = this.merchantName.hashCode();
        int hashCode3 = this.type.hashCode();
        java.lang.String str = this.merchantImageUrl;
        int hashCode4 = str == null ? 0 : str.hashCode();
        int hashCode5 = this.fundingInstruments.hashCode();
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument = this.preferredFundingInstrument;
        int hashCode6 = fundingInstrument == null ? 0 : fundingInstrument.hashCode();
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2 = this.balanceFundingInstrument;
        int hashCode7 = fundingInstrument2 == null ? 0 : fundingInstrument2.hashCode();
        java.lang.String str2 = this.merchantContact;
        int hashCode8 = str2 == null ? 0 : str2.hashCode();
        int hashCode9 = this.managementType.hashCode();
        int hashCode10 = this.merchantId.hashCode();
        int hashCode11 = this.balancePreference.hashCode();
        java.lang.String str3 = this.merchantWebsiteUrl;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails subscriptionDetails = (com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.agreementId, subscriptionDetails.agreementId) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, subscriptionDetails.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, subscriptionDetails.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantImageUrl, subscriptionDetails.merchantImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, subscriptionDetails.fundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.preferredFundingInstrument, subscriptionDetails.preferredFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceFundingInstrument, subscriptionDetails.balanceFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantContact, subscriptionDetails.merchantContact) && this.managementType == subscriptionDetails.managementType && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantId, subscriptionDetails.merchantId) && this.balancePreference == subscriptionDetails.balancePreference && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantWebsiteUrl, subscriptionDetails.merchantWebsiteUrl);
    }

    public final com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails copy(java.lang.String agreementId, java.lang.String merchantName, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType type, java.lang.String merchantImageUrl, java.util.List<com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument> fundingInstruments, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument preferredFundingInstrument, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument balanceFundingInstrument, java.lang.String merchantContact, com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType managementType, java.lang.String merchantId, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, java.lang.String merchantWebsiteUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(managementType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balancePreference, "");
        return new com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails(agreementId, merchantName, type, merchantImageUrl, fundingInstruments, preferredFundingInstrument, balanceFundingInstrument, merchantContact, managementType, merchantId, balancePreference, merchantWebsiteUrl);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType getManagementType() {
        return this.managementType;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getMerchantContact() {
        return this.merchantContact;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument getBalanceFundingInstrument() {
        return this.balanceFundingInstrument;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument getPreferredFundingInstrument() {
        return this.preferredFundingInstrument;
    }

    public final java.util.List<com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument> component5() {
        return this.fundingInstruments;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMerchantImageUrl() {
        return this.merchantImageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getMerchantWebsiteUrl() {
        return this.merchantWebsiteUrl;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference getBalancePreference() {
        return this.balancePreference;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getMerchantId() {
        return this.merchantId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAgreementId() {
        return this.agreementId;
    }
}
