package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DEROctetString extends org.bouncycastle.asn1.ASN1OctetString {
    @Override // org.bouncycastle.asn1.ASN1OctetString, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1OctetString, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, this.getHighSpeedVideoFpsRangesFor.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        aSN1OutputStream.getHighResolutionOutputSizeshNQ4ISI(z, 4, this.getHighSpeedVideoFpsRangesFor);
    }

    static int getHighResolutionOutputSizeshNQ4ISI(boolean z, int i) {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, i);
    }

    static void getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z, byte[] bArr, int i, int i2) throws java.io.IOException {
        aSN1OutputStream.getHighResolutionOutputSizeshNQ4ISI(z, 4, bArr, i, i2);
    }

    public DEROctetString(byte[] bArr) {
        super(bArr);
    }

    public DEROctetString(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        super(aSN1Encodable.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
    }
}
