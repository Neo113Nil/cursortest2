package androidx.media3.common.audio;

/* loaded from: classes2.dex */
public interface AudioProcessor {
    public static final java.nio.ByteBuffer EMPTY_BUFFER = java.nio.ByteBuffer.allocateDirect(0).order(java.nio.ByteOrder.nativeOrder());

    /* renamed from: androidx.media3.common.audio.AudioProcessor$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static long $default$getDurationAfterProcessorApplied(androidx.media3.common.audio.AudioProcessor _this, long j) {
            return j;
        }
    }

    androidx.media3.common.audio.AudioProcessor.AudioFormat configure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException;

    void flush();

    long getDurationAfterProcessorApplied(long j);

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

        public java.lang.String toString() {
            return "AudioFormat[sampleRate=" + this.sampleRate + ", channelCount=" + this.channelCount + ", encoding=" + this.encoding + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.audio.AudioProcessor.AudioFormat)) {
                return false;
            }
            androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat = (androidx.media3.common.audio.AudioProcessor.AudioFormat) obj;
            return this.sampleRate == audioFormat.sampleRate && this.channelCount == audioFormat.channelCount && this.encoding == audioFormat.encoding;
        }

        public int hashCode() {
            return com.google.common.base.Objects.hashCode(java.lang.Integer.valueOf(this.sampleRate), java.lang.Integer.valueOf(this.channelCount), java.lang.Integer.valueOf(this.encoding));
        }
    }

    public static final class UnhandledAudioFormatException extends java.lang.Exception {
        public final androidx.media3.common.audio.AudioProcessor.AudioFormat inputAudioFormat;

        public UnhandledAudioFormatException(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
            this("Unhandled input format:", audioFormat);
        }

        public UnhandledAudioFormatException(java.lang.String str, androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
            super(str + io.ktor.sse.ServerSentEventKt.SPACE + audioFormat);
            this.inputAudioFormat = audioFormat;
        }
    }
}
