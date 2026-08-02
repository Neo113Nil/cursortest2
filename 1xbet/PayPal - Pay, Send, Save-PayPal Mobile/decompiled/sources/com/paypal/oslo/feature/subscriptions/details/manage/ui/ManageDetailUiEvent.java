package com.paypal.oslo.feature.subscriptions.details.manage.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageDetailUiEvent;", "", "OnDismissed", "OnCloseButtonClicked", "OnItemClicked", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageDetailUiEvent$OnCloseButtonClicked;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageDetailUiEvent$OnDismissed;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageDetailUiEvent$OnItemClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ManageDetailUiEvent {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageDetailUiEvent$OnDismissed;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageDetailUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDismissed implements com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageDetailUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageDetailUiEvent.OnDismissed INSTANCE = new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageDetailUiEvent.OnDismissed();

        public final int hashCode() {
            return 1183113638;
        }

        private OnDismissed() {
        }

        public final java.lang.String toString() {
            return "OnDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageDetailUiEvent.OnDismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageDetailUiEvent$OnCloseButtonClicked;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageDetailUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCloseButtonClicked implements com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageDetailUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageDetailUiEvent.OnCloseButtonClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageDetailUiEvent.OnCloseButtonClicked();

        public final int hashCode() {
            return -434743008;
        }

        private OnCloseButtonClicked() {
        }

        public final java.lang.String toString() {
            return "OnCloseButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageDetailUiEvent.OnCloseButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageDetailUiEvent$OnItemClicked;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageDetailUiEvent;", "Lcom/paypal/pds/components/ListItem;", "item", "<init>", "(Lcom/paypal/pds/components/ListItem;)V", "component1", "()Lcom/paypal/pds/components/ListItem;", "copy", "(Lcom/paypal/pds/components/ListItem;)Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageDetailUiEvent$OnItemClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/components/ListItem;", "getItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnItemClicked implements com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageDetailUiEvent {
        public static final int $stable = com.paypal.pds.components.ListItem.$stable;
        private final com.paypal.pds.components.ListItem item;

        public OnItemClicked(com.paypal.pds.components.ListItem listItem) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listItem, "");
            this.item = listItem;
        }

        public final com.paypal.pds.components.ListItem getItem() {
            return this.item;
        }

        public final java.lang.String toString() {
            com.paypal.pds.components.ListItem listItem = this.item;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnItemClicked(item=");
            sb.append(listItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.item.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageDetailUiEvent.OnItemClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.item, ((com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageDetailUiEvent.OnItemClicked) other).item);
        }

        public final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageDetailUiEvent.OnItemClicked copy(com.paypal.pds.components.ListItem item) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
            return new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageDetailUiEvent.OnItemClicked(item);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.pds.components.ListItem getItem() {
            return this.item;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageDetailUiEvent.OnItemClicked copy$default(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageDetailUiEvent.OnItemClicked onItemClicked, com.paypal.pds.components.ListItem listItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                listItem = onItemClicked.item;
            }
            return onItemClicked.copy(listItem);
        }
    }
}
