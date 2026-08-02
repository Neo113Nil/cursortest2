package org.bouncycastle.cert.path.validations;

/* loaded from: classes17.dex */
public class CRLValidation implements org.bouncycastle.cert.path.CertPathValidation {
    private org.bouncycastle.asn1.x500.X500Name Camera2StreamConfigurationMap;
    private org.bouncycastle.util.Store getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.cert.path.CertPathValidation
    public void validate(org.bouncycastle.cert.path.CertPathValidationContext certPathValidationContext, org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.cert.path.CertPathValidationException {
        java.util.Collection matches = this.getHighSpeedVideoFpsRanges.getMatches(new org.bouncycastle.util.Selector() { // from class: org.bouncycastle.cert.path.validations.CRLValidation.1
            @Override // org.bouncycastle.util.Selector
            public java.lang.Object clone() {
                return this;
            }

            @Override // org.bouncycastle.util.Selector
            public boolean match(java.lang.Object obj) {
                return ((org.bouncycastle.cert.X509CRLHolder) obj).getIssuer().equals(org.bouncycastle.cert.path.validations.CRLValidation.this.Camera2StreamConfigurationMap);
            }
        });
        if (matches.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CRL for ");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(" not found");
            throw new org.bouncycastle.cert.path.CertPathValidationException(sb.toString());
        }
        java.util.Iterator it = matches.iterator();
        while (it.hasNext()) {
            if (((org.bouncycastle.cert.X509CRLHolder) it.next()).getRevokedCertificate(x509CertificateHolder.getSerialNumber()) != null) {
                throw new org.bouncycastle.cert.path.CertPathValidationException("Certificate revoked");
            }
        }
        this.Camera2StreamConfigurationMap = x509CertificateHolder.getSubject();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        org.bouncycastle.cert.path.validations.CRLValidation cRLValidation = (org.bouncycastle.cert.path.validations.CRLValidation) memoable;
        this.Camera2StreamConfigurationMap = cRLValidation.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = cRLValidation.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.cert.path.validations.CRLValidation(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
    }

    public CRLValidation(org.bouncycastle.asn1.x500.X500Name x500Name, org.bouncycastle.util.Store store) {
        this.Camera2StreamConfigurationMap = x500Name;
        this.getHighSpeedVideoFpsRanges = store;
    }
}
