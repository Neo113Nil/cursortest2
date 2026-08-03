package com.google.android.exoplayer2.mediacodec;

/* loaded from: classes3.dex */
public interface MediaCodecAdapter {

    public interface Factory {
        public static final com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory DEFAULT = new com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory();

        com.google.android.exoplayer2.mediacodec.MediaCodecAdapter createAdapter(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration configuration) throws java.io.IOException;
    }

    public interface OnFrameRenderedListener {
        void onFrameRendered(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter mediaCodecAdapter, long j, long j2);
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

    void queueSecureInputBuffer(int i, int i2, com.google.android.exoplayer2.decoder.CryptoInfo cryptoInfo, long j, int i3);

    void release();

    void releaseOutputBuffer(int i, long j);

    void releaseOutputBuffer(int i, boolean z);

    void setOnFrameRenderedListener(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, android.os.Handler handler);

    void setOutputSurface(android.view.Surface surface);

    void setParameters(android.os.Bundle bundle);

    void setVideoScalingMode(int i);

    public static final class Configuration {
        public final com.google.android.exoplayer2.mediacodec.MediaCodecInfo codecInfo;
        public final android.media.MediaCrypto crypto;
        public final int flags;
        public final com.google.android.exoplayer2.Format format;
        public final android.media.MediaFormat mediaFormat;
        public final android.view.Surface surface;

        public static com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration createForAudioDecoding(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo, android.media.MediaFormat mediaFormat, com.google.android.exoplayer2.Format format, android.media.MediaCrypto mediaCrypto) {
            return new com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration(mediaCodecInfo, mediaFormat, format, null, mediaCrypto, 0);
        }

        public static com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration createForVideoDecoding(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo, android.media.MediaFormat mediaFormat, com.google.android.exoplayer2.Format format, android.view.Surface surface, android.media.MediaCrypto mediaCrypto) {
            return new com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration(mediaCodecInfo, mediaFormat, format, surface, mediaCrypto, 0);
        }

        private Configuration(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo, android.media.MediaFormat mediaFormat, com.google.android.exoplayer2.Format format, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i) {
            this.codecInfo = mediaCodecInfo;
            this.mediaFormat = mediaFormat;
            this.format = format;
            this.surface = surface;
            this.crypto = mediaCrypto;
            this.flags = i;
        }
    }
}
