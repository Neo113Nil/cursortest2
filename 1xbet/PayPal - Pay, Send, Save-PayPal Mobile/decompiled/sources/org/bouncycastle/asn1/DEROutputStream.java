package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
class DEROutputStream extends org.bouncycastle.asn1.DLOutputStream {
    @Override // org.bouncycastle.asn1.ASN1OutputStream
    final org.bouncycastle.asn1.DEROutputStream getHighSpeedVideoSizes() {
        return this;
    }

    @Override // org.bouncycastle.asn1.DLOutputStream, org.bouncycastle.asn1.ASN1OutputStream
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1Primitive[] aSN1PrimitiveArr) throws java.io.IOException {
        for (org.bouncycastle.asn1.ASN1Primitive aSN1Primitive : aSN1PrimitiveArr) {
            aSN1Primitive.getHighSpeedVideoFpsRangesFor().getHighSpeedVideoSizes(this, true);
        }
    }

    @Override // org.bouncycastle.asn1.DLOutputStream, org.bouncycastle.asn1.ASN1OutputStream
    final void getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) throws java.io.IOException {
        aSN1Primitive.getHighSpeedVideoFpsRangesFor().getHighSpeedVideoSizes(this, true);
    }

    @Override // org.bouncycastle.asn1.DLOutputStream, org.bouncycastle.asn1.ASN1OutputStream
    final void getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) throws java.io.IOException {
        for (org.bouncycastle.asn1.ASN1Encodable aSN1Encodable : aSN1EncodableArr) {
            aSN1Encodable.toASN1Primitive().getHighSpeedVideoFpsRangesFor().getHighSpeedVideoSizes(this, true);
        }
    }

    DEROutputStream(java.io.OutputStream outputStream) {
        super(outputStream);
    }
}
