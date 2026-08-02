package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class ContentInfoParser {
    private org.bouncycastle.asn1.ASN1TaggedObjectParser getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1Encodable getContent(int i) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser = this.getHighSpeedVideoFpsRanges;
        if (aSN1TaggedObjectParser != null) {
            return org.bouncycastle.asn1.ASN1Util.parseExplicitContextBaseObject(aSN1TaggedObjectParser, 0);
        }
        return null;
    }

    public ContentInfoParser(org.bouncycastle.asn1.ASN1SequenceParser aSN1SequenceParser) throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1SequenceParser.readObject();
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.ASN1TaggedObjectParser) aSN1SequenceParser.readObject();
    }
}
