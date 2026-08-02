package androidx.camera.view;

/* loaded from: classes6.dex */
final class PreviewTransformation {
    private static final androidx.camera.view.PreviewView.ScaleType getHighSpeedVideoSizesFor = androidx.camera.view.PreviewView.ScaleType.FILL_CENTER;
    boolean Camera2StreamConfigurationMap;
    android.util.Size getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    androidx.camera.view.PreviewView.ScaleType getHighSpeedVideoSizes = getHighSpeedVideoSizesFor;
    android.graphics.Matrix getInputFormats;
    android.graphics.Rect getOutputFormats;
    int getOutputMinFrameDuration;

    PreviewTransformation() {
    }

    final android.graphics.Matrix getHighSpeedVideoSizes() {
        int i;
        androidx.core.util.Preconditions.checkState(getHighSpeedVideoFpsRanges());
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, this.getHighResolutionOutputSizeshNQ4ISI.getWidth(), this.getHighResolutionOutputSizeshNQ4ISI.getHeight());
        if (!this.getHighSpeedVideoFpsRanges) {
            i = this.getHighSpeedVideoFpsRangesFor;
        } else {
            i = -androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(this.getOutputMinFrameDuration);
        }
        return androidx.camera.core.impl.utils.TransformUtils.getRectToRect(rectF, rectF, i);
    }

    final void Camera2StreamConfigurationMap(android.util.Size size, int i, android.view.View view) {
        int i2;
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            androidx.camera.core.Logger.w("PreviewTransform", "Transform not applied due to PreviewView size: ".concat(java.lang.String.valueOf(size)));
            return;
        }
        if (getHighSpeedVideoFpsRanges()) {
            if (view instanceof android.view.TextureView) {
                ((android.view.TextureView) view).setTransform(getHighSpeedVideoSizes());
            } else {
                android.view.Display display = view.getDisplay();
                boolean z = false;
                boolean z2 = (!this.getHighSpeedVideoFpsRanges || display == null || display.getRotation() == this.getOutputMinFrameDuration) ? false : true;
                boolean z3 = this.getHighSpeedVideoFpsRanges;
                if (!z3) {
                    if (!z3) {
                        i2 = this.getHighSpeedVideoFpsRangesFor;
                    } else {
                        i2 = -androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(this.getOutputMinFrameDuration);
                    }
                    if (i2 != 0) {
                        z = true;
                    }
                }
                if (z2 || z) {
                    androidx.camera.core.Logger.e("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            android.graphics.RectF highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(size, i);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(highSpeedVideoFpsRanges.width() / this.getHighResolutionOutputSizeshNQ4ISI.getWidth());
            view.setScaleY(highSpeedVideoFpsRanges.height() / this.getHighResolutionOutputSizeshNQ4ISI.getHeight());
            view.setTranslationX(highSpeedVideoFpsRanges.left - view.getLeft());
            view.setTranslationY(highSpeedVideoFpsRanges.top - view.getTop());
        }
    }

    final android.graphics.RectF getHighSpeedVideoFpsRanges(android.util.Size size, int i) {
        androidx.core.util.Preconditions.checkState(getHighSpeedVideoFpsRanges());
        android.graphics.Matrix highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(size, i);
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, this.getHighResolutionOutputSizeshNQ4ISI.getWidth(), this.getHighResolutionOutputSizeshNQ4ISI.getHeight());
        highSpeedVideoFpsRangesFor.mapRect(rectF);
        return rectF;
    }

    final android.graphics.Matrix getHighResolutionOutputSizeshNQ4ISI(android.util.Size size, int i) {
        if (!getHighSpeedVideoFpsRanges()) {
            return null;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix(this.getInputFormats);
        matrix.postConcat(getHighSpeedVideoFpsRangesFor(size, i));
        return matrix;
    }

    final android.graphics.Matrix getHighSpeedVideoFpsRangesFor(android.util.Size size, int i) {
        android.graphics.RectF highSpeedVideoSizes;
        androidx.core.util.Preconditions.checkState(getHighSpeedVideoFpsRanges());
        if (androidx.camera.core.impl.utils.TransformUtils.isAspectRatioMatchingWithRoundingError(size, true, Camera2StreamConfigurationMap(), false)) {
            highSpeedVideoSizes = new android.graphics.RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            highSpeedVideoSizes = getHighSpeedVideoSizes(size, i);
        }
        android.graphics.Matrix rectToRect = androidx.camera.core.impl.utils.TransformUtils.getRectToRect(new android.graphics.RectF(this.getOutputFormats), highSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        if (this.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRanges) {
            if (androidx.camera.core.impl.utils.TransformUtils.is90or270(this.getHighSpeedVideoFpsRangesFor)) {
                rectToRect.preScale(1.0f, -1.0f, this.getOutputFormats.centerX(), this.getOutputFormats.centerY());
                return rectToRect;
            }
            rectToRect.preScale(-1.0f, 1.0f, this.getOutputFormats.centerX(), this.getOutputFormats.centerY());
        }
        return rectToRect;
    }

    private android.graphics.RectF getHighSpeedVideoSizes(android.util.Size size, int i) {
        android.graphics.Matrix.ScaleToFit scaleToFit;
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        android.util.Size Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        android.graphics.RectF rectF2 = new android.graphics.RectF(0.0f, 0.0f, Camera2StreamConfigurationMap.getWidth(), Camera2StreamConfigurationMap.getHeight());
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        androidx.camera.view.PreviewView.ScaleType scaleType = this.getHighSpeedVideoSizes;
        switch (androidx.camera.view.PreviewTransformation.AnonymousClass1.getHighSpeedVideoFpsRanges[scaleType.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = android.graphics.Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = android.graphics.Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = android.graphics.Matrix.ScaleToFit.START;
                break;
            default:
                androidx.camera.core.Logger.e("PreviewTransform", "Unexpected crop rect: ".concat(java.lang.String.valueOf(scaleType)));
                scaleToFit = android.graphics.Matrix.ScaleToFit.FILL;
                break;
        }
        if (scaleType == androidx.camera.view.PreviewView.ScaleType.FIT_CENTER || scaleType == androidx.camera.view.PreviewView.ScaleType.FIT_START || scaleType == androidx.camera.view.PreviewView.ScaleType.FIT_END) {
            matrix.setRectToRect(rectF2, rectF, scaleToFit);
        } else {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.invert(matrix);
        }
        matrix.mapRect(rectF2);
        if (i != 1) {
            return rectF2;
        }
        float width = size.getWidth() / 2.0f;
        float f = width + width;
        return new android.graphics.RectF(f - rectF2.right, rectF2.top, f - rectF2.left, rectF2.bottom);
    }

    /* renamed from: androidx.camera.view.PreviewTransformation$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[androidx.camera.view.PreviewView.ScaleType.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[androidx.camera.view.PreviewView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.camera.view.PreviewView.ScaleType.FILL_CENTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.camera.view.PreviewView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.camera.view.PreviewView.ScaleType.FILL_END.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.camera.view.PreviewView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.camera.view.PreviewView.ScaleType.FILL_START.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    private android.util.Size Camera2StreamConfigurationMap() {
        if (androidx.camera.core.impl.utils.TransformUtils.is90or270(this.getHighSpeedVideoFpsRangesFor)) {
            return new android.util.Size(this.getOutputFormats.height(), this.getOutputFormats.width());
        }
        return new android.util.Size(this.getOutputFormats.width(), this.getOutputFormats.height());
    }

    final android.graphics.Matrix getHighSpeedVideoSizes(android.util.Size size, int i, android.graphics.Rect rect) {
        if (!getHighSpeedVideoFpsRanges()) {
            return null;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        getHighResolutionOutputSizeshNQ4ISI(size, i).invert(matrix);
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.setRectToRect(new android.graphics.RectF(0.0f, 0.0f, rect.width(), rect.height()), new android.graphics.RectF(0.0f, 0.0f, 1.0f, 1.0f), android.graphics.Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    final boolean getHighSpeedVideoFpsRanges() {
        return (this.getOutputFormats == null || this.getHighResolutionOutputSizeshNQ4ISI == null || !(!this.getHighSpeedVideoFpsRanges || this.getOutputMinFrameDuration != -1)) ? false : true;
    }
}
