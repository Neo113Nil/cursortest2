package androidx.media3.muxer;

/* loaded from: classes7.dex */
public final class MediaMuxerCompat {
    public static final int OUTPUT_FORMAT_MP4 = 0;
    private final androidx.media3.muxer.Muxer getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private final java.io.FileDescriptor getHighSpeedVideoSizes;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface OutputFormat {
    }

    public MediaMuxerCompat(java.io.FileDescriptor fileDescriptor, int i) throws java.io.IOException {
        try {
            java.io.FileDescriptor dup = android.system.Os.dup(fileDescriptor);
            this.getHighSpeedVideoSizes = dup;
            this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(new java.io.FileOutputStream(dup), i);
        } catch (android.system.ErrnoException e) {
            throw new java.io.IOException("Failed to create a copy of FileDescriptor", e);
        }
    }

    public MediaMuxerCompat(java.lang.String str, int i) throws java.io.IOException {
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(new java.io.FileOutputStream(str), i);
    }

    public final void start() {
        com.google.common.base.Preconditions.checkState(!this.getHighSpeedVideoFpsRangesFor);
        com.google.common.base.Preconditions.checkState(!this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRangesFor = true;
    }

    public final int addTrack(android.media.MediaFormat mediaFormat) {
        com.google.common.base.Preconditions.checkState(!this.getHighSpeedVideoFpsRangesFor);
        try {
            float floatFromIntOrFloat = androidx.media3.common.util.MediaFormatUtil.getFloatFromIntOrFloat(mediaFormat, "capture-rate", -3.4028235E38f);
            if (floatFromIntOrFloat != -3.4028235E38f) {
                this.getHighResolutionOutputSizeshNQ4ISI.addMetadataEntry(new androidx.media3.container.MdtaMetadataEntry(androidx.media3.container.MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS, androidx.media3.common.util.Util.toByteArray(floatFromIntOrFloat), 23));
            }
            return this.getHighResolutionOutputSizeshNQ4ISI.addTrack(androidx.media3.common.util.MediaFormatUtil.createFormatFromMediaFormat(mediaFormat));
        } catch (androidx.media3.muxer.MuxerException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public final void writeSampleData(int i, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) {
        com.google.common.base.Preconditions.checkState(this.getHighSpeedVideoFpsRangesFor);
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.writeSampleData(i, byteBuffer, androidx.media3.muxer.MuxerUtil.getMuxerBufferInfoFromMediaCodecBufferInfo(bufferInfo));
        } catch (androidx.media3.muxer.MuxerException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public final void setLocation(float f, float f2) {
        com.google.common.base.Preconditions.checkState(!this.getHighSpeedVideoFpsRangesFor);
        this.getHighResolutionOutputSizeshNQ4ISI.addMetadataEntry(new androidx.media3.container.Mp4LocationData(f, f2));
    }

    public final void setOrientationHint(int i) {
        com.google.common.base.Preconditions.checkState(!this.getHighSpeedVideoFpsRangesFor);
        this.getHighResolutionOutputSizeshNQ4ISI.addMetadataEntry(new androidx.media3.container.Mp4OrientationData(i));
    }

    public final void stop() {
        com.google.common.base.Preconditions.checkState(this.getHighSpeedVideoFpsRangesFor);
        getHighSpeedVideoFpsRanges();
    }

    public final void release() {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        getHighSpeedVideoFpsRanges();
    }

    private void getHighSpeedVideoFpsRanges() {
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.close();
            java.io.FileDescriptor fileDescriptor = this.getHighSpeedVideoSizes;
            if (fileDescriptor != null) {
                android.system.Os.close(fileDescriptor);
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoFpsRangesFor = false;
        } catch (android.system.ErrnoException | androidx.media3.muxer.MuxerException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private static androidx.media3.muxer.Muxer Camera2StreamConfigurationMap(java.io.FileOutputStream fileOutputStream, int i) {
        com.google.common.base.Preconditions.checkArgument(i == 0);
        return new androidx.media3.muxer.Mp4Muxer.Builder(androidx.media3.muxer.SeekableMuxerOutput.of(fileOutputStream)).build();
    }
}
