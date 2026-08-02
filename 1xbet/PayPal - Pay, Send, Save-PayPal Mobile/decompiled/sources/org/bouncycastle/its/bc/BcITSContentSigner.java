package org.bouncycastle.its.bc;

/* loaded from: classes17.dex */
public class BcITSContentSigner implements org.bouncycastle.its.operator.ITSContentSigner {
    private final byte[] Camera2StreamConfigurationMap;
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.crypto.Digest getHighSpeedVideoSizes;
    private final org.bouncycastle.crypto.params.ECPrivateKeyParameters getOutputFormats;
    private final org.bouncycastle.its.ITSCertificate getOutputMinFrameDuration;

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public boolean isForSelfSigning() {
        return this.getHighResolutionOutputSizeshNQ4ISI == null;
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public byte[] getSignature() {
        int digestSize = this.getHighSpeedVideoSizes.getDigestSize();
        byte[] bArr = new byte[digestSize];
        this.getHighSpeedVideoSizes.doFinal(bArr, 0);
        org.bouncycastle.crypto.signers.DSADigestSigner dSADigestSigner = new org.bouncycastle.crypto.signers.DSADigestSigner(new org.bouncycastle.crypto.signers.ECDSASigner(), this.getHighSpeedVideoSizes);
        dSADigestSigner.init(true, this.getOutputFormats);
        dSADigestSigner.update(bArr, 0, digestSize);
        byte[] bArr2 = this.Camera2StreamConfigurationMap;
        dSADigestSigner.update(bArr2, 0, bArr2.length);
        return dSADigestSigner.generateSignature();
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public java.io.OutputStream getOutputStream() {
        return new org.bouncycastle.crypto.io.DigestOutputStream(this.getHighSpeedVideoSizes);
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithm() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public byte[] getAssociatedCertificateDigest() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public org.bouncycastle.its.ITSCertificate getAssociatedCertificate() {
        return this.getOutputMinFrameDuration;
    }

    public BcITSContentSigner(org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters, org.bouncycastle.its.ITSCertificate iTSCertificate) {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier;
        this.getOutputFormats = eCPrivateKeyParameters;
        org.bouncycastle.asn1.ASN1ObjectIdentifier name2 = ((org.bouncycastle.crypto.params.ECNamedDomainParameters) eCPrivateKeyParameters.getParameters()).getName();
        this.getHighSpeedVideoFpsRangesFor = name2;
        this.getOutputMinFrameDuration = iTSCertificate;
        if (name2.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp256r1)) {
            algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        } else if (name2.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP256r1)) {
            algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        } else {
            if (!name2.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP384r1)) {
                throw new java.lang.IllegalArgumentException("unknown key type");
            }
            algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384);
        }
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier;
        try {
            org.bouncycastle.crypto.ExtendedDigest extendedDigest = org.bouncycastle.operator.bc.BcDefaultDigestProvider.INSTANCE.get(algorithmIdentifier);
            this.getHighSpeedVideoSizes = extendedDigest;
            if (iTSCertificate == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                byte[] bArr = new byte[extendedDigest.getDigestSize()];
                this.Camera2StreamConfigurationMap = bArr;
                extendedDigest.doFinal(bArr, 0);
                return;
            }
            try {
                byte[] encoded = iTSCertificate.getEncoded();
                this.getHighResolutionOutputSizeshNQ4ISI = encoded;
                byte[] bArr2 = new byte[extendedDigest.getDigestSize()];
                this.Camera2StreamConfigurationMap = bArr2;
                extendedDigest.update(encoded, 0, encoded.length);
                extendedDigest.doFinal(bArr2, 0);
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("signer certificate encoding failed: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalStateException(sb.toString());
            }
        } catch (org.bouncycastle.operator.OperatorCreationException unused) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("cannot recognise digest type: ");
            sb2.append(this.getHighSpeedVideoFpsRanges.getAlgorithm());
            throw new java.lang.IllegalStateException(sb2.toString());
        }
    }

    public BcITSContentSigner(org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters) {
        this(eCPrivateKeyParameters, null);
    }
}
