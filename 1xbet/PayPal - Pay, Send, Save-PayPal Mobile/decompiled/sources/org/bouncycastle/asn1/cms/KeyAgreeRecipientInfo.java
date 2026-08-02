package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class KeyAgreeRecipientInfo extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1OctetString getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.cms.OriginatorIdentifierOrKey getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) this.getHighSpeedVideoFpsRanges));
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1OctetString));
        }
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1OctetString getUserKeyingMaterial() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Sequence getRecipientEncryptedKeys() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.cms.OriginatorIdentifierOrKey getOriginator() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getKeyEncryptionAlgorithm() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo) {
            return (org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public KeyAgreeRecipientInfo(org.bouncycastle.asn1.cms.OriginatorIdentifierOrKey originatorIdentifierOrKey, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1Integer(3L);
        this.getHighSpeedVideoFpsRanges = originatorIdentifierOrKey;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1OctetString;
        this.Camera2StreamConfigurationMap = algorithmIdentifier;
        this.getHighSpeedVideoSizes = aSN1Sequence;
    }

    private KeyAgreeRecipientInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(0);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.cms.OriginatorIdentifierOrKey.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true);
        int i = 2;
        if (aSN1Sequence.getObjectAt(2) instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1OctetString.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(2), true);
            i = 3;
        }
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i));
        this.getHighSpeedVideoSizes = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(i + 1);
    }
}
