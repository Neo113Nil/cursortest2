package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
class DERFactory {
    static final org.bouncycastle.asn1.DERSequence getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERSequence();
    static final org.bouncycastle.asn1.DERSet getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERSet();

    static org.bouncycastle.asn1.DERSequence getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.size() <= 0 ? getHighSpeedVideoFpsRangesFor : new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    DERFactory() {
    }
}
