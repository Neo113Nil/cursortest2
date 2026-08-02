package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class PKRecipientInfo extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.oer.its.HashedId getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.oer.its.EncryptedDataEncryptionKey getHighSpeedVideoFpsRangesFor;

    public static class Builder {
        private org.bouncycastle.oer.its.EncryptedDataEncryptionKey getHighResolutionOutputSizeshNQ4ISI;
        private org.bouncycastle.oer.its.HashedId getHighSpeedVideoFpsRanges;

        public org.bouncycastle.oer.its.PKRecipientInfo.Builder setRecipientId(org.bouncycastle.oer.its.HashedId hashedId) {
            this.getHighSpeedVideoFpsRanges = hashedId;
            return this;
        }

        public org.bouncycastle.oer.its.PKRecipientInfo.Builder setEncKey(org.bouncycastle.oer.its.EncryptedDataEncryptionKey encryptedDataEncryptionKey) {
            this.getHighResolutionOutputSizeshNQ4ISI = encryptedDataEncryptionKey;
            return this;
        }

        public org.bouncycastle.oer.its.PKRecipientInfo createPKRecipientInfo() {
            return new org.bouncycastle.oer.its.PKRecipientInfo(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
    }

    public org.bouncycastle.oer.its.HashedId getRecipientId() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.oer.its.EncryptedDataEncryptionKey getEncKey() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.oer.its.PKRecipientInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.PKRecipientInfo) {
            return (org.bouncycastle.oer.its.PKRecipientInfo) obj;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        return new org.bouncycastle.oer.its.PKRecipientInfo(org.bouncycastle.oer.its.HashedId.getInstance(aSN1Sequence.getObjectAt(0)), org.bouncycastle.oer.its.EncryptedDataEncryptionKey.getInstance(aSN1Sequence.getObjectAt(0)));
    }

    public PKRecipientInfo(org.bouncycastle.oer.its.HashedId hashedId, org.bouncycastle.oer.its.EncryptedDataEncryptionKey encryptedDataEncryptionKey) {
        this.getHighSpeedVideoFpsRanges = hashedId;
        this.getHighSpeedVideoFpsRangesFor = encryptedDataEncryptionKey;
    }
}
