package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow;", "", "<init>", "()V", "Load", "Activate", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow$Activate;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow$Load;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class Flow {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow$Load;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow;", "", "offerId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow$Load;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOfferId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Load extends com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow {
        public static final int $stable = 0;
        private final java.lang.String offerId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Load(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.offerId = str;
        }

        public final java.lang.String getOfferId() {
            return this.offerId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.offerId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Load(offerId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.offerId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Load) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerId, ((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Load) other).offerId);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Load copy(java.lang.String offerId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Load(offerId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getOfferId() {
            return this.offerId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Load copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Load load, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = load.offerId;
            }
            return load.copy(str);
        }
    }

    private Flow() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow$Activate;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/Flow$Activate;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Activate extends com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activate(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData offerDetailsUiData) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsUiData, "");
            this.data = offerDetailsUiData;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData offerDetailsUiData = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Activate(data=");
            sb.append(offerDetailsUiData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Activate) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Activate) other).data);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Activate copy(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Activate(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Activate copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Activate activate, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData offerDetailsUiData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                offerDetailsUiData = activate.data;
            }
            return activate.copy(offerDetailsUiData);
        }
    }

    public /* synthetic */ Flow(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
