package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
class ConstructedBitStream extends java.io.InputStream {
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private java.io.InputStream getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1BitStringParser getHighSpeedVideoSizes;
    private final org.bouncycastle.asn1.ASN1StreamParser getOutputFormats;
    private boolean Camera2StreamConfigurationMap = true;
    int getHighSpeedVideoFpsRanges = 0;

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = 0;
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            if (!this.Camera2StreamConfigurationMap) {
                return -1;
            }
            org.bouncycastle.asn1.ASN1BitStringParser highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            this.getHighSpeedVideoSizes = highSpeedVideoFpsRanges;
            if (highSpeedVideoFpsRanges == null) {
                return -1;
            }
            this.Camera2StreamConfigurationMap = false;
            this.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRanges.getBitStream();
        }
        while (true) {
            int read = this.getHighSpeedVideoFpsRangesFor.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getPadBits();
                org.bouncycastle.asn1.ASN1BitStringParser highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges();
                this.getHighSpeedVideoSizes = highSpeedVideoFpsRanges2;
                if (highSpeedVideoFpsRanges2 == null) {
                    this.getHighSpeedVideoFpsRangesFor = null;
                    if (i3 <= 0) {
                        return -1;
                    }
                    return i3;
                }
                this.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRanges2.getBitStream();
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            if (!this.Camera2StreamConfigurationMap) {
                return -1;
            }
            org.bouncycastle.asn1.ASN1BitStringParser highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            this.getHighSpeedVideoSizes = highSpeedVideoFpsRanges;
            if (highSpeedVideoFpsRanges == null) {
                return -1;
            }
            this.Camera2StreamConfigurationMap = false;
            this.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRanges.getBitStream();
        }
        while (true) {
            int read = this.getHighSpeedVideoFpsRangesFor.read();
            if (read >= 0) {
                return read;
            }
            this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getPadBits();
            org.bouncycastle.asn1.ASN1BitStringParser highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges();
            this.getHighSpeedVideoSizes = highSpeedVideoFpsRanges2;
            if (highSpeedVideoFpsRanges2 == null) {
                this.getHighSpeedVideoFpsRangesFor = null;
                return -1;
            }
            this.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRanges2.getBitStream();
        }
    }

    private org.bouncycastle.asn1.ASN1BitStringParser getHighSpeedVideoFpsRanges() throws java.io.IOException {
        org.bouncycastle.asn1.ASN1Encodable readObject = this.getOutputFormats.readObject();
        if (readObject == null) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI || this.getHighSpeedVideoFpsRanges == 0) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("expected octet-aligned bitstring, but found padBits: ");
            sb.append(this.getHighSpeedVideoFpsRanges);
            throw new java.io.IOException(sb.toString());
        }
        if (readObject instanceof org.bouncycastle.asn1.ASN1BitStringParser) {
            if (this.getHighSpeedVideoFpsRanges == 0) {
                return (org.bouncycastle.asn1.ASN1BitStringParser) readObject;
            }
            throw new java.io.IOException("only the last nested bitstring can have padding");
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unknown object encountered: ");
        sb2.append(readObject.getClass());
        throw new java.io.IOException(sb2.toString());
    }

    ConstructedBitStream(org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser, boolean z) {
        this.getOutputFormats = aSN1StreamParser;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }
}
