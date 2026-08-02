package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class BERBitStringParser implements org.bouncycastle.asn1.ASN1BitStringParser {
    private org.bouncycastle.asn1.ASN1StreamParser Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ConstructedBitStream getHighResolutionOutputSizeshNQ4ISI;

    static org.bouncycastle.asn1.BERBitString getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser) throws java.io.IOException {
        org.bouncycastle.asn1.ConstructedBitStream constructedBitStream = new org.bouncycastle.asn1.ConstructedBitStream(aSN1StreamParser, false);
        return new org.bouncycastle.asn1.BERBitString(org.bouncycastle.util.io.Streams.readAll(constructedBitStream), constructedBitStream.getHighSpeedVideoFpsRanges);
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public org.bouncycastle.asn1.ASN1Primitive getLoadedObject() throws java.io.IOException {
        org.bouncycastle.asn1.ConstructedBitStream constructedBitStream = new org.bouncycastle.asn1.ConstructedBitStream(this.Camera2StreamConfigurationMap, false);
        return new org.bouncycastle.asn1.BERBitString(org.bouncycastle.util.io.Streams.readAll(constructedBitStream), constructedBitStream.getHighSpeedVideoFpsRanges);
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public int getPadBits() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
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

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public java.io.InputStream getOctetStream() throws java.io.IOException {
        org.bouncycastle.asn1.ConstructedBitStream constructedBitStream = new org.bouncycastle.asn1.ConstructedBitStream(this.Camera2StreamConfigurationMap, true);
        this.getHighResolutionOutputSizeshNQ4ISI = constructedBitStream;
        return constructedBitStream;
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public java.io.InputStream getBitStream() throws java.io.IOException {
        org.bouncycastle.asn1.ConstructedBitStream constructedBitStream = new org.bouncycastle.asn1.ConstructedBitStream(this.Camera2StreamConfigurationMap, false);
        this.getHighResolutionOutputSizeshNQ4ISI = constructedBitStream;
        return constructedBitStream;
    }

    BERBitStringParser(org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser) {
        this.Camera2StreamConfigurationMap = aSN1StreamParser;
    }
}
