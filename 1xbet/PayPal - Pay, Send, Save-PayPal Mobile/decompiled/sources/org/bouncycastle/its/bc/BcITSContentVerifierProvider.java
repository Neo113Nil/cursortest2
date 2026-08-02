package org.bouncycastle.its.bc;

/* loaded from: classes17.dex */
public class BcITSContentVerifierProvider implements org.bouncycastle.its.operator.ITSContentVerifierProvider {
    private final byte[] Camera2StreamConfigurationMap;
    private final org.bouncycastle.its.ITSCertificate getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.crypto.params.ECPublicKeyParameters getHighSpeedVideoSizes;

    @Override // org.bouncycastle.its.operator.ITSContentVerifierProvider
    public boolean hasAssociatedCertificate() {
        return this.getHighResolutionOutputSizeshNQ4ISI != null;
    }

    @Override // org.bouncycastle.its.operator.ITSContentVerifierProvider
    public org.bouncycastle.its.ITSCertificate getAssociatedCertificate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.its.operator.ITSContentVerifierProvider
    public org.bouncycastle.operator.ContentVerifier get(int i) throws org.bouncycastle.operator.OperatorCreationException {
        if (this.getHighSpeedVideoFpsRanges != i) {
            throw new org.bouncycastle.operator.OperatorCreationException("wrong verifier for algorithm: ".concat(java.lang.String.valueOf(i)));
        }
        final org.bouncycastle.crypto.ExtendedDigest extendedDigest = org.bouncycastle.operator.bc.BcDefaultDigestProvider.INSTANCE.get(this.getHighSpeedVideoFpsRangesFor);
        final byte[] bArr = new byte[extendedDigest.getDigestSize()];
        byte[] bArr2 = this.Camera2StreamConfigurationMap;
        extendedDigest.update(bArr2, 0, bArr2.length);
        extendedDigest.doFinal(bArr, 0);
        final byte[] bArr3 = this.getHighResolutionOutputSizeshNQ4ISI.getIssuer().isSelf() ? new byte[extendedDigest.getDigestSize()] : null;
        if (bArr3 != null) {
            byte[] byteArray = org.bouncycastle.oer.OEREncoder.toByteArray(this.getHighResolutionOutputSizeshNQ4ISI.toASN1Structure().getCertificateBase().getToBeSignedCertificate(), org.bouncycastle.oer.its.template.IEEE1609dot2.tbsCertificate);
            extendedDigest.update(byteArray, 0, byteArray.length);
            extendedDigest.doFinal(bArr3, 0);
        }
        final java.io.OutputStream outputStream = new java.io.OutputStream() { // from class: org.bouncycastle.its.bc.BcITSContentVerifierProvider.1
            @Override // java.io.OutputStream
            public void write(byte[] bArr4, int i2, int i3) throws java.io.IOException {
                extendedDigest.update(bArr4, i2, i3);
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr4) throws java.io.IOException {
                extendedDigest.update(bArr4, 0, bArr4.length);
            }

            @Override // java.io.OutputStream
            public void write(int i2) throws java.io.IOException {
                extendedDigest.update((byte) i2);
            }
        };
        return new org.bouncycastle.operator.ContentVerifier() { // from class: org.bouncycastle.its.bc.BcITSContentVerifierProvider.2
            final org.bouncycastle.crypto.signers.DSADigestSigner getHighSpeedVideoFpsRanges;

            @Override // org.bouncycastle.operator.ContentVerifier
            public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                return null;
            }

            @Override // org.bouncycastle.operator.ContentVerifier
            public boolean verify(byte[] bArr4) {
                int digestSize = extendedDigest.getDigestSize();
                byte[] bArr5 = new byte[digestSize];
                extendedDigest.doFinal(bArr5, 0);
                this.getHighSpeedVideoFpsRanges.init(false, org.bouncycastle.its.bc.BcITSContentVerifierProvider.this.getHighSpeedVideoSizes);
                this.getHighSpeedVideoFpsRanges.update(bArr5, 0, digestSize);
                byte[] bArr6 = bArr3;
                if (bArr6 == null || !org.bouncycastle.util.Arrays.areEqual(bArr5, bArr6)) {
                    org.bouncycastle.crypto.signers.DSADigestSigner dSADigestSigner = this.getHighSpeedVideoFpsRanges;
                    byte[] bArr7 = bArr;
                    dSADigestSigner.update(bArr7, 0, bArr7.length);
                } else {
                    int digestSize2 = extendedDigest.getDigestSize();
                    byte[] bArr8 = new byte[digestSize2];
                    extendedDigest.doFinal(bArr8, 0);
                    this.getHighSpeedVideoFpsRanges.update(bArr8, 0, digestSize2);
                }
                return this.getHighSpeedVideoFpsRanges.verifySignature(bArr4);
            }

            @Override // org.bouncycastle.operator.ContentVerifier
            public java.io.OutputStream getOutputStream() {
                return outputStream;
            }

            {
                this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.signers.DSADigestSigner(new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.operator.bc.BcDefaultDigestProvider.INSTANCE.get(org.bouncycastle.its.bc.BcITSContentVerifierProvider.this.getHighSpeedVideoFpsRangesFor));
            }
        };
    }

    public BcITSContentVerifierProvider(org.bouncycastle.its.ITSCertificate iTSCertificate) throws java.io.IOException {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = iTSCertificate;
        this.Camera2StreamConfigurationMap = iTSCertificate.getEncoded();
        org.bouncycastle.oer.its.VerificationKeyIndicator verificationKeyIndicator = iTSCertificate.toASN1Structure().getCertificateBase().getToBeSignedCertificate().getVerificationKeyIndicator();
        if (!(verificationKeyIndicator.getObject() instanceof org.bouncycastle.oer.its.PublicVerificationKey)) {
            throw new java.lang.IllegalStateException("not public verification key");
        }
        org.bouncycastle.oer.its.PublicVerificationKey publicVerificationKey = org.bouncycastle.oer.its.PublicVerificationKey.getInstance(verificationKeyIndicator.getObject());
        this.getHighSpeedVideoFpsRanges = publicVerificationKey.getChoice();
        int choice = publicVerificationKey.getChoice();
        if (choice == 0) {
            algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        } else if (choice == 1) {
            algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        } else {
            if (choice != 3) {
                throw new java.lang.IllegalStateException("unknown key type");
            }
            algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384);
        }
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
        this.getHighSpeedVideoSizes = (org.bouncycastle.crypto.params.ECPublicKeyParameters) new org.bouncycastle.its.bc.BcITSPublicVerificationKey(publicVerificationKey).getKey();
    }
}
