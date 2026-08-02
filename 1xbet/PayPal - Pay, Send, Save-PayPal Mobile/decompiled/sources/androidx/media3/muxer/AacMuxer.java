package androidx.media3.muxer;

/* loaded from: classes7.dex */
public final class AacMuxer implements androidx.media3.muxer.Muxer {
    private final androidx.media3.muxer.AacWriter Camera2StreamConfigurationMap;
    private final java.io.FileOutputStream getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;

    public AacMuxer(java.io.FileOutputStream fileOutputStream) {
        this.getHighSpeedVideoFpsRanges = fileOutputStream;
        this.Camera2StreamConfigurationMap = new androidx.media3.muxer.AacWriter(fileOutputStream);
    }

    @Override // androidx.media3.muxer.Muxer
    public final int addTrack(androidx.media3.common.Format format) {
        com.google.common.base.Preconditions.checkArgument(java.util.Objects.equals(format.sampleMimeType, "audio/mp4a-latm"));
        com.google.common.base.Preconditions.checkArgument(!this.getHighSpeedVideoFpsRangesFor, "Only one track is supported.");
        androidx.media3.muxer.AacWriter aacWriter = this.Camera2StreamConfigurationMap;
        com.google.common.base.Preconditions.checkArgument(format.channelCount > 0 && format.channelCount <= 7, "Channel count must be between 1 and 7, got %s", format.channelCount);
        aacWriter.getHighSpeedVideoFpsRanges = ((java.lang.Integer) ((android.util.Pair) com.google.common.base.Preconditions.checkNotNull(androidx.media3.common.util.CodecSpecificDataUtil.getCodecProfileAndLevel(format))).first).intValue();
        aacWriter.getHighResolutionOutputSizeshNQ4ISI = ((java.lang.Integer) com.google.common.base.Preconditions.checkNotNull(androidx.media3.muxer.AacWriter.Camera2StreamConfigurationMap.get(java.lang.Integer.valueOf(format.sampleRate)))).intValue();
        aacWriter.getHighSpeedVideoSizes = format;
        this.getHighSpeedVideoFpsRangesFor = true;
        return 0;
    }

    @Override // androidx.media3.muxer.Muxer
    public final void writeSampleData(int i, java.nio.ByteBuffer byteBuffer, androidx.media3.muxer.BufferInfo bufferInfo) throws androidx.media3.muxer.MuxerException {
        try {
            com.google.common.base.Preconditions.checkArgument(this.getHighSpeedVideoFpsRangesFor, "Track must be added before writing samples.");
            com.google.common.base.Preconditions.checkArgument(i == 0, "This track has not been added to the muxer.");
            androidx.media3.muxer.AacWriter aacWriter = this.Camera2StreamConfigurationMap;
            int i2 = bufferInfo.size + 7;
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(7);
            allocate.put((byte) -1);
            allocate.put((byte) -15);
            int i3 = ((androidx.media3.common.Format) com.google.common.base.Preconditions.checkNotNull(aacWriter.getHighSpeedVideoSizes)).channelCount;
            allocate.put((byte) ((aacWriter.getHighSpeedVideoFpsRanges << 6) | (aacWriter.getHighResolutionOutputSizeshNQ4ISI << 2) | (i3 >> 2)));
            allocate.put((byte) (((i3 & 3) << 6) | ((i2 & 6144) >> 11)));
            allocate.put((byte) ((i2 & 2040) >> 3));
            allocate.put((byte) (((i2 & 7) << 5) | 31));
            allocate.put((byte) -4);
            allocate.flip();
            aacWriter.getHighSpeedVideoFpsRangesFor.write(allocate);
            aacWriter.getHighSpeedVideoFpsRangesFor.write(byteBuffer);
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to write sample for presentationTimeUs=");
            sb.append(bufferInfo.presentationTimeUs);
            sb.append(", size=");
            sb.append(bufferInfo.size);
            throw new androidx.media3.muxer.MuxerException(sb.toString(), e);
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public final void addMetadataEntry(androidx.media3.common.Metadata.Entry entry) {
        throw new java.lang.UnsupportedOperationException("Writing metadata is not supported for AacMuxer.");
    }

    @Override // androidx.media3.muxer.Muxer, java.lang.AutoCloseable
    public final void close() throws androidx.media3.muxer.MuxerException {
        try {
            this.getHighSpeedVideoFpsRanges.close();
        } catch (java.io.IOException e) {
            throw new androidx.media3.muxer.MuxerException("Failed to close the muxer", e);
        }
    }
}
