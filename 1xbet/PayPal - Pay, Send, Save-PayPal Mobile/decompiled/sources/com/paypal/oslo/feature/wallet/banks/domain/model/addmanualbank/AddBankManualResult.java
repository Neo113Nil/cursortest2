package com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/AddBankManualResult;", "", "", "success", "", "bankAccountId", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "bankAccountDetails", "<init>", "(ZLjava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "copy", "(ZLjava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/AddBankManualResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getSuccess", "Ljava/lang/String;", "getBankAccountId", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "getBankAccountDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AddBankManualResult {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails;
    private final java.lang.String bankAccountId;
    private final boolean success;

    public AddBankManualResult(boolean z, java.lang.String str, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.success = z;
        this.bankAccountId = str;
        this.bankAccountDetails = bankAccountDetails;
    }

    public /* synthetic */ AddBankManualResult(boolean z, java.lang.String str, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, (i & 4) != 0 ? null : bankAccountDetails);
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final java.lang.String getBankAccountId() {
        return this.bankAccountId;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails getBankAccountDetails() {
        return this.bankAccountDetails;
    }

    public final java.lang.String toString() {
        boolean z = this.success;
        java.lang.String str = this.bankAccountId;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails = this.bankAccountDetails;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddBankManualResult(success=");
        sb.append(z);
        sb.append(", bankAccountId=");
        sb.append(str);
        sb.append(", bankAccountDetails=");
        sb.append(bankAccountDetails);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.success);
        int hashCode2 = this.bankAccountId.hashCode();
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails = this.bankAccountDetails;
        return (((hashCode * 31) + hashCode2) * 31) + (bankAccountDetails == null ? 0 : bankAccountDetails.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualResult)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualResult addBankManualResult = (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualResult) other;
        return this.success == addBankManualResult.success && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountId, addBankManualResult.bankAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountDetails, addBankManualResult.bankAccountDetails);
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualResult copy(boolean success, java.lang.String bankAccountId, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountId, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualResult(success, bankAccountId, bankAccountDetails);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails getBankAccountDetails() {
        return this.bankAccountDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBankAccountId() {
        return this.bankAccountId;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualResult copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualResult addBankManualResult, boolean z, java.lang.String str, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = addBankManualResult.success;
        }
        if ((i & 2) != 0) {
            str = addBankManualResult.bankAccountId;
        }
        if ((i & 4) != 0) {
            bankAccountDetails = addBankManualResult.bankAccountDetails;
        }
        return addBankManualResult.copy(z, str, bankAccountDetails);
    }
}
