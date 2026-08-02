package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DEROctetStringParser implements org.bouncycastle.asn1.ASN1OctetStringParser {
    private org.bouncycastle.asn1.DefiniteLengthInputStream getHighSpeedVideoSizes;

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
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public org.bouncycastle.asn1.ASN1Primitive getLoadedObject() throws java.io.IOException {
        return new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges());
    }

    DEROctetStringParser(org.bouncycastle.asn1.DefiniteLengthInputStream definiteLengthInputStream) {
        this.getHighSpeedVideoSizes = definiteLengthInputStream;
    }
}
