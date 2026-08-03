package androidx.media3.exoplayer.mediacodec;

/* loaded from: classes2.dex */
public interface MediaCodecAdapter {

    /* renamed from: androidx.media3.exoplayer.mediacodec.MediaCodecAdapter$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$registerOnBufferAvailableListener(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter _this, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener) {
            return false;
        }
    }

    public interface OnBufferAvailableListener {

        /* renamed from: androidx.media3.exoplayer.mediacodec.MediaCodecAdapter$OnBufferAvailableListener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onInputBufferAvailable(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener _this) {
            }

            public static void $default$onOutputBufferAvailable(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener _this) {
            }
        }

        void onInputBufferAvailable();

        void onOutputBufferAvailable();
    }

    public interface OnFrameRenderedListener {
        void onFrameRendered(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, long j, long j2);
    }

    int dequeueInputBufferIndex();

    int dequeueOutputBufferIndex(android.media.MediaCodec.BufferInfo bufferInfo);

    void flush();

    java.nio.ByteBuffer getInputBuffer(int i);

    android.os.PersistableBundle getMetrics();

    java.nio.ByteBuffer getOutputBuffer(int i);

    android.media.MediaFormat getOutputFormat();

    boolean needsReconfiguration();

    void queueInputBuffer(int i, int i2, int i3, long j, int i4);

    void queueSecureInputBuffer(int i, int i2, androidx.media3.decoder.CryptoInfo cryptoInfo, long j, int i3);

    boolean registerOnBufferAvailableListener(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener);

    void release();

    void releaseOutputBuffer(int i, long j);

    void releaseOutputBuffer(int i, boolean z);

    void setOnFrameRenderedListener(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, android.os.Handler handler);

    void setOutputSurface(android.view.Surface surface);

    void setParameters(android.os.Bundle bundle);

    void setVideoScalingMode(int i);

    public static final class Configuration {
        public final androidx.media3.exoplayer.mediacodec.MediaCodecInfo codecInfo;
        public final android.media.MediaCrypto crypto;
        public final int flags;
        public final androidx.media3.common.Format format;
        public final android.media.MediaFormat mediaFormat;
        public final android.view.Surface surface;

        public static androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration createForAudioDecoding(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, android.media.MediaFormat mediaFormat, androidx.media3.common.Format format, android.media.MediaCrypto mediaCrypto) {
            return new androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration(mediaCodecInfo, mediaFormat, format, null, mediaCrypto, 0);
        }

        public static androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration createForVideoDecoding(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, android.media.MediaFormat mediaFormat, androidx.media3.common.Format format, android.view.Surface surface, android.media.MediaCrypto mediaCrypto) {
            return new androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration(mediaCodecInfo, mediaFormat, format, surface, mediaCrypto, 0);
        }

        private Configuration(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, android.media.MediaFormat mediaFormat, androidx.media3.common.Format format, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i) {
            this.codecInfo = mediaCodecInfo;
            this.mediaFormat = mediaFormat;
            this.format = format;
            this.surface = surface;
            this.crypto = mediaCrypto;
            this.flags = i;
        }
    }

    public interface Factory {

        @java.lang.Deprecated
        public static final androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory DEFAULT = new androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory();

        androidx.media3.exoplayer.mediacodec.MediaCodecAdapter createAdapter(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration configuration) throws java.io.IOException;

        /* renamed from: androidx.media3.exoplayer.mediacodec.MediaCodecAdapter$Factory$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            static {
                androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory factory = androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory.DEFAULT;
            }

            public static androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory getDefault(android.content.Context context) {
                return new androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory(context);
            }
        }
    }
}
