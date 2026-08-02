package androidx.camera.core.impl.compat;

/* loaded from: classes6.dex */
public final class EncoderProfilesProxyCompat {
    public static androidx.camera.core.impl.EncoderProfilesProxy from(android.media.EncoderProfiles encoderProfiles) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.camera.core.impl.compat.EncoderProfilesProxyCompatApi33Impl.U_(encoderProfiles);
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.camera.core.impl.compat.EncoderProfilesProxyCompatApi31Impl.T_(encoderProfiles);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to call from(EncoderProfiles) on API ");
        sb.append(android.os.Build.VERSION.SDK_INT);
        sb.append(". Version 31 or higher required.");
        throw new java.lang.RuntimeException(sb.toString());
    }

    public static androidx.camera.core.impl.EncoderProfilesProxy from(android.media.CamcorderProfile camcorderProfile) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Should use from(EncoderProfiles) on API ");
            sb.append(android.os.Build.VERSION.SDK_INT);
            sb.append("instead. CamcorderProfile is deprecated on API 31.");
            androidx.camera.core.Logger.w("EncoderProfilesProxyCompat", sb.toString());
        }
        return androidx.camera.core.impl.compat.EncoderProfilesProxyCompatBaseImpl.getHighSpeedVideoSizes(camcorderProfile);
    }

    private EncoderProfilesProxyCompat() {
    }
}
