package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ0\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccountsResult;", "", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountCandidate;", "items", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExistingBankAccount;", "existingBankAccounts", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccountsResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems", "getExistingBankAccounts"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ExternalBankAccountsResult {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccount> existingBankAccounts;
    private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountCandidate> items;

    public ExternalBankAccountsResult(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountCandidate> list, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccount> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.items = list;
        this.existingBankAccounts = list2;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountCandidate> getItems() {
        return this.items;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccount> getExistingBankAccounts() {
        return this.existingBankAccounts;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountCandidate> list = this.items;
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccount> list2 = this.existingBankAccounts;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExternalBankAccountsResult(items=");
        sb.append(list);
        sb.append(", existingBankAccounts=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.items.hashCode() * 31) + this.existingBankAccounts.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsResult)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsResult externalBankAccountsResult = (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.items, externalBankAccountsResult.items) && kotlin.jvm.internal.Intrinsics.areEqual(this.existingBankAccounts, externalBankAccountsResult.existingBankAccounts);
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsResult copy(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountCandidate> items, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccount> existingBankAccounts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(existingBankAccounts, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsResult(items, existingBankAccounts);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccount> component2() {
        return this.existingBankAccounts;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountCandidate> component1() {
        return this.items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsResult copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsResult externalBankAccountsResult, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = externalBankAccountsResult.items;
        }
        if ((i & 2) != 0) {
            list2 = externalBankAccountsResult.existingBankAccounts;
        }
        return externalBankAccountsResult.copy(list, list2);
    }
}
