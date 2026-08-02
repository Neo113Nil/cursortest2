package com.google.android.material.carousel;

/* loaded from: classes8.dex */
public final class UncontainedCarouselStrategy extends com.google.android.material.carousel.CarouselStrategy {
    private static final float MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD = 0.85f;

    @Override // com.google.android.material.carousel.CarouselStrategy
    final boolean isContained() {
        return false;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    final com.google.android.material.carousel.KeylineState onFirstChildMeasuredWithMargins(com.google.android.material.carousel.Carousel carousel, android.view.View view) {
        float f;
        float containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        float f2 = layoutParams.topMargin + layoutParams.bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            float f3 = layoutParams.leftMargin + layoutParams.rightMargin;
            measuredHeight = view.getMeasuredWidth();
            f = f3;
        } else {
            f = f2;
        }
        float f4 = measuredHeight + f;
        float extraSmallSize = com.google.android.material.carousel.CarouselStrategyHelper.getExtraSmallSize(view.getContext());
        float extraSmallSize2 = com.google.android.material.carousel.CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f;
        int max = java.lang.Math.max(1, (int) java.lang.Math.floor(containerWidth / f4));
        float f5 = containerWidth - (max * f4);
        if (carousel.getCarouselAlignment() == 1) {
            float f6 = f5 / 2.0f;
            return createCenterAlignedKeylineState(containerWidth, f, f4, max, java.lang.Math.max(java.lang.Math.min(3.0f * f6, f4), getSmallItemSizeMin() + f), extraSmallSize2, f6);
        }
        return createLeftAlignedKeylineState(view.getContext(), f, containerWidth, f4, max, calculateMediumChildSize(extraSmallSize + f, f4, f5), f5 <= 0.0f ? 0 : 1, extraSmallSize2);
    }

    private float calculateMediumChildSize(float f, float f2, float f3) {
        float max = java.lang.Math.max(1.5f * f3, f);
        float f4 = 0.85f * f2;
        if (max > f4) {
            max = java.lang.Math.max(f4, f3 * 1.2f);
        }
        return java.lang.Math.min(f2, max);
    }

    private com.google.android.material.carousel.KeylineState createCenterAlignedKeylineState(float f, float f2, float f3, int i, float f4, float f5, float f6) {
        float min = java.lang.Math.min(f5, f3);
        float childMaskPercentage = getChildMaskPercentage(min, f3, f2);
        float childMaskPercentage2 = getChildMaskPercentage(f4, f3, f2);
        float f7 = f4 / 2.0f;
        float f8 = (f6 + 0.0f) - f7;
        float f9 = f8 + f7;
        float f10 = min / 2.0f;
        float f11 = (i * f3) + f9;
        com.google.android.material.carousel.KeylineState.Builder addKeylineRange = new com.google.android.material.carousel.KeylineState.Builder(f3, f).addAnchorKeyline((f8 - f7) - f10, childMaskPercentage, min).addKeyline(f8, childMaskPercentage2, f4, false).addKeylineRange(f9 + (f3 / 2.0f), 0.0f, f3, i, true);
        addKeylineRange.addKeyline(f7 + f11, childMaskPercentage2, f4, false);
        addKeylineRange.addAnchorKeyline(f11 + f4 + f10, childMaskPercentage, min);
        return addKeylineRange.build();
    }

    private com.google.android.material.carousel.KeylineState createLeftAlignedKeylineState(android.content.Context context, float f, float f2, float f3, int i, float f4, int i2, float f5) {
        float min = java.lang.Math.min(f5, f3);
        float max = java.lang.Math.max(min, 0.5f * f4);
        float childMaskPercentage = getChildMaskPercentage(max, f3, f);
        float childMaskPercentage2 = getChildMaskPercentage(min, f3, f);
        float childMaskPercentage3 = getChildMaskPercentage(f4, f3, f);
        float f6 = (i * f3) + 0.0f;
        com.google.android.material.carousel.KeylineState.Builder addKeylineRange = new com.google.android.material.carousel.KeylineState.Builder(f3, f2).addAnchorKeyline(0.0f - (max / 2.0f), childMaskPercentage, max).addKeylineRange(f3 / 2.0f, 0.0f, f3, i, true);
        if (i2 > 0) {
            addKeylineRange.addKeyline((f4 / 2.0f) + f6, childMaskPercentage3, f4, false);
            f6 += f4;
        }
        addKeylineRange.addAnchorKeyline(f6 + (com.google.android.material.carousel.CarouselStrategyHelper.getExtraSmallSize(context) / 2.0f), childMaskPercentage2, min);
        return addKeylineRange.build();
    }
}
