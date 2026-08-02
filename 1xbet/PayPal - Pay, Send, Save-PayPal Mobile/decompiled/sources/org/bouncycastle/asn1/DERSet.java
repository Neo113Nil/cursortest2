package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DERSet extends org.bouncycastle.asn1.ASN1Set {
    private int getHighSpeedVideoSizes;

    DERSet(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr, byte b) {
        super(true, aSN1EncodableArr);
        this.getHighSpeedVideoSizes = -1;
    }

    @Override // org.bouncycastle.asn1.ASN1Set, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        if (z) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges.write(49);
        }
        org.bouncycastle.asn1.DEROutputStream highSpeedVideoSizes = aSN1OutputStream.getHighSpeedVideoSizes();
        int length = this.elements.length;
        int i = 0;
        if (this.getHighSpeedVideoSizes >= 0 || length > 16) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRanges());
            while (i < length) {
                this.elements[i].toASN1Primitive().getHighSpeedVideoFpsRangesFor().getHighSpeedVideoSizes(highSpeedVideoSizes, true);
                i++;
            }
            return;
        }
        org.bouncycastle.asn1.ASN1Primitive[] aSN1PrimitiveArr = new org.bouncycastle.asn1.ASN1Primitive[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            org.bouncycastle.asn1.ASN1Primitive highSpeedVideoFpsRangesFor = this.elements[i3].toASN1Primitive().getHighSpeedVideoFpsRangesFor();
            aSN1PrimitiveArr[i3] = highSpeedVideoFpsRangesFor;
            i2 += highSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(true);
        }
        this.getHighSpeedVideoSizes = i2;
        aSN1OutputStream.getHighSpeedVideoFpsRanges(i2);
        while (i < length) {
            aSN1PrimitiveArr[i].getHighSpeedVideoSizes(highSpeedVideoSizes, true);
            i++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Set, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() {
        return this.isSorted ? this : super.getHighSpeedVideoFpsRangesFor();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) throws java.io.IOException {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, getHighSpeedVideoFpsRanges());
    }

    private int getHighSpeedVideoFpsRanges() throws java.io.IOException {
        if (this.getHighSpeedVideoSizes < 0) {
            int length = this.elements.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.elements[i2].toASN1Primitive().getHighSpeedVideoFpsRangesFor().getHighSpeedVideoSizes(true);
            }
            this.getHighSpeedVideoSizes = i;
        }
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.DERSet convert(org.bouncycastle.asn1.ASN1Set aSN1Set) {
        return (org.bouncycastle.asn1.DERSet) aSN1Set.getHighSpeedVideoFpsRangesFor();
    }

    public DERSet(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr, true);
        this.getHighSpeedVideoSizes = -1;
    }

    public DERSet(org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, true);
        this.getHighSpeedVideoSizes = -1;
    }

    public DERSet(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
        this.getHighSpeedVideoSizes = -1;
    }

    public DERSet() {
        this.getHighSpeedVideoSizes = -1;
    }
}
