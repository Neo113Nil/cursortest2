package com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/model/CryptoSellAmountEntryEffect;", "", "NavigateBack", "NavigateToNextScreen", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/model/CryptoSellAmountEntryEffect$NavigateBack;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/model/CryptoSellAmountEntryEffect$NavigateToNextScreen;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CryptoSellAmountEntryEffect {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/model/CryptoSellAmountEntryEffect$NavigateBack;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/model/CryptoSellAmountEntryEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect.NavigateBack();

        public final int hashCode() {
            return 1021493108;
        }

        private NavigateBack() {
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/model/CryptoSellAmountEntryEffect$NavigateToNextScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/model/CryptoSellAmountEntryEffect;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "amount", "", "isSellAll", "cryptoQuantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/amountentry/model/CryptoSellAmountEntryEffect$NavigateToNextScreen;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol", "getAmount", "Z", "getCryptoQuantity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToNextScreen implements com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect {
        public static final int $stable = 0;
        private final java.lang.String amount;
        private final java.lang.String assetSymbol;
        private final java.lang.String cryptoQuantity;
        private final boolean isSellAll;

        public NavigateToNextScreen(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.assetSymbol = str;
            this.amount = str2;
            this.isSellAll = z;
            this.cryptoQuantity = str3;
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

        public /* synthetic */ NavigateToNextScreen(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3);
        }

        public final java.lang.String getCryptoQuantity() {
            return this.cryptoQuantity;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.assetSymbol;
            java.lang.String str2 = this.amount;
            boolean z = this.isSellAll;
            java.lang.String str3 = this.cryptoQuantity;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToNextScreen(assetSymbol=");
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
            return (((((this.assetSymbol.hashCode() * 31) + this.amount.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isSellAll)) * 31) + this.cryptoQuantity.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect.NavigateToNextScreen)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect.NavigateToNextScreen navigateToNextScreen = (com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect.NavigateToNextScreen) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, navigateToNextScreen.assetSymbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, navigateToNextScreen.amount) && this.isSellAll == navigateToNextScreen.isSellAll && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoQuantity, navigateToNextScreen.cryptoQuantity);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect.NavigateToNextScreen copy(java.lang.String assetSymbol, java.lang.String amount, boolean isSellAll, java.lang.String cryptoQuantity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoQuantity, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect.NavigateToNextScreen(assetSymbol, amount, isSellAll, cryptoQuantity);
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

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect.NavigateToNextScreen copy$default(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.model.CryptoSellAmountEntryEffect.NavigateToNextScreen navigateToNextScreen, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToNextScreen.assetSymbol;
            }
            if ((i & 2) != 0) {
                str2 = navigateToNextScreen.amount;
            }
            if ((i & 4) != 0) {
                z = navigateToNextScreen.isSellAll;
            }
            if ((i & 8) != 0) {
                str3 = navigateToNextScreen.cryptoQuantity;
            }
            return navigateToNextScreen.copy(str, str2, z, str3);
        }
    }
}
