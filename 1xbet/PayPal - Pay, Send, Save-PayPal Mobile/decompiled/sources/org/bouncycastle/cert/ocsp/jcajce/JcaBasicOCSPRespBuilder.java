package org.bouncycastle.cert.ocsp.jcajce;

/* loaded from: classes17.dex */
public class JcaBasicOCSPRespBuilder extends org.bouncycastle.cert.ocsp.BasicOCSPRespBuilder {
    public JcaBasicOCSPRespBuilder(javax.security.auth.x500.X500Principal x500Principal) {
        super(new org.bouncycastle.cert.ocsp.jcajce.JcaRespID(x500Principal));
    }

    public JcaBasicOCSPRespBuilder(java.security.PublicKey publicKey, org.bouncycastle.operator.DigestCalculator digestCalculator) throws org.bouncycastle.cert.ocsp.OCSPException {
        super(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()), digestCalculator);
    }
}
