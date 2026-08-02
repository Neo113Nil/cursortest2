package androidx.camera.video;

/* loaded from: classes6.dex */
public class CapabilitiesByQuality {
    private final androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy getHighSpeedVideoFpsRanges;
    private final androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy getHighSpeedVideoSizes;
    private final java.util.Map<androidx.camera.video.Quality, androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy> Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
    private final java.util.TreeMap<android.util.Size, androidx.camera.video.Quality> getHighSpeedVideoFpsRangesFor = new java.util.TreeMap<>(new androidx.camera.core.impl.utils.CompareSizesByArea());

    public CapabilitiesByQuality(androidx.camera.core.impl.EncoderProfilesProvider encoderProfilesProvider, int i) {
        java.util.Iterator<androidx.camera.video.Quality> it = androidx.camera.video.Quality.getSortedQualities().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            androidx.camera.video.Quality next = it.next();
            androidx.core.util.Preconditions.checkState(next instanceof androidx.camera.video.Quality.ConstantQuality, "Currently only support ConstantQuality");
            androidx.camera.core.impl.EncoderProfilesProxy all = encoderProfilesProvider.getAll(((androidx.camera.video.Quality.ConstantQuality) next).getQualityValue(i));
            if (all != null) {
                androidx.camera.core.Logger.d("CapabilitiesByQuality", "profiles = ".concat(java.lang.String.valueOf(all)));
                androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy from = all.getVideoProfiles().isEmpty() ? null : androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy.from(all);
                if (from == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("EncoderProfiles of quality ");
                    sb.append(next);
                    sb.append(" has no video validated profiles.");
                    androidx.camera.core.Logger.w("CapabilitiesByQuality", sb.toString());
                } else {
                    this.getHighSpeedVideoFpsRangesFor.put(from.getDefaultVideoProfile().getResolution(), next);
                    this.Camera2StreamConfigurationMap.put(next, from);
                }
            }
        }
        if (this.Camera2StreamConfigurationMap.isEmpty()) {
            androidx.camera.core.Logger.e("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoSizes = null;
        } else {
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(this.Camera2StreamConfigurationMap.values());
            this.getHighSpeedVideoSizes = (androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy) arrayDeque.peekFirst();
            this.getHighSpeedVideoFpsRanges = (androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy) arrayDeque.peekLast();
        }
    }

    public java.util.List<androidx.camera.video.Quality> getSupportedQualities() {
        return new java.util.ArrayList(this.Camera2StreamConfigurationMap.keySet());
    }

    public android.util.Size getResolution(androidx.camera.video.Quality quality) {
        androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy profiles = getProfiles(quality);
        if (profiles != null) {
            return profiles.getDefaultVideoProfile().getResolution();
        }
        return null;
    }

    public androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy findNearestHigherSupportedEncoderProfilesFor(android.util.Size size) {
        androidx.camera.video.Quality findNearestHigherSupportedQualityFor = findNearestHigherSupportedQualityFor(size);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Using supported quality of ");
        sb.append(findNearestHigherSupportedQualityFor);
        sb.append(" for size ");
        sb.append(size);
        androidx.camera.core.Logger.d("CapabilitiesByQuality", sb.toString());
        if (findNearestHigherSupportedQualityFor == androidx.camera.video.Quality.getHighSpeedVideoFpsRanges) {
            return null;
        }
        androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy profiles = getProfiles(findNearestHigherSupportedQualityFor);
        if (profiles != null) {
            return profiles;
        }
        throw new java.lang.AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    public androidx.camera.video.Quality findNearestHigherSupportedQualityFor(android.util.Size size) {
        androidx.camera.video.Quality quality = (androidx.camera.video.Quality) androidx.camera.core.internal.utils.SizeUtil.findNearestHigherFor(size, this.getHighSpeedVideoFpsRangesFor);
        return quality != null ? quality : androidx.camera.video.Quality.getHighSpeedVideoFpsRanges;
    }

    public static boolean containsSupportedQuality(androidx.camera.core.impl.EncoderProfilesProvider encoderProfilesProvider, int i) {
        return !new androidx.camera.video.CapabilitiesByQuality(encoderProfilesProvider, i).getSupportedQualities().isEmpty();
    }

    public androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy getProfiles(androidx.camera.video.Quality quality) {
        androidx.core.util.Preconditions.checkArgument(androidx.camera.video.Quality.getHighSpeedVideoFpsRangesFor(quality), "Unknown quality: ".concat(java.lang.String.valueOf(quality)));
        if (quality == androidx.camera.video.Quality.HIGHEST) {
            return this.getHighSpeedVideoSizes;
        }
        if (quality == androidx.camera.video.Quality.LOWEST) {
            return this.getHighSpeedVideoFpsRanges;
        }
        return this.Camera2StreamConfigurationMap.get(quality);
    }

    public boolean isQualitySupported(androidx.camera.video.Quality quality) {
        androidx.core.util.Preconditions.checkArgument(androidx.camera.video.Quality.getHighSpeedVideoFpsRangesFor(quality), "Unknown quality: ".concat(java.lang.String.valueOf(quality)));
        return getProfiles(quality) != null;
    }
}
