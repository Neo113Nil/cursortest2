package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class BERTaggedObject extends org.bouncycastle.asn1.ASN1TaggedObject {
    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive();
        boolean isExplicit = isExplicit();
        if (z) {
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (isExplicit || aSN1Primitive.getHighResolutionOutputSizeshNQ4ISI()) {
                i |= 32;
            }
            aSN1OutputStream.getHighSpeedVideoFpsRangesFor(i, this.Camera2StreamConfigurationMap);
        }
        if (!isExplicit) {
            aSN1Primitive.getHighSpeedVideoSizes(aSN1OutputStream, false);
            return;
        }
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(128);
        aSN1Primitive.getHighSpeedVideoSizes(aSN1OutputStream, true);
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(0);
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(0);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    final org.bouncycastle.asn1.ASN1TaggedObject getHighSpeedVideoSizes(int i, int i2) {
        return new org.bouncycastle.asn1.BERTaggedObject(this.getHighSpeedVideoFpsRanges, i, i2, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    final org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        return new org.bouncycastle.asn1.BERSequence(aSN1Primitive);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    final java.lang.String getHighSpeedVideoFpsRanges() {
        return org.bouncycastle.asn1.ASN1Encoding.BER;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive();
        boolean isExplicit = isExplicit();
        int highSpeedVideoSizes = aSN1Primitive.getHighSpeedVideoSizes(isExplicit);
        if (isExplicit) {
            highSpeedVideoSizes += 3;
        }
        return highSpeedVideoSizes + (z ? org.bouncycastle.asn1.ASN1OutputStream.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap) : 0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return isExplicit() || this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive().getHighResolutionOutputSizeshNQ4ISI();
    }

    public BERTaggedObject(boolean z, int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(z, i, aSN1Encodable);
    }

    public BERTaggedObject(boolean z, int i, int i2, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(z, i, i2, aSN1Encodable);
    }

    public BERTaggedObject(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(true, i, aSN1Encodable);
    }

    public BERTaggedObject(int i, int i2, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(true, i, i2, aSN1Encodable);
    }

    BERTaggedObject(int i, int i2, int i3, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(i, i2, i3, aSN1Encodable);
    }

    public BERTaggedObject(int i) {
        super(false, i, new org.bouncycastle.asn1.BERSequence());
    }
}
