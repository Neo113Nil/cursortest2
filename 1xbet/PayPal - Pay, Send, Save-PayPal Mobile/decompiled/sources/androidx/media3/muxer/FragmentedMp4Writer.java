package androidx.media3.muxer;

/* loaded from: classes7.dex */
final class FragmentedMp4Writer {
    long getHighResolutionOutputSizeshNQ4ISI;
    final androidx.media3.muxer.MetadataCollector getHighSpeedVideoFpsRanges;
    final long getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final boolean getInputFormats;
    final androidx.media3.muxer.FragmentedMp4Writer.PositionTrackingOutputChannel getInputSizeshNQ4ISI;
    androidx.media3.muxer.Track getOutputSizeshNQ4ISI;
    private final androidx.media3.muxer.AnnexBToAvccConverter getOutputStallDuration;
    final int Camera2StreamConfigurationMap = 1;
    final java.util.List<androidx.media3.muxer.Track> getOutputFormats = new java.util.ArrayList();
    long getOutputMinFrameDuration = Long.MAX_VALUE;
    private int getOutputMinFrameDurationlomOqCM = 1;
    private final androidx.media3.muxer.LinearByteBufferAllocator getOutputSizes = new androidx.media3.muxer.LinearByteBufferAllocator();

    public static class SampleMetadata {
        public final int compositionTimeOffsetVu;
        public final int durationVu;
        public final int flags;
        public final int size;

        public SampleMetadata(int i, int i2, int i3, int i4) {
            this.durationVu = i;
            this.size = i2;
            this.flags = i3;
            this.compositionTimeOffsetVu = i4;
        }
    }

    static class PositionTrackingOutputChannel implements java.nio.channels.WritableByteChannel {
        private final java.nio.channels.WritableByteChannel getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoSizes = 0;

        public PositionTrackingOutputChannel(java.nio.channels.WritableByteChannel writableByteChannel) {
            this.getHighSpeedVideoFpsRanges = writableByteChannel;
        }

        @Override // java.nio.channels.WritableByteChannel
        public int write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            int write = this.getHighSpeedVideoFpsRanges.write(byteBuffer);
            this.getHighSpeedVideoSizes += write;
            return write;
        }

        @Override // java.nio.channels.Channel
        public boolean isOpen() {
            return this.getHighSpeedVideoFpsRanges.isOpen();
        }

        @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            this.getHighSpeedVideoFpsRanges.close();
        }
    }

    public FragmentedMp4Writer(java.nio.channels.WritableByteChannel writableByteChannel, androidx.media3.muxer.MetadataCollector metadataCollector, androidx.media3.muxer.AnnexBToAvccConverter annexBToAvccConverter, long j, boolean z) {
        this.getInputSizeshNQ4ISI = new androidx.media3.muxer.FragmentedMp4Writer.PositionTrackingOutputChannel(writableByteChannel);
        this.getHighSpeedVideoFpsRanges = metadataCollector;
        this.getOutputStallDuration = annexBToAvccConverter;
        this.getHighSpeedVideoFpsRangesFor = j * 1000;
        this.getInputFormats = z;
    }

    private static com.google.common.collect.ImmutableList<java.nio.ByteBuffer> Camera2StreamConfigurationMap(java.util.List<androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo> list, long j) {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(list) + 8;
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo processedTrackInfo = list.get(i);
            builder.add((com.google.common.collect.ImmutableList.Builder) androidx.media3.muxer.Boxes.Camera2StreamConfigurationMap(androidx.media3.muxer.Boxes.getHighSpeedVideoSizes(processedTrackInfo.getInputFormats, j), androidx.media3.muxer.Boxes.Camera2StreamConfigurationMap(processedTrackInfo.getHighResolutionOutputSizeshNQ4ISI, processedTrackInfo.getHighSpeedVideoFpsRanges, Camera2StreamConfigurationMap, processedTrackInfo.getHighSpeedVideoSizes)));
            Camera2StreamConfigurationMap += processedTrackInfo.Camera2StreamConfigurationMap;
        }
        return builder.build();
    }

    private static int Camera2StreamConfigurationMap(java.util.List<androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo processedTrackInfo = list.get(i2);
            i += androidx.media3.muxer.Boxes.Camera2StreamConfigurationMap(processedTrackInfo.getHighSpeedVideoFpsRanges.size(), processedTrackInfo.getHighSpeedVideoSizes) + 40;
        }
        return i + 24;
    }

    final void getHighSpeedVideoFpsRanges() throws java.io.IOException {
        com.google.common.collect.ImmutableList<androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        com.google.common.collect.ImmutableList<java.nio.ByteBuffer> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes);
        if (Camera2StreamConfigurationMap.isEmpty()) {
            return;
        }
        this.getInputSizeshNQ4ISI.write(androidx.media3.muxer.Boxes.getHighResolutionOutputSizeshNQ4ISI(androidx.media3.muxer.Boxes.Camera2StreamConfigurationMap(this.getOutputMinFrameDurationlomOqCM), Camera2StreamConfigurationMap));
        getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor);
        this.getOutputMinFrameDurationlomOqCM++;
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
    }

    private void getHighSpeedVideoFpsRanges(java.util.List<androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo> list) throws java.io.IOException {
        long j = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int i2 = 0; i2 < list.get(i).getHighSpeedVideoFpsRangesFor.size(); i2++) {
                j += r4.getHighSpeedVideoFpsRangesFor.get(i2).remaining();
            }
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
        long j2 = j + 8;
        com.google.common.base.Preconditions.checkArgument(j2 <= 4294967295L, "Only 32-bit long mdat size supported in the fragmented MP4");
        allocate.putInt((int) j2);
        allocate.put(androidx.media3.common.util.Util.getUtf8Bytes("mdat"));
        allocate.flip();
        this.getInputSizeshNQ4ISI.write(allocate);
        for (int i3 = 0; i3 < list.size(); i3++) {
            androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo processedTrackInfo = list.get(i3);
            for (int i4 = 0; i4 < processedTrackInfo.getHighSpeedVideoFpsRangesFor.size(); i4++) {
                this.getInputSizeshNQ4ISI.write(processedTrackInfo.getHighSpeedVideoFpsRangesFor.get(i4));
            }
        }
        this.getOutputSizes.Camera2StreamConfigurationMap.clear();
    }

    private com.google.common.collect.ImmutableList<androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo> getHighSpeedVideoFpsRangesFor() {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        for (int i = 0; i < this.getOutputFormats.size(); i++) {
            if (!this.getOutputFormats.get(i).getOutputMinFrameDuration.isEmpty()) {
                builder.add((com.google.common.collect.ImmutableList.Builder) getHighResolutionOutputSizeshNQ4ISI(i + 1, this.getOutputFormats.get(i)));
            }
        }
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo getHighResolutionOutputSizeshNQ4ISI(int i, androidx.media3.muxer.Track track) {
        com.google.common.base.Preconditions.checkState(track.getInputSizeshNQ4ISI.size() == track.getOutputMinFrameDuration.size());
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        com.google.common.collect.ImmutableList.Builder builder2 = new com.google.common.collect.ImmutableList.Builder();
        if (androidx.media3.muxer.AnnexBUtils.getHighSpeedVideoSizes(track.getHighResolutionOutputSizeshNQ4ISI)) {
            while (!track.getInputSizeshNQ4ISI.isEmpty()) {
                java.nio.ByteBuffer process = this.getOutputStallDuration.process(track.getInputSizeshNQ4ISI.removeFirst(), this.getOutputSizes);
                builder.add((com.google.common.collect.ImmutableList.Builder) process);
                androidx.media3.muxer.BufferInfo removeFirst = track.getOutputMinFrameDuration.removeFirst();
                builder2.add((com.google.common.collect.ImmutableList.Builder) new androidx.media3.muxer.BufferInfo(removeFirst.presentationTimeUs, process.remaining(), removeFirst.flags));
            }
        } else {
            builder.addAll((java.lang.Iterable) track.getInputSizeshNQ4ISI);
            track.getInputSizeshNQ4ISI.clear();
            builder2.addAll((java.lang.Iterable) track.getOutputMinFrameDuration);
            track.getOutputMinFrameDuration.clear();
        }
        com.google.common.collect.ImmutableList build = builder2.build();
        java.util.List<java.lang.Integer> highResolutionOutputSizeshNQ4ISI = androidx.media3.muxer.Boxes.getHighResolutionOutputSizeshNQ4ISI(build, androidx.media3.common.MimeTypes.isAudio(track.getHighResolutionOutputSizeshNQ4ISI.sampleMimeType) ? track.getHighResolutionOutputSizeshNQ4ISI.sampleRate : 90000, 1, track.Camera2StreamConfigurationMap);
        java.util.List<java.lang.Integer> highSpeedVideoFpsRangesFor = androidx.media3.muxer.Boxes.getHighSpeedVideoFpsRangesFor(build, highResolutionOutputSizeshNQ4ISI, androidx.media3.common.MimeTypes.isAudio(track.getHighResolutionOutputSizeshNQ4ISI.sampleMimeType) ? track.getHighResolutionOutputSizeshNQ4ISI.sampleRate : 90000);
        boolean isEmpty = highSpeedVideoFpsRangesFor.isEmpty();
        com.google.common.collect.ImmutableList.Builder builder3 = new com.google.common.collect.ImmutableList.Builder();
        int i2 = 0;
        for (int i3 = 0; i3 < build.size(); i3++) {
            i2 += ((androidx.media3.muxer.BufferInfo) build.get(i3)).size;
            builder3.add((com.google.common.collect.ImmutableList.Builder) new androidx.media3.muxer.FragmentedMp4Writer.SampleMetadata(highResolutionOutputSizeshNQ4ISI.get(i3).intValue(), ((androidx.media3.muxer.BufferInfo) build.get(i3)).size, ((androidx.media3.muxer.BufferInfo) build.get(i3)).flags, !isEmpty ? highSpeedVideoFpsRangesFor.get(i3).intValue() : 0));
        }
        return new androidx.media3.muxer.FragmentedMp4Writer.ProcessedTrackInfo(i, track.getHighResolutionOutputSizeshNQ4ISI, i2, !isEmpty, builder.build(), builder3.build());
    }

    static class ProcessedTrackInfo {
        public final int Camera2StreamConfigurationMap;
        public final androidx.media3.common.Format getHighResolutionOutputSizeshNQ4ISI;
        public final com.google.common.collect.ImmutableList<androidx.media3.muxer.FragmentedMp4Writer.SampleMetadata> getHighSpeedVideoFpsRanges;
        public final com.google.common.collect.ImmutableList<java.nio.ByteBuffer> getHighSpeedVideoFpsRangesFor;
        public final boolean getHighSpeedVideoSizes;
        public final int getInputFormats;

        public ProcessedTrackInfo(int i, androidx.media3.common.Format format, int i2, boolean z, com.google.common.collect.ImmutableList<java.nio.ByteBuffer> immutableList, com.google.common.collect.ImmutableList<androidx.media3.muxer.FragmentedMp4Writer.SampleMetadata> immutableList2) {
            this.getInputFormats = i;
            this.getHighResolutionOutputSizeshNQ4ISI = format;
            this.Camera2StreamConfigurationMap = i2;
            this.getHighSpeedVideoSizes = z;
            this.getHighSpeedVideoFpsRangesFor = immutableList;
            this.getHighSpeedVideoFpsRanges = immutableList2;
        }
    }
}
