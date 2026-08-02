package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetails;", "", "", "bankName", "inlineLogoUrl", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/LogoImageData;", "inlineLogoImageData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/LogoImageData;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/LogoImageData;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/LogoImageData;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBankName", "getInlineLogoUrl", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/LogoImageData;", "getInlineLogoImageData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BankDetails {
    public static final int $stable = 0;
    private final java.lang.String bankName;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.LogoImageData inlineLogoImageData;
    private final java.lang.String inlineLogoUrl;

    public BankDetails(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.banks.domain.model.LogoImageData logoImageData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.bankName = str;
        this.inlineLogoUrl = str2;
        this.inlineLogoImageData = logoImageData;
    }

    public final java.lang.String getBankName() {
        return this.bankName;
    }

    public final java.lang.String getInlineLogoUrl() {
        return this.inlineLogoUrl;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.LogoImageData getInlineLogoImageData() {
        return this.inlineLogoImageData;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.bankName;
        java.lang.String str2 = this.inlineLogoUrl;
        com.paypal.oslo.feature.wallet.banks.domain.model.LogoImageData logoImageData = this.inlineLogoImageData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BankDetails(bankName=");
        sb.append(str);
        sb.append(", inlineLogoUrl=");
        sb.append(str2);
        sb.append(", inlineLogoImageData=");
        sb.append(logoImageData);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.bankName.hashCode();
        java.lang.String str = this.inlineLogoUrl;
        int hashCode2 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.wallet.banks.domain.model.LogoImageData logoImageData = this.inlineLogoImageData;
        return (((hashCode * 31) + hashCode2) * 31) + (logoImageData != null ? logoImageData.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.BankDetails)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.BankDetails bankDetails = (com.paypal.oslo.feature.wallet.banks.domain.model.BankDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, bankDetails.bankName) && kotlin.jvm.internal.Intrinsics.areEqual(this.inlineLogoUrl, bankDetails.inlineLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.inlineLogoImageData, bankDetails.inlineLogoImageData);
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankDetails copy(java.lang.String bankName, java.lang.String inlineLogoUrl, com.paypal.oslo.feature.wallet.banks.domain.model.LogoImageData inlineLogoImageData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankName, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.BankDetails(bankName, inlineLogoUrl, inlineLogoImageData);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.LogoImageData getInlineLogoImageData() {
        return this.inlineLogoImageData;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getInlineLogoUrl() {
        return this.inlineLogoUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getBankName() {
        return this.bankName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.BankDetails copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.BankDetails bankDetails, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.banks.domain.model.LogoImageData logoImageData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bankDetails.bankName;
        }
        if ((i & 2) != 0) {
            str2 = bankDetails.inlineLogoUrl;
        }
        if ((i & 4) != 0) {
            logoImageData = bankDetails.inlineLogoImageData;
        }
        return bankDetails.copy(str, str2, logoImageData);
    }
}
