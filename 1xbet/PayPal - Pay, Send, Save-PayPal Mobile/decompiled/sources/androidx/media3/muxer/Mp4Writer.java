package androidx.media3.muxer;

/* loaded from: classes7.dex */
final class Mp4Writer {
    final java.util.List<androidx.media3.muxer.Track> Camera2StreamConfigurationMap;
    private final androidx.media3.muxer.AnnexBToAvccConverter getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private long getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private final java.util.concurrent.atomic.AtomicBoolean getInputSizeshNQ4ISI;
    private final androidx.media3.muxer.LinearByteBufferAllocator getOutputFormats;
    private com.google.common.collect.Range<java.lang.Long> getOutputMinFrameDuration;
    private long getOutputMinFrameDurationlomOqCM;
    private final androidx.media3.muxer.SeekableMuxerOutput getOutputSizes;
    private long getOutputSizeshNQ4ISI;
    private final androidx.media3.muxer.MetadataCollector getOutputStallDuration;
    private long getOutputStallDurationlomOqCM;
    private long getValidOutputFormatsForInputhNQ4ISI;
    private final boolean isOutputSupportedForhNQ4ISI;
    private long toString;
    private final java.util.List<androidx.media3.muxer.Track> unwrapAs;

    public Mp4Writer(androidx.media3.muxer.SeekableMuxerOutput seekableMuxerOutput, androidx.media3.muxer.MetadataCollector metadataCollector, androidx.media3.muxer.AnnexBToAvccConverter annexBToAvccConverter, int i, boolean z, boolean z2, boolean z3, int i2) {
        this.getOutputSizes = seekableMuxerOutput;
        this.getOutputStallDuration = metadataCollector;
        this.getHighResolutionOutputSizeshNQ4ISI = annexBToAvccConverter;
        this.getInputFormats = i;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.isOutputSupportedForhNQ4ISI = z2;
        this.getHighSpeedVideoSizes = i2 <= 0 ? z3 ? 400000 : 0 : i2;
        this.unwrapAs = new java.util.ArrayList();
        this.Camera2StreamConfigurationMap = new java.util.ArrayList();
        this.getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.getHighSpeedVideoFpsRanges = z3;
        this.getOutputMinFrameDuration = com.google.common.collect.Range.closed(0L, 0L);
        this.getHighSpeedVideoSizesFor = 0L;
        this.getOutputFormats = new androidx.media3.muxer.LinearByteBufferAllocator();
    }

    public final androidx.media3.muxer.Track getHighResolutionOutputSizeshNQ4ISI(int i, int i2, androidx.media3.common.Format format) {
        androidx.media3.muxer.Track track = new androidx.media3.muxer.Track(i, format, i2, this.getHighSpeedVideoFpsRangesFor);
        this.unwrapAs.add(track);
        java.util.Collections.sort(this.unwrapAs, new java.util.Comparator() { // from class: androidx.media3.muxer.Mp4Writer$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int compare;
                compare = java.lang.Integer.compare(((androidx.media3.muxer.Track) obj).getInputFormats, ((androidx.media3.muxer.Track) obj2).getInputFormats);
                return compare;
            }
        });
        return track;
    }

    public final void Camera2StreamConfigurationMap(androidx.media3.muxer.Track track, java.nio.ByteBuffer byteBuffer, androidx.media3.muxer.BufferInfo bufferInfo) throws java.io.IOException {
        if (java.util.Objects.equals(track.getHighResolutionOutputSizeshNQ4ISI.sampleMimeType, androidx.media3.common.MimeTypes.VIDEO_AV1) && track.getHighResolutionOutputSizeshNQ4ISI.initializationData.isEmpty() && track.getHighSpeedVideoFpsRangesFor == null) {
            track.getHighSpeedVideoFpsRangesFor = androidx.media3.muxer.Av1ConfigUtil.getHighSpeedVideoFpsRangesFor(byteBuffer.duplicate());
        }
        track.getHighResolutionOutputSizeshNQ4ISI(byteBuffer, bufferInfo);
        if (this.isOutputSupportedForhNQ4ISI) {
            getHighSpeedVideoFpsRanges();
            return;
        }
        getHighSpeedVideoSizes(track);
        boolean contains = this.unwrapAs.contains(track);
        long j = bufferInfo.presentationTimeUs;
        if (contains && this.getHighSpeedVideoFpsRanges && j - this.getHighSpeedVideoSizesFor >= 1000000) {
            getHighSpeedVideoSizes();
            this.getHighSpeedVideoSizesFor = j;
        }
    }

    public final void Camera2StreamConfigurationMap() throws java.io.IOException {
        for (int i = 0; i < this.unwrapAs.size(); i++) {
            getHighSpeedVideoSizes(this.unwrapAs.get(i));
        }
        for (int i2 = 0; i2 < this.Camera2StreamConfigurationMap.size(); i2++) {
            getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap.get(i2));
        }
        if (this.getInputSizeshNQ4ISI.get()) {
            getHighResolutionOutputSizeshNQ4ISI();
            if (this.Camera2StreamConfigurationMap.isEmpty()) {
                return;
            }
            getHighSpeedVideoFpsRangesFor();
        }
    }

    private void getHighSpeedVideoFpsRangesFor() throws java.io.IOException {
        androidx.media3.container.MdtaMetadataEntry highResolutionOutputSizeshNQ4ISI = androidx.media3.muxer.MuxerUtil.getHighResolutionOutputSizeshNQ4ISI(0L);
        this.getOutputStallDuration.getHighSpeedVideoFpsRanges(highResolutionOutputSizeshNQ4ISI);
        java.nio.ByteBuffer Camera2StreamConfigurationMap = androidx.media3.muxer.Boxes.Camera2StreamConfigurationMap();
        androidx.media3.muxer.MetadataCollector metadataCollector = new androidx.media3.muxer.MetadataCollector();
        androidx.media3.muxer.MuxerUtil.getHighSpeedVideoFpsRanges(metadataCollector, this.getOutputStallDuration.getHighSpeedVideoSizes, true, this.Camera2StreamConfigurationMap);
        java.nio.ByteBuffer highSpeedVideoSizes = androidx.media3.muxer.BoxUtils.getHighSpeedVideoSizes(androidx.media3.muxer.Boxes.getHighSpeedVideoSizes(Camera2StreamConfigurationMap.remaining() + r2.remaining()), Camera2StreamConfigurationMap, androidx.media3.muxer.Boxes.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, metadataCollector, false, this.getInputFormats));
        this.getOutputStallDuration.getHighSpeedVideoFpsRanges(androidx.media3.muxer.MuxerUtil.getHighSpeedVideoFpsRanges(highSpeedVideoSizes.remaining()));
        getHighResolutionOutputSizeshNQ4ISI();
        this.getOutputStallDuration.Camera2StreamConfigurationMap.remove(highResolutionOutputSizeshNQ4ISI);
        this.getOutputStallDuration.getHighSpeedVideoFpsRanges(androidx.media3.muxer.MuxerUtil.getHighResolutionOutputSizeshNQ4ISI(this.getOutputSizes.getSize()));
        long size = this.getOutputSizes.getSize();
        getHighResolutionOutputSizeshNQ4ISI();
        com.google.common.base.Preconditions.checkState(size == this.getOutputSizes.getSize());
        androidx.media3.muxer.SeekableMuxerOutput seekableMuxerOutput = this.getOutputSizes;
        seekableMuxerOutput.setPosition(seekableMuxerOutput.getSize());
        this.getOutputSizes.write(highSpeedVideoSizes);
    }

    public final void getHighResolutionOutputSizeshNQ4ISI() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoSizes();
            return;
        }
        java.nio.ByteBuffer highSpeedVideoFpsRanges = androidx.media3.muxer.Boxes.getHighSpeedVideoFpsRanges(this.unwrapAs, this.getOutputStallDuration, false, this.getInputFormats);
        int remaining = highSpeedVideoFpsRanges.remaining();
        long j = remaining + 8;
        if (this.getOutputStallDurationlomOqCM - this.getOutputMinFrameDurationlomOqCM < j) {
            getHighSpeedVideoFpsRanges(this.getOutputMinFrameDuration.upperEndpoint().longValue() + j, highSpeedVideoFpsRanges);
            com.google.common.base.Preconditions.checkState(this.getOutputStallDurationlomOqCM - this.getOutputMinFrameDurationlomOqCM >= j);
        }
        long j2 = this.getOutputMinFrameDurationlomOqCM;
        this.getOutputSizes.setPosition(j2);
        this.getOutputSizes.write(highSpeedVideoFpsRanges);
        long j3 = remaining + j2;
        long longValue = this.getOutputMinFrameDuration.upperEndpoint().longValue() - j3;
        com.google.common.base.Preconditions.checkState(longValue < androidx.collection.SieveCacheKt.NodeLinkMask);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
        allocate.putInt((int) longValue);
        allocate.put(androidx.media3.common.util.Util.getUtf8Bytes("free"));
        allocate.flip();
        this.getOutputSizes.write(allocate);
        this.getOutputStallDurationlomOqCM = j2;
        getHighSpeedVideoSizes(j2 - this.getOutputSizeshNQ4ISI);
        this.getOutputMinFrameDuration = com.google.common.collect.Range.closed(java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j2 + highSpeedVideoFpsRanges.limit()));
        this.getOutputSizes.truncate(j3);
    }

    private void getHighSpeedVideoSizesFor() throws java.io.IOException {
        this.getOutputSizes.setPosition(0L);
        this.getOutputSizes.write(androidx.media3.muxer.Boxes.Camera2StreamConfigurationMap());
        if (this.getHighSpeedVideoSizes > 0) {
            this.getValidOutputFormatsForInputhNQ4ISI = this.getOutputSizes.getPosition();
            this.getOutputSizes.write(androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("free", java.nio.ByteBuffer.allocate(this.getHighSpeedVideoSizes)));
            this.toString = this.getOutputSizes.getPosition();
        }
        this.getOutputSizeshNQ4ISI = this.getOutputSizes.getPosition();
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(16);
        allocate.putInt(1);
        allocate.put(androidx.media3.common.util.Util.getUtf8Bytes("mdat"));
        allocate.putLong(16L);
        allocate.flip();
        this.getOutputSizes.write(allocate);
        long j = this.getOutputSizeshNQ4ISI + 16;
        this.getOutputMinFrameDurationlomOqCM = j;
        if (this.getHighSpeedVideoFpsRanges) {
            j = Long.MAX_VALUE;
        }
        this.getOutputStallDurationlomOqCM = j;
    }

    private void getHighSpeedVideoFpsRanges(long j, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        com.google.common.base.Preconditions.checkState(j >= this.getOutputMinFrameDuration.upperEndpoint().longValue());
        com.google.common.base.Preconditions.checkState(j >= this.getOutputStallDurationlomOqCM);
        this.getOutputSizes.setPosition(j);
        this.getOutputSizes.write(androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("free", byteBuffer.duplicate()));
        long j2 = 8 + j;
        this.getOutputStallDurationlomOqCM = j2;
        getHighSpeedVideoSizes(j2 - this.getOutputSizeshNQ4ISI);
        this.getOutputMinFrameDuration = com.google.common.collect.Range.closed(java.lang.Long.valueOf(j), java.lang.Long.valueOf(j + byteBuffer.remaining()));
    }

    private boolean getHighSpeedVideoFpsRanges(java.util.List<androidx.media3.muxer.Track> list) throws java.io.IOException {
        boolean z = false;
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.muxer.Track track = list.get(i);
            if (track.getOutputMinFrameDuration.size() > 2) {
                if (((androidx.media3.muxer.BufferInfo) com.google.common.base.Preconditions.checkNotNull(track.getOutputMinFrameDuration.peekLast())).presentationTimeUs - ((androidx.media3.muxer.BufferInfo) com.google.common.base.Preconditions.checkNotNull(track.getOutputMinFrameDuration.peekFirst())).presentationTimeUs > 1000000) {
                    getHighSpeedVideoSizes(track);
                    z = true;
                }
            }
        }
        return z;
    }

    private void getHighSpeedVideoSizes(androidx.media3.muxer.Track track) throws java.io.IOException {
        com.google.common.base.Preconditions.checkState(track.getInputSizeshNQ4ISI.size() == track.getOutputMinFrameDuration.size());
        if (track.getOutputMinFrameDuration.isEmpty()) {
            return;
        }
        if (!this.getInputSizeshNQ4ISI.getAndSet(true)) {
            getHighSpeedVideoSizesFor();
        }
        long j = 0;
        while (track.getInputSizeshNQ4ISI.iterator().hasNext()) {
            j += r0.next().limit();
        }
        getHighSpeedVideoFpsRanges(j);
        track.getHighSpeedVideoSizesFor.add(java.lang.Long.valueOf(this.getOutputMinFrameDurationlomOqCM));
        track.getOutputFormats.add(java.lang.Integer.valueOf(track.getOutputMinFrameDuration.size()));
        do {
            androidx.media3.muxer.BufferInfo removeFirst = track.getOutputMinFrameDuration.removeFirst();
            java.nio.ByteBuffer removeFirst2 = track.getInputSizeshNQ4ISI.removeFirst();
            if (androidx.media3.muxer.AnnexBUtils.getHighSpeedVideoSizes(track.getHighResolutionOutputSizeshNQ4ISI)) {
                removeFirst2 = this.getHighResolutionOutputSizeshNQ4ISI.process(removeFirst2, this.getOutputFormats);
                removeFirst = new androidx.media3.muxer.BufferInfo(removeFirst.presentationTimeUs, removeFirst2.remaining(), removeFirst.flags);
            }
            getHighSpeedVideoFpsRanges(removeFirst2.remaining());
            this.getOutputSizes.setPosition(this.getOutputMinFrameDurationlomOqCM);
            this.getOutputMinFrameDurationlomOqCM += this.getOutputSizes.write(removeFirst2);
            this.getOutputFormats.Camera2StreamConfigurationMap.clear();
            track.getOutputMinFrameDurationlomOqCM.add(removeFirst);
        } while (!track.getOutputMinFrameDuration.isEmpty());
        com.google.common.base.Preconditions.checkState(this.getOutputMinFrameDurationlomOqCM <= this.getOutputStallDurationlomOqCM);
    }

    private void getHighSpeedVideoFpsRanges(long j) throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        long j2 = this.getOutputMinFrameDurationlomOqCM;
        if (j2 + j >= this.getOutputStallDurationlomOqCM) {
            getHighSpeedVideoFpsRanges(java.lang.Math.max(this.getOutputStallDurationlomOqCM + java.lang.Math.min(1000000000L, java.lang.Math.max(500000L, (long) (j2 * 0.2f))) + j, this.getOutputMinFrameDuration.upperEndpoint().longValue()), androidx.media3.muxer.Boxes.getHighSpeedVideoFpsRanges(this.unwrapAs, this.getOutputStallDuration, false, this.getInputFormats));
        }
    }

    private void getHighSpeedVideoSizes(long j) throws java.io.IOException {
        this.getOutputSizes.setPosition(this.getOutputSizeshNQ4ISI + 8);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
        allocate.putLong(j);
        allocate.flip();
        this.getOutputSizes.write(allocate);
    }

    private void getHighSpeedVideoFpsRanges() throws java.io.IOException {
        boolean highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(this.unwrapAs);
        getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap);
        if (highSpeedVideoFpsRanges && this.getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoSizes();
        }
    }

    private void getHighSpeedVideoSizes() throws java.io.IOException {
        java.nio.ByteBuffer highSpeedVideoFpsRanges = androidx.media3.muxer.Boxes.getHighSpeedVideoFpsRanges(this.unwrapAs, this.getOutputStallDuration, false, this.getInputFormats);
        int remaining = highSpeedVideoFpsRanges.remaining();
        long remaining2 = highSpeedVideoFpsRanges.remaining() + 8;
        long j = this.toString;
        long j2 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (remaining2 <= j - j2) {
            this.getOutputSizes.setPosition(j2);
            this.getOutputSizes.write(highSpeedVideoFpsRanges);
            this.getOutputSizes.write(androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("free", java.nio.ByteBuffer.allocate((int) ((this.toString - this.getOutputSizes.getPosition()) - 8))));
        } else {
            this.getHighSpeedVideoFpsRanges = false;
            long j3 = this.getOutputMinFrameDurationlomOqCM;
            this.getOutputStallDurationlomOqCM = j3;
            this.getOutputSizes.setPosition(j3);
            this.getOutputSizes.write(highSpeedVideoFpsRanges);
            this.getOutputMinFrameDuration = com.google.common.collect.Range.closed(java.lang.Long.valueOf(this.getOutputStallDurationlomOqCM), java.lang.Long.valueOf(this.getOutputStallDurationlomOqCM + remaining));
            java.nio.ByteBuffer highSpeedVideoFpsRangesFor = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("free", java.nio.ByteBuffer.allocate((int) ((this.toString - this.getValidOutputFormatsForInputhNQ4ISI) - 8)));
            this.getOutputSizes.setPosition(this.getValidOutputFormatsForInputhNQ4ISI);
            this.getOutputSizes.write(highSpeedVideoFpsRangesFor);
        }
        getHighSpeedVideoSizes(this.getOutputMinFrameDurationlomOqCM - this.getOutputSizeshNQ4ISI);
    }
}
