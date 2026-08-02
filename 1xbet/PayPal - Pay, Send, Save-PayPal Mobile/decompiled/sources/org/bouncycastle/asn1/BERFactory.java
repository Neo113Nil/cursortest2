package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
class BERFactory {
    static final org.bouncycastle.asn1.BERSequence getHighSpeedVideoSizes = new org.bouncycastle.asn1.BERSequence();
    static final org.bouncycastle.asn1.BERSet getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.BERSet();

    static org.bouncycastle.asn1.BERSequence getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.size() <= 0 ? getHighSpeedVideoSizes : new org.bouncycastle.asn1.BERSequence(aSN1EncodableVector);
    }

    BERFactory() {
    }
}
