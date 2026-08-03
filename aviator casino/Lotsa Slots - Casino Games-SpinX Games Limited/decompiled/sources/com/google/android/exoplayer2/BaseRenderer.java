package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public abstract class BaseRenderer implements com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities {
    private com.google.android.exoplayer2.RendererConfiguration configuration;
    private int index;
    private long lastResetPositionUs;
    private com.google.android.exoplayer2.analytics.PlayerId playerId;
    private int state;
    private com.google.android.exoplayer2.source.SampleStream stream;
    private com.google.android.exoplayer2.Format[] streamFormats;
    private boolean streamIsFinal;
    private long streamOffsetUs;
    private boolean throwRendererExceptionIsExecuting;
    private final int trackType;
    private final com.google.android.exoplayer2.FormatHolder formatHolder = new com.google.android.exoplayer2.FormatHolder();
    private long readingPositionUs = Long.MIN_VALUE;

    @Override // com.google.android.exoplayer2.Renderer
    public final com.google.android.exoplayer2.RendererCapabilities getCapabilities() {
        return this;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public com.google.android.exoplayer2.util.MediaClock getMediaClock() {
        return null;
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i, java.lang.Object obj) throws com.google.android.exoplayer2.ExoPlaybackException {
    }

    protected void onDisabled() {
    }

    protected void onEnabled(boolean z, boolean z2) throws com.google.android.exoplayer2.ExoPlaybackException {
    }

    protected void onPositionReset(long j, boolean z) throws com.google.android.exoplayer2.ExoPlaybackException {
    }

    protected void onReset() {
    }

    protected void onStarted() throws com.google.android.exoplayer2.ExoPlaybackException {
    }

    protected void onStopped() {
    }

    protected void onStreamChanged(com.google.android.exoplayer2.Format[] formatArr, long j, long j2) throws com.google.android.exoplayer2.ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public /* synthetic */ void setPlaybackSpeed(float f, float f2) {
        com.google.android.exoplayer2.Renderer.CC.$default$setPlaybackSpeed(this, f, f2);
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() throws com.google.android.exoplayer2.ExoPlaybackException {
        return 0;
    }

    public BaseRenderer(int i) {
        this.trackType = i;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final int getTrackType() {
        return this.trackType;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void init(int i, com.google.android.exoplayer2.analytics.PlayerId playerId) {
        this.index = i;
        this.playerId = playerId;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final int getState() {
        return this.state;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void enable(com.google.android.exoplayer2.RendererConfiguration rendererConfiguration, com.google.android.exoplayer2.Format[] formatArr, com.google.android.exoplayer2.source.SampleStream sampleStream, long j, boolean z, boolean z2, long j2, long j3) throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.util.Assertions.checkState(this.state == 0);
        this.configuration = rendererConfiguration;
        this.state = 1;
        onEnabled(z, z2);
        replaceStream(formatArr, sampleStream, j2, j3);
        resetPosition(j, z);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void start() throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.util.Assertions.checkState(this.state == 1);
        this.state = 2;
        onStarted();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void replaceStream(com.google.android.exoplayer2.Format[] formatArr, com.google.android.exoplayer2.source.SampleStream sampleStream, long j, long j2) throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.streamIsFinal);
        this.stream = sampleStream;
        if (this.readingPositionUs == Long.MIN_VALUE) {
            this.readingPositionUs = j;
        }
        this.streamFormats = formatArr;
        this.streamOffsetUs = j2;
        onStreamChanged(formatArr, j, j2);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final com.google.android.exoplayer2.source.SampleStream getStream() {
        return this.stream;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean hasReadStreamToEnd() {
        return this.readingPositionUs == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final long getReadingPositionUs() {
        return this.readingPositionUs;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void setCurrentStreamFinal() {
        this.streamIsFinal = true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void maybeThrowStreamError() throws java.io.IOException {
        ((com.google.android.exoplayer2.source.SampleStream) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.stream)).maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void resetPosition(long j) throws com.google.android.exoplayer2.ExoPlaybackException {
        resetPosition(j, false);
    }

    private void resetPosition(long j, boolean z) throws com.google.android.exoplayer2.ExoPlaybackException {
        this.streamIsFinal = false;
        this.lastResetPositionUs = j;
        this.readingPositionUs = j;
        onPositionReset(j, z);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void stop() {
        com.google.android.exoplayer2.util.Assertions.checkState(this.state == 2);
        this.state = 1;
        onStopped();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void disable() {
        com.google.android.exoplayer2.util.Assertions.checkState(this.state == 1);
        this.formatHolder.clear();
        this.state = 0;
        this.stream = null;
        this.streamFormats = null;
        this.streamIsFinal = false;
        onDisabled();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void reset() {
        com.google.android.exoplayer2.util.Assertions.checkState(this.state == 0);
        this.formatHolder.clear();
        onReset();
    }

    protected final long getLastResetPositionUs() {
        return this.lastResetPositionUs;
    }

    protected final com.google.android.exoplayer2.FormatHolder getFormatHolder() {
        this.formatHolder.clear();
        return this.formatHolder;
    }

    protected final com.google.android.exoplayer2.Format[] getStreamFormats() {
        return (com.google.android.exoplayer2.Format[]) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.streamFormats);
    }

    protected final com.google.android.exoplayer2.RendererConfiguration getConfiguration() {
        return (com.google.android.exoplayer2.RendererConfiguration) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.configuration);
    }

    protected final int getIndex() {
        return this.index;
    }

    protected final com.google.android.exoplayer2.analytics.PlayerId getPlayerId() {
        return (com.google.android.exoplayer2.analytics.PlayerId) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.playerId);
    }

    protected final com.google.android.exoplayer2.ExoPlaybackException createRendererException(java.lang.Throwable th, com.google.android.exoplayer2.Format format, int i) {
        return createRendererException(th, format, false, i);
    }

    protected final com.google.android.exoplayer2.ExoPlaybackException createRendererException(java.lang.Throwable th, com.google.android.exoplayer2.Format format, boolean z, int i) {
        int i2;
        if (format != null && !this.throwRendererExceptionIsExecuting) {
            this.throwRendererExceptionIsExecuting = true;
            try {
                int formatSupport = com.google.android.exoplayer2.RendererCapabilities.CC.getFormatSupport(supportsFormat(format));
                this.throwRendererExceptionIsExecuting = false;
                i2 = formatSupport;
            } catch (com.google.android.exoplayer2.ExoPlaybackException unused) {
                this.throwRendererExceptionIsExecuting = false;
            } catch (java.lang.Throwable th2) {
                this.throwRendererExceptionIsExecuting = false;
                throw th2;
            }
            return com.google.android.exoplayer2.ExoPlaybackException.createForRenderer(th, getName(), getIndex(), format, i2, z, i);
        }
        i2 = 4;
        return com.google.android.exoplayer2.ExoPlaybackException.createForRenderer(th, getName(), getIndex(), format, i2, z, i);
    }

    protected final int readSource(com.google.android.exoplayer2.FormatHolder formatHolder, com.google.android.exoplayer2.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
        int readData = ((com.google.android.exoplayer2.source.SampleStream) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.stream)).readData(formatHolder, decoderInputBuffer, i);
        if (readData == -4) {
            if (decoderInputBuffer.isEndOfStream()) {
                this.readingPositionUs = Long.MIN_VALUE;
                return this.streamIsFinal ? -4 : -3;
            }
            decoderInputBuffer.timeUs += this.streamOffsetUs;
            this.readingPositionUs = java.lang.Math.max(this.readingPositionUs, decoderInputBuffer.timeUs);
        } else if (readData == -5) {
            com.google.android.exoplayer2.Format format = (com.google.android.exoplayer2.Format) com.google.android.exoplayer2.util.Assertions.checkNotNull(formatHolder.format);
            if (format.subsampleOffsetUs != Long.MAX_VALUE) {
                formatHolder.format = format.buildUpon().setSubsampleOffsetUs(format.subsampleOffsetUs + this.streamOffsetUs).build();
            }
        }
        return readData;
    }

    protected int skipSource(long j) {
        return ((com.google.android.exoplayer2.source.SampleStream) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.stream)).skipData(j - this.streamOffsetUs);
    }

    protected final boolean isSourceReady() {
        return hasReadStreamToEnd() ? this.streamIsFinal : ((com.google.android.exoplayer2.source.SampleStream) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.stream)).isReady();
    }
}
