package com.google.android.exoplayer2.trackselection;

/* loaded from: classes3.dex */
public final class TrackSelectorResult {
    public final java.lang.Object info;
    public final int length;
    public final com.google.android.exoplayer2.RendererConfiguration[] rendererConfigurations;
    public final com.google.android.exoplayer2.trackselection.ExoTrackSelection[] selections;
    public final com.google.android.exoplayer2.Tracks tracks;

    @java.lang.Deprecated
    public TrackSelectorResult(com.google.android.exoplayer2.RendererConfiguration[] rendererConfigurationArr, com.google.android.exoplayer2.trackselection.ExoTrackSelection[] exoTrackSelectionArr, java.lang.Object obj) {
        this(rendererConfigurationArr, exoTrackSelectionArr, com.google.android.exoplayer2.Tracks.EMPTY, obj);
    }

    public TrackSelectorResult(com.google.android.exoplayer2.RendererConfiguration[] rendererConfigurationArr, com.google.android.exoplayer2.trackselection.ExoTrackSelection[] exoTrackSelectionArr, com.google.android.exoplayer2.Tracks tracks, java.lang.Object obj) {
        this.rendererConfigurations = rendererConfigurationArr;
        this.selections = (com.google.android.exoplayer2.trackselection.ExoTrackSelection[]) exoTrackSelectionArr.clone();
        this.tracks = tracks;
        this.info = obj;
        this.length = rendererConfigurationArr.length;
    }

    public boolean isRendererEnabled(int i) {
        return this.rendererConfigurations[i] != null;
    }

    public boolean isEquivalent(com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult) {
        if (trackSelectorResult == null || trackSelectorResult.selections.length != this.selections.length) {
            return false;
        }
        for (int i = 0; i < this.selections.length; i++) {
            if (!isEquivalent(trackSelectorResult, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEquivalent(com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult, int i) {
        return trackSelectorResult != null && com.google.android.exoplayer2.util.Util.areEqual(this.rendererConfigurations[i], trackSelectorResult.rendererConfigurations[i]) && com.google.android.exoplayer2.util.Util.areEqual(this.selections[i], trackSelectorResult.selections[i]);
    }
}
