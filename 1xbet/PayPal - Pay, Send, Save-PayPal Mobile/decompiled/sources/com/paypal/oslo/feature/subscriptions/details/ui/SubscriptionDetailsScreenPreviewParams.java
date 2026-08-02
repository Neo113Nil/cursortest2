package com.paypal.oslo.feature.subscriptions.details.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/ui/SubscriptionDetailsScreenPreviewParams;", "", "Lcom/paypal/oslo/feature/subscriptions/details/ui/model/SubscriptionDetailsUiModel;", "details", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/details/ui/model/SubscriptionDetailsUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/details/ui/model/SubscriptionDetailsUiModel;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/details/ui/model/SubscriptionDetailsUiModel;)Lcom/paypal/oslo/feature/subscriptions/details/ui/SubscriptionDetailsScreenPreviewParams;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/details/ui/model/SubscriptionDetailsUiModel;", "getDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SubscriptionDetailsScreenPreviewParams {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel details;

    public SubscriptionDetailsScreenPreviewParams(com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel subscriptionDetailsUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionDetailsUiModel, "");
        this.details = subscriptionDetailsUiModel;
    }

    public final com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel getDetails() {
        return this.details;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SubscriptionDetailsScreenPreviewParams(com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel subscriptionDetailsUiModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(r0);
        com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel subscriptionDetailsUiModel2;
        if ((i & 1) != 0) {
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription subscription = com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE;
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription subscription2 = subscription;
            subscriptionDetailsUiModel2 = new com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel("1234", "Spotify", subscription2, "https://example.com/spotify-logo.png", kotlin.collections.CollectionsKt.emptyList(), "help@spotify.com", com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.MERCHANT_MANAGED, null, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.ENABLED, null, null, 1664, null);
        } else {
            subscriptionDetailsUiModel2 = subscriptionDetailsUiModel;
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel subscriptionDetailsUiModel = this.details;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubscriptionDetailsScreenPreviewParams(details=");
        sb.append(subscriptionDetailsUiModel);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.details.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenPreviewParams) && kotlin.jvm.internal.Intrinsics.areEqual(this.details, ((com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenPreviewParams) other).details);
    }

    public final com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenPreviewParams copy(com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel details) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(details, "");
        return new com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenPreviewParams(details);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel getDetails() {
        return this.details;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenPreviewParams copy$default(com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenPreviewParams subscriptionDetailsScreenPreviewParams, com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel subscriptionDetailsUiModel, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            subscriptionDetailsUiModel = subscriptionDetailsScreenPreviewParams.details;
        }
        return subscriptionDetailsScreenPreviewParams.copy(subscriptionDetailsUiModel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionDetailsScreenPreviewParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
