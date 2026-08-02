package androidx.media3.muxer;

/* loaded from: classes7.dex */
public final class FragmentedMp4Muxer implements androidx.media3.muxer.Muxer {
    public static final long DEFAULT_FRAGMENT_DURATION_MS = 2000;
    private final androidx.media3.muxer.MetadataCollector Camera2StreamConfigurationMap;
    private final android.util.SparseArray<androidx.media3.muxer.Track> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.media3.muxer.FragmentedMp4Writer getHighSpeedVideoFpsRanges;
    public static final com.google.common.collect.ImmutableList<java.lang.String> SUPPORTED_VIDEO_SAMPLE_MIME_TYPES = com.google.common.collect.ImmutableList.of(androidx.media3.common.MimeTypes.VIDEO_AV1, androidx.media3.common.MimeTypes.VIDEO_H263, "video/avc", androidx.media3.common.MimeTypes.VIDEO_H265, androidx.media3.common.MimeTypes.VIDEO_MP4V, androidx.media3.common.MimeTypes.VIDEO_VP9, androidx.media3.common.MimeTypes.VIDEO_APV, androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION);
    public static final com.google.common.collect.ImmutableList<java.lang.String> SUPPORTED_AUDIO_SAMPLE_MIME_TYPES = com.google.common.collect.ImmutableList.of("audio/mp4a-latm", androidx.media3.common.MimeTypes.AUDIO_AMR_NB, androidx.media3.common.MimeTypes.AUDIO_AMR_WB, androidx.media3.common.MimeTypes.AUDIO_OPUS, androidx.media3.common.MimeTypes.AUDIO_VORBIS, androidx.media3.common.MimeTypes.AUDIO_RAW);

    /* synthetic */ FragmentedMp4Muxer(java.nio.channels.WritableByteChannel writableByteChannel, long j, boolean z, byte b) {
        this(writableByteChannel, j, z);
    }

    public static final class Builder {
        private boolean Camera2StreamConfigurationMap;
        private long getHighResolutionOutputSizeshNQ4ISI;
        private final java.nio.channels.WritableByteChannel getHighSpeedVideoFpsRangesFor;

        @java.lang.Deprecated
        public Builder(java.io.OutputStream outputStream) {
            this(java.nio.channels.Channels.newChannel(outputStream));
        }

        public Builder(java.nio.channels.WritableByteChannel writableByteChannel) {
            this.getHighSpeedVideoFpsRangesFor = writableByteChannel;
            this.getHighResolutionOutputSizeshNQ4ISI = 2000L;
            this.Camera2StreamConfigurationMap = true;
        }

        public final androidx.media3.muxer.FragmentedMp4Muxer.Builder setFragmentDurationMs(long j) {
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            return this;
        }

        public final androidx.media3.muxer.FragmentedMp4Muxer.Builder setSampleCopyingEnabled(boolean z) {
            this.Camera2StreamConfigurationMap = z;
            return this;
        }

        public final androidx.media3.muxer.FragmentedMp4Muxer build() {
            return new androidx.media3.muxer.FragmentedMp4Muxer(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, (byte) 0);
        }
    }

    private FragmentedMp4Muxer(java.nio.channels.WritableByteChannel writableByteChannel, long j, boolean z) {
        androidx.media3.muxer.MetadataCollector metadataCollector = new androidx.media3.muxer.MetadataCollector();
        this.Camera2StreamConfigurationMap = metadataCollector;
        this.getHighSpeedVideoFpsRanges = new androidx.media3.muxer.FragmentedMp4Writer(writableByteChannel, metadataCollector, androidx.media3.muxer.AnnexBToAvccConverter.DEFAULT, j, z);
        this.getHighResolutionOutputSizeshNQ4ISI = new android.util.SparseArray<>();
    }

    @Override // androidx.media3.muxer.Muxer
    public final int addTrack(androidx.media3.common.Format format) {
        androidx.media3.muxer.FragmentedMp4Writer fragmentedMp4Writer = this.getHighSpeedVideoFpsRanges;
        int i = fragmentedMp4Writer.getHighSpeedVideoSizesFor;
        fragmentedMp4Writer.getHighSpeedVideoSizesFor = i + 1;
        androidx.media3.muxer.Track track = new androidx.media3.muxer.Track(i, format, fragmentedMp4Writer.getInputFormats);
        fragmentedMp4Writer.getOutputFormats.add(track);
        if (androidx.media3.common.MimeTypes.isVideo(format.sampleMimeType)) {
            fragmentedMp4Writer.getOutputSizeshNQ4ISI = track;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.append(track.getHighSpeedVideoSizes, track);
        return track.getHighSpeedVideoSizes;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r0.getHighResolutionOutputSizeshNQ4ISI >= r0.getHighSpeedVideoFpsRangesFor) goto L25;
     */
    @Override // androidx.media3.muxer.Muxer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeSampleData(int i, java.nio.ByteBuffer byteBuffer, androidx.media3.muxer.BufferInfo bufferInfo) throws androidx.media3.muxer.MuxerException {
        try {
            androidx.media3.muxer.FragmentedMp4Writer fragmentedMp4Writer = this.getHighSpeedVideoFpsRanges;
            androidx.media3.muxer.Track track = this.getHighResolutionOutputSizeshNQ4ISI.get(i);
            if (java.util.Objects.equals(track.getHighResolutionOutputSizeshNQ4ISI.sampleMimeType, androidx.media3.common.MimeTypes.VIDEO_AV1) && track.getHighResolutionOutputSizeshNQ4ISI.initializationData.isEmpty() && track.getHighSpeedVideoFpsRangesFor == null) {
                track.getHighSpeedVideoFpsRangesFor = androidx.media3.muxer.Av1ConfigUtil.getHighSpeedVideoFpsRangesFor(byteBuffer.duplicate());
            }
            if (!fragmentedMp4Writer.getHighSpeedVideoSizes) {
                fragmentedMp4Writer.getInputSizeshNQ4ISI.write(androidx.media3.muxer.Boxes.Camera2StreamConfigurationMap());
                fragmentedMp4Writer.getInputSizeshNQ4ISI.write(androidx.media3.muxer.Boxes.getHighSpeedVideoFpsRanges(fragmentedMp4Writer.getOutputFormats, fragmentedMp4Writer.getHighSpeedVideoFpsRanges, true, fragmentedMp4Writer.Camera2StreamConfigurationMap));
                fragmentedMp4Writer.getHighSpeedVideoSizes = true;
            }
            androidx.media3.muxer.Track track2 = fragmentedMp4Writer.getOutputSizeshNQ4ISI;
            if (track2 != null) {
                if (track.equals(track2) && track.getHighSpeedVideoFpsRanges && (bufferInfo.flags & 1) > 0) {
                    if (((androidx.media3.muxer.BufferInfo) com.google.common.base.Preconditions.checkNotNull(track.getOutputMinFrameDuration.peekLast())).presentationTimeUs - ((androidx.media3.muxer.BufferInfo) com.google.common.base.Preconditions.checkNotNull(track.getOutputMinFrameDuration.peekFirst())).presentationTimeUs >= fragmentedMp4Writer.getHighSpeedVideoFpsRangesFor) {
                        fragmentedMp4Writer.getHighSpeedVideoFpsRanges();
                    }
                }
                track.getHighResolutionOutputSizeshNQ4ISI(byteBuffer, bufferInfo);
                androidx.media3.muxer.BufferInfo bufferInfo2 = (androidx.media3.muxer.BufferInfo) com.google.common.base.Preconditions.checkNotNull(track.getOutputMinFrameDuration.peekFirst());
                androidx.media3.muxer.BufferInfo bufferInfo3 = (androidx.media3.muxer.BufferInfo) com.google.common.base.Preconditions.checkNotNull(track.getOutputMinFrameDuration.peekLast());
                fragmentedMp4Writer.getOutputMinFrameDuration = java.lang.Math.min(fragmentedMp4Writer.getOutputMinFrameDuration, bufferInfo2.presentationTimeUs);
                fragmentedMp4Writer.getHighResolutionOutputSizeshNQ4ISI = java.lang.Math.max(fragmentedMp4Writer.getHighResolutionOutputSizeshNQ4ISI, bufferInfo3.presentationTimeUs - bufferInfo2.presentationTimeUs);
                return;
            }
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to write sample for presentationTimeUs=");
            sb.append(bufferInfo.presentationTimeUs);
            sb.append(", size=");
            sb.append(bufferInfo.size);
            throw new androidx.media3.muxer.MuxerException(sb.toString(), e);
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to write sample for presentationTimeUs=");
        sb2.append(bufferInfo.presentationTimeUs);
        sb2.append(", size=");
        sb2.append(bufferInfo.size);
        throw new androidx.media3.muxer.MuxerException(sb2.toString(), e);
    }

    @Override // androidx.media3.muxer.Muxer
    public final void addMetadataEntry(androidx.media3.common.Metadata.Entry entry) {
        com.google.common.base.Preconditions.checkArgument(androidx.media3.muxer.MuxerUtil.isMetadataSupported(entry), "Unsupported metadata");
        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(entry);
    }

    @Override // androidx.media3.muxer.Muxer, java.lang.AutoCloseable
    public final void close() throws androidx.media3.muxer.MuxerException {
        try {
            androidx.media3.muxer.FragmentedMp4Writer fragmentedMp4Writer = this.getHighSpeedVideoFpsRanges;
            try {
                fragmentedMp4Writer.getHighSpeedVideoFpsRanges();
            } finally {
                fragmentedMp4Writer.getInputSizeshNQ4ISI.close();
            }
        } catch (java.io.IOException e) {
            throw new androidx.media3.muxer.MuxerException("Failed to close the muxer", e);
        }
    }
}
