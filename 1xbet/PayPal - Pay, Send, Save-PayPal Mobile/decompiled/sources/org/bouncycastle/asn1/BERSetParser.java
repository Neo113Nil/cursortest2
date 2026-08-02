package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class BERSetParser implements org.bouncycastle.asn1.ASN1SetParser {
    private org.bouncycastle.asn1.ASN1StreamParser getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public org.bouncycastle.asn1.ASN1Primitive getLoadedObject() throws java.io.IOException {
        return new org.bouncycastle.asn1.BERSet(this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI());
    }

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
        return this.getHighSpeedVideoSizes.readObject();
    }

    static org.bouncycastle.asn1.BERSet getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser) throws java.io.IOException {
        return new org.bouncycastle.asn1.BERSet(aSN1StreamParser.getHighResolutionOutputSizeshNQ4ISI());
    }

    BERSetParser(org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser) {
        this.getHighSpeedVideoSizes = aSN1StreamParser;
    }
}
