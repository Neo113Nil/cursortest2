package org.bouncycastle.cert.ocsp;

/* loaded from: classes17.dex */
public class Req {
    private org.bouncycastle.asn1.ocsp.Request getHighResolutionOutputSizeshNQ4ISI;

    public org.bouncycastle.asn1.x509.Extensions getSingleRequestExtensions() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSingleRequestExtensions();
    }

    public org.bouncycastle.cert.ocsp.CertificateID getCertID() {
        return new org.bouncycastle.cert.ocsp.CertificateID(this.getHighResolutionOutputSizeshNQ4ISI.getReqCert());
    }

    public Req(org.bouncycastle.asn1.ocsp.Request request) {
        this.getHighResolutionOutputSizeshNQ4ISI = request;
    }
}
