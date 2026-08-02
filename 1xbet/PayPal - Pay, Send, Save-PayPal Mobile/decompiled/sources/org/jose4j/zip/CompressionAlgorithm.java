package org.jose4j.zip;

/* loaded from: classes18.dex */
public interface CompressionAlgorithm extends org.jose4j.jwa.Algorithm {
    byte[] compress(byte[] bArr);

    byte[] decompress(byte[] bArr) throws org.jose4j.lang.JoseException;
}
