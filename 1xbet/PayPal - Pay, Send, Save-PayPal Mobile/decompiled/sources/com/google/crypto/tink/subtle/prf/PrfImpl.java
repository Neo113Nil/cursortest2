package com.google.crypto.tink.subtle.prf;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public class PrfImpl implements com.google.crypto.tink.prf.Prf {
    private final com.google.crypto.tink.subtle.prf.StreamingPrf prfStreamer;

    private PrfImpl(com.google.crypto.tink.subtle.prf.StreamingPrf streamingPrf) {
        this.prfStreamer = streamingPrf;
    }

    public static com.google.crypto.tink.subtle.prf.PrfImpl wrap(com.google.crypto.tink.subtle.prf.StreamingPrf streamingPrf) {
        return new com.google.crypto.tink.subtle.prf.PrfImpl(streamingPrf);
    }

    private static byte[] readBytesFromStream(java.io.InputStream inputStream, int i) throws java.security.GeneralSecurityException {
        try {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read <= 0) {
                    throw new java.security.GeneralSecurityException("Provided StreamingPrf terminated before providing requested number of bytes.");
                }
                i2 += read;
            }
            return bArr;
        } catch (java.io.IOException e) {
            throw new java.security.GeneralSecurityException(e);
        }
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        if (bArr == null) {
            throw new java.security.GeneralSecurityException("Invalid input provided.");
        }
        if (i <= 0) {
            throw new java.security.GeneralSecurityException("Invalid outputLength specified.");
        }
        return readBytesFromStream(this.prfStreamer.computePrf(bArr), i);
    }
}
