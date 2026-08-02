package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DLSet extends org.bouncycastle.asn1.ASN1Set {
    private int getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Set, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        if (z) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges.write(49);
        }
        org.bouncycastle.asn1.DLOutputStream highResolutionOutputSizeshNQ4ISI = aSN1OutputStream.getHighResolutionOutputSizeshNQ4ISI();
        int length = this.elements.length;
        int i = 0;
        if (this.getHighResolutionOutputSizeshNQ4ISI >= 0 || length > 16) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRanges());
            while (i < length) {
                highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(this.elements[i].toASN1Primitive());
                i++;
            }
            return;
        }
        org.bouncycastle.asn1.ASN1Primitive[] aSN1PrimitiveArr = new org.bouncycastle.asn1.ASN1Primitive[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap = this.elements[i3].toASN1Primitive().Camera2StreamConfigurationMap();
            aSN1PrimitiveArr[i3] = Camera2StreamConfigurationMap;
            i2 += Camera2StreamConfigurationMap.getHighSpeedVideoSizes(true);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        aSN1OutputStream.getHighSpeedVideoFpsRanges(i2);
        while (i < length) {
            highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(aSN1PrimitiveArr[i]);
            i++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) throws java.io.IOException {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, getHighSpeedVideoFpsRanges());
    }

    private int getHighSpeedVideoFpsRanges() throws java.io.IOException {
        if (this.getHighResolutionOutputSizeshNQ4ISI < 0) {
            int length = this.elements.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.elements[i2].toASN1Primitive().Camera2StreamConfigurationMap().getHighSpeedVideoSizes(true);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public DLSet(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr, false);
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }

    DLSet(boolean z, org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) {
        super(z, aSN1EncodableArr);
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }

    public DLSet(org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, false);
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }

    public DLSet(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }

    public DLSet() {
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }
}
