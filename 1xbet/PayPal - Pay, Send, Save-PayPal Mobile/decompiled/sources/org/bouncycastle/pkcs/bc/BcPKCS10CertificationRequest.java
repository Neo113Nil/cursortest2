package org.bouncycastle.pkcs.bc;

/* loaded from: classes17.dex */
public class BcPKCS10CertificationRequest extends org.bouncycastle.pkcs.PKCS10CertificationRequest {
    public org.bouncycastle.crypto.params.AsymmetricKeyParameter getPublicKey() throws org.bouncycastle.pkcs.PKCSException {
        try {
            return org.bouncycastle.crypto.util.PublicKeyFactory.createKey(getSubjectPublicKeyInfo());
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("error extracting key encoding: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.pkcs.PKCSException(sb.toString(), e);
        }
    }

    public BcPKCS10CertificationRequest(byte[] bArr) throws java.io.IOException {
        super(bArr);
    }

    public BcPKCS10CertificationRequest(org.bouncycastle.pkcs.PKCS10CertificationRequest pKCS10CertificationRequest) {
        super(pKCS10CertificationRequest.toASN1Structure());
    }

    public BcPKCS10CertificationRequest(org.bouncycastle.asn1.pkcs.CertificationRequest certificationRequest) {
        super(certificationRequest);
    }
}
