package com.paypal.oslo.feature.wallet.preferred.ui.common.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/preferred/ui/common/model/PayPalBalanceUiModel;", "", "", "id", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "fundingType", "balance", "thumbnail", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/preferred/ui/common/model/PayPalBalanceUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "getFundingType", "getBalance", "getThumbnail"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PayPalBalanceUiModel {
    public static final int $stable = 0;
    private final java.lang.String balance;
    private final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingType;
    private final java.lang.String id;
    private final java.lang.String thumbnail;

    public PayPalBalanceUiModel(java.lang.String str, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.fundingType = fundingInstrumentType;
        this.balance = str2;
        this.thumbnail = str3;
    }

    public /* synthetic */ PayPalBalanceUiModel(java.lang.String str, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.BALANCE : fundingInstrumentType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType getFundingType() {
        return this.fundingType;
    }

    public final java.lang.String getBalance() {
        return this.balance;
    }

    public final java.lang.String getThumbnail() {
        return this.thumbnail;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType = this.fundingType;
        java.lang.String str2 = this.balance;
        java.lang.String str3 = this.thumbnail;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayPalBalanceUiModel(id=");
        sb.append(str);
        sb.append(", fundingType=");
        sb.append(fundingInstrumentType);
        sb.append(", balance=");
        sb.append(str2);
        sb.append(", thumbnail=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.fundingType.hashCode();
        int hashCode3 = this.balance.hashCode();
        java.lang.String str = this.thumbnail;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.preferred.ui.common.model.PayPalBalanceUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.preferred.ui.common.model.PayPalBalanceUiModel payPalBalanceUiModel = (com.paypal.oslo.feature.wallet.preferred.ui.common.model.PayPalBalanceUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, payPalBalanceUiModel.id) && this.fundingType == payPalBalanceUiModel.fundingType && kotlin.jvm.internal.Intrinsics.areEqual(this.balance, payPalBalanceUiModel.balance) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnail, payPalBalanceUiModel.thumbnail);
    }

    public final com.paypal.oslo.feature.wallet.preferred.ui.common.model.PayPalBalanceUiModel copy(java.lang.String id, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingType, java.lang.String balance, java.lang.String thumbnail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balance, "");
        return new com.paypal.oslo.feature.wallet.preferred.ui.common.model.PayPalBalanceUiModel(id, fundingType, balance, thumbnail);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getThumbnail() {
        return this.thumbnail;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBalance() {
        return this.balance;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType getFundingType() {
        return this.fundingType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.preferred.ui.common.model.PayPalBalanceUiModel copy$default(com.paypal.oslo.feature.wallet.preferred.ui.common.model.PayPalBalanceUiModel payPalBalanceUiModel, java.lang.String str, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = payPalBalanceUiModel.id;
        }
        if ((i & 2) != 0) {
            fundingInstrumentType = payPalBalanceUiModel.fundingType;
        }
        if ((i & 4) != 0) {
            str2 = payPalBalanceUiModel.balance;
        }
        if ((i & 8) != 0) {
            str3 = payPalBalanceUiModel.thumbnail;
        }
        return payPalBalanceUiModel.copy(str, fundingInstrumentType, str2, str3);
    }

    public PayPalBalanceUiModel() {
        this(null, null, null, null, 15, null);
    }
}
