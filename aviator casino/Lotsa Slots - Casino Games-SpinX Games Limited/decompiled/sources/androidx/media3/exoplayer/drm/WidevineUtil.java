package androidx.media3.exoplayer.drm;

/* loaded from: classes2.dex */
public final class WidevineUtil {
    public static final java.lang.String PROPERTY_LICENSE_DURATION_REMAINING = "LicenseDurationRemaining";
    public static final java.lang.String PROPERTY_PLAYBACK_DURATION_REMAINING = "PlaybackDurationRemaining";

    private WidevineUtil() {
    }

    public static android.util.Pair<java.lang.Long, java.lang.Long> getLicenseDurationRemainingSec(androidx.media3.exoplayer.drm.DrmSession drmSession) {
        java.util.Map<java.lang.String, java.lang.String> queryKeyStatus = drmSession.queryKeyStatus();
        if (queryKeyStatus == null) {
            return null;
        }
        return new android.util.Pair<>(java.lang.Long.valueOf(getDurationRemainingSec(queryKeyStatus, "LicenseDurationRemaining")), java.lang.Long.valueOf(getDurationRemainingSec(queryKeyStatus, "PlaybackDurationRemaining")));
    }

    private static long getDurationRemainingSec(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            java.lang.String str2 = map.get(str);
            if (str2 != null) {
                return java.lang.Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (java.lang.NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }
}
