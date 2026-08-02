package com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/PaypalBalanceAccount;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "", "id", "logoUrl", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrumentType;", "fundingInstrumentType", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrumentType;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrumentType;", "component4", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrumentType;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/PaypalBalanceAccount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLogoUrl", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrumentType;", "getFundingInstrumentType", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaypalBalanceAccount implements com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money amount;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType fundingInstrumentType;
    private final java.lang.String id;
    private final java.lang.String logoUrl;

    public PaypalBalanceAccount(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType fundingInstrumentType, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        this.id = str;
        this.logoUrl = str2;
        this.fundingInstrumentType = fundingInstrumentType;
        this.amount = money;
    }

    public /* synthetic */ PaypalBalanceAccount(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType fundingInstrumentType, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, fundingInstrumentType, money);
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument
    public final java.lang.String getId() {
        return this.id;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument
    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument
    public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType getFundingInstrumentType() {
        return this.fundingInstrumentType;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getAmount() {
        return this.amount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.logoUrl;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType fundingInstrumentType = this.fundingInstrumentType;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = this.amount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaypalBalanceAccount(id=");
        sb.append(str);
        sb.append(", logoUrl=");
        sb.append(str2);
        sb.append(", fundingInstrumentType=");
        sb.append(fundingInstrumentType);
        sb.append(", amount=");
        sb.append(money);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        java.lang.String str = this.logoUrl;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.fundingInstrumentType.hashCode();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = this.amount;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (money != null ? money.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount paypalBalanceAccount = (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, paypalBalanceAccount.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, paypalBalanceAccount.logoUrl) && this.fundingInstrumentType == paypalBalanceAccount.fundingInstrumentType && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, paypalBalanceAccount.amount);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount copy(java.lang.String id, java.lang.String logoUrl, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType fundingInstrumentType, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount(id, logoUrl, fundingInstrumentType, amount);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType getFundingInstrumentType() {
        return this.fundingInstrumentType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount paypalBalanceAccount, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType fundingInstrumentType, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = paypalBalanceAccount.id;
        }
        if ((i & 2) != 0) {
            str2 = paypalBalanceAccount.logoUrl;
        }
        if ((i & 4) != 0) {
            fundingInstrumentType = paypalBalanceAccount.fundingInstrumentType;
        }
        if ((i & 8) != 0) {
            money = paypalBalanceAccount.amount;
        }
        return paypalBalanceAccount.copy(str, str2, fundingInstrumentType, money);
    }
}
