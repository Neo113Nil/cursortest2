package com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/data/source/ActiveOffersCache;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/models/ActiveOfferData;", "offers", "", "setOffers", "(Ljava/util/List;)V", "getOffers", "()Ljava/util/List;", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActiveOffersCache {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferData>> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>(kotlin.collections.CollectionsKt.emptyList());

    @javax.inject.Inject
    public ActiveOffersCache() {
    }

    public final void setOffers(java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferData> offers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offers, "");
        this.getHighSpeedVideoSizes.set(offers);
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferData> getOffers() {
        java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferData> list = this.getHighSpeedVideoSizes.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "");
        return list;
    }
}
