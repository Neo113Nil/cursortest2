package org.jose4j.zip;

/* loaded from: classes18.dex */
public class DeflateRFC1951CompressionAlgorithm implements org.jose4j.zip.CompressionAlgorithm {
    @Override // org.jose4j.jwa.Algorithm
    public java.lang.String getJavaAlgorithm() {
        return null;
    }

    @Override // org.jose4j.jwa.Algorithm
    public java.lang.String getKeyType() {
        return null;
    }

    @Override // org.jose4j.jwa.Algorithm
    public boolean isAvailable() {
        return true;
    }

    @Override // org.jose4j.zip.CompressionAlgorithm
    public byte[] compress(byte[] bArr) {
        java.util.zip.Deflater deflater = new java.util.zip.Deflater(8, true);
        try {
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    java.util.zip.DeflaterOutputStream deflaterOutputStream = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream, deflater);
                    try {
                        deflaterOutputStream.write(bArr);
                        deflaterOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        deflaterOutputStream.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } finally {
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                deflater.end();
            }
        } catch (java.io.IOException e) {
            throw new org.jose4j.lang.UncheckedJoseException("Problem compressing data.", e);
        }
    }

    @Override // org.jose4j.zip.CompressionAlgorithm
    public byte[] decompress(byte[] bArr) throws org.jose4j.lang.JoseException {
        java.util.zip.Inflater inflater = new java.util.zip.Inflater(true);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            try {
                java.util.zip.InflaterInputStream inflaterInputStream = new java.util.zip.InflaterInputStream(new java.io.ByteArrayInputStream(bArr), inflater);
                try {
                    byte[] bArr2 = new byte[256];
                    while (true) {
                        int read = inflaterInputStream.read(bArr2);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr2, 0, read);
                        } else {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            inflaterInputStream.close();
                            return byteArray;
                        }
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        inflaterInputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.io.IOException e) {
                throw new org.jose4j.lang.JoseException("Problem decompressing data.", e);
            }
        } finally {
            inflater.end();
        }
    }

    @Override // org.jose4j.jwa.Algorithm
    public java.lang.String getAlgorithmIdentifier() {
        return org.jose4j.zip.CompressionAlgorithmIdentifiers.DEFLATE;
    }

    @Override // org.jose4j.jwa.Algorithm
    public org.jose4j.keys.KeyPersuasion getKeyPersuasion() {
        return org.jose4j.keys.KeyPersuasion.NONE;
    }
}
