package com.google.android.exoplayer2.trackselection;

/* loaded from: classes3.dex */
public final class TrackSelectionUtil {

    public interface AdaptiveTrackSelectionFactory {
        com.google.android.exoplayer2.trackselection.ExoTrackSelection createAdaptiveTrackSelection(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition definition);
    }

    private TrackSelectionUtil() {
    }

    public static com.google.android.exoplayer2.trackselection.ExoTrackSelection[] createTrackSelectionsForDefinitions(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] definitionArr, com.google.android.exoplayer2.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory adaptiveTrackSelectionFactory) {
        com.google.android.exoplayer2.trackselection.ExoTrackSelection[] exoTrackSelectionArr = new com.google.android.exoplayer2.trackselection.ExoTrackSelection[definitionArr.length];
        boolean z = false;
        for (int i = 0; i < definitionArr.length; i++) {
            com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition definition = definitionArr[i];
            if (definition != null) {
                if (definition.tracks.length > 1 && !z) {
                    exoTrackSelectionArr[i] = adaptiveTrackSelectionFactory.createAdaptiveTrackSelection(definition);
                    z = true;
                } else {
                    exoTrackSelectionArr[i] = new com.google.android.exoplayer2.trackselection.FixedTrackSelection(definition.group, definition.tracks[0], definition.type);
                }
            }
        }
        return exoTrackSelectionArr;
    }

    public static com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters updateParametersWithOverride(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters, int i, com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray, boolean z, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride selectionOverride) {
        com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder rendererDisabled = parameters.buildUpon().clearSelectionOverrides(i).setRendererDisabled(i, z);
        if (selectionOverride != null) {
            rendererDisabled.setSelectionOverride(i, trackGroupArray, selectionOverride);
        }
        return rendererDisabled.build();
    }

    public static com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(com.google.android.exoplayer2.trackselection.ExoTrackSelection exoTrackSelection) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int length = exoTrackSelection.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (exoTrackSelection.isBlacklisted(i2, elapsedRealtime)) {
                i++;
            }
        }
        return new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.FallbackOptions(1, 0, length, i);
    }

    public static com.google.android.exoplayer2.Tracks buildTracks(com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, com.google.android.exoplayer2.trackselection.TrackSelection[] trackSelectionArr) {
        java.util.List[] listArr = new java.util.List[trackSelectionArr.length];
        for (int i = 0; i < trackSelectionArr.length; i++) {
            com.google.android.exoplayer2.trackselection.TrackSelection trackSelection = trackSelectionArr[i];
            listArr[i] = trackSelection != null ? com.google.common.collect.ImmutableList.of(trackSelection) : com.google.common.collect.ImmutableList.of();
        }
        return buildTracks(mappedTrackInfo, (java.util.List<? extends com.google.android.exoplayer2.trackselection.TrackSelection>[]) listArr);
    }

    public static com.google.android.exoplayer2.Tracks buildTracks(com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, java.util.List<? extends com.google.android.exoplayer2.trackselection.TrackSelection>[] listArr) {
        boolean z;
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        for (int i = 0; i < mappedTrackInfo.getRendererCount(); i++) {
            com.google.android.exoplayer2.source.TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i);
            java.util.List<? extends com.google.android.exoplayer2.trackselection.TrackSelection> list = listArr[i];
            for (int i2 = 0; i2 < trackGroups.length; i2++) {
                com.google.android.exoplayer2.source.TrackGroup trackGroup = trackGroups.get(i2);
                boolean z2 = mappedTrackInfo.getAdaptiveSupport(i, i2, false) != 0;
                int[] iArr = new int[trackGroup.length];
                boolean[] zArr = new boolean[trackGroup.length];
                for (int i3 = 0; i3 < trackGroup.length; i3++) {
                    iArr[i3] = mappedTrackInfo.getTrackSupport(i, i2, i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= list.size()) {
                            z = false;
                            break;
                        }
                        com.google.android.exoplayer2.trackselection.TrackSelection trackSelection = list.get(i4);
                        if (trackSelection.getTrackGroup().equals(trackGroup) && trackSelection.indexOf(i3) != -1) {
                            z = true;
                            break;
                        }
                        i4++;
                    }
                    zArr[i3] = z;
                }
                builder.add((com.google.common.collect.ImmutableList.Builder) new com.google.android.exoplayer2.Tracks.Group(trackGroup, z2, iArr, zArr));
            }
        }
        com.google.android.exoplayer2.source.TrackGroupArray unmappedTrackGroups = mappedTrackInfo.getUnmappedTrackGroups();
        for (int i5 = 0; i5 < unmappedTrackGroups.length; i5++) {
            com.google.android.exoplayer2.source.TrackGroup trackGroup2 = unmappedTrackGroups.get(i5);
            int[] iArr2 = new int[trackGroup2.length];
            java.util.Arrays.fill(iArr2, 0);
            builder.add((com.google.common.collect.ImmutableList.Builder) new com.google.android.exoplayer2.Tracks.Group(trackGroup2, false, iArr2, new boolean[trackGroup2.length]));
        }
        return new com.google.android.exoplayer2.Tracks(builder.build());
    }
}
