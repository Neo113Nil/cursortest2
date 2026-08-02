package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class AudioEncoderIgnoresInputTimestampQuirk implements androidx.camera.core.impl.Quirk {
    static boolean getHighSpeedVideoSizes() {
        return "Sony".equalsIgnoreCase(android.os.Build.BRAND) && "G3125".equalsIgnoreCase(android.os.Build.MODEL);
    }
}
