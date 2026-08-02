package androidx.media3.common.audio;

/* loaded from: classes7.dex */
public final class ChannelMixingAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    private final android.util.SparseArray<androidx.media3.common.audio.ChannelMixingMatrix> getHighSpeedVideoFpsRanges = new android.util.SparseArray<>();

    public final void putChannelMixingMatrix(androidx.media3.common.audio.ChannelMixingMatrix channelMixingMatrix) {
        this.getHighSpeedVideoFpsRanges.put(channelMixingMatrix.getInputChannelCount(), channelMixingMatrix);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected final androidx.media3.common.audio.AudioProcessor.AudioFormat onConfigure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        if (!androidx.media3.common.audio.AudioMixingUtil.canMix(audioFormat)) {
            throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        androidx.media3.common.audio.ChannelMixingMatrix channelMixingMatrix = this.getHighSpeedVideoFpsRanges.get(audioFormat.channelCount);
        if (channelMixingMatrix == null) {
            throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException("No mixing matrix for input channel count", audioFormat);
        }
        if (channelMixingMatrix.isIdentity()) {
            return androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        }
        return new androidx.media3.common.audio.AudioProcessor.AudioFormat(audioFormat.sampleRate, channelMixingMatrix.getOutputChannelCount(), audioFormat.encoding);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(java.nio.ByteBuffer byteBuffer) {
        androidx.media3.common.audio.ChannelMixingMatrix channelMixingMatrix = (androidx.media3.common.audio.ChannelMixingMatrix) com.google.common.base.Preconditions.checkNotNull(this.getHighSpeedVideoFpsRanges.get(this.inputAudioFormat.channelCount));
        int remaining = byteBuffer.remaining() / this.inputAudioFormat.bytesPerFrame;
        java.nio.ByteBuffer replaceOutputBuffer = replaceOutputBuffer(this.outputAudioFormat.bytesPerFrame * remaining);
        androidx.media3.common.audio.AudioMixingUtil.mix(byteBuffer, this.inputAudioFormat, replaceOutputBuffer, this.outputAudioFormat, channelMixingMatrix, remaining, false, true);
        replaceOutputBuffer.flip();
    }
}
