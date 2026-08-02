package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class NegativeLatLongSavesIncorrectlyQuirk implements androidx.camera.core.impl.Quirk {
    static boolean getHighSpeedVideoFpsRanges() {
        return android.os.Build.VERSION.SDK_INT < 34;
    }
}
