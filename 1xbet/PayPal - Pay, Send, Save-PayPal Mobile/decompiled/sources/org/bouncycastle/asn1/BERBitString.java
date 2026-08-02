package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class BERBitString extends org.bouncycastle.asn1.ASN1BitString {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1BitString[] getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRanges == null && this.getHighSpeedVideoSizes.length <= this.getHighResolutionOutputSizeshNQ4ISI) {
            org.bouncycastle.asn1.DLBitString.getHighSpeedVideoSizes(aSN1OutputStream, z, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizes.length);
            return;
        }
        if (z) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges.write(35);
        }
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(128);
        org.bouncycastle.asn1.ASN1BitString[] aSN1BitStringArr = this.getHighSpeedVideoFpsRanges;
        if (aSN1BitStringArr != null) {
            aSN1OutputStream.getHighSpeedVideoSizes(aSN1BitStringArr);
        } else if (this.getHighSpeedVideoSizes.length >= 2) {
            byte b = this.getHighSpeedVideoSizes[0];
            int length = this.getHighSpeedVideoSizes.length;
            int i = length - 1;
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI - 1;
            while (i > i2) {
                org.bouncycastle.asn1.DLBitString.getHighSpeedVideoSizes(aSN1OutputStream, (byte) 0, this.getHighSpeedVideoSizes, length - i, i2);
                i -= i2;
            }
            org.bouncycastle.asn1.DLBitString.getHighSpeedVideoSizes(aSN1OutputStream, b, this.getHighSpeedVideoSizes, length - i, i);
        }
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(0);
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRanges == null && this.getHighSpeedVideoSizes.length <= this.getHighResolutionOutputSizeshNQ4ISI) {
            return org.bouncycastle.asn1.DLBitString.getHighResolutionOutputSizeshNQ4ISI(z, this.getHighSpeedVideoSizes.length);
        }
        int i = z ? 4 : 3;
        if (this.getHighSpeedVideoFpsRanges == null) {
            if (this.getHighSpeedVideoSizes.length < 2) {
                return i;
            }
            int length = this.getHighSpeedVideoSizes.length;
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i3 = (length - 2) / (i2 - 1);
            return i + (org.bouncycastle.asn1.DLBitString.getHighResolutionOutputSizeshNQ4ISI(true, i2) * i3) + org.bouncycastle.asn1.DLBitString.getHighResolutionOutputSizeshNQ4ISI(true, this.getHighSpeedVideoSizes.length - (i3 * (this.getHighResolutionOutputSizeshNQ4ISI - 1)));
        }
        int i4 = 0;
        while (true) {
            org.bouncycastle.asn1.ASN1BitString[] aSN1BitStringArr = this.getHighSpeedVideoFpsRanges;
            if (i4 >= aSN1BitStringArr.length) {
                return i;
            }
            i += aSN1BitStringArr[i4].getHighSpeedVideoSizes(true);
            i4++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoFpsRanges != null || this.getHighSpeedVideoSizes.length > this.getHighResolutionOutputSizeshNQ4ISI;
    }

    static byte[] Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1BitString[] aSN1BitStringArr) {
        int length = aSN1BitStringArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return aSN1BitStringArr[0].getHighSpeedVideoSizes;
        }
        int i = length - 1;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            byte[] bArr = aSN1BitStringArr[i3].getHighSpeedVideoSizes;
            if (bArr[0] != 0) {
                throw new java.lang.IllegalArgumentException("only the last nested bitstring can have padding");
            }
            i2 += bArr.length - 1;
        }
        byte[] bArr2 = aSN1BitStringArr[i].getHighSpeedVideoSizes;
        byte b = bArr2[0];
        byte[] bArr3 = new byte[i2 + bArr2.length];
        bArr3[0] = b;
        int i4 = 1;
        for (org.bouncycastle.asn1.ASN1BitString aSN1BitString : aSN1BitStringArr) {
            byte[] bArr4 = aSN1BitString.getHighSpeedVideoSizes;
            int length2 = bArr4.length - 1;
            java.lang.System.arraycopy(bArr4, 1, bArr3, i4, length2);
            i4 += length2;
        }
        return bArr3;
    }

    public BERBitString(org.bouncycastle.asn1.ASN1BitString[] aSN1BitStringArr, int i) {
        super(Camera2StreamConfigurationMap(aSN1BitStringArr), false);
        this.getHighSpeedVideoFpsRanges = aSN1BitStringArr;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public BERBitString(org.bouncycastle.asn1.ASN1BitString[] aSN1BitStringArr) {
        this(aSN1BitStringArr, 1000);
    }

    public BERBitString(byte[] bArr, int i, int i2) {
        super(bArr, i);
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
    }

    public BERBitString(byte[] bArr, int i) {
        this(bArr, i, 1000);
    }

    public BERBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public BERBitString(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        this(aSN1Encodable.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER), 0);
    }

    public BERBitString(byte b, int i) {
        super(b, i);
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighResolutionOutputSizeshNQ4ISI = 1000;
    }
}
