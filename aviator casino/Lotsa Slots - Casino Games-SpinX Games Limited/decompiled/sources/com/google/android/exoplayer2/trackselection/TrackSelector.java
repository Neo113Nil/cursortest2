package com.google.android.exoplayer2.trackselection;

/* loaded from: classes3.dex */
public abstract class TrackSelector {
    private com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter;
    private com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener listener;

    public interface InvalidationListener {
        void onTrackSelectionsInvalidated();
    }

    public boolean isSetParametersSupported() {
        return false;
    }

    public abstract void onSelectionActivated(java.lang.Object obj);

    public abstract com.google.android.exoplayer2.trackselection.TrackSelectorResult selectTracks(com.google.android.exoplayer2.RendererCapabilities[] rendererCapabilitiesArr, com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.Timeline timeline) throws com.google.android.exoplayer2.ExoPlaybackException;

    public void setAudioAttributes(com.google.android.exoplayer2.audio.AudioAttributes audioAttributes) {
    }

    public void setParameters(com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
    }

    public void init(com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener invalidationListener, com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter) {
        this.listener = invalidationListener;
        this.bandwidthMeter = bandwidthMeter;
    }

    public void release() {
        this.listener = null;
        this.bandwidthMeter = null;
    }

    public com.google.android.exoplayer2.trackselection.TrackSelectionParameters getParameters() {
        return com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT;
    }

    protected final void invalidate() {
        com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener invalidationListener = this.listener;
        if (invalidationListener != null) {
            invalidationListener.onTrackSelectionsInvalidated();
        }
    }

    protected final com.google.android.exoplayer2.upstream.BandwidthMeter getBandwidthMeter() {
        return (com.google.android.exoplayer2.upstream.BandwidthMeter) com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.bandwidthMeter);
    }
}
