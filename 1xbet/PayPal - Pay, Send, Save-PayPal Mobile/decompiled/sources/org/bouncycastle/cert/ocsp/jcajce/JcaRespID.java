package org.bouncycastle.cert.ocsp.jcajce;

/* loaded from: classes17.dex */
public class JcaRespID extends org.bouncycastle.cert.ocsp.RespID {
    public JcaRespID(javax.security.auth.x500.X500Principal x500Principal) {
        super(org.bouncycastle.asn1.x500.X500Name.getInstance(x500Principal.getEncoded()));
    }

    public JcaRespID(java.security.PublicKey publicKey, org.bouncycastle.operator.DigestCalculator digestCalculator) throws org.bouncycastle.cert.ocsp.OCSPException {
        super(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()), digestCalculator);
    }
}
