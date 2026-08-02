package com.google.android.material.carousel;

/* loaded from: classes8.dex */
public final class MultiBrowseCarouselStrategy extends com.google.android.material.carousel.CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {1, 0};

    @Override // com.google.android.material.carousel.CarouselStrategy
    final com.google.android.material.carousel.KeylineState onFirstChildMeasuredWithMargins(com.google.android.material.carousel.Carousel carousel, android.view.View view) {
        float containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        float f = layoutParams.topMargin + layoutParams.bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f = layoutParams.leftMargin + layoutParams.rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f2 = f;
        float smallItemSizeMin = getSmallItemSizeMin() + f2;
        float max = java.lang.Math.max(getSmallItemSizeMax() + f2, smallItemSizeMin);
        float min = java.lang.Math.min(measuredHeight + f2, containerHeight);
        float clamp = androidx.core.math.MathUtils.clamp((measuredHeight / 3.0f) + f2, smallItemSizeMin + f2, max + f2);
        float f3 = (min + clamp) / 2.0f;
        int[] iArr = SMALL_COUNTS;
        if (containerHeight < 2.0f * smallItemSizeMin) {
            iArr = new int[]{0};
        }
        int[] iArr2 = MEDIUM_COUNTS;
        if (carousel.getCarouselAlignment() == 1) {
            iArr = doubleCounts(iArr);
            iArr2 = doubleCounts(iArr2);
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int max2 = (int) java.lang.Math.max(1.0d, java.lang.Math.floor(((containerHeight - (com.google.android.material.carousel.CarouselStrategyHelper.maxValue(iArr4) * f3)) - (com.google.android.material.carousel.CarouselStrategyHelper.maxValue(iArr3) * max)) / min));
        int ceil = (int) java.lang.Math.ceil(containerHeight / min);
        int i = (ceil - max2) + 1;
        int[] iArr5 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr5[i2] = ceil - i2;
        }
        com.google.android.material.carousel.Arrangement findLowestCostArrangement = com.google.android.material.carousel.Arrangement.findLowestCostArrangement(containerHeight, clamp, smallItemSizeMin, max, iArr3, f3, iArr4, min, iArr5);
        this.keylineCount = findLowestCostArrangement.getItemCount();
        if (ensureArrangementFitsItemCount(findLowestCostArrangement, carousel.getItemCount())) {
            findLowestCostArrangement = com.google.android.material.carousel.Arrangement.findLowestCostArrangement(containerHeight, clamp, smallItemSizeMin, max, new int[]{findLowestCostArrangement.smallCount}, f3, new int[]{findLowestCostArrangement.mediumCount}, min, new int[]{findLowestCostArrangement.largeCount});
        }
        return com.google.android.material.carousel.CarouselStrategyHelper.createKeylineState(view.getContext(), f2, containerHeight, findLowestCostArrangement, carousel.getCarouselAlignment());
    }

    final boolean ensureArrangementFitsItemCount(com.google.android.material.carousel.Arrangement arrangement, int i) {
        int itemCount = arrangement.getItemCount() - i;
        boolean z = itemCount > 0 && (arrangement.smallCount > 0 || arrangement.mediumCount > 1);
        while (itemCount > 0) {
            if (arrangement.smallCount > 0) {
                arrangement.smallCount--;
            } else if (arrangement.mediumCount > 1) {
                arrangement.mediumCount--;
            }
            itemCount--;
        }
        return z;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    final boolean shouldRefreshKeylineState(com.google.android.material.carousel.Carousel carousel, int i) {
        if (i >= this.keylineCount || carousel.getItemCount() < this.keylineCount) {
            return i >= this.keylineCount && carousel.getItemCount() < this.keylineCount;
        }
        return true;
    }
}
