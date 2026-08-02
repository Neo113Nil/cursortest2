package org.bouncycastle.openssl.jcajce;

/* loaded from: classes17.dex */
public class JcaPEMKeyConverter {
    private static final java.util.Map getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.jcajce.util.JcaJceHelper Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();

    public org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter setProvider(java.security.Provider provider) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider);
        return this;
    }

    public org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter setProvider(java.lang.String str) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str);
        return this;
    }

    public java.security.PublicKey getPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws org.bouncycastle.openssl.PEMException {
        try {
            return getHighSpeedVideoFpsRangesFor(subjectPublicKeyInfo.getAlgorithm()).generatePublic(new java.security.spec.X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to convert key pair: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.openssl.PEMException(sb.toString(), e);
        }
    }

    public java.security.PrivateKey getPrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws org.bouncycastle.openssl.PEMException {
        try {
            return getHighSpeedVideoFpsRangesFor(privateKeyInfo.getPrivateKeyAlgorithm()).generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(privateKeyInfo.getEncoded()));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to convert key pair: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.openssl.PEMException(sb.toString(), e);
        }
    }

    public java.security.KeyPair getKeyPair(org.bouncycastle.openssl.PEMKeyPair pEMKeyPair) throws org.bouncycastle.openssl.PEMException {
        try {
            java.security.KeyFactory highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(pEMKeyPair.getPrivateKeyInfo().getPrivateKeyAlgorithm());
            return new java.security.KeyPair(highSpeedVideoFpsRangesFor.generatePublic(new java.security.spec.X509EncodedKeySpec(pEMKeyPair.getPublicKeyInfo().getEncoded())), highSpeedVideoFpsRangesFor.generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(pEMKeyPair.getPrivateKeyInfo().getEncoded())));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to convert key pair: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.openssl.PEMException(sb.toString(), e);
        }
    }

    private java.security.KeyFactory getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        java.lang.String str = (java.lang.String) getHighSpeedVideoFpsRangesFor.get(algorithm);
        if (str == null) {
            str = algorithm.getId();
        }
        try {
            return this.Camera2StreamConfigurationMap.createKeyFactory(str);
        } catch (java.security.NoSuchAlgorithmException e) {
            if (str.equals("ECDSA")) {
                return this.Camera2StreamConfigurationMap.createKeyFactory("EC");
            }
            throw e;
        }
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRangesFor = hashMap;
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey, "ECDSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, "RSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa, "DSA");
    }
}
