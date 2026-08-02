package com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001d\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewArgs;", "", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "amount", "", "isSellAll", "cryptoQuantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewArgs;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol", "getAmount", "Z", "getCryptoQuantity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoSellReviewArgs {
    public static final int $stable = 0;
    private final java.lang.String amount;
    private final java.lang.String assetSymbol;
    private final java.lang.String cryptoQuantity;
    private final boolean isSellAll;

    public CryptoSellReviewArgs(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.assetSymbol = str;
        this.amount = str2;
        this.isSellAll = z;
        this.cryptoQuantity = str3;
    }

    public /* synthetic */ CryptoSellReviewArgs(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3);
    }

    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final boolean isSellAll() {
        return this.isSellAll;
    }

    public final java.lang.String getCryptoQuantity() {
        return this.cryptoQuantity;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.assetSymbol;
        java.lang.String str2 = this.amount;
        boolean z = this.isSellAll;
        java.lang.String str3 = this.cryptoQuantity;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoSellReviewArgs(assetSymbol=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(str2);
        sb.append(", isSellAll=");
        sb.append(z);
        sb.append(", cryptoQuantity=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.assetSymbol.hashCode();
        int hashCode2 = this.amount.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.isSellAll);
        java.lang.String str = this.cryptoQuantity;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs cryptoSellReviewArgs = (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, cryptoSellReviewArgs.assetSymbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, cryptoSellReviewArgs.amount) && this.isSellAll == cryptoSellReviewArgs.isSellAll && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoQuantity, cryptoSellReviewArgs.cryptoQuantity);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs copy(java.lang.String assetSymbol, java.lang.String amount, boolean isSellAll, java.lang.String cryptoQuantity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs(assetSymbol, amount, isSellAll, cryptoQuantity);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCryptoQuantity() {
        return this.cryptoQuantity;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSellAll() {
        return this.isSellAll;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs copy$default(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs cryptoSellReviewArgs, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cryptoSellReviewArgs.assetSymbol;
        }
        if ((i & 2) != 0) {
            str2 = cryptoSellReviewArgs.amount;
        }
        if ((i & 4) != 0) {
            z = cryptoSellReviewArgs.isSellAll;
        }
        if ((i & 8) != 0) {
            str3 = cryptoSellReviewArgs.cryptoQuantity;
        }
        return cryptoSellReviewArgs.copy(str, str2, z, str3);
    }
}
