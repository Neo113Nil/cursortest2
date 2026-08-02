package org.bouncycastle.pkcs.jcajce;

/* loaded from: classes17.dex */
public class JcaPKCS10CertificationRequest extends org.bouncycastle.pkcs.PKCS10CertificationRequest {
    private static java.util.Hashtable Camera2StreamConfigurationMap;
    private org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoSizes;

    public org.bouncycastle.pkcs.jcajce.JcaPKCS10CertificationRequest setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider);
        return this;
    }

    public org.bouncycastle.pkcs.jcajce.JcaPKCS10CertificationRequest setProvider(java.lang.String str) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str);
        return this;
    }

    public java.security.PublicKey getPublicKey() throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException {
        java.security.KeyFactory createKeyFactory;
        try {
            org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = getSubjectPublicKeyInfo();
            java.security.spec.X509EncodedKeySpec x509EncodedKeySpec = new java.security.spec.X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded());
            try {
                createKeyFactory = this.getHighSpeedVideoSizes.createKeyFactory(subjectPublicKeyInfo.getAlgorithm().getAlgorithm().getId());
            } catch (java.security.NoSuchAlgorithmException e) {
                if (Camera2StreamConfigurationMap.get(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()) == null) {
                    throw e;
                }
                createKeyFactory = this.getHighSpeedVideoSizes.createKeyFactory((java.lang.String) Camera2StreamConfigurationMap.get(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()));
            }
            return createKeyFactory.generatePublic(x509EncodedKeySpec);
        } catch (java.io.IOException unused) {
            throw new java.security.InvalidKeyException("error extracting key encoding");
        } catch (java.security.NoSuchProviderException e2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot find provider: ");
            sb.append(e2.getMessage());
            throw new java.security.NoSuchAlgorithmException(sb.toString());
        } catch (java.security.spec.InvalidKeySpecException unused2) {
            throw new java.security.InvalidKeyException("error decoding public key");
        }
    }

    public JcaPKCS10CertificationRequest(byte[] bArr) throws java.io.IOException {
        super(bArr);
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();
    }

    public JcaPKCS10CertificationRequest(org.bouncycastle.pkcs.PKCS10CertificationRequest pKCS10CertificationRequest) {
        super(pKCS10CertificationRequest.toASN1Structure());
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();
    }

    public JcaPKCS10CertificationRequest(org.bouncycastle.asn1.pkcs.CertificationRequest certificationRequest) {
        super(certificationRequest);
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();
    }

    static {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        Camera2StreamConfigurationMap = hashtable;
        hashtable.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, "RSA");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa, "DSA");
    }
}
