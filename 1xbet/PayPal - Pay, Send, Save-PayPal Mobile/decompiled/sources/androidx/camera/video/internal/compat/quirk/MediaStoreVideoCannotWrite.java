package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class MediaStoreVideoCannotWrite implements androidx.camera.core.impl.Quirk {
    public static boolean isPositivoTwist2Pro() {
        return "positivo".equalsIgnoreCase(android.os.Build.BRAND) && "twist 2 pro".equalsIgnoreCase(android.os.Build.MODEL);
    }

    public static boolean isItelW6004() {
        return "itel".equalsIgnoreCase(android.os.Build.BRAND) && "itel w6004".equalsIgnoreCase(android.os.Build.MODEL);
    }

    static boolean getHighSpeedVideoSizes() {
        return isPositivoTwist2Pro() || isItelW6004();
    }
}
