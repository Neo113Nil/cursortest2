package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DLSetParser implements org.bouncycastle.asn1.ASN1SetParser {
    private org.bouncycastle.asn1.ASN1StreamParser getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.asn1.ASN1ParsingException(e.getMessage(), e);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1SetParser
    public org.bouncycastle.asn1.ASN1Encodable readObject() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRangesFor.readObject();
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public org.bouncycastle.asn1.ASN1Primitive getLoadedObject() throws java.io.IOException {
        return org.bouncycastle.asn1.DLFactory.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI());
    }

    DLSetParser(org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser) {
        this.getHighSpeedVideoFpsRangesFor = aSN1StreamParser;
    }
}
