package com.paypal.oslo.feature.taptopay.domain.model.wallet;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/wallet/WalletInfo;", "", "", "walletId", "partnerName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/wallet/WalletInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getWalletId", "getPartnerName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class WalletInfo {
    public static final int $stable = 0;
    private final java.lang.String partnerName;
    private final java.lang.String walletId;

    public WalletInfo(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.walletId = str;
        this.partnerName = str2;
    }

    public final java.lang.String getWalletId() {
        return this.walletId;
    }

    public final java.lang.String getPartnerName() {
        return this.partnerName;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.walletId;
        java.lang.String str2 = this.partnerName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WalletInfo(walletId=");
        sb.append(str);
        sb.append(", partnerName=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.walletId;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.partnerName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.wallet.WalletInfo)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.domain.model.wallet.WalletInfo walletInfo = (com.paypal.oslo.feature.taptopay.domain.model.wallet.WalletInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.walletId, walletInfo.walletId) && kotlin.jvm.internal.Intrinsics.areEqual(this.partnerName, walletInfo.partnerName);
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.wallet.WalletInfo copy(java.lang.String walletId, java.lang.String partnerName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerName, "");
        return new com.paypal.oslo.feature.taptopay.domain.model.wallet.WalletInfo(walletId, partnerName);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPartnerName() {
        return this.partnerName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getWalletId() {
        return this.walletId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.wallet.WalletInfo copy$default(com.paypal.oslo.feature.taptopay.domain.model.wallet.WalletInfo walletInfo, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = walletInfo.walletId;
        }
        if ((i & 2) != 0) {
            str2 = walletInfo.partnerName;
        }
        return walletInfo.copy(str, str2);
    }
}
