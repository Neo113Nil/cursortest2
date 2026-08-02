package androidx.media3.muxer;

/* loaded from: classes7.dex */
public final class WebmMuxer implements androidx.media3.muxer.Muxer {
    private final androidx.media3.muxer.WebmWriter Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRanges;
    private final java.util.List<androidx.media3.muxer.Track> getHighSpeedVideoFpsRangesFor;
    private final androidx.media3.muxer.SeekableMuxerOutput getHighSpeedVideoSizes;

    /* synthetic */ WebmMuxer(androidx.media3.muxer.SeekableMuxerOutput seekableMuxerOutput, boolean z, byte b) {
        this(seekableMuxerOutput, z);
    }

    public static final class Builder {
        private boolean getHighSpeedVideoFpsRanges = true;
        private final androidx.media3.muxer.SeekableMuxerOutput getHighSpeedVideoFpsRangesFor;

        public Builder(androidx.media3.muxer.SeekableMuxerOutput seekableMuxerOutput) {
            this.getHighSpeedVideoFpsRangesFor = seekableMuxerOutput;
        }

        public final androidx.media3.muxer.WebmMuxer.Builder setSampleCopyEnabled(boolean z) {
            this.getHighSpeedVideoFpsRanges = z;
            return this;
        }

        public final androidx.media3.muxer.WebmMuxer build() {
            return new androidx.media3.muxer.WebmMuxer(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, (byte) 0);
        }
    }

    private WebmMuxer(androidx.media3.muxer.SeekableMuxerOutput seekableMuxerOutput, boolean z) {
        this.getHighSpeedVideoSizes = seekableMuxerOutput;
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        this.Camera2StreamConfigurationMap = new androidx.media3.muxer.WebmWriter(seekableMuxerOutput, z);
    }

    @Override // androidx.media3.muxer.Muxer
    public final void writeSampleData(int i, java.nio.ByteBuffer byteBuffer, androidx.media3.muxer.BufferInfo bufferInfo) throws androidx.media3.muxer.MuxerException {
        long min;
        androidx.media3.muxer.Track track = this.getHighSpeedVideoFpsRangesFor.get(i);
        try {
            androidx.media3.muxer.WebmWriter webmWriter = this.Camera2StreamConfigurationMap;
            if (!webmWriter.getOutputSizes) {
                webmWriter.getOutputMinFrameDuration.write(androidx.media3.muxer.WebmElements.getHighSpeedVideoSizes());
                webmWriter.getOutputMinFrameDuration.write(androidx.media3.muxer.WebmElements.getHighSpeedVideoFpsRanges(408125543L));
                webmWriter.getOutputMinFrameDuration.write(androidx.media3.muxer.WebmElements.getHighSpeedVideoFpsRanges(144115188075855871L));
                webmWriter.getHighSpeedVideoSizesFor = webmWriter.getOutputMinFrameDuration.getPosition();
                webmWriter.getOutputMinFrameDuration.write(androidx.media3.muxer.WebmElements.getHighSpeedVideoSizes(72));
                webmWriter.getHighSpeedVideoFpsRanges = webmWriter.getOutputMinFrameDuration.getPosition();
                webmWriter.getOutputMinFrameDuration.write(androidx.media3.muxer.WebmElements.getHighResolutionOutputSizeshNQ4ISI(0.0f));
                webmWriter.getInputSizeshNQ4ISI = webmWriter.getOutputMinFrameDuration.getPosition();
                webmWriter.getOutputMinFrameDuration.write(androidx.media3.muxer.WebmElements.getHighResolutionOutputSizeshNQ4ISI(webmWriter.getHighSpeedVideoSizes));
                webmWriter.getOutputSizes = true;
            }
            if (androidx.media3.muxer.WebmWriter.Camera2StreamConfigurationMap(track, bufferInfo)) {
                webmWriter.getHighSpeedVideoFpsRanges();
            }
            track.getHighResolutionOutputSizeshNQ4ISI(byteBuffer, bufferInfo);
            long j = webmWriter.Camera2StreamConfigurationMap;
            if (j == androidx.media3.common.C.TIME_UNSET) {
                min = bufferInfo.presentationTimeUs;
            } else {
                min = java.lang.Math.min(j, bufferInfo.presentationTimeUs);
            }
            webmWriter.Camera2StreamConfigurationMap = min;
            webmWriter.getHighResolutionOutputSizeshNQ4ISI = java.lang.Math.max(webmWriter.getHighResolutionOutputSizeshNQ4ISI, bufferInfo.presentationTimeUs + (bufferInfo.presentationTimeUs - webmWriter.getOutputFormats.get(track.getHighSpeedVideoSizes, java.lang.Long.valueOf(bufferInfo.presentationTimeUs)).longValue()));
            webmWriter.getOutputFormats.put(track.getHighSpeedVideoSizes, java.lang.Long.valueOf(bufferInfo.presentationTimeUs));
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
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.media3.muxer.Muxer, java.lang.AutoCloseable
    public final void close() throws androidx.media3.muxer.MuxerException {
        try {
            androidx.media3.muxer.WebmWriter webmWriter = this.Camera2StreamConfigurationMap;
            webmWriter.getHighSpeedVideoFpsRanges();
            long position = webmWriter.getOutputMinFrameDuration.getPosition();
            webmWriter.getOutputMinFrameDuration.write(androidx.media3.muxer.WebmElements.getHighResolutionOutputSizeshNQ4ISI(475249515L, webmWriter.getHighSpeedVideoFpsRangesFor));
            long position2 = webmWriter.getOutputMinFrameDuration.getPosition();
            long j = webmWriter.getHighSpeedVideoSizesFor;
            webmWriter.getOutputMinFrameDuration.setPosition(j - 8);
            webmWriter.getOutputMinFrameDuration.write(androidx.media3.muxer.EbmlUtils.Camera2StreamConfigurationMap(position2 - j, 8));
            webmWriter.getOutputMinFrameDuration.setPosition(webmWriter.getHighSpeedVideoFpsRanges);
            webmWriter.getOutputMinFrameDuration.write(androidx.media3.muxer.WebmElements.getHighResolutionOutputSizeshNQ4ISI(androidx.media3.muxer.WebmWriter.getHighSpeedVideoSizes(webmWriter.getHighResolutionOutputSizeshNQ4ISI - webmWriter.Camera2StreamConfigurationMap)));
            com.google.common.base.Preconditions.checkState(webmWriter.getOutputMinFrameDuration.getPosition() == webmWriter.getInputSizeshNQ4ISI);
            webmWriter.getOutputMinFrameDuration.setPosition(webmWriter.getHighSpeedVideoSizesFor);
            long j2 = webmWriter.getHighSpeedVideoFpsRanges;
            long j3 = webmWriter.getHighSpeedVideoSizesFor;
            webmWriter.getOutputMinFrameDuration.write(androidx.media3.muxer.WebmElements.getHighSpeedVideoFpsRangesFor(j2 - j3, webmWriter.getInputSizeshNQ4ISI - j3, position - j3));
            webmWriter.getOutputMinFrameDuration.write(androidx.media3.muxer.WebmElements.getHighSpeedVideoSizes((int) (webmWriter.getHighSpeedVideoFpsRanges - webmWriter.getOutputMinFrameDuration.getPosition())));
            try {
                this.getHighSpeedVideoSizes.close();
            } catch (java.io.IOException e) {
                throw new androidx.media3.muxer.MuxerException("Failed to close the output.", e);
            }
        } catch (java.io.IOException e2) {
            throw new androidx.media3.muxer.MuxerException("Failed to close the writer.", e2);
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public final int addTrack(androidx.media3.common.Format format) {
        com.google.common.base.Preconditions.checkArgument(java.util.Objects.equals(format.sampleMimeType, androidx.media3.common.MimeTypes.VIDEO_VP9) || java.util.Objects.equals(format.sampleMimeType, androidx.media3.common.MimeTypes.VIDEO_VP8) || java.util.Objects.equals(format.sampleMimeType, androidx.media3.common.MimeTypes.AUDIO_OPUS) || java.util.Objects.equals(format.sampleMimeType, androidx.media3.common.MimeTypes.AUDIO_VORBIS));
        androidx.media3.muxer.WebmWriter webmWriter = this.Camera2StreamConfigurationMap;
        int i = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = i + 1;
        com.google.common.base.Preconditions.checkArgument(!webmWriter.getOutputSizes);
        androidx.media3.muxer.Track track = new androidx.media3.muxer.Track(i, format, 1, webmWriter.getInputFormats);
        webmWriter.getHighSpeedVideoSizes.add(track);
        this.getHighSpeedVideoFpsRangesFor.add(track);
        return track.getHighSpeedVideoSizes;
    }
}
