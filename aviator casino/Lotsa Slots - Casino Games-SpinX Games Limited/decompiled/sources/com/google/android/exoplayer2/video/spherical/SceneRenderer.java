package com.google.android.exoplayer2.video.spherical;

/* loaded from: classes3.dex */
final class SceneRenderer implements com.google.android.exoplayer2.video.VideoFrameMetadataListener, com.google.android.exoplayer2.video.spherical.CameraMotionListener {
    private static final java.lang.String TAG = "SceneRenderer";
    private byte[] lastProjectionData;
    private android.graphics.SurfaceTexture surfaceTexture;
    private int textureId;
    private final java.util.concurrent.atomic.AtomicBoolean frameAvailable = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean resetRotationAtNextFrame = new java.util.concurrent.atomic.AtomicBoolean(true);
    private final com.google.android.exoplayer2.video.spherical.ProjectionRenderer projectionRenderer = new com.google.android.exoplayer2.video.spherical.ProjectionRenderer();
    private final com.google.android.exoplayer2.video.spherical.FrameRotationQueue frameRotationQueue = new com.google.android.exoplayer2.video.spherical.FrameRotationQueue();
    private final com.google.android.exoplayer2.util.TimedValueQueue<java.lang.Long> sampleTimestampQueue = new com.google.android.exoplayer2.util.TimedValueQueue<>();
    private final com.google.android.exoplayer2.util.TimedValueQueue<com.google.android.exoplayer2.video.spherical.Projection> projectionQueue = new com.google.android.exoplayer2.util.TimedValueQueue<>();
    private final float[] rotationMatrix = new float[16];
    private final float[] tempMatrix = new float[16];
    private volatile int defaultStereoMode = 0;
    private int lastStereoMode = -1;

    public void setDefaultStereoMode(int i) {
        this.defaultStereoMode = i;
    }

    public android.graphics.SurfaceTexture init() {
        try {
            android.opengl.GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            com.google.android.exoplayer2.util.GlUtil.checkGlError();
            this.projectionRenderer.init();
            com.google.android.exoplayer2.util.GlUtil.checkGlError();
            this.textureId = com.google.android.exoplayer2.util.GlUtil.createExternalTexture();
        } catch (com.google.android.exoplayer2.util.GlUtil.GlException e) {
            com.google.android.exoplayer2.util.Log.e(TAG, "Failed to initialize the renderer", e);
        }
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(this.textureId);
        this.surfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new android.graphics.SurfaceTexture.OnFrameAvailableListener() { // from class: com.google.android.exoplayer2.video.spherical.SceneRenderer$$ExternalSyntheticLambda0
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture2) {
                com.google.android.exoplayer2.video.spherical.SceneRenderer.this.m5477x44e5bf0(surfaceTexture2);
            }
        });
        return this.surfaceTexture;
    }

    /* renamed from: lambda$init$0$com-google-android-exoplayer2-video-spherical-SceneRenderer, reason: not valid java name */
    /* synthetic */ void m5477x44e5bf0(android.graphics.SurfaceTexture surfaceTexture) {
        this.frameAvailable.set(true);
    }

    public void drawFrame(float[] fArr, boolean z) {
        android.opengl.GLES20.glClear(16384);
        try {
            com.google.android.exoplayer2.util.GlUtil.checkGlError();
        } catch (com.google.android.exoplayer2.util.GlUtil.GlException e) {
            com.google.android.exoplayer2.util.Log.e(TAG, "Failed to draw a frame", e);
        }
        if (this.frameAvailable.compareAndSet(true, false)) {
            ((android.graphics.SurfaceTexture) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.surfaceTexture)).updateTexImage();
            try {
                com.google.android.exoplayer2.util.GlUtil.checkGlError();
            } catch (com.google.android.exoplayer2.util.GlUtil.GlException e2) {
                com.google.android.exoplayer2.util.Log.e(TAG, "Failed to draw a frame", e2);
            }
            if (this.resetRotationAtNextFrame.compareAndSet(true, false)) {
                com.google.android.exoplayer2.util.GlUtil.setToIdentity(this.rotationMatrix);
            }
            long timestamp = this.surfaceTexture.getTimestamp();
            java.lang.Long poll = this.sampleTimestampQueue.poll(timestamp);
            if (poll != null) {
                this.frameRotationQueue.pollRotationMatrix(this.rotationMatrix, poll.longValue());
            }
            com.google.android.exoplayer2.video.spherical.Projection pollFloor = this.projectionQueue.pollFloor(timestamp);
            if (pollFloor != null) {
                this.projectionRenderer.setProjection(pollFloor);
            }
        }
        android.opengl.Matrix.multiplyMM(this.tempMatrix, 0, fArr, 0, this.rotationMatrix, 0);
        this.projectionRenderer.draw(this.textureId, this.tempMatrix, z);
    }

    public void shutdown() {
        this.projectionRenderer.shutdown();
    }

    @Override // com.google.android.exoplayer2.video.VideoFrameMetadataListener
    public void onVideoFrameAboutToBeRendered(long j, long j2, com.google.android.exoplayer2.Format format, android.media.MediaFormat mediaFormat) {
        this.sampleTimestampQueue.add(j2, java.lang.Long.valueOf(j));
        setProjection(format.projectionData, format.stereoMode, j2);
    }

    @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
    public void onCameraMotion(long j, float[] fArr) {
        this.frameRotationQueue.setRotation(j, fArr);
    }

    @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
    public void onCameraMotionReset() {
        this.sampleTimestampQueue.clear();
        this.frameRotationQueue.reset();
        this.resetRotationAtNextFrame.set(true);
    }

    private void setProjection(byte[] bArr, int i, long j) {
        byte[] bArr2 = this.lastProjectionData;
        int i2 = this.lastStereoMode;
        this.lastProjectionData = bArr;
        if (i == -1) {
            i = this.defaultStereoMode;
        }
        this.lastStereoMode = i;
        if (i2 == i && java.util.Arrays.equals(bArr2, this.lastProjectionData)) {
            return;
        }
        byte[] bArr3 = this.lastProjectionData;
        com.google.android.exoplayer2.video.spherical.Projection decode = bArr3 != null ? com.google.android.exoplayer2.video.spherical.ProjectionDecoder.decode(bArr3, this.lastStereoMode) : null;
        if (decode == null || !com.google.android.exoplayer2.video.spherical.ProjectionRenderer.isSupported(decode)) {
            decode = com.google.android.exoplayer2.video.spherical.Projection.createEquirectangular(this.lastStereoMode);
        }
        this.projectionQueue.add(j, decode);
    }
}
