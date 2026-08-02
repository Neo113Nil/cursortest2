package org.bouncycastle.tsp;

/* loaded from: classes17.dex */
public class TimeStampRequestGenerator {
    private static final org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder getHighSpeedVideoFpsRanges = new org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder();
    private org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Boolean getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.ExtensionsGenerator getHighSpeedVideoSizes = new org.bouncycastle.asn1.x509.ExtensionsGenerator();

    public void setReqPolicy(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
    }

    public void setReqPolicy(java.lang.String str) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1ObjectIdentifier(str);
    }

    public void setCertReq(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Boolean.getInstance(z);
    }

    public org.bouncycastle.tsp.TimeStampRequest generate(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr, java.math.BigInteger bigInteger) {
        if (algorithmIdentifier == null) {
            throw new java.lang.IllegalArgumentException("digest algorithm not specified");
        }
        org.bouncycastle.asn1.tsp.MessageImprint messageImprint = new org.bouncycastle.asn1.tsp.MessageImprint(algorithmIdentifier, bArr);
        org.bouncycastle.asn1.x509.Extensions generate = !this.getHighSpeedVideoSizes.isEmpty() ? this.getHighSpeedVideoSizes.generate() : null;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = this.Camera2StreamConfigurationMap;
        return new org.bouncycastle.tsp.TimeStampRequest(bigInteger != null ? new org.bouncycastle.asn1.tsp.TimeStampReq(messageImprint, aSN1ObjectIdentifier, new org.bouncycastle.asn1.ASN1Integer(bigInteger), this.getHighSpeedVideoFpsRangesFor, generate) : new org.bouncycastle.asn1.tsp.TimeStampReq(messageImprint, aSN1ObjectIdentifier, null, this.getHighSpeedVideoFpsRangesFor, generate));
    }

    public org.bouncycastle.tsp.TimeStampRequest generate(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        return generate(algorithmIdentifier, bArr, (java.math.BigInteger) null);
    }

    public org.bouncycastle.tsp.TimeStampRequest generate(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr, java.math.BigInteger bigInteger) {
        return generate(getHighSpeedVideoFpsRanges.find(aSN1ObjectIdentifier), bArr, bigInteger);
    }

    public org.bouncycastle.tsp.TimeStampRequest generate(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        return generate(getHighSpeedVideoFpsRanges.find(aSN1ObjectIdentifier), bArr);
    }

    public org.bouncycastle.tsp.TimeStampRequest generate(java.lang.String str, byte[] bArr, java.math.BigInteger bigInteger) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("No digest algorithm specified");
        }
        org.bouncycastle.asn1.tsp.MessageImprint messageImprint = new org.bouncycastle.asn1.tsp.MessageImprint(getHighSpeedVideoFpsRanges.find(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str)), bArr);
        org.bouncycastle.asn1.x509.Extensions generate = !this.getHighSpeedVideoSizes.isEmpty() ? this.getHighSpeedVideoSizes.generate() : null;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = this.Camera2StreamConfigurationMap;
        return new org.bouncycastle.tsp.TimeStampRequest(bigInteger != null ? new org.bouncycastle.asn1.tsp.TimeStampReq(messageImprint, aSN1ObjectIdentifier, new org.bouncycastle.asn1.ASN1Integer(bigInteger), this.getHighSpeedVideoFpsRangesFor, generate) : new org.bouncycastle.asn1.tsp.TimeStampReq(messageImprint, aSN1ObjectIdentifier, null, this.getHighSpeedVideoFpsRangesFor, generate));
    }

    public org.bouncycastle.tsp.TimeStampRequest generate(java.lang.String str, byte[] bArr) {
        return generate(str, bArr, (java.math.BigInteger) null);
    }

    public void addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, byte[] bArr) {
        this.getHighSpeedVideoSizes.addExtension(aSN1ObjectIdentifier, z, bArr);
    }

    public void addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws org.bouncycastle.tsp.TSPIOException {
        org.bouncycastle.tsp.TSPUtil.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, aSN1ObjectIdentifier, z, aSN1Encodable);
    }

    public void addExtension(java.lang.String str, boolean z, byte[] bArr) {
        this.getHighSpeedVideoSizes.addExtension(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str), z, bArr);
    }

    public void addExtension(java.lang.String str, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        addExtension(str, z, aSN1Encodable.toASN1Primitive().getEncoded());
    }
}
