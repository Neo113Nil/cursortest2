package org.bouncycastle.mozilla.jcajce;

/* loaded from: classes17.dex */
public class JcaSignedPublicKeyAndChallenge extends org.bouncycastle.mozilla.SignedPublicKeyAndChallenge {
    org.bouncycastle.jcajce.util.JcaJceHelper Camera2StreamConfigurationMap;

    public org.bouncycastle.mozilla.jcajce.JcaSignedPublicKeyAndChallenge setProvider(java.security.Provider provider) {
        return new org.bouncycastle.mozilla.jcajce.JcaSignedPublicKeyAndChallenge(this.spkacSeq, new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider));
    }

    public org.bouncycastle.mozilla.jcajce.JcaSignedPublicKeyAndChallenge setProvider(java.lang.String str) {
        return new org.bouncycastle.mozilla.jcajce.JcaSignedPublicKeyAndChallenge(this.spkacSeq, new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str));
    }

    public java.security.PublicKey getPublicKey() throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException {
        try {
            org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = this.spkacSeq.getPublicKeyAndChallenge().getSubjectPublicKeyInfo();
            return this.Camera2StreamConfigurationMap.createKeyFactory(subjectPublicKeyInfo.getAlgorithm().getAlgorithm().getId()).generatePublic(new java.security.spec.X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
        } catch (java.lang.Exception unused) {
            throw new java.security.InvalidKeyException("error encoding public key");
        }
    }

    public JcaSignedPublicKeyAndChallenge(byte[] bArr) {
        super(bArr);
        this.Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();
    }

    private JcaSignedPublicKeyAndChallenge(org.bouncycastle.asn1.mozilla.SignedPublicKeyAndChallenge signedPublicKeyAndChallenge, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) {
        super(signedPublicKeyAndChallenge);
        new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();
        this.Camera2StreamConfigurationMap = jcaJceHelper;
    }
}
