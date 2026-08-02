package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class EncryptedData extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.oer.its.SymmetricCiphertext Camera2StreamConfigurationMap;
    private final org.bouncycastle.oer.its.SequenceOfRecipientInfo getHighResolutionOutputSizeshNQ4ISI;

    public static class Builder {
        private org.bouncycastle.oer.its.SequenceOfRecipientInfo getHighSpeedVideoFpsRanges;
        private org.bouncycastle.oer.its.SymmetricCiphertext getHighSpeedVideoFpsRangesFor;

        public org.bouncycastle.oer.its.EncryptedData.Builder setRecipients(org.bouncycastle.oer.its.SequenceOfRecipientInfo sequenceOfRecipientInfo) {
            this.getHighSpeedVideoFpsRanges = sequenceOfRecipientInfo;
            return this;
        }

        public org.bouncycastle.oer.its.EncryptedData.Builder setCiphertext(org.bouncycastle.oer.its.SymmetricCiphertext symmetricCiphertext) {
            this.getHighSpeedVideoFpsRangesFor = symmetricCiphertext;
            return this;
        }

        public org.bouncycastle.oer.its.EncryptedData createEncryptedData() {
            return new org.bouncycastle.oer.its.EncryptedData(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
    }

    public org.bouncycastle.oer.its.SequenceOfRecipientInfo getRecipients() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.oer.its.SymmetricCiphertext getCiphertext() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.oer.its.EncryptedData getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.oer.its.EncryptedData)) {
            return (org.bouncycastle.oer.its.EncryptedData) obj;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        return new org.bouncycastle.oer.its.EncryptedData(org.bouncycastle.oer.its.SequenceOfRecipientInfo.getInstance(aSN1Sequence.getObjectAt(0)), org.bouncycastle.oer.its.SymmetricCiphertext.getInstance(aSN1Sequence.getObjectAt(1)));
    }

    public EncryptedData(org.bouncycastle.oer.its.SequenceOfRecipientInfo sequenceOfRecipientInfo, org.bouncycastle.oer.its.SymmetricCiphertext symmetricCiphertext) {
        this.getHighResolutionOutputSizeshNQ4ISI = sequenceOfRecipientInfo;
        this.Camera2StreamConfigurationMap = symmetricCiphertext;
    }
}
