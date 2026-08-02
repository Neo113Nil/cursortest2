package com.paypal.oslo.feature.cryptocurrency.ui.details.model;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent;", "", "TimeframeSelected", "BuyButtonClicked", "SellButtonClicked", "ReceiveButtonClicked", "SendButtonClicked", "ConvertButtonClicked", "RecurringBuysClicked", "RefreshRequested", "ChartDataPointSelected", "ChartSelectionCleared", "PYUSDRewardsLearnMoreButtonClick", "PYUSDRewardsOptInButtonClick", "BuyMorePYUSDClick", "ProvisioningCompleted", "NetworkSelectedForReceive", "DismissNetworkSelection", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$BuyButtonClicked;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$BuyMorePYUSDClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$ChartDataPointSelected;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$ChartSelectionCleared;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$ConvertButtonClicked;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$DismissNetworkSelection;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$NetworkSelectedForReceive;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$PYUSDRewardsLearnMoreButtonClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$PYUSDRewardsOptInButtonClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$ProvisioningCompleted;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$ReceiveButtonClicked;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$RecurringBuysClicked;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$RefreshRequested;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$SellButtonClicked;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$SendButtonClicked;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$TimeframeSelected;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AssetPriceDetailsEvent {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$TimeframeSelected;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;", "timeRange", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$TimeframeSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;", "getTimeRange"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TimeframeSelected implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange timeRange;

        public TimeframeSelected(com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priceTimeRange, "");
            this.timeRange = priceTimeRange;
        }

        public final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange getTimeRange() {
            return this.timeRange;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange = this.timeRange;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TimeframeSelected(timeRange=");
            sb.append(priceTimeRange);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.timeRange.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.TimeframeSelected) && this.timeRange == ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.TimeframeSelected) other).timeRange;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.TimeframeSelected copy(com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange timeRange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeRange, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.TimeframeSelected(timeRange);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange getTimeRange() {
            return this.timeRange;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.TimeframeSelected copy$default(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.TimeframeSelected timeframeSelected, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                priceTimeRange = timeframeSelected.timeRange;
            }
            return timeframeSelected.copy(priceTimeRange);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$BuyButtonClicked;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BuyButtonClicked implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.BuyButtonClicked INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.BuyButtonClicked();

        public final int hashCode() {
            return -1755860308;
        }

        private BuyButtonClicked() {
        }

        public final java.lang.String toString() {
            return "BuyButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.BuyButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$SellButtonClicked;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SellButtonClicked implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.SellButtonClicked INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.SellButtonClicked();

        public final int hashCode() {
            return -256588026;
        }

        private SellButtonClicked() {
        }

        public final java.lang.String toString() {
            return "SellButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.SellButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$ReceiveButtonClicked;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReceiveButtonClicked implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.ReceiveButtonClicked INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.ReceiveButtonClicked();

        public final int hashCode() {
            return -1270237457;
        }

        private ReceiveButtonClicked() {
        }

        public final java.lang.String toString() {
            return "ReceiveButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.ReceiveButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$SendButtonClicked;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SendButtonClicked implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.SendButtonClicked INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.SendButtonClicked();

        public final int hashCode() {
            return -1786950000;
        }

        private SendButtonClicked() {
        }

        public final java.lang.String toString() {
            return "SendButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.SendButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$ConvertButtonClicked;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConvertButtonClicked implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.ConvertButtonClicked INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.ConvertButtonClicked();

        public final int hashCode() {
            return 1179393567;
        }

        private ConvertButtonClicked() {
        }

        public final java.lang.String toString() {
            return "ConvertButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.ConvertButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$RecurringBuysClicked;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RecurringBuysClicked implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.RecurringBuysClicked INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.RecurringBuysClicked();

        public final int hashCode() {
            return 294695450;
        }

        private RecurringBuysClicked() {
        }

        public final java.lang.String toString() {
            return "RecurringBuysClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.RecurringBuysClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$RefreshRequested;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RefreshRequested implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.RefreshRequested INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.RefreshRequested();

        public final int hashCode() {
            return -1572340272;
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.RefreshRequested)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$ChartDataPointSelected;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent;", "", "price", "<init>", "(D)V", "component1", "()D", "copy", "(D)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$ChartDataPointSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "D", "getPrice"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChartDataPointSelected implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent {
        public static final int $stable = 0;
        private final double price;

        public ChartDataPointSelected(double d) {
            this.price = d;
        }

        public final double getPrice() {
            return this.price;
        }

        public final java.lang.String toString() {
            double d = this.price;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChartDataPointSelected(price=");
            sb.append(d);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Double.hashCode(this.price);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.ChartDataPointSelected) && java.lang.Double.compare(this.price, ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.ChartDataPointSelected) other).price) == 0;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.ChartDataPointSelected copy(double price) {
            return new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.ChartDataPointSelected(price);
        }

        /* renamed from: component1, reason: from getter */
        public final double getPrice() {
            return this.price;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.ChartDataPointSelected copy$default(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.ChartDataPointSelected chartDataPointSelected, double d, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                d = chartDataPointSelected.price;
            }
            return chartDataPointSelected.copy(d);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$ChartSelectionCleared;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChartSelectionCleared implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.ChartSelectionCleared INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.ChartSelectionCleared();

        public final int hashCode() {
            return 1281824673;
        }

        private ChartSelectionCleared() {
        }

        public final java.lang.String toString() {
            return "ChartSelectionCleared";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.ChartSelectionCleared)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$PYUSDRewardsLearnMoreButtonClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PYUSDRewardsLearnMoreButtonClick implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.PYUSDRewardsLearnMoreButtonClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.PYUSDRewardsLearnMoreButtonClick();

        public final int hashCode() {
            return 1704457505;
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.PYUSDRewardsLearnMoreButtonClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$PYUSDRewardsOptInButtonClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PYUSDRewardsOptInButtonClick implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.PYUSDRewardsOptInButtonClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.PYUSDRewardsOptInButtonClick();

        public final int hashCode() {
            return -47139262;
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.PYUSDRewardsOptInButtonClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$BuyMorePYUSDClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BuyMorePYUSDClick implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.BuyMorePYUSDClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.BuyMorePYUSDClick();

        public final int hashCode() {
            return -868469079;
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.BuyMorePYUSDClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$ProvisioningCompleted;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProvisioningCompleted implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.ProvisioningCompleted INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.ProvisioningCompleted();

        public final int hashCode() {
            return -503398143;
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.ProvisioningCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$NetworkSelectedForReceive;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_NETWORK_ID, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$NetworkSelectedForReceive;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNetworkId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkSelectedForReceive implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent {
        public static final int $stable = 0;
        private final java.lang.String networkId;

        public NetworkSelectedForReceive(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.networkId = str;
        }

        public final java.lang.String getNetworkId() {
            return this.networkId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.networkId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkSelectedForReceive(networkId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.networkId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.NetworkSelectedForReceive) && kotlin.jvm.internal.Intrinsics.areEqual(this.networkId, ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.NetworkSelectedForReceive) other).networkId);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.NetworkSelectedForReceive copy(java.lang.String networkId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkId, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.NetworkSelectedForReceive(networkId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNetworkId() {
            return this.networkId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.NetworkSelectedForReceive copy$default(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.NetworkSelectedForReceive networkSelectedForReceive, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = networkSelectedForReceive.networkId;
            }
            return networkSelectedForReceive.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent$DismissNetworkSelection;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissNetworkSelection implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.DismissNetworkSelection INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.DismissNetworkSelection();

        public final int hashCode() {
            return 1931195403;
        }

        private DismissNetworkSelection() {
        }

        public final java.lang.String toString() {
            return "DismissNetworkSelection";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent.DismissNetworkSelection)) {
                return false;
            }
            return true;
        }
    }
}
