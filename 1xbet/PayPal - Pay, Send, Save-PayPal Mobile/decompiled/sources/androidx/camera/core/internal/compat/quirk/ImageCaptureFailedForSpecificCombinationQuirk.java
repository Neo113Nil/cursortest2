package androidx.camera.core.internal.compat.quirk;

/* loaded from: classes6.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges = new java.util.HashSet(java.util.Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    private static boolean getHighSpeedVideoFpsRangesFor() {
        return com.adjust.sdk.Constants.REFERRER_API_GOOGLE.equalsIgnoreCase(android.os.Build.BRAND) && getHighSpeedVideoFpsRanges.contains(android.os.Build.MODEL.toLowerCase());
    }

    private static boolean getHighSpeedVideoFpsRanges(java.util.Collection<androidx.camera.core.UseCase> collection) {
        if (collection.size() != 3) {
            return false;
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (androidx.camera.core.UseCase useCase : collection) {
            if (useCase instanceof androidx.camera.core.Preview) {
                z = true;
            } else if (useCase instanceof androidx.camera.core.ImageCapture) {
                z3 = true;
            } else if (useCase.getCurrentConfig().containsOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE)) {
                z2 = useCase.getCurrentConfig().getCaptureType() == androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
            }
        }
        return z && z2 && z3;
    }

    static boolean Camera2StreamConfigurationMap() {
        return ("oneplus".equalsIgnoreCase(android.os.Build.BRAND) && "cph2583".equalsIgnoreCase(android.os.Build.MODEL)) || getHighSpeedVideoFpsRangesFor();
    }

    public final boolean shouldForceEnableStreamSharing(java.lang.String str, java.util.Collection<androidx.camera.core.UseCase> collection) {
        return ("oneplus".equalsIgnoreCase(android.os.Build.BRAND) && "cph2583".equalsIgnoreCase(android.os.Build.MODEL)) ? str.equals("1") && getHighSpeedVideoFpsRanges(collection) : getHighSpeedVideoFpsRangesFor() && str.equals("1") && getHighSpeedVideoFpsRanges(collection);
    }
}
