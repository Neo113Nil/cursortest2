package com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012JV\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b)\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018R\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b.\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/AddBankManualParams;", "", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "accountType", "", com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameRoutingNumber, "currencyCode", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountOnboardingEntity;", "onboardingEntity", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BeneficiaryInfo;", "beneficiary", "countryCode", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountOnboardingEntity;Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BeneficiaryInfo;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountOnboardingEntity;", "component6", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BeneficiaryInfo;", "component7", "copy", "(Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountOnboardingEntity;Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BeneficiaryInfo;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/AddBankManualParams;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "getAccountType", "Ljava/lang/String;", "getAccountNumber", "getRoutingNumber1", "getCurrencyCode", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountOnboardingEntity;", "getOnboardingEntity", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BeneficiaryInfo;", "getBeneficiary", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AddBankManualParams {
    public static final int $stable = 8;
    private final java.lang.String accountNumber;
    private final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType accountType;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo beneficiary;
    private final java.lang.String countryCode;
    private final java.lang.String currencyCode;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity onboardingEntity;
    private final java.lang.String routingNumber1;

    public AddBankManualParams(com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity bankAccountOnboardingEntity, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo beneficiaryInfo, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountOnboardingEntity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beneficiaryInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.accountType = bankAccountType;
        this.accountNumber = str;
        this.routingNumber1 = str2;
        this.currencyCode = str3;
        this.onboardingEntity = bankAccountOnboardingEntity;
        this.beneficiary = beneficiaryInfo;
        this.countryCode = str4;
    }

    public final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getAccountType() {
        return this.accountType;
    }

    public final java.lang.String getAccountNumber() {
        return this.accountNumber;
    }

    public final java.lang.String getRoutingNumber1() {
        return this.routingNumber1;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity getOnboardingEntity() {
        return this.onboardingEntity;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo getBeneficiary() {
        return this.beneficiary;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType = this.accountType;
        java.lang.String str = this.accountNumber;
        java.lang.String str2 = this.routingNumber1;
        java.lang.String str3 = this.currencyCode;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity bankAccountOnboardingEntity = this.onboardingEntity;
        com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo beneficiaryInfo = this.beneficiary;
        java.lang.String str4 = this.countryCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddBankManualParams(accountType=");
        sb.append(bankAccountType);
        sb.append(", accountNumber=");
        sb.append(str);
        sb.append(", routingNumber1=");
        sb.append(str2);
        sb.append(", currencyCode=");
        sb.append(str3);
        sb.append(", onboardingEntity=");
        sb.append(bankAccountOnboardingEntity);
        sb.append(", beneficiary=");
        sb.append(beneficiaryInfo);
        sb.append(", countryCode=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((this.accountType.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + this.routingNumber1.hashCode()) * 31) + this.currencyCode.hashCode()) * 31) + this.onboardingEntity.hashCode()) * 31) + this.beneficiary.hashCode()) * 31) + this.countryCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams addBankManualParams = (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams) other;
        return this.accountType == addBankManualParams.accountType && kotlin.jvm.internal.Intrinsics.areEqual(this.accountNumber, addBankManualParams.accountNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.routingNumber1, addBankManualParams.routingNumber1) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, addBankManualParams.currencyCode) && this.onboardingEntity == addBankManualParams.onboardingEntity && kotlin.jvm.internal.Intrinsics.areEqual(this.beneficiary, addBankManualParams.beneficiary) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, addBankManualParams.countryCode);
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams copy(com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType accountType, java.lang.String accountNumber, java.lang.String routingNumber1, java.lang.String currencyCode, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity onboardingEntity, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo beneficiary, java.lang.String countryCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routingNumber1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardingEntity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beneficiary, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams(accountType, accountNumber, routingNumber1, currencyCode, onboardingEntity, beneficiary, countryCode);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo getBeneficiary() {
        return this.beneficiary;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity getOnboardingEntity() {
        return this.onboardingEntity;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getRoutingNumber1() {
        return this.routingNumber1;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getAccountType() {
        return this.accountType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams addBankManualParams, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity bankAccountOnboardingEntity, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo beneficiaryInfo, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bankAccountType = addBankManualParams.accountType;
        }
        if ((i & 2) != 0) {
            str = addBankManualParams.accountNumber;
        }
        java.lang.String str5 = str;
        if ((i & 4) != 0) {
            str2 = addBankManualParams.routingNumber1;
        }
        java.lang.String str6 = str2;
        if ((i & 8) != 0) {
            str3 = addBankManualParams.currencyCode;
        }
        java.lang.String str7 = str3;
        if ((i & 16) != 0) {
            bankAccountOnboardingEntity = addBankManualParams.onboardingEntity;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity bankAccountOnboardingEntity2 = bankAccountOnboardingEntity;
        if ((i & 32) != 0) {
            beneficiaryInfo = addBankManualParams.beneficiary;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo beneficiaryInfo2 = beneficiaryInfo;
        if ((i & 64) != 0) {
            str4 = addBankManualParams.countryCode;
        }
        return addBankManualParams.copy(bankAccountType, str5, str6, str7, bankAccountOnboardingEntity2, beneficiaryInfo2, str4);
    }
}
