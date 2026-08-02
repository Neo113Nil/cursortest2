package com.paypal.oslo.feature.cryptocurrency.ui.buy.success.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u0007\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/success/model/BuySuccessUiState;", "", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "cryptoAmount", "fiatAmount", "", "isLoyaltyEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/success/model/BuySuccessUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol", "getCryptoAmount", "getFiatAmount", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BuySuccessUiState {
    public static final int $stable = 0;
    private final java.lang.String assetSymbol;
    private final java.lang.String cryptoAmount;
    private final java.lang.String fiatAmount;
    private final boolean isLoyaltyEnabled;

    public BuySuccessUiState(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.assetSymbol = str;
        this.cryptoAmount = str2;
        this.fiatAmount = str3;
        this.isLoyaltyEnabled = z;
    }

    public /* synthetic */ BuySuccessUiState(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z);
    }

    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public final java.lang.String getCryptoAmount() {
        return this.cryptoAmount;
    }

    public final java.lang.String getFiatAmount() {
        return this.fiatAmount;
    }

    public final boolean isLoyaltyEnabled() {
        return this.isLoyaltyEnabled;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.assetSymbol;
        java.lang.String str2 = this.cryptoAmount;
        java.lang.String str3 = this.fiatAmount;
        boolean z = this.isLoyaltyEnabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BuySuccessUiState(assetSymbol=");
        sb.append(str);
        sb.append(", cryptoAmount=");
        sb.append(str2);
        sb.append(", fiatAmount=");
        sb.append(str3);
        sb.append(", isLoyaltyEnabled=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.assetSymbol.hashCode() * 31) + this.cryptoAmount.hashCode()) * 31) + this.fiatAmount.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isLoyaltyEnabled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.buy.success.model.BuySuccessUiState)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.buy.success.model.BuySuccessUiState buySuccessUiState = (com.paypal.oslo.feature.cryptocurrency.ui.buy.success.model.BuySuccessUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, buySuccessUiState.assetSymbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoAmount, buySuccessUiState.cryptoAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiatAmount, buySuccessUiState.fiatAmount) && this.isLoyaltyEnabled == buySuccessUiState.isLoyaltyEnabled;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.buy.success.model.BuySuccessUiState copy(java.lang.String assetSymbol, java.lang.String cryptoAmount, java.lang.String fiatAmount, boolean isLoyaltyEnabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiatAmount, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.success.model.BuySuccessUiState(assetSymbol, cryptoAmount, fiatAmount, isLoyaltyEnabled);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoyaltyEnabled() {
        return this.isLoyaltyEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFiatAmount() {
        return this.fiatAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCryptoAmount() {
        return this.cryptoAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.success.model.BuySuccessUiState copy$default(com.paypal.oslo.feature.cryptocurrency.ui.buy.success.model.BuySuccessUiState buySuccessUiState, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = buySuccessUiState.assetSymbol;
        }
        if ((i & 2) != 0) {
            str2 = buySuccessUiState.cryptoAmount;
        }
        if ((i & 4) != 0) {
            str3 = buySuccessUiState.fiatAmount;
        }
        if ((i & 8) != 0) {
            z = buySuccessUiState.isLoyaltyEnabled;
        }
        return buySuccessUiState.copy(str, str2, str3, z);
    }
}
