package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class AesCcmCiphertext extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.oer.its.SequenceOfOctetString getHighSpeedVideoSizes;

    public static class Builder {
        private org.bouncycastle.oer.its.SequenceOfOctetString Camera2StreamConfigurationMap;
        private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRanges;

        public org.bouncycastle.oer.its.AesCcmCiphertext.Builder setOpaque(org.bouncycastle.oer.its.SequenceOfOctetString sequenceOfOctetString) {
            this.Camera2StreamConfigurationMap = sequenceOfOctetString;
            return this;
        }

        public org.bouncycastle.oer.its.AesCcmCiphertext.Builder setNonce(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
            this.getHighSpeedVideoFpsRanges = aSN1OctetString;
            return this;
        }

        public org.bouncycastle.oer.its.AesCcmCiphertext createAesCcmCiphertext() {
            return new org.bouncycastle.oer.its.AesCcmCiphertext(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
    }

    public static org.bouncycastle.oer.its.AesCcmCiphertext getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.AesCcmCiphertext) {
            return (org.bouncycastle.oer.its.AesCcmCiphertext) obj;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        return new org.bouncycastle.oer.its.AesCcmCiphertext.Builder().setNonce(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0))).setOpaque(org.bouncycastle.oer.its.SequenceOfOctetString.getInstance(aSN1Sequence.getObjectAt(1))).createAesCcmCiphertext();
    }

    public AesCcmCiphertext(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, org.bouncycastle.oer.its.SequenceOfOctetString sequenceOfOctetString) {
        this.getHighSpeedVideoFpsRangesFor = aSN1OctetString;
        this.getHighSpeedVideoSizes = sequenceOfOctetString;
    }
}
