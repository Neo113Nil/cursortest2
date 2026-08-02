package com.paypal.oslo.feature.home.ui.components.fannedcollection;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselItem;", "", "Lcom/paypal/oslo/feature/home/domain/model/FannedCarouselItemData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition;", com.daon.sdk.face.license.License.FEATURE_POSITION, "<init>", "(Lcom/paypal/oslo/feature/home/domain/model/FannedCarouselItemData;Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition;)V", "component1", "()Lcom/paypal/oslo/feature/home/domain/model/FannedCarouselItemData;", "component2", "()Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition;", "copy", "(Lcom/paypal/oslo/feature/home/domain/model/FannedCarouselItemData;Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition;)Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/home/domain/model/FannedCarouselItemData;", "getData", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition;", "getPosition"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FannedCarouselItem {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData data;
    private final com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition position;

    public FannedCarouselItem(com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData fannedCarouselItemData, com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition fannedCarouselPosition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fannedCarouselItemData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fannedCarouselPosition, "");
        this.data = fannedCarouselItemData;
        this.position = fannedCarouselPosition;
    }

    public final com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData getData() {
        return this.data;
    }

    public final com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition getPosition() {
        return this.position;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData fannedCarouselItemData = this.data;
        com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition fannedCarouselPosition = this.position;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FannedCarouselItem(data=");
        sb.append(fannedCarouselItemData);
        sb.append(", position=");
        sb.append(fannedCarouselPosition);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.data.hashCode() * 31) + this.position.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselItem)) {
            return false;
        }
        com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselItem fannedCarouselItem = (com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.data, fannedCarouselItem.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.position, fannedCarouselItem.position);
    }

    public final com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselItem copy(com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData data, com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "");
        return new com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselItem(data, position);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition getPosition() {
        return this.position;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData getData() {
        return this.data;
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselItem copy$default(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselItem fannedCarouselItem, com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData fannedCarouselItemData, com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition fannedCarouselPosition, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fannedCarouselItemData = fannedCarouselItem.data;
        }
        if ((i & 2) != 0) {
            fannedCarouselPosition = fannedCarouselItem.position;
        }
        return fannedCarouselItem.copy(fannedCarouselItemData, fannedCarouselPosition);
    }
}
