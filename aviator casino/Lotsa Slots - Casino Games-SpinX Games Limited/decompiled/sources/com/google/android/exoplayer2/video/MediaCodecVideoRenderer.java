package com.google.android.exoplayer2.video;

/* loaded from: classes3.dex */
public class MediaCodecVideoRenderer extends com.google.android.exoplayer2.mediacodec.MediaCodecRenderer {
    private static final int HEVC_MAX_INPUT_SIZE_THRESHOLD = 2097152;
    private static final float INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR = 1.5f;
    private static final java.lang.String KEY_CROP_BOTTOM = "crop-bottom";
    private static final java.lang.String KEY_CROP_LEFT = "crop-left";
    private static final java.lang.String KEY_CROP_RIGHT = "crop-right";
    private static final java.lang.String KEY_CROP_TOP = "crop-top";
    private static final int[] STANDARD_LONG_EDGE_VIDEO_PX = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static final java.lang.String TAG = "MediaCodecVideoRenderer";
    private static final long TUNNELING_EOS_PRESENTATION_TIME_US = Long.MAX_VALUE;
    private static boolean deviceNeedsSetOutputSurfaceWorkaround;
    private static boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround;
    private final long allowedJoiningTimeMs;
    private int buffersInCodecCount;
    private boolean codecHandlesHdr10PlusOutOfBandMetadata;
    private com.google.android.exoplayer2.video.MediaCodecVideoRenderer.CodecMaxValues codecMaxValues;
    private boolean codecNeedsSetOutputSurfaceWorkaround;
    private int consecutiveDroppedFrameCount;
    private final android.content.Context context;
    private int currentHeight;
    private float currentPixelWidthHeightRatio;
    private int currentUnappliedRotationDegrees;
    private int currentWidth;
    private final boolean deviceNeedsNoPostProcessWorkaround;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private final com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher eventDispatcher;
    private com.google.android.exoplayer2.video.VideoFrameMetadataListener frameMetadataListener;
    private final com.google.android.exoplayer2.video.VideoFrameReleaseHelper frameReleaseHelper;
    private boolean haveReportedFirstFrameRenderedForCurrentSurface;
    private long initialPositionUs;
    private long joiningDeadlineMs;
    private long lastBufferPresentationTimeUs;
    private long lastRenderRealtimeUs;
    private final int maxDroppedFramesToNotify;
    private boolean mayRenderFirstFrameAfterEnableIfNotStarted;
    private com.google.android.exoplayer2.video.PlaceholderSurface placeholderSurface;
    private boolean renderedFirstFrameAfterEnable;
    private boolean renderedFirstFrameAfterReset;
    private com.google.android.exoplayer2.video.VideoSize reportedVideoSize;
    private int scalingMode;
    private android.view.Surface surface;
    private long totalVideoFrameProcessingOffsetUs;
    private boolean tunneling;
    private int tunnelingAudioSessionId;
    com.google.android.exoplayer2.video.MediaCodecVideoRenderer.OnFrameRenderedListenerV23 tunnelingOnFrameRenderedListener;
    private int videoFrameProcessingOffsetCount;

    private static boolean isBufferLate(long j) {
        return j < -30000;
    }

    private static boolean isBufferVeryLate(long j) {
        return j < -500000;
    }

    public MediaCodecVideoRenderer(android.content.Context context, com.google.android.exoplayer2.mediacodec.MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, 0L);
    }

    public MediaCodecVideoRenderer(android.content.Context context, com.google.android.exoplayer2.mediacodec.MediaCodecSelector mediaCodecSelector, long j) {
        this(context, mediaCodecSelector, j, null, null, 0);
    }

    public MediaCodecVideoRenderer(android.content.Context context, com.google.android.exoplayer2.mediacodec.MediaCodecSelector mediaCodecSelector, long j, android.os.Handler handler, com.google.android.exoplayer2.video.VideoRendererEventListener videoRendererEventListener, int i) {
        this(context, com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory.DEFAULT, mediaCodecSelector, j, false, handler, videoRendererEventListener, i, 30.0f);
    }

    public MediaCodecVideoRenderer(android.content.Context context, com.google.android.exoplayer2.mediacodec.MediaCodecSelector mediaCodecSelector, long j, boolean z, android.os.Handler handler, com.google.android.exoplayer2.video.VideoRendererEventListener videoRendererEventListener, int i) {
        this(context, com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory.DEFAULT, mediaCodecSelector, j, z, handler, videoRendererEventListener, i, 30.0f);
    }

    public MediaCodecVideoRenderer(android.content.Context context, com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory factory, com.google.android.exoplayer2.mediacodec.MediaCodecSelector mediaCodecSelector, long j, boolean z, android.os.Handler handler, com.google.android.exoplayer2.video.VideoRendererEventListener videoRendererEventListener, int i) {
        this(context, factory, mediaCodecSelector, j, z, handler, videoRendererEventListener, i, 30.0f);
    }

    public MediaCodecVideoRenderer(android.content.Context context, com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory factory, com.google.android.exoplayer2.mediacodec.MediaCodecSelector mediaCodecSelector, long j, boolean z, android.os.Handler handler, com.google.android.exoplayer2.video.VideoRendererEventListener videoRendererEventListener, int i, float f) {
        super(2, factory, mediaCodecSelector, z, f);
        this.allowedJoiningTimeMs = j;
        this.maxDroppedFramesToNotify = i;
        android.content.Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.frameReleaseHelper = new com.google.android.exoplayer2.video.VideoFrameReleaseHelper(applicationContext);
        this.eventDispatcher = new com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.deviceNeedsNoPostProcessWorkaround = deviceNeedsNoPostProcessWorkaround();
        this.joiningDeadlineMs = -9223372036854775807L;
        this.currentWidth = -1;
        this.currentHeight = -1;
        this.currentPixelWidthHeightRatio = -1.0f;
        this.scalingMode = 1;
        this.tunnelingAudioSessionId = 0;
        clearReportedVideoSize();
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public java.lang.String getName() {
        return TAG;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected int supportsFormat(com.google.android.exoplayer2.mediacodec.MediaCodecSelector mediaCodecSelector, com.google.android.exoplayer2.Format format) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
        boolean z;
        int i = 0;
        if (!com.google.android.exoplayer2.util.MimeTypes.isVideo(format.sampleMimeType)) {
            return com.google.android.exoplayer2.RendererCapabilities.CC.create(0);
        }
        boolean z2 = format.drmInitData != null;
        java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> decoderInfos = getDecoderInfos(this.context, mediaCodecSelector, format, z2, false);
        if (z2 && decoderInfos.isEmpty()) {
            decoderInfos = getDecoderInfos(this.context, mediaCodecSelector, format, false, false);
        }
        if (decoderInfos.isEmpty()) {
            return com.google.android.exoplayer2.RendererCapabilities.CC.create(1);
        }
        if (!supportsFormatDrm(format)) {
            return com.google.android.exoplayer2.RendererCapabilities.CC.create(2);
        }
        com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo = decoderInfos.get(0);
        boolean isFormatSupported = mediaCodecInfo.isFormatSupported(format);
        if (!isFormatSupported) {
            for (int i2 = 1; i2 < decoderInfos.size(); i2++) {
                com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo2 = decoderInfos.get(i2);
                if (mediaCodecInfo2.isFormatSupported(format)) {
                    mediaCodecInfo = mediaCodecInfo2;
                    z = false;
                    isFormatSupported = true;
                    break;
                }
            }
        }
        z = true;
        int i3 = isFormatSupported ? 4 : 3;
        int i4 = mediaCodecInfo.isSeamlessAdaptationSupported(format) ? 16 : 8;
        int i5 = mediaCodecInfo.hardwareAccelerated ? 64 : 0;
        int i6 = z ? 128 : 0;
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 26 && "video/dolby-vision".equals(format.sampleMimeType) && !com.google.android.exoplayer2.video.MediaCodecVideoRenderer.Api26.doesDisplaySupportDolbyVision(this.context)) {
            i6 = 256;
        }
        if (isFormatSupported) {
            java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> decoderInfos2 = getDecoderInfos(this.context, mediaCodecSelector, format, z2, true);
            if (!decoderInfos2.isEmpty()) {
                com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo3 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getDecoderInfosSortedByFormatSupport(decoderInfos2, format).get(0);
                if (mediaCodecInfo3.isFormatSupported(format) && mediaCodecInfo3.isSeamlessAdaptationSupported(format)) {
                    i = 32;
                }
            }
        }
        return com.google.android.exoplayer2.RendererCapabilities.CC.create(i3, i4, i, i5, i6);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> getDecoderInfos(com.google.android.exoplayer2.mediacodec.MediaCodecSelector mediaCodecSelector, com.google.android.exoplayer2.Format format, boolean z) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
        return com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getDecoderInfosSortedByFormatSupport(getDecoderInfos(this.context, mediaCodecSelector, format, z, this.tunneling), format);
    }

    private static java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> getDecoderInfos(android.content.Context context, com.google.android.exoplayer2.mediacodec.MediaCodecSelector mediaCodecSelector, com.google.android.exoplayer2.Format format, boolean z, boolean z2) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
        java.lang.String str = format.sampleMimeType;
        if (str == null) {
            return com.google.common.collect.ImmutableList.of();
        }
        java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> decoderInfos = mediaCodecSelector.getDecoderInfos(str, z, z2);
        java.lang.String alternativeCodecMimeType = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getAlternativeCodecMimeType(format);
        if (alternativeCodecMimeType == null) {
            return com.google.common.collect.ImmutableList.copyOf((java.util.Collection) decoderInfos);
        }
        java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> decoderInfos2 = mediaCodecSelector.getDecoderInfos(alternativeCodecMimeType, z, z2);
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 26 && "video/dolby-vision".equals(format.sampleMimeType) && !decoderInfos2.isEmpty() && !com.google.android.exoplayer2.video.MediaCodecVideoRenderer.Api26.doesDisplaySupportDolbyVision(context)) {
            return com.google.common.collect.ImmutableList.copyOf((java.util.Collection) decoderInfos2);
        }
        return com.google.common.collect.ImmutableList.builder().addAll((java.lang.Iterable) decoderInfos).addAll((java.lang.Iterable) decoderInfos2).build();
    }

    private static final class Api26 {
        private Api26() {
        }

        public static boolean doesDisplaySupportDolbyVision(android.content.Context context) {
            android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
            android.view.Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    protected void onEnabled(boolean z, boolean z2) throws com.google.android.exoplayer2.ExoPlaybackException {
        super.onEnabled(z, z2);
        boolean z3 = getConfiguration().tunneling;
        com.google.android.exoplayer2.util.Assertions.checkState((z3 && this.tunnelingAudioSessionId == 0) ? false : true);
        if (this.tunneling != z3) {
            this.tunneling = z3;
            releaseCodec();
        }
        this.eventDispatcher.enabled(this.decoderCounters);
        this.mayRenderFirstFrameAfterEnableIfNotStarted = z2;
        this.renderedFirstFrameAfterEnable = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    protected void onPositionReset(long j, boolean z) throws com.google.android.exoplayer2.ExoPlaybackException {
        super.onPositionReset(j, z);
        clearRenderedFirstFrame();
        this.frameReleaseHelper.onPositionReset();
        this.lastBufferPresentationTimeUs = -9223372036854775807L;
        this.initialPositionUs = -9223372036854775807L;
        this.consecutiveDroppedFrameCount = 0;
        if (z) {
            setJoiningDeadlineMs();
        } else {
            this.joiningDeadlineMs = -9223372036854775807L;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        com.google.android.exoplayer2.video.PlaceholderSurface placeholderSurface;
        if (super.isReady() && (this.renderedFirstFrameAfterReset || (((placeholderSurface = this.placeholderSurface) != null && this.surface == placeholderSurface) || getCodec() == null || this.tunneling))) {
            this.joiningDeadlineMs = -9223372036854775807L;
            return true;
        }
        if (this.joiningDeadlineMs == -9223372036854775807L) {
            return false;
        }
        if (android.os.SystemClock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    protected void onStarted() {
        super.onStarted();
        this.droppedFrames = 0;
        this.droppedFrameAccumulationStartTimeMs = android.os.SystemClock.elapsedRealtime();
        this.lastRenderRealtimeUs = android.os.SystemClock.elapsedRealtime() * 1000;
        this.totalVideoFrameProcessingOffsetUs = 0L;
        this.videoFrameProcessingOffsetCount = 0;
        this.frameReleaseHelper.onStarted();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    protected void onStopped() {
        this.joiningDeadlineMs = -9223372036854775807L;
        maybeNotifyDroppedFrames();
        maybeNotifyVideoFrameProcessingOffset();
        this.frameReleaseHelper.onStopped();
        super.onStopped();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    protected void onDisabled() {
        clearReportedVideoSize();
        clearRenderedFirstFrame();
        this.haveReportedFirstFrameRenderedForCurrentSurface = false;
        this.tunnelingOnFrameRenderedListener = null;
        try {
            super.onDisabled();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    protected void onReset() {
        try {
            super.onReset();
        } finally {
            if (this.placeholderSurface != null) {
                releasePlaceholderSurface();
            }
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i, java.lang.Object obj) throws com.google.android.exoplayer2.ExoPlaybackException {
        if (i == 1) {
            setOutput(obj);
            return;
        }
        if (i == 7) {
            this.frameMetadataListener = (com.google.android.exoplayer2.video.VideoFrameMetadataListener) obj;
            return;
        }
        if (i == 10) {
            int intValue = ((java.lang.Integer) obj).intValue();
            if (this.tunnelingAudioSessionId != intValue) {
                this.tunnelingAudioSessionId = intValue;
                if (this.tunneling) {
                    releaseCodec();
                    return;
                }
                return;
            }
            return;
        }
        if (i != 4) {
            if (i == 5) {
                this.frameReleaseHelper.setChangeFrameRateStrategy(((java.lang.Integer) obj).intValue());
                return;
            } else {
                super.handleMessage(i, obj);
                return;
            }
        }
        this.scalingMode = ((java.lang.Integer) obj).intValue();
        com.google.android.exoplayer2.mediacodec.MediaCodecAdapter codec = getCodec();
        if (codec != null) {
            codec.setVideoScalingMode(this.scalingMode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.video.MediaCodecVideoRenderer] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.Surface] */
    private void setOutput(java.lang.Object obj) throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.video.PlaceholderSurface placeholderSurface = obj instanceof android.view.Surface ? (android.view.Surface) obj : null;
        if (placeholderSurface == null) {
            com.google.android.exoplayer2.video.PlaceholderSurface placeholderSurface2 = this.placeholderSurface;
            if (placeholderSurface2 != null) {
                placeholderSurface = placeholderSurface2;
            } else {
                com.google.android.exoplayer2.mediacodec.MediaCodecInfo codecInfo = getCodecInfo();
                if (codecInfo != null && shouldUsePlaceholderSurface(codecInfo)) {
                    placeholderSurface = com.google.android.exoplayer2.video.PlaceholderSurface.newInstanceV17(this.context, codecInfo.secure);
                    this.placeholderSurface = placeholderSurface;
                }
            }
        }
        if (this.surface != placeholderSurface) {
            this.surface = placeholderSurface;
            this.frameReleaseHelper.onSurfaceChanged(placeholderSurface);
            this.haveReportedFirstFrameRenderedForCurrentSurface = false;
            int state = getState();
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter codec = getCodec();
            if (codec != null) {
                if (com.google.android.exoplayer2.util.Util.SDK_INT >= 23 && placeholderSurface != null && !this.codecNeedsSetOutputSurfaceWorkaround) {
                    setOutputSurfaceV23(codec, placeholderSurface);
                } else {
                    releaseCodec();
                    maybeInitCodecOrBypass();
                }
            }
            if (placeholderSurface != null && placeholderSurface != this.placeholderSurface) {
                maybeRenotifyVideoSizeChanged();
                clearRenderedFirstFrame();
                if (state == 2) {
                    setJoiningDeadlineMs();
                    return;
                }
                return;
            }
            clearReportedVideoSize();
            clearRenderedFirstFrame();
            return;
        }
        if (placeholderSurface == null || placeholderSurface == this.placeholderSurface) {
            return;
        }
        maybeRenotifyVideoSizeChanged();
        maybeRenotifyRenderedFirstFrame();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean shouldInitCodec(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return this.surface != null || shouldUsePlaceholderSurface(mediaCodecInfo);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean getCodecNeedsEosPropagation() {
        return this.tunneling && com.google.android.exoplayer2.util.Util.SDK_INT < 23;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration getMediaCodecConfiguration(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo, com.google.android.exoplayer2.Format format, android.media.MediaCrypto mediaCrypto, float f) {
        com.google.android.exoplayer2.video.PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (placeholderSurface != null && placeholderSurface.secure != mediaCodecInfo.secure) {
            releasePlaceholderSurface();
        }
        java.lang.String str = mediaCodecInfo.codecMimeType;
        com.google.android.exoplayer2.video.MediaCodecVideoRenderer.CodecMaxValues codecMaxValues = getCodecMaxValues(mediaCodecInfo, format, getStreamFormats());
        this.codecMaxValues = codecMaxValues;
        android.media.MediaFormat mediaFormat = getMediaFormat(format, str, codecMaxValues, f, this.deviceNeedsNoPostProcessWorkaround, this.tunneling ? this.tunnelingAudioSessionId : 0);
        if (this.surface == null) {
            if (!shouldUsePlaceholderSurface(mediaCodecInfo)) {
                throw new java.lang.IllegalStateException();
            }
            if (this.placeholderSurface == null) {
                this.placeholderSurface = com.google.android.exoplayer2.video.PlaceholderSurface.newInstanceV17(this.context, mediaCodecInfo.secure);
            }
            this.surface = this.placeholderSurface;
        }
        return com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration.createForVideoDecoding(mediaCodecInfo, mediaFormat, format, this.surface, mediaCrypto);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected com.google.android.exoplayer2.decoder.DecoderReuseEvaluation canReuseCodec(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo, com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.Format format2) {
        com.google.android.exoplayer2.decoder.DecoderReuseEvaluation canReuseCodec = mediaCodecInfo.canReuseCodec(format, format2);
        int i = canReuseCodec.discardReasons;
        if (format2.width > this.codecMaxValues.width || format2.height > this.codecMaxValues.height) {
            i |= 256;
        }
        if (getMaxInputSize(mediaCodecInfo, format2) > this.codecMaxValues.inputSize) {
            i |= 64;
        }
        int i2 = i;
        return new com.google.android.exoplayer2.decoder.DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, i2 != 0 ? 0 : canReuseCodec.result, i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void resetCodecStateForFlush() {
        super.resetCodecStateForFlush();
        this.buffersInCodecCount = 0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public void setPlaybackSpeed(float f, float f2) throws com.google.android.exoplayer2.ExoPlaybackException {
        super.setPlaybackSpeed(f, f2);
        this.frameReleaseHelper.onPlaybackSpeed(f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007a, code lost:
    
        if (r3.equals("video/av01") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getCodecMaxInputSize(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo, com.google.android.exoplayer2.Format format) {
        int intValue;
        int i = format.width;
        int i2 = format.height;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        java.lang.String str = format.sampleMimeType;
        char c = 1;
        if ("video/dolby-vision".equals(str)) {
            android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(format);
            str = (codecProfileAndLevel == null || !((intValue = ((java.lang.Integer) codecProfileAndLevel.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662735862:
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 3:
            case 5:
                return getMaxSampleSize(i * i2, 2);
            case 2:
                return java.lang.Math.max(2097152, getMaxSampleSize(i * i2, 2));
            case 4:
                if ("BRAVIA 4K 2015".equals(com.google.android.exoplayer2.util.Util.MODEL) || ("Amazon".equals(com.google.android.exoplayer2.util.Util.MANUFACTURER) && ("KFSOWI".equals(com.google.android.exoplayer2.util.Util.MODEL) || ("AFTS".equals(com.google.android.exoplayer2.util.Util.MODEL) && mediaCodecInfo.secure)))) {
                    return -1;
                }
                return getMaxSampleSize(com.google.android.exoplayer2.util.Util.ceilDivide(i, 16) * com.google.android.exoplayer2.util.Util.ceilDivide(i2, 16) * 256, 2);
            case 6:
                return getMaxSampleSize(i * i2, 4);
            default:
                return -1;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected float getCodecOperatingRateV23(float f, com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.Format[] formatArr) {
        float f2 = -1.0f;
        for (com.google.android.exoplayer2.Format format2 : formatArr) {
            float f3 = format2.frameRate;
            if (f3 != -1.0f) {
                f2 = java.lang.Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onCodecInitialized(java.lang.String str, com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration configuration, long j, long j2) {
        this.eventDispatcher.decoderInitialized(str, j, j2);
        this.codecNeedsSetOutputSurfaceWorkaround = codecNeedsSetOutputSurfaceWorkaround(str);
        this.codecHandlesHdr10PlusOutOfBandMetadata = ((com.google.android.exoplayer2.mediacodec.MediaCodecInfo) com.google.android.exoplayer2.util.Assertions.checkNotNull(getCodecInfo())).isHdr10PlusOutOfBandMetadataSupported();
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 23 || !this.tunneling) {
            return;
        }
        this.tunnelingOnFrameRenderedListener = new com.google.android.exoplayer2.video.MediaCodecVideoRenderer.OnFrameRenderedListenerV23((com.google.android.exoplayer2.mediacodec.MediaCodecAdapter) com.google.android.exoplayer2.util.Assertions.checkNotNull(getCodec()));
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onCodecReleased(java.lang.String str) {
        this.eventDispatcher.decoderReleased(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onCodecError(java.lang.Exception exc) {
        com.google.android.exoplayer2.util.Log.e(TAG, "Video codec error", exc);
        this.eventDispatcher.videoCodecError(exc);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected com.google.android.exoplayer2.decoder.DecoderReuseEvaluation onInputFormatChanged(com.google.android.exoplayer2.FormatHolder formatHolder) throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.decoder.DecoderReuseEvaluation onInputFormatChanged = super.onInputFormatChanged(formatHolder);
        this.eventDispatcher.inputFormatChanged(formatHolder.format, onInputFormatChanged);
        return onInputFormatChanged;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onQueueInputBuffer(com.google.android.exoplayer2.decoder.DecoderInputBuffer decoderInputBuffer) throws com.google.android.exoplayer2.ExoPlaybackException {
        if (!this.tunneling) {
            this.buffersInCodecCount++;
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 23 || !this.tunneling) {
            return;
        }
        onProcessedTunneledBuffer(decoderInputBuffer.timeUs);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onOutputFormatChanged(com.google.android.exoplayer2.Format format, android.media.MediaFormat mediaFormat) {
        int integer;
        int integer2;
        com.google.android.exoplayer2.mediacodec.MediaCodecAdapter codec = getCodec();
        if (codec != null) {
            codec.setVideoScalingMode(this.scalingMode);
        }
        if (this.tunneling) {
            this.currentWidth = format.width;
            this.currentHeight = format.height;
        } else {
            com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaFormat);
            boolean z = mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP);
            if (z) {
                integer = (mediaFormat.getInteger(KEY_CROP_RIGHT) - mediaFormat.getInteger(KEY_CROP_LEFT)) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.currentWidth = integer;
            if (z) {
                integer2 = (mediaFormat.getInteger(KEY_CROP_BOTTOM) - mediaFormat.getInteger(KEY_CROP_TOP)) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.currentHeight = integer2;
        }
        this.currentPixelWidthHeightRatio = format.pixelWidthHeightRatio;
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 21) {
            if (format.rotationDegrees == 90 || format.rotationDegrees == 270) {
                int i = this.currentWidth;
                this.currentWidth = this.currentHeight;
                this.currentHeight = i;
                this.currentPixelWidthHeightRatio = 1.0f / this.currentPixelWidthHeightRatio;
            }
        } else {
            this.currentUnappliedRotationDegrees = format.rotationDegrees;
        }
        this.frameReleaseHelper.onFormatChanged(format.frameRate);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void handleInputBufferSupplementalData(com.google.android.exoplayer2.decoder.DecoderInputBuffer decoderInputBuffer) throws com.google.android.exoplayer2.ExoPlaybackException {
        if (this.codecHandlesHdr10PlusOutOfBandMetadata) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) com.google.android.exoplayer2.util.Assertions.checkNotNull(decoderInputBuffer.supplementalData);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        setHdr10PlusInfoV29(getCodec(), bArr);
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean processOutputBuffer(long j, long j2, com.google.android.exoplayer2.mediacodec.MediaCodecAdapter mediaCodecAdapter, java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, com.google.android.exoplayer2.Format format) throws com.google.android.exoplayer2.ExoPlaybackException {
        long j4;
        boolean z3;
        com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaCodecAdapter);
        if (this.initialPositionUs == -9223372036854775807L) {
            this.initialPositionUs = j;
        }
        if (j3 != this.lastBufferPresentationTimeUs) {
            this.frameReleaseHelper.onNextFrame(j3);
            this.lastBufferPresentationTimeUs = j3;
        }
        long outputStreamOffsetUs = getOutputStreamOffsetUs();
        long j5 = j3 - outputStreamOffsetUs;
        if (z && !z2) {
            skipOutputBuffer(mediaCodecAdapter, i, j5);
            return true;
        }
        double playbackSpeed = getPlaybackSpeed();
        boolean z4 = getState() == 2;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() * 1000;
        long j6 = (long) ((j3 - j) / playbackSpeed);
        if (z4) {
            j6 -= elapsedRealtime - j2;
        }
        if (this.surface == this.placeholderSurface) {
            if (!isBufferLate(j6)) {
                return false;
            }
            skipOutputBuffer(mediaCodecAdapter, i, j5);
            updateVideoFrameProcessingOffsetCounters(j6);
            return true;
        }
        long j7 = elapsedRealtime - this.lastRenderRealtimeUs;
        if (this.renderedFirstFrameAfterEnable ? this.renderedFirstFrameAfterReset : !(z4 || this.mayRenderFirstFrameAfterEnableIfNotStarted)) {
            j4 = j7;
            z3 = false;
        } else {
            j4 = j7;
            z3 = true;
        }
        if (this.joiningDeadlineMs == -9223372036854775807L && j >= outputStreamOffsetUs && (z3 || (z4 && shouldForceRenderOutputBuffer(j6, j4)))) {
            long nanoTime = java.lang.System.nanoTime();
            notifyFrameMetadataListener(j5, nanoTime, format);
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 21) {
                renderOutputBufferV21(mediaCodecAdapter, i, j5, nanoTime);
            } else {
                renderOutputBuffer(mediaCodecAdapter, i, j5);
            }
            updateVideoFrameProcessingOffsetCounters(j6);
            return true;
        }
        if (z4 && j != this.initialPositionUs) {
            long nanoTime2 = java.lang.System.nanoTime();
            long adjustReleaseTime = this.frameReleaseHelper.adjustReleaseTime((j6 * 1000) + nanoTime2);
            long j8 = (adjustReleaseTime - nanoTime2) / 1000;
            boolean z5 = this.joiningDeadlineMs != -9223372036854775807L;
            if (shouldDropBuffersToKeyframe(j8, j2, z2) && maybeDropBuffersToKeyframe(j, z5)) {
                return false;
            }
            if (shouldDropOutputBuffer(j8, j2, z2)) {
                if (z5) {
                    skipOutputBuffer(mediaCodecAdapter, i, j5);
                } else {
                    dropOutputBuffer(mediaCodecAdapter, i, j5);
                }
                updateVideoFrameProcessingOffsetCounters(j8);
                return true;
            }
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 21) {
                if (j8 < com.unity3d.services.core.di.ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                    notifyFrameMetadataListener(j5, adjustReleaseTime, format);
                    renderOutputBufferV21(mediaCodecAdapter, i, j5, adjustReleaseTime);
                    updateVideoFrameProcessingOffsetCounters(j8);
                    return true;
                }
            } else if (j8 < 30000) {
                if (j8 > 11000) {
                    try {
                        java.lang.Thread.sleep((j8 - 10000) / 1000);
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                        return false;
                    }
                }
                notifyFrameMetadataListener(j5, adjustReleaseTime, format);
                renderOutputBuffer(mediaCodecAdapter, i, j5);
                updateVideoFrameProcessingOffsetCounters(j8);
                return true;
            }
        }
        return false;
    }

    private void notifyFrameMetadataListener(long j, long j2, com.google.android.exoplayer2.Format format) {
        com.google.android.exoplayer2.video.VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, j2, format, getCodecOutputMediaFormat());
        }
    }

    protected void onProcessedTunneledBuffer(long j) throws com.google.android.exoplayer2.ExoPlaybackException {
        updateOutputFormatForTime(j);
        maybeNotifyVideoSizeChanged();
        this.decoderCounters.renderedOutputBufferCount++;
        maybeNotifyRenderedFirstFrame();
        onProcessedOutputBuffer(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProcessedTunneledEndOfStream() {
        setPendingOutputEndOfStream();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onProcessedOutputBuffer(long j) {
        super.onProcessedOutputBuffer(j);
        if (this.tunneling) {
            return;
        }
        this.buffersInCodecCount--;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onProcessedStreamChange() {
        super.onProcessedStreamChange();
        clearRenderedFirstFrame();
    }

    protected boolean shouldDropOutputBuffer(long j, long j2, boolean z) {
        return isBufferLate(j) && !z;
    }

    protected boolean shouldDropBuffersToKeyframe(long j, long j2, boolean z) {
        return isBufferVeryLate(j) && !z;
    }

    protected boolean shouldForceRenderOutputBuffer(long j, long j2) {
        return isBufferLate(j) && j2 > androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    protected void skipOutputBuffer(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        com.google.android.exoplayer2.util.TraceUtil.beginSection("skipVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, false);
        com.google.android.exoplayer2.util.TraceUtil.endSection();
        this.decoderCounters.skippedOutputBufferCount++;
    }

    protected void dropOutputBuffer(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        com.google.android.exoplayer2.util.TraceUtil.beginSection("dropVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, false);
        com.google.android.exoplayer2.util.TraceUtil.endSection();
        updateDroppedBufferCounters(0, 1);
    }

    protected boolean maybeDropBuffersToKeyframe(long j, boolean z) throws com.google.android.exoplayer2.ExoPlaybackException {
        int skipSource = skipSource(j);
        if (skipSource == 0) {
            return false;
        }
        if (z) {
            this.decoderCounters.skippedInputBufferCount += skipSource;
            this.decoderCounters.skippedOutputBufferCount += this.buffersInCodecCount;
        } else {
            this.decoderCounters.droppedToKeyframeCount++;
            updateDroppedBufferCounters(skipSource, this.buffersInCodecCount);
        }
        flushOrReinitializeCodec();
        return true;
    }

    protected void updateDroppedBufferCounters(int i, int i2) {
        this.decoderCounters.droppedInputBufferCount += i;
        int i3 = i + i2;
        this.decoderCounters.droppedBufferCount += i3;
        this.droppedFrames += i3;
        this.consecutiveDroppedFrameCount += i3;
        this.decoderCounters.maxConsecutiveDroppedBufferCount = java.lang.Math.max(this.consecutiveDroppedFrameCount, this.decoderCounters.maxConsecutiveDroppedBufferCount);
        int i4 = this.maxDroppedFramesToNotify;
        if (i4 <= 0 || this.droppedFrames < i4) {
            return;
        }
        maybeNotifyDroppedFrames();
    }

    protected void updateVideoFrameProcessingOffsetCounters(long j) {
        this.decoderCounters.addVideoFrameProcessingOffset(j);
        this.totalVideoFrameProcessingOffsetUs += j;
        this.videoFrameProcessingOffsetCount++;
    }

    protected void renderOutputBuffer(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        maybeNotifyVideoSizeChanged();
        com.google.android.exoplayer2.util.TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, true);
        com.google.android.exoplayer2.util.TraceUtil.endSection();
        this.lastRenderRealtimeUs = android.os.SystemClock.elapsedRealtime() * 1000;
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        maybeNotifyRenderedFirstFrame();
    }

    protected void renderOutputBufferV21(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter mediaCodecAdapter, int i, long j, long j2) {
        maybeNotifyVideoSizeChanged();
        com.google.android.exoplayer2.util.TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, j2);
        com.google.android.exoplayer2.util.TraceUtil.endSection();
        this.lastRenderRealtimeUs = android.os.SystemClock.elapsedRealtime() * 1000;
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        maybeNotifyRenderedFirstFrame();
    }

    private boolean shouldUsePlaceholderSurface(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return com.google.android.exoplayer2.util.Util.SDK_INT >= 23 && !this.tunneling && !codecNeedsSetOutputSurfaceWorkaround(mediaCodecInfo.name) && (!mediaCodecInfo.secure || com.google.android.exoplayer2.video.PlaceholderSurface.isSecureSupported(this.context));
    }

    private void releasePlaceholderSurface() {
        android.view.Surface surface = this.surface;
        com.google.android.exoplayer2.video.PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (surface == placeholderSurface) {
            this.surface = null;
        }
        placeholderSurface.release();
        this.placeholderSurface = null;
    }

    private void setJoiningDeadlineMs() {
        this.joiningDeadlineMs = this.allowedJoiningTimeMs > 0 ? android.os.SystemClock.elapsedRealtime() + this.allowedJoiningTimeMs : -9223372036854775807L;
    }

    private void clearRenderedFirstFrame() {
        com.google.android.exoplayer2.mediacodec.MediaCodecAdapter codec;
        this.renderedFirstFrameAfterReset = false;
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 23 || !this.tunneling || (codec = getCodec()) == null) {
            return;
        }
        this.tunnelingOnFrameRenderedListener = new com.google.android.exoplayer2.video.MediaCodecVideoRenderer.OnFrameRenderedListenerV23(codec);
    }

    void maybeNotifyRenderedFirstFrame() {
        this.renderedFirstFrameAfterEnable = true;
        if (this.renderedFirstFrameAfterReset) {
            return;
        }
        this.renderedFirstFrameAfterReset = true;
        this.eventDispatcher.renderedFirstFrame(this.surface);
        this.haveReportedFirstFrameRenderedForCurrentSurface = true;
    }

    private void maybeRenotifyRenderedFirstFrame() {
        if (this.haveReportedFirstFrameRenderedForCurrentSurface) {
            this.eventDispatcher.renderedFirstFrame(this.surface);
        }
    }

    private void clearReportedVideoSize() {
        this.reportedVideoSize = null;
    }

    private void maybeNotifyVideoSizeChanged() {
        if (this.currentWidth == -1 && this.currentHeight == -1) {
            return;
        }
        com.google.android.exoplayer2.video.VideoSize videoSize = this.reportedVideoSize;
        if (videoSize != null && videoSize.width == this.currentWidth && this.reportedVideoSize.height == this.currentHeight && this.reportedVideoSize.unappliedRotationDegrees == this.currentUnappliedRotationDegrees && this.reportedVideoSize.pixelWidthHeightRatio == this.currentPixelWidthHeightRatio) {
            return;
        }
        com.google.android.exoplayer2.video.VideoSize videoSize2 = new com.google.android.exoplayer2.video.VideoSize(this.currentWidth, this.currentHeight, this.currentUnappliedRotationDegrees, this.currentPixelWidthHeightRatio);
        this.reportedVideoSize = videoSize2;
        this.eventDispatcher.videoSizeChanged(videoSize2);
    }

    private void maybeRenotifyVideoSizeChanged() {
        com.google.android.exoplayer2.video.VideoSize videoSize = this.reportedVideoSize;
        if (videoSize != null) {
            this.eventDispatcher.videoSizeChanged(videoSize);
        }
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            this.eventDispatcher.droppedFrames(this.droppedFrames, elapsedRealtime - this.droppedFrameAccumulationStartTimeMs);
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = elapsedRealtime;
        }
    }

    private void maybeNotifyVideoFrameProcessingOffset() {
        int i = this.videoFrameProcessingOffsetCount;
        if (i != 0) {
            this.eventDispatcher.reportVideoFrameProcessingOffset(this.totalVideoFrameProcessingOffsetUs, i);
            this.totalVideoFrameProcessingOffsetUs = 0L;
            this.videoFrameProcessingOffsetCount = 0;
        }
    }

    private static void setHdr10PlusInfoV29(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter mediaCodecAdapter, byte[] bArr) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        mediaCodecAdapter.setParameters(bundle);
    }

    protected void setOutputSurfaceV23(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter mediaCodecAdapter, android.view.Surface surface) {
        mediaCodecAdapter.setOutputSurface(surface);
    }

    private static void configureTunnelingV21(android.media.MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    protected android.media.MediaFormat getMediaFormat(com.google.android.exoplayer2.Format format, java.lang.String str, com.google.android.exoplayer2.video.MediaCodecVideoRenderer.CodecMaxValues codecMaxValues, float f, boolean z, int i) {
        android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel;
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", format.width);
        mediaFormat.setInteger("height", format.height);
        com.google.android.exoplayer2.util.MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        com.google.android.exoplayer2.util.MediaFormatUtil.maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        com.google.android.exoplayer2.util.MediaFormatUtil.maybeSetInteger(mediaFormat, "rotation-degrees", format.rotationDegrees);
        com.google.android.exoplayer2.util.MediaFormatUtil.maybeSetColorInfo(mediaFormat, format.colorInfo);
        if ("video/dolby-vision".equals(format.sampleMimeType) && (codecProfileAndLevel = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(format)) != null) {
            com.google.android.exoplayer2.util.MediaFormatUtil.maybeSetInteger(mediaFormat, com.google.android.gms.common.Scopes.PROFILE, ((java.lang.Integer) codecProfileAndLevel.first).intValue());
        }
        mediaFormat.setInteger("max-width", codecMaxValues.width);
        mediaFormat.setInteger("max-height", codecMaxValues.height);
        com.google.android.exoplayer2.util.MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", codecMaxValues.inputSize);
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            configureTunnelingV21(mediaFormat, i);
        }
        return mediaFormat;
    }

    protected com.google.android.exoplayer2.video.MediaCodecVideoRenderer.CodecMaxValues getCodecMaxValues(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo, com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.Format[] formatArr) {
        int codecMaxInputSize;
        int i = format.width;
        int i2 = format.height;
        int maxInputSize = getMaxInputSize(mediaCodecInfo, format);
        if (formatArr.length == 1) {
            if (maxInputSize != -1 && (codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format)) != -1) {
                maxInputSize = java.lang.Math.min((int) (maxInputSize * INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR), codecMaxInputSize);
            }
            return new com.google.android.exoplayer2.video.MediaCodecVideoRenderer.CodecMaxValues(i, i2, maxInputSize);
        }
        int length = formatArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            com.google.android.exoplayer2.Format format2 = formatArr[i3];
            if (format.colorInfo != null && format2.colorInfo == null) {
                format2 = format2.buildUpon().setColorInfo(format.colorInfo).build();
            }
            if (mediaCodecInfo.canReuseCodec(format, format2).result != 0) {
                z |= format2.width == -1 || format2.height == -1;
                i = java.lang.Math.max(i, format2.width);
                i2 = java.lang.Math.max(i2, format2.height);
                maxInputSize = java.lang.Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, format2));
            }
        }
        if (z) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
            android.graphics.Point codecMaxSize = getCodecMaxSize(mediaCodecInfo, format);
            if (codecMaxSize != null) {
                i = java.lang.Math.max(i, codecMaxSize.x);
                i2 = java.lang.Math.max(i2, codecMaxSize.y);
                maxInputSize = java.lang.Math.max(maxInputSize, getCodecMaxInputSize(mediaCodecInfo, format.buildUpon().setWidth(i).setHeight(i2).build()));
                com.google.android.exoplayer2.util.Log.w(TAG, "Codec max resolution adjusted to: " + i + "x" + i2);
            }
        }
        return new com.google.android.exoplayer2.video.MediaCodecVideoRenderer.CodecMaxValues(i, i2, maxInputSize);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException createDecoderException(java.lang.Throwable th, com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return new com.google.android.exoplayer2.video.MediaCodecVideoDecoderException(th, mediaCodecInfo, this.surface);
    }

    private static android.graphics.Point getCodecMaxSize(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo, com.google.android.exoplayer2.Format format) {
        boolean z = format.height > format.width;
        int i = z ? format.height : format.width;
        int i2 = z ? format.width : format.height;
        float f = i2 / i;
        for (int i3 : STANDARD_LONG_EDGE_VIDEO_PX) {
            int i4 = (int) (i3 * f);
            if (i3 <= i || i4 <= i2) {
                break;
            }
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                android.graphics.Point alignVideoSizeV21 = mediaCodecInfo.alignVideoSizeV21(i5, i3);
                if (mediaCodecInfo.isVideoSizeAndRateSupportedV21(alignVideoSizeV21.x, alignVideoSizeV21.y, format.frameRate)) {
                    return alignVideoSizeV21;
                }
            } else {
                try {
                    int ceilDivide = com.google.android.exoplayer2.util.Util.ceilDivide(i3, 16) * 16;
                    int ceilDivide2 = com.google.android.exoplayer2.util.Util.ceilDivide(i4, 16) * 16;
                    if (ceilDivide * ceilDivide2 <= com.google.android.exoplayer2.mediacodec.MediaCodecUtil.maxH264DecodableFrameSize()) {
                        int i6 = z ? ceilDivide2 : ceilDivide;
                        if (!z) {
                            ceilDivide = ceilDivide2;
                        }
                        return new android.graphics.Point(i6, ceilDivide);
                    }
                } catch (com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    protected static int getMaxInputSize(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo, com.google.android.exoplayer2.Format format) {
        if (format.maxInputSize != -1) {
            int size = format.initializationData.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += format.initializationData.get(i2).length;
            }
            return format.maxInputSize + i;
        }
        return getCodecMaxInputSize(mediaCodecInfo, format);
    }

    private static boolean deviceNeedsNoPostProcessWorkaround() {
        return "NVIDIA".equals(com.google.android.exoplayer2.util.Util.MANUFACTURER);
    }

    protected boolean codecNeedsSetOutputSurfaceWorkaround(java.lang.String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (com.google.android.exoplayer2.video.MediaCodecVideoRenderer.class) {
            if (!evaluatedDeviceNeedsSetOutputSurfaceWorkaround) {
                deviceNeedsSetOutputSurfaceWorkaround = evaluateDeviceNeedsSetOutputSurfaceWorkaround();
                evaluatedDeviceNeedsSetOutputSurfaceWorkaround = true;
            }
        }
        return deviceNeedsSetOutputSurfaceWorkaround;
    }

    protected android.view.Surface getSurface() {
        return this.surface;
    }

    protected static final class CodecMaxValues {
        public final int height;
        public final int inputSize;
        public final int width;

        public CodecMaxValues(int i, int i2, int i3) {
            this.width = i;
            this.height = i2;
            this.inputSize = i3;
        }
    }

    private static int getMaxSampleSize(int i, int i2) {
        return (i * 3) / (i2 * 2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x084c, code lost:
    
        if (r0.equals("PGN528") == false) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean evaluateDeviceNeedsSetOutputSurfaceWorkaround() {
        char c;
        char c2;
        char c3 = 7;
        if (com.google.android.exoplayer2.util.Util.SDK_INT <= 28) {
            java.lang.String str = com.google.android.exoplayer2.util.Util.DEVICE;
            str.hashCode();
            switch (str.hashCode()) {
                case -1339091551:
                    if (str.equals("dangal")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1220081023:
                    if (str.equals("dangalFHD")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1220066608:
                    if (str.equals("dangalUHD")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1012436106:
                    if (str.equals("oneday")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -760312546:
                    if (str.equals("aquaman")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -64886864:
                    if (str.equals("magnolia")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3415681:
                    if (str.equals("once")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 825323514:
                    if (str.equals("machuca")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
            }
            return true;
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT <= 27 && "HWEML".equals(com.google.android.exoplayer2.util.Util.DEVICE)) {
            return true;
        }
        java.lang.String str2 = com.google.android.exoplayer2.util.Util.MODEL;
        str2.hashCode();
        switch (str2.hashCode()) {
            case -349662828:
                if (str2.equals("AFTJMST12")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -321033677:
                if (str2.equals("AFTKMST12")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2006354:
                if (str2.equals("AFTA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 2006367:
                if (str2.equals("AFTN")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2006371:
                if (str2.equals("AFTR")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1785421873:
                if (str2.equals("AFTEU011")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1785421876:
                if (str2.equals("AFTEU014")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1798172390:
                if (str2.equals("AFTSO001")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2119412532:
                if (str2.equals("AFTEUFF014")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
                break;
            default:
                if (com.google.android.exoplayer2.util.Util.SDK_INT <= 26) {
                    java.lang.String str3 = com.google.android.exoplayer2.util.Util.DEVICE;
                    str3.hashCode();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            if (str3.equals("GIONEE_SWW1609")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -2144781185:
                            if (str3.equals("GIONEE_SWW1627")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -2144781160:
                            if (str3.equals("GIONEE_SWW1631")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -2097309513:
                            if (str3.equals("K50a40")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -2022874474:
                            if (str3.equals("CP8676_I02")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1978993182:
                            if (str3.equals("NX541J")) {
                                c3 = 5;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1978990237:
                            if (str3.equals("NX573J")) {
                                c3 = 6;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1936688988:
                            break;
                        case -1936688066:
                            if (str3.equals("PGN610")) {
                                c3 = '\b';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1936688065:
                            if (str3.equals("PGN611")) {
                                c3 = '\t';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1931988508:
                            if (str3.equals("AquaPowerM")) {
                                c3 = '\n';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1885099851:
                            if (str3.equals("RAIJIN")) {
                                c3 = 11;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1696512866:
                            if (str3.equals("XT1663")) {
                                c3 = '\f';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1680025915:
                            if (str3.equals("ComioS1")) {
                                c3 = '\r';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1615810839:
                            if (str3.equals("Phantom6")) {
                                c3 = 14;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1600724499:
                            if (str3.equals("pacificrim")) {
                                c3 = 15;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1554255044:
                            if (str3.equals("vernee_M5")) {
                                c3 = 16;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1481772737:
                            if (str3.equals("panell_dl")) {
                                c3 = 17;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1481772730:
                            if (str3.equals("panell_ds")) {
                                c3 = 18;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1481772729:
                            if (str3.equals("panell_dt")) {
                                c3 = 19;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1320080169:
                            if (str3.equals("GiONEE_GBL7319")) {
                                c3 = 20;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1217592143:
                            if (str3.equals("BRAVIA_ATV2")) {
                                c3 = 21;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1180384755:
                            if (str3.equals("iris60")) {
                                c3 = 22;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1139198265:
                            if (str3.equals("Slate_Pro")) {
                                c3 = 23;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1052835013:
                            if (str3.equals("namath")) {
                                c3 = 24;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -993250464:
                            if (str3.equals("A10-70F")) {
                                c3 = 25;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -993250458:
                            if (str3.equals("A10-70L")) {
                                c3 = 26;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -965403638:
                            if (str3.equals("s905x018")) {
                                c3 = 27;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -958336948:
                            if (str3.equals("ELUGA_Ray_X")) {
                                c3 = 28;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -879245230:
                            if (str3.equals("tcl_eu")) {
                                c3 = 29;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -842500323:
                            if (str3.equals("nicklaus_f")) {
                                c3 = 30;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -821392978:
                            if (str3.equals("A7000-a")) {
                                c3 = 31;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -797483286:
                            if (str3.equals("SVP-DTV15")) {
                                c3 = ' ';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -794946968:
                            if (str3.equals("watson")) {
                                c3 = '!';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -788334647:
                            if (str3.equals("whyred")) {
                                c3 = '\"';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -782144577:
                            if (str3.equals("OnePlus5T")) {
                                c3 = '#';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -575125681:
                            if (str3.equals("GiONEE_CBL7513")) {
                                c3 = kotlin.text.Typography.dollar;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -521118391:
                            if (str3.equals("GIONEE_GBL7360")) {
                                c3 = '%';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -430914369:
                            if (str3.equals("Pixi4-7_3G")) {
                                c3 = kotlin.text.Typography.amp;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -290434366:
                            if (str3.equals("taido_row")) {
                                c3 = '\'';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -282781963:
                            if (str3.equals("BLACK-1X")) {
                                c3 = '(';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -277133239:
                            if (str3.equals("Z12_PRO")) {
                                c3 = ')';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -173639913:
                            if (str3.equals("ELUGA_A3_Pro")) {
                                c3 = io.ktor.util.date.GMTDateParser.ANY;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -56598463:
                            if (str3.equals("woods_fn")) {
                                c3 = '+';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2126:
                            if (str3.equals("C1")) {
                                c3 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2564:
                            if (str3.equals("Q5")) {
                                c3 = '-';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2715:
                            if (str3.equals("V1")) {
                                c3 = '.';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2719:
                            if (str3.equals("V5")) {
                                c3 = kotlinx.io.files.FileSystemKt.UnixPathSeparator;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3091:
                            if (str3.equals("b5")) {
                                c3 = '0';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3483:
                            if (str3.equals("mh")) {
                                c3 = '1';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 73405:
                            if (str3.equals("JGZ")) {
                                c3 = '2';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 75537:
                            if (str3.equals("M04")) {
                                c3 = '3';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 75739:
                            if (str3.equals("M5c")) {
                                c3 = '4';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 76779:
                            if (str3.equals("MX6")) {
                                c3 = '5';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 78669:
                            if (str3.equals("P85")) {
                                c3 = '6';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 79305:
                            if (str3.equals("PLE")) {
                                c3 = '7';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 80618:
                            if (str3.equals("QX1")) {
                                c3 = '8';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 88274:
                            if (str3.equals("Z80")) {
                                c3 = '9';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 98846:
                            if (str3.equals("cv1")) {
                                c3 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 98848:
                            if (str3.equals("cv3")) {
                                c3 = ';';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 99329:
                            if (str3.equals("deb")) {
                                c3 = kotlin.text.Typography.less;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 101481:
                            if (str3.equals("flo")) {
                                c3 = com.ironsource.B5.U;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1513190:
                            if (str3.equals("1601")) {
                                c3 = kotlin.text.Typography.greater;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1514184:
                            if (str3.equals("1713")) {
                                c3 = '?';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1514185:
                            if (str3.equals("1714")) {
                                c3 = '@';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2133089:
                            if (str3.equals("F01H")) {
                                c3 = 'A';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2133091:
                            if (str3.equals("F01J")) {
                                c3 = 'B';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2133120:
                            if (str3.equals("F02H")) {
                                c3 = 'C';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2133151:
                            if (str3.equals("F03H")) {
                                c3 = 'D';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2133182:
                            if (str3.equals("F04H")) {
                                c3 = 'E';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2133184:
                            if (str3.equals("F04J")) {
                                c3 = 'F';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2436959:
                            if (str3.equals("P681")) {
                                c3 = 'G';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2463773:
                            if (str3.equals("Q350")) {
                                c3 = 'H';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2464648:
                            if (str3.equals("Q427")) {
                                c3 = 'I';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2689555:
                            if (str3.equals("XE2X")) {
                                c3 = 'J';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3154429:
                            if (str3.equals("fugu")) {
                                c3 = 'K';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3284551:
                            if (str3.equals("kate")) {
                                c3 = 'L';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3351335:
                            if (str3.equals("mido")) {
                                c3 = io.ktor.util.date.GMTDateParser.MONTH;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3386211:
                            if (str3.equals("p212")) {
                                c3 = 'N';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 41325051:
                            if (str3.equals("MEIZU_M5")) {
                                c3 = 'O';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 51349633:
                            if (str3.equals("601LV")) {
                                c3 = 'P';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 51350594:
                            if (str3.equals("602LV")) {
                                c3 = 'Q';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 55178625:
                            if (str3.equals("Aura_Note_2")) {
                                c3 = 'R';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 61542055:
                            if (str3.equals("A1601")) {
                                c3 = 'S';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 65355429:
                            if (str3.equals("E5643")) {
                                c3 = 'T';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 66214468:
                            if (str3.equals("F3111")) {
                                c3 = 'U';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 66214470:
                            if (str3.equals("F3113")) {
                                c3 = 'V';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 66214473:
                            if (str3.equals("F3116")) {
                                c3 = 'W';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 66215429:
                            if (str3.equals("F3211")) {
                                c3 = 'X';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 66215431:
                            if (str3.equals("F3213")) {
                                c3 = io.ktor.util.date.GMTDateParser.YEAR;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 66215433:
                            if (str3.equals("F3215")) {
                                c3 = 'Z';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 66216390:
                            if (str3.equals("F3311")) {
                                c3 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 76402249:
                            if (str3.equals("PRO7S")) {
                                c3 = '\\';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 76404105:
                            if (str3.equals("Q4260")) {
                                c3 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 76404911:
                            if (str3.equals("Q4310")) {
                                c3 = '^';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 80963634:
                            if (str3.equals("V23GB")) {
                                c3 = '_';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 82882791:
                            if (str3.equals("X3_HK")) {
                                c3 = '`';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 98715550:
                            if (str3.equals("i9031")) {
                                c3 = 'a';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 101370885:
                            if (str3.equals("l5460")) {
                                c3 = 'b';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 102844228:
                            if (str3.equals("le_x6")) {
                                c3 = 'c';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 165221241:
                            if (str3.equals("A2016a40")) {
                                c3 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 182191441:
                            if (str3.equals("CPY83_I00")) {
                                c3 = 'e';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 245388979:
                            if (str3.equals("marino_f")) {
                                c3 = 'f';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 287431619:
                            if (str3.equals("griffin")) {
                                c3 = 'g';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 307593612:
                            if (str3.equals("A7010a48")) {
                                c3 = io.ktor.util.date.GMTDateParser.HOURS;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 308517133:
                            if (str3.equals("A7020a48")) {
                                c3 = 'i';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 316215098:
                            if (str3.equals("TB3-730F")) {
                                c3 = 'j';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 316215116:
                            if (str3.equals("TB3-730X")) {
                                c3 = 'k';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 316246811:
                            if (str3.equals("TB3-850F")) {
                                c3 = 'l';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 316246818:
                            if (str3.equals("TB3-850M")) {
                                c3 = io.ktor.util.date.GMTDateParser.MINUTES;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 407160593:
                            if (str3.equals("Pixi5-10_4G")) {
                                c3 = 'n';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 507412548:
                            if (str3.equals("QM16XE_U")) {
                                c3 = 'o';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 793982701:
                            if (str3.equals("GIONEE_WBL5708")) {
                                c3 = 'p';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 794038622:
                            if (str3.equals("GIONEE_WBL7365")) {
                                c3 = 'q';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 794040393:
                            if (str3.equals("GIONEE_WBL7519")) {
                                c3 = 'r';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 835649806:
                            if (str3.equals("manning")) {
                                c3 = io.ktor.util.date.GMTDateParser.SECONDS;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 917340916:
                            if (str3.equals("A7000plus")) {
                                c3 = 't';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 958008161:
                            if (str3.equals("j2xlteins")) {
                                c3 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1060579533:
                            if (str3.equals("panell_d")) {
                                c3 = 'v';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1150207623:
                            if (str3.equals("LS-5017")) {
                                c3 = 'w';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1176899427:
                            if (str3.equals("itel_S41")) {
                                c3 = 'x';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1280332038:
                            if (str3.equals("hwALE-H")) {
                                c3 = 'y';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1306947716:
                            if (str3.equals("EverStar_S")) {
                                c3 = io.ktor.util.date.GMTDateParser.ZONE;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1349174697:
                            if (str3.equals("htc_e56ml_dtul")) {
                                c3 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1522194893:
                            if (str3.equals("woods_f")) {
                                c3 = '|';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1691543273:
                            if (str3.equals("CPH1609")) {
                                c3 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1691544261:
                            if (str3.equals("CPH1715")) {
                                c3 = '~';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1709443163:
                            if (str3.equals("iball8735_9806")) {
                                c3 = com.google.common.base.Ascii.MAX;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1865889110:
                            if (str3.equals("santoni")) {
                                c3 = 128;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1906253259:
                            if (str3.equals("PB2-670M")) {
                                c3 = 129;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1977196784:
                            if (str3.equals("Infinix-X572")) {
                                c3 = 130;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2006372676:
                            if (str3.equals("BRAVIA_ATV3_4K")) {
                                c3 = 131;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2019281702:
                            if (str3.equals("DM-01K")) {
                                c3 = 132;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2029784656:
                            if (str3.equals("HWBLN-H")) {
                                c3 = 133;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2030379515:
                            if (str3.equals("HWCAM-H")) {
                                c3 = 134;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2033393791:
                            if (str3.equals("ASUS_X00AD_2")) {
                                c3 = 135;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2047190025:
                            if (str3.equals("ELUGA_Note")) {
                                c3 = 136;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2047252157:
                            if (str3.equals("ELUGA_Prim")) {
                                c3 = 137;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2048319463:
                            if (str3.equals("HWVNS-H")) {
                                c3 = 138;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2048855701:
                            if (str3.equals("HWWAS-H")) {
                                c3 = 139;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        default:
                            java.lang.String str4 = com.google.android.exoplayer2.util.Util.MODEL;
                            str4.hashCode();
                            if (!str4.equals("JSN-L21")) {
                            }
                            break;
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case ' ':
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case '-':
                        case '.':
                        case '/':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case ':':
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '[':
                        case '\\':
                        case ']':
                        case '^':
                        case '_':
                        case '`':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                        case '{':
                        case '|':
                        case '}':
                        case '~':
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                        case MRAID_JS_WRITE_FAILED_VALUE:
                        case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                        case OMSDK_JS_WRITE_FAILED_VALUE:
                        case 134:
                        case 135:
                        case 136:
                        case TPAT_RETRY_FAILED_VALUE:
                        case 138:
                        case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD /* 139 */:
                            return true;
                    }
                }
                break;
        }
        return true;
    }

    private final class OnFrameRenderedListenerV23 implements com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener, android.os.Handler.Callback {
        private static final int HANDLE_FRAME_RENDERED = 0;
        private final android.os.Handler handler;

        public OnFrameRenderedListenerV23(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter mediaCodecAdapter) {
            android.os.Handler createHandlerForCurrentLooper = com.google.android.exoplayer2.util.Util.createHandlerForCurrentLooper(this);
            this.handler = createHandlerForCurrentLooper;
            mediaCodecAdapter.setOnFrameRenderedListener(this, createHandlerForCurrentLooper);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener
        public void onFrameRendered(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter mediaCodecAdapter, long j, long j2) {
            if (com.google.android.exoplayer2.util.Util.SDK_INT < 30) {
                this.handler.sendMessageAtFrontOfQueue(android.os.Message.obtain(this.handler, 0, (int) (j >> 32), (int) j));
            } else {
                handleFrameRendered(j);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            if (message.what != 0) {
                return false;
            }
            handleFrameRendered(com.google.android.exoplayer2.util.Util.toLong(message.arg1, message.arg2));
            return true;
        }

        private void handleFrameRendered(long j) {
            if (this != com.google.android.exoplayer2.video.MediaCodecVideoRenderer.this.tunnelingOnFrameRenderedListener) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                com.google.android.exoplayer2.video.MediaCodecVideoRenderer.this.onProcessedTunneledEndOfStream();
                return;
            }
            try {
                com.google.android.exoplayer2.video.MediaCodecVideoRenderer.this.onProcessedTunneledBuffer(j);
            } catch (com.google.android.exoplayer2.ExoPlaybackException e) {
                com.google.android.exoplayer2.video.MediaCodecVideoRenderer.this.setPendingPlaybackException(e);
            }
        }
    }
}
