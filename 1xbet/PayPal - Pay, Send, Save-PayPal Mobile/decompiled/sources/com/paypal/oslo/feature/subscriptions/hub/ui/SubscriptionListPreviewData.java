package com.paypal.oslo.feature.subscriptions.hub.ui;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionListPreviewData;", "", "", "name", "", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionListPreviewData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getName", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SubscriptionListPreviewData {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> items;
    private final java.lang.String name;

    public SubscriptionListPreviewData(java.lang.String str, java.util.List<com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.name = str;
        this.items = list;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.util.List<com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> getItems() {
        return this.items;
    }

    public final java.lang.String toString() {
        return this.name;
    }

    public final int hashCode() {
        return (this.name.hashCode() * 31) + this.items.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewData)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewData subscriptionListPreviewData = (com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, subscriptionListPreviewData.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, subscriptionListPreviewData.items);
    }

    public final com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewData copy(java.lang.String name2, java.util.List<com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> items) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        return new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewData(name2, items);
    }

    public final java.util.List<com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> component2() {
        return this.items;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewData copy$default(com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewData subscriptionListPreviewData, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionListPreviewData.name;
        }
        if ((i & 2) != 0) {
            list = subscriptionListPreviewData.items;
        }
        return subscriptionListPreviewData.copy(str, list);
    }
}
