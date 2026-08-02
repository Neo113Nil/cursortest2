package com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountResult;", "", "", "success", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccount;", "bankAccount", "", "message", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(ZLcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccount;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccount;", "component3", "()Ljava/lang/String;", "component4", "copy", "(ZLcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccount;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getSuccess", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccount;", "getBankAccount", "Ljava/lang/String;", "getMessage", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ConfirmBankAccountResult {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount;
    private final java.lang.String description;
    private final java.lang.String message;
    private final boolean success;

    public ConfirmBankAccountResult(boolean z, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccount, "");
        this.success = z;
        this.bankAccount = bankAccount;
        this.message = str;
        this.description = str2;
    }

    public /* synthetic */ ConfirmBankAccountResult(boolean z, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, bankAccount, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String toString() {
        boolean z = this.success;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount = this.bankAccount;
        java.lang.String str = this.message;
        java.lang.String str2 = this.description;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmBankAccountResult(success=");
        sb.append(z);
        sb.append(", bankAccount=");
        sb.append(bankAccount);
        sb.append(", message=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.success);
        int hashCode2 = this.bankAccount.hashCode();
        java.lang.String str = this.message;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.description;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult confirmBankAccountResult = (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult) other;
        return this.success == confirmBankAccountResult.success && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccount, confirmBankAccountResult.bankAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, confirmBankAccountResult.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, confirmBankAccountResult.description);
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult copy(boolean success, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount, java.lang.String message, java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccount, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult(success, bankAccount, message, description);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount getBankAccount() {
        return this.bankAccount;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult confirmBankAccountResult, boolean z, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = confirmBankAccountResult.success;
        }
        if ((i & 2) != 0) {
            bankAccount = confirmBankAccountResult.bankAccount;
        }
        if ((i & 4) != 0) {
            str = confirmBankAccountResult.message;
        }
        if ((i & 8) != 0) {
            str2 = confirmBankAccountResult.description;
        }
        return confirmBankAccountResult.copy(z, bankAccount, str, str2);
    }
}
