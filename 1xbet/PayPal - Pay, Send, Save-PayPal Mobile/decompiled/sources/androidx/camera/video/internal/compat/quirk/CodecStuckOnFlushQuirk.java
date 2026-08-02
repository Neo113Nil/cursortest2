package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class CodecStuckOnFlushQuirk implements androidx.camera.core.impl.Quirk {
    public boolean isProblematicMimeType(java.lang.String str) {
        return androidx.media3.common.MimeTypes.VIDEO_MP4V.equals(str);
    }

    static boolean getHighSpeedVideoFpsRanges() {
        return "Nokia".equalsIgnoreCase(android.os.Build.BRAND) && "Nokia 1".equalsIgnoreCase(android.os.Build.MODEL);
    }
}
