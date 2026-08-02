package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class CommitmentTypeIndication extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.Camera2StreamConfigurationMap;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Sequence getCommitmentTypeQualifier() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getCommitmentTypeId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.esf.CommitmentTypeIndication getInstance(java.lang.Object obj) {
        return (obj == null || (obj instanceof org.bouncycastle.asn1.esf.CommitmentTypeIndication)) ? (org.bouncycastle.asn1.esf.CommitmentTypeIndication) obj : new org.bouncycastle.asn1.esf.CommitmentTypeIndication(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
    }

    private CommitmentTypeIndication(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        if (aSN1Sequence.size() > 1) {
            this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(1);
        }
    }

    public CommitmentTypeIndication(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier;
        this.Camera2StreamConfigurationMap = aSN1Sequence;
    }

    public CommitmentTypeIndication(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier;
    }
}
