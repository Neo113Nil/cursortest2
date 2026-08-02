package org.bouncycastle.operator.bc;

/* loaded from: classes17.dex */
public abstract class BcContentVerifierProviderBuilder {
    protected org.bouncycastle.operator.bc.BcDigestProvider digestProvider = org.bouncycastle.operator.bc.BcDefaultDigestProvider.INSTANCE;

    protected abstract org.bouncycastle.crypto.Signer createSigner(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException;

    protected abstract org.bouncycastle.crypto.params.AsymmetricKeyParameter extractKeyParameters(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException;

    class SigVerifier implements org.bouncycastle.operator.ContentVerifier {
        private org.bouncycastle.operator.bc.BcSignerOutputStream getHighResolutionOutputSizeshNQ4ISI;
        private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

        @Override // org.bouncycastle.operator.ContentVerifier
        public boolean verify(byte[] bArr) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor.verifySignature(bArr);
        }

        @Override // org.bouncycastle.operator.ContentVerifier
        public java.io.OutputStream getOutputStream() {
            org.bouncycastle.operator.bc.BcSignerOutputStream bcSignerOutputStream = this.getHighResolutionOutputSizeshNQ4ISI;
            if (bcSignerOutputStream != null) {
                return bcSignerOutputStream;
            }
            throw new java.lang.IllegalStateException("verifier not initialised");
        }

        @Override // org.bouncycastle.operator.ContentVerifier
        public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
            return this.getHighSpeedVideoSizes;
        }

        SigVerifier(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.operator.bc.BcSignerOutputStream bcSignerOutputStream) {
            this.getHighSpeedVideoSizes = algorithmIdentifier;
            this.getHighResolutionOutputSizeshNQ4ISI = bcSignerOutputStream;
        }
    }

    static /* synthetic */ org.bouncycastle.operator.bc.BcSignerOutputStream Camera2StreamConfigurationMap(org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder bcContentVerifierProviderBuilder, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) throws org.bouncycastle.operator.OperatorCreationException {
        org.bouncycastle.crypto.Signer createSigner = bcContentVerifierProviderBuilder.createSigner(algorithmIdentifier);
        createSigner.init(false, asymmetricKeyParameter);
        return new org.bouncycastle.operator.bc.BcSignerOutputStream(createSigner);
    }

    public org.bouncycastle.operator.ContentVerifierProvider build(final org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.operator.ContentVerifierProvider() { // from class: org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder.2
            @Override // org.bouncycastle.operator.ContentVerifierProvider
            public org.bouncycastle.cert.X509CertificateHolder getAssociatedCertificate() {
                return null;
            }

            @Override // org.bouncycastle.operator.ContentVerifierProvider
            public boolean hasAssociatedCertificate() {
                return false;
            }

            @Override // org.bouncycastle.operator.ContentVerifierProvider
            public org.bouncycastle.operator.ContentVerifier get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
                return org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder.this.new SigVerifier(algorithmIdentifier, org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder.Camera2StreamConfigurationMap(org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder.this, algorithmIdentifier, asymmetricKeyParameter));
            }
        };
    }

    public org.bouncycastle.operator.ContentVerifierProvider build(final org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.operator.ContentVerifierProvider() { // from class: org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder.1
            @Override // org.bouncycastle.operator.ContentVerifierProvider
            public boolean hasAssociatedCertificate() {
                return true;
            }

            @Override // org.bouncycastle.operator.ContentVerifierProvider
            public org.bouncycastle.cert.X509CertificateHolder getAssociatedCertificate() {
                return x509CertificateHolder;
            }

            @Override // org.bouncycastle.operator.ContentVerifierProvider
            public org.bouncycastle.operator.ContentVerifier get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
                try {
                    return org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder.this.new SigVerifier(algorithmIdentifier, org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder.Camera2StreamConfigurationMap(org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder.this, algorithmIdentifier, org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder.this.extractKeyParameters(x509CertificateHolder.getSubjectPublicKeyInfo())));
                } catch (java.io.IOException e) {
                    throw new org.bouncycastle.operator.OperatorCreationException("exception on setup: ".concat(java.lang.String.valueOf(e)), e);
                }
            }
        };
    }
}
