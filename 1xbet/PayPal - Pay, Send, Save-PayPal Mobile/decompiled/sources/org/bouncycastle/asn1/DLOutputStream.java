package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
class DLOutputStream extends org.bouncycastle.asn1.ASN1OutputStream {
    @Override // org.bouncycastle.asn1.ASN1OutputStream
    final org.bouncycastle.asn1.DLOutputStream getHighResolutionOutputSizeshNQ4ISI() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1OutputStream
    void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1Primitive[] aSN1PrimitiveArr) throws java.io.IOException {
        for (org.bouncycastle.asn1.ASN1Primitive aSN1Primitive : aSN1PrimitiveArr) {
            aSN1Primitive.Camera2StreamConfigurationMap().getHighSpeedVideoSizes(this, true);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1OutputStream
    void getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) throws java.io.IOException {
        aSN1Primitive.Camera2StreamConfigurationMap().getHighSpeedVideoSizes(this, true);
    }

    @Override // org.bouncycastle.asn1.ASN1OutputStream
    void getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) throws java.io.IOException {
        for (org.bouncycastle.asn1.ASN1Encodable aSN1Encodable : aSN1EncodableArr) {
            aSN1Encodable.toASN1Primitive().Camera2StreamConfigurationMap().getHighSpeedVideoSizes(this, true);
        }
    }

    DLOutputStream(java.io.OutputStream outputStream) {
        super(outputStream);
    }
}
