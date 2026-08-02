package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class ASN1OutputStream {
    java.io.OutputStream getHighSpeedVideoFpsRanges;

    static int Camera2StreamConfigurationMap(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    static int getHighSpeedVideoFpsRanges(boolean z, int i) {
        int i2;
        if (i >= 128) {
            i2 = 2;
            int i3 = i;
            while (true) {
                i3 >>>= 8;
                if (i3 == 0) {
                    break;
                }
                i2++;
            }
        } else {
            i2 = 1;
        }
        return (z ? 1 : 0) + i2 + i;
    }

    static int getHighSpeedVideoFpsRangesFor(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    final void getHighSpeedVideoFpsRanges(int i) throws java.io.IOException {
        if (i < 128) {
            this.getHighSpeedVideoFpsRanges.write(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | 128);
                this.getHighSpeedVideoFpsRanges.write(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI(boolean z, int i, byte[] bArr) throws java.io.IOException {
        if (z) {
            this.getHighSpeedVideoFpsRanges.write(i);
        }
        getHighSpeedVideoFpsRanges(bArr.length);
        this.getHighSpeedVideoFpsRanges.write(bArr, 0, bArr.length);
    }

    final void getHighResolutionOutputSizeshNQ4ISI(boolean z, int i, byte[] bArr, int i2, int i3) throws java.io.IOException {
        if (z) {
            this.getHighSpeedVideoFpsRanges.write(i);
        }
        getHighSpeedVideoFpsRanges(i3);
        this.getHighSpeedVideoFpsRanges.write(bArr, i2, i3);
    }

    final void getHighSpeedVideoFpsRanges(boolean z, int i, org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) throws java.io.IOException {
        if (z) {
            this.getHighSpeedVideoFpsRanges.write(i);
        }
        this.getHighSpeedVideoFpsRanges.write(128);
        getHighSpeedVideoFpsRanges(aSN1EncodableArr);
        this.getHighSpeedVideoFpsRanges.write(0);
        this.getHighSpeedVideoFpsRanges.write(0);
    }

    final void getHighSpeedVideoFpsRangesFor(int i, int i2) throws java.io.IOException {
        if (i2 < 31) {
            this.getHighSpeedVideoFpsRanges.write(i | i2);
            return;
        }
        byte[] bArr = new byte[6];
        int i3 = 5;
        bArr[5] = (byte) (i2 & 127);
        while (i2 > 127) {
            i2 >>>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        }
        int i4 = i3 - 1;
        bArr[i4] = (byte) (i | 31);
        this.getHighSpeedVideoFpsRanges.write(bArr, i4, 6 - i4);
    }

    void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1Primitive[] aSN1PrimitiveArr) throws java.io.IOException {
        for (org.bouncycastle.asn1.ASN1Primitive aSN1Primitive : aSN1PrimitiveArr) {
            aSN1Primitive.getHighSpeedVideoSizes(this, true);
        }
    }

    void getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) throws java.io.IOException {
        aSN1Primitive.getHighSpeedVideoSizes(this, true);
    }

    public final void writeObject(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) throws java.io.IOException {
        if (aSN1Primitive == null) {
            throw new java.io.IOException("null object detected");
        }
        getHighSpeedVideoFpsRanges(aSN1Primitive);
    }

    public final void writeObject(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        if (aSN1Encodable == null) {
            throw new java.io.IOException("null object detected");
        }
        getHighSpeedVideoFpsRanges(aSN1Encodable.toASN1Primitive());
    }

    void getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) throws java.io.IOException {
        for (org.bouncycastle.asn1.ASN1Encodable aSN1Encodable : aSN1EncodableArr) {
            aSN1Encodable.toASN1Primitive().getHighSpeedVideoSizes(this, true);
        }
    }

    org.bouncycastle.asn1.DLOutputStream getHighResolutionOutputSizeshNQ4ISI() {
        return new org.bouncycastle.asn1.DLOutputStream(this.getHighSpeedVideoFpsRanges);
    }

    org.bouncycastle.asn1.DEROutputStream getHighSpeedVideoSizes() {
        return new org.bouncycastle.asn1.DEROutputStream(this.getHighSpeedVideoFpsRanges);
    }

    public void flush() throws java.io.IOException {
        this.getHighSpeedVideoFpsRanges.flush();
    }

    public void close() throws java.io.IOException {
        this.getHighSpeedVideoFpsRanges.close();
    }

    public static org.bouncycastle.asn1.ASN1OutputStream create(java.io.OutputStream outputStream, java.lang.String str) {
        return str.equals(org.bouncycastle.asn1.ASN1Encoding.DER) ? new org.bouncycastle.asn1.DEROutputStream(outputStream) : str.equals(org.bouncycastle.asn1.ASN1Encoding.DL) ? new org.bouncycastle.asn1.DLOutputStream(outputStream) : new org.bouncycastle.asn1.ASN1OutputStream(outputStream);
    }

    public static org.bouncycastle.asn1.ASN1OutputStream create(java.io.OutputStream outputStream) {
        return new org.bouncycastle.asn1.ASN1OutputStream(outputStream);
    }

    ASN1OutputStream(java.io.OutputStream outputStream) {
        this.getHighSpeedVideoFpsRanges = outputStream;
    }
}
