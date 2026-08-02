package com.paypal.oslo.feature.wallet.me.domain.crypto;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0004\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u001b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoProduct;", "Lcom/paypal/oslo/feature/wallet/me/domain/Product;", "Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoOverview;", "", "isEnrolled", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(ZLcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoOverview;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoOverview;", "copy", "(ZLcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoOverview;)Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoProduct;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoOverview;", "getData", "Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "type", "Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "getType", "()Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CryptoProduct implements com.paypal.oslo.feature.wallet.me.domain.Product<com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview data;
    private final boolean isEnrolled;
    private final com.paypal.oslo.feature.wallet.me.domain.Product.Type type = com.paypal.oslo.feature.wallet.me.domain.Product.Type.CRYPTO;

    public CryptoProduct(boolean z, com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview cryptoOverview) {
        this.isEnrolled = z;
        this.data = cryptoOverview;
    }

    @Override // com.paypal.oslo.feature.wallet.me.domain.Product
    public final boolean isEnrolled() {
        return this.isEnrolled;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.paypal.oslo.feature.wallet.me.domain.Product
    public final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview getData() {
        return this.data;
    }

    @Override // com.paypal.oslo.feature.wallet.me.domain.Product
    public final com.paypal.oslo.feature.wallet.me.domain.Product.Type getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        boolean z = this.isEnrolled;
        com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview cryptoOverview = this.data;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoProduct(isEnrolled=");
        sb.append(z);
        sb.append(", data=");
        sb.append(cryptoOverview);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isEnrolled);
        com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview cryptoOverview = this.data;
        return (hashCode * 31) + (cryptoOverview == null ? 0 : cryptoOverview.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoProduct)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoProduct cryptoProduct = (com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoProduct) other;
        return this.isEnrolled == cryptoProduct.isEnrolled && kotlin.jvm.internal.Intrinsics.areEqual(this.data, cryptoProduct.data);
    }

    public final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoProduct copy(boolean isEnrolled, com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview data) {
        return new com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoProduct(isEnrolled, data);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview getData() {
        return this.data;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnrolled() {
        return this.isEnrolled;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoProduct copy$default(com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoProduct cryptoProduct, boolean z, com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview cryptoOverview, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = cryptoProduct.isEnrolled;
        }
        if ((i & 2) != 0) {
            cryptoOverview = cryptoProduct.data;
        }
        return cryptoProduct.copy(z, cryptoOverview);
    }
}
