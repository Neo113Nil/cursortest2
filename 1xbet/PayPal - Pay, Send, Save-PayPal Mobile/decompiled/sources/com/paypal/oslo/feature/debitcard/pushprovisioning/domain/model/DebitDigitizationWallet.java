package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitDigitizationWallet;", "", "", "walletId", "deviceId", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/WalletProvider;", "brand", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/WalletProvider;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/WalletProvider;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/WalletProvider;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitDigitizationWallet;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getWalletId", "getDeviceId", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/WalletProvider;", "getBrand"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitDigitizationWallet {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider brand;
    private final java.lang.String deviceId;
    private final java.lang.String walletId;

    public DebitDigitizationWallet(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider walletProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletProvider, "");
        this.walletId = str;
        this.deviceId = str2;
        this.brand = walletProvider;
    }

    public final java.lang.String getWalletId() {
        return this.walletId;
    }

    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider getBrand() {
        return this.brand;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.walletId;
        java.lang.String str2 = this.deviceId;
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider walletProvider = this.brand;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitDigitizationWallet(walletId=");
        sb.append(str);
        sb.append(", deviceId=");
        sb.append(str2);
        sb.append(", brand=");
        sb.append(walletProvider);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.walletId.hashCode() * 31) + this.deviceId.hashCode()) * 31) + this.brand.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationWallet)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationWallet debitDigitizationWallet = (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationWallet) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.walletId, debitDigitizationWallet.walletId) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, debitDigitizationWallet.deviceId) && this.brand == debitDigitizationWallet.brand;
    }

    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationWallet copy(java.lang.String walletId, java.lang.String deviceId, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider brand) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brand, "");
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationWallet(walletId, deviceId, brand);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider getBrand() {
        return this.brand;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getWalletId() {
        return this.walletId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationWallet copy$default(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationWallet debitDigitizationWallet, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider walletProvider, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = debitDigitizationWallet.walletId;
        }
        if ((i & 2) != 0) {
            str2 = debitDigitizationWallet.deviceId;
        }
        if ((i & 4) != 0) {
            walletProvider = debitDigitizationWallet.brand;
        }
        return debitDigitizationWallet.copy(str, str2, walletProvider);
    }
}
