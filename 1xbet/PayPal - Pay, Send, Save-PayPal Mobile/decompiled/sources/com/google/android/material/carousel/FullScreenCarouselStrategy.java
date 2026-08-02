package com.google.android.material.carousel;

/* loaded from: classes8.dex */
public class FullScreenCarouselStrategy extends com.google.android.material.carousel.CarouselStrategy {
    @Override // com.google.android.material.carousel.CarouselStrategy
    com.google.android.material.carousel.KeylineState onFirstChildMeasuredWithMargins(com.google.android.material.carousel.Carousel carousel, android.view.View view) {
        float containerHeight;
        int i;
        int i2;
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
            i = layoutParams.leftMargin;
            i2 = layoutParams.rightMargin;
        } else {
            containerHeight = carousel.getContainerHeight();
            i = layoutParams.topMargin;
            i2 = layoutParams.bottomMargin;
        }
        float f = i + i2;
        return com.google.android.material.carousel.CarouselStrategyHelper.createLeftAlignedKeylineState(view.getContext(), f, containerHeight, new com.google.android.material.carousel.Arrangement(0, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0, java.lang.Math.min(containerHeight + f, containerHeight), 1, containerHeight));
    }
}
