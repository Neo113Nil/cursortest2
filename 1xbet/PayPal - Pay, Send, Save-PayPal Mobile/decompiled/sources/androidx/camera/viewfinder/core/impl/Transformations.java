package androidx.camera.viewfinder.core.impl;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u0016\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b \u0010!J'\u0010&\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\"*\u00020\u00112\u0006\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010)"}, d2 = {"Landroidx/camera/viewfinder/core/impl/Transformations;", "", "<init>", "()V", "", "displayRotationDegrees", "width", "height", "Landroid/graphics/Matrix;", "getTextureViewCorrectionMatrix", "(III)Landroid/graphics/Matrix;", "rotationValue", "surfaceRotationToRotationDegrees", "(I)I", "Landroid/util/Size;", "viewfinderSize", "surfaceResolution", "Landroidx/camera/viewfinder/core/TransformationInfo;", "transformationInfo", "layoutDirection", "Landroidx/camera/viewfinder/core/ScaleType;", "scaleType", "getSurfaceToViewfinderMatrix", "(Landroid/util/Size;Landroid/util/Size;Landroidx/camera/viewfinder/core/TransformationInfo;ILandroidx/camera/viewfinder/core/ScaleType;)Landroid/graphics/Matrix;", "Landroidx/camera/viewfinder/core/impl/ContentScale;", "contentScale", "Landroidx/camera/viewfinder/core/impl/Alignment;", "alignment", "(Landroid/util/Size;Landroid/util/Size;Landroidx/camera/viewfinder/core/TransformationInfo;ILandroidx/camera/viewfinder/core/impl/ContentScale;Landroidx/camera/viewfinder/core/impl/Alignment;)Landroid/graphics/Matrix;", "Landroid/util/SizeF;", "rotatedViewportSize", "", "isViewportAspectRatioMatchViewfinder$viewfinder_core", "(Landroid/util/SizeF;Landroid/util/Size;)Z", "Landroid/graphics/RectF;", "p0", "p1", "p2", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/graphics/RectF;Landroid/graphics/RectF;I)Landroid/graphics/Matrix;", "getHighSpeedVideoSizes", "(Landroidx/camera/viewfinder/core/TransformationInfo;Landroid/util/Size;)Landroid/graphics/RectF;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Transformations {
    public static final androidx.camera.viewfinder.core.impl.Transformations INSTANCE = new androidx.camera.viewfinder.core.impl.Transformations();

    private Transformations() {
    }

    @kotlin.jvm.JvmStatic
    public static final android.graphics.Matrix getTextureViewCorrectionMatrix(int displayRotationDegrees, int width, int height) {
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, width, height);
        return getHighResolutionOutputSizeshNQ4ISI(rectF, rectF, -displayRotationDegrees);
    }

    @kotlin.jvm.JvmStatic
    public static final int surfaceRotationToRotationDegrees(int rotationValue) {
        if (rotationValue == 0) {
            return 0;
        }
        if (rotationValue == 1) {
            return 90;
        }
        if (rotationValue == 2) {
            return com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
        }
        if (rotationValue == 3) {
            return 270;
        }
        throw new java.lang.UnsupportedOperationException("Unsupported surface rotation: ".concat(java.lang.String.valueOf(rotationValue)));
    }

    @kotlin.jvm.JvmStatic
    public static final android.graphics.Matrix getSurfaceToViewfinderMatrix(android.util.Size viewfinderSize, android.util.Size surfaceResolution, androidx.camera.viewfinder.core.TransformationInfo transformationInfo, int layoutDirection, androidx.camera.viewfinder.core.ScaleType scaleType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewfinderSize, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceResolution, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transformationInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scaleType, "");
        return getSurfaceToViewfinderMatrix(viewfinderSize, surfaceResolution, transformationInfo, layoutDirection, scaleType.getContentScale(), scaleType.getAlignment());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final android.graphics.Matrix getSurfaceToViewfinderMatrix(android.util.Size viewfinderSize, android.util.Size surfaceResolution, androidx.camera.viewfinder.core.TransformationInfo transformationInfo, int layoutDirection, androidx.camera.viewfinder.core.impl.ContentScale contentScale, androidx.camera.viewfinder.core.impl.Alignment alignment) {
        android.util.SizeF sizeF;
        android.graphics.RectF rectF;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewfinderSize, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceResolution, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transformationInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentScale, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alignment, "");
        androidx.camera.viewfinder.core.impl.Transformations transformations = INSTANCE;
        android.graphics.RectF highSpeedVideoSizes = getHighSpeedVideoSizes(transformationInfo, surfaceResolution);
        int sourceRotation = transformationInfo.getSourceRotation();
        if (sourceRotation != 0) {
            if (sourceRotation != 90) {
                if (sourceRotation != 180) {
                    if (sourceRotation != 270) {
                        throw new java.lang.IllegalArgumentException("Invalid rotation degrees: ".concat(java.lang.String.valueOf(sourceRotation)));
                    }
                }
            }
            sizeF = new android.util.SizeF(highSpeedVideoSizes.height(), highSpeedVideoSizes.width());
            if (!transformations.isViewportAspectRatioMatchViewfinder$viewfinder_core(sizeF, viewfinderSize)) {
                rectF = new android.graphics.RectF(0.0f, 0.0f, viewfinderSize.getWidth(), viewfinderSize.getHeight());
            } else {
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                long mo1043computeScaleFactorho9e9VQ = contentScale.mo1043computeScaleFactorho9e9VQ(sizeF, new android.util.SizeF(viewfinderSize.getWidth(), viewfinderSize.getHeight()));
                matrix.setScale(androidx.camera.viewfinder.core.impl.ScaleFactorF.m1062getScaleXimpl(mo1043computeScaleFactorho9e9VQ), androidx.camera.viewfinder.core.impl.ScaleFactorF.m1063getScaleYimpl(mo1043computeScaleFactorho9e9VQ));
                long mo1042align41g9ag8 = alignment.mo1042align41g9ag8(new android.util.SizeF(sizeF.getWidth() * androidx.camera.viewfinder.core.impl.ScaleFactorF.m1062getScaleXimpl(mo1043computeScaleFactorho9e9VQ), sizeF.getHeight() * androidx.camera.viewfinder.core.impl.ScaleFactorF.m1063getScaleYimpl(mo1043computeScaleFactorho9e9VQ)), new android.util.SizeF(viewfinderSize.getWidth(), viewfinderSize.getHeight()), layoutDirection);
                matrix.postTranslate(androidx.camera.viewfinder.core.impl.OffsetF.m1053getXimpl(mo1042align41g9ag8), androidx.camera.viewfinder.core.impl.OffsetF.m1054getYimpl(mo1042align41g9ag8));
                rectF = new android.graphics.RectF(0.0f, 0.0f, sizeF.getWidth(), sizeF.getHeight());
                matrix.mapRect(rectF);
            }
            android.graphics.RectF highSpeedVideoSizes2 = getHighSpeedVideoSizes(transformationInfo, surfaceResolution);
            android.graphics.Matrix highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes2, rectF, transformationInfo.getSourceRotation());
            if (transformationInfo.getIsSourceMirroredHorizontally()) {
                highResolutionOutputSizeshNQ4ISI.preScale(-1.0f, 1.0f, highSpeedVideoSizes2.centerX(), highSpeedVideoSizes2.centerY());
            }
            if (transformationInfo.getIsSourceMirroredVertically()) {
                highResolutionOutputSizeshNQ4ISI.preScale(1.0f, -1.0f, highSpeedVideoSizes2.centerX(), highSpeedVideoSizes2.centerY());
            }
            return highResolutionOutputSizeshNQ4ISI;
        }
        sizeF = new android.util.SizeF(highSpeedVideoSizes.width(), highSpeedVideoSizes.height());
        if (!transformations.isViewportAspectRatioMatchViewfinder$viewfinder_core(sizeF, viewfinderSize)) {
        }
        android.graphics.RectF highSpeedVideoSizes22 = getHighSpeedVideoSizes(transformationInfo, surfaceResolution);
        android.graphics.Matrix highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes22, rectF, transformationInfo.getSourceRotation());
        if (transformationInfo.getIsSourceMirroredHorizontally()) {
        }
        if (transformationInfo.getIsSourceMirroredVertically()) {
        }
        return highResolutionOutputSizeshNQ4ISI2;
    }

    private static android.graphics.Matrix getHighResolutionOutputSizeshNQ4ISI(android.graphics.RectF p0, android.graphics.RectF p1, int p2) {
        android.graphics.RectF rectF;
        android.graphics.RectF rectF2;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        rectF = androidx.camera.viewfinder.core.impl.TransformationsKt.getHighSpeedVideoFpsRanges;
        matrix.setRectToRect(p0, rectF, android.graphics.Matrix.ScaleToFit.FILL);
        matrix.postRotate(p2);
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        rectF2 = androidx.camera.viewfinder.core.impl.TransformationsKt.getHighSpeedVideoFpsRanges;
        matrix2.setRectToRect(rectF2, p1, android.graphics.Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    private static android.graphics.RectF getHighSpeedVideoSizes(androidx.camera.viewfinder.core.TransformationInfo transformationInfo, android.util.Size size) {
        float cropRectLeft = transformationInfo.getCropRectLeft();
        if (java.lang.Float.isNaN(cropRectLeft)) {
            cropRectLeft = 0.0f;
        }
        float cropRectTop = transformationInfo.getCropRectTop();
        float f = java.lang.Float.isNaN(cropRectTop) ? 0.0f : cropRectTop;
        float cropRectRight = transformationInfo.getCropRectRight();
        if (java.lang.Float.isNaN(cropRectRight)) {
            cropRectRight = size.getWidth();
        }
        float cropRectBottom = transformationInfo.getCropRectBottom();
        if (java.lang.Float.isNaN(cropRectBottom)) {
            cropRectBottom = size.getHeight();
        }
        return new android.graphics.RectF(cropRectLeft, f, cropRectRight, cropRectBottom);
    }

    public final boolean isViewportAspectRatioMatchViewfinder$viewfinder_core(android.util.SizeF rotatedViewportSize, android.util.Size viewfinderSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rotatedViewportSize, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewfinderSize, "");
        float width = (rotatedViewportSize.getWidth() + 1.0f) / (rotatedViewportSize.getHeight() - 1.0f);
        float width2 = (rotatedViewportSize.getWidth() - 1.0f) / (rotatedViewportSize.getHeight() + 1.0f);
        float width3 = viewfinderSize.getWidth() / viewfinderSize.getHeight();
        return width >= width3 && width3 >= width2;
    }
}
