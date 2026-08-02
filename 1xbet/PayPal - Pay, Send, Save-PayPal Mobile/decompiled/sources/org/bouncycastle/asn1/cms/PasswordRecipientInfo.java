package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class PasswordRecipientInfo extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.getHighSpeedVideoFpsRanges;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) algorithmIdentifier));
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getKeyEncryptionAlgorithm() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getKeyDerivationAlgorithm() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1OctetString getEncryptedKey() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.cms.PasswordRecipientInfo getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cms.PasswordRecipientInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.PasswordRecipientInfo) {
            return (org.bouncycastle.asn1.cms.PasswordRecipientInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.PasswordRecipientInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PasswordRecipientInfo(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(0L);
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier;
        this.getHighSpeedVideoSizes = algorithmIdentifier2;
        this.getHighSpeedVideoFpsRangesFor = aSN1OctetString;
    }

    public PasswordRecipientInfo(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(0L);
        this.getHighSpeedVideoSizes = algorithmIdentifier;
        this.getHighSpeedVideoFpsRangesFor = aSN1OctetString;
    }

    private PasswordRecipientInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        org.bouncycastle.asn1.ASN1Encodable objectAt;
        this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(0);
        if (aSN1Sequence.getObjectAt(1) instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(1), false);
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(2));
            objectAt = aSN1Sequence.getObjectAt(3);
        } else {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
            objectAt = aSN1Sequence.getObjectAt(2);
        }
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1OctetString) objectAt;
    }
}
