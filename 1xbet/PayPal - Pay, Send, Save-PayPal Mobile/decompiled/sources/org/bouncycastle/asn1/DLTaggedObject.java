package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DLTaggedObject extends org.bouncycastle.asn1.ASN1TaggedObject {
    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    final org.bouncycastle.asn1.ASN1TaggedObject getHighSpeedVideoSizes(int i, int i2) {
        return new org.bouncycastle.asn1.DLTaggedObject(this.getHighSpeedVideoFpsRanges, i, i2, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    final org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        return new org.bouncycastle.asn1.DLSequence(aSN1Primitive);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    final java.lang.String getHighSpeedVideoFpsRanges() {
        return org.bouncycastle.asn1.ASN1Encoding.DL;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive().Camera2StreamConfigurationMap();
        boolean isExplicit = isExplicit();
        int highSpeedVideoSizes = Camera2StreamConfigurationMap.getHighSpeedVideoSizes(isExplicit);
        if (isExplicit) {
            highSpeedVideoSizes += org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes);
        }
        return highSpeedVideoSizes + (z ? org.bouncycastle.asn1.ASN1OutputStream.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap) : 0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return isExplicit() || this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive().Camera2StreamConfigurationMap().getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive().Camera2StreamConfigurationMap();
        boolean isExplicit = isExplicit();
        if (z) {
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (isExplicit || Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI()) {
                i |= 32;
            }
            aSN1OutputStream.getHighSpeedVideoFpsRangesFor(i, this.Camera2StreamConfigurationMap);
        }
        if (isExplicit) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap.getHighSpeedVideoSizes(true));
        }
        Camera2StreamConfigurationMap.getHighSpeedVideoSizes(aSN1OutputStream.getHighResolutionOutputSizeshNQ4ISI(), isExplicit);
    }

    public DLTaggedObject(boolean z, int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(z, i, aSN1Encodable);
    }

    public DLTaggedObject(boolean z, int i, int i2, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(z, i, i2, aSN1Encodable);
    }

    public DLTaggedObject(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(true, i, aSN1Encodable);
    }

    public DLTaggedObject(int i, int i2, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(true, i, i2, aSN1Encodable);
    }

    DLTaggedObject(int i, int i2, int i3, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(i, i2, i3, aSN1Encodable);
    }
}
