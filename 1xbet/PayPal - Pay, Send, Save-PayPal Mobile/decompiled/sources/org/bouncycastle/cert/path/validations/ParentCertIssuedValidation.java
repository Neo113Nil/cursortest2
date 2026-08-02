package org.bouncycastle.cert.path.validations;

/* loaded from: classes17.dex */
public class ParentCertIssuedValidation implements org.bouncycastle.cert.path.CertPathValidation {
    private org.bouncycastle.asn1.x500.X500Name getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.cert.X509ContentVerifierProviderBuilder getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.cert.path.CertPathValidation
    public void validate(org.bouncycastle.cert.path.CertPathValidationContext certPathValidationContext, org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.cert.path.CertPathValidationException {
        org.bouncycastle.asn1.ASN1Encodable parameters;
        org.bouncycastle.asn1.x500.X500Name x500Name = this.getHighResolutionOutputSizeshNQ4ISI;
        if (x500Name != null && !x500Name.equals(x509CertificateHolder.getIssuer())) {
            throw new org.bouncycastle.cert.path.CertPathValidationException("Certificate issue does not match parent");
        }
        org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = this.getHighSpeedVideoFpsRangesFor;
        if (subjectPublicKeyInfo != null) {
            try {
                if (!x509CertificateHolder.isSignatureValid(this.getHighSpeedVideoFpsRanges.build(subjectPublicKeyInfo.getAlgorithm().equals(this.getHighSpeedVideoSizes) ? this.getHighSpeedVideoFpsRangesFor : new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor.parsePublicKey())))) {
                    throw new org.bouncycastle.cert.path.CertPathValidationException("Certificate signature not for public key in parent");
                }
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to build public key: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.cert.path.CertPathValidationException(sb.toString(), e);
            } catch (org.bouncycastle.cert.CertException e2) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to validate signature: ");
                sb2.append(e2.getMessage());
                throw new org.bouncycastle.cert.path.CertPathValidationException(sb2.toString(), e2);
            } catch (org.bouncycastle.operator.OperatorCreationException e3) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unable to create verifier: ");
                sb3.append(e3.getMessage());
                throw new org.bouncycastle.cert.path.CertPathValidationException(sb3.toString(), e3);
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = x509CertificateHolder.getSubject();
        org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo2 = x509CertificateHolder.getSubjectPublicKeyInfo();
        this.getHighSpeedVideoFpsRangesFor = subjectPublicKeyInfo2;
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.getHighSpeedVideoSizes;
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithm = subjectPublicKeyInfo2.getAlgorithm();
        if (algorithmIdentifier == null) {
            this.getHighSpeedVideoSizes = algorithm;
        } else {
            if (algorithm.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) this.getHighSpeedVideoSizes.getAlgorithm()) && ((parameters = this.getHighSpeedVideoFpsRangesFor.getAlgorithm().getParameters()) == null || (parameters instanceof org.bouncycastle.asn1.ASN1Null))) {
                return;
            }
            this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getAlgorithm();
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        org.bouncycastle.cert.path.validations.ParentCertIssuedValidation parentCertIssuedValidation = (org.bouncycastle.cert.path.validations.ParentCertIssuedValidation) memoable;
        this.getHighSpeedVideoFpsRanges = parentCertIssuedValidation.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = parentCertIssuedValidation.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = parentCertIssuedValidation.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = parentCertIssuedValidation.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        org.bouncycastle.cert.path.validations.ParentCertIssuedValidation parentCertIssuedValidation = new org.bouncycastle.cert.path.validations.ParentCertIssuedValidation(this.getHighSpeedVideoFpsRanges);
        parentCertIssuedValidation.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes;
        parentCertIssuedValidation.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI;
        parentCertIssuedValidation.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
        return parentCertIssuedValidation;
    }

    public ParentCertIssuedValidation(org.bouncycastle.cert.X509ContentVerifierProviderBuilder x509ContentVerifierProviderBuilder) {
        this.getHighSpeedVideoFpsRanges = x509ContentVerifierProviderBuilder;
    }
}
