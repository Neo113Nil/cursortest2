package org.bouncycastle.cert.path.validations;

/* loaded from: classes17.dex */
public class KeyUsageValidation implements org.bouncycastle.cert.path.CertPathValidation {
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.cert.path.CertPathValidation
    public void validate(org.bouncycastle.cert.path.CertPathValidationContext certPathValidationContext, org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.cert.path.CertPathValidationException {
        certPathValidationContext.addHandledExtension(org.bouncycastle.asn1.x509.Extension.keyUsage);
        if (certPathValidationContext.isEndEntity()) {
            return;
        }
        org.bouncycastle.asn1.x509.KeyUsage fromExtensions = org.bouncycastle.asn1.x509.KeyUsage.fromExtensions(x509CertificateHolder.getExtensions());
        if (fromExtensions != null) {
            if (!fromExtensions.hasUsages(4)) {
                throw new org.bouncycastle.cert.path.CertPathValidationException("Issuer certificate KeyUsage extension does not permit key signing");
            }
        } else if (this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new org.bouncycastle.cert.path.CertPathValidationException("KeyUsage extension not present in CA certificate");
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        this.getHighResolutionOutputSizeshNQ4ISI = ((org.bouncycastle.cert.path.validations.KeyUsageValidation) memoable).getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.cert.path.validations.KeyUsageValidation(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public KeyUsageValidation(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public KeyUsageValidation() {
        this(true);
    }
}
