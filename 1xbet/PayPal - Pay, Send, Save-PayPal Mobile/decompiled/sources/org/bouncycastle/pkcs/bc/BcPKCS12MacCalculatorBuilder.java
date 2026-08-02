package org.bouncycastle.pkcs.bc;

/* loaded from: classes17.dex */
public class BcPKCS12MacCalculatorBuilder implements org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder {
    private int Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private java.security.SecureRandom getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.ExtendedDigest getHighSpeedVideoSizes;

    public org.bouncycastle.pkcs.bc.BcPKCS12MacCalculatorBuilder setIterationCount(int i) {
        this.Camera2StreamConfigurationMap = i;
        return this;
    }

    @Override // org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder
    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithmIdentifier() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder
    public org.bouncycastle.operator.MacCalculator build(char[] cArr) {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = new java.security.SecureRandom();
        }
        byte[] bArr = new byte[this.getHighSpeedVideoFpsRanges];
        this.getHighSpeedVideoFpsRangesFor.nextBytes(bArr);
        return org.bouncycastle.pkcs.bc.PKCS12PBEUtils.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI.getAlgorithm(), this.getHighSpeedVideoSizes, new org.bouncycastle.asn1.pkcs.PKCS12PBEParams(bArr, this.Camera2StreamConfigurationMap), cArr);
    }

    public BcPKCS12MacCalculatorBuilder(org.bouncycastle.crypto.ExtendedDigest extendedDigest, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.Camera2StreamConfigurationMap = 1024;
        this.getHighSpeedVideoSizes = extendedDigest;
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmIdentifier;
        this.getHighSpeedVideoFpsRanges = extendedDigest.getDigestSize();
    }

    public BcPKCS12MacCalculatorBuilder() {
        this(new org.bouncycastle.crypto.digests.SHA1Digest(), new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1, org.bouncycastle.asn1.DERNull.INSTANCE));
    }
}
