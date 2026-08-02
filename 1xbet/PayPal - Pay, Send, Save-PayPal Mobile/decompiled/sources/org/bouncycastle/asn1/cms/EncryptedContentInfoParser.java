package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class EncryptedContentInfoParser {
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1TaggedObjectParser getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.asn1.ASN1Encodable getEncryptedContent(int i) throws java.io.IOException {
        return org.bouncycastle.asn1.ASN1Util.parseContextBaseUniversal(this.getHighSpeedVideoFpsRanges, 0, false, i);
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getContentEncryptionAlgorithm() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public EncryptedContentInfoParser(org.bouncycastle.asn1.ASN1SequenceParser aSN1SequenceParser) throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1SequenceParser.readObject();
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1SequenceParser.readObject().toASN1Primitive());
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.ASN1TaggedObjectParser) aSN1SequenceParser.readObject();
    }
}
