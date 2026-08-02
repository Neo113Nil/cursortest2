package com.paypal.oslo.feature.wallet.banks.connectsdk.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011JB\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u0003\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b!\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/connectsdk/model/ConnectResult;", "", "", "isSuccess", "", "Lcom/paypal/oslo/feature/wallet/banks/connectsdk/model/ConnectedAccount;", "accounts", "", "credentialToken", "errorMessage", "<init>", "(ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "copy", "(ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/connectsdk/model/ConnectResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/util/List;", "getAccounts", "Ljava/lang/String;", "getCredentialToken", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ConnectResult {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectedAccount> accounts;
    private final java.lang.String credentialToken;
    private final java.lang.String errorMessage;
    private final boolean isSuccess;

    public ConnectResult(boolean z, java.util.List<com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectedAccount> list, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.isSuccess = z;
        this.accounts = list;
        this.credentialToken = str;
        this.errorMessage = str2;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public /* synthetic */ ConnectResult(boolean z, java.util.List list, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectedAccount> getAccounts() {
        return this.accounts;
    }

    public final java.lang.String getCredentialToken() {
        return this.credentialToken;
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final java.lang.String toString() {
        boolean z = this.isSuccess;
        java.util.List<com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectedAccount> list = this.accounts;
        java.lang.String str = this.credentialToken;
        java.lang.String str2 = this.errorMessage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectResult(isSuccess=");
        sb.append(z);
        sb.append(", accounts=");
        sb.append(list);
        sb.append(", credentialToken=");
        sb.append(str);
        sb.append(", errorMessage=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isSuccess);
        int hashCode2 = this.accounts.hashCode();
        java.lang.String str = this.credentialToken;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.errorMessage;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectResult)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectResult connectResult = (com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectResult) other;
        return this.isSuccess == connectResult.isSuccess && kotlin.jvm.internal.Intrinsics.areEqual(this.accounts, connectResult.accounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.credentialToken, connectResult.credentialToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, connectResult.errorMessage);
    }

    public final com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectResult copy(boolean isSuccess, java.util.List<com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectedAccount> accounts, java.lang.String credentialToken, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accounts, "");
        return new com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectResult(isSuccess, accounts, credentialToken, errorMessage);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCredentialToken() {
        return this.credentialToken;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectedAccount> component2() {
        return this.accounts;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectResult copy$default(com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectResult connectResult, boolean z, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = connectResult.isSuccess;
        }
        if ((i & 2) != 0) {
            list = connectResult.accounts;
        }
        if ((i & 4) != 0) {
            str = connectResult.credentialToken;
        }
        if ((i & 8) != 0) {
            str2 = connectResult.errorMessage;
        }
        return connectResult.copy(z, list, str, str2);
    }
}
