package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class SignalEosOutputBufferNotComeQuirk implements androidx.camera.core.impl.Quirk {
    static boolean Camera2StreamConfigurationMap() {
        return "Nokia".equalsIgnoreCase(android.os.Build.BRAND) && "Nokia 1".equalsIgnoreCase(android.os.Build.MODEL);
    }
}
