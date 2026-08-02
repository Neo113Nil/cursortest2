package org.bouncycastle.its.jcajce;

/* loaded from: classes17.dex */
public class JcaITSContentVerifierProvider implements org.bouncycastle.its.operator.ITSContentVerifierProvider {
    private final org.bouncycastle.its.ITSCertificate Camera2StreamConfigurationMap;
    private final java.security.interfaces.ECPublicKey getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoSizes;
    private final int getInputFormats;

    @Override // org.bouncycastle.its.operator.ITSContentVerifierProvider
    public boolean hasAssociatedCertificate() {
        return this.Camera2StreamConfigurationMap != null;
    }

    public static class Builder {
        private org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();

        public org.bouncycastle.its.jcajce.JcaITSContentVerifierProvider.Builder setProvider(java.security.Provider provider) {
            this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider);
            return this;
        }

        public org.bouncycastle.its.jcajce.JcaITSContentVerifierProvider.Builder setProvider(java.lang.String str) {
            this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str);
            return this;
        }

        public org.bouncycastle.its.jcajce.JcaITSContentVerifierProvider build(org.bouncycastle.its.ITSCertificate iTSCertificate) {
            return new org.bouncycastle.its.jcajce.JcaITSContentVerifierProvider(iTSCertificate, this.getHighSpeedVideoSizes, (byte) 0);
        }
    }

    @Override // org.bouncycastle.its.operator.ITSContentVerifierProvider
    public org.bouncycastle.its.ITSCertificate getAssociatedCertificate() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.its.operator.ITSContentVerifierProvider
    public org.bouncycastle.operator.ContentVerifier get(int i) throws org.bouncycastle.operator.OperatorCreationException {
        byte[] bArr;
        org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper;
        java.lang.String str;
        if (this.getInputFormats != i) {
            throw new org.bouncycastle.operator.OperatorCreationException("wrong verifier for algorithm: ".concat(java.lang.String.valueOf(i)));
        }
        try {
            final org.bouncycastle.operator.DigestCalculator digestCalculator = new org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder().setHelper(this.getHighSpeedVideoSizes).build().get(this.getHighSpeedVideoFpsRanges);
            try {
                final java.io.OutputStream outputStream = digestCalculator.getOutputStream();
                byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
                outputStream.write(bArr2, 0, bArr2.length);
                final byte[] digest = digestCalculator.getDigest();
                if (this.Camera2StreamConfigurationMap.getIssuer().isSelf()) {
                    byte[] byteArray = org.bouncycastle.oer.OEREncoder.toByteArray(this.Camera2StreamConfigurationMap.toASN1Structure().getCertificateBase().getToBeSignedCertificate(), org.bouncycastle.oer.its.template.IEEE1609dot2.tbsCertificate);
                    outputStream.write(byteArray, 0, byteArray.length);
                    bArr = digestCalculator.getDigest();
                } else {
                    bArr = null;
                }
                final byte[] bArr3 = bArr;
                int i2 = this.getInputFormats;
                if (i2 == 0 || i2 == 1) {
                    jcaJceHelper = this.getHighSpeedVideoSizes;
                    str = "SHA256withECDSA";
                } else {
                    if (i2 != 3) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("choice ");
                        sb.append(this.getInputFormats);
                        sb.append(" not supported");
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                    jcaJceHelper = this.getHighSpeedVideoSizes;
                    str = "SHA384withECDSA";
                }
                final java.security.Signature createSignature = jcaJceHelper.createSignature(str);
                return new org.bouncycastle.operator.ContentVerifier() { // from class: org.bouncycastle.its.jcajce.JcaITSContentVerifierProvider.1
                    @Override // org.bouncycastle.operator.ContentVerifier
                    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                        return null;
                    }

                    @Override // org.bouncycastle.operator.ContentVerifier
                    public boolean verify(byte[] bArr4) {
                        byte[] digest2 = digestCalculator.getDigest();
                        try {
                            createSignature.initVerify(org.bouncycastle.its.jcajce.JcaITSContentVerifierProvider.this.getHighResolutionOutputSizeshNQ4ISI);
                            createSignature.update(digest2);
                            byte[] bArr5 = bArr3;
                            if (bArr5 == null || !org.bouncycastle.util.Arrays.areEqual(digest2, bArr5)) {
                                createSignature.update(digest);
                            } else {
                                createSignature.update(digestCalculator.getDigest());
                            }
                            return createSignature.verify(bArr4);
                        } catch (java.lang.Exception e) {
                            throw new java.lang.RuntimeException(e.getMessage(), e);
                        }
                    }

                    @Override // org.bouncycastle.operator.ContentVerifier
                    public java.io.OutputStream getOutputStream() {
                        return outputStream;
                    }
                };
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalStateException(e.getMessage(), e);
            }
        } catch (java.lang.Exception e2) {
            throw new java.lang.IllegalStateException(e2.getMessage(), e2);
        }
    }

    /* synthetic */ JcaITSContentVerifierProvider(org.bouncycastle.its.ITSCertificate iTSCertificate, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper, byte b) {
        this(iTSCertificate, jcaJceHelper);
    }

    private JcaITSContentVerifierProvider(org.bouncycastle.its.ITSCertificate iTSCertificate, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier;
        this.Camera2StreamConfigurationMap = iTSCertificate;
        this.getHighSpeedVideoSizes = jcaJceHelper;
        try {
            this.getHighSpeedVideoFpsRangesFor = iTSCertificate.getEncoded();
            org.bouncycastle.oer.its.VerificationKeyIndicator verificationKeyIndicator = iTSCertificate.toASN1Structure().getCertificateBase().getToBeSignedCertificate().getVerificationKeyIndicator();
            if (!(verificationKeyIndicator.getObject() instanceof org.bouncycastle.oer.its.PublicVerificationKey)) {
                throw new java.lang.IllegalArgumentException("not public verification key");
            }
            org.bouncycastle.oer.its.PublicVerificationKey publicVerificationKey = org.bouncycastle.oer.its.PublicVerificationKey.getInstance(verificationKeyIndicator.getObject());
            this.getInputFormats = publicVerificationKey.getChoice();
            int choice = publicVerificationKey.getChoice();
            if (choice == 0) {
                algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
            } else if (choice == 1) {
                algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
            } else {
                if (choice != 3) {
                    throw new java.lang.IllegalArgumentException("unknown key type");
                }
                algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384);
            }
            this.getHighSpeedVideoFpsRanges = algorithmIdentifier;
            this.getHighResolutionOutputSizeshNQ4ISI = (java.security.interfaces.ECPublicKey) new org.bouncycastle.its.jcajce.JcaITSPublicVerificationKey(publicVerificationKey, jcaJceHelper).getKey();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to extract parent data: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }
}
