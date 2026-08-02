package com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0017@UX\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0017@UX\u0097\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR*\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0017@UX\u0097\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR*\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0017@UX\u0097\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR*\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0017@UX\u0097\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/arrangements/FourSizedCarouselArrangement;", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/arrangements/FannedCarouselArrangement;", "", "Lcom/paypal/oslo/feature/home/domain/model/FannedCarouselItemData;", "items", "<init>", "(Ljava/util/List;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "leftOuterIndex", com.visa.cbp.getEncExpo.warmup, "getLeftOuterIndex", "()I", "setLeftOuterIndex", "(I)V", "leftAdjacentIndex", "getLeftAdjacentIndex", "setLeftAdjacentIndex", "middleIndex", "getMiddleIndex", "setMiddleIndex", "rightAdjacentIndex", "getRightAdjacentIndex", "setRightAdjacentIndex", "rightOuterIndex", "getRightOuterIndex", "setRightOuterIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FourSizedCarouselArrangement extends com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement {
    public static final int $stable = 8;
    private int leftAdjacentIndex;
    private int leftOuterIndex;
    private int middleIndex;
    private int rightAdjacentIndex;
    private int rightOuterIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FourSizedCarouselArrangement(java.util.List<com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData> list) {
        super(list);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.leftOuterIndex = 2;
        this.leftAdjacentIndex = 3;
        this.rightAdjacentIndex = 1;
        this.rightOuterIndex = -1;
    }

    @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement
    public final int getLeftOuterIndex() {
        return this.leftOuterIndex;
    }

    @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement
    protected final void setLeftOuterIndex(int i) {
        this.leftOuterIndex = i;
    }

    @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement
    public final int getLeftAdjacentIndex() {
        return this.leftAdjacentIndex;
    }

    @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement
    protected final void setLeftAdjacentIndex(int i) {
        this.leftAdjacentIndex = i;
    }

    @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement
    public final int getMiddleIndex() {
        return this.middleIndex;
    }

    @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement
    protected final void setMiddleIndex(int i) {
        this.middleIndex = i;
    }

    @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement
    public final int getRightAdjacentIndex() {
        return this.rightAdjacentIndex;
    }

    @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement
    protected final void setRightAdjacentIndex(int i) {
        this.rightAdjacentIndex = i;
    }

    @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement
    public final int getRightOuterIndex() {
        return this.rightOuterIndex;
    }

    @Override // com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement
    protected final void setRightOuterIndex(int i) {
        this.rightOuterIndex = i;
    }
}
