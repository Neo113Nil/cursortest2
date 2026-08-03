package androidx.media3.exoplayer.video;

/* loaded from: classes2.dex */
public class MediaCodecVideoRenderer extends androidx.media3.exoplayer.mediacodec.MediaCodecRenderer implements androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator {
    private static final int HEVC_MAX_INPUT_SIZE_THRESHOLD = 2097152;
    private static final float INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR = 1.5f;
    private static final java.lang.String KEY_CROP_BOTTOM = "crop-bottom";
    private static final java.lang.String KEY_CROP_LEFT = "crop-left";
    private static final java.lang.String KEY_CROP_RIGHT = "crop-right";
    private static final java.lang.String KEY_CROP_TOP = "crop-top";
    private static final long MIN_EARLY_US_LATE_THRESHOLD = -30000;
    private static final long MIN_EARLY_US_VERY_LATE_THRESHOLD = -500000;
    private static final int[] STANDARD_LONG_EDGE_VIDEO_PX = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static final java.lang.String TAG = "MediaCodecVideoRenderer";
    private static final long TUNNELING_EOS_PRESENTATION_TIME_US = Long.MAX_VALUE;
    private static boolean deviceNeedsSetOutputSurfaceWorkaround;
    private static boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround;
    private int buffersInCodecCount;
    private boolean codecHandlesHdr10PlusOutOfBandMetadata;
    private androidx.media3.exoplayer.video.MediaCodecVideoRenderer.CodecMaxValues codecMaxValues;
    private boolean codecNeedsSetOutputSurfaceWorkaround;
    private int consecutiveDroppedFrameCount;
    private final android.content.Context context;
    private androidx.media3.common.VideoSize decodedVideoSize;
    private final boolean deviceNeedsNoPostProcessWorkaround;
    private android.view.Surface displaySurface;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private final androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher eventDispatcher;
    private androidx.media3.exoplayer.video.VideoFrameMetadataListener frameMetadataListener;
    private boolean hasSetVideoSink;
    private boolean haveReportedFirstFrameRenderedForCurrentSurface;
    private long lastFrameReleaseTimeNs;
    private final int maxDroppedFramesToNotify;
    private androidx.media3.common.util.Size outputResolution;
    private final boolean ownsVideoSink;
    private androidx.media3.exoplayer.video.PlaceholderSurface placeholderSurface;
    private int rendererPriority;
    private androidx.media3.common.VideoSize reportedVideoSize;
    private int scalingMode;
    private long totalVideoFrameProcessingOffsetUs;
    private boolean tunneling;
    private int tunnelingAudioSessionId;
    androidx.media3.exoplayer.video.MediaCodecVideoRenderer.OnFrameRenderedListenerV23 tunnelingOnFrameRenderedListener;
    private java.util.List<androidx.media3.common.Effect> videoEffects;
    private int videoFrameProcessingOffsetCount;
    private final androidx.media3.exoplayer.video.VideoFrameReleaseControl videoFrameReleaseControl;
    private final androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameReleaseInfo videoFrameReleaseInfo;
    private androidx.media3.exoplayer.video.VideoSink videoSink;
    private final androidx.media3.exoplayer.video.VideoSinkProvider videoSinkProvider;

    protected long getBufferTimestampAdjustmentUs() {
        return 0L;
    }

    protected void onReadyToRegisterVideoSinkInputStream() {
    }

    protected boolean shouldDropBuffersToKeyframe(long j, long j2, boolean z) {
        return j < MIN_EARLY_US_VERY_LATE_THRESHOLD && !z;
    }

    protected boolean shouldDropOutputBuffer(long j, long j2, boolean z) {
        return j < MIN_EARLY_US_LATE_THRESHOLD && !z;
    }

    protected boolean shouldForceRenderOutputBuffer(long j, long j2) {
        return j < MIN_EARLY_US_LATE_THRESHOLD && j2 > androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    protected boolean shouldSkipBuffersWithIdenticalReleaseTime() {
        return true;
    }

    public MediaCodecVideoRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, 0L);
    }

    public MediaCodecVideoRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, long j) {
        this(context, mediaCodecSelector, j, null, null, 0);
    }

    public MediaCodecVideoRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, long j, android.os.Handler handler, androidx.media3.exoplayer.video.VideoRendererEventListener videoRendererEventListener, int i) {
        this(context, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory.CC.getDefault(context), mediaCodecSelector, j, false, handler, videoRendererEventListener, i, 30.0f);
    }

    public MediaCodecVideoRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, long j, boolean z, android.os.Handler handler, androidx.media3.exoplayer.video.VideoRendererEventListener videoRendererEventListener, int i) {
        this(context, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory.CC.getDefault(context), mediaCodecSelector, j, z, handler, videoRendererEventListener, i, 30.0f);
    }

    public MediaCodecVideoRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory factory, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, long j, boolean z, android.os.Handler handler, androidx.media3.exoplayer.video.VideoRendererEventListener videoRendererEventListener, int i) {
        this(context, factory, mediaCodecSelector, j, z, handler, videoRendererEventListener, i, 30.0f);
    }

    public MediaCodecVideoRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory factory, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, long j, boolean z, android.os.Handler handler, androidx.media3.exoplayer.video.VideoRendererEventListener videoRendererEventListener, int i, float f) {
        this(context, factory, mediaCodecSelector, j, z, handler, videoRendererEventListener, i, f, null);
    }

    public MediaCodecVideoRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory factory, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, long j, boolean z, android.os.Handler handler, androidx.media3.exoplayer.video.VideoRendererEventListener videoRendererEventListener, int i, float f, androidx.media3.exoplayer.video.VideoSinkProvider videoSinkProvider) {
        super(2, factory, mediaCodecSelector, z, f);
        android.content.Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.maxDroppedFramesToNotify = i;
        this.videoSinkProvider = videoSinkProvider;
        this.eventDispatcher = new androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.ownsVideoSink = videoSinkProvider == null;
        if (videoSinkProvider == null) {
            this.videoFrameReleaseControl = new androidx.media3.exoplayer.video.VideoFrameReleaseControl(applicationContext, this, j);
        } else {
            this.videoFrameReleaseControl = videoSinkProvider.getVideoFrameReleaseControl();
        }
        this.videoFrameReleaseInfo = new androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameReleaseInfo();
        this.deviceNeedsNoPostProcessWorkaround = deviceNeedsNoPostProcessWorkaround();
        this.outputResolution = androidx.media3.common.util.Size.UNKNOWN;
        this.scalingMode = 1;
        this.decodedVideoSize = androidx.media3.common.VideoSize.UNKNOWN;
        this.tunnelingAudioSessionId = 0;
        this.reportedVideoSize = null;
        this.rendererPriority = -1000;
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldForceReleaseFrame(long j, long j2) {
        return shouldForceRenderOutputBuffer(j, j2);
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldDropFrame(long j, long j2, boolean z) {
        return shouldDropOutputBuffer(j, j2, z);
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldIgnoreFrame(long j, long j2, long j3, boolean z, boolean z2) throws androidx.media3.exoplayer.ExoPlaybackException {
        return shouldDropBuffersToKeyframe(j, j3, z) && maybeDropBuffersToKeyframe(j2, z2);
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public java.lang.String getName() {
        return TAG;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int supportsFormat(androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, androidx.media3.common.Format format) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        boolean z;
        int i = 0;
        if (!androidx.media3.common.MimeTypes.isVideo(format.sampleMimeType)) {
            return androidx.media3.exoplayer.RendererCapabilities.CC.create(0);
        }
        boolean z2 = format.drmInitData != null;
        java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> decoderInfos = getDecoderInfos(this.context, mediaCodecSelector, format, z2, false);
        if (z2 && decoderInfos.isEmpty()) {
            decoderInfos = getDecoderInfos(this.context, mediaCodecSelector, format, false, false);
        }
        if (decoderInfos.isEmpty()) {
            return androidx.media3.exoplayer.RendererCapabilities.CC.create(1);
        }
        if (!supportsFormatDrm(format)) {
            return androidx.media3.exoplayer.RendererCapabilities.CC.create(2);
        }
        androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo = decoderInfos.get(0);
        boolean isFormatSupported = mediaCodecInfo.isFormatSupported(format);
        if (!isFormatSupported) {
            for (int i2 = 1; i2 < decoderInfos.size(); i2++) {
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo2 = decoderInfos.get(i2);
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
        if (androidx.media3.common.util.Util.SDK_INT >= 26 && "video/dolby-vision".equals(format.sampleMimeType) && !androidx.media3.exoplayer.video.MediaCodecVideoRenderer.Api26.doesDisplaySupportDolbyVision(this.context)) {
            i6 = 256;
        }
        if (isFormatSupported) {
            java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> decoderInfos2 = getDecoderInfos(this.context, mediaCodecSelector, format, z2, true);
            if (!decoderInfos2.isEmpty()) {
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo3 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecoderInfosSortedByFormatSupport(decoderInfos2, format).get(0);
                if (mediaCodecInfo3.isFormatSupported(format) && mediaCodecInfo3.isSeamlessAdaptationSupported(format)) {
                    i = 32;
                }
            }
        }
        return androidx.media3.exoplayer.RendererCapabilities.CC.create(i3, i4, i, i5, i6);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfos(androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, androidx.media3.common.Format format, boolean z) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        return androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecoderInfosSortedByFormatSupport(getDecoderInfos(this.context, mediaCodecSelector, format, z, this.tunneling), format);
    }

    private static java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfos(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, androidx.media3.common.Format format, boolean z, boolean z2) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        if (format.sampleMimeType == null) {
            return com.google.common.collect.ImmutableList.of();
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 26 && "video/dolby-vision".equals(format.sampleMimeType) && !androidx.media3.exoplayer.video.MediaCodecVideoRenderer.Api26.doesDisplaySupportDolbyVision(context)) {
            java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> alternativeDecoderInfos = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getAlternativeDecoderInfos(mediaCodecSelector, format, z, z2);
            if (!alternativeDecoderInfos.isEmpty()) {
                return alternativeDecoderInfos;
            }
        }
        return androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecoderInfosSoftMatch(mediaCodecSelector, format, z, z2);
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

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onInit() {
        super.onInit();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onEnabled(boolean z, boolean z2) throws androidx.media3.exoplayer.ExoPlaybackException {
        super.onEnabled(z, z2);
        boolean z3 = getConfiguration().tunneling;
        androidx.media3.common.util.Assertions.checkState((z3 && this.tunnelingAudioSessionId == 0) ? false : true);
        if (this.tunneling != z3) {
            this.tunneling = z3;
            releaseCodec();
        }
        this.eventDispatcher.enabled(this.decoderCounters);
        if (!this.hasSetVideoSink) {
            if ((this.videoEffects != null || !this.ownsVideoSink) && this.videoSink == null) {
                androidx.media3.exoplayer.video.VideoSinkProvider videoSinkProvider = this.videoSinkProvider;
                if (videoSinkProvider == null) {
                    videoSinkProvider = new androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Builder(this.context, this.videoFrameReleaseControl).setClock(getClock()).build();
                }
                this.videoSink = videoSinkProvider.getSink();
            }
            this.hasSetVideoSink = true;
        }
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setListener(new androidx.media3.exoplayer.video.VideoSink.Listener() { // from class: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.1
                @Override // androidx.media3.exoplayer.video.VideoSink.Listener
                public void onVideoSizeChanged(androidx.media3.exoplayer.video.VideoSink videoSink2, androidx.media3.common.VideoSize videoSize) {
                }

                @Override // androidx.media3.exoplayer.video.VideoSink.Listener
                public void onFirstFrameRendered(androidx.media3.exoplayer.video.VideoSink videoSink2) {
                    androidx.media3.common.util.Assertions.checkStateNotNull(androidx.media3.exoplayer.video.MediaCodecVideoRenderer.this.displaySurface);
                    androidx.media3.exoplayer.video.MediaCodecVideoRenderer.this.notifyRenderedFirstFrame();
                }

                @Override // androidx.media3.exoplayer.video.VideoSink.Listener
                public void onFrameDropped(androidx.media3.exoplayer.video.VideoSink videoSink2) {
                    androidx.media3.exoplayer.video.MediaCodecVideoRenderer.this.updateDroppedBufferCounters(0, 1);
                }

                @Override // androidx.media3.exoplayer.video.VideoSink.Listener
                public void onError(androidx.media3.exoplayer.video.VideoSink videoSink2, androidx.media3.exoplayer.video.VideoSink.VideoSinkException videoSinkException) {
                    androidx.media3.exoplayer.video.MediaCodecVideoRenderer mediaCodecVideoRenderer = androidx.media3.exoplayer.video.MediaCodecVideoRenderer.this;
                    mediaCodecVideoRenderer.setPendingPlaybackException(mediaCodecVideoRenderer.createRendererException(videoSinkException, videoSinkException.format, 7001));
                }
            }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
            androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
            if (videoFrameMetadataListener != null) {
                this.videoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
            }
            if (this.displaySurface != null && !this.outputResolution.equals(androidx.media3.common.util.Size.UNKNOWN)) {
                this.videoSink.setOutputSurfaceInfo(this.displaySurface, this.outputResolution);
            }
            this.videoSink.setPlaybackSpeed(getPlaybackSpeed());
            java.util.List<androidx.media3.common.Effect> list = this.videoEffects;
            if (list != null) {
                this.videoSink.setVideoEffects(list);
            }
            this.videoSink.onRendererEnabled(z2);
            return;
        }
        this.videoFrameReleaseControl.setClock(getClock());
        this.videoFrameReleaseControl.onEnabled(z2);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public void enableMayRenderStartOfStream() {
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.enableMayRenderStartOfStream();
        } else {
            this.videoFrameReleaseControl.allowReleaseFirstFrameBeforeStarted();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onPositionReset(long j, boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.flush(true);
            this.videoSink.setStreamOffsetAndAdjustmentUs(getOutputStreamOffsetUs(), getBufferTimestampAdjustmentUs());
        }
        super.onPositionReset(j, z);
        if (this.videoSink == null) {
            this.videoFrameReleaseControl.reset();
        }
        if (z) {
            this.videoFrameReleaseControl.join(false);
        }
        maybeSetupTunnelingForFirstFrame();
        this.consecutiveDroppedFrameCount = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        androidx.media3.exoplayer.video.VideoSink videoSink;
        return super.isEnded() && ((videoSink = this.videoSink) == null || videoSink.isEnded());
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        androidx.media3.exoplayer.video.PlaceholderSurface placeholderSurface;
        androidx.media3.exoplayer.video.VideoSink videoSink;
        boolean z = super.isReady() && ((videoSink = this.videoSink) == null || videoSink.isReady());
        if (z && (((placeholderSurface = this.placeholderSurface) != null && this.displaySurface == placeholderSurface) || getCodec() == null || this.tunneling)) {
            return true;
        }
        return this.videoFrameReleaseControl.isReady(z);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onStarted() {
        super.onStarted();
        this.droppedFrames = 0;
        this.droppedFrameAccumulationStartTimeMs = getClock().elapsedRealtime();
        this.totalVideoFrameProcessingOffsetUs = 0L;
        this.videoFrameProcessingOffsetCount = 0;
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.onRendererStarted();
        } else {
            this.videoFrameReleaseControl.onStarted();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onStopped() {
        maybeNotifyDroppedFrames();
        maybeNotifyVideoFrameProcessingOffset();
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.onRendererStopped();
        } else {
            this.videoFrameReleaseControl.onStopped();
        }
        super.onStopped();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onDisabled() {
        this.reportedVideoSize = null;
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.onRendererDisabled();
        } else {
            this.videoFrameReleaseControl.onDisabled();
        }
        maybeSetupTunnelingForFirstFrame();
        this.haveReportedFirstFrameRenderedForCurrentSurface = false;
        this.tunnelingOnFrameRenderedListener = null;
        try {
            super.onDisabled();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
            this.eventDispatcher.videoSizeChanged(androidx.media3.common.VideoSize.UNKNOWN);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onReset() {
        try {
            super.onReset();
        } finally {
            this.hasSetVideoSink = false;
            if (this.placeholderSurface != null) {
                releasePlaceholderSurface();
            }
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onRelease() {
        super.onRelease();
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink == null || !this.ownsVideoSink) {
            return;
        }
        videoSink.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, java.lang.Object obj) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (i == 1) {
            setOutput(obj);
            return;
        }
        if (i == 7) {
            androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener = (androidx.media3.exoplayer.video.VideoFrameMetadataListener) androidx.media3.common.util.Assertions.checkNotNull(obj);
            this.frameMetadataListener = videoFrameMetadataListener;
            androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
            if (videoSink != null) {
                videoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
                return;
            }
            return;
        }
        if (i == 10) {
            int intValue = ((java.lang.Integer) androidx.media3.common.util.Assertions.checkNotNull(obj)).intValue();
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
        if (i == 16) {
            this.rendererPriority = ((java.lang.Integer) androidx.media3.common.util.Assertions.checkNotNull(obj)).intValue();
            updateCodecImportance();
            return;
        }
        if (i == 4) {
            this.scalingMode = ((java.lang.Integer) androidx.media3.common.util.Assertions.checkNotNull(obj)).intValue();
            androidx.media3.exoplayer.mediacodec.MediaCodecAdapter codec = getCodec();
            if (codec != null) {
                codec.setVideoScalingMode(this.scalingMode);
                return;
            }
            return;
        }
        if (i == 5) {
            this.videoFrameReleaseControl.setChangeFrameRateStrategy(((java.lang.Integer) androidx.media3.common.util.Assertions.checkNotNull(obj)).intValue());
            return;
        }
        if (i == 13) {
            setVideoEffects((java.util.List) androidx.media3.common.util.Assertions.checkNotNull(obj));
            return;
        }
        if (i == 14) {
            androidx.media3.common.util.Size size = (androidx.media3.common.util.Size) androidx.media3.common.util.Assertions.checkNotNull(obj);
            if (size.getWidth() == 0 || size.getHeight() == 0) {
                return;
            }
            this.outputResolution = size;
            androidx.media3.exoplayer.video.VideoSink videoSink2 = this.videoSink;
            if (videoSink2 != null) {
                videoSink2.setOutputSurfaceInfo((android.view.Surface) androidx.media3.common.util.Assertions.checkStateNotNull(this.displaySurface), size);
                return;
            }
            return;
        }
        super.handleMessage(i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.media3.exoplayer.video.MediaCodecVideoRenderer] */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.view.Surface] */
    private void setOutput(java.lang.Object obj) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.video.PlaceholderSurface placeholderSurface = obj instanceof android.view.Surface ? (android.view.Surface) obj : null;
        if (placeholderSurface == null) {
            androidx.media3.exoplayer.video.PlaceholderSurface placeholderSurface2 = this.placeholderSurface;
            if (placeholderSurface2 != null) {
                placeholderSurface = placeholderSurface2;
            } else {
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo codecInfo = getCodecInfo();
                if (codecInfo != null && shouldUsePlaceholderSurface(codecInfo)) {
                    placeholderSurface = androidx.media3.exoplayer.video.PlaceholderSurface.newInstance(this.context, codecInfo.secure);
                    this.placeholderSurface = placeholderSurface;
                }
            }
        }
        if (this.displaySurface != placeholderSurface) {
            this.displaySurface = placeholderSurface;
            if (this.videoSink == null) {
                this.videoFrameReleaseControl.setOutputSurface(placeholderSurface);
            }
            this.haveReportedFirstFrameRenderedForCurrentSurface = false;
            int state = getState();
            androidx.media3.exoplayer.mediacodec.MediaCodecAdapter codec = getCodec();
            if (codec != null && this.videoSink == null) {
                if (androidx.media3.common.util.Util.SDK_INT >= 23 && placeholderSurface != null && !this.codecNeedsSetOutputSurfaceWorkaround) {
                    setOutputSurfaceV23(codec, placeholderSurface);
                } else {
                    releaseCodec();
                    maybeInitCodecOrBypass();
                }
            }
            if (placeholderSurface != null && placeholderSurface != this.placeholderSurface) {
                maybeRenotifyVideoSizeChanged();
                if (state == 2) {
                    this.videoFrameReleaseControl.join(true);
                }
            } else {
                this.reportedVideoSize = null;
                androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
                if (videoSink != null) {
                    videoSink.clearOutputSurfaceInfo();
                }
            }
            maybeSetupTunnelingForFirstFrame();
            return;
        }
        if (placeholderSurface == null || placeholderSurface == this.placeholderSurface) {
            return;
        }
        maybeRenotifyVideoSizeChanged();
        maybeRenotifyRenderedFirstFrame();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean shouldInitCodec(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return this.displaySurface != null || shouldUsePlaceholderSurface(mediaCodecInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean getCodecNeedsEosPropagation() {
        return this.tunneling && androidx.media3.common.util.Util.SDK_INT < 23;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration getMediaCodecConfiguration(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format, android.media.MediaCrypto mediaCrypto, float f) {
        androidx.media3.exoplayer.video.PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (placeholderSurface != null && placeholderSurface.secure != mediaCodecInfo.secure) {
            releasePlaceholderSurface();
        }
        java.lang.String str = mediaCodecInfo.codecMimeType;
        androidx.media3.exoplayer.video.MediaCodecVideoRenderer.CodecMaxValues codecMaxValues = getCodecMaxValues(mediaCodecInfo, format, getStreamFormats());
        this.codecMaxValues = codecMaxValues;
        android.media.MediaFormat mediaFormat = getMediaFormat(format, str, codecMaxValues, f, this.deviceNeedsNoPostProcessWorkaround, this.tunneling ? this.tunnelingAudioSessionId : 0);
        if (this.displaySurface == null) {
            if (!shouldUsePlaceholderSurface(mediaCodecInfo)) {
                throw new java.lang.IllegalStateException();
            }
            if (this.placeholderSurface == null) {
                this.placeholderSurface = androidx.media3.exoplayer.video.PlaceholderSurface.newInstance(this.context, mediaCodecInfo.secure);
            }
            this.displaySurface = this.placeholderSurface;
        }
        maybeSetKeyAllowFrameDrop(mediaFormat);
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        return androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration.createForVideoDecoding(mediaCodecInfo, mediaFormat, format, videoSink != null ? videoSink.getInputSurface() : this.displaySurface, mediaCrypto);
    }

    private void maybeSetKeyAllowFrameDrop(android.media.MediaFormat mediaFormat) {
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink == null || videoSink.isFrameDropAllowedOnInput()) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected androidx.media3.exoplayer.DecoderReuseEvaluation canReuseCodec(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format, androidx.media3.common.Format format2) {
        androidx.media3.exoplayer.DecoderReuseEvaluation canReuseCodec = mediaCodecInfo.canReuseCodec(format, format2);
        int i = canReuseCodec.discardReasons;
        androidx.media3.exoplayer.video.MediaCodecVideoRenderer.CodecMaxValues codecMaxValues = (androidx.media3.exoplayer.video.MediaCodecVideoRenderer.CodecMaxValues) androidx.media3.common.util.Assertions.checkNotNull(this.codecMaxValues);
        if (format2.width > codecMaxValues.width || format2.height > codecMaxValues.height) {
            i |= 256;
        }
        if (getMaxInputSize(mediaCodecInfo, format2) > codecMaxValues.inputSize) {
            i |= 64;
        }
        int i2 = i;
        return new androidx.media3.exoplayer.DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, i2 != 0 ? 0 : canReuseCodec.result, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) throws androidx.media3.exoplayer.ExoPlaybackException {
        super.render(j, j2);
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            try {
                videoSink.render(j, j2);
            } catch (androidx.media3.exoplayer.video.VideoSink.VideoSinkException e) {
                throw createRendererException(e, e.format, 7001);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void resetCodecStateForFlush() {
        super.resetCodecStateForFlush();
        this.buffersInCodecCount = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public void setPlaybackSpeed(float f, float f2) throws androidx.media3.exoplayer.ExoPlaybackException {
        super.setPlaybackSpeed(f, f2);
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setPlaybackSpeed(f);
        } else {
            this.videoFrameReleaseControl.setPlaybackSpeed(f);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0087, code lost:
    
        if (r3.equals("video/av01") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getCodecMaxInputSize(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format) {
        int intValue;
        int i = format.width;
        int i2 = format.height;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        java.lang.String str = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType);
        char c = 1;
        if ("video/dolby-vision".equals(str)) {
            android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(format);
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
                if ("BRAVIA 4K 2015".equals(androidx.media3.common.util.Util.MODEL) || ("Amazon".equals(androidx.media3.common.util.Util.MANUFACTURER) && ("KFSOWI".equals(androidx.media3.common.util.Util.MODEL) || ("AFTS".equals(androidx.media3.common.util.Util.MODEL) && mediaCodecInfo.secure)))) {
                    return -1;
                }
                return getMaxSampleSize(androidx.media3.common.util.Util.ceilDivide(i, 16) * androidx.media3.common.util.Util.ceilDivide(i2, 16) * 256, 2);
            case 6:
                return getMaxSampleSize(i * i2, 4);
            default:
                return -1;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected float getCodecOperatingRateV23(float f, androidx.media3.common.Format format, androidx.media3.common.Format[] formatArr) {
        float f2 = -1.0f;
        for (androidx.media3.common.Format format2 : formatArr) {
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

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onReadyToInitializeCodec(androidx.media3.common.Format format) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink == null || videoSink.isInitialized()) {
            return;
        }
        try {
            this.videoSink.initialize(format);
        } catch (androidx.media3.exoplayer.video.VideoSink.VideoSinkException e) {
            throw createRendererException(e, format, 7000);
        }
    }

    public void setVideoEffects(java.util.List<androidx.media3.common.Effect> list) {
        this.videoEffects = list;
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setVideoEffects(list);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onCodecInitialized(java.lang.String str, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration configuration, long j, long j2) {
        this.eventDispatcher.decoderInitialized(str, j, j2);
        this.codecNeedsSetOutputSurfaceWorkaround = codecNeedsSetOutputSurfaceWorkaround(str);
        this.codecHandlesHdr10PlusOutOfBandMetadata = ((androidx.media3.exoplayer.mediacodec.MediaCodecInfo) androidx.media3.common.util.Assertions.checkNotNull(getCodecInfo())).isHdr10PlusOutOfBandMetadataSupported();
        maybeSetupTunnelingForFirstFrame();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onCodecReleased(java.lang.String str) {
        this.eventDispatcher.decoderReleased(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onCodecError(java.lang.Exception exc) {
        androidx.media3.common.util.Log.e(TAG, "Video codec error", exc);
        this.eventDispatcher.videoCodecError(exc);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected androidx.media3.exoplayer.DecoderReuseEvaluation onInputFormatChanged(androidx.media3.exoplayer.FormatHolder formatHolder) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.DecoderReuseEvaluation onInputFormatChanged = super.onInputFormatChanged(formatHolder);
        this.eventDispatcher.inputFormatChanged((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(formatHolder.format), onInputFormatChanged);
        return onInputFormatChanged;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onQueueInputBuffer(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (!this.tunneling) {
            this.buffersInCodecCount++;
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 23 || !this.tunneling) {
            return;
        }
        onProcessedTunneledBuffer(decoderInputBuffer.timeUs);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int getCodecBufferFlags(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
        return (androidx.media3.common.util.Util.SDK_INT < 34 || !this.tunneling || decoderInputBuffer.timeUs >= getLastResetPositionUs()) ? 0 : 32;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onOutputFormatChanged(androidx.media3.common.Format format, android.media.MediaFormat mediaFormat) {
        int integer;
        int integer2;
        int i;
        int i2;
        androidx.media3.exoplayer.mediacodec.MediaCodecAdapter codec = getCodec();
        if (codec != null) {
            codec.setVideoScalingMode(this.scalingMode);
        }
        int i3 = 0;
        if (this.tunneling) {
            i2 = format.width;
            i = format.height;
        } else {
            androidx.media3.common.util.Assertions.checkNotNull(mediaFormat);
            boolean z = mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP);
            if (z) {
                integer = (mediaFormat.getInteger(KEY_CROP_RIGHT) - mediaFormat.getInteger(KEY_CROP_LEFT)) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            if (z) {
                integer2 = (mediaFormat.getInteger(KEY_CROP_BOTTOM) - mediaFormat.getInteger(KEY_CROP_TOP)) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            int i4 = integer;
            i = integer2;
            i2 = i4;
        }
        float f = format.pixelWidthHeightRatio;
        if (codecAppliesRotation()) {
            if (format.rotationDegrees == 90 || format.rotationDegrees == 270) {
                f = 1.0f / f;
                int i5 = i;
                i = i2;
                i2 = i5;
            }
        } else if (this.videoSink == null) {
            i3 = format.rotationDegrees;
        }
        this.decodedVideoSize = new androidx.media3.common.VideoSize(i2, i, i3, f);
        if (this.videoSink != null) {
            onReadyToRegisterVideoSinkInputStream();
            this.videoSink.registerInputStream(1, format.buildUpon().setWidth(i2).setHeight(i).setRotationDegrees(i3).setPixelWidthHeightRatio(f).build());
        } else {
            this.videoFrameReleaseControl.setFrameRate(format.frameRate);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void handleInputBufferSupplementalData(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (this.codecHandlesHdr10PlusOutOfBandMetadata) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(decoderInputBuffer.supplementalData);
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
                        setHdr10PlusInfoV29((androidx.media3.exoplayer.mediacodec.MediaCodecAdapter) androidx.media3.common.util.Assertions.checkNotNull(getCodec()), bArr);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean processOutputBuffer(long j, long j2, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.Format format) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.common.util.Assertions.checkNotNull(mediaCodecAdapter);
        long outputStreamOffsetUs = j3 - getOutputStreamOffsetUs();
        int frameReleaseAction = this.videoFrameReleaseControl.getFrameReleaseAction(j3, j, j2, getOutputStreamStartPositionUs(), z2, this.videoFrameReleaseInfo);
        if (frameReleaseAction == 4) {
            return false;
        }
        if (z && !z2) {
            skipOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs);
            return true;
        }
        if (this.displaySurface == this.placeholderSurface && this.videoSink == null) {
            if (this.videoFrameReleaseInfo.getEarlyUs() >= 30000) {
                return false;
            }
            skipOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            try {
                videoSink.render(j, j2);
                long registerInputFrame = this.videoSink.registerInputFrame(j3 + getBufferTimestampAdjustmentUs(), z2);
                if (registerInputFrame == -9223372036854775807L) {
                    return false;
                }
                renderOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs, registerInputFrame);
                return true;
            } catch (androidx.media3.exoplayer.video.VideoSink.VideoSinkException e) {
                throw createRendererException(e, e.format, 7001);
            }
        }
        if (frameReleaseAction == 0) {
            long nanoTime = getClock().nanoTime();
            notifyFrameMetadataListener(outputStreamOffsetUs, nanoTime, format);
            renderOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs, nanoTime);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        if (frameReleaseAction == 1) {
            return maybeReleaseFrame((androidx.media3.exoplayer.mediacodec.MediaCodecAdapter) androidx.media3.common.util.Assertions.checkStateNotNull(mediaCodecAdapter), i, outputStreamOffsetUs, format);
        }
        if (frameReleaseAction == 2) {
            dropOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        if (frameReleaseAction != 3) {
            if (frameReleaseAction == 5) {
                return false;
            }
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(frameReleaseAction));
        }
        skipOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs);
        updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
        return true;
    }

    private boolean maybeReleaseFrame(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, int i, long j, androidx.media3.common.Format format) {
        long releaseTimeNs = this.videoFrameReleaseInfo.getReleaseTimeNs();
        long earlyUs = this.videoFrameReleaseInfo.getEarlyUs();
        if (androidx.media3.common.util.Util.SDK_INT >= 21) {
            if (shouldSkipBuffersWithIdenticalReleaseTime() && releaseTimeNs == this.lastFrameReleaseTimeNs) {
                skipOutputBuffer(mediaCodecAdapter, i, j);
            } else {
                notifyFrameMetadataListener(j, releaseTimeNs, format);
                renderOutputBufferV21(mediaCodecAdapter, i, j, releaseTimeNs);
            }
            updateVideoFrameProcessingOffsetCounters(earlyUs);
            this.lastFrameReleaseTimeNs = releaseTimeNs;
            return true;
        }
        if (earlyUs >= 30000) {
            return false;
        }
        if (earlyUs > 11000) {
            try {
                java.lang.Thread.sleep((earlyUs - 10000) / 1000);
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
                return false;
            }
        }
        notifyFrameMetadataListener(j, releaseTimeNs, format);
        renderOutputBuffer(mediaCodecAdapter, i, j);
        updateVideoFrameProcessingOffsetCounters(earlyUs);
        return true;
    }

    private void notifyFrameMetadataListener(long j, long j2, androidx.media3.common.Format format) {
        androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, j2, format, getCodecOutputMediaFormat());
        }
    }

    protected void onProcessedTunneledBuffer(long j) throws androidx.media3.exoplayer.ExoPlaybackException {
        updateOutputFormatForTime(j);
        maybeNotifyVideoSizeChanged(this.decodedVideoSize);
        this.decoderCounters.renderedOutputBufferCount++;
        maybeNotifyRenderedFirstFrame();
        onProcessedOutputBuffer(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProcessedTunneledEndOfStream() {
        setPendingOutputEndOfStream();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onProcessedOutputBuffer(long j) {
        super.onProcessedOutputBuffer(j);
        if (this.tunneling) {
            return;
        }
        this.buffersInCodecCount--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onProcessedStreamChange() {
        super.onProcessedStreamChange();
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setStreamOffsetAndAdjustmentUs(getOutputStreamOffsetUs(), getBufferTimestampAdjustmentUs());
        } else {
            this.videoFrameReleaseControl.onProcessedStreamChange();
        }
        maybeSetupTunnelingForFirstFrame();
    }

    protected void skipOutputBuffer(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        androidx.media3.common.util.TraceUtil.beginSection("skipVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, false);
        androidx.media3.common.util.TraceUtil.endSection();
        this.decoderCounters.skippedOutputBufferCount++;
    }

    protected void dropOutputBuffer(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        androidx.media3.common.util.TraceUtil.beginSection("dropVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, false);
        androidx.media3.common.util.TraceUtil.endSection();
        updateDroppedBufferCounters(0, 1);
    }

    protected boolean maybeDropBuffersToKeyframe(long j, boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
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
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.flush(false);
        }
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

    private void renderOutputBuffer(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, int i, long j, long j2) {
        if (androidx.media3.common.util.Util.SDK_INT >= 21) {
            renderOutputBufferV21(mediaCodecAdapter, i, j, j2);
        } else {
            renderOutputBuffer(mediaCodecAdapter, i, j);
        }
    }

    protected void renderOutputBuffer(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        androidx.media3.common.util.TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, true);
        androidx.media3.common.util.TraceUtil.endSection();
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        if (this.videoSink == null) {
            maybeNotifyVideoSizeChanged(this.decodedVideoSize);
            maybeNotifyRenderedFirstFrame();
        }
    }

    protected void renderOutputBufferV21(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, int i, long j, long j2) {
        androidx.media3.common.util.TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, j2);
        androidx.media3.common.util.TraceUtil.endSection();
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        if (this.videoSink == null) {
            maybeNotifyVideoSizeChanged(this.decodedVideoSize);
            maybeNotifyRenderedFirstFrame();
        }
    }

    private boolean shouldUsePlaceholderSurface(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return androidx.media3.common.util.Util.SDK_INT >= 23 && !this.tunneling && !codecNeedsSetOutputSurfaceWorkaround(mediaCodecInfo.name) && (!mediaCodecInfo.secure || androidx.media3.exoplayer.video.PlaceholderSurface.isSecureSupported(this.context));
    }

    private void releasePlaceholderSurface() {
        android.view.Surface surface = this.displaySurface;
        androidx.media3.exoplayer.video.PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (surface == placeholderSurface) {
            this.displaySurface = null;
        }
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.placeholderSurface = null;
        }
    }

    private void maybeSetupTunnelingForFirstFrame() {
        androidx.media3.exoplayer.mediacodec.MediaCodecAdapter codec;
        if (!this.tunneling || androidx.media3.common.util.Util.SDK_INT < 23 || (codec = getCodec()) == null) {
            return;
        }
        this.tunnelingOnFrameRenderedListener = new androidx.media3.exoplayer.video.MediaCodecVideoRenderer.OnFrameRenderedListenerV23(codec);
        if (androidx.media3.common.util.Util.SDK_INT >= 33) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("tunnel-peek", 1);
            codec.setParameters(bundle);
        }
    }

    private void updateCodecImportance() {
        androidx.media3.exoplayer.mediacodec.MediaCodecAdapter codec = getCodec();
        if (codec != null && androidx.media3.common.util.Util.SDK_INT >= 35) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("importance", java.lang.Math.max(0, -this.rendererPriority));
            codec.setParameters(bundle);
        }
    }

    private void maybeNotifyRenderedFirstFrame() {
        if (!this.videoFrameReleaseControl.onFrameReleasedIsFirstFrame() || this.displaySurface == null) {
            return;
        }
        notifyRenderedFirstFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"displaySurface"})
    public void notifyRenderedFirstFrame() {
        this.eventDispatcher.renderedFirstFrame(this.displaySurface);
        this.haveReportedFirstFrameRenderedForCurrentSurface = true;
    }

    private void maybeRenotifyRenderedFirstFrame() {
        android.view.Surface surface = this.displaySurface;
        if (surface == null || !this.haveReportedFirstFrameRenderedForCurrentSurface) {
            return;
        }
        this.eventDispatcher.renderedFirstFrame(surface);
    }

    private void maybeNotifyVideoSizeChanged(androidx.media3.common.VideoSize videoSize) {
        if (videoSize.equals(androidx.media3.common.VideoSize.UNKNOWN) || videoSize.equals(this.reportedVideoSize)) {
            return;
        }
        this.reportedVideoSize = videoSize;
        this.eventDispatcher.videoSizeChanged(videoSize);
    }

    private void maybeRenotifyVideoSizeChanged() {
        androidx.media3.common.VideoSize videoSize = this.reportedVideoSize;
        if (videoSize != null) {
            this.eventDispatcher.videoSizeChanged(videoSize);
        }
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            long elapsedRealtime = getClock().elapsedRealtime();
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

    private static void setHdr10PlusInfoV29(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, byte[] bArr) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        mediaCodecAdapter.setParameters(bundle);
    }

    protected void setOutputSurfaceV23(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, android.view.Surface surface) {
        mediaCodecAdapter.setOutputSurface(surface);
    }

    private static void configureTunnelingV21(android.media.MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    protected android.media.MediaFormat getMediaFormat(androidx.media3.common.Format format, java.lang.String str, androidx.media3.exoplayer.video.MediaCodecVideoRenderer.CodecMaxValues codecMaxValues, float f, boolean z, int i) {
        android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel;
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", format.width);
        mediaFormat.setInteger("height", format.height);
        androidx.media3.common.util.MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        androidx.media3.common.util.MediaFormatUtil.maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        androidx.media3.common.util.MediaFormatUtil.maybeSetInteger(mediaFormat, "rotation-degrees", format.rotationDegrees);
        androidx.media3.common.util.MediaFormatUtil.maybeSetColorInfo(mediaFormat, format.colorInfo);
        if ("video/dolby-vision".equals(format.sampleMimeType) && (codecProfileAndLevel = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(format)) != null) {
            androidx.media3.common.util.MediaFormatUtil.maybeSetInteger(mediaFormat, com.google.android.gms.common.Scopes.PROFILE, ((java.lang.Integer) codecProfileAndLevel.first).intValue());
        }
        mediaFormat.setInteger("max-width", codecMaxValues.width);
        mediaFormat.setInteger("max-height", codecMaxValues.height);
        androidx.media3.common.util.MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", codecMaxValues.inputSize);
        if (androidx.media3.common.util.Util.SDK_INT >= 23) {
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
        if (androidx.media3.common.util.Util.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", java.lang.Math.max(0, -this.rendererPriority));
        }
        return mediaFormat;
    }

    protected androidx.media3.exoplayer.video.MediaCodecVideoRenderer.CodecMaxValues getCodecMaxValues(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format, androidx.media3.common.Format[] formatArr) {
        int codecMaxInputSize;
        int i = format.width;
        int i2 = format.height;
        int maxInputSize = getMaxInputSize(mediaCodecInfo, format);
        if (formatArr.length == 1) {
            if (maxInputSize != -1 && (codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format)) != -1) {
                maxInputSize = java.lang.Math.min((int) (maxInputSize * INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR), codecMaxInputSize);
            }
            return new androidx.media3.exoplayer.video.MediaCodecVideoRenderer.CodecMaxValues(i, i2, maxInputSize);
        }
        int length = formatArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            androidx.media3.common.Format format2 = formatArr[i3];
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
            androidx.media3.common.util.Log.w(TAG, "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
            android.graphics.Point codecMaxSize = getCodecMaxSize(mediaCodecInfo, format);
            if (codecMaxSize != null) {
                i = java.lang.Math.max(i, codecMaxSize.x);
                i2 = java.lang.Math.max(i2, codecMaxSize.y);
                maxInputSize = java.lang.Math.max(maxInputSize, getCodecMaxInputSize(mediaCodecInfo, format.buildUpon().setWidth(i).setHeight(i2).build()));
                androidx.media3.common.util.Log.w(TAG, "Codec max resolution adjusted to: " + i + "x" + i2);
            }
        }
        return new androidx.media3.exoplayer.video.MediaCodecVideoRenderer.CodecMaxValues(i, i2, maxInputSize);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException createDecoderException(java.lang.Throwable th, androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return new androidx.media3.exoplayer.video.MediaCodecVideoDecoderException(th, mediaCodecInfo, this.displaySurface);
    }

    private static android.graphics.Point getCodecMaxSize(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format) {
        boolean z = format.height > format.width;
        int i = z ? format.height : format.width;
        int i2 = z ? format.width : format.height;
        float f = i2 / i;
        for (int i3 : STANDARD_LONG_EDGE_VIDEO_PX) {
            int i4 = (int) (i3 * f);
            if (i3 <= i || i4 <= i2) {
                break;
            }
            if (androidx.media3.common.util.Util.SDK_INT >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                android.graphics.Point alignVideoSizeV21 = mediaCodecInfo.alignVideoSizeV21(i5, i3);
                float f2 = format.frameRate;
                if (alignVideoSizeV21 != null && mediaCodecInfo.isVideoSizeAndRateSupportedV21(alignVideoSizeV21.x, alignVideoSizeV21.y, f2)) {
                    return alignVideoSizeV21;
                }
            } else {
                try {
                    int ceilDivide = androidx.media3.common.util.Util.ceilDivide(i3, 16) * 16;
                    int ceilDivide2 = androidx.media3.common.util.Util.ceilDivide(i4, 16) * 16;
                    if (ceilDivide * ceilDivide2 <= androidx.media3.exoplayer.mediacodec.MediaCodecUtil.maxH264DecodableFrameSize()) {
                        int i6 = z ? ceilDivide2 : ceilDivide;
                        if (!z) {
                            ceilDivide = ceilDivide2;
                        }
                        return new android.graphics.Point(i6, ceilDivide);
                    }
                } catch (androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    protected static int getMaxInputSize(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format) {
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

    private static boolean codecAppliesRotation() {
        return androidx.media3.common.util.Util.SDK_INT >= 21;
    }

    private static boolean deviceNeedsNoPostProcessWorkaround() {
        return "NVIDIA".equals(androidx.media3.common.util.Util.MANUFACTURER);
    }

    protected boolean codecNeedsSetOutputSurfaceWorkaround(java.lang.String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (androidx.media3.exoplayer.video.MediaCodecVideoRenderer.class) {
            if (!evaluatedDeviceNeedsSetOutputSurfaceWorkaround) {
                deviceNeedsSetOutputSurfaceWorkaround = evaluateDeviceNeedsSetOutputSurfaceWorkaround();
                evaluatedDeviceNeedsSetOutputSurfaceWorkaround = true;
            }
        }
        return deviceNeedsSetOutputSurfaceWorkaround;
    }

    protected android.view.Surface getSurface() {
        return this.displaySurface;
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
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0853, code lost:
    
        if (r0.equals("PGN528") == false) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean evaluateDeviceNeedsSetOutputSurfaceWorkaround() {
        char c;
        char c2;
        char c3 = 7;
        if (androidx.media3.common.util.Util.SDK_INT <= 28) {
            java.lang.String str = androidx.media3.common.util.Util.DEVICE;
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
        if (androidx.media3.common.util.Util.SDK_INT <= 27 && "HWEML".equals(androidx.media3.common.util.Util.DEVICE)) {
            return true;
        }
        java.lang.String str2 = androidx.media3.common.util.Util.MODEL;
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
                if (androidx.media3.common.util.Util.SDK_INT <= 26) {
                    java.lang.String str3 = androidx.media3.common.util.Util.DEVICE;
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
                            java.lang.String str4 = androidx.media3.common.util.Util.MODEL;
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

    private final class OnFrameRenderedListenerV23 implements androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener, android.os.Handler.Callback {
        private static final int HANDLE_FRAME_RENDERED = 0;
        private final android.os.Handler handler;

        public OnFrameRenderedListenerV23(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter) {
            android.os.Handler createHandlerForCurrentLooper = androidx.media3.common.util.Util.createHandlerForCurrentLooper(this);
            this.handler = createHandlerForCurrentLooper;
            mediaCodecAdapter.setOnFrameRenderedListener(this, createHandlerForCurrentLooper);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener
        public void onFrameRendered(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, long j, long j2) {
            if (androidx.media3.common.util.Util.SDK_INT < 30) {
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
            handleFrameRendered(androidx.media3.common.util.Util.toLong(message.arg1, message.arg2));
            return true;
        }

        private void handleFrameRendered(long j) {
            if (this != androidx.media3.exoplayer.video.MediaCodecVideoRenderer.this.tunnelingOnFrameRenderedListener || androidx.media3.exoplayer.video.MediaCodecVideoRenderer.this.getCodec() == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                androidx.media3.exoplayer.video.MediaCodecVideoRenderer.this.onProcessedTunneledEndOfStream();
                return;
            }
            try {
                androidx.media3.exoplayer.video.MediaCodecVideoRenderer.this.onProcessedTunneledBuffer(j);
            } catch (androidx.media3.exoplayer.ExoPlaybackException e) {
                androidx.media3.exoplayer.video.MediaCodecVideoRenderer.this.setPendingPlaybackException(e);
            }
        }
    }
}
