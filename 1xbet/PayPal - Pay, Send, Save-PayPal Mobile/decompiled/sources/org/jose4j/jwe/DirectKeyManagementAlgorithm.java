package org.jose4j.jwe;

/* loaded from: classes18.dex */
public class DirectKeyManagementAlgorithm extends org.jose4j.jwa.AlgorithmInfo implements org.jose4j.jwe.KeyManagementAlgorithm {
    @Override // org.jose4j.jwa.Algorithm
    public boolean isAvailable() {
        return true;
    }

    public DirectKeyManagementAlgorithm() {
        setAlgorithmIdentifier(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.DIRECT);
        setKeyPersuasion(org.jose4j.keys.KeyPersuasion.SYMMETRIC);
        setKeyType(org.jose4j.jwk.OctetSequenceJsonWebKey.KEY_TYPE);
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public org.jose4j.jwe.ContentEncryptionKeys manageForEncrypt(java.security.Key key, org.jose4j.jwe.ContentEncryptionKeyDescriptor contentEncryptionKeyDescriptor, org.jose4j.jwx.Headers headers, byte[] bArr, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        org.jose4j.jwx.KeyValidationSupport.cekNotAllowed(bArr, getAlgorithmIdentifier());
        return new org.jose4j.jwe.ContentEncryptionKeys(key.getEncoded(), org.jose4j.lang.ByteUtil.EMPTY_BYTES);
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public org.jose4j.jwa.CryptoPrimitive prepareForDecrypt(java.security.Key key, org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) {
        return new org.jose4j.jwa.CryptoPrimitive(key);
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public java.security.Key manageForDecrypt(org.jose4j.jwa.CryptoPrimitive cryptoPrimitive, byte[] bArr, org.jose4j.jwe.ContentEncryptionKeyDescriptor contentEncryptionKeyDescriptor, org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        java.security.Key key = cryptoPrimitive.getKey();
        if (bArr.length == 0) {
            return key;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("An empty octet sequence is to be used as the JWE Encrypted Key value when utilizing direct encryption but this JWE has ");
        sb.append(bArr.length);
        sb.append(" octets in the encrypted key part.");
        throw new org.jose4j.lang.InvalidKeyException(sb.toString());
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public void validateEncryptionKey(java.security.Key key, org.jose4j.jwe.ContentEncryptionAlgorithm contentEncryptionAlgorithm) throws org.jose4j.lang.InvalidKeyException {
        getHighSpeedVideoSizes(key, contentEncryptionAlgorithm);
    }

    private void getHighSpeedVideoSizes(java.security.Key key, org.jose4j.jwe.ContentEncryptionAlgorithm contentEncryptionAlgorithm) throws org.jose4j.lang.InvalidKeyException {
        int length;
        int contentEncryptionKeyByteLength;
        org.jose4j.jwx.KeyValidationSupport.notNull(key);
        if (key.getEncoded() == null || (contentEncryptionKeyByteLength = contentEncryptionAlgorithm.getContentEncryptionKeyDescriptor().getContentEncryptionKeyByteLength()) == (length = key.getEncoded().length)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid key for ");
        sb.append(getAlgorithmIdentifier());
        sb.append(" with ");
        sb.append(contentEncryptionAlgorithm.getAlgorithmIdentifier());
        sb.append(", expected a ");
        sb.append(org.jose4j.lang.ByteUtil.bitLength(contentEncryptionKeyByteLength));
        sb.append(" bit key but a ");
        sb.append(org.jose4j.lang.ByteUtil.bitLength(length));
        sb.append(" bit key was provided.");
        throw new org.jose4j.lang.InvalidKeyException(sb.toString());
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public void validateDecryptionKey(java.security.Key key, org.jose4j.jwe.ContentEncryptionAlgorithm contentEncryptionAlgorithm) throws org.jose4j.lang.InvalidKeyException {
        getHighSpeedVideoSizes(key, contentEncryptionAlgorithm);
    }
}
