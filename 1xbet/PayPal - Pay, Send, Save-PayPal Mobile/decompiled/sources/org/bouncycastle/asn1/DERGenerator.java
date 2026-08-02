package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public abstract class DERGenerator extends org.bouncycastle.asn1.ASN1Generator {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    final void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) throws java.io.IOException {
        if (!this.getHighSpeedVideoSizes) {
            java.io.OutputStream outputStream = this._out;
            outputStream.write(48);
            getHighSpeedVideoFpsRanges(outputStream, bArr.length);
            outputStream.write(bArr);
            return;
        }
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (!this.getHighSpeedVideoFpsRangesFor) {
            java.io.OutputStream outputStream2 = this._out;
            outputStream2.write(i | 160);
            getHighSpeedVideoFpsRanges(outputStream2, bArr.length);
            outputStream2.write(bArr);
            return;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byteArrayOutputStream.write(48);
        getHighSpeedVideoFpsRanges(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr);
        java.io.OutputStream outputStream3 = this._out;
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        outputStream3.write(i | 160);
        getHighSpeedVideoFpsRanges(outputStream3, byteArray.length);
        outputStream3.write(byteArray);
    }

    private static void getHighSpeedVideoFpsRanges(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        if (i <= 127) {
            outputStream.write((byte) i);
            return;
        }
        int i2 = i;
        int i3 = 1;
        while (true) {
            i2 >>>= 8;
            if (i2 == 0) {
                break;
            } else {
                i3++;
            }
        }
        outputStream.write((byte) (i3 | 128));
        for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
            outputStream.write((byte) (i >> i4));
        }
    }

    public DERGenerator(java.io.OutputStream outputStream, int i, boolean z) {
        super(outputStream);
        this.getHighSpeedVideoSizes = true;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    protected DERGenerator(java.io.OutputStream outputStream) {
        super(outputStream);
        this.getHighSpeedVideoSizes = false;
    }
}
