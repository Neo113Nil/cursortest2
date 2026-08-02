package com.google.zxing.pdf417.encoder;

/* loaded from: classes9.dex */
public final class PDF417HighLevelEncoderTestAdapter {
    private PDF417HighLevelEncoderTestAdapter() {
    }

    public static java.lang.String encodeHighLevel(java.lang.String str, com.google.zxing.pdf417.encoder.Compaction compaction, java.nio.charset.Charset charset, boolean z) throws com.google.zxing.WriterException {
        return com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.encodeHighLevel(str, compaction, charset, z);
    }
}
