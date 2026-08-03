package com.google.android.exoplayer2.text;

/* loaded from: classes3.dex */
public abstract class SimpleSubtitleDecoder extends com.google.android.exoplayer2.decoder.SimpleDecoder<com.google.android.exoplayer2.text.SubtitleInputBuffer, com.google.android.exoplayer2.text.SubtitleOutputBuffer, com.google.android.exoplayer2.text.SubtitleDecoderException> implements com.google.android.exoplayer2.text.SubtitleDecoder {
    private final java.lang.String name;

    protected abstract com.google.android.exoplayer2.text.Subtitle decode(byte[] bArr, int i, boolean z) throws com.google.android.exoplayer2.text.SubtitleDecoderException;

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long j) {
    }

    protected SimpleSubtitleDecoder(java.lang.String str) {
        super(new com.google.android.exoplayer2.text.SubtitleInputBuffer[2], new com.google.android.exoplayer2.text.SubtitleOutputBuffer[2]);
        this.name = str;
        setInitialInputBufferSize(1024);
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    public final com.google.android.exoplayer2.text.SubtitleInputBuffer createInputBuffer() {
        return new com.google.android.exoplayer2.text.SubtitleInputBuffer();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    public final com.google.android.exoplayer2.text.SubtitleOutputBuffer createOutputBuffer() {
        return new com.google.android.exoplayer2.text.SubtitleOutputBuffer() { // from class: com.google.android.exoplayer2.text.SimpleSubtitleDecoder.1
            @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
            public void release() {
                com.google.android.exoplayer2.text.SimpleSubtitleDecoder.this.releaseOutputBuffer(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    public final com.google.android.exoplayer2.text.SubtitleDecoderException createUnexpectedDecodeException(java.lang.Throwable th) {
        return new com.google.android.exoplayer2.text.SubtitleDecoderException("Unexpected decode error", th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    public final com.google.android.exoplayer2.text.SubtitleDecoderException decode(com.google.android.exoplayer2.text.SubtitleInputBuffer subtitleInputBuffer, com.google.android.exoplayer2.text.SubtitleOutputBuffer subtitleOutputBuffer, boolean z) {
        try {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) com.google.android.exoplayer2.util.Assertions.checkNotNull(subtitleInputBuffer.data);
            subtitleOutputBuffer.setContent(subtitleInputBuffer.timeUs, decode(byteBuffer.array(), byteBuffer.limit(), z), subtitleInputBuffer.subsampleOffsetUs);
            subtitleOutputBuffer.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (com.google.android.exoplayer2.text.SubtitleDecoderException e) {
            return e;
        }
    }
}
