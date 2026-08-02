package androidx.media3.common.audio;

/* loaded from: classes7.dex */
public final class AudioProcessingPipeline {
    private final com.google.common.collect.ImmutableList<androidx.media3.common.audio.AudioProcessor> getHighSpeedVideoSizes;
    private final java.util.List<androidx.media3.common.audio.AudioProcessor> getHighSpeedVideoFpsRanges = new java.util.ArrayList();
    private java.nio.ByteBuffer[] Camera2StreamConfigurationMap = new java.nio.ByteBuffer[0];
    private androidx.media3.common.audio.AudioProcessor.AudioFormat getHighSpeedVideoFpsRangesFor = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat getInputSizeshNQ4ISI = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;

    public AudioProcessingPipeline(com.google.common.collect.ImmutableList<androidx.media3.common.audio.AudioProcessor> immutableList) {
        this.getHighSpeedVideoSizes = immutableList;
    }

    public final androidx.media3.common.audio.AudioProcessor.AudioFormat configure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.equals(androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET)) {
            throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
            androidx.media3.common.audio.AudioProcessor audioProcessor = this.getHighSpeedVideoSizes.get(i);
            androidx.media3.common.audio.AudioProcessor.AudioFormat configure = audioProcessor.configure(audioFormat);
            if (audioProcessor.isActive()) {
                com.google.common.base.Preconditions.checkState(!configure.equals(androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET));
                audioFormat = configure;
            }
        }
        this.getInputSizeshNQ4ISI = audioFormat;
        return audioFormat;
    }

    @java.lang.Deprecated
    public final void flush() {
        flush(androidx.media3.common.audio.AudioProcessor.StreamMetadata.DEFAULT);
    }

    public final void flush(androidx.media3.common.audio.AudioProcessor.StreamMetadata streamMetadata) {
        this.getHighSpeedVideoFpsRanges.clear();
        this.getHighSpeedVideoFpsRangesFor = this.getInputSizeshNQ4ISI;
        int i = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        long j = streamMetadata.positionOffsetUs;
        int i2 = 0;
        while (true) {
            if (i2 >= this.getHighSpeedVideoSizes.size()) {
                break;
            }
            androidx.media3.common.audio.AudioProcessor audioProcessor = this.getHighSpeedVideoSizes.get(i2);
            audioProcessor.flush(new androidx.media3.common.audio.AudioProcessor.StreamMetadata(j));
            if (audioProcessor.isActive()) {
                j = audioProcessor.getDurationAfterProcessorApplied(j);
                com.google.common.base.Preconditions.checkState(j >= 0);
                this.getHighSpeedVideoFpsRanges.add(audioProcessor);
            }
            i2++;
        }
        this.Camera2StreamConfigurationMap = new java.nio.ByteBuffer[this.getHighSpeedVideoFpsRanges.size()];
        while (true) {
            java.nio.ByteBuffer[] byteBufferArr = this.Camera2StreamConfigurationMap;
            if (i > byteBufferArr.length - 1) {
                return;
            }
            byteBufferArr[i] = this.getHighSpeedVideoFpsRanges.get(i).getOutput();
            i++;
        }
    }

    public final androidx.media3.common.audio.AudioProcessor.AudioFormat getOutputAudioFormat() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean isOperational() {
        return !this.getHighSpeedVideoFpsRanges.isEmpty();
    }

    public final void queueInput(java.nio.ByteBuffer byteBuffer) {
        if (!isOperational() || this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        getHighSpeedVideoFpsRangesFor(byteBuffer);
    }

    public final java.nio.ByteBuffer getOutput() {
        if (!isOperational()) {
            return androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
        }
        java.nio.ByteBuffer byteBuffer = this.Camera2StreamConfigurationMap[r0.length - 1];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        getHighSpeedVideoFpsRangesFor(androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER);
        return this.Camera2StreamConfigurationMap[r0.length - 1];
    }

    public final void queueEndOfStream() {
        if (!isOperational() || this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoFpsRanges.get(0).queueEndOfStream();
    }

    public final boolean isEnded() {
        if (!this.getHighResolutionOutputSizeshNQ4ISI || !this.getHighSpeedVideoFpsRanges.get(this.Camera2StreamConfigurationMap.length - 1).isEnded()) {
            return false;
        }
        java.nio.ByteBuffer[] byteBufferArr = this.Camera2StreamConfigurationMap;
        return !byteBufferArr[byteBufferArr.length - 1].hasRemaining();
    }

    public final void reset() {
        for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
            androidx.media3.common.audio.AudioProcessor audioProcessor = this.getHighSpeedVideoSizes.get(i);
            audioProcessor.flush(androidx.media3.common.audio.AudioProcessor.StreamMetadata.DEFAULT);
            audioProcessor.reset();
        }
        this.Camera2StreamConfigurationMap = new java.nio.ByteBuffer[0];
        this.getHighSpeedVideoFpsRangesFor = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.getInputSizeshNQ4ISI = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.common.audio.AudioProcessingPipeline)) {
            return false;
        }
        androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline = (androidx.media3.common.audio.AudioProcessingPipeline) obj;
        if (this.getHighSpeedVideoSizes.size() != audioProcessingPipeline.getHighSpeedVideoSizes.size()) {
            return false;
        }
        for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
            if (this.getHighSpeedVideoSizes.get(i) != audioProcessingPipeline.getHighSpeedVideoSizes.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    private void getHighSpeedVideoFpsRangesFor(java.nio.ByteBuffer byteBuffer) {
        boolean z;
        java.nio.ByteBuffer byteBuffer2;
        do {
            int i = 0;
            z = false;
            while (true) {
                java.nio.ByteBuffer[] byteBufferArr = this.Camera2StreamConfigurationMap;
                boolean z2 = true;
                if (i > byteBufferArr.length - 1) {
                    break;
                }
                if (!byteBufferArr[i].hasRemaining()) {
                    androidx.media3.common.audio.AudioProcessor audioProcessor = this.getHighSpeedVideoFpsRanges.get(i);
                    if (audioProcessor.isEnded()) {
                        if (!this.Camera2StreamConfigurationMap[i].hasRemaining() && i < this.Camera2StreamConfigurationMap.length - 1) {
                            this.getHighSpeedVideoFpsRanges.get(i + 1).queueEndOfStream();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.Camera2StreamConfigurationMap[i - 1];
                        } else {
                            byteBuffer2 = byteBuffer.hasRemaining() ? byteBuffer : androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
                        }
                        long remaining = byteBuffer2.remaining();
                        audioProcessor.queueInput(byteBuffer2);
                        this.Camera2StreamConfigurationMap[i] = audioProcessor.getOutput();
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.Camera2StreamConfigurationMap[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    }
                }
                i++;
            }
        } while (z);
    }
}
