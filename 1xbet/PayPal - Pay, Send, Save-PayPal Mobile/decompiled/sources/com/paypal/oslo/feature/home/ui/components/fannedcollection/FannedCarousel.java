package com.paypal.oslo.feature.home.ui.components.fannedcollection;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00158\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010!\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarousel;", "", "", "Lcom/paypal/oslo/feature/home/domain/model/FannedCarouselItemData;", "allItems", "<init>", "(Ljava/util/List;)V", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselDragDirection;", "direction", "", "scroll", "(Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselDragDirection;)V", "", "dx", "drag", "(F)V", "resetDrag", "()V", "p0", "getHighSpeedVideoSizes", "Ljava/util/List;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselItem;", "content", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "getContent", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "", "getActiveIndex", "()I", "activeIndex", "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/arrangements/FannedCarouselArrangement;", "getHighSpeedVideoFpsRanges", "Lkotlin/Lazy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FannedCarousel {
    public static final int $stable = 8;
    private final androidx.compose.runtime.snapshots.SnapshotStateMap<java.lang.String, com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselItem> content;
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;
    private final java.util.List<com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData> getHighSpeedVideoSizes;

    public FannedCarousel(java.util.List<com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoSizes = list;
        this.content = androidx.compose.runtime.SnapshotStateKt.mutableStateMapOf();
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarousel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarousel.m14944$r8$lambda$GMgHL8yl9Mi4FqbUHd3nLQMYdg(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarousel.this);
            }
        });
        getHighSpeedVideoSizes(null);
    }

    public final androidx.compose.runtime.snapshots.SnapshotStateMap<java.lang.String, com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselItem> getContent() {
        return this.content;
    }

    public final void drag(float dx) {
        com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselItem fannedCarouselItem = this.content.get(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.PositionIds.MIDDLE);
        if (fannedCarouselItem == null) {
            return;
        }
        com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition position = fannedCarouselItem.getPosition();
        kotlin.jvm.internal.Intrinsics.checkNotNull(position, "");
        ((com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Middle) position).drag(dx);
    }

    public final void resetDrag() {
        com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselItem fannedCarouselItem = this.content.get(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.PositionIds.MIDDLE);
        if (fannedCarouselItem == null) {
            return;
        }
        com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition position = fannedCarouselItem.getPosition();
        kotlin.jvm.internal.Intrinsics.checkNotNull(position, "");
        ((com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Middle) position).rest();
    }

    /* renamed from: $r8$lambda$GMgHL8-yl9Mi4FqbUHd3nLQMYdg, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement m14944$r8$lambda$GMgHL8yl9Mi4FqbUHd3nLQMYdg(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarousel fannedCarousel) {
        int size = fannedCarousel.getHighSpeedVideoSizes.size();
        if (size == 1) {
            return new com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.OneSizedCarouselArrangement(fannedCarousel.getHighSpeedVideoSizes);
        }
        if (size == 2) {
            return new com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.TwoSizedCarouselArrangement(fannedCarousel.getHighSpeedVideoSizes);
        }
        if (size == 3) {
            return new com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.ThreeSizedCarouselArrangement(fannedCarousel.getHighSpeedVideoSizes);
        }
        if (size == 4) {
            return new com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FourSizedCarouselArrangement(fannedCarousel.getHighSpeedVideoSizes);
        }
        return new com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.CompleteCarouselArrangement(fannedCarousel.getHighSpeedVideoSizes);
    }

    private final void getHighSpeedVideoSizes(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselDragDirection p0) {
        if (((com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement) this.getHighSpeedVideoFpsRanges.getValue()).getMiddleIndex() != -1) {
            this.content.put(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.PositionIds.MIDDLE, new com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselItem(this.getHighSpeedVideoSizes.get(((com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement) this.getHighSpeedVideoFpsRanges.getValue()).getMiddleIndex()), new com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Middle()));
        }
        if (((com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement) this.getHighSpeedVideoFpsRanges.getValue()).getLeftAdjacentIndex() != -1) {
            this.content.put(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.PositionIds.LEFT_ADJACENT, new com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselItem(this.getHighSpeedVideoSizes.get(((com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement) this.getHighSpeedVideoFpsRanges.getValue()).getLeftAdjacentIndex()), new com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.LeftAdjacent()));
        }
        if (((com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement) this.getHighSpeedVideoFpsRanges.getValue()).getRightAdjacentIndex() != -1) {
            this.content.put(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.PositionIds.RIGHT_ADJACENT, new com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselItem(this.getHighSpeedVideoSizes.get(((com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement) this.getHighSpeedVideoFpsRanges.getValue()).getRightAdjacentIndex()), new com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.RightAdjacent()));
        }
        if (((com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement) this.getHighSpeedVideoFpsRanges.getValue()).getLeftOuterIndex() != -1) {
            this.content.put(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.PositionIds.LEFT_OUTER, new com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselItem(this.getHighSpeedVideoSizes.get(((com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement) this.getHighSpeedVideoFpsRanges.getValue()).getLeftOuterIndex()), new com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.LeftOuter(kotlin.jvm.internal.Intrinsics.areEqual(p0, com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselDragDirection.Right.INSTANCE))));
        }
        if (((com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement) this.getHighSpeedVideoFpsRanges.getValue()).getRightOuterIndex() != -1) {
            this.content.put(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.PositionIds.RIGHT_OUTER, new com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselItem(this.getHighSpeedVideoSizes.get(((com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement) this.getHighSpeedVideoFpsRanges.getValue()).getRightOuterIndex()), new com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.RightOuter(kotlin.jvm.internal.Intrinsics.areEqual(p0, com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselDragDirection.Left.INSTANCE))));
        }
    }

    public final int getActiveIndex() {
        return ((com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement) this.getHighSpeedVideoFpsRanges.getValue()).getMiddleIndex();
    }

    public final void scroll(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselDragDirection direction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(direction, "");
        ((com.paypal.oslo.feature.home.ui.components.fannedcollection.arrangements.FannedCarouselArrangement) this.getHighSpeedVideoFpsRanges.getValue()).rearrange(direction);
        getHighSpeedVideoSizes(direction);
    }
}
