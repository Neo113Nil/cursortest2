package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JJ\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u000eR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkExternalBankAccountsResult;", "", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkedBankAccountResult;", "linkedAccounts", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/FailedBankAccountResult;", "failedAccounts", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExistingBankAccountInfo;", "existingAccounts", "", "bankLogoImageBase64", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkExternalBankAccountsResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getLinkedAccounts", "getFailedAccounts", "getExistingAccounts", "Ljava/lang/String;", "getBankLogoImageBase64"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LinkExternalBankAccountsResult {
    public static final int $stable = 8;
    private final java.lang.String bankLogoImageBase64;
    private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo> existingAccounts;
    private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> failedAccounts;
    private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> linkedAccounts;

    public LinkExternalBankAccountsResult(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> list, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list2, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo> list3, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.linkedAccounts = list;
        this.failedAccounts = list2;
        this.existingAccounts = list3;
        this.bankLogoImageBase64 = str;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> getLinkedAccounts() {
        return this.linkedAccounts;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> getFailedAccounts() {
        return this.failedAccounts;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo> getExistingAccounts() {
        return this.existingAccounts;
    }

    public /* synthetic */ LinkExternalBankAccountsResult(java.util.List list, java.util.List list2, java.util.List list3, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, (i & 8) != 0 ? "" : str);
    }

    public final java.lang.String getBankLogoImageBase64() {
        return this.bankLogoImageBase64;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> list = this.linkedAccounts;
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list2 = this.failedAccounts;
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo> list3 = this.existingAccounts;
        java.lang.String str = this.bankLogoImageBase64;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkExternalBankAccountsResult(linkedAccounts=");
        sb.append(list);
        sb.append(", failedAccounts=");
        sb.append(list2);
        sb.append(", existingAccounts=");
        sb.append(list3);
        sb.append(", bankLogoImageBase64=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.linkedAccounts.hashCode() * 31) + this.failedAccounts.hashCode()) * 31) + this.existingAccounts.hashCode()) * 31) + this.bankLogoImageBase64.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult linkExternalBankAccountsResult = (com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.linkedAccounts, linkExternalBankAccountsResult.linkedAccounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.failedAccounts, linkExternalBankAccountsResult.failedAccounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.existingAccounts, linkExternalBankAccountsResult.existingAccounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankLogoImageBase64, linkExternalBankAccountsResult.bankLogoImageBase64);
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult copy(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> linkedAccounts, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> failedAccounts, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo> existingAccounts, java.lang.String bankLogoImageBase64) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedAccounts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedAccounts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(existingAccounts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankLogoImageBase64, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult(linkedAccounts, failedAccounts, existingAccounts, bankLogoImageBase64);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getBankLogoImageBase64() {
        return this.bankLogoImageBase64;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo> component3() {
        return this.existingAccounts;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> component2() {
        return this.failedAccounts;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> component1() {
        return this.linkedAccounts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult linkExternalBankAccountsResult, java.util.List list, java.util.List list2, java.util.List list3, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = linkExternalBankAccountsResult.linkedAccounts;
        }
        if ((i & 2) != 0) {
            list2 = linkExternalBankAccountsResult.failedAccounts;
        }
        if ((i & 4) != 0) {
            list3 = linkExternalBankAccountsResult.existingAccounts;
        }
        if ((i & 8) != 0) {
            str = linkExternalBankAccountsResult.bankLogoImageBase64;
        }
        return linkExternalBankAccountsResult.copy(list, list2, list3, str);
    }
}
