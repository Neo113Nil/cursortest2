package io.appmetrica.analytics.coreutils.internal.io;

/* loaded from: classes.dex */
public class GZIPCompressor implements io.appmetrica.analytics.coreapi.internal.io.Compressor {
    @Override // io.appmetrica.analytics.coreapi.internal.io.Compressor
    public byte[] compress(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return io.appmetrica.analytics.coreutils.internal.io.GZIPUtils.gzipBytes(bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.Compressor
    public byte[] uncompress(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return io.appmetrica.analytics.coreutils.internal.io.GZIPUtils.unGzipBytes(bArr);
    }
}
