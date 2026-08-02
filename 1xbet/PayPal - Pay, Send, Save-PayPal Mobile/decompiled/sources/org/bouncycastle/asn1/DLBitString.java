package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DLBitString extends org.bouncycastle.asn1.ASN1BitString {
    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return false;
    }

    static void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, byte b, byte[] bArr, int i, int i2) throws java.io.IOException {
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(3);
        aSN1OutputStream.getHighSpeedVideoFpsRanges(i2 + 1);
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(b);
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, this.getHighSpeedVideoSizes.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        aSN1OutputStream.getHighResolutionOutputSizeshNQ4ISI(z, 3, this.getHighSpeedVideoSizes);
    }

    static int getHighResolutionOutputSizeshNQ4ISI(boolean z, int i) {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, i);
    }

    static void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z, byte[] bArr, int i) throws java.io.IOException {
        aSN1OutputStream.getHighResolutionOutputSizeshNQ4ISI(z, 3, bArr, 0, i);
    }

    DLBitString(byte[] bArr, byte b) {
        super(bArr, false);
    }

    public DLBitString(byte[] bArr, int i) {
        super(bArr, i);
    }

    public DLBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public DLBitString(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        super(aSN1Encodable.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER), 0);
    }

    public DLBitString(int i) {
        super(getBytes(i), getPadBits(i));
    }

    public DLBitString(byte b, int i) {
        super(b, i);
    }
}
