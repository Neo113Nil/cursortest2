package androidx.camera.core.internal;

/* loaded from: classes6.dex */
class SupportedOutputSizesSorterLegacy {
    final int Camera2StreamConfigurationMap;
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    final android.util.Rational getHighSpeedVideoFpsRanges;
    final int getHighSpeedVideoFpsRangesFor;

    SupportedOutputSizesSorterLegacy(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, android.util.Rational rational) {
        this.getHighSpeedVideoFpsRangesFor = cameraInfoInternal.getSensorRotationDegrees();
        this.Camera2StreamConfigurationMap = cameraInfoInternal.getLensFacing();
        this.getHighSpeedVideoFpsRanges = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    static android.util.Rational Camera2StreamConfigurationMap(android.util.Size size, java.util.List<android.util.Size> list) {
        if (size == null) {
            return null;
        }
        for (android.util.Rational rational : androidx.camera.core.internal.SupportedOutputSizesSorter.getHighSpeedVideoSizes(list)) {
            if (androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                return rational;
            }
        }
        return new android.util.Rational(size.getWidth(), size.getHeight());
    }

    static android.util.Size getHighSpeedVideoFpsRanges(android.util.Size size, int i, int i2, int i3) {
        if (size != null) {
            int relativeImageRotation = androidx.camera.core.impl.utils.CameraOrientationUtil.getRelativeImageRotation(androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(i), i3, 1 == i2);
            if (relativeImageRotation == 90 || relativeImageRotation == 270) {
                return new android.util.Size(size.getHeight(), size.getWidth());
            }
        }
        return size;
    }
}
