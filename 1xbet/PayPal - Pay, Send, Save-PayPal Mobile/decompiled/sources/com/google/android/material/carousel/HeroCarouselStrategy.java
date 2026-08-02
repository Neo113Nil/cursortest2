package com.google.android.material.carousel;

/* loaded from: classes8.dex */
public class HeroCarouselStrategy extends com.google.android.material.carousel.CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {0, 1};

    @Override // com.google.android.material.carousel.CarouselStrategy
    com.google.android.material.carousel.KeylineState onFirstChildMeasuredWithMargins(com.google.android.material.carousel.Carousel carousel, android.view.View view) {
        int[] iArr;
        int i;
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        float f = layoutParams.topMargin + layoutParams.bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (carousel.isHorizontal()) {
            f = layoutParams.leftMargin + layoutParams.rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f;
        float max = java.lang.Math.max(getSmallItemSizeMax() + f, smallItemSizeMin);
        float f2 = containerHeight;
        float min = java.lang.Math.min(measuredWidth + f, f2);
        float clamp = androidx.core.math.MathUtils.clamp((measuredWidth / 3.0f) + f, smallItemSizeMin + f, max + f);
        float f3 = (min + clamp) / 2.0f;
        int[] iArr2 = f2 < 2.0f * smallItemSizeMin ? new int[]{0} : SMALL_COUNTS;
        int max2 = (int) java.lang.Math.max(1.0d, java.lang.Math.floor((f2 - (com.google.android.material.carousel.CarouselStrategyHelper.maxValue(r4) * max)) / min));
        int ceil = (((int) java.lang.Math.ceil(f2 / min)) - max2) + 1;
        int[] iArr3 = new int[ceil];
        for (int i2 = 0; i2 < ceil; i2++) {
            iArr3[i2] = max2 + i2;
        }
        int i3 = carousel.getCarouselAlignment() == 1 ? 1 : 0;
        int[] doubleCounts = i3 != 0 ? doubleCounts(iArr2) : iArr2;
        if (i3 != 0) {
            iArr = doubleCounts(MEDIUM_COUNTS);
        } else {
            iArr = MEDIUM_COUNTS;
        }
        com.google.android.material.carousel.Arrangement findLowestCostArrangement = com.google.android.material.carousel.Arrangement.findLowestCostArrangement(f2, clamp, smallItemSizeMin, max, doubleCounts, f3, iArr, min, iArr3);
        this.keylineCount = findLowestCostArrangement.getItemCount();
        if (findLowestCostArrangement.getItemCount() > carousel.getItemCount()) {
            findLowestCostArrangement = com.google.android.material.carousel.Arrangement.findLowestCostArrangement(f2, clamp, smallItemSizeMin, max, iArr2, f3, MEDIUM_COUNTS, min, iArr3);
            i = 0;
        } else {
            i = i3;
        }
        return com.google.android.material.carousel.CarouselStrategyHelper.createKeylineState(view.getContext(), f, f2, findLowestCostArrangement, i);
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    boolean shouldRefreshKeylineState(com.google.android.material.carousel.Carousel carousel, int i) {
        if (carousel.getCarouselAlignment() == 1) {
            return (i < this.keylineCount && carousel.getItemCount() >= this.keylineCount) || (i >= this.keylineCount && carousel.getItemCount() < this.keylineCount);
        }
        return false;
    }
}
