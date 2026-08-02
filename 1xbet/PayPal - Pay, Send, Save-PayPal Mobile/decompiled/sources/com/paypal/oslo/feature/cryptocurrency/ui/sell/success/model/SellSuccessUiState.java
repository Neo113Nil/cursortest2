package com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/success/model/SellSuccessUiState;", "", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "assetName", "assetLogoUrl", "cryptoAmount", "fiatAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/success/model/SellSuccessUiState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol", "getAssetName", "getAssetLogoUrl", "getCryptoAmount", "getFiatAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SellSuccessUiState {
    public static final int $stable = 0;
    private final java.lang.String assetLogoUrl;
    private final java.lang.String assetName;
    private final java.lang.String assetSymbol;
    private final java.lang.String cryptoAmount;
    private final java.lang.String fiatAmount;

    public SellSuccessUiState(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.assetSymbol = str;
        this.assetName = str2;
        this.assetLogoUrl = str3;
        this.cryptoAmount = str4;
        this.fiatAmount = str5;
    }

    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public final java.lang.String getAssetName() {
        return this.assetName;
    }

    public final java.lang.String getAssetLogoUrl() {
        return this.assetLogoUrl;
    }

    public final java.lang.String getCryptoAmount() {
        return this.cryptoAmount;
    }

    public final java.lang.String getFiatAmount() {
        return this.fiatAmount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.assetSymbol;
        java.lang.String str2 = this.assetName;
        java.lang.String str3 = this.assetLogoUrl;
        java.lang.String str4 = this.cryptoAmount;
        java.lang.String str5 = this.fiatAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SellSuccessUiState(assetSymbol=");
        sb.append(str);
        sb.append(", assetName=");
        sb.append(str2);
        sb.append(", assetLogoUrl=");
        sb.append(str3);
        sb.append(", cryptoAmount=");
        sb.append(str4);
        sb.append(", fiatAmount=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.assetSymbol.hashCode() * 31) + this.assetName.hashCode()) * 31) + this.assetLogoUrl.hashCode()) * 31) + this.cryptoAmount.hashCode()) * 31) + this.fiatAmount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessUiState)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessUiState sellSuccessUiState = (com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, sellSuccessUiState.assetSymbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetName, sellSuccessUiState.assetName) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetLogoUrl, sellSuccessUiState.assetLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoAmount, sellSuccessUiState.cryptoAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiatAmount, sellSuccessUiState.fiatAmount);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessUiState copy(java.lang.String assetSymbol, java.lang.String assetName, java.lang.String assetLogoUrl, java.lang.String cryptoAmount, java.lang.String fiatAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetLogoUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiatAmount, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessUiState(assetSymbol, assetName, assetLogoUrl, cryptoAmount, fiatAmount);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getFiatAmount() {
        return this.fiatAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCryptoAmount() {
        return this.cryptoAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAssetLogoUrl() {
        return this.assetLogoUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAssetName() {
        return this.assetName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessUiState copy$default(com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessUiState sellSuccessUiState, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = sellSuccessUiState.assetSymbol;
        }
        if ((i & 2) != 0) {
            str2 = sellSuccessUiState.assetName;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = sellSuccessUiState.assetLogoUrl;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = sellSuccessUiState.cryptoAmount;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = sellSuccessUiState.fiatAmount;
        }
        return sellSuccessUiState.copy(str, str6, str7, str8, str5);
    }
}
