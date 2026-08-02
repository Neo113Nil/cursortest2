package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class KeyTransRecipientInfo extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.cms.RecipientIdentifier Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.cms.RecipientIdentifier getRecipientIdentifier() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getKeyEncryptionAlgorithm() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1OctetString getEncryptedKey() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.cms.KeyTransRecipientInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.KeyTransRecipientInfo) {
            return (org.bouncycastle.asn1.cms.KeyTransRecipientInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.KeyTransRecipientInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public KeyTransRecipientInfo(org.bouncycastle.asn1.cms.RecipientIdentifier recipientIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getHighSpeedVideoSizes = recipientIdentifier.toASN1Primitive() instanceof org.bouncycastle.asn1.ASN1TaggedObject ? new org.bouncycastle.asn1.ASN1Integer(2L) : new org.bouncycastle.asn1.ASN1Integer(0L);
        this.Camera2StreamConfigurationMap = recipientIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmIdentifier;
        this.getHighSpeedVideoFpsRangesFor = aSN1OctetString;
    }

    private KeyTransRecipientInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = (org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(0);
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cms.RecipientIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(2));
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(3);
    }
}
