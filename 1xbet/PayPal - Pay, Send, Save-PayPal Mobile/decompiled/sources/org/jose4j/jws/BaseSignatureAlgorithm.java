package org.jose4j.jws;

/* loaded from: classes18.dex */
public abstract class BaseSignatureAlgorithm extends org.jose4j.jwa.AlgorithmInfo implements org.jose4j.jws.JsonWebSignatureAlgorithm {
    private java.security.spec.AlgorithmParameterSpec Camera2StreamConfigurationMap;
    private final org.slf4j.Logger getHighResolutionOutputSizeshNQ4ISI = org.slf4j.LoggerFactory.getLogger(getClass());

    public abstract void validatePrivateKey(java.security.PrivateKey privateKey) throws org.jose4j.lang.InvalidKeyException;

    public abstract void validatePublicKey(java.security.PublicKey publicKey) throws org.jose4j.lang.InvalidKeyException;

    public BaseSignatureAlgorithm(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        setAlgorithmIdentifier(str);
        setJavaAlgorithm(str2);
        setKeyPersuasion(org.jose4j.keys.KeyPersuasion.ASYMMETRIC);
        setKeyType(str3);
    }

    protected void setAlgorithmParameterSpec(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
        this.Camera2StreamConfigurationMap = algorithmParameterSpec;
    }

    @Override // org.jose4j.jws.JsonWebSignatureAlgorithm
    public boolean verifySignature(byte[] bArr, java.security.Key key, byte[] bArr2, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        java.security.Signature highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(providerContext);
        try {
            highResolutionOutputSizeshNQ4ISI.initVerify((java.security.PublicKey) key);
            try {
                highResolutionOutputSizeshNQ4ISI.update(bArr2);
                return highResolutionOutputSizeshNQ4ISI.verify(bArr);
            } catch (java.security.SignatureException e) {
                if (!this.getHighResolutionOutputSizeshNQ4ISI.isDebugEnabled()) {
                    return false;
                }
                org.slf4j.Logger logger = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Problem verifying ");
                sb.append(getAlgorithmIdentifier());
                sb.append(" signature: ");
                sb.append(org.jose4j.lang.ExceptionHelp.toStringWithCauses(e));
                logger.debug(sb.toString());
                return false;
            }
        } catch (java.security.InvalidKeyException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(getHighSpeedVideoSizes(key));
            sb2.append("for ");
            sb2.append(getJavaAlgorithm());
            throw new org.jose4j.lang.InvalidKeyException(sb2.toString(), e2);
        }
    }

    @Override // org.jose4j.jws.JsonWebSignatureAlgorithm
    public org.jose4j.jwa.CryptoPrimitive prepareForSign(java.security.Key key, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        java.security.Signature highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(providerContext);
        try {
            java.security.PrivateKey privateKey = (java.security.PrivateKey) key;
            java.security.SecureRandom secureRandom = providerContext.getSecureRandom();
            if (secureRandom == null) {
                highResolutionOutputSizeshNQ4ISI.initSign(privateKey);
            } else {
                highResolutionOutputSizeshNQ4ISI.initSign(privateKey, secureRandom);
            }
            return new org.jose4j.jwa.CryptoPrimitive(highResolutionOutputSizeshNQ4ISI);
        } catch (java.security.InvalidKeyException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getHighSpeedVideoSizes(key));
            sb.append("for ");
            sb.append(getJavaAlgorithm());
            throw new org.jose4j.lang.InvalidKeyException(sb.toString(), e);
        }
    }

    @Override // org.jose4j.jws.JsonWebSignatureAlgorithm
    public byte[] sign(org.jose4j.jwa.CryptoPrimitive cryptoPrimitive, byte[] bArr) throws org.jose4j.lang.JoseException {
        java.security.Signature signature = cryptoPrimitive.getSignature();
        try {
            signature.update(bArr);
            return signature.sign();
        } catch (java.security.SignatureException e) {
            throw new org.jose4j.lang.JoseException("Problem creating signature.", e);
        }
    }

    private static java.lang.String getHighSpeedVideoSizes(java.security.Key key) {
        java.lang.String obj;
        if (key == null) {
            obj = "key is null";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("algorithm=");
            sb.append(key.getAlgorithm());
            obj = sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The given key (");
        sb2.append(obj);
        sb2.append(") is not valid ");
        return sb2.toString();
    }

    private java.security.Signature getHighResolutionOutputSizeshNQ4ISI(org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        org.jose4j.jca.ProviderContext.Context suppliedKeyProviderContext = providerContext.getSuppliedKeyProviderContext();
        java.lang.String signatureProvider = suppliedKeyProviderContext.getSignatureProvider();
        java.lang.String javaAlgorithm = getJavaAlgorithm();
        org.jose4j.jca.ProviderContext.SignatureAlgorithmOverride signatureAlgorithmOverride = suppliedKeyProviderContext.getSignatureAlgorithmOverride();
        if (signatureAlgorithmOverride != null && signatureAlgorithmOverride.getAlgorithmName() != null) {
            javaAlgorithm = signatureAlgorithmOverride.getAlgorithmName();
        }
        try {
            java.security.Signature signature = signatureProvider == null ? java.security.Signature.getInstance(javaAlgorithm) : java.security.Signature.getInstance(javaAlgorithm, signatureProvider);
            java.security.spec.AlgorithmParameterSpec algorithmParameterSpec = this.Camera2StreamConfigurationMap;
            if (signatureAlgorithmOverride != null) {
                algorithmParameterSpec = signatureAlgorithmOverride.getAlgorithmParameterSpec();
            }
            if (algorithmParameterSpec != null) {
                try {
                    signature.setParameter(algorithmParameterSpec);
                    return signature;
                } catch (java.lang.UnsupportedOperationException e) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI.isDebugEnabled()) {
                        org.slf4j.Logger logger = this.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to set algorithm parameter spec on Signature (java algorithm name: ");
                        sb.append(javaAlgorithm);
                        sb.append(") so ignoring the UnsupportedOperationException and relying on the default parameters.");
                        logger.debug(sb.toString(), (java.lang.Throwable) e);
                    }
                }
            }
            return signature;
        } catch (java.security.InvalidAlgorithmParameterException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid algorithm parameter (");
            sb2.append(this.Camera2StreamConfigurationMap);
            sb2.append(") for: ");
            sb2.append(javaAlgorithm);
            throw new org.jose4j.lang.JoseException(sb2.toString(), e2);
        } catch (java.security.NoSuchAlgorithmException e3) {
            throw new org.jose4j.lang.JoseException("Unable to get an implementation of algorithm name: ".concat(java.lang.String.valueOf(javaAlgorithm)), e3);
        } catch (java.security.NoSuchProviderException e4) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unable to get an implementation of ");
            sb3.append(javaAlgorithm);
            sb3.append(" for provider ");
            sb3.append(signatureProvider);
            throw new org.jose4j.lang.JoseException(sb3.toString(), e4);
        }
    }

    @Override // org.jose4j.jws.JsonWebSignatureAlgorithm
    public void validateSigningKey(java.security.Key key) throws org.jose4j.lang.InvalidKeyException {
        if (key != null) {
            try {
                validatePrivateKey((java.security.PrivateKey) key);
                return;
            } catch (java.lang.ClassCastException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(getHighSpeedVideoSizes(key));
                sb.append("(not a private key or is the wrong type of key) for ");
                sb.append(getJavaAlgorithm());
                sb.append(" / ");
                sb.append(getAlgorithmIdentifier());
                sb.append(" ");
                sb.append(e);
                throw new org.jose4j.lang.InvalidKeyException(sb.toString());
            }
        }
        throw new org.jose4j.lang.InvalidKeyException("Key cannot be null");
    }

    @Override // org.jose4j.jws.JsonWebSignatureAlgorithm
    public void validateVerificationKey(java.security.Key key) throws org.jose4j.lang.InvalidKeyException {
        if (key != null) {
            try {
                validatePublicKey((java.security.PublicKey) key);
                return;
            } catch (java.lang.ClassCastException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(getHighSpeedVideoSizes(key));
                sb.append("(not a public key or is the wrong type of key) for ");
                sb.append(getJavaAlgorithm());
                sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                sb.append(getAlgorithmIdentifier());
                sb.append(" ");
                sb.append(e);
                throw new org.jose4j.lang.InvalidKeyException(sb.toString());
            }
        }
        throw new org.jose4j.lang.InvalidKeyException("Key cannot be null");
    }

    @Override // org.jose4j.jwa.Algorithm
    public boolean isAvailable() {
        try {
            return getHighResolutionOutputSizeshNQ4ISI(new org.jose4j.jca.ProviderContext()) != null;
        } catch (java.lang.Exception e) {
            org.slf4j.Logger logger = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getAlgorithmIdentifier());
            sb.append(" via ");
            sb.append(getJavaAlgorithm());
            sb.append(" is NOT available from the underlying JCE (");
            sb.append(org.jose4j.lang.ExceptionHelp.toStringWithCauses(e));
            sb.append(").");
            logger.debug(sb.toString());
            return false;
        }
    }
}
