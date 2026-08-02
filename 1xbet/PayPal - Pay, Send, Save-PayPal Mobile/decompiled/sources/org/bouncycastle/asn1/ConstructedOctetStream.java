package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
class ConstructedOctetStream extends java.io.InputStream {
    private boolean getHighResolutionOutputSizeshNQ4ISI = true;
    private final org.bouncycastle.asn1.ASN1StreamParser getHighSpeedVideoFpsRangesFor;
    private java.io.InputStream getHighSpeedVideoSizes;

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1OctetStringParser Camera2StreamConfigurationMap;
        int i3 = 0;
        if (this.getHighSpeedVideoSizes == null) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI || (Camera2StreamConfigurationMap = Camera2StreamConfigurationMap()) == null) {
                return -1;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap.getOctetStream();
        }
        while (true) {
            int read = this.getHighSpeedVideoSizes.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                org.bouncycastle.asn1.ASN1OctetStringParser Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
                if (Camera2StreamConfigurationMap2 == null) {
                    this.getHighSpeedVideoSizes = null;
                    if (i3 <= 0) {
                        return -1;
                    }
                    return i3;
                }
                this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap2.getOctetStream();
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        org.bouncycastle.asn1.ASN1OctetStringParser Camera2StreamConfigurationMap;
        if (this.getHighSpeedVideoSizes == null) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI || (Camera2StreamConfigurationMap = Camera2StreamConfigurationMap()) == null) {
                return -1;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap.getOctetStream();
        }
        while (true) {
            int read = this.getHighSpeedVideoSizes.read();
            if (read >= 0) {
                return read;
            }
            org.bouncycastle.asn1.ASN1OctetStringParser Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap2 == null) {
                this.getHighSpeedVideoSizes = null;
                return -1;
            }
            this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap2.getOctetStream();
        }
    }

    private org.bouncycastle.asn1.ASN1OctetStringParser Camera2StreamConfigurationMap() throws java.io.IOException {
        org.bouncycastle.asn1.ASN1Encodable readObject = this.getHighSpeedVideoFpsRangesFor.readObject();
        if (readObject == null) {
            return null;
        }
        if (readObject instanceof org.bouncycastle.asn1.ASN1OctetStringParser) {
            return (org.bouncycastle.asn1.ASN1OctetStringParser) readObject;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object encountered: ");
        sb.append(readObject.getClass());
        throw new java.io.IOException(sb.toString());
    }

    ConstructedOctetStream(org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser) {
        this.getHighSpeedVideoFpsRangesFor = aSN1StreamParser;
    }
}
