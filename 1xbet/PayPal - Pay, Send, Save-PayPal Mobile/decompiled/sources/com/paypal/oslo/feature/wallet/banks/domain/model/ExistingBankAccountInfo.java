package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJD\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExistingBankAccountInfo;", "", "", "bankAccountId", "lastNChars", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "type", "issuerName", "inlineLogoData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExistingBankAccountInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBankAccountId", "getLastNChars", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "getType", "getIssuerName", "getInlineLogoData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ExistingBankAccountInfo {
    public static final int $stable = 0;
    private final java.lang.String bankAccountId;
    private final java.lang.String inlineLogoData;
    private final java.lang.String issuerName;
    private final java.lang.String lastNChars;
    private final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType type;

    public ExistingBankAccountInfo(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.bankAccountId = str;
        this.lastNChars = str2;
        this.type = bankAccountType;
        this.issuerName = str3;
        this.inlineLogoData = str4;
    }

    public /* synthetic */ ExistingBankAccountInfo(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bankAccountType, str3, (i & 16) != 0 ? null : str4);
    }

    public final java.lang.String getBankAccountId() {
        return this.bankAccountId;
    }

    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    public final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getType() {
        return this.type;
    }

    public final java.lang.String getIssuerName() {
        return this.issuerName;
    }

    public final java.lang.String getInlineLogoData() {
        return this.inlineLogoData;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.bankAccountId;
        java.lang.String str2 = this.lastNChars;
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType = this.type;
        java.lang.String str3 = this.issuerName;
        java.lang.String str4 = this.inlineLogoData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExistingBankAccountInfo(bankAccountId=");
        sb.append(str);
        sb.append(", lastNChars=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(bankAccountType);
        sb.append(", issuerName=");
        sb.append(str3);
        sb.append(", inlineLogoData=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.bankAccountId.hashCode();
        int hashCode2 = this.lastNChars.hashCode();
        int hashCode3 = this.type.hashCode();
        int hashCode4 = this.issuerName.hashCode();
        java.lang.String str = this.inlineLogoData;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo existingBankAccountInfo = (com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountId, existingBankAccountInfo.bankAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, existingBankAccountInfo.lastNChars) && this.type == existingBankAccountInfo.type && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerName, existingBankAccountInfo.issuerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.inlineLogoData, existingBankAccountInfo.inlineLogoData);
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo copy(java.lang.String bankAccountId, java.lang.String lastNChars, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType type, java.lang.String issuerName, java.lang.String inlineLogoData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuerName, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo(bankAccountId, lastNChars, type, issuerName, inlineLogoData);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getInlineLogoData() {
        return this.inlineLogoData;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getIssuerName() {
        return this.issuerName;
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
    public final java.lang.String getBankAccountId() {
        return this.bankAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo existingBankAccountInfo, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = existingBankAccountInfo.bankAccountId;
        }
        if ((i & 2) != 0) {
            str2 = existingBankAccountInfo.lastNChars;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            bankAccountType = existingBankAccountInfo.type;
        }
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType2 = bankAccountType;
        if ((i & 8) != 0) {
            str3 = existingBankAccountInfo.issuerName;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            str4 = existingBankAccountInfo.inlineLogoData;
        }
        return existingBankAccountInfo.copy(str, str5, bankAccountType2, str6, str4);
    }
}
