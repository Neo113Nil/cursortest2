package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class EncryptedValue extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1BitString Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoSizesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(6);
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.getHighSpeedVideoFpsRangesFor;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) algorithmIdentifier));
        }
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (algorithmIdentifier2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) algorithmIdentifier2));
        }
        org.bouncycastle.asn1.ASN1BitString aSN1BitString = this.Camera2StreamConfigurationMap;
        if (aSN1BitString != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) aSN1BitString));
        }
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier3 = this.getHighSpeedVideoFpsRanges;
        if (algorithmIdentifier3 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 3, (org.bouncycastle.asn1.ASN1Encodable) algorithmIdentifier3));
        }
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString = this.getHighSpeedVideoSizesFor;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 4, (org.bouncycastle.asn1.ASN1Encodable) aSN1OctetString));
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1OctetString getValueHint() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSymmAlg() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getKeyAlg() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getIntendedAlg() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1BitString getEncValue() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1BitString getEncSymmKey() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.crmf.EncryptedValue getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.crmf.EncryptedValue) {
            return (org.bouncycastle.asn1.crmf.EncryptedValue) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.crmf.EncryptedValue(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public EncryptedValue(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, org.bouncycastle.asn1.ASN1BitString aSN1BitString, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier3, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, org.bouncycastle.asn1.ASN1BitString aSN1BitString2) {
        if (aSN1BitString2 == null) {
            throw new java.lang.IllegalArgumentException("'encValue' cannot be null");
        }
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmIdentifier2;
        this.Camera2StreamConfigurationMap = aSN1BitString;
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier3;
        this.getHighSpeedVideoSizesFor = aSN1OctetString;
        this.getHighSpeedVideoSizes = aSN1BitString2;
    }

    private EncryptedValue(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int i = 0;
        while (aSN1Sequence.getObjectAt(i) instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(i);
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 1) {
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 2) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1BitString.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 3) {
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
            } else {
                if (tagNo != 4) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown tag encountered: ");
                    sb.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                this.getHighSpeedVideoSizesFor = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject, false);
            }
            i++;
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1BitString.getInstance(aSN1Sequence.getObjectAt(i));
    }
}
