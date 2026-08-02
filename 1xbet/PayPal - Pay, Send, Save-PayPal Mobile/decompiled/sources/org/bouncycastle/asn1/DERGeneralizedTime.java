package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DERGeneralizedTime extends org.bouncycastle.asn1.ASN1GeneralizedTime {
    @Override // org.bouncycastle.asn1.ASN1GeneralizedTime, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1GeneralizedTime, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1GeneralizedTime, org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, getHighSpeedVideoFpsRanges().length);
    }

    @Override // org.bouncycastle.asn1.ASN1GeneralizedTime, org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        aSN1OutputStream.getHighResolutionOutputSizeshNQ4ISI(z, 24, getHighSpeedVideoFpsRanges());
    }

    private byte[] getHighSpeedVideoFpsRanges() {
        if (this.getHighSpeedVideoFpsRanges[this.getHighSpeedVideoFpsRanges.length - 1] != 90) {
            return this.getHighSpeedVideoFpsRanges;
        }
        if (!hasMinutes()) {
            byte[] bArr = new byte[this.getHighSpeedVideoFpsRanges.length + 4];
            java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, 0, bArr, 0, this.getHighSpeedVideoFpsRanges.length - 1);
            java.lang.System.arraycopy(org.bouncycastle.util.Strings.toByteArray("0000Z"), 0, bArr, this.getHighSpeedVideoFpsRanges.length - 1, 5);
            return bArr;
        }
        if (!hasSeconds()) {
            byte[] bArr2 = new byte[this.getHighSpeedVideoFpsRanges.length + 2];
            java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, 0, bArr2, 0, this.getHighSpeedVideoFpsRanges.length - 1);
            java.lang.System.arraycopy(org.bouncycastle.util.Strings.toByteArray("00Z"), 0, bArr2, this.getHighSpeedVideoFpsRanges.length - 1, 3);
            return bArr2;
        }
        if (!hasFractionalSeconds()) {
            return this.getHighSpeedVideoFpsRanges;
        }
        int length = this.getHighSpeedVideoFpsRanges.length - 2;
        while (length > 0 && this.getHighSpeedVideoFpsRanges[length] == 48) {
            length--;
        }
        if (this.getHighSpeedVideoFpsRanges[length] == 46) {
            byte[] bArr3 = new byte[length + 1];
            java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, 0, bArr3, 0, length);
            bArr3[length] = com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME;
            return bArr3;
        }
        byte[] bArr4 = new byte[length + 2];
        int i = length + 1;
        java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, 0, bArr4, 0, i);
        bArr4[i] = com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME;
        return bArr4;
    }

    public DERGeneralizedTime(byte[] bArr) {
        super(bArr);
    }

    public DERGeneralizedTime(java.util.Date date) {
        super(date);
    }

    public DERGeneralizedTime(java.lang.String str) {
        super(str);
    }
}
