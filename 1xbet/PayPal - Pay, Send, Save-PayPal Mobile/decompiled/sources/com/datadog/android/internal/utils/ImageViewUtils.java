package com.datadog.android.internal.utils;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u000e"}, d2 = {"Lcom/datadog/android/internal/utils/ImageViewUtils;", "", "<init>", "()V", "Landroid/graphics/Rect;", "parentRect", "childRect", "", "density", "calculateClipping", "(Landroid/graphics/Rect;Landroid/graphics/Rect;F)Landroid/graphics/Rect;", "p0", "p1", "getHighSpeedVideoSizes", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Landroid/graphics/Rect;", "Landroid/widget/ImageView;", "imageView", "Landroid/graphics/drawable/Drawable;", "drawable", "Landroid/widget/ImageView$ScaleType;", "customScaleType", "resolveContentRectWithScaling", "(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Landroid/widget/ImageView$ScaleType;)Landroid/graphics/Rect;", "Landroid/view/View;", "view", "", "cropToPadding", "resolveParentRectAbsPosition", "(Landroid/view/View;Z)Landroid/graphics/Rect;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageViewUtils {
    public static final com.datadog.android.internal.utils.ImageViewUtils INSTANCE = new com.datadog.android.internal.utils.ImageViewUtils();

    private ImageViewUtils() {
    }

    public static /* synthetic */ android.graphics.Rect resolveParentRectAbsPosition$default(com.datadog.android.internal.utils.ImageViewUtils imageViewUtils, android.view.View view, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return imageViewUtils.resolveParentRectAbsPosition(view, z);
    }

    public final android.graphics.Rect resolveParentRectAbsPosition(android.view.View view, boolean cropToPadding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int paddingLeft = cropToPadding ? view.getPaddingLeft() : 0;
        int paddingRight = cropToPadding ? view.getPaddingRight() : 0;
        int paddingTop = cropToPadding ? view.getPaddingTop() : 0;
        int paddingBottom = cropToPadding ? view.getPaddingBottom() : 0;
        int i = iArr[0];
        return new android.graphics.Rect(paddingLeft + i, iArr[1] + paddingTop, (i + view.getWidth()) - paddingRight, (iArr[1] + view.getHeight()) - paddingBottom);
    }

    public final android.graphics.Rect calculateClipping(android.graphics.Rect parentRect, android.graphics.Rect childRect, float density) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentRect, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childRect, "");
        return new android.graphics.Rect(com.datadog.android.internal.utils.IntExtKt.densityNormalized(childRect.left < parentRect.left ? parentRect.left - childRect.left : 0, density), com.datadog.android.internal.utils.IntExtKt.densityNormalized(childRect.top < parentRect.top ? parentRect.top - childRect.top : 0, density), com.datadog.android.internal.utils.IntExtKt.densityNormalized(childRect.right > parentRect.right ? childRect.right - parentRect.right : 0, density), com.datadog.android.internal.utils.IntExtKt.densityNormalized(childRect.bottom > parentRect.bottom ? childRect.bottom - parentRect.bottom : 0, density));
    }

    public static /* synthetic */ android.graphics.Rect resolveContentRectWithScaling$default(com.datadog.android.internal.utils.ImageViewUtils imageViewUtils, android.widget.ImageView imageView, android.graphics.drawable.Drawable drawable, android.widget.ImageView.ScaleType scaleType, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            scaleType = null;
        }
        return imageViewUtils.resolveContentRectWithScaling(imageView, drawable, scaleType);
    }

    public final android.graphics.Rect resolveContentRectWithScaling(android.widget.ImageView imageView, android.graphics.drawable.Drawable drawable, android.widget.ImageView.ScaleType customScaleType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        android.graphics.Rect resolveParentRectAbsPosition$default = resolveParentRectAbsPosition$default(this, imageView, false, 2, null);
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, intrinsicWidth, intrinsicHeight);
        if (customScaleType == null) {
            customScaleType = imageView.getScaleType();
        }
        switch (customScaleType == null ? -1 : com.datadog.android.internal.utils.ImageViewUtils.WhenMappings.$EnumSwitchMapping$0[customScaleType.ordinal()]) {
            case -1:
            case 7:
            case 8:
                return new android.graphics.Rect(resolveParentRectAbsPosition$default.left, resolveParentRectAbsPosition$default.top, resolveParentRectAbsPosition$default.right, resolveParentRectAbsPosition$default.bottom);
            case 0:
            default:
                throw new kotlin.NoWhenBranchMatchedException();
            case 1:
                android.graphics.Rect Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(resolveParentRectAbsPosition$default, rect);
                int width = Camera2StreamConfigurationMap.width();
                int height = Camera2StreamConfigurationMap.height();
                android.graphics.Rect rect2 = new android.graphics.Rect();
                rect2.left = resolveParentRectAbsPosition$default.left;
                rect2.top = resolveParentRectAbsPosition$default.top;
                rect2.right = rect2.left + width;
                rect2.bottom = rect2.top + height;
                return rect2;
            case 2:
                android.graphics.Rect Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(resolveParentRectAbsPosition$default, rect);
                int width2 = Camera2StreamConfigurationMap2.width();
                int height2 = Camera2StreamConfigurationMap2.height();
                android.graphics.Rect rect3 = new android.graphics.Rect();
                rect3.right = resolveParentRectAbsPosition$default.right;
                rect3.bottom = resolveParentRectAbsPosition$default.bottom;
                rect3.left = resolveParentRectAbsPosition$default.right - width2;
                rect3.top = resolveParentRectAbsPosition$default.bottom - height2;
                return rect3;
            case 3:
                return getHighSpeedVideoSizes(resolveParentRectAbsPosition$default, Camera2StreamConfigurationMap(resolveParentRectAbsPosition$default, rect));
            case 4:
                if (resolveParentRectAbsPosition$default.width() <= rect.width() || resolveParentRectAbsPosition$default.height() <= rect.height()) {
                    float min = java.lang.Math.min(resolveParentRectAbsPosition$default.width() / rect.width(), resolveParentRectAbsPosition$default.height() / rect.height());
                    if (min >= 1.0f) {
                        min = 1.0f;
                    }
                    float width3 = rect.width();
                    float height3 = rect.height();
                    rect = new android.graphics.Rect();
                    rect.left = resolveParentRectAbsPosition$default.left;
                    rect.top = resolveParentRectAbsPosition$default.top;
                    rect.right = rect.left + ((int) (width3 * min));
                    rect.bottom = rect.top + ((int) (height3 * min));
                }
                return getHighSpeedVideoSizes(resolveParentRectAbsPosition$default, rect);
            case 5:
                return getHighSpeedVideoSizes(resolveParentRectAbsPosition$default, rect);
            case 6:
                float max = java.lang.Math.max(resolveParentRectAbsPosition$default.width() / rect.width(), resolveParentRectAbsPosition$default.height() / rect.height());
                float width4 = rect.width();
                float height4 = rect.height();
                android.graphics.Rect rect4 = new android.graphics.Rect();
                rect4.left = 0;
                rect4.top = 0;
                rect4.right = (int) (width4 * max);
                rect4.bottom = (int) (height4 * max);
                return getHighSpeedVideoSizes(resolveParentRectAbsPosition$default, rect4);
        }
    }

    private static android.graphics.Rect Camera2StreamConfigurationMap(android.graphics.Rect p0, android.graphics.Rect p1) {
        float min = java.lang.Math.min(p0.width() / p1.width(), p0.height() / p1.height());
        float width = p1.width();
        float height = p1.height();
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.left = 0;
        rect.top = 0;
        rect.right = (int) (width * min);
        rect.bottom = (int) (height * min);
        return rect;
    }

    private static android.graphics.Rect getHighSpeedVideoSizes(android.graphics.Rect p0, android.graphics.Rect p1) {
        int centerX = p0.centerX();
        int centerY = p0.centerY();
        int width = p1.width();
        int height = p1.height();
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.left = centerX - (width / 2);
        rect.top = centerY - (height / 2);
        rect.right = rect.left + width;
        rect.bottom = rect.top + height;
        return rect;
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[android.widget.ImageView.ScaleType.values().length];
            try {
                iArr[android.widget.ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[android.widget.ImageView.ScaleType.FIT_END.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[android.widget.ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[android.widget.ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[android.widget.ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
