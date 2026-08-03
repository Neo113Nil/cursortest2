package com.google.android.exoplayer2.mediacodec;

/* loaded from: classes3.dex */
public final class SynchronousMediaCodecAdapter implements com.google.android.exoplayer2.mediacodec.MediaCodecAdapter {
    private final android.media.MediaCodec codec;
    private java.nio.ByteBuffer[] inputByteBuffers;
    private java.nio.ByteBuffer[] outputByteBuffers;

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
        return false;
    }

    public static class Factory implements com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter$1] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory
        public com.google.android.exoplayer2.mediacodec.MediaCodecAdapter createAdapter(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration configuration) throws java.io.IOException {
            android.media.MediaCodec createCodec;
            android.media.MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                createCodec = createCodec(configuration);
            } catch (java.io.IOException e) {
                e = e;
            } catch (java.lang.RuntimeException e2) {
                e = e2;
            }
            try {
                com.google.android.exoplayer2.util.TraceUtil.beginSection("configureCodec");
                createCodec.configure(configuration.mediaFormat, configuration.surface, configuration.crypto, configuration.flags);
                com.google.android.exoplayer2.util.TraceUtil.endSection();
                com.google.android.exoplayer2.util.TraceUtil.beginSection("startCodec");
                createCodec.start();
                com.google.android.exoplayer2.util.TraceUtil.endSection();
                return new com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter(createCodec);
            } catch (java.io.IOException | java.lang.RuntimeException e3) {
                e = e3;
                mediaCodec = createCodec;
                if (mediaCodec != 0) {
                    mediaCodec.release();
                }
                throw e;
            }
        }

        protected android.media.MediaCodec createCodec(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration configuration) throws java.io.IOException {
            com.google.android.exoplayer2.util.Assertions.checkNotNull(configuration.codecInfo);
            java.lang.String str = configuration.codecInfo.name;
            com.google.android.exoplayer2.util.TraceUtil.beginSection("createCodec:" + str);
            android.media.MediaCodec createByCodecName = android.media.MediaCodec.createByCodecName(str);
            com.google.android.exoplayer2.util.TraceUtil.endSection();
            return createByCodecName;
        }
    }

    private SynchronousMediaCodecAdapter(android.media.MediaCodec mediaCodec) {
        this.codec = mediaCodec;
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 21) {
            this.inputByteBuffers = mediaCodec.getInputBuffers();
            this.outputByteBuffers = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
        return this.codec.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(android.media.MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && com.google.android.exoplayer2.util.Util.SDK_INT < 21) {
                this.outputByteBuffers = this.codec.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public android.media.MediaFormat getOutputFormat() {
        return this.codec.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public java.nio.ByteBuffer getInputBuffer(int i) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 21) {
            return this.codec.getInputBuffer(i);
        }
        return ((java.nio.ByteBuffer[]) com.google.android.exoplayer2.util.Util.castNonNull(this.inputByteBuffers))[i];
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public java.nio.ByteBuffer getOutputBuffer(int i) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 21) {
            return this.codec.getOutputBuffer(i);
        }
        return ((java.nio.ByteBuffer[]) com.google.android.exoplayer2.util.Util.castNonNull(this.outputByteBuffers))[i];
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.codec.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int i, int i2, com.google.android.exoplayer2.decoder.CryptoInfo cryptoInfo, long j, int i3) {
        this.codec.queueSecureInputBuffer(i, i2, cryptoInfo.getFrameworkCryptoInfo(), j, i3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i, boolean z) {
        this.codec.releaseOutputBuffer(i, z);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i, long j) {
        this.codec.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void flush() {
        this.codec.flush();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void release() {
        this.inputByteBuffers = null;
        this.outputByteBuffers = null;
        this.codec.release();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setOnFrameRenderedListener(final com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, android.os.Handler handler) {
        this.codec.setOnFrameRenderedListener(new android.media.MediaCodec.OnFrameRenderedListener() { // from class: com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter$$ExternalSyntheticLambda0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(android.media.MediaCodec mediaCodec, long j, long j2) {
                com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter.this.m5408x143bf9f7(onFrameRenderedListener, mediaCodec, j, j2);
            }
        }, handler);
    }

    /* renamed from: lambda$setOnFrameRenderedListener$0$com-google-android-exoplayer2-mediacodec-SynchronousMediaCodecAdapter, reason: not valid java name */
    /* synthetic */ void m5408x143bf9f7(com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, android.media.MediaCodec mediaCodec, long j, long j2) {
        onFrameRenderedListener.onFrameRendered(this, j, j2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setOutputSurface(android.view.Surface surface) {
        this.codec.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setParameters(android.os.Bundle bundle) {
        this.codec.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int i) {
        this.codec.setVideoScalingMode(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public android.os.PersistableBundle getMetrics() {
        return this.codec.getMetrics();
    }
}
