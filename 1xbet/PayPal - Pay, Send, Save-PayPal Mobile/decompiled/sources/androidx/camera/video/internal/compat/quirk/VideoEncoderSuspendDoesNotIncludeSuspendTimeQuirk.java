package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk implements androidx.camera.core.impl.Quirk {
    static boolean getHighSpeedVideoFpsRangesFor() {
        return "Samsung".equalsIgnoreCase(android.os.Build.BRAND) && android.os.Build.VERSION.SDK_INT < 29;
    }
}
