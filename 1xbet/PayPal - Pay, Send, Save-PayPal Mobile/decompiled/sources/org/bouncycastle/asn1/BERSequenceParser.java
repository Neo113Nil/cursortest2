package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class BERSequenceParser implements org.bouncycastle.asn1.ASN1SequenceParser {
    private org.bouncycastle.asn1.ASN1StreamParser getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public org.bouncycastle.asn1.ASN1Primitive getLoadedObject() throws java.io.IOException {
        return new org.bouncycastle.asn1.BERSequence(this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI());
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.asn1.ASN1SequenceParser
    public org.bouncycastle.asn1.ASN1Encodable readObject() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRangesFor.readObject();
    }

    static org.bouncycastle.asn1.BERSequence getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser) throws java.io.IOException {
        return new org.bouncycastle.asn1.BERSequence(aSN1StreamParser.getHighResolutionOutputSizeshNQ4ISI());
    }

    BERSequenceParser(org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser) {
        this.getHighSpeedVideoFpsRangesFor = aSN1StreamParser;
    }
}
