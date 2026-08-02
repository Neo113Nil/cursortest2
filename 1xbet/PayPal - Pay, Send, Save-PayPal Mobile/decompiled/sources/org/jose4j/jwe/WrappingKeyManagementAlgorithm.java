package org.jose4j.jwe;

/* loaded from: classes18.dex */
public abstract class WrappingKeyManagementAlgorithm extends org.jose4j.jwa.AlgorithmInfo implements org.jose4j.jwe.KeyManagementAlgorithm {
    private java.security.spec.AlgorithmParameterSpec getHighSpeedVideoSizes;
    protected final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(getClass());
    protected boolean useSuppliedKeyProviderContext = true;

    public WrappingKeyManagementAlgorithm(java.lang.String str, java.lang.String str2) {
        setJavaAlgorithm(str);
        setAlgorithmIdentifier(str2);
    }

    public void setAlgorithmParameterSpec(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
        this.getHighSpeedVideoSizes = algorithmParameterSpec;
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public org.jose4j.jwe.ContentEncryptionKeys manageForEncrypt(java.security.Key key, org.jose4j.jwe.ContentEncryptionKeyDescriptor contentEncryptionKeyDescriptor, org.jose4j.jwx.Headers headers, byte[] bArr, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        if (bArr == null) {
            bArr = org.jose4j.lang.ByteUtil.randomBytes(contentEncryptionKeyDescriptor.getContentEncryptionKeyByteLength());
        }
        return manageForEnc(key, contentEncryptionKeyDescriptor, bArr, providerContext);
    }

    protected org.jose4j.jwe.ContentEncryptionKeys manageForEnc(java.security.Key key, org.jose4j.jwe.ContentEncryptionKeyDescriptor contentEncryptionKeyDescriptor, byte[] bArr, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        javax.crypto.Cipher highResolutionOutputSizeshNQ4ISI = org.jose4j.jwe.CipherUtil.getHighResolutionOutputSizeshNQ4ISI(getJavaAlgorithm(), (this.useSuppliedKeyProviderContext ? providerContext.getSuppliedKeyProviderContext() : providerContext.getGeneralProviderContext()).getCipherProvider());
        try {
            java.security.spec.AlgorithmParameterSpec algorithmParameterSpec = this.getHighSpeedVideoSizes;
            if (algorithmParameterSpec == null) {
                highResolutionOutputSizeshNQ4ISI.init(3, key);
            } else {
                highResolutionOutputSizeshNQ4ISI.init(3, key, algorithmParameterSpec);
            }
            return new org.jose4j.jwe.ContentEncryptionKeys(bArr, highResolutionOutputSizeshNQ4ISI.wrap(new javax.crypto.spec.SecretKeySpec(bArr, contentEncryptionKeyDescriptor.getContentEncryptionKeyAlgorithm())));
        } catch (java.security.InvalidAlgorithmParameterException e) {
            e = e;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to encrypt (");
            sb.append(highResolutionOutputSizeshNQ4ISI.getAlgorithm());
            sb.append(") the Content Encryption Key: ");
            sb.append(e);
            throw new org.jose4j.lang.JoseException(sb.toString(), e);
        } catch (java.security.InvalidKeyException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to encrypt (");
            sb2.append(highResolutionOutputSizeshNQ4ISI.getAlgorithm());
            sb2.append(") the Content Encryption Key: ");
            sb2.append(e2);
            throw new org.jose4j.lang.InvalidKeyException(sb2.toString(), e2);
        } catch (javax.crypto.IllegalBlockSizeException e3) {
            e = e3;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unable to encrypt (");
            sb3.append(highResolutionOutputSizeshNQ4ISI.getAlgorithm());
            sb3.append(") the Content Encryption Key: ");
            sb3.append(e);
            throw new org.jose4j.lang.JoseException(sb3.toString(), e);
        }
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public org.jose4j.jwa.CryptoPrimitive prepareForDecrypt(java.security.Key key, org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        org.jose4j.jca.ProviderContext.Context suppliedKeyProviderContext = this.useSuppliedKeyProviderContext ? providerContext.getSuppliedKeyProviderContext() : providerContext.getGeneralProviderContext();
        javax.crypto.Cipher highResolutionOutputSizeshNQ4ISI = org.jose4j.jwe.CipherUtil.getHighResolutionOutputSizeshNQ4ISI(getJavaAlgorithm(), suppliedKeyProviderContext.getCipherProvider());
        int i = suppliedKeyProviderContext.getKeyDecipherModeOverride() == org.jose4j.jca.ProviderContext.KeyDecipherMode.DECRYPT ? 2 : 4;
        try {
            java.security.spec.AlgorithmParameterSpec algorithmParameterSpec = this.getHighSpeedVideoSizes;
            if (algorithmParameterSpec == null) {
                highResolutionOutputSizeshNQ4ISI.init(i, key);
            } else {
                highResolutionOutputSizeshNQ4ISI.init(i, key, algorithmParameterSpec);
            }
            return new org.jose4j.jwa.CryptoPrimitive(highResolutionOutputSizeshNQ4ISI);
        } catch (java.security.InvalidAlgorithmParameterException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to initialize cipher (");
            sb.append(highResolutionOutputSizeshNQ4ISI.getAlgorithm());
            sb.append(") for key unwrap/decrypt - ");
            sb.append(e);
            throw new org.jose4j.lang.JoseException(sb.toString(), e);
        } catch (java.security.InvalidKeyException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to initialize cipher (");
            sb2.append(highResolutionOutputSizeshNQ4ISI.getAlgorithm());
            sb2.append(") for key unwrap/decrypt - ");
            sb2.append(e2);
            throw new org.jose4j.lang.InvalidKeyException(sb2.toString(), e2);
        }
    }

    public java.security.Key manageForDecrypt(org.jose4j.jwa.CryptoPrimitive cryptoPrimitive, byte[] bArr, org.jose4j.jwe.ContentEncryptionKeyDescriptor contentEncryptionKeyDescriptor, org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        try {
            return unwrap(cryptoPrimitive, bArr, providerContext, contentEncryptionKeyDescriptor);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getAlgorithmIdentifier());
            sb.append(" key unwrap/decrypt failed.");
            throw new org.jose4j.lang.IntegrityException(sb.toString(), e);
        }
    }

    protected java.security.Key unwrap(org.jose4j.jwa.CryptoPrimitive cryptoPrimitive, byte[] bArr, org.jose4j.jca.ProviderContext providerContext, org.jose4j.jwe.ContentEncryptionKeyDescriptor contentEncryptionKeyDescriptor) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        org.jose4j.jca.ProviderContext.Context suppliedKeyProviderContext = this.useSuppliedKeyProviderContext ? providerContext.getSuppliedKeyProviderContext() : providerContext.getGeneralProviderContext();
        javax.crypto.Cipher cipher = cryptoPrimitive.getCipher();
        java.lang.String contentEncryptionKeyAlgorithm = contentEncryptionKeyDescriptor.getContentEncryptionKeyAlgorithm();
        if (suppliedKeyProviderContext.getKeyDecipherModeOverride() == org.jose4j.jca.ProviderContext.KeyDecipherMode.DECRYPT) {
            return new javax.crypto.spec.SecretKeySpec(cipher.doFinal(bArr), contentEncryptionKeyAlgorithm);
        }
        return cipher.unwrap(bArr, contentEncryptionKeyAlgorithm, 3);
    }
}
