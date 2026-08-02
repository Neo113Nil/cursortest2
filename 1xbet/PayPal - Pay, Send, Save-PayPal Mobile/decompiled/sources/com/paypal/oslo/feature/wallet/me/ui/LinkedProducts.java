package com.paypal.oslo.feature.wallet.me.ui;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/ui/LinkedProducts;", "", "Lcom/paypal/oslo/feature/wallet/me/domain/wallet/LinkedBanksProduct;", "p0", "Lcom/paypal/oslo/feature/wallet/me/domain/wallet/LinkedCardsProduct;", "p1", "Lcom/paypal/oslo/feature/wallet/me/domain/wallet/LinkedThirdPartyLoyaltyProduct;", "p2", "<init>", "(Lcom/paypal/oslo/feature/wallet/me/domain/wallet/LinkedBanksProduct;Lcom/paypal/oslo/feature/wallet/me/domain/wallet/LinkedCardsProduct;Lcom/paypal/oslo/feature/wallet/me/domain/wallet/LinkedThirdPartyLoyaltyProduct;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/wallet/me/domain/wallet/LinkedBanksProduct;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/wallet/me/domain/wallet/LinkedCardsProduct;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/wallet/me/domain/wallet/LinkedThirdPartyLoyaltyProduct;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class LinkedProducts {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedBanksProduct getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedCardsProduct getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedThirdPartyLoyaltyProduct Camera2StreamConfigurationMap;

    public LinkedProducts(com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedBanksProduct linkedBanksProduct, com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedCardsProduct linkedCardsProduct, com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedThirdPartyLoyaltyProduct linkedThirdPartyLoyaltyProduct) {
        this.getHighSpeedVideoFpsRanges = linkedBanksProduct;
        this.getHighSpeedVideoSizes = linkedCardsProduct;
        this.Camera2StreamConfigurationMap = linkedThirdPartyLoyaltyProduct;
    }

    public /* synthetic */ LinkedProducts(com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedBanksProduct linkedBanksProduct, com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedCardsProduct linkedCardsProduct, com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedThirdPartyLoyaltyProduct linkedThirdPartyLoyaltyProduct, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : linkedBanksProduct, (i & 2) != 0 ? null : linkedCardsProduct, (i & 4) != 0 ? null : linkedThirdPartyLoyaltyProduct);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedBanksProduct linkedBanksProduct = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedCardsProduct linkedCardsProduct = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedThirdPartyLoyaltyProduct linkedThirdPartyLoyaltyProduct = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkedProducts(getHighSpeedVideoFpsRanges=");
        sb.append(linkedBanksProduct);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(linkedCardsProduct);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(linkedThirdPartyLoyaltyProduct);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedBanksProduct linkedBanksProduct = this.getHighSpeedVideoFpsRanges;
        int hashCode = linkedBanksProduct == null ? 0 : linkedBanksProduct.hashCode();
        com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedCardsProduct linkedCardsProduct = this.getHighSpeedVideoSizes;
        int hashCode2 = linkedCardsProduct == null ? 0 : linkedCardsProduct.hashCode();
        com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedThirdPartyLoyaltyProduct linkedThirdPartyLoyaltyProduct = this.Camera2StreamConfigurationMap;
        return (((hashCode * 31) + hashCode2) * 31) + (linkedThirdPartyLoyaltyProduct != null ? linkedThirdPartyLoyaltyProduct.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.wallet.me.ui.LinkedProducts)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.me.ui.LinkedProducts linkedProducts = (com.paypal.oslo.feature.wallet.me.ui.LinkedProducts) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, linkedProducts.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, linkedProducts.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, linkedProducts.Camera2StreamConfigurationMap);
    }

    public LinkedProducts() {
        this(null, null, null, 7, null);
    }
}
