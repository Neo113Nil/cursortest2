package androidx.transition;

/* loaded from: classes7.dex */
class ImageViewUtils {
    private static boolean getHighSpeedVideoSizes = true;

    static void Camera2StreamConfigurationMap(android.widget.ImageView imageView, android.graphics.Matrix matrix) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.transition.ImageViewUtils.Api29Impl.getHighResolutionOutputSizeshNQ4ISI(imageView, matrix);
            return;
        }
        if (matrix == null) {
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                int width = imageView.getWidth();
                int paddingLeft = imageView.getPaddingLeft();
                drawable.setBounds(0, 0, (width - paddingLeft) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
                return;
            }
            return;
        }
        if (getHighSpeedVideoSizes) {
            try {
                androidx.transition.ImageViewUtils.Api29Impl.getHighResolutionOutputSizeshNQ4ISI(imageView, matrix);
            } catch (java.lang.NoSuchMethodError unused) {
                getHighSpeedVideoSizes = false;
            }
        }
    }

    private ImageViewUtils() {
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.widget.ImageView imageView, android.graphics.Matrix matrix) {
            imageView.animateTransform(matrix);
        }
    }
}
