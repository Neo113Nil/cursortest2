package org.jose4j.jwe;

/* loaded from: classes18.dex */
public class EcdhKeyAgreementAlgorithm extends org.jose4j.jwa.AlgorithmInfo implements org.jose4j.jwe.KeyManagementAlgorithm {
    java.lang.String getHighSpeedVideoFpsRanges;

    public EcdhKeyAgreementAlgorithm() {
        this.getHighSpeedVideoFpsRanges = "enc";
        setAlgorithmIdentifier(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.ECDH_ES);
        setJavaAlgorithm("ECDH");
        setKeyType("EC");
        setKeyPersuasion(org.jose4j.keys.KeyPersuasion.ASYMMETRIC);
    }

    public EcdhKeyAgreementAlgorithm(java.lang.String str) {
        this();
        this.getHighSpeedVideoFpsRanges = str;
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public org.jose4j.jwe.ContentEncryptionKeys manageForEncrypt(java.security.Key key, org.jose4j.jwe.ContentEncryptionKeyDescriptor contentEncryptionKeyDescriptor, org.jose4j.jwx.Headers headers, byte[] bArr, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        org.jose4j.jwk.PublicJsonWebKey generateJwk;
        org.jose4j.jwx.KeyValidationSupport.cekNotAllowed(bArr, getAlgorithmIdentifier());
        java.lang.String keyPairGeneratorProvider = providerContext.getGeneralProviderContext().getKeyPairGeneratorProvider();
        java.security.SecureRandom secureRandom = providerContext.getSecureRandom();
        if (key instanceof java.security.interfaces.ECPublicKey) {
            java.security.interfaces.ECPublicKey eCPublicKey = (java.security.interfaces.ECPublicKey) key;
            getHighSpeedVideoSizes(eCPublicKey);
            generateJwk = org.jose4j.jwk.EcJwkGenerator.generateJwk(eCPublicKey.getParams(), keyPairGeneratorProvider, secureRandom);
        } else if (org.jose4j.keys.XDHKeyUtil.isXECPublicKey(key)) {
            generateJwk = org.jose4j.jwk.OkpJwkGenerator.generateJwk(((java.security.spec.NamedParameterSpec) ((java.security.interfaces.XECPublicKey) key).getParams()).getName(), keyPairGeneratorProvider, secureRandom);
        } else {
            throw new org.jose4j.lang.InvalidKeyException("Inappropriate key for ECDH: ".concat(java.lang.String.valueOf(key)));
        }
        headers.setJwkHeaderValue("epk", generateJwk);
        return new org.jose4j.jwe.ContentEncryptionKeys(getHighSpeedVideoFpsRangesFor(contentEncryptionKeyDescriptor, headers, getHighResolutionOutputSizeshNQ4ISI(generateJwk.getPrivateKey(), (java.security.PublicKey) key, providerContext).generateSecret(), providerContext), null);
    }

    private static void getHighSpeedVideoSizes(java.security.interfaces.ECKey eCKey) throws org.jose4j.lang.InvalidKeyException {
        if (org.jose4j.keys.EllipticCurves.SECP_256K1.equals(org.jose4j.keys.EllipticCurves.getName(eCKey.getParams().getCurve()))) {
            throw new org.jose4j.lang.InvalidKeyException("Use of the secp256k1 curve is not defined for ECDH-ES key agreement with JOSE.");
        }
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public org.jose4j.jwa.CryptoPrimitive prepareForDecrypt(java.security.Key key, org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        java.security.PublicKey publicKey = headers.getPublicJwkHeaderValue("epk", providerContext.getGeneralProviderContext().getKeyFactoryProvider()).getPublicKey();
        java.security.PrivateKey privateKey = (java.security.PrivateKey) key;
        if (publicKey instanceof java.security.interfaces.ECPublicKey) {
            java.security.interfaces.ECPrivateKey eCPrivateKey = (java.security.interfaces.ECPrivateKey) key;
            getHighSpeedVideoSizes(eCPrivateKey);
            java.security.spec.EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            java.security.spec.ECPoint w = ((java.security.interfaces.ECPublicKey) publicKey).getW();
            java.math.BigInteger affineX = w.getAffineX();
            java.math.BigInteger affineY = w.getAffineY();
            java.math.BigInteger a2 = curve.getA();
            java.math.BigInteger b = curve.getB();
            java.math.BigInteger p = ((java.security.spec.ECFieldFp) curve.getField()).getP();
            if (!affineY.pow(2).mod(p).equals(affineX.pow(3).add(a2.multiply(affineX)).add(b).mod(p))) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("epk is invalid for ");
                sb.append(org.jose4j.keys.EllipticCurves.getName(curve));
                throw new org.jose4j.lang.InvalidKeyException(sb.toString());
            }
        }
        return new org.jose4j.jwa.CryptoPrimitive(getHighResolutionOutputSizeshNQ4ISI(privateKey, publicKey, providerContext));
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public java.security.Key manageForDecrypt(org.jose4j.jwa.CryptoPrimitive cryptoPrimitive, byte[] bArr, org.jose4j.jwe.ContentEncryptionKeyDescriptor contentEncryptionKeyDescriptor, org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        return new javax.crypto.spec.SecretKeySpec(getHighSpeedVideoFpsRangesFor(contentEncryptionKeyDescriptor, headers, cryptoPrimitive.getKeyAgreement().generateSecret(), providerContext), contentEncryptionKeyDescriptor.getContentEncryptionKeyAlgorithm());
    }

    private byte[] getHighSpeedVideoFpsRangesFor(org.jose4j.jwe.ContentEncryptionKeyDescriptor contentEncryptionKeyDescriptor, org.jose4j.jwx.Headers headers, byte[] bArr, org.jose4j.jca.ProviderContext providerContext) {
        return new org.jose4j.jwe.kdf.KdfUtil(providerContext.getGeneralProviderContext().getMessageDigestProvider()).kdf(bArr, org.jose4j.lang.ByteUtil.bitLength(contentEncryptionKeyDescriptor.getContentEncryptionKeyByteLength()), headers.getStringHeaderValue(this.getHighSpeedVideoFpsRanges), headers.getStringHeaderValue("apu"), headers.getStringHeaderValue("apv"));
    }

    private static javax.crypto.KeyAgreement getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2) throws org.jose4j.lang.JoseException {
        try {
            return str == null ? javax.crypto.KeyAgreement.getInstance(str2) : javax.crypto.KeyAgreement.getInstance(str2, str);
        } catch (java.security.NoSuchAlgorithmException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No ");
            sb.append(str2);
            sb.append(" KeyAgreement available.");
            throw new org.jose4j.lang.UncheckedJoseException(sb.toString(), e);
        } catch (java.security.NoSuchProviderException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Cannot get ");
            sb2.append(str2);
            sb2.append(" KeyAgreement with provider ");
            sb2.append(str);
            throw new org.jose4j.lang.JoseException(sb2.toString(), e2);
        }
    }

    private javax.crypto.KeyAgreement getHighResolutionOutputSizeshNQ4ISI(java.security.PrivateKey privateKey, java.security.PublicKey publicKey, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        javax.crypto.KeyAgreement highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(providerContext.getSuppliedKeyProviderContext().getKeyAgreementProvider(), privateKey instanceof java.security.interfaces.ECPrivateKey ? getJavaAlgorithm() : "XDH");
        try {
            highSpeedVideoFpsRangesFor.init(privateKey);
            highSpeedVideoFpsRangesFor.doPhase(publicKey, true);
            return highSpeedVideoFpsRangesFor;
        } catch (java.security.InvalidKeyException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid Key for ");
            sb.append(getJavaAlgorithm());
            sb.append(" key agreement - ");
            sb.append(e);
            throw new org.jose4j.lang.InvalidKeyException(sb.toString(), e);
        }
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public void validateEncryptionKey(java.security.Key key, org.jose4j.jwe.ContentEncryptionAlgorithm contentEncryptionAlgorithm) throws org.jose4j.lang.InvalidKeyException {
        if (!(key instanceof java.security.interfaces.ECPublicKey) && !org.jose4j.keys.XDHKeyUtil.isXECPublicKey(key)) {
            throw new org.jose4j.lang.InvalidKeyException("Encrypting with ECDH expects ECPublicKey or XECPublicKey but was given ".concat(java.lang.String.valueOf(key)));
        }
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public void validateDecryptionKey(java.security.Key key, org.jose4j.jwe.ContentEncryptionAlgorithm contentEncryptionAlgorithm) throws org.jose4j.lang.InvalidKeyException {
        if (!(key instanceof java.security.interfaces.ECPrivateKey) && !org.jose4j.keys.XDHKeyUtil.isXECPrivateKey(key)) {
            throw new org.jose4j.lang.InvalidKeyException("Decrypting with ECDH expects ECPrivateKey or XECPrivateKey but was given ".concat(java.lang.String.valueOf(key)));
        }
    }

    @Override // org.jose4j.jwa.Algorithm
    public boolean isAvailable() {
        return new org.jose4j.keys.EcKeyUtil().isAvailable() && org.jose4j.jwa.AlgorithmAvailability.isAvailable("KeyAgreement", getJavaAlgorithm());
    }
}
