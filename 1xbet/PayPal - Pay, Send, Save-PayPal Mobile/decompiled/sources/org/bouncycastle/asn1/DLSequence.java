package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DLSequence extends org.bouncycastle.asn1.ASN1Sequence {
    private int getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        if (z) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges.write(48);
        }
        org.bouncycastle.asn1.DLOutputStream highResolutionOutputSizeshNQ4ISI = aSN1OutputStream.getHighResolutionOutputSizeshNQ4ISI();
        int length = this.Camera2StreamConfigurationMap.length;
        int i = 0;
        if (this.getHighResolutionOutputSizeshNQ4ISI >= 0 || length > 16) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges(getOutputSizes());
            while (i < length) {
                highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap[i].toASN1Primitive());
                i++;
            }
            return;
        }
        org.bouncycastle.asn1.ASN1Primitive[] aSN1PrimitiveArr = new org.bouncycastle.asn1.ASN1Primitive[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap[i3].toASN1Primitive().Camera2StreamConfigurationMap();
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

    @Override // org.bouncycastle.asn1.ASN1Sequence
    final org.bouncycastle.asn1.ASN1Set getInputSizeshNQ4ISI() {
        return new org.bouncycastle.asn1.DLSet(false, getOutputMinFrameDuration());
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    final org.bouncycastle.asn1.ASN1OctetString getOutputFormats() {
        return new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.asn1.BEROctetString.getHighSpeedVideoSizes(getHighSpeedVideoSizes()));
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    final org.bouncycastle.asn1.ASN1External getInputFormats() {
        return new org.bouncycastle.asn1.DLExternal(this);
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    final org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoSizesFor() {
        return new org.bouncycastle.asn1.DLBitString(org.bouncycastle.asn1.BERBitString.Camera2StreamConfigurationMap(getHighSpeedVideoFpsRanges()), (byte) 0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) throws java.io.IOException {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, getOutputSizes());
    }

    private int getOutputSizes() throws java.io.IOException {
        if (this.getHighResolutionOutputSizeshNQ4ISI < 0) {
            int length = this.Camera2StreamConfigurationMap.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.Camera2StreamConfigurationMap[i2].toASN1Primitive().Camera2StreamConfigurationMap().getHighSpeedVideoSizes(true);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    DLSequence(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr, byte b) {
        super(aSN1EncodableArr, false);
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }

    public DLSequence(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr);
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }

    public DLSequence(org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector);
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }

    public DLSequence(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }

    public DLSequence() {
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }
}
