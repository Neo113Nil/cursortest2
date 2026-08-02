package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountCandidate;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "type", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankIssuer;", "issuer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankIssuer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "component4", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankIssuer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankIssuer;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountCandidate;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "getType", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankIssuer;", "getIssuer"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BankAccountCandidate {
    public static final int $stable = 0;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.BankIssuer issuer;
    private final java.lang.String lastNChars;
    private final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType type;

    public BankAccountCandidate(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, com.paypal.oslo.feature.wallet.banks.domain.model.BankIssuer bankIssuer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankIssuer, "");
        this.id = str;
        this.lastNChars = str2;
        this.type = bankAccountType;
        this.issuer = bankIssuer;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    public final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getType() {
        return this.type;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankIssuer getIssuer() {
        return this.issuer;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.lastNChars;
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType = this.type;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankIssuer bankIssuer = this.issuer;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BankAccountCandidate(id=");
        sb.append(str);
        sb.append(", lastNChars=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(bankAccountType);
        sb.append(", issuer=");
        sb.append(bankIssuer);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.id.hashCode() * 31) + this.lastNChars.hashCode()) * 31) + this.type.hashCode()) * 31) + this.issuer.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountCandidate)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountCandidate bankAccountCandidate = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountCandidate) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, bankAccountCandidate.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, bankAccountCandidate.lastNChars) && this.type == bankAccountCandidate.type && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, bankAccountCandidate.issuer);
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountCandidate copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType type, com.paypal.oslo.feature.wallet.banks.domain.model.BankIssuer issuer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuer, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountCandidate(id, lastNChars, type, issuer);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankIssuer getIssuer() {
        return this.issuer;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountCandidate copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountCandidate bankAccountCandidate, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, com.paypal.oslo.feature.wallet.banks.domain.model.BankIssuer bankIssuer, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bankAccountCandidate.id;
        }
        if ((i & 2) != 0) {
            str2 = bankAccountCandidate.lastNChars;
        }
        if ((i & 4) != 0) {
            bankAccountType = bankAccountCandidate.type;
        }
        if ((i & 8) != 0) {
            bankIssuer = bankAccountCandidate.issuer;
        }
        return bankAccountCandidate.copy(str, str2, bankAccountType, bankIssuer);
    }
}
