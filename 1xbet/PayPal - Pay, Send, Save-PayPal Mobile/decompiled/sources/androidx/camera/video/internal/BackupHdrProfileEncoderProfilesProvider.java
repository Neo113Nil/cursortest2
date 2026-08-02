package androidx.camera.video.internal;

/* loaded from: classes6.dex */
public class BackupHdrProfileEncoderProfilesProvider implements androidx.camera.core.impl.EncoderProfilesProvider {
    private final androidx.camera.core.impl.EncoderProfilesProvider getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder getHighSpeedVideoFpsRanges;
    private final java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> getHighSpeedVideoSizes = new java.util.HashMap();

    public BackupHdrProfileEncoderProfilesProvider(androidx.camera.core.impl.EncoderProfilesProvider encoderProfilesProvider, androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder finder) {
        this.getHighResolutionOutputSizeshNQ4ISI = encoderProfilesProvider;
        this.getHighSpeedVideoFpsRanges = finder;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI.hasProfile(i) && getHighResolutionOutputSizeshNQ4ISI(i) != null;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public androidx.camera.core.impl.EncoderProfilesProxy getAll(int i) {
        return getHighResolutionOutputSizeshNQ4ISI(i);
    }

    private androidx.camera.core.impl.EncoderProfilesProxy getHighResolutionOutputSizeshNQ4ISI(int i) {
        androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy videoProfileProxy;
        int doubleValue;
        androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy create;
        androidx.camera.video.internal.encoder.VideoEncoderInfo find;
        if (this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(i))) {
            return this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i));
        }
        androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy immutableEncoderProfilesProxy = null;
        if (this.getHighResolutionOutputSizeshNQ4ISI.hasProfile(i)) {
            androidx.camera.core.impl.EncoderProfilesProxy all = this.getHighResolutionOutputSizeshNQ4ISI.getAll(i);
            if (all != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(all.getVideoProfiles());
                java.util.Iterator<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> it = all.getVideoProfiles().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        videoProfileProxy = null;
                        break;
                    }
                    videoProfileProxy = it.next();
                    if (videoProfileProxy.getHdrFormat() == 0) {
                        break;
                    }
                }
                if (videoProfileProxy == null) {
                    create = null;
                } else {
                    int codec2 = videoProfileProxy.getCodec();
                    java.lang.String mediaType = videoProfileProxy.getMediaType();
                    int profile = videoProfileProxy.getProfile();
                    if (1 != videoProfileProxy.getHdrFormat()) {
                        codec2 = 5;
                        mediaType = androidx.camera.core.impl.EncoderProfilesProxy.getVideoCodecMimeType(5);
                        profile = 2;
                    }
                    int i2 = codec2;
                    java.lang.String str = mediaType;
                    int i3 = profile;
                    int bitrate = videoProfileProxy.getBitrate();
                    int bitDepth = videoProfileProxy.getBitDepth();
                    if (10 == bitDepth) {
                        doubleValue = bitrate;
                    } else {
                        doubleValue = (int) (bitrate * new android.util.Rational(10, bitDepth).doubleValue());
                        if (androidx.camera.core.Logger.isDebugEnabled("BackupHdrProfileEncoderProfilesProvider")) {
                            androidx.camera.core.Logger.d("BackupHdrProfileEncoderProfilesProvider", java.lang.String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", java.lang.Integer.valueOf(bitrate), 10, java.lang.Integer.valueOf(bitDepth), java.lang.Integer.valueOf(doubleValue)));
                        }
                    }
                    create = androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy.create(i2, str, doubleValue, videoProfileProxy.getFrameRate(), videoProfileProxy.getWidth(), videoProfileProxy.getHeight(), i3, 10, videoProfileProxy.getChromaSubsampling(), 1);
                }
                androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder finder = this.getHighSpeedVideoFpsRanges;
                if (create == null || (find = finder.find(create.getMediaType())) == null || !find.isSizeSupportedAllowSwapping(create.getWidth(), create.getHeight())) {
                    create = null;
                } else {
                    int bitrate2 = create.getBitrate();
                    int intValue = find.getSupportedBitrateRange().clamp(java.lang.Integer.valueOf(bitrate2)).intValue();
                    if (intValue != bitrate2) {
                        create = androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy.create(create.getCodec(), create.getMediaType(), intValue, create.getFrameRate(), create.getWidth(), create.getHeight(), create.getProfile(), create.getBitDepth(), create.getChromaSubsampling(), create.getHdrFormat());
                    }
                }
                if (create != null) {
                    arrayList.add(create);
                }
                if (!arrayList.isEmpty()) {
                    immutableEncoderProfilesProxy = androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(all.getDefaultDurationSeconds(), all.getRecommendedFileFormat(), all.getAudioProfiles(), arrayList);
                }
            }
            this.getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(i), immutableEncoderProfilesProxy);
        }
        return immutableEncoderProfilesProxy;
    }
}
