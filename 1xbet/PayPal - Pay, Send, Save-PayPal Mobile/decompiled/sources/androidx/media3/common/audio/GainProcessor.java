package androidx.media3.common.audio;

/* loaded from: classes7.dex */
public final class GainProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    private long getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.media3.common.audio.GainProcessor.GainProvider getHighSpeedVideoFpsRanges;

    public interface GainProvider {
        float getGainFactorAtSamplePosition(long j, int i);

        long isUnityUntil(long j, int i);
    }

    public GainProcessor(androidx.media3.common.audio.GainProcessor.GainProvider gainProvider) {
        this.getHighSpeedVideoFpsRanges = (androidx.media3.common.audio.GainProcessor.GainProvider) com.google.common.base.Preconditions.checkNotNull(gainProvider);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final androidx.media3.common.audio.AudioProcessor.AudioFormat onConfigure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        int i = audioFormat.encoding;
        if (i == 2 || i == 4) {
            return audioFormat;
        }
        throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException("Invalid PCM encoding. Expected 16 bit PCM or float PCM.", audioFormat);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        return (!super.isActive() || java.util.Objects.equals(this.inputAudioFormat, androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET) || this.getHighSpeedVideoFpsRanges.isUnityUntil(0L, this.inputAudioFormat.sampleRate) == Long.MIN_VALUE) ? false : true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(java.nio.ByteBuffer byteBuffer) {
        com.google.common.base.Preconditions.checkState(!java.util.Objects.equals(this.inputAudioFormat, androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET), "Audio processor must be configured and flushed before calling queueInput().");
        if (byteBuffer.hasRemaining()) {
            com.google.common.base.Preconditions.checkArgument(byteBuffer.remaining() % this.inputAudioFormat.bytesPerFrame == 0, "Queued an incomplete frame.");
            java.nio.ByteBuffer replaceOutputBuffer = replaceOutputBuffer(byteBuffer.remaining());
            while (byteBuffer.hasRemaining()) {
                float gainFactorAtSamplePosition = this.getHighSpeedVideoFpsRanges.getGainFactorAtSamplePosition(this.getHighResolutionOutputSizeshNQ4ISI, this.inputAudioFormat.sampleRate);
                if (gainFactorAtSamplePosition == 1.0f) {
                    int limit = byteBuffer.limit();
                    long isUnityUntil = this.getHighSpeedVideoFpsRanges.isUnityUntil(this.getHighResolutionOutputSizeshNQ4ISI, this.inputAudioFormat.sampleRate);
                    com.google.common.base.Preconditions.checkState(isUnityUntil != androidx.media3.common.C.TIME_UNSET, "Expected a valid end boundary for unity region.");
                    if (isUnityUntil != Long.MIN_VALUE) {
                        byteBuffer.limit(java.lang.Math.min(limit, ((int) ((isUnityUntil - this.getHighResolutionOutputSizeshNQ4ISI) * this.inputAudioFormat.bytesPerFrame)) + byteBuffer.position()));
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI += byteBuffer.remaining() / this.inputAudioFormat.bytesPerFrame;
                    replaceOutputBuffer.put(byteBuffer);
                    byteBuffer.limit(limit);
                } else {
                    for (int i = 0; i < this.inputAudioFormat.channelCount; i++) {
                        int i2 = this.inputAudioFormat.encoding;
                        if (i2 == 2) {
                            replaceOutputBuffer.putShort((short) (byteBuffer.getShort() * gainFactorAtSamplePosition));
                        } else if (i2 == 4) {
                            replaceOutputBuffer.putFloat(byteBuffer.getFloat() * gainFactorAtSamplePosition);
                        } else {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected PCM encoding: ");
                            sb.append(this.inputAudioFormat.encoding);
                            throw new java.lang.IllegalStateException(sb.toString());
                        }
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI++;
                }
            }
            replaceOutputBuffer.flip();
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void onFlush(androidx.media3.common.audio.AudioProcessor.StreamMetadata streamMetadata) {
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.durationUsToSampleCount(streamMetadata.positionOffsetUs, this.inputAudioFormat.sampleRate);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void onReset() {
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
    }
}
