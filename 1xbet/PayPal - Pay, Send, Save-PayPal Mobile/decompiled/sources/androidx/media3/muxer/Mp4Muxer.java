package androidx.media3.muxer;

/* loaded from: classes7.dex */
public final class Mp4Muxer implements androidx.media3.muxer.Muxer {
    public static final int FILE_FORMAT_DEFAULT = 0;
    public static final int FILE_FORMAT_MP4_WITH_AUXILIARY_TRACKS_EXTENSION = 1;
    public static final int LAST_SAMPLE_DURATION_BEHAVIOR_SET_FROM_END_OF_STREAM_BUFFER_OR_DUPLICATE_PREVIOUS = 1;
    public static final int LAST_SAMPLE_DURATION_BEHAVIOR_SET_TO_ZERO = 0;
    private androidx.media3.muxer.MetadataCollector Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.media3.muxer.AnnexBToAvccConverter getHighSpeedVideoFpsRanges;
    private final java.util.List<androidx.media3.muxer.Track> getHighSpeedVideoFpsRangesFor;
    private androidx.media3.muxer.Mp4Writer getHighSpeedVideoSizes;
    private androidx.media3.muxer.SeekableMuxerOutput getHighSpeedVideoSizesFor;
    private java.lang.String getInputFormats;
    private final int getInputSizeshNQ4ISI;
    private final com.google.common.base.Supplier<java.lang.String> getOutputFormats;
    private final int getOutputMinFrameDuration;
    private final androidx.media3.muxer.Mp4Writer getOutputMinFrameDurationlomOqCM;
    private final androidx.media3.muxer.Mp4Muxer.Mp4AtFileParameters getOutputSizes;
    private int getOutputSizeshNQ4ISI;
    private final androidx.media3.muxer.MetadataCollector getOutputStallDuration;
    private final androidx.media3.muxer.SeekableMuxerOutput getOutputStallDurationlomOqCM;
    private final boolean isOutputSupportedFor;
    private final boolean isOutputSupportedForhNQ4ISI;
    private final java.util.List<androidx.media3.muxer.Track> toString;
    private final int unwrapAs;
    public static final com.google.common.collect.ImmutableList<java.lang.String> SUPPORTED_VIDEO_SAMPLE_MIME_TYPES = com.google.common.collect.ImmutableList.of(androidx.media3.common.MimeTypes.VIDEO_AV1, androidx.media3.common.MimeTypes.VIDEO_H263, "video/avc", androidx.media3.common.MimeTypes.VIDEO_H265, androidx.media3.common.MimeTypes.VIDEO_MP4V, androidx.media3.common.MimeTypes.VIDEO_VP9, androidx.media3.common.MimeTypes.VIDEO_APV, androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION);
    public static final com.google.common.collect.ImmutableList<java.lang.String> SUPPORTED_AUDIO_SAMPLE_MIME_TYPES = com.google.common.collect.ImmutableList.of("audio/mp4a-latm", androidx.media3.common.MimeTypes.AUDIO_AMR_NB, androidx.media3.common.MimeTypes.AUDIO_AMR_WB, androidx.media3.common.MimeTypes.AUDIO_OPUS, androidx.media3.common.MimeTypes.AUDIO_VORBIS, androidx.media3.common.MimeTypes.AUDIO_RAW);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface FileFormat {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface LastSampleDurationBehavior {
    }

    /* synthetic */ Mp4Muxer(androidx.media3.muxer.SeekableMuxerOutput seekableMuxerOutput, com.google.common.base.Supplier supplier, int i, androidx.media3.muxer.AnnexBToAvccConverter annexBToAvccConverter, boolean z, boolean z2, boolean z3, int i2, androidx.media3.muxer.Mp4Muxer.Mp4AtFileParameters mp4AtFileParameters, int i3, byte b) {
        this(seekableMuxerOutput, supplier, i, annexBToAvccConverter, z, z2, z3, i2, mp4AtFileParameters, i3);
    }

    public static final class Mp4AtFileParameters {
        public final boolean shouldInterleaveSamples;

        public Mp4AtFileParameters(boolean z) {
            this.shouldInterleaveSamples = z;
        }
    }

    public static final class Builder {
        private boolean Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private androidx.media3.muxer.AnnexBToAvccConverter getHighSpeedVideoFpsRanges;
        private com.google.common.base.Supplier<java.lang.String> getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private boolean getHighSpeedVideoSizesFor;
        private int getInputFormats;
        private androidx.media3.muxer.Mp4Muxer.Mp4AtFileParameters getInputSizeshNQ4ISI;
        private final androidx.media3.muxer.SeekableMuxerOutput getOutputFormats;
        private boolean getOutputMinFrameDuration;

        @java.lang.Deprecated
        public Builder(java.io.FileOutputStream fileOutputStream) {
            this(androidx.media3.muxer.SeekableMuxerOutput.of(fileOutputStream));
        }

        public Builder(androidx.media3.muxer.SeekableMuxerOutput seekableMuxerOutput) {
            this.getOutputFormats = seekableMuxerOutput;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            this.Camera2StreamConfigurationMap = true;
            this.getInputFormats = 0;
        }

        public final androidx.media3.muxer.Mp4Muxer.Builder setCacheFileSupplier(com.google.common.base.Supplier<java.lang.String> supplier) {
            this.getHighSpeedVideoFpsRangesFor = supplier;
            return this;
        }

        public final androidx.media3.muxer.Mp4Muxer.Builder setLastSampleDurationBehavior(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            return this;
        }

        public final androidx.media3.muxer.Mp4Muxer.Builder setAnnexBToAvccConverter(androidx.media3.muxer.AnnexBToAvccConverter annexBToAvccConverter) {
            this.getHighSpeedVideoFpsRanges = annexBToAvccConverter;
            return this;
        }

        public final androidx.media3.muxer.Mp4Muxer.Builder setSampleCopyingEnabled(boolean z) {
            this.getHighSpeedVideoSizesFor = z;
            return this;
        }

        public final androidx.media3.muxer.Mp4Muxer.Builder setSampleBatchingEnabled(boolean z) {
            this.getOutputMinFrameDuration = z;
            return this;
        }

        public final androidx.media3.muxer.Mp4Muxer.Builder setAttemptStreamableOutputEnabled(boolean z) {
            this.Camera2StreamConfigurationMap = z;
            return this;
        }

        public final androidx.media3.muxer.Mp4Muxer.Builder setOutputFileFormat(int i) {
            this.getInputFormats = i;
            return this;
        }

        public final androidx.media3.muxer.Mp4Muxer.Builder setMp4AtFileParameters(androidx.media3.muxer.Mp4Muxer.Mp4AtFileParameters mp4AtFileParameters) {
            this.getInputSizeshNQ4ISI = mp4AtFileParameters;
            return this;
        }

        public final androidx.media3.muxer.Mp4Muxer.Builder experimentalSetFreeSpaceAfterFileTypeBox(int i) {
            com.google.common.base.Preconditions.checkArgument(i >= 0);
            this.getHighSpeedVideoSizes = i;
            return this;
        }

        public final androidx.media3.muxer.Mp4Muxer build() {
            boolean z = true;
            if (this.getInputFormats == 1) {
                com.google.common.base.Preconditions.checkArgument(this.getInputSizeshNQ4ISI != null, "Mp4AtFileParameters must be set for FILE_FORMAT_MP4_WITH_AUXILIARY_TRACKS_EXTENSION");
                if (!this.getInputSizeshNQ4ISI.shouldInterleaveSamples && this.getHighSpeedVideoFpsRangesFor == null) {
                    z = false;
                }
                com.google.common.base.Preconditions.checkArgument(z, "CacheFileSupplier must be set when Mp4AtFileParameters.shouldInterleaveSamples is set to false");
            }
            androidx.media3.muxer.SeekableMuxerOutput seekableMuxerOutput = this.getOutputFormats;
            com.google.common.base.Supplier<java.lang.String> supplier = this.getHighSpeedVideoFpsRangesFor;
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.media3.muxer.AnnexBToAvccConverter annexBToAvccConverter = this.getHighSpeedVideoFpsRanges;
            if (annexBToAvccConverter == null) {
                annexBToAvccConverter = androidx.media3.muxer.AnnexBToAvccConverter.DEFAULT;
            }
            return new androidx.media3.muxer.Mp4Muxer(seekableMuxerOutput, supplier, i, annexBToAvccConverter, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getInputFormats, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, (byte) 0);
        }
    }

    private Mp4Muxer(androidx.media3.muxer.SeekableMuxerOutput seekableMuxerOutput, com.google.common.base.Supplier<java.lang.String> supplier, int i, androidx.media3.muxer.AnnexBToAvccConverter annexBToAvccConverter, boolean z, boolean z2, boolean z3, int i2, androidx.media3.muxer.Mp4Muxer.Mp4AtFileParameters mp4AtFileParameters, int i3) {
        this.getOutputStallDurationlomOqCM = seekableMuxerOutput;
        this.getOutputFormats = supplier;
        this.getOutputMinFrameDuration = i;
        this.getHighSpeedVideoFpsRanges = annexBToAvccConverter;
        this.isOutputSupportedFor = z2 && z;
        this.isOutputSupportedForhNQ4ISI = z2;
        this.getHighResolutionOutputSizeshNQ4ISI = z3;
        this.unwrapAs = i2;
        this.getOutputSizes = mp4AtFileParameters;
        this.getInputSizeshNQ4ISI = i3;
        androidx.media3.muxer.MetadataCollector metadataCollector = new androidx.media3.muxer.MetadataCollector();
        this.getOutputStallDuration = metadataCollector;
        this.getOutputMinFrameDurationlomOqCM = new androidx.media3.muxer.Mp4Writer(seekableMuxerOutput, metadataCollector, annexBToAvccConverter, i, z, z2, z3, i3);
        this.toString = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
    }

    @Override // androidx.media3.muxer.Muxer
    public final int addTrack(androidx.media3.common.Format format) throws androidx.media3.muxer.MuxerException {
        return addTrack(1, format);
    }

    public final int addTrack(int i, androidx.media3.common.Format format) throws androidx.media3.muxer.MuxerException {
        androidx.media3.muxer.Track highResolutionOutputSizeshNQ4ISI;
        if (this.unwrapAs == 1 && androidx.media3.muxer.MuxerUtil.Camera2StreamConfigurationMap(format)) {
            if (((androidx.media3.muxer.Mp4Muxer.Mp4AtFileParameters) com.google.common.base.Preconditions.checkNotNull(this.getOutputSizes)).shouldInterleaveSamples) {
                androidx.media3.muxer.Mp4Writer mp4Writer = this.getOutputMinFrameDurationlomOqCM;
                int i2 = this.getOutputSizeshNQ4ISI;
                this.getOutputSizeshNQ4ISI = i2 + 1;
                highResolutionOutputSizeshNQ4ISI = new androidx.media3.muxer.Track(i2, format, i, mp4Writer.getHighSpeedVideoFpsRangesFor);
                mp4Writer.Camera2StreamConfigurationMap.add(highResolutionOutputSizeshNQ4ISI);
                java.util.Collections.sort(mp4Writer.Camera2StreamConfigurationMap, new java.util.Comparator() { // from class: androidx.media3.muxer.Mp4Writer$$ExternalSyntheticLambda0
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                        int compare;
                        compare = java.lang.Integer.compare(((androidx.media3.muxer.Track) obj).getInputFormats, ((androidx.media3.muxer.Track) obj2).getInputFormats);
                        return compare;
                    }
                });
            } else {
                try {
                    if (this.getHighSpeedVideoSizes == null) {
                        java.lang.String str = (java.lang.String) ((com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(this.getOutputFormats)).get();
                        this.getInputFormats = str;
                        this.getHighSpeedVideoSizesFor = androidx.media3.muxer.SeekableMuxerOutput.of(str);
                        androidx.media3.muxer.MetadataCollector metadataCollector = new androidx.media3.muxer.MetadataCollector();
                        this.Camera2StreamConfigurationMap = metadataCollector;
                        this.getHighSpeedVideoSizes = new androidx.media3.muxer.Mp4Writer(this.getHighSpeedVideoSizesFor, (androidx.media3.muxer.MetadataCollector) com.google.common.base.Preconditions.checkNotNull(metadataCollector), this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.isOutputSupportedFor, this.isOutputSupportedForhNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI);
                    }
                    androidx.media3.muxer.Mp4Writer mp4Writer2 = this.getHighSpeedVideoSizes;
                    int i3 = this.getOutputSizeshNQ4ISI;
                    this.getOutputSizeshNQ4ISI = i3 + 1;
                    highResolutionOutputSizeshNQ4ISI = mp4Writer2.getHighResolutionOutputSizeshNQ4ISI(i3, i, format);
                    this.getHighSpeedVideoFpsRangesFor.add(highResolutionOutputSizeshNQ4ISI);
                } catch (java.io.FileNotFoundException e) {
                    throw new androidx.media3.muxer.MuxerException("Cache file not found", e);
                }
            }
        } else {
            androidx.media3.muxer.Mp4Writer mp4Writer3 = this.getOutputMinFrameDurationlomOqCM;
            int i4 = this.getOutputSizeshNQ4ISI;
            this.getOutputSizeshNQ4ISI = i4 + 1;
            highResolutionOutputSizeshNQ4ISI = mp4Writer3.getHighResolutionOutputSizeshNQ4ISI(i4, i, format);
        }
        this.toString.add(highResolutionOutputSizeshNQ4ISI);
        return highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
    }

    @Override // androidx.media3.muxer.Muxer
    public final void writeSampleData(int i, java.nio.ByteBuffer byteBuffer, androidx.media3.muxer.BufferInfo bufferInfo) throws androidx.media3.muxer.MuxerException {
        com.google.common.base.Preconditions.checkArgument(i < this.toString.size(), "Track id is invalid");
        com.google.common.base.Preconditions.checkNotNull(byteBuffer);
        com.google.common.base.Preconditions.checkNotNull(bufferInfo);
        com.google.common.base.Preconditions.checkArgument(byteBuffer.remaining() == bufferInfo.size);
        androidx.media3.muxer.Track track = this.toString.get(i);
        try {
            if (this.getHighSpeedVideoFpsRangesFor.contains(track)) {
                ((androidx.media3.muxer.Mp4Writer) com.google.common.base.Preconditions.checkNotNull(this.getHighSpeedVideoSizes)).Camera2StreamConfigurationMap(track, byteBuffer, bufferInfo);
            } else {
                this.getOutputMinFrameDurationlomOqCM.Camera2StreamConfigurationMap(track, byteBuffer, bufferInfo);
            }
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
        com.google.common.base.Preconditions.checkArgument(androidx.media3.muxer.MuxerUtil.isMetadataSupported(entry), "Unsupported metadata");
        this.getOutputStallDuration.getHighSpeedVideoFpsRanges(entry);
    }

    @Override // androidx.media3.muxer.Muxer, java.lang.AutoCloseable
    public final void close() throws androidx.media3.muxer.MuxerException {
        androidx.media3.muxer.MuxerException muxerException;
        try {
            if (this.getHighSpeedVideoSizes != null) {
                androidx.media3.muxer.MuxerUtil.getHighSpeedVideoFpsRanges((androidx.media3.muxer.MetadataCollector) com.google.common.base.Preconditions.checkNotNull(this.Camera2StreamConfigurationMap), this.getOutputStallDuration.getHighSpeedVideoSizes, false, this.getHighSpeedVideoFpsRangesFor);
                ((androidx.media3.muxer.Mp4Writer) com.google.common.base.Preconditions.checkNotNull(this.getHighSpeedVideoSizes)).Camera2StreamConfigurationMap();
            }
            androidx.media3.container.MdtaMetadataEntry highResolutionOutputSizeshNQ4ISI = androidx.media3.muxer.MuxerUtil.getHighResolutionOutputSizeshNQ4ISI(0L);
            if (this.getHighSpeedVideoSizes != null) {
                this.getOutputStallDuration.getHighSpeedVideoFpsRanges(androidx.media3.muxer.MuxerUtil.getHighSpeedVideoFpsRanges(((androidx.media3.muxer.SeekableMuxerOutput) com.google.common.base.Preconditions.checkNotNull(this.getHighSpeedVideoSizesFor)).getSize() + 16));
                this.getOutputStallDuration.getHighSpeedVideoFpsRanges(highResolutionOutputSizeshNQ4ISI);
            }
            this.getOutputMinFrameDurationlomOqCM.Camera2StreamConfigurationMap();
            if (this.getHighSpeedVideoSizes != null) {
                long size = this.getOutputStallDurationlomOqCM.getSize();
                this.getOutputStallDuration.Camera2StreamConfigurationMap.remove(highResolutionOutputSizeshNQ4ISI);
                this.getOutputStallDuration.getHighSpeedVideoFpsRanges(androidx.media3.muxer.MuxerUtil.getHighResolutionOutputSizeshNQ4ISI(size));
                this.getOutputMinFrameDurationlomOqCM.getHighResolutionOutputSizeshNQ4ISI();
                com.google.common.base.Preconditions.checkState(this.getOutputStallDurationlomOqCM.getSize() == size, "The auxiliary tracks offset should remain the same");
            }
            if (this.getHighSpeedVideoSizes != null) {
                androidx.media3.muxer.SeekableMuxerOutput seekableMuxerOutput = this.getOutputStallDurationlomOqCM;
                seekableMuxerOutput.setPosition(seekableMuxerOutput.getSize());
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream((java.lang.String) com.google.common.base.Preconditions.checkNotNull(this.getInputFormats));
                try {
                    java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                    long size2 = channel.size();
                    this.getOutputStallDurationlomOqCM.write(androidx.media3.muxer.Boxes.getHighSpeedVideoSizes(size2));
                    channel.transferTo(0L, size2, this.getOutputStallDurationlomOqCM);
                    fileInputStream.close();
                } finally {
                }
            }
            muxerException = null;
        } catch (java.io.IOException e) {
            muxerException = new androidx.media3.muxer.MuxerException("Failed to finish writing data", e);
        }
        try {
            this.getOutputStallDurationlomOqCM.close();
        } catch (java.io.IOException e2) {
            if (muxerException == null) {
                muxerException = new androidx.media3.muxer.MuxerException("Failed to close output stream", e2);
            } else {
                androidx.media3.common.util.Log.e("Mp4Muxer", "Failed to close output stream", e2);
            }
        }
        androidx.media3.muxer.SeekableMuxerOutput seekableMuxerOutput2 = this.getHighSpeedVideoSizesFor;
        if (seekableMuxerOutput2 != null) {
            try {
                seekableMuxerOutput2.close();
            } catch (java.io.IOException e3) {
                if (muxerException != null) {
                    androidx.media3.common.util.Log.e("Mp4Muxer", "Failed to close cache file output stream", e3);
                } else {
                    muxerException = new androidx.media3.muxer.MuxerException("Failed to close the cache file output stream", e3);
                }
            }
        }
        if (muxerException != null) {
            throw muxerException;
        }
    }
}
