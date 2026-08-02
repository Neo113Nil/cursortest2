package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class BERSet extends org.bouncycastle.asn1.ASN1Set {
    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) throws java.io.IOException {
        int i = z ? 4 : 3;
        int length = this.elements.length;
        for (int i2 = 0; i2 < length; i2++) {
            i += this.elements[i2].toASN1Primitive().getHighSpeedVideoSizes(true);
        }
        return i;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        aSN1OutputStream.getHighSpeedVideoFpsRanges(z, 49, this.elements);
    }

    public BERSet(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr, false);
    }

    BERSet(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr, byte b) {
        super(false, aSN1EncodableArr);
    }

    public BERSet(org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, false);
    }

    public BERSet(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
    }

    public BERSet() {
    }
}
