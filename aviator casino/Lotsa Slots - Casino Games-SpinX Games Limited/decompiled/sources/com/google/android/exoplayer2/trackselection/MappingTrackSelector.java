package com.google.android.exoplayer2.trackselection;

/* loaded from: classes3.dex */
public abstract class MappingTrackSelector extends com.google.android.exoplayer2.trackselection.TrackSelector {
    private com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo;

    protected abstract android.util.Pair<com.google.android.exoplayer2.RendererConfiguration[], com.google.android.exoplayer2.trackselection.ExoTrackSelection[]> selectTracks(com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.Timeline timeline) throws com.google.android.exoplayer2.ExoPlaybackException;

    public static final class MappedTrackInfo {
        public static final int RENDERER_SUPPORT_EXCEEDS_CAPABILITIES_TRACKS = 2;
        public static final int RENDERER_SUPPORT_NO_TRACKS = 0;
        public static final int RENDERER_SUPPORT_PLAYABLE_TRACKS = 3;
        public static final int RENDERER_SUPPORT_UNSUPPORTED_TRACKS = 1;
        private final int rendererCount;
        private final int[][][] rendererFormatSupports;
        private final int[] rendererMixedMimeTypeAdaptiveSupports;
        private final java.lang.String[] rendererNames;
        private final com.google.android.exoplayer2.source.TrackGroupArray[] rendererTrackGroups;
        private final int[] rendererTrackTypes;
        private final com.google.android.exoplayer2.source.TrackGroupArray unmappedTrackGroups;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface RendererSupport {
        }

        MappedTrackInfo(java.lang.String[] strArr, int[] iArr, com.google.android.exoplayer2.source.TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray) {
            this.rendererNames = strArr;
            this.rendererTrackTypes = iArr;
            this.rendererTrackGroups = trackGroupArrayArr;
            this.rendererFormatSupports = iArr3;
            this.rendererMixedMimeTypeAdaptiveSupports = iArr2;
            this.unmappedTrackGroups = trackGroupArray;
            this.rendererCount = iArr.length;
        }

        public int getRendererCount() {
            return this.rendererCount;
        }

        public java.lang.String getRendererName(int i) {
            return this.rendererNames[i];
        }

        public int getRendererType(int i) {
            return this.rendererTrackTypes[i];
        }

        public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups(int i) {
            return this.rendererTrackGroups[i];
        }

        public int getRendererSupport(int i) {
            int i2 = 0;
            for (int[] iArr : this.rendererFormatSupports[i]) {
                for (int i3 : iArr) {
                    int formatSupport = com.google.android.exoplayer2.RendererCapabilities.CC.getFormatSupport(i3);
                    int i4 = 1;
                    if (formatSupport != 0 && formatSupport != 1 && formatSupport != 2) {
                        if (formatSupport != 3) {
                            if (formatSupport == 4) {
                                return 3;
                            }
                            throw new java.lang.IllegalStateException();
                        }
                        i4 = 2;
                    }
                    i2 = java.lang.Math.max(i2, i4);
                }
            }
            return i2;
        }

        public int getTypeSupport(int i) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.rendererCount; i3++) {
                if (this.rendererTrackTypes[i3] == i) {
                    i2 = java.lang.Math.max(i2, getRendererSupport(i3));
                }
            }
            return i2;
        }

        public int getCapabilities(int i, int i2, int i3) {
            return this.rendererFormatSupports[i][i2][i3];
        }

        public int getTrackSupport(int i, int i2, int i3) {
            return com.google.android.exoplayer2.RendererCapabilities.CC.getFormatSupport(getCapabilities(i, i2, i3));
        }

        public int getAdaptiveSupport(int i, int i2, boolean z) {
            int i3 = this.rendererTrackGroups[i].get(i2).length;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int trackSupport = getTrackSupport(i, i2, i5);
                if (trackSupport == 4 || (z && trackSupport == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return getAdaptiveSupport(i, i2, java.util.Arrays.copyOf(iArr, i4));
        }

        public int getAdaptiveSupport(int i, int i2, int[] iArr) {
            int i3 = 0;
            java.lang.String str = null;
            boolean z = false;
            int i4 = 0;
            int i5 = 16;
            while (i3 < iArr.length) {
                java.lang.String str2 = this.rendererTrackGroups[i].get(i2).getFormat(iArr[i3]).sampleMimeType;
                int i6 = i4 + 1;
                if (i4 == 0) {
                    str = str2;
                } else {
                    z |= !com.google.android.exoplayer2.util.Util.areEqual(str, str2);
                }
                i5 = java.lang.Math.min(i5, com.google.android.exoplayer2.RendererCapabilities.CC.getAdaptiveSupport(this.rendererFormatSupports[i][i2][i3]));
                i3++;
                i4 = i6;
            }
            return z ? java.lang.Math.min(i5, this.rendererMixedMimeTypeAdaptiveSupports[i]) : i5;
        }

        public com.google.android.exoplayer2.source.TrackGroupArray getUnmappedTrackGroups() {
            return this.unmappedTrackGroups;
        }
    }

    public final com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo getCurrentMappedTrackInfo() {
        return this.currentMappedTrackInfo;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public final void onSelectionActivated(java.lang.Object obj) {
        this.currentMappedTrackInfo = (com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo) obj;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public final com.google.android.exoplayer2.trackselection.TrackSelectorResult selectTracks(com.google.android.exoplayer2.RendererCapabilities[] rendererCapabilitiesArr, com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.Timeline timeline) throws com.google.android.exoplayer2.ExoPlaybackException {
        int[] formatSupport;
        int[] iArr = new int[rendererCapabilitiesArr.length + 1];
        int length = rendererCapabilitiesArr.length + 1;
        com.google.android.exoplayer2.source.TrackGroup[][] trackGroupArr = new com.google.android.exoplayer2.source.TrackGroup[length][];
        int[][][] iArr2 = new int[rendererCapabilitiesArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            trackGroupArr[i] = new com.google.android.exoplayer2.source.TrackGroup[trackGroupArray.length];
            iArr2[i] = new int[trackGroupArray.length][];
        }
        int[] mixedMimeTypeAdaptationSupports = getMixedMimeTypeAdaptationSupports(rendererCapabilitiesArr);
        for (int i2 = 0; i2 < trackGroupArray.length; i2++) {
            com.google.android.exoplayer2.source.TrackGroup trackGroup = trackGroupArray.get(i2);
            int findRenderer = findRenderer(rendererCapabilitiesArr, trackGroup, iArr, trackGroup.type == 5);
            if (findRenderer == rendererCapabilitiesArr.length) {
                formatSupport = new int[trackGroup.length];
            } else {
                formatSupport = getFormatSupport(rendererCapabilitiesArr[findRenderer], trackGroup);
            }
            int i3 = iArr[findRenderer];
            trackGroupArr[findRenderer][i3] = trackGroup;
            iArr2[findRenderer][i3] = formatSupport;
            iArr[findRenderer] = i3 + 1;
        }
        com.google.android.exoplayer2.source.TrackGroupArray[] trackGroupArrayArr = new com.google.android.exoplayer2.source.TrackGroupArray[rendererCapabilitiesArr.length];
        java.lang.String[] strArr = new java.lang.String[rendererCapabilitiesArr.length];
        int[] iArr3 = new int[rendererCapabilitiesArr.length];
        for (int i4 = 0; i4 < rendererCapabilitiesArr.length; i4++) {
            int i5 = iArr[i4];
            trackGroupArrayArr[i4] = new com.google.android.exoplayer2.source.TrackGroupArray((com.google.android.exoplayer2.source.TrackGroup[]) com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(trackGroupArr[i4], i5));
            iArr2[i4] = (int[][]) com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(iArr2[i4], i5);
            strArr[i4] = rendererCapabilitiesArr[i4].getName();
            iArr3[i4] = rendererCapabilitiesArr[i4].getTrackType();
        }
        com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo = new com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo(strArr, iArr3, trackGroupArrayArr, mixedMimeTypeAdaptationSupports, iArr2, new com.google.android.exoplayer2.source.TrackGroupArray((com.google.android.exoplayer2.source.TrackGroup[]) com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(trackGroupArr[rendererCapabilitiesArr.length], iArr[rendererCapabilitiesArr.length])));
        android.util.Pair<com.google.android.exoplayer2.RendererConfiguration[], com.google.android.exoplayer2.trackselection.ExoTrackSelection[]> selectTracks = selectTracks(mappedTrackInfo, iArr2, mixedMimeTypeAdaptationSupports, mediaPeriodId, timeline);
        return new com.google.android.exoplayer2.trackselection.TrackSelectorResult((com.google.android.exoplayer2.RendererConfiguration[]) selectTracks.first, (com.google.android.exoplayer2.trackselection.ExoTrackSelection[]) selectTracks.second, com.google.android.exoplayer2.trackselection.TrackSelectionUtil.buildTracks(mappedTrackInfo, (com.google.android.exoplayer2.trackselection.TrackSelection[]) selectTracks.second), mappedTrackInfo);
    }

    private static int findRenderer(com.google.android.exoplayer2.RendererCapabilities[] rendererCapabilitiesArr, com.google.android.exoplayer2.source.TrackGroup trackGroup, int[] iArr, boolean z) throws com.google.android.exoplayer2.ExoPlaybackException {
        int length = rendererCapabilitiesArr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < rendererCapabilitiesArr.length; i2++) {
            com.google.android.exoplayer2.RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < trackGroup.length; i4++) {
                i3 = java.lang.Math.max(i3, com.google.android.exoplayer2.RendererCapabilities.CC.getFormatSupport(rendererCapabilities.supportsFormat(trackGroup.getFormat(i4))));
            }
            boolean z3 = iArr[i2] == 0;
            if (i3 > i || (i3 == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = i3;
            }
        }
        return length;
    }

    private static int[] getFormatSupport(com.google.android.exoplayer2.RendererCapabilities rendererCapabilities, com.google.android.exoplayer2.source.TrackGroup trackGroup) throws com.google.android.exoplayer2.ExoPlaybackException {
        int[] iArr = new int[trackGroup.length];
        for (int i = 0; i < trackGroup.length; i++) {
            iArr[i] = rendererCapabilities.supportsFormat(trackGroup.getFormat(i));
        }
        return iArr;
    }

    private static int[] getMixedMimeTypeAdaptationSupports(com.google.android.exoplayer2.RendererCapabilities[] rendererCapabilitiesArr) throws com.google.android.exoplayer2.ExoPlaybackException {
        int length = rendererCapabilitiesArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = rendererCapabilitiesArr[i].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }
}
