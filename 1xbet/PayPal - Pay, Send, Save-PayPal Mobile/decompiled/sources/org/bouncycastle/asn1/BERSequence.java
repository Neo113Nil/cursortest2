package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class BERSequence extends org.bouncycastle.asn1.ASN1Sequence {
    @Override // org.bouncycastle.asn1.ASN1Sequence
    final org.bouncycastle.asn1.ASN1Set getInputSizeshNQ4ISI() {
        return new org.bouncycastle.asn1.BERSet(getOutputMinFrameDuration(), (byte) 0);
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    final org.bouncycastle.asn1.ASN1OctetString getOutputFormats() {
        return new org.bouncycastle.asn1.BEROctetString(getHighSpeedVideoSizes());
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    final org.bouncycastle.asn1.ASN1External getInputFormats() {
        return ((org.bouncycastle.asn1.ASN1Sequence) Camera2StreamConfigurationMap()).getInputFormats();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    final org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoSizesFor() {
        return new org.bouncycastle.asn1.BERBitString(getHighSpeedVideoFpsRanges());
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) throws java.io.IOException {
        int i = z ? 4 : 3;
        int length = this.Camera2StreamConfigurationMap.length;
        for (int i2 = 0; i2 < length; i2++) {
            i += this.Camera2StreamConfigurationMap[i2].toASN1Primitive().getHighSpeedVideoSizes(true);
        }
        return i;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        aSN1OutputStream.getHighSpeedVideoFpsRanges(z, 48, this.Camera2StreamConfigurationMap);
    }

    public BERSequence(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr);
    }

    public BERSequence(org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector);
    }

    public BERSequence(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
    }

    public BERSequence() {
    }
}
