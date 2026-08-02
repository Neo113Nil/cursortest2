package androidx.media3.muxer;

/* loaded from: classes7.dex */
final class WebmWriter {
    long getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoSizesFor;
    final boolean getInputFormats;
    long getInputSizeshNQ4ISI;
    final androidx.media3.muxer.SeekableMuxerOutput getOutputMinFrameDuration;
    boolean getOutputSizes;
    final java.util.List<androidx.media3.muxer.Track> getHighSpeedVideoSizes = new java.util.ArrayList();
    final java.util.List<java.nio.ByteBuffer> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
    final android.util.SparseArray<java.lang.Long> getOutputFormats = new android.util.SparseArray<>();
    long Camera2StreamConfigurationMap = androidx.media3.common.C.TIME_UNSET;
    long getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.C.TIME_UNSET;

    WebmWriter(androidx.media3.muxer.SeekableMuxerOutput seekableMuxerOutput, boolean z) {
        this.getOutputMinFrameDuration = seekableMuxerOutput;
        this.getInputFormats = z;
    }

    static boolean Camera2StreamConfigurationMap(androidx.media3.muxer.Track track, androidx.media3.muxer.BufferInfo bufferInfo) {
        if (track.getOutputMinFrameDuration.isEmpty()) {
            return false;
        }
        if (androidx.media3.common.MimeTypes.isVideo(track.getHighResolutionOutputSizeshNQ4ISI.sampleMimeType)) {
            return (bufferInfo.flags & 1) > 0;
        }
        return bufferInfo.presentationTimeUs - track.getOutputMinFrameDuration.getFirst().presentationTimeUs > 2000000;
    }

    final void getHighSpeedVideoFpsRanges() throws java.io.IOException {
        java.util.PriorityQueue priorityQueue = new java.util.PriorityQueue();
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= this.getHighSpeedVideoSizes.size()) {
                break;
            }
            androidx.media3.muxer.Track track = this.getHighSpeedVideoSizes.get(i);
            while (!track.getInputSizeshNQ4ISI.isEmpty()) {
                boolean isAudio = androidx.media3.common.MimeTypes.isAudio(track.getHighResolutionOutputSizeshNQ4ISI.sampleMimeType);
                androidx.media3.muxer.WebmWriter.WebmFrame webmFrame = new androidx.media3.muxer.WebmWriter.WebmFrame(isAudio ? 2 : 1, track.getInputSizeshNQ4ISI.removeFirst(), track.getOutputMinFrameDuration.removeFirst(), isAudio);
                priorityQueue.add(webmFrame);
                if (!webmFrame.getHighResolutionOutputSizeshNQ4ISI.booleanValue() && (webmFrame.Camera2StreamConfigurationMap.flags & 1) > 0) {
                    z = true;
                }
            }
            i++;
        }
        if (priorityQueue.isEmpty()) {
            return;
        }
        androidx.media3.muxer.WebmWriter.WebmFrame webmFrame2 = (androidx.media3.muxer.WebmWriter.WebmFrame) com.google.common.base.Preconditions.checkNotNull((androidx.media3.muxer.WebmWriter.WebmFrame) priorityQueue.peek());
        long j = webmFrame2.Camera2StreamConfigurationMap.presentationTimeUs;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        long scaleLargeTimestamp = androidx.media3.common.util.Util.scaleLargeTimestamp(j - this.Camera2StreamConfigurationMap, 1000L, 1000000L);
        arrayList.add(androidx.media3.muxer.WebmElements.Camera2StreamConfigurationMap(231L, scaleLargeTimestamp));
        while (!priorityQueue.isEmpty()) {
            androidx.media3.muxer.WebmWriter.WebmFrame webmFrame3 = (androidx.media3.muxer.WebmWriter.WebmFrame) com.google.common.base.Preconditions.checkNotNull((androidx.media3.muxer.WebmWriter.WebmFrame) priorityQueue.poll());
            arrayList.add(androidx.media3.muxer.WebmElements.getHighSpeedVideoFpsRangesFor(webmFrame3.getHighSpeedVideoFpsRanges, androidx.media3.common.util.Util.scaleLargeTimestamp(webmFrame3.Camera2StreamConfigurationMap.presentationTimeUs - j, 1000L, 1000000L), (webmFrame3.Camera2StreamConfigurationMap.flags & 1) > 0, webmFrame3.getHighSpeedVideoFpsRangesFor));
        }
        long position = this.getOutputMinFrameDuration.getPosition();
        long j2 = this.getHighSpeedVideoSizesFor;
        this.getOutputMinFrameDuration.write(androidx.media3.muxer.WebmElements.getHighResolutionOutputSizeshNQ4ISI(524531317L, arrayList));
        this.getHighSpeedVideoFpsRangesFor.add(androidx.media3.muxer.WebmElements.Camera2StreamConfigurationMap(scaleLargeTimestamp, z ? 1 : webmFrame2.getHighSpeedVideoFpsRanges, position - j2));
    }

    static final class WebmFrame implements java.lang.Comparable<androidx.media3.muxer.WebmWriter.WebmFrame> {
        private final androidx.media3.muxer.BufferInfo Camera2StreamConfigurationMap;
        private final java.lang.Boolean getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoFpsRanges;
        private final java.nio.ByteBuffer getHighSpeedVideoFpsRangesFor;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(androidx.media3.muxer.WebmWriter.WebmFrame webmFrame) {
            androidx.media3.muxer.WebmWriter.WebmFrame webmFrame2 = webmFrame;
            int compare = java.lang.Long.compare(this.Camera2StreamConfigurationMap.presentationTimeUs, webmFrame2.Camera2StreamConfigurationMap.presentationTimeUs);
            return compare != 0 ? compare : java.lang.Boolean.compare(this.getHighResolutionOutputSizeshNQ4ISI.booleanValue(), webmFrame2.getHighResolutionOutputSizeshNQ4ISI.booleanValue());
        }

        WebmFrame(int i, java.nio.ByteBuffer byteBuffer, androidx.media3.muxer.BufferInfo bufferInfo, boolean z) {
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighSpeedVideoFpsRangesFor = byteBuffer;
            this.Camera2StreamConfigurationMap = bufferInfo;
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Boolean.valueOf(z);
        }
    }

    static long getHighSpeedVideoSizes(long j) {
        return androidx.media3.common.util.Util.scaleLargeTimestamp(j, 1000L, 1000000L);
    }
}
