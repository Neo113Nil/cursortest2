package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class CompressedDataParser {
    private org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.cms.ContentInfoParser getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.cms.ContentInfoParser getEncapContentInfo() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getCompressionAlgorithmIdentifier() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public CompressedDataParser(org.bouncycastle.asn1.ASN1SequenceParser aSN1SequenceParser) throws java.io.IOException {
        this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.ASN1Integer) aSN1SequenceParser.readObject();
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1SequenceParser.readObject().toASN1Primitive());
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.cms.ContentInfoParser((org.bouncycastle.asn1.ASN1SequenceParser) aSN1SequenceParser.readObject());
    }
}
