package com.google.android.material.carousel;

/* loaded from: classes8.dex */
final class CarouselStrategyHelper {
    static float addStart(float f, float f2, int i) {
        return i > 0 ? f + (f2 / 2.0f) : f;
    }

    static float updateCurPosition(float f, float f2, float f3, int i) {
        return i > 0 ? f2 + (f3 / 2.0f) : f;
    }

    private CarouselStrategyHelper() {
    }

    static float getExtraSmallSize(android.content.Context context) {
        return context.getResources().getDimension(com.google.android.material.R.dimen.m3_carousel_gone_size);
    }

    static float getSmallSizeMin(android.content.Context context) {
        return context.getResources().getDimension(com.google.android.material.R.dimen.m3_carousel_small_item_size_min);
    }

    static float getSmallSizeMax(android.content.Context context) {
        return context.getResources().getDimension(com.google.android.material.R.dimen.m3_carousel_small_item_size_max);
    }

    static com.google.android.material.carousel.KeylineState createKeylineState(android.content.Context context, float f, float f2, com.google.android.material.carousel.Arrangement arrangement, int i) {
        if (i == 1) {
            return createCenterAlignedKeylineState(context, f, f2, arrangement);
        }
        return createLeftAlignedKeylineState(context, f, f2, arrangement);
    }

    static com.google.android.material.carousel.KeylineState createLeftAlignedKeylineState(android.content.Context context, float f, float f2, com.google.android.material.carousel.Arrangement arrangement) {
        float min = java.lang.Math.min(getExtraSmallSize(context) + f, arrangement.largeSize);
        float f3 = min / 2.0f;
        float addStart = addStart(0.0f, arrangement.largeSize, arrangement.largeCount);
        float updateCurPosition = updateCurPosition(0.0f, addEnd(addStart, arrangement.largeSize, arrangement.largeCount), arrangement.largeSize, arrangement.largeCount);
        float addStart2 = addStart(updateCurPosition, arrangement.mediumSize, arrangement.mediumCount);
        float addStart3 = addStart(updateCurPosition(updateCurPosition, addStart2, arrangement.mediumSize, arrangement.mediumCount), arrangement.smallSize, arrangement.smallCount);
        float childMaskPercentage = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(min, arrangement.largeSize, f);
        float childMaskPercentage2 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(arrangement.smallSize, arrangement.largeSize, f);
        float childMaskPercentage3 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(arrangement.mediumSize, arrangement.largeSize, f);
        com.google.android.material.carousel.KeylineState.Builder addKeylineRange = new com.google.android.material.carousel.KeylineState.Builder(arrangement.largeSize, f2).addAnchorKeyline(0.0f - f3, childMaskPercentage, min).addKeylineRange(addStart, 0.0f, arrangement.largeSize, arrangement.largeCount, true);
        if (arrangement.mediumCount > 0) {
            addKeylineRange.addKeyline(addStart2, childMaskPercentage3, arrangement.mediumSize);
        }
        if (arrangement.smallCount > 0) {
            addKeylineRange.addKeylineRange(addStart3, childMaskPercentage2, arrangement.smallSize, arrangement.smallCount);
        }
        addKeylineRange.addAnchorKeyline(f3 + f2, childMaskPercentage, min);
        return addKeylineRange.build();
    }

    static com.google.android.material.carousel.KeylineState createCenterAlignedKeylineState(android.content.Context context, float f, float f2, com.google.android.material.carousel.Arrangement arrangement) {
        float f3;
        float min = java.lang.Math.min(getExtraSmallSize(context) + f, arrangement.largeSize);
        float f4 = min / 2.0f;
        float addStart = addStart(0.0f, arrangement.smallSize, arrangement.smallCount);
        float updateCurPosition = updateCurPosition(0.0f, addEnd(addStart, arrangement.smallSize, (int) java.lang.Math.floor(arrangement.smallCount / 2.0f)), arrangement.smallSize, arrangement.smallCount);
        float addStart2 = addStart(updateCurPosition, arrangement.mediumSize, arrangement.mediumCount);
        float updateCurPosition2 = updateCurPosition(updateCurPosition, addEnd(addStart2, arrangement.mediumSize, (int) java.lang.Math.floor(arrangement.mediumCount / 2.0f)), arrangement.mediumSize, arrangement.mediumCount);
        float addStart3 = addStart(updateCurPosition2, arrangement.largeSize, arrangement.largeCount);
        float updateCurPosition3 = updateCurPosition(updateCurPosition2, addEnd(addStart3, arrangement.largeSize, arrangement.largeCount), arrangement.largeSize, arrangement.largeCount);
        float addStart4 = addStart(updateCurPosition3, arrangement.mediumSize, arrangement.mediumCount);
        float addStart5 = addStart(updateCurPosition(updateCurPosition3, addEnd(addStart4, arrangement.mediumSize, (int) java.lang.Math.ceil(arrangement.mediumCount / 2.0f)), arrangement.mediumSize, arrangement.mediumCount), arrangement.smallSize, arrangement.smallCount);
        float childMaskPercentage = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(min, arrangement.largeSize, f);
        float childMaskPercentage2 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(arrangement.smallSize, arrangement.largeSize, f);
        float childMaskPercentage3 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(arrangement.mediumSize, arrangement.largeSize, f);
        com.google.android.material.carousel.KeylineState.Builder addAnchorKeyline = new com.google.android.material.carousel.KeylineState.Builder(arrangement.largeSize, f2).addAnchorKeyline(0.0f - f4, childMaskPercentage, min);
        if (arrangement.smallCount > 0) {
            f3 = f4;
            addAnchorKeyline.addKeylineRange(addStart, childMaskPercentage2, arrangement.smallSize, (int) java.lang.Math.floor(arrangement.smallCount / 2.0f));
        } else {
            f3 = f4;
        }
        if (arrangement.mediumCount > 0) {
            addAnchorKeyline.addKeylineRange(addStart2, childMaskPercentage3, arrangement.mediumSize, (int) java.lang.Math.floor(arrangement.mediumCount / 2.0f));
        }
        addAnchorKeyline.addKeylineRange(addStart3, 0.0f, arrangement.largeSize, arrangement.largeCount, true);
        if (arrangement.mediumCount > 0) {
            addAnchorKeyline.addKeylineRange(addStart4, childMaskPercentage3, arrangement.mediumSize, (int) java.lang.Math.ceil(arrangement.mediumCount / 2.0f));
        }
        if (arrangement.smallCount > 0) {
            addAnchorKeyline.addKeylineRange(addStart5, childMaskPercentage2, arrangement.smallSize, (int) java.lang.Math.ceil(arrangement.smallCount / 2.0f));
        }
        addAnchorKeyline.addAnchorKeyline(f3 + f2, childMaskPercentage, min);
        return addAnchorKeyline.build();
    }

    static int maxValue(int[] iArr) {
        int i = Integer.MIN_VALUE;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    static float addEnd(float f, float f2, int i) {
        return f + (java.lang.Math.max(0, i - 1) * f2);
    }
}
