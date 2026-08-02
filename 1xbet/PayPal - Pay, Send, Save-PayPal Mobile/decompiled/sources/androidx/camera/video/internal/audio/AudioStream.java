package androidx.camera.video.internal.audio;

/* loaded from: classes6.dex */
public interface AudioStream {

    public interface AudioStreamCallback {
        default void onSilenceStateChanged(boolean z) {
        }
    }

    androidx.camera.video.internal.audio.AudioStream.PacketInfo read(java.nio.ByteBuffer byteBuffer);

    void release();

    void setCallback(androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback audioStreamCallback, java.util.concurrent.Executor executor);

    void start() throws androidx.camera.video.internal.audio.AudioStream.AudioStreamException, java.lang.IllegalStateException;

    void stop() throws java.lang.IllegalStateException;

    public static abstract class PacketInfo {
        public abstract int getSizeInBytes();

        public abstract long getTimestampNs();

        public static androidx.camera.video.internal.audio.AudioStream.PacketInfo of(int i, long j) {
            return new androidx.camera.video.internal.audio.AutoValue_AudioStream_PacketInfo(i, j);
        }
    }

    public static class AudioStreamException extends java.lang.Exception {
        public AudioStreamException() {
        }

        public AudioStreamException(java.lang.String str) {
            super(str);
        }

        public AudioStreamException(java.lang.String str, java.lang.Throwable th) {
            super(str, th);
        }

        public AudioStreamException(java.lang.Throwable th) {
            super(th);
        }
    }
}
