package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class HdrRepeatingRequestFailureQuirk implements androidx.camera.core.impl.Quirk {
    public boolean workaroundBySurfaceProcessing(androidx.camera.core.DynamicRange dynamicRange) {
        return com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(android.os.Build.BRAND) && "pa3q".equalsIgnoreCase(android.os.Build.DEVICE) && (dynamicRange != androidx.camera.core.DynamicRange.SDR);
    }

    static boolean getHighSpeedVideoSizes() {
        return com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(android.os.Build.BRAND) && "pa3q".equalsIgnoreCase(android.os.Build.DEVICE);
    }
}
