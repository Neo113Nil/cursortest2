package com.google.android.exoplayer2.mediacodec;

/* loaded from: classes3.dex */
public abstract class MediaCodecRenderer extends com.google.android.exoplayer2.BaseRenderer {
    private static final byte[] ADAPTATION_WORKAROUND_BUFFER = {0, 0, 1, 103, 66, -64, com.google.common.base.Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, com.google.common.base.Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, com.google.common.base.Ascii.CR, -50, 113, com.google.common.base.Ascii.CAN, -96, 0, 47, -65, com.google.common.base.Ascii.FS, 49, -61, 39, 93, 120};
    private static final int ADAPTATION_WORKAROUND_MODE_ALWAYS = 2;
    private static final int ADAPTATION_WORKAROUND_MODE_NEVER = 0;
    private static final int ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION = 1;
    private static final int ADAPTATION_WORKAROUND_SLICE_WIDTH_HEIGHT = 32;
    protected static final float CODEC_OPERATING_RATE_UNSET = -1.0f;
    private static final int DRAIN_ACTION_FLUSH = 1;
    private static final int DRAIN_ACTION_FLUSH_AND_UPDATE_DRM_SESSION = 2;
    private static final int DRAIN_ACTION_NONE = 0;
    private static final int DRAIN_ACTION_REINITIALIZE = 3;
    private static final int DRAIN_STATE_NONE = 0;
    private static final int DRAIN_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int DRAIN_STATE_WAIT_END_OF_STREAM = 2;
    private static final long MAX_CODEC_HOTSWAP_TIME_MS = 1000;
    private static final int MAX_PENDING_OUTPUT_STREAM_OFFSET_COUNT = 10;
    private static final int RECONFIGURATION_STATE_NONE = 0;
    private static final int RECONFIGURATION_STATE_QUEUE_PENDING = 2;
    private static final int RECONFIGURATION_STATE_WRITE_PENDING = 1;
    private static final java.lang.String TAG = "MediaCodecRenderer";
    private final float assumedMinimumCodecOperatingRate;
    private java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> availableCodecInfos;
    private final com.google.android.exoplayer2.decoder.DecoderInputBuffer buffer;
    private final com.google.android.exoplayer2.mediacodec.BatchBuffer bypassBatchBuffer;
    private boolean bypassDrainAndReinitialize;
    private boolean bypassEnabled;
    private final com.google.android.exoplayer2.decoder.DecoderInputBuffer bypassSampleBuffer;
    private boolean bypassSampleBufferPending;
    private com.google.android.exoplayer2.mediacodec.C2Mp3TimestampTracker c2Mp3TimestampTracker;
    private com.google.android.exoplayer2.mediacodec.MediaCodecAdapter codec;
    private int codecAdaptationWorkaroundMode;
    private final com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory codecAdapterFactory;
    private int codecDrainAction;
    private int codecDrainState;
    private com.google.android.exoplayer2.drm.DrmSession codecDrmSession;
    private boolean codecHasOutputMediaFormat;
    private long codecHotswapDeadlineMs;
    private com.google.android.exoplayer2.mediacodec.MediaCodecInfo codecInfo;
    private com.google.android.exoplayer2.Format codecInputFormat;
    private boolean codecNeedsAdaptationWorkaroundBuffer;
    private boolean codecNeedsDiscardToSpsWorkaround;
    private boolean codecNeedsEosBufferTimestampWorkaround;
    private boolean codecNeedsEosFlushWorkaround;
    private boolean codecNeedsEosOutputExceptionWorkaround;
    private boolean codecNeedsEosPropagation;
    private boolean codecNeedsFlushWorkaround;
    private boolean codecNeedsMonoChannelCountWorkaround;
    private boolean codecNeedsSosFlushWorkaround;
    private float codecOperatingRate;
    private android.media.MediaFormat codecOutputMediaFormat;
    private boolean codecOutputMediaFormatChanged;
    private boolean codecReceivedBuffers;
    private boolean codecReceivedEos;
    private int codecReconfigurationState;
    private boolean codecReconfigured;
    private float currentPlaybackSpeed;
    private final java.util.ArrayList<java.lang.Long> decodeOnlyPresentationTimestamps;
    protected com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters;
    private final boolean enableDecoderFallback;
    private final com.google.android.exoplayer2.util.TimedValueQueue<com.google.android.exoplayer2.Format> formatQueue;
    private com.google.android.exoplayer2.Format inputFormat;
    private int inputIndex;
    private boolean inputStreamEnded;
    private boolean isDecodeOnlyOutputBuffer;
    private boolean isLastOutputBuffer;
    private long largestQueuedPresentationTimeUs;
    private long lastBufferInStreamPresentationTimeUs;
    private final com.google.android.exoplayer2.mediacodec.MediaCodecSelector mediaCodecSelector;
    private android.media.MediaCrypto mediaCrypto;
    private boolean mediaCryptoRequiresSecureDecoder;
    private final com.google.android.exoplayer2.decoder.DecoderInputBuffer noDataBuffer;
    private java.nio.ByteBuffer outputBuffer;
    private final android.media.MediaCodec.BufferInfo outputBufferInfo;
    private com.google.android.exoplayer2.Format outputFormat;
    private int outputIndex;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    private long outputStreamStartPositionUs;
    private boolean pendingOutputEndOfStream;
    private int pendingOutputStreamOffsetCount;
    private final long[] pendingOutputStreamOffsetsUs;
    private final long[] pendingOutputStreamStartPositionsUs;
    private final long[] pendingOutputStreamSwitchTimesUs;
    private com.google.android.exoplayer2.ExoPlaybackException pendingPlaybackException;
    private com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException preferredDecoderInitializationException;
    private long renderTimeLimitMs;
    private boolean shouldSkipAdaptationWorkaroundOutputBuffer;
    private com.google.android.exoplayer2.drm.DrmSession sourceDrmSession;
    private float targetPlaybackSpeed;
    private boolean waitingForFirstSampleInFormat;

    protected boolean getCodecNeedsEosPropagation() {
        return false;
    }

    protected float getCodecOperatingRateV23(float f, com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.Format[] formatArr) {
        return -1.0f;
    }

    protected abstract java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> getDecoderInfos(com.google.android.exoplayer2.mediacodec.MediaCodecSelector mediaCodecSelector, com.google.android.exoplayer2.Format format, boolean z) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException;

    protected abstract com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration getMediaCodecConfiguration(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo, com.google.android.exoplayer2.Format format, android.media.MediaCrypto mediaCrypto, float f);

    protected void handleInputBufferSupplementalData(com.google.android.exoplayer2.decoder.DecoderInputBuffer decoderInputBuffer) throws com.google.android.exoplayer2.ExoPlaybackException {
    }

    protected void onCodecError(java.lang.Exception exc) {
    }

    protected void onCodecInitialized(java.lang.String str, com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration configuration, long j, long j2) {
    }

    protected void onCodecReleased(java.lang.String str) {
    }

    protected void onOutputFormatChanged(com.google.android.exoplayer2.Format format, android.media.MediaFormat mediaFormat) throws com.google.android.exoplayer2.ExoPlaybackException {
    }

    protected void onOutputStreamOffsetUsChanged(long j) {
    }

    protected void onProcessedStreamChange() {
    }

    protected void onQueueInputBuffer(com.google.android.exoplayer2.decoder.DecoderInputBuffer decoderInputBuffer) throws com.google.android.exoplayer2.ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onStarted() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onStopped() {
    }

    protected abstract boolean processOutputBuffer(long j, long j2, com.google.android.exoplayer2.mediacodec.MediaCodecAdapter mediaCodecAdapter, java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, com.google.android.exoplayer2.Format format) throws com.google.android.exoplayer2.ExoPlaybackException;

    protected void renderToEndOfStream() throws com.google.android.exoplayer2.ExoPlaybackException {
    }

    protected boolean shouldInitCodec(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return true;
    }

    protected boolean shouldReinitCodec() {
        return false;
    }

    protected boolean shouldUseBypass(com.google.android.exoplayer2.Format format) {
        return false;
    }

    protected abstract int supportsFormat(com.google.android.exoplayer2.mediacodec.MediaCodecSelector mediaCodecSelector, com.google.android.exoplayer2.Format format) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException;

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public static class DecoderInitializationException extends java.lang.Exception {
        private static final int CUSTOM_ERROR_CODE_BASE = -50000;
        private static final int DECODER_QUERY_ERROR = -49998;
        private static final int NO_SUITABLE_DECODER_ERROR = -49999;
        public final com.google.android.exoplayer2.mediacodec.MediaCodecInfo codecInfo;
        public final java.lang.String diagnosticInfo;
        public final com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException fallbackDecoderInitializationException;
        public final java.lang.String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(com.google.android.exoplayer2.Format format, java.lang.Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + format, th, format.sampleMimeType, z, null, buildCustomDiagnosticInfo(i), null);
        }

        public DecoderInitializationException(com.google.android.exoplayer2.Format format, java.lang.Throwable th, boolean z, com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo) {
            this("Decoder init failed: " + mediaCodecInfo.name + ", " + format, th, format.sampleMimeType, z, mediaCodecInfo, com.google.android.exoplayer2.util.Util.SDK_INT >= 21 ? getDiagnosticInfoV21(th) : null, null);
        }

        private DecoderInitializationException(java.lang.String str, java.lang.Throwable th, java.lang.String str2, boolean z, com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo, java.lang.String str3, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = mediaCodecInfo;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException copyWithFallbackException(com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException decoderInitializationException) {
            return new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, decoderInitializationException);
        }

        private static java.lang.String getDiagnosticInfoV21(java.lang.Throwable th) {
            if (th instanceof android.media.MediaCodec.CodecException) {
                return ((android.media.MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        private static java.lang.String buildCustomDiagnosticInfo(int i) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + java.lang.Math.abs(i);
        }
    }

    public MediaCodecRenderer(int i, com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory factory, com.google.android.exoplayer2.mediacodec.MediaCodecSelector mediaCodecSelector, boolean z, float f) {
        super(i);
        this.codecAdapterFactory = factory;
        this.mediaCodecSelector = (com.google.android.exoplayer2.mediacodec.MediaCodecSelector) com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaCodecSelector);
        this.enableDecoderFallback = z;
        this.assumedMinimumCodecOperatingRate = f;
        this.noDataBuffer = com.google.android.exoplayer2.decoder.DecoderInputBuffer.newNoDataInstance();
        this.buffer = new com.google.android.exoplayer2.decoder.DecoderInputBuffer(0);
        this.bypassSampleBuffer = new com.google.android.exoplayer2.decoder.DecoderInputBuffer(2);
        com.google.android.exoplayer2.mediacodec.BatchBuffer batchBuffer = new com.google.android.exoplayer2.mediacodec.BatchBuffer();
        this.bypassBatchBuffer = batchBuffer;
        this.formatQueue = new com.google.android.exoplayer2.util.TimedValueQueue<>();
        this.decodeOnlyPresentationTimestamps = new java.util.ArrayList<>();
        this.outputBufferInfo = new android.media.MediaCodec.BufferInfo();
        this.currentPlaybackSpeed = 1.0f;
        this.targetPlaybackSpeed = 1.0f;
        this.renderTimeLimitMs = -9223372036854775807L;
        this.pendingOutputStreamStartPositionsUs = new long[10];
        this.pendingOutputStreamOffsetsUs = new long[10];
        this.pendingOutputStreamSwitchTimesUs = new long[10];
        this.outputStreamStartPositionUs = -9223372036854775807L;
        setOutputStreamOffsetUs(-9223372036854775807L);
        batchBuffer.ensureSpaceForWrite(0);
        batchBuffer.data.order(java.nio.ByteOrder.nativeOrder());
        this.codecOperatingRate = -1.0f;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecReconfigurationState = 0;
        this.inputIndex = -1;
        this.outputIndex = -1;
        this.codecHotswapDeadlineMs = -9223372036854775807L;
        this.largestQueuedPresentationTimeUs = -9223372036854775807L;
        this.lastBufferInStreamPresentationTimeUs = -9223372036854775807L;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
    }

    public void setRenderTimeLimitMs(long j) {
        this.renderTimeLimitMs = j;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int supportsFormat(com.google.android.exoplayer2.Format format) throws com.google.android.exoplayer2.ExoPlaybackException {
        try {
            return supportsFormat(this.mediaCodecSelector, format);
        } catch (com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException e) {
            throw createRendererException(e, format, 4002);
        }
    }

    protected final void maybeInitCodecOrBypass() throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.Format format;
        if (this.codec != null || this.bypassEnabled || (format = this.inputFormat) == null) {
            return;
        }
        if (this.sourceDrmSession == null && shouldUseBypass(format)) {
            initBypass(this.inputFormat);
            return;
        }
        setCodecDrmSession(this.sourceDrmSession);
        java.lang.String str = this.inputFormat.sampleMimeType;
        com.google.android.exoplayer2.drm.DrmSession drmSession = this.codecDrmSession;
        if (drmSession != null) {
            if (this.mediaCrypto == null) {
                com.google.android.exoplayer2.drm.FrameworkCryptoConfig frameworkCryptoConfig = getFrameworkCryptoConfig(drmSession);
                if (frameworkCryptoConfig == null) {
                    if (this.codecDrmSession.getError() == null) {
                        return;
                    }
                } else {
                    try {
                        this.mediaCrypto = new android.media.MediaCrypto(frameworkCryptoConfig.uuid, frameworkCryptoConfig.sessionId);
                        this.mediaCryptoRequiresSecureDecoder = !frameworkCryptoConfig.forceAllowInsecureDecoderComponents && this.mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (android.media.MediaCryptoException e) {
                        throw createRendererException(e, this.inputFormat, 6006);
                    }
                }
            }
            if (com.google.android.exoplayer2.drm.FrameworkCryptoConfig.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC) {
                int state = this.codecDrmSession.getState();
                if (state == 1) {
                    com.google.android.exoplayer2.drm.DrmSession.DrmSessionException drmSessionException = (com.google.android.exoplayer2.drm.DrmSession.DrmSessionException) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.codecDrmSession.getError());
                    throw createRendererException(drmSessionException, this.inputFormat, drmSessionException.errorCode);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            maybeInitCodecWithFallback(this.mediaCrypto, this.mediaCryptoRequiresSecureDecoder);
        } catch (com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException e2) {
            throw createRendererException(e2, this.inputFormat, 4001);
        }
    }

    protected final void setPendingPlaybackException(com.google.android.exoplayer2.ExoPlaybackException exoPlaybackException) {
        this.pendingPlaybackException = exoPlaybackException;
    }

    protected final void updateOutputFormatForTime(long j) throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.Format pollFloor = this.formatQueue.pollFloor(j);
        if (pollFloor == null && this.codecOutputMediaFormatChanged) {
            pollFloor = this.formatQueue.pollFirst();
        }
        if (pollFloor != null) {
            this.outputFormat = pollFloor;
        } else if (!this.codecOutputMediaFormatChanged || this.outputFormat == null) {
            return;
        }
        onOutputFormatChanged(this.outputFormat, this.codecOutputMediaFormat);
        this.codecOutputMediaFormatChanged = false;
    }

    protected final com.google.android.exoplayer2.mediacodec.MediaCodecAdapter getCodec() {
        return this.codec;
    }

    protected final android.media.MediaFormat getCodecOutputMediaFormat() {
        return this.codecOutputMediaFormat;
    }

    protected final com.google.android.exoplayer2.mediacodec.MediaCodecInfo getCodecInfo() {
        return this.codecInfo;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onEnabled(boolean z, boolean z2) throws com.google.android.exoplayer2.ExoPlaybackException {
        this.decoderCounters = new com.google.android.exoplayer2.decoder.DecoderCounters();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onStreamChanged(com.google.android.exoplayer2.Format[] formatArr, long j, long j2) throws com.google.android.exoplayer2.ExoPlaybackException {
        if (this.outputStreamOffsetUs == -9223372036854775807L) {
            com.google.android.exoplayer2.util.Assertions.checkState(this.outputStreamStartPositionUs == -9223372036854775807L);
            this.outputStreamStartPositionUs = j;
            setOutputStreamOffsetUs(j2);
            return;
        }
        int i = this.pendingOutputStreamOffsetCount;
        if (i == this.pendingOutputStreamOffsetsUs.length) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Too many stream changes, so dropping offset: " + this.pendingOutputStreamOffsetsUs[this.pendingOutputStreamOffsetCount - 1]);
        } else {
            this.pendingOutputStreamOffsetCount = i + 1;
        }
        long[] jArr = this.pendingOutputStreamStartPositionsUs;
        int i2 = this.pendingOutputStreamOffsetCount;
        jArr[i2 - 1] = j;
        this.pendingOutputStreamOffsetsUs[i2 - 1] = j2;
        this.pendingOutputStreamSwitchTimesUs[i2 - 1] = this.largestQueuedPresentationTimeUs;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onPositionReset(long j, boolean z) throws com.google.android.exoplayer2.ExoPlaybackException {
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.pendingOutputEndOfStream = false;
        if (this.bypassEnabled) {
            this.bypassBatchBuffer.clear();
            this.bypassSampleBuffer.clear();
            this.bypassSampleBufferPending = false;
        } else {
            flushOrReinitializeCodec();
        }
        if (this.formatQueue.size() > 0) {
            this.waitingForFirstSampleInFormat = true;
        }
        this.formatQueue.clear();
        int i = this.pendingOutputStreamOffsetCount;
        if (i != 0) {
            setOutputStreamOffsetUs(this.pendingOutputStreamOffsetsUs[i - 1]);
            this.outputStreamStartPositionUs = this.pendingOutputStreamStartPositionsUs[this.pendingOutputStreamOffsetCount - 1];
            this.pendingOutputStreamOffsetCount = 0;
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public void setPlaybackSpeed(float f, float f2) throws com.google.android.exoplayer2.ExoPlaybackException {
        this.currentPlaybackSpeed = f;
        this.targetPlaybackSpeed = f2;
        updateCodecOperatingRate(this.codecInputFormat);
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onDisabled() {
        this.inputFormat = null;
        this.outputStreamStartPositionUs = -9223372036854775807L;
        setOutputStreamOffsetUs(-9223372036854775807L);
        this.pendingOutputStreamOffsetCount = 0;
        flushOrReleaseCodec();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onReset() {
        try {
            disableBypass();
            releaseCodec();
        } finally {
            setSourceDrmSession(null);
        }
    }

    private void disableBypass() {
        this.bypassDrainAndReinitialize = false;
        this.bypassBatchBuffer.clear();
        this.bypassSampleBuffer.clear();
        this.bypassSampleBufferPending = false;
        this.bypassEnabled = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void releaseCodec() {
        try {
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter mediaCodecAdapter = this.codec;
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.release();
                this.decoderCounters.decoderReleaseCount++;
                onCodecReleased(this.codecInfo.name);
            }
            this.codec = null;
            try {
                android.media.MediaCrypto mediaCrypto = this.mediaCrypto;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (java.lang.Throwable th) {
            this.codec = null;
            try {
                android.media.MediaCrypto mediaCrypto2 = this.mediaCrypto;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long j, long j2) throws com.google.android.exoplayer2.ExoPlaybackException {
        boolean z = false;
        if (this.pendingOutputEndOfStream) {
            this.pendingOutputEndOfStream = false;
            processEndOfStream();
        }
        com.google.android.exoplayer2.ExoPlaybackException exoPlaybackException = this.pendingPlaybackException;
        if (exoPlaybackException != null) {
            this.pendingPlaybackException = null;
            throw exoPlaybackException;
        }
        try {
            if (this.outputStreamEnded) {
                renderToEndOfStream();
                return;
            }
            if (this.inputFormat != null || readSourceOmittingSampleData(2)) {
                maybeInitCodecOrBypass();
                if (this.bypassEnabled) {
                    com.google.android.exoplayer2.util.TraceUtil.beginSection("bypassRender");
                    while (bypassRender(j, j2)) {
                    }
                    com.google.android.exoplayer2.util.TraceUtil.endSection();
                } else if (this.codec != null) {
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    com.google.android.exoplayer2.util.TraceUtil.beginSection("drainAndFeed");
                    while (drainOutputBuffer(j, j2) && shouldContinueRendering(elapsedRealtime)) {
                    }
                    while (feedInputBuffer() && shouldContinueRendering(elapsedRealtime)) {
                    }
                    com.google.android.exoplayer2.util.TraceUtil.endSection();
                } else {
                    this.decoderCounters.skippedInputBufferCount += skipSource(j);
                    readSourceOmittingSampleData(1);
                }
                this.decoderCounters.ensureUpdated();
            }
        } catch (java.lang.IllegalStateException e) {
            if (isMediaCodecException(e)) {
                onCodecError(e);
                if (com.google.android.exoplayer2.util.Util.SDK_INT >= 21 && isRecoverableMediaCodecExceptionV21(e)) {
                    z = true;
                }
                if (z) {
                    releaseCodec();
                }
                throw createRendererException(createDecoderException(e, getCodecInfo()), this.inputFormat, z, 4003);
            }
            throw e;
        }
    }

    protected final boolean flushOrReinitializeCodec() throws com.google.android.exoplayer2.ExoPlaybackException {
        boolean flushOrReleaseCodec = flushOrReleaseCodec();
        if (flushOrReleaseCodec) {
            maybeInitCodecOrBypass();
        }
        return flushOrReleaseCodec;
    }

    protected boolean flushOrReleaseCodec() {
        if (this.codec == null) {
            return false;
        }
        int i = this.codecDrainAction;
        if (i == 3 || this.codecNeedsFlushWorkaround || ((this.codecNeedsSosFlushWorkaround && !this.codecHasOutputMediaFormat) || (this.codecNeedsEosFlushWorkaround && this.codecReceivedEos))) {
            releaseCodec();
            return true;
        }
        if (i == 2) {
            com.google.android.exoplayer2.util.Assertions.checkState(com.google.android.exoplayer2.util.Util.SDK_INT >= 23);
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 23) {
                try {
                    updateDrmSessionV23();
                } catch (com.google.android.exoplayer2.ExoPlaybackException e) {
                    com.google.android.exoplayer2.util.Log.w(TAG, "Failed to update the DRM session, releasing the codec instead.", e);
                    releaseCodec();
                    return true;
                }
            }
        }
        flushCodec();
        return false;
    }

    private void flushCodec() {
        try {
            this.codec.flush();
        } finally {
            resetCodecStateForFlush();
        }
    }

    protected void resetCodecStateForFlush() {
        resetInputBuffer();
        resetOutputBuffer();
        this.codecHotswapDeadlineMs = -9223372036854775807L;
        this.codecReceivedEos = false;
        this.codecReceivedBuffers = false;
        this.codecNeedsAdaptationWorkaroundBuffer = false;
        this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
        this.isDecodeOnlyOutputBuffer = false;
        this.isLastOutputBuffer = false;
        this.decodeOnlyPresentationTimestamps.clear();
        this.largestQueuedPresentationTimeUs = -9223372036854775807L;
        this.lastBufferInStreamPresentationTimeUs = -9223372036854775807L;
        com.google.android.exoplayer2.mediacodec.C2Mp3TimestampTracker c2Mp3TimestampTracker = this.c2Mp3TimestampTracker;
        if (c2Mp3TimestampTracker != null) {
            c2Mp3TimestampTracker.reset();
        }
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.codecReconfigurationState = this.codecReconfigured ? 1 : 0;
    }

    protected void resetCodecStateForRelease() {
        resetCodecStateForFlush();
        this.pendingPlaybackException = null;
        this.c2Mp3TimestampTracker = null;
        this.availableCodecInfos = null;
        this.codecInfo = null;
        this.codecInputFormat = null;
        this.codecOutputMediaFormat = null;
        this.codecOutputMediaFormatChanged = false;
        this.codecHasOutputMediaFormat = false;
        this.codecOperatingRate = -1.0f;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecNeedsDiscardToSpsWorkaround = false;
        this.codecNeedsFlushWorkaround = false;
        this.codecNeedsSosFlushWorkaround = false;
        this.codecNeedsEosFlushWorkaround = false;
        this.codecNeedsEosOutputExceptionWorkaround = false;
        this.codecNeedsEosBufferTimestampWorkaround = false;
        this.codecNeedsMonoChannelCountWorkaround = false;
        this.codecNeedsEosPropagation = false;
        this.codecReconfigured = false;
        this.codecReconfigurationState = 0;
        this.mediaCryptoRequiresSecureDecoder = false;
    }

    protected com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException createDecoderException(java.lang.Throwable th, com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return new com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException(th, mediaCodecInfo);
    }

    private boolean readSourceOmittingSampleData(int i) throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.FormatHolder formatHolder = getFormatHolder();
        this.noDataBuffer.clear();
        int readSource = readSource(formatHolder, this.noDataBuffer, i | 4);
        if (readSource == -5) {
            onInputFormatChanged(formatHolder);
            return true;
        }
        if (readSource != -4 || !this.noDataBuffer.isEndOfStream()) {
            return false;
        }
        this.inputStreamEnded = true;
        processEndOfStream();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void maybeInitCodecWithFallback(android.media.MediaCrypto mediaCrypto, boolean z) throws com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException {
        com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException decoderInitializationException;
        if (this.availableCodecInfos == null) {
            try {
                java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> availableCodecInfos = getAvailableCodecInfos(z);
                java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> arrayDeque = new java.util.ArrayDeque<>();
                this.availableCodecInfos = arrayDeque;
                if (this.enableDecoderFallback) {
                    arrayDeque.addAll(availableCodecInfos);
                } else if (!availableCodecInfos.isEmpty()) {
                    this.availableCodecInfos.add(availableCodecInfos.get(0));
                }
                this.preferredDecoderInitializationException = null;
            } catch (com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException e) {
                throw new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException(this.inputFormat, e, z, -49998);
            }
        }
        if (this.availableCodecInfos.isEmpty()) {
            throw new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException(this.inputFormat, (java.lang.Throwable) null, z, -49999);
        }
        com.google.android.exoplayer2.mediacodec.MediaCodecInfo peekFirst = this.availableCodecInfos.peekFirst();
        while (this.codec == null) {
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo peekFirst2 = this.availableCodecInfos.peekFirst();
            if (!shouldInitCodec(peekFirst2)) {
                return;
            }
            try {
                initCodec(peekFirst2, mediaCrypto);
            } catch (java.lang.Exception e2) {
                if (peekFirst2 == peekFirst) {
                    try {
                        com.google.android.exoplayer2.util.Log.w(TAG, "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                        java.lang.Thread.sleep(50L);
                        initCodec(peekFirst2, mediaCrypto);
                    } catch (java.lang.Exception e3) {
                        com.google.android.exoplayer2.util.Log.w(TAG, "Failed to initialize decoder: " + peekFirst2, e3);
                        this.availableCodecInfos.removeFirst();
                        com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException decoderInitializationException2 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException(this.inputFormat, e3, z, peekFirst2);
                        onCodecError(decoderInitializationException2);
                        decoderInitializationException = this.preferredDecoderInitializationException;
                        if (decoderInitializationException == null) {
                        }
                        if (!this.availableCodecInfos.isEmpty()) {
                        }
                    }
                } else {
                    throw e2;
                }
                com.google.android.exoplayer2.util.Log.w(TAG, "Failed to initialize decoder: " + peekFirst2, e3);
                this.availableCodecInfos.removeFirst();
                com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException decoderInitializationException22 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException(this.inputFormat, e3, z, peekFirst2);
                onCodecError(decoderInitializationException22);
                decoderInitializationException = this.preferredDecoderInitializationException;
                if (decoderInitializationException == null) {
                    this.preferredDecoderInitializationException = decoderInitializationException.copyWithFallbackException(decoderInitializationException22);
                } else {
                    this.preferredDecoderInitializationException = decoderInitializationException22;
                }
                if (!this.availableCodecInfos.isEmpty()) {
                    throw this.preferredDecoderInitializationException;
                }
            }
        }
        this.availableCodecInfos = null;
    }

    private java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> getAvailableCodecInfos(boolean z) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
        java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> decoderInfos = getDecoderInfos(this.mediaCodecSelector, this.inputFormat, z);
        if (decoderInfos.isEmpty() && z) {
            decoderInfos = getDecoderInfos(this.mediaCodecSelector, this.inputFormat, false);
            if (!decoderInfos.isEmpty()) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Drm session requires secure decoder for " + this.inputFormat.sampleMimeType + ", but no secure decoder available. Trying to proceed with " + decoderInfos + ".");
            }
        }
        return decoderInfos;
    }

    private void initBypass(com.google.android.exoplayer2.Format format) {
        disableBypass();
        java.lang.String str = format.sampleMimeType;
        if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
            this.bypassBatchBuffer.setMaxSampleCount(1);
        } else {
            this.bypassBatchBuffer.setMaxSampleCount(32);
        }
        this.bypassEnabled = true;
    }

    private void initCodec(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo, android.media.MediaCrypto mediaCrypto) throws java.lang.Exception {
        java.lang.String str = mediaCodecInfo.name;
        float codecOperatingRateV23 = com.google.android.exoplayer2.util.Util.SDK_INT < 23 ? -1.0f : getCodecOperatingRateV23(this.targetPlaybackSpeed, this.inputFormat, getStreamFormats());
        float f = codecOperatingRateV23 > this.assumedMinimumCodecOperatingRate ? codecOperatingRateV23 : -1.0f;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration mediaCodecConfiguration = getMediaCodecConfiguration(mediaCodecInfo, this.inputFormat, mediaCrypto, f);
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 31) {
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.Api31.setLogSessionIdToMediaCodecFormat(mediaCodecConfiguration, getPlayerId());
        }
        try {
            com.google.android.exoplayer2.util.TraceUtil.beginSection("createCodec:" + str);
            this.codec = this.codecAdapterFactory.createAdapter(mediaCodecConfiguration);
            com.google.android.exoplayer2.util.TraceUtil.endSection();
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            this.codecInfo = mediaCodecInfo;
            this.codecOperatingRate = f;
            this.codecInputFormat = this.inputFormat;
            this.codecAdaptationWorkaroundMode = codecAdaptationWorkaroundMode(str);
            this.codecNeedsDiscardToSpsWorkaround = codecNeedsDiscardToSpsWorkaround(str, this.codecInputFormat);
            this.codecNeedsFlushWorkaround = codecNeedsFlushWorkaround(str);
            this.codecNeedsSosFlushWorkaround = codecNeedsSosFlushWorkaround(str);
            this.codecNeedsEosFlushWorkaround = codecNeedsEosFlushWorkaround(str);
            this.codecNeedsEosOutputExceptionWorkaround = codecNeedsEosOutputExceptionWorkaround(str);
            this.codecNeedsEosBufferTimestampWorkaround = codecNeedsEosBufferTimestampWorkaround(str);
            this.codecNeedsMonoChannelCountWorkaround = codecNeedsMonoChannelCountWorkaround(str, this.codecInputFormat);
            this.codecNeedsEosPropagation = codecNeedsEosPropagationWorkaround(mediaCodecInfo) || getCodecNeedsEosPropagation();
            if (this.codec.needsReconfiguration()) {
                this.codecReconfigured = true;
                this.codecReconfigurationState = 1;
                this.codecNeedsAdaptationWorkaroundBuffer = this.codecAdaptationWorkaroundMode != 0;
            }
            if ("c2.android.mp3.decoder".equals(mediaCodecInfo.name)) {
                this.c2Mp3TimestampTracker = new com.google.android.exoplayer2.mediacodec.C2Mp3TimestampTracker();
            }
            if (getState() == 2) {
                this.codecHotswapDeadlineMs = android.os.SystemClock.elapsedRealtime() + 1000;
            }
            this.decoderCounters.decoderInitCount++;
            onCodecInitialized(str, mediaCodecConfiguration, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (java.lang.Throwable th) {
            com.google.android.exoplayer2.util.TraceUtil.endSection();
            throw th;
        }
    }

    private boolean shouldContinueRendering(long j) {
        return this.renderTimeLimitMs == -9223372036854775807L || android.os.SystemClock.elapsedRealtime() - j < this.renderTimeLimitMs;
    }

    private boolean hasOutputBuffer() {
        return this.outputIndex >= 0;
    }

    private void resetInputBuffer() {
        this.inputIndex = -1;
        this.buffer.data = null;
    }

    private void resetOutputBuffer() {
        this.outputIndex = -1;
        this.outputBuffer = null;
    }

    private void setSourceDrmSession(com.google.android.exoplayer2.drm.DrmSession drmSession) {
        com.google.android.exoplayer2.drm.DrmSession.CC.replaceSession(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private void setCodecDrmSession(com.google.android.exoplayer2.drm.DrmSession drmSession) {
        com.google.android.exoplayer2.drm.DrmSession.CC.replaceSession(this.codecDrmSession, drmSession);
        this.codecDrmSession = drmSession;
    }

    private boolean feedInputBuffer() throws com.google.android.exoplayer2.ExoPlaybackException {
        int i;
        if (this.codec == null || (i = this.codecDrainState) == 2 || this.inputStreamEnded) {
            return false;
        }
        if (i == 0 && shouldReinitCodec()) {
            drainAndReinitializeCodec();
        }
        if (this.inputIndex < 0) {
            int dequeueInputBufferIndex = this.codec.dequeueInputBufferIndex();
            this.inputIndex = dequeueInputBufferIndex;
            if (dequeueInputBufferIndex < 0) {
                return false;
            }
            this.buffer.data = this.codec.getInputBuffer(dequeueInputBufferIndex);
            this.buffer.clear();
        }
        if (this.codecDrainState == 1) {
            if (!this.codecNeedsEosPropagation) {
                this.codecReceivedEos = true;
                this.codec.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                resetInputBuffer();
            }
            this.codecDrainState = 2;
            return false;
        }
        if (this.codecNeedsAdaptationWorkaroundBuffer) {
            this.codecNeedsAdaptationWorkaroundBuffer = false;
            java.nio.ByteBuffer byteBuffer = this.buffer.data;
            byte[] bArr = ADAPTATION_WORKAROUND_BUFFER;
            byteBuffer.put(bArr);
            this.codec.queueInputBuffer(this.inputIndex, 0, bArr.length, 0L, 0);
            resetInputBuffer();
            this.codecReceivedBuffers = true;
            return true;
        }
        if (this.codecReconfigurationState == 1) {
            for (int i2 = 0; i2 < this.codecInputFormat.initializationData.size(); i2++) {
                this.buffer.data.put(this.codecInputFormat.initializationData.get(i2));
            }
            this.codecReconfigurationState = 2;
        }
        int position = this.buffer.data.position();
        com.google.android.exoplayer2.FormatHolder formatHolder = getFormatHolder();
        try {
            int readSource = readSource(formatHolder, this.buffer, 0);
            if (hasReadStreamToEnd()) {
                this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
            }
            if (readSource == -3) {
                return false;
            }
            if (readSource == -5) {
                if (this.codecReconfigurationState == 2) {
                    this.buffer.clear();
                    this.codecReconfigurationState = 1;
                }
                onInputFormatChanged(formatHolder);
                return true;
            }
            if (this.buffer.isEndOfStream()) {
                if (this.codecReconfigurationState == 2) {
                    this.buffer.clear();
                    this.codecReconfigurationState = 1;
                }
                this.inputStreamEnded = true;
                if (!this.codecReceivedBuffers) {
                    processEndOfStream();
                    return false;
                }
                try {
                    if (!this.codecNeedsEosPropagation) {
                        this.codecReceivedEos = true;
                        this.codec.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                        resetInputBuffer();
                    }
                    return false;
                } catch (android.media.MediaCodec.CryptoException e) {
                    throw createRendererException(e, this.inputFormat, com.google.android.exoplayer2.util.Util.getErrorCodeForMediaDrmErrorCode(e.getErrorCode()));
                }
            }
            if (!this.codecReceivedBuffers && !this.buffer.isKeyFrame()) {
                this.buffer.clear();
                if (this.codecReconfigurationState == 2) {
                    this.codecReconfigurationState = 1;
                }
                return true;
            }
            boolean isEncrypted = this.buffer.isEncrypted();
            if (isEncrypted) {
                this.buffer.cryptoInfo.increaseClearDataFirstSubSampleBy(position);
            }
            if (this.codecNeedsDiscardToSpsWorkaround && !isEncrypted) {
                com.google.android.exoplayer2.util.NalUnitUtil.discardToSps(this.buffer.data);
                if (this.buffer.data.position() == 0) {
                    return true;
                }
                this.codecNeedsDiscardToSpsWorkaround = false;
            }
            long j = this.buffer.timeUs;
            com.google.android.exoplayer2.mediacodec.C2Mp3TimestampTracker c2Mp3TimestampTracker = this.c2Mp3TimestampTracker;
            if (c2Mp3TimestampTracker != null) {
                j = c2Mp3TimestampTracker.updateAndGetPresentationTimeUs(this.inputFormat, this.buffer);
                this.largestQueuedPresentationTimeUs = java.lang.Math.max(this.largestQueuedPresentationTimeUs, this.c2Mp3TimestampTracker.getLastOutputBufferPresentationTimeUs(this.inputFormat));
            }
            long j2 = j;
            if (this.buffer.isDecodeOnly()) {
                this.decodeOnlyPresentationTimestamps.add(java.lang.Long.valueOf(j2));
            }
            if (this.waitingForFirstSampleInFormat) {
                this.formatQueue.add(j2, this.inputFormat);
                this.waitingForFirstSampleInFormat = false;
            }
            this.largestQueuedPresentationTimeUs = java.lang.Math.max(this.largestQueuedPresentationTimeUs, j2);
            this.buffer.flip();
            if (this.buffer.hasSupplementalData()) {
                handleInputBufferSupplementalData(this.buffer);
            }
            onQueueInputBuffer(this.buffer);
            try {
                if (isEncrypted) {
                    this.codec.queueSecureInputBuffer(this.inputIndex, 0, this.buffer.cryptoInfo, j2, 0);
                } else {
                    this.codec.queueInputBuffer(this.inputIndex, 0, this.buffer.data.limit(), j2, 0);
                }
                resetInputBuffer();
                this.codecReceivedBuffers = true;
                this.codecReconfigurationState = 0;
                this.decoderCounters.queuedInputBufferCount++;
                return true;
            } catch (android.media.MediaCodec.CryptoException e2) {
                throw createRendererException(e2, this.inputFormat, com.google.android.exoplayer2.util.Util.getErrorCodeForMediaDrmErrorCode(e2.getErrorCode()));
            }
        } catch (com.google.android.exoplayer2.decoder.DecoderInputBuffer.InsufficientCapacityException e3) {
            onCodecError(e3);
            readSourceOmittingSampleData(0);
            flushCodec();
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (drainAndUpdateCodecDrmSessionV23() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cf, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b2, code lost:
    
        if (drainAndUpdateCodecDrmSessionV23() == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected com.google.android.exoplayer2.decoder.DecoderReuseEvaluation onInputFormatChanged(com.google.android.exoplayer2.FormatHolder formatHolder) throws com.google.android.exoplayer2.ExoPlaybackException {
        int i;
        boolean z = true;
        this.waitingForFirstSampleInFormat = true;
        com.google.android.exoplayer2.Format format = (com.google.android.exoplayer2.Format) com.google.android.exoplayer2.util.Assertions.checkNotNull(formatHolder.format);
        if (format.sampleMimeType == null) {
            throw createRendererException(new java.lang.IllegalArgumentException(), format, 4005);
        }
        setSourceDrmSession(formatHolder.drmSession);
        this.inputFormat = format;
        if (this.bypassEnabled) {
            this.bypassDrainAndReinitialize = true;
            return null;
        }
        com.google.android.exoplayer2.mediacodec.MediaCodecAdapter mediaCodecAdapter = this.codec;
        if (mediaCodecAdapter == null) {
            this.availableCodecInfos = null;
            maybeInitCodecOrBypass();
            return null;
        }
        com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo = this.codecInfo;
        com.google.android.exoplayer2.Format format2 = this.codecInputFormat;
        if (drmNeedsCodecReinitialization(mediaCodecInfo, format, this.codecDrmSession, this.sourceDrmSession)) {
            drainAndReinitializeCodec();
            return new com.google.android.exoplayer2.decoder.DecoderReuseEvaluation(mediaCodecInfo.name, format2, format, 0, 128);
        }
        boolean z2 = this.sourceDrmSession != this.codecDrmSession;
        com.google.android.exoplayer2.util.Assertions.checkState(!z2 || com.google.android.exoplayer2.util.Util.SDK_INT >= 23);
        com.google.android.exoplayer2.decoder.DecoderReuseEvaluation canReuseCodec = canReuseCodec(mediaCodecInfo, format2, format);
        int i2 = canReuseCodec.result;
        if (i2 != 0) {
            if (i2 == 1) {
                if (updateCodecOperatingRate(format)) {
                    this.codecInputFormat = format;
                    if (!z2) {
                    }
                }
                i = 16;
            } else if (i2 == 2) {
                if (updateCodecOperatingRate(format)) {
                    this.codecReconfigured = true;
                    this.codecReconfigurationState = 1;
                    int i3 = this.codecAdaptationWorkaroundMode;
                    if (i3 != 2 && (i3 != 1 || format.width != format2.width || format.height != format2.height)) {
                        z = false;
                    }
                    this.codecNeedsAdaptationWorkaroundBuffer = z;
                    this.codecInputFormat = format;
                    if (z2) {
                    }
                }
                i = 16;
            } else if (i2 == 3) {
                if (updateCodecOperatingRate(format)) {
                    this.codecInputFormat = format;
                    if (z2) {
                    }
                }
                i = 16;
            } else {
                throw new java.lang.IllegalStateException();
            }
            return (canReuseCodec.result != 0 || (this.codec == mediaCodecAdapter && this.codecDrainAction != 3)) ? canReuseCodec : new com.google.android.exoplayer2.decoder.DecoderReuseEvaluation(mediaCodecInfo.name, format2, format, 0, i);
        }
        drainAndReinitializeCodec();
        i = 0;
        if (canReuseCodec.result != 0) {
        }
    }

    protected void onProcessedOutputBuffer(long j) {
        while (this.pendingOutputStreamOffsetCount != 0 && j >= this.pendingOutputStreamSwitchTimesUs[0]) {
            this.outputStreamStartPositionUs = this.pendingOutputStreamStartPositionsUs[0];
            setOutputStreamOffsetUs(this.pendingOutputStreamOffsetsUs[0]);
            int i = this.pendingOutputStreamOffsetCount - 1;
            this.pendingOutputStreamOffsetCount = i;
            long[] jArr = this.pendingOutputStreamStartPositionsUs;
            java.lang.System.arraycopy(jArr, 1, jArr, 0, i);
            long[] jArr2 = this.pendingOutputStreamOffsetsUs;
            java.lang.System.arraycopy(jArr2, 1, jArr2, 0, this.pendingOutputStreamOffsetCount);
            long[] jArr3 = this.pendingOutputStreamSwitchTimesUs;
            java.lang.System.arraycopy(jArr3, 1, jArr3, 0, this.pendingOutputStreamOffsetCount);
            onProcessedStreamChange();
        }
    }

    protected com.google.android.exoplayer2.decoder.DecoderReuseEvaluation canReuseCodec(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo, com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.Format format2) {
        return new com.google.android.exoplayer2.decoder.DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, 0, 1);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        return this.inputFormat != null && (isSourceReady() || hasOutputBuffer() || (this.codecHotswapDeadlineMs != -9223372036854775807L && android.os.SystemClock.elapsedRealtime() < this.codecHotswapDeadlineMs));
    }

    protected float getPlaybackSpeed() {
        return this.currentPlaybackSpeed;
    }

    protected float getCodecOperatingRate() {
        return this.codecOperatingRate;
    }

    protected final boolean updateCodecOperatingRate() throws com.google.android.exoplayer2.ExoPlaybackException {
        return updateCodecOperatingRate(this.codecInputFormat);
    }

    private boolean updateCodecOperatingRate(com.google.android.exoplayer2.Format format) throws com.google.android.exoplayer2.ExoPlaybackException {
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 23 && this.codec != null && this.codecDrainAction != 3 && getState() != 0) {
            float codecOperatingRateV23 = getCodecOperatingRateV23(this.targetPlaybackSpeed, format, getStreamFormats());
            float f = this.codecOperatingRate;
            if (f == codecOperatingRateV23) {
                return true;
            }
            if (codecOperatingRateV23 == -1.0f) {
                drainAndReinitializeCodec();
                return false;
            }
            if (f == -1.0f && codecOperatingRateV23 <= this.assumedMinimumCodecOperatingRate) {
                return true;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putFloat("operating-rate", codecOperatingRateV23);
            this.codec.setParameters(bundle);
            this.codecOperatingRate = codecOperatingRateV23;
        }
        return true;
    }

    private boolean drainAndFlushCodec() {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (this.codecNeedsFlushWorkaround || this.codecNeedsEosFlushWorkaround) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 1;
        }
        return true;
    }

    private boolean drainAndUpdateCodecDrmSessionV23() throws com.google.android.exoplayer2.ExoPlaybackException {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (this.codecNeedsFlushWorkaround || this.codecNeedsEosFlushWorkaround) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 2;
        } else {
            updateDrmSessionV23();
        }
        return true;
    }

    private void drainAndReinitializeCodec() throws com.google.android.exoplayer2.ExoPlaybackException {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            this.codecDrainAction = 3;
        } else {
            reinitializeCodec();
        }
    }

    private boolean drainOutputBuffer(long j, long j2) throws com.google.android.exoplayer2.ExoPlaybackException {
        boolean z;
        boolean processOutputBuffer;
        int dequeueOutputBufferIndex;
        if (!hasOutputBuffer()) {
            if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
                try {
                    dequeueOutputBufferIndex = this.codec.dequeueOutputBufferIndex(this.outputBufferInfo);
                } catch (java.lang.IllegalStateException unused) {
                    processEndOfStream();
                    if (this.outputStreamEnded) {
                        releaseCodec();
                    }
                    return false;
                }
            } else {
                dequeueOutputBufferIndex = this.codec.dequeueOutputBufferIndex(this.outputBufferInfo);
            }
            if (dequeueOutputBufferIndex < 0) {
                if (dequeueOutputBufferIndex == -2) {
                    processOutputMediaFormatChanged();
                    return true;
                }
                if (this.codecNeedsEosPropagation && (this.inputStreamEnded || this.codecDrainState == 2)) {
                    processEndOfStream();
                }
                return false;
            }
            if (this.shouldSkipAdaptationWorkaroundOutputBuffer) {
                this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
                this.codec.releaseOutputBuffer(dequeueOutputBufferIndex, false);
                return true;
            }
            if (this.outputBufferInfo.size == 0 && (this.outputBufferInfo.flags & 4) != 0) {
                processEndOfStream();
                return false;
            }
            this.outputIndex = dequeueOutputBufferIndex;
            java.nio.ByteBuffer outputBuffer = this.codec.getOutputBuffer(dequeueOutputBufferIndex);
            this.outputBuffer = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.outputBufferInfo.offset);
                this.outputBuffer.limit(this.outputBufferInfo.offset + this.outputBufferInfo.size);
            }
            if (this.codecNeedsEosBufferTimestampWorkaround && this.outputBufferInfo.presentationTimeUs == 0 && (this.outputBufferInfo.flags & 4) != 0) {
                long j3 = this.largestQueuedPresentationTimeUs;
                if (j3 != -9223372036854775807L) {
                    this.outputBufferInfo.presentationTimeUs = j3;
                }
            }
            this.isDecodeOnlyOutputBuffer = isDecodeOnlyBuffer(this.outputBufferInfo.presentationTimeUs);
            this.isLastOutputBuffer = this.lastBufferInStreamPresentationTimeUs == this.outputBufferInfo.presentationTimeUs;
            updateOutputFormatForTime(this.outputBufferInfo.presentationTimeUs);
        }
        if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
            try {
                z = false;
            } catch (java.lang.IllegalStateException unused2) {
                z = false;
            }
            try {
                processOutputBuffer = processOutputBuffer(j, j2, this.codec, this.outputBuffer, this.outputIndex, this.outputBufferInfo.flags, 1, this.outputBufferInfo.presentationTimeUs, this.isDecodeOnlyOutputBuffer, this.isLastOutputBuffer, this.outputFormat);
            } catch (java.lang.IllegalStateException unused3) {
                processEndOfStream();
                if (this.outputStreamEnded) {
                    releaseCodec();
                }
                return z;
            }
        } else {
            z = false;
            processOutputBuffer = processOutputBuffer(j, j2, this.codec, this.outputBuffer, this.outputIndex, this.outputBufferInfo.flags, 1, this.outputBufferInfo.presentationTimeUs, this.isDecodeOnlyOutputBuffer, this.isLastOutputBuffer, this.outputFormat);
        }
        if (processOutputBuffer) {
            onProcessedOutputBuffer(this.outputBufferInfo.presentationTimeUs);
            boolean z2 = (this.outputBufferInfo.flags & 4) != 0;
            resetOutputBuffer();
            if (!z2) {
                return true;
            }
            processEndOfStream();
        }
        return z;
    }

    private void processOutputMediaFormatChanged() {
        this.codecHasOutputMediaFormat = true;
        android.media.MediaFormat outputFormat = this.codec.getOutputFormat();
        if (this.codecAdaptationWorkaroundMode != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.shouldSkipAdaptationWorkaroundOutputBuffer = true;
            return;
        }
        if (this.codecNeedsMonoChannelCountWorkaround) {
            outputFormat.setInteger("channel-count", 1);
        }
        this.codecOutputMediaFormat = outputFormat;
        this.codecOutputMediaFormatChanged = true;
    }

    private void processEndOfStream() throws com.google.android.exoplayer2.ExoPlaybackException {
        int i = this.codecDrainAction;
        if (i == 1) {
            flushCodec();
            return;
        }
        if (i == 2) {
            flushCodec();
            updateDrmSessionV23();
        } else if (i == 3) {
            reinitializeCodec();
        } else {
            this.outputStreamEnded = true;
            renderToEndOfStream();
        }
    }

    protected final void setPendingOutputEndOfStream() {
        this.pendingOutputEndOfStream = true;
    }

    protected final long getOutputStreamOffsetUs() {
        return this.outputStreamOffsetUs;
    }

    private void setOutputStreamOffsetUs(long j) {
        this.outputStreamOffsetUs = j;
        if (j != -9223372036854775807L) {
            onOutputStreamOffsetUsChanged(j);
        }
    }

    protected static boolean supportsFormatDrm(com.google.android.exoplayer2.Format format) {
        return format.cryptoType == 0 || format.cryptoType == 2;
    }

    private boolean drmNeedsCodecReinitialization(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo, com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.drm.DrmSession drmSession, com.google.android.exoplayer2.drm.DrmSession drmSession2) throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.drm.FrameworkCryptoConfig frameworkCryptoConfig;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 == null || drmSession == null || !drmSession2.getSchemeUuid().equals(drmSession.getSchemeUuid()) || com.google.android.exoplayer2.util.Util.SDK_INT < 23 || com.google.android.exoplayer2.C.PLAYREADY_UUID.equals(drmSession.getSchemeUuid()) || com.google.android.exoplayer2.C.PLAYREADY_UUID.equals(drmSession2.getSchemeUuid()) || (frameworkCryptoConfig = getFrameworkCryptoConfig(drmSession2)) == null) {
            return true;
        }
        return !mediaCodecInfo.secure && (frameworkCryptoConfig.forceAllowInsecureDecoderComponents ? false : drmSession2.requiresSecureDecoder(format.sampleMimeType));
    }

    private void reinitializeCodec() throws com.google.android.exoplayer2.ExoPlaybackException {
        releaseCodec();
        maybeInitCodecOrBypass();
    }

    private boolean isDecodeOnlyBuffer(long j) {
        int size = this.decodeOnlyPresentationTimestamps.size();
        for (int i = 0; i < size; i++) {
            if (this.decodeOnlyPresentationTimestamps.get(i).longValue() == j) {
                this.decodeOnlyPresentationTimestamps.remove(i);
                return true;
            }
        }
        return false;
    }

    private void updateDrmSessionV23() throws com.google.android.exoplayer2.ExoPlaybackException {
        try {
            this.mediaCrypto.setMediaDrmSession(getFrameworkCryptoConfig(this.sourceDrmSession).sessionId);
            setCodecDrmSession(this.sourceDrmSession);
            this.codecDrainState = 0;
            this.codecDrainAction = 0;
        } catch (android.media.MediaCryptoException e) {
            throw createRendererException(e, this.inputFormat, 6006);
        }
    }

    private com.google.android.exoplayer2.drm.FrameworkCryptoConfig getFrameworkCryptoConfig(com.google.android.exoplayer2.drm.DrmSession drmSession) throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.decoder.CryptoConfig cryptoConfig = drmSession.getCryptoConfig();
        if (cryptoConfig != null && !(cryptoConfig instanceof com.google.android.exoplayer2.drm.FrameworkCryptoConfig)) {
            throw createRendererException(new java.lang.IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + cryptoConfig), this.inputFormat, 6001);
        }
        return (com.google.android.exoplayer2.drm.FrameworkCryptoConfig) cryptoConfig;
    }

    private boolean bypassRender(long j, long j2) throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.outputStreamEnded);
        if (this.bypassBatchBuffer.hasSamples()) {
            if (!processOutputBuffer(j, j2, null, this.bypassBatchBuffer.data, this.outputIndex, 0, this.bypassBatchBuffer.getSampleCount(), this.bypassBatchBuffer.getFirstSampleTimeUs(), this.bypassBatchBuffer.isDecodeOnly(), this.bypassBatchBuffer.isEndOfStream(), this.outputFormat)) {
                return false;
            }
            onProcessedOutputBuffer(this.bypassBatchBuffer.getLastSampleTimeUs());
            this.bypassBatchBuffer.clear();
        }
        if (this.inputStreamEnded) {
            this.outputStreamEnded = true;
            return false;
        }
        if (this.bypassSampleBufferPending) {
            com.google.android.exoplayer2.util.Assertions.checkState(this.bypassBatchBuffer.append(this.bypassSampleBuffer));
            this.bypassSampleBufferPending = false;
        }
        if (this.bypassDrainAndReinitialize) {
            if (this.bypassBatchBuffer.hasSamples()) {
                return true;
            }
            disableBypass();
            this.bypassDrainAndReinitialize = false;
            maybeInitCodecOrBypass();
            if (!this.bypassEnabled) {
                return false;
            }
        }
        bypassRead();
        if (this.bypassBatchBuffer.hasSamples()) {
            this.bypassBatchBuffer.flip();
        }
        return this.bypassBatchBuffer.hasSamples() || this.inputStreamEnded || this.bypassDrainAndReinitialize;
    }

    private void bypassRead() throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.inputStreamEnded);
        com.google.android.exoplayer2.FormatHolder formatHolder = getFormatHolder();
        this.bypassSampleBuffer.clear();
        do {
            this.bypassSampleBuffer.clear();
            int readSource = readSource(formatHolder, this.bypassSampleBuffer, 0);
            if (readSource == -5) {
                onInputFormatChanged(formatHolder);
                return;
            }
            if (readSource != -4) {
                if (readSource != -3) {
                    throw new java.lang.IllegalStateException();
                }
                return;
            } else {
                if (this.bypassSampleBuffer.isEndOfStream()) {
                    this.inputStreamEnded = true;
                    return;
                }
                if (this.waitingForFirstSampleInFormat) {
                    com.google.android.exoplayer2.Format format = (com.google.android.exoplayer2.Format) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.inputFormat);
                    this.outputFormat = format;
                    onOutputFormatChanged(format, null);
                    this.waitingForFirstSampleInFormat = false;
                }
                this.bypassSampleBuffer.flip();
            }
        } while (this.bypassBatchBuffer.append(this.bypassSampleBuffer));
        this.bypassSampleBufferPending = true;
    }

    private static boolean isMediaCodecException(java.lang.IllegalStateException illegalStateException) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 21 && isMediaCodecExceptionV21(illegalStateException)) {
            return true;
        }
        java.lang.StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private static boolean isMediaCodecExceptionV21(java.lang.IllegalStateException illegalStateException) {
        return illegalStateException instanceof android.media.MediaCodec.CodecException;
    }

    private static boolean isRecoverableMediaCodecExceptionV21(java.lang.IllegalStateException illegalStateException) {
        if (illegalStateException instanceof android.media.MediaCodec.CodecException) {
            return ((android.media.MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private static boolean codecNeedsFlushWorkaround(java.lang.String str) {
        return com.google.android.exoplayer2.util.Util.SDK_INT < 18 || (com.google.android.exoplayer2.util.Util.SDK_INT == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (com.google.android.exoplayer2.util.Util.SDK_INT == 19 && com.google.android.exoplayer2.util.Util.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private int codecAdaptationWorkaroundMode(java.lang.String str) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (com.google.android.exoplayer2.util.Util.MODEL.startsWith("SM-T585") || com.google.android.exoplayer2.util.Util.MODEL.startsWith("SM-A510") || com.google.android.exoplayer2.util.Util.MODEL.startsWith("SM-A520") || com.google.android.exoplayer2.util.Util.MODEL.startsWith("SM-J700"))) {
            return 2;
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 24) {
            return 0;
        }
        if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
            return ("flounder".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "flounder_lte".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "grouper".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "tilapia".equals(com.google.android.exoplayer2.util.Util.DEVICE)) ? 1 : 0;
        }
        return 0;
    }

    private static boolean codecNeedsDiscardToSpsWorkaround(java.lang.String str, com.google.android.exoplayer2.Format format) {
        return com.google.android.exoplayer2.util.Util.SDK_INT < 21 && format.initializationData.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private static boolean codecNeedsSosFlushWorkaround(java.lang.String str) {
        return com.google.android.exoplayer2.util.Util.SDK_INT == 29 && "c2.android.aac.decoder".equals(str);
    }

    private static boolean codecNeedsEosPropagationWorkaround(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo) {
        java.lang.String str = mediaCodecInfo.name;
        return (com.google.android.exoplayer2.util.Util.SDK_INT <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (com.google.android.exoplayer2.util.Util.SDK_INT <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((com.google.android.exoplayer2.util.Util.SDK_INT <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(com.google.android.exoplayer2.util.Util.MANUFACTURER) && "AFTS".equals(com.google.android.exoplayer2.util.Util.MODEL) && mediaCodecInfo.secure));
    }

    private static boolean codecNeedsEosFlushWorkaround(java.lang.String str) {
        return (com.google.android.exoplayer2.util.Util.SDK_INT <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (com.google.android.exoplayer2.util.Util.SDK_INT <= 19 && (("hb2000".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "stvm8".equals(com.google.android.exoplayer2.util.Util.DEVICE)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))));
    }

    private static boolean codecNeedsEosBufferTimestampWorkaround(java.lang.String str) {
        return com.google.android.exoplayer2.util.Util.SDK_INT < 21 && "OMX.SEC.mp3.dec".equals(str) && com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equals(com.google.android.exoplayer2.util.Util.MANUFACTURER) && (com.google.android.exoplayer2.util.Util.DEVICE.startsWith("baffin") || com.google.android.exoplayer2.util.Util.DEVICE.startsWith("grand") || com.google.android.exoplayer2.util.Util.DEVICE.startsWith("fortuna") || com.google.android.exoplayer2.util.Util.DEVICE.startsWith("gprimelte") || com.google.android.exoplayer2.util.Util.DEVICE.startsWith("j2y18lte") || com.google.android.exoplayer2.util.Util.DEVICE.startsWith("ms01"));
    }

    private static boolean codecNeedsEosOutputExceptionWorkaround(java.lang.String str) {
        return com.google.android.exoplayer2.util.Util.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean codecNeedsMonoChannelCountWorkaround(java.lang.String str, com.google.android.exoplayer2.Format format) {
        return com.google.android.exoplayer2.util.Util.SDK_INT <= 18 && format.channelCount == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private static final class Api31 {
        private Api31() {
        }

        public static void setLogSessionIdToMediaCodecFormat(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration configuration, com.google.android.exoplayer2.analytics.PlayerId playerId) {
            android.media.metrics.LogSessionId logSessionId = playerId.getLogSessionId();
            if (logSessionId.equals(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            configuration.mediaFormat.setString("log-session-id", logSessionId.getStringId());
        }
    }
}
