package androidx.appcompat.widget;

/* loaded from: classes3.dex */
class AppCompatProgressBarHelper {
    private static final int[] getHighSpeedVideoFpsRangesFor = {android.R.attr.indeterminateDrawable, android.R.attr.progressDrawable};
    private android.graphics.Bitmap Camera2StreamConfigurationMap;
    private final android.widget.ProgressBar getHighResolutionOutputSizeshNQ4ISI;

    AppCompatProgressBarHelper(android.widget.ProgressBar progressBar) {
        this.getHighResolutionOutputSizeshNQ4ISI = progressBar;
    }

    void Camera2StreamConfigurationMap(android.util.AttributeSet attributeSet, int i) {
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(this.getHighResolutionOutputSizeshNQ4ISI.getContext(), attributeSet, getHighSpeedVideoFpsRangesFor, i, 0);
        android.graphics.drawable.Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.setIndeterminateDrawable(Camera2StreamConfigurationMap(drawableIfKnown));
        }
        android.graphics.drawable.Drawable drawableIfKnown2 = obtainStyledAttributes.getDrawableIfKnown(1);
        if (drawableIfKnown2 != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.setProgressDrawable(getHighSpeedVideoFpsRanges(drawableIfKnown2, false));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    android.graphics.drawable.Drawable getHighSpeedVideoFpsRanges(android.graphics.drawable.Drawable drawable, boolean z) {
        if (drawable instanceof androidx.core.graphics.drawable.WrappedDrawable) {
            androidx.core.graphics.drawable.WrappedDrawable wrappedDrawable = (androidx.core.graphics.drawable.WrappedDrawable) drawable;
            android.graphics.drawable.Drawable wrappedDrawable2 = wrappedDrawable.getWrappedDrawable();
            if (wrappedDrawable2 != null) {
                wrappedDrawable.setWrappedDrawable(getHighSpeedVideoFpsRanges(wrappedDrawable2, z));
                return drawable;
            }
        } else {
            if (drawable instanceof android.graphics.drawable.LayerDrawable) {
                android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = getHighSpeedVideoFpsRanges(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                android.graphics.drawable.LayerDrawable layerDrawable2 = new android.graphics.drawable.LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    androidx.appcompat.widget.AppCompatProgressBarHelper.Api23Impl.getHighSpeedVideoFpsRangesFor(layerDrawable, layerDrawable2, i2);
                }
                return layerDrawable2;
            }
            if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
                android.graphics.drawable.BitmapDrawable bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawable;
                android.graphics.Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.Camera2StreamConfigurationMap == null) {
                    this.Camera2StreamConfigurationMap = bitmap;
                }
                android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(getHighResolutionOutputSizeshNQ4ISI());
                shapeDrawable.getPaint().setShader(new android.graphics.BitmapShader(bitmap, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new android.graphics.drawable.ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    private android.graphics.drawable.Drawable Camera2StreamConfigurationMap(android.graphics.drawable.Drawable drawable) {
        if (!(drawable instanceof android.graphics.drawable.AnimationDrawable)) {
            return drawable;
        }
        android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        android.graphics.drawable.AnimationDrawable animationDrawable2 = new android.graphics.drawable.AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            android.graphics.drawable.Drawable highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(animationDrawable.getFrame(i), true);
            highSpeedVideoFpsRanges.setLevel(10000);
            animationDrawable2.addFrame(highSpeedVideoFpsRanges, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    private android.graphics.drawable.shapes.Shape getHighResolutionOutputSizeshNQ4ISI() {
        return new android.graphics.drawable.shapes.RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    android.graphics.Bitmap getHighSpeedVideoFpsRanges() {
        return this.Camera2StreamConfigurationMap;
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        public static void getHighSpeedVideoFpsRangesFor(android.graphics.drawable.LayerDrawable layerDrawable, android.graphics.drawable.LayerDrawable layerDrawable2, int i) {
            layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
            layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
            layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
            layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
            layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
            layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
            layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
            layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
            layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
        }
    }
}
