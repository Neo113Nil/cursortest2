package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DLBitStringParser implements org.bouncycastle.asn1.ASN1BitStringParser {
    private int Camera2StreamConfigurationMap = 0;
    private final org.bouncycastle.asn1.DefiniteLengthInputStream getHighResolutionOutputSizeshNQ4ISI;

    private java.io.InputStream getHighResolutionOutputSizeshNQ4ISI(boolean z) throws java.io.IOException {
        int i = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
        if (i <= 0) {
            throw new java.lang.IllegalStateException("content octets cannot be empty");
        }
        int read = this.getHighResolutionOutputSizeshNQ4ISI.read();
        this.Camera2StreamConfigurationMap = read;
        if (read > 0) {
            if (i < 2) {
                throw new java.lang.IllegalStateException("zero length data with non-zero pad bits");
            }
            if (read > 7) {
                throw new java.lang.IllegalStateException("pad bits cannot be greater than 7 or less than 0");
            }
            if (z) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("expected octet-aligned bitstring, but found padBits: ");
                sb.append(this.Camera2StreamConfigurationMap);
                throw new java.io.IOException(sb.toString());
            }
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
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
    public int getPadBits() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public java.io.InputStream getOctetStream() throws java.io.IOException {
        return getHighResolutionOutputSizeshNQ4ISI(true);
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public org.bouncycastle.asn1.ASN1Primitive getLoadedObject() throws java.io.IOException {
        return org.bouncycastle.asn1.DLBitString.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges());
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public java.io.InputStream getBitStream() throws java.io.IOException {
        return getHighResolutionOutputSizeshNQ4ISI(false);
    }

    DLBitStringParser(org.bouncycastle.asn1.DefiniteLengthInputStream definiteLengthInputStream) {
        this.getHighResolutionOutputSizeshNQ4ISI = definiteLengthInputStream;
    }
}
