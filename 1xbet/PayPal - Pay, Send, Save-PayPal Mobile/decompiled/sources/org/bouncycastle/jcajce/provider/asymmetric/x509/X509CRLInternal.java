package org.bouncycastle.jcajce.provider.asymmetric.x509;

/* loaded from: classes17.dex */
class X509CRLInternal extends org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl {
    private final byte[] getInputSizeshNQ4ISI;
    private final java.security.cert.CRLException getOutputMinFrameDuration;

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() throws java.security.cert.CRLException {
        java.security.cert.CRLException cRLException = this.getOutputMinFrameDuration;
        if (cRLException != null) {
            throw cRLException;
        }
        byte[] bArr = this.getInputSizeshNQ4ISI;
        if (bArr != null) {
            return bArr;
        }
        throw new java.security.cert.CRLException();
    }

    X509CRLInternal(org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper, org.bouncycastle.asn1.x509.CertificateList certificateList, java.lang.String str, byte[] bArr, boolean z, byte[] bArr2, java.security.cert.CRLException cRLException) {
        super(jcaJceHelper, certificateList, str, bArr, z);
        this.getInputSizeshNQ4ISI = bArr2;
        this.getOutputMinFrameDuration = cRLException;
    }
}
