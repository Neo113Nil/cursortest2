package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class EncryptedData extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(0L));
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.BERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getEncryptionAlgorithm() {
        return org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(this.getHighSpeedVideoFpsRanges.getObjectAt(1));
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType() {
        return org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(this.getHighSpeedVideoFpsRanges.getObjectAt(0));
    }

    public org.bouncycastle.asn1.ASN1OctetString getContent() {
        if (this.getHighSpeedVideoFpsRanges.size() == 3) {
            return org.bouncycastle.asn1.ASN1OctetString.getInstance(org.bouncycastle.asn1.ASN1TaggedObject.getInstance(this.getHighSpeedVideoFpsRanges.getObjectAt(2)), false);
        }
        return null;
    }

    public static org.bouncycastle.asn1.pkcs.EncryptedData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.EncryptedData) {
            return (org.bouncycastle.asn1.pkcs.EncryptedData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.EncryptedData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private EncryptedData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (!((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(0)).hasValue(0)) {
            throw new java.lang.IllegalArgumentException("sequence not version 0");
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public EncryptedData(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(aSN1ObjectIdentifier);
        aSN1EncodableVector.add(algorithmIdentifier.toASN1Primitive());
        aSN1EncodableVector.add(new org.bouncycastle.asn1.BERTaggedObject(false, 0, aSN1Encodable));
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.BERSequence(aSN1EncodableVector);
    }
}
