package com.miteksystems.misnap.camera.recording;

@kotlin.Deprecated(message = "Use CameraView/MiSnapView video recording capabilities instead")
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0010\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010&\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010.\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b8G@BX\u0087\u000e¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010-"}, d2 = {"Lcom/miteksystems/misnap/camera/recording/VideoWriter;", "", "Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$VideoRecord;", "videoSettings", "", "outputPath", "<init>", "(Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$VideoRecord;Ljava/lang/String;)V", "", "Camera2StreamConfigurationMap", "()V", "", "endOfStream", "writeVideo", "(Z)V", "release", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Landroid/media/MediaCodec$BufferInfo;", "Landroid/media/MediaCodec$BufferInfo;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/media/MediaFormat;", "Landroid/media/MediaFormat;", "Landroid/media/MediaCodec;", "Landroid/media/MediaCodec;", "getHighSpeedVideoFpsRanges", "Landroid/view/Surface;", "e", "Landroid/view/Surface;", "getInputSurface", "()Landroid/view/Surface;", "inputSurface", "", com.visa.cbp.getEncExpo.warmup, "Landroid/media/MediaMuxer;", "getOutputMinFrameDuration", "Landroid/media/MediaMuxer;", "getHighSpeedVideoSizesFor", "Z", "getInputFormats", "Ljava/lang/Object;", "p0", "j", "hasStreamFinished", "()Z", "streamFinished"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class VideoWriter {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.media.MediaFormat getHighSpeedVideoFpsRangesFor;

    /* renamed from: e, reason: from kotlin metadata */
    private final android.view.Surface inputSurface;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.media.MediaCodec getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.media.MediaCodec.BufferInfo getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private boolean getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizesFor;
    private android.media.MediaMuxer getOutputMinFrameDuration;

    /* renamed from: j, reason: from kotlin metadata */
    private volatile boolean streamFinished;

    public final void writeVideo(boolean endOfStream) {
        synchronized (this.getHighSpeedVideoSizesFor) {
            if (this.streamFinished) {
                return;
            }
            if (endOfStream) {
                this.streamFinished = true;
                this.getHighSpeedVideoFpsRanges.signalEndOfInputStream();
            }
            java.nio.ByteBuffer[] outputBuffers = this.getHighSpeedVideoFpsRanges.getOutputBuffers();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(outputBuffers, "");
            while (true) {
                try {
                    int dequeueOutputBuffer = this.getHighSpeedVideoFpsRanges.dequeueOutputBuffer(this.getHighResolutionOutputSizeshNQ4ISI, 10000L);
                    if (dequeueOutputBuffer == -3) {
                        outputBuffers = this.getHighSpeedVideoFpsRanges.getOutputBuffers();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(outputBuffers, "");
                    } else if (dequeueOutputBuffer != -2) {
                        if (dequeueOutputBuffer == -1) {
                            if (endOfStream) {
                                release();
                            }
                            return;
                        }
                        if (dequeueOutputBuffer < 0) {
                            continue;
                        } else {
                            java.nio.ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                            if (byteBuffer == null) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append("encoderOutputBuffer ");
                                sb.append(dequeueOutputBuffer);
                                sb.append(" was null");
                                throw new java.lang.RuntimeException(sb.toString());
                            }
                            android.media.MediaCodec.BufferInfo bufferInfo = this.getHighResolutionOutputSizeshNQ4ISI;
                            if ((bufferInfo.flags & 2) != 0) {
                                bufferInfo.size = 0;
                            }
                            if (bufferInfo.size == 0) {
                                continue;
                            } else {
                                if (!this.getInputFormats) {
                                    Camera2StreamConfigurationMap();
                                    return;
                                }
                                byteBuffer.position(bufferInfo.offset);
                                android.media.MediaCodec.BufferInfo bufferInfo2 = this.getHighResolutionOutputSizeshNQ4ISI;
                                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                                this.getOutputMinFrameDuration.writeSampleData(this.Camera2StreamConfigurationMap, byteBuffer, this.getHighResolutionOutputSizeshNQ4ISI);
                                this.getHighSpeedVideoFpsRanges.releaseOutputBuffer(dequeueOutputBuffer, false);
                                if ((this.getHighResolutionOutputSizeshNQ4ISI.flags & 4) != 0) {
                                    if (endOfStream) {
                                        release();
                                    }
                                    return;
                                }
                            }
                        }
                    } else {
                        if (this.getInputFormats) {
                            throw new java.lang.RuntimeException("format changed twice");
                        }
                        android.media.MediaFormat outputFormat = this.getHighSpeedVideoFpsRanges.getOutputFormat();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(outputFormat, "");
                        this.Camera2StreamConfigurationMap = this.getOutputMinFrameDuration.addTrack(outputFormat);
                        Camera2StreamConfigurationMap();
                    }
                } catch (java.lang.IllegalStateException unused) {
                    if (endOfStream) {
                        release();
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void release() {
        this.getHighSpeedVideoFpsRanges.stop();
        this.getHighSpeedVideoFpsRanges.release();
        this.getInputFormats = false;
        try {
            this.getOutputMinFrameDuration.release();
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    /* renamed from: hasStreamFinished, reason: from getter */
    public final boolean getStreamFinished() {
        return this.streamFinished;
    }

    public final android.view.Surface getInputSurface() {
        return this.inputSurface;
    }

    private final void Camera2StreamConfigurationMap() {
        if (this.getInputFormats || this.Camera2StreamConfigurationMap < 0) {
            return;
        }
        try {
            try {
                this.getOutputMinFrameDuration.start();
            } catch (java.io.IOException unused) {
            }
        } catch (java.lang.IllegalStateException unused2) {
            android.media.MediaMuxer mediaMuxer = new android.media.MediaMuxer(this.getHighSpeedVideoSizes, 0);
            this.getOutputMinFrameDuration = mediaMuxer;
            this.Camera2StreamConfigurationMap = mediaMuxer.addTrack(this.getHighSpeedVideoFpsRanges.getOutputFormat());
            this.getOutputMinFrameDuration.start();
        }
        this.getInputFormats = true;
    }

    public VideoWriter(com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord videoRecord, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoRecord, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = new android.media.MediaCodec.BufferInfo();
        android.media.MediaFormat createVideoFormat = android.media.MediaFormat.createVideoFormat("video/avc", com.miteksystems.misnap.camera.CameraSettings.getVideoResolution(videoRecord).getWidth(), com.miteksystems.misnap.camera.CameraSettings.getVideoResolution(videoRecord).getHeight());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createVideoFormat, "");
        this.getHighSpeedVideoFpsRangesFor = createVideoFormat;
        android.media.MediaCodec createEncoderByType = android.media.MediaCodec.createEncoderByType("video/avc");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createEncoderByType, "");
        this.getHighSpeedVideoFpsRanges = createEncoderByType;
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", com.miteksystems.misnap.camera.CameraSettings.getVideoBitrate(videoRecord));
        createVideoFormat.setInteger("frame-rate", 30);
        createVideoFormat.setInteger("i-frame-interval", 5);
        createEncoderByType.configure(createVideoFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
        android.view.Surface createInputSurface = createEncoderByType.createInputSurface();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createInputSurface, "");
        this.inputSurface = createInputSurface;
        createEncoderByType.start();
        this.Camera2StreamConfigurationMap = -1;
        this.getOutputMinFrameDuration = new android.media.MediaMuxer(str, 0);
        this.getHighSpeedVideoSizesFor = new java.lang.Object();
    }
}
