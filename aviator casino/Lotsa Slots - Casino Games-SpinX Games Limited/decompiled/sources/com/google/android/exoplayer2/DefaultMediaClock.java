package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
final class DefaultMediaClock implements com.google.android.exoplayer2.util.MediaClock {
    private boolean isUsingStandaloneClock = true;
    private final com.google.android.exoplayer2.DefaultMediaClock.PlaybackParametersListener listener;
    private com.google.android.exoplayer2.util.MediaClock rendererClock;
    private com.google.android.exoplayer2.Renderer rendererClockSource;
    private final com.google.android.exoplayer2.util.StandaloneMediaClock standaloneClock;
    private boolean standaloneClockIsStarted;

    public interface PlaybackParametersListener {
        void onPlaybackParametersChanged(com.google.android.exoplayer2.PlaybackParameters playbackParameters);
    }

    public DefaultMediaClock(com.google.android.exoplayer2.DefaultMediaClock.PlaybackParametersListener playbackParametersListener, com.google.android.exoplayer2.util.Clock clock) {
        this.listener = playbackParametersListener;
        this.standaloneClock = new com.google.android.exoplayer2.util.StandaloneMediaClock(clock);
    }

    public void start() {
        this.standaloneClockIsStarted = true;
        this.standaloneClock.start();
    }

    public void stop() {
        this.standaloneClockIsStarted = false;
        this.standaloneClock.stop();
    }

    public void resetPosition(long j) {
        this.standaloneClock.resetPosition(j);
    }

    public void onRendererEnabled(com.google.android.exoplayer2.Renderer renderer) throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.util.MediaClock mediaClock;
        com.google.android.exoplayer2.util.MediaClock mediaClock2 = renderer.getMediaClock();
        if (mediaClock2 == null || mediaClock2 == (mediaClock = this.rendererClock)) {
            return;
        }
        if (mediaClock != null) {
            throw com.google.android.exoplayer2.ExoPlaybackException.createForUnexpected(new java.lang.IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.rendererClock = mediaClock2;
        this.rendererClockSource = renderer;
        mediaClock2.setPlaybackParameters(this.standaloneClock.getPlaybackParameters());
    }

    public void onRendererDisabled(com.google.android.exoplayer2.Renderer renderer) {
        if (renderer == this.rendererClockSource) {
            this.rendererClock = null;
            this.rendererClockSource = null;
            this.isUsingStandaloneClock = true;
        }
    }

    public long syncAndGetPositionUs(boolean z) {
        syncClocks(z);
        return getPositionUs();
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public long getPositionUs() {
        if (this.isUsingStandaloneClock) {
            return this.standaloneClock.getPositionUs();
        }
        return ((com.google.android.exoplayer2.util.MediaClock) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.rendererClock)).getPositionUs();
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters playbackParameters) {
        com.google.android.exoplayer2.util.MediaClock mediaClock = this.rendererClock;
        if (mediaClock != null) {
            mediaClock.setPlaybackParameters(playbackParameters);
            playbackParameters = this.rendererClock.getPlaybackParameters();
        }
        this.standaloneClock.setPlaybackParameters(playbackParameters);
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public com.google.android.exoplayer2.PlaybackParameters getPlaybackParameters() {
        com.google.android.exoplayer2.util.MediaClock mediaClock = this.rendererClock;
        if (mediaClock != null) {
            return mediaClock.getPlaybackParameters();
        }
        return this.standaloneClock.getPlaybackParameters();
    }

    private void syncClocks(boolean z) {
        if (shouldUseStandaloneClock(z)) {
            this.isUsingStandaloneClock = true;
            if (this.standaloneClockIsStarted) {
                this.standaloneClock.start();
                return;
            }
            return;
        }
        com.google.android.exoplayer2.util.MediaClock mediaClock = (com.google.android.exoplayer2.util.MediaClock) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.rendererClock);
        long positionUs = mediaClock.getPositionUs();
        if (this.isUsingStandaloneClock) {
            if (positionUs < this.standaloneClock.getPositionUs()) {
                this.standaloneClock.stop();
                return;
            } else {
                this.isUsingStandaloneClock = false;
                if (this.standaloneClockIsStarted) {
                    this.standaloneClock.start();
                }
            }
        }
        this.standaloneClock.resetPosition(positionUs);
        com.google.android.exoplayer2.PlaybackParameters playbackParameters = mediaClock.getPlaybackParameters();
        if (playbackParameters.equals(this.standaloneClock.getPlaybackParameters())) {
            return;
        }
        this.standaloneClock.setPlaybackParameters(playbackParameters);
        this.listener.onPlaybackParametersChanged(playbackParameters);
    }

    private boolean shouldUseStandaloneClock(boolean z) {
        com.google.android.exoplayer2.Renderer renderer = this.rendererClockSource;
        return renderer == null || renderer.isEnded() || (!this.rendererClockSource.isReady() && (z || this.rendererClockSource.hasReadStreamToEnd()));
    }
}
