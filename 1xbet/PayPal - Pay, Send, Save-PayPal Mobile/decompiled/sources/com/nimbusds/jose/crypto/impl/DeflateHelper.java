package com.nimbusds.jose.crypto.impl;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class DeflateHelper {
    public static byte[] applyCompression(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.CompressionAlgorithm compressionAlgorithm = jWEHeader.getCompressionAlgorithm();
        if (compressionAlgorithm == null) {
            return bArr;
        }
        if (compressionAlgorithm.equals(com.nimbusds.jose.CompressionAlgorithm.DEF)) {
            try {
                return com.nimbusds.jose.util.DeflateUtils.compress(bArr);
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't compress plain text: ");
                sb.append(e.getMessage());
                throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
            }
        }
        throw new com.nimbusds.jose.JOSEException("Unsupported compression algorithm: ".concat(java.lang.String.valueOf(compressionAlgorithm)));
    }

    public static byte[] applyDecompression(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.CompressionAlgorithm compressionAlgorithm = jWEHeader.getCompressionAlgorithm();
        if (compressionAlgorithm == null) {
            return bArr;
        }
        if (compressionAlgorithm.equals(com.nimbusds.jose.CompressionAlgorithm.DEF)) {
            try {
                return com.nimbusds.jose.util.DeflateUtils.decompress(bArr);
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't decompress plain text: ");
                sb.append(e.getMessage());
                throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
            }
        }
        throw new com.nimbusds.jose.JOSEException("Unsupported compression algorithm: ".concat(java.lang.String.valueOf(compressionAlgorithm)));
    }
}
