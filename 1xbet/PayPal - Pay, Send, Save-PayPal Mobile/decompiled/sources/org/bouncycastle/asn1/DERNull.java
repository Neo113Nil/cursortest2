package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DERNull extends org.bouncycastle.asn1.ASN1Null {
    public static final org.bouncycastle.asn1.DERNull INSTANCE = new org.bouncycastle.asn1.DERNull();
    private static final byte[] Camera2StreamConfigurationMap = new byte[0];

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, 0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        aSN1OutputStream.getHighResolutionOutputSizeshNQ4ISI(z, 5, Camera2StreamConfigurationMap);
    }

    private DERNull() {
    }
}
