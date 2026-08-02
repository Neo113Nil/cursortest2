package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DERTaggedObject extends org.bouncycastle.asn1.ASN1TaggedObject {
    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    final org.bouncycastle.asn1.ASN1TaggedObject getHighSpeedVideoSizes(int i, int i2) {
        return new org.bouncycastle.asn1.DERTaggedObject(this.getHighSpeedVideoFpsRanges, i, i2, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    final org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        return new org.bouncycastle.asn1.DERSequence(aSN1Primitive);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    final java.lang.String getHighSpeedVideoFpsRanges() {
        return org.bouncycastle.asn1.ASN1Encoding.DER;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1Primitive highSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive().getHighSpeedVideoFpsRangesFor();
        boolean isExplicit = isExplicit();
        int highSpeedVideoSizes = highSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(isExplicit);
        if (isExplicit) {
            highSpeedVideoSizes += org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes);
        }
        return highSpeedVideoSizes + (z ? org.bouncycastle.asn1.ASN1OutputStream.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap) : 0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return isExplicit() || this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive().getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1Primitive highSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive().getHighSpeedVideoFpsRangesFor();
        boolean isExplicit = isExplicit();
        if (z) {
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (isExplicit || highSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI()) {
                i |= 32;
            }
            aSN1OutputStream.getHighSpeedVideoFpsRangesFor(i, this.Camera2StreamConfigurationMap);
        }
        if (isExplicit) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(true));
        }
        highSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(aSN1OutputStream.getHighSpeedVideoSizes(), isExplicit);
    }

    public DERTaggedObject(boolean z, int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(z, i, aSN1Encodable);
    }

    public DERTaggedObject(boolean z, int i, int i2, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(z, i, i2, aSN1Encodable);
    }

    public DERTaggedObject(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(true, i, aSN1Encodable);
    }

    public DERTaggedObject(int i, int i2, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(true, i, i2, aSN1Encodable);
    }

    DERTaggedObject(int i, int i2, int i3, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(i, i2, i3, aSN1Encodable);
    }
}
