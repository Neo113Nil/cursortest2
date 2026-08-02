package org.bouncycastle.operator.jcajce;

/* loaded from: classes17.dex */
public class JcaContentVerifierProviderBuilder {
    private org.bouncycastle.operator.jcajce.OperatorHelper getHighSpeedVideoFpsRanges = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());

    public org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider));
        return this;
    }

    public org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder setProvider(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str));
        return this;
    }

    public org.bouncycastle.operator.ContentVerifierProvider build(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateException {
        return build(this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(x509CertificateHolder));
    }

    public org.bouncycastle.operator.ContentVerifierProvider build(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws org.bouncycastle.operator.OperatorCreationException {
        return build(this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(subjectPublicKeyInfo));
    }

    public org.bouncycastle.operator.ContentVerifierProvider build(final java.security.cert.X509Certificate x509Certificate) throws org.bouncycastle.operator.OperatorCreationException {
        try {
            final org.bouncycastle.cert.jcajce.JcaX509CertificateHolder jcaX509CertificateHolder = new org.bouncycastle.cert.jcajce.JcaX509CertificateHolder(x509Certificate);
            return new org.bouncycastle.operator.ContentVerifierProvider() { // from class: org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.1
                @Override // org.bouncycastle.operator.ContentVerifierProvider
                public boolean hasAssociatedCertificate() {
                    return true;
                }

                @Override // org.bouncycastle.operator.ContentVerifierProvider
                public org.bouncycastle.cert.X509CertificateHolder getAssociatedCertificate() {
                    return jcaX509CertificateHolder;
                }

                @Override // org.bouncycastle.operator.ContentVerifierProvider
                public org.bouncycastle.operator.ContentVerifier get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
                    if (!algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_alg_composite)) {
                        try {
                            java.security.Signature highSpeedVideoSizes = org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(algorithmIdentifier);
                            highSpeedVideoSizes.initVerify(x509Certificate.getPublicKey());
                            java.security.Signature highResolutionOutputSizeshNQ4ISI = org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.this.getHighResolutionOutputSizeshNQ4ISI(algorithmIdentifier, x509Certificate.getPublicKey());
                            return highResolutionOutputSizeshNQ4ISI != null ? org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.this.new RawSigVerifier(algorithmIdentifier, highSpeedVideoSizes, highResolutionOutputSizeshNQ4ISI) : org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.this.new SigVerifier(algorithmIdentifier, highSpeedVideoSizes);
                        } catch (java.security.GeneralSecurityException e) {
                            throw new org.bouncycastle.operator.OperatorCreationException("exception on setup: ".concat(java.lang.String.valueOf(e)), e);
                        }
                    }
                    return org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.this.Camera2StreamConfigurationMap(algorithmIdentifier, x509Certificate.getPublicKey());
                }
            };
        } catch (java.security.cert.CertificateEncodingException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot process certificate: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb.toString(), e);
        }
    }

    public org.bouncycastle.operator.ContentVerifierProvider build(final java.security.PublicKey publicKey) throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.operator.ContentVerifierProvider() { // from class: org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.2
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
                if (algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_alg_composite)) {
                    return org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.this.Camera2StreamConfigurationMap(algorithmIdentifier, publicKey);
                }
                java.security.PublicKey publicKey2 = publicKey;
                if (!(publicKey2 instanceof org.bouncycastle.jcajce.CompositePublicKey)) {
                    java.security.Signature highSpeedVideoSizes = org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.this.getHighSpeedVideoSizes(algorithmIdentifier, publicKey2);
                    java.security.Signature highResolutionOutputSizeshNQ4ISI = org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.this.getHighResolutionOutputSizeshNQ4ISI(algorithmIdentifier, publicKey);
                    return highResolutionOutputSizeshNQ4ISI != null ? org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.this.new RawSigVerifier(algorithmIdentifier, highSpeedVideoSizes, highResolutionOutputSizeshNQ4ISI) : org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.this.new SigVerifier(algorithmIdentifier, highSpeedVideoSizes);
                }
                java.util.List<java.security.PublicKey> publicKeys = ((org.bouncycastle.jcajce.CompositePublicKey) publicKey2).getPublicKeys();
                for (int i = 0; i != publicKeys.size(); i++) {
                    try {
                        java.security.Signature highSpeedVideoSizes2 = org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.this.getHighSpeedVideoSizes(algorithmIdentifier, publicKeys.get(i));
                        java.security.Signature highResolutionOutputSizeshNQ4ISI2 = org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.this.getHighResolutionOutputSizeshNQ4ISI(algorithmIdentifier, publicKeys.get(i));
                        return highResolutionOutputSizeshNQ4ISI2 != null ? org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.this.new RawSigVerifier(algorithmIdentifier, highSpeedVideoSizes2, highResolutionOutputSizeshNQ4ISI2) : org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.this.new SigVerifier(algorithmIdentifier, highSpeedVideoSizes2);
                    } catch (org.bouncycastle.operator.OperatorCreationException unused) {
                    }
                }
                throw new org.bouncycastle.operator.OperatorCreationException("no matching algorithm found for key");
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.security.Signature getHighSpeedVideoSizes(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.PublicKey publicKey) throws org.bouncycastle.operator.OperatorCreationException {
        try {
            java.security.Signature highSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(algorithmIdentifier);
            highSpeedVideoSizes.initVerify(publicKey);
            return highSpeedVideoSizes;
        } catch (java.security.GeneralSecurityException e) {
            throw new org.bouncycastle.operator.OperatorCreationException("exception on setup: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.security.Signature getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.PublicKey publicKey) {
        try {
            java.security.Signature Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(algorithmIdentifier);
            if (Camera2StreamConfigurationMap != null) {
                Camera2StreamConfigurationMap.initVerify(publicKey);
            }
            return Camera2StreamConfigurationMap;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.bouncycastle.operator.ContentVerifier Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.PublicKey publicKey) throws org.bouncycastle.operator.OperatorCreationException {
        int i = 0;
        if (!(publicKey instanceof org.bouncycastle.jcajce.CompositePublicKey)) {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(algorithmIdentifier.getParameters());
            java.security.Signature[] signatureArr = new java.security.Signature[aSN1Sequence.size()];
            while (i != aSN1Sequence.size()) {
                try {
                    signatureArr[i] = getHighSpeedVideoSizes(org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i)), publicKey);
                } catch (java.lang.Exception unused) {
                    signatureArr[i] = null;
                }
                i++;
            }
            return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.CompositeVerifier(signatureArr);
        }
        java.util.List<java.security.PublicKey> publicKeys = ((org.bouncycastle.jcajce.CompositePublicKey) publicKey).getPublicKeys();
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(algorithmIdentifier.getParameters());
        java.security.Signature[] signatureArr2 = new java.security.Signature[aSN1Sequence2.size()];
        while (i != aSN1Sequence2.size()) {
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2 = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence2.getObjectAt(i));
            if (publicKeys.get(i) != null) {
                signatureArr2[i] = getHighSpeedVideoSizes(algorithmIdentifier2, publicKeys.get(i));
            } else {
                signatureArr2[i] = null;
            }
            i++;
        }
        return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.CompositeVerifier(signatureArr2);
    }

    class CompositeVerifier implements org.bouncycastle.operator.ContentVerifier {
        private java.io.OutputStream Camera2StreamConfigurationMap;
        private java.security.Signature[] getHighResolutionOutputSizeshNQ4ISI;

        @Override // org.bouncycastle.operator.ContentVerifier
        public boolean verify(byte[] bArr) {
            try {
                org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(bArr);
                boolean z = false;
                for (int i = 0; i != aSN1Sequence.size(); i++) {
                    java.security.Signature signature = this.getHighResolutionOutputSizeshNQ4ISI[i];
                    if (signature != null && !signature.verify(org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) aSN1Sequence.getObjectAt(i)).getBytes())) {
                        z = true;
                    }
                }
                return !z;
            } catch (java.security.SignatureException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("exception obtaining signature: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.operator.RuntimeOperatorException(sb.toString(), e);
            }
        }

        @Override // org.bouncycastle.operator.ContentVerifier
        public java.io.OutputStream getOutputStream() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // org.bouncycastle.operator.ContentVerifier
        public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_alg_composite);
        }

        public CompositeVerifier(java.security.Signature[] signatureArr) throws org.bouncycastle.operator.OperatorCreationException {
            this.getHighResolutionOutputSizeshNQ4ISI = signatureArr;
            int i = 0;
            while (i < signatureArr.length && signatureArr[i] == null) {
                i++;
            }
            if (i == signatureArr.length) {
                throw new org.bouncycastle.operator.OperatorCreationException("no matching signature found in composite");
            }
            java.io.OutputStream createStream = org.bouncycastle.jcajce.io.OutputStreamFactory.createStream(signatureArr[i]);
            while (true) {
                this.Camera2StreamConfigurationMap = createStream;
                do {
                    i++;
                    if (i == signatureArr.length) {
                        return;
                    }
                } while (signatureArr[i] == null);
                createStream = new org.bouncycastle.util.io.TeeOutputStream(this.Camera2StreamConfigurationMap, org.bouncycastle.jcajce.io.OutputStreamFactory.createStream(signatureArr[i]));
            }
        }
    }

    class SigVerifier implements org.bouncycastle.operator.ContentVerifier {
        private final org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
        private final java.security.Signature getHighSpeedVideoFpsRanges;
        protected final java.io.OutputStream getHighSpeedVideoFpsRangesFor;

        @Override // org.bouncycastle.operator.ContentVerifier
        public boolean verify(byte[] bArr) {
            try {
                return this.getHighSpeedVideoFpsRanges.verify(bArr);
            } catch (java.security.SignatureException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("exception obtaining signature: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.operator.RuntimeOperatorException(sb.toString(), e);
            }
        }

        @Override // org.bouncycastle.operator.ContentVerifier
        public java.io.OutputStream getOutputStream() {
            java.io.OutputStream outputStream = this.getHighSpeedVideoFpsRangesFor;
            if (outputStream != null) {
                return outputStream;
            }
            throw new java.lang.IllegalStateException("verifier not initialised");
        }

        @Override // org.bouncycastle.operator.ContentVerifier
        public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
            return this.Camera2StreamConfigurationMap;
        }

        SigVerifier(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.Signature signature) {
            this.Camera2StreamConfigurationMap = algorithmIdentifier;
            this.getHighSpeedVideoFpsRanges = signature;
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.io.OutputStreamFactory.createStream(signature);
        }
    }

    class RawSigVerifier extends org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.SigVerifier implements org.bouncycastle.operator.RawContentVerifier {
        private java.security.Signature getHighResolutionOutputSizeshNQ4ISI;

        @Override // org.bouncycastle.operator.RawContentVerifier
        public boolean verify(byte[] bArr, byte[] bArr2) {
            try {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.update(bArr);
                    return this.getHighResolutionOutputSizeshNQ4ISI.verify(bArr2);
                } finally {
                    try {
                        this.getHighResolutionOutputSizeshNQ4ISI.verify(bArr2);
                    } catch (java.lang.Exception unused) {
                    }
                }
            } catch (java.security.SignatureException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("exception obtaining raw signature: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.operator.RuntimeOperatorException(sb.toString(), e);
            }
        }

        @Override // org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.SigVerifier, org.bouncycastle.operator.ContentVerifier
        public boolean verify(byte[] bArr) {
            try {
                return super.verify(bArr);
            } finally {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.verify(bArr);
                } catch (java.lang.Exception unused) {
                }
            }
        }

        RawSigVerifier(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.Signature signature, java.security.Signature signature2) {
            super(algorithmIdentifier, signature);
            this.getHighResolutionOutputSizeshNQ4ISI = signature2;
        }
    }
}
