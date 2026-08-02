package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
class DLFactory {
    static final org.bouncycastle.asn1.DLSequence getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DLSequence();
    static final org.bouncycastle.asn1.DLSet getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DLSet();

    static org.bouncycastle.asn1.DLSet getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.size() <= 0 ? getHighSpeedVideoFpsRanges : new org.bouncycastle.asn1.DLSet(aSN1EncodableVector);
    }

    static org.bouncycastle.asn1.DLSequence getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.size() <= 0 ? getHighResolutionOutputSizeshNQ4ISI : new org.bouncycastle.asn1.DLSequence(aSN1EncodableVector);
    }

    DLFactory() {
    }
}
