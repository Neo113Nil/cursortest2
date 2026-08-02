package com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b \u0018\u0000 %2\u00020\u0001:\u0001%B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8'@eX¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8'@eX¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8'@eX¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R$\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8'@eX¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R$\u0010!\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8'@eX¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/arrangements/FannedCarouselArrangement;", "", "", "Lcom/paypal/oslo/feature/home/domain/model/FannedCarouselItemData;", "items", "<init>", "(Ljava/util/List;)V", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselDragDirection;", "direction", "", "rearrange", "(Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselDragDirection;)V", "", "p0", "getHighSpeedVideoSizes", "(ILcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselDragDirection;)I", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getLeftOuterIndex", "()I", "setLeftOuterIndex", "(I)V", "leftOuterIndex", "getLeftAdjacentIndex", "setLeftAdjacentIndex", "leftAdjacentIndex", "getMiddleIndex", "setMiddleIndex", "middleIndex", "getRightAdjacentIndex", "setRightAdjacentIndex", "rightAdjacentIndex", "getRightOuterIndex", "setRightOuterIndex", "rightOuterIndex", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class FannedCarouselArrangement {
    public static final int $stable = 0;
    public static final int NO_INDEX = -1;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    public abstract int getLeftAdjacentIndex();

    public abstract int getLeftOuterIndex();

    public abstract int getMiddleIndex();

    public abstract int getRightAdjacentIndex();

    public abstract int getRightOuterIndex();

    protected abstract void setLeftAdjacentIndex(int i);

    protected abstract void setLeftOuterIndex(int i);

    protected abstract void setMiddleIndex(int i);

    protected abstract void setRightAdjacentIndex(int i);

    protected abstract void setRightOuterIndex(int i);

    public FannedCarouselArrangement(java.util.List<com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.getLastIndex(list);
    }

    public final void rearrange(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselDragDirection direction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(direction, "");
        setLeftOuterIndex(getHighSpeedVideoSizes(getLeftOuterIndex(), direction));
        setLeftAdjacentIndex(getHighSpeedVideoSizes(getLeftAdjacentIndex(), direction));
        setMiddleIndex(getHighSpeedVideoSizes(getMiddleIndex(), direction));
        setRightAdjacentIndex(getHighSpeedVideoSizes(getRightAdjacentIndex(), direction));
        setRightOuterIndex(getHighSpeedVideoSizes(getRightOuterIndex(), direction));
    }

    private final int getHighSpeedVideoSizes(int i, com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselDragDirection fannedCarouselDragDirection) {
        if (i == -1) {
            return -1;
        }
        int indexModifier = i + fannedCarouselDragDirection.getIndexModifier();
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (indexModifier > i2) {
            return this.getHighSpeedVideoSizes;
        }
        return indexModifier < this.getHighSpeedVideoSizes ? i2 : indexModifier;
    }
}
