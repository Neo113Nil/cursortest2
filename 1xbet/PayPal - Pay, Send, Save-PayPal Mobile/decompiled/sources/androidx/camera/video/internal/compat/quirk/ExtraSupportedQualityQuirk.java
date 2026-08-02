package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class ExtraSupportedQualityQuirk implements androidx.camera.core.impl.Quirk {
    static boolean getHighSpeedVideoFpsRanges() {
        return "motorola".equalsIgnoreCase(android.os.Build.BRAND) && "moto c".equalsIgnoreCase(android.os.Build.MODEL);
    }

    public java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> getExtraEncoderProfiles(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.impl.EncoderProfilesProvider encoderProfilesProvider, androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder finder) {
        androidx.camera.core.impl.EncoderProfilesProxy all;
        androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy firstVideoProfile;
        android.util.Range<java.lang.Integer> create;
        if (!"motorola".equalsIgnoreCase(android.os.Build.BRAND) || !"moto c".equalsIgnoreCase(android.os.Build.MODEL)) {
            return java.util.Collections.emptyMap();
        }
        if (!"1".equals(cameraInfoInternal.getCameraId()) || encoderProfilesProvider.hasProfile(4) || (firstVideoProfile = androidx.camera.video.internal.utils.EncoderProfilesUtil.getFirstVideoProfile((all = encoderProfilesProvider.getAll(1)))) == null) {
            return null;
        }
        androidx.camera.video.internal.encoder.VideoEncoderInfo find = finder.find(firstVideoProfile.getMediaType());
        if (find != null) {
            create = find.getSupportedBitrateRange();
        } else {
            create = android.util.Range.create(0, Integer.MAX_VALUE);
        }
        androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy create2 = androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(all.getDefaultDurationSeconds(), all.getRecommendedFileFormat(), all.getAudioProfiles(), java.util.Collections.singletonList(androidx.camera.video.internal.utils.EncoderProfilesUtil.deriveVideoProfile(firstVideoProfile, androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_480P, create)));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(4, create2);
        if (androidx.camera.core.internal.utils.SizeUtil.getArea(androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_480P) > androidx.camera.core.internal.utils.SizeUtil.getArea(firstVideoProfile.getResolution())) {
            hashMap.put(1, create2);
        }
        return hashMap;
    }
}
