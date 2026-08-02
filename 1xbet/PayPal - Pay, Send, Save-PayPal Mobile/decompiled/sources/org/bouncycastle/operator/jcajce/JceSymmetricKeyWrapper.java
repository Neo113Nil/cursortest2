package org.bouncycastle.operator.jcajce;

/* loaded from: classes17.dex */
public class JceSymmetricKeyWrapper extends org.bouncycastle.operator.SymmetricKeyWrapper {
    private org.bouncycastle.operator.jcajce.OperatorHelper Camera2StreamConfigurationMap;
    private javax.crypto.SecretKey getHighSpeedVideoFpsRangesFor;
    private java.security.SecureRandom getHighSpeedVideoSizes;

    public JceSymmetricKeyWrapper(javax.crypto.SecretKey secretKey) {
        super(Camera2StreamConfigurationMap(secretKey.getAlgorithm(), secretKey.getEncoded().length * 8));
        this.Camera2StreamConfigurationMap = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());
        this.getHighSpeedVideoFpsRangesFor = secretKey;
    }

    public org.bouncycastle.operator.jcajce.JceSymmetricKeyWrapper setSecureRandom(java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoSizes = secureRandom;
        return this;
    }

    public org.bouncycastle.operator.jcajce.JceSymmetricKeyWrapper setProvider(java.security.Provider provider) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider));
        return this;
    }

    public org.bouncycastle.operator.jcajce.JceSymmetricKeyWrapper setProvider(java.lang.String str) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str));
        return this;
    }

    @Override // org.bouncycastle.operator.KeyWrapper
    public byte[] generateWrappedKey(org.bouncycastle.operator.GenericKey genericKey) throws org.bouncycastle.operator.OperatorException {
        java.security.Key highSpeedVideoSizes = org.bouncycastle.operator.jcajce.OperatorUtils.getHighSpeedVideoSizes(genericKey);
        javax.crypto.Cipher highSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(getAlgorithmIdentifier().getAlgorithm());
        try {
            highSpeedVideoFpsRanges.init(3, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
            return highSpeedVideoFpsRanges.wrap(highSpeedVideoSizes);
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot wrap key: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorException(sb.toString(), e);
        }
    }

    static org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap(java.lang.String str, int i) {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2;
        if (str.startsWith("DES") || str.startsWith("TripleDES")) {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_CMS3DESwrap, org.bouncycastle.asn1.DERNull.INSTANCE);
        }
        if (str.startsWith("RC2")) {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.9.16.3.7"), new org.bouncycastle.asn1.ASN1Integer(58L));
        }
        if (str.startsWith(org.jose4j.keys.AesKey.ALGORITHM)) {
            if (i == 128) {
                aSN1ObjectIdentifier2 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_wrap;
            } else if (i == 192) {
                aSN1ObjectIdentifier2 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_wrap;
            } else {
                if (i != 256) {
                    throw new java.lang.IllegalArgumentException("illegal keysize in AES");
                }
                aSN1ObjectIdentifier2 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_wrap;
            }
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier2);
        }
        if (str.startsWith("SEED")) {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap);
        }
        if (!str.startsWith("Camellia")) {
            throw new java.lang.IllegalArgumentException("unknown algorithm");
        }
        if (i == 128) {
            aSN1ObjectIdentifier = org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_wrap;
        } else if (i == 192) {
            aSN1ObjectIdentifier = org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_wrap;
        } else {
            if (i != 256) {
                throw new java.lang.IllegalArgumentException("illegal keysize in Camellia");
            }
            aSN1ObjectIdentifier = org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_wrap;
        }
        return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier);
    }
}
