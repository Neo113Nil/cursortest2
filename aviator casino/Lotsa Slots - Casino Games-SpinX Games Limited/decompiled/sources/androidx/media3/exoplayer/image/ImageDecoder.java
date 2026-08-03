package androidx.media3.exoplayer.image;

/* loaded from: classes2.dex */
public interface ImageDecoder extends androidx.media3.decoder.Decoder<androidx.media3.decoder.DecoderInputBuffer, androidx.media3.exoplayer.image.ImageOutputBuffer, androidx.media3.exoplayer.image.ImageDecoderException> {

    public interface Factory {
        public static final androidx.media3.exoplayer.image.ImageDecoder.Factory DEFAULT = new androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.Factory();

        androidx.media3.exoplayer.image.ImageDecoder createImageDecoder();

        int supportsFormat(androidx.media3.common.Format format);
    }

    @Override // androidx.media3.decoder.Decoder
    androidx.media3.exoplayer.image.ImageOutputBuffer dequeueOutputBuffer() throws androidx.media3.exoplayer.image.ImageDecoderException;

    void queueInputBuffer(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) throws androidx.media3.exoplayer.image.ImageDecoderException;

    /* renamed from: androidx.media3.exoplayer.image.ImageDecoder$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
