package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class MediaCodecInfoReportIncorrectInfoQuirk implements androidx.camera.core.impl.Quirk {
    public static final java.util.List<java.lang.String> INCORRECT_FHD_PROFILE_MODEL_LIST = java.util.Arrays.asList("lg-k430", "redmi note 4", "m2003j15sc", "m2004j19c", "rmx3231", "v2117", "sm-a032f", "moto g(20)", "sm-a035m", "v2204", "23078pnd5g", "pht110", "23053rn02l", "rmx3710", "rmx3511", "v2207", "moto e20");

    public boolean isUnSupportMediaCodecInfo(android.media.MediaFormat mediaFormat) {
        androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk.MediaFormatResolver mediaFormatResolver = new androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk.MediaFormatResolver(mediaFormat);
        if ((!"Nokia".equalsIgnoreCase(android.os.Build.BRAND) || !"Nokia 1".equalsIgnoreCase(android.os.Build.MODEL)) && ((!"motorola".equalsIgnoreCase(android.os.Build.BRAND) || !"moto c".equalsIgnoreCase(android.os.Build.MODEL)) && ((!"infinix".equalsIgnoreCase(android.os.Build.BRAND) || !"infinix x650".equalsIgnoreCase(android.os.Build.MODEL)) && ((!"LGE".equalsIgnoreCase(android.os.Build.BRAND) || !"LG-X230".equalsIgnoreCase(android.os.Build.MODEL)) && (!"positivo".equalsIgnoreCase(android.os.Build.BRAND) || !"twist 2 pro".equalsIgnoreCase(android.os.Build.MODEL)))))) {
            if ((!"Huawei".equalsIgnoreCase(android.os.Build.BRAND) || !"mha-l29".equalsIgnoreCase(android.os.Build.MODEL)) && (!"Redmi".equalsIgnoreCase(android.os.Build.BRAND) || !"Redmi Note 8 Pro".equalsIgnoreCase(android.os.Build.MODEL))) {
                return INCORRECT_FHD_PROFILE_MODEL_LIST.contains(android.os.Build.MODEL.toLowerCase(java.util.Locale.US)) && "video/avc".equalsIgnoreCase(mediaFormatResolver.getHighSpeedVideoSizes.getString("mime")) && mediaFormatResolver.getHighResolutionOutputSizeshNQ4ISI(1920, 1080);
            }
            java.lang.String string = mediaFormatResolver.getHighSpeedVideoSizes.getString("mime");
            return string != null && string.contains("video/") && mediaFormatResolver.getHighResolutionOutputSizeshNQ4ISI(3840, 2160);
        }
        return androidx.media3.common.MimeTypes.VIDEO_MP4V.equalsIgnoreCase(mediaFormatResolver.getHighSpeedVideoSizes.getString("mime"));
    }

    static class MediaFormatResolver {
        final android.media.MediaFormat getHighSpeedVideoSizes;

        MediaFormatResolver(android.media.MediaFormat mediaFormat) {
            this.getHighSpeedVideoSizes = mediaFormat;
        }

        final boolean getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
            return this.getHighSpeedVideoSizes.getInteger("width") == i && this.getHighSpeedVideoSizes.getInteger("height") == i2;
        }
    }

    public static java.util.Set<android.util.Size> getExtraSupportedSizes() {
        if (INCORRECT_FHD_PROFILE_MODEL_LIST.contains(android.os.Build.MODEL.toLowerCase(java.util.Locale.US))) {
            return java.util.Collections.singleton(new android.util.Size(1920, 1080));
        }
        return java.util.Collections.emptySet();
    }

    static boolean Camera2StreamConfigurationMap() {
        if ("Nokia".equalsIgnoreCase(android.os.Build.BRAND) && "Nokia 1".equalsIgnoreCase(android.os.Build.MODEL)) {
            return true;
        }
        if ("motorola".equalsIgnoreCase(android.os.Build.BRAND) && "moto c".equalsIgnoreCase(android.os.Build.MODEL)) {
            return true;
        }
        if ("infinix".equalsIgnoreCase(android.os.Build.BRAND) && "infinix x650".equalsIgnoreCase(android.os.Build.MODEL)) {
            return true;
        }
        if ("LGE".equalsIgnoreCase(android.os.Build.BRAND) && "LG-X230".equalsIgnoreCase(android.os.Build.MODEL)) {
            return true;
        }
        if ("Huawei".equalsIgnoreCase(android.os.Build.BRAND) && "mha-l29".equalsIgnoreCase(android.os.Build.MODEL)) {
            return true;
        }
        if ("Redmi".equalsIgnoreCase(android.os.Build.BRAND) && "Redmi Note 8 Pro".equalsIgnoreCase(android.os.Build.MODEL)) {
            return true;
        }
        return ("positivo".equalsIgnoreCase(android.os.Build.BRAND) && "twist 2 pro".equalsIgnoreCase(android.os.Build.MODEL)) || INCORRECT_FHD_PROFILE_MODEL_LIST.contains(android.os.Build.MODEL.toLowerCase(java.util.Locale.US));
    }
}
