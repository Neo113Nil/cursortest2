package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class SymmRecipientInfo extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.oer.its.SymmetricCiphertext getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.oer.its.HashedId getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.oer.its.HashedId getRecipientId() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.oer.its.SymmetricCiphertext getEncKey() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public SymmRecipientInfo(org.bouncycastle.oer.its.HashedId hashedId, org.bouncycastle.oer.its.SymmetricCiphertext symmetricCiphertext) {
        this.getHighSpeedVideoFpsRanges = hashedId;
        this.getHighResolutionOutputSizeshNQ4ISI = symmetricCiphertext;
    }
}
