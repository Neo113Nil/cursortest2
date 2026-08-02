package com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0096\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b\u0007\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b0\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b1\u0010\u0014R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b2\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b3\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b4\u0010\u0014R\u001a\u0010\r\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b5\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b6\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b7\u0010\u0014R\u001a\u0010\u0010\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b\u0010\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/model/CryptoSellAmountEntryUiState;", "", "", "currentAmount", "currencyCode", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "", "isLoading", "titleAssetDisplayName", "maxSellableAmountFormatted", "exchangeRateFormatted", "amountError", "holdingsError", "showSellAllConfirmation", "maxSellableAmountRaw", "maxSellableCryptoQuantity", "isSellAllMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/model/CryptoSellAmountEntryUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCurrentAmount", "getCurrencyCode", "getAssetSymbol", "Z", "getTitleAssetDisplayName", "getMaxSellableAmountFormatted", "getExchangeRateFormatted", "getAmountError", "getHoldingsError", "getShowSellAllConfirmation", "getMaxSellableAmountRaw", "getMaxSellableCryptoQuantity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoSellAmountEntryUiState {
    public static final int $stable = 0;
    private final java.lang.String amountError;
    private final java.lang.String assetSymbol;
    private final java.lang.String currencyCode;
    private final java.lang.String currentAmount;
    private final java.lang.String exchangeRateFormatted;
    private final java.lang.String holdingsError;
    private final boolean isLoading;
    private final boolean isSellAllMode;
    private final java.lang.String maxSellableAmountFormatted;
    private final java.lang.String maxSellableAmountRaw;
    private final java.lang.String maxSellableCryptoQuantity;
    private final boolean showSellAllConfirmation;
    private final java.lang.String titleAssetDisplayName;

    public CryptoSellAmountEntryUiState(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, boolean z2, java.lang.String str9, java.lang.String str10, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str10, "");
        this.currentAmount = str;
        this.currencyCode = str2;
        this.assetSymbol = str3;
        this.isLoading = z;
        this.titleAssetDisplayName = str4;
        this.maxSellableAmountFormatted = str5;
        this.exchangeRateFormatted = str6;
        this.amountError = str7;
        this.holdingsError = str8;
        this.showSellAllConfirmation = z2;
        this.maxSellableAmountRaw = str9;
        this.maxSellableCryptoQuantity = str10;
        this.isSellAllMode = z3;
    }

    public /* synthetic */ CryptoSellAmountEntryUiState(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, boolean z2, java.lang.String str9, java.lang.String str10, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? true : z, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? true : z3);
    }

    public final java.lang.String getCurrentAmount() {
        return this.currentAmount;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final java.lang.String getTitleAssetDisplayName() {
        return this.titleAssetDisplayName;
    }

    public final java.lang.String getMaxSellableAmountFormatted() {
        return this.maxSellableAmountFormatted;
    }

    public final java.lang.String getExchangeRateFormatted() {
        return this.exchangeRateFormatted;
    }

    public final java.lang.String getAmountError() {
        return this.amountError;
    }

    public final java.lang.String getHoldingsError() {
        return this.holdingsError;
    }

    public final boolean getShowSellAllConfirmation() {
        return this.showSellAllConfirmation;
    }

    public final java.lang.String getMaxSellableAmountRaw() {
        return this.maxSellableAmountRaw;
    }

    public final java.lang.String getMaxSellableCryptoQuantity() {
        return this.maxSellableCryptoQuantity;
    }

    public final boolean isSellAllMode() {
        return this.isSellAllMode;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.currentAmount;
        java.lang.String str2 = this.currencyCode;
        java.lang.String str3 = this.assetSymbol;
        boolean z = this.isLoading;
        java.lang.String str4 = this.titleAssetDisplayName;
        java.lang.String str5 = this.maxSellableAmountFormatted;
        java.lang.String str6 = this.exchangeRateFormatted;
        java.lang.String str7 = this.amountError;
        java.lang.String str8 = this.holdingsError;
        boolean z2 = this.showSellAllConfirmation;
        java.lang.String str9 = this.maxSellableAmountRaw;
        java.lang.String str10 = this.maxSellableCryptoQuantity;
        boolean z3 = this.isSellAllMode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoSellAmountEntryUiState(currentAmount=");
        sb.append(str);
        sb.append(", currencyCode=");
        sb.append(str2);
        sb.append(", assetSymbol=");
        sb.append(str3);
        sb.append(", isLoading=");
        sb.append(z);
        sb.append(", titleAssetDisplayName=");
        sb.append(str4);
        sb.append(", maxSellableAmountFormatted=");
        sb.append(str5);
        sb.append(", exchangeRateFormatted=");
        sb.append(str6);
        sb.append(", amountError=");
        sb.append(str7);
        sb.append(", holdingsError=");
        sb.append(str8);
        sb.append(", showSellAllConfirmation=");
        sb.append(z2);
        sb.append(", maxSellableAmountRaw=");
        sb.append(str9);
        sb.append(", maxSellableCryptoQuantity=");
        sb.append(str10);
        sb.append(", isSellAllMode=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.currentAmount.hashCode();
        int hashCode2 = this.currencyCode.hashCode();
        int hashCode3 = this.assetSymbol.hashCode();
        int hashCode4 = java.lang.Boolean.hashCode(this.isLoading);
        int hashCode5 = this.titleAssetDisplayName.hashCode();
        int hashCode6 = this.maxSellableAmountFormatted.hashCode();
        int hashCode7 = this.exchangeRateFormatted.hashCode();
        java.lang.String str = this.amountError;
        int hashCode8 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.holdingsError;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.showSellAllConfirmation)) * 31) + this.maxSellableAmountRaw.hashCode()) * 31) + this.maxSellableCryptoQuantity.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isSellAllMode);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState cryptoSellAmountEntryUiState = (com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.currentAmount, cryptoSellAmountEntryUiState.currentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, cryptoSellAmountEntryUiState.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, cryptoSellAmountEntryUiState.assetSymbol) && this.isLoading == cryptoSellAmountEntryUiState.isLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.titleAssetDisplayName, cryptoSellAmountEntryUiState.titleAssetDisplayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxSellableAmountFormatted, cryptoSellAmountEntryUiState.maxSellableAmountFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRateFormatted, cryptoSellAmountEntryUiState.exchangeRateFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountError, cryptoSellAmountEntryUiState.amountError) && kotlin.jvm.internal.Intrinsics.areEqual(this.holdingsError, cryptoSellAmountEntryUiState.holdingsError) && this.showSellAllConfirmation == cryptoSellAmountEntryUiState.showSellAllConfirmation && kotlin.jvm.internal.Intrinsics.areEqual(this.maxSellableAmountRaw, cryptoSellAmountEntryUiState.maxSellableAmountRaw) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxSellableCryptoQuantity, cryptoSellAmountEntryUiState.maxSellableCryptoQuantity) && this.isSellAllMode == cryptoSellAmountEntryUiState.isSellAllMode;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState copy(java.lang.String currentAmount, java.lang.String currencyCode, java.lang.String assetSymbol, boolean isLoading, java.lang.String titleAssetDisplayName, java.lang.String maxSellableAmountFormatted, java.lang.String exchangeRateFormatted, java.lang.String amountError, java.lang.String holdingsError, boolean showSellAllConfirmation, java.lang.String maxSellableAmountRaw, java.lang.String maxSellableCryptoQuantity, boolean isSellAllMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(titleAssetDisplayName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxSellableAmountFormatted, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRateFormatted, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxSellableAmountRaw, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxSellableCryptoQuantity, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryUiState(currentAmount, currencyCode, assetSymbol, isLoading, titleAssetDisplayName, maxSellableAmountFormatted, exchangeRateFormatted, amountError, holdingsError, showSellAllConfirmation, maxSellableAmountRaw, maxSellableCryptoQuantity, isSellAllMode);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getHoldingsError() {
        return this.holdingsError;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getAmountError() {
        return this.amountError;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getExchangeRateFormatted() {
        return this.exchangeRateFormatted;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getMaxSellableAmountFormatted() {
        return this.maxSellableAmountFormatted;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getTitleAssetDisplayName() {
        return this.titleAssetDisplayName;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsSellAllMode() {
        return this.isSellAllMode;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getMaxSellableCryptoQuantity() {
        return this.maxSellableCryptoQuantity;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getMaxSellableAmountRaw() {
        return this.maxSellableAmountRaw;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowSellAllConfirmation() {
        return this.showSellAllConfirmation;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCurrentAmount() {
        return this.currentAmount;
    }
}
