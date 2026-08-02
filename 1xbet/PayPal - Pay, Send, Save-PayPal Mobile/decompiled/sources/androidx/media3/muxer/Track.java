package androidx.media3.muxer;

/* loaded from: classes7.dex */
final class Track {
    public long Camera2StreamConfigurationMap;
    public final androidx.media3.common.Format getHighResolutionOutputSizeshNQ4ISI;
    public boolean getHighSpeedVideoFpsRanges;
    public byte[] getHighSpeedVideoFpsRangesFor;
    public final int getHighSpeedVideoSizes;
    public final java.util.List<java.lang.Long> getHighSpeedVideoSizesFor;
    public final int getInputFormats;
    public final java.util.Deque<java.nio.ByteBuffer> getInputSizeshNQ4ISI;
    public final java.util.List<java.lang.Integer> getOutputFormats;
    public final java.util.Deque<androidx.media3.muxer.BufferInfo> getOutputMinFrameDuration;
    public final java.util.List<androidx.media3.muxer.BufferInfo> getOutputMinFrameDurationlomOqCM;
    private final boolean getOutputStallDuration;

    public Track(int i, androidx.media3.common.Format format, boolean z) {
        this(i, format, 1, z);
    }

    public Track(int i, androidx.media3.common.Format format, int i2, boolean z) {
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = format;
        this.getInputFormats = i2;
        this.getOutputStallDuration = z;
        this.getOutputMinFrameDurationlomOqCM = new java.util.ArrayList();
        this.getHighSpeedVideoSizesFor = new java.util.ArrayList();
        this.getOutputFormats = new java.util.ArrayList();
        this.getOutputMinFrameDuration = new java.util.ArrayDeque();
        this.getInputSizeshNQ4ISI = new java.util.ArrayDeque();
        this.Camera2StreamConfigurationMap = androidx.media3.common.C.TIME_UNSET;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(java.nio.ByteBuffer byteBuffer, androidx.media3.muxer.BufferInfo bufferInfo) {
        com.google.common.base.Preconditions.checkArgument(this.Camera2StreamConfigurationMap == androidx.media3.common.C.TIME_UNSET, "Samples can not be written after writing a sample with MediaCodec.BUFFER_FLAG_END_OF_STREAM flag");
        if (bufferInfo.size == 0 || byteBuffer.remaining() == 0) {
            if ((bufferInfo.flags & 4) != 0) {
                this.Camera2StreamConfigurationMap = bufferInfo.presentationTimeUs;
                return;
            }
            return;
        }
        if ((bufferInfo.flags & 1) > 0) {
            this.getHighSpeedVideoFpsRanges = true;
        }
        if (this.getHighSpeedVideoFpsRanges || !androidx.media3.common.MimeTypes.isVideo(this.getHighResolutionOutputSizeshNQ4ISI.sampleMimeType)) {
            if (this.getOutputStallDuration) {
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(byteBuffer.remaining());
                allocateDirect.put(byteBuffer);
                allocateDirect.rewind();
                byteBuffer = allocateDirect;
            }
            this.getOutputMinFrameDuration.addLast(new androidx.media3.muxer.BufferInfo(bufferInfo.presentationTimeUs, byteBuffer.remaining(), bufferInfo.flags));
            this.getInputSizeshNQ4ISI.addLast(byteBuffer);
        }
    }
}
