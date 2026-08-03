package com.google.android.exoplayer2.audio;

/* loaded from: classes3.dex */
public interface AudioProcessor {
    public static final java.nio.ByteBuffer EMPTY_BUFFER = java.nio.ByteBuffer.allocateDirect(0).order(java.nio.ByteOrder.nativeOrder());

    com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat configure(com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat audioFormat) throws com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException;

    void flush();

    java.nio.ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(java.nio.ByteBuffer byteBuffer);

    void reset();

    public static final class AudioFormat {
        public static final com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat NOT_SET = new com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat(-1, -1, -1);
        public final int bytesPerFrame;
        public final int channelCount;
        public final int encoding;
        public final int sampleRate;

        public AudioFormat(int i, int i2, int i3) {
            this.sampleRate = i;
            this.channelCount = i2;
            this.encoding = i3;
            this.bytesPerFrame = com.google.android.exoplayer2.util.Util.isEncodingLinearPcm(i3) ? com.google.android.exoplayer2.util.Util.getPcmFrameSize(i3, i2) : -1;
        }

        public java.lang.String toString() {
            return "AudioFormat[sampleRate=" + this.sampleRate + ", channelCount=" + this.channelCount + ", encoding=" + this.encoding + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat)) {
                return false;
            }
            com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat audioFormat = (com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat) obj;
            return this.sampleRate == audioFormat.sampleRate && this.channelCount == audioFormat.channelCount && this.encoding == audioFormat.encoding;
        }

        public int hashCode() {
            return com.google.common.base.Objects.hashCode(java.lang.Integer.valueOf(this.sampleRate), java.lang.Integer.valueOf(this.channelCount), java.lang.Integer.valueOf(this.encoding));
        }
    }

    public static final class UnhandledAudioFormatException extends java.lang.Exception {
        public UnhandledAudioFormatException(com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat audioFormat) {
            super("Unhandled format: " + audioFormat);
        }
    }
}
