package org.bouncycastle.jcajce.provider.asymmetric.x509;

/* loaded from: classes17.dex */
class X509CertificateInternal extends org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl {
    private final java.security.cert.CertificateEncodingException getInputSizeshNQ4ISI;
    private final byte[] getOutputFormats;

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws java.security.cert.CertificateEncodingException {
        java.security.cert.CertificateEncodingException certificateEncodingException = this.getInputSizeshNQ4ISI;
        if (certificateEncodingException != null) {
            throw certificateEncodingException;
        }
        byte[] bArr = this.getOutputFormats;
        if (bArr != null) {
            return bArr;
        }
        throw new java.security.cert.CertificateEncodingException();
    }

    X509CertificateInternal(org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper, org.bouncycastle.asn1.x509.Certificate certificate, org.bouncycastle.asn1.x509.BasicConstraints basicConstraints, boolean[] zArr, java.lang.String str, byte[] bArr, byte[] bArr2, java.security.cert.CertificateEncodingException certificateEncodingException) {
        super(jcaJceHelper, certificate, basicConstraints, zArr, str, bArr);
        this.getOutputFormats = bArr2;
        this.getInputSizeshNQ4ISI = certificateEncodingException;
    }
}
