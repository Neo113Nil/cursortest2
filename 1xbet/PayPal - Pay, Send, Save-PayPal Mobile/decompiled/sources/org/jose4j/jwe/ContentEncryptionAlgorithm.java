package org.jose4j.jwe;

/* loaded from: classes18.dex */
public interface ContentEncryptionAlgorithm extends org.jose4j.jwa.Algorithm {
    byte[] decrypt(org.jose4j.jwe.ContentEncryptionParts contentEncryptionParts, byte[] bArr, byte[] bArr2, org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException;

    org.jose4j.jwe.ContentEncryptionParts encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, org.jose4j.jwx.Headers headers, byte[] bArr4, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException;

    org.jose4j.jwe.ContentEncryptionKeyDescriptor getContentEncryptionKeyDescriptor();
}
