package com.google.android.material.carousel;

/* loaded from: classes8.dex */
abstract class CarouselOrientationHelper {
    final int orientation;

    abstract void containMaskWithinBounds(android.graphics.RectF rectF, android.graphics.RectF rectF2, android.graphics.RectF rectF3);

    abstract int getDecoratedCrossAxisMeasurement(android.view.View view);

    abstract float getMaskMargins(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams);

    abstract android.graphics.RectF getMaskRect(float f, float f2, float f3, float f4);

    abstract int getParentBottom();

    abstract int getParentEnd();

    abstract int getParentLeft();

    abstract int getParentRight();

    abstract int getParentStart();

    abstract int getParentTop();

    abstract void layoutDecoratedWithMargins(android.view.View view, int i, int i2);

    abstract void moveMaskOnEdgeOutsideBounds(android.graphics.RectF rectF, android.graphics.RectF rectF2, android.graphics.RectF rectF3);

    abstract void offsetChild(android.view.View view, android.graphics.Rect rect, float f, float f2);

    private CarouselOrientationHelper(int i) {
        this.orientation = i;
    }

    static com.google.android.material.carousel.CarouselOrientationHelper createOrientationHelper(com.google.android.material.carousel.CarouselLayoutManager carouselLayoutManager, int i) {
        if (i == 0) {
            return createHorizontalHelper(carouselLayoutManager);
        }
        if (i == 1) {
            return createVerticalHelper(carouselLayoutManager);
        }
        throw new java.lang.IllegalArgumentException("invalid orientation");
    }

    private static com.google.android.material.carousel.CarouselOrientationHelper createVerticalHelper(final com.google.android.material.carousel.CarouselLayoutManager carouselLayoutManager) {
        return new com.google.android.material.carousel.CarouselOrientationHelper(1) { // from class: com.google.android.material.carousel.CarouselOrientationHelper.1
            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentTop() {
                return 0;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentLeft() {
                return carouselLayoutManager.getPaddingLeft();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentStart() {
                return getParentTop();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentRight() {
                return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentEnd() {
                return getParentBottom();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentBottom() {
                return carouselLayoutManager.getHeight();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getDecoratedCrossAxisMeasurement(android.view.View view) {
                androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
                return carouselLayoutManager.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void layoutDecoratedWithMargins(android.view.View view, int i, int i2) {
                int parentLeft = getParentLeft();
                carouselLayoutManager.layoutDecoratedWithMargins(view, parentLeft, i, parentLeft + getDecoratedCrossAxisMeasurement(view), i2);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public float getMaskMargins(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
                return layoutParams.topMargin + layoutParams.bottomMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public android.graphics.RectF getMaskRect(float f, float f2, float f3, float f4) {
                return new android.graphics.RectF(0.0f, f3, f2, f - f3);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void containMaskWithinBounds(android.graphics.RectF rectF, android.graphics.RectF rectF2, android.graphics.RectF rectF3) {
                if (rectF2.top < rectF3.top && rectF2.bottom > rectF3.top) {
                    float f = rectF3.top - rectF2.top;
                    rectF.top += f;
                    rectF3.top += f;
                }
                if (rectF2.bottom <= rectF3.bottom || rectF2.top >= rectF3.bottom) {
                    return;
                }
                float f2 = rectF2.bottom - rectF3.bottom;
                rectF.bottom = java.lang.Math.max(rectF.bottom - f2, rectF.top);
                rectF2.bottom = java.lang.Math.max(rectF2.bottom - f2, rectF2.top);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void moveMaskOnEdgeOutsideBounds(android.graphics.RectF rectF, android.graphics.RectF rectF2, android.graphics.RectF rectF3) {
                if (rectF2.bottom <= rectF3.top) {
                    rectF.bottom = ((float) java.lang.Math.floor(rectF.bottom)) - 1.0f;
                    rectF.top = java.lang.Math.min(rectF.top, rectF.bottom);
                }
                if (rectF2.top >= rectF3.bottom) {
                    rectF.top = ((float) java.lang.Math.ceil(rectF.top)) + 1.0f;
                    rectF.bottom = java.lang.Math.max(rectF.top, rectF.bottom);
                }
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void offsetChild(android.view.View view, android.graphics.Rect rect, float f, float f2) {
                view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
            }
        };
    }

    private static com.google.android.material.carousel.CarouselOrientationHelper createHorizontalHelper(final com.google.android.material.carousel.CarouselLayoutManager carouselLayoutManager) {
        return new com.google.android.material.carousel.CarouselOrientationHelper(0) { // from class: com.google.android.material.carousel.CarouselOrientationHelper.2
            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentLeft() {
                return 0;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentStart() {
                return carouselLayoutManager.isLayoutRtl() ? getParentRight() : getParentLeft();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentRight() {
                return carouselLayoutManager.getWidth();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentEnd() {
                return carouselLayoutManager.isLayoutRtl() ? getParentLeft() : getParentRight();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentTop() {
                return carouselLayoutManager.getPaddingTop();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentBottom() {
                return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getDecoratedCrossAxisMeasurement(android.view.View view) {
                androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
                return carouselLayoutManager.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void layoutDecoratedWithMargins(android.view.View view, int i, int i2) {
                int parentTop = getParentTop();
                carouselLayoutManager.layoutDecoratedWithMargins(view, i, parentTop, i2, parentTop + getDecoratedCrossAxisMeasurement(view));
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public float getMaskMargins(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
                return layoutParams.rightMargin + layoutParams.leftMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public android.graphics.RectF getMaskRect(float f, float f2, float f3, float f4) {
                return new android.graphics.RectF(f4, 0.0f, f2 - f4, f);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void containMaskWithinBounds(android.graphics.RectF rectF, android.graphics.RectF rectF2, android.graphics.RectF rectF3) {
                if (rectF2.left < rectF3.left && rectF2.right > rectF3.left) {
                    float f = rectF3.left - rectF2.left;
                    rectF.left += f;
                    rectF2.left += f;
                }
                if (rectF2.right <= rectF3.right || rectF2.left >= rectF3.right) {
                    return;
                }
                float f2 = rectF2.right - rectF3.right;
                rectF.right = java.lang.Math.max(rectF.right - f2, rectF.left);
                rectF2.right = java.lang.Math.max(rectF2.right - f2, rectF2.left);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void moveMaskOnEdgeOutsideBounds(android.graphics.RectF rectF, android.graphics.RectF rectF2, android.graphics.RectF rectF3) {
                if (rectF2.right <= rectF3.left) {
                    rectF.right = ((float) java.lang.Math.floor(rectF.right)) - 1.0f;
                    rectF.left = java.lang.Math.min(rectF.left, rectF.right);
                }
                if (rectF2.left >= rectF3.right) {
                    rectF.left = ((float) java.lang.Math.ceil(rectF.left)) + 1.0f;
                    rectF.right = java.lang.Math.max(rectF.left, rectF.right);
                }
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void offsetChild(android.view.View view, android.graphics.Rect rect, float f, float f2) {
                view.offsetLeftAndRight((int) (f2 - (rect.left + f)));
            }
        };
    }
}
