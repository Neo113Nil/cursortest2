package com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountParams;", "", "ConfirmBankAccountUsingRandomDeposit", "InstantBankAccountConfirmation", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountParams$ConfirmBankAccountUsingRandomDeposit;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountParams$InstantBankAccountConfirmation;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ConfirmBankAccountParams {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountParams$ConfirmBankAccountUsingRandomDeposit;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountParams;", "", "bankAccountId", "depositAmount1", "depositAmount2", "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountParams$ConfirmBankAccountUsingRandomDeposit;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBankAccountId", "getDepositAmount1", "getDepositAmount2", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmBankAccountUsingRandomDeposit implements com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams {
        public static final int $stable = 0;
        private final java.lang.String bankAccountId;
        private final java.lang.String currencyCode;
        private final java.lang.String depositAmount1;
        private final java.lang.String depositAmount2;

        public ConfirmBankAccountUsingRandomDeposit(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.bankAccountId = str;
            this.depositAmount1 = str2;
            this.depositAmount2 = str3;
            this.currencyCode = str4;
        }

        public final java.lang.String getBankAccountId() {
            return this.bankAccountId;
        }

        public final java.lang.String getDepositAmount1() {
            return this.depositAmount1;
        }

        public final java.lang.String getDepositAmount2() {
            return this.depositAmount2;
        }

        public /* synthetic */ ConfirmBankAccountUsingRandomDeposit(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? "USD" : str4);
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.bankAccountId;
            java.lang.String str2 = this.depositAmount1;
            java.lang.String str3 = this.depositAmount2;
            java.lang.String str4 = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmBankAccountUsingRandomDeposit(bankAccountId=");
            sb.append(str);
            sb.append(", depositAmount1=");
            sb.append(str2);
            sb.append(", depositAmount2=");
            sb.append(str3);
            sb.append(", currencyCode=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.bankAccountId.hashCode() * 31) + this.depositAmount1.hashCode()) * 31) + this.depositAmount2.hashCode()) * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.ConfirmBankAccountUsingRandomDeposit)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.ConfirmBankAccountUsingRandomDeposit confirmBankAccountUsingRandomDeposit = (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.ConfirmBankAccountUsingRandomDeposit) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountId, confirmBankAccountUsingRandomDeposit.bankAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.depositAmount1, confirmBankAccountUsingRandomDeposit.depositAmount1) && kotlin.jvm.internal.Intrinsics.areEqual(this.depositAmount2, confirmBankAccountUsingRandomDeposit.depositAmount2) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, confirmBankAccountUsingRandomDeposit.currencyCode);
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.ConfirmBankAccountUsingRandomDeposit copy(java.lang.String bankAccountId, java.lang.String depositAmount1, java.lang.String depositAmount2, java.lang.String currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositAmount1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositAmount2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.ConfirmBankAccountUsingRandomDeposit(bankAccountId, depositAmount1, depositAmount2, currencyCode);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDepositAmount2() {
            return this.depositAmount2;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDepositAmount1() {
            return this.depositAmount1;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBankAccountId() {
            return this.bankAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.ConfirmBankAccountUsingRandomDeposit copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.ConfirmBankAccountUsingRandomDeposit confirmBankAccountUsingRandomDeposit, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = confirmBankAccountUsingRandomDeposit.bankAccountId;
            }
            if ((i & 2) != 0) {
                str2 = confirmBankAccountUsingRandomDeposit.depositAmount1;
            }
            if ((i & 4) != 0) {
                str3 = confirmBankAccountUsingRandomDeposit.depositAmount2;
            }
            if ((i & 8) != 0) {
                str4 = confirmBankAccountUsingRandomDeposit.currencyCode;
            }
            return confirmBankAccountUsingRandomDeposit.copy(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010JX\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b+\u0010\u0010R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b.\u0010\u0010R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b/\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountParams$InstantBankAccountConfirmation;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountParams;", "", "instrumentId", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "productFlow", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "bank", "credentialToken", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "aggregator", "credentialType", "countryCode", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "component3", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "component4", "component5", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "component6", "component7", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountParams$InstantBankAccountConfirmation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInstrumentId", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "getProductFlow", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "getBank", "getCredentialToken", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "getAggregator", "getCredentialType", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InstantBankAccountConfirmation implements com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator aggregator;
        private final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails bank;
        private final java.lang.String countryCode;
        private final java.lang.String credentialToken;
        private final java.lang.String credentialType;
        private final java.lang.String instrumentId;
        private final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow productFlow;

        public InstantBankAccountConfirmation(java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, java.lang.String str2, com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instantBankConfirmationBankDetails, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAggregator, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.instrumentId = str;
            this.productFlow = addFIFlow;
            this.bank = instantBankConfirmationBankDetails;
            this.credentialToken = str2;
            this.aggregator = bankAggregator;
            this.credentialType = str3;
            this.countryCode = str4;
        }

        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getProductFlow() {
            return this.productFlow;
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails getBank() {
            return this.bank;
        }

        public final java.lang.String getCredentialToken() {
            return this.credentialToken;
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator getAggregator() {
            return this.aggregator;
        }

        public /* synthetic */ InstantBankAccountConfirmation(java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, java.lang.String str2, com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, addFIFlow, instantBankConfirmationBankDetails, str2, bankAggregator, (i & 32) != 0 ? "TEMPORARY" : str3, (i & 64) != 0 ? "US" : str4);
        }

        public final java.lang.String getCredentialType() {
            return this.credentialType;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.instrumentId;
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow = this.productFlow;
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails = this.bank;
            java.lang.String str2 = this.credentialToken;
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator = this.aggregator;
            java.lang.String str3 = this.credentialType;
            java.lang.String str4 = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InstantBankAccountConfirmation(instrumentId=");
            sb.append(str);
            sb.append(", productFlow=");
            sb.append(addFIFlow);
            sb.append(", bank=");
            sb.append(instantBankConfirmationBankDetails);
            sb.append(", credentialToken=");
            sb.append(str2);
            sb.append(", aggregator=");
            sb.append(bankAggregator);
            sb.append(", credentialType=");
            sb.append(str3);
            sb.append(", countryCode=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.instrumentId.hashCode();
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow = this.productFlow;
            return (((((((((((hashCode * 31) + (addFIFlow == null ? 0 : addFIFlow.hashCode())) * 31) + this.bank.hashCode()) * 31) + this.credentialToken.hashCode()) * 31) + this.aggregator.hashCode()) * 31) + this.credentialType.hashCode()) * 31) + this.countryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.InstantBankAccountConfirmation)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.InstantBankAccountConfirmation instantBankAccountConfirmation = (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.InstantBankAccountConfirmation) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, instantBankAccountConfirmation.instrumentId) && this.productFlow == instantBankAccountConfirmation.productFlow && kotlin.jvm.internal.Intrinsics.areEqual(this.bank, instantBankAccountConfirmation.bank) && kotlin.jvm.internal.Intrinsics.areEqual(this.credentialToken, instantBankAccountConfirmation.credentialToken) && this.aggregator == instantBankAccountConfirmation.aggregator && kotlin.jvm.internal.Intrinsics.areEqual(this.credentialType, instantBankAccountConfirmation.credentialType) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, instantBankAccountConfirmation.countryCode);
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.InstantBankAccountConfirmation copy(java.lang.String instrumentId, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow productFlow, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails bank, java.lang.String credentialToken, com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator aggregator, java.lang.String credentialType, java.lang.String countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bank, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialToken, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aggregator, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.InstantBankAccountConfirmation(instrumentId, productFlow, bank, credentialToken, aggregator, credentialType, countryCode);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getCredentialType() {
            return this.credentialType;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator getAggregator() {
            return this.aggregator;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCredentialToken() {
            return this.credentialToken;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails getBank() {
            return this.bank;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getProductFlow() {
            return this.productFlow;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.InstantBankAccountConfirmation copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.InstantBankAccountConfirmation instantBankAccountConfirmation, java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, java.lang.String str2, com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = instantBankAccountConfirmation.instrumentId;
            }
            if ((i & 2) != 0) {
                addFIFlow = instantBankAccountConfirmation.productFlow;
            }
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow2 = addFIFlow;
            if ((i & 4) != 0) {
                instantBankConfirmationBankDetails = instantBankAccountConfirmation.bank;
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails2 = instantBankConfirmationBankDetails;
            if ((i & 8) != 0) {
                str2 = instantBankAccountConfirmation.credentialToken;
            }
            java.lang.String str5 = str2;
            if ((i & 16) != 0) {
                bankAggregator = instantBankAccountConfirmation.aggregator;
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator2 = bankAggregator;
            if ((i & 32) != 0) {
                str3 = instantBankAccountConfirmation.credentialType;
            }
            java.lang.String str6 = str3;
            if ((i & 64) != 0) {
                str4 = instantBankAccountConfirmation.countryCode;
            }
            return instantBankAccountConfirmation.copy(str, addFIFlow2, instantBankConfirmationBankDetails2, str5, bankAggregator2, str6, str4);
        }
    }
}
