package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DERSequence extends org.bouncycastle.asn1.ASN1Sequence {
    private int getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        if (z) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges.write(48);
        }
        org.bouncycastle.asn1.DEROutputStream highSpeedVideoSizes = aSN1OutputStream.getHighSpeedVideoSizes();
        int length = this.Camera2StreamConfigurationMap.length;
        int i = 0;
        if (this.getHighSpeedVideoFpsRanges >= 0 || length > 16) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges(getOutputSizes());
            while (i < length) {
                this.Camera2StreamConfigurationMap[i].toASN1Primitive().getHighSpeedVideoFpsRangesFor().getHighSpeedVideoSizes(highSpeedVideoSizes, true);
                i++;
            }
            return;
        }
        org.bouncycastle.asn1.ASN1Primitive[] aSN1PrimitiveArr = new org.bouncycastle.asn1.ASN1Primitive[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            org.bouncycastle.asn1.ASN1Primitive highSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap[i3].toASN1Primitive().getHighSpeedVideoFpsRangesFor();
            aSN1PrimitiveArr[i3] = highSpeedVideoFpsRangesFor;
            i2 += highSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(true);
        }
        this.getHighSpeedVideoFpsRanges = i2;
        aSN1OutputStream.getHighSpeedVideoFpsRanges(i2);
        while (i < length) {
            aSN1PrimitiveArr[i].getHighSpeedVideoSizes(highSpeedVideoSizes, true);
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
        return new org.bouncycastle.asn1.DERExternal(this);
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    final org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoSizesFor() {
        return new org.bouncycastle.asn1.DERBitString(org.bouncycastle.asn1.BERBitString.Camera2StreamConfigurationMap(getHighSpeedVideoFpsRanges()), false);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) throws java.io.IOException {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, getOutputSizes());
    }

    private int getOutputSizes() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRanges < 0) {
            int length = this.Camera2StreamConfigurationMap.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.Camera2StreamConfigurationMap[i2].toASN1Primitive().getHighSpeedVideoFpsRangesFor().getHighSpeedVideoSizes(true);
            }
            this.getHighSpeedVideoFpsRanges = i;
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.DERSequence convert(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        return (org.bouncycastle.asn1.DERSequence) aSN1Sequence.getHighSpeedVideoFpsRangesFor();
    }

    DERSequence(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr, byte b) {
        super(aSN1EncodableArr, false);
        this.getHighSpeedVideoFpsRanges = -1;
    }

    public DERSequence(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr);
        this.getHighSpeedVideoFpsRanges = -1;
    }

    public DERSequence(org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector);
        this.getHighSpeedVideoFpsRanges = -1;
    }

    public DERSequence(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
        this.getHighSpeedVideoFpsRanges = -1;
    }

    public DERSequence() {
        this.getHighSpeedVideoFpsRanges = -1;
    }
}
