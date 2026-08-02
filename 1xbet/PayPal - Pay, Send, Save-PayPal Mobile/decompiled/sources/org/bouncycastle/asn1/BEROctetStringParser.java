package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class BEROctetStringParser implements org.bouncycastle.asn1.ASN1OctetStringParser {
    private org.bouncycastle.asn1.ASN1StreamParser getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public org.bouncycastle.asn1.ASN1Primitive getLoadedObject() throws java.io.IOException {
        return new org.bouncycastle.asn1.BEROctetString(org.bouncycastle.util.io.Streams.readAll(new org.bouncycastle.asn1.ConstructedOctetStream(this.getHighResolutionOutputSizeshNQ4ISI)));
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("IOException converting stream to byte array: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.asn1.ASN1ParsingException(sb.toString(), e);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1OctetStringParser
    public java.io.InputStream getOctetStream() {
        return new org.bouncycastle.asn1.ConstructedOctetStream(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    static org.bouncycastle.asn1.BEROctetString getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser) throws java.io.IOException {
        return new org.bouncycastle.asn1.BEROctetString(org.bouncycastle.util.io.Streams.readAll(new org.bouncycastle.asn1.ConstructedOctetStream(aSN1StreamParser)));
    }

    BEROctetStringParser(org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1StreamParser;
    }
}
