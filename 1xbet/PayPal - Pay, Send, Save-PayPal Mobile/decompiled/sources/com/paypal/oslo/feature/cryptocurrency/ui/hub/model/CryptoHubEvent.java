package com.paypal.oslo.feature.cryptocurrency.ui.hub.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent;", "", "BuyButtonClick", "SellButtonClick", "ReceiveButtonClick", "SendButtonClick", "PYUSDRewardsLearnMoreButtonClick", "PYUSDRewardsOptInButtonClick", "CryptoMarketPriceClick", "CryptoSettingsOptionClick", "BuyMorePYUSDClick", "CelsiusRedeemClaimCodeButtonClick", "RefreshRequested", "ProvisioningCompleted", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$BuyButtonClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$BuyMorePYUSDClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$CelsiusRedeemClaimCodeButtonClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$CryptoMarketPriceClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$CryptoSettingsOptionClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$PYUSDRewardsLearnMoreButtonClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$PYUSDRewardsOptInButtonClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$ProvisioningCompleted;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$ReceiveButtonClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$RefreshRequested;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$SellButtonClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$SendButtonClick;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CryptoHubEvent {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$BuyButtonClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BuyButtonClick implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.BuyButtonClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.BuyButtonClick();

        public final int hashCode() {
            return 873018411;
        }

        private BuyButtonClick() {
        }

        public final java.lang.String toString() {
            return "BuyButtonClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.BuyButtonClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$SellButtonClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SellButtonClick implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.SellButtonClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.SellButtonClick();

        public final int hashCode() {
            return 460756233;
        }

        private SellButtonClick() {
        }

        public final java.lang.String toString() {
            return "SellButtonClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.SellButtonClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$ReceiveButtonClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReceiveButtonClick implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.ReceiveButtonClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.ReceiveButtonClick();

        public final int hashCode() {
            return 1324797486;
        }

        private ReceiveButtonClick() {
        }

        public final java.lang.String toString() {
            return "ReceiveButtonClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.ReceiveButtonClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$SendButtonClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SendButtonClick implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.SendButtonClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.SendButtonClick();

        public final int hashCode() {
            return -1158711533;
        }

        private SendButtonClick() {
        }

        public final java.lang.String toString() {
            return "SendButtonClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.SendButtonClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$PYUSDRewardsLearnMoreButtonClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PYUSDRewardsLearnMoreButtonClick implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.PYUSDRewardsLearnMoreButtonClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.PYUSDRewardsLearnMoreButtonClick();

        public final int hashCode() {
            return -387012481;
        }

        private PYUSDRewardsLearnMoreButtonClick() {
        }

        public final java.lang.String toString() {
            return "PYUSDRewardsLearnMoreButtonClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.PYUSDRewardsLearnMoreButtonClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$PYUSDRewardsOptInButtonClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PYUSDRewardsOptInButtonClick implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.PYUSDRewardsOptInButtonClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.PYUSDRewardsOptInButtonClick();

        public final int hashCode() {
            return 926140576;
        }

        private PYUSDRewardsOptInButtonClick() {
        }

        public final java.lang.String toString() {
            return "PYUSDRewardsOptInButtonClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.PYUSDRewardsOptInButtonClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$CryptoMarketPriceClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$CryptoMarketPriceClick;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CryptoMarketPriceClick implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent {
        public static final int $stable = 0;
        private final java.lang.String assetSymbol;

        public CryptoMarketPriceClick(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.assetSymbol = str;
        }

        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.assetSymbol;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoMarketPriceClick(assetSymbol=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.assetSymbol.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CryptoMarketPriceClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, ((com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CryptoMarketPriceClick) other).assetSymbol);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CryptoMarketPriceClick copy(java.lang.String assetSymbol) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CryptoMarketPriceClick(assetSymbol);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CryptoMarketPriceClick copy$default(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CryptoMarketPriceClick cryptoMarketPriceClick, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cryptoMarketPriceClick.assetSymbol;
            }
            return cryptoMarketPriceClick.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$CryptoSettingsOptionClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoSettingsOptions;", "settingsOption", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoSettingsOptions;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoSettingsOptions;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoSettingsOptions;)Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$CryptoSettingsOptionClick;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoSettingsOptions;", "getSettingsOption"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CryptoSettingsOptionClick implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions settingsOption;

        public CryptoSettingsOptionClick(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions cryptoSettingsOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSettingsOptions, "");
            this.settingsOption = cryptoSettingsOptions;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions getSettingsOption() {
            return this.settingsOption;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions cryptoSettingsOptions = this.settingsOption;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoSettingsOptionClick(settingsOption=");
            sb.append(cryptoSettingsOptions);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.settingsOption.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CryptoSettingsOptionClick) && this.settingsOption == ((com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CryptoSettingsOptionClick) other).settingsOption;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CryptoSettingsOptionClick copy(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions settingsOption) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsOption, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CryptoSettingsOptionClick(settingsOption);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions getSettingsOption() {
            return this.settingsOption;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CryptoSettingsOptionClick copy$default(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CryptoSettingsOptionClick cryptoSettingsOptionClick, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions cryptoSettingsOptions, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cryptoSettingsOptions = cryptoSettingsOptionClick.settingsOption;
            }
            return cryptoSettingsOptionClick.copy(cryptoSettingsOptions);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$BuyMorePYUSDClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BuyMorePYUSDClick implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.BuyMorePYUSDClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.BuyMorePYUSDClick();

        public final int hashCode() {
            return -206769397;
        }

        private BuyMorePYUSDClick() {
        }

        public final java.lang.String toString() {
            return "BuyMorePYUSDClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.BuyMorePYUSDClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$CelsiusRedeemClaimCodeButtonClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CelsiusRedeemClaimCodeButtonClick implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CelsiusRedeemClaimCodeButtonClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CelsiusRedeemClaimCodeButtonClick();

        public final int hashCode() {
            return 1036631436;
        }

        private CelsiusRedeemClaimCodeButtonClick() {
        }

        public final java.lang.String toString() {
            return "CelsiusRedeemClaimCodeButtonClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.CelsiusRedeemClaimCodeButtonClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$RefreshRequested;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RefreshRequested implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.RefreshRequested INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.RefreshRequested();

        public final int hashCode() {
            return 1635593518;
        }

        private RefreshRequested() {
        }

        public final java.lang.String toString() {
            return "RefreshRequested";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.RefreshRequested)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent$ProvisioningCompleted;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProvisioningCompleted implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.ProvisioningCompleted INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.ProvisioningCompleted();

        public final int hashCode() {
            return 806780003;
        }

        private ProvisioningCompleted() {
        }

        public final java.lang.String toString() {
            return "ProvisioningCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEvent.ProvisioningCompleted)) {
                return false;
            }
            return true;
        }
    }
}
