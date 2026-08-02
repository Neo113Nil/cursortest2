package com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJD\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/amountentry/model/AmountEntryUiState;", "", "", "currentAmount", "currencyCode", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "titleAssetDisplayName", "amountError", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/amountentry/model/AmountEntryUiState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCurrentAmount", "getCurrencyCode", "getAssetSymbol", "getTitleAssetDisplayName", "getAmountError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AmountEntryUiState {
    public static final int $stable = 0;
    private final java.lang.String amountError;
    private final java.lang.String assetSymbol;
    private final java.lang.String currencyCode;
    private final java.lang.String currentAmount;
    private final java.lang.String titleAssetDisplayName;

    public AmountEntryUiState(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.currentAmount = str;
        this.currencyCode = str2;
        this.assetSymbol = str3;
        this.titleAssetDisplayName = str4;
        this.amountError = str5;
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

    public /* synthetic */ AmountEntryUiState(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5);
    }

    public final java.lang.String getTitleAssetDisplayName() {
        return this.titleAssetDisplayName;
    }

    public final java.lang.String getAmountError() {
        return this.amountError;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.currentAmount;
        java.lang.String str2 = this.currencyCode;
        java.lang.String str3 = this.assetSymbol;
        java.lang.String str4 = this.titleAssetDisplayName;
        java.lang.String str5 = this.amountError;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountEntryUiState(currentAmount=");
        sb.append(str);
        sb.append(", currencyCode=");
        sb.append(str2);
        sb.append(", assetSymbol=");
        sb.append(str3);
        sb.append(", titleAssetDisplayName=");
        sb.append(str4);
        sb.append(", amountError=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.currentAmount.hashCode();
        int hashCode2 = this.currencyCode.hashCode();
        int hashCode3 = this.assetSymbol.hashCode();
        int hashCode4 = this.titleAssetDisplayName.hashCode();
        java.lang.String str = this.amountError;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState amountEntryUiState = (com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.currentAmount, amountEntryUiState.currentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amountEntryUiState.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, amountEntryUiState.assetSymbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.titleAssetDisplayName, amountEntryUiState.titleAssetDisplayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountError, amountEntryUiState.amountError);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState copy(java.lang.String currentAmount, java.lang.String currencyCode, java.lang.String assetSymbol, java.lang.String titleAssetDisplayName, java.lang.String amountError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(titleAssetDisplayName, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState(currentAmount, currencyCode, assetSymbol, titleAssetDisplayName, amountError);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getAmountError() {
        return this.amountError;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getTitleAssetDisplayName() {
        return this.titleAssetDisplayName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCurrentAmount() {
        return this.currentAmount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState copy$default(com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState amountEntryUiState, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = amountEntryUiState.currentAmount;
        }
        if ((i & 2) != 0) {
            str2 = amountEntryUiState.currencyCode;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = amountEntryUiState.assetSymbol;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = amountEntryUiState.titleAssetDisplayName;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = amountEntryUiState.amountError;
        }
        return amountEntryUiState.copy(str, str6, str7, str8, str5);
    }
}
