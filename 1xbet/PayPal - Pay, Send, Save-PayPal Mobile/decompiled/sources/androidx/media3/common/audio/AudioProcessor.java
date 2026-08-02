package androidx.media3.common.audio;

/* loaded from: classes7.dex */
public interface AudioProcessor {
    public static final java.nio.ByteBuffer EMPTY_BUFFER = java.nio.ByteBuffer.allocateDirect(0).order(java.nio.ByteOrder.nativeOrder());

    androidx.media3.common.audio.AudioProcessor.AudioFormat configure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException;

    default long getDurationAfterProcessorApplied(long j) {
        return j;
    }

    java.nio.ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(java.nio.ByteBuffer byteBuffer);

    void reset();

    public static final class AudioFormat {
        public static final androidx.media3.common.audio.AudioProcessor.AudioFormat NOT_SET = new androidx.media3.common.audio.AudioProcessor.AudioFormat(-1, -1, -1);
        public final int bytesPerFrame;
        public final int channelCount;
        public final int encoding;
        public final int sampleRate;

        public AudioFormat(androidx.media3.common.Format format) {
            this(format.sampleRate, format.channelCount, format.pcmEncoding);
        }

        public AudioFormat(int i, int i2, int i3) {
            this.sampleRate = i;
            this.channelCount = i2;
            this.encoding = i3;
            this.bytesPerFrame = androidx.media3.common.util.Util.isEncodingLinearPcm(i3) ? androidx.media3.common.util.Util.getPcmFrameSize(i3, i2) : -1;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.sampleRate);
            sb.append(", channelCount=");
            sb.append(this.channelCount);
            sb.append(", encoding=");
            sb.append(this.encoding);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            return sb.toString();
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.audio.AudioProcessor.AudioFormat)) {
                return false;
            }
            androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat = (androidx.media3.common.audio.AudioProcessor.AudioFormat) obj;
            return this.sampleRate == audioFormat.sampleRate && this.channelCount == audioFormat.channelCount && this.encoding == audioFormat.encoding;
        }

        public final int hashCode() {
            return java.util.Objects.hash(java.lang.Integer.valueOf(this.sampleRate), java.lang.Integer.valueOf(this.channelCount), java.lang.Integer.valueOf(this.encoding));
        }
    }

    public static final class UnhandledAudioFormatException extends java.lang.Exception {
        public final androidx.media3.common.audio.AudioProcessor.AudioFormat inputAudioFormat;

        public UnhandledAudioFormatException(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
            this("Unhandled input format:", audioFormat);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public UnhandledAudioFormatException(java.lang.String str, androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
            super(r0.toString());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(audioFormat);
            this.inputAudioFormat = audioFormat;
        }
    }

    public static final class StreamMetadata {
        public static final androidx.media3.common.audio.AudioProcessor.StreamMetadata DEFAULT = new androidx.media3.common.audio.AudioProcessor.StreamMetadata(0);
        public final long positionOffsetUs;

        public StreamMetadata(long j) {
            com.google.common.base.Preconditions.checkArgument(j >= 0);
            this.positionOffsetUs = j;
        }
    }

    @java.lang.Deprecated
    default void flush() {
        throw new java.lang.IllegalStateException("AudioProcessor must implement at least one #flush() overload.");
    }

    default void flush(androidx.media3.common.audio.AudioProcessor.StreamMetadata streamMetadata) {
        flush();
    }
}
