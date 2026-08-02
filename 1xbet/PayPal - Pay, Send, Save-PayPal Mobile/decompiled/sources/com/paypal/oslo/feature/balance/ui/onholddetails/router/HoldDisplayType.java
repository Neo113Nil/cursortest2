package com.paypal.oslo.feature.balance.ui.onholddetails.router;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/HoldDisplayType;", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.VALUE_ATTEMPT_INTENTION_TAX_ON_HOLD, "MoneyOnHold", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/HoldDisplayType$MoneyOnHold;", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/HoldDisplayType$TaxOnHold;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface HoldDisplayType {

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\u0005\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b#\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b$\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/HoldDisplayType$TaxOnHold;", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/HoldDisplayType;", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "amount", "", "isTaxIdProvided", "", "taxRate", "gracePeriodExpiryDate", "amountTaxIdRequired", "<init>", "(Lcom/paypal/oslo/feature/balance/domain/model/Money;ZLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/Money;)V", "component1", "()Lcom/paypal/oslo/feature/balance/domain/model/Money;", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(Lcom/paypal/oslo/feature/balance/domain/model/Money;ZLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/Money;)Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/HoldDisplayType$TaxOnHold;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "getAmount", "Z", "Ljava/lang/String;", "getTaxRate", "getGracePeriodExpiryDate", "getAmountTaxIdRequired"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TaxOnHold implements com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.balance.domain.model.Money amount;
        private final com.paypal.oslo.feature.balance.domain.model.Money amountTaxIdRequired;
        private final java.lang.String gracePeriodExpiryDate;
        private final boolean isTaxIdProvided;
        private final java.lang.String taxRate;

        public TaxOnHold(com.paypal.oslo.feature.balance.domain.model.Money money, boolean z, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.domain.model.Money money2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money2, "");
            this.amount = money;
            this.isTaxIdProvided = z;
            this.taxRate = str;
            this.gracePeriodExpiryDate = str2;
            this.amountTaxIdRequired = money2;
        }

        public final com.paypal.oslo.feature.balance.domain.model.Money getAmount() {
            return this.amount;
        }

        public final boolean isTaxIdProvided() {
            return this.isTaxIdProvided;
        }

        public final java.lang.String getTaxRate() {
            return this.taxRate;
        }

        public final java.lang.String getGracePeriodExpiryDate() {
            return this.gracePeriodExpiryDate;
        }

        public final com.paypal.oslo.feature.balance.domain.model.Money getAmountTaxIdRequired() {
            return this.amountTaxIdRequired;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.domain.model.Money money = this.amount;
            boolean z = this.isTaxIdProvided;
            java.lang.String str = this.taxRate;
            java.lang.String str2 = this.gracePeriodExpiryDate;
            com.paypal.oslo.feature.balance.domain.model.Money money2 = this.amountTaxIdRequired;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TaxOnHold(amount=");
            sb.append(money);
            sb.append(", isTaxIdProvided=");
            sb.append(z);
            sb.append(", taxRate=");
            sb.append(str);
            sb.append(", gracePeriodExpiryDate=");
            sb.append(str2);
            sb.append(", amountTaxIdRequired=");
            sb.append(money2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.amount.hashCode() * 31) + java.lang.Boolean.hashCode(this.isTaxIdProvided)) * 31) + this.taxRate.hashCode()) * 31) + this.gracePeriodExpiryDate.hashCode()) * 31) + this.amountTaxIdRequired.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.TaxOnHold)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.TaxOnHold taxOnHold = (com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.TaxOnHold) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, taxOnHold.amount) && this.isTaxIdProvided == taxOnHold.isTaxIdProvided && kotlin.jvm.internal.Intrinsics.areEqual(this.taxRate, taxOnHold.taxRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.gracePeriodExpiryDate, taxOnHold.gracePeriodExpiryDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountTaxIdRequired, taxOnHold.amountTaxIdRequired);
        }

        public final com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.TaxOnHold copy(com.paypal.oslo.feature.balance.domain.model.Money amount, boolean isTaxIdProvided, java.lang.String taxRate, java.lang.String gracePeriodExpiryDate, com.paypal.oslo.feature.balance.domain.model.Money amountTaxIdRequired) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxRate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gracePeriodExpiryDate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountTaxIdRequired, "");
            return new com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.TaxOnHold(amount, isTaxIdProvided, taxRate, gracePeriodExpiryDate, amountTaxIdRequired);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.balance.domain.model.Money getAmountTaxIdRequired() {
            return this.amountTaxIdRequired;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getGracePeriodExpiryDate() {
            return this.gracePeriodExpiryDate;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getTaxRate() {
            return this.taxRate;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsTaxIdProvided() {
            return this.isTaxIdProvided;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.domain.model.Money getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.TaxOnHold copy$default(com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.TaxOnHold taxOnHold, com.paypal.oslo.feature.balance.domain.model.Money money, boolean z, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.domain.model.Money money2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                money = taxOnHold.amount;
            }
            if ((i & 2) != 0) {
                z = taxOnHold.isTaxIdProvided;
            }
            boolean z2 = z;
            if ((i & 4) != 0) {
                str = taxOnHold.taxRate;
            }
            java.lang.String str3 = str;
            if ((i & 8) != 0) {
                str2 = taxOnHold.gracePeriodExpiryDate;
            }
            java.lang.String str4 = str2;
            if ((i & 16) != 0) {
                money2 = taxOnHold.amountTaxIdRequired;
            }
            return taxOnHold.copy(money, z2, str3, str4, money2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/HoldDisplayType$MoneyOnHold;", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/HoldDisplayType;", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "amount", "<init>", "(Lcom/paypal/oslo/feature/balance/domain/model/Money;)V", "component1", "()Lcom/paypal/oslo/feature/balance/domain/model/Money;", "copy", "(Lcom/paypal/oslo/feature/balance/domain/model/Money;)Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/HoldDisplayType$MoneyOnHold;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoneyOnHold implements com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.balance.domain.model.Money amount;

        public MoneyOnHold(com.paypal.oslo.feature.balance.domain.model.Money money) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
            this.amount = money;
        }

        public final com.paypal.oslo.feature.balance.domain.model.Money getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.domain.model.Money money = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MoneyOnHold(amount=");
            sb.append(money);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.MoneyOnHold) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.MoneyOnHold) other).amount);
        }

        public final com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.MoneyOnHold copy(com.paypal.oslo.feature.balance.domain.model.Money amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.MoneyOnHold(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.domain.model.Money getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.MoneyOnHold copy$default(com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.MoneyOnHold moneyOnHold, com.paypal.oslo.feature.balance.domain.model.Money money, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                money = moneyOnHold.amount;
            }
            return moneyOnHold.copy(money);
        }
    }
}
