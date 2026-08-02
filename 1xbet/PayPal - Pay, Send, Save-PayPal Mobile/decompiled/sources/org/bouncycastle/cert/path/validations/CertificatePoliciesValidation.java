package org.bouncycastle.cert.path.validations;

/* loaded from: classes17.dex */
public class CertificatePoliciesValidation implements org.bouncycastle.cert.path.CertPathValidation {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.cert.path.CertPathValidation
    public void validate(org.bouncycastle.cert.path.CertPathValidationContext certPathValidationContext, org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.cert.path.CertPathValidationException {
        int intValueExact;
        certPathValidationContext.addHandledExtension(org.bouncycastle.asn1.x509.Extension.policyConstraints);
        certPathValidationContext.addHandledExtension(org.bouncycastle.asn1.x509.Extension.inhibitAnyPolicy);
        if (certPathValidationContext.isEndEntity() || org.bouncycastle.cert.path.validations.ValidationUtils.getHighSpeedVideoFpsRanges(x509CertificateHolder)) {
            return;
        }
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = i != 0 ? i - 1 : 0;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = i2 != 0 ? i2 - 1 : 0;
        int i3 = this.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = i3 != 0 ? i3 - 1 : 0;
        org.bouncycastle.asn1.x509.PolicyConstraints fromExtensions = org.bouncycastle.asn1.x509.PolicyConstraints.fromExtensions(x509CertificateHolder.getExtensions());
        if (fromExtensions != null) {
            java.math.BigInteger requireExplicitPolicyMapping = fromExtensions.getRequireExplicitPolicyMapping();
            if (requireExplicitPolicyMapping != null && requireExplicitPolicyMapping.intValue() < this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighResolutionOutputSizeshNQ4ISI = requireExplicitPolicyMapping.intValue();
            }
            java.math.BigInteger inhibitPolicyMapping = fromExtensions.getInhibitPolicyMapping();
            if (inhibitPolicyMapping != null && inhibitPolicyMapping.intValue() < this.getHighSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoFpsRangesFor = inhibitPolicyMapping.intValue();
            }
        }
        org.bouncycastle.asn1.x509.Extension extension = x509CertificateHolder.getExtension(org.bouncycastle.asn1.x509.Extension.inhibitAnyPolicy);
        if (extension == null || (intValueExact = org.bouncycastle.asn1.ASN1Integer.getInstance(extension.getParsedValue()).intValueExact()) >= this.Camera2StreamConfigurationMap) {
            return;
        }
        this.Camera2StreamConfigurationMap = intValueExact;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.cert.path.validations.CertificatePoliciesValidation();
    }

    CertificatePoliciesValidation(int i, boolean z, boolean z2, boolean z3) {
        if (z) {
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = i + 1;
        }
        if (z2) {
            this.Camera2StreamConfigurationMap = 0;
        } else {
            this.Camera2StreamConfigurationMap = i + 1;
        }
        if (z3) {
            this.getHighSpeedVideoFpsRangesFor = 0;
        } else {
            this.getHighSpeedVideoFpsRangesFor = i + 1;
        }
    }

    private CertificatePoliciesValidation() {
        this(0, false, false, false);
    }
}
