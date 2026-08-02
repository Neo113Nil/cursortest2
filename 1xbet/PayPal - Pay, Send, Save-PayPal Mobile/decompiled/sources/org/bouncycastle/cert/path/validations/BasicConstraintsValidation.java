package org.bouncycastle.cert.path.validations;

/* loaded from: classes17.dex */
public class BasicConstraintsValidation implements org.bouncycastle.cert.path.CertPathValidation {
    private boolean Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.Integer getHighSpeedVideoSizes;

    @Override // org.bouncycastle.cert.path.CertPathValidation
    public void validate(org.bouncycastle.cert.path.CertPathValidationContext certPathValidationContext, org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.cert.path.CertPathValidationException {
        java.math.BigInteger pathLenConstraint;
        certPathValidationContext.addHandledExtension(org.bouncycastle.asn1.x509.Extension.basicConstraints);
        if (!this.Camera2StreamConfigurationMap) {
            throw new org.bouncycastle.cert.path.CertPathValidationException("Basic constraints violated: issuer is not a CA");
        }
        org.bouncycastle.asn1.x509.BasicConstraints fromExtensions = org.bouncycastle.asn1.x509.BasicConstraints.fromExtensions(x509CertificateHolder.getExtensions());
        this.Camera2StreamConfigurationMap = (fromExtensions != null && fromExtensions.isCA()) || (fromExtensions == null && !this.getHighResolutionOutputSizeshNQ4ISI);
        if (this.getHighSpeedVideoSizes != null && !x509CertificateHolder.getSubject().equals(x509CertificateHolder.getIssuer())) {
            if (this.getHighSpeedVideoSizes.intValue() < 0) {
                throw new org.bouncycastle.cert.path.CertPathValidationException("Basic constraints violated: path length exceeded");
            }
            this.getHighSpeedVideoSizes = org.bouncycastle.util.Integers.valueOf(this.getHighSpeedVideoSizes.intValue() - 1);
        }
        if (fromExtensions == null || (pathLenConstraint = fromExtensions.getPathLenConstraint()) == null) {
            return;
        }
        int intValueExact = org.bouncycastle.util.BigIntegers.intValueExact(pathLenConstraint);
        java.lang.Integer num = this.getHighSpeedVideoSizes;
        if (num != null) {
            intValueExact = java.lang.Math.min(intValueExact, num.intValue());
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Integers.valueOf(intValueExact);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        org.bouncycastle.cert.path.validations.BasicConstraintsValidation basicConstraintsValidation = (org.bouncycastle.cert.path.validations.BasicConstraintsValidation) memoable;
        this.getHighResolutionOutputSizeshNQ4ISI = basicConstraintsValidation.getHighResolutionOutputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = basicConstraintsValidation.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = basicConstraintsValidation.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        org.bouncycastle.cert.path.validations.BasicConstraintsValidation basicConstraintsValidation = new org.bouncycastle.cert.path.validations.BasicConstraintsValidation();
        basicConstraintsValidation.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI;
        basicConstraintsValidation.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        basicConstraintsValidation.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes;
        return basicConstraintsValidation;
    }

    public BasicConstraintsValidation(boolean z) {
        this.Camera2StreamConfigurationMap = true;
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public BasicConstraintsValidation() {
        this(true);
    }
}
