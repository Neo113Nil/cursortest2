package com.google.android.exoplayer2.video.spherical;

/* loaded from: classes3.dex */
public final class CameraMotionRenderer extends com.google.android.exoplayer2.BaseRenderer {
    private static final int SAMPLE_WINDOW_DURATION_US = 100000;
    private static final java.lang.String TAG = "CameraMotionRenderer";
    private final com.google.android.exoplayer2.decoder.DecoderInputBuffer buffer;
    private long lastTimestampUs;
    private com.google.android.exoplayer2.video.spherical.CameraMotionListener listener;
    private long offsetUs;
    private final com.google.android.exoplayer2.util.ParsableByteArray scratch;

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        return true;
    }

    public CameraMotionRenderer() {
        super(6);
        this.buffer = new com.google.android.exoplayer2.decoder.DecoderInputBuffer(1);
        this.scratch = new com.google.android.exoplayer2.util.ParsableByteArray();
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public java.lang.String getName() {
        return TAG;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsFormat(com.google.android.exoplayer2.Format format) {
        if ("application/x-camera-motion".equals(format.sampleMimeType)) {
            return com.google.android.exoplayer2.RendererCapabilities.CC.create(4);
        }
        return com.google.android.exoplayer2.RendererCapabilities.CC.create(0);
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i, java.lang.Object obj) throws com.google.android.exoplayer2.ExoPlaybackException {
        if (i == 8) {
            this.listener = (com.google.android.exoplayer2.video.spherical.CameraMotionListener) obj;
        } else {
            super.handleMessage(i, obj);
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onStreamChanged(com.google.android.exoplayer2.Format[] formatArr, long j, long j2) {
        this.offsetUs = j2;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onPositionReset(long j, boolean z) {
        this.lastTimestampUs = Long.MIN_VALUE;
        resetListener();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onDisabled() {
        resetListener();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long j, long j2) {
        while (!hasReadStreamToEnd() && this.lastTimestampUs < androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + j) {
            this.buffer.clear();
            if (readSource(getFormatHolder(), this.buffer, 0) != -4 || this.buffer.isEndOfStream()) {
                return;
            }
            this.lastTimestampUs = this.buffer.timeUs;
            if (this.listener != null && !this.buffer.isDecodeOnly()) {
                this.buffer.flip();
                float[] parseMetadata = parseMetadata((java.nio.ByteBuffer) com.google.android.exoplayer2.util.Util.castNonNull(this.buffer.data));
                if (parseMetadata != null) {
                    ((com.google.android.exoplayer2.video.spherical.CameraMotionListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onCameraMotion(this.lastTimestampUs - this.offsetUs, parseMetadata);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    private float[] parseMetadata(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.scratch.reset(byteBuffer.array(), byteBuffer.limit());
        this.scratch.setPosition(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = java.lang.Float.intBitsToFloat(this.scratch.readLittleEndianInt());
        }
        return fArr;
    }

    private void resetListener() {
        com.google.android.exoplayer2.video.spherical.CameraMotionListener cameraMotionListener = this.listener;
        if (cameraMotionListener != null) {
            cameraMotionListener.onCameraMotionReset();
        }
    }
}
