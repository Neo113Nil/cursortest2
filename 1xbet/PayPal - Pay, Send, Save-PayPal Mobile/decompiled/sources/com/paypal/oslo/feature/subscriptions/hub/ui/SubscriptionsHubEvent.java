package com.paypal.oslo.feature.subscriptions.hub.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent;", "", "LinkSubscriptionsClicked", "SubscriptionClicked", "InfoClicked", "UpdateClicked", "AddClicked", "TryAgainClicked", "RefreshTriggered", "TabReselected", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent$AddClicked;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent$InfoClicked;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent$LinkSubscriptionsClicked;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent$RefreshTriggered;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent$SubscriptionClicked;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent$TabReselected;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent$TryAgainClicked;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent$UpdateClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SubscriptionsHubEvent {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent$LinkSubscriptionsClicked;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LinkSubscriptionsClicked implements com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.LinkSubscriptionsClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.LinkSubscriptionsClicked();

        public final int hashCode() {
            return -810313834;
        }

        private LinkSubscriptionsClicked() {
        }

        public final java.lang.String toString() {
            return "LinkSubscriptionsClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.LinkSubscriptionsClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent$SubscriptionClicked;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;", "subscription", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;)Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent$SubscriptionClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;", "getSubscription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubscriptionClicked implements com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscription;

        public SubscriptionClicked(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionItemUiModel, "");
            this.subscription = subscriptionItemUiModel;
        }

        public final com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel getSubscription() {
            return this.subscription;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel = this.subscription;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SubscriptionClicked(subscription=");
            sb.append(subscriptionItemUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.subscription.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.SubscriptionClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.subscription, ((com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.SubscriptionClicked) other).subscription);
        }

        public final com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.SubscriptionClicked copy(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscription) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscription, "");
            return new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.SubscriptionClicked(subscription);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel getSubscription() {
            return this.subscription;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.SubscriptionClicked copy$default(com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.SubscriptionClicked subscriptionClicked, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                subscriptionItemUiModel = subscriptionClicked.subscription;
            }
            return subscriptionClicked.copy(subscriptionItemUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent$InfoClicked;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InfoClicked implements com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.InfoClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.InfoClicked();

        public final int hashCode() {
            return -1505386098;
        }

        private InfoClicked() {
        }

        public final java.lang.String toString() {
            return "InfoClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.InfoClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent$UpdateClicked;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateClicked implements com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.UpdateClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.UpdateClicked();

        public final int hashCode() {
            return -1574936621;
        }

        private UpdateClicked() {
        }

        public final java.lang.String toString() {
            return "UpdateClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.UpdateClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent$AddClicked;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddClicked implements com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.AddClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.AddClicked();

        public final int hashCode() {
            return -1261832271;
        }

        private AddClicked() {
        }

        public final java.lang.String toString() {
            return "AddClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.AddClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent$TryAgainClicked;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TryAgainClicked implements com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.TryAgainClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.TryAgainClicked();

        public final int hashCode() {
            return 1177327991;
        }

        private TryAgainClicked() {
        }

        public final java.lang.String toString() {
            return "TryAgainClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.TryAgainClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent$RefreshTriggered;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RefreshTriggered implements com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.RefreshTriggered INSTANCE = new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.RefreshTriggered();

        public final int hashCode() {
            return -442369305;
        }

        private RefreshTriggered() {
        }

        public final java.lang.String toString() {
            return "RefreshTriggered";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.RefreshTriggered)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent$TabReselected;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TabReselected implements com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.TabReselected INSTANCE = new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.TabReselected();

        public final int hashCode() {
            return -892913672;
        }

        private TabReselected() {
        }

        public final java.lang.String toString() {
            return "TabReselected";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.TabReselected)) {
                return false;
            }
            return true;
        }
    }
}
