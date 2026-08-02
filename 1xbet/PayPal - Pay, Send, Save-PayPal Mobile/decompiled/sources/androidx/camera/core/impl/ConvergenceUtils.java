package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public class ConvergenceUtils {
    private static final java.util.Set<androidx.camera.core.impl.CameraCaptureMetaData.AeState> Camera2StreamConfigurationMap;
    private static final java.util.Set<androidx.camera.core.impl.CameraCaptureMetaData.AeState> getHighSpeedVideoFpsRangesFor;
    private static final java.util.Set<androidx.camera.core.impl.CameraCaptureMetaData.AfState> getHighSpeedVideoSizes = java.util.Collections.unmodifiableSet(java.util.EnumSet.of(androidx.camera.core.impl.CameraCaptureMetaData.AfState.PASSIVE_FOCUSED, androidx.camera.core.impl.CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED, androidx.camera.core.impl.CameraCaptureMetaData.AfState.LOCKED_FOCUSED, androidx.camera.core.impl.CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED));
    private static final java.util.Set<androidx.camera.core.impl.CameraCaptureMetaData.AwbState> getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableSet(java.util.EnumSet.of(androidx.camera.core.impl.CameraCaptureMetaData.AwbState.CONVERGED, androidx.camera.core.impl.CameraCaptureMetaData.AwbState.UNKNOWN));

    static {
        java.util.Set<androidx.camera.core.impl.CameraCaptureMetaData.AeState> unmodifiableSet = java.util.Collections.unmodifiableSet(java.util.EnumSet.of(androidx.camera.core.impl.CameraCaptureMetaData.AeState.CONVERGED, androidx.camera.core.impl.CameraCaptureMetaData.AeState.FLASH_REQUIRED, androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN));
        Camera2StreamConfigurationMap = unmodifiableSet;
        java.util.EnumSet copyOf = java.util.EnumSet.copyOf((java.util.Collection) unmodifiableSet);
        copyOf.remove(androidx.camera.core.impl.CameraCaptureMetaData.AeState.FLASH_REQUIRED);
        copyOf.remove(androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN);
        getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableSet(copyOf);
    }

    private ConvergenceUtils() {
    }

    public static boolean is3AConverged(androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult, boolean z) {
        boolean z2 = cameraCaptureResult.getAfMode() == androidx.camera.core.impl.CameraCaptureMetaData.AfMode.OFF || getHighSpeedVideoSizes.contains(cameraCaptureResult.getAfState());
        boolean z3 = cameraCaptureResult.getAeMode() == androidx.camera.core.impl.CameraCaptureMetaData.AeMode.OFF;
        boolean z4 = !z ? !(z3 || Camera2StreamConfigurationMap.contains(cameraCaptureResult.getAeState())) : !(z3 || getHighSpeedVideoFpsRangesFor.contains(cameraCaptureResult.getAeState()));
        boolean z5 = cameraCaptureResult.getAwbMode() == androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.OFF || getHighSpeedVideoFpsRanges.contains(cameraCaptureResult.getAwbState());
        java.lang.StringBuilder sb = new java.lang.StringBuilder("checkCaptureResult, AE=");
        sb.append(cameraCaptureResult.getAeState());
        sb.append(" AF =");
        sb.append(cameraCaptureResult.getAfState());
        sb.append(" AWB=");
        sb.append(cameraCaptureResult.getAwbState());
        androidx.camera.core.Logger.d("ConvergenceUtils", sb.toString());
        return z2 && z4 && z5;
    }
}
