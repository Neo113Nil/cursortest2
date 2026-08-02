package androidx.camera.video.internal;

/* loaded from: classes6.dex */
public class DynamicRangeMatchedEncoderProfilesProvider implements androidx.camera.core.impl.EncoderProfilesProvider {
    private final androidx.camera.core.DynamicRange getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.impl.EncoderProfilesProvider getHighSpeedVideoFpsRangesFor;
    private final java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> getHighSpeedVideoSizes = new java.util.HashMap();

    public DynamicRangeMatchedEncoderProfilesProvider(androidx.camera.core.impl.EncoderProfilesProvider encoderProfilesProvider, androidx.camera.core.DynamicRange dynamicRange) {
        this.getHighSpeedVideoFpsRangesFor = encoderProfilesProvider;
        this.getHighSpeedVideoFpsRanges = dynamicRange;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i) {
        return this.getHighSpeedVideoFpsRangesFor.hasProfile(i) && Camera2StreamConfigurationMap(i) != null;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public androidx.camera.core.impl.EncoderProfilesProxy getAll(int i) {
        return Camera2StreamConfigurationMap(i);
    }

    private androidx.camera.core.impl.EncoderProfilesProxy Camera2StreamConfigurationMap(int i) {
        if (this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(i))) {
            return this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i));
        }
        androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy immutableEncoderProfilesProxy = null;
        if (this.getHighSpeedVideoFpsRangesFor.hasProfile(i)) {
            androidx.camera.core.impl.EncoderProfilesProxy all = this.getHighSpeedVideoFpsRangesFor.getAll(i);
            androidx.camera.core.DynamicRange dynamicRange = this.getHighSpeedVideoFpsRanges;
            if (all != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : all.getVideoProfiles()) {
                    if (androidx.camera.video.internal.utils.DynamicRangeUtil.isHdrSettingsMatched(videoProfileProxy, dynamicRange)) {
                        arrayList.add(videoProfileProxy);
                    }
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
