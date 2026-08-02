package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExistingBankAccount;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankIssuer;", "issuer", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankIssuer;Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankIssuer;", "component4", "()Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankIssuer;Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExistingBankAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankIssuer;", "getIssuer", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ExistingBankAccount {
    public static final int $stable = 0;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.BankIssuer issuer;
    private final java.lang.String lastNChars;
    private final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType type;

    public ExistingBankAccount(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.banks.domain.model.BankIssuer bankIssuer, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankIssuer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
        this.id = str;
        this.lastNChars = str2;
        this.issuer = bankIssuer;
        this.type = bankAccountType;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankIssuer getIssuer() {
        return this.issuer;
    }

    public final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.lastNChars;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankIssuer bankIssuer = this.issuer;
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExistingBankAccount(id=");
        sb.append(str);
        sb.append(", lastNChars=");
        sb.append(str2);
        sb.append(", issuer=");
        sb.append(bankIssuer);
        sb.append(", type=");
        sb.append(bankAccountType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.id.hashCode() * 31) + this.lastNChars.hashCode()) * 31) + this.issuer.hashCode()) * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccount)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccount existingBankAccount = (com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccount) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, existingBankAccount.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, existingBankAccount.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, existingBankAccount.issuer) && this.type == existingBankAccount.type;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccount copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.feature.wallet.banks.domain.model.BankIssuer issuer, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccount(id, lastNChars, issuer, type);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankIssuer getIssuer() {
        return this.issuer;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccount copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccount existingBankAccount, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.banks.domain.model.BankIssuer bankIssuer, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = existingBankAccount.id;
        }
        if ((i & 2) != 0) {
            str2 = existingBankAccount.lastNChars;
        }
        if ((i & 4) != 0) {
            bankIssuer = existingBankAccount.issuer;
        }
        if ((i & 8) != 0) {
            bankAccountType = existingBankAccount.type;
        }
        return existingBankAccount.copy(str, str2, bankIssuer, bankAccountType);
    }
}
