package androidx.camera.video.internal;

/* loaded from: classes6.dex */
public class QualityExploredEncoderProfilesProvider implements androidx.camera.core.impl.EncoderProfilesProvider {
    private final androidx.camera.core.impl.EncoderProfilesProvider Camera2StreamConfigurationMap;
    private final java.util.Set<androidx.camera.core.DynamicRange> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Set<android.util.Size> getHighSpeedVideoSizes;
    private final java.util.Set<androidx.camera.video.Quality> getHighSpeedVideoSizesFor;
    private final androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder getOutputFormats;
    private final java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
    private final java.util.Map<androidx.camera.core.DynamicRange, androidx.camera.video.CapabilitiesByQuality> getHighSpeedVideoFpsRanges = new java.util.HashMap();

    public QualityExploredEncoderProfilesProvider(androidx.camera.core.impl.EncoderProfilesProvider encoderProfilesProvider, java.util.Collection<androidx.camera.video.Quality> collection, java.util.Collection<androidx.camera.core.DynamicRange> collection2, java.util.Collection<android.util.Size> collection3, androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder finder) {
        for (androidx.camera.core.DynamicRange dynamicRange : collection2) {
            if (!dynamicRange.isFullySpecified()) {
                throw new java.lang.IllegalArgumentException("Contains non-fully specified DynamicRange: ".concat(java.lang.String.valueOf(dynamicRange)));
            }
        }
        this.Camera2StreamConfigurationMap = encoderProfilesProvider;
        this.getHighSpeedVideoSizesFor = new java.util.HashSet(collection);
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet(collection2);
        this.getHighSpeedVideoSizes = new java.util.HashSet(collection3);
        this.getOutputFormats = finder;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i) {
        return getHighSpeedVideoFpsRangesFor(i) != null;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public androidx.camera.core.impl.EncoderProfilesProxy getAll(int i) {
        return getHighSpeedVideoFpsRangesFor(i);
    }

    private androidx.camera.core.impl.EncoderProfilesProxy getHighSpeedVideoFpsRangesFor(int i) {
        androidx.camera.video.Quality.ConstantQuality constantQuality;
        androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy immutableEncoderProfilesProxy;
        int defaultDurationSeconds;
        int recommendedFileFormat;
        androidx.camera.video.CapabilitiesByQuality capabilitiesByQuality;
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(java.lang.Integer.valueOf(i))) {
            return this.getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(i));
        }
        androidx.camera.core.impl.EncoderProfilesProxy all = this.Camera2StreamConfigurationMap.getAll(i);
        java.util.Iterator<androidx.camera.video.Quality> it = this.getHighSpeedVideoSizesFor.iterator();
        while (true) {
            if (!it.hasNext()) {
                constantQuality = null;
                break;
            }
            constantQuality = (androidx.camera.video.Quality.ConstantQuality) it.next();
            if (constantQuality.getQualityValue(1) == i) {
                break;
            }
        }
        if (constantQuality != null) {
            if (all != null) {
                java.util.Iterator<androidx.camera.core.DynamicRange> it2 = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
                while (it2.hasNext()) {
                    if (!getHighResolutionOutputSizeshNQ4ISI(all, it2.next())) {
                    }
                }
            }
            androidx.core.util.Preconditions.checkArgument(this.getHighSpeedVideoSizesFor.contains(constantQuality));
            androidx.camera.core.impl.EncoderProfilesProxy all2 = this.Camera2StreamConfigurationMap.getAll(constantQuality.getQualityValue(1));
            java.util.Iterator<android.util.Size> it3 = constantQuality.getTypicalSizes().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    immutableEncoderProfilesProxy = null;
                    break;
                }
                android.util.Size next = it3.next();
                if (this.getHighSpeedVideoSizes.contains(next)) {
                    java.util.TreeMap treeMap = new java.util.TreeMap(new androidx.camera.core.impl.utils.CompareSizesByArea());
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (androidx.camera.core.DynamicRange dynamicRange : this.getHighResolutionOutputSizeshNQ4ISI) {
                        if (!getHighResolutionOutputSizeshNQ4ISI(all2, dynamicRange)) {
                            if (this.getHighSpeedVideoFpsRanges.containsKey(dynamicRange)) {
                                capabilitiesByQuality = (androidx.camera.video.CapabilitiesByQuality) java.util.Objects.requireNonNull(this.getHighSpeedVideoFpsRanges.get(dynamicRange));
                            } else {
                                androidx.camera.video.CapabilitiesByQuality capabilitiesByQuality2 = new androidx.camera.video.CapabilitiesByQuality(new androidx.camera.video.internal.DynamicRangeMatchedEncoderProfilesProvider(this.Camera2StreamConfigurationMap, dynamicRange), 1);
                                this.getHighSpeedVideoFpsRanges.put(dynamicRange, capabilitiesByQuality2);
                                capabilitiesByQuality = capabilitiesByQuality2;
                            }
                            androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy findNearestHigherSupportedEncoderProfilesFor = capabilitiesByQuality.findNearestHigherSupportedEncoderProfilesFor(next);
                            if (findNearestHigherSupportedEncoderProfilesFor != null) {
                                androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy defaultVideoProfile = findNearestHigherSupportedEncoderProfilesFor.getDefaultVideoProfile();
                                androidx.camera.video.internal.encoder.VideoEncoderInfo find = this.getOutputFormats.find(defaultVideoProfile.getMediaType());
                                if (find != null && find.isSizeSupportedAllowSwapping(next.getWidth(), next.getHeight())) {
                                    treeMap.put(defaultVideoProfile.getResolution(), findNearestHigherSupportedEncoderProfilesFor);
                                    arrayList.add(androidx.camera.video.internal.utils.EncoderProfilesUtil.deriveVideoProfile(defaultVideoProfile, next, find.getSupportedBitrateRange()));
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        androidx.camera.core.impl.EncoderProfilesProxy encoderProfilesProxy = (androidx.camera.core.impl.EncoderProfilesProxy) java.util.Objects.requireNonNull((androidx.camera.core.impl.EncoderProfilesProxy) androidx.camera.core.internal.utils.SizeUtil.findNearestHigherFor(next, treeMap));
                        immutableEncoderProfilesProxy = androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(encoderProfilesProxy.getDefaultDurationSeconds(), encoderProfilesProxy.getRecommendedFileFormat(), encoderProfilesProxy.getAudioProfiles(), arrayList);
                        break;
                    }
                }
            }
            if (all == null && immutableEncoderProfilesProxy == null) {
                all = null;
            } else {
                if (all != null) {
                    defaultDurationSeconds = all.getDefaultDurationSeconds();
                } else {
                    defaultDurationSeconds = immutableEncoderProfilesProxy.getDefaultDurationSeconds();
                }
                if (all != null) {
                    recommendedFileFormat = all.getRecommendedFileFormat();
                } else {
                    recommendedFileFormat = immutableEncoderProfilesProxy.getRecommendedFileFormat();
                }
                java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> audioProfiles = all != null ? all.getAudioProfiles() : immutableEncoderProfilesProxy.getAudioProfiles();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (all != null) {
                    arrayList2.addAll(all.getVideoProfiles());
                }
                if (immutableEncoderProfilesProxy != null) {
                    arrayList2.addAll(immutableEncoderProfilesProxy.getVideoProfiles());
                }
                all = androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(defaultDurationSeconds, recommendedFileFormat, audioProfiles, arrayList2);
            }
        }
        this.getHighSpeedVideoFpsRangesFor.put(java.lang.Integer.valueOf(i), all);
        return all;
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.impl.EncoderProfilesProxy encoderProfilesProxy, androidx.camera.core.DynamicRange dynamicRange) {
        if (encoderProfilesProxy == null) {
            return false;
        }
        java.util.Iterator<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> it = encoderProfilesProxy.getVideoProfiles().iterator();
        while (it.hasNext()) {
            if (androidx.camera.video.internal.utils.DynamicRangeUtil.isHdrSettingsMatched(it.next(), dynamicRange)) {
                return true;
            }
        }
        return false;
    }
}
