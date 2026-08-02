package com.paypal.oslo.feature.balance.ui.onholddetails;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u0003\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/onholddetails/TaxOnHoldState;", "", "", "isTaxIdProvided", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "amountOnHold", "amountTaxIdRequired", "", "percentageTax", "dateLimit", "<init>", "(ZLcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/balance/domain/model/Money;", "component3", "component4", "()Ljava/lang/String;", "component5", "copy", "(ZLcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/onholddetails/TaxOnHoldState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "getAmountOnHold", "getAmountTaxIdRequired", "Ljava/lang/String;", "getPercentageTax", "getDateLimit"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TaxOnHoldState {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.balance.domain.model.Money amountOnHold;
    private final com.paypal.oslo.feature.balance.domain.model.Money amountTaxIdRequired;
    private final java.lang.String dateLimit;
    private final boolean isTaxIdProvided;
    private final java.lang.String percentageTax;

    public TaxOnHoldState(boolean z, com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.isTaxIdProvided = z;
        this.amountOnHold = money;
        this.amountTaxIdRequired = money2;
        this.percentageTax = str;
        this.dateLimit = str2;
    }

    public final boolean isTaxIdProvided() {
        return this.isTaxIdProvided;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getAmountOnHold() {
        return this.amountOnHold;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getAmountTaxIdRequired() {
        return this.amountTaxIdRequired;
    }

    public final java.lang.String getPercentageTax() {
        return this.percentageTax;
    }

    public final java.lang.String getDateLimit() {
        return this.dateLimit;
    }

    public final java.lang.String toString() {
        boolean z = this.isTaxIdProvided;
        com.paypal.oslo.feature.balance.domain.model.Money money = this.amountOnHold;
        com.paypal.oslo.feature.balance.domain.model.Money money2 = this.amountTaxIdRequired;
        java.lang.String str = this.percentageTax;
        java.lang.String str2 = this.dateLimit;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TaxOnHoldState(isTaxIdProvided=");
        sb.append(z);
        sb.append(", amountOnHold=");
        sb.append(money);
        sb.append(", amountTaxIdRequired=");
        sb.append(money2);
        sb.append(", percentageTax=");
        sb.append(str);
        sb.append(", dateLimit=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.isTaxIdProvided) * 31) + this.amountOnHold.hashCode()) * 31) + this.amountTaxIdRequired.hashCode()) * 31) + this.percentageTax.hashCode()) * 31) + this.dateLimit.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldState)) {
            return false;
        }
        com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldState taxOnHoldState = (com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldState) other;
        return this.isTaxIdProvided == taxOnHoldState.isTaxIdProvided && kotlin.jvm.internal.Intrinsics.areEqual(this.amountOnHold, taxOnHoldState.amountOnHold) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountTaxIdRequired, taxOnHoldState.amountTaxIdRequired) && kotlin.jvm.internal.Intrinsics.areEqual(this.percentageTax, taxOnHoldState.percentageTax) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateLimit, taxOnHoldState.dateLimit);
    }

    public final com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldState copy(boolean isTaxIdProvided, com.paypal.oslo.feature.balance.domain.model.Money amountOnHold, com.paypal.oslo.feature.balance.domain.model.Money amountTaxIdRequired, java.lang.String percentageTax, java.lang.String dateLimit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountOnHold, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountTaxIdRequired, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percentageTax, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateLimit, "");
        return new com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldState(isTaxIdProvided, amountOnHold, amountTaxIdRequired, percentageTax, dateLimit);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getDateLimit() {
        return this.dateLimit;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPercentageTax() {
        return this.percentageTax;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getAmountTaxIdRequired() {
        return this.amountTaxIdRequired;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getAmountOnHold() {
        return this.amountOnHold;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsTaxIdProvided() {
        return this.isTaxIdProvided;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldState copy$default(com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldState taxOnHoldState, boolean z, com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = taxOnHoldState.isTaxIdProvided;
        }
        if ((i & 2) != 0) {
            money = taxOnHoldState.amountOnHold;
        }
        com.paypal.oslo.feature.balance.domain.model.Money money3 = money;
        if ((i & 4) != 0) {
            money2 = taxOnHoldState.amountTaxIdRequired;
        }
        com.paypal.oslo.feature.balance.domain.model.Money money4 = money2;
        if ((i & 8) != 0) {
            str = taxOnHoldState.percentageTax;
        }
        java.lang.String str3 = str;
        if ((i & 16) != 0) {
            str2 = taxOnHoldState.dateLimit;
        }
        return taxOnHoldState.copy(z, money3, money4, str3, str2);
    }
}
