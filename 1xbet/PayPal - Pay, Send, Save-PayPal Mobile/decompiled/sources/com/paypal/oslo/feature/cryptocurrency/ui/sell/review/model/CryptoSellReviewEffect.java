package com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEffect;", "", "NavigateBack", "NavigateToSuccessScreen", "ShowGenericError", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEffect$NavigateBack;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEffect$NavigateToSuccessScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEffect$ShowGenericError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CryptoSellReviewEffect {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEffect$NavigateBack;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.NavigateBack();

        public final int hashCode() {
            return 1267929980;
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJV\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b$\u0010\rR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b%\u0010\rR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b&\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEffect$NavigateToSuccessScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEffect;", "", "tradeId", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "assetName", "assetLogoUrl", "cryptoAmount", "fiatAmount", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEffect$NavigateToSuccessScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTradeId", "getAssetSymbol", "getAssetName", "getAssetLogoUrl", "getCryptoAmount", "getFiatAmount", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSuccessScreen implements com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect {
        public static final int $stable = 0;
        private final java.lang.String assetLogoUrl;
        private final java.lang.String assetName;
        private final java.lang.String assetSymbol;
        private final java.lang.String cryptoAmount;
        private final java.lang.String fiatAmount;
        private final java.lang.String status;
        private final java.lang.String tradeId;

        public NavigateToSuccessScreen(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
            this.tradeId = str;
            this.assetSymbol = str2;
            this.assetName = str3;
            this.assetLogoUrl = str4;
            this.cryptoAmount = str5;
            this.fiatAmount = str6;
            this.status = str7;
        }

        public final java.lang.String getTradeId() {
            return this.tradeId;
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

        public final java.lang.String getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.tradeId;
            java.lang.String str2 = this.assetSymbol;
            java.lang.String str3 = this.assetName;
            java.lang.String str4 = this.assetLogoUrl;
            java.lang.String str5 = this.cryptoAmount;
            java.lang.String str6 = this.fiatAmount;
            java.lang.String str7 = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToSuccessScreen(tradeId=");
            sb.append(str);
            sb.append(", assetSymbol=");
            sb.append(str2);
            sb.append(", assetName=");
            sb.append(str3);
            sb.append(", assetLogoUrl=");
            sb.append(str4);
            sb.append(", cryptoAmount=");
            sb.append(str5);
            sb.append(", fiatAmount=");
            sb.append(str6);
            sb.append(", status=");
            sb.append(str7);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((this.tradeId.hashCode() * 31) + this.assetSymbol.hashCode()) * 31) + this.assetName.hashCode()) * 31) + this.assetLogoUrl.hashCode()) * 31) + this.cryptoAmount.hashCode()) * 31) + this.fiatAmount.hashCode()) * 31) + this.status.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.NavigateToSuccessScreen)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.NavigateToSuccessScreen navigateToSuccessScreen = (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.NavigateToSuccessScreen) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.tradeId, navigateToSuccessScreen.tradeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, navigateToSuccessScreen.assetSymbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetName, navigateToSuccessScreen.assetName) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetLogoUrl, navigateToSuccessScreen.assetLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoAmount, navigateToSuccessScreen.cryptoAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiatAmount, navigateToSuccessScreen.fiatAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, navigateToSuccessScreen.status);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.NavigateToSuccessScreen copy(java.lang.String tradeId, java.lang.String assetSymbol, java.lang.String assetName, java.lang.String assetLogoUrl, java.lang.String cryptoAmount, java.lang.String fiatAmount, java.lang.String status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tradeId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetLogoUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiatAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.NavigateToSuccessScreen(tradeId, assetSymbol, assetName, assetLogoUrl, cryptoAmount, fiatAmount, status);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getStatus() {
            return this.status;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getFiatAmount() {
            return this.fiatAmount;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getCryptoAmount() {
            return this.cryptoAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAssetLogoUrl() {
            return this.assetLogoUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAssetName() {
            return this.assetName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTradeId() {
            return this.tradeId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.NavigateToSuccessScreen copy$default(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.NavigateToSuccessScreen navigateToSuccessScreen, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToSuccessScreen.tradeId;
            }
            if ((i & 2) != 0) {
                str2 = navigateToSuccessScreen.assetSymbol;
            }
            java.lang.String str8 = str2;
            if ((i & 4) != 0) {
                str3 = navigateToSuccessScreen.assetName;
            }
            java.lang.String str9 = str3;
            if ((i & 8) != 0) {
                str4 = navigateToSuccessScreen.assetLogoUrl;
            }
            java.lang.String str10 = str4;
            if ((i & 16) != 0) {
                str5 = navigateToSuccessScreen.cryptoAmount;
            }
            java.lang.String str11 = str5;
            if ((i & 32) != 0) {
                str6 = navigateToSuccessScreen.fiatAmount;
            }
            java.lang.String str12 = str6;
            if ((i & 64) != 0) {
                str7 = navigateToSuccessScreen.status;
            }
            return navigateToSuccessScreen.copy(str, str8, str9, str10, str11, str12, str7);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEffect$ShowGenericError;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowGenericError implements com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.ShowGenericError INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.ShowGenericError();

        public final int hashCode() {
            return -624568942;
        }

        private ShowGenericError() {
        }

        public final java.lang.String toString() {
            return "ShowGenericError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.ShowGenericError)) {
                return false;
            }
            return true;
        }
    }
}
